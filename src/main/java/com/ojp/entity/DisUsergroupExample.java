package com.ojp.entity;

import java.util.ArrayList;
import java.util.List;

public class DisUsergroupExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dis_usergroup
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dis_usergroup
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dis_usergroup
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_usergroup
     *
     * @mbg.generated
     */
    public DisUsergroupExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_usergroup
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_usergroup
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_usergroup
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_usergroup
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_usergroup
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_usergroup
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_usergroup
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
     * This method corresponds to the database table dis_usergroup
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
     * This method corresponds to the database table dis_usergroup
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_usergroup
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
     * This class corresponds to the database table dis_usergroup
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

        public Criteria andUNumberIsNull() {
            addCriterion("u_number is null");
            return (Criteria) this;
        }

        public Criteria andUNumberIsNotNull() {
            addCriterion("u_number is not null");
            return (Criteria) this;
        }

        public Criteria andUNumberEqualTo(String value) {
            addCriterion("u_number =", value, "uNumber");
            return (Criteria) this;
        }

        public Criteria andUNumberNotEqualTo(String value) {
            addCriterion("u_number <>", value, "uNumber");
            return (Criteria) this;
        }

        public Criteria andUNumberGreaterThan(String value) {
            addCriterion("u_number >", value, "uNumber");
            return (Criteria) this;
        }

        public Criteria andUNumberGreaterThanOrEqualTo(String value) {
            addCriterion("u_number >=", value, "uNumber");
            return (Criteria) this;
        }

        public Criteria andUNumberLessThan(String value) {
            addCriterion("u_number <", value, "uNumber");
            return (Criteria) this;
        }

        public Criteria andUNumberLessThanOrEqualTo(String value) {
            addCriterion("u_number <=", value, "uNumber");
            return (Criteria) this;
        }

        public Criteria andUNumberLike(String value) {
            addCriterion("u_number like", value, "uNumber");
            return (Criteria) this;
        }

        public Criteria andUNumberNotLike(String value) {
            addCriterion("u_number not like", value, "uNumber");
            return (Criteria) this;
        }

        public Criteria andUNumberIn(List<String> values) {
            addCriterion("u_number in", values, "uNumber");
            return (Criteria) this;
        }

        public Criteria andUNumberNotIn(List<String> values) {
            addCriterion("u_number not in", values, "uNumber");
            return (Criteria) this;
        }

        public Criteria andUNumberBetween(String value1, String value2) {
            addCriterion("u_number between", value1, value2, "uNumber");
            return (Criteria) this;
        }

        public Criteria andUNumberNotBetween(String value1, String value2) {
            addCriterion("u_number not between", value1, value2, "uNumber");
            return (Criteria) this;
        }

        public Criteria andUNameIsNull() {
            addCriterion("u_name is null");
            return (Criteria) this;
        }

        public Criteria andUNameIsNotNull() {
            addCriterion("u_name is not null");
            return (Criteria) this;
        }

        public Criteria andUNameEqualTo(String value) {
            addCriterion("u_name =", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotEqualTo(String value) {
            addCriterion("u_name <>", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameGreaterThan(String value) {
            addCriterion("u_name >", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameGreaterThanOrEqualTo(String value) {
            addCriterion("u_name >=", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLessThan(String value) {
            addCriterion("u_name <", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLessThanOrEqualTo(String value) {
            addCriterion("u_name <=", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLike(String value) {
            addCriterion("u_name like", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotLike(String value) {
            addCriterion("u_name not like", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameIn(List<String> values) {
            addCriterion("u_name in", values, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotIn(List<String> values) {
            addCriterion("u_name not in", values, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameBetween(String value1, String value2) {
            addCriterion("u_name between", value1, value2, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotBetween(String value1, String value2) {
            addCriterion("u_name not between", value1, value2, "uName");
            return (Criteria) this;
        }

        public Criteria andURemarksIsNull() {
            addCriterion("u_remarks is null");
            return (Criteria) this;
        }

        public Criteria andURemarksIsNotNull() {
            addCriterion("u_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andURemarksEqualTo(String value) {
            addCriterion("u_remarks =", value, "uRemarks");
            return (Criteria) this;
        }

        public Criteria andURemarksNotEqualTo(String value) {
            addCriterion("u_remarks <>", value, "uRemarks");
            return (Criteria) this;
        }

        public Criteria andURemarksGreaterThan(String value) {
            addCriterion("u_remarks >", value, "uRemarks");
            return (Criteria) this;
        }

        public Criteria andURemarksGreaterThanOrEqualTo(String value) {
            addCriterion("u_remarks >=", value, "uRemarks");
            return (Criteria) this;
        }

        public Criteria andURemarksLessThan(String value) {
            addCriterion("u_remarks <", value, "uRemarks");
            return (Criteria) this;
        }

        public Criteria andURemarksLessThanOrEqualTo(String value) {
            addCriterion("u_remarks <=", value, "uRemarks");
            return (Criteria) this;
        }

        public Criteria andURemarksLike(String value) {
            addCriterion("u_remarks like", value, "uRemarks");
            return (Criteria) this;
        }

        public Criteria andURemarksNotLike(String value) {
            addCriterion("u_remarks not like", value, "uRemarks");
            return (Criteria) this;
        }

        public Criteria andURemarksIn(List<String> values) {
            addCriterion("u_remarks in", values, "uRemarks");
            return (Criteria) this;
        }

        public Criteria andURemarksNotIn(List<String> values) {
            addCriterion("u_remarks not in", values, "uRemarks");
            return (Criteria) this;
        }

        public Criteria andURemarksBetween(String value1, String value2) {
            addCriterion("u_remarks between", value1, value2, "uRemarks");
            return (Criteria) this;
        }

        public Criteria andURemarksNotBetween(String value1, String value2) {
            addCriterion("u_remarks not between", value1, value2, "uRemarks");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table dis_usergroup
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
     * This class corresponds to the database table dis_usergroup
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