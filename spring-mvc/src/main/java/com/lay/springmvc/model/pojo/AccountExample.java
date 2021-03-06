package com.newleaders.ac.model.pojo;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

public class AccountExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table account
     *
     * @mbggenerated Mon Mar 28 12:06:34 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table account
     *
     * @mbggenerated Mon Mar 28 12:06:34 CST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table account
     *
     * @mbggenerated Mon Mar 28 12:06:34 CST 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account
     *
     * @mbggenerated Mon Mar 28 12:06:34 CST 2016
     */
    public AccountExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account
     *
     * @mbggenerated Mon Mar 28 12:06:34 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account
     *
     * @mbggenerated Mon Mar 28 12:06:34 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account
     *
     * @mbggenerated Mon Mar 28 12:06:34 CST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account
     *
     * @mbggenerated Mon Mar 28 12:06:34 CST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account
     *
     * @mbggenerated Mon Mar 28 12:06:34 CST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account
     *
     * @mbggenerated Mon Mar 28 12:06:34 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account
     *
     * @mbggenerated Mon Mar 28 12:06:34 CST 2016
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account
     *
     * @mbggenerated Mon Mar 28 12:06:34 CST 2016
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
     * This method corresponds to the database table account
     *
     * @mbggenerated Mon Mar 28 12:06:34 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account
     *
     * @mbggenerated Mon Mar 28 12:06:34 CST 2016
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table account
     *
     * @mbggenerated Mon Mar 28 12:06:34 CST 2016
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> inputdateCriteria;

        protected List<Criterion> allCriteria;

        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
            inputdateCriteria = new ArrayList<Criterion>();
        }

        public List<Criterion> getInputdateCriteria() {
            return inputdateCriteria;
        }

        protected void addInputdateCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            inputdateCriteria.add(new Criterion(condition, value, "com.newleaders.mybatis.typehandler.JodaDateTime2TimestampTypeHandler"));
            allCriteria = null;
        }

        protected void addInputdateCriterion(String condition, DateTime value1, DateTime value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            inputdateCriteria.add(new Criterion(condition, value1, value2, "com.newleaders.mybatis.typehandler.JodaDateTime2TimestampTypeHandler"));
            allCriteria = null;
        }

        public boolean isValid() {
            return criteria.size() > 0
                || inputdateCriteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            if (allCriteria == null) {
                allCriteria = new ArrayList<Criterion>();
                allCriteria.addAll(criteria);
                allCriteria.addAll(inputdateCriteria);
            }
            return allCriteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
            allCriteria = null;
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
            allCriteria = null;
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
            allCriteria = null;
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("`password` is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("`password` is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("`password` =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("`password` <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("`password` >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("`password` >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("`password` <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("`password` <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("`password` like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("`password` not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("`password` in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("`password` not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("`password` between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("`password` not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andRoleIsNull() {
            addCriterion("`role` is null");
            return (Criteria) this;
        }

        public Criteria andRoleIsNotNull() {
            addCriterion("`role` is not null");
            return (Criteria) this;
        }

        public Criteria andRoleEqualTo(Integer value) {
            addCriterion("`role` =", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotEqualTo(Integer value) {
            addCriterion("`role` <>", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThan(Integer value) {
            addCriterion("`role` >", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThanOrEqualTo(Integer value) {
            addCriterion("`role` >=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThan(Integer value) {
            addCriterion("`role` <", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThanOrEqualTo(Integer value) {
            addCriterion("`role` <=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleIn(List<Integer> values) {
            addCriterion("`role` in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotIn(List<Integer> values) {
            addCriterion("`role` not in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleBetween(Integer value1, Integer value2) {
            addCriterion("`role` between", value1, value2, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotBetween(Integer value1, Integer value2) {
            addCriterion("`role` not between", value1, value2, "role");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNull() {
            addCriterion("enabled is null");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNotNull() {
            addCriterion("enabled is not null");
            return (Criteria) this;
        }

        public Criteria andEnabledEqualTo(Integer value) {
            addCriterion("enabled =", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotEqualTo(Integer value) {
            addCriterion("enabled <>", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThan(Integer value) {
            addCriterion("enabled >", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThanOrEqualTo(Integer value) {
            addCriterion("enabled >=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThan(Integer value) {
            addCriterion("enabled <", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThanOrEqualTo(Integer value) {
            addCriterion("enabled <=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledIn(List<Integer> values) {
            addCriterion("enabled in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotIn(List<Integer> values) {
            addCriterion("enabled not in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledBetween(Integer value1, Integer value2) {
            addCriterion("enabled between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotBetween(Integer value1, Integer value2) {
            addCriterion("enabled not between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andCreatorAccountIdIsNull() {
            addCriterion("creator_account_id is null");
            return (Criteria) this;
        }

        public Criteria andCreatorAccountIdIsNotNull() {
            addCriterion("creator_account_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorAccountIdEqualTo(Integer value) {
            addCriterion("creator_account_id =", value, "creatorAccountId");
            return (Criteria) this;
        }

        public Criteria andCreatorAccountIdNotEqualTo(Integer value) {
            addCriterion("creator_account_id <>", value, "creatorAccountId");
            return (Criteria) this;
        }

        public Criteria andCreatorAccountIdGreaterThan(Integer value) {
            addCriterion("creator_account_id >", value, "creatorAccountId");
            return (Criteria) this;
        }

        public Criteria andCreatorAccountIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("creator_account_id >=", value, "creatorAccountId");
            return (Criteria) this;
        }

        public Criteria andCreatorAccountIdLessThan(Integer value) {
            addCriterion("creator_account_id <", value, "creatorAccountId");
            return (Criteria) this;
        }

        public Criteria andCreatorAccountIdLessThanOrEqualTo(Integer value) {
            addCriterion("creator_account_id <=", value, "creatorAccountId");
            return (Criteria) this;
        }

        public Criteria andCreatorAccountIdIn(List<Integer> values) {
            addCriterion("creator_account_id in", values, "creatorAccountId");
            return (Criteria) this;
        }

        public Criteria andCreatorAccountIdNotIn(List<Integer> values) {
            addCriterion("creator_account_id not in", values, "creatorAccountId");
            return (Criteria) this;
        }

        public Criteria andCreatorAccountIdBetween(Integer value1, Integer value2) {
            addCriterion("creator_account_id between", value1, value2, "creatorAccountId");
            return (Criteria) this;
        }

        public Criteria andCreatorAccountIdNotBetween(Integer value1, Integer value2) {
            addCriterion("creator_account_id not between", value1, value2, "creatorAccountId");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNull() {
            addCriterion("`language` is null");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNotNull() {
            addCriterion("`language` is not null");
            return (Criteria) this;
        }

        public Criteria andLanguageEqualTo(String value) {
            addCriterion("`language` =", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotEqualTo(String value) {
            addCriterion("`language` <>", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThan(String value) {
            addCriterion("`language` >", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("`language` >=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThan(String value) {
            addCriterion("`language` <", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThanOrEqualTo(String value) {
            addCriterion("`language` <=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLike(String value) {
            addCriterion("`language` like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotLike(String value) {
            addCriterion("`language` not like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageIn(List<String> values) {
            addCriterion("`language` in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotIn(List<String> values) {
            addCriterion("`language` not in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageBetween(String value1, String value2) {
            addCriterion("`language` between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotBetween(String value1, String value2) {
            addCriterion("`language` not between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNull() {
            addCriterion("category is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("category is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(String value) {
            addCriterion("category =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(String value) {
            addCriterion("category <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(String value) {
            addCriterion("category >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("category >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(String value) {
            addCriterion("category <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(String value) {
            addCriterion("category <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLike(String value) {
            addCriterion("category like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotLike(String value) {
            addCriterion("category not like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<String> values) {
            addCriterion("category in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<String> values) {
            addCriterion("category not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(String value1, String value2) {
            addCriterion("category between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(String value1, String value2) {
            addCriterion("category not between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCandidateCountLimitIsNull() {
            addCriterion("candidate_count_limit is null");
            return (Criteria) this;
        }

        public Criteria andCandidateCountLimitIsNotNull() {
            addCriterion("candidate_count_limit is not null");
            return (Criteria) this;
        }

        public Criteria andCandidateCountLimitEqualTo(Integer value) {
            addCriterion("candidate_count_limit =", value, "candidateCountLimit");
            return (Criteria) this;
        }

        public Criteria andCandidateCountLimitNotEqualTo(Integer value) {
            addCriterion("candidate_count_limit <>", value, "candidateCountLimit");
            return (Criteria) this;
        }

        public Criteria andCandidateCountLimitGreaterThan(Integer value) {
            addCriterion("candidate_count_limit >", value, "candidateCountLimit");
            return (Criteria) this;
        }

        public Criteria andCandidateCountLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("candidate_count_limit >=", value, "candidateCountLimit");
            return (Criteria) this;
        }

        public Criteria andCandidateCountLimitLessThan(Integer value) {
            addCriterion("candidate_count_limit <", value, "candidateCountLimit");
            return (Criteria) this;
        }

        public Criteria andCandidateCountLimitLessThanOrEqualTo(Integer value) {
            addCriterion("candidate_count_limit <=", value, "candidateCountLimit");
            return (Criteria) this;
        }

        public Criteria andCandidateCountLimitIn(List<Integer> values) {
            addCriterion("candidate_count_limit in", values, "candidateCountLimit");
            return (Criteria) this;
        }

        public Criteria andCandidateCountLimitNotIn(List<Integer> values) {
            addCriterion("candidate_count_limit not in", values, "candidateCountLimit");
            return (Criteria) this;
        }

        public Criteria andCandidateCountLimitBetween(Integer value1, Integer value2) {
            addCriterion("candidate_count_limit between", value1, value2, "candidateCountLimit");
            return (Criteria) this;
        }

        public Criteria andCandidateCountLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("candidate_count_limit not between", value1, value2, "candidateCountLimit");
            return (Criteria) this;
        }

        public Criteria andSubroleIsNull() {
            addCriterion("subrole is null");
            return (Criteria) this;
        }

        public Criteria andSubroleIsNotNull() {
            addCriterion("subrole is not null");
            return (Criteria) this;
        }

        public Criteria andSubroleEqualTo(Integer value) {
            addCriterion("subrole =", value, "subrole");
            return (Criteria) this;
        }

        public Criteria andSubroleNotEqualTo(Integer value) {
            addCriterion("subrole <>", value, "subrole");
            return (Criteria) this;
        }

        public Criteria andSubroleGreaterThan(Integer value) {
            addCriterion("subrole >", value, "subrole");
            return (Criteria) this;
        }

        public Criteria andSubroleGreaterThanOrEqualTo(Integer value) {
            addCriterion("subrole >=", value, "subrole");
            return (Criteria) this;
        }

        public Criteria andSubroleLessThan(Integer value) {
            addCriterion("subrole <", value, "subrole");
            return (Criteria) this;
        }

        public Criteria andSubroleLessThanOrEqualTo(Integer value) {
            addCriterion("subrole <=", value, "subrole");
            return (Criteria) this;
        }

        public Criteria andSubroleIn(List<Integer> values) {
            addCriterion("subrole in", values, "subrole");
            return (Criteria) this;
        }

        public Criteria andSubroleNotIn(List<Integer> values) {
            addCriterion("subrole not in", values, "subrole");
            return (Criteria) this;
        }

        public Criteria andSubroleBetween(Integer value1, Integer value2) {
            addCriterion("subrole between", value1, value2, "subrole");
            return (Criteria) this;
        }

        public Criteria andSubroleNotBetween(Integer value1, Integer value2) {
            addCriterion("subrole not between", value1, value2, "subrole");
            return (Criteria) this;
        }

        public Criteria andCreditIsNull() {
            addCriterion("credit is null");
            return (Criteria) this;
        }

        public Criteria andCreditIsNotNull() {
            addCriterion("credit is not null");
            return (Criteria) this;
        }

        public Criteria andCreditEqualTo(Double value) {
            addCriterion("credit =", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotEqualTo(Double value) {
            addCriterion("credit <>", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditGreaterThan(Double value) {
            addCriterion("credit >", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditGreaterThanOrEqualTo(Double value) {
            addCriterion("credit >=", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditLessThan(Double value) {
            addCriterion("credit <", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditLessThanOrEqualTo(Double value) {
            addCriterion("credit <=", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditIn(List<Double> values) {
            addCriterion("credit in", values, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotIn(List<Double> values) {
            addCriterion("credit not in", values, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditBetween(Double value1, Double value2) {
            addCriterion("credit between", value1, value2, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotBetween(Double value1, Double value2) {
            addCriterion("credit not between", value1, value2, "credit");
            return (Criteria) this;
        }

        public Criteria andCvIdIsNull() {
            addCriterion("cv_id is null");
            return (Criteria) this;
        }

        public Criteria andCvIdIsNotNull() {
            addCriterion("cv_id is not null");
            return (Criteria) this;
        }

        public Criteria andCvIdEqualTo(Integer value) {
            addCriterion("cv_id =", value, "cvId");
            return (Criteria) this;
        }

        public Criteria andCvIdNotEqualTo(Integer value) {
            addCriterion("cv_id <>", value, "cvId");
            return (Criteria) this;
        }

        public Criteria andCvIdGreaterThan(Integer value) {
            addCriterion("cv_id >", value, "cvId");
            return (Criteria) this;
        }

        public Criteria andCvIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cv_id >=", value, "cvId");
            return (Criteria) this;
        }

        public Criteria andCvIdLessThan(Integer value) {
            addCriterion("cv_id <", value, "cvId");
            return (Criteria) this;
        }

        public Criteria andCvIdLessThanOrEqualTo(Integer value) {
            addCriterion("cv_id <=", value, "cvId");
            return (Criteria) this;
        }

        public Criteria andCvIdIn(List<Integer> values) {
            addCriterion("cv_id in", values, "cvId");
            return (Criteria) this;
        }

        public Criteria andCvIdNotIn(List<Integer> values) {
            addCriterion("cv_id not in", values, "cvId");
            return (Criteria) this;
        }

        public Criteria andCvIdBetween(Integer value1, Integer value2) {
            addCriterion("cv_id between", value1, value2, "cvId");
            return (Criteria) this;
        }

        public Criteria andCvIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cv_id not between", value1, value2, "cvId");
            return (Criteria) this;
        }

        public Criteria andInputdateIsNull() {
            addCriterion("InputDate is null");
            return (Criteria) this;
        }

        public Criteria andInputdateIsNotNull() {
            addCriterion("InputDate is not null");
            return (Criteria) this;
        }

        public Criteria andInputdateEqualTo(DateTime value) {
            addInputdateCriterion("InputDate =", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateNotEqualTo(DateTime value) {
            addInputdateCriterion("InputDate <>", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateGreaterThan(DateTime value) {
            addInputdateCriterion("InputDate >", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateGreaterThanOrEqualTo(DateTime value) {
            addInputdateCriterion("InputDate >=", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateLessThan(DateTime value) {
            addInputdateCriterion("InputDate <", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateLessThanOrEqualTo(DateTime value) {
            addInputdateCriterion("InputDate <=", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateIn(List<DateTime> values) {
            addInputdateCriterion("InputDate in", values, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateNotIn(List<DateTime> values) {
            addInputdateCriterion("InputDate not in", values, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateBetween(DateTime value1, DateTime value2) {
            addInputdateCriterion("InputDate between", value1, value2, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateNotBetween(DateTime value1, DateTime value2) {
            addInputdateCriterion("InputDate not between", value1, value2, "inputdate");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table account
     *
     * @mbggenerated do_not_delete_during_merge Mon Mar 28 12:06:34 CST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table account
     *
     * @mbggenerated Mon Mar 28 12:06:34 CST 2016
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