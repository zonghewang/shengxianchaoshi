package cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SalesOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SalesOrderExample() {
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

        public Criteria andPkSoidIsNull() {
            addCriterion("pk_soid is null");
            return (Criteria) this;
        }

        public Criteria andPkSoidIsNotNull() {
            addCriterion("pk_soid is not null");
            return (Criteria) this;
        }

        public Criteria andPkSoidEqualTo(Long value) {
            addCriterion("pk_soid =", value, "pkSoid");
            return (Criteria) this;
        }

        public Criteria andPkSoidNotEqualTo(Long value) {
            addCriterion("pk_soid <>", value, "pkSoid");
            return (Criteria) this;
        }

        public Criteria andPkSoidGreaterThan(Long value) {
            addCriterion("pk_soid >", value, "pkSoid");
            return (Criteria) this;
        }

        public Criteria andPkSoidGreaterThanOrEqualTo(Long value) {
            addCriterion("pk_soid >=", value, "pkSoid");
            return (Criteria) this;
        }

        public Criteria andPkSoidLessThan(Long value) {
            addCriterion("pk_soid <", value, "pkSoid");
            return (Criteria) this;
        }

        public Criteria andPkSoidLessThanOrEqualTo(Long value) {
            addCriterion("pk_soid <=", value, "pkSoid");
            return (Criteria) this;
        }

        public Criteria andPkSoidIn(List<Long> values) {
            addCriterion("pk_soid in", values, "pkSoid");
            return (Criteria) this;
        }

        public Criteria andPkSoidNotIn(List<Long> values) {
            addCriterion("pk_soid not in", values, "pkSoid");
            return (Criteria) this;
        }

        public Criteria andPkSoidBetween(Long value1, Long value2) {
            addCriterion("pk_soid between", value1, value2, "pkSoid");
            return (Criteria) this;
        }

        public Criteria andPkSoidNotBetween(Long value1, Long value2) {
            addCriterion("pk_soid not between", value1, value2, "pkSoid");
            return (Criteria) this;
        }

        public Criteria andSalesOrderTimeIsNull() {
            addCriterion("sales_order_time is null");
            return (Criteria) this;
        }

        public Criteria andSalesOrderTimeIsNotNull() {
            addCriterion("sales_order_time is not null");
            return (Criteria) this;
        }

        public Criteria andSalesOrderTimeEqualTo(Date value) {
            addCriterion("sales_order_time =", value, "salesOrderTime");
            return (Criteria) this;
        }

        public Criteria andSalesOrderTimeNotEqualTo(Date value) {
            addCriterion("sales_order_time <>", value, "salesOrderTime");
            return (Criteria) this;
        }

        public Criteria andSalesOrderTimeGreaterThan(Date value) {
            addCriterion("sales_order_time >", value, "salesOrderTime");
            return (Criteria) this;
        }

        public Criteria andSalesOrderTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sales_order_time >=", value, "salesOrderTime");
            return (Criteria) this;
        }

        public Criteria andSalesOrderTimeLessThan(Date value) {
            addCriterion("sales_order_time <", value, "salesOrderTime");
            return (Criteria) this;
        }

        public Criteria andSalesOrderTimeLessThanOrEqualTo(Date value) {
            addCriterion("sales_order_time <=", value, "salesOrderTime");
            return (Criteria) this;
        }

        public Criteria andSalesOrderTimeIn(List<Date> values) {
            addCriterion("sales_order_time in", values, "salesOrderTime");
            return (Criteria) this;
        }

        public Criteria andSalesOrderTimeNotIn(List<Date> values) {
            addCriterion("sales_order_time not in", values, "salesOrderTime");
            return (Criteria) this;
        }

        public Criteria andSalesOrderTimeBetween(Date value1, Date value2) {
            addCriterion("sales_order_time between", value1, value2, "salesOrderTime");
            return (Criteria) this;
        }

        public Criteria andSalesOrderTimeNotBetween(Date value1, Date value2) {
            addCriterion("sales_order_time not between", value1, value2, "salesOrderTime");
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

        public Criteria andSalesOrderPayIsNull() {
            addCriterion("sales_order_pay is null");
            return (Criteria) this;
        }

        public Criteria andSalesOrderPayIsNotNull() {
            addCriterion("sales_order_pay is not null");
            return (Criteria) this;
        }

        public Criteria andSalesOrderPayEqualTo(Long value) {
            addCriterion("sales_order_pay =", value, "salesOrderPay");
            return (Criteria) this;
        }

        public Criteria andSalesOrderPayNotEqualTo(Long value) {
            addCriterion("sales_order_pay <>", value, "salesOrderPay");
            return (Criteria) this;
        }

        public Criteria andSalesOrderPayGreaterThan(Long value) {
            addCriterion("sales_order_pay >", value, "salesOrderPay");
            return (Criteria) this;
        }

        public Criteria andSalesOrderPayGreaterThanOrEqualTo(Long value) {
            addCriterion("sales_order_pay >=", value, "salesOrderPay");
            return (Criteria) this;
        }

        public Criteria andSalesOrderPayLessThan(Long value) {
            addCriterion("sales_order_pay <", value, "salesOrderPay");
            return (Criteria) this;
        }

        public Criteria andSalesOrderPayLessThanOrEqualTo(Long value) {
            addCriterion("sales_order_pay <=", value, "salesOrderPay");
            return (Criteria) this;
        }

        public Criteria andSalesOrderPayIn(List<Long> values) {
            addCriterion("sales_order_pay in", values, "salesOrderPay");
            return (Criteria) this;
        }

        public Criteria andSalesOrderPayNotIn(List<Long> values) {
            addCriterion("sales_order_pay not in", values, "salesOrderPay");
            return (Criteria) this;
        }

        public Criteria andSalesOrderPayBetween(Long value1, Long value2) {
            addCriterion("sales_order_pay between", value1, value2, "salesOrderPay");
            return (Criteria) this;
        }

        public Criteria andSalesOrderPayNotBetween(Long value1, Long value2) {
            addCriterion("sales_order_pay not between", value1, value2, "salesOrderPay");
            return (Criteria) this;
        }

        public Criteria andPkCidIsNull() {
            addCriterion("pk_cid is null");
            return (Criteria) this;
        }

        public Criteria andPkCidIsNotNull() {
            addCriterion("pk_cid is not null");
            return (Criteria) this;
        }

        public Criteria andPkCidEqualTo(Long value) {
            addCriterion("pk_cid =", value, "pkCid");
            return (Criteria) this;
        }

        public Criteria andPkCidNotEqualTo(Long value) {
            addCriterion("pk_cid <>", value, "pkCid");
            return (Criteria) this;
        }

        public Criteria andPkCidGreaterThan(Long value) {
            addCriterion("pk_cid >", value, "pkCid");
            return (Criteria) this;
        }

        public Criteria andPkCidGreaterThanOrEqualTo(Long value) {
            addCriterion("pk_cid >=", value, "pkCid");
            return (Criteria) this;
        }

        public Criteria andPkCidLessThan(Long value) {
            addCriterion("pk_cid <", value, "pkCid");
            return (Criteria) this;
        }

        public Criteria andPkCidLessThanOrEqualTo(Long value) {
            addCriterion("pk_cid <=", value, "pkCid");
            return (Criteria) this;
        }

        public Criteria andPkCidIn(List<Long> values) {
            addCriterion("pk_cid in", values, "pkCid");
            return (Criteria) this;
        }

        public Criteria andPkCidNotIn(List<Long> values) {
            addCriterion("pk_cid not in", values, "pkCid");
            return (Criteria) this;
        }

        public Criteria andPkCidBetween(Long value1, Long value2) {
            addCriterion("pk_cid between", value1, value2, "pkCid");
            return (Criteria) this;
        }

        public Criteria andPkCidNotBetween(Long value1, Long value2) {
            addCriterion("pk_cid not between", value1, value2, "pkCid");
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