package com.kakarote.crm9.erp.busniess.dao;

import com.kakarote.crm9.erp.busniess.model.ContactsBusiness;
import com.kakarote.crm9.erp.busniess.model.ContactsBusinessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContactsBusinessMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contacts_business
     *
     * @mbg.generated Fri Jan 08 15:35:19 CST 2021
     */
    long countByExample(ContactsBusinessExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contacts_business
     *
     * @mbg.generated Fri Jan 08 15:35:19 CST 2021
     */
    int deleteByExample(ContactsBusinessExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contacts_business
     *
     * @mbg.generated Fri Jan 08 15:35:19 CST 2021
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contacts_business
     *
     * @mbg.generated Fri Jan 08 15:35:19 CST 2021
     */
    int insert(ContactsBusiness record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contacts_business
     *
     * @mbg.generated Fri Jan 08 15:35:19 CST 2021
     */
    int insertSelective(ContactsBusiness record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contacts_business
     *
     * @mbg.generated Fri Jan 08 15:35:19 CST 2021
     */
    List<ContactsBusiness> selectByExample(ContactsBusinessExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contacts_business
     *
     * @mbg.generated Fri Jan 08 15:35:19 CST 2021
     */
    ContactsBusiness selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contacts_business
     *
     * @mbg.generated Fri Jan 08 15:35:19 CST 2021
     */
    int updateByExampleSelective(@Param("record") ContactsBusiness record, @Param("example") ContactsBusinessExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contacts_business
     *
     * @mbg.generated Fri Jan 08 15:35:19 CST 2021
     */
    int updateByExample(@Param("record") ContactsBusiness record, @Param("example") ContactsBusinessExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contacts_business
     *
     * @mbg.generated Fri Jan 08 15:35:19 CST 2021
     */
    int updateByPrimaryKeySelective(ContactsBusiness record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contacts_business
     *
     * @mbg.generated Fri Jan 08 15:35:19 CST 2021
     */
    int updateByPrimaryKey(ContactsBusiness record);
}