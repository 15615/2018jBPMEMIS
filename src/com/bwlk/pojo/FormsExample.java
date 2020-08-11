package com.bwlk.pojo;

import java.util.ArrayList;
import java.util.List;

public class FormsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FormsExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andProcessinstanceidIsNull() {
            addCriterion("processInstanceId is null");
            return (Criteria) this;
        }

        public Criteria andProcessinstanceidIsNotNull() {
            addCriterion("processInstanceId is not null");
            return (Criteria) this;
        }

        public Criteria andProcessinstanceidEqualTo(String value) {
            addCriterion("processInstanceId =", value, "processinstanceid");
            return (Criteria) this;
        }

        public Criteria andProcessinstanceidNotEqualTo(String value) {
            addCriterion("processInstanceId <>", value, "processinstanceid");
            return (Criteria) this;
        }

        public Criteria andProcessinstanceidGreaterThan(String value) {
            addCriterion("processInstanceId >", value, "processinstanceid");
            return (Criteria) this;
        }

        public Criteria andProcessinstanceidGreaterThanOrEqualTo(String value) {
            addCriterion("processInstanceId >=", value, "processinstanceid");
            return (Criteria) this;
        }

        public Criteria andProcessinstanceidLessThan(String value) {
            addCriterion("processInstanceId <", value, "processinstanceid");
            return (Criteria) this;
        }

        public Criteria andProcessinstanceidLessThanOrEqualTo(String value) {
            addCriterion("processInstanceId <=", value, "processinstanceid");
            return (Criteria) this;
        }

        public Criteria andProcessinstanceidLike(String value) {
            addCriterion("processInstanceId like", value, "processinstanceid");
            return (Criteria) this;
        }

        public Criteria andProcessinstanceidNotLike(String value) {
            addCriterion("processInstanceId not like", value, "processinstanceid");
            return (Criteria) this;
        }

        public Criteria andProcessinstanceidIn(List<String> values) {
            addCriterion("processInstanceId in", values, "processinstanceid");
            return (Criteria) this;
        }

        public Criteria andProcessinstanceidNotIn(List<String> values) {
            addCriterion("processInstanceId not in", values, "processinstanceid");
            return (Criteria) this;
        }

        public Criteria andProcessinstanceidBetween(String value1, String value2) {
            addCriterion("processInstanceId between", value1, value2, "processinstanceid");
            return (Criteria) this;
        }

        public Criteria andProcessinstanceidNotBetween(String value1, String value2) {
            addCriterion("processInstanceId not between", value1, value2, "processinstanceid");
            return (Criteria) this;
        }

        public Criteria andProcessdidIsNull() {
            addCriterion("processdId is null");
            return (Criteria) this;
        }

        public Criteria andProcessdidIsNotNull() {
            addCriterion("processdId is not null");
            return (Criteria) this;
        }

        public Criteria andProcessdidEqualTo(String value) {
            addCriterion("processdId =", value, "processdid");
            return (Criteria) this;
        }

        public Criteria andProcessdidNotEqualTo(String value) {
            addCriterion("processdId <>", value, "processdid");
            return (Criteria) this;
        }

        public Criteria andProcessdidGreaterThan(String value) {
            addCriterion("processdId >", value, "processdid");
            return (Criteria) this;
        }

        public Criteria andProcessdidGreaterThanOrEqualTo(String value) {
            addCriterion("processdId >=", value, "processdid");
            return (Criteria) this;
        }

        public Criteria andProcessdidLessThan(String value) {
            addCriterion("processdId <", value, "processdid");
            return (Criteria) this;
        }

        public Criteria andProcessdidLessThanOrEqualTo(String value) {
            addCriterion("processdId <=", value, "processdid");
            return (Criteria) this;
        }

        public Criteria andProcessdidLike(String value) {
            addCriterion("processdId like", value, "processdid");
            return (Criteria) this;
        }

        public Criteria andProcessdidNotLike(String value) {
            addCriterion("processdId not like", value, "processdid");
            return (Criteria) this;
        }

        public Criteria andProcessdidIn(List<String> values) {
            addCriterion("processdId in", values, "processdid");
            return (Criteria) this;
        }

        public Criteria andProcessdidNotIn(List<String> values) {
            addCriterion("processdId not in", values, "processdid");
            return (Criteria) this;
        }

        public Criteria andProcessdidBetween(String value1, String value2) {
            addCriterion("processdId between", value1, value2, "processdid");
            return (Criteria) this;
        }

        public Criteria andProcessdidNotBetween(String value1, String value2) {
            addCriterion("processdId not between", value1, value2, "processdid");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
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

        public Criteria andLouIsNull() {
            addCriterion("lou is null");
            return (Criteria) this;
        }

        public Criteria andLouIsNotNull() {
            addCriterion("lou is not null");
            return (Criteria) this;
        }

        public Criteria andLouEqualTo(String value) {
            addCriterion("lou =", value, "lou");
            return (Criteria) this;
        }

        public Criteria andLouNotEqualTo(String value) {
            addCriterion("lou <>", value, "lou");
            return (Criteria) this;
        }

        public Criteria andLouGreaterThan(String value) {
            addCriterion("lou >", value, "lou");
            return (Criteria) this;
        }

        public Criteria andLouGreaterThanOrEqualTo(String value) {
            addCriterion("lou >=", value, "lou");
            return (Criteria) this;
        }

        public Criteria andLouLessThan(String value) {
            addCriterion("lou <", value, "lou");
            return (Criteria) this;
        }

        public Criteria andLouLessThanOrEqualTo(String value) {
            addCriterion("lou <=", value, "lou");
            return (Criteria) this;
        }

        public Criteria andLouLike(String value) {
            addCriterion("lou like", value, "lou");
            return (Criteria) this;
        }

        public Criteria andLouNotLike(String value) {
            addCriterion("lou not like", value, "lou");
            return (Criteria) this;
        }

        public Criteria andLouIn(List<String> values) {
            addCriterion("lou in", values, "lou");
            return (Criteria) this;
        }

        public Criteria andLouNotIn(List<String> values) {
            addCriterion("lou not in", values, "lou");
            return (Criteria) this;
        }

        public Criteria andLouBetween(String value1, String value2) {
            addCriterion("lou between", value1, value2, "lou");
            return (Criteria) this;
        }

        public Criteria andLouNotBetween(String value1, String value2) {
            addCriterion("lou not between", value1, value2, "lou");
            return (Criteria) this;
        }

        public Criteria andSusheidIsNull() {
            addCriterion("susheId is null");
            return (Criteria) this;
        }

        public Criteria andSusheidIsNotNull() {
            addCriterion("susheId is not null");
            return (Criteria) this;
        }

        public Criteria andSusheidEqualTo(String value) {
            addCriterion("susheId =", value, "susheid");
            return (Criteria) this;
        }

        public Criteria andSusheidNotEqualTo(String value) {
            addCriterion("susheId <>", value, "susheid");
            return (Criteria) this;
        }

        public Criteria andSusheidGreaterThan(String value) {
            addCriterion("susheId >", value, "susheid");
            return (Criteria) this;
        }

        public Criteria andSusheidGreaterThanOrEqualTo(String value) {
            addCriterion("susheId >=", value, "susheid");
            return (Criteria) this;
        }

        public Criteria andSusheidLessThan(String value) {
            addCriterion("susheId <", value, "susheid");
            return (Criteria) this;
        }

        public Criteria andSusheidLessThanOrEqualTo(String value) {
            addCriterion("susheId <=", value, "susheid");
            return (Criteria) this;
        }

        public Criteria andSusheidLike(String value) {
            addCriterion("susheId like", value, "susheid");
            return (Criteria) this;
        }

        public Criteria andSusheidNotLike(String value) {
            addCriterion("susheId not like", value, "susheid");
            return (Criteria) this;
        }

        public Criteria andSusheidIn(List<String> values) {
            addCriterion("susheId in", values, "susheid");
            return (Criteria) this;
        }

        public Criteria andSusheidNotIn(List<String> values) {
            addCriterion("susheId not in", values, "susheid");
            return (Criteria) this;
        }

        public Criteria andSusheidBetween(String value1, String value2) {
            addCriterion("susheId between", value1, value2, "susheid");
            return (Criteria) this;
        }

        public Criteria andSusheidNotBetween(String value1, String value2) {
            addCriterion("susheId not between", value1, value2, "susheid");
            return (Criteria) this;
        }

        public Criteria andClassesIsNull() {
            addCriterion("classes is null");
            return (Criteria) this;
        }

        public Criteria andClassesIsNotNull() {
            addCriterion("classes is not null");
            return (Criteria) this;
        }

        public Criteria andClassesEqualTo(String value) {
            addCriterion("classes =", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesNotEqualTo(String value) {
            addCriterion("classes <>", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesGreaterThan(String value) {
            addCriterion("classes >", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesGreaterThanOrEqualTo(String value) {
            addCriterion("classes >=", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesLessThan(String value) {
            addCriterion("classes <", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesLessThanOrEqualTo(String value) {
            addCriterion("classes <=", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesLike(String value) {
            addCriterion("classes like", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesNotLike(String value) {
            addCriterion("classes not like", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesIn(List<String> values) {
            addCriterion("classes in", values, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesNotIn(List<String> values) {
            addCriterion("classes not in", values, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesBetween(String value1, String value2) {
            addCriterion("classes between", value1, value2, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesNotBetween(String value1, String value2) {
            addCriterion("classes not between", value1, value2, "classes");
            return (Criteria) this;
        }

        public Criteria andReasonIsNull() {
            addCriterion("reason is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("reason is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("reason =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("reason <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("reason >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("reason >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("reason <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("reason <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("reason like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("reason not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<String> values) {
            addCriterion("reason in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("reason not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("reason between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("reason not between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andHuifu1IsNull() {
            addCriterion("huifu1 is null");
            return (Criteria) this;
        }

        public Criteria andHuifu1IsNotNull() {
            addCriterion("huifu1 is not null");
            return (Criteria) this;
        }

        public Criteria andHuifu1EqualTo(String value) {
            addCriterion("huifu1 =", value, "huifu1");
            return (Criteria) this;
        }

        public Criteria andHuifu1NotEqualTo(String value) {
            addCriterion("huifu1 <>", value, "huifu1");
            return (Criteria) this;
        }

        public Criteria andHuifu1GreaterThan(String value) {
            addCriterion("huifu1 >", value, "huifu1");
            return (Criteria) this;
        }

        public Criteria andHuifu1GreaterThanOrEqualTo(String value) {
            addCriterion("huifu1 >=", value, "huifu1");
            return (Criteria) this;
        }

        public Criteria andHuifu1LessThan(String value) {
            addCriterion("huifu1 <", value, "huifu1");
            return (Criteria) this;
        }

        public Criteria andHuifu1LessThanOrEqualTo(String value) {
            addCriterion("huifu1 <=", value, "huifu1");
            return (Criteria) this;
        }

        public Criteria andHuifu1Like(String value) {
            addCriterion("huifu1 like", value, "huifu1");
            return (Criteria) this;
        }

        public Criteria andHuifu1NotLike(String value) {
            addCriterion("huifu1 not like", value, "huifu1");
            return (Criteria) this;
        }

        public Criteria andHuifu1In(List<String> values) {
            addCriterion("huifu1 in", values, "huifu1");
            return (Criteria) this;
        }

        public Criteria andHuifu1NotIn(List<String> values) {
            addCriterion("huifu1 not in", values, "huifu1");
            return (Criteria) this;
        }

        public Criteria andHuifu1Between(String value1, String value2) {
            addCriterion("huifu1 between", value1, value2, "huifu1");
            return (Criteria) this;
        }

        public Criteria andHuifu1NotBetween(String value1, String value2) {
            addCriterion("huifu1 not between", value1, value2, "huifu1");
            return (Criteria) this;
        }

        public Criteria andHuifu2IsNull() {
            addCriterion("huifu2 is null");
            return (Criteria) this;
        }

        public Criteria andHuifu2IsNotNull() {
            addCriterion("huifu2 is not null");
            return (Criteria) this;
        }

        public Criteria andHuifu2EqualTo(String value) {
            addCriterion("huifu2 =", value, "huifu2");
            return (Criteria) this;
        }

        public Criteria andHuifu2NotEqualTo(String value) {
            addCriterion("huifu2 <>", value, "huifu2");
            return (Criteria) this;
        }

        public Criteria andHuifu2GreaterThan(String value) {
            addCriterion("huifu2 >", value, "huifu2");
            return (Criteria) this;
        }

        public Criteria andHuifu2GreaterThanOrEqualTo(String value) {
            addCriterion("huifu2 >=", value, "huifu2");
            return (Criteria) this;
        }

        public Criteria andHuifu2LessThan(String value) {
            addCriterion("huifu2 <", value, "huifu2");
            return (Criteria) this;
        }

        public Criteria andHuifu2LessThanOrEqualTo(String value) {
            addCriterion("huifu2 <=", value, "huifu2");
            return (Criteria) this;
        }

        public Criteria andHuifu2Like(String value) {
            addCriterion("huifu2 like", value, "huifu2");
            return (Criteria) this;
        }

        public Criteria andHuifu2NotLike(String value) {
            addCriterion("huifu2 not like", value, "huifu2");
            return (Criteria) this;
        }

        public Criteria andHuifu2In(List<String> values) {
            addCriterion("huifu2 in", values, "huifu2");
            return (Criteria) this;
        }

        public Criteria andHuifu2NotIn(List<String> values) {
            addCriterion("huifu2 not in", values, "huifu2");
            return (Criteria) this;
        }

        public Criteria andHuifu2Between(String value1, String value2) {
            addCriterion("huifu2 between", value1, value2, "huifu2");
            return (Criteria) this;
        }

        public Criteria andHuifu2NotBetween(String value1, String value2) {
            addCriterion("huifu2 not between", value1, value2, "huifu2");
            return (Criteria) this;
        }

        public Criteria andHuifu3IsNull() {
            addCriterion("huifu3 is null");
            return (Criteria) this;
        }

        public Criteria andHuifu3IsNotNull() {
            addCriterion("huifu3 is not null");
            return (Criteria) this;
        }

        public Criteria andHuifu3EqualTo(String value) {
            addCriterion("huifu3 =", value, "huifu3");
            return (Criteria) this;
        }

        public Criteria andHuifu3NotEqualTo(String value) {
            addCriterion("huifu3 <>", value, "huifu3");
            return (Criteria) this;
        }

        public Criteria andHuifu3GreaterThan(String value) {
            addCriterion("huifu3 >", value, "huifu3");
            return (Criteria) this;
        }

        public Criteria andHuifu3GreaterThanOrEqualTo(String value) {
            addCriterion("huifu3 >=", value, "huifu3");
            return (Criteria) this;
        }

        public Criteria andHuifu3LessThan(String value) {
            addCriterion("huifu3 <", value, "huifu3");
            return (Criteria) this;
        }

        public Criteria andHuifu3LessThanOrEqualTo(String value) {
            addCriterion("huifu3 <=", value, "huifu3");
            return (Criteria) this;
        }

        public Criteria andHuifu3Like(String value) {
            addCriterion("huifu3 like", value, "huifu3");
            return (Criteria) this;
        }

        public Criteria andHuifu3NotLike(String value) {
            addCriterion("huifu3 not like", value, "huifu3");
            return (Criteria) this;
        }

        public Criteria andHuifu3In(List<String> values) {
            addCriterion("huifu3 in", values, "huifu3");
            return (Criteria) this;
        }

        public Criteria andHuifu3NotIn(List<String> values) {
            addCriterion("huifu3 not in", values, "huifu3");
            return (Criteria) this;
        }

        public Criteria andHuifu3Between(String value1, String value2) {
            addCriterion("huifu3 between", value1, value2, "huifu3");
            return (Criteria) this;
        }

        public Criteria andHuifu3NotBetween(String value1, String value2) {
            addCriterion("huifu3 not between", value1, value2, "huifu3");
            return (Criteria) this;
        }

        public Criteria andStatesIsNull() {
            addCriterion("states is null");
            return (Criteria) this;
        }

        public Criteria andStatesIsNotNull() {
            addCriterion("states is not null");
            return (Criteria) this;
        }

        public Criteria andStatesEqualTo(Integer value) {
            addCriterion("states =", value, "states");
            return (Criteria) this;
        }

        public Criteria andStatesNotEqualTo(Integer value) {
            addCriterion("states <>", value, "states");
            return (Criteria) this;
        }

        public Criteria andStatesGreaterThan(Integer value) {
            addCriterion("states >", value, "states");
            return (Criteria) this;
        }

        public Criteria andStatesGreaterThanOrEqualTo(Integer value) {
            addCriterion("states >=", value, "states");
            return (Criteria) this;
        }

        public Criteria andStatesLessThan(Integer value) {
            addCriterion("states <", value, "states");
            return (Criteria) this;
        }

        public Criteria andStatesLessThanOrEqualTo(Integer value) {
            addCriterion("states <=", value, "states");
            return (Criteria) this;
        }

        public Criteria andStatesIn(List<Integer> values) {
            addCriterion("states in", values, "states");
            return (Criteria) this;
        }

        public Criteria andStatesNotIn(List<Integer> values) {
            addCriterion("states not in", values, "states");
            return (Criteria) this;
        }

        public Criteria andStatesBetween(Integer value1, Integer value2) {
            addCriterion("states between", value1, value2, "states");
            return (Criteria) this;
        }

        public Criteria andStatesNotBetween(Integer value1, Integer value2) {
            addCriterion("states not between", value1, value2, "states");
            return (Criteria) this;
        }

        public Criteria andBeizhu1IsNull() {
            addCriterion("beizhu1 is null");
            return (Criteria) this;
        }

        public Criteria andBeizhu1IsNotNull() {
            addCriterion("beizhu1 is not null");
            return (Criteria) this;
        }

        public Criteria andBeizhu1EqualTo(String value) {
            addCriterion("beizhu1 =", value, "beizhu1");
            return (Criteria) this;
        }

        public Criteria andBeizhu1NotEqualTo(String value) {
            addCriterion("beizhu1 <>", value, "beizhu1");
            return (Criteria) this;
        }

        public Criteria andBeizhu1GreaterThan(String value) {
            addCriterion("beizhu1 >", value, "beizhu1");
            return (Criteria) this;
        }

        public Criteria andBeizhu1GreaterThanOrEqualTo(String value) {
            addCriterion("beizhu1 >=", value, "beizhu1");
            return (Criteria) this;
        }

        public Criteria andBeizhu1LessThan(String value) {
            addCriterion("beizhu1 <", value, "beizhu1");
            return (Criteria) this;
        }

        public Criteria andBeizhu1LessThanOrEqualTo(String value) {
            addCriterion("beizhu1 <=", value, "beizhu1");
            return (Criteria) this;
        }

        public Criteria andBeizhu1Like(String value) {
            addCriterion("beizhu1 like", value, "beizhu1");
            return (Criteria) this;
        }

        public Criteria andBeizhu1NotLike(String value) {
            addCriterion("beizhu1 not like", value, "beizhu1");
            return (Criteria) this;
        }

        public Criteria andBeizhu1In(List<String> values) {
            addCriterion("beizhu1 in", values, "beizhu1");
            return (Criteria) this;
        }

        public Criteria andBeizhu1NotIn(List<String> values) {
            addCriterion("beizhu1 not in", values, "beizhu1");
            return (Criteria) this;
        }

        public Criteria andBeizhu1Between(String value1, String value2) {
            addCriterion("beizhu1 between", value1, value2, "beizhu1");
            return (Criteria) this;
        }

        public Criteria andBeizhu1NotBetween(String value1, String value2) {
            addCriterion("beizhu1 not between", value1, value2, "beizhu1");
            return (Criteria) this;
        }

        public Criteria andBeizhu2IsNull() {
            addCriterion("beizhu2 is null");
            return (Criteria) this;
        }

        public Criteria andBeizhu2IsNotNull() {
            addCriterion("beizhu2 is not null");
            return (Criteria) this;
        }

        public Criteria andBeizhu2EqualTo(String value) {
            addCriterion("beizhu2 =", value, "beizhu2");
            return (Criteria) this;
        }

        public Criteria andBeizhu2NotEqualTo(String value) {
            addCriterion("beizhu2 <>", value, "beizhu2");
            return (Criteria) this;
        }

        public Criteria andBeizhu2GreaterThan(String value) {
            addCriterion("beizhu2 >", value, "beizhu2");
            return (Criteria) this;
        }

        public Criteria andBeizhu2GreaterThanOrEqualTo(String value) {
            addCriterion("beizhu2 >=", value, "beizhu2");
            return (Criteria) this;
        }

        public Criteria andBeizhu2LessThan(String value) {
            addCriterion("beizhu2 <", value, "beizhu2");
            return (Criteria) this;
        }

        public Criteria andBeizhu2LessThanOrEqualTo(String value) {
            addCriterion("beizhu2 <=", value, "beizhu2");
            return (Criteria) this;
        }

        public Criteria andBeizhu2Like(String value) {
            addCriterion("beizhu2 like", value, "beizhu2");
            return (Criteria) this;
        }

        public Criteria andBeizhu2NotLike(String value) {
            addCriterion("beizhu2 not like", value, "beizhu2");
            return (Criteria) this;
        }

        public Criteria andBeizhu2In(List<String> values) {
            addCriterion("beizhu2 in", values, "beizhu2");
            return (Criteria) this;
        }

        public Criteria andBeizhu2NotIn(List<String> values) {
            addCriterion("beizhu2 not in", values, "beizhu2");
            return (Criteria) this;
        }

        public Criteria andBeizhu2Between(String value1, String value2) {
            addCriterion("beizhu2 between", value1, value2, "beizhu2");
            return (Criteria) this;
        }

        public Criteria andBeizhu2NotBetween(String value1, String value2) {
            addCriterion("beizhu2 not between", value1, value2, "beizhu2");
            return (Criteria) this;
        }

        public Criteria andBeizhu3IsNull() {
            addCriterion("beizhu3 is null");
            return (Criteria) this;
        }

        public Criteria andBeizhu3IsNotNull() {
            addCriterion("beizhu3 is not null");
            return (Criteria) this;
        }

        public Criteria andBeizhu3EqualTo(String value) {
            addCriterion("beizhu3 =", value, "beizhu3");
            return (Criteria) this;
        }

        public Criteria andBeizhu3NotEqualTo(String value) {
            addCriterion("beizhu3 <>", value, "beizhu3");
            return (Criteria) this;
        }

        public Criteria andBeizhu3GreaterThan(String value) {
            addCriterion("beizhu3 >", value, "beizhu3");
            return (Criteria) this;
        }

        public Criteria andBeizhu3GreaterThanOrEqualTo(String value) {
            addCriterion("beizhu3 >=", value, "beizhu3");
            return (Criteria) this;
        }

        public Criteria andBeizhu3LessThan(String value) {
            addCriterion("beizhu3 <", value, "beizhu3");
            return (Criteria) this;
        }

        public Criteria andBeizhu3LessThanOrEqualTo(String value) {
            addCriterion("beizhu3 <=", value, "beizhu3");
            return (Criteria) this;
        }

        public Criteria andBeizhu3Like(String value) {
            addCriterion("beizhu3 like", value, "beizhu3");
            return (Criteria) this;
        }

        public Criteria andBeizhu3NotLike(String value) {
            addCriterion("beizhu3 not like", value, "beizhu3");
            return (Criteria) this;
        }

        public Criteria andBeizhu3In(List<String> values) {
            addCriterion("beizhu3 in", values, "beizhu3");
            return (Criteria) this;
        }

        public Criteria andBeizhu3NotIn(List<String> values) {
            addCriterion("beizhu3 not in", values, "beizhu3");
            return (Criteria) this;
        }

        public Criteria andBeizhu3Between(String value1, String value2) {
            addCriterion("beizhu3 between", value1, value2, "beizhu3");
            return (Criteria) this;
        }

        public Criteria andBeizhu3NotBetween(String value1, String value2) {
            addCriterion("beizhu3 not between", value1, value2, "beizhu3");
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