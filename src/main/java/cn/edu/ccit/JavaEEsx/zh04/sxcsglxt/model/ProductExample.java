package cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model;

import java.util.ArrayList;
import java.util.List;

public class ProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductExample() {
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

        public Criteria andProductCategoryNameIsNull() {
            addCriterion("product_category_name is null");
            return (Criteria) this;
        }

        public Criteria andProductCategoryNameIsNotNull() {
            addCriterion("product_category_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductCategoryNameEqualTo(String value) {
            addCriterion("product_category_name =", value, "productCategoryName");
            return (Criteria) this;
        }

        public Criteria andProductCategoryNameNotEqualTo(String value) {
            addCriterion("product_category_name <>", value, "productCategoryName");
            return (Criteria) this;
        }

        public Criteria andProductCategoryNameGreaterThan(String value) {
            addCriterion("product_category_name >", value, "productCategoryName");
            return (Criteria) this;
        }

        public Criteria andProductCategoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("product_category_name >=", value, "productCategoryName");
            return (Criteria) this;
        }

        public Criteria andProductCategoryNameLessThan(String value) {
            addCriterion("product_category_name <", value, "productCategoryName");
            return (Criteria) this;
        }

        public Criteria andProductCategoryNameLessThanOrEqualTo(String value) {
            addCriterion("product_category_name <=", value, "productCategoryName");
            return (Criteria) this;
        }

        public Criteria andProductCategoryNameLike(String value) {
            addCriterion("product_category_name like", value, "productCategoryName");
            return (Criteria) this;
        }

        public Criteria andProductCategoryNameNotLike(String value) {
            addCriterion("product_category_name not like", value, "productCategoryName");
            return (Criteria) this;
        }

        public Criteria andProductCategoryNameIn(List<String> values) {
            addCriterion("product_category_name in", values, "productCategoryName");
            return (Criteria) this;
        }

        public Criteria andProductCategoryNameNotIn(List<String> values) {
            addCriterion("product_category_name not in", values, "productCategoryName");
            return (Criteria) this;
        }

        public Criteria andProductCategoryNameBetween(String value1, String value2) {
            addCriterion("product_category_name between", value1, value2, "productCategoryName");
            return (Criteria) this;
        }

        public Criteria andProductCategoryNameNotBetween(String value1, String value2) {
            addCriterion("product_category_name not between", value1, value2, "productCategoryName");
            return (Criteria) this;
        }

        public Criteria andProductCategoryNumIsNull() {
            addCriterion("product_category_num is null");
            return (Criteria) this;
        }

        public Criteria andProductCategoryNumIsNotNull() {
            addCriterion("product_category_num is not null");
            return (Criteria) this;
        }

        public Criteria andProductCategoryNumEqualTo(Integer value) {
            addCriterion("product_category_num =", value, "productCategoryNum");
            return (Criteria) this;
        }

        public Criteria andProductCategoryNumNotEqualTo(Integer value) {
            addCriterion("product_category_num <>", value, "productCategoryNum");
            return (Criteria) this;
        }

        public Criteria andProductCategoryNumGreaterThan(Integer value) {
            addCriterion("product_category_num >", value, "productCategoryNum");
            return (Criteria) this;
        }

        public Criteria andProductCategoryNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_category_num >=", value, "productCategoryNum");
            return (Criteria) this;
        }

        public Criteria andProductCategoryNumLessThan(Integer value) {
            addCriterion("product_category_num <", value, "productCategoryNum");
            return (Criteria) this;
        }

        public Criteria andProductCategoryNumLessThanOrEqualTo(Integer value) {
            addCriterion("product_category_num <=", value, "productCategoryNum");
            return (Criteria) this;
        }

        public Criteria andProductCategoryNumIn(List<Integer> values) {
            addCriterion("product_category_num in", values, "productCategoryNum");
            return (Criteria) this;
        }

        public Criteria andProductCategoryNumNotIn(List<Integer> values) {
            addCriterion("product_category_num not in", values, "productCategoryNum");
            return (Criteria) this;
        }

        public Criteria andProductCategoryNumBetween(Integer value1, Integer value2) {
            addCriterion("product_category_num between", value1, value2, "productCategoryNum");
            return (Criteria) this;
        }

        public Criteria andProductCategoryNumNotBetween(Integer value1, Integer value2) {
            addCriterion("product_category_num not between", value1, value2, "productCategoryNum");
            return (Criteria) this;
        }

        public Criteria andProductCategoryPriceIsNull() {
            addCriterion("product_category_price is null");
            return (Criteria) this;
        }

        public Criteria andProductCategoryPriceIsNotNull() {
            addCriterion("product_category_price is not null");
            return (Criteria) this;
        }

        public Criteria andProductCategoryPriceEqualTo(Long value) {
            addCriterion("product_category_price =", value, "productCategoryPrice");
            return (Criteria) this;
        }

        public Criteria andProductCategoryPriceNotEqualTo(Long value) {
            addCriterion("product_category_price <>", value, "productCategoryPrice");
            return (Criteria) this;
        }

        public Criteria andProductCategoryPriceGreaterThan(Long value) {
            addCriterion("product_category_price >", value, "productCategoryPrice");
            return (Criteria) this;
        }

        public Criteria andProductCategoryPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("product_category_price >=", value, "productCategoryPrice");
            return (Criteria) this;
        }

        public Criteria andProductCategoryPriceLessThan(Long value) {
            addCriterion("product_category_price <", value, "productCategoryPrice");
            return (Criteria) this;
        }

        public Criteria andProductCategoryPriceLessThanOrEqualTo(Long value) {
            addCriterion("product_category_price <=", value, "productCategoryPrice");
            return (Criteria) this;
        }

        public Criteria andProductCategoryPriceIn(List<Long> values) {
            addCriterion("product_category_price in", values, "productCategoryPrice");
            return (Criteria) this;
        }

        public Criteria andProductCategoryPriceNotIn(List<Long> values) {
            addCriterion("product_category_price not in", values, "productCategoryPrice");
            return (Criteria) this;
        }

        public Criteria andProductCategoryPriceBetween(Long value1, Long value2) {
            addCriterion("product_category_price between", value1, value2, "productCategoryPrice");
            return (Criteria) this;
        }

        public Criteria andProductCategoryPriceNotBetween(Long value1, Long value2) {
            addCriterion("product_category_price not between", value1, value2, "productCategoryPrice");
            return (Criteria) this;
        }

        public Criteria andVipPriceIsNull() {
            addCriterion("vip_price is null");
            return (Criteria) this;
        }

        public Criteria andVipPriceIsNotNull() {
            addCriterion("vip_price is not null");
            return (Criteria) this;
        }

        public Criteria andVipPriceEqualTo(Long value) {
            addCriterion("vip_price =", value, "vipPrice");
            return (Criteria) this;
        }

        public Criteria andVipPriceNotEqualTo(Long value) {
            addCriterion("vip_price <>", value, "vipPrice");
            return (Criteria) this;
        }

        public Criteria andVipPriceGreaterThan(Long value) {
            addCriterion("vip_price >", value, "vipPrice");
            return (Criteria) this;
        }

        public Criteria andVipPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("vip_price >=", value, "vipPrice");
            return (Criteria) this;
        }

        public Criteria andVipPriceLessThan(Long value) {
            addCriterion("vip_price <", value, "vipPrice");
            return (Criteria) this;
        }

        public Criteria andVipPriceLessThanOrEqualTo(Long value) {
            addCriterion("vip_price <=", value, "vipPrice");
            return (Criteria) this;
        }

        public Criteria andVipPriceIn(List<Long> values) {
            addCriterion("vip_price in", values, "vipPrice");
            return (Criteria) this;
        }

        public Criteria andVipPriceNotIn(List<Long> values) {
            addCriterion("vip_price not in", values, "vipPrice");
            return (Criteria) this;
        }

        public Criteria andVipPriceBetween(Long value1, Long value2) {
            addCriterion("vip_price between", value1, value2, "vipPrice");
            return (Criteria) this;
        }

        public Criteria andVipPriceNotBetween(Long value1, Long value2) {
            addCriterion("vip_price not between", value1, value2, "vipPrice");
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