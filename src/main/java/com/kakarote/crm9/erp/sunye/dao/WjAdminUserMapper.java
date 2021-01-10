package com.kakarote.crm9.erp.sunye.dao;

import com.kakarote.crm9.erp.approval.model.User;
import com.kakarote.crm9.erp.sunye.model.WjAdminUser;
import com.kakarote.crm9.erp.sunye.model.WjAdminUserExample;

import java.awt.print.Book;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface WjAdminUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wj_admin_user
     *
     * @mbg.generated Sat Jan 09 15:07:24 CST 2021
     */
    long countByExample(WjAdminUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wj_admin_user
     *
     * @mbg.generated Sat Jan 09 15:07:24 CST 2021
     */
    int deleteByExample(WjAdminUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wj_admin_user
     *
     * @mbg.generated Sat Jan 09 15:07:24 CST 2021
     */
    int deleteByPrimaryKey(Integer userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wj_admin_user
     *
     * @mbg.generated Sat Jan 09 15:07:24 CST 2021
     */
    int insert(WjAdminUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wj_admin_user
     *
     * @mbg.generated Sat Jan 09 15:07:24 CST 2021
     */
    int insertSelective(WjAdminUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wj_admin_user
     *
     * @mbg.generated Sat Jan 09 15:07:24 CST 2021
     */
    List<WjAdminUser> selectByExample(WjAdminUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wj_admin_user
     *
     * @mbg.generated Sat Jan 09 15:07:24 CST 2021
     */
    WjAdminUser selectByPrimaryKey(Integer userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wj_admin_user
     *
     * @mbg.generated Sat Jan 09 15:07:24 CST 2021
     */
    int updateByExampleSelective(@Param("record") WjAdminUser record, @Param("example") WjAdminUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wj_admin_user
     *
     * @mbg.generated Sat Jan 09 15:07:24 CST 2021
     */
    int updateByExample(@Param("record") WjAdminUser record, @Param("example") WjAdminUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wj_admin_user
     *
     * @mbg.generated Sat Jan 09 15:07:24 CST 2021
     */
    int updateByPrimaryKeySelective(WjAdminUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wj_admin_user
     *
     * @mbg.generated Sat Jan 09 15:07:24 CST 2021
     */
    int updateByPrimaryKey(WjAdminUser record);
    @Select("select * from wj_admin_user") //用@Select注解sql语句
    List<User> findAll();
}