package cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.dao;

import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.Customer;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.CustomerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerMapper {
    int countByExample(CustomerExample example);

    int deleteByExample(CustomerExample example);

    int deleteByPrimaryKey(Long pkCid);

    int insert(Customer record);

    int insertSelective(Customer record);

    List<Customer> selectByExampleWithBLOBs(CustomerExample example);

    List<Customer> selectByExample(CustomerExample example);

    Customer selectByPrimaryKey(Long pkCid);

    int updateByExampleSelective(@Param("record") Customer record, @Param("example") CustomerExample example);

    int updateByExampleWithBLOBs(@Param("record") Customer record, @Param("example") CustomerExample example);

    int updateByExample(@Param("record") Customer record, @Param("example") CustomerExample example);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKeyWithBLOBs(Customer record);

    int updateByPrimaryKey(Customer record);
}