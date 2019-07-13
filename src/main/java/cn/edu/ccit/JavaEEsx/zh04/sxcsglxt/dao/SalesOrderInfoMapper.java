package cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.dao;

import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.SalesOrderInfo;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.SalesOrderInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SalesOrderInfoMapper {
    int countByExample(SalesOrderInfoExample example);

    int deleteByExample(SalesOrderInfoExample example);

    int deleteByPrimaryKey(Long pkSoiid);

    int insert(SalesOrderInfo record);

    int insertSelective(SalesOrderInfo record);

    List<SalesOrderInfo> selectByExample(SalesOrderInfoExample example);

    SalesOrderInfo selectByPrimaryKey(Long pkSoiid);

    int updateByExampleSelective(@Param("record") SalesOrderInfo record, @Param("example") SalesOrderInfoExample example);

    int updateByExample(@Param("record") SalesOrderInfo record, @Param("example") SalesOrderInfoExample example);

    int updateByPrimaryKeySelective(SalesOrderInfo record);

    int updateByPrimaryKey(SalesOrderInfo record);
}