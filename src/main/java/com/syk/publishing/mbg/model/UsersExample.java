package com.syk.publishing.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UsersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsersExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("userName is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("userName is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("userName =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("userName <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("userName >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("userName >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("userName <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("userName <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("userName like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("userName not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("userName in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("userName not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("userName between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("userName not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUserpwdIsNull() {
            addCriterion("userPwd is null");
            return (Criteria) this;
        }

        public Criteria andUserpwdIsNotNull() {
            addCriterion("userPwd is not null");
            return (Criteria) this;
        }

        public Criteria andUserpwdEqualTo(String value) {
            addCriterion("userPwd =", value, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdNotEqualTo(String value) {
            addCriterion("userPwd <>", value, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdGreaterThan(String value) {
            addCriterion("userPwd >", value, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdGreaterThanOrEqualTo(String value) {
            addCriterion("userPwd >=", value, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdLessThan(String value) {
            addCriterion("userPwd <", value, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdLessThanOrEqualTo(String value) {
            addCriterion("userPwd <=", value, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdLike(String value) {
            addCriterion("userPwd like", value, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdNotLike(String value) {
            addCriterion("userPwd not like", value, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdIn(List<String> values) {
            addCriterion("userPwd in", values, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdNotIn(List<String> values) {
            addCriterion("userPwd not in", values, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdBetween(String value1, String value2) {
            addCriterion("userPwd between", value1, value2, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdNotBetween(String value1, String value2) {
            addCriterion("userPwd not between", value1, value2, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUseravatarIsNull() {
            addCriterion("userAvatar is null");
            return (Criteria) this;
        }

        public Criteria andUseravatarIsNotNull() {
            addCriterion("userAvatar is not null");
            return (Criteria) this;
        }

        public Criteria andUseravatarEqualTo(Long value) {
            addCriterion("userAvatar =", value, "useravatar");
            return (Criteria) this;
        }

        public Criteria andUseravatarNotEqualTo(Long value) {
            addCriterion("userAvatar <>", value, "useravatar");
            return (Criteria) this;
        }

        public Criteria andUseravatarGreaterThan(Long value) {
            addCriterion("userAvatar >", value, "useravatar");
            return (Criteria) this;
        }

        public Criteria andUseravatarGreaterThanOrEqualTo(Long value) {
            addCriterion("userAvatar >=", value, "useravatar");
            return (Criteria) this;
        }

        public Criteria andUseravatarLessThan(Long value) {
            addCriterion("userAvatar <", value, "useravatar");
            return (Criteria) this;
        }

        public Criteria andUseravatarLessThanOrEqualTo(Long value) {
            addCriterion("userAvatar <=", value, "useravatar");
            return (Criteria) this;
        }

        public Criteria andUseravatarIn(List<Long> values) {
            addCriterion("userAvatar in", values, "useravatar");
            return (Criteria) this;
        }

        public Criteria andUseravatarNotIn(List<Long> values) {
            addCriterion("userAvatar not in", values, "useravatar");
            return (Criteria) this;
        }

        public Criteria andUseravatarBetween(Long value1, Long value2) {
            addCriterion("userAvatar between", value1, value2, "useravatar");
            return (Criteria) this;
        }

        public Criteria andUseravatarNotBetween(Long value1, Long value2) {
            addCriterion("userAvatar not between", value1, value2, "useravatar");
            return (Criteria) this;
        }

        public Criteria andUserdescriptionIsNull() {
            addCriterion("userDescription is null");
            return (Criteria) this;
        }

        public Criteria andUserdescriptionIsNotNull() {
            addCriterion("userDescription is not null");
            return (Criteria) this;
        }

        public Criteria andUserdescriptionEqualTo(String value) {
            addCriterion("userDescription =", value, "userdescription");
            return (Criteria) this;
        }

        public Criteria andUserdescriptionNotEqualTo(String value) {
            addCriterion("userDescription <>", value, "userdescription");
            return (Criteria) this;
        }

        public Criteria andUserdescriptionGreaterThan(String value) {
            addCriterion("userDescription >", value, "userdescription");
            return (Criteria) this;
        }

        public Criteria andUserdescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("userDescription >=", value, "userdescription");
            return (Criteria) this;
        }

        public Criteria andUserdescriptionLessThan(String value) {
            addCriterion("userDescription <", value, "userdescription");
            return (Criteria) this;
        }

        public Criteria andUserdescriptionLessThanOrEqualTo(String value) {
            addCriterion("userDescription <=", value, "userdescription");
            return (Criteria) this;
        }

        public Criteria andUserdescriptionLike(String value) {
            addCriterion("userDescription like", value, "userdescription");
            return (Criteria) this;
        }

        public Criteria andUserdescriptionNotLike(String value) {
            addCriterion("userDescription not like", value, "userdescription");
            return (Criteria) this;
        }

        public Criteria andUserdescriptionIn(List<String> values) {
            addCriterion("userDescription in", values, "userdescription");
            return (Criteria) this;
        }

        public Criteria andUserdescriptionNotIn(List<String> values) {
            addCriterion("userDescription not in", values, "userdescription");
            return (Criteria) this;
        }

        public Criteria andUserdescriptionBetween(String value1, String value2) {
            addCriterion("userDescription between", value1, value2, "userdescription");
            return (Criteria) this;
        }

        public Criteria andUserdescriptionNotBetween(String value1, String value2) {
            addCriterion("userDescription not between", value1, value2, "userdescription");
            return (Criteria) this;
        }

        public Criteria andUserregdateIsNull() {
            addCriterion("userRegDate is null");
            return (Criteria) this;
        }

        public Criteria andUserregdateIsNotNull() {
            addCriterion("userRegDate is not null");
            return (Criteria) this;
        }

        public Criteria andUserregdateEqualTo(Date value) {
            addCriterion("userRegDate =", value, "userregdate");
            return (Criteria) this;
        }

        public Criteria andUserregdateNotEqualTo(Date value) {
            addCriterion("userRegDate <>", value, "userregdate");
            return (Criteria) this;
        }

        public Criteria andUserregdateGreaterThan(Date value) {
            addCriterion("userRegDate >", value, "userregdate");
            return (Criteria) this;
        }

        public Criteria andUserregdateGreaterThanOrEqualTo(Date value) {
            addCriterion("userRegDate >=", value, "userregdate");
            return (Criteria) this;
        }

        public Criteria andUserregdateLessThan(Date value) {
            addCriterion("userRegDate <", value, "userregdate");
            return (Criteria) this;
        }

        public Criteria andUserregdateLessThanOrEqualTo(Date value) {
            addCriterion("userRegDate <=", value, "userregdate");
            return (Criteria) this;
        }

        public Criteria andUserregdateIn(List<Date> values) {
            addCriterion("userRegDate in", values, "userregdate");
            return (Criteria) this;
        }

        public Criteria andUserregdateNotIn(List<Date> values) {
            addCriterion("userRegDate not in", values, "userregdate");
            return (Criteria) this;
        }

        public Criteria andUserregdateBetween(Date value1, Date value2) {
            addCriterion("userRegDate between", value1, value2, "userregdate");
            return (Criteria) this;
        }

        public Criteria andUserregdateNotBetween(Date value1, Date value2) {
            addCriterion("userRegDate not between", value1, value2, "userregdate");
            return (Criteria) this;
        }

        public Criteria andUserismanagerIsNull() {
            addCriterion("userIsManager is null");
            return (Criteria) this;
        }

        public Criteria andUserismanagerIsNotNull() {
            addCriterion("userIsManager is not null");
            return (Criteria) this;
        }

        public Criteria andUserismanagerEqualTo(Integer value) {
            addCriterion("userIsManager =", value, "userismanager");
            return (Criteria) this;
        }

        public Criteria andUserismanagerNotEqualTo(Integer value) {
            addCriterion("userIsManager <>", value, "userismanager");
            return (Criteria) this;
        }

        public Criteria andUserismanagerGreaterThan(Integer value) {
            addCriterion("userIsManager >", value, "userismanager");
            return (Criteria) this;
        }

        public Criteria andUserismanagerGreaterThanOrEqualTo(Integer value) {
            addCriterion("userIsManager >=", value, "userismanager");
            return (Criteria) this;
        }

        public Criteria andUserismanagerLessThan(Integer value) {
            addCriterion("userIsManager <", value, "userismanager");
            return (Criteria) this;
        }

        public Criteria andUserismanagerLessThanOrEqualTo(Integer value) {
            addCriterion("userIsManager <=", value, "userismanager");
            return (Criteria) this;
        }

        public Criteria andUserismanagerIn(List<Integer> values) {
            addCriterion("userIsManager in", values, "userismanager");
            return (Criteria) this;
        }

        public Criteria andUserismanagerNotIn(List<Integer> values) {
            addCriterion("userIsManager not in", values, "userismanager");
            return (Criteria) this;
        }

        public Criteria andUserismanagerBetween(Integer value1, Integer value2) {
            addCriterion("userIsManager between", value1, value2, "userismanager");
            return (Criteria) this;
        }

        public Criteria andUserismanagerNotBetween(Integer value1, Integer value2) {
            addCriterion("userIsManager not between", value1, value2, "userismanager");
            return (Criteria) this;
        }

        public Criteria andUsernicknameIsNull() {
            addCriterion("userNickname is null");
            return (Criteria) this;
        }

        public Criteria andUsernicknameIsNotNull() {
            addCriterion("userNickname is not null");
            return (Criteria) this;
        }

        public Criteria andUsernicknameEqualTo(String value) {
            addCriterion("userNickname =", value, "usernickname");
            return (Criteria) this;
        }

        public Criteria andUsernicknameNotEqualTo(String value) {
            addCriterion("userNickname <>", value, "usernickname");
            return (Criteria) this;
        }

        public Criteria andUsernicknameGreaterThan(String value) {
            addCriterion("userNickname >", value, "usernickname");
            return (Criteria) this;
        }

        public Criteria andUsernicknameGreaterThanOrEqualTo(String value) {
            addCriterion("userNickname >=", value, "usernickname");
            return (Criteria) this;
        }

        public Criteria andUsernicknameLessThan(String value) {
            addCriterion("userNickname <", value, "usernickname");
            return (Criteria) this;
        }

        public Criteria andUsernicknameLessThanOrEqualTo(String value) {
            addCriterion("userNickname <=", value, "usernickname");
            return (Criteria) this;
        }

        public Criteria andUsernicknameLike(String value) {
            addCriterion("userNickname like", value, "usernickname");
            return (Criteria) this;
        }

        public Criteria andUsernicknameNotLike(String value) {
            addCriterion("userNickname not like", value, "usernickname");
            return (Criteria) this;
        }

        public Criteria andUsernicknameIn(List<String> values) {
            addCriterion("userNickname in", values, "usernickname");
            return (Criteria) this;
        }

        public Criteria andUsernicknameNotIn(List<String> values) {
            addCriterion("userNickname not in", values, "usernickname");
            return (Criteria) this;
        }

        public Criteria andUsernicknameBetween(String value1, String value2) {
            addCriterion("userNickname between", value1, value2, "usernickname");
            return (Criteria) this;
        }

        public Criteria andUsernicknameNotBetween(String value1, String value2) {
            addCriterion("userNickname not between", value1, value2, "usernickname");
            return (Criteria) this;
        }

        public Criteria andUserattentionIsNull() {
            addCriterion("userAttention is null");
            return (Criteria) this;
        }

        public Criteria andUserattentionIsNotNull() {
            addCriterion("userAttention is not null");
            return (Criteria) this;
        }

        public Criteria andUserattentionEqualTo(Integer value) {
            addCriterion("userAttention =", value, "userattention");
            return (Criteria) this;
        }

        public Criteria andUserattentionNotEqualTo(Integer value) {
            addCriterion("userAttention <>", value, "userattention");
            return (Criteria) this;
        }

        public Criteria andUserattentionGreaterThan(Integer value) {
            addCriterion("userAttention >", value, "userattention");
            return (Criteria) this;
        }

        public Criteria andUserattentionGreaterThanOrEqualTo(Integer value) {
            addCriterion("userAttention >=", value, "userattention");
            return (Criteria) this;
        }

        public Criteria andUserattentionLessThan(Integer value) {
            addCriterion("userAttention <", value, "userattention");
            return (Criteria) this;
        }

        public Criteria andUserattentionLessThanOrEqualTo(Integer value) {
            addCriterion("userAttention <=", value, "userattention");
            return (Criteria) this;
        }

        public Criteria andUserattentionIn(List<Integer> values) {
            addCriterion("userAttention in", values, "userattention");
            return (Criteria) this;
        }

        public Criteria andUserattentionNotIn(List<Integer> values) {
            addCriterion("userAttention not in", values, "userattention");
            return (Criteria) this;
        }

        public Criteria andUserattentionBetween(Integer value1, Integer value2) {
            addCriterion("userAttention between", value1, value2, "userattention");
            return (Criteria) this;
        }

        public Criteria andUserattentionNotBetween(Integer value1, Integer value2) {
            addCriterion("userAttention not between", value1, value2, "userattention");
            return (Criteria) this;
        }

        public Criteria andUserfansIsNull() {
            addCriterion("userFans is null");
            return (Criteria) this;
        }

        public Criteria andUserfansIsNotNull() {
            addCriterion("userFans is not null");
            return (Criteria) this;
        }

        public Criteria andUserfansEqualTo(Integer value) {
            addCriterion("userFans =", value, "userfans");
            return (Criteria) this;
        }

        public Criteria andUserfansNotEqualTo(Integer value) {
            addCriterion("userFans <>", value, "userfans");
            return (Criteria) this;
        }

        public Criteria andUserfansGreaterThan(Integer value) {
            addCriterion("userFans >", value, "userfans");
            return (Criteria) this;
        }

        public Criteria andUserfansGreaterThanOrEqualTo(Integer value) {
            addCriterion("userFans >=", value, "userfans");
            return (Criteria) this;
        }

        public Criteria andUserfansLessThan(Integer value) {
            addCriterion("userFans <", value, "userfans");
            return (Criteria) this;
        }

        public Criteria andUserfansLessThanOrEqualTo(Integer value) {
            addCriterion("userFans <=", value, "userfans");
            return (Criteria) this;
        }

        public Criteria andUserfansIn(List<Integer> values) {
            addCriterion("userFans in", values, "userfans");
            return (Criteria) this;
        }

        public Criteria andUserfansNotIn(List<Integer> values) {
            addCriterion("userFans not in", values, "userfans");
            return (Criteria) this;
        }

        public Criteria andUserfansBetween(Integer value1, Integer value2) {
            addCriterion("userFans between", value1, value2, "userfans");
            return (Criteria) this;
        }

        public Criteria andUserfansNotBetween(Integer value1, Integer value2) {
            addCriterion("userFans not between", value1, value2, "userfans");
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