package com.example.demo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author maqiang
 * @date 2022/1/4  18:20
 */

public class UserExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public UserExample() {
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
        //Criteria中创建了一个集合，将其加入到oredCriteria中
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

    public void setLimitStart(int limitStart) {
        this.limitStart=limitStart;
    }

    public int getLimitStart() {
        return limitStart;
    }

    public void setLimitEnd(int limitEnd) {
        this.limitEnd=limitEnd;
    }

    public int getLimitEnd() {
        return limitEnd;
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andSignIsNull() {
            addCriterion("sign is null");
            return (Criteria) this;
        }

        public Criteria andSignIsNotNull() {
            addCriterion("sign is not null");
            return (Criteria) this;
        }

        public Criteria andSignEqualTo(String value) {
            addCriterion("sign =", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignNotEqualTo(String value) {
            addCriterion("sign <>", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignGreaterThan(String value) {
            addCriterion("sign >", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignGreaterThanOrEqualTo(String value) {
            addCriterion("sign >=", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignLessThan(String value) {
            addCriterion("sign <", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignLessThanOrEqualTo(String value) {
            addCriterion("sign <=", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignLike(String value) {
            addCriterion("sign like", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignNotLike(String value) {
            addCriterion("sign not like", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignIn(List<String> values) {
            addCriterion("sign in", values, "sign");
            return (Criteria) this;
        }

        public Criteria andSignNotIn(List<String> values) {
            addCriterion("sign not in", values, "sign");
            return (Criteria) this;
        }

        public Criteria andSignBetween(String value1, String value2) {
            addCriterion("sign between", value1, value2, "sign");
            return (Criteria) this;
        }

        public Criteria andSignNotBetween(String value1, String value2) {
            addCriterion("sign not between", value1, value2, "sign");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andJoinNumberIsNull() {
            addCriterion("join_number is null");
            return (Criteria) this;
        }

        public Criteria andJoinNumberIsNotNull() {
            addCriterion("join_number is not null");
            return (Criteria) this;
        }

        public Criteria andJoinNumberEqualTo(Integer value) {
            addCriterion("join_number =", value, "joinNumber");
            return (Criteria) this;
        }

        public Criteria andJoinNumberNotEqualTo(Integer value) {
            addCriterion("join_number <>", value, "joinNumber");
            return (Criteria) this;
        }

        public Criteria andJoinNumberGreaterThan(Integer value) {
            addCriterion("join_number >", value, "joinNumber");
            return (Criteria) this;
        }

        public Criteria andJoinNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("join_number >=", value, "joinNumber");
            return (Criteria) this;
        }

        public Criteria andJoinNumberLessThan(Integer value) {
            addCriterion("join_number <", value, "joinNumber");
            return (Criteria) this;
        }

        public Criteria andJoinNumberLessThanOrEqualTo(Integer value) {
            addCriterion("join_number <=", value, "joinNumber");
            return (Criteria) this;
        }

        public Criteria andJoinNumberIn(List<Integer> values) {
            addCriterion("join_number in", values, "joinNumber");
            return (Criteria) this;
        }

        public Criteria andJoinNumberNotIn(List<Integer> values) {
            addCriterion("join_number not in", values, "joinNumber");
            return (Criteria) this;
        }

        public Criteria andJoinNumberBetween(Integer value1, Integer value2) {
            addCriterion("join_number between", value1, value2, "joinNumber");
            return (Criteria) this;
        }

        public Criteria andJoinNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("join_number not between", value1, value2, "joinNumber");
            return (Criteria) this;
        }

        public Criteria andInviteNumberIsNull() {
            addCriterion("invite_number is null");
            return (Criteria) this;
        }

        public Criteria andInviteNumberIsNotNull() {
            addCriterion("invite_number is not null");
            return (Criteria) this;
        }

        public Criteria andInviteNumberEqualTo(Integer value) {
            addCriterion("invite_number =", value, "inviteNumber");
            return (Criteria) this;
        }

        public Criteria andInviteNumberNotEqualTo(Integer value) {
            addCriterion("invite_number <>", value, "inviteNumber");
            return (Criteria) this;
        }

        public Criteria andInviteNumberGreaterThan(Integer value) {
            addCriterion("invite_number >", value, "inviteNumber");
            return (Criteria) this;
        }

        public Criteria andInviteNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("invite_number >=", value, "inviteNumber");
            return (Criteria) this;
        }

        public Criteria andInviteNumberLessThan(Integer value) {
            addCriterion("invite_number <", value, "inviteNumber");
            return (Criteria) this;
        }

        public Criteria andInviteNumberLessThanOrEqualTo(Integer value) {
            addCriterion("invite_number <=", value, "inviteNumber");
            return (Criteria) this;
        }

        public Criteria andInviteNumberIn(List<Integer> values) {
            addCriterion("invite_number in", values, "inviteNumber");
            return (Criteria) this;
        }

        public Criteria andInviteNumberNotIn(List<Integer> values) {
            addCriterion("invite_number not in", values, "inviteNumber");
            return (Criteria) this;
        }

        public Criteria andInviteNumberBetween(Integer value1, Integer value2) {
            addCriterion("invite_number between", value1, value2, "inviteNumber");
            return (Criteria) this;
        }

        public Criteria andInviteNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("invite_number not between", value1, value2, "inviteNumber");
            return (Criteria) this;
        }

        public Criteria andStartedAtIsNull() {
            addCriterion("started_at is null");
            return (Criteria) this;
        }

        public Criteria andStartedAtIsNotNull() {
            addCriterion("started_at is not null");
            return (Criteria) this;
        }

        public Criteria andStartedAtEqualTo(Date value) {
            addCriterion("started_at =", value, "startedAt");
            return (Criteria) this;
        }

        public Criteria andStartedAtNotEqualTo(Date value) {
            addCriterion("started_at <>", value, "startedAt");
            return (Criteria) this;
        }

        public Criteria andStartedAtGreaterThan(Date value) {
            addCriterion("started_at >", value, "startedAt");
            return (Criteria) this;
        }

        public Criteria andStartedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("started_at >=", value, "startedAt");
            return (Criteria) this;
        }

        public Criteria andStartedAtLessThan(Date value) {
            addCriterion("started_at <", value, "startedAt");
            return (Criteria) this;
        }

        public Criteria andStartedAtLessThanOrEqualTo(Date value) {
            addCriterion("started_at <=", value, "startedAt");
            return (Criteria) this;
        }

        public Criteria andStartedAtIn(List<Date> values) {
            addCriterion("started_at in", values, "startedAt");
            return (Criteria) this;
        }

        public Criteria andStartedAtNotIn(List<Date> values) {
            addCriterion("started_at not in", values, "startedAt");
            return (Criteria) this;
        }

        public Criteria andStartedAtBetween(Date value1, Date value2) {
            addCriterion("started_at between", value1, value2, "startedAt");
            return (Criteria) this;
        }

        public Criteria andStartedAtNotBetween(Date value1, Date value2) {
            addCriterion("started_at not between", value1, value2, "startedAt");
            return (Criteria) this;
        }

        public Criteria andEndedAtIsNull() {
            addCriterion("ended_at is null");
            return (Criteria) this;
        }

        public Criteria andEndedAtIsNotNull() {
            addCriterion("ended_at is not null");
            return (Criteria) this;
        }

        public Criteria andEndedAtEqualTo(Date value) {
            addCriterion("ended_at =", value, "endedAt");
            return (Criteria) this;
        }

        public Criteria andEndedAtNotEqualTo(Date value) {
            addCriterion("ended_at <>", value, "endedAt");
            return (Criteria) this;
        }

        public Criteria andEndedAtGreaterThan(Date value) {
            addCriterion("ended_at >", value, "endedAt");
            return (Criteria) this;
        }

        public Criteria andEndedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("ended_at >=", value, "endedAt");
            return (Criteria) this;
        }

        public Criteria andEndedAtLessThan(Date value) {
            addCriterion("ended_at <", value, "endedAt");
            return (Criteria) this;
        }

        public Criteria andEndedAtLessThanOrEqualTo(Date value) {
            addCriterion("ended_at <=", value, "endedAt");
            return (Criteria) this;
        }

        public Criteria andEndedAtIn(List<Date> values) {
            addCriterion("ended_at in", values, "endedAt");
            return (Criteria) this;
        }

        public Criteria andEndedAtNotIn(List<Date> values) {
            addCriterion("ended_at not in", values, "endedAt");
            return (Criteria) this;
        }

        public Criteria andEndedAtBetween(Date value1, Date value2) {
            addCriterion("ended_at between", value1, value2, "endedAt");
            return (Criteria) this;
        }

        public Criteria andEndedAtNotBetween(Date value1, Date value2) {
            addCriterion("ended_at not between", value1, value2, "endedAt");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(Date value) {
            addCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Date value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Date value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Date value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Date> values) {
            addCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Date> values) {
            addCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Date value1, Date value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNull() {
            addCriterion("updated_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNotNull() {
            addCriterion("updated_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtEqualTo(Date value) {
            addCriterion("updated_at =", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(Date value) {
            addCriterion("updated_at <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(Date value) {
            addCriterion("updated_at >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_at >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(Date value) {
            addCriterion("updated_at <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(Date value) {
            addCriterion("updated_at <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIn(List<Date> values) {
            addCriterion("updated_at in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotIn(List<Date> values) {
            addCriterion("updated_at not in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtBetween(Date value1, Date value2) {
            addCriterion("updated_at between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotBetween(Date value1, Date value2) {
            addCriterion("updated_at not between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andIntroSentenceIsNull() {
            addCriterion("intro_sentence is null");
            return (Criteria) this;
        }

        public Criteria andIntroSentenceIsNotNull() {
            addCriterion("intro_sentence is not null");
            return (Criteria) this;
        }

        public Criteria andIntroSentenceEqualTo(String value) {
            addCriterion("intro_sentence =", value, "introSentence");
            return (Criteria) this;
        }

        public Criteria andIntroSentenceNotEqualTo(String value) {
            addCriterion("intro_sentence <>", value, "introSentence");
            return (Criteria) this;
        }

        public Criteria andIntroSentenceGreaterThan(String value) {
            addCriterion("intro_sentence >", value, "introSentence");
            return (Criteria) this;
        }

        public Criteria andIntroSentenceGreaterThanOrEqualTo(String value) {
            addCriterion("intro_sentence >=", value, "introSentence");
            return (Criteria) this;
        }

        public Criteria andIntroSentenceLessThan(String value) {
            addCriterion("intro_sentence <", value, "introSentence");
            return (Criteria) this;
        }

        public Criteria andIntroSentenceLessThanOrEqualTo(String value) {
            addCriterion("intro_sentence <=", value, "introSentence");
            return (Criteria) this;
        }

        public Criteria andIntroSentenceLike(String value) {
            addCriterion("intro_sentence like", value, "introSentence");
            return (Criteria) this;
        }

        public Criteria andIntroSentenceNotLike(String value) {
            addCriterion("intro_sentence not like", value, "introSentence");
            return (Criteria) this;
        }

        public Criteria andIntroSentenceIn(List<String> values) {
            addCriterion("intro_sentence in", values, "introSentence");
            return (Criteria) this;
        }

        public Criteria andIntroSentenceNotIn(List<String> values) {
            addCriterion("intro_sentence not in", values, "introSentence");
            return (Criteria) this;
        }

        public Criteria andIntroSentenceBetween(String value1, String value2) {
            addCriterion("intro_sentence between", value1, value2, "introSentence");
            return (Criteria) this;
        }

        public Criteria andIntroSentenceNotBetween(String value1, String value2) {
            addCriterion("intro_sentence not between", value1, value2, "introSentence");
            return (Criteria) this;
        }

        public Criteria andUserShareTitleIsNull() {
            addCriterion("user_share_title is null");
            return (Criteria) this;
        }

        public Criteria andUserShareTitleIsNotNull() {
            addCriterion("user_share_title is not null");
            return (Criteria) this;
        }

        public Criteria andUserShareTitleEqualTo(String value) {
            addCriterion("user_share_title =", value, "userShareTitle");
            return (Criteria) this;
        }

        public Criteria andUserShareTitleNotEqualTo(String value) {
            addCriterion("user_share_title <>", value, "userShareTitle");
            return (Criteria) this;
        }

        public Criteria andUserShareTitleGreaterThan(String value) {
            addCriterion("user_share_title >", value, "userShareTitle");
            return (Criteria) this;
        }

        public Criteria andUserShareTitleGreaterThanOrEqualTo(String value) {
            addCriterion("user_share_title >=", value, "userShareTitle");
            return (Criteria) this;
        }

        public Criteria andUserShareTitleLessThan(String value) {
            addCriterion("user_share_title <", value, "userShareTitle");
            return (Criteria) this;
        }

        public Criteria andUserShareTitleLessThanOrEqualTo(String value) {
            addCriterion("user_share_title <=", value, "userShareTitle");
            return (Criteria) this;
        }

        public Criteria andUserShareTitleLike(String value) {
            addCriterion("user_share_title like", value, "userShareTitle");
            return (Criteria) this;
        }

        public Criteria andUserShareTitleNotLike(String value) {
            addCriterion("user_share_title not like", value, "userShareTitle");
            return (Criteria) this;
        }

        public Criteria andUserShareTitleIn(List<String> values) {
            addCriterion("user_share_title in", values, "userShareTitle");
            return (Criteria) this;
        }

        public Criteria andUserShareTitleNotIn(List<String> values) {
            addCriterion("user_share_title not in", values, "userShareTitle");
            return (Criteria) this;
        }

        public Criteria andUserShareTitleBetween(String value1, String value2) {
            addCriterion("user_share_title between", value1, value2, "userShareTitle");
            return (Criteria) this;
        }

        public Criteria andUserShareTitleNotBetween(String value1, String value2) {
            addCriterion("user_share_title not between", value1, value2, "userShareTitle");
            return (Criteria) this;
        }

        public Criteria andUserShareIntroIsNull() {
            addCriterion("user_share_intro is null");
            return (Criteria) this;
        }

        public Criteria andUserShareIntroIsNotNull() {
            addCriterion("user_share_intro is not null");
            return (Criteria) this;
        }

        public Criteria andUserShareIntroEqualTo(String value) {
            addCriterion("user_share_intro =", value, "userShareIntro");
            return (Criteria) this;
        }

        public Criteria andUserShareIntroNotEqualTo(String value) {
            addCriterion("user_share_intro <>", value, "userShareIntro");
            return (Criteria) this;
        }

        public Criteria andUserShareIntroGreaterThan(String value) {
            addCriterion("user_share_intro >", value, "userShareIntro");
            return (Criteria) this;
        }

        public Criteria andUserShareIntroGreaterThanOrEqualTo(String value) {
            addCriterion("user_share_intro >=", value, "userShareIntro");
            return (Criteria) this;
        }

        public Criteria andUserShareIntroLessThan(String value) {
            addCriterion("user_share_intro <", value, "userShareIntro");
            return (Criteria) this;
        }

        public Criteria andUserShareIntroLessThanOrEqualTo(String value) {
            addCriterion("user_share_intro <=", value, "userShareIntro");
            return (Criteria) this;
        }

        public Criteria andUserShareIntroLike(String value) {
            addCriterion("user_share_intro like", value, "userShareIntro");
            return (Criteria) this;
        }

        public Criteria andUserShareIntroNotLike(String value) {
            addCriterion("user_share_intro not like", value, "userShareIntro");
            return (Criteria) this;
        }

        public Criteria andUserShareIntroIn(List<String> values) {
            addCriterion("user_share_intro in", values, "userShareIntro");
            return (Criteria) this;
        }

        public Criteria andUserShareIntroNotIn(List<String> values) {
            addCriterion("user_share_intro not in", values, "userShareIntro");
            return (Criteria) this;
        }

        public Criteria andUserShareIntroBetween(String value1, String value2) {
            addCriterion("user_share_intro between", value1, value2, "userShareIntro");
            return (Criteria) this;
        }

        public Criteria andUserShareIntroNotBetween(String value1, String value2) {
            addCriterion("user_share_intro not between", value1, value2, "userShareIntro");
            return (Criteria) this;
        }

        public Criteria andTopicIdIsNull() {
            addCriterion("topic_id is null");
            return (Criteria) this;
        }

        public Criteria andTopicIdIsNotNull() {
            addCriterion("topic_id is not null");
            return (Criteria) this;
        }

        public Criteria andTopicIdEqualTo(Long value) {
            addCriterion("topic_id =", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdNotEqualTo(Long value) {
            addCriterion("topic_id <>", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdGreaterThan(Long value) {
            addCriterion("topic_id >", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdGreaterThanOrEqualTo(Long value) {
            addCriterion("topic_id >=", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdLessThan(Long value) {
            addCriterion("topic_id <", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdLessThanOrEqualTo(Long value) {
            addCriterion("topic_id <=", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdIn(List<Long> values) {
            addCriterion("topic_id in", values, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdNotIn(List<Long> values) {
            addCriterion("topic_id not in", values, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdBetween(Long value1, Long value2) {
            addCriterion("topic_id between", value1, value2, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdNotBetween(Long value1, Long value2) {
            addCriterion("topic_id not between", value1, value2, "topicId");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andShareLeadIsNull() {
            addCriterion("share_lead is null");
            return (Criteria) this;
        }

        public Criteria andShareLeadIsNotNull() {
            addCriterion("share_lead is not null");
            return (Criteria) this;
        }

        public Criteria andShareLeadEqualTo(String value) {
            addCriterion("share_lead =", value, "shareLead");
            return (Criteria) this;
        }

        public Criteria andShareLeadNotEqualTo(String value) {
            addCriterion("share_lead <>", value, "shareLead");
            return (Criteria) this;
        }

        public Criteria andShareLeadGreaterThan(String value) {
            addCriterion("share_lead >", value, "shareLead");
            return (Criteria) this;
        }

        public Criteria andShareLeadGreaterThanOrEqualTo(String value) {
            addCriterion("share_lead >=", value, "shareLead");
            return (Criteria) this;
        }

        public Criteria andShareLeadLessThan(String value) {
            addCriterion("share_lead <", value, "shareLead");
            return (Criteria) this;
        }

        public Criteria andShareLeadLessThanOrEqualTo(String value) {
            addCriterion("share_lead <=", value, "shareLead");
            return (Criteria) this;
        }

        public Criteria andShareLeadLike(String value) {
            addCriterion("share_lead like", value, "shareLead");
            return (Criteria) this;
        }

        public Criteria andShareLeadNotLike(String value) {
            addCriterion("share_lead not like", value, "shareLead");
            return (Criteria) this;
        }

        public Criteria andShareLeadIn(List<String> values) {
            addCriterion("share_lead in", values, "shareLead");
            return (Criteria) this;
        }

        public Criteria andShareLeadNotIn(List<String> values) {
            addCriterion("share_lead not in", values, "shareLead");
            return (Criteria) this;
        }

        public Criteria andShareLeadBetween(String value1, String value2) {
            addCriterion("share_lead between", value1, value2, "shareLead");
            return (Criteria) this;
        }

        public Criteria andShareLeadNotBetween(String value1, String value2) {
            addCriterion("share_lead not between", value1, value2, "shareLead");
            return (Criteria) this;
        }

        public Criteria andShareUserInfoIsNull() {
            addCriterion("share_user_info is null");
            return (Criteria) this;
        }

        public Criteria andShareUserInfoIsNotNull() {
            addCriterion("share_user_info is not null");
            return (Criteria) this;
        }

        public Criteria andShareUserInfoEqualTo(String value) {
            addCriterion("share_user_info =", value, "shareUserInfo");
            return (Criteria) this;
        }

        public Criteria andShareUserInfoNotEqualTo(String value) {
            addCriterion("share_user_info <>", value, "shareUserInfo");
            return (Criteria) this;
        }

        public Criteria andShareUserInfoGreaterThan(String value) {
            addCriterion("share_user_info >", value, "shareUserInfo");
            return (Criteria) this;
        }

        public Criteria andShareUserInfoGreaterThanOrEqualTo(String value) {
            addCriterion("share_user_info >=", value, "shareUserInfo");
            return (Criteria) this;
        }

        public Criteria andShareUserInfoLessThan(String value) {
            addCriterion("share_user_info <", value, "shareUserInfo");
            return (Criteria) this;
        }

        public Criteria andShareUserInfoLessThanOrEqualTo(String value) {
            addCriterion("share_user_info <=", value, "shareUserInfo");
            return (Criteria) this;
        }

        public Criteria andShareUserInfoLike(String value) {
            addCriterion("share_user_info like", value, "shareUserInfo");
            return (Criteria) this;
        }

        public Criteria andShareUserInfoNotLike(String value) {
            addCriterion("share_user_info not like", value, "shareUserInfo");
            return (Criteria) this;
        }

        public Criteria andShareUserInfoIn(List<String> values) {
            addCriterion("share_user_info in", values, "shareUserInfo");
            return (Criteria) this;
        }

        public Criteria andShareUserInfoNotIn(List<String> values) {
            addCriterion("share_user_info not in", values, "shareUserInfo");
            return (Criteria) this;
        }

        public Criteria andShareUserInfoBetween(String value1, String value2) {
            addCriterion("share_user_info between", value1, value2, "shareUserInfo");
            return (Criteria) this;
        }

        public Criteria andShareUserInfoNotBetween(String value1, String value2) {
            addCriterion("share_user_info not between", value1, value2, "shareUserInfo");
            return (Criteria) this;
        }

        public Criteria andShareTitleIsNull() {
            addCriterion("share_title is null");
            return (Criteria) this;
        }

        public Criteria andShareTitleIsNotNull() {
            addCriterion("share_title is not null");
            return (Criteria) this;
        }

        public Criteria andShareTitleEqualTo(String value) {
            addCriterion("share_title =", value, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleNotEqualTo(String value) {
            addCriterion("share_title <>", value, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleGreaterThan(String value) {
            addCriterion("share_title >", value, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleGreaterThanOrEqualTo(String value) {
            addCriterion("share_title >=", value, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleLessThan(String value) {
            addCriterion("share_title <", value, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleLessThanOrEqualTo(String value) {
            addCriterion("share_title <=", value, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleLike(String value) {
            addCriterion("share_title like", value, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleNotLike(String value) {
            addCriterion("share_title not like", value, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleIn(List<String> values) {
            addCriterion("share_title in", values, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleNotIn(List<String> values) {
            addCriterion("share_title not in", values, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleBetween(String value1, String value2) {
            addCriterion("share_title between", value1, value2, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleNotBetween(String value1, String value2) {
            addCriterion("share_title not between", value1, value2, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andChannelCodeIsNull() {
            addCriterion("channel_code is null");
            return (Criteria) this;
        }

        public Criteria andChannelCodeIsNotNull() {
            addCriterion("channel_code is not null");
            return (Criteria) this;
        }

        public Criteria andChannelCodeEqualTo(String value) {
            addCriterion("channel_code =", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeNotEqualTo(String value) {
            addCriterion("channel_code <>", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeGreaterThan(String value) {
            addCriterion("channel_code >", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeGreaterThanOrEqualTo(String value) {
            addCriterion("channel_code >=", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeLessThan(String value) {
            addCriterion("channel_code <", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeLessThanOrEqualTo(String value) {
            addCriterion("channel_code <=", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeLike(String value) {
            addCriterion("channel_code like", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeNotLike(String value) {
            addCriterion("channel_code not like", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeIn(List<String> values) {
            addCriterion("channel_code in", values, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeNotIn(List<String> values) {
            addCriterion("channel_code not in", values, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeBetween(String value1, String value2) {
            addCriterion("channel_code between", value1, value2, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeNotBetween(String value1, String value2) {
            addCriterion("channel_code not between", value1, value2, "channelCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeIsNull() {
            addCriterion("qr_code is null");
            return (Criteria) this;
        }

        public Criteria andQrCodeIsNotNull() {
            addCriterion("qr_code is not null");
            return (Criteria) this;
        }

        public Criteria andQrCodeEqualTo(String value) {
            addCriterion("qr_code =", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeNotEqualTo(String value) {
            addCriterion("qr_code <>", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeGreaterThan(String value) {
            addCriterion("qr_code >", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeGreaterThanOrEqualTo(String value) {
            addCriterion("qr_code >=", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeLessThan(String value) {
            addCriterion("qr_code <", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeLessThanOrEqualTo(String value) {
            addCriterion("qr_code <=", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeLike(String value) {
            addCriterion("qr_code like", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeNotLike(String value) {
            addCriterion("qr_code not like", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeIn(List<String> values) {
            addCriterion("qr_code in", values, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeNotIn(List<String> values) {
            addCriterion("qr_code not in", values, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeBetween(String value1, String value2) {
            addCriterion("qr_code between", value1, value2, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeNotBetween(String value1, String value2) {
            addCriterion("qr_code not between", value1, value2, "qrCode");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNull() {
            addCriterion("is_del is null");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNotNull() {
            addCriterion("is_del is not null");
            return (Criteria) this;
        }

        public Criteria andIsDelEqualTo(Byte value) {
            addCriterion("is_del =", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotEqualTo(Byte value) {
            addCriterion("is_del <>", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThan(Byte value) {
            addCriterion("is_del >", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_del >=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThan(Byte value) {
            addCriterion("is_del <", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThanOrEqualTo(Byte value) {
            addCriterion("is_del <=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelIn(List<Byte> values) {
            addCriterion("is_del in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotIn(List<Byte> values) {
            addCriterion("is_del not in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelBetween(Byte value1, Byte value2) {
            addCriterion("is_del between", value1, value2, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotBetween(Byte value1, Byte value2) {
            addCriterion("is_del not between", value1, value2, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIsNull() {
            addCriterion("is_default is null");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIsNotNull() {
            addCriterion("is_default is not null");
            return (Criteria) this;
        }

        public Criteria andIsDefaultEqualTo(Byte value) {
            addCriterion("is_default =", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotEqualTo(Byte value) {
            addCriterion("is_default <>", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultGreaterThan(Byte value) {
            addCriterion("is_default >", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_default >=", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultLessThan(Byte value) {
            addCriterion("is_default <", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultLessThanOrEqualTo(Byte value) {
            addCriterion("is_default <=", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIn(List<Byte> values) {
            addCriterion("is_default in", values, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotIn(List<Byte> values) {
            addCriterion("is_default not in", values, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultBetween(Byte value1, Byte value2) {
            addCriterion("is_default between", value1, value2, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotBetween(Byte value1, Byte value2) {
            addCriterion("is_default not between", value1, value2, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsShowIsNull() {
            addCriterion("is_show is null");
            return (Criteria) this;
        }

        public Criteria andIsShowIsNotNull() {
            addCriterion("is_show is not null");
            return (Criteria) this;
        }

        public Criteria andIsShowEqualTo(Byte value) {
            addCriterion("is_show =", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotEqualTo(Byte value) {
            addCriterion("is_show <>", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowGreaterThan(Byte value) {
            addCriterion("is_show >", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_show >=", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowLessThan(Byte value) {
            addCriterion("is_show <", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowLessThanOrEqualTo(Byte value) {
            addCriterion("is_show <=", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowIn(List<Byte> values) {
            addCriterion("is_show in", values, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotIn(List<Byte> values) {
            addCriterion("is_show not in", values, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowBetween(Byte value1, Byte value2) {
            addCriterion("is_show between", value1, value2, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotBetween(Byte value1, Byte value2) {
            addCriterion("is_show not between", value1, value2, "isShow");
            return (Criteria) this;
        }

        public Criteria andParticipantsNumIsNull() {
            addCriterion("participants_num is null");
            return (Criteria) this;
        }

        public Criteria andParticipantsNumIsNotNull() {
            addCriterion("participants_num is not null");
            return (Criteria) this;
        }

        public Criteria andParticipantsNumEqualTo(Integer value) {
            addCriterion("participants_num =", value, "participantsNum");
            return (Criteria) this;
        }

        public Criteria andParticipantsNumNotEqualTo(Integer value) {
            addCriterion("participants_num <>", value, "participantsNum");
            return (Criteria) this;
        }

        public Criteria andParticipantsNumGreaterThan(Integer value) {
            addCriterion("participants_num >", value, "participantsNum");
            return (Criteria) this;
        }

        public Criteria andParticipantsNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("participants_num >=", value, "participantsNum");
            return (Criteria) this;
        }

        public Criteria andParticipantsNumLessThan(Integer value) {
            addCriterion("participants_num <", value, "participantsNum");
            return (Criteria) this;
        }

        public Criteria andParticipantsNumLessThanOrEqualTo(Integer value) {
            addCriterion("participants_num <=", value, "participantsNum");
            return (Criteria) this;
        }

        public Criteria andParticipantsNumIn(List<Integer> values) {
            addCriterion("participants_num in", values, "participantsNum");
            return (Criteria) this;
        }

        public Criteria andParticipantsNumNotIn(List<Integer> values) {
            addCriterion("participants_num not in", values, "participantsNum");
            return (Criteria) this;
        }

        public Criteria andParticipantsNumBetween(Integer value1, Integer value2) {
            addCriterion("participants_num between", value1, value2, "participantsNum");
            return (Criteria) this;
        }

        public Criteria andParticipantsNumNotBetween(Integer value1, Integer value2) {
            addCriterion("participants_num not between", value1, value2, "participantsNum");
            return (Criteria) this;
        }

        public Criteria andApplyNumIsNull() {
            addCriterion("apply_num is null");
            return (Criteria) this;
        }

        public Criteria andApplyNumIsNotNull() {
            addCriterion("apply_num is not null");
            return (Criteria) this;
        }

        public Criteria andApplyNumEqualTo(Integer value) {
            addCriterion("apply_num =", value, "applyNum");
            return (Criteria) this;
        }

        public Criteria andApplyNumNotEqualTo(Integer value) {
            addCriterion("apply_num <>", value, "applyNum");
            return (Criteria) this;
        }

        public Criteria andApplyNumGreaterThan(Integer value) {
            addCriterion("apply_num >", value, "applyNum");
            return (Criteria) this;
        }

        public Criteria andApplyNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("apply_num >=", value, "applyNum");
            return (Criteria) this;
        }

        public Criteria andApplyNumLessThan(Integer value) {
            addCriterion("apply_num <", value, "applyNum");
            return (Criteria) this;
        }

        public Criteria andApplyNumLessThanOrEqualTo(Integer value) {
            addCriterion("apply_num <=", value, "applyNum");
            return (Criteria) this;
        }

        public Criteria andApplyNumIn(List<Integer> values) {
            addCriterion("apply_num in", values, "applyNum");
            return (Criteria) this;
        }

        public Criteria andApplyNumNotIn(List<Integer> values) {
            addCriterion("apply_num not in", values, "applyNum");
            return (Criteria) this;
        }

        public Criteria andApplyNumBetween(Integer value1, Integer value2) {
            addCriterion("apply_num between", value1, value2, "applyNum");
            return (Criteria) this;
        }

        public Criteria andApplyNumNotBetween(Integer value1, Integer value2) {
            addCriterion("apply_num not between", value1, value2, "applyNum");
            return (Criteria) this;
        }

        public Criteria andClueNumIsNull() {
            addCriterion("clue_num is null");
            return (Criteria) this;
        }

        public Criteria andClueNumIsNotNull() {
            addCriterion("clue_num is not null");
            return (Criteria) this;
        }

        public Criteria andClueNumEqualTo(Integer value) {
            addCriterion("clue_num =", value, "clueNum");
            return (Criteria) this;
        }

        public Criteria andClueNumNotEqualTo(Integer value) {
            addCriterion("clue_num <>", value, "clueNum");
            return (Criteria) this;
        }

        public Criteria andClueNumGreaterThan(Integer value) {
            addCriterion("clue_num >", value, "clueNum");
            return (Criteria) this;
        }

        public Criteria andClueNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("clue_num >=", value, "clueNum");
            return (Criteria) this;
        }

        public Criteria andClueNumLessThan(Integer value) {
            addCriterion("clue_num <", value, "clueNum");
            return (Criteria) this;
        }

        public Criteria andClueNumLessThanOrEqualTo(Integer value) {
            addCriterion("clue_num <=", value, "clueNum");
            return (Criteria) this;
        }

        public Criteria andClueNumIn(List<Integer> values) {
            addCriterion("clue_num in", values, "clueNum");
            return (Criteria) this;
        }

        public Criteria andClueNumNotIn(List<Integer> values) {
            addCriterion("clue_num not in", values, "clueNum");
            return (Criteria) this;
        }

        public Criteria andClueNumBetween(Integer value1, Integer value2) {
            addCriterion("clue_num between", value1, value2, "clueNum");
            return (Criteria) this;
        }

        public Criteria andClueNumNotBetween(Integer value1, Integer value2) {
            addCriterion("clue_num not between", value1, value2, "clueNum");
            return (Criteria) this;
        }

        public Criteria andCompleteNumIsNull() {
            addCriterion("complete_num is null");
            return (Criteria) this;
        }

        public Criteria andCompleteNumIsNotNull() {
            addCriterion("complete_num is not null");
            return (Criteria) this;
        }

        public Criteria andCompleteNumEqualTo(Integer value) {
            addCriterion("complete_num =", value, "completeNum");
            return (Criteria) this;
        }

        public Criteria andCompleteNumNotEqualTo(Integer value) {
            addCriterion("complete_num <>", value, "completeNum");
            return (Criteria) this;
        }

        public Criteria andCompleteNumGreaterThan(Integer value) {
            addCriterion("complete_num >", value, "completeNum");
            return (Criteria) this;
        }

        public Criteria andCompleteNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("complete_num >=", value, "completeNum");
            return (Criteria) this;
        }

        public Criteria andCompleteNumLessThan(Integer value) {
            addCriterion("complete_num <", value, "completeNum");
            return (Criteria) this;
        }

        public Criteria andCompleteNumLessThanOrEqualTo(Integer value) {
            addCriterion("complete_num <=", value, "completeNum");
            return (Criteria) this;
        }

        public Criteria andCompleteNumIn(List<Integer> values) {
            addCriterion("complete_num in", values, "completeNum");
            return (Criteria) this;
        }

        public Criteria andCompleteNumNotIn(List<Integer> values) {
            addCriterion("complete_num not in", values, "completeNum");
            return (Criteria) this;
        }

        public Criteria andCompleteNumBetween(Integer value1, Integer value2) {
            addCriterion("complete_num between", value1, value2, "completeNum");
            return (Criteria) this;
        }

        public Criteria andCompleteNumNotBetween(Integer value1, Integer value2) {
            addCriterion("complete_num not between", value1, value2, "completeNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumIsNull() {
            addCriterion("order_num is null");
            return (Criteria) this;
        }

        public Criteria andOrderNumIsNotNull() {
            addCriterion("order_num is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNumEqualTo(Integer value) {
            addCriterion("order_num =", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotEqualTo(Integer value) {
            addCriterion("order_num <>", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumGreaterThan(Integer value) {
            addCriterion("order_num >", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_num >=", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLessThan(Integer value) {
            addCriterion("order_num <", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLessThanOrEqualTo(Integer value) {
            addCriterion("order_num <=", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumIn(List<Integer> values) {
            addCriterion("order_num in", values, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotIn(List<Integer> values) {
            addCriterion("order_num not in", values, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumBetween(Integer value1, Integer value2) {
            addCriterion("order_num between", value1, value2, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotBetween(Integer value1, Integer value2) {
            addCriterion("order_num not between", value1, value2, "orderNum");
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

