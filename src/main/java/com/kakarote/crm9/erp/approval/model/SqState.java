package com.kakarote.crm9.erp.approval.model;

public class SqState {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sq_state.id
     *
     * @mbg.generated Thu Jan 07 15:54:59 CST 2021
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sq_state.name
     *
     * @mbg.generated Thu Jan 07 15:54:59 CST 2021
     */
    private String name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sq_state.id
     *
     * @return the value of sq_state.id
     *
     * @mbg.generated Thu Jan 07 15:54:59 CST 2021
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sq_state.id
     *
     * @param id the value for sq_state.id
     *
     * @mbg.generated Thu Jan 07 15:54:59 CST 2021
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sq_state.name
     *
     * @return the value of sq_state.name
     *
     * @mbg.generated Thu Jan 07 15:54:59 CST 2021
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sq_state.name
     *
     * @param name the value for sq_state.name
     *
     * @mbg.generated Thu Jan 07 15:54:59 CST 2021
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}