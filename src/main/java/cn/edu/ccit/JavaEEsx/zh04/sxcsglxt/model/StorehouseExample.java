package cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StorehouseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StorehouseExample() {
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

        public Criteria andStorehouseNameIsNull() {
            addCriterion("storehouse_name is null");
            return (Criteria) this;
        }

        public Criteria andStorehouseNameIsNotNull() {
            addCriterion("storehouse_name is not null");
            return (Criteria) this;
        }

        public Criteria andStorehouseNameEqualTo(String value) {
            addCriterion("storehouse_name =", value, "storehouseName");
            return (Criteria) this;
        }

        public Criteria andStorehouseNameNotEqualTo(String value) {
            addCriterion("storehouse_name <>", value, "storehouseName");
            return (Criteria) this;
        }

        public Criteria andStorehouseNameGreaterThan(String value) {
            addCriterion("storehouse_name >", value, "storehouseName");
            return (Criteria) this;
        }

        public Criteria andStorehouseNameGreaterThanOrEqualTo(String value) {
            addCriterion("storehouse_name >=", value, "storehouseName");
            return (Criteria) this;
        }

        public Criteria andStorehouseNameLessThan(String value) {
            addCriterion("storehouse_name <", value, "storehouseName");
            return (Criteria) this;
        }

        public Criteria andStorehouseNameLessThanOrEqualTo(String value) {
            addCriterion("storehouse_name <=", value, "storehouseName");
            return (Criteria) this;
        }

        public Criteria andStorehouseNameLike(String value) {
            addCriterion("storehouse_name like", value, "storehouseName");
            return (Criteria) this;
        }

        public Criteria andStorehouseNameNotLike(String value) {
            addCriterion("storehouse_name not like", value, "storehouseName");
            return (Criteria) this;
        }

        public Criteria andStorehouseNameIn(List<String> values) {
            addCriterion("storehouse_name in", values, "storehouseName");
            return (Criteria) this;
        }

        public Criteria andStorehouseNameNotIn(List<String> values) {
            addCriterion("storehouse_name not in", values, "storehouseName");
            return (Criteria) this;
        }

        public Criteria andStorehouseNameBetween(String value1, String value2) {
            addCriterion("storehouse_name between", value1, value2, "storehouseName");
            return (Criteria) this;
        }

        public Criteria andStorehouseNameNotBetween(String value1, String value2) {
            addCriterion("storehouse_name not between", value1, value2, "storehouseName");
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

        public Criteria andStorehouseNumIsNull() {
            addCriterion("storehouse_num is null");
            return (Criteria) this;
        }

        public Criteria andStorehouseNumIsNotNull() {
            addCriterion("storehouse_num is not null");
            return (Criteria) this;
        }

        public Criteria andStorehouseNumEqualTo(Integer value) {
            addCriterion("storehouse_num =", value, "storehouseNum");
            return (Criteria) this;
        }

        public Criteria andStorehouseNumNotEqualTo(Integer value) {
            addCriterion("storehouse_num <>", value, "storehouseNum");
            return (Criteria) this;
        }

        public Criteria andStorehouseNumGreaterThan(Integer value) {
            addCriterion("storehouse_num >", value, "storehouseNum");
            return (Criteria) this;
        }

        public Criteria andStorehouseNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("storehouse_num >=", value, "storehouseNum");
            return (Criteria) this;
        }

        public Criteria andStorehouseNumLessThan(Integer value) {
            addCriterion("storehouse_num <", value, "storehouseNum");
            return (Criteria) this;
        }

        public Criteria andStorehouseNumLessThanOrEqualTo(Integer value) {
            addCriterion("storehouse_num <=", value, "storehouseNum");
            return (Criteria) this;
        }

        public Criteria andStorehouseNumIn(List<Integer> values) {
            addCriterion("storehouse_num in", values, "storehouseNum");
            return (Criteria) this;
        }

        public Criteria andStorehouseNumNotIn(List<Integer> values) {
            addCriterion("storehouse_num not in", values, "storehouseNum");
            return (Criteria) this;
        }

        public Criteria andStorehouseNumBetween(Integer value1, Integer value2) {
            addCriterion("storehouse_num between", value1, value2, "storehouseNum");
            return (Criteria) this;
        }

        public Criteria andStorehouseNumNotBetween(Integer value1, Integer value2) {
            addCriterion("storehouse_num not between", value1, value2, "storehouseNum");
            return (Criteria) this;
        }

        public Criteria andStorehouseTimeIsNull() {
            addCriterion("storehouse_time is null");
            return (Criteria) this;
        }

        public Criteria andStorehouseTimeIsNotNull() {
            addCriterion("storehouse_time is not null");
            return (Criteria) this;
        }

        public Criteria andStorehouseTimeEqualTo(Date value) {
            addCriterion("storehouse_time =", value, "storehouseTime");
            return (Criteria) this;
        }

        public Criteria andStorehouseTimeNotEqualTo(Date value) {
            addCriterion("storehouse_time <>", value, "storehouseTime");
            return (Criteria) this;
        }

        public Criteria andStorehouseTimeGreaterThan(Date value) {
            addCriterion("storehouse_time >", value, "storehouseTime");
            return (Criteria) this;
        }

        public Criteria andStorehouseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("storehouse_time >=", value, "storehouseTime");
            return (Criteria) this;
        }

        public Criteria andStorehouseTimeLessThan(Date value) {
            addCriterion("storehouse_time <", value, "storehouseTime");
            return (Criteria) this;
        }

        public Criteria andStorehouseTimeLessThanOrEqualTo(Date value) {
            addCriterion("storehouse_time <=", value, "storehouseTime");
            return (Criteria) this;
        }

        public Criteria andStorehouseTimeIn(List<Date> values) {
            addCriterion("storehouse_time in", values, "storehouseTime");
            return (Criteria) this;
        }

        public Criteria andStorehouseTimeNotIn(List<Date> values) {
            addCriterion("storehouse_time not in", values, "storehouseTime");
            return (Criteria) this;
        }

        public Criteria andStorehouseTimeBetween(Date value1, Date value2) {
            addCriterion("storehouse_time between", value1, value2, "storehouseTime");
            return (Criteria) this;
        }

        public Criteria andStorehouseTimeNotBetween(Date value1, Date value2) {
            addCriterion("storehouse_time not between", value1, value2, "storehouseTime");
            return (Criteria) this;
        }

        public Criteria andStorehouseMinIsNull() {
            addCriterion("storehouse_min is null");
            return (Criteria) this;
        }

        public Criteria andStorehouseMinIsNotNull() {
            addCriterion("storehouse_min is not null");
            return (Criteria) this;
        }

        public Criteria andStorehouseMinEqualTo(Integer value) {
            addCriterion("storehouse_min =", value, "storehouseMin");
            return (Criteria) this;
        }

        public Criteria andStorehouseMinNotEqualTo(Integer value) {
            addCriterion("storehouse_min <>", value, "storehouseMin");
            return (Criteria) this;
        }

        public Criteria andStorehouseMinGreaterThan(Integer value) {
            addCriterion("storehouse_min >", value, "storehouseMin");
            return (Criteria) this;
        }

        public Criteria andStorehouseMinGreaterThanOrEqualTo(Integer value) {
            addCriterion("storehouse_min >=", value, "storehouseMin");
            return (Criteria) this;
        }

        public Criteria andStorehouseMinLessThan(Integer value) {
            addCriterion("storehouse_min <", value, "storehouseMin");
            return (Criteria) this;
        }

        public Criteria andStorehouseMinLessThanOrEqualTo(Integer value) {
            addCriterion("storehouse_min <=", value, "storehouseMin");
            return (Criteria) this;
        }

        public Criteria andStorehouseMinIn(List<Integer> values) {
            addCriterion("storehouse_min in", values, "storehouseMin");
            return (Criteria) this;
        }

        public Criteria andStorehouseMinNotIn(List<Integer> values) {
            addCriterion("storehouse_min not in", values, "storehouseMin");
            return (Criteria) this;
        }

        public Criteria andStorehouseMinBetween(Integer value1, Integer value2) {
            addCriterion("storehouse_min between", value1, value2, "storehouseMin");
            return (Criteria) this;
        }

        public Criteria andStorehouseMinNotBetween(Integer value1, Integer value2) {
            addCriterion("storehouse_min not between", value1, value2, "storehouseMin");
            return (Criteria) this;
        }

        public Criteria andStorehouseMaxIsNull() {
            addCriterion("storehouse_max is null");
            return (Criteria) this;
        }

        public Criteria andStorehouseMaxIsNotNull() {
            addCriterion("storehouse_max is not null");
            return (Criteria) this;
        }

        public Criteria andStorehouseMaxEqualTo(Integer value) {
            addCriterion("storehouse_max =", value, "storehouseMax");
            return (Criteria) this;
        }

        public Criteria andStorehouseMaxNotEqualTo(Integer value) {
            addCriterion("storehouse_max <>", value, "storehouseMax");
            return (Criteria) this;
        }

        public Criteria andStorehouseMaxGreaterThan(Integer value) {
            addCriterion("storehouse_max >", value, "storehouseMax");
            return (Criteria) this;
        }

        public Criteria andStorehouseMaxGreaterThanOrEqualTo(Integer value) {
            addCriterion("storehouse_max >=", value, "storehouseMax");
            return (Criteria) this;
        }

        public Criteria andStorehouseMaxLessThan(Integer value) {
            addCriterion("storehouse_max <", value, "storehouseMax");
            return (Criteria) this;
        }

        public Criteria andStorehouseMaxLessThanOrEqualTo(Integer value) {
            addCriterion("storehouse_max <=", value, "storehouseMax");
            return (Criteria) this;
        }

        public Criteria andStorehouseMaxIn(List<Integer> values) {
            addCriterion("storehouse_max in", values, "storehouseMax");
            return (Criteria) this;
        }

        public Criteria andStorehouseMaxNotIn(List<Integer> values) {
            addCriterion("storehouse_max not in", values, "storehouseMax");
            return (Criteria) this;
        }

        public Criteria andStorehouseMaxBetween(Integer value1, Integer value2) {
            addCriterion("storehouse_max between", value1, value2, "storehouseMax");
            return (Criteria) this;
        }

        public Criteria andStorehouseMaxNotBetween(Integer value1, Integer value2) {
            addCriterion("storehouse_max not between", value1, value2, "storehouseMax");
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