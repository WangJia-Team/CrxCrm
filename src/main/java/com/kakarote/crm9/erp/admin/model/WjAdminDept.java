package com.kakarote.crm9.erp.admin.model;

public class WjAdminDept {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wj_admin_dept.dept_id
     *
     * @mbg.generated Fri Jan 08 00:36:33 CST 2021
     */
    private Integer deptId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wj_admin_dept.pid
     *
     * @mbg.generated Fri Jan 08 00:36:33 CST 2021
     */
    private Integer pid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wj_admin_dept.name
     *
     * @mbg.generated Fri Jan 08 00:36:33 CST 2021
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wj_admin_dept.num
     *
     * @mbg.generated Fri Jan 08 00:36:33 CST 2021
     */
    private Integer num;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wj_admin_dept.remark
     *
     * @mbg.generated Fri Jan 08 00:36:33 CST 2021
     */
    private String remark;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wj_admin_dept.dept_id
     *
     * @return the value of wj_admin_dept.dept_id
     *
     * @mbg.generated Fri Jan 08 00:36:33 CST 2021
     */
    public Integer getDeptId() {
        return deptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wj_admin_dept.dept_id
     *
     * @param deptId the value for wj_admin_dept.dept_id
     *
     * @mbg.generated Fri Jan 08 00:36:33 CST 2021
     */
    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wj_admin_dept.pid
     *
     * @return the value of wj_admin_dept.pid
     *
     * @mbg.generated Fri Jan 08 00:36:33 CST 2021
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wj_admin_dept.pid
     *
     * @param pid the value for wj_admin_dept.pid
     *
     * @mbg.generated Fri Jan 08 00:36:33 CST 2021
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wj_admin_dept.name
     *
     * @return the value of wj_admin_dept.name
     *
     * @mbg.generated Fri Jan 08 00:36:33 CST 2021
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wj_admin_dept.name
     *
     * @param name the value for wj_admin_dept.name
     *
     * @mbg.generated Fri Jan 08 00:36:33 CST 2021
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wj_admin_dept.num
     *
     * @return the value of wj_admin_dept.num
     *
     * @mbg.generated Fri Jan 08 00:36:33 CST 2021
     */
    public Integer getNum() {
        return num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wj_admin_dept.num
     *
     * @param num the value for wj_admin_dept.num
     *
     * @mbg.generated Fri Jan 08 00:36:33 CST 2021
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wj_admin_dept.remark
     *
     * @return the value of wj_admin_dept.remark
     *
     * @mbg.generated Fri Jan 08 00:36:33 CST 2021
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wj_admin_dept.remark
     *
     * @param remark the value for wj_admin_dept.remark
     *
     * @mbg.generated Fri Jan 08 00:36:33 CST 2021
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}