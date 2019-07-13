package cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.dao;

import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.Buy;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.BuyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BuyMapper {
    int countByExample(BuyExample example);

    int deleteByExample(BuyExample example);

    int deleteByPrimaryKey(Long pkBid);

    int insert(Buy record);

    int insertSelective(Buy record);

    List<Buy> selectByExampleWithBLOBs(BuyExample example);

    List<Buy> selectByExample(BuyExample example);

    Buy selectByPrimaryKey(Long pkBid);

    int updateByExampleSelective(@Param("record") Buy record, @Param("example") BuyExample example);

    int updateByExampleWithBLOBs(@Param("record") Buy record, @Param("example") BuyExample example);

    int updateByExample(@Param("record") Buy record, @Param("example") BuyExample example);

    int updateByPrimaryKeySelective(Buy record);

    int updateByPrimaryKeyWithBLOBs(Buy record);

    int updateByPrimaryKey(Buy record);
}