package com.zyz.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerExample() {
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

        public Criteria andCusidIsNull() {
            addCriterion("cusId is null");
            return (Criteria) this;
        }

        public Criteria andCusidIsNotNull() {
            addCriterion("cusId is not null");
            return (Criteria) this;
        }

        public Criteria andCusidEqualTo(Integer value) {
            addCriterion("cusId =", value, "cusid");
            return (Criteria) this;
        }

        public Criteria andCusidNotEqualTo(Integer value) {
            addCriterion("cusId <>", value, "cusid");
            return (Criteria) this;
        }

        public Criteria andCusidGreaterThan(Integer value) {
            addCriterion("cusId >", value, "cusid");
            return (Criteria) this;
        }

        public Criteria andCusidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cusId >=", value, "cusid");
            return (Criteria) this;
        }

        public Criteria andCusidLessThan(Integer value) {
            addCriterion("cusId <", value, "cusid");
            return (Criteria) this;
        }

        public Criteria andCusidLessThanOrEqualTo(Integer value) {
            addCriterion("cusId <=", value, "cusid");
            return (Criteria) this;
        }

        public Criteria andCusidIn(List<Integer> values) {
            addCriterion("cusId in", values, "cusid");
            return (Criteria) this;
        }

        public Criteria andCusidNotIn(List<Integer> values) {
            addCriterion("cusId not in", values, "cusid");
            return (Criteria) this;
        }

        public Criteria andCusidBetween(Integer value1, Integer value2) {
            addCriterion("cusId between", value1, value2, "cusid");
            return (Criteria) this;
        }

        public Criteria andCusidNotBetween(Integer value1, Integer value2) {
            addCriterion("cusId not between", value1, value2, "cusid");
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

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andCusdescIsNull() {
            addCriterion("cusDesc is null");
            return (Criteria) this;
        }

        public Criteria andCusdescIsNotNull() {
            addCriterion("cusDesc is not null");
            return (Criteria) this;
        }

        public Criteria andCusdescEqualTo(String value) {
            addCriterion("cusDesc =", value, "cusdesc");
            return (Criteria) this;
        }

        public Criteria andCusdescNotEqualTo(String value) {
            addCriterion("cusDesc <>", value, "cusdesc");
            return (Criteria) this;
        }

        public Criteria andCusdescGreaterThan(String value) {
            addCriterion("cusDesc >", value, "cusdesc");
            return (Criteria) this;
        }

        public Criteria andCusdescGreaterThanOrEqualTo(String value) {
            addCriterion("cusDesc >=", value, "cusdesc");
            return (Criteria) this;
        }

        public Criteria andCusdescLessThan(String value) {
            addCriterion("cusDesc <", value, "cusdesc");
            return (Criteria) this;
        }

        public Criteria andCusdescLessThanOrEqualTo(String value) {
            addCriterion("cusDesc <=", value, "cusdesc");
            return (Criteria) this;
        }

        public Criteria andCusdescLike(String value) {
            addCriterion("cusDesc like", value, "cusdesc");
            return (Criteria) this;
        }

        public Criteria andCusdescNotLike(String value) {
            addCriterion("cusDesc not like", value, "cusdesc");
            return (Criteria) this;
        }

        public Criteria andCusdescIn(List<String> values) {
            addCriterion("cusDesc in", values, "cusdesc");
            return (Criteria) this;
        }

        public Criteria andCusdescNotIn(List<String> values) {
            addCriterion("cusDesc not in", values, "cusdesc");
            return (Criteria) this;
        }

        public Criteria andCusdescBetween(String value1, String value2) {
            addCriterion("cusDesc between", value1, value2, "cusdesc");
            return (Criteria) this;
        }

        public Criteria andCusdescNotBetween(String value1, String value2) {
            addCriterion("cusDesc not between", value1, value2, "cusdesc");
            return (Criteria) this;
        }

        public Criteria andHobbyIsNull() {
            addCriterion("hobby is null");
            return (Criteria) this;
        }

        public Criteria andHobbyIsNotNull() {
            addCriterion("hobby is not null");
            return (Criteria) this;
        }

        public Criteria andHobbyEqualTo(String value) {
            addCriterion("hobby =", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyNotEqualTo(String value) {
            addCriterion("hobby <>", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyGreaterThan(String value) {
            addCriterion("hobby >", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyGreaterThanOrEqualTo(String value) {
            addCriterion("hobby >=", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyLessThan(String value) {
            addCriterion("hobby <", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyLessThanOrEqualTo(String value) {
            addCriterion("hobby <=", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyLike(String value) {
            addCriterion("hobby like", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyNotLike(String value) {
            addCriterion("hobby not like", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyIn(List<String> values) {
            addCriterion("hobby in", values, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyNotIn(List<String> values) {
            addCriterion("hobby not in", values, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyBetween(String value1, String value2) {
            addCriterion("hobby between", value1, value2, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyNotBetween(String value1, String value2) {
            addCriterion("hobby not between", value1, value2, "hobby");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNull() {
            addCriterion("idcard is null");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNotNull() {
            addCriterion("idcard is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardEqualTo(String value) {
            addCriterion("idcard =", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotEqualTo(String value) {
            addCriterion("idcard <>", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThan(String value) {
            addCriterion("idcard >", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("idcard >=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThan(String value) {
            addCriterion("idcard <", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThanOrEqualTo(String value) {
            addCriterion("idcard <=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLike(String value) {
            addCriterion("idcard like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotLike(String value) {
            addCriterion("idcard not like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardIn(List<String> values) {
            addCriterion("idcard in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotIn(List<String> values) {
            addCriterion("idcard not in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardBetween(String value1, String value2) {
            addCriterion("idcard between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotBetween(String value1, String value2) {
            addCriterion("idcard not between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNull() {
            addCriterion("realName is null");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNotNull() {
            addCriterion("realName is not null");
            return (Criteria) this;
        }

        public Criteria andRealnameEqualTo(String value) {
            addCriterion("realName =", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotEqualTo(String value) {
            addCriterion("realName <>", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThan(String value) {
            addCriterion("realName >", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThanOrEqualTo(String value) {
            addCriterion("realName >=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThan(String value) {
            addCriterion("realName <", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThanOrEqualTo(String value) {
            addCriterion("realName <=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLike(String value) {
            addCriterion("realName like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotLike(String value) {
            addCriterion("realName not like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameIn(List<String> values) {
            addCriterion("realName in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotIn(List<String> values) {
            addCriterion("realName not in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameBetween(String value1, String value2) {
            addCriterion("realName between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotBetween(String value1, String value2) {
            addCriterion("realName not between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andWorkIsNull() {
            addCriterion("work is null");
            return (Criteria) this;
        }

        public Criteria andWorkIsNotNull() {
            addCriterion("work is not null");
            return (Criteria) this;
        }

        public Criteria andWorkEqualTo(String value) {
            addCriterion("work =", value, "work");
            return (Criteria) this;
        }

        public Criteria andWorkNotEqualTo(String value) {
            addCriterion("work <>", value, "work");
            return (Criteria) this;
        }

        public Criteria andWorkGreaterThan(String value) {
            addCriterion("work >", value, "work");
            return (Criteria) this;
        }

        public Criteria andWorkGreaterThanOrEqualTo(String value) {
            addCriterion("work >=", value, "work");
            return (Criteria) this;
        }

        public Criteria andWorkLessThan(String value) {
            addCriterion("work <", value, "work");
            return (Criteria) this;
        }

        public Criteria andWorkLessThanOrEqualTo(String value) {
            addCriterion("work <=", value, "work");
            return (Criteria) this;
        }

        public Criteria andWorkLike(String value) {
            addCriterion("work like", value, "work");
            return (Criteria) this;
        }

        public Criteria andWorkNotLike(String value) {
            addCriterion("work not like", value, "work");
            return (Criteria) this;
        }

        public Criteria andWorkIn(List<String> values) {
            addCriterion("work in", values, "work");
            return (Criteria) this;
        }

        public Criteria andWorkNotIn(List<String> values) {
            addCriterion("work not in", values, "work");
            return (Criteria) this;
        }

        public Criteria andWorkBetween(String value1, String value2) {
            addCriterion("work between", value1, value2, "work");
            return (Criteria) this;
        }

        public Criteria andWorkNotBetween(String value1, String value2) {
            addCriterion("work not between", value1, value2, "work");
            return (Criteria) this;
        }

        public Criteria andFktypeidIsNull() {
            addCriterion("fkTypeId is null");
            return (Criteria) this;
        }

        public Criteria andFktypeidIsNotNull() {
            addCriterion("fkTypeId is not null");
            return (Criteria) this;
        }

        public Criteria andFktypeidEqualTo(Integer value) {
            addCriterion("fkTypeId =", value, "fktypeid");
            return (Criteria) this;
        }

        public Criteria andFktypeidNotEqualTo(Integer value) {
            addCriterion("fkTypeId <>", value, "fktypeid");
            return (Criteria) this;
        }

        public Criteria andFktypeidGreaterThan(Integer value) {
            addCriterion("fkTypeId >", value, "fktypeid");
            return (Criteria) this;
        }

        public Criteria andFktypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("fkTypeId >=", value, "fktypeid");
            return (Criteria) this;
        }

        public Criteria andFktypeidLessThan(Integer value) {
            addCriterion("fkTypeId <", value, "fktypeid");
            return (Criteria) this;
        }

        public Criteria andFktypeidLessThanOrEqualTo(Integer value) {
            addCriterion("fkTypeId <=", value, "fktypeid");
            return (Criteria) this;
        }

        public Criteria andFktypeidIn(List<Integer> values) {
            addCriterion("fkTypeId in", values, "fktypeid");
            return (Criteria) this;
        }

        public Criteria andFktypeidNotIn(List<Integer> values) {
            addCriterion("fkTypeId not in", values, "fktypeid");
            return (Criteria) this;
        }

        public Criteria andFktypeidBetween(Integer value1, Integer value2) {
            addCriterion("fkTypeId between", value1, value2, "fktypeid");
            return (Criteria) this;
        }

        public Criteria andFktypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("fkTypeId not between", value1, value2, "fktypeid");
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