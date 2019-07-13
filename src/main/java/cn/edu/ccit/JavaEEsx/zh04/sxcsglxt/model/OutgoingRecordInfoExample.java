package cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model;

import java.util.ArrayList;
import java.util.List;

public class OutgoingRecordInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OutgoingRecordInfoExample() {
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

        public Criteria andPkOriidIsNull() {
            addCriterion("pk_oriid is null");
            return (Criteria) this;
        }

        public Criteria andPkOriidIsNotNull() {
            addCriterion("pk_oriid is not null");
            return (Criteria) this;
        }

        public Criteria andPkOriidEqualTo(Long value) {
            addCriterion("pk_oriid =", value, "pkOriid");
            return (Criteria) this;
        }

        public Criteria andPkOriidNotEqualTo(Long value) {
            addCriterion("pk_oriid <>", value, "pkOriid");
            return (Criteria) this;
        }

        public Criteria andPkOriidGreaterThan(Long value) {
            addCriterion("pk_oriid >", value, "pkOriid");
            return (Criteria) this;
        }

        public Criteria andPkOriidGreaterThanOrEqualTo(Long value) {
            addCriterion("pk_oriid >=", value, "pkOriid");
            return (Criteria) this;
        }

        public Criteria andPkOriidLessThan(Long value) {
            addCriterion("pk_oriid <", value, "pkOriid");
            return (Criteria) this;
        }

        public Criteria andPkOriidLessThanOrEqualTo(Long value) {
            addCriterion("pk_oriid <=", value, "pkOriid");
            return (Criteria) this;
        }

        public Criteria andPkOriidIn(List<Long> values) {
            addCriterion("pk_oriid in", values, "pkOriid");
            return (Criteria) this;
        }

        public Criteria andPkOriidNotIn(List<Long> values) {
            addCriterion("pk_oriid not in", values, "pkOriid");
            return (Criteria) this;
        }

        public Criteria andPkOriidBetween(Long value1, Long value2) {
            addCriterion("pk_oriid between", value1, value2, "pkOriid");
            return (Criteria) this;
        }

        public Criteria andPkOriidNotBetween(Long value1, Long value2) {
            addCriterion("pk_oriid not between", value1, value2, "pkOriid");
            return (Criteria) this;
        }

        public Criteria andPkOridIsNull() {
            addCriterion("pk_orid is null");
            return (Criteria) this;
        }

        public Criteria andPkOridIsNotNull() {
            addCriterion("pk_orid is not null");
            return (Criteria) this;
        }

        public Criteria andPkOridEqualTo(Long value) {
            addCriterion("pk_orid =", value, "pkOrid");
            return (Criteria) this;
        }

        public Criteria andPkOridNotEqualTo(Long value) {
            addCriterion("pk_orid <>", value, "pkOrid");
            return (Criteria) this;
        }

        public Criteria andPkOridGreaterThan(Long value) {
            addCriterion("pk_orid >", value, "pkOrid");
            return (Criteria) this;
        }

        public Criteria andPkOridGreaterThanOrEqualTo(Long value) {
            addCriterion("pk_orid >=", value, "pkOrid");
            return (Criteria) this;
        }

        public Criteria andPkOridLessThan(Long value) {
            addCriterion("pk_orid <", value, "pkOrid");
            return (Criteria) this;
        }

        public Criteria andPkOridLessThanOrEqualTo(Long value) {
            addCriterion("pk_orid <=", value, "pkOrid");
            return (Criteria) this;
        }

        public Criteria andPkOridIn(List<Long> values) {
            addCriterion("pk_orid in", values, "pkOrid");
            return (Criteria) this;
        }

        public Criteria andPkOridNotIn(List<Long> values) {
            addCriterion("pk_orid not in", values, "pkOrid");
            return (Criteria) this;
        }

        public Criteria andPkOridBetween(Long value1, Long value2) {
            addCriterion("pk_orid between", value1, value2, "pkOrid");
            return (Criteria) this;
        }

        public Criteria andPkOridNotBetween(Long value1, Long value2) {
            addCriterion("pk_orid not between", value1, value2, "pkOrid");
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

        public Criteria andOutgoingRecordNumIsNull() {
            addCriterion("outgoing_record_num is null");
            return (Criteria) this;
        }

        public Criteria andOutgoingRecordNumIsNotNull() {
            addCriterion("outgoing_record_num is not null");
            return (Criteria) this;
        }

        public Criteria andOutgoingRecordNumEqualTo(Integer value) {
            addCriterion("outgoing_record_num =", value, "outgoingRecordNum");
            return (Criteria) this;
        }

        public Criteria andOutgoingRecordNumNotEqualTo(Integer value) {
            addCriterion("outgoing_record_num <>", value, "outgoingRecordNum");
            return (Criteria) this;
        }

        public Criteria andOutgoingRecordNumGreaterThan(Integer value) {
            addCriterion("outgoing_record_num >", value, "outgoingRecordNum");
            return (Criteria) this;
        }

        public Criteria andOutgoingRecordNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("outgoing_record_num >=", value, "outgoingRecordNum");
            return (Criteria) this;
        }

        public Criteria andOutgoingRecordNumLessThan(Integer value) {
            addCriterion("outgoing_record_num <", value, "outgoingRecordNum");
            return (Criteria) this;
        }

        public Criteria andOutgoingRecordNumLessThanOrEqualTo(Integer value) {
            addCriterion("outgoing_record_num <=", value, "outgoingRecordNum");
            return (Criteria) this;
        }

        public Criteria andOutgoingRecordNumIn(List<Integer> values) {
            addCriterion("outgoing_record_num in", values, "outgoingRecordNum");
            return (Criteria) this;
        }

        public Criteria andOutgoingRecordNumNotIn(List<Integer> values) {
            addCriterion("outgoing_record_num not in", values, "outgoingRecordNum");
            return (Criteria) this;
        }

        public Criteria andOutgoingRecordNumBetween(Integer value1, Integer value2) {
            addCriterion("outgoing_record_num between", value1, value2, "outgoingRecordNum");
            return (Criteria) this;
        }

        public Criteria andOutgoingRecordNumNotBetween(Integer value1, Integer value2) {
            addCriterion("outgoing_record_num not between", value1, value2, "outgoingRecordNum");
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