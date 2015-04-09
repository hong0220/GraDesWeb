package com.mining.weibo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WeiboCommentExample {
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

	public WeiboCommentExample() {
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

		public Criteria andCidIsNull() {
			addCriterion("cid is null");
			return (Criteria) this;
		}

		public Criteria andCidIsNotNull() {
			addCriterion("cid is not null");
			return (Criteria) this;
		}

		public Criteria andCidEqualTo(String value) {
			addCriterion("cid =", value, "cid");
			return (Criteria) this;
		}

		public Criteria andCidNotEqualTo(String value) {
			addCriterion("cid <>", value, "cid");
			return (Criteria) this;
		}

		public Criteria andCidGreaterThan(String value) {
			addCriterion("cid >", value, "cid");
			return (Criteria) this;
		}

		public Criteria andCidGreaterThanOrEqualTo(String value) {
			addCriterion("cid >=", value, "cid");
			return (Criteria) this;
		}

		public Criteria andCidLessThan(String value) {
			addCriterion("cid <", value, "cid");
			return (Criteria) this;
		}

		public Criteria andCidLessThanOrEqualTo(String value) {
			addCriterion("cid <=", value, "cid");
			return (Criteria) this;
		}

		public Criteria andCidLike(String value) {
			addCriterion("cid like", value, "cid");
			return (Criteria) this;
		}

		public Criteria andCidNotLike(String value) {
			addCriterion("cid not like", value, "cid");
			return (Criteria) this;
		}

		public Criteria andCidIn(List<String> values) {
			addCriterion("cid in", values, "cid");
			return (Criteria) this;
		}

		public Criteria andCidNotIn(List<String> values) {
			addCriterion("cid not in", values, "cid");
			return (Criteria) this;
		}

		public Criteria andCidBetween(String value1, String value2) {
			addCriterion("cid between", value1, value2, "cid");
			return (Criteria) this;
		}

		public Criteria andCidNotBetween(String value1, String value2) {
			addCriterion("cid not between", value1, value2, "cid");
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

		public Criteria andContentIsNull() {
			addCriterion("content is null");
			return (Criteria) this;
		}

		public Criteria andContentIsNotNull() {
			addCriterion("content is not null");
			return (Criteria) this;
		}

		public Criteria andContentEqualTo(String value) {
			addCriterion("content =", value, "content");
			return (Criteria) this;
		}

		public Criteria andContentNotEqualTo(String value) {
			addCriterion("content <>", value, "content");
			return (Criteria) this;
		}

		public Criteria andContentGreaterThan(String value) {
			addCriterion("content >", value, "content");
			return (Criteria) this;
		}

		public Criteria andContentGreaterThanOrEqualTo(String value) {
			addCriterion("content >=", value, "content");
			return (Criteria) this;
		}

		public Criteria andContentLessThan(String value) {
			addCriterion("content <", value, "content");
			return (Criteria) this;
		}

		public Criteria andContentLessThanOrEqualTo(String value) {
			addCriterion("content <=", value, "content");
			return (Criteria) this;
		}

		public Criteria andContentLike(String value) {
			addCriterion("content like", value, "content");
			return (Criteria) this;
		}

		public Criteria andContentNotLike(String value) {
			addCriterion("content not like", value, "content");
			return (Criteria) this;
		}

		public Criteria andContentIn(List<String> values) {
			addCriterion("content in", values, "content");
			return (Criteria) this;
		}

		public Criteria andContentNotIn(List<String> values) {
			addCriterion("content not in", values, "content");
			return (Criteria) this;
		}

		public Criteria andContentBetween(String value1, String value2) {
			addCriterion("content between", value1, value2, "content");
			return (Criteria) this;
		}

		public Criteria andContentNotBetween(String value1, String value2) {
			addCriterion("content not between", value1, value2, "content");
			return (Criteria) this;
		}

		public Criteria andTimeIsNull() {
			addCriterion("time is null");
			return (Criteria) this;
		}

		public Criteria andTimeIsNotNull() {
			addCriterion("time is not null");
			return (Criteria) this;
		}

		public Criteria andTimeEqualTo(Date value) {
			addCriterion("time =", value, "time");
			return (Criteria) this;
		}

		public Criteria andTimeNotEqualTo(Date value) {
			addCriterion("time <>", value, "time");
			return (Criteria) this;
		}

		public Criteria andTimeGreaterThan(Date value) {
			addCriterion("time >", value, "time");
			return (Criteria) this;
		}

		public Criteria andTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("time >=", value, "time");
			return (Criteria) this;
		}

		public Criteria andTimeLessThan(Date value) {
			addCriterion("time <", value, "time");
			return (Criteria) this;
		}

		public Criteria andTimeLessThanOrEqualTo(Date value) {
			addCriterion("time <=", value, "time");
			return (Criteria) this;
		}

		public Criteria andTimeIn(List<Date> values) {
			addCriterion("time in", values, "time");
			return (Criteria) this;
		}

		public Criteria andTimeNotIn(List<Date> values) {
			addCriterion("time not in", values, "time");
			return (Criteria) this;
		}

		public Criteria andTimeBetween(Date value1, Date value2) {
			addCriterion("time between", value1, value2, "time");
			return (Criteria) this;
		}

		public Criteria andTimeNotBetween(Date value1, Date value2) {
			addCriterion("time not between", value1, value2, "time");
			return (Criteria) this;
		}

		public Criteria andSourceIsNull() {
			addCriterion("source is null");
			return (Criteria) this;
		}

		public Criteria andSourceIsNotNull() {
			addCriterion("source is not null");
			return (Criteria) this;
		}

		public Criteria andSourceEqualTo(String value) {
			addCriterion("source =", value, "source");
			return (Criteria) this;
		}

		public Criteria andSourceNotEqualTo(String value) {
			addCriterion("source <>", value, "source");
			return (Criteria) this;
		}

		public Criteria andSourceGreaterThan(String value) {
			addCriterion("source >", value, "source");
			return (Criteria) this;
		}

		public Criteria andSourceGreaterThanOrEqualTo(String value) {
			addCriterion("source >=", value, "source");
			return (Criteria) this;
		}

		public Criteria andSourceLessThan(String value) {
			addCriterion("source <", value, "source");
			return (Criteria) this;
		}

		public Criteria andSourceLessThanOrEqualTo(String value) {
			addCriterion("source <=", value, "source");
			return (Criteria) this;
		}

		public Criteria andSourceLike(String value) {
			addCriterion("source like", value, "source");
			return (Criteria) this;
		}

		public Criteria andSourceNotLike(String value) {
			addCriterion("source not like", value, "source");
			return (Criteria) this;
		}

		public Criteria andSourceIn(List<String> values) {
			addCriterion("source in", values, "source");
			return (Criteria) this;
		}

		public Criteria andSourceNotIn(List<String> values) {
			addCriterion("source not in", values, "source");
			return (Criteria) this;
		}

		public Criteria andSourceBetween(String value1, String value2) {
			addCriterion("source between", value1, value2, "source");
			return (Criteria) this;
		}

		public Criteria andSourceNotBetween(String value1, String value2) {
			addCriterion("source not between", value1, value2, "source");
			return (Criteria) this;
		}

		public Criteria andWeiboidIsNull() {
			addCriterion("weiboid is null");
			return (Criteria) this;
		}

		public Criteria andWeiboidIsNotNull() {
			addCriterion("weiboid is not null");
			return (Criteria) this;
		}

		public Criteria andWeiboidEqualTo(String value) {
			addCriterion("weiboid =", value, "weiboid");
			return (Criteria) this;
		}

		public Criteria andWeiboidNotEqualTo(String value) {
			addCriterion("weiboid <>", value, "weiboid");
			return (Criteria) this;
		}

		public Criteria andWeiboidGreaterThan(String value) {
			addCriterion("weiboid >", value, "weiboid");
			return (Criteria) this;
		}

		public Criteria andWeiboidGreaterThanOrEqualTo(String value) {
			addCriterion("weiboid >=", value, "weiboid");
			return (Criteria) this;
		}

		public Criteria andWeiboidLessThan(String value) {
			addCriterion("weiboid <", value, "weiboid");
			return (Criteria) this;
		}

		public Criteria andWeiboidLessThanOrEqualTo(String value) {
			addCriterion("weiboid <=", value, "weiboid");
			return (Criteria) this;
		}

		public Criteria andWeiboidLike(String value) {
			addCriterion("weiboid like", value, "weiboid");
			return (Criteria) this;
		}

		public Criteria andWeiboidNotLike(String value) {
			addCriterion("weiboid not like", value, "weiboid");
			return (Criteria) this;
		}

		public Criteria andWeiboidIn(List<String> values) {
			addCriterion("weiboid in", values, "weiboid");
			return (Criteria) this;
		}

		public Criteria andWeiboidNotIn(List<String> values) {
			addCriterion("weiboid not in", values, "weiboid");
			return (Criteria) this;
		}

		public Criteria andWeiboidBetween(String value1, String value2) {
			addCriterion("weiboid between", value1, value2, "weiboid");
			return (Criteria) this;
		}

		public Criteria andWeiboidNotBetween(String value1, String value2) {
			addCriterion("weiboid not between", value1, value2, "weiboid");
			return (Criteria) this;
		}

		public Criteria andHttpIsNull() {
			addCriterion("http is null");
			return (Criteria) this;
		}

		public Criteria andHttpIsNotNull() {
			addCriterion("http is not null");
			return (Criteria) this;
		}

		public Criteria andHttpEqualTo(String value) {
			addCriterion("http =", value, "http");
			return (Criteria) this;
		}

		public Criteria andHttpNotEqualTo(String value) {
			addCriterion("http <>", value, "http");
			return (Criteria) this;
		}

		public Criteria andHttpGreaterThan(String value) {
			addCriterion("http >", value, "http");
			return (Criteria) this;
		}

		public Criteria andHttpGreaterThanOrEqualTo(String value) {
			addCriterion("http >=", value, "http");
			return (Criteria) this;
		}

		public Criteria andHttpLessThan(String value) {
			addCriterion("http <", value, "http");
			return (Criteria) this;
		}

		public Criteria andHttpLessThanOrEqualTo(String value) {
			addCriterion("http <=", value, "http");
			return (Criteria) this;
		}

		public Criteria andHttpLike(String value) {
			addCriterion("http like", value, "http");
			return (Criteria) this;
		}

		public Criteria andHttpNotLike(String value) {
			addCriterion("http not like", value, "http");
			return (Criteria) this;
		}

		public Criteria andHttpIn(List<String> values) {
			addCriterion("http in", values, "http");
			return (Criteria) this;
		}

		public Criteria andHttpNotIn(List<String> values) {
			addCriterion("http not in", values, "http");
			return (Criteria) this;
		}

		public Criteria andHttpBetween(String value1, String value2) {
			addCriterion("http between", value1, value2, "http");
			return (Criteria) this;
		}

		public Criteria andHttpNotBetween(String value1, String value2) {
			addCriterion("http not between", value1, value2, "http");
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