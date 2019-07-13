package cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model;

import java.util.ArrayList;
import java.util.List;

public class SalesOrderInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SalesOrderInfoExample() {
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

        public Criteria andPkSoiidIsNull() {
            addCriterion("pk_soiid is null");
            return (Criteria) this;
        }

        public Criteria andPkSoiidIsNotNull() {
            addCriterion("pk_soiid is not null");
            return (Criteria) this;
        }

        public Criteria andPkSoiidEqualTo(Long value) {
            addCriterion("pk_soiid =", value, "pkSoiid");
            return (Criteria) this;
        }

        public Criteria andPkSoiidNotEqualTo(Long value) {
            addCriterion("pk_soiid <>", value, "pkSoiid");
            return (Criteria) this;
        }

        public Criteria andPkSoiidGreaterThan(Long value) {
            addCriterion("pk_soiid >", value, "pkSoiid");
            return (Criteria) this;
        }

        public Criteria andPkSoiidGreaterThanOrEqualTo(Long value) {
            addCriterion("pk_soiid >=", value, "pkSoiid");
            return (Criteria) this;
        }

        public Criteria andPkSoiidLessThan(Long value) {
            addCriterion("pk_soiid <", value, "pkSoiid");
            return (Criteria) this;
        }

        public Criteria andPkSoiidLessThanOrEqualTo(Long value) {
            addCriterion("pk_soiid <=", value, "pkSoiid");
            return (Criteria) this;
        }

        public Criteria andPkSoiidIn(List<Long> values) {
            addCriterion("pk_soiid in", values, "pkSoiid");
            return (Criteria) this;
        }

        public Criteria andPkSoiidNotIn(List<Long> values) {
            addCriterion("pk_soiid not in", values, "pkSoiid");
            return (Criteria) this;
        }

        public Criteria andPkSoiidBetween(Long value1, Long value2) {
            addCriterion("pk_soiid between", value1, value2, "pkSoiid");
            return (Criteria) this;
        }

        public Criteria andPkSoiidNotBetween(Long value1, Long value2) {
            addCriterion("pk_soiid not between", value1, value2, "pkSoiid");
            return (Criteria) this;
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

        public Criteria andPkPcidIsNull() {
            addCriterion("pk_pcid is null");
            return (Criteria) this;
        }

        public Criteria andPkPcidIsNotNull() {
            addCriterion("pk_pcid is not null");
            return (Criteria) this;
        }

        public Criteria andPkPcidEqualTo(Long value) {
            addCriterion("pk_pcid =", value, "pkPcid");
            return (Criteria) this;
        }

        public Criteria andPkPcidNotEqualTo(Long value) {
            addCriterion("pk_pcid <>", value, "pkPcid");
            return (Criteria) this;
        }

        public Criteria andPkPcidGreaterThan(Long value) {
            addCriterion("pk_pcid >", value, "pkPcid");
            return (Criteria) this;
        }

        public Criteria andPkPcidGreaterThanOrEqualTo(Long value) {
            addCriterion("pk_pcid >=", value, "pkPcid");
            return (Criteria) this;
        }

        public Criteria andPkPcidLessThan(Long value) {
            addCriterion("pk_pcid <", value, "pkPcid");
            return (Criteria) this;
        }

        public Criteria andPkPcidLessThanOrEqualTo(Long value) {
            addCriterion("pk_pcid <=", value, "pkPcid");
            return (Criteria) this;
        }

        public Criteria andPkPcidIn(List<Long> values) {
            addCriterion("pk_pcid in", values, "pkPcid");
            return (Criteria) this;
        }

        public Criteria andPkPcidNotIn(List<Long> values) {
            addCriterion("pk_pcid not in", values, "pkPcid");
            return (Criteria) this;
        }

        public Criteria andPkPcidBetween(Long value1, Long value2) {
            addCriterion("pk_pcid between", value1, value2, "pkPcid");
            return (Criteria) this;
        }

        public Criteria andPkPcidNotBetween(Long value1, Long value2) {
            addCriterion("pk_pcid not between", value1, value2, "pkPcid");
            return (Criteria) this;
        }

        public Criteria andSalesOrderInfoNumIsNull() {
            addCriterion("sales_order_info_num is null");
            return (Criteria) this;
        }

        public Criteria andSalesOrderInfoNumIsNotNull() {
            addCriterion("sales_order_info_num is not null");
            return (Criteria) this;
        }

        public Criteria andSalesOrderInfoNumEqualTo(Integer value) {
            addCriterion("sales_order_info_num =", value, "salesOrderInfoNum");
            return (Criteria) this;
        }

        public Criteria andSalesOrderInfoNumNotEqualTo(Integer value) {
            addCriterion("sales_order_info_num <>", value, "salesOrderInfoNum");
            return (Criteria) this;
        }

        public Criteria andSalesOrderInfoNumGreaterThan(Integer value) {
            addCriterion("sales_order_info_num >", value, "salesOrderInfoNum");
            return (Criteria) this;
        }

        public Criteria andSalesOrderInfoNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("sales_order_info_num >=", value, "salesOrderInfoNum");
            return (Criteria) this;
        }

        public Criteria andSalesOrderInfoNumLessThan(Integer value) {
            addCriterion("sales_order_info_num <", value, "salesOrderInfoNum");
            return (Criteria) this;
        }

        public Criteria andSalesOrderInfoNumLessThanOrEqualTo(Integer value) {
            addCriterion("sales_order_info_num <=", value, "salesOrderInfoNum");
            return (Criteria) this;
        }

        public Criteria andSalesOrderInfoNumIn(List<Integer> values) {
            addCriterion("sales_order_info_num in", values, "salesOrderInfoNum");
            return (Criteria) this;
        }

        public Criteria andSalesOrderInfoNumNotIn(List<Integer> values) {
            addCriterion("sales_order_info_num not in", values, "salesOrderInfoNum");
            return (Criteria) this;
        }

        public Criteria andSalesOrderInfoNumBetween(Integer value1, Integer value2) {
            addCriterion("sales_order_info_num between", value1, value2, "salesOrderInfoNum");
            return (Criteria) this;
        }

        public Criteria andSalesOrderInfoNumNotBetween(Integer value1, Integer value2) {
            addCriterion("sales_order_info_num not between", value1, value2, "salesOrderInfoNum");
            return (Criteria) this;
        }

        public Criteria andSalesOrderInfoPriceIsNull() {
            addCriterion("sales_order_info_price is null");
            return (Criteria) this;
        }

        public Criteria andSalesOrderInfoPriceIsNotNull() {
            addCriterion("sales_order_info_price is not null");
            return (Criteria) this;
        }

        public Criteria andSalesOrderInfoPriceEqualTo(Long value) {
            addCriterion("sales_order_info_price =", value, "salesOrderInfoPrice");
            return (Criteria) this;
        }

        public Criteria andSalesOrderInfoPriceNotEqualTo(Long value) {
            addCriterion("sales_order_info_price <>", value, "salesOrderInfoPrice");
            return (Criteria) this;
        }

        public Criteria andSalesOrderInfoPriceGreaterThan(Long value) {
            addCriterion("sales_order_info_price >", value, "salesOrderInfoPrice");
            return (Criteria) this;
        }

        public Criteria andSalesOrderInfoPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("sales_order_info_price >=", value, "salesOrderInfoPrice");
            return (Criteria) this;
        }

        public Criteria andSalesOrderInfoPriceLessThan(Long value) {
            addCriterion("sales_order_info_price <", value, "salesOrderInfoPrice");
            return (Criteria) this;
        }

        public Criteria andSalesOrderInfoPriceLessThanOrEqualTo(Long value) {
            addCriterion("sales_order_info_price <=", value, "salesOrderInfoPrice");
            return (Criteria) this;
        }

        public Criteria andSalesOrderInfoPriceIn(List<Long> values) {
            addCriterion("sales_order_info_price in", values, "salesOrderInfoPrice");
            return (Criteria) this;
        }

        public Criteria andSalesOrderInfoPriceNotIn(List<Long> values) {
            addCriterion("sales_order_info_price not in", values, "salesOrderInfoPrice");
            return (Criteria) this;
        }

        public Criteria andSalesOrderInfoPriceBetween(Long value1, Long value2) {
            addCriterion("sales_order_info_price between", value1, value2, "salesOrderInfoPrice");
            return (Criteria) this;
        }

        public Criteria andSalesOrderInfoPriceNotBetween(Long value1, Long value2) {
            addCriterion("sales_order_info_price not between", value1, value2, "salesOrderInfoPrice");
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