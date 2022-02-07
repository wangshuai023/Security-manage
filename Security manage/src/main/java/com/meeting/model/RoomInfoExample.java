package com.meeting.model;
import java.util.ArrayList;
import java.util.List;
public class RoomInfoExample {
    protected String orderByClause;
    protected boolean distinct;
    protected int startRow;
    protected int pageRows;
    protected List<Criteria> oredCriteria;
    public RoomInfoExample() {
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
 public Criteria andRoomNameIsNull() {
		 addCriterion("room_name is null");
		return (Criteria) this;
		}
  public Criteria andRoomNameIsNotNull(){
		addCriterion("room_name is not null");
		return (Criteria) this;
		}
  public Criteria andRoomNameEqualTo(String value) {
		  addCriterion("room_name =", value, "roomName");
		return (Criteria) this;
		}
   public Criteria andRoomNameNotEqualTo(String value) {
		  addCriterion("room_name <>", value, "roomName");
		return (Criteria) this;
		}
    public Criteria andRoomNameGreaterThan(String value) {
		 addCriterion("room_name >", value, "roomName");
		return (Criteria) this;
		}
  public Criteria andRoomNameGreaterThanOrEqualTo(String value) {
		  addCriterion("room_name >=", value, "RoomName");
		return (Criteria) this;
		}
   public Criteria andRoomNameLessThan(String value) {
		  addCriterion("room_name <", value, "roomName");
		return (Criteria) this;
		}
    public Criteria andRoomNameLessThanOrEqualTo(String value) {
		  addCriterion("room_name <=", value, "roomName");
		return (Criteria) this;
		}
    public Criteria andRoomNameIn(List<String> values) {
		  addCriterion("room_name in", values, "roomName");
		return (Criteria) this;
		}
    public Criteria andRoomNameNotIn(List<String> values) {
		  addCriterion("room_name not in", values, "roomName");
		return (Criteria) this;
		}
     public Criteria andRoomNameBetween(String value1, String value2) {
		   addCriterion("room_name between", value1, value2, "roomName");
		return (Criteria) this;
		}
     public Criteria andRoomNameNotBetween(String value1, String value2) {
		   addCriterion("room_name not between", value1, value2, "roomName");
		return (Criteria) this;
		}
    public Criteria andRoomNameLike(String value) {
		  addCriterion("room_name like", value, "roomName");
		return (Criteria) this;
		}
    public Criteria andRoomNameNotLike(String value) {
		  addCriterion("room_name not like", value, "roomName");
		return (Criteria) this;
		}
 public Criteria andRoomAddressIsNull() {
		 addCriterion("room_address is null");
		return (Criteria) this;
		}
  public Criteria andRoomAddressIsNotNull(){
		addCriterion("room_address is not null");
		return (Criteria) this;
		}
  public Criteria andRoomAddressEqualTo(String value) {
		  addCriterion("room_address =", value, "roomAddress");
		return (Criteria) this;
		}
   public Criteria andRoomAddressNotEqualTo(String value) {
		  addCriterion("room_address <>", value, "roomAddress");
		return (Criteria) this;
		}
    public Criteria andRoomAddressGreaterThan(String value) {
		 addCriterion("room_address >", value, "roomAddress");
		return (Criteria) this;
		}
  public Criteria andRoomAddressGreaterThanOrEqualTo(String value) {
		  addCriterion("room_address >=", value, "RoomAddress");
		return (Criteria) this;
		}
   public Criteria andRoomAddressLessThan(String value) {
		  addCriterion("room_address <", value, "roomAddress");
		return (Criteria) this;
		}
    public Criteria andRoomAddressLessThanOrEqualTo(String value) {
		  addCriterion("room_address <=", value, "roomAddress");
		return (Criteria) this;
		}
    public Criteria andRoomAddressIn(List<String> values) {
		  addCriterion("room_address in", values, "roomAddress");
		return (Criteria) this;
		}
    public Criteria andRoomAddressNotIn(List<String> values) {
		  addCriterion("room_address not in", values, "roomAddress");
		return (Criteria) this;
		}
     public Criteria andRoomAddressBetween(String value1, String value2) {
		   addCriterion("room_address between", value1, value2, "roomAddress");
		return (Criteria) this;
		}
     public Criteria andRoomAddressNotBetween(String value1, String value2) {
		   addCriterion("room_address not between", value1, value2, "roomAddress");
		return (Criteria) this;
		}
    public Criteria andRoomAddressLike(String value) {
		  addCriterion("room_address like", value, "roomAddress");
		return (Criteria) this;
		}
    public Criteria andRoomAddressNotLike(String value) {
		  addCriterion("room_address not like", value, "roomAddress");
		return (Criteria) this;
		}
 public Criteria andRoomStatusIsNull() {
		 addCriterion("room_status is null");
		return (Criteria) this;
		}
  public Criteria andRoomStatusIsNotNull(){
		addCriterion("room_status is not null");
		return (Criteria) this;
		}
  public Criteria andRoomStatusEqualTo(Integer value) {
		  addCriterion("room_status =", value, "roomStatus");
		return (Criteria) this;
		}
   public Criteria andRoomStatusNotEqualTo(Integer value) {
		  addCriterion("room_status <>", value, "roomStatus");
		return (Criteria) this;
		}
    public Criteria andRoomStatusGreaterThan(Integer value) {
		 addCriterion("room_status >", value, "roomStatus");
		return (Criteria) this;
		}
  public Criteria andRoomStatusGreaterThanOrEqualTo(Integer value) {
		  addCriterion("room_status >=", value, "RoomStatus");
		return (Criteria) this;
		}
   public Criteria andRoomStatusLessThan(Integer value) {
		  addCriterion("room_status <", value, "roomStatus");
		return (Criteria) this;
		}
    public Criteria andRoomStatusLessThanOrEqualTo(Integer value) {
		  addCriterion("room_status <=", value, "roomStatus");
		return (Criteria) this;
		}
    public Criteria andRoomStatusIn(List<Integer> values) {
		  addCriterion("room_status in", values, "roomStatus");
		return (Criteria) this;
		}
    public Criteria andRoomStatusNotIn(List<Integer> values) {
		  addCriterion("room_status not in", values, "roomStatus");
		return (Criteria) this;
		}
     public Criteria andRoomStatusBetween(Integer value1, Integer value2) {
		   addCriterion("room_status between", value1, value2, "roomStatus");
		return (Criteria) this;
		}
     public Criteria andRoomStatusNotBetween(Integer value1, Integer value2) {
		   addCriterion("room_status not between", value1, value2, "roomStatus");
		return (Criteria) this;
		}
    public Criteria andRoomStatusLike(Integer value) {
		  addCriterion("room_status like", value, "roomStatus");
		return (Criteria) this;
		}
    public Criteria andRoomStatusNotLike(Integer value) {
		  addCriterion("room_status not like", value, "roomStatus");
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
