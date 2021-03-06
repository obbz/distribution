package com.ojp.entity;

import java.util.ArrayList;
import java.util.List;

public class DisTributionpointExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dis_tributionpoint
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dis_tributionpoint
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dis_tributionpoint
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_tributionpoint
     *
     * @mbg.generated
     */
    public DisTributionpointExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_tributionpoint
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_tributionpoint
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_tributionpoint
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_tributionpoint
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_tributionpoint
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_tributionpoint
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_tributionpoint
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_tributionpoint
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_tributionpoint
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_tributionpoint
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table dis_tributionpoint
     *
     * @mbg.generated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andDIdIsNull() {
            addCriterion("d_id is null");
            return (Criteria) this;
        }

        public Criteria andDIdIsNotNull() {
            addCriterion("d_id is not null");
            return (Criteria) this;
        }

        public Criteria andDIdEqualTo(Integer value) {
            addCriterion("d_id =", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotEqualTo(Integer value) {
            addCriterion("d_id <>", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdGreaterThan(Integer value) {
            addCriterion("d_id >", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("d_id >=", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdLessThan(Integer value) {
            addCriterion("d_id <", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdLessThanOrEqualTo(Integer value) {
            addCriterion("d_id <=", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdIn(List<Integer> values) {
            addCriterion("d_id in", values, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotIn(List<Integer> values) {
            addCriterion("d_id not in", values, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdBetween(Integer value1, Integer value2) {
            addCriterion("d_id between", value1, value2, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotBetween(Integer value1, Integer value2) {
            addCriterion("d_id not between", value1, value2, "dId");
            return (Criteria) this;
        }

        public Criteria andDNameIsNull() {
            addCriterion("d_name is null");
            return (Criteria) this;
        }

        public Criteria andDNameIsNotNull() {
            addCriterion("d_name is not null");
            return (Criteria) this;
        }

        public Criteria andDNameEqualTo(String value) {
            addCriterion("d_name =", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameNotEqualTo(String value) {
            addCriterion("d_name <>", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameGreaterThan(String value) {
            addCriterion("d_name >", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameGreaterThanOrEqualTo(String value) {
            addCriterion("d_name >=", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameLessThan(String value) {
            addCriterion("d_name <", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameLessThanOrEqualTo(String value) {
            addCriterion("d_name <=", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameLike(String value) {
            addCriterion("d_name like", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameNotLike(String value) {
            addCriterion("d_name not like", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameIn(List<String> values) {
            addCriterion("d_name in", values, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameNotIn(List<String> values) {
            addCriterion("d_name not in", values, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameBetween(String value1, String value2) {
            addCriterion("d_name between", value1, value2, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameNotBetween(String value1, String value2) {
            addCriterion("d_name not between", value1, value2, "dName");
            return (Criteria) this;
        }

        public Criteria andPIdIsNull() {
            addCriterion("p_id is null");
            return (Criteria) this;
        }

        public Criteria andPIdIsNotNull() {
            addCriterion("p_id is not null");
            return (Criteria) this;
        }

        public Criteria andPIdEqualTo(String value) {
            addCriterion("p_id =", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotEqualTo(String value) {
            addCriterion("p_id <>", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThan(String value) {
            addCriterion("p_id >", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThanOrEqualTo(String value) {
            addCriterion("p_id >=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThan(String value) {
            addCriterion("p_id <", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThanOrEqualTo(String value) {
            addCriterion("p_id <=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLike(String value) {
            addCriterion("p_id like", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotLike(String value) {
            addCriterion("p_id not like", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdIn(List<String> values) {
            addCriterion("p_id in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotIn(List<String> values) {
            addCriterion("p_id not in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdBetween(String value1, String value2) {
            addCriterion("p_id between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotBetween(String value1, String value2) {
            addCriterion("p_id not between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andDisCityIdIsNull() {
            addCriterion("dis_city_id is null");
            return (Criteria) this;
        }

        public Criteria andDisCityIdIsNotNull() {
            addCriterion("dis_city_id is not null");
            return (Criteria) this;
        }

        public Criteria andDisCityIdEqualTo(String value) {
            addCriterion("dis_city_id =", value, "disCityId");
            return (Criteria) this;
        }

        public Criteria andDisCityIdNotEqualTo(String value) {
            addCriterion("dis_city_id <>", value, "disCityId");
            return (Criteria) this;
        }

        public Criteria andDisCityIdGreaterThan(String value) {
            addCriterion("dis_city_id >", value, "disCityId");
            return (Criteria) this;
        }

        public Criteria andDisCityIdGreaterThanOrEqualTo(String value) {
            addCriterion("dis_city_id >=", value, "disCityId");
            return (Criteria) this;
        }

        public Criteria andDisCityIdLessThan(String value) {
            addCriterion("dis_city_id <", value, "disCityId");
            return (Criteria) this;
        }

        public Criteria andDisCityIdLessThanOrEqualTo(String value) {
            addCriterion("dis_city_id <=", value, "disCityId");
            return (Criteria) this;
        }

        public Criteria andDisCityIdLike(String value) {
            addCriterion("dis_city_id like", value, "disCityId");
            return (Criteria) this;
        }

        public Criteria andDisCityIdNotLike(String value) {
            addCriterion("dis_city_id not like", value, "disCityId");
            return (Criteria) this;
        }

        public Criteria andDisCityIdIn(List<String> values) {
            addCriterion("dis_city_id in", values, "disCityId");
            return (Criteria) this;
        }

        public Criteria andDisCityIdNotIn(List<String> values) {
            addCriterion("dis_city_id not in", values, "disCityId");
            return (Criteria) this;
        }

        public Criteria andDisCityIdBetween(String value1, String value2) {
            addCriterion("dis_city_id between", value1, value2, "disCityId");
            return (Criteria) this;
        }

        public Criteria andDisCityIdNotBetween(String value1, String value2) {
            addCriterion("dis_city_id not between", value1, value2, "disCityId");
            return (Criteria) this;
        }

        public Criteria andAIdIsNull() {
            addCriterion("a_id is null");
            return (Criteria) this;
        }

        public Criteria andAIdIsNotNull() {
            addCriterion("a_id is not null");
            return (Criteria) this;
        }

        public Criteria andAIdEqualTo(String value) {
            addCriterion("a_id =", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotEqualTo(String value) {
            addCriterion("a_id <>", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdGreaterThan(String value) {
            addCriterion("a_id >", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdGreaterThanOrEqualTo(String value) {
            addCriterion("a_id >=", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdLessThan(String value) {
            addCriterion("a_id <", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdLessThanOrEqualTo(String value) {
            addCriterion("a_id <=", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdLike(String value) {
            addCriterion("a_id like", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotLike(String value) {
            addCriterion("a_id not like", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdIn(List<String> values) {
            addCriterion("a_id in", values, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotIn(List<String> values) {
            addCriterion("a_id not in", values, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdBetween(String value1, String value2) {
            addCriterion("a_id between", value1, value2, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotBetween(String value1, String value2) {
            addCriterion("a_id not between", value1, value2, "aId");
            return (Criteria) this;
        }

        public Criteria andDPhoneIsNull() {
            addCriterion("d_phone is null");
            return (Criteria) this;
        }

        public Criteria andDPhoneIsNotNull() {
            addCriterion("d_phone is not null");
            return (Criteria) this;
        }

        public Criteria andDPhoneEqualTo(String value) {
            addCriterion("d_phone =", value, "dPhone");
            return (Criteria) this;
        }

        public Criteria andDPhoneNotEqualTo(String value) {
            addCriterion("d_phone <>", value, "dPhone");
            return (Criteria) this;
        }

        public Criteria andDPhoneGreaterThan(String value) {
            addCriterion("d_phone >", value, "dPhone");
            return (Criteria) this;
        }

        public Criteria andDPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("d_phone >=", value, "dPhone");
            return (Criteria) this;
        }

        public Criteria andDPhoneLessThan(String value) {
            addCriterion("d_phone <", value, "dPhone");
            return (Criteria) this;
        }

        public Criteria andDPhoneLessThanOrEqualTo(String value) {
            addCriterion("d_phone <=", value, "dPhone");
            return (Criteria) this;
        }

        public Criteria andDPhoneLike(String value) {
            addCriterion("d_phone like", value, "dPhone");
            return (Criteria) this;
        }

        public Criteria andDPhoneNotLike(String value) {
            addCriterion("d_phone not like", value, "dPhone");
            return (Criteria) this;
        }

        public Criteria andDPhoneIn(List<String> values) {
            addCriterion("d_phone in", values, "dPhone");
            return (Criteria) this;
        }

        public Criteria andDPhoneNotIn(List<String> values) {
            addCriterion("d_phone not in", values, "dPhone");
            return (Criteria) this;
        }

        public Criteria andDPhoneBetween(String value1, String value2) {
            addCriterion("d_phone between", value1, value2, "dPhone");
            return (Criteria) this;
        }

        public Criteria andDPhoneNotBetween(String value1, String value2) {
            addCriterion("d_phone not between", value1, value2, "dPhone");
            return (Criteria) this;
        }

        public Criteria andDPricesIsNull() {
            addCriterion("d_prices is null");
            return (Criteria) this;
        }

        public Criteria andDPricesIsNotNull() {
            addCriterion("d_prices is not null");
            return (Criteria) this;
        }

        public Criteria andDPricesEqualTo(String value) {
            addCriterion("d_prices =", value, "dPrices");
            return (Criteria) this;
        }

        public Criteria andDPricesNotEqualTo(String value) {
            addCriterion("d_prices <>", value, "dPrices");
            return (Criteria) this;
        }

        public Criteria andDPricesGreaterThan(String value) {
            addCriterion("d_prices >", value, "dPrices");
            return (Criteria) this;
        }

        public Criteria andDPricesGreaterThanOrEqualTo(String value) {
            addCriterion("d_prices >=", value, "dPrices");
            return (Criteria) this;
        }

        public Criteria andDPricesLessThan(String value) {
            addCriterion("d_prices <", value, "dPrices");
            return (Criteria) this;
        }

        public Criteria andDPricesLessThanOrEqualTo(String value) {
            addCriterion("d_prices <=", value, "dPrices");
            return (Criteria) this;
        }

        public Criteria andDPricesLike(String value) {
            addCriterion("d_prices like", value, "dPrices");
            return (Criteria) this;
        }

        public Criteria andDPricesNotLike(String value) {
            addCriterion("d_prices not like", value, "dPrices");
            return (Criteria) this;
        }

        public Criteria andDPricesIn(List<String> values) {
            addCriterion("d_prices in", values, "dPrices");
            return (Criteria) this;
        }

        public Criteria andDPricesNotIn(List<String> values) {
            addCriterion("d_prices not in", values, "dPrices");
            return (Criteria) this;
        }

        public Criteria andDPricesBetween(String value1, String value2) {
            addCriterion("d_prices between", value1, value2, "dPrices");
            return (Criteria) this;
        }

        public Criteria andDPricesNotBetween(String value1, String value2) {
            addCriterion("d_prices not between", value1, value2, "dPrices");
            return (Criteria) this;
        }

        public Criteria andDRemarksIsNull() {
            addCriterion("d_remarks is null");
            return (Criteria) this;
        }

        public Criteria andDRemarksIsNotNull() {
            addCriterion("d_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andDRemarksEqualTo(String value) {
            addCriterion("d_remarks =", value, "dRemarks");
            return (Criteria) this;
        }

        public Criteria andDRemarksNotEqualTo(String value) {
            addCriterion("d_remarks <>", value, "dRemarks");
            return (Criteria) this;
        }

        public Criteria andDRemarksGreaterThan(String value) {
            addCriterion("d_remarks >", value, "dRemarks");
            return (Criteria) this;
        }

        public Criteria andDRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("d_remarks >=", value, "dRemarks");
            return (Criteria) this;
        }

        public Criteria andDRemarksLessThan(String value) {
            addCriterion("d_remarks <", value, "dRemarks");
            return (Criteria) this;
        }

        public Criteria andDRemarksLessThanOrEqualTo(String value) {
            addCriterion("d_remarks <=", value, "dRemarks");
            return (Criteria) this;
        }

        public Criteria andDRemarksLike(String value) {
            addCriterion("d_remarks like", value, "dRemarks");
            return (Criteria) this;
        }

        public Criteria andDRemarksNotLike(String value) {
            addCriterion("d_remarks not like", value, "dRemarks");
            return (Criteria) this;
        }

        public Criteria andDRemarksIn(List<String> values) {
            addCriterion("d_remarks in", values, "dRemarks");
            return (Criteria) this;
        }

        public Criteria andDRemarksNotIn(List<String> values) {
            addCriterion("d_remarks not in", values, "dRemarks");
            return (Criteria) this;
        }

        public Criteria andDRemarksBetween(String value1, String value2) {
            addCriterion("d_remarks between", value1, value2, "dRemarks");
            return (Criteria) this;
        }

        public Criteria andDRemarksNotBetween(String value1, String value2) {
            addCriterion("d_remarks not between", value1, value2, "dRemarks");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table dis_tributionpoint
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table dis_tributionpoint
     *
     * @mbg.generated
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}