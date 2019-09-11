package com.june.video.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PeopleCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PeopleCriteria() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAccountIsNull() {
            addCriterion("Account is null");
            return (Criteria) this;
        }

        public Criteria andAccountIsNotNull() {
            addCriterion("Account is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEqualTo(String value) {
            addCriterion("Account =", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotEqualTo(String value) {
            addCriterion("Account <>", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThan(String value) {
            addCriterion("Account >", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThanOrEqualTo(String value) {
            addCriterion("Account >=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThan(String value) {
            addCriterion("Account <", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThanOrEqualTo(String value) {
            addCriterion("Account <=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLike(String value) {
            addCriterion("Account like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotLike(String value) {
            addCriterion("Account not like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountIn(List<String> values) {
            addCriterion("Account in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotIn(List<String> values) {
            addCriterion("Account not in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountBetween(String value1, String value2) {
            addCriterion("Account between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotBetween(String value1, String value2) {
            addCriterion("Account not between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("Name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("Name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("Name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("Name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("Name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("Name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("Name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("Name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("Name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("Name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("Name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("Name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("Name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("Name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("Password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("Password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("Password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("Password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("Password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("Password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("Password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("Password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("Password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("Password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("Password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("Password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("Password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("Password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andAccountLockedIsNull() {
            addCriterion("Account_Locked is null");
            return (Criteria) this;
        }

        public Criteria andAccountLockedIsNotNull() {
            addCriterion("Account_Locked is not null");
            return (Criteria) this;
        }

        public Criteria andAccountLockedEqualTo(Boolean value) {
            addCriterion("Account_Locked =", value, "accountLocked");
            return (Criteria) this;
        }

        public Criteria andAccountLockedNotEqualTo(Boolean value) {
            addCriterion("Account_Locked <>", value, "accountLocked");
            return (Criteria) this;
        }

        public Criteria andAccountLockedGreaterThan(Boolean value) {
            addCriterion("Account_Locked >", value, "accountLocked");
            return (Criteria) this;
        }

        public Criteria andAccountLockedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("Account_Locked >=", value, "accountLocked");
            return (Criteria) this;
        }

        public Criteria andAccountLockedLessThan(Boolean value) {
            addCriterion("Account_Locked <", value, "accountLocked");
            return (Criteria) this;
        }

        public Criteria andAccountLockedLessThanOrEqualTo(Boolean value) {
            addCriterion("Account_Locked <=", value, "accountLocked");
            return (Criteria) this;
        }

        public Criteria andAccountLockedIn(List<Boolean> values) {
            addCriterion("Account_Locked in", values, "accountLocked");
            return (Criteria) this;
        }

        public Criteria andAccountLockedNotIn(List<Boolean> values) {
            addCriterion("Account_Locked not in", values, "accountLocked");
            return (Criteria) this;
        }

        public Criteria andAccountLockedBetween(Boolean value1, Boolean value2) {
            addCriterion("Account_Locked between", value1, value2, "accountLocked");
            return (Criteria) this;
        }

        public Criteria andAccountLockedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("Account_Locked not between", value1, value2, "accountLocked");
            return (Criteria) this;
        }

        public Criteria andAccountExpiredIsNull() {
            addCriterion("Account_Expired is null");
            return (Criteria) this;
        }

        public Criteria andAccountExpiredIsNotNull() {
            addCriterion("Account_Expired is not null");
            return (Criteria) this;
        }

        public Criteria andAccountExpiredEqualTo(Boolean value) {
            addCriterion("Account_Expired =", value, "accountExpired");
            return (Criteria) this;
        }

        public Criteria andAccountExpiredNotEqualTo(Boolean value) {
            addCriterion("Account_Expired <>", value, "accountExpired");
            return (Criteria) this;
        }

        public Criteria andAccountExpiredGreaterThan(Boolean value) {
            addCriterion("Account_Expired >", value, "accountExpired");
            return (Criteria) this;
        }

        public Criteria andAccountExpiredGreaterThanOrEqualTo(Boolean value) {
            addCriterion("Account_Expired >=", value, "accountExpired");
            return (Criteria) this;
        }

        public Criteria andAccountExpiredLessThan(Boolean value) {
            addCriterion("Account_Expired <", value, "accountExpired");
            return (Criteria) this;
        }

        public Criteria andAccountExpiredLessThanOrEqualTo(Boolean value) {
            addCriterion("Account_Expired <=", value, "accountExpired");
            return (Criteria) this;
        }

        public Criteria andAccountExpiredIn(List<Boolean> values) {
            addCriterion("Account_Expired in", values, "accountExpired");
            return (Criteria) this;
        }

        public Criteria andAccountExpiredNotIn(List<Boolean> values) {
            addCriterion("Account_Expired not in", values, "accountExpired");
            return (Criteria) this;
        }

        public Criteria andAccountExpiredBetween(Boolean value1, Boolean value2) {
            addCriterion("Account_Expired between", value1, value2, "accountExpired");
            return (Criteria) this;
        }

        public Criteria andAccountExpiredNotBetween(Boolean value1, Boolean value2) {
            addCriterion("Account_Expired not between", value1, value2, "accountExpired");
            return (Criteria) this;
        }

        public Criteria andCredentialsExpiredIsNull() {
            addCriterion("Credentials_Expired is null");
            return (Criteria) this;
        }

        public Criteria andCredentialsExpiredIsNotNull() {
            addCriterion("Credentials_Expired is not null");
            return (Criteria) this;
        }

        public Criteria andCredentialsExpiredEqualTo(Boolean value) {
            addCriterion("Credentials_Expired =", value, "credentialsExpired");
            return (Criteria) this;
        }

        public Criteria andCredentialsExpiredNotEqualTo(Boolean value) {
            addCriterion("Credentials_Expired <>", value, "credentialsExpired");
            return (Criteria) this;
        }

        public Criteria andCredentialsExpiredGreaterThan(Boolean value) {
            addCriterion("Credentials_Expired >", value, "credentialsExpired");
            return (Criteria) this;
        }

        public Criteria andCredentialsExpiredGreaterThanOrEqualTo(Boolean value) {
            addCriterion("Credentials_Expired >=", value, "credentialsExpired");
            return (Criteria) this;
        }

        public Criteria andCredentialsExpiredLessThan(Boolean value) {
            addCriterion("Credentials_Expired <", value, "credentialsExpired");
            return (Criteria) this;
        }

        public Criteria andCredentialsExpiredLessThanOrEqualTo(Boolean value) {
            addCriterion("Credentials_Expired <=", value, "credentialsExpired");
            return (Criteria) this;
        }

        public Criteria andCredentialsExpiredIn(List<Boolean> values) {
            addCriterion("Credentials_Expired in", values, "credentialsExpired");
            return (Criteria) this;
        }

        public Criteria andCredentialsExpiredNotIn(List<Boolean> values) {
            addCriterion("Credentials_Expired not in", values, "credentialsExpired");
            return (Criteria) this;
        }

        public Criteria andCredentialsExpiredBetween(Boolean value1, Boolean value2) {
            addCriterion("Credentials_Expired between", value1, value2, "credentialsExpired");
            return (Criteria) this;
        }

        public Criteria andCredentialsExpiredNotBetween(Boolean value1, Boolean value2) {
            addCriterion("Credentials_Expired not between", value1, value2, "credentialsExpired");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("Type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("Type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("Type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("Type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("Type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("Type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("Type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("Type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("Type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("Type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("Type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("Type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("Type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("Type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("Phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("Phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("Phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("Phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("Phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("Phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("Phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("Phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("Phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("Phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("Phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("Phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("Phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("Phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdIsNull() {
            addCriterion("Organization_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdIsNotNull() {
            addCriterion("Organization_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdEqualTo(Integer value) {
            addCriterion("Organization_ID =", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdNotEqualTo(Integer value) {
            addCriterion("Organization_ID <>", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdGreaterThan(Integer value) {
            addCriterion("Organization_ID >", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Organization_ID >=", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdLessThan(Integer value) {
            addCriterion("Organization_ID <", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdLessThanOrEqualTo(Integer value) {
            addCriterion("Organization_ID <=", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdIn(List<Integer> values) {
            addCriterion("Organization_ID in", values, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdNotIn(List<Integer> values) {
            addCriterion("Organization_ID not in", values, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdBetween(Integer value1, Integer value2) {
            addCriterion("Organization_ID between", value1, value2, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Organization_ID not between", value1, value2, "organizationId");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("Status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("Status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("Status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("Status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("Status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("Status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("Status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("Status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("Status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("Status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("Status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("Status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("Status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("Status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andGpsIsNull() {
            addCriterion("GPS is null");
            return (Criteria) this;
        }

        public Criteria andGpsIsNotNull() {
            addCriterion("GPS is not null");
            return (Criteria) this;
        }

        public Criteria andGpsEqualTo(String value) {
            addCriterion("GPS =", value, "gps");
            return (Criteria) this;
        }

        public Criteria andGpsNotEqualTo(String value) {
            addCriterion("GPS <>", value, "gps");
            return (Criteria) this;
        }

        public Criteria andGpsGreaterThan(String value) {
            addCriterion("GPS >", value, "gps");
            return (Criteria) this;
        }

        public Criteria andGpsGreaterThanOrEqualTo(String value) {
            addCriterion("GPS >=", value, "gps");
            return (Criteria) this;
        }

        public Criteria andGpsLessThan(String value) {
            addCriterion("GPS <", value, "gps");
            return (Criteria) this;
        }

        public Criteria andGpsLessThanOrEqualTo(String value) {
            addCriterion("GPS <=", value, "gps");
            return (Criteria) this;
        }

        public Criteria andGpsLike(String value) {
            addCriterion("GPS like", value, "gps");
            return (Criteria) this;
        }

        public Criteria andGpsNotLike(String value) {
            addCriterion("GPS not like", value, "gps");
            return (Criteria) this;
        }

        public Criteria andGpsIn(List<String> values) {
            addCriterion("GPS in", values, "gps");
            return (Criteria) this;
        }

        public Criteria andGpsNotIn(List<String> values) {
            addCriterion("GPS not in", values, "gps");
            return (Criteria) this;
        }

        public Criteria andGpsBetween(String value1, String value2) {
            addCriterion("GPS between", value1, value2, "gps");
            return (Criteria) this;
        }

        public Criteria andGpsNotBetween(String value1, String value2) {
            addCriterion("GPS not between", value1, value2, "gps");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNull() {
            addCriterion("Last_Login_Time is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNotNull() {
            addCriterion("Last_Login_Time is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeEqualTo(Date value) {
            addCriterion("Last_Login_Time =", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotEqualTo(Date value) {
            addCriterion("Last_Login_Time <>", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThan(Date value) {
            addCriterion("Last_Login_Time >", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Last_Login_Time >=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThan(Date value) {
            addCriterion("Last_Login_Time <", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThanOrEqualTo(Date value) {
            addCriterion("Last_Login_Time <=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIn(List<Date> values) {
            addCriterion("Last_Login_Time in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotIn(List<Date> values) {
            addCriterion("Last_Login_Time not in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeBetween(Date value1, Date value2) {
            addCriterion("Last_Login_Time between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotBetween(Date value1, Date value2) {
            addCriterion("Last_Login_Time not between", value1, value2, "lastLoginTime");
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