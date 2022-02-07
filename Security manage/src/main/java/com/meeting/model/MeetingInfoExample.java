package com.meeting.model;
import java.util.ArrayList;
import java.util.List;
public class MeetingInfoExample {
    protected String orderByClause;
    protected boolean distinct;
    protected int startRow;
    protected int pageRows;
    protected List<Criteria> oredCriteria;
    public MeetingInfoExample() {
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
 public Criteria andRoomIdIsNull() {
		 addCriterion("room_id is null");
		return (Criteria) this;
		}
  public Criteria andRoomIdIsNotNull(){
		addCriterion("room_id is not null");
		return (Criteria) this;
		}
  public Criteria andRoomIdEqualTo(Integer value) {
		  addCriterion("room_id =", value, "roomId");
		return (Criteria) this;
		}
   public Criteria andRoomIdNotEqualTo(Integer value) {
		  addCriterion("room_id <>", value, "roomId");
		return (Criteria) this;
		}
    public Criteria andRoomIdGreaterThan(Integer value) {
		 addCriterion("room_id >", value, "roomId");
		return (Criteria) this;
		}
  public Criteria andRoomIdGreaterThanOrEqualTo(Integer value) {
		  addCriterion("room_id >=", value, "RoomId");
		return (Criteria) this;
		}
   public Criteria andRoomIdLessThan(Integer value) {
		  addCriterion("room_id <", value, "roomId");
		return (Criteria) this;
		}
    public Criteria andRoomIdLessThanOrEqualTo(Integer value) {
		  addCriterion("room_id <=", value, "roomId");
		return (Criteria) this;
		}
    public Criteria andRoomIdIn(List<Integer> values) {
		  addCriterion("room_id in", values, "roomId");
		return (Criteria) this;
		}
    public Criteria andRoomIdNotIn(List<Integer> values) {
		  addCriterion("room_id not in", values, "roomId");
		return (Criteria) this;
		}
     public Criteria andRoomIdBetween(Integer value1, Integer value2) {
		   addCriterion("room_id between", value1, value2, "roomId");
		return (Criteria) this;
		}
     public Criteria andRoomIdNotBetween(Integer value1, Integer value2) {
		   addCriterion("room_id not between", value1, value2, "roomId");
		return (Criteria) this;
		}
    public Criteria andRoomIdLike(Integer value) {
		  addCriterion("room_id like", value, "roomId");
		return (Criteria) this;
		}
    public Criteria andRoomIdNotLike(Integer value) {
		  addCriterion("room_id not like", value, "roomId");
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
 public Criteria andMeetingNameIsNull() {
		 addCriterion("meeting_name is null");
		return (Criteria) this;
		}
  public Criteria andMeetingNameIsNotNull(){
		addCriterion("meeting_name is not null");
		return (Criteria) this;
		}
  public Criteria andMeetingNameEqualTo(String value) {
		  addCriterion("meeting_name =", value, "meetingName");
		return (Criteria) this;
		}
   public Criteria andMeetingNameNotEqualTo(String value) {
		  addCriterion("meeting_name <>", value, "meetingName");
		return (Criteria) this;
		}
    public Criteria andMeetingNameGreaterThan(String value) {
		 addCriterion("meeting_name >", value, "meetingName");
		return (Criteria) this;
		}
  public Criteria andMeetingNameGreaterThanOrEqualTo(String value) {
		  addCriterion("meeting_name >=", value, "MeetingName");
		return (Criteria) this;
		}
   public Criteria andMeetingNameLessThan(String value) {
		  addCriterion("meeting_name <", value, "meetingName");
		return (Criteria) this;
		}
    public Criteria andMeetingNameLessThanOrEqualTo(String value) {
		  addCriterion("meeting_name <=", value, "meetingName");
		return (Criteria) this;
		}
    public Criteria andMeetingNameIn(List<String> values) {
		  addCriterion("meeting_name in", values, "meetingName");
		return (Criteria) this;
		}
    public Criteria andMeetingNameNotIn(List<String> values) {
		  addCriterion("meeting_name not in", values, "meetingName");
		return (Criteria) this;
		}
     public Criteria andMeetingNameBetween(String value1, String value2) {
		   addCriterion("meeting_name between", value1, value2, "meetingName");
		return (Criteria) this;
		}
     public Criteria andMeetingNameNotBetween(String value1, String value2) {
		   addCriterion("meeting_name not between", value1, value2, "meetingName");
		return (Criteria) this;
		}
    public Criteria andMeetingNameLike(String value) {
		  addCriterion("meeting_name like", value, "meetingName");
		return (Criteria) this;
		}
    public Criteria andMeetingNameNotLike(String value) {
		  addCriterion("meeting_name not like", value, "meetingName");
		return (Criteria) this;
		}
 public Criteria andMeetingIntroIsNull() {
		 addCriterion("meeting_intro is null");
		return (Criteria) this;
		}
  public Criteria andMeetingIntroIsNotNull(){
		addCriterion("meeting_intro is not null");
		return (Criteria) this;
		}
  public Criteria andMeetingIntroEqualTo(String value) {
		  addCriterion("meeting_intro =", value, "meetingIntro");
		return (Criteria) this;
		}
   public Criteria andMeetingIntroNotEqualTo(String value) {
		  addCriterion("meeting_intro <>", value, "meetingIntro");
		return (Criteria) this;
		}
    public Criteria andMeetingIntroGreaterThan(String value) {
		 addCriterion("meeting_intro >", value, "meetingIntro");
		return (Criteria) this;
		}
  public Criteria andMeetingIntroGreaterThanOrEqualTo(String value) {
		  addCriterion("meeting_intro >=", value, "MeetingIntro");
		return (Criteria) this;
		}
   public Criteria andMeetingIntroLessThan(String value) {
		  addCriterion("meeting_intro <", value, "meetingIntro");
		return (Criteria) this;
		}
    public Criteria andMeetingIntroLessThanOrEqualTo(String value) {
		  addCriterion("meeting_intro <=", value, "meetingIntro");
		return (Criteria) this;
		}
    public Criteria andMeetingIntroIn(List<String> values) {
		  addCriterion("meeting_intro in", values, "meetingIntro");
		return (Criteria) this;
		}
    public Criteria andMeetingIntroNotIn(List<String> values) {
		  addCriterion("meeting_intro not in", values, "meetingIntro");
		return (Criteria) this;
		}
     public Criteria andMeetingIntroBetween(String value1, String value2) {
		   addCriterion("meeting_intro between", value1, value2, "meetingIntro");
		return (Criteria) this;
		}
     public Criteria andMeetingIntroNotBetween(String value1, String value2) {
		   addCriterion("meeting_intro not between", value1, value2, "meetingIntro");
		return (Criteria) this;
		}
    public Criteria andMeetingIntroLike(String value) {
		  addCriterion("meeting_intro like", value, "meetingIntro");
		return (Criteria) this;
		}
    public Criteria andMeetingIntroNotLike(String value) {
		  addCriterion("meeting_intro not like", value, "meetingIntro");
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
 public Criteria andOrderStatusIsNull() {
		 addCriterion("order_status is null");
		return (Criteria) this;
		}
  public Criteria andOrderStatusIsNotNull(){
		addCriterion("order_status is not null");
		return (Criteria) this;
		}
  public Criteria andOrderStatusEqualTo(Integer value) {
		  addCriterion("order_status =", value, "orderStatus");
		return (Criteria) this;
		}
   public Criteria andOrderStatusNotEqualTo(Integer value) {
		  addCriterion("order_status <>", value, "orderStatus");
		return (Criteria) this;
		}
    public Criteria andOrderStatusGreaterThan(Integer value) {
		 addCriterion("order_status >", value, "orderStatus");
		return (Criteria) this;
		}
  public Criteria andOrderStatusGreaterThanOrEqualTo(Integer value) {
		  addCriterion("order_status >=", value, "OrderStatus");
		return (Criteria) this;
		}
   public Criteria andOrderStatusLessThan(Integer value) {
		  addCriterion("order_status <", value, "orderStatus");
		return (Criteria) this;
		}
    public Criteria andOrderStatusLessThanOrEqualTo(Integer value) {
		  addCriterion("order_status <=", value, "orderStatus");
		return (Criteria) this;
		}
    public Criteria andOrderStatusIn(List<Integer> values) {
		  addCriterion("order_status in", values, "orderStatus");
		return (Criteria) this;
		}
    public Criteria andOrderStatusNotIn(List<Integer> values) {
		  addCriterion("order_status not in", values, "orderStatus");
		return (Criteria) this;
		}
     public Criteria andOrderStatusBetween(Integer value1, Integer value2) {
		   addCriterion("order_status between", value1, value2, "orderStatus");
		return (Criteria) this;
		}
     public Criteria andOrderStatusNotBetween(Integer value1, Integer value2) {
		   addCriterion("order_status not between", value1, value2, "orderStatus");
		return (Criteria) this;
		}
    public Criteria andOrderStatusLike(Integer value) {
		  addCriterion("order_status like", value, "orderStatus");
		return (Criteria) this;
		}
    public Criteria andOrderStatusNotLike(Integer value) {
		  addCriterion("order_status not like", value, "orderStatus");
		return (Criteria) this;
		}
 public Criteria andCheckRemarkIsNull() {
		 addCriterion("check_remark is null");
		return (Criteria) this;
		}
  public Criteria andCheckRemarkIsNotNull(){
		addCriterion("check_remark is not null");
		return (Criteria) this;
		}
  public Criteria andCheckRemarkEqualTo(String value) {
		  addCriterion("check_remark =", value, "checkRemark");
		return (Criteria) this;
		}
   public Criteria andCheckRemarkNotEqualTo(String value) {
		  addCriterion("check_remark <>", value, "checkRemark");
		return (Criteria) this;
		}
    public Criteria andCheckRemarkGreaterThan(String value) {
		 addCriterion("check_remark >", value, "checkRemark");
		return (Criteria) this;
		}
  public Criteria andCheckRemarkGreaterThanOrEqualTo(String value) {
		  addCriterion("check_remark >=", value, "CheckRemark");
		return (Criteria) this;
		}
   public Criteria andCheckRemarkLessThan(String value) {
		  addCriterion("check_remark <", value, "checkRemark");
		return (Criteria) this;
		}
    public Criteria andCheckRemarkLessThanOrEqualTo(String value) {
		  addCriterion("check_remark <=", value, "checkRemark");
		return (Criteria) this;
		}
    public Criteria andCheckRemarkIn(List<String> values) {
		  addCriterion("check_remark in", values, "checkRemark");
		return (Criteria) this;
		}
    public Criteria andCheckRemarkNotIn(List<String> values) {
		  addCriterion("check_remark not in", values, "checkRemark");
		return (Criteria) this;
		}
     public Criteria andCheckRemarkBetween(String value1, String value2) {
		   addCriterion("check_remark between", value1, value2, "checkRemark");
		return (Criteria) this;
		}
     public Criteria andCheckRemarkNotBetween(String value1, String value2) {
		   addCriterion("check_remark not between", value1, value2, "checkRemark");
		return (Criteria) this;
		}
    public Criteria andCheckRemarkLike(String value) {
		  addCriterion("check_remark like", value, "checkRemark");
		return (Criteria) this;
		}
    public Criteria andCheckRemarkNotLike(String value) {
		  addCriterion("check_remark not like", value, "checkRemark");
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
