package com.kakarote.crm9.erp.approval.dao;

import com.kakarote.crm9.erp.approval.model.SqType;
import com.kakarote.crm9.erp.approval.model.SqTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SqTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sq_type
     *
     * @mbg.generated Thu Jan 07 15:54:59 CST 2021
     */
    long countByExample(SqTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sq_type
     *
     * @mbg.generated Thu Jan 07 15:54:59 CST 2021
     */
    int deleteByExample(SqTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sq_type
     *
     * @mbg.generated Thu Jan 07 15:54:59 CST 2021
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sq_type
     *
     * @mbg.generated Thu Jan 07 15:54:59 CST 2021
     */
    int insert(SqType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sq_type
     *
     * @mbg.generated Thu Jan 07 15:54:59 CST 2021
     */
    int insertSelective(SqType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sq_type
     *
     * @mbg.generated Thu Jan 07 15:54:59 CST 2021
     */
    List<SqType> selectByExample(SqTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sq_type
     *
     * @mbg.generated Thu Jan 07 15:54:59 CST 2021
     */
    SqType selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sq_type
     *
     * @mbg.generated Thu Jan 07 15:54:59 CST 2021
     */
    int updateByExampleSelective(@Param("record") SqType record, @Param("example") SqTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sq_type
     *
     * @mbg.generated Thu Jan 07 15:54:59 CST 2021
     */
    int updateByExample(@Param("record") SqType record, @Param("example") SqTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sq_type
     *
     * @mbg.generated Thu Jan 07 15:54:59 CST 2021
     */
    int updateByPrimaryKeySelective(SqType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sq_type
     *
     * @mbg.generated Thu Jan 07 15:54:59 CST 2021
     */
    int updateByPrimaryKey(SqType record);
}