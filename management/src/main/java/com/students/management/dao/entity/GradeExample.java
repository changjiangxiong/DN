package com.students.management.dao.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class GradeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GradeExample() {
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

        public Criteria andSIdIsNull() {
            addCriterion("s_id is null");
            return (Criteria) this;
        }

        public Criteria andSIdIsNotNull() {
            addCriterion("s_id is not null");
            return (Criteria) this;
        }

        public Criteria andSIdEqualTo(Long value) {
            addCriterion("s_id =", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotEqualTo(Long value) {
            addCriterion("s_id <>", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThan(Long value) {
            addCriterion("s_id >", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThanOrEqualTo(Long value) {
            addCriterion("s_id >=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThan(Long value) {
            addCriterion("s_id <", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThanOrEqualTo(Long value) {
            addCriterion("s_id <=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdIn(List<Long> values) {
            addCriterion("s_id in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotIn(List<Long> values) {
            addCriterion("s_id not in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdBetween(Long value1, Long value2) {
            addCriterion("s_id between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotBetween(Long value1, Long value2) {
            addCriterion("s_id not between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andRegularGradeIsNull() {
            addCriterion("regular_grade is null");
            return (Criteria) this;
        }

        public Criteria andRegularGradeIsNotNull() {
            addCriterion("regular_grade is not null");
            return (Criteria) this;
        }

        public Criteria andRegularGradeEqualTo(BigDecimal value) {
            addCriterion("regular_grade =", value, "regularGrade");
            return (Criteria) this;
        }

        public Criteria andRegularGradeNotEqualTo(BigDecimal value) {
            addCriterion("regular_grade <>", value, "regularGrade");
            return (Criteria) this;
        }

        public Criteria andRegularGradeGreaterThan(BigDecimal value) {
            addCriterion("regular_grade >", value, "regularGrade");
            return (Criteria) this;
        }

        public Criteria andRegularGradeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("regular_grade >=", value, "regularGrade");
            return (Criteria) this;
        }

        public Criteria andRegularGradeLessThan(BigDecimal value) {
            addCriterion("regular_grade <", value, "regularGrade");
            return (Criteria) this;
        }

        public Criteria andRegularGradeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("regular_grade <=", value, "regularGrade");
            return (Criteria) this;
        }

        public Criteria andRegularGradeIn(List<BigDecimal> values) {
            addCriterion("regular_grade in", values, "regularGrade");
            return (Criteria) this;
        }

        public Criteria andRegularGradeNotIn(List<BigDecimal> values) {
            addCriterion("regular_grade not in", values, "regularGrade");
            return (Criteria) this;
        }

        public Criteria andRegularGradeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("regular_grade between", value1, value2, "regularGrade");
            return (Criteria) this;
        }

        public Criteria andRegularGradeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("regular_grade not between", value1, value2, "regularGrade");
            return (Criteria) this;
        }

        public Criteria andMajorGradeIsNull() {
            addCriterion("major_grade is null");
            return (Criteria) this;
        }

        public Criteria andMajorGradeIsNotNull() {
            addCriterion("major_grade is not null");
            return (Criteria) this;
        }

        public Criteria andMajorGradeEqualTo(BigDecimal value) {
            addCriterion("major_grade =", value, "majorGrade");
            return (Criteria) this;
        }

        public Criteria andMajorGradeNotEqualTo(BigDecimal value) {
            addCriterion("major_grade <>", value, "majorGrade");
            return (Criteria) this;
        }

        public Criteria andMajorGradeGreaterThan(BigDecimal value) {
            addCriterion("major_grade >", value, "majorGrade");
            return (Criteria) this;
        }

        public Criteria andMajorGradeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("major_grade >=", value, "majorGrade");
            return (Criteria) this;
        }

        public Criteria andMajorGradeLessThan(BigDecimal value) {
            addCriterion("major_grade <", value, "majorGrade");
            return (Criteria) this;
        }

        public Criteria andMajorGradeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("major_grade <=", value, "majorGrade");
            return (Criteria) this;
        }

        public Criteria andMajorGradeIn(List<BigDecimal> values) {
            addCriterion("major_grade in", values, "majorGrade");
            return (Criteria) this;
        }

        public Criteria andMajorGradeNotIn(List<BigDecimal> values) {
            addCriterion("major_grade not in", values, "majorGrade");
            return (Criteria) this;
        }

        public Criteria andMajorGradeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("major_grade between", value1, value2, "majorGrade");
            return (Criteria) this;
        }

        public Criteria andMajorGradeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("major_grade not between", value1, value2, "majorGrade");
            return (Criteria) this;
        }

        public Criteria andFinalGradeIsNull() {
            addCriterion("final_grade is null");
            return (Criteria) this;
        }

        public Criteria andFinalGradeIsNotNull() {
            addCriterion("final_grade is not null");
            return (Criteria) this;
        }

        public Criteria andFinalGradeEqualTo(BigDecimal value) {
            addCriterion("final_grade =", value, "finalGrade");
            return (Criteria) this;
        }

        public Criteria andFinalGradeNotEqualTo(BigDecimal value) {
            addCriterion("final_grade <>", value, "finalGrade");
            return (Criteria) this;
        }

        public Criteria andFinalGradeGreaterThan(BigDecimal value) {
            addCriterion("final_grade >", value, "finalGrade");
            return (Criteria) this;
        }

        public Criteria andFinalGradeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("final_grade >=", value, "finalGrade");
            return (Criteria) this;
        }

        public Criteria andFinalGradeLessThan(BigDecimal value) {
            addCriterion("final_grade <", value, "finalGrade");
            return (Criteria) this;
        }

        public Criteria andFinalGradeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("final_grade <=", value, "finalGrade");
            return (Criteria) this;
        }

        public Criteria andFinalGradeIn(List<BigDecimal> values) {
            addCriterion("final_grade in", values, "finalGrade");
            return (Criteria) this;
        }

        public Criteria andFinalGradeNotIn(List<BigDecimal> values) {
            addCriterion("final_grade not in", values, "finalGrade");
            return (Criteria) this;
        }

        public Criteria andFinalGradeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("final_grade between", value1, value2, "finalGrade");
            return (Criteria) this;
        }

        public Criteria andFinalGradeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("final_grade not between", value1, value2, "finalGrade");
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