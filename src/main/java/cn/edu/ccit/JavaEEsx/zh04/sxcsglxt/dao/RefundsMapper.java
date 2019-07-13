package cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.dao;

import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.Refunds;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.RefundsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RefundsMapper {
    int countByExample(RefundsExample example);

    int deleteByExample(RefundsExample example);

    int deleteByPrimaryKey(Long pkReid);

    int insert(Refunds record);

    int insertSelective(Refunds record);

    List<Refunds> selectByExampleWithBLOBs(RefundsExample example);

    List<Refunds> selectByExample(RefundsExample example);

    Refunds selectByPrimaryKey(Long pkReid);

    int updateByExampleSelective(@Param("record") Refunds record, @Param("example") RefundsExample example);

    int updateByExampleWithBLOBs(@Param("record") Refunds record, @Param("example") RefundsExample example);

    int updateByExample(@Param("record") Refunds record, @Param("example") RefundsExample example);

    int updateByPrimaryKeySelective(Refunds record);

    int updateByPrimaryKeyWithBLOBs(Refunds record);

    int updateByPrimaryKey(Refunds record);
}