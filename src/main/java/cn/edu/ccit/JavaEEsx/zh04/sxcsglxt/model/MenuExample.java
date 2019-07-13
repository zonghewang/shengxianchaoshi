package cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model;

import java.util.ArrayList;
import java.util.List;

public class MenuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MenuExample() {
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

        public Criteria andPkMidIsNull() {
            addCriterion("pk_mid is null");
            return (Criteria) this;
        }

        public Criteria andPkMidIsNotNull() {
            addCriterion("pk_mid is not null");
            return (Criteria) this;
        }

        public Criteria andPkMidEqualTo(Long value) {
            addCriterion("pk_mid =", value, "pkMid");
            return (Criteria) this;
        }

        public Criteria andPkMidNotEqualTo(Long value) {
            addCriterion("pk_mid <>", value, "pkMid");
            return (Criteria) this;
        }

        public Criteria andPkMidGreaterThan(Long value) {
            addCriterion("pk_mid >", value, "pkMid");
            return (Criteria) this;
        }

        public Criteria andPkMidGreaterThanOrEqualTo(Long value) {
            addCriterion("pk_mid >=", value, "pkMid");
            return (Criteria) this;
        }

        public Criteria andPkMidLessThan(Long value) {
            addCriterion("pk_mid <", value, "pkMid");
            return (Criteria) this;
        }

        public Criteria andPkMidLessThanOrEqualTo(Long value) {
            addCriterion("pk_mid <=", value, "pkMid");
            return (Criteria) this;
        }

        public Criteria andPkMidIn(List<Long> values) {
            addCriterion("pk_mid in", values, "pkMid");
            return (Criteria) this;
        }

        public Criteria andPkMidNotIn(List<Long> values) {
            addCriterion("pk_mid not in", values, "pkMid");
            return (Criteria) this;
        }

        public Criteria andPkMidBetween(Long value1, Long value2) {
            addCriterion("pk_mid between", value1, value2, "pkMid");
            return (Criteria) this;
        }

        public Criteria andPkMidNotBetween(Long value1, Long value2) {
            addCriterion("pk_mid not between", value1, value2, "pkMid");
            return (Criteria) this;
        }

        public Criteria andMenuNameIsNull() {
            addCriterion("menu_name is null");
            return (Criteria) this;
        }

        public Criteria andMenuNameIsNotNull() {
            addCriterion("menu_name is not null");
            return (Criteria) this;
        }

        public Criteria andMenuNameEqualTo(String value) {
            addCriterion("menu_name =", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotEqualTo(String value) {
            addCriterion("menu_name <>", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameGreaterThan(String value) {
            addCriterion("menu_name >", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameGreaterThanOrEqualTo(String value) {
            addCriterion("menu_name >=", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLessThan(String value) {
            addCriterion("menu_name <", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLessThanOrEqualTo(String value) {
            addCriterion("menu_name <=", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLike(String value) {
            addCriterion("menu_name like", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotLike(String value) {
            addCriterion("menu_name not like", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameIn(List<String> values) {
            addCriterion("menu_name in", values, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotIn(List<String> values) {
            addCriterion("menu_name not in", values, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameBetween(String value1, String value2) {
            addCriterion("menu_name between", value1, value2, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotBetween(String value1, String value2) {
            addCriterion("menu_name not between", value1, value2, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuMidIsNull() {
            addCriterion("menu_mid is null");
            return (Criteria) this;
        }

        public Criteria andMenuMidIsNotNull() {
            addCriterion("menu_mid is not null");
            return (Criteria) this;
        }

        public Criteria andMenuMidEqualTo(Long value) {
            addCriterion("menu_mid =", value, "menuMid");
            return (Criteria) this;
        }

        public Criteria andMenuMidNotEqualTo(Long value) {
            addCriterion("menu_mid <>", value, "menuMid");
            return (Criteria) this;
        }

        public Criteria andMenuMidGreaterThan(Long value) {
            addCriterion("menu_mid >", value, "menuMid");
            return (Criteria) this;
        }

        public Criteria andMenuMidGreaterThanOrEqualTo(Long value) {
            addCriterion("menu_mid >=", value, "menuMid");
            return (Criteria) this;
        }

        public Criteria andMenuMidLessThan(Long value) {
            addCriterion("menu_mid <", value, "menuMid");
            return (Criteria) this;
        }

        public Criteria andMenuMidLessThanOrEqualTo(Long value) {
            addCriterion("menu_mid <=", value, "menuMid");
            return (Criteria) this;
        }

        public Criteria andMenuMidIn(List<Long> values) {
            addCriterion("menu_mid in", values, "menuMid");
            return (Criteria) this;
        }

        public Criteria andMenuMidNotIn(List<Long> values) {
            addCriterion("menu_mid not in", values, "menuMid");
            return (Criteria) this;
        }

        public Criteria andMenuMidBetween(Long value1, Long value2) {
            addCriterion("menu_mid between", value1, value2, "menuMid");
            return (Criteria) this;
        }

        public Criteria andMenuMidNotBetween(Long value1, Long value2) {
            addCriterion("menu_mid not between", value1, value2, "menuMid");
            return (Criteria) this;
        }

        public Criteria andIsParentIsNull() {
            addCriterion("is_parent is null");
            return (Criteria) this;
        }

        public Criteria andIsParentIsNotNull() {
            addCriterion("is_parent is not null");
            return (Criteria) this;
        }

        public Criteria andIsParentEqualTo(Byte value) {
            addCriterion("is_parent =", value, "isParent");
            return (Criteria) this;
        }

        public Criteria andIsParentNotEqualTo(Byte value) {
            addCriterion("is_parent <>", value, "isParent");
            return (Criteria) this;
        }

        public Criteria andIsParentGreaterThan(Byte value) {
            addCriterion("is_parent >", value, "isParent");
            return (Criteria) this;
        }

        public Criteria andIsParentGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_parent >=", value, "isParent");
            return (Criteria) this;
        }

        public Criteria andIsParentLessThan(Byte value) {
            addCriterion("is_parent <", value, "isParent");
            return (Criteria) this;
        }

        public Criteria andIsParentLessThanOrEqualTo(Byte value) {
            addCriterion("is_parent <=", value, "isParent");
            return (Criteria) this;
        }

        public Criteria andIsParentIn(List<Byte> values) {
            addCriterion("is_parent in", values, "isParent");
            return (Criteria) this;
        }

        public Criteria andIsParentNotIn(List<Byte> values) {
            addCriterion("is_parent not in", values, "isParent");
            return (Criteria) this;
        }

        public Criteria andIsParentBetween(Byte value1, Byte value2) {
            addCriterion("is_parent between", value1, value2, "isParent");
            return (Criteria) this;
        }

        public Criteria andIsParentNotBetween(Byte value1, Byte value2) {
            addCriterion("is_parent not between", value1, value2, "isParent");
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