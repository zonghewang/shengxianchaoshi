package cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model;

import java.util.ArrayList;
import java.util.List;

public class RefundsInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RefundsInfoExample() {
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

        public Criteria andPkReiidIsNull() {
            addCriterion("pk_reiid is null");
            return (Criteria) this;
        }

        public Criteria andPkReiidIsNotNull() {
            addCriterion("pk_reiid is not null");
            return (Criteria) this;
        }

        public Criteria andPkReiidEqualTo(Long value) {
            addCriterion("pk_reiid =", value, "pkReiid");
            return (Criteria) this;
        }

        public Criteria andPkReiidNotEqualTo(Long value) {
            addCriterion("pk_reiid <>", value, "pkReiid");
            return (Criteria) this;
        }

        public Criteria andPkReiidGreaterThan(Long value) {
            addCriterion("pk_reiid >", value, "pkReiid");
            return (Criteria) this;
        }

        public Criteria andPkReiidGreaterThanOrEqualTo(Long value) {
            addCriterion("pk_reiid >=", value, "pkReiid");
            return (Criteria) this;
        }

        public Criteria andPkReiidLessThan(Long value) {
            addCriterion("pk_reiid <", value, "pkReiid");
            return (Criteria) this;
        }

        public Criteria andPkReiidLessThanOrEqualTo(Long value) {
            addCriterion("pk_reiid <=", value, "pkReiid");
            return (Criteria) this;
        }

        public Criteria andPkReiidIn(List<Long> values) {
            addCriterion("pk_reiid in", values, "pkReiid");
            return (Criteria) this;
        }

        public Criteria andPkReiidNotIn(List<Long> values) {
            addCriterion("pk_reiid not in", values, "pkReiid");
            return (Criteria) this;
        }

        public Criteria andPkReiidBetween(Long value1, Long value2) {
            addCriterion("pk_reiid between", value1, value2, "pkReiid");
            return (Criteria) this;
        }

        public Criteria andPkReiidNotBetween(Long value1, Long value2) {
            addCriterion("pk_reiid not between", value1, value2, "pkReiid");
            return (Criteria) this;
        }

        public Criteria andPkReidIsNull() {
            addCriterion("pk_reid is null");
            return (Criteria) this;
        }

        public Criteria andPkReidIsNotNull() {
            addCriterion("pk_reid is not null");
            return (Criteria) this;
        }

        public Criteria andPkReidEqualTo(Long value) {
            addCriterion("pk_reid =", value, "pkReid");
            return (Criteria) this;
        }

        public Criteria andPkReidNotEqualTo(Long value) {
            addCriterion("pk_reid <>", value, "pkReid");
            return (Criteria) this;
        }

        public Criteria andPkReidGreaterThan(Long value) {
            addCriterion("pk_reid >", value, "pkReid");
            return (Criteria) this;
        }

        public Criteria andPkReidGreaterThanOrEqualTo(Long value) {
            addCriterion("pk_reid >=", value, "pkReid");
            return (Criteria) this;
        }

        public Criteria andPkReidLessThan(Long value) {
            addCriterion("pk_reid <", value, "pkReid");
            return (Criteria) this;
        }

        public Criteria andPkReidLessThanOrEqualTo(Long value) {
            addCriterion("pk_reid <=", value, "pkReid");
            return (Criteria) this;
        }

        public Criteria andPkReidIn(List<Long> values) {
            addCriterion("pk_reid in", values, "pkReid");
            return (Criteria) this;
        }

        public Criteria andPkReidNotIn(List<Long> values) {
            addCriterion("pk_reid not in", values, "pkReid");
            return (Criteria) this;
        }

        public Criteria andPkReidBetween(Long value1, Long value2) {
            addCriterion("pk_reid between", value1, value2, "pkReid");
            return (Criteria) this;
        }

        public Criteria andPkReidNotBetween(Long value1, Long value2) {
            addCriterion("pk_reid not between", value1, value2, "pkReid");
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

        public Criteria andRefundsInfoNumIsNull() {
            addCriterion("refunds_info_num is null");
            return (Criteria) this;
        }

        public Criteria andRefundsInfoNumIsNotNull() {
            addCriterion("refunds_info_num is not null");
            return (Criteria) this;
        }

        public Criteria andRefundsInfoNumEqualTo(Integer value) {
            addCriterion("refunds_info_num =", value, "refundsInfoNum");
            return (Criteria) this;
        }

        public Criteria andRefundsInfoNumNotEqualTo(Integer value) {
            addCriterion("refunds_info_num <>", value, "refundsInfoNum");
            return (Criteria) this;
        }

        public Criteria andRefundsInfoNumGreaterThan(Integer value) {
            addCriterion("refunds_info_num >", value, "refundsInfoNum");
            return (Criteria) this;
        }

        public Criteria andRefundsInfoNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("refunds_info_num >=", value, "refundsInfoNum");
            return (Criteria) this;
        }

        public Criteria andRefundsInfoNumLessThan(Integer value) {
            addCriterion("refunds_info_num <", value, "refundsInfoNum");
            return (Criteria) this;
        }

        public Criteria andRefundsInfoNumLessThanOrEqualTo(Integer value) {
            addCriterion("refunds_info_num <=", value, "refundsInfoNum");
            return (Criteria) this;
        }

        public Criteria andRefundsInfoNumIn(List<Integer> values) {
            addCriterion("refunds_info_num in", values, "refundsInfoNum");
            return (Criteria) this;
        }

        public Criteria andRefundsInfoNumNotIn(List<Integer> values) {
            addCriterion("refunds_info_num not in", values, "refundsInfoNum");
            return (Criteria) this;
        }

        public Criteria andRefundsInfoNumBetween(Integer value1, Integer value2) {
            addCriterion("refunds_info_num between", value1, value2, "refundsInfoNum");
            return (Criteria) this;
        }

        public Criteria andRefundsInfoNumNotBetween(Integer value1, Integer value2) {
            addCriterion("refunds_info_num not between", value1, value2, "refundsInfoNum");
            return (Criteria) this;
        }

        public Criteria andRefundsInfoPriceIsNull() {
            addCriterion("refunds_info_price is null");
            return (Criteria) this;
        }

        public Criteria andRefundsInfoPriceIsNotNull() {
            addCriterion("refunds_info_price is not null");
            return (Criteria) this;
        }

        public Criteria andRefundsInfoPriceEqualTo(Long value) {
            addCriterion("refunds_info_price =", value, "refundsInfoPrice");
            return (Criteria) this;
        }

        public Criteria andRefundsInfoPriceNotEqualTo(Long value) {
            addCriterion("refunds_info_price <>", value, "refundsInfoPrice");
            return (Criteria) this;
        }

        public Criteria andRefundsInfoPriceGreaterThan(Long value) {
            addCriterion("refunds_info_price >", value, "refundsInfoPrice");
            return (Criteria) this;
        }

        public Criteria andRefundsInfoPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("refunds_info_price >=", value, "refundsInfoPrice");
            return (Criteria) this;
        }

        public Criteria andRefundsInfoPriceLessThan(Long value) {
            addCriterion("refunds_info_price <", value, "refundsInfoPrice");
            return (Criteria) this;
        }

        public Criteria andRefundsInfoPriceLessThanOrEqualTo(Long value) {
            addCriterion("refunds_info_price <=", value, "refundsInfoPrice");
            return (Criteria) this;
        }

        public Criteria andRefundsInfoPriceIn(List<Long> values) {
            addCriterion("refunds_info_price in", values, "refundsInfoPrice");
            return (Criteria) this;
        }

        public Criteria andRefundsInfoPriceNotIn(List<Long> values) {
            addCriterion("refunds_info_price not in", values, "refundsInfoPrice");
            return (Criteria) this;
        }

        public Criteria andRefundsInfoPriceBetween(Long value1, Long value2) {
            addCriterion("refunds_info_price between", value1, value2, "refundsInfoPrice");
            return (Criteria) this;
        }

        public Criteria andRefundsInfoPriceNotBetween(Long value1, Long value2) {
            addCriterion("refunds_info_price not between", value1, value2, "refundsInfoPrice");
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