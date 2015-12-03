package cn.ahyc.yjz.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AccountSubjectTemplateExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table account_subject_template
     *
     * @mbggenerated Wed Sep 30 16:20:19 CST 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table account_subject_template
     *
     * @mbggenerated Wed Sep 30 16:20:19 CST 2015
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table account_subject_template
     *
     * @mbggenerated Wed Sep 30 16:20:19 CST 2015
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_subject_template
     *
     * @mbggenerated Wed Sep 30 16:20:19 CST 2015
     */
    public AccountSubjectTemplateExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_subject_template
     *
     * @mbggenerated Wed Sep 30 16:20:19 CST 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_subject_template
     *
     * @mbggenerated Wed Sep 30 16:20:19 CST 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_subject_template
     *
     * @mbggenerated Wed Sep 30 16:20:19 CST 2015
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_subject_template
     *
     * @mbggenerated Wed Sep 30 16:20:19 CST 2015
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_subject_template
     *
     * @mbggenerated Wed Sep 30 16:20:19 CST 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_subject_template
     *
     * @mbggenerated Wed Sep 30 16:20:19 CST 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_subject_template
     *
     * @mbggenerated Wed Sep 30 16:20:19 CST 2015
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_subject_template
     *
     * @mbggenerated Wed Sep 30 16:20:19 CST 2015
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
     * This method corresponds to the database table account_subject_template
     *
     * @mbggenerated Wed Sep 30 16:20:19 CST 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_subject_template
     *
     * @mbggenerated Wed Sep 30 16:20:19 CST 2015
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table account_subject_template
     *
     * @mbggenerated Wed Sep 30 16:20:19 CST 2015
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

        public Criteria andSubjectCodeIsNull() {
            addCriterion("subject_code is null");
            return (Criteria) this;
        }

        public Criteria andSubjectCodeIsNotNull() {
            addCriterion("subject_code is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectCodeEqualTo(Long value) {
            addCriterion("subject_code =", value, "subjectCode");
            return (Criteria) this;
        }

        public Criteria andSubjectCodeNotEqualTo(Long value) {
            addCriterion("subject_code <>", value, "subjectCode");
            return (Criteria) this;
        }

        public Criteria andSubjectCodeGreaterThan(Long value) {
            addCriterion("subject_code >", value, "subjectCode");
            return (Criteria) this;
        }

        public Criteria andSubjectCodeGreaterThanOrEqualTo(Long value) {
            addCriterion("subject_code >=", value, "subjectCode");
            return (Criteria) this;
        }

        public Criteria andSubjectCodeLessThan(Long value) {
            addCriterion("subject_code <", value, "subjectCode");
            return (Criteria) this;
        }

        public Criteria andSubjectCodeLessThanOrEqualTo(Long value) {
            addCriterion("subject_code <=", value, "subjectCode");
            return (Criteria) this;
        }

        public Criteria andSubjectCodeIn(List<Long> values) {
            addCriterion("subject_code in", values, "subjectCode");
            return (Criteria) this;
        }

        public Criteria andSubjectCodeNotIn(List<Long> values) {
            addCriterion("subject_code not in", values, "subjectCode");
            return (Criteria) this;
        }

        public Criteria andSubjectCodeBetween(Long value1, Long value2) {
            addCriterion("subject_code between", value1, value2, "subjectCode");
            return (Criteria) this;
        }

        public Criteria andSubjectCodeNotBetween(Long value1, Long value2) {
            addCriterion("subject_code not between", value1, value2, "subjectCode");
            return (Criteria) this;
        }

        public Criteria andSubjectNameIsNull() {
            addCriterion("subject_name is null");
            return (Criteria) this;
        }

        public Criteria andSubjectNameIsNotNull() {
            addCriterion("subject_name is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectNameEqualTo(String value) {
            addCriterion("subject_name =", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameNotEqualTo(String value) {
            addCriterion("subject_name <>", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameGreaterThan(String value) {
            addCriterion("subject_name >", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("subject_name >=", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameLessThan(String value) {
            addCriterion("subject_name <", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameLessThanOrEqualTo(String value) {
            addCriterion("subject_name <=", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameLike(String value) {
            addCriterion("subject_name like", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameNotLike(String value) {
            addCriterion("subject_name not like", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameIn(List<String> values) {
            addCriterion("subject_name in", values, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameNotIn(List<String> values) {
            addCriterion("subject_name not in", values, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameBetween(String value1, String value2) {
            addCriterion("subject_name between", value1, value2, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameNotBetween(String value1, String value2) {
            addCriterion("subject_name not between", value1, value2, "subjectName");
            return (Criteria) this;
        }

        public Criteria andParentSubjectCodeIsNull() {
            addCriterion("parent_subject_code is null");
            return (Criteria) this;
        }

        public Criteria andParentSubjectCodeIsNotNull() {
            addCriterion("parent_subject_code is not null");
            return (Criteria) this;
        }

        public Criteria andParentSubjectCodeEqualTo(Long value) {
            addCriterion("parent_subject_code =", value, "parentSubjectCode");
            return (Criteria) this;
        }

        public Criteria andParentSubjectCodeNotEqualTo(Long value) {
            addCriterion("parent_subject_code <>", value, "parentSubjectCode");
            return (Criteria) this;
        }

        public Criteria andParentSubjectCodeGreaterThan(Long value) {
            addCriterion("parent_subject_code >", value, "parentSubjectCode");
            return (Criteria) this;
        }

        public Criteria andParentSubjectCodeGreaterThanOrEqualTo(Long value) {
            addCriterion("parent_subject_code >=", value, "parentSubjectCode");
            return (Criteria) this;
        }

        public Criteria andParentSubjectCodeLessThan(Long value) {
            addCriterion("parent_subject_code <", value, "parentSubjectCode");
            return (Criteria) this;
        }

        public Criteria andParentSubjectCodeLessThanOrEqualTo(Long value) {
            addCriterion("parent_subject_code <=", value, "parentSubjectCode");
            return (Criteria) this;
        }

        public Criteria andParentSubjectCodeIn(List<Long> values) {
            addCriterion("parent_subject_code in", values, "parentSubjectCode");
            return (Criteria) this;
        }

        public Criteria andParentSubjectCodeNotIn(List<Long> values) {
            addCriterion("parent_subject_code not in", values, "parentSubjectCode");
            return (Criteria) this;
        }

        public Criteria andParentSubjectCodeBetween(Long value1, Long value2) {
            addCriterion("parent_subject_code between", value1, value2, "parentSubjectCode");
            return (Criteria) this;
        }

        public Criteria andParentSubjectCodeNotBetween(Long value1, Long value2) {
            addCriterion("parent_subject_code not between", value1, value2, "parentSubjectCode");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Integer value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Integer value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Integer value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Integer value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Integer value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Integer> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Integer> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Integer value1, Integer value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andBalanceDirectionIsNull() {
            addCriterion("balance_direction is null");
            return (Criteria) this;
        }

        public Criteria andBalanceDirectionIsNotNull() {
            addCriterion("balance_direction is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceDirectionEqualTo(Integer value) {
            addCriterion("balance_direction =", value, "balanceDirection");
            return (Criteria) this;
        }

        public Criteria andBalanceDirectionNotEqualTo(Integer value) {
            addCriterion("balance_direction <>", value, "balanceDirection");
            return (Criteria) this;
        }

        public Criteria andBalanceDirectionGreaterThan(Integer value) {
            addCriterion("balance_direction >", value, "balanceDirection");
            return (Criteria) this;
        }

        public Criteria andBalanceDirectionGreaterThanOrEqualTo(Integer value) {
            addCriterion("balance_direction >=", value, "balanceDirection");
            return (Criteria) this;
        }

        public Criteria andBalanceDirectionLessThan(Integer value) {
            addCriterion("balance_direction <", value, "balanceDirection");
            return (Criteria) this;
        }

        public Criteria andBalanceDirectionLessThanOrEqualTo(Integer value) {
            addCriterion("balance_direction <=", value, "balanceDirection");
            return (Criteria) this;
        }

        public Criteria andBalanceDirectionIn(List<Integer> values) {
            addCriterion("balance_direction in", values, "balanceDirection");
            return (Criteria) this;
        }

        public Criteria andBalanceDirectionNotIn(List<Integer> values) {
            addCriterion("balance_direction not in", values, "balanceDirection");
            return (Criteria) this;
        }

        public Criteria andBalanceDirectionBetween(Integer value1, Integer value2) {
            addCriterion("balance_direction between", value1, value2, "balanceDirection");
            return (Criteria) this;
        }

        public Criteria andBalanceDirectionNotBetween(Integer value1, Integer value2) {
            addCriterion("balance_direction not between", value1, value2, "balanceDirection");
            return (Criteria) this;
        }

        public Criteria andDictValueIdIsNull() {
            addCriterion("dict_value_id is null");
            return (Criteria) this;
        }

        public Criteria andDictValueIdIsNotNull() {
            addCriterion("dict_value_id is not null");
            return (Criteria) this;
        }

        public Criteria andDictValueIdEqualTo(Integer value) {
            addCriterion("dict_value_id =", value, "dictValueId");
            return (Criteria) this;
        }

        public Criteria andDictValueIdNotEqualTo(Integer value) {
            addCriterion("dict_value_id <>", value, "dictValueId");
            return (Criteria) this;
        }

        public Criteria andDictValueIdGreaterThan(Integer value) {
            addCriterion("dict_value_id >", value, "dictValueId");
            return (Criteria) this;
        }

        public Criteria andDictValueIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dict_value_id >=", value, "dictValueId");
            return (Criteria) this;
        }

        public Criteria andDictValueIdLessThan(Integer value) {
            addCriterion("dict_value_id <", value, "dictValueId");
            return (Criteria) this;
        }

        public Criteria andDictValueIdLessThanOrEqualTo(Integer value) {
            addCriterion("dict_value_id <=", value, "dictValueId");
            return (Criteria) this;
        }

        public Criteria andDictValueIdIn(List<Integer> values) {
            addCriterion("dict_value_id in", values, "dictValueId");
            return (Criteria) this;
        }

        public Criteria andDictValueIdNotIn(List<Integer> values) {
            addCriterion("dict_value_id not in", values, "dictValueId");
            return (Criteria) this;
        }

        public Criteria andDictValueIdBetween(Integer value1, Integer value2) {
            addCriterion("dict_value_id between", value1, value2, "dictValueId");
            return (Criteria) this;
        }

        public Criteria andDictValueIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dict_value_id not between", value1, value2, "dictValueId");
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
     * This class corresponds to the database table account_subject_template
     *
     * @mbggenerated do_not_delete_during_merge Wed Sep 30 16:20:19 CST 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table account_subject_template
     *
     * @mbggenerated Wed Sep 30 16:20:19 CST 2015
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