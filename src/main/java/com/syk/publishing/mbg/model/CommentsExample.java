package com.syk.publishing.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommentsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentsExample() {
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

        public Criteria andCommentidIsNull() {
            addCriterion("commentID is null");
            return (Criteria) this;
        }

        public Criteria andCommentidIsNotNull() {
            addCriterion("commentID is not null");
            return (Criteria) this;
        }

        public Criteria andCommentidEqualTo(Long value) {
            addCriterion("commentID =", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidNotEqualTo(Long value) {
            addCriterion("commentID <>", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidGreaterThan(Long value) {
            addCriterion("commentID >", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidGreaterThanOrEqualTo(Long value) {
            addCriterion("commentID >=", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidLessThan(Long value) {
            addCriterion("commentID <", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidLessThanOrEqualTo(Long value) {
            addCriterion("commentID <=", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidIn(List<Long> values) {
            addCriterion("commentID in", values, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidNotIn(List<Long> values) {
            addCriterion("commentID not in", values, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidBetween(Long value1, Long value2) {
            addCriterion("commentID between", value1, value2, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidNotBetween(Long value1, Long value2) {
            addCriterion("commentID not between", value1, value2, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentaidIsNull() {
            addCriterion("commentAID is null");
            return (Criteria) this;
        }

        public Criteria andCommentaidIsNotNull() {
            addCriterion("commentAID is not null");
            return (Criteria) this;
        }

        public Criteria andCommentaidEqualTo(Long value) {
            addCriterion("commentAID =", value, "commentaid");
            return (Criteria) this;
        }

        public Criteria andCommentaidNotEqualTo(Long value) {
            addCriterion("commentAID <>", value, "commentaid");
            return (Criteria) this;
        }

        public Criteria andCommentaidGreaterThan(Long value) {
            addCriterion("commentAID >", value, "commentaid");
            return (Criteria) this;
        }

        public Criteria andCommentaidGreaterThanOrEqualTo(Long value) {
            addCriterion("commentAID >=", value, "commentaid");
            return (Criteria) this;
        }

        public Criteria andCommentaidLessThan(Long value) {
            addCriterion("commentAID <", value, "commentaid");
            return (Criteria) this;
        }

        public Criteria andCommentaidLessThanOrEqualTo(Long value) {
            addCriterion("commentAID <=", value, "commentaid");
            return (Criteria) this;
        }

        public Criteria andCommentaidIn(List<Long> values) {
            addCriterion("commentAID in", values, "commentaid");
            return (Criteria) this;
        }

        public Criteria andCommentaidNotIn(List<Long> values) {
            addCriterion("commentAID not in", values, "commentaid");
            return (Criteria) this;
        }

        public Criteria andCommentaidBetween(Long value1, Long value2) {
            addCriterion("commentAID between", value1, value2, "commentaid");
            return (Criteria) this;
        }

        public Criteria andCommentaidNotBetween(Long value1, Long value2) {
            addCriterion("commentAID not between", value1, value2, "commentaid");
            return (Criteria) this;
        }

        public Criteria andCommentuidIsNull() {
            addCriterion("commentUID is null");
            return (Criteria) this;
        }

        public Criteria andCommentuidIsNotNull() {
            addCriterion("commentUID is not null");
            return (Criteria) this;
        }

        public Criteria andCommentuidEqualTo(Long value) {
            addCriterion("commentUID =", value, "commentuid");
            return (Criteria) this;
        }

        public Criteria andCommentuidNotEqualTo(Long value) {
            addCriterion("commentUID <>", value, "commentuid");
            return (Criteria) this;
        }

        public Criteria andCommentuidGreaterThan(Long value) {
            addCriterion("commentUID >", value, "commentuid");
            return (Criteria) this;
        }

        public Criteria andCommentuidGreaterThanOrEqualTo(Long value) {
            addCriterion("commentUID >=", value, "commentuid");
            return (Criteria) this;
        }

        public Criteria andCommentuidLessThan(Long value) {
            addCriterion("commentUID <", value, "commentuid");
            return (Criteria) this;
        }

        public Criteria andCommentuidLessThanOrEqualTo(Long value) {
            addCriterion("commentUID <=", value, "commentuid");
            return (Criteria) this;
        }

        public Criteria andCommentuidIn(List<Long> values) {
            addCriterion("commentUID in", values, "commentuid");
            return (Criteria) this;
        }

        public Criteria andCommentuidNotIn(List<Long> values) {
            addCriterion("commentUID not in", values, "commentuid");
            return (Criteria) this;
        }

        public Criteria andCommentuidBetween(Long value1, Long value2) {
            addCriterion("commentUID between", value1, value2, "commentuid");
            return (Criteria) this;
        }

        public Criteria andCommentuidNotBetween(Long value1, Long value2) {
            addCriterion("commentUID not between", value1, value2, "commentuid");
            return (Criteria) this;
        }

        public Criteria andCommenttimeIsNull() {
            addCriterion("commentTIme is null");
            return (Criteria) this;
        }

        public Criteria andCommenttimeIsNotNull() {
            addCriterion("commentTIme is not null");
            return (Criteria) this;
        }

        public Criteria andCommenttimeEqualTo(Date value) {
            addCriterion("commentTIme =", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeNotEqualTo(Date value) {
            addCriterion("commentTIme <>", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeGreaterThan(Date value) {
            addCriterion("commentTIme >", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("commentTIme >=", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeLessThan(Date value) {
            addCriterion("commentTIme <", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeLessThanOrEqualTo(Date value) {
            addCriterion("commentTIme <=", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeIn(List<Date> values) {
            addCriterion("commentTIme in", values, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeNotIn(List<Date> values) {
            addCriterion("commentTIme not in", values, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeBetween(Date value1, Date value2) {
            addCriterion("commentTIme between", value1, value2, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeNotBetween(Date value1, Date value2) {
            addCriterion("commentTIme not between", value1, value2, "commenttime");
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