package com.kakarote.crm9.erp.admin.model;

import java.util.Date;

/**
 * 用户mapper
 */
public class WjAdminUser {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wj_admin_user.user_id
     *
     * @mbg.generated Fri Jan 08 00:36:33 CST 2021
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wj_admin_user.username
     *
     * @mbg.generated Fri Jan 08 00:36:33 CST 2021
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wj_admin_user.password
     *
     * @mbg.generated Fri Jan 08 00:36:33 CST 2021
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wj_admin_user.salt
     *
     * @mbg.generated Fri Jan 08 00:36:33 CST 2021
     */
    private String salt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wj_admin_user.img
     *
     * @mbg.generated Fri Jan 08 00:36:33 CST 2021
     */
    private String img;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wj_admin_user.create_time
     *
     * @mbg.generated Fri Jan 08 00:36:33 CST 2021
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wj_admin_user.realname
     *
     * @mbg.generated Fri Jan 08 00:36:33 CST 2021
     */
    private String realname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wj_admin_user.num
     *
     * @mbg.generated Fri Jan 08 00:36:33 CST 2021
     */
    private String num;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wj_admin_user.mobile
     *
     * @mbg.generated Fri Jan 08 00:36:33 CST 2021
     */
    private String mobile;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wj_admin_user.email
     *
     * @mbg.generated Fri Jan 08 00:36:33 CST 2021
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wj_admin_user.sex
     *
     * @mbg.generated Fri Jan 08 00:36:33 CST 2021
     */
    private Integer sex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wj_admin_user.dept_id
     *
     * @mbg.generated Fri Jan 08 00:36:33 CST 2021
     */
    private Integer deptId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wj_admin_user.post
     *
     * @mbg.generated Fri Jan 08 00:36:33 CST 2021
     */
    private String post;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wj_admin_user.status
     *
     * @mbg.generated Fri Jan 08 00:36:33 CST 2021
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wj_admin_user.parent_id
     *
     * @mbg.generated Fri Jan 08 00:36:33 CST 2021
     */
    private Integer parentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wj_admin_user.last_login_time
     *
     * @mbg.generated Fri Jan 08 00:36:33 CST 2021
     */
    private Date lastLoginTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wj_admin_user.last_login_ip
     *
     * @mbg.generated Fri Jan 08 00:36:33 CST 2021
     */
    private String lastLoginIp;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wj_admin_user.user_id
     *
     * @return the value of wj_admin_user.user_id
     *
     * @mbg.generated Fri Jan 08 00:36:33 CST 2021
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wj_admin_user.user_id
     *
     * @param userId the value for wj_admin_user.user_id
     *
     * @mbg.generated Fri Jan 08 00:36:33 CST 2021
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wj_admin_user.username
     *
     * @return the value of wj_admin_user.username
     *
     * @mbg.generated Fri Jan 08 00:36:33 CST 2021
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wj_admin_user.username
     *
     * @param username the value for wj_admin_user.username
     *
     * @mbg.generated Fri Jan 08 00:36:33 CST 2021
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wj_admin_user.password
     *
     * @return the value of wj_admin_user.password
     *
     * @mbg.generated Fri Jan 08 00:36:33 CST 2021
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wj_admin_user.password
     *
     * @param password the value for wj_admin_user.password
     *
     * @mbg.generated Fri Jan 08 00:36:33 CST 2021
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wj_admin_user.salt
     *
     * @return the value of wj_admin_user.salt
     *
     * @mbg.generated Fri Jan 08 00:36:33 CST 2021
     */
    public String getSalt() {
        return salt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wj_admin_user.salt
     *
     * @param salt the value for wj_admin_user.salt
     *
     * @mbg.generated Fri Jan 08 00:36:33 CST 2021
     */
    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wj_admin_user.img
     *
     * @return the value of wj_admin_user.img
     *
     * @mbg.generated Fri Jan 08 00:36:33 CST 2021
     */
    public String getImg() {
        return img;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wj_admin_user.img
     *
     * @param img the value for wj_admin_user.img
     *
     * @mbg.generated Fri Jan 08 00:36:33 CST 2021
     */
    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wj_admin_user.create_time
     *
     * @return the value of wj_admin_user.create_time
     *
     * @mbg.generated Fri Jan 08 00:36:33 CST 2021
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wj_admin_user.create_time
     *
     * @param createTime the value for wj_admin_user.create_time
     *
     * @mbg.generated Fri Jan 08 00:36:33 CST 2021
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wj_admin_user.realname
     *
     * @return the value of wj_admin_user.realname
     *
     * @mbg.generated Fri Jan 08 00:36:33 CST 2021
     */
    public String getRealname() {
        return realname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wj_admin_user.realname
     *
     * @param realname the value for wj_admin_user.realname
     *
     * @mbg.generated Fri Jan 08 00:36:33 CST 2021
     */
    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wj_admin_user.num
     *
     * @return the value of wj_admin_user.num
     *
     * @mbg.generated Fri Jan 08 00:36:33 CST 2021
     */
    public String getNum() {
        return num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wj_admin_user.num
     *
     * @param num the value for wj_admin_user.num
     *
     * @mbg.generated Fri Jan 08 00:36:33 CST 2021
     */
    public void setNum(String num) {
        this.num = num == null ? null : num.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wj_admin_user.mobile
     *
     * @return the value of wj_admin_user.mobile
     *
     * @mbg.generated Fri Jan 08 00:36:33 CST 2021
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wj_admin_user.mobile
     *
     * @param mobile the value for wj_admin_user.mobile
     *
     * @mbg.generated Fri Jan 08 00:36:33 CST 2021
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wj_admin_user.email
     *
     * @return the value of wj_admin_user.email
     *
     * @mbg.generated Fri Jan 08 00:36:33 CST 2021
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wj_admin_user.email
     *
     * @param email the value for wj_admin_user.email
     *
     * @mbg.generated Fri Jan 08 00:36:33 CST 2021
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wj_admin_user.sex
     *
     * @return the value of wj_admin_user.sex
     *
     * @mbg.generated Fri Jan 08 00:36:33 CST 2021
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wj_admin_user.sex
     *
     * @param sex the value for wj_admin_user.sex
     *
     * @mbg.generated Fri Jan 08 00:36:33 CST 2021
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wj_admin_user.dept_id
     *
     * @return the value of wj_admin_user.dept_id
     *
     * @mbg.generated Fri Jan 08 00:36:33 CST 2021
     */
    public Integer getDeptId() {
        return deptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wj_admin_user.dept_id
     *
     * @param deptId the value for wj_admin_user.dept_id
     *
     * @mbg.generated Fri Jan 08 00:36:33 CST 2021
     */
    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wj_admin_user.post
     *
     * @return the value of wj_admin_user.post
     *
     * @mbg.generated Fri Jan 08 00:36:33 CST 2021
     */
    public String getPost() {
        return post;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wj_admin_user.post
     *
     * @param post the value for wj_admin_user.post
     *
     * @mbg.generated Fri Jan 08 00:36:33 CST 2021
     */
    public void setPost(String post) {
        this.post = post == null ? null : post.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wj_admin_user.status
     *
     * @return the value of wj_admin_user.status
     *
     * @mbg.generated Fri Jan 08 00:36:33 CST 2021
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wj_admin_user.status
     *
     * @param status the value for wj_admin_user.status
     *
     * @mbg.generated Fri Jan 08 00:36:33 CST 2021
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wj_admin_user.parent_id
     *
     * @return the value of wj_admin_user.parent_id
     *
     * @mbg.generated Fri Jan 08 00:36:33 CST 2021
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wj_admin_user.parent_id
     *
     * @param parentId the value for wj_admin_user.parent_id
     *
     * @mbg.generated Fri Jan 08 00:36:33 CST 2021
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wj_admin_user.last_login_time
     *
     * @return the value of wj_admin_user.last_login_time
     *
     * @mbg.generated Fri Jan 08 00:36:33 CST 2021
     */
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wj_admin_user.last_login_time
     *
     * @param lastLoginTime the value for wj_admin_user.last_login_time
     *
     * @mbg.generated Fri Jan 08 00:36:33 CST 2021
     */
    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wj_admin_user.last_login_ip
     *
     * @return the value of wj_admin_user.last_login_ip
     *
     * @mbg.generated Fri Jan 08 00:36:33 CST 2021
     */
    public String getLastLoginIp() {
        return lastLoginIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wj_admin_user.last_login_ip
     *
     * @param lastLoginIp the value for wj_admin_user.last_login_ip
     *
     * @mbg.generated Fri Jan 08 00:36:33 CST 2021
     */
    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp == null ? null : lastLoginIp.trim();
    }
}