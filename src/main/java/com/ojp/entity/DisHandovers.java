package com.ojp.entity;

import java.util.Date;

public class DisHandovers {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dis_handovers.h_startdis_city
     *
     * @mbg.generated
     */
    private String hStartdisCity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dis_handovers.h_enddis_city
     *
     * @mbg.generated
     */
    private String hEnddisCity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dis_handovers.h_arrive
     *
     * @mbg.generated
     */
    private String hArrive;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dis_handovers.h_state
     *
     * @mbg.generated
     */
    private Integer hState;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dis_handovers.h_generate
     *
     * @mbg.generated
     */
    private Date hGenerate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dis_handovers.h_remarks
     *
     * @mbg.generated
     */
    private String hRemarks;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dis_handovers.h_startdis_city
     *
     * @return the value of dis_handovers.h_startdis_city
     *
     * @mbg.generated
     */
    public String gethStartdisCity() {
        return hStartdisCity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dis_handovers.h_startdis_city
     *
     * @param hStartdisCity the value for dis_handovers.h_startdis_city
     *
     * @mbg.generated
     */
    public void sethStartdisCity(String hStartdisCity) {
        this.hStartdisCity = hStartdisCity == null ? null : hStartdisCity.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dis_handovers.h_enddis_city
     *
     * @return the value of dis_handovers.h_enddis_city
     *
     * @mbg.generated
     */
    public String gethEnddisCity() {
        return hEnddisCity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dis_handovers.h_enddis_city
     *
     * @param hEnddisCity the value for dis_handovers.h_enddis_city
     *
     * @mbg.generated
     */
    public void sethEnddisCity(String hEnddisCity) {
        this.hEnddisCity = hEnddisCity == null ? null : hEnddisCity.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dis_handovers.h_arrive
     *
     * @return the value of dis_handovers.h_arrive
     *
     * @mbg.generated
     */
    public String gethArrive() {
        return hArrive;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dis_handovers.h_arrive
     *
     * @param hArrive the value for dis_handovers.h_arrive
     *
     * @mbg.generated
     */
    public void sethArrive(String hArrive) {
        this.hArrive = hArrive == null ? null : hArrive.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dis_handovers.h_state
     *
     * @return the value of dis_handovers.h_state
     *
     * @mbg.generated
     */
    public Integer gethState() {
        return hState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dis_handovers.h_state
     *
     * @param hState the value for dis_handovers.h_state
     *
     * @mbg.generated
     */
    public void sethState(Integer hState) {
        this.hState = hState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dis_handovers.h_generate
     *
     * @return the value of dis_handovers.h_generate
     *
     * @mbg.generated
     */
    public Date gethGenerate() {
        return hGenerate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dis_handovers.h_generate
     *
     * @param hGenerate the value for dis_handovers.h_generate
     *
     * @mbg.generated
     */
    public void sethGenerate(Date hGenerate) {
        this.hGenerate = hGenerate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dis_handovers.h_remarks
     *
     * @return the value of dis_handovers.h_remarks
     *
     * @mbg.generated
     */
    public String gethRemarks() {
        return hRemarks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dis_handovers.h_remarks
     *
     * @param hRemarks the value for dis_handovers.h_remarks
     *
     * @mbg.generated
     */
    public void sethRemarks(String hRemarks) {
        this.hRemarks = hRemarks == null ? null : hRemarks.trim();
    }
}