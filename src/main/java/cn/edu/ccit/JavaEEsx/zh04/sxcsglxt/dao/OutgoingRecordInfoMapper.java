package cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.dao;

import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.OutgoingRecordInfo;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.OutgoingRecordInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OutgoingRecordInfoMapper {
    int countByExample(OutgoingRecordInfoExample example);

    int deleteByExample(OutgoingRecordInfoExample example);

    int deleteByPrimaryKey(Long pkOriid);

    int insert(OutgoingRecordInfo record);

    int insertSelective(OutgoingRecordInfo record);

    List<OutgoingRecordInfo> selectByExample(OutgoingRecordInfoExample example);

    OutgoingRecordInfo selectByPrimaryKey(Long pkOriid);

    int updateByExampleSelective(@Param("record") OutgoingRecordInfo record, @Param("example") OutgoingRecordInfoExample example);

    int updateByExample(@Param("record") OutgoingRecordInfo record, @Param("example") OutgoingRecordInfoExample example);

    int updateByPrimaryKeySelective(OutgoingRecordInfo record);

    int updateByPrimaryKey(OutgoingRecordInfo record);
}