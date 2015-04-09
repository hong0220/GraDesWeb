package com.mining.weibo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ResultExample {
	private Integer start;
	private Integer limit;

	public Integer getStart() {
		return start;
	}

	public void setStart(Integer start) {
		this.start = start;
	}

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public ResultExample() {
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

		protected void addCriterionForJDBCDate(String condition, Date value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			addCriterion(condition, new java.sql.Date(value.getTime()),
					property);
		}

		protected void addCriterionForJDBCDate(String condition,
				List<Date> values, String property) {
			if (values == null || values.size() == 0) {
				throw new RuntimeException("Value list for " + property
						+ " cannot be null or empty");
			}
			List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
			Iterator<Date> iter = values.iterator();
			while (iter.hasNext()) {
				dateList.add(new java.sql.Date(iter.next().getTime()));
			}
			addCriterion(condition, dateList, property);
		}

		protected void addCriterionForJDBCDate(String condition, Date value1,
				Date value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			addCriterion(condition, new java.sql.Date(value1.getTime()),
					new java.sql.Date(value2.getTime()), property);
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

		public Criteria andDayIsNull() {
			addCriterion("day is null");
			return (Criteria) this;
		}

		public Criteria andDayIsNotNull() {
			addCriterion("day is not null");
			return (Criteria) this;
		}

		public Criteria andDayEqualTo(Date value) {
			addCriterionForJDBCDate("day =", value, "day");
			return (Criteria) this;
		}

		public Criteria andDayNotEqualTo(Date value) {
			addCriterionForJDBCDate("day <>", value, "day");
			return (Criteria) this;
		}

		public Criteria andDayGreaterThan(Date value) {
			addCriterionForJDBCDate("day >", value, "day");
			return (Criteria) this;
		}

		public Criteria andDayGreaterThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("day >=", value, "day");
			return (Criteria) this;
		}

		public Criteria andDayLessThan(Date value) {
			addCriterionForJDBCDate("day <", value, "day");
			return (Criteria) this;
		}

		public Criteria andDayLessThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("day <=", value, "day");
			return (Criteria) this;
		}

		public Criteria andDayIn(List<Date> values) {
			addCriterionForJDBCDate("day in", values, "day");
			return (Criteria) this;
		}

		public Criteria andDayNotIn(List<Date> values) {
			addCriterionForJDBCDate("day not in", values, "day");
			return (Criteria) this;
		}

		public Criteria andDayBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("day between", value1, value2, "day");
			return (Criteria) this;
		}

		public Criteria andDayNotBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("day not between", value1, value2, "day");
			return (Criteria) this;
		}

		public Criteria andUserIdIsNull() {
			addCriterion("user_id is null");
			return (Criteria) this;
		}

		public Criteria andUserIdIsNotNull() {
			addCriterion("user_id is not null");
			return (Criteria) this;
		}

		public Criteria andUserIdEqualTo(String value) {
			addCriterion("user_id =", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotEqualTo(String value) {
			addCriterion("user_id <>", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdGreaterThan(String value) {
			addCriterion("user_id >", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdGreaterThanOrEqualTo(String value) {
			addCriterion("user_id >=", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLessThan(String value) {
			addCriterion("user_id <", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLessThanOrEqualTo(String value) {
			addCriterion("user_id <=", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLike(String value) {
			addCriterion("user_id like", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotLike(String value) {
			addCriterion("user_id not like", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdIn(List<String> values) {
			addCriterion("user_id in", values, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotIn(List<String> values) {
			addCriterion("user_id not in", values, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdBetween(String value1, String value2) {
			addCriterion("user_id between", value1, value2, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotBetween(String value1, String value2) {
			addCriterion("user_id not between", value1, value2, "userId");
			return (Criteria) this;
		}

		public Criteria andPositiveIsNull() {
			addCriterion("positive is null");
			return (Criteria) this;
		}

		public Criteria andPositiveIsNotNull() {
			addCriterion("positive is not null");
			return (Criteria) this;
		}

		public Criteria andPositiveEqualTo(Float value) {
			addCriterion("positive =", value, "positive");
			return (Criteria) this;
		}

		public Criteria andPositiveNotEqualTo(Float value) {
			addCriterion("positive <>", value, "positive");
			return (Criteria) this;
		}

		public Criteria andPositiveGreaterThan(Float value) {
			addCriterion("positive >", value, "positive");
			return (Criteria) this;
		}

		public Criteria andPositiveGreaterThanOrEqualTo(Float value) {
			addCriterion("positive >=", value, "positive");
			return (Criteria) this;
		}

		public Criteria andPositiveLessThan(Float value) {
			addCriterion("positive <", value, "positive");
			return (Criteria) this;
		}

		public Criteria andPositiveLessThanOrEqualTo(Float value) {
			addCriterion("positive <=", value, "positive");
			return (Criteria) this;
		}

		public Criteria andPositiveIn(List<Float> values) {
			addCriterion("positive in", values, "positive");
			return (Criteria) this;
		}

		public Criteria andPositiveNotIn(List<Float> values) {
			addCriterion("positive not in", values, "positive");
			return (Criteria) this;
		}

		public Criteria andPositiveBetween(Float value1, Float value2) {
			addCriterion("positive between", value1, value2, "positive");
			return (Criteria) this;
		}

		public Criteria andPositiveNotBetween(Float value1, Float value2) {
			addCriterion("positive not between", value1, value2, "positive");
			return (Criteria) this;
		}

		public Criteria andNegativeIsNull() {
			addCriterion("negative is null");
			return (Criteria) this;
		}

		public Criteria andNegativeIsNotNull() {
			addCriterion("negative is not null");
			return (Criteria) this;
		}

		public Criteria andNegativeEqualTo(Float value) {
			addCriterion("negative =", value, "negative");
			return (Criteria) this;
		}

		public Criteria andNegativeNotEqualTo(Float value) {
			addCriterion("negative <>", value, "negative");
			return (Criteria) this;
		}

		public Criteria andNegativeGreaterThan(Float value) {
			addCriterion("negative >", value, "negative");
			return (Criteria) this;
		}

		public Criteria andNegativeGreaterThanOrEqualTo(Float value) {
			addCriterion("negative >=", value, "negative");
			return (Criteria) this;
		}

		public Criteria andNegativeLessThan(Float value) {
			addCriterion("negative <", value, "negative");
			return (Criteria) this;
		}

		public Criteria andNegativeLessThanOrEqualTo(Float value) {
			addCriterion("negative <=", value, "negative");
			return (Criteria) this;
		}

		public Criteria andNegativeIn(List<Float> values) {
			addCriterion("negative in", values, "negative");
			return (Criteria) this;
		}

		public Criteria andNegativeNotIn(List<Float> values) {
			addCriterion("negative not in", values, "negative");
			return (Criteria) this;
		}

		public Criteria andNegativeBetween(Float value1, Float value2) {
			addCriterion("negative between", value1, value2, "negative");
			return (Criteria) this;
		}

		public Criteria andNegativeNotBetween(Float value1, Float value2) {
			addCriterion("negative not between", value1, value2, "negative");
			return (Criteria) this;
		}

		public Criteria andRiseorfallIsNull() {
			addCriterion("riseorfall is null");
			return (Criteria) this;
		}

		public Criteria andRiseorfallIsNotNull() {
			addCriterion("riseorfall is not null");
			return (Criteria) this;
		}

		public Criteria andRiseorfallEqualTo(Float value) {
			addCriterion("riseorfall =", value, "riseorfall");
			return (Criteria) this;
		}

		public Criteria andRiseorfallNotEqualTo(Float value) {
			addCriterion("riseorfall <>", value, "riseorfall");
			return (Criteria) this;
		}

		public Criteria andRiseorfallGreaterThan(Float value) {
			addCriterion("riseorfall >", value, "riseorfall");
			return (Criteria) this;
		}

		public Criteria andRiseorfallGreaterThanOrEqualTo(Float value) {
			addCriterion("riseorfall >=", value, "riseorfall");
			return (Criteria) this;
		}

		public Criteria andRiseorfallLessThan(Float value) {
			addCriterion("riseorfall <", value, "riseorfall");
			return (Criteria) this;
		}

		public Criteria andRiseorfallLessThanOrEqualTo(Float value) {
			addCriterion("riseorfall <=", value, "riseorfall");
			return (Criteria) this;
		}

		public Criteria andRiseorfallIn(List<Float> values) {
			addCriterion("riseorfall in", values, "riseorfall");
			return (Criteria) this;
		}

		public Criteria andRiseorfallNotIn(List<Float> values) {
			addCriterion("riseorfall not in", values, "riseorfall");
			return (Criteria) this;
		}

		public Criteria andRiseorfallBetween(Float value1, Float value2) {
			addCriterion("riseorfall between", value1, value2, "riseorfall");
			return (Criteria) this;
		}

		public Criteria andRiseorfallNotBetween(Float value1, Float value2) {
			addCriterion("riseorfall not between", value1, value2, "riseorfall");
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