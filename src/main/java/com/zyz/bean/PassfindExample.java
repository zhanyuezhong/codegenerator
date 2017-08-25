package com.zyz.bean;

import java.util.ArrayList;
import java.util.List;

public class PassfindExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PassfindExample() {
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

        public Criteria andPfidIsNull() {
            addCriterion("pfId is null");
            return (Criteria) this;
        }

        public Criteria andPfidIsNotNull() {
            addCriterion("pfId is not null");
            return (Criteria) this;
        }

        public Criteria andPfidEqualTo(Integer value) {
            addCriterion("pfId =", value, "pfid");
            return (Criteria) this;
        }

        public Criteria andPfidNotEqualTo(Integer value) {
            addCriterion("pfId <>", value, "pfid");
            return (Criteria) this;
        }

        public Criteria andPfidGreaterThan(Integer value) {
            addCriterion("pfId >", value, "pfid");
            return (Criteria) this;
        }

        public Criteria andPfidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pfId >=", value, "pfid");
            return (Criteria) this;
        }

        public Criteria andPfidLessThan(Integer value) {
            addCriterion("pfId <", value, "pfid");
            return (Criteria) this;
        }

        public Criteria andPfidLessThanOrEqualTo(Integer value) {
            addCriterion("pfId <=", value, "pfid");
            return (Criteria) this;
        }

        public Criteria andPfidIn(List<Integer> values) {
            addCriterion("pfId in", values, "pfid");
            return (Criteria) this;
        }

        public Criteria andPfidNotIn(List<Integer> values) {
            addCriterion("pfId not in", values, "pfid");
            return (Criteria) this;
        }

        public Criteria andPfidBetween(Integer value1, Integer value2) {
            addCriterion("pfId between", value1, value2, "pfid");
            return (Criteria) this;
        }

        public Criteria andPfidNotBetween(Integer value1, Integer value2) {
            addCriterion("pfId not between", value1, value2, "pfid");
            return (Criteria) this;
        }

        public Criteria andAnswer1IsNull() {
            addCriterion("answer1 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer1IsNotNull() {
            addCriterion("answer1 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer1EqualTo(String value) {
            addCriterion("answer1 =", value, "answer1");
            return (Criteria) this;
        }

        public Criteria andAnswer1NotEqualTo(String value) {
            addCriterion("answer1 <>", value, "answer1");
            return (Criteria) this;
        }

        public Criteria andAnswer1GreaterThan(String value) {
            addCriterion("answer1 >", value, "answer1");
            return (Criteria) this;
        }

        public Criteria andAnswer1GreaterThanOrEqualTo(String value) {
            addCriterion("answer1 >=", value, "answer1");
            return (Criteria) this;
        }

        public Criteria andAnswer1LessThan(String value) {
            addCriterion("answer1 <", value, "answer1");
            return (Criteria) this;
        }

        public Criteria andAnswer1LessThanOrEqualTo(String value) {
            addCriterion("answer1 <=", value, "answer1");
            return (Criteria) this;
        }

        public Criteria andAnswer1Like(String value) {
            addCriterion("answer1 like", value, "answer1");
            return (Criteria) this;
        }

        public Criteria andAnswer1NotLike(String value) {
            addCriterion("answer1 not like", value, "answer1");
            return (Criteria) this;
        }

        public Criteria andAnswer1In(List<String> values) {
            addCriterion("answer1 in", values, "answer1");
            return (Criteria) this;
        }

        public Criteria andAnswer1NotIn(List<String> values) {
            addCriterion("answer1 not in", values, "answer1");
            return (Criteria) this;
        }

        public Criteria andAnswer1Between(String value1, String value2) {
            addCriterion("answer1 between", value1, value2, "answer1");
            return (Criteria) this;
        }

        public Criteria andAnswer1NotBetween(String value1, String value2) {
            addCriterion("answer1 not between", value1, value2, "answer1");
            return (Criteria) this;
        }

        public Criteria andAnswer2IsNull() {
            addCriterion("answer2 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer2IsNotNull() {
            addCriterion("answer2 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer2EqualTo(String value) {
            addCriterion("answer2 =", value, "answer2");
            return (Criteria) this;
        }

        public Criteria andAnswer2NotEqualTo(String value) {
            addCriterion("answer2 <>", value, "answer2");
            return (Criteria) this;
        }

        public Criteria andAnswer2GreaterThan(String value) {
            addCriterion("answer2 >", value, "answer2");
            return (Criteria) this;
        }

        public Criteria andAnswer2GreaterThanOrEqualTo(String value) {
            addCriterion("answer2 >=", value, "answer2");
            return (Criteria) this;
        }

        public Criteria andAnswer2LessThan(String value) {
            addCriterion("answer2 <", value, "answer2");
            return (Criteria) this;
        }

        public Criteria andAnswer2LessThanOrEqualTo(String value) {
            addCriterion("answer2 <=", value, "answer2");
            return (Criteria) this;
        }

        public Criteria andAnswer2Like(String value) {
            addCriterion("answer2 like", value, "answer2");
            return (Criteria) this;
        }

        public Criteria andAnswer2NotLike(String value) {
            addCriterion("answer2 not like", value, "answer2");
            return (Criteria) this;
        }

        public Criteria andAnswer2In(List<String> values) {
            addCriterion("answer2 in", values, "answer2");
            return (Criteria) this;
        }

        public Criteria andAnswer2NotIn(List<String> values) {
            addCriterion("answer2 not in", values, "answer2");
            return (Criteria) this;
        }

        public Criteria andAnswer2Between(String value1, String value2) {
            addCriterion("answer2 between", value1, value2, "answer2");
            return (Criteria) this;
        }

        public Criteria andAnswer2NotBetween(String value1, String value2) {
            addCriterion("answer2 not between", value1, value2, "answer2");
            return (Criteria) this;
        }

        public Criteria andQuestion1IsNull() {
            addCriterion("question1 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion1IsNotNull() {
            addCriterion("question1 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion1EqualTo(String value) {
            addCriterion("question1 =", value, "question1");
            return (Criteria) this;
        }

        public Criteria andQuestion1NotEqualTo(String value) {
            addCriterion("question1 <>", value, "question1");
            return (Criteria) this;
        }

        public Criteria andQuestion1GreaterThan(String value) {
            addCriterion("question1 >", value, "question1");
            return (Criteria) this;
        }

        public Criteria andQuestion1GreaterThanOrEqualTo(String value) {
            addCriterion("question1 >=", value, "question1");
            return (Criteria) this;
        }

        public Criteria andQuestion1LessThan(String value) {
            addCriterion("question1 <", value, "question1");
            return (Criteria) this;
        }

        public Criteria andQuestion1LessThanOrEqualTo(String value) {
            addCriterion("question1 <=", value, "question1");
            return (Criteria) this;
        }

        public Criteria andQuestion1Like(String value) {
            addCriterion("question1 like", value, "question1");
            return (Criteria) this;
        }

        public Criteria andQuestion1NotLike(String value) {
            addCriterion("question1 not like", value, "question1");
            return (Criteria) this;
        }

        public Criteria andQuestion1In(List<String> values) {
            addCriterion("question1 in", values, "question1");
            return (Criteria) this;
        }

        public Criteria andQuestion1NotIn(List<String> values) {
            addCriterion("question1 not in", values, "question1");
            return (Criteria) this;
        }

        public Criteria andQuestion1Between(String value1, String value2) {
            addCriterion("question1 between", value1, value2, "question1");
            return (Criteria) this;
        }

        public Criteria andQuestion1NotBetween(String value1, String value2) {
            addCriterion("question1 not between", value1, value2, "question1");
            return (Criteria) this;
        }

        public Criteria andQuestion2IsNull() {
            addCriterion("question2 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion2IsNotNull() {
            addCriterion("question2 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion2EqualTo(String value) {
            addCriterion("question2 =", value, "question2");
            return (Criteria) this;
        }

        public Criteria andQuestion2NotEqualTo(String value) {
            addCriterion("question2 <>", value, "question2");
            return (Criteria) this;
        }

        public Criteria andQuestion2GreaterThan(String value) {
            addCriterion("question2 >", value, "question2");
            return (Criteria) this;
        }

        public Criteria andQuestion2GreaterThanOrEqualTo(String value) {
            addCriterion("question2 >=", value, "question2");
            return (Criteria) this;
        }

        public Criteria andQuestion2LessThan(String value) {
            addCriterion("question2 <", value, "question2");
            return (Criteria) this;
        }

        public Criteria andQuestion2LessThanOrEqualTo(String value) {
            addCriterion("question2 <=", value, "question2");
            return (Criteria) this;
        }

        public Criteria andQuestion2Like(String value) {
            addCriterion("question2 like", value, "question2");
            return (Criteria) this;
        }

        public Criteria andQuestion2NotLike(String value) {
            addCriterion("question2 not like", value, "question2");
            return (Criteria) this;
        }

        public Criteria andQuestion2In(List<String> values) {
            addCriterion("question2 in", values, "question2");
            return (Criteria) this;
        }

        public Criteria andQuestion2NotIn(List<String> values) {
            addCriterion("question2 not in", values, "question2");
            return (Criteria) this;
        }

        public Criteria andQuestion2Between(String value1, String value2) {
            addCriterion("question2 between", value1, value2, "question2");
            return (Criteria) this;
        }

        public Criteria andQuestion2NotBetween(String value1, String value2) {
            addCriterion("question2 not between", value1, value2, "question2");
            return (Criteria) this;
        }

        public Criteria andFkuseridIsNull() {
            addCriterion("fkUserId is null");
            return (Criteria) this;
        }

        public Criteria andFkuseridIsNotNull() {
            addCriterion("fkUserId is not null");
            return (Criteria) this;
        }

        public Criteria andFkuseridEqualTo(Integer value) {
            addCriterion("fkUserId =", value, "fkuserid");
            return (Criteria) this;
        }

        public Criteria andFkuseridNotEqualTo(Integer value) {
            addCriterion("fkUserId <>", value, "fkuserid");
            return (Criteria) this;
        }

        public Criteria andFkuseridGreaterThan(Integer value) {
            addCriterion("fkUserId >", value, "fkuserid");
            return (Criteria) this;
        }

        public Criteria andFkuseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("fkUserId >=", value, "fkuserid");
            return (Criteria) this;
        }

        public Criteria andFkuseridLessThan(Integer value) {
            addCriterion("fkUserId <", value, "fkuserid");
            return (Criteria) this;
        }

        public Criteria andFkuseridLessThanOrEqualTo(Integer value) {
            addCriterion("fkUserId <=", value, "fkuserid");
            return (Criteria) this;
        }

        public Criteria andFkuseridIn(List<Integer> values) {
            addCriterion("fkUserId in", values, "fkuserid");
            return (Criteria) this;
        }

        public Criteria andFkuseridNotIn(List<Integer> values) {
            addCriterion("fkUserId not in", values, "fkuserid");
            return (Criteria) this;
        }

        public Criteria andFkuseridBetween(Integer value1, Integer value2) {
            addCriterion("fkUserId between", value1, value2, "fkuserid");
            return (Criteria) this;
        }

        public Criteria andFkuseridNotBetween(Integer value1, Integer value2) {
            addCriterion("fkUserId not between", value1, value2, "fkuserid");
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