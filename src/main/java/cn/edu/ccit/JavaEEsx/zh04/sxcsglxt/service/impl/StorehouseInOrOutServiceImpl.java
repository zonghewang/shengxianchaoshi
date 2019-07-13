package cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;

import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.dao.OutgoingRecordInfoMapper;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.dao.OutgoingRecordMapper;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.OutgoingRecord;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.OutgoingRecordExample;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.OutgoingRecordInfo;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.OutgoingRecordInfoExample;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.SalesOrderInfo;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.service.IStorehouseInOrOutService;

@Service("storehouseInOrOutService")
public class StorehouseInOrOutServiceImpl extends StorehouseServiceImpl implements IStorehouseInOrOutService{

	@Resource
	OutgoingRecordMapper outgoingRecordMapper;
	@Resource
	OutgoingRecordInfoMapper outgoingRecordInfoMapper;
	@Override
	public Boolean createStorehouseInOrOutAndSetInfo(OutgoingRecord outgoing, Object info) {
		// TODO Auto-generated method stub
		outgoingRecordMapper.insert(outgoing);
		outgoingRecordInfoMapper.insert(JSON.parseObject(JSON.toJSONString(info, true), OutgoingRecordInfo.class));
		return true;
	}

	@Override
	public Boolean deleteStorehouseInOrOutAndSetInfo(OutgoingRecord outgoing, Object info) {
	
		OutgoingRecordInfoExample outgoingRecordInfoExample = new OutgoingRecordInfoExample();
		List<OutgoingRecordInfo>outgoingRecordInfo = JSON.parseArray(JSON.toJSONString(info, true),OutgoingRecordInfo.class);
		List<Long>outgoingRecordInfos = new ArrayList<Long>();
		for (OutgoingRecordInfo outgoingRecordInfo2 : outgoingRecordInfo) {
			outgoingRecordInfos.add(outgoingRecordInfo2.getPkOriid());
		}
		outgoingRecordInfoExample.createCriteria().andPkOriidIn(outgoingRecordInfos);
		outgoingRecordInfoMapper.deleteByExample(outgoingRecordInfoExample);
		
		OutgoingRecordExample outgoingRecordExample = new OutgoingRecordExample();
		outgoingRecordExample.createCriteria().andPkOridEqualTo(outgoing.getPkOrid());
		outgoingRecordMapper.deleteByExample(outgoingRecordExample);
		return true;
	}

	@Override
	public Boolean updateStorehouseInOrOutAndSetInfo(OutgoingRecord outgoing, Object info) {
		// TODO Auto-generated method stub
//		outgoingRecordMapper.updateByExampleSelective(outgoing, null);
//		outgoingRecordInfoMapper.updateByExampleSelective(JSON.parseObject(JSON.toJSONString(info, true), OutgoingRecordInfo.class), null);
//		return true;
		
		

		
		OutgoingRecordExample outgoingRecordExample = new OutgoingRecordExample();
		outgoingRecordExample.createCriteria().andPkOridEqualTo(outgoing.getPkOrid());
		outgoingRecordMapper.updateByExampleSelective(outgoing, outgoingRecordExample);
		
		OutgoingRecordInfoExample outgoingRecordInfoExample = new OutgoingRecordInfoExample();
		List<OutgoingRecordInfo>outgoingRecordInfo = JSON.parseArray(JSON.toJSONString(info, true),OutgoingRecordInfo.class);
		for (OutgoingRecordInfo outgoingRecordInfos : outgoingRecordInfo) {
			
			outgoingRecordInfoExample.createCriteria().andPkOriidEqualTo(outgoingRecordInfos.getPkOriid());
			OutgoingRecordInfo outgoingRecordInfo1 = outgoingRecordInfos;
			outgoingRecordInfoMapper.updateByExampleSelective(outgoingRecordInfo1, outgoingRecordInfoExample);
			
		}
		return true;
	}
			
	

	@Override
	public Object getStorehouseInOrOutAndSetInfoByName(OutgoingRecord outgoing) {
		// TODO Auto-generated method stub
		OutgoingRecordExample outgoingRecordExample = new OutgoingRecordExample();
		outgoingRecordExample.createCriteria().andPkOridEqualTo(outgoing.getPkOrid());
		List<OutgoingRecord>outgoingRecords = outgoingRecordMapper.selectByExample(outgoingRecordExample);
		OutgoingRecordInfoExample outgoingRecordInfoExample = new OutgoingRecordInfoExample();
		outgoingRecordInfoExample.createCriteria().andPkOridEqualTo(outgoing.getPkOrid());
		List<OutgoingRecordInfo>outgoingRecordInfos = outgoingRecordInfoMapper.selectByExample(outgoingRecordInfoExample);
		List<Object>all = new ArrayList<Object>();
		for (OutgoingRecord outgoingRecord : outgoingRecords) {
			all.add(outgoingRecord);
			for (OutgoingRecordInfo outgoingRecordInfo : outgoingRecordInfos) {
				all.add(outgoingRecordInfo);
			}
		}
		return JSON.toJSONString(all);
	}

	@Override
	public List<OutgoingRecordInfo> getStorehouseInOrOutAndSetInfoInById(OutgoingRecord outgoing) {
		// TODO Auto-generated method stub
//		outgoingRecordInfoMapper.selectByPrimaryKey(outgoing.getPkOrid());
//	    JSON.toJSONString(outgoingRecordInfoMapper.selectByPrimaryKey(outgoing.getPkOrid()), true);
//	    List<SalesOrderInfo>salesOrderInfo = JSON.parseArray(JSON.toJSONString(outgoingRecordInfoMapper.selectByPrimaryKey(outgoing.getPkOrid()), true), SalesOrderInfo.class);
//	    //return outgoingRecordInfo;
//		return null;
		OutgoingRecord orders = outgoingRecordMapper.selectByPrimaryKey(outgoing.getPkOrid());
		OutgoingRecordInfoExample outgoingRecordInfoExample = new OutgoingRecordInfoExample();
		outgoingRecordInfoExample.createCriteria().andPkOridEqualTo(orders.getPkOrid());
		List<OutgoingRecordInfo>outgoingRecordInfo = new ArrayList<OutgoingRecordInfo>();
		outgoingRecordInfo = JSON.parseArray(JSON.toJSONString(outgoingRecordInfoMapper.selectByExample(outgoingRecordInfoExample)), OutgoingRecordInfo.class);
	    return outgoingRecordInfo;
	}

	@Override
	public Object getAllStorehouseInOrOut() {
		// TODO Auto-generated method stub
		List<OutgoingRecordInfo>outgoingRecordInfos=outgoingRecordInfoMapper.selectByExample(new OutgoingRecordInfoExample());
		return JSON.toJSONString(outgoingRecordInfos, true);
	}

	@Override
	public Boolean deleteStorehouseInOrOut(OutgoingRecord outgoing, Object info) {
		// TODO Auto-generated method stub
		OutgoingRecordInfoExample outgoingRecordInfoExample = new OutgoingRecordInfoExample();
		List<OutgoingRecordInfo>outgoingRecordInfo = JSON.parseArray(JSON.toJSONString(info, true),OutgoingRecordInfo.class);
		List<Long>outgoingRecordInfoPkOridIn = new ArrayList<Long>();
		for (OutgoingRecordInfo outgoingRecordInfos : outgoingRecordInfo) {
			outgoingRecordInfoPkOridIn.add(outgoingRecordInfos.getPkOrid());
		}
		outgoingRecordInfoExample.createCriteria().andPkOridIn(outgoingRecordInfoPkOridIn);
		outgoingRecordInfoMapper.deleteByExample(outgoingRecordInfoExample);
		return true;
	}

	@Override
	public Boolean deleteStorehouse(OutgoingRecord outgoing) {
		// TODO Auto-generated method stub
		OutgoingRecordInfoExample outgoingRecordInfoExample1 = new OutgoingRecordInfoExample();
		outgoingRecordInfoExample1.createCriteria().andPkOridEqualTo(outgoing.getPkOrid());
		outgoingRecordInfoMapper.deleteByExample(outgoingRecordInfoExample1);
		outgoingRecordMapper.deleteByPrimaryKey(outgoing.getPkOrid());
		return true;
	}

	@Override
	public List<OutgoingRecord> OutgoingRecord() {
		// TODO Auto-generated method stub
		return outgoingRecordMapper.selectByExample(new OutgoingRecordExample());
	}

	@Override
	public boolean deleteOutgoingRecordInfoByInfoId(OutgoingRecordInfo outgoingRecordInfo) {
		// TODO Auto-generated method stub
		outgoingRecordInfoMapper.deleteByPrimaryKey(outgoingRecordInfo.getPkOriid());
		return true;
	}

	@Override
	public OutgoingRecord getOutgoingRecordInfoByOrid(OutgoingRecord outgoingRecord) {
		// TODO Auto-generated method stub
		return outgoingRecordMapper.selectByPrimaryKey(outgoingRecord.getPkOrid());
	}

	@Override
	public List<OutgoingRecordInfo> getOutgoingAndInfoInfoByStorehouseByOrid(OutgoingRecord outgoingRecord) {
		// TODO Auto-generated method stub
		OutgoingRecordInfoExample example = new OutgoingRecordInfoExample();
		example.createCriteria().andPkOridEqualTo(outgoingRecord.getPkOrid());
		return outgoingRecordInfoMapper.selectByExample(example);
	}

	

}
