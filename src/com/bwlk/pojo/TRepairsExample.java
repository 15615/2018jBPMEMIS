package com.bwlk.pojo;

import java.util.ArrayList;
import java.util.List;

public class TRepairsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TRepairsExample() {
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

        public Criteria andRepairidIsNull() {
            addCriterion("repairId is null");
            return (Criteria) this;
        }

        public Criteria andRepairidIsNotNull() {
            addCriterion("repairId is not null");
            return (Criteria) this;
        }

        public Criteria andRepairidEqualTo(Integer value) {
            addCriterion("repairId =", value, "repairid");
            return (Criteria) this;
        }

        public Criteria andRepairidNotEqualTo(Integer value) {
            addCriterion("repairId <>", value, "repairid");
            return (Criteria) this;
        }

        public Criteria andRepairidGreaterThan(Integer value) {
            addCriterion("repairId >", value, "repairid");
            return (Criteria) this;
        }

        public Criteria andRepairidGreaterThanOrEqualTo(Integer value) {
            addCriterion("repairId >=", value, "repairid");
            return (Criteria) this;
        }

        public Criteria andRepairidLessThan(Integer value) {
            addCriterion("repairId <", value, "repairid");
            return (Criteria) this;
        }

        public Criteria andRepairidLessThanOrEqualTo(Integer value) {
            addCriterion("repairId <=", value, "repairid");
            return (Criteria) this;
        }

        public Criteria andRepairidIn(List<Integer> values) {
            addCriterion("repairId in", values, "repairid");
            return (Criteria) this;
        }

        public Criteria andRepairidNotIn(List<Integer> values) {
            addCriterion("repairId not in", values, "repairid");
            return (Criteria) this;
        }

        public Criteria andRepairidBetween(Integer value1, Integer value2) {
            addCriterion("repairId between", value1, value2, "repairid");
            return (Criteria) this;
        }

        public Criteria andRepairidNotBetween(Integer value1, Integer value2) {
            addCriterion("repairId not between", value1, value2, "repairid");
            return (Criteria) this;
        }

        public Criteria andDormbuildnameIsNull() {
            addCriterion("dormBuildName is null");
            return (Criteria) this;
        }

        public Criteria andDormbuildnameIsNotNull() {
            addCriterion("dormBuildName is not null");
            return (Criteria) this;
        }

        public Criteria andDormbuildnameEqualTo(String value) {
            addCriterion("dormBuildName =", value, "dormbuildname");
            return (Criteria) this;
        }

        public Criteria andDormbuildnameNotEqualTo(String value) {
            addCriterion("dormBuildName <>", value, "dormbuildname");
            return (Criteria) this;
        }

        public Criteria andDormbuildnameGreaterThan(String value) {
            addCriterion("dormBuildName >", value, "dormbuildname");
            return (Criteria) this;
        }

        public Criteria andDormbuildnameGreaterThanOrEqualTo(String value) {
            addCriterion("dormBuildName >=", value, "dormbuildname");
            return (Criteria) this;
        }

        public Criteria andDormbuildnameLessThan(String value) {
            addCriterion("dormBuildName <", value, "dormbuildname");
            return (Criteria) this;
        }

        public Criteria andDormbuildnameLessThanOrEqualTo(String value) {
            addCriterion("dormBuildName <=", value, "dormbuildname");
            return (Criteria) this;
        }

        public Criteria andDormbuildnameLike(String value) {
            addCriterion("dormBuildName like", value, "dormbuildname");
            return (Criteria) this;
        }

        public Criteria andDormbuildnameNotLike(String value) {
            addCriterion("dormBuildName not like", value, "dormbuildname");
            return (Criteria) this;
        }

        public Criteria andDormbuildnameIn(List<String> values) {
            addCriterion("dormBuildName in", values, "dormbuildname");
            return (Criteria) this;
        }

        public Criteria andDormbuildnameNotIn(List<String> values) {
            addCriterion("dormBuildName not in", values, "dormbuildname");
            return (Criteria) this;
        }

        public Criteria andDormbuildnameBetween(String value1, String value2) {
            addCriterion("dormBuildName between", value1, value2, "dormbuildname");
            return (Criteria) this;
        }

        public Criteria andDormbuildnameNotBetween(String value1, String value2) {
            addCriterion("dormBuildName not between", value1, value2, "dormbuildname");
            return (Criteria) this;
        }

        public Criteria andDormnameIsNull() {
            addCriterion("dormName is null");
            return (Criteria) this;
        }

        public Criteria andDormnameIsNotNull() {
            addCriterion("dormName is not null");
            return (Criteria) this;
        }

        public Criteria andDormnameEqualTo(Integer value) {
            addCriterion("dormName =", value, "dormname");
            return (Criteria) this;
        }

        public Criteria andDormnameNotEqualTo(Integer value) {
            addCriterion("dormName <>", value, "dormname");
            return (Criteria) this;
        }

        public Criteria andDormnameGreaterThan(Integer value) {
            addCriterion("dormName >", value, "dormname");
            return (Criteria) this;
        }

        public Criteria andDormnameGreaterThanOrEqualTo(Integer value) {
            addCriterion("dormName >=", value, "dormname");
            return (Criteria) this;
        }

        public Criteria andDormnameLessThan(Integer value) {
            addCriterion("dormName <", value, "dormname");
            return (Criteria) this;
        }

        public Criteria andDormnameLessThanOrEqualTo(Integer value) {
            addCriterion("dormName <=", value, "dormname");
            return (Criteria) this;
        }

        public Criteria andDormnameIn(List<Integer> values) {
            addCriterion("dormName in", values, "dormname");
            return (Criteria) this;
        }

        public Criteria andDormnameNotIn(List<Integer> values) {
            addCriterion("dormName not in", values, "dormname");
            return (Criteria) this;
        }

        public Criteria andDormnameBetween(Integer value1, Integer value2) {
            addCriterion("dormName between", value1, value2, "dormname");
            return (Criteria) this;
        }

        public Criteria andDormnameNotBetween(Integer value1, Integer value2) {
            addCriterion("dormName not between", value1, value2, "dormname");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andAnswerIsNull() {
            addCriterion("answer is null");
            return (Criteria) this;
        }

        public Criteria andAnswerIsNotNull() {
            addCriterion("answer is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerEqualTo(String value) {
            addCriterion("answer =", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotEqualTo(String value) {
            addCriterion("answer <>", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerGreaterThan(String value) {
            addCriterion("answer >", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("answer >=", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLessThan(String value) {
            addCriterion("answer <", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLessThanOrEqualTo(String value) {
            addCriterion("answer <=", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLike(String value) {
            addCriterion("answer like", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotLike(String value) {
            addCriterion("answer not like", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerIn(List<String> values) {
            addCriterion("answer in", values, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotIn(List<String> values) {
            addCriterion("answer not in", values, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerBetween(String value1, String value2) {
            addCriterion("answer between", value1, value2, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotBetween(String value1, String value2) {
            addCriterion("answer not between", value1, value2, "answer");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("flag is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("flag is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(Integer value) {
            addCriterion("flag =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(Integer value) {
            addCriterion("flag <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(Integer value) {
            addCriterion("flag >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("flag >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(Integer value) {
            addCriterion("flag <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(Integer value) {
            addCriterion("flag <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<Integer> values) {
            addCriterion("flag in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<Integer> values) {
            addCriterion("flag not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(Integer value1, Integer value2) {
            addCriterion("flag between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("flag not between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andRepairtelIsNull() {
            addCriterion("repairTel is null");
            return (Criteria) this;
        }

        public Criteria andRepairtelIsNotNull() {
            addCriterion("repairTel is not null");
            return (Criteria) this;
        }

        public Criteria andRepairtelEqualTo(Integer value) {
            addCriterion("repairTel =", value, "repairtel");
            return (Criteria) this;
        }

        public Criteria andRepairtelNotEqualTo(Integer value) {
            addCriterion("repairTel <>", value, "repairtel");
            return (Criteria) this;
        }

        public Criteria andRepairtelGreaterThan(Integer value) {
            addCriterion("repairTel >", value, "repairtel");
            return (Criteria) this;
        }

        public Criteria andRepairtelGreaterThanOrEqualTo(Integer value) {
            addCriterion("repairTel >=", value, "repairtel");
            return (Criteria) this;
        }

        public Criteria andRepairtelLessThan(Integer value) {
            addCriterion("repairTel <", value, "repairtel");
            return (Criteria) this;
        }

        public Criteria andRepairtelLessThanOrEqualTo(Integer value) {
            addCriterion("repairTel <=", value, "repairtel");
            return (Criteria) this;
        }

        public Criteria andRepairtelIn(List<Integer> values) {
            addCriterion("repairTel in", values, "repairtel");
            return (Criteria) this;
        }

        public Criteria andRepairtelNotIn(List<Integer> values) {
            addCriterion("repairTel not in", values, "repairtel");
            return (Criteria) this;
        }

        public Criteria andRepairtelBetween(Integer value1, Integer value2) {
            addCriterion("repairTel between", value1, value2, "repairtel");
            return (Criteria) this;
        }

        public Criteria andRepairtelNotBetween(Integer value1, Integer value2) {
            addCriterion("repairTel not between", value1, value2, "repairtel");
            return (Criteria) this;
        }

        public Criteria andMarksIsNull() {
            addCriterion("marks is null");
            return (Criteria) this;
        }

        public Criteria andMarksIsNotNull() {
            addCriterion("marks is not null");
            return (Criteria) this;
        }

        public Criteria andMarksEqualTo(String value) {
            addCriterion("marks =", value, "marks");
            return (Criteria) this;
        }

        public Criteria andMarksNotEqualTo(String value) {
            addCriterion("marks <>", value, "marks");
            return (Criteria) this;
        }

        public Criteria andMarksGreaterThan(String value) {
            addCriterion("marks >", value, "marks");
            return (Criteria) this;
        }

        public Criteria andMarksGreaterThanOrEqualTo(String value) {
            addCriterion("marks >=", value, "marks");
            return (Criteria) this;
        }

        public Criteria andMarksLessThan(String value) {
            addCriterion("marks <", value, "marks");
            return (Criteria) this;
        }

        public Criteria andMarksLessThanOrEqualTo(String value) {
            addCriterion("marks <=", value, "marks");
            return (Criteria) this;
        }

        public Criteria andMarksLike(String value) {
            addCriterion("marks like", value, "marks");
            return (Criteria) this;
        }

        public Criteria andMarksNotLike(String value) {
            addCriterion("marks not like", value, "marks");
            return (Criteria) this;
        }

        public Criteria andMarksIn(List<String> values) {
            addCriterion("marks in", values, "marks");
            return (Criteria) this;
        }

        public Criteria andMarksNotIn(List<String> values) {
            addCriterion("marks not in", values, "marks");
            return (Criteria) this;
        }

        public Criteria andMarksBetween(String value1, String value2) {
            addCriterion("marks between", value1, value2, "marks");
            return (Criteria) this;
        }

        public Criteria andMarksNotBetween(String value1, String value2) {
            addCriterion("marks not between", value1, value2, "marks");
            return (Criteria) this;
        }

        public Criteria andAssessIsNull() {
            addCriterion("assess is null");
            return (Criteria) this;
        }

        public Criteria andAssessIsNotNull() {
            addCriterion("assess is not null");
            return (Criteria) this;
        }

        public Criteria andAssessEqualTo(String value) {
            addCriterion("assess =", value, "assess");
            return (Criteria) this;
        }

        public Criteria andAssessNotEqualTo(String value) {
            addCriterion("assess <>", value, "assess");
            return (Criteria) this;
        }

        public Criteria andAssessGreaterThan(String value) {
            addCriterion("assess >", value, "assess");
            return (Criteria) this;
        }

        public Criteria andAssessGreaterThanOrEqualTo(String value) {
            addCriterion("assess >=", value, "assess");
            return (Criteria) this;
        }

        public Criteria andAssessLessThan(String value) {
            addCriterion("assess <", value, "assess");
            return (Criteria) this;
        }

        public Criteria andAssessLessThanOrEqualTo(String value) {
            addCriterion("assess <=", value, "assess");
            return (Criteria) this;
        }

        public Criteria andAssessLike(String value) {
            addCriterion("assess like", value, "assess");
            return (Criteria) this;
        }

        public Criteria andAssessNotLike(String value) {
            addCriterion("assess not like", value, "assess");
            return (Criteria) this;
        }

        public Criteria andAssessIn(List<String> values) {
            addCriterion("assess in", values, "assess");
            return (Criteria) this;
        }

        public Criteria andAssessNotIn(List<String> values) {
            addCriterion("assess not in", values, "assess");
            return (Criteria) this;
        }

        public Criteria andAssessBetween(String value1, String value2) {
            addCriterion("assess between", value1, value2, "assess");
            return (Criteria) this;
        }

        public Criteria andAssessNotBetween(String value1, String value2) {
            addCriterion("assess not between", value1, value2, "assess");
            return (Criteria) this;
        }

        public Criteria andRepairerIsNull() {
            addCriterion("repairer is null");
            return (Criteria) this;
        }

        public Criteria andRepairerIsNotNull() {
            addCriterion("repairer is not null");
            return (Criteria) this;
        }

        public Criteria andRepairerEqualTo(String value) {
            addCriterion("repairer =", value, "repairer");
            return (Criteria) this;
        }

        public Criteria andRepairerNotEqualTo(String value) {
            addCriterion("repairer <>", value, "repairer");
            return (Criteria) this;
        }

        public Criteria andRepairerGreaterThan(String value) {
            addCriterion("repairer >", value, "repairer");
            return (Criteria) this;
        }

        public Criteria andRepairerGreaterThanOrEqualTo(String value) {
            addCriterion("repairer >=", value, "repairer");
            return (Criteria) this;
        }

        public Criteria andRepairerLessThan(String value) {
            addCriterion("repairer <", value, "repairer");
            return (Criteria) this;
        }

        public Criteria andRepairerLessThanOrEqualTo(String value) {
            addCriterion("repairer <=", value, "repairer");
            return (Criteria) this;
        }

        public Criteria andRepairerLike(String value) {
            addCriterion("repairer like", value, "repairer");
            return (Criteria) this;
        }

        public Criteria andRepairerNotLike(String value) {
            addCriterion("repairer not like", value, "repairer");
            return (Criteria) this;
        }

        public Criteria andRepairerIn(List<String> values) {
            addCriterion("repairer in", values, "repairer");
            return (Criteria) this;
        }

        public Criteria andRepairerNotIn(List<String> values) {
            addCriterion("repairer not in", values, "repairer");
            return (Criteria) this;
        }

        public Criteria andRepairerBetween(String value1, String value2) {
            addCriterion("repairer between", value1, value2, "repairer");
            return (Criteria) this;
        }

        public Criteria andRepairerNotBetween(String value1, String value2) {
            addCriterion("repairer not between", value1, value2, "repairer");
            return (Criteria) this;
        }

        public Criteria andPiidIsNull() {
            addCriterion("piId is null");
            return (Criteria) this;
        }

        public Criteria andPiidIsNotNull() {
            addCriterion("piId is not null");
            return (Criteria) this;
        }

        public Criteria andPiidEqualTo(String value) {
            addCriterion("piId =", value, "piid");
            return (Criteria) this;
        }

        public Criteria andPiidNotEqualTo(String value) {
            addCriterion("piId <>", value, "piid");
            return (Criteria) this;
        }

        public Criteria andPiidGreaterThan(String value) {
            addCriterion("piId >", value, "piid");
            return (Criteria) this;
        }

        public Criteria andPiidGreaterThanOrEqualTo(String value) {
            addCriterion("piId >=", value, "piid");
            return (Criteria) this;
        }

        public Criteria andPiidLessThan(String value) {
            addCriterion("piId <", value, "piid");
            return (Criteria) this;
        }

        public Criteria andPiidLessThanOrEqualTo(String value) {
            addCriterion("piId <=", value, "piid");
            return (Criteria) this;
        }

        public Criteria andPiidLike(String value) {
            addCriterion("piId like", value, "piid");
            return (Criteria) this;
        }

        public Criteria andPiidNotLike(String value) {
            addCriterion("piId not like", value, "piid");
            return (Criteria) this;
        }

        public Criteria andPiidIn(List<String> values) {
            addCriterion("piId in", values, "piid");
            return (Criteria) this;
        }

        public Criteria andPiidNotIn(List<String> values) {
            addCriterion("piId not in", values, "piid");
            return (Criteria) this;
        }

        public Criteria andPiidBetween(String value1, String value2) {
            addCriterion("piId between", value1, value2, "piid");
            return (Criteria) this;
        }

        public Criteria andPiidNotBetween(String value1, String value2) {
            addCriterion("piId not between", value1, value2, "piid");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
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