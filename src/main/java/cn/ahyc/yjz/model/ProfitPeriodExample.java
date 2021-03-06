package cn.ahyc.yjz.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProfitPeriodExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table profit_period
     *
     * @mbggenerated Mon Nov 02 10:32:28 CST 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table profit_period
     *
     * @mbggenerated Mon Nov 02 10:32:28 CST 2015
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table profit_period
     *
     * @mbggenerated Mon Nov 02 10:32:28 CST 2015
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profit_period
     *
     * @mbggenerated Mon Nov 02 10:32:28 CST 2015
     */
    public ProfitPeriodExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profit_period
     *
     * @mbggenerated Mon Nov 02 10:32:28 CST 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profit_period
     *
     * @mbggenerated Mon Nov 02 10:32:28 CST 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profit_period
     *
     * @mbggenerated Mon Nov 02 10:32:28 CST 2015
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profit_period
     *
     * @mbggenerated Mon Nov 02 10:32:28 CST 2015
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profit_period
     *
     * @mbggenerated Mon Nov 02 10:32:28 CST 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profit_period
     *
     * @mbggenerated Mon Nov 02 10:32:28 CST 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profit_period
     *
     * @mbggenerated Mon Nov 02 10:32:28 CST 2015
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profit_period
     *
     * @mbggenerated Mon Nov 02 10:32:28 CST 2015
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profit_period
     *
     * @mbggenerated Mon Nov 02 10:32:28 CST 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profit_period
     *
     * @mbggenerated Mon Nov 02 10:32:28 CST 2015
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table profit_period
     *
     * @mbggenerated Mon Nov 02 10:32:28 CST 2015
     */
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andFixIsNull() {
            addCriterion("fix is null");
            return (Criteria) this;
        }

        public Criteria andFixIsNotNull() {
            addCriterion("fix is not null");
            return (Criteria) this;
        }

        public Criteria andFixEqualTo(Integer value) {
            addCriterion("fix =", value, "fix");
            return (Criteria) this;
        }

        public Criteria andFixNotEqualTo(Integer value) {
            addCriterion("fix <>", value, "fix");
            return (Criteria) this;
        }

        public Criteria andFixGreaterThan(Integer value) {
            addCriterion("fix >", value, "fix");
            return (Criteria) this;
        }

        public Criteria andFixGreaterThanOrEqualTo(Integer value) {
            addCriterion("fix >=", value, "fix");
            return (Criteria) this;
        }

        public Criteria andFixLessThan(Integer value) {
            addCriterion("fix <", value, "fix");
            return (Criteria) this;
        }

        public Criteria andFixLessThanOrEqualTo(Integer value) {
            addCriterion("fix <=", value, "fix");
            return (Criteria) this;
        }

        public Criteria andFixIn(List<Integer> values) {
            addCriterion("fix in", values, "fix");
            return (Criteria) this;
        }

        public Criteria andFixNotIn(List<Integer> values) {
            addCriterion("fix not in", values, "fix");
            return (Criteria) this;
        }

        public Criteria andFixBetween(Integer value1, Integer value2) {
            addCriterion("fix between", value1, value2, "fix");
            return (Criteria) this;
        }

        public Criteria andFixNotBetween(Integer value1, Integer value2) {
            addCriterion("fix not between", value1, value2, "fix");
            return (Criteria) this;
        }

        public Criteria andMonthExpIsNull() {
            addCriterion("month_exp is null");
            return (Criteria) this;
        }

        public Criteria andMonthExpIsNotNull() {
            addCriterion("month_exp is not null");
            return (Criteria) this;
        }

        public Criteria andMonthExpEqualTo(String value) {
            addCriterion("month_exp =", value, "monthExp");
            return (Criteria) this;
        }

        public Criteria andMonthExpNotEqualTo(String value) {
            addCriterion("month_exp <>", value, "monthExp");
            return (Criteria) this;
        }

        public Criteria andMonthExpGreaterThan(String value) {
            addCriterion("month_exp >", value, "monthExp");
            return (Criteria) this;
        }

        public Criteria andMonthExpGreaterThanOrEqualTo(String value) {
            addCriterion("month_exp >=", value, "monthExp");
            return (Criteria) this;
        }

        public Criteria andMonthExpLessThan(String value) {
            addCriterion("month_exp <", value, "monthExp");
            return (Criteria) this;
        }

        public Criteria andMonthExpLessThanOrEqualTo(String value) {
            addCriterion("month_exp <=", value, "monthExp");
            return (Criteria) this;
        }

        public Criteria andMonthExpLike(String value) {
            addCriterion("month_exp like", value, "monthExp");
            return (Criteria) this;
        }

        public Criteria andMonthExpNotLike(String value) {
            addCriterion("month_exp not like", value, "monthExp");
            return (Criteria) this;
        }

        public Criteria andMonthExpIn(List<String> values) {
            addCriterion("month_exp in", values, "monthExp");
            return (Criteria) this;
        }

        public Criteria andMonthExpNotIn(List<String> values) {
            addCriterion("month_exp not in", values, "monthExp");
            return (Criteria) this;
        }

        public Criteria andMonthExpBetween(String value1, String value2) {
            addCriterion("month_exp between", value1, value2, "monthExp");
            return (Criteria) this;
        }

        public Criteria andMonthExpNotBetween(String value1, String value2) {
            addCriterion("month_exp not between", value1, value2, "monthExp");
            return (Criteria) this;
        }

        public Criteria andMonthMoneyIsNull() {
            addCriterion("month_money is null");
            return (Criteria) this;
        }

        public Criteria andMonthMoneyIsNotNull() {
            addCriterion("month_money is not null");
            return (Criteria) this;
        }

        public Criteria andMonthMoneyEqualTo(BigDecimal value) {
            addCriterion("month_money =", value, "monthMoney");
            return (Criteria) this;
        }

        public Criteria andMonthMoneyNotEqualTo(BigDecimal value) {
            addCriterion("month_money <>", value, "monthMoney");
            return (Criteria) this;
        }

        public Criteria andMonthMoneyGreaterThan(BigDecimal value) {
            addCriterion("month_money >", value, "monthMoney");
            return (Criteria) this;
        }

        public Criteria andMonthMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("month_money >=", value, "monthMoney");
            return (Criteria) this;
        }

        public Criteria andMonthMoneyLessThan(BigDecimal value) {
            addCriterion("month_money <", value, "monthMoney");
            return (Criteria) this;
        }

        public Criteria andMonthMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("month_money <=", value, "monthMoney");
            return (Criteria) this;
        }

        public Criteria andMonthMoneyIn(List<BigDecimal> values) {
            addCriterion("month_money in", values, "monthMoney");
            return (Criteria) this;
        }

        public Criteria andMonthMoneyNotIn(List<BigDecimal> values) {
            addCriterion("month_money not in", values, "monthMoney");
            return (Criteria) this;
        }

        public Criteria andMonthMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("month_money between", value1, value2, "monthMoney");
            return (Criteria) this;
        }

        public Criteria andMonthMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("month_money not between", value1, value2, "monthMoney");
            return (Criteria) this;
        }

        public Criteria andLastMonthExpIsNull() {
            addCriterion("last_month_exp is null");
            return (Criteria) this;
        }

        public Criteria andLastMonthExpIsNotNull() {
            addCriterion("last_month_exp is not null");
            return (Criteria) this;
        }

        public Criteria andLastMonthExpEqualTo(String value) {
            addCriterion("last_month_exp =", value, "lastMonthExp");
            return (Criteria) this;
        }

        public Criteria andLastMonthExpNotEqualTo(String value) {
            addCriterion("last_month_exp <>", value, "lastMonthExp");
            return (Criteria) this;
        }

        public Criteria andLastMonthExpGreaterThan(String value) {
            addCriterion("last_month_exp >", value, "lastMonthExp");
            return (Criteria) this;
        }

        public Criteria andLastMonthExpGreaterThanOrEqualTo(String value) {
            addCriterion("last_month_exp >=", value, "lastMonthExp");
            return (Criteria) this;
        }

        public Criteria andLastMonthExpLessThan(String value) {
            addCriterion("last_month_exp <", value, "lastMonthExp");
            return (Criteria) this;
        }

        public Criteria andLastMonthExpLessThanOrEqualTo(String value) {
            addCriterion("last_month_exp <=", value, "lastMonthExp");
            return (Criteria) this;
        }

        public Criteria andLastMonthExpLike(String value) {
            addCriterion("last_month_exp like", value, "lastMonthExp");
            return (Criteria) this;
        }

        public Criteria andLastMonthExpNotLike(String value) {
            addCriterion("last_month_exp not like", value, "lastMonthExp");
            return (Criteria) this;
        }

        public Criteria andLastMonthExpIn(List<String> values) {
            addCriterion("last_month_exp in", values, "lastMonthExp");
            return (Criteria) this;
        }

        public Criteria andLastMonthExpNotIn(List<String> values) {
            addCriterion("last_month_exp not in", values, "lastMonthExp");
            return (Criteria) this;
        }

        public Criteria andLastMonthExpBetween(String value1, String value2) {
            addCriterion("last_month_exp between", value1, value2, "lastMonthExp");
            return (Criteria) this;
        }

        public Criteria andLastMonthExpNotBetween(String value1, String value2) {
            addCriterion("last_month_exp not between", value1, value2, "lastMonthExp");
            return (Criteria) this;
        }

        public Criteria andLastMonthMoneyIsNull() {
            addCriterion("last_month_money is null");
            return (Criteria) this;
        }

        public Criteria andLastMonthMoneyIsNotNull() {
            addCriterion("last_month_money is not null");
            return (Criteria) this;
        }

        public Criteria andLastMonthMoneyEqualTo(BigDecimal value) {
            addCriterion("last_month_money =", value, "lastMonthMoney");
            return (Criteria) this;
        }

        public Criteria andLastMonthMoneyNotEqualTo(BigDecimal value) {
            addCriterion("last_month_money <>", value, "lastMonthMoney");
            return (Criteria) this;
        }

        public Criteria andLastMonthMoneyGreaterThan(BigDecimal value) {
            addCriterion("last_month_money >", value, "lastMonthMoney");
            return (Criteria) this;
        }

        public Criteria andLastMonthMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("last_month_money >=", value, "lastMonthMoney");
            return (Criteria) this;
        }

        public Criteria andLastMonthMoneyLessThan(BigDecimal value) {
            addCriterion("last_month_money <", value, "lastMonthMoney");
            return (Criteria) this;
        }

        public Criteria andLastMonthMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("last_month_money <=", value, "lastMonthMoney");
            return (Criteria) this;
        }

        public Criteria andLastMonthMoneyIn(List<BigDecimal> values) {
            addCriterion("last_month_money in", values, "lastMonthMoney");
            return (Criteria) this;
        }

        public Criteria andLastMonthMoneyNotIn(List<BigDecimal> values) {
            addCriterion("last_month_money not in", values, "lastMonthMoney");
            return (Criteria) this;
        }

        public Criteria andLastMonthMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("last_month_money between", value1, value2, "lastMonthMoney");
            return (Criteria) this;
        }

        public Criteria andLastMonthMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("last_month_money not between", value1, value2, "lastMonthMoney");
            return (Criteria) this;
        }

        public Criteria andBookIdIsNull() {
            addCriterion("book_id is null");
            return (Criteria) this;
        }

        public Criteria andBookIdIsNotNull() {
            addCriterion("book_id is not null");
            return (Criteria) this;
        }

        public Criteria andBookIdEqualTo(Long value) {
            addCriterion("book_id =", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotEqualTo(Long value) {
            addCriterion("book_id <>", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThan(Long value) {
            addCriterion("book_id >", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThanOrEqualTo(Long value) {
            addCriterion("book_id >=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThan(Long value) {
            addCriterion("book_id <", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThanOrEqualTo(Long value) {
            addCriterion("book_id <=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdIn(List<Long> values) {
            addCriterion("book_id in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotIn(List<Long> values) {
            addCriterion("book_id not in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdBetween(Long value1, Long value2) {
            addCriterion("book_id between", value1, value2, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotBetween(Long value1, Long value2) {
            addCriterion("book_id not between", value1, value2, "bookId");
            return (Criteria) this;
        }

        public Criteria andCurrentPeriodIsNull() {
            addCriterion("current_period is null");
            return (Criteria) this;
        }

        public Criteria andCurrentPeriodIsNotNull() {
            addCriterion("current_period is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentPeriodEqualTo(Integer value) {
            addCriterion("current_period =", value, "currentPeriod");
            return (Criteria) this;
        }

        public Criteria andCurrentPeriodNotEqualTo(Integer value) {
            addCriterion("current_period <>", value, "currentPeriod");
            return (Criteria) this;
        }

        public Criteria andCurrentPeriodGreaterThan(Integer value) {
            addCriterion("current_period >", value, "currentPeriod");
            return (Criteria) this;
        }

        public Criteria andCurrentPeriodGreaterThanOrEqualTo(Integer value) {
            addCriterion("current_period >=", value, "currentPeriod");
            return (Criteria) this;
        }

        public Criteria andCurrentPeriodLessThan(Integer value) {
            addCriterion("current_period <", value, "currentPeriod");
            return (Criteria) this;
        }

        public Criteria andCurrentPeriodLessThanOrEqualTo(Integer value) {
            addCriterion("current_period <=", value, "currentPeriod");
            return (Criteria) this;
        }

        public Criteria andCurrentPeriodIn(List<Integer> values) {
            addCriterion("current_period in", values, "currentPeriod");
            return (Criteria) this;
        }

        public Criteria andCurrentPeriodNotIn(List<Integer> values) {
            addCriterion("current_period not in", values, "currentPeriod");
            return (Criteria) this;
        }

        public Criteria andCurrentPeriodBetween(Integer value1, Integer value2) {
            addCriterion("current_period between", value1, value2, "currentPeriod");
            return (Criteria) this;
        }

        public Criteria andCurrentPeriodNotBetween(Integer value1, Integer value2) {
            addCriterion("current_period not between", value1, value2, "currentPeriod");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNull() {
            addCriterion("modify_time is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("modify_time =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("modify_time <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("modify_time >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_time >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("modify_time <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("modify_time <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("modify_time in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("modify_time not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("modify_time between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("modify_time not between", value1, value2, "modifyTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table profit_period
     *
     * @mbggenerated do_not_delete_during_merge Mon Nov 02 10:32:28 CST 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table profit_period
     *
     * @mbggenerated Mon Nov 02 10:32:28 CST 2015
     */
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