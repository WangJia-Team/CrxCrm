package com.kakarote.crm9.erp.approval.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserCustomerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_customer
     *
     * @mbg.generated Tue Jan 05 16:05:38 CST 2021
     */
    long countByExample(UserCustomerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_customer
     *
     * @mbg.generated Tue Jan 05 16:05:38 CST 2021
     */
    int deleteByExample(UserCustomerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_customer
     *
     * @mbg.generated Tue Jan 05 16:05:38 CST 2021
     */
    int deleteByPrimaryKey(UserCustomerKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_customer
     *
     * @mbg.generated Tue Jan 05 16:05:38 CST 2021
     */
    int insert(UserCustomerKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_customer
     *
     * @mbg.generated Tue Jan 05 16:05:38 CST 2021
     */
    int insertSelective(UserCustomerKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_customer
     *
     * @mbg.generated Tue Jan 05 16:05:38 CST 2021
     */
    List<UserCustomerKey> selectByExample(UserCustomerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_customer
     *
     * @mbg.generated Tue Jan 05 16:05:38 CST 2021
     */
    int updateByExampleSelective(@Param("record") UserCustomerKey record, @Param("example") UserCustomerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_customer
     *
     * @mbg.generated Tue Jan 05 16:05:38 CST 2021
     */
    int updateByExample(@Param("record") UserCustomerKey record, @Param("example") UserCustomerExample example);
}