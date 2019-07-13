package cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BuyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BuyExample() {
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

        public Criteria andPkBidIsNull() {
            addCriterion("pk_bid is null");
            return (Criteria) this;
        }

        public Criteria andPkBidIsNotNull() {
            addCriterion("pk_bid is not null");
            return (Criteria) this;
        }

        public Criteria andPkBidEqualTo(Long value) {
            addCriterion("pk_bid =", value, "pkBid");
            return (Criteria) this;
        }

        public Criteria andPkBidNotEqualTo(Long value) {
            addCriterion("pk_bid <>", value, "pkBid");
            return (Criteria) this;
        }

        public Criteria andPkBidGreaterThan(Long value) {
            addCriterion("pk_bid >", value, "pkBid");
            return (Criteria) this;
        }

        public Criteria andPkBidGreaterThanOrEqualTo(Long value) {
            addCriterion("pk_bid >=", value, "pkBid");
            return (Criteria) this;
        }

        public Criteria andPkBidLessThan(Long value) {
            addCriterion("pk_bid <", value, "pkBid");
            return (Criteria) this;
        }

        public Criteria andPkBidLessThanOrEqualTo(Long value) {
            addCriterion("pk_bid <=", value, "pkBid");
            return (Criteria) this;
        }

        public Criteria andPkBidIn(List<Long> values) {
            addCriterion("pk_bid in", values, "pkBid");
            return (Criteria) this;
        }

        public Criteria andPkBidNotIn(List<Long> values) {
            addCriterion("pk_bid not in", values, "pkBid");
            return (Criteria) this;
        }

        public Criteria andPkBidBetween(Long value1, Long value2) {
            addCriterion("pk_bid between", value1, value2, "pkBid");
            return (Criteria) this;
        }

        public Criteria andPkBidNotBetween(Long value1, Long value2) {
            addCriterion("pk_bid not between", value1, value2, "pkBid");
            return (Criteria) this;
        }

        public Criteria andBuyNameIsNull() {
            addCriterion("buy_name is null");
            return (Criteria) this;
        }

        public Criteria andBuyNameIsNotNull() {
            addCriterion("buy_name is not null");
            return (Criteria) this;
        }

        public Criteria andBuyNameEqualTo(String value) {
            addCriterion("buy_name =", value, "buyName");
            return (Criteria) this;
        }

        public Criteria andBuyNameNotEqualTo(String value) {
            addCriterion("buy_name <>", value, "buyName");
            return (Criteria) this;
        }

        public Criteria andBuyNameGreaterThan(String value) {
            addCriterion("buy_name >", value, "buyName");
            return (Criteria) this;
        }

        public Criteria andBuyNameGreaterThanOrEqualTo(String value) {
            addCriterion("buy_name >=", value, "buyName");
            return (Criteria) this;
        }

        public Criteria andBuyNameLessThan(String value) {
            addCriterion("buy_name <", value, "buyName");
            return (Criteria) this;
        }

        public Criteria andBuyNameLessThanOrEqualTo(String value) {
            addCriterion("buy_name <=", value, "buyName");
            return (Criteria) this;
        }

        public Criteria andBuyNameLike(String value) {
            addCriterion("buy_name like", value, "buyName");
            return (Criteria) this;
        }

        public Criteria andBuyNameNotLike(String value) {
            addCriterion("buy_name not like", value, "buyName");
            return (Criteria) this;
        }

        public Criteria andBuyNameIn(List<String> values) {
            addCriterion("buy_name in", values, "buyName");
            return (Criteria) this;
        }

        public Criteria andBuyNameNotIn(List<String> values) {
            addCriterion("buy_name not in", values, "buyName");
            return (Criteria) this;
        }

        public Criteria andBuyNameBetween(String value1, String value2) {
            addCriterion("buy_name between", value1, value2, "buyName");
            return (Criteria) this;
        }

        public Criteria andBuyNameNotBetween(String value1, String value2) {
            addCriterion("buy_name not between", value1, value2, "buyName");
            return (Criteria) this;
        }

        public Criteria andBuyTimeIsNull() {
            addCriterion("buy_time is null");
            return (Criteria) this;
        }

        public Criteria andBuyTimeIsNotNull() {
            addCriterion("buy_time is not null");
            return (Criteria) this;
        }

        public Criteria andBuyTimeEqualTo(Date value) {
            addCriterion("buy_time =", value, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeNotEqualTo(Date value) {
            addCriterion("buy_time <>", value, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeGreaterThan(Date value) {
            addCriterion("buy_time >", value, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("buy_time >=", value, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeLessThan(Date value) {
            addCriterion("buy_time <", value, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeLessThanOrEqualTo(Date value) {
            addCriterion("buy_time <=", value, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeIn(List<Date> values) {
            addCriterion("buy_time in", values, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeNotIn(List<Date> values) {
            addCriterion("buy_time not in", values, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeBetween(Date value1, Date value2) {
            addCriterion("buy_time between", value1, value2, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeNotBetween(Date value1, Date value2) {
            addCriterion("buy_time not between", value1, value2, "buyTime");
            return (Criteria) this;
        }

        public Criteria andPkUidIsNull() {
            addCriterion("pk_uid is null");
            return (Criteria) this;
        }

        public Criteria andPkUidIsNotNull() {
            addCriterion("pk_uid is not null");
            return (Criteria) this;
        }

        public Criteria andPkUidEqualTo(Long value) {
            addCriterion("pk_uid =", value, "pkUid");
            return (Criteria) this;
        }

        public Criteria andPkUidNotEqualTo(Long value) {
            addCriterion("pk_uid <>", value, "pkUid");
            return (Criteria) this;
        }

        public Criteria andPkUidGreaterThan(Long value) {
            addCriterion("pk_uid >", value, "pkUid");
            return (Criteria) this;
        }

        public Criteria andPkUidGreaterThanOrEqualTo(Long value) {
            addCriterion("pk_uid >=", value, "pkUid");
            return (Criteria) this;
        }

        public Criteria andPkUidLessThan(Long value) {
            addCriterion("pk_uid <", value, "pkUid");
            return (Criteria) this;
        }

        public Criteria andPkUidLessThanOrEqualTo(Long value) {
            addCriterion("pk_uid <=", value, "pkUid");
            return (Criteria) this;
        }

        public Criteria andPkUidIn(List<Long> values) {
            addCriterion("pk_uid in", values, "pkUid");
            return (Criteria) this;
        }

        public Criteria andPkUidNotIn(List<Long> values) {
            addCriterion("pk_uid not in", values, "pkUid");
            return (Criteria) this;
        }

        public Criteria andPkUidBetween(Long value1, Long value2) {
            addCriterion("pk_uid between", value1, value2, "pkUid");
            return (Criteria) this;
        }

        public Criteria andPkUidNotBetween(Long value1, Long value2) {
            addCriterion("pk_uid not between", value1, value2, "pkUid");
            return (Criteria) this;
        }

        public Criteria andIsSeasonalIsNull() {
            addCriterion("is_seasonal is null");
            return (Criteria) this;
        }

        public Criteria andIsSeasonalIsNotNull() {
            addCriterion("is_seasonal is not null");
            return (Criteria) this;
        }

        public Criteria andIsSeasonalEqualTo(Byte value) {
            addCriterion("is_seasonal =", value, "isSeasonal");
            return (Criteria) this;
        }

        public Criteria andIsSeasonalNotEqualTo(Byte value) {
            addCriterion("is_seasonal <>", value, "isSeasonal");
            return (Criteria) this;
        }

        public Criteria andIsSeasonalGreaterThan(Byte value) {
            addCriterion("is_seasonal >", value, "isSeasonal");
            return (Criteria) this;
        }

        public Criteria andIsSeasonalGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_seasonal >=", value, "isSeasonal");
            return (Criteria) this;
        }

        public Criteria andIsSeasonalLessThan(Byte value) {
            addCriterion("is_seasonal <", value, "isSeasonal");
            return (Criteria) this;
        }

        public Criteria andIsSeasonalLessThanOrEqualTo(Byte value) {
            addCriterion("is_seasonal <=", value, "isSeasonal");
            return (Criteria) this;
        }

        public Criteria andIsSeasonalIn(List<Byte> values) {
            addCriterion("is_seasonal in", values, "isSeasonal");
            return (Criteria) this;
        }

        public Criteria andIsSeasonalNotIn(List<Byte> values) {
            addCriterion("is_seasonal not in", values, "isSeasonal");
            return (Criteria) this;
        }

        public Criteria andIsSeasonalBetween(Byte value1, Byte value2) {
            addCriterion("is_seasonal between", value1, value2, "isSeasonal");
            return (Criteria) this;
        }

        public Criteria andIsSeasonalNotBetween(Byte value1, Byte value2) {
            addCriterion("is_seasonal not between", value1, value2, "isSeasonal");
            return (Criteria) this;
        }

        public Criteria andIsInStorehouseIsNull() {
            addCriterion("is_in_storehouse is null");
            return (Criteria) this;
        }

        public Criteria andIsInStorehouseIsNotNull() {
            addCriterion("is_in_storehouse is not null");
            return (Criteria) this;
        }

        public Criteria andIsInStorehouseEqualTo(Byte value) {
            addCriterion("is_in_storehouse =", value, "isInStorehouse");
            return (Criteria) this;
        }

        public Criteria andIsInStorehouseNotEqualTo(Byte value) {
            addCriterion("is_in_storehouse <>", value, "isInStorehouse");
            return (Criteria) this;
        }

        public Criteria andIsInStorehouseGreaterThan(Byte value) {
            addCriterion("is_in_storehouse >", value, "isInStorehouse");
            return (Criteria) this;
        }

        public Criteria andIsInStorehouseGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_in_storehouse >=", value, "isInStorehouse");
            return (Criteria) this;
        }

        public Criteria andIsInStorehouseLessThan(Byte value) {
            addCriterion("is_in_storehouse <", value, "isInStorehouse");
            return (Criteria) this;
        }

        public Criteria andIsInStorehouseLessThanOrEqualTo(Byte value) {
            addCriterion("is_in_storehouse <=", value, "isInStorehouse");
            return (Criteria) this;
        }

        public Criteria andIsInStorehouseIn(List<Byte> values) {
            addCriterion("is_in_storehouse in", values, "isInStorehouse");
            return (Criteria) this;
        }

        public Criteria andIsInStorehouseNotIn(List<Byte> values) {
            addCriterion("is_in_storehouse not in", values, "isInStorehouse");
            return (Criteria) this;
        }

        public Criteria andIsInStorehouseBetween(Byte value1, Byte value2) {
            addCriterion("is_in_storehouse between", value1, value2, "isInStorehouse");
            return (Criteria) this;
        }

        public Criteria andIsInStorehouseNotBetween(Byte value1, Byte value2) {
            addCriterion("is_in_storehouse not between", value1, value2, "isInStorehouse");
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