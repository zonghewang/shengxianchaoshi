package cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;

import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.dao.ProductMapper;

import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.Refunds;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.RefundsExample;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.RefundsInfo;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.RefundsInfoExample;

import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.service.IProductRefundsService;
@Service("ProductRefundsService")
public class ProductRefundsServiceImpl extends ProductServiceImpl implements IProductRefundsService{
	@Resource
	cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.dao.UserMapper UserMapper;
	@Resource
	ProductMapper ProductMapper;//获取产品查询器
	@Resource
	cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.dao.RefundsMapper RefundsMapper;
	@Resource
	cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.dao.RefundsInfoMapper RefundsInfoMapper;
	@Override
	public Boolean createRefundsAndSetInfo(Refunds refunds, Object info) {
		// TODO Auto-generated method stub
		RefundsMapper.insert(refunds);

		List<RefundsInfo>refundsInfo = JSON.parseArray(JSON.toJSONString(info, true),RefundsInfo.class);
		for (RefundsInfo refundsInfos : refundsInfo) {
			RefundsInfoMapper.insert(refundsInfos);
		}
		return true;	
	}

	@Override
	public Boolean deleteRefundsAndSetInfo(Refunds refunds, Object info) {
		RefundsExample RefundsExample=new RefundsExample();
        RefundsExample.createCriteria().andPkCidEqualTo(refunds.getPkCid());
        RefundsMapper.deleteByExample(RefundsExample);
		
		RefundsInfoExample RefundsInfoExample=new RefundsInfoExample();
		List<RefundsInfo>RefundsInfo=JSON.parseArray(JSON.toJSONString(info,true),RefundsInfo.class);
		List<Long> createRefundsAndSetInfo=new ArrayList<Long>();
		for (RefundsInfo RefundsInfos : RefundsInfo) {
			createRefundsAndSetInfo.add(RefundsInfos.getPkPid());
		}
		RefundsInfoExample.createCriteria().andPkPidIn(createRefundsAndSetInfo);
		RefundsInfoMapper.deleteByExample(RefundsInfoExample);
		return true;
		}

	@Override
	public Boolean updateRefundsAndSetInfo(Refunds refunds, Object info) {
		// TODO Auto-generated method stub
		RefundsExample RefundsExample=new RefundsExample();
		RefundsMapper.updateByExample(refunds, RefundsExample);
		RefundsInfoExample RefundsInfoExample=new RefundsInfoExample();
		List<RefundsInfo>RefundsInfo=JSON.parseArray(JSON.toJSONString(info,true),RefundsInfo.class);
		for (RefundsInfo RefundsInfos : RefundsInfo) {
			RefundsInfoExample.createCriteria().andPkReiidEqualTo(RefundsInfos.getPkReiid());
			RefundsInfoMapper.updateByExample(RefundsInfos, RefundsInfoExample);
		}
		
		return true;
	}

	@Override
	public Object getRefundsAndSetInfoByName(Refunds refunds) {
		// TODO Auto-generated method stub
		RefundsExample refundsExample =new RefundsExample();
		refundsExample.createCriteria().andPkCidEqualTo(refunds.getPkCid());
		RefundsMapper.selectByExample(refundsExample);
		RefundsInfoExample refundsByNameExample=new RefundsInfoExample();
		refundsByNameExample.createCriteria().andPkReidEqualTo(refunds.getPkReid());
		RefundsInfoMapper.selectByExample(refundsByNameExample);
		return true;
	}

	@Override
	public List<RefundsInfo> getRefundsAndSetInfoById(Refunds refunds) {
		RefundsInfoExample refundsInfoById=new RefundsInfoExample();
		refundsInfoById.createCriteria().andPkReidEqualTo(refunds.getPkReid());
		return RefundsInfoMapper.selectByExample(refundsInfoById);
	}

	@Override
	public Object getAllRefundsAndSetInfo() {
		List<RefundsInfo>refundsInfos=RefundsInfoMapper.selectByExample(new RefundsInfoExample());
		return JSON.toJSONString(refundsInfos, true);
	}
	@Override
	public Boolean deleteRefunds(Refunds refunds) {
		RefundsExample RefundsExample=new RefundsExample();
		RefundsExample.createCriteria().andPkCidEqualTo(refunds.getPkCid());
		RefundsMapper.deleteByExample(RefundsExample);
		return true;
	}

	@Override
	public List<Refunds> getAllRefunds() {
		// TODO Auto-generated method stub
		return RefundsMapper.selectByExample(new RefundsExample());
	}

	@Override
	public boolean deleteRefundsInfoByInfoId(RefundsInfo refundsInfo) {
		// TODO Auto-generated method stub
		RefundsInfoMapper.deleteByPrimaryKey(refundsInfo.getPkReiid());
		return true;
	}

	@Override
	public Refunds getRefundsByRid(Refunds refunds) {
		// TODO Auto-generated method stub
		return RefundsMapper.selectByPrimaryKey(refunds.getPkReid());
	}

	@Override
	public List<RefundsInfo> getBuyAndSetBuyInfoByRid(Refunds refunds) {
		// TODO Auto-generated method stub
		RefundsInfoExample example= new RefundsInfoExample();
		example.createCriteria().andPkReidEqualTo(refunds.getPkReid());
		return RefundsInfoMapper.selectByExample(example);
	}

	

}
