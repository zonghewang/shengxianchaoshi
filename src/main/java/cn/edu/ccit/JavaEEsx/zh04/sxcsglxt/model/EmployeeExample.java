package cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model;

import java.util.ArrayList;
import java.util.List;

public class EmployeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmployeeExample() {
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

        public Criteria andPkEidIsNull() {
            addCriterion("pk_eid is null");
            return (Criteria) this;
        }

        public Criteria andPkEidIsNotNull() {
            addCriterion("pk_eid is not null");
            return (Criteria) this;
        }

        public Criteria andPkEidEqualTo(Long value) {
            addCriterion("pk_eid =", value, "pkEid");
            return (Criteria) this;
        }

        public Criteria andPkEidNotEqualTo(Long value) {
            addCriterion("pk_eid <>", value, "pkEid");
            return (Criteria) this;
        }

        public Criteria andPkEidGreaterThan(Long value) {
            addCriterion("pk_eid >", value, "pkEid");
            return (Criteria) this;
        }

        public Criteria andPkEidGreaterThanOrEqualTo(Long value) {
            addCriterion("pk_eid >=", value, "pkEid");
            return (Criteria) this;
        }

        public Criteria andPkEidLessThan(Long value) {
            addCriterion("pk_eid <", value, "pkEid");
            return (Criteria) this;
        }

        public Criteria andPkEidLessThanOrEqualTo(Long value) {
            addCriterion("pk_eid <=", value, "pkEid");
            return (Criteria) this;
        }

        public Criteria andPkEidIn(List<Long> values) {
            addCriterion("pk_eid in", values, "pkEid");
            return (Criteria) this;
        }

        public Criteria andPkEidNotIn(List<Long> values) {
            addCriterion("pk_eid not in", values, "pkEid");
            return (Criteria) this;
        }

        public Criteria andPkEidBetween(Long value1, Long value2) {
            addCriterion("pk_eid between", value1, value2, "pkEid");
            return (Criteria) this;
        }

        public Criteria andPkEidNotBetween(Long value1, Long value2) {
            addCriterion("pk_eid not between", value1, value2, "pkEid");
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

        public Criteria andEmpNoIsNull() {
            addCriterion("emp_no is null");
            return (Criteria) this;
        }

        public Criteria andEmpNoIsNotNull() {
            addCriterion("emp_no is not null");
            return (Criteria) this;
        }

        public Criteria andEmpNoEqualTo(String value) {
            addCriterion("emp_no =", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoNotEqualTo(String value) {
            addCriterion("emp_no <>", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoGreaterThan(String value) {
            addCriterion("emp_no >", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoGreaterThanOrEqualTo(String value) {
            addCriterion("emp_no >=", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoLessThan(String value) {
            addCriterion("emp_no <", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoLessThanOrEqualTo(String value) {
            addCriterion("emp_no <=", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoLike(String value) {
            addCriterion("emp_no like", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoNotLike(String value) {
            addCriterion("emp_no not like", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoIn(List<String> values) {
            addCriterion("emp_no in", values, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoNotIn(List<String> values) {
            addCriterion("emp_no not in", values, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoBetween(String value1, String value2) {
            addCriterion("emp_no between", value1, value2, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoNotBetween(String value1, String value2) {
            addCriterion("emp_no not between", value1, value2, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNameIsNull() {
            addCriterion("emp_name is null");
            return (Criteria) this;
        }

        public Criteria andEmpNameIsNotNull() {
            addCriterion("emp_name is not null");
            return (Criteria) this;
        }

        public Criteria andEmpNameEqualTo(String value) {
            addCriterion("emp_name =", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotEqualTo(String value) {
            addCriterion("emp_name <>", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameGreaterThan(String value) {
            addCriterion("emp_name >", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameGreaterThanOrEqualTo(String value) {
            addCriterion("emp_name >=", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameLessThan(String value) {
            addCriterion("emp_name <", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameLessThanOrEqualTo(String value) {
            addCriterion("emp_name <=", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameLike(String value) {
            addCriterion("emp_name like", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotLike(String value) {
            addCriterion("emp_name not like", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameIn(List<String> values) {
            addCriterion("emp_name in", values, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotIn(List<String> values) {
            addCriterion("emp_name not in", values, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameBetween(String value1, String value2) {
            addCriterion("emp_name between", value1, value2, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotBetween(String value1, String value2) {
            addCriterion("emp_name not between", value1, value2, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpSexIsNull() {
            addCriterion("emp_sex is null");
            return (Criteria) this;
        }

        public Criteria andEmpSexIsNotNull() {
            addCriterion("emp_sex is not null");
            return (Criteria) this;
        }

        public Criteria andEmpSexEqualTo(Byte value) {
            addCriterion("emp_sex =", value, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexNotEqualTo(Byte value) {
            addCriterion("emp_sex <>", value, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexGreaterThan(Byte value) {
            addCriterion("emp_sex >", value, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexGreaterThanOrEqualTo(Byte value) {
            addCriterion("emp_sex >=", value, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexLessThan(Byte value) {
            addCriterion("emp_sex <", value, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexLessThanOrEqualTo(Byte value) {
            addCriterion("emp_sex <=", value, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexIn(List<Byte> values) {
            addCriterion("emp_sex in", values, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexNotIn(List<Byte> values) {
            addCriterion("emp_sex not in", values, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexBetween(Byte value1, Byte value2) {
            addCriterion("emp_sex between", value1, value2, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexNotBetween(Byte value1, Byte value2) {
            addCriterion("emp_sex not between", value1, value2, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpAgeIsNull() {
            addCriterion("emp_age is null");
            return (Criteria) this;
        }

        public Criteria andEmpAgeIsNotNull() {
            addCriterion("emp_age is not null");
            return (Criteria) this;
        }

        public Criteria andEmpAgeEqualTo(Byte value) {
            addCriterion("emp_age =", value, "empAge");
            return (Criteria) this;
        }

        public Criteria andEmpAgeNotEqualTo(Byte value) {
            addCriterion("emp_age <>", value, "empAge");
            return (Criteria) this;
        }

        public Criteria andEmpAgeGreaterThan(Byte value) {
            addCriterion("emp_age >", value, "empAge");
            return (Criteria) this;
        }

        public Criteria andEmpAgeGreaterThanOrEqualTo(Byte value) {
            addCriterion("emp_age >=", value, "empAge");
            return (Criteria) this;
        }

        public Criteria andEmpAgeLessThan(Byte value) {
            addCriterion("emp_age <", value, "empAge");
            return (Criteria) this;
        }

        public Criteria andEmpAgeLessThanOrEqualTo(Byte value) {
            addCriterion("emp_age <=", value, "empAge");
            return (Criteria) this;
        }

        public Criteria andEmpAgeIn(List<Byte> values) {
            addCriterion("emp_age in", values, "empAge");
            return (Criteria) this;
        }

        public Criteria andEmpAgeNotIn(List<Byte> values) {
            addCriterion("emp_age not in", values, "empAge");
            return (Criteria) this;
        }

        public Criteria andEmpAgeBetween(Byte value1, Byte value2) {
            addCriterion("emp_age between", value1, value2, "empAge");
            return (Criteria) this;
        }

        public Criteria andEmpAgeNotBetween(Byte value1, Byte value2) {
            addCriterion("emp_age not between", value1, value2, "empAge");
            return (Criteria) this;
        }

        public Criteria andEmpTelIsNull() {
            addCriterion("emp_tel is null");
            return (Criteria) this;
        }

        public Criteria andEmpTelIsNotNull() {
            addCriterion("emp_tel is not null");
            return (Criteria) this;
        }

        public Criteria andEmpTelEqualTo(String value) {
            addCriterion("emp_tel =", value, "empTel");
            return (Criteria) this;
        }

        public Criteria andEmpTelNotEqualTo(String value) {
            addCriterion("emp_tel <>", value, "empTel");
            return (Criteria) this;
        }

        public Criteria andEmpTelGreaterThan(String value) {
            addCriterion("emp_tel >", value, "empTel");
            return (Criteria) this;
        }

        public Criteria andEmpTelGreaterThanOrEqualTo(String value) {
            addCriterion("emp_tel >=", value, "empTel");
            return (Criteria) this;
        }

        public Criteria andEmpTelLessThan(String value) {
            addCriterion("emp_tel <", value, "empTel");
            return (Criteria) this;
        }

        public Criteria andEmpTelLessThanOrEqualTo(String value) {
            addCriterion("emp_tel <=", value, "empTel");
            return (Criteria) this;
        }

        public Criteria andEmpTelLike(String value) {
            addCriterion("emp_tel like", value, "empTel");
            return (Criteria) this;
        }

        public Criteria andEmpTelNotLike(String value) {
            addCriterion("emp_tel not like", value, "empTel");
            return (Criteria) this;
        }

        public Criteria andEmpTelIn(List<String> values) {
            addCriterion("emp_tel in", values, "empTel");
            return (Criteria) this;
        }

        public Criteria andEmpTelNotIn(List<String> values) {
            addCriterion("emp_tel not in", values, "empTel");
            return (Criteria) this;
        }

        public Criteria andEmpTelBetween(String value1, String value2) {
            addCriterion("emp_tel between", value1, value2, "empTel");
            return (Criteria) this;
        }

        public Criteria andEmpTelNotBetween(String value1, String value2) {
            addCriterion("emp_tel not between", value1, value2, "empTel");
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