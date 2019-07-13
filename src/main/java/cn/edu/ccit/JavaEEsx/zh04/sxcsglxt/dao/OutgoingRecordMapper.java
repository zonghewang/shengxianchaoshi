package cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.dao;

import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.OutgoingRecord;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.OutgoingRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OutgoingRecordMapper {
    int countByExample(OutgoingRecordExample example);

    int deleteByExample(OutgoingRecordExample example);

    int deleteByPrimaryKey(Long pkOrid);

    int insert(OutgoingRecord record);

    int insertSelective(OutgoingRecord record);

    List<OutgoingRecord> selectByExampleWithBLOBs(OutgoingRecordExample example);

    List<OutgoingRecord> selectByExample(OutgoingRecordExample example);

    OutgoingRecord selectByPrimaryKey(Long pkOrid);

    int updateByExampleSelective(@Param("record") OutgoingRecord record, @Param("example") OutgoingRecordExample example);

    int updateByExampleWithBLOBs(@Param("record") OutgoingRecord record, @Param("example") OutgoingRecordExample example);

    int updateByExample(@Param("record") OutgoingRecord record, @Param("example") OutgoingRecordExample example);

    int updateByPrimaryKeySelective(OutgoingRecord record);

    int updateByPrimaryKeyWithBLOBs(OutgoingRecord record);

    int updateByPrimaryKey(OutgoingRecord record);
}