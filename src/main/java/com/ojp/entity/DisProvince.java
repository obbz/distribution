package com.ojp.entity;

public class DisProvince {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dis_province.p_id
     *
     * @mbg.generated
     */
    private String pId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dis_province.p_name
     *
     * @mbg.generated
     */
    private String pName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dis_province.p_id
     *
     * @return the value of dis_province.p_id
     *
     * @mbg.generated
     */
    public String getpId() {
        return pId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dis_province.p_id
     *
     * @param pId the value for dis_province.p_id
     *
     * @mbg.generated
     */
    public void setpId(String pId) {
        this.pId = pId == null ? null : pId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dis_province.p_name
     *
     * @return the value of dis_province.p_name
     *
     * @mbg.generated
     */
    public String getpName() {
        return pName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dis_province.p_name
     *
     * @param pName the value for dis_province.p_name
     *
     * @mbg.generated
     */
    public void setpName(String pName) {
        this.pName = pName == null ? null : pName.trim();
    }
}