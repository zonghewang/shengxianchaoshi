package cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.dao;

import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.RefundsInfo;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.RefundsInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RefundsInfoMapper {
    int countByExample(RefundsInfoExample example);

    int deleteByExample(RefundsInfoExample example);

    int deleteByPrimaryKey(Long pkReiid);

    int insert(RefundsInfo record);

    int insertSelective(RefundsInfo record);

    List<RefundsInfo> selectByExample(RefundsInfoExample example);

    RefundsInfo selectByPrimaryKey(Long pkReiid);

    int updateByExampleSelective(@Param("record") RefundsInfo record, @Param("example") RefundsInfoExample example);

    int updateByExample(@Param("record") RefundsInfo record, @Param("example") RefundsInfoExample example);

    int updateByPrimaryKeySelective(RefundsInfo record);

    int updateByPrimaryKey(RefundsInfo record);
}