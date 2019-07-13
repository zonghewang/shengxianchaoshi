package cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.dao;

import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.Storehouse;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.StorehouseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StorehouseMapper {
    int countByExample(StorehouseExample example);

    int deleteByExample(StorehouseExample example);

    int deleteByPrimaryKey(Long pkSid);

    int insert(Storehouse record);

    int insertSelective(Storehouse record);

    List<Storehouse> selectByExample(StorehouseExample example);

    Storehouse selectByPrimaryKey(Long pkSid);

    int updateByExampleSelective(@Param("record") Storehouse record, @Param("example") StorehouseExample example);

    int updateByExample(@Param("record") Storehouse record, @Param("example") StorehouseExample example);

    int updateByPrimaryKeySelective(Storehouse record);

    int updateByPrimaryKey(Storehouse record);
}