package com.kakarote.crm9.erp.phone.model;

public class ZhangweiDepartment {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column zhangwei_department.did
     *
     * @mbg.generated Wed Jan 06 16:06:30 CST 2021
     */
    private Integer did;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column zhangwei_department.dname
     *
     * @mbg.generated Wed Jan 06 16:06:30 CST 2021
     */
    private String dname;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column zhangwei_department.did
     *
     * @return the value of zhangwei_department.did
     *
     * @mbg.generated Wed Jan 06 16:06:30 CST 2021
     */
    public Integer getDid() {
        return did;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column zhangwei_department.did
     *
     * @param did the value for zhangwei_department.did
     *
     * @mbg.generated Wed Jan 06 16:06:30 CST 2021
     */
    public void setDid(Integer did) {
        this.did = did;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column zhangwei_department.dname
     *
     * @return the value of zhangwei_department.dname
     *
     * @mbg.generated Wed Jan 06 16:06:30 CST 2021
     */
    public String getDname() {
        return dname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column zhangwei_department.dname
     *
     * @param dname the value for zhangwei_department.dname
     *
     * @mbg.generated Wed Jan 06 16:06:30 CST 2021
     */
    public void setDname(String dname) {
        this.dname = dname == null ? null : dname.trim();
    }
}