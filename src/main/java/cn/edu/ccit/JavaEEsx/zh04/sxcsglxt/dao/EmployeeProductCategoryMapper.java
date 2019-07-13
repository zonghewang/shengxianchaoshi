package cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.dao;

import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.EmployeeProductCategory;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.EmployeeProductCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmployeeProductCategoryMapper {
    int countByExample(EmployeeProductCategoryExample example);

    int deleteByExample(EmployeeProductCategoryExample example);

    int deleteByPrimaryKey(Long pkEpcid);

    int insert(EmployeeProductCategory record);

    int insertSelective(EmployeeProductCategory record);

    List<EmployeeProductCategory> selectByExample(EmployeeProductCategoryExample example);

    EmployeeProductCategory selectByPrimaryKey(Long pkEpcid);

    int updateByExampleSelective(@Param("record") EmployeeProductCategory record, @Param("example") EmployeeProductCategoryExample example);

    int updateByExample(@Param("record") EmployeeProductCategory record, @Param("example") EmployeeProductCategoryExample example);

    int updateByPrimaryKeySelective(EmployeeProductCategory record);

    int updateByPrimaryKey(EmployeeProductCategory record);
}