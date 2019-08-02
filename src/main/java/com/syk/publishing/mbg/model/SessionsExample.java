package com.syk.publishing.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class SessionsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SessionsExample() {
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

        public Criteria andSessionIdIsNull() {
            addCriterion("session_id is null");
            return (Criteria) this;
        }

        public Criteria andSessionIdIsNotNull() {
            addCriterion("session_id is not null");
            return (Criteria) this;
        }

        public Criteria andSessionIdEqualTo(Long value) {
            addCriterion("session_id =", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdNotEqualTo(Long value) {
            addCriterion("session_id <>", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdGreaterThan(Long value) {
            addCriterion("session_id >", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdGreaterThanOrEqualTo(Long value) {
            addCriterion("session_id >=", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdLessThan(Long value) {
            addCriterion("session_id <", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdLessThanOrEqualTo(Long value) {
            addCriterion("session_id <=", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdIn(List<Long> values) {
            addCriterion("session_id in", values, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdNotIn(List<Long> values) {
            addCriterion("session_id not in", values, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdBetween(Long value1, Long value2) {
            addCriterion("session_id between", value1, value2, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdNotBetween(Long value1, Long value2) {
            addCriterion("session_id not between", value1, value2, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionnameIsNull() {
            addCriterion("sessionName is null");
            return (Criteria) this;
        }

        public Criteria andSessionnameIsNotNull() {
            addCriterion("sessionName is not null");
            return (Criteria) this;
        }

        public Criteria andSessionnameEqualTo(String value) {
            addCriterion("sessionName =", value, "sessionname");
            return (Criteria) this;
        }

        public Criteria andSessionnameNotEqualTo(String value) {
            addCriterion("sessionName <>", value, "sessionname");
            return (Criteria) this;
        }

        public Criteria andSessionnameGreaterThan(String value) {
            addCriterion("sessionName >", value, "sessionname");
            return (Criteria) this;
        }

        public Criteria andSessionnameGreaterThanOrEqualTo(String value) {
            addCriterion("sessionName >=", value, "sessionname");
            return (Criteria) this;
        }

        public Criteria andSessionnameLessThan(String value) {
            addCriterion("sessionName <", value, "sessionname");
            return (Criteria) this;
        }

        public Criteria andSessionnameLessThanOrEqualTo(String value) {
            addCriterion("sessionName <=", value, "sessionname");
            return (Criteria) this;
        }

        public Criteria andSessionnameLike(String value) {
            addCriterion("sessionName like", value, "sessionname");
            return (Criteria) this;
        }

        public Criteria andSessionnameNotLike(String value) {
            addCriterion("sessionName not like", value, "sessionname");
            return (Criteria) this;
        }

        public Criteria andSessionnameIn(List<String> values) {
            addCriterion("sessionName in", values, "sessionname");
            return (Criteria) this;
        }

        public Criteria andSessionnameNotIn(List<String> values) {
            addCriterion("sessionName not in", values, "sessionname");
            return (Criteria) this;
        }

        public Criteria andSessionnameBetween(String value1, String value2) {
            addCriterion("sessionName between", value1, value2, "sessionname");
            return (Criteria) this;
        }

        public Criteria andSessionnameNotBetween(String value1, String value2) {
            addCriterion("sessionName not between", value1, value2, "sessionname");
            return (Criteria) this;
        }

        public Criteria andSessionImgIdIsNull() {
            addCriterion("session_img_id is null");
            return (Criteria) this;
        }

        public Criteria andSessionImgIdIsNotNull() {
            addCriterion("session_img_id is not null");
            return (Criteria) this;
        }

        public Criteria andSessionImgIdEqualTo(Long value) {
            addCriterion("session_img_id =", value, "sessionImgId");
            return (Criteria) this;
        }

        public Criteria andSessionImgIdNotEqualTo(Long value) {
            addCriterion("session_img_id <>", value, "sessionImgId");
            return (Criteria) this;
        }

        public Criteria andSessionImgIdGreaterThan(Long value) {
            addCriterion("session_img_id >", value, "sessionImgId");
            return (Criteria) this;
        }

        public Criteria andSessionImgIdGreaterThanOrEqualTo(Long value) {
            addCriterion("session_img_id >=", value, "sessionImgId");
            return (Criteria) this;
        }

        public Criteria andSessionImgIdLessThan(Long value) {
            addCriterion("session_img_id <", value, "sessionImgId");
            return (Criteria) this;
        }

        public Criteria andSessionImgIdLessThanOrEqualTo(Long value) {
            addCriterion("session_img_id <=", value, "sessionImgId");
            return (Criteria) this;
        }

        public Criteria andSessionImgIdIn(List<Long> values) {
            addCriterion("session_img_id in", values, "sessionImgId");
            return (Criteria) this;
        }

        public Criteria andSessionImgIdNotIn(List<Long> values) {
            addCriterion("session_img_id not in", values, "sessionImgId");
            return (Criteria) this;
        }

        public Criteria andSessionImgIdBetween(Long value1, Long value2) {
            addCriterion("session_img_id between", value1, value2, "sessionImgId");
            return (Criteria) this;
        }

        public Criteria andSessionImgIdNotBetween(Long value1, Long value2) {
            addCriterion("session_img_id not between", value1, value2, "sessionImgId");
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