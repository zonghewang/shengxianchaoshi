package cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;

import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.dao.OutgoingRecordInfoMapper;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.dao.OutgoingRecordMapper;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.dao.SalesOrderInfoMapper;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.dao.StorehouseMapper;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.OutgoingRecord;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.OutgoingRecordExample;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.OutgoingRecordInfo;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.OutgoingRecordInfoExample;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.SalesOrderInfo;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.Storehouse;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.StorehouseExample;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.service.IStorehouseService;

@Service(value = "storehouseService")
public class StorehouseServiceImpl extends AdminServiceImpl implements IStorehouseService {

	@Resource
	StorehouseMapper storehouseMapper;
	@Resource
	OutgoingRecordMapper outgoingRecordMapper;
	@Resource
	OutgoingRecordInfoMapper outgoingRecordInfoMapper;

	@Override
	public Object getAllOutgoingAndInfoInfoByStorehouse() {
		// TODO Auto-generated method stub
		List<Storehouse> storehouses = storehouseMapper.selectByExample(new StorehouseExample());
		List<Object> object = new ArrayList<Object>();
		for (Storehouse storehouse2 : storehouses) {

			OutgoingRecordExample outgoingRecordExample = new OutgoingRecordExample();
			outgoingRecordExample.createCriteria().andPkSidEqualTo(storehouse2.getPkSid());

			List<OutgoingRecord> outgoingRecords = outgoingRecordMapper.selectByExample(outgoingRecordExample);
			List<Object> objects = new ArrayList<Object>();
			objects.add(storehouse2);
			for (OutgoingRecord outgoingRecord : outgoingRecords) {
				List<Object> oneObjects = new ArrayList<Object>();
				OutgoingRecordInfoExample outgoingRecordInfoExample = new OutgoingRecordInfoExample();
				outgoingRecordInfoExample.createCriteria().andPkOridEqualTo(outgoingRecord.getPkOrid());

				List<OutgoingRecordInfo> outgoingRecordInfos = outgoingRecordInfoMapper
						.selectByExample(outgoingRecordInfoExample);
				oneObjects.add(outgoingRecord);
				oneObjects.add(outgoingRecordInfos);
				objects.add(oneObjects);
			}
			object.add(objects);
		}

		return JSON.toJSONString(object, true);
	}

	@Override
	public Object getOutgoingAndInfoInfoByStorehouseByName(Storehouse storehouse) {
		// TODO Auto-generated method stub
		// 1.查找仓库id
		StorehouseExample storehouseExample = new StorehouseExample();
		storehouseExample.createCriteria().andStorehouseNameLike("%" + storehouse.getStorehouseName() + "%");
		storehouseMapper.selectByExample(storehouseExample);
		List<Storehouse> storehouses = storehouseMapper.selectByExample(storehouseExample);
		List<Object> object = new ArrayList<Object>();
		for (Storehouse storehouse2 : storehouses) {

			OutgoingRecordExample outgoingRecordExample = new OutgoingRecordExample();
			outgoingRecordExample.createCriteria().andPkSidEqualTo(storehouse2.getPkSid());

			List<OutgoingRecord> outgoingRecords = outgoingRecordMapper.selectByExample(outgoingRecordExample);
			List<Object> objects = new ArrayList<Object>();
			objects.add(storehouse2);
			for (OutgoingRecord outgoingRecord : outgoingRecords) {
				List<Object> oneObjects = new ArrayList<Object>();
				OutgoingRecordInfoExample outgoingRecordInfoExample = new OutgoingRecordInfoExample();
				outgoingRecordInfoExample.createCriteria().andPkOridEqualTo(outgoingRecord.getPkOrid());

				List<OutgoingRecordInfo> outgoingRecordInfos = outgoingRecordInfoMapper
						.selectByExample(outgoingRecordInfoExample);
				oneObjects.add(outgoingRecord);
				oneObjects.add(outgoingRecordInfos);
				objects.add(oneObjects);
			}
			object.add(objects);
		}

		return JSON.toJSONString(object, true);
	}

	@Override
	public Object getOutgoingAndInfoInfoByStorehouseById(Storehouse storehouse) {
		// TODO Auto-generated method stub
		StorehouseExample storehouseExample = new StorehouseExample();
		storehouseExample.createCriteria().andPkSidEqualTo(storehouse.getPkSid());
		storehouseMapper.selectByExample(storehouseExample);
		List<Storehouse> storehouses = storehouseMapper.selectByExample(storehouseExample);
		List<Object> object = new ArrayList<Object>();
		for (Storehouse storehouse2 : storehouses) {

			OutgoingRecordExample outgoingRecordExample = new OutgoingRecordExample();
			outgoingRecordExample.createCriteria().andPkSidEqualTo(storehouse2.getPkSid());

			List<OutgoingRecord> outgoingRecords = outgoingRecordMapper.selectByExample(outgoingRecordExample);
			List<Object> objects = new ArrayList<Object>();
			objects.add(storehouse2);
			for (OutgoingRecord outgoingRecord : outgoingRecords) {
				List<Object> oneObjects = new ArrayList<Object>();
				OutgoingRecordInfoExample outgoingRecordInfoExample = new OutgoingRecordInfoExample();
				outgoingRecordInfoExample.createCriteria().andPkOridEqualTo(outgoingRecord.getPkOrid());

				List<OutgoingRecordInfo> outgoingRecordInfos = outgoingRecordInfoMapper
						.selectByExample(outgoingRecordInfoExample);
				oneObjects.add(outgoingRecord);
				oneObjects.add(outgoingRecordInfos);
				objects.add(oneObjects);
			}
			object.add(objects);
		}

		return JSON.toJSONString(object, true);
	}

	@Override
	public Object getAllAlertOutgoingAndInfoInfoByStorehouse() {
		// TODO Auto-generated method stub
		// 1.获取全部仓库信息
		List<Storehouse> storehouses = storehouseMapper.selectByExample(new StorehouseExample());
		List<Object> obj = new ArrayList<Object>();
		// 2.分析每个仓库的数据
		for (Storehouse storehouse : storehouses) {
			StorehouseExample storehouseExample = new StorehouseExample();
			storehouseExample.createCriteria().andStorehouseNumLessThan(storehouse.getStorehouseMin());
			storehouseMapper.selectByExample(storehouseExample);
			List<Storehouse> storehouses1 = storehouseMapper.selectByExample(storehouseExample);
			List<Object> object = new ArrayList<Object>();
			for (Storehouse storehouse2 : storehouses1) {

				OutgoingRecordExample outgoingRecordExample = new OutgoingRecordExample();
				outgoingRecordExample.createCriteria().andPkSidEqualTo(storehouse2.getPkSid());

				List<OutgoingRecord> outgoingRecords = outgoingRecordMapper.selectByExample(outgoingRecordExample);
				List<Object> objects = new ArrayList<Object>();
				for (OutgoingRecord outgoingRecord : outgoingRecords) {
					objects.add(storehouse2);
					List<Object> oneObjects = new ArrayList<Object>();
					OutgoingRecordInfoExample outgoingRecordInfoExample = new OutgoingRecordInfoExample();
					outgoingRecordInfoExample.createCriteria().andPkOridEqualTo(outgoingRecord.getPkOrid());

					List<OutgoingRecordInfo> outgoingRecordInfos = outgoingRecordInfoMapper
							.selectByExample(outgoingRecordInfoExample);
					oneObjects.add(outgoingRecord);
					oneObjects.add(outgoingRecordInfos);
					objects.add(oneObjects);
				}
				object.add(objects);
			}
			obj.add(object);
		}
		return JSON.toJSONString(obj, true);
	}

	@Override
	public List<OutgoingRecordInfo> getAllOutgoingRecordInfo() {
		// TODO Auto-generated method stub
		return outgoingRecordInfoMapper.selectByExample(new OutgoingRecordInfoExample());
	}

	@Override
	public List<OutgoingRecord> getAllOutgoingRecord() {
		// TODO Auto-generated method stub
		return outgoingRecordMapper.selectByExampleWithBLOBs(new OutgoingRecordExample());
	}

	@Override
	public List<Storehouse> getAllAlertInfo() {
		// TODO Auto-generated method stub
		
		List<Storehouse>alertStorehouse=new ArrayList<Storehouse>();
		StorehouseExample storehouseExample1 = new StorehouseExample();
		storehouseExample1.createCriteria().andPkPidIsNotNull();
		for(Storehouse s:storehouseMapper.selectByExample(storehouseExample1)) {
			StorehouseExample storehouseExample=new StorehouseExample();
			storehouseExample.createCriteria()
			.andStorehouseNumLessThanOrEqualTo(s.getStorehouseMin())
			.andPkSidEqualTo(s.getPkSid());
			for(Storehouse storehouse:storehouseMapper.selectByExample(storehouseExample)) {
				alertStorehouse.add(storehouse);
			}
		}
		
		
		return alertStorehouse;
	}

}
