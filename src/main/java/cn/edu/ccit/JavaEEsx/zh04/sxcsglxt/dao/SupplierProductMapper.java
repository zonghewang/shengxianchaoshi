package cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.dao;

import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.SupplierProduct;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.SupplierProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SupplierProductMapper {
    int countByExample(SupplierProductExample example);

    int deleteByExample(SupplierProductExample example);

    int deleteByPrimaryKey(Long pkSpid);

    int insert(SupplierProduct record);

    int insertSelective(SupplierProduct record);

    List<SupplierProduct> selectByExampleWithBLOBs(SupplierProductExample example);

    List<SupplierProduct> selectByExample(SupplierProductExample example);

    SupplierProduct selectByPrimaryKey(Long pkSpid);

    int updateByExampleSelective(@Param("record") SupplierProduct record, @Param("example") SupplierProductExample example);

    int updateByExampleWithBLOBs(@Param("record") SupplierProduct record, @Param("example") SupplierProductExample example);

    int updateByExample(@Param("record") SupplierProduct record, @Param("example") SupplierProductExample example);

    int updateByPrimaryKeySelective(SupplierProduct record);

    int updateByPrimaryKeyWithBLOBs(SupplierProduct record);

    int updateByPrimaryKey(SupplierProduct record);
}