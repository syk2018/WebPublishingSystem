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
            addCriterion("articleID is null");
            return (Criteria) this;
        }

        public Criteria andArticleidIsNotNull() {
            addCriterion("articleID is not null");
            return (Criteria) this;
        }

        public Criteria andArticleidEqualTo(Long value) {
            addCriterion("articleID =", value, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidNotEqualTo(Long value) {
            addCriterion("articleID <>", value, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidGreaterThan(Long value) {
            addCriterion("articleID >", value, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidGreaterThanOrEqualTo(Long value) {
            addCriterion("articleID >=", value, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidLessThan(Long value) {
            addCriterion("articleID <", value, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidLessThanOrEqualTo(Long value) {
            addCriterion("articleID <=", value, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidIn(List<Long> values) {
            addCriterion("articleID in", values, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidNotIn(List<Long> values) {
            addCriterion("articleID not in", values, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidBetween(Long value1, Long value2) {
            addCriterion("articleID between", value1, value2, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidNotBetween(Long value1, Long value2) {
            addCriterion("articleID not between", value1, value2, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticlesidIsNull() {
            addCriterion("articleSID is null");
            return (Criteria) this;
        }

        public Criteria andArticlesidIsNotNull() {
            addCriterion("articleSID is not null");
            return (Criteria) this;
        }

        public Criteria andArticlesidEqualTo(Long value) {
            addCriterion("articleSID =", value, "articlesid");
            return (Criteria) this;
        }

        public Criteria andArticlesidNotEqualTo(Long value) {
            addCriterion("articleSID <>", value, "articlesid");
            return (Criteria) this;
        }

        public Criteria andArticlesidGreaterThan(Long value) {
            addCriterion("articleSID >", value, "articlesid");
            return (Criteria) this;
        }

        public Criteria andArticlesidGreaterThanOrEqualTo(Long value) {
            addCriterion("articleSID >=", value, "articlesid");
            return (Criteria) this;
        }

        public Criteria andArticlesidLessThan(Long value) {
            addCriterion("articleSID <", value, "articlesid");
            return (Criteria) this;
        }

        public Criteria andArticlesidLessThanOrEqualTo(Long value) {
            addCriterion("articleSID <=", value, "articlesid");
            return (Criteria) this;
        }

        public Criteria andArticlesidIn(List<Long> values) {
            addCriterion("articleSID in", values, "articlesid");
            return (Criteria) this;
        }

        public Criteria andArticlesidNotIn(List<Long> values) {
            addCriterion("articleSID not in", values, "articlesid");
            return (Criteria) this;
        }

        public Criteria andArticlesidBetween(Long value1, Long value2) {
            addCriterion("articleSID between", value1, value2, "articlesid");
            return (Criteria) this;
        }

        public Criteria andArticlesidNotBetween(Long value1, Long value2) {
            addCriterion("articleSID not between", value1, value2, "articlesid");
            return (Criteria) this;
        }

        public Criteria andArticleuidIsNull() {
            addCriterion("articleUID is null");
            return (Criteria) this;
        }

        public Criteria andArticleuidIsNotNull() {
            addCriterion("articleUID is not null");
            return (Criteria) this;
        }

        public Criteria andArticleuidEqualTo(Long value) {
            addCriterion("articleUID =", value, "articleuid");
            return (Criteria) this;
        }

        public Criteria andArticleuidNotEqualTo(Long value) {
            addCriterion("articleUID <>", value, "articleuid");
            return (Criteria) this;
        }

        public Criteria andArticleuidGreaterThan(Long value) {
            addCriterion("articleUID >", value, "articleuid");
            return (Criteria) this;
        }

        public Criteria andArticleuidGreaterThanOrEqualTo(Long value) {
            addCriterion("articleUID >=", value, "articleuid");
            return (Criteria) this;
        }

        public Criteria andArticleuidLessThan(Long value) {
            addCriterion("articleUID <", value, "articleuid");
            return (Criteria) this;
        }

        public Criteria andArticleuidLessThanOrEqualTo(Long value) {
            addCriterion("articleUID <=", value, "articleuid");
            return (Criteria) this;
        }

        public Criteria andArticleuidIn(List<Long> values) {
            addCriterion("articleUID in", values, "articleuid");
            return (Criteria) this;
        }

        public Criteria andArticleuidNotIn(List<Long> values) {
            addCriterion("articleUID not in", values, "articleuid");
            return (Criteria) this;
        }

        public Criteria andArticleuidBetween(Long value1, Long value2) {
            addCriterion("articleUID between", value1, value2, "articleuid");
            return (Criteria) this;
        }

        public Criteria andArticleuidNotBetween(Long value1, Long value2) {
            addCriterion("articleUID not between", value1, value2, "articleuid");
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