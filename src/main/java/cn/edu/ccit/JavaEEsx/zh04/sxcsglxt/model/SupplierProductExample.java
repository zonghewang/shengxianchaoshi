package cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model;

import java.util.ArrayList;
import java.util.List;

public class SupplierProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SupplierProductExample() {
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

        public Criteria andSupplierNameIsNull() {
            addCriterion("supplier_name is null");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIsNotNull() {
            addCriterion("supplier_name is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierNameEqualTo(String value) {
            addCriterion("supplier_name =", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotEqualTo(String value) {
            addCriterion("supplier_name <>", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameGreaterThan(String value) {
            addCriterion("supplier_name >", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_name >=", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLessThan(String value) {
            addCriterion("supplier_name <", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLessThanOrEqualTo(String value) {
            addCriterion("supplier_name <=", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLike(String value) {
            addCriterion("supplier_name like", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotLike(String value) {
            addCriterion("supplier_name not like", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIn(List<String> values) {
            addCriterion("supplier_name in", values, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotIn(List<String> values) {
            addCriterion("supplier_name not in", values, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameBetween(String value1, String value2) {
            addCriterion("supplier_name between", value1, value2, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotBetween(String value1, String value2) {
            addCriterion("supplier_name not between", value1, value2, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierTelIsNull() {
            addCriterion("supplier_tel is null");
            return (Criteria) this;
        }

        public Criteria andSupplierTelIsNotNull() {
            addCriterion("supplier_tel is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierTelEqualTo(String value) {
            addCriterion("supplier_tel =", value, "supplierTel");
            return (Criteria) this;
        }

        public Criteria andSupplierTelNotEqualTo(String value) {
            addCriterion("supplier_tel <>", value, "supplierTel");
            return (Criteria) this;
        }

        public Criteria andSupplierTelGreaterThan(String value) {
            addCriterion("supplier_tel >", value, "supplierTel");
            return (Criteria) this;
        }

        public Criteria andSupplierTelGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_tel >=", value, "supplierTel");
            return (Criteria) this;
        }

        public Criteria andSupplierTelLessThan(String value) {
            addCriterion("supplier_tel <", value, "supplierTel");
            return (Criteria) this;
        }

        public Criteria andSupplierTelLessThanOrEqualTo(String value) {
            addCriterion("supplier_tel <=", value, "supplierTel");
            return (Criteria) this;
        }

        public Criteria andSupplierTelLike(String value) {
            addCriterion("supplier_tel like", value, "supplierTel");
            return (Criteria) this;
        }

        public Criteria andSupplierTelNotLike(String value) {
            addCriterion("supplier_tel not like", value, "supplierTel");
            return (Criteria) this;
        }

        public Criteria andSupplierTelIn(List<String> values) {
            addCriterion("supplier_tel in", values, "supplierTel");
            return (Criteria) this;
        }

        public Criteria andSupplierTelNotIn(List<String> values) {
            addCriterion("supplier_tel not in", values, "supplierTel");
            return (Criteria) this;
        }

        public Criteria andSupplierTelBetween(String value1, String value2) {
            addCriterion("supplier_tel between", value1, value2, "supplierTel");
            return (Criteria) this;
        }

        public Criteria andSupplierTelNotBetween(String value1, String value2) {
            addCriterion("supplier_tel not between", value1, value2, "supplierTel");
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