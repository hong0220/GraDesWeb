package com.mining.weibo.model;

import java.util.ArrayList;
import java.util.List;

public class WeiboUserExample {
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

	public WeiboUserExample() {
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

		public Criteria andAuthorityIsNull() {
			addCriterion("authority is null");
			return (Criteria) this;
		}

		public Criteria andAuthorityIsNotNull() {
			addCriterion("authority is not null");
			return (Criteria) this;
		}

		public Criteria andAuthorityEqualTo(String value) {
			addCriterion("authority =", value, "authority");
			return (Criteria) this;
		}

		public Criteria andAuthorityNotEqualTo(String value) {
			addCriterion("authority <>", value, "authority");
			return (Criteria) this;
		}

		public Criteria andAuthorityGreaterThan(String value) {
			addCriterion("authority >", value, "authority");
			return (Criteria) this;
		}

		public Criteria andAuthorityGreaterThanOrEqualTo(String value) {
			addCriterion("authority >=", value, "authority");
			return (Criteria) this;
		}

		public Criteria andAuthorityLessThan(String value) {
			addCriterion("authority <", value, "authority");
			return (Criteria) this;
		}

		public Criteria andAuthorityLessThanOrEqualTo(String value) {
			addCriterion("authority <=", value, "authority");
			return (Criteria) this;
		}

		public Criteria andAuthorityLike(String value) {
			addCriterion("authority like", value, "authority");
			return (Criteria) this;
		}

		public Criteria andAuthorityNotLike(String value) {
			addCriterion("authority not like", value, "authority");
			return (Criteria) this;
		}

		public Criteria andAuthorityIn(List<String> values) {
			addCriterion("authority in", values, "authority");
			return (Criteria) this;
		}

		public Criteria andAuthorityNotIn(List<String> values) {
			addCriterion("authority not in", values, "authority");
			return (Criteria) this;
		}

		public Criteria andAuthorityBetween(String value1, String value2) {
			addCriterion("authority between", value1, value2, "authority");
			return (Criteria) this;
		}

		public Criteria andAuthorityNotBetween(String value1, String value2) {
			addCriterion("authority not between", value1, value2, "authority");
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

		public Criteria andVerifyIsNull() {
			addCriterion("verify is null");
			return (Criteria) this;
		}

		public Criteria andVerifyIsNotNull() {
			addCriterion("verify is not null");
			return (Criteria) this;
		}

		public Criteria andVerifyEqualTo(String value) {
			addCriterion("verify =", value, "verify");
			return (Criteria) this;
		}

		public Criteria andVerifyNotEqualTo(String value) {
			addCriterion("verify <>", value, "verify");
			return (Criteria) this;
		}

		public Criteria andVerifyGreaterThan(String value) {
			addCriterion("verify >", value, "verify");
			return (Criteria) this;
		}

		public Criteria andVerifyGreaterThanOrEqualTo(String value) {
			addCriterion("verify >=", value, "verify");
			return (Criteria) this;
		}

		public Criteria andVerifyLessThan(String value) {
			addCriterion("verify <", value, "verify");
			return (Criteria) this;
		}

		public Criteria andVerifyLessThanOrEqualTo(String value) {
			addCriterion("verify <=", value, "verify");
			return (Criteria) this;
		}

		public Criteria andVerifyLike(String value) {
			addCriterion("verify like", value, "verify");
			return (Criteria) this;
		}

		public Criteria andVerifyNotLike(String value) {
			addCriterion("verify not like", value, "verify");
			return (Criteria) this;
		}

		public Criteria andVerifyIn(List<String> values) {
			addCriterion("verify in", values, "verify");
			return (Criteria) this;
		}

		public Criteria andVerifyNotIn(List<String> values) {
			addCriterion("verify not in", values, "verify");
			return (Criteria) this;
		}

		public Criteria andVerifyBetween(String value1, String value2) {
			addCriterion("verify between", value1, value2, "verify");
			return (Criteria) this;
		}

		public Criteria andVerifyNotBetween(String value1, String value2) {
			addCriterion("verify not between", value1, value2, "verify");
			return (Criteria) this;
		}

		public Criteria andFanIsNull() {
			addCriterion("fan is null");
			return (Criteria) this;
		}

		public Criteria andFanIsNotNull() {
			addCriterion("fan is not null");
			return (Criteria) this;
		}

		public Criteria andFanEqualTo(Integer value) {
			addCriterion("fan =", value, "fan");
			return (Criteria) this;
		}

		public Criteria andFanNotEqualTo(Integer value) {
			addCriterion("fan <>", value, "fan");
			return (Criteria) this;
		}

		public Criteria andFanGreaterThan(Integer value) {
			addCriterion("fan >", value, "fan");
			return (Criteria) this;
		}

		public Criteria andFanGreaterThanOrEqualTo(Integer value) {
			addCriterion("fan >=", value, "fan");
			return (Criteria) this;
		}

		public Criteria andFanLessThan(Integer value) {
			addCriterion("fan <", value, "fan");
			return (Criteria) this;
		}

		public Criteria andFanLessThanOrEqualTo(Integer value) {
			addCriterion("fan <=", value, "fan");
			return (Criteria) this;
		}

		public Criteria andFanIn(List<Integer> values) {
			addCriterion("fan in", values, "fan");
			return (Criteria) this;
		}

		public Criteria andFanNotIn(List<Integer> values) {
			addCriterion("fan not in", values, "fan");
			return (Criteria) this;
		}

		public Criteria andFanBetween(Integer value1, Integer value2) {
			addCriterion("fan between", value1, value2, "fan");
			return (Criteria) this;
		}

		public Criteria andFanNotBetween(Integer value1, Integer value2) {
			addCriterion("fan not between", value1, value2, "fan");
			return (Criteria) this;
		}

		public Criteria andPostIsNull() {
			addCriterion("post is null");
			return (Criteria) this;
		}

		public Criteria andPostIsNotNull() {
			addCriterion("post is not null");
			return (Criteria) this;
		}

		public Criteria andPostEqualTo(Integer value) {
			addCriterion("post =", value, "post");
			return (Criteria) this;
		}

		public Criteria andPostNotEqualTo(Integer value) {
			addCriterion("post <>", value, "post");
			return (Criteria) this;
		}

		public Criteria andPostGreaterThan(Integer value) {
			addCriterion("post >", value, "post");
			return (Criteria) this;
		}

		public Criteria andPostGreaterThanOrEqualTo(Integer value) {
			addCriterion("post >=", value, "post");
			return (Criteria) this;
		}

		public Criteria andPostLessThan(Integer value) {
			addCriterion("post <", value, "post");
			return (Criteria) this;
		}

		public Criteria andPostLessThanOrEqualTo(Integer value) {
			addCriterion("post <=", value, "post");
			return (Criteria) this;
		}

		public Criteria andPostIn(List<Integer> values) {
			addCriterion("post in", values, "post");
			return (Criteria) this;
		}

		public Criteria andPostNotIn(List<Integer> values) {
			addCriterion("post not in", values, "post");
			return (Criteria) this;
		}

		public Criteria andPostBetween(Integer value1, Integer value2) {
			addCriterion("post between", value1, value2, "post");
			return (Criteria) this;
		}

		public Criteria andPostNotBetween(Integer value1, Integer value2) {
			addCriterion("post not between", value1, value2, "post");
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