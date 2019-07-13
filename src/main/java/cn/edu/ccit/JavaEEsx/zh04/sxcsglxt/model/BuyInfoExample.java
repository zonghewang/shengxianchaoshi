package cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model;

import java.util.ArrayList;
import java.util.List;

public class BuyInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BuyInfoExample() {
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

        public Criteria andPkBiidIsNull() {
            addCriterion("pk_biid is null");
            return (Criteria) this;
        }

        public Criteria andPkBiidIsNotNull() {
            addCriterion("pk_biid is not null");
            return (Criteria) this;
        }

        public Criteria andPkBiidEqualTo(Long value) {
            addCriterion("pk_biid =", value, "pkBiid");
            return (Criteria) this;
        }

        public Criteria andPkBiidNotEqualTo(Long value) {
            addCriterion("pk_biid <>", value, "pkBiid");
            return (Criteria) this;
        }

        public Criteria andPkBiidGreaterThan(Long value) {
            addCriterion("pk_biid >", value, "pkBiid");
            return (Criteria) this;
        }

        public Criteria andPkBiidGreaterThanOrEqualTo(Long value) {
            addCriterion("pk_biid >=", value, "pkBiid");
            return (Criteria) this;
        }

        public Criteria andPkBiidLessThan(Long value) {
            addCriterion("pk_biid <", value, "pkBiid");
            return (Criteria) this;
        }

        public Criteria andPkBiidLessThanOrEqualTo(Long value) {
            addCriterion("pk_biid <=", value, "pkBiid");
            return (Criteria) this;
        }

        public Criteria andPkBiidIn(List<Long> values) {
            addCriterion("pk_biid in", values, "pkBiid");
            return (Criteria) this;
        }

        public Criteria andPkBiidNotIn(List<Long> values) {
            addCriterion("pk_biid not in", values, "pkBiid");
            return (Criteria) this;
        }

        public Criteria andPkBiidBetween(Long value1, Long value2) {
            addCriterion("pk_biid between", value1, value2, "pkBiid");
            return (Criteria) this;
        }

        public Criteria andPkBiidNotBetween(Long value1, Long value2) {
            addCriterion("pk_biid not between", value1, value2, "pkBiid");
            return (Criteria) this;
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

        public Criteria andPkPidIsNull() {
            addCriterion("pk_pid is null");
            return (Criteria) this;
        }

        public Criteria andPkPidIsNotNull() {
            addCriterion("pk_pid is not null");
            return (Criteria) this;
        }

        public Criteria andPkPidEqualTo(Long value) {
            addCriterion("pk_pid =", value, "pkPid");
            return (Criteria) this;
        }

        public Criteria andPkPidNotEqualTo(Long value) {
            addCriterion("pk_pid <>", value, "pkPid");
            return (Criteria) this;
        }

        public Criteria andPkPidGreaterThan(Long value) {
            addCriterion("pk_pid >", value, "pkPid");
            return (Criteria) this;
        }

        public Criteria andPkPidGreaterThanOrEqualTo(Long value) {
            addCriterion("pk_pid >=", value, "pkPid");
            return (Criteria) this;
        }

        public Criteria andPkPidLessThan(Long value) {
            addCriterion("pk_pid <", value, "pkPid");
            return (Criteria) this;
        }

        public Criteria andPkPidLessThanOrEqualTo(Long value) {
            addCriterion("pk_pid <=", value, "pkPid");
            return (Criteria) this;
        }

        public Criteria andPkPidIn(List<Long> values) {
            addCriterion("pk_pid in", values, "pkPid");
            return (Criteria) this;
        }

        public Criteria andPkPidNotIn(List<Long> values) {
            addCriterion("pk_pid not in", values, "pkPid");
            return (Criteria) this;
        }

        public Criteria andPkPidBetween(Long value1, Long value2) {
            addCriterion("pk_pid between", value1, value2, "pkPid");
            return (Criteria) this;
        }

        public Criteria andPkPidNotBetween(Long value1, Long value2) {
            addCriterion("pk_pid not between", value1, value2, "pkPid");
            return (Criteria) this;
        }

        public Criteria andPkSpidIsNull() {
            addCriterion("pk_spid is null");
            return (Criteria) this;
        }

        public Criteria andPkSpidIsNotNull() {
            addCriterion("pk_spid is not null");
            return (Criteria) this;
        }

        public Criteria andPkSpidEqualTo(Long value) {
            addCriterion("pk_spid =", value, "pkSpid");
            return (Criteria) this;
        }

        public Criteria andPkSpidNotEqualTo(Long value) {
            addCriterion("pk_spid <>", value, "pkSpid");
            return (Criteria) this;
        }

        public Criteria andPkSpidGreaterThan(Long value) {
            addCriterion("pk_spid >", value, "pkSpid");
            return (Criteria) this;
        }

        public Criteria andPkSpidGreaterThanOrEqualTo(Long value) {
            addCriterion("pk_spid >=", value, "pkSpid");
            return (Criteria) this;
        }

        public Criteria andPkSpidLessThan(Long value) {
            addCriterion("pk_spid <", value, "pkSpid");
            return (Criteria) this;
        }

        public Criteria andPkSpidLessThanOrEqualTo(Long value) {
            addCriterion("pk_spid <=", value, "pkSpid");
            return (Criteria) this;
        }

        public Criteria andPkSpidIn(List<Long> values) {
            addCriterion("pk_spid in", values, "pkSpid");
            return (Criteria) this;
        }

        public Criteria andPkSpidNotIn(List<Long> values) {
            addCriterion("pk_spid not in", values, "pkSpid");
            return (Criteria) this;
        }

        public Criteria andPkSpidBetween(Long value1, Long value2) {
            addCriterion("pk_spid between", value1, value2, "pkSpid");
            return (Criteria) this;
        }

        public Criteria andPkSpidNotBetween(Long value1, Long value2) {
            addCriterion("pk_spid not between", value1, value2, "pkSpid");
            return (Criteria) this;
        }

        public Criteria andBuyInfoNumIsNull() {
            addCriterion("buy_info_num is null");
            return (Criteria) this;
        }

        public Criteria andBuyInfoNumIsNotNull() {
            addCriterion("buy_info_num is not null");
            return (Criteria) this;
        }

        public Criteria andBuyInfoNumEqualTo(Integer value) {
            addCriterion("buy_info_num =", value, "buyInfoNum");
            return (Criteria) this;
        }

        public Criteria andBuyInfoNumNotEqualTo(Integer value) {
            addCriterion("buy_info_num <>", value, "buyInfoNum");
            return (Criteria) this;
        }

        public Criteria andBuyInfoNumGreaterThan(Integer value) {
            addCriterion("buy_info_num >", value, "buyInfoNum");
            return (Criteria) this;
        }

        public Criteria andBuyInfoNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("buy_info_num >=", value, "buyInfoNum");
            return (Criteria) this;
        }

        public Criteria andBuyInfoNumLessThan(Integer value) {
            addCriterion("buy_info_num <", value, "buyInfoNum");
            return (Criteria) this;
        }

        public Criteria andBuyInfoNumLessThanOrEqualTo(Integer value) {
            addCriterion("buy_info_num <=", value, "buyInfoNum");
            return (Criteria) this;
        }

        public Criteria andBuyInfoNumIn(List<Integer> values) {
            addCriterion("buy_info_num in", values, "buyInfoNum");
            return (Criteria) this;
        }

        public Criteria andBuyInfoNumNotIn(List<Integer> values) {
            addCriterion("buy_info_num not in", values, "buyInfoNum");
            return (Criteria) this;
        }

        public Criteria andBuyInfoNumBetween(Integer value1, Integer value2) {
            addCriterion("buy_info_num between", value1, value2, "buyInfoNum");
            return (Criteria) this;
        }

        public Criteria andBuyInfoNumNotBetween(Integer value1, Integer value2) {
            addCriterion("buy_info_num not between", value1, value2, "buyInfoNum");
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