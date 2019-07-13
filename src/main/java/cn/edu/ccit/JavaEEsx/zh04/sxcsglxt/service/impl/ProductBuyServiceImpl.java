package cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;


import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.dao.BuyMapper;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.dao.ProductMapper;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.Buy;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.BuyExample;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.BuyInfo;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.BuyInfoExample;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.Product;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.ProductExample;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.RefundsExample;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.RefundsInfo;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.RefundsInfoExample;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.RoleExample;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.SalesOrderExample;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.SalesOrderInfo;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.SalesOrderInfoExample;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.User;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.UserRole;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.UserRoleExample;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.service.IProductBuyService;

@Service("ProductBuyService")
public class ProductBuyServiceImpl extends ProductServiceImpl implements IProductBuyService{
	@Resource
	cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.dao.UserMapper UserMapper;
	@Resource
	ProductMapper ProductMapper;//获取产品查询器
	@Resource
	BuyMapper BuyMapper;
	@Resource
	cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.dao.BuyInfoMapper BuyInfoMapper;
	@Resource
	cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.dao.RefundsMapper RefundsMapper;
	@Override
	public Boolean createBuyAndSetBuyInfo(Buy buy, Object buyinfos) {
		// TODO Auto-generated method stub
		int i=BuyMapper.insert(buy);
		BuyExample buyExample = new BuyExample();
		buyExample.createCriteria().andBuyNameEqualTo(buy.getBuyName())
		.andBuyTimeEqualTo(buy.getBuyTime())
		.andIsInStorehouseEqualTo(buy.getIsInStorehouse())
		.andIsSeasonalEqualTo(buy.getIsSeasonal())
		.andPkUidEqualTo(buy.getPkUid());
		buy=BuyMapper.selectByExampleWithBLOBs(buyExample).get(0);
		
		List<BuyInfo>buyInfo = JSON.parseObject(buyinfos.toString(),new TypeReference<List<BuyInfo>>(){} );
		for (BuyInfo buyInfos : buyInfo) {
			buyInfos.setPkBid(buy.getPkBid());
			BuyInfoMapper.insert(buyInfos);
		}
		return true;	
		
	
	
	
	}

	@Override
	public Boolean deleteBuyAndSetBuyInfo(Buy buy, Object buyinfos) {
		// TODO Auto-generated method stub
		BuyMapper.deleteByPrimaryKey(buy.getPkBid());
		BuyInfoExample BuyInfoExample=new BuyInfoExample();
		List<BuyInfo>buyinfo=JSON.parseArray(JSON.toJSONString(buyinfos,true),BuyInfo.class);
		List<Long> BuyAndSetBuyInfo=new ArrayList<Long>();
		for (BuyInfo BuyInfos : buyinfo) {
			BuyAndSetBuyInfo.add(BuyInfos.getPkBid());
		}
		BuyInfoMapper.deleteByExample(BuyInfoExample);
		return true;
	}

	@Override
	public Boolean updateBuyAndSetBuyInfo(Buy buy, Object buyinfos) {
		// TODO Auto-generated method stub
		BuyExample BuyExample = new BuyExample();
		BuyExample.createCriteria().andPkBidEqualTo(buy.getPkBid());
		BuyMapper.updateByExample(buy, BuyExample);
		
		BuyInfoExample BuyInfoExample = new BuyInfoExample();
		List<BuyInfo>buyInfo = JSON.parseArray(JSON.toJSONString(buyinfos, true),BuyInfo.class);
		for (BuyInfo buyInfos : buyInfo) {
			if (buyInfos.getPkBiid()!=null) {
				
				BuyInfoExample.createCriteria().andPkBiidEqualTo(buyInfos.getPkBiid());
//			salesOrderInfoMapper.updateByExampleSelective(JSON.parseObject(JSON.toJSONString(info, true), SalesOrderInfo.class), salesOrderInfoExample);
				BuyInfo buyInfo1= buyInfos;
//			salsorderInfo = JSON.parseObject(JSON.toJSONString(info, true), SalesOrderInfo.class);
				BuyInfoMapper.updateByExampleSelective(buyInfo1, BuyInfoExample);
			
			} else {
				buyInfos.setPkBid(buy.getPkBid());
				
				BuyInfoMapper.insert(buyInfos);
			}
			
			
		}
		
		return true;
		
	}

	@Override
	public Object getBuyAndSetBuyInfoByName(Buy buy) {
		// TODO Auto-generated method stub
		BuyExample buyExample=new BuyExample();
		buyExample.createCriteria().andPkUidEqualTo(buy.getPkUid());//这儿个方法没有uid字段，正常应该有uid比较
		BuyMapper.selectByExample(buyExample);	
		BuyInfoExample buyInfoByBidExample=new BuyInfoExample();
		buyInfoByBidExample.createCriteria().andPkBidEqualTo(buy.getPkBid());
		BuyInfoMapper.selectByExample(buyInfoByBidExample);
		return true;
	}


	@Override
	public List<BuyInfo> getBuyAndSetBuyInfoByBid(Buy buy) {
		// TODO Auto-generated method stub
		BuyInfoExample buyInfoByBidExample=new BuyInfoExample();
		buyInfoByBidExample.createCriteria().andPkBidEqualTo(buy.getPkBid());
		return BuyInfoMapper.selectByExampleWithBLOBs(buyInfoByBidExample);
	}

	@Override
	public Object getAllBuyAndSetBuyInfo() {
		// TODO Auto-generated method stub
		List<BuyInfo>BuyInfos=BuyInfoMapper.selectByExample(new BuyInfoExample());
		return JSON.toJSONString(BuyInfos, true);
	}

	@Override
	public Boolean deleteBuy(Buy buy) {
		// TODO Auto-generated method stub
		BuyExample buyExample=new BuyExample();
		buyExample.createCriteria().andPkBidEqualTo(buy.getPkBid());
		BuyInfoExample buyInfoExample =new BuyInfoExample();
		buyExample.createCriteria().andPkBidEqualTo(buy.getPkBid());
		BuyInfoMapper.deleteByExample(buyInfoExample);
		
		BuyMapper.deleteByExample(buyExample);
		return true;
	}

	@Override
	public List<Buy> getAllBuy() {
		// TODO Auto-generated method stub
		return BuyMapper.selectByExampleWithBLOBs(new BuyExample());
	}

	@Override
	public Buy getBuyByBid(Buy buy) {
		// TODO Auto-generated method stub
		return BuyMapper.selectByPrimaryKey(buy.getPkBid());
	}

	@Override
	public boolean deleteBuyInfoByInfoId(BuyInfo buyInfo) {
		// TODO Auto-generated method stub
		return BuyInfoMapper.deleteByPrimaryKey(buyInfo.getPkBiid())==1?true:false;
	}
}

