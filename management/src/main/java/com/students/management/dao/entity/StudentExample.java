package com.students.management.dao.entity;

import java.util.ArrayList;
import java.util.List;

public class StudentExample {
	protected String orderByClause;

	protected boolean distinct;

	private Integer start;

	private Integer rows;

	public Integer getStart() {
		return start;
	}

	public void setStart(Integer start) {
		this.start = start;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	protected List<Criteria> oredCriteria;

	public StudentExample() {
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

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
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

		public Criteria andStudentIdIsNull() {
			addCriterion("student_id is null");
			return (Criteria) this;
		}

		public Criteria andStudentIdIsNotNull() {
			addCriterion("student_id is not null");
			return (Criteria) this;
		}

		public Criteria andStudentIdEqualTo(String value) {
			addCriterion("student_id =", value, "studentId");
			return (Criteria) this;
		}

		public Criteria andStudentIdNotEqualTo(String value) {
			addCriterion("student_id <>", value, "studentId");
			return (Criteria) this;
		}

		public Criteria andStudentIdGreaterThan(String value) {
			addCriterion("student_id >", value, "studentId");
			return (Criteria) this;
		}

		public Criteria andStudentIdGreaterThanOrEqualTo(String value) {
			addCriterion("student_id >=", value, "studentId");
			return (Criteria) this;
		}

		public Criteria andStudentIdLessThan(String value) {
			addCriterion("student_id <", value, "studentId");
			return (Criteria) this;
		}

		public Criteria andStudentIdLessThanOrEqualTo(String value) {
			addCriterion("student_id <=", value, "studentId");
			return (Criteria) this;
		}

		public Criteria andStudentIdLike(String value) {
			addCriterion("student_id like", value, "studentId");
			return (Criteria) this;
		}

		public Criteria andStudentIdNotLike(String value) {
			addCriterion("student_id not like", value, "studentId");
			return (Criteria) this;
		}

		public Criteria andStudentIdIn(List<String> values) {
			addCriterion("student_id in", values, "studentId");
			return (Criteria) this;
		}

		public Criteria andStudentIdNotIn(List<String> values) {
			addCriterion("student_id not in", values, "studentId");
			return (Criteria) this;
		}

		public Criteria andStudentIdBetween(String value1, String value2) {
			addCriterion("student_id between", value1, value2, "studentId");
			return (Criteria) this;
		}

		public Criteria andStudentIdNotBetween(String value1, String value2) {
			addCriterion("student_id not between", value1, value2, "studentId");
			return (Criteria) this;
		}

		public Criteria andStudentNameIsNull() {
			addCriterion("student_name is null");
			return (Criteria) this;
		}

		public Criteria andStudentNameIsNotNull() {
			addCriterion("student_name is not null");
			return (Criteria) this;
		}

		public Criteria andStudentNameEqualTo(String value) {
			addCriterion("student_name =", value, "studentName");
			return (Criteria) this;
		}

		public Criteria andStudentNameNotEqualTo(String value) {
			addCriterion("student_name <>", value, "studentName");
			return (Criteria) this;
		}

		public Criteria andStudentNameGreaterThan(String value) {
			addCriterion("student_name >", value, "studentName");
			return (Criteria) this;
		}

		public Criteria andStudentNameGreaterThanOrEqualTo(String value) {
			addCriterion("student_name >=", value, "studentName");
			return (Criteria) this;
		}

		public Criteria andStudentNameLessThan(String value) {
			addCriterion("student_name <", value, "studentName");
			return (Criteria) this;
		}

		public Criteria andStudentNameLessThanOrEqualTo(String value) {
			addCriterion("student_name <=", value, "studentName");
			return (Criteria) this;
		}

		public Criteria andStudentNameLike(String value) {
			addCriterion("student_name like", value, "studentName");
			return (Criteria) this;
		}

		public Criteria andStudentNameNotLike(String value) {
			addCriterion("student_name not like", value, "studentName");
			return (Criteria) this;
		}

		public Criteria andStudentNameIn(List<String> values) {
			addCriterion("student_name in", values, "studentName");
			return (Criteria) this;
		}

		public Criteria andStudentNameNotIn(List<String> values) {
			addCriterion("student_name not in", values, "studentName");
			return (Criteria) this;
		}

		public Criteria andStudentNameBetween(String value1, String value2) {
			addCriterion("student_name between", value1, value2, "studentName");
			return (Criteria) this;
		}

		public Criteria andStudentNameNotBetween(String value1, String value2) {
			addCriterion("student_name not between", value1, value2,
					"studentName");
			return (Criteria) this;
		}

		public Criteria andMajorNameIsNull() {
			addCriterion("major_name is null");
			return (Criteria) this;
		}

		public Criteria andMajorNameIsNotNull() {
			addCriterion("major_name is not null");
			return (Criteria) this;
		}

		public Criteria andMajorNameEqualTo(String value) {
			addCriterion("major_name =", value, "majorName");
			return (Criteria) this;
		}

		public Criteria andMajorNameNotEqualTo(String value) {
			addCriterion("major_name <>", value, "majorName");
			return (Criteria) this;
		}

		public Criteria andMajorNameGreaterThan(String value) {
			addCriterion("major_name >", value, "majorName");
			return (Criteria) this;
		}

		public Criteria andMajorNameGreaterThanOrEqualTo(String value) {
			addCriterion("major_name >=", value, "majorName");
			return (Criteria) this;
		}

		public Criteria andMajorNameLessThan(String value) {
			addCriterion("major_name <", value, "majorName");
			return (Criteria) this;
		}

		public Criteria andMajorNameLessThanOrEqualTo(String value) {
			addCriterion("major_name <=", value, "majorName");
			return (Criteria) this;
		}

		public Criteria andMajorNameLike(String value) {
			addCriterion("major_name like", value, "majorName");
			return (Criteria) this;
		}

		public Criteria andMajorNameNotLike(String value) {
			addCriterion("major_name not like", value, "majorName");
			return (Criteria) this;
		}

		public Criteria andMajorNameIn(List<String> values) {
			addCriterion("major_name in", values, "majorName");
			return (Criteria) this;
		}

		public Criteria andMajorNameNotIn(List<String> values) {
			addCriterion("major_name not in", values, "majorName");
			return (Criteria) this;
		}

		public Criteria andMajorNameBetween(String value1, String value2) {
			addCriterion("major_name between", value1, value2, "majorName");
			return (Criteria) this;
		}

		public Criteria andMajorNameNotBetween(String value1, String value2) {
			addCriterion("major_name not between", value1, value2, "majorName");
			return (Criteria) this;
		}

		public Criteria andGradeNameIsNull() {
			addCriterion("grade_name is null");
			return (Criteria) this;
		}

		public Criteria andGradeNameIsNotNull() {
			addCriterion("grade_name is not null");
			return (Criteria) this;
		}

		public Criteria andGradeNameEqualTo(String value) {
			addCriterion("grade_name =", value, "gradeName");
			return (Criteria) this;
		}

		public Criteria andGradeNameNotEqualTo(String value) {
			addCriterion("grade_name <>", value, "gradeName");
			return (Criteria) this;
		}

		public Criteria andGradeNameGreaterThan(String value) {
			addCriterion("grade_name >", value, "gradeName");
			return (Criteria) this;
		}

		public Criteria andGradeNameGreaterThanOrEqualTo(String value) {
			addCriterion("grade_name >=", value, "gradeName");
			return (Criteria) this;
		}

		public Criteria andGradeNameLessThan(String value) {
			addCriterion("grade_name <", value, "gradeName");
			return (Criteria) this;
		}

		public Criteria andGradeNameLessThanOrEqualTo(String value) {
			addCriterion("grade_name <=", value, "gradeName");
			return (Criteria) this;
		}

		public Criteria andGradeNameLike(String value) {
			addCriterion("grade_name like", value, "gradeName");
			return (Criteria) this;
		}

		public Criteria andGradeNameNotLike(String value) {
			addCriterion("grade_name not like", value, "gradeName");
			return (Criteria) this;
		}

		public Criteria andGradeNameIn(List<String> values) {
			addCriterion("grade_name in", values, "gradeName");
			return (Criteria) this;
		}

		public Criteria andGradeNameNotIn(List<String> values) {
			addCriterion("grade_name not in", values, "gradeName");
			return (Criteria) this;
		}

		public Criteria andGradeNameBetween(String value1, String value2) {
			addCriterion("grade_name between", value1, value2, "gradeName");
			return (Criteria) this;
		}

		public Criteria andGradeNameNotBetween(String value1, String value2) {
			addCriterion("grade_name not between", value1, value2, "gradeName");
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

		protected Criterion(String condition, Object value, Object secondValue,
				String typeHandler) {
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