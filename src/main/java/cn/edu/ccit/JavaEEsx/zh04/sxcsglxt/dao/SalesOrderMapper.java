package cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.dao;

import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.SalesOrder;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.SalesOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SalesOrderMapper {
    int countByExample(SalesOrderExample example);

    int deleteByExample(SalesOrderExample example);

    int deleteByPrimaryKey(Long pkSoid);

    int insert(SalesOrder record);

    int insertSelective(SalesOrder record);

    List<SalesOrder> selectByExampleWithBLOBs(SalesOrderExample example);

    List<SalesOrder> selectByExample(SalesOrderExample example);

    SalesOrder selectByPrimaryKey(Long pkSoid);

    int updateByExampleSelective(@Param("record") SalesOrder record, @Param("example") SalesOrderExample example);

    int updateByExampleWithBLOBs(@Param("record") SalesOrder record, @Param("example") SalesOrderExample example);

    int updateByExample(@Param("record") SalesOrder record, @Param("example") SalesOrderExample example);

    int updateByPrimaryKeySelective(SalesOrder record);

    int updateByPrimaryKeyWithBLOBs(SalesOrder record);

    int updateByPrimaryKey(SalesOrder record);
}