package com.zyz.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SellExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SellExample() {
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

        public Criteria andSellidIsNull() {
            addCriterion("sellId is null");
            return (Criteria) this;
        }

        public Criteria andSellidIsNotNull() {
            addCriterion("sellId is not null");
            return (Criteria) this;
        }

        public Criteria andSellidEqualTo(Integer value) {
            addCriterion("sellId =", value, "sellid");
            return (Criteria) this;
        }

        public Criteria andSellidNotEqualTo(Integer value) {
            addCriterion("sellId <>", value, "sellid");
            return (Criteria) this;
        }

        public Criteria andSellidGreaterThan(Integer value) {
            addCriterion("sellId >", value, "sellid");
            return (Criteria) this;
        }

        public Criteria andSellidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sellId >=", value, "sellid");
            return (Criteria) this;
        }

        public Criteria andSellidLessThan(Integer value) {
            addCriterion("sellId <", value, "sellid");
            return (Criteria) this;
        }

        public Criteria andSellidLessThanOrEqualTo(Integer value) {
            addCriterion("sellId <=", value, "sellid");
            return (Criteria) this;
        }

        public Criteria andSellidIn(List<Integer> values) {
            addCriterion("sellId in", values, "sellid");
            return (Criteria) this;
        }

        public Criteria andSellidNotIn(List<Integer> values) {
            addCriterion("sellId not in", values, "sellid");
            return (Criteria) this;
        }

        public Criteria andSellidBetween(Integer value1, Integer value2) {
            addCriterion("sellId between", value1, value2, "sellid");
            return (Criteria) this;
        }

        public Criteria andSellidNotBetween(Integer value1, Integer value2) {
            addCriterion("sellId not between", value1, value2, "sellid");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andGoodnameIsNull() {
            addCriterion("goodName is null");
            return (Criteria) this;
        }

        public Criteria andGoodnameIsNotNull() {
            addCriterion("goodName is not null");
            return (Criteria) this;
        }

        public Criteria andGoodnameEqualTo(String value) {
            addCriterion("goodName =", value, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameNotEqualTo(String value) {
            addCriterion("goodName <>", value, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameGreaterThan(String value) {
            addCriterion("goodName >", value, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameGreaterThanOrEqualTo(String value) {
            addCriterion("goodName >=", value, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameLessThan(String value) {
            addCriterion("goodName <", value, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameLessThanOrEqualTo(String value) {
            addCriterion("goodName <=", value, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameLike(String value) {
            addCriterion("goodName like", value, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameNotLike(String value) {
            addCriterion("goodName not like", value, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameIn(List<String> values) {
            addCriterion("goodName in", values, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameNotIn(List<String> values) {
            addCriterion("goodName not in", values, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameBetween(String value1, String value2) {
            addCriterion("goodName between", value1, value2, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameNotBetween(String value1, String value2) {
            addCriterion("goodName not between", value1, value2, "goodname");
            return (Criteria) this;
        }

        public Criteria andSelldateIsNull() {
            addCriterion("sellDate is null");
            return (Criteria) this;
        }

        public Criteria andSelldateIsNotNull() {
            addCriterion("sellDate is not null");
            return (Criteria) this;
        }

        public Criteria andSelldateEqualTo(Date value) {
            addCriterionForJDBCDate("sellDate =", value, "selldate");
            return (Criteria) this;
        }

        public Criteria andSelldateNotEqualTo(Date value) {
            addCriterionForJDBCDate("sellDate <>", value, "selldate");
            return (Criteria) this;
        }

        public Criteria andSelldateGreaterThan(Date value) {
            addCriterionForJDBCDate("sellDate >", value, "selldate");
            return (Criteria) this;
        }

        public Criteria andSelldateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sellDate >=", value, "selldate");
            return (Criteria) this;
        }

        public Criteria andSelldateLessThan(Date value) {
            addCriterionForJDBCDate("sellDate <", value, "selldate");
            return (Criteria) this;
        }

        public Criteria andSelldateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sellDate <=", value, "selldate");
            return (Criteria) this;
        }

        public Criteria andSelldateIn(List<Date> values) {
            addCriterionForJDBCDate("sellDate in", values, "selldate");
            return (Criteria) this;
        }

        public Criteria andSelldateNotIn(List<Date> values) {
            addCriterionForJDBCDate("sellDate not in", values, "selldate");
            return (Criteria) this;
        }

        public Criteria andSelldateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sellDate between", value1, value2, "selldate");
            return (Criteria) this;
        }

        public Criteria andSelldateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sellDate not between", value1, value2, "selldate");
            return (Criteria) this;
        }

        public Criteria andSelldescIsNull() {
            addCriterion("sellDesc is null");
            return (Criteria) this;
        }

        public Criteria andSelldescIsNotNull() {
            addCriterion("sellDesc is not null");
            return (Criteria) this;
        }

        public Criteria andSelldescEqualTo(String value) {
            addCriterion("sellDesc =", value, "selldesc");
            return (Criteria) this;
        }

        public Criteria andSelldescNotEqualTo(String value) {
            addCriterion("sellDesc <>", value, "selldesc");
            return (Criteria) this;
        }

        public Criteria andSelldescGreaterThan(String value) {
            addCriterion("sellDesc >", value, "selldesc");
            return (Criteria) this;
        }

        public Criteria andSelldescGreaterThanOrEqualTo(String value) {
            addCriterion("sellDesc >=", value, "selldesc");
            return (Criteria) this;
        }

        public Criteria andSelldescLessThan(String value) {
            addCriterion("sellDesc <", value, "selldesc");
            return (Criteria) this;
        }

        public Criteria andSelldescLessThanOrEqualTo(String value) {
            addCriterion("sellDesc <=", value, "selldesc");
            return (Criteria) this;
        }

        public Criteria andSelldescLike(String value) {
            addCriterion("sellDesc like", value, "selldesc");
            return (Criteria) this;
        }

        public Criteria andSelldescNotLike(String value) {
            addCriterion("sellDesc not like", value, "selldesc");
            return (Criteria) this;
        }

        public Criteria andSelldescIn(List<String> values) {
            addCriterion("sellDesc in", values, "selldesc");
            return (Criteria) this;
        }

        public Criteria andSelldescNotIn(List<String> values) {
            addCriterion("sellDesc not in", values, "selldesc");
            return (Criteria) this;
        }

        public Criteria andSelldescBetween(String value1, String value2) {
            addCriterion("sellDesc between", value1, value2, "selldesc");
            return (Criteria) this;
        }

        public Criteria andSelldescNotBetween(String value1, String value2) {
            addCriterion("sellDesc not between", value1, value2, "selldesc");
            return (Criteria) this;
        }

        public Criteria andTotalfriceIsNull() {
            addCriterion("totalFrice is null");
            return (Criteria) this;
        }

        public Criteria andTotalfriceIsNotNull() {
            addCriterion("totalFrice is not null");
            return (Criteria) this;
        }

        public Criteria andTotalfriceEqualTo(Float value) {
            addCriterion("totalFrice =", value, "totalfrice");
            return (Criteria) this;
        }

        public Criteria andTotalfriceNotEqualTo(Float value) {
            addCriterion("totalFrice <>", value, "totalfrice");
            return (Criteria) this;
        }

        public Criteria andTotalfriceGreaterThan(Float value) {
            addCriterion("totalFrice >", value, "totalfrice");
            return (Criteria) this;
        }

        public Criteria andTotalfriceGreaterThanOrEqualTo(Float value) {
            addCriterion("totalFrice >=", value, "totalfrice");
            return (Criteria) this;
        }

        public Criteria andTotalfriceLessThan(Float value) {
            addCriterion("totalFrice <", value, "totalfrice");
            return (Criteria) this;
        }

        public Criteria andTotalfriceLessThanOrEqualTo(Float value) {
            addCriterion("totalFrice <=", value, "totalfrice");
            return (Criteria) this;
        }

        public Criteria andTotalfriceIn(List<Float> values) {
            addCriterion("totalFrice in", values, "totalfrice");
            return (Criteria) this;
        }

        public Criteria andTotalfriceNotIn(List<Float> values) {
            addCriterion("totalFrice not in", values, "totalfrice");
            return (Criteria) this;
        }

        public Criteria andTotalfriceBetween(Float value1, Float value2) {
            addCriterion("totalFrice between", value1, value2, "totalfrice");
            return (Criteria) this;
        }

        public Criteria andTotalfriceNotBetween(Float value1, Float value2) {
            addCriterion("totalFrice not between", value1, value2, "totalfrice");
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

        public Criteria andSellnumberIsNull() {
            addCriterion("sellNumber is null");
            return (Criteria) this;
        }

        public Criteria andSellnumberIsNotNull() {
            addCriterion("sellNumber is not null");
            return (Criteria) this;
        }

        public Criteria andSellnumberEqualTo(Integer value) {
            addCriterion("sellNumber =", value, "sellnumber");
            return (Criteria) this;
        }

        public Criteria andSellnumberNotEqualTo(Integer value) {
            addCriterion("sellNumber <>", value, "sellnumber");
            return (Criteria) this;
        }

        public Criteria andSellnumberGreaterThan(Integer value) {
            addCriterion("sellNumber >", value, "sellnumber");
            return (Criteria) this;
        }

        public Criteria andSellnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("sellNumber >=", value, "sellnumber");
            return (Criteria) this;
        }

        public Criteria andSellnumberLessThan(Integer value) {
            addCriterion("sellNumber <", value, "sellnumber");
            return (Criteria) this;
        }

        public Criteria andSellnumberLessThanOrEqualTo(Integer value) {
            addCriterion("sellNumber <=", value, "sellnumber");
            return (Criteria) this;
        }

        public Criteria andSellnumberIn(List<Integer> values) {
            addCriterion("sellNumber in", values, "sellnumber");
            return (Criteria) this;
        }

        public Criteria andSellnumberNotIn(List<Integer> values) {
            addCriterion("sellNumber not in", values, "sellnumber");
            return (Criteria) this;
        }

        public Criteria andSellnumberBetween(Integer value1, Integer value2) {
            addCriterion("sellNumber between", value1, value2, "sellnumber");
            return (Criteria) this;
        }

        public Criteria andSellnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("sellNumber not between", value1, value2, "sellnumber");
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