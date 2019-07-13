package cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerExample() {
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

        public Criteria andCustomerNameIsNull() {
            addCriterion("customer_name is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNotNull() {
            addCriterion("customer_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameEqualTo(String value) {
            addCriterion("customer_name =", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotEqualTo(String value) {
            addCriterion("customer_name <>", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThan(String value) {
            addCriterion("customer_name >", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("customer_name >=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThan(String value) {
            addCriterion("customer_name <", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("customer_name <=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLike(String value) {
            addCriterion("customer_name like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotLike(String value) {
            addCriterion("customer_name not like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIn(List<String> values) {
            addCriterion("customer_name in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotIn(List<String> values) {
            addCriterion("customer_name not in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameBetween(String value1, String value2) {
            addCriterion("customer_name between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotBetween(String value1, String value2) {
            addCriterion("customer_name not between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerAgeIsNull() {
            addCriterion("customer_age is null");
            return (Criteria) this;
        }

        public Criteria andCustomerAgeIsNotNull() {
            addCriterion("customer_age is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerAgeEqualTo(Byte value) {
            addCriterion("customer_age =", value, "customerAge");
            return (Criteria) this;
        }

        public Criteria andCustomerAgeNotEqualTo(Byte value) {
            addCriterion("customer_age <>", value, "customerAge");
            return (Criteria) this;
        }

        public Criteria andCustomerAgeGreaterThan(Byte value) {
            addCriterion("customer_age >", value, "customerAge");
            return (Criteria) this;
        }

        public Criteria andCustomerAgeGreaterThanOrEqualTo(Byte value) {
            addCriterion("customer_age >=", value, "customerAge");
            return (Criteria) this;
        }

        public Criteria andCustomerAgeLessThan(Byte value) {
            addCriterion("customer_age <", value, "customerAge");
            return (Criteria) this;
        }

        public Criteria andCustomerAgeLessThanOrEqualTo(Byte value) {
            addCriterion("customer_age <=", value, "customerAge");
            return (Criteria) this;
        }

        public Criteria andCustomerAgeIn(List<Byte> values) {
            addCriterion("customer_age in", values, "customerAge");
            return (Criteria) this;
        }

        public Criteria andCustomerAgeNotIn(List<Byte> values) {
            addCriterion("customer_age not in", values, "customerAge");
            return (Criteria) this;
        }

        public Criteria andCustomerAgeBetween(Byte value1, Byte value2) {
            addCriterion("customer_age between", value1, value2, "customerAge");
            return (Criteria) this;
        }

        public Criteria andCustomerAgeNotBetween(Byte value1, Byte value2) {
            addCriterion("customer_age not between", value1, value2, "customerAge");
            return (Criteria) this;
        }

        public Criteria andCustomerSexIsNull() {
            addCriterion("customer_sex is null");
            return (Criteria) this;
        }

        public Criteria andCustomerSexIsNotNull() {
            addCriterion("customer_sex is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerSexEqualTo(Byte value) {
            addCriterion("customer_sex =", value, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexNotEqualTo(Byte value) {
            addCriterion("customer_sex <>", value, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexGreaterThan(Byte value) {
            addCriterion("customer_sex >", value, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexGreaterThanOrEqualTo(Byte value) {
            addCriterion("customer_sex >=", value, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexLessThan(Byte value) {
            addCriterion("customer_sex <", value, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexLessThanOrEqualTo(Byte value) {
            addCriterion("customer_sex <=", value, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexIn(List<Byte> values) {
            addCriterion("customer_sex in", values, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexNotIn(List<Byte> values) {
            addCriterion("customer_sex not in", values, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexBetween(Byte value1, Byte value2) {
            addCriterion("customer_sex between", value1, value2, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexNotBetween(Byte value1, Byte value2) {
            addCriterion("customer_sex not between", value1, value2, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNoIsNull() {
            addCriterion("customer_id_no is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNoIsNotNull() {
            addCriterion("customer_id_no is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNoEqualTo(String value) {
            addCriterion("customer_id_no =", value, "customerIdNo");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNoNotEqualTo(String value) {
            addCriterion("customer_id_no <>", value, "customerIdNo");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNoGreaterThan(String value) {
            addCriterion("customer_id_no >", value, "customerIdNo");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNoGreaterThanOrEqualTo(String value) {
            addCriterion("customer_id_no >=", value, "customerIdNo");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNoLessThan(String value) {
            addCriterion("customer_id_no <", value, "customerIdNo");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNoLessThanOrEqualTo(String value) {
            addCriterion("customer_id_no <=", value, "customerIdNo");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNoLike(String value) {
            addCriterion("customer_id_no like", value, "customerIdNo");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNoNotLike(String value) {
            addCriterion("customer_id_no not like", value, "customerIdNo");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNoIn(List<String> values) {
            addCriterion("customer_id_no in", values, "customerIdNo");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNoNotIn(List<String> values) {
            addCriterion("customer_id_no not in", values, "customerIdNo");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNoBetween(String value1, String value2) {
            addCriterion("customer_id_no between", value1, value2, "customerIdNo");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNoNotBetween(String value1, String value2) {
            addCriterion("customer_id_no not between", value1, value2, "customerIdNo");
            return (Criteria) this;
        }

        public Criteria andCustomerAddrIsNull() {
            addCriterion("customer_addr is null");
            return (Criteria) this;
        }

        public Criteria andCustomerAddrIsNotNull() {
            addCriterion("customer_addr is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerAddrEqualTo(String value) {
            addCriterion("customer_addr =", value, "customerAddr");
            return (Criteria) this;
        }

        public Criteria andCustomerAddrNotEqualTo(String value) {
            addCriterion("customer_addr <>", value, "customerAddr");
            return (Criteria) this;
        }

        public Criteria andCustomerAddrGreaterThan(String value) {
            addCriterion("customer_addr >", value, "customerAddr");
            return (Criteria) this;
        }

        public Criteria andCustomerAddrGreaterThanOrEqualTo(String value) {
            addCriterion("customer_addr >=", value, "customerAddr");
            return (Criteria) this;
        }

        public Criteria andCustomerAddrLessThan(String value) {
            addCriterion("customer_addr <", value, "customerAddr");
            return (Criteria) this;
        }

        public Criteria andCustomerAddrLessThanOrEqualTo(String value) {
            addCriterion("customer_addr <=", value, "customerAddr");
            return (Criteria) this;
        }

        public Criteria andCustomerAddrLike(String value) {
            addCriterion("customer_addr like", value, "customerAddr");
            return (Criteria) this;
        }

        public Criteria andCustomerAddrNotLike(String value) {
            addCriterion("customer_addr not like", value, "customerAddr");
            return (Criteria) this;
        }

        public Criteria andCustomerAddrIn(List<String> values) {
            addCriterion("customer_addr in", values, "customerAddr");
            return (Criteria) this;
        }

        public Criteria andCustomerAddrNotIn(List<String> values) {
            addCriterion("customer_addr not in", values, "customerAddr");
            return (Criteria) this;
        }

        public Criteria andCustomerAddrBetween(String value1, String value2) {
            addCriterion("customer_addr between", value1, value2, "customerAddr");
            return (Criteria) this;
        }

        public Criteria andCustomerAddrNotBetween(String value1, String value2) {
            addCriterion("customer_addr not between", value1, value2, "customerAddr");
            return (Criteria) this;
        }

        public Criteria andCustomerTelIsNull() {
            addCriterion("customer_tel is null");
            return (Criteria) this;
        }

        public Criteria andCustomerTelIsNotNull() {
            addCriterion("customer_tel is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerTelEqualTo(String value) {
            addCriterion("customer_tel =", value, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelNotEqualTo(String value) {
            addCriterion("customer_tel <>", value, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelGreaterThan(String value) {
            addCriterion("customer_tel >", value, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelGreaterThanOrEqualTo(String value) {
            addCriterion("customer_tel >=", value, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelLessThan(String value) {
            addCriterion("customer_tel <", value, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelLessThanOrEqualTo(String value) {
            addCriterion("customer_tel <=", value, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelLike(String value) {
            addCriterion("customer_tel like", value, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelNotLike(String value) {
            addCriterion("customer_tel not like", value, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelIn(List<String> values) {
            addCriterion("customer_tel in", values, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelNotIn(List<String> values) {
            addCriterion("customer_tel not in", values, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelBetween(String value1, String value2) {
            addCriterion("customer_tel between", value1, value2, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelNotBetween(String value1, String value2) {
            addCriterion("customer_tel not between", value1, value2, "customerTel");
            return (Criteria) this;
        }

        public Criteria andIsVipIsNull() {
            addCriterion("is_vip is null");
            return (Criteria) this;
        }

        public Criteria andIsVipIsNotNull() {
            addCriterion("is_vip is not null");
            return (Criteria) this;
        }

        public Criteria andIsVipEqualTo(Byte value) {
            addCriterion("is_vip =", value, "isVip");
            return (Criteria) this;
        }

        public Criteria andIsVipNotEqualTo(Byte value) {
            addCriterion("is_vip <>", value, "isVip");
            return (Criteria) this;
        }

        public Criteria andIsVipGreaterThan(Byte value) {
            addCriterion("is_vip >", value, "isVip");
            return (Criteria) this;
        }

        public Criteria andIsVipGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_vip >=", value, "isVip");
            return (Criteria) this;
        }

        public Criteria andIsVipLessThan(Byte value) {
            addCriterion("is_vip <", value, "isVip");
            return (Criteria) this;
        }

        public Criteria andIsVipLessThanOrEqualTo(Byte value) {
            addCriterion("is_vip <=", value, "isVip");
            return (Criteria) this;
        }

        public Criteria andIsVipIn(List<Byte> values) {
            addCriterion("is_vip in", values, "isVip");
            return (Criteria) this;
        }

        public Criteria andIsVipNotIn(List<Byte> values) {
            addCriterion("is_vip not in", values, "isVip");
            return (Criteria) this;
        }

        public Criteria andIsVipBetween(Byte value1, Byte value2) {
            addCriterion("is_vip between", value1, value2, "isVip");
            return (Criteria) this;
        }

        public Criteria andIsVipNotBetween(Byte value1, Byte value2) {
            addCriterion("is_vip not between", value1, value2, "isVip");
            return (Criteria) this;
        }

        public Criteria andVipNoIsNull() {
            addCriterion("vip_no is null");
            return (Criteria) this;
        }

        public Criteria andVipNoIsNotNull() {
            addCriterion("vip_no is not null");
            return (Criteria) this;
        }

        public Criteria andVipNoEqualTo(String value) {
            addCriterion("vip_no =", value, "vipNo");
            return (Criteria) this;
        }

        public Criteria andVipNoNotEqualTo(String value) {
            addCriterion("vip_no <>", value, "vipNo");
            return (Criteria) this;
        }

        public Criteria andVipNoGreaterThan(String value) {
            addCriterion("vip_no >", value, "vipNo");
            return (Criteria) this;
        }

        public Criteria andVipNoGreaterThanOrEqualTo(String value) {
            addCriterion("vip_no >=", value, "vipNo");
            return (Criteria) this;
        }

        public Criteria andVipNoLessThan(String value) {
            addCriterion("vip_no <", value, "vipNo");
            return (Criteria) this;
        }

        public Criteria andVipNoLessThanOrEqualTo(String value) {
            addCriterion("vip_no <=", value, "vipNo");
            return (Criteria) this;
        }

        public Criteria andVipNoLike(String value) {
            addCriterion("vip_no like", value, "vipNo");
            return (Criteria) this;
        }

        public Criteria andVipNoNotLike(String value) {
            addCriterion("vip_no not like", value, "vipNo");
            return (Criteria) this;
        }

        public Criteria andVipNoIn(List<String> values) {
            addCriterion("vip_no in", values, "vipNo");
            return (Criteria) this;
        }

        public Criteria andVipNoNotIn(List<String> values) {
            addCriterion("vip_no not in", values, "vipNo");
            return (Criteria) this;
        }

        public Criteria andVipNoBetween(String value1, String value2) {
            addCriterion("vip_no between", value1, value2, "vipNo");
            return (Criteria) this;
        }

        public Criteria andVipNoNotBetween(String value1, String value2) {
            addCriterion("vip_no not between", value1, value2, "vipNo");
            return (Criteria) this;
        }

        public Criteria andVipDateIsNull() {
            addCriterion("vip_date is null");
            return (Criteria) this;
        }

        public Criteria andVipDateIsNotNull() {
            addCriterion("vip_date is not null");
            return (Criteria) this;
        }

        public Criteria andVipDateEqualTo(Date value) {
            addCriterion("vip_date =", value, "vipDate");
            return (Criteria) this;
        }

        public Criteria andVipDateNotEqualTo(Date value) {
            addCriterion("vip_date <>", value, "vipDate");
            return (Criteria) this;
        }

        public Criteria andVipDateGreaterThan(Date value) {
            addCriterion("vip_date >", value, "vipDate");
            return (Criteria) this;
        }

        public Criteria andVipDateGreaterThanOrEqualTo(Date value) {
            addCriterion("vip_date >=", value, "vipDate");
            return (Criteria) this;
        }

        public Criteria andVipDateLessThan(Date value) {
            addCriterion("vip_date <", value, "vipDate");
            return (Criteria) this;
        }

        public Criteria andVipDateLessThanOrEqualTo(Date value) {
            addCriterion("vip_date <=", value, "vipDate");
            return (Criteria) this;
        }

        public Criteria andVipDateIn(List<Date> values) {
            addCriterion("vip_date in", values, "vipDate");
            return (Criteria) this;
        }

        public Criteria andVipDateNotIn(List<Date> values) {
            addCriterion("vip_date not in", values, "vipDate");
            return (Criteria) this;
        }

        public Criteria andVipDateBetween(Date value1, Date value2) {
            addCriterion("vip_date between", value1, value2, "vipDate");
            return (Criteria) this;
        }

        public Criteria andVipDateNotBetween(Date value1, Date value2) {
            addCriterion("vip_date not between", value1, value2, "vipDate");
            return (Criteria) this;
        }

        public Criteria andVipWhoUseIsNull() {
            addCriterion("vip_who_use is null");
            return (Criteria) this;
        }

        public Criteria andVipWhoUseIsNotNull() {
            addCriterion("vip_who_use is not null");
            return (Criteria) this;
        }

        public Criteria andVipWhoUseEqualTo(String value) {
            addCriterion("vip_who_use =", value, "vipWhoUse");
            return (Criteria) this;
        }

        public Criteria andVipWhoUseNotEqualTo(String value) {
            addCriterion("vip_who_use <>", value, "vipWhoUse");
            return (Criteria) this;
        }

        public Criteria andVipWhoUseGreaterThan(String value) {
            addCriterion("vip_who_use >", value, "vipWhoUse");
            return (Criteria) this;
        }

        public Criteria andVipWhoUseGreaterThanOrEqualTo(String value) {
            addCriterion("vip_who_use >=", value, "vipWhoUse");
            return (Criteria) this;
        }

        public Criteria andVipWhoUseLessThan(String value) {
            addCriterion("vip_who_use <", value, "vipWhoUse");
            return (Criteria) this;
        }

        public Criteria andVipWhoUseLessThanOrEqualTo(String value) {
            addCriterion("vip_who_use <=", value, "vipWhoUse");
            return (Criteria) this;
        }

        public Criteria andVipWhoUseLike(String value) {
            addCriterion("vip_who_use like", value, "vipWhoUse");
            return (Criteria) this;
        }

        public Criteria andVipWhoUseNotLike(String value) {
            addCriterion("vip_who_use not like", value, "vipWhoUse");
            return (Criteria) this;
        }

        public Criteria andVipWhoUseIn(List<String> values) {
            addCriterion("vip_who_use in", values, "vipWhoUse");
            return (Criteria) this;
        }

        public Criteria andVipWhoUseNotIn(List<String> values) {
            addCriterion("vip_who_use not in", values, "vipWhoUse");
            return (Criteria) this;
        }

        public Criteria andVipWhoUseBetween(String value1, String value2) {
            addCriterion("vip_who_use between", value1, value2, "vipWhoUse");
            return (Criteria) this;
        }

        public Criteria andVipWhoUseNotBetween(String value1, String value2) {
            addCriterion("vip_who_use not between", value1, value2, "vipWhoUse");
            return (Criteria) this;
        }

        public Criteria andVipGreadIsNull() {
            addCriterion("vip_gread is null");
            return (Criteria) this;
        }

        public Criteria andVipGreadIsNotNull() {
            addCriterion("vip_gread is not null");
            return (Criteria) this;
        }

        public Criteria andVipGreadEqualTo(Integer value) {
            addCriterion("vip_gread =", value, "vipGread");
            return (Criteria) this;
        }

        public Criteria andVipGreadNotEqualTo(Integer value) {
            addCriterion("vip_gread <>", value, "vipGread");
            return (Criteria) this;
        }

        public Criteria andVipGreadGreaterThan(Integer value) {
            addCriterion("vip_gread >", value, "vipGread");
            return (Criteria) this;
        }

        public Criteria andVipGreadGreaterThanOrEqualTo(Integer value) {
            addCriterion("vip_gread >=", value, "vipGread");
            return (Criteria) this;
        }

        public Criteria andVipGreadLessThan(Integer value) {
            addCriterion("vip_gread <", value, "vipGread");
            return (Criteria) this;
        }

        public Criteria andVipGreadLessThanOrEqualTo(Integer value) {
            addCriterion("vip_gread <=", value, "vipGread");
            return (Criteria) this;
        }

        public Criteria andVipGreadIn(List<Integer> values) {
            addCriterion("vip_gread in", values, "vipGread");
            return (Criteria) this;
        }

        public Criteria andVipGreadNotIn(List<Integer> values) {
            addCriterion("vip_gread not in", values, "vipGread");
            return (Criteria) this;
        }

        public Criteria andVipGreadBetween(Integer value1, Integer value2) {
            addCriterion("vip_gread between", value1, value2, "vipGread");
            return (Criteria) this;
        }

        public Criteria andVipGreadNotBetween(Integer value1, Integer value2) {
            addCriterion("vip_gread not between", value1, value2, "vipGread");
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