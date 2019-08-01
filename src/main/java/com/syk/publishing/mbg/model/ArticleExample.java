package com.syk.publishing.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArticleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArticleExample() {
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

        public Criteria andArticleidIsNull() {
            addCriterion("articleId is null");
            return (Criteria) this;
        }

        public Criteria andArticleidIsNotNull() {
            addCriterion("articleId is not null");
            return (Criteria) this;
        }

        public Criteria andArticleidEqualTo(Long value) {
            addCriterion("articleId =", value, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidNotEqualTo(Long value) {
            addCriterion("articleId <>", value, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidGreaterThan(Long value) {
            addCriterion("articleId >", value, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidGreaterThanOrEqualTo(Long value) {
            addCriterion("articleId >=", value, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidLessThan(Long value) {
            addCriterion("articleId <", value, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidLessThanOrEqualTo(Long value) {
            addCriterion("articleId <=", value, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidIn(List<Long> values) {
            addCriterion("articleId in", values, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidNotIn(List<Long> values) {
            addCriterion("articleId not in", values, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidBetween(Long value1, Long value2) {
            addCriterion("articleId between", value1, value2, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidNotBetween(Long value1, Long value2) {
            addCriterion("articleId not between", value1, value2, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticlesessionidIsNull() {
            addCriterion("articleSessionId is null");
            return (Criteria) this;
        }

        public Criteria andArticlesessionidIsNotNull() {
            addCriterion("articleSessionId is not null");
            return (Criteria) this;
        }

        public Criteria andArticlesessionidEqualTo(Long value) {
            addCriterion("articleSessionId =", value, "articlesessionid");
            return (Criteria) this;
        }

        public Criteria andArticlesessionidNotEqualTo(Long value) {
            addCriterion("articleSessionId <>", value, "articlesessionid");
            return (Criteria) this;
        }

        public Criteria andArticlesessionidGreaterThan(Long value) {
            addCriterion("articleSessionId >", value, "articlesessionid");
            return (Criteria) this;
        }

        public Criteria andArticlesessionidGreaterThanOrEqualTo(Long value) {
            addCriterion("articleSessionId >=", value, "articlesessionid");
            return (Criteria) this;
        }

        public Criteria andArticlesessionidLessThan(Long value) {
            addCriterion("articleSessionId <", value, "articlesessionid");
            return (Criteria) this;
        }

        public Criteria andArticlesessionidLessThanOrEqualTo(Long value) {
            addCriterion("articleSessionId <=", value, "articlesessionid");
            return (Criteria) this;
        }

        public Criteria andArticlesessionidIn(List<Long> values) {
            addCriterion("articleSessionId in", values, "articlesessionid");
            return (Criteria) this;
        }

        public Criteria andArticlesessionidNotIn(List<Long> values) {
            addCriterion("articleSessionId not in", values, "articlesessionid");
            return (Criteria) this;
        }

        public Criteria andArticlesessionidBetween(Long value1, Long value2) {
            addCriterion("articleSessionId between", value1, value2, "articlesessionid");
            return (Criteria) this;
        }

        public Criteria andArticlesessionidNotBetween(Long value1, Long value2) {
            addCriterion("articleSessionId not between", value1, value2, "articlesessionid");
            return (Criteria) this;
        }

        public Criteria andArticleuseridIsNull() {
            addCriterion("articleUserId is null");
            return (Criteria) this;
        }

        public Criteria andArticleuseridIsNotNull() {
            addCriterion("articleUserId is not null");
            return (Criteria) this;
        }

        public Criteria andArticleuseridEqualTo(Long value) {
            addCriterion("articleUserId =", value, "articleuserid");
            return (Criteria) this;
        }

        public Criteria andArticleuseridNotEqualTo(Long value) {
            addCriterion("articleUserId <>", value, "articleuserid");
            return (Criteria) this;
        }

        public Criteria andArticleuseridGreaterThan(Long value) {
            addCriterion("articleUserId >", value, "articleuserid");
            return (Criteria) this;
        }

        public Criteria andArticleuseridGreaterThanOrEqualTo(Long value) {
            addCriterion("articleUserId >=", value, "articleuserid");
            return (Criteria) this;
        }

        public Criteria andArticleuseridLessThan(Long value) {
            addCriterion("articleUserId <", value, "articleuserid");
            return (Criteria) this;
        }

        public Criteria andArticleuseridLessThanOrEqualTo(Long value) {
            addCriterion("articleUserId <=", value, "articleuserid");
            return (Criteria) this;
        }

        public Criteria andArticleuseridIn(List<Long> values) {
            addCriterion("articleUserId in", values, "articleuserid");
            return (Criteria) this;
        }

        public Criteria andArticleuseridNotIn(List<Long> values) {
            addCriterion("articleUserId not in", values, "articleuserid");
            return (Criteria) this;
        }

        public Criteria andArticleuseridBetween(Long value1, Long value2) {
            addCriterion("articleUserId between", value1, value2, "articleuserid");
            return (Criteria) this;
        }

        public Criteria andArticleuseridNotBetween(Long value1, Long value2) {
            addCriterion("articleUserId not between", value1, value2, "articleuserid");
            return (Criteria) this;
        }

        public Criteria andArticletitleIsNull() {
            addCriterion("articleTitle is null");
            return (Criteria) this;
        }

        public Criteria andArticletitleIsNotNull() {
            addCriterion("articleTitle is not null");
            return (Criteria) this;
        }

        public Criteria andArticletitleEqualTo(String value) {
            addCriterion("articleTitle =", value, "articletitle");
            return (Criteria) this;
        }

        public Criteria andArticletitleNotEqualTo(String value) {
            addCriterion("articleTitle <>", value, "articletitle");
            return (Criteria) this;
        }

        public Criteria andArticletitleGreaterThan(String value) {
            addCriterion("articleTitle >", value, "articletitle");
            return (Criteria) this;
        }

        public Criteria andArticletitleGreaterThanOrEqualTo(String value) {
            addCriterion("articleTitle >=", value, "articletitle");
            return (Criteria) this;
        }

        public Criteria andArticletitleLessThan(String value) {
            addCriterion("articleTitle <", value, "articletitle");
            return (Criteria) this;
        }

        public Criteria andArticletitleLessThanOrEqualTo(String value) {
            addCriterion("articleTitle <=", value, "articletitle");
            return (Criteria) this;
        }

        public Criteria andArticletitleLike(String value) {
            addCriterion("articleTitle like", value, "articletitle");
            return (Criteria) this;
        }

        public Criteria andArticletitleNotLike(String value) {
            addCriterion("articleTitle not like", value, "articletitle");
            return (Criteria) this;
        }

        public Criteria andArticletitleIn(List<String> values) {
            addCriterion("articleTitle in", values, "articletitle");
            return (Criteria) this;
        }

        public Criteria andArticletitleNotIn(List<String> values) {
            addCriterion("articleTitle not in", values, "articletitle");
            return (Criteria) this;
        }

        public Criteria andArticletitleBetween(String value1, String value2) {
            addCriterion("articleTitle between", value1, value2, "articletitle");
            return (Criteria) this;
        }

        public Criteria andArticletitleNotBetween(String value1, String value2) {
            addCriterion("articleTitle not between", value1, value2, "articletitle");
            return (Criteria) this;
        }

        public Criteria andArticletimeIsNull() {
            addCriterion("articleTime is null");
            return (Criteria) this;
        }

        public Criteria andArticletimeIsNotNull() {
            addCriterion("articleTime is not null");
            return (Criteria) this;
        }

        public Criteria andArticletimeEqualTo(Date value) {
            addCriterion("articleTime =", value, "articletime");
            return (Criteria) this;
        }

        public Criteria andArticletimeNotEqualTo(Date value) {
            addCriterion("articleTime <>", value, "articletime");
            return (Criteria) this;
        }

        public Criteria andArticletimeGreaterThan(Date value) {
            addCriterion("articleTime >", value, "articletime");
            return (Criteria) this;
        }

        public Criteria andArticletimeGreaterThanOrEqualTo(Date value) {
            addCriterion("articleTime >=", value, "articletime");
            return (Criteria) this;
        }

        public Criteria andArticletimeLessThan(Date value) {
            addCriterion("articleTime <", value, "articletime");
            return (Criteria) this;
        }

        public Criteria andArticletimeLessThanOrEqualTo(Date value) {
            addCriterion("articleTime <=", value, "articletime");
            return (Criteria) this;
        }

        public Criteria andArticletimeIn(List<Date> values) {
            addCriterion("articleTime in", values, "articletime");
            return (Criteria) this;
        }

        public Criteria andArticletimeNotIn(List<Date> values) {
            addCriterion("articleTime not in", values, "articletime");
            return (Criteria) this;
        }

        public Criteria andArticletimeBetween(Date value1, Date value2) {
            addCriterion("articleTime between", value1, value2, "articletime");
            return (Criteria) this;
        }

        public Criteria andArticletimeNotBetween(Date value1, Date value2) {
            addCriterion("articleTime not between", value1, value2, "articletime");
            return (Criteria) this;
        }

        public Criteria andArticleclickcountIsNull() {
            addCriterion("articleClickCount is null");
            return (Criteria) this;
        }

        public Criteria andArticleclickcountIsNotNull() {
            addCriterion("articleClickCount is not null");
            return (Criteria) this;
        }

        public Criteria andArticleclickcountEqualTo(Integer value) {
            addCriterion("articleClickCount =", value, "articleclickcount");
            return (Criteria) this;
        }

        public Criteria andArticleclickcountNotEqualTo(Integer value) {
            addCriterion("articleClickCount <>", value, "articleclickcount");
            return (Criteria) this;
        }

        public Criteria andArticleclickcountGreaterThan(Integer value) {
            addCriterion("articleClickCount >", value, "articleclickcount");
            return (Criteria) this;
        }

        public Criteria andArticleclickcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("articleClickCount >=", value, "articleclickcount");
            return (Criteria) this;
        }

        public Criteria andArticleclickcountLessThan(Integer value) {
            addCriterion("articleClickCount <", value, "articleclickcount");
            return (Criteria) this;
        }

        public Criteria andArticleclickcountLessThanOrEqualTo(Integer value) {
            addCriterion("articleClickCount <=", value, "articleclickcount");
            return (Criteria) this;
        }

        public Criteria andArticleclickcountIn(List<Integer> values) {
            addCriterion("articleClickCount in", values, "articleclickcount");
            return (Criteria) this;
        }

        public Criteria andArticleclickcountNotIn(List<Integer> values) {
            addCriterion("articleClickCount not in", values, "articleclickcount");
            return (Criteria) this;
        }

        public Criteria andArticleclickcountBetween(Integer value1, Integer value2) {
            addCriterion("articleClickCount between", value1, value2, "articleclickcount");
            return (Criteria) this;
        }

        public Criteria andArticleclickcountNotBetween(Integer value1, Integer value2) {
            addCriterion("articleClickCount not between", value1, value2, "articleclickcount");
            return (Criteria) this;
        }

        public Criteria andArticleconsentientIsNull() {
            addCriterion("articleConsentient is null");
            return (Criteria) this;
        }

        public Criteria andArticleconsentientIsNotNull() {
            addCriterion("articleConsentient is not null");
            return (Criteria) this;
        }

        public Criteria andArticleconsentientEqualTo(Integer value) {
            addCriterion("articleConsentient =", value, "articleconsentient");
            return (Criteria) this;
        }

        public Criteria andArticleconsentientNotEqualTo(Integer value) {
            addCriterion("articleConsentient <>", value, "articleconsentient");
            return (Criteria) this;
        }

        public Criteria andArticleconsentientGreaterThan(Integer value) {
            addCriterion("articleConsentient >", value, "articleconsentient");
            return (Criteria) this;
        }

        public Criteria andArticleconsentientGreaterThanOrEqualTo(Integer value) {
            addCriterion("articleConsentient >=", value, "articleconsentient");
            return (Criteria) this;
        }

        public Criteria andArticleconsentientLessThan(Integer value) {
            addCriterion("articleConsentient <", value, "articleconsentient");
            return (Criteria) this;
        }

        public Criteria andArticleconsentientLessThanOrEqualTo(Integer value) {
            addCriterion("articleConsentient <=", value, "articleconsentient");
            return (Criteria) this;
        }

        public Criteria andArticleconsentientIn(List<Integer> values) {
            addCriterion("articleConsentient in", values, "articleconsentient");
            return (Criteria) this;
        }

        public Criteria andArticleconsentientNotIn(List<Integer> values) {
            addCriterion("articleConsentient not in", values, "articleconsentient");
            return (Criteria) this;
        }

        public Criteria andArticleconsentientBetween(Integer value1, Integer value2) {
            addCriterion("articleConsentient between", value1, value2, "articleconsentient");
            return (Criteria) this;
        }

        public Criteria andArticleconsentientNotBetween(Integer value1, Integer value2) {
            addCriterion("articleConsentient not between", value1, value2, "articleconsentient");
            return (Criteria) this;
        }

        public Criteria andArticlelastcommenttimeIsNull() {
            addCriterion("articleLastCommentTime is null");
            return (Criteria) this;
        }

        public Criteria andArticlelastcommenttimeIsNotNull() {
            addCriterion("articleLastCommentTime is not null");
            return (Criteria) this;
        }

        public Criteria andArticlelastcommenttimeEqualTo(Date value) {
            addCriterion("articleLastCommentTime =", value, "articlelastcommenttime");
            return (Criteria) this;
        }

        public Criteria andArticlelastcommenttimeNotEqualTo(Date value) {
            addCriterion("articleLastCommentTime <>", value, "articlelastcommenttime");
            return (Criteria) this;
        }

        public Criteria andArticlelastcommenttimeGreaterThan(Date value) {
            addCriterion("articleLastCommentTime >", value, "articlelastcommenttime");
            return (Criteria) this;
        }

        public Criteria andArticlelastcommenttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("articleLastCommentTime >=", value, "articlelastcommenttime");
            return (Criteria) this;
        }

        public Criteria andArticlelastcommenttimeLessThan(Date value) {
            addCriterion("articleLastCommentTime <", value, "articlelastcommenttime");
            return (Criteria) this;
        }

        public Criteria andArticlelastcommenttimeLessThanOrEqualTo(Date value) {
            addCriterion("articleLastCommentTime <=", value, "articlelastcommenttime");
            return (Criteria) this;
        }

        public Criteria andArticlelastcommenttimeIn(List<Date> values) {
            addCriterion("articleLastCommentTime in", values, "articlelastcommenttime");
            return (Criteria) this;
        }

        public Criteria andArticlelastcommenttimeNotIn(List<Date> values) {
            addCriterion("articleLastCommentTime not in", values, "articlelastcommenttime");
            return (Criteria) this;
        }

        public Criteria andArticlelastcommenttimeBetween(Date value1, Date value2) {
            addCriterion("articleLastCommentTime between", value1, value2, "articlelastcommenttime");
            return (Criteria) this;
        }

        public Criteria andArticlelastcommenttimeNotBetween(Date value1, Date value2) {
            addCriterion("articleLastCommentTime not between", value1, value2, "articlelastcommenttime");
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