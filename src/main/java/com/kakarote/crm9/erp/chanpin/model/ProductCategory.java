package com.kakarote.crm9.erp.chanpin.model;

public class ProductCategory {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_category.category_id
     *
     * @mbg.generated Thu Jan 07 02:14:27 CST 2021
     */
    private Integer categoryId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_category.name
     *
     * @mbg.generated Thu Jan 07 02:14:27 CST 2021
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_category.pid
     *
     * @mbg.generated Thu Jan 07 02:14:27 CST 2021
     */
    private Integer pid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_category.category_id
     *
     * @return the value of product_category.category_id
     *
     * @mbg.generated Thu Jan 07 02:14:27 CST 2021
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_category.category_id
     *
     * @param categoryId the value for product_category.category_id
     *
     * @mbg.generated Thu Jan 07 02:14:27 CST 2021
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_category.name
     *
     * @return the value of product_category.name
     *
     * @mbg.generated Thu Jan 07 02:14:27 CST 2021
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_category.name
     *
     * @param name the value for product_category.name
     *
     * @mbg.generated Thu Jan 07 02:14:27 CST 2021
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_category.pid
     *
     * @return the value of product_category.pid
     *
     * @mbg.generated Thu Jan 07 02:14:27 CST 2021
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_category.pid
     *
     * @param pid the value for product_category.pid
     *
     * @mbg.generated Thu Jan 07 02:14:27 CST 2021
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }
}