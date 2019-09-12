package com.june.video.domain;

import java.util.ArrayList;
import java.util.List;

public class DeviceCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeviceCriteria() {
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

        public Criteria andCodeIsNull() {
            addCriterion("Code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("Code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("Code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("Code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("Code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("Code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("Code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("Code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("Code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("Code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("Code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("Code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("Code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("Code not between", value1, value2, "code");
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

        public Criteria andLocationIsNull() {
            addCriterion("Location is null");
            return (Criteria) this;
        }

        public Criteria andLocationIsNotNull() {
            addCriterion("Location is not null");
            return (Criteria) this;
        }

        public Criteria andLocationEqualTo(String value) {
            addCriterion("Location =", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotEqualTo(String value) {
            addCriterion("Location <>", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThan(String value) {
            addCriterion("Location >", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThanOrEqualTo(String value) {
            addCriterion("Location >=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThan(String value) {
            addCriterion("Location <", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThanOrEqualTo(String value) {
            addCriterion("Location <=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLike(String value) {
            addCriterion("Location like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotLike(String value) {
            addCriterion("Location not like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationIn(List<String> values) {
            addCriterion("Location in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotIn(List<String> values) {
            addCriterion("Location not in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationBetween(String value1, String value2) {
            addCriterion("Location between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotBetween(String value1, String value2) {
            addCriterion("Location not between", value1, value2, "location");
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

        public Criteria andClientidIsNull() {
            addCriterion("ClientId is null");
            return (Criteria) this;
        }

        public Criteria andClientidIsNotNull() {
            addCriterion("ClientId is not null");
            return (Criteria) this;
        }

        public Criteria andClientidEqualTo(String value) {
            addCriterion("ClientId =", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidNotEqualTo(String value) {
            addCriterion("ClientId <>", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidGreaterThan(String value) {
            addCriterion("ClientId >", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidGreaterThanOrEqualTo(String value) {
            addCriterion("ClientId >=", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidLessThan(String value) {
            addCriterion("ClientId <", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidLessThanOrEqualTo(String value) {
            addCriterion("ClientId <=", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidLike(String value) {
            addCriterion("ClientId like", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidNotLike(String value) {
            addCriterion("ClientId not like", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidIn(List<String> values) {
            addCriterion("ClientId in", values, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidNotIn(List<String> values) {
            addCriterion("ClientId not in", values, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidBetween(String value1, String value2) {
            addCriterion("ClientId between", value1, value2, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidNotBetween(String value1, String value2) {
            addCriterion("ClientId not between", value1, value2, "clientid");
            return (Criteria) this;
        }

        public Criteria andArchitectureIdIsNull() {
            addCriterion("Architecture_ID is null");
            return (Criteria) this;
        }

        public Criteria andArchitectureIdIsNotNull() {
            addCriterion("Architecture_ID is not null");
            return (Criteria) this;
        }

        public Criteria andArchitectureIdEqualTo(Integer value) {
            addCriterion("Architecture_ID =", value, "architectureId");
            return (Criteria) this;
        }

        public Criteria andArchitectureIdNotEqualTo(Integer value) {
            addCriterion("Architecture_ID <>", value, "architectureId");
            return (Criteria) this;
        }

        public Criteria andArchitectureIdGreaterThan(Integer value) {
            addCriterion("Architecture_ID >", value, "architectureId");
            return (Criteria) this;
        }

        public Criteria andArchitectureIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Architecture_ID >=", value, "architectureId");
            return (Criteria) this;
        }

        public Criteria andArchitectureIdLessThan(Integer value) {
            addCriterion("Architecture_ID <", value, "architectureId");
            return (Criteria) this;
        }

        public Criteria andArchitectureIdLessThanOrEqualTo(Integer value) {
            addCriterion("Architecture_ID <=", value, "architectureId");
            return (Criteria) this;
        }

        public Criteria andArchitectureIdIn(List<Integer> values) {
            addCriterion("Architecture_ID in", values, "architectureId");
            return (Criteria) this;
        }

        public Criteria andArchitectureIdNotIn(List<Integer> values) {
            addCriterion("Architecture_ID not in", values, "architectureId");
            return (Criteria) this;
        }

        public Criteria andArchitectureIdBetween(Integer value1, Integer value2) {
            addCriterion("Architecture_ID between", value1, value2, "architectureId");
            return (Criteria) this;
        }

        public Criteria andArchitectureIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Architecture_ID not between", value1, value2, "architectureId");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("State is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("State is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("State =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("State <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("State >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("State >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("State <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("State <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("State like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("State not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("State in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("State not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("State between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("State not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("Username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("Username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("Username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("Username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("Username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("Username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("Username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("Username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("Username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("Username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("Username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("Username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("Username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("Username not between", value1, value2, "username");
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

        public Criteria andStreamurlIsNull() {
            addCriterion("StreamUrl is null");
            return (Criteria) this;
        }

        public Criteria andStreamurlIsNotNull() {
            addCriterion("StreamUrl is not null");
            return (Criteria) this;
        }

        public Criteria andStreamurlEqualTo(String value) {
            addCriterion("StreamUrl =", value, "streamurl");
            return (Criteria) this;
        }

        public Criteria andStreamurlNotEqualTo(String value) {
            addCriterion("StreamUrl <>", value, "streamurl");
            return (Criteria) this;
        }

        public Criteria andStreamurlGreaterThan(String value) {
            addCriterion("StreamUrl >", value, "streamurl");
            return (Criteria) this;
        }

        public Criteria andStreamurlGreaterThanOrEqualTo(String value) {
            addCriterion("StreamUrl >=", value, "streamurl");
            return (Criteria) this;
        }

        public Criteria andStreamurlLessThan(String value) {
            addCriterion("StreamUrl <", value, "streamurl");
            return (Criteria) this;
        }

        public Criteria andStreamurlLessThanOrEqualTo(String value) {
            addCriterion("StreamUrl <=", value, "streamurl");
            return (Criteria) this;
        }

        public Criteria andStreamurlLike(String value) {
            addCriterion("StreamUrl like", value, "streamurl");
            return (Criteria) this;
        }

        public Criteria andStreamurlNotLike(String value) {
            addCriterion("StreamUrl not like", value, "streamurl");
            return (Criteria) this;
        }

        public Criteria andStreamurlIn(List<String> values) {
            addCriterion("StreamUrl in", values, "streamurl");
            return (Criteria) this;
        }

        public Criteria andStreamurlNotIn(List<String> values) {
            addCriterion("StreamUrl not in", values, "streamurl");
            return (Criteria) this;
        }

        public Criteria andStreamurlBetween(String value1, String value2) {
            addCriterion("StreamUrl between", value1, value2, "streamurl");
            return (Criteria) this;
        }

        public Criteria andStreamurlNotBetween(String value1, String value2) {
            addCriterion("StreamUrl not between", value1, value2, "streamurl");
            return (Criteria) this;
        }

        public Criteria andHistoricCountIsNull() {
            addCriterion("Historic_Count is null");
            return (Criteria) this;
        }

        public Criteria andHistoricCountIsNotNull() {
            addCriterion("Historic_Count is not null");
            return (Criteria) this;
        }

        public Criteria andHistoricCountEqualTo(Integer value) {
            addCriterion("Historic_Count =", value, "historicCount");
            return (Criteria) this;
        }

        public Criteria andHistoricCountNotEqualTo(Integer value) {
            addCriterion("Historic_Count <>", value, "historicCount");
            return (Criteria) this;
        }

        public Criteria andHistoricCountGreaterThan(Integer value) {
            addCriterion("Historic_Count >", value, "historicCount");
            return (Criteria) this;
        }

        public Criteria andHistoricCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("Historic_Count >=", value, "historicCount");
            return (Criteria) this;
        }

        public Criteria andHistoricCountLessThan(Integer value) {
            addCriterion("Historic_Count <", value, "historicCount");
            return (Criteria) this;
        }

        public Criteria andHistoricCountLessThanOrEqualTo(Integer value) {
            addCriterion("Historic_Count <=", value, "historicCount");
            return (Criteria) this;
        }

        public Criteria andHistoricCountIn(List<Integer> values) {
            addCriterion("Historic_Count in", values, "historicCount");
            return (Criteria) this;
        }

        public Criteria andHistoricCountNotIn(List<Integer> values) {
            addCriterion("Historic_Count not in", values, "historicCount");
            return (Criteria) this;
        }

        public Criteria andHistoricCountBetween(Integer value1, Integer value2) {
            addCriterion("Historic_Count between", value1, value2, "historicCount");
            return (Criteria) this;
        }

        public Criteria andHistoricCountNotBetween(Integer value1, Integer value2) {
            addCriterion("Historic_Count not between", value1, value2, "historicCount");
            return (Criteria) this;
        }

        public Criteria andAnnualCountIsNull() {
            addCriterion("Annual_Count is null");
            return (Criteria) this;
        }

        public Criteria andAnnualCountIsNotNull() {
            addCriterion("Annual_Count is not null");
            return (Criteria) this;
        }

        public Criteria andAnnualCountEqualTo(Integer value) {
            addCriterion("Annual_Count =", value, "annualCount");
            return (Criteria) this;
        }

        public Criteria andAnnualCountNotEqualTo(Integer value) {
            addCriterion("Annual_Count <>", value, "annualCount");
            return (Criteria) this;
        }

        public Criteria andAnnualCountGreaterThan(Integer value) {
            addCriterion("Annual_Count >", value, "annualCount");
            return (Criteria) this;
        }

        public Criteria andAnnualCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("Annual_Count >=", value, "annualCount");
            return (Criteria) this;
        }

        public Criteria andAnnualCountLessThan(Integer value) {
            addCriterion("Annual_Count <", value, "annualCount");
            return (Criteria) this;
        }

        public Criteria andAnnualCountLessThanOrEqualTo(Integer value) {
            addCriterion("Annual_Count <=", value, "annualCount");
            return (Criteria) this;
        }

        public Criteria andAnnualCountIn(List<Integer> values) {
            addCriterion("Annual_Count in", values, "annualCount");
            return (Criteria) this;
        }

        public Criteria andAnnualCountNotIn(List<Integer> values) {
            addCriterion("Annual_Count not in", values, "annualCount");
            return (Criteria) this;
        }

        public Criteria andAnnualCountBetween(Integer value1, Integer value2) {
            addCriterion("Annual_Count between", value1, value2, "annualCount");
            return (Criteria) this;
        }

        public Criteria andAnnualCountNotBetween(Integer value1, Integer value2) {
            addCriterion("Annual_Count not between", value1, value2, "annualCount");
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