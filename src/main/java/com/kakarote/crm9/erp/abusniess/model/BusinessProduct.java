package com.kakarote.crm9.erp.abusniess.model;

public class BusinessProduct {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column business_product.r_id
     *
     * @mbg.generated Fri Jan 08 15:32:24 CST 2021
     */
    private Integer rId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column business_product.bid
     *
     * @mbg.generated Fri Jan 08 15:32:24 CST 2021
     */
    private Integer bid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column business_product.proid
     *
     * @mbg.generated Fri Jan 08 15:32:24 CST 2021
     */
    private Integer proid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column business_product.price
     *
     * @mbg.generated Fri Jan 08 15:32:24 CST 2021
     */
    private String price;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column business_product.r_id
     *
     * @return the value of business_product.r_id
     *
     * @mbg.generated Fri Jan 08 15:32:24 CST 2021
     */
    public Integer getrId() {
        return rId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column business_product.r_id
     *
     * @param rId the value for business_product.r_id
     *
     * @mbg.generated Fri Jan 08 15:32:24 CST 2021
     */
    public void setrId(Integer rId) {
        this.rId = rId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column business_product.bid
     *
     * @return the value of business_product.bid
     *
     * @mbg.generated Fri Jan 08 15:32:24 CST 2021
     */
    public Integer getBid() {
        return bid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column business_product.bid
     *
     * @param bid the value for business_product.bid
     *
     * @mbg.generated Fri Jan 08 15:32:24 CST 2021
     */
    public void setBid(Integer bid) {
        this.bid = bid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column business_product.proid
     *
     * @return the value of business_product.proid
     *
     * @mbg.generated Fri Jan 08 15:32:24 CST 2021
     */
    public Integer getProid() {
        return proid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column business_product.proid
     *
     * @param proid the value for business_product.proid
     *
     * @mbg.generated Fri Jan 08 15:32:24 CST 2021
     */
    public void setProid(Integer proid) {
        this.proid = proid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column business_product.price
     *
     * @return the value of business_product.price
     *
     * @mbg.generated Fri Jan 08 15:32:24 CST 2021
     */
    public String getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column business_product.price
     *
     * @param price the value for business_product.price
     *
     * @mbg.generated Fri Jan 08 15:32:24 CST 2021
     */
    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }
}