package com.kakarote.crm9.erp.approval.model;

public class SqTask {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sq_task.id
     *
     * @mbg.generated Thu Jan 07 15:54:59 CST 2021
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sq_task.sid
     *
     * @mbg.generated Thu Jan 07 15:54:59 CST 2021
     */
    private Integer sid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sq_task.pid
     *
     * @mbg.generated Thu Jan 07 15:54:59 CST 2021
     */
    private Integer pid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sq_task.tid
     *
     * @mbg.generated Thu Jan 07 15:54:59 CST 2021
     */
    private Integer tid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sq_task.time
     *
     * @mbg.generated Thu Jan 07 15:54:59 CST 2021
     */
    private String time;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sq_task.name
     *
     * @mbg.generated Thu Jan 07 15:54:59 CST 2021
     */
    private String name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sq_task.id
     *
     * @return the value of sq_task.id
     *
     * @mbg.generated Thu Jan 07 15:54:59 CST 2021
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sq_task.id
     *
     * @param id the value for sq_task.id
     *
     * @mbg.generated Thu Jan 07 15:54:59 CST 2021
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sq_task.sid
     *
     * @return the value of sq_task.sid
     *
     * @mbg.generated Thu Jan 07 15:54:59 CST 2021
     */
    public Integer getSid() {
        return sid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sq_task.sid
     *
     * @param sid the value for sq_task.sid
     *
     * @mbg.generated Thu Jan 07 15:54:59 CST 2021
     */
    public void setSid(Integer sid) {
        this.sid = sid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sq_task.pid
     *
     * @return the value of sq_task.pid
     *
     * @mbg.generated Thu Jan 07 15:54:59 CST 2021
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sq_task.pid
     *
     * @param pid the value for sq_task.pid
     *
     * @mbg.generated Thu Jan 07 15:54:59 CST 2021
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sq_task.tid
     *
     * @return the value of sq_task.tid
     *
     * @mbg.generated Thu Jan 07 15:54:59 CST 2021
     */
    public Integer getTid() {
        return tid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sq_task.tid
     *
     * @param tid the value for sq_task.tid
     *
     * @mbg.generated Thu Jan 07 15:54:59 CST 2021
     */
    public void setTid(Integer tid) {
        this.tid = tid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sq_task.time
     *
     * @return the value of sq_task.time
     *
     * @mbg.generated Thu Jan 07 15:54:59 CST 2021
     */
    public String getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sq_task.time
     *
     * @param time the value for sq_task.time
     *
     * @mbg.generated Thu Jan 07 15:54:59 CST 2021
     */
    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sq_task.name
     *
     * @return the value of sq_task.name
     *
     * @mbg.generated Thu Jan 07 15:54:59 CST 2021
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sq_task.name
     *
     * @param name the value for sq_task.name
     *
     * @mbg.generated Thu Jan 07 15:54:59 CST 2021
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}