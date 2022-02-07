package com.meeting.model;
import java.util.ArrayList;
import java.util.List;
public class MeetingUserInfoExample {
    protected String orderByClause;
    protected boolean distinct;
    protected int startRow;
    protected int pageRows;
    protected List<Criteria> oredCriteria;
    public MeetingUserInfoExample() {
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
 public Criteria andMeetingIdIsNull() {
		 addCriterion("meeting_id is null");
		return (Criteria) this;
		}
  public Criteria andMeetingIdIsNotNull(){
		addCriterion("meeting_id is not null");
		return (Criteria) this;
		}
  public Criteria andMeetingIdEqualTo(Integer value) {
		  addCriterion("meeting_id =", value, "meetingId");
		return (Criteria) this;
		}
   public Criteria andMeetingIdNotEqualTo(Integer value) {
		  addCriterion("meeting_id <>", value, "meetingId");
		return (Criteria) this;
		}
    public Criteria andMeetingIdGreaterThan(Integer value) {
		 addCriterion("meeting_id >", value, "meetingId");
		return (Criteria) this;
		}
  public Criteria andMeetingIdGreaterThanOrEqualTo(Integer value) {
		  addCriterion("meeting_id >=", value, "MeetingId");
		return (Criteria) this;
		}
   public Criteria andMeetingIdLessThan(Integer value) {
		  addCriterion("meeting_id <", value, "meetingId");
		return (Criteria) this;
		}
    public Criteria andMeetingIdLessThanOrEqualTo(Integer value) {
		  addCriterion("meeting_id <=", value, "meetingId");
		return (Criteria) this;
		}
    public Criteria andMeetingIdIn(List<Integer> values) {
		  addCriterion("meeting_id in", values, "meetingId");
		return (Criteria) this;
		}
    public Criteria andMeetingIdNotIn(List<Integer> values) {
		  addCriterion("meeting_id not in", values, "meetingId");
		return (Criteria) this;
		}
     public Criteria andMeetingIdBetween(Integer value1, Integer value2) {
		   addCriterion("meeting_id between", value1, value2, "meetingId");
		return (Criteria) this;
		}
     public Criteria andMeetingIdNotBetween(Integer value1, Integer value2) {
		   addCriterion("meeting_id not between", value1, value2, "meetingId");
		return (Criteria) this;
		}
    public Criteria andMeetingIdLike(Integer value) {
		  addCriterion("meeting_id like", value, "meetingId");
		return (Criteria) this;
		}
    public Criteria andMeetingIdNotLike(Integer value) {
		  addCriterion("meeting_id not like", value, "meetingId");
		return (Criteria) this;
		}
 public Criteria andUserIdIsNull() {
		 addCriterion("user_id is null");
		return (Criteria) this;
		}
  public Criteria andUserIdIsNotNull(){
		addCriterion("user_id is not null");
		return (Criteria) this;
		}
  public Criteria andUserIdEqualTo(Integer value) {
		  addCriterion("user_id =", value, "userId");
		return (Criteria) this;
		}
   public Criteria andUserIdNotEqualTo(Integer value) {
		  addCriterion("user_id <>", value, "userId");
		return (Criteria) this;
		}
    public Criteria andUserIdGreaterThan(Integer value) {
		 addCriterion("user_id >", value, "userId");
		return (Criteria) this;
		}
  public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
		  addCriterion("user_id >=", value, "UserId");
		return (Criteria) this;
		}
   public Criteria andUserIdLessThan(Integer value) {
		  addCriterion("user_id <", value, "userId");
		return (Criteria) this;
		}
    public Criteria andUserIdLessThanOrEqualTo(Integer value) {
		  addCriterion("user_id <=", value, "userId");
		return (Criteria) this;
		}
    public Criteria andUserIdIn(List<Integer> values) {
		  addCriterion("user_id in", values, "userId");
		return (Criteria) this;
		}
    public Criteria andUserIdNotIn(List<Integer> values) {
		  addCriterion("user_id not in", values, "userId");
		return (Criteria) this;
		}
     public Criteria andUserIdBetween(Integer value1, Integer value2) {
		   addCriterion("user_id between", value1, value2, "userId");
		return (Criteria) this;
		}
     public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
		   addCriterion("user_id not between", value1, value2, "userId");
		return (Criteria) this;
		}
    public Criteria andUserIdLike(Integer value) {
		  addCriterion("user_id like", value, "userId");
		return (Criteria) this;
		}
    public Criteria andUserIdNotLike(Integer value) {
		  addCriterion("user_id not like", value, "userId");
		return (Criteria) this;
		}
 public Criteria andOrderDateIsNull() {
		 addCriterion("order_date is null");
		return (Criteria) this;
		}
  public Criteria andOrderDateIsNotNull(){
		addCriterion("order_date is not null");
		return (Criteria) this;
		}
  public Criteria andOrderDateEqualTo(String value) {
		  addCriterion("order_date =", value, "orderDate");
		return (Criteria) this;
		}
   public Criteria andOrderDateNotEqualTo(String value) {
		  addCriterion("order_date <>", value, "orderDate");
		return (Criteria) this;
		}
    public Criteria andOrderDateGreaterThan(String value) {
		 addCriterion("order_date >", value, "orderDate");
		return (Criteria) this;
		}
  public Criteria andOrderDateGreaterThanOrEqualTo(String value) {
		  addCriterion("order_date >=", value, "OrderDate");
		return (Criteria) this;
		}
   public Criteria andOrderDateLessThan(String value) {
		  addCriterion("order_date <", value, "orderDate");
		return (Criteria) this;
		}
    public Criteria andOrderDateLessThanOrEqualTo(String value) {
		  addCriterion("order_date <=", value, "orderDate");
		return (Criteria) this;
		}
    public Criteria andOrderDateIn(List<String> values) {
		  addCriterion("order_date in", values, "orderDate");
		return (Criteria) this;
		}
    public Criteria andOrderDateNotIn(List<String> values) {
		  addCriterion("order_date not in", values, "orderDate");
		return (Criteria) this;
		}
     public Criteria andOrderDateBetween(String value1, String value2) {
		   addCriterion("order_date between", value1, value2, "orderDate");
		return (Criteria) this;
		}
     public Criteria andOrderDateNotBetween(String value1, String value2) {
		   addCriterion("order_date not between", value1, value2, "orderDate");
		return (Criteria) this;
		}
    public Criteria andOrderDateLike(String value) {
		  addCriterion("order_date like", value, "orderDate");
		return (Criteria) this;
		}
    public Criteria andOrderDateNotLike(String value) {
		  addCriterion("order_date not like", value, "orderDate");
		return (Criteria) this;
		}
 public Criteria andOrderTimeIsNull() {
		 addCriterion("order_time is null");
		return (Criteria) this;
		}
  public Criteria andOrderTimeIsNotNull(){
		addCriterion("order_time is not null");
		return (Criteria) this;
		}
  public Criteria andOrderTimeEqualTo(String value) {
		  addCriterion("order_time =", value, "orderTime");
		return (Criteria) this;
		}
   public Criteria andOrderTimeNotEqualTo(String value) {
		  addCriterion("order_time <>", value, "orderTime");
		return (Criteria) this;
		}
    public Criteria andOrderTimeGreaterThan(String value) {
		 addCriterion("order_time >", value, "orderTime");
		return (Criteria) this;
		}
  public Criteria andOrderTimeGreaterThanOrEqualTo(String value) {
		  addCriterion("order_time >=", value, "OrderTime");
		return (Criteria) this;
		}
   public Criteria andOrderTimeLessThan(String value) {
		  addCriterion("order_time <", value, "orderTime");
		return (Criteria) this;
		}
    public Criteria andOrderTimeLessThanOrEqualTo(String value) {
		  addCriterion("order_time <=", value, "orderTime");
		return (Criteria) this;
		}
    public Criteria andOrderTimeIn(List<String> values) {
		  addCriterion("order_time in", values, "orderTime");
		return (Criteria) this;
		}
    public Criteria andOrderTimeNotIn(List<String> values) {
		  addCriterion("order_time not in", values, "orderTime");
		return (Criteria) this;
		}
     public Criteria andOrderTimeBetween(String value1, String value2) {
		   addCriterion("order_time between", value1, value2, "orderTime");
		return (Criteria) this;
		}
     public Criteria andOrderTimeNotBetween(String value1, String value2) {
		   addCriterion("order_time not between", value1, value2, "orderTime");
		return (Criteria) this;
		}
    public Criteria andOrderTimeLike(String value) {
		  addCriterion("order_time like", value, "orderTime");
		return (Criteria) this;
		}
    public Criteria andOrderTimeNotLike(String value) {
		  addCriterion("order_time not like", value, "orderTime");
		return (Criteria) this;
		}
 public Criteria andUserNameIsNull() {
		 addCriterion("user_name is null");
		return (Criteria) this;
		}
  public Criteria andUserNameIsNotNull(){
		addCriterion("user_name is not null");
		return (Criteria) this;
		}
  public Criteria andUserNameEqualTo(String value) {
		  addCriterion("user_name =", value, "userName");
		return (Criteria) this;
		}
   public Criteria andUserNameNotEqualTo(String value) {
		  addCriterion("user_name <>", value, "userName");
		return (Criteria) this;
		}
    public Criteria andUserNameGreaterThan(String value) {
		 addCriterion("user_name >", value, "userName");
		return (Criteria) this;
		}
  public Criteria andUserNameGreaterThanOrEqualTo(String value) {
		  addCriterion("user_name >=", value, "UserName");
		return (Criteria) this;
		}
   public Criteria andUserNameLessThan(String value) {
		  addCriterion("user_name <", value, "userName");
		return (Criteria) this;
		}
    public Criteria andUserNameLessThanOrEqualTo(String value) {
		  addCriterion("user_name <=", value, "userName");
		return (Criteria) this;
		}
    public Criteria andUserNameIn(List<String> values) {
		  addCriterion("user_name in", values, "userName");
		return (Criteria) this;
		}
    public Criteria andUserNameNotIn(List<String> values) {
		  addCriterion("user_name not in", values, "userName");
		return (Criteria) this;
		}
     public Criteria andUserNameBetween(String value1, String value2) {
		   addCriterion("user_name between", value1, value2, "userName");
		return (Criteria) this;
		}
     public Criteria andUserNameNotBetween(String value1, String value2) {
		   addCriterion("user_name not between", value1, value2, "userName");
		return (Criteria) this;
		}
    public Criteria andUserNameLike(String value) {
		  addCriterion("user_name like", value, "userName");
		return (Criteria) this;
		}
    public Criteria andUserNameNotLike(String value) {
		  addCriterion("user_name not like", value, "userName");
		return (Criteria) this;
		}
 public Criteria andUserCelIsNull() {
		 addCriterion("user_cel is null");
		return (Criteria) this;
		}
  public Criteria andUserCelIsNotNull(){
		addCriterion("user_cel is not null");
		return (Criteria) this;
		}
  public Criteria andUserCelEqualTo(String value) {
		  addCriterion("user_cel =", value, "userCel");
		return (Criteria) this;
		}
   public Criteria andUserCelNotEqualTo(String value) {
		  addCriterion("user_cel <>", value, "userCel");
		return (Criteria) this;
		}
    public Criteria andUserCelGreaterThan(String value) {
		 addCriterion("user_cel >", value, "userCel");
		return (Criteria) this;
		}
  public Criteria andUserCelGreaterThanOrEqualTo(String value) {
		  addCriterion("user_cel >=", value, "UserCel");
		return (Criteria) this;
		}
   public Criteria andUserCelLessThan(String value) {
		  addCriterion("user_cel <", value, "userCel");
		return (Criteria) this;
		}
    public Criteria andUserCelLessThanOrEqualTo(String value) {
		  addCriterion("user_cel <=", value, "userCel");
		return (Criteria) this;
		}
    public Criteria andUserCelIn(List<String> values) {
		  addCriterion("user_cel in", values, "userCel");
		return (Criteria) this;
		}
    public Criteria andUserCelNotIn(List<String> values) {
		  addCriterion("user_cel not in", values, "userCel");
		return (Criteria) this;
		}
     public Criteria andUserCelBetween(String value1, String value2) {
		   addCriterion("user_cel between", value1, value2, "userCel");
		return (Criteria) this;
		}
     public Criteria andUserCelNotBetween(String value1, String value2) {
		   addCriterion("user_cel not between", value1, value2, "userCel");
		return (Criteria) this;
		}
    public Criteria andUserCelLike(String value) {
		  addCriterion("user_cel like", value, "userCel");
		return (Criteria) this;
		}
    public Criteria andUserCelNotLike(String value) {
		  addCriterion("user_cel not like", value, "userCel");
		return (Criteria) this;
		}
 public Criteria andMeetingUserIdIsNull() {
		 addCriterion("meeting_user_id is null");
		return (Criteria) this;
		}
  public Criteria andMeetingUserIdIsNotNull(){
		addCriterion("meeting_user_id is not null");
		return (Criteria) this;
		}
  public Criteria andMeetingUserIdEqualTo(Integer value) {
		  addCriterion("meeting_user_id =", value, "meetingUserId");
		return (Criteria) this;
		}
   public Criteria andMeetingUserIdNotEqualTo(Integer value) {
		  addCriterion("meeting_user_id <>", value, "meetingUserId");
		return (Criteria) this;
		}
    public Criteria andMeetingUserIdGreaterThan(Integer value) {
		 addCriterion("meeting_user_id >", value, "meetingUserId");
		return (Criteria) this;
		}
  public Criteria andMeetingUserIdGreaterThanOrEqualTo(Integer value) {
		  addCriterion("meeting_user_id >=", value, "MeetingUserId");
		return (Criteria) this;
		}
   public Criteria andMeetingUserIdLessThan(Integer value) {
		  addCriterion("meeting_user_id <", value, "meetingUserId");
		return (Criteria) this;
		}
    public Criteria andMeetingUserIdLessThanOrEqualTo(Integer value) {
		  addCriterion("meeting_user_id <=", value, "meetingUserId");
		return (Criteria) this;
		}
    public Criteria andMeetingUserIdIn(List<Integer> values) {
		  addCriterion("meeting_user_id in", values, "meetingUserId");
		return (Criteria) this;
		}
    public Criteria andMeetingUserIdNotIn(List<Integer> values) {
		  addCriterion("meeting_user_id not in", values, "meetingUserId");
		return (Criteria) this;
		}
     public Criteria andMeetingUserIdBetween(Integer value1, Integer value2) {
		   addCriterion("meeting_user_id between", value1, value2, "meetingUserId");
		return (Criteria) this;
		}
     public Criteria andMeetingUserIdNotBetween(Integer value1, Integer value2) {
		   addCriterion("meeting_user_id not between", value1, value2, "meetingUserId");
		return (Criteria) this;
		}
    public Criteria andMeetingUserIdLike(Integer value) {
		  addCriterion("meeting_user_id like", value, "meetingUserId");
		return (Criteria) this;
		}
    public Criteria andMeetingUserIdNotLike(Integer value) {
		  addCriterion("meeting_user_id not like", value, "meetingUserId");
		return (Criteria) this;
		}
 public Criteria andSignStatusIsNull() {
		 addCriterion("sign_status is null");
		return (Criteria) this;
		}
  public Criteria andSignStatusIsNotNull(){
		addCriterion("sign_status is not null");
		return (Criteria) this;
		}
  public Criteria andSignStatusEqualTo(Integer value) {
		  addCriterion("sign_status =", value, "signStatus");
		return (Criteria) this;
		}
   public Criteria andSignStatusNotEqualTo(Integer value) {
		  addCriterion("sign_status <>", value, "signStatus");
		return (Criteria) this;
		}
    public Criteria andSignStatusGreaterThan(Integer value) {
		 addCriterion("sign_status >", value, "signStatus");
		return (Criteria) this;
		}
  public Criteria andSignStatusGreaterThanOrEqualTo(Integer value) {
		  addCriterion("sign_status >=", value, "SignStatus");
		return (Criteria) this;
		}
   public Criteria andSignStatusLessThan(Integer value) {
		  addCriterion("sign_status <", value, "signStatus");
		return (Criteria) this;
		}
    public Criteria andSignStatusLessThanOrEqualTo(Integer value) {
		  addCriterion("sign_status <=", value, "signStatus");
		return (Criteria) this;
		}
    public Criteria andSignStatusIn(List<Integer> values) {
		  addCriterion("sign_status in", values, "signStatus");
		return (Criteria) this;
		}
    public Criteria andSignStatusNotIn(List<Integer> values) {
		  addCriterion("sign_status not in", values, "signStatus");
		return (Criteria) this;
		}
     public Criteria andSignStatusBetween(Integer value1, Integer value2) {
		   addCriterion("sign_status between", value1, value2, "signStatus");
		return (Criteria) this;
		}
     public Criteria andSignStatusNotBetween(Integer value1, Integer value2) {
		   addCriterion("sign_status not between", value1, value2, "signStatus");
		return (Criteria) this;
		}
    public Criteria andSignStatusLike(Integer value) {
		  addCriterion("sign_status like", value, "signStatus");
		return (Criteria) this;
		}
    public Criteria andSignStatusNotLike(Integer value) {
		  addCriterion("sign_status not like", value, "signStatus");
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
