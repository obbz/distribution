package com.ojp.entity;

import java.util.ArrayList;
import java.util.List;

public class DisTributionscopeExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dis_tributionscope
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dis_tributionscope
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dis_tributionscope
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_tributionscope
     *
     * @mbg.generated
     */
    public DisTributionscopeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_tributionscope
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_tributionscope
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_tributionscope
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_tributionscope
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_tributionscope
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_tributionscope
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_tributionscope
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
     * This method corresponds to the database table dis_tributionscope
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
     * This method corresponds to the database table dis_tributionscope
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_tributionscope
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
     * This class corresponds to the database table dis_tributionscope
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

        public Criteria andDsIdIsNull() {
            addCriterion("ds_id is null");
            return (Criteria) this;
        }

        public Criteria andDsIdIsNotNull() {
            addCriterion("ds_id is not null");
            return (Criteria) this;
        }

        public Criteria andDsIdEqualTo(Integer value) {
            addCriterion("ds_id =", value, "dsId");
            return (Criteria) this;
        }

        public Criteria andDsIdNotEqualTo(Integer value) {
            addCriterion("ds_id <>", value, "dsId");
            return (Criteria) this;
        }

        public Criteria andDsIdGreaterThan(Integer value) {
            addCriterion("ds_id >", value, "dsId");
            return (Criteria) this;
        }

        public Criteria andDsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ds_id >=", value, "dsId");
            return (Criteria) this;
        }

        public Criteria andDsIdLessThan(Integer value) {
            addCriterion("ds_id <", value, "dsId");
            return (Criteria) this;
        }

        public Criteria andDsIdLessThanOrEqualTo(Integer value) {
            addCriterion("ds_id <=", value, "dsId");
            return (Criteria) this;
        }

        public Criteria andDsIdIn(List<Integer> values) {
            addCriterion("ds_id in", values, "dsId");
            return (Criteria) this;
        }

        public Criteria andDsIdNotIn(List<Integer> values) {
            addCriterion("ds_id not in", values, "dsId");
            return (Criteria) this;
        }

        public Criteria andDsIdBetween(Integer value1, Integer value2) {
            addCriterion("ds_id between", value1, value2, "dsId");
            return (Criteria) this;
        }

        public Criteria andDsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ds_id not between", value1, value2, "dsId");
            return (Criteria) this;
        }

        public Criteria andDsNameIsNull() {
            addCriterion("ds_name is null");
            return (Criteria) this;
        }

        public Criteria andDsNameIsNotNull() {
            addCriterion("ds_name is not null");
            return (Criteria) this;
        }

        public Criteria andDsNameEqualTo(String value) {
            addCriterion("ds_name =", value, "dsName");
            return (Criteria) this;
        }

        public Criteria andDsNameNotEqualTo(String value) {
            addCriterion("ds_name <>", value, "dsName");
            return (Criteria) this;
        }

        public Criteria andDsNameGreaterThan(String value) {
            addCriterion("ds_name >", value, "dsName");
            return (Criteria) this;
        }

        public Criteria andDsNameGreaterThanOrEqualTo(String value) {
            addCriterion("ds_name >=", value, "dsName");
            return (Criteria) this;
        }

        public Criteria andDsNameLessThan(String value) {
            addCriterion("ds_name <", value, "dsName");
            return (Criteria) this;
        }

        public Criteria andDsNameLessThanOrEqualTo(String value) {
            addCriterion("ds_name <=", value, "dsName");
            return (Criteria) this;
        }

        public Criteria andDsNameLike(String value) {
            addCriterion("ds_name like", value, "dsName");
            return (Criteria) this;
        }

        public Criteria andDsNameNotLike(String value) {
            addCriterion("ds_name not like", value, "dsName");
            return (Criteria) this;
        }

        public Criteria andDsNameIn(List<String> values) {
            addCriterion("ds_name in", values, "dsName");
            return (Criteria) this;
        }

        public Criteria andDsNameNotIn(List<String> values) {
            addCriterion("ds_name not in", values, "dsName");
            return (Criteria) this;
        }

        public Criteria andDsNameBetween(String value1, String value2) {
            addCriterion("ds_name between", value1, value2, "dsName");
            return (Criteria) this;
        }

        public Criteria andDsNameNotBetween(String value1, String value2) {
            addCriterion("ds_name not between", value1, value2, "dsName");
            return (Criteria) this;
        }

        public Criteria andDsPricesIsNull() {
            addCriterion("ds_prices is null");
            return (Criteria) this;
        }

        public Criteria andDsPricesIsNotNull() {
            addCriterion("ds_prices is not null");
            return (Criteria) this;
        }

        public Criteria andDsPricesEqualTo(Long value) {
            addCriterion("ds_prices =", value, "dsPrices");
            return (Criteria) this;
        }

        public Criteria andDsPricesNotEqualTo(Long value) {
            addCriterion("ds_prices <>", value, "dsPrices");
            return (Criteria) this;
        }

        public Criteria andDsPricesGreaterThan(Long value) {
            addCriterion("ds_prices >", value, "dsPrices");
            return (Criteria) this;
        }

        public Criteria andDsPricesGreaterThanOrEqualTo(Long value) {
            addCriterion("ds_prices >=", value, "dsPrices");
            return (Criteria) this;
        }

        public Criteria andDsPricesLessThan(Long value) {
            addCriterion("ds_prices <", value, "dsPrices");
            return (Criteria) this;
        }

        public Criteria andDsPricesLessThanOrEqualTo(Long value) {
            addCriterion("ds_prices <=", value, "dsPrices");
            return (Criteria) this;
        }

        public Criteria andDsPricesIn(List<Long> values) {
            addCriterion("ds_prices in", values, "dsPrices");
            return (Criteria) this;
        }

        public Criteria andDsPricesNotIn(List<Long> values) {
            addCriterion("ds_prices not in", values, "dsPrices");
            return (Criteria) this;
        }

        public Criteria andDsPricesBetween(Long value1, Long value2) {
            addCriterion("ds_prices between", value1, value2, "dsPrices");
            return (Criteria) this;
        }

        public Criteria andDsPricesNotBetween(Long value1, Long value2) {
            addCriterion("ds_prices not between", value1, value2, "dsPrices");
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

        public Criteria andDsRemarksIsNull() {
            addCriterion("ds_remarks is null");
            return (Criteria) this;
        }

        public Criteria andDsRemarksIsNotNull() {
            addCriterion("ds_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andDsRemarksEqualTo(String value) {
            addCriterion("ds_remarks =", value, "dsRemarks");
            return (Criteria) this;
        }

        public Criteria andDsRemarksNotEqualTo(String value) {
            addCriterion("ds_remarks <>", value, "dsRemarks");
            return (Criteria) this;
        }

        public Criteria andDsRemarksGreaterThan(String value) {
            addCriterion("ds_remarks >", value, "dsRemarks");
            return (Criteria) this;
        }

        public Criteria andDsRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("ds_remarks >=", value, "dsRemarks");
            return (Criteria) this;
        }

        public Criteria andDsRemarksLessThan(String value) {
            addCriterion("ds_remarks <", value, "dsRemarks");
            return (Criteria) this;
        }

        public Criteria andDsRemarksLessThanOrEqualTo(String value) {
            addCriterion("ds_remarks <=", value, "dsRemarks");
            return (Criteria) this;
        }

        public Criteria andDsRemarksLike(String value) {
            addCriterion("ds_remarks like", value, "dsRemarks");
            return (Criteria) this;
        }

        public Criteria andDsRemarksNotLike(String value) {
            addCriterion("ds_remarks not like", value, "dsRemarks");
            return (Criteria) this;
        }

        public Criteria andDsRemarksIn(List<String> values) {
            addCriterion("ds_remarks in", values, "dsRemarks");
            return (Criteria) this;
        }

        public Criteria andDsRemarksNotIn(List<String> values) {
            addCriterion("ds_remarks not in", values, "dsRemarks");
            return (Criteria) this;
        }

        public Criteria andDsRemarksBetween(String value1, String value2) {
            addCriterion("ds_remarks between", value1, value2, "dsRemarks");
            return (Criteria) this;
        }

        public Criteria andDsRemarksNotBetween(String value1, String value2) {
            addCriterion("ds_remarks not between", value1, value2, "dsRemarks");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table dis_tributionscope
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
     * This class corresponds to the database table dis_tributionscope
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