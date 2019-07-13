package cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.dao;

import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.BuyInfo;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.BuyInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BuyInfoMapper {
    int countByExample(BuyInfoExample example);

    int deleteByExample(BuyInfoExample example);

    int deleteByPrimaryKey(Long pkBiid);

    int insert(BuyInfo record);

    int insertSelective(BuyInfo record);

    List<BuyInfo> selectByExampleWithBLOBs(BuyInfoExample example);

    List<BuyInfo> selectByExample(BuyInfoExample example);

    BuyInfo selectByPrimaryKey(Long pkBiid);

    int updateByExampleSelective(@Param("record") BuyInfo record, @Param("example") BuyInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") BuyInfo record, @Param("example") BuyInfoExample example);

    int updateByExample(@Param("record") BuyInfo record, @Param("example") BuyInfoExample example);

    int updateByPrimaryKeySelective(BuyInfo record);

    int updateByPrimaryKeyWithBLOBs(BuyInfo record);

    int updateByPrimaryKey(BuyInfo record);
}