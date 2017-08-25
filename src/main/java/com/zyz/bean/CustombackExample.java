package com.zyz.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CustombackExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustombackExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andCbidIsNull() {
            addCriterion("cbId is null");
            return (Criteria) this;
        }

        public Criteria andCbidIsNotNull() {
            addCriterion("cbId is not null");
            return (Criteria) this;
        }

        public Criteria andCbidEqualTo(Integer value) {
            addCriterion("cbId =", value, "cbid");
            return (Criteria) this;
        }

        public Criteria andCbidNotEqualTo(Integer value) {
            addCriterion("cbId <>", value, "cbid");
            return (Criteria) this;
        }

        public Criteria andCbidGreaterThan(Integer value) {
            addCriterion("cbId >", value, "cbid");
            return (Criteria) this;
        }

        public Criteria andCbidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cbId >=", value, "cbid");
            return (Criteria) this;
        }

        public Criteria andCbidLessThan(Integer value) {
            addCriterion("cbId <", value, "cbid");
            return (Criteria) this;
        }

        public Criteria andCbidLessThanOrEqualTo(Integer value) {
            addCriterion("cbId <=", value, "cbid");
            return (Criteria) this;
        }

        public Criteria andCbidIn(List<Integer> values) {
            addCriterion("cbId in", values, "cbid");
            return (Criteria) this;
        }

        public Criteria andCbidNotIn(List<Integer> values) {
            addCriterion("cbId not in", values, "cbid");
            return (Criteria) this;
        }

        public Criteria andCbidBetween(Integer value1, Integer value2) {
            addCriterion("cbId between", value1, value2, "cbid");
            return (Criteria) this;
        }

        public Criteria andCbidNotBetween(Integer value1, Integer value2) {
            addCriterion("cbId not between", value1, value2, "cbid");
            return (Criteria) this;
        }

        public Criteria andBackmessageIsNull() {
            addCriterion("backMessage is null");
            return (Criteria) this;
        }

        public Criteria andBackmessageIsNotNull() {
            addCriterion("backMessage is not null");
            return (Criteria) this;
        }

        public Criteria andBackmessageEqualTo(String value) {
            addCriterion("backMessage =", value, "backmessage");
            return (Criteria) this;
        }

        public Criteria andBackmessageNotEqualTo(String value) {
            addCriterion("backMessage <>", value, "backmessage");
            return (Criteria) this;
        }

        public Criteria andBackmessageGreaterThan(String value) {
            addCriterion("backMessage >", value, "backmessage");
            return (Criteria) this;
        }

        public Criteria andBackmessageGreaterThanOrEqualTo(String value) {
            addCriterion("backMessage >=", value, "backmessage");
            return (Criteria) this;
        }

        public Criteria andBackmessageLessThan(String value) {
            addCriterion("backMessage <", value, "backmessage");
            return (Criteria) this;
        }

        public Criteria andBackmessageLessThanOrEqualTo(String value) {
            addCriterion("backMessage <=", value, "backmessage");
            return (Criteria) this;
        }

        public Criteria andBackmessageLike(String value) {
            addCriterion("backMessage like", value, "backmessage");
            return (Criteria) this;
        }

        public Criteria andBackmessageNotLike(String value) {
            addCriterion("backMessage not like", value, "backmessage");
            return (Criteria) this;
        }

        public Criteria andBackmessageIn(List<String> values) {
            addCriterion("backMessage in", values, "backmessage");
            return (Criteria) this;
        }

        public Criteria andBackmessageNotIn(List<String> values) {
            addCriterion("backMessage not in", values, "backmessage");
            return (Criteria) this;
        }

        public Criteria andBackmessageBetween(String value1, String value2) {
            addCriterion("backMessage between", value1, value2, "backmessage");
            return (Criteria) this;
        }

        public Criteria andBackmessageNotBetween(String value1, String value2) {
            addCriterion("backMessage not between", value1, value2, "backmessage");
            return (Criteria) this;
        }

        public Criteria andCbstateIsNull() {
            addCriterion("cbState is null");
            return (Criteria) this;
        }

        public Criteria andCbstateIsNotNull() {
            addCriterion("cbState is not null");
            return (Criteria) this;
        }

        public Criteria andCbstateEqualTo(String value) {
            addCriterion("cbState =", value, "cbstate");
            return (Criteria) this;
        }

        public Criteria andCbstateNotEqualTo(String value) {
            addCriterion("cbState <>", value, "cbstate");
            return (Criteria) this;
        }

        public Criteria andCbstateGreaterThan(String value) {
            addCriterion("cbState >", value, "cbstate");
            return (Criteria) this;
        }

        public Criteria andCbstateGreaterThanOrEqualTo(String value) {
            addCriterion("cbState >=", value, "cbstate");
            return (Criteria) this;
        }

        public Criteria andCbstateLessThan(String value) {
            addCriterion("cbState <", value, "cbstate");
            return (Criteria) this;
        }

        public Criteria andCbstateLessThanOrEqualTo(String value) {
            addCriterion("cbState <=", value, "cbstate");
            return (Criteria) this;
        }

        public Criteria andCbstateLike(String value) {
            addCriterion("cbState like", value, "cbstate");
            return (Criteria) this;
        }

        public Criteria andCbstateNotLike(String value) {
            addCriterion("cbState not like", value, "cbstate");
            return (Criteria) this;
        }

        public Criteria andCbstateIn(List<String> values) {
            addCriterion("cbState in", values, "cbstate");
            return (Criteria) this;
        }

        public Criteria andCbstateNotIn(List<String> values) {
            addCriterion("cbState not in", values, "cbstate");
            return (Criteria) this;
        }

        public Criteria andCbstateBetween(String value1, String value2) {
            addCriterion("cbState between", value1, value2, "cbstate");
            return (Criteria) this;
        }

        public Criteria andCbstateNotBetween(String value1, String value2) {
            addCriterion("cbState not between", value1, value2, "cbstate");
            return (Criteria) this;
        }

        public Criteria andCbdateIsNull() {
            addCriterion("cbdate is null");
            return (Criteria) this;
        }

        public Criteria andCbdateIsNotNull() {
            addCriterion("cbdate is not null");
            return (Criteria) this;
        }

        public Criteria andCbdateEqualTo(Date value) {
            addCriterionForJDBCDate("cbdate =", value, "cbdate");
            return (Criteria) this;
        }

        public Criteria andCbdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("cbdate <>", value, "cbdate");
            return (Criteria) this;
        }

        public Criteria andCbdateGreaterThan(Date value) {
            addCriterionForJDBCDate("cbdate >", value, "cbdate");
            return (Criteria) this;
        }

        public Criteria andCbdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("cbdate >=", value, "cbdate");
            return (Criteria) this;
        }

        public Criteria andCbdateLessThan(Date value) {
            addCriterionForJDBCDate("cbdate <", value, "cbdate");
            return (Criteria) this;
        }

        public Criteria andCbdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("cbdate <=", value, "cbdate");
            return (Criteria) this;
        }

        public Criteria andCbdateIn(List<Date> values) {
            addCriterionForJDBCDate("cbdate in", values, "cbdate");
            return (Criteria) this;
        }

        public Criteria andCbdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("cbdate not in", values, "cbdate");
            return (Criteria) this;
        }

        public Criteria andCbdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("cbdate between", value1, value2, "cbdate");
            return (Criteria) this;
        }

        public Criteria andCbdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("cbdate not between", value1, value2, "cbdate");
            return (Criteria) this;
        }

        public Criteria andCustomernameIsNull() {
            addCriterion("customerName is null");
            return (Criteria) this;
        }

        public Criteria andCustomernameIsNotNull() {
            addCriterion("customerName is not null");
            return (Criteria) this;
        }

        public Criteria andCustomernameEqualTo(String value) {
            addCriterion("customerName =", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotEqualTo(String value) {
            addCriterion("customerName <>", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameGreaterThan(String value) {
            addCriterion("customerName >", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameGreaterThanOrEqualTo(String value) {
            addCriterion("customerName >=", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLessThan(String value) {
            addCriterion("customerName <", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLessThanOrEqualTo(String value) {
            addCriterion("customerName <=", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLike(String value) {
            addCriterion("customerName like", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotLike(String value) {
            addCriterion("customerName not like", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameIn(List<String> values) {
            addCriterion("customerName in", values, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotIn(List<String> values) {
            addCriterion("customerName not in", values, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameBetween(String value1, String value2) {
            addCriterion("customerName between", value1, value2, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotBetween(String value1, String value2) {
            addCriterion("customerName not between", value1, value2, "customername");
            return (Criteria) this;
        }

        public Criteria andFkuseridIsNull() {
            addCriterion("fkUserid is null");
            return (Criteria) this;
        }

        public Criteria andFkuseridIsNotNull() {
            addCriterion("fkUserid is not null");
            return (Criteria) this;
        }

        public Criteria andFkuseridEqualTo(Integer value) {
            addCriterion("fkUserid =", value, "fkuserid");
            return (Criteria) this;
        }

        public Criteria andFkuseridNotEqualTo(Integer value) {
            addCriterion("fkUserid <>", value, "fkuserid");
            return (Criteria) this;
        }

        public Criteria andFkuseridGreaterThan(Integer value) {
            addCriterion("fkUserid >", value, "fkuserid");
            return (Criteria) this;
        }

        public Criteria andFkuseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("fkUserid >=", value, "fkuserid");
            return (Criteria) this;
        }

        public Criteria andFkuseridLessThan(Integer value) {
            addCriterion("fkUserid <", value, "fkuserid");
            return (Criteria) this;
        }

        public Criteria andFkuseridLessThanOrEqualTo(Integer value) {
            addCriterion("fkUserid <=", value, "fkuserid");
            return (Criteria) this;
        }

        public Criteria andFkuseridIn(List<Integer> values) {
            addCriterion("fkUserid in", values, "fkuserid");
            return (Criteria) this;
        }

        public Criteria andFkuseridNotIn(List<Integer> values) {
            addCriterion("fkUserid not in", values, "fkuserid");
            return (Criteria) this;
        }

        public Criteria andFkuseridBetween(Integer value1, Integer value2) {
            addCriterion("fkUserid between", value1, value2, "fkuserid");
            return (Criteria) this;
        }

        public Criteria andFkuseridNotBetween(Integer value1, Integer value2) {
            addCriterion("fkUserid not between", value1, value2, "fkuserid");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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