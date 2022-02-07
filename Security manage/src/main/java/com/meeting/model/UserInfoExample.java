package com.meeting.model;
import java.util.ArrayList;
import java.util.List;
public class UserInfoExample {
    protected String orderByClause;
    protected boolean distinct;
    protected int startRow;
    protected int pageRows;
    protected List<Criteria> oredCriteria;
    public UserInfoExample() {
        oredCriteria = new ArrayList<>();
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
    public void setStartRow(int startRow) {
        this.startRow = startRow;
    }
    public int getStartRow() {
        return startRow;
    }
    public void setPageRows(int pageRows) {
        this.pageRows = pageRows;
    }
    public int getPageRows() {
        return pageRows;
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
            criteria = new ArrayList<>();
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
  public Criteria andIdIsNotNull(){
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
		  addCriterion("id >=", value, "Id");
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
    public Criteria andIdLike(Integer value) {
		  addCriterion("id like", value, "id");
		return (Criteria) this;
		}
    public Criteria andIdNotLike(Integer value) {
		  addCriterion("id not like", value, "id");
		return (Criteria) this;
		}
 public Criteria andLoginNameIsNull() {
		 addCriterion("login_name is null");
		return (Criteria) this;
		}
  public Criteria andLoginNameIsNotNull(){
		addCriterion("login_name is not null");
		return (Criteria) this;
		}
  public Criteria andLoginNameEqualTo(String value) {
		  addCriterion("login_name =", value, "loginName");
		return (Criteria) this;
		}
   public Criteria andLoginNameNotEqualTo(String value) {
		  addCriterion("login_name <>", value, "loginName");
		return (Criteria) this;
		}
    public Criteria andLoginNameGreaterThan(String value) {
		 addCriterion("login_name >", value, "loginName");
		return (Criteria) this;
		}
  public Criteria andLoginNameGreaterThanOrEqualTo(String value) {
		  addCriterion("login_name >=", value, "LoginName");
		return (Criteria) this;
		}
   public Criteria andLoginNameLessThan(String value) {
		  addCriterion("login_name <", value, "loginName");
		return (Criteria) this;
		}
    public Criteria andLoginNameLessThanOrEqualTo(String value) {
		  addCriterion("login_name <=", value, "loginName");
		return (Criteria) this;
		}
    public Criteria andLoginNameIn(List<String> values) {
		  addCriterion("login_name in", values, "loginName");
		return (Criteria) this;
		}
    public Criteria andLoginNameNotIn(List<String> values) {
		  addCriterion("login_name not in", values, "loginName");
		return (Criteria) this;
		}
     public Criteria andLoginNameBetween(String value1, String value2) {
		   addCriterion("login_name between", value1, value2, "loginName");
		return (Criteria) this;
		}
     public Criteria andLoginNameNotBetween(String value1, String value2) {
		   addCriterion("login_name not between", value1, value2, "loginName");
		return (Criteria) this;
		}
    public Criteria andLoginNameLike(String value) {
		  addCriterion("login_name like", value, "loginName");
		return (Criteria) this;
		}
    public Criteria andLoginNameNotLike(String value) {
		  addCriterion("login_name not like", value, "loginName");
		return (Criteria) this;
		}
 public Criteria andPasswordIsNull() {
		 addCriterion("password is null");
		return (Criteria) this;
		}
  public Criteria andPasswordIsNotNull(){
		addCriterion("password is not null");
		return (Criteria) this;
		}
  public Criteria andPasswordEqualTo(String value) {
		  addCriterion("password =", value, "password");
		return (Criteria) this;
		}
   public Criteria andPasswordNotEqualTo(String value) {
		  addCriterion("password <>", value, "password");
		return (Criteria) this;
		}
    public Criteria andPasswordGreaterThan(String value) {
		 addCriterion("password >", value, "password");
		return (Criteria) this;
		}
  public Criteria andPasswordGreaterThanOrEqualTo(String value) {
		  addCriterion("password >=", value, "Password");
		return (Criteria) this;
		}
   public Criteria andPasswordLessThan(String value) {
		  addCriterion("password <", value, "password");
		return (Criteria) this;
		}
    public Criteria andPasswordLessThanOrEqualTo(String value) {
		  addCriterion("password <=", value, "password");
		return (Criteria) this;
		}
    public Criteria andPasswordIn(List<String> values) {
		  addCriterion("password in", values, "password");
		return (Criteria) this;
		}
    public Criteria andPasswordNotIn(List<String> values) {
		  addCriterion("password not in", values, "password");
		return (Criteria) this;
		}
     public Criteria andPasswordBetween(String value1, String value2) {
		   addCriterion("password between", value1, value2, "password");
		return (Criteria) this;
		}
     public Criteria andPasswordNotBetween(String value1, String value2) {
		   addCriterion("password not between", value1, value2, "password");
		return (Criteria) this;
		}
    public Criteria andPasswordLike(String value) {
		  addCriterion("password like", value, "password");
		return (Criteria) this;
		}
    public Criteria andPasswordNotLike(String value) {
		  addCriterion("password not like", value, "password");
		return (Criteria) this;
		}
 public Criteria andRealNameIsNull() {
		 addCriterion("real_name is null");
		return (Criteria) this;
		}
  public Criteria andRealNameIsNotNull(){
		addCriterion("real_name is not null");
		return (Criteria) this;
		}
  public Criteria andRealNameEqualTo(String value) {
		  addCriterion("real_name =", value, "realName");
		return (Criteria) this;
		}
   public Criteria andRealNameNotEqualTo(String value) {
		  addCriterion("real_name <>", value, "realName");
		return (Criteria) this;
		}
    public Criteria andRealNameGreaterThan(String value) {
		 addCriterion("real_name >", value, "realName");
		return (Criteria) this;
		}
  public Criteria andRealNameGreaterThanOrEqualTo(String value) {
		  addCriterion("real_name >=", value, "RealName");
		return (Criteria) this;
		}
   public Criteria andRealNameLessThan(String value) {
		  addCriterion("real_name <", value, "realName");
		return (Criteria) this;
		}
    public Criteria andRealNameLessThanOrEqualTo(String value) {
		  addCriterion("real_name <=", value, "realName");
		return (Criteria) this;
		}
    public Criteria andRealNameIn(List<String> values) {
		  addCriterion("real_name in", values, "realName");
		return (Criteria) this;
		}
    public Criteria andRealNameNotIn(List<String> values) {
		  addCriterion("real_name not in", values, "realName");
		return (Criteria) this;
		}
     public Criteria andRealNameBetween(String value1, String value2) {
		   addCriterion("real_name between", value1, value2, "realName");
		return (Criteria) this;
		}
     public Criteria andRealNameNotBetween(String value1, String value2) {
		   addCriterion("real_name not between", value1, value2, "realName");
		return (Criteria) this;
		}
    public Criteria andRealNameLike(String value) {
		  addCriterion("real_name like", value, "realName");
		return (Criteria) this;
		}
    public Criteria andRealNameNotLike(String value) {
		  addCriterion("real_name not like", value, "realName");
		return (Criteria) this;
		}
 public Criteria andCelPhoneIsNull() {
		 addCriterion("cel_phone is null");
		return (Criteria) this;
		}
  public Criteria andCelPhoneIsNotNull(){
		addCriterion("cel_phone is not null");
		return (Criteria) this;
		}
  public Criteria andCelPhoneEqualTo(String value) {
		  addCriterion("cel_phone =", value, "celPhone");
		return (Criteria) this;
		}
   public Criteria andCelPhoneNotEqualTo(String value) {
		  addCriterion("cel_phone <>", value, "celPhone");
		return (Criteria) this;
		}
    public Criteria andCelPhoneGreaterThan(String value) {
		 addCriterion("cel_phone >", value, "celPhone");
		return (Criteria) this;
		}
  public Criteria andCelPhoneGreaterThanOrEqualTo(String value) {
		  addCriterion("cel_phone >=", value, "CelPhone");
		return (Criteria) this;
		}
   public Criteria andCelPhoneLessThan(String value) {
		  addCriterion("cel_phone <", value, "celPhone");
		return (Criteria) this;
		}
    public Criteria andCelPhoneLessThanOrEqualTo(String value) {
		  addCriterion("cel_phone <=", value, "celPhone");
		return (Criteria) this;
		}
    public Criteria andCelPhoneIn(List<String> values) {
		  addCriterion("cel_phone in", values, "celPhone");
		return (Criteria) this;
		}
    public Criteria andCelPhoneNotIn(List<String> values) {
		  addCriterion("cel_phone not in", values, "celPhone");
		return (Criteria) this;
		}
     public Criteria andCelPhoneBetween(String value1, String value2) {
		   addCriterion("cel_phone between", value1, value2, "celPhone");
		return (Criteria) this;
		}
     public Criteria andCelPhoneNotBetween(String value1, String value2) {
		   addCriterion("cel_phone not between", value1, value2, "celPhone");
		return (Criteria) this;
		}
    public Criteria andCelPhoneLike(String value) {
		  addCriterion("cel_phone like", value, "celPhone");
		return (Criteria) this;
		}
    public Criteria andCelPhoneNotLike(String value) {
		  addCriterion("cel_phone not like", value, "celPhone");
		return (Criteria) this;
		}
 public Criteria andSexIsNull() {
		 addCriterion("sex is null");
		return (Criteria) this;
		}
  public Criteria andSexIsNotNull(){
		addCriterion("sex is not null");
		return (Criteria) this;
		}
  public Criteria andSexEqualTo(Integer value) {
		  addCriterion("sex =", value, "sex");
		return (Criteria) this;
		}
   public Criteria andSexNotEqualTo(Integer value) {
		  addCriterion("sex <>", value, "sex");
		return (Criteria) this;
		}
    public Criteria andSexGreaterThan(Integer value) {
		 addCriterion("sex >", value, "sex");
		return (Criteria) this;
		}
  public Criteria andSexGreaterThanOrEqualTo(Integer value) {
		  addCriterion("sex >=", value, "Sex");
		return (Criteria) this;
		}
   public Criteria andSexLessThan(Integer value) {
		  addCriterion("sex <", value, "sex");
		return (Criteria) this;
		}
    public Criteria andSexLessThanOrEqualTo(Integer value) {
		  addCriterion("sex <=", value, "sex");
		return (Criteria) this;
		}
    public Criteria andSexIn(List<Integer> values) {
		  addCriterion("sex in", values, "sex");
		return (Criteria) this;
		}
    public Criteria andSexNotIn(List<Integer> values) {
		  addCriterion("sex not in", values, "sex");
		return (Criteria) this;
		}
     public Criteria andSexBetween(Integer value1, Integer value2) {
		   addCriterion("sex between", value1, value2, "sex");
		return (Criteria) this;
		}
     public Criteria andSexNotBetween(Integer value1, Integer value2) {
		   addCriterion("sex not between", value1, value2, "sex");
		return (Criteria) this;
		}
    public Criteria andSexLike(Integer value) {
		  addCriterion("sex like", value, "sex");
		return (Criteria) this;
		}
    public Criteria andSexNotLike(Integer value) {
		  addCriterion("sex not like", value, "sex");
		return (Criteria) this;
		}

		public Criteria andDepartmentIsNull() {
			addCriterion("department is null");
			return (Criteria) this;
		}
		public Criteria andDepartmentIsNotNull(){
			addCriterion("department is not null");
			return (Criteria) this;
		}
		public Criteria andDepartmentEqualTo(String value) {
			addCriterion("department =", value, "department");
			return (Criteria) this;
		}
		public Criteria andDepartmentNotEqualTo(String value) {
			addCriterion("department <>", value, "department");
			return (Criteria) this;
		}
		public Criteria andDepartmentGreaterThan(String value) {
			addCriterion("department >", value, "department");
			return (Criteria) this;
		}
		public Criteria andDepartmentGreaterThanOrEqualTo(String value) {
			addCriterion("department >=", value, "department");
			return (Criteria) this;
		}
		public Criteria andDepartmentLessThan(String value) {
			addCriterion("department <", value, "department");
			return (Criteria) this;
		}
		public Criteria andDepartmentLessThanOrEqualTo(String value) {
			addCriterion("department <=", value, "department");
			return (Criteria) this;
		}
		public Criteria andDepartmentIn(List<String> values) {
			addCriterion("department in", values, "department");
			return (Criteria) this;
		}
		public Criteria andDepartmentNotIn(List<String> values) {
			addCriterion("department not in", values, "department");
			return (Criteria) this;
		}
		public Criteria andDepartmentBetween(String value1, String value2) {
			addCriterion("department between", value1, value2, "department");
			return (Criteria) this;
		}
		public Criteria andDepartmentNotBetween(String value1, String value2) {
			addCriterion("department not between", value1, value2, "department");
			return (Criteria) this;
		}
		public Criteria andDepartmentLike(String value) {
			addCriterion("department like", value, "department");
			return (Criteria) this;
		}
		public Criteria andDepartmentNotLike(String value) {
			addCriterion("department not like", value, "department");
			return (Criteria) this;
		}

		public Criteria andRegionIsNull() {
			addCriterion("region is null");
			return (Criteria) this;
		}
		public Criteria andRegionIsNotNull(){
			addCriterion("region is not null");
			return (Criteria) this;
		}
		public Criteria andRegionEqualTo(String value) {
			addCriterion("region =", value, "region");
			return (Criteria) this;
		}
		public Criteria andRegionNotEqualTo(String value) {
			addCriterion("region <>", value, "region");
			return (Criteria) this;
		}
		public Criteria andRegionGreaterThan(String value) {
			addCriterion("region >", value, "region");
			return (Criteria) this;
		}
		public Criteria andRegionGreaterThanOrEqualTo(String value) {
			addCriterion("region >=", value, "region");
			return (Criteria) this;
		}
		public Criteria andRegionLessThan(String value) {
			addCriterion("region <", value, "region");
			return (Criteria) this;
		}
		public Criteria andRegionLessThanOrEqualTo(String value) {
			addCriterion("region <=", value, "region");
			return (Criteria) this;
		}
		public Criteria andRegionIn(List<String> values) {
			addCriterion("region in", values, "region");
			return (Criteria) this;
		}
		public Criteria andRegionNotIn(List<String> values) {
			addCriterion("region not in", values, "region");
			return (Criteria) this;
		}
		public Criteria andRegionBetween(String value1, String value2) {
			addCriterion("region between", value1, value2, "region");
			return (Criteria) this;
		}
		public Criteria andRegionNotBetween(String value1, String value2) {
			addCriterion("region not between", value1, value2, "region");
			return (Criteria) this;
		}
		public Criteria andRegionLike(String value) {
			addCriterion("region like", value, "region");
			return (Criteria) this;
		}
		public Criteria andRegionNotLike(String value) {
			addCriterion("region not like", value, "region");
			return (Criteria) this;
		}

		public Criteria andLevelsIsNull() {
			addCriterion("levels is null");
			return (Criteria) this;
		}
		public Criteria andLevelsIsNotNull(){
			addCriterion("levels is not null");
			return (Criteria) this;
		}
		public Criteria andLevelsEqualTo(String value) {
			addCriterion("levels =", value, "levels");
			return (Criteria) this;
		}
		public Criteria andLevelsNotEqualTo(String value) {
			addCriterion("levels <>", value, "levels");
			return (Criteria) this;
		}
		public Criteria andLevelsGreaterThan(String value) {
			addCriterion("levels >", value, "levels");
			return (Criteria) this;
		}
		public Criteria andLevelsGreaterThanOrEqualTo(String value) {
			addCriterion("levels >=", value, "levels");
			return (Criteria) this;
		}
		public Criteria andLevelsLessThan(String value) {
			addCriterion("levels <", value, "levels");
			return (Criteria) this;
		}
		public Criteria andLevelsLessThanOrEqualTo(String value) {
			addCriterion("levels <=", value, "levels");
			return (Criteria) this;
		}
		public Criteria andLevelsIn(List<String> values) {
			addCriterion("levels in", values, "levels");
			return (Criteria) this;
		}
		public Criteria andLevelsNotIn(List<String> values) {
			addCriterion("levels not in", values, "levels");
			return (Criteria) this;
		}
		public Criteria andLevelsBetween(String value1, String value2) {
			addCriterion("levels between", value1, value2, "levels");
			return (Criteria) this;
		}
		public Criteria andLevelsNotBetween(String value1, String value2) {
			addCriterion("levels not between", value1, value2, "levels");
			return (Criteria) this;
		}
		public Criteria andLevelsLike(String value) {
			addCriterion("levels like", value, "levels");
			return (Criteria) this;
		}
		public Criteria andLevelsNotLike(String value) {
			addCriterion("levels not like", value, "levels");
			return (Criteria) this;
		}


		public Criteria andBanzuIsNull() {
			addCriterion("banzu is null");
			return (Criteria) this;
		}
		public Criteria andBanzuIsNotNull(){
			addCriterion("banzu is not null");
			return (Criteria) this;
		}
		public Criteria andBanzuEqualTo(String value) {
			addCriterion("banzu =", value, "banzu");
			return (Criteria) this;
		}
		public Criteria andBanzuNotEqualTo(String value) {
			addCriterion("banzu <>", value, "banzu");
			return (Criteria) this;
		}
		public Criteria andBanzuGreaterThan(String value) {
			addCriterion("banzu >", value, "banzu");
			return (Criteria) this;
		}
		public Criteria andBanzuGreaterThanOrEqualTo(String value) {
			addCriterion("banzu >=", value, "banzu");
			return (Criteria) this;
		}
		public Criteria andBanzuLessThan(String value) {
			addCriterion("banzu <", value, "banzu");
			return (Criteria) this;
		}
		public Criteria andBanzuLessThanOrEqualTo(String value) {
			addCriterion("banzu <=", value, "banzu");
			return (Criteria) this;
		}
		public Criteria andBanzuIn(List<String> values) {
			addCriterion("banzu in", values, "banzu");
			return (Criteria) this;
		}
		public Criteria andBanzuNotIn(List<String> values) {
			addCriterion("banzu not in", values, "banzu");
			return (Criteria) this;
		}
		public Criteria andBanzuBetween(String value1, String value2) {
			addCriterion("banzu between", value1, value2, "banzu");
			return (Criteria) this;
		}
		public Criteria andBanzuNotBetween(String value1, String value2) {
			addCriterion("banzu not between", value1, value2, "banzu");
			return (Criteria) this;
		}
		public Criteria andBanzuLike(String value) {
			addCriterion("banzu like", value, "banzu");
			return (Criteria) this;
		}
		public Criteria andBanzuNotLike(String value) {
			addCriterion("banzu not like", value, "banzu");
			return (Criteria) this;
		}




		public Criteria andPostIsNull() {
			addCriterion("post is null");
			return (Criteria) this;
		}
		public Criteria andPostIsNotNull(){
			addCriterion("post is not null");
			return (Criteria) this;
		}
		public Criteria andPostEqualTo(String value) {
			addCriterion("post =", value, "post");
			return (Criteria) this;
		}
		public Criteria andPostNotEqualTo(String value) {
			addCriterion("post <>", value, "post");
			return (Criteria) this;
		}
		public Criteria andPostGreaterThan(String value) {
			addCriterion("post >", value, "post");
			return (Criteria) this;
		}
		public Criteria andPostGreaterThanOrEqualTo(String value) {
			addCriterion("post >=", value, "post");
			return (Criteria) this;
		}
		public Criteria andPostLessThan(String value) {
			addCriterion("post <", value, "post");
			return (Criteria) this;
		}
		public Criteria andPostLessThanOrEqualTo(String value) {
			addCriterion("post <=", value, "post");
			return (Criteria) this;
		}
		public Criteria andPostIn(List<String> values) {
			addCriterion("post in", values, "post");
			return (Criteria) this;
		}
		public Criteria andPostNotIn(List<String> values) {
			addCriterion("post not in", values, "post");
			return (Criteria) this;
		}
		public Criteria andPostBetween(String value1, String value2) {
			addCriterion("post between", value1, value2, "post");
			return (Criteria) this;
		}
		public Criteria andPostNotBetween(String value1, String value2) {
			addCriterion("post not between", value1, value2, "post");
			return (Criteria) this;
		}
		public Criteria andPostLike(String value) {
			addCriterion("post like", value, "post");
			return (Criteria) this;
		}
		public Criteria andPostNotLike(String value) {
			addCriterion("post not like", value, "post");
			return (Criteria) this;
		}


 public Criteria andCreateTimeIsNull() {
		 addCriterion("create_time is null");
		return (Criteria) this;
		}
  public Criteria andCreateTimeIsNotNull(){
		addCriterion("create_time is not null");
		return (Criteria) this;
		}
  public Criteria andCreateTimeEqualTo(String value) {
		  addCriterion("create_time =", value, "createTime");
		return (Criteria) this;
		}
   public Criteria andCreateTimeNotEqualTo(String value) {
		  addCriterion("create_time <>", value, "createTime");
		return (Criteria) this;
		}
    public Criteria andCreateTimeGreaterThan(String value) {
		 addCriterion("create_time >", value, "createTime");
		return (Criteria) this;
		}
  public Criteria andCreateTimeGreaterThanOrEqualTo(String value) {
		  addCriterion("create_time >=", value, "CreateTime");
		return (Criteria) this;
		}
   public Criteria andCreateTimeLessThan(String value) {
		  addCriterion("create_time <", value, "createTime");
		return (Criteria) this;
		}
    public Criteria andCreateTimeLessThanOrEqualTo(String value) {
		  addCriterion("create_time <=", value, "createTime");
		return (Criteria) this;
		}
    public Criteria andCreateTimeIn(List<String> values) {
		  addCriterion("create_time in", values, "createTime");
		return (Criteria) this;
		}
    public Criteria andCreateTimeNotIn(List<String> values) {
		  addCriterion("create_time not in", values, "createTime");
		return (Criteria) this;
		}
     public Criteria andCreateTimeBetween(String value1, String value2) {
		   addCriterion("create_time between", value1, value2, "createTime");
		return (Criteria) this;
		}
     public Criteria andCreateTimeNotBetween(String value1, String value2) {
		   addCriterion("create_time not between", value1, value2, "createTime");
		return (Criteria) this;
		}
    public Criteria andCreateTimeLike(String value) {
		  addCriterion("create_time like", value, "createTime");
		return (Criteria) this;
		}
    public Criteria andCreateTimeNotLike(String value) {
		  addCriterion("create_time not like", value, "createTime");
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
