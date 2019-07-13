package cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OutgoingRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OutgoingRecordExample() {
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

        public Criteria andPkSidIsNull() {
            addCriterion("pk_sid is null");
            return (Criteria) this;
        }

        public Criteria andPkSidIsNotNull() {
            addCriterion("pk_sid is not null");
            return (Criteria) this;
        }

        public Criteria andPkSidEqualTo(Long value) {
            addCriterion("pk_sid =", value, "pkSid");
            return (Criteria) this;
        }

        public Criteria andPkSidNotEqualTo(Long value) {
            addCriterion("pk_sid <>", value, "pkSid");
            return (Criteria) this;
        }

        public Criteria andPkSidGreaterThan(Long value) {
            addCriterion("pk_sid >", value, "pkSid");
            return (Criteria) this;
        }

        public Criteria andPkSidGreaterThanOrEqualTo(Long value) {
            addCriterion("pk_sid >=", value, "pkSid");
            return (Criteria) this;
        }

        public Criteria andPkSidLessThan(Long value) {
            addCriterion("pk_sid <", value, "pkSid");
            return (Criteria) this;
        }

        public Criteria andPkSidLessThanOrEqualTo(Long value) {
            addCriterion("pk_sid <=", value, "pkSid");
            return (Criteria) this;
        }

        public Criteria andPkSidIn(List<Long> values) {
            addCriterion("pk_sid in", values, "pkSid");
            return (Criteria) this;
        }

        public Criteria andPkSidNotIn(List<Long> values) {
            addCriterion("pk_sid not in", values, "pkSid");
            return (Criteria) this;
        }

        public Criteria andPkSidBetween(Long value1, Long value2) {
            addCriterion("pk_sid between", value1, value2, "pkSid");
            return (Criteria) this;
        }

        public Criteria andPkSidNotBetween(Long value1, Long value2) {
            addCriterion("pk_sid not between", value1, value2, "pkSid");
            return (Criteria) this;
        }

        public Criteria andIsGoingIsNull() {
            addCriterion("is_going is null");
            return (Criteria) this;
        }

        public Criteria andIsGoingIsNotNull() {
            addCriterion("is_going is not null");
            return (Criteria) this;
        }

        public Criteria andIsGoingEqualTo(Byte value) {
            addCriterion("is_going =", value, "isGoing");
            return (Criteria) this;
        }

        public Criteria andIsGoingNotEqualTo(Byte value) {
            addCriterion("is_going <>", value, "isGoing");
            return (Criteria) this;
        }

        public Criteria andIsGoingGreaterThan(Byte value) {
            addCriterion("is_going >", value, "isGoing");
            return (Criteria) this;
        }

        public Criteria andIsGoingGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_going >=", value, "isGoing");
            return (Criteria) this;
        }

        public Criteria andIsGoingLessThan(Byte value) {
            addCriterion("is_going <", value, "isGoing");
            return (Criteria) this;
        }

        public Criteria andIsGoingLessThanOrEqualTo(Byte value) {
            addCriterion("is_going <=", value, "isGoing");
            return (Criteria) this;
        }

        public Criteria andIsGoingIn(List<Byte> values) {
            addCriterion("is_going in", values, "isGoing");
            return (Criteria) this;
        }

        public Criteria andIsGoingNotIn(List<Byte> values) {
            addCriterion("is_going not in", values, "isGoing");
            return (Criteria) this;
        }

        public Criteria andIsGoingBetween(Byte value1, Byte value2) {
            addCriterion("is_going between", value1, value2, "isGoing");
            return (Criteria) this;
        }

        public Criteria andIsGoingNotBetween(Byte value1, Byte value2) {
            addCriterion("is_going not between", value1, value2, "isGoing");
            return (Criteria) this;
        }

        public Criteria andOutgoingRecordTimeIsNull() {
            addCriterion("outgoing_record_time is null");
            return (Criteria) this;
        }

        public Criteria andOutgoingRecordTimeIsNotNull() {
            addCriterion("outgoing_record_time is not null");
            return (Criteria) this;
        }

        public Criteria andOutgoingRecordTimeEqualTo(Date value) {
            addCriterion("outgoing_record_time =", value, "outgoingRecordTime");
            return (Criteria) this;
        }

        public Criteria andOutgoingRecordTimeNotEqualTo(Date value) {
            addCriterion("outgoing_record_time <>", value, "outgoingRecordTime");
            return (Criteria) this;
        }

        public Criteria andOutgoingRecordTimeGreaterThan(Date value) {
            addCriterion("outgoing_record_time >", value, "outgoingRecordTime");
            return (Criteria) this;
        }

        public Criteria andOutgoingRecordTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("outgoing_record_time >=", value, "outgoingRecordTime");
            return (Criteria) this;
        }

        public Criteria andOutgoingRecordTimeLessThan(Date value) {
            addCriterion("outgoing_record_time <", value, "outgoingRecordTime");
            return (Criteria) this;
        }

        public Criteria andOutgoingRecordTimeLessThanOrEqualTo(Date value) {
            addCriterion("outgoing_record_time <=", value, "outgoingRecordTime");
            return (Criteria) this;
        }

        public Criteria andOutgoingRecordTimeIn(List<Date> values) {
            addCriterion("outgoing_record_time in", values, "outgoingRecordTime");
            return (Criteria) this;
        }

        public Criteria andOutgoingRecordTimeNotIn(List<Date> values) {
            addCriterion("outgoing_record_time not in", values, "outgoingRecordTime");
            return (Criteria) this;
        }

        public Criteria andOutgoingRecordTimeBetween(Date value1, Date value2) {
            addCriterion("outgoing_record_time between", value1, value2, "outgoingRecordTime");
            return (Criteria) this;
        }

        public Criteria andOutgoingRecordTimeNotBetween(Date value1, Date value2) {
            addCriterion("outgoing_record_time not between", value1, value2, "outgoingRecordTime");
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