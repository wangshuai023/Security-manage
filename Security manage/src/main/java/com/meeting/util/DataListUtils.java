package com.meeting.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 固定下拉列表解释器
 * @author Administrator
 *
 */
public class DataListUtils {
    public static void main(String[] args) {
    }

    /**
    **获取登录角色列表
    */
    public static List<Map<String, Object>> getLoginTypeList() {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        list.add(getMap("1", "admin"));
        list.add(getMap("2", "user"));

        return list;
    }

    /**
    **获取sex数据列表
    */
    public static List<Map<String, Object>> getSexList() {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        list.add(getMap("1", "男"));
        list.add(getMap("2", "女"));

        return list;
    }

    public static String getSexNameById(String id) { //根据sex的key值获取名称

        List<Map<String, Object>> list = getSexList();

        return getNameById(id, list);
    }

    /**
    **获取room_status数据列表
    */
    public static List<Map<String, Object>> getRoomStatusList() {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        list.add(getMap("1", "空闲中"));
        list.add(getMap("2", "使用中"));

        return list;
    }

    public static String getRoomStatusNameById(String id) { //根据room_status的key值获取名称

        List<Map<String, Object>> list = getRoomStatusList();

        return getNameById(id, list);
    }

    /**
    **获取order_status数据列表
    */
    public static List<Map<String, Object>> getOrderStatusList() {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        list.add(getMap("1", "已预约"));
        list.add(getMap("2",
                "审核通过"));
        list.add(getMap("3",
                "审核不通过"));
        list.add(getMap("4", "使用中"));
        list.add(getMap("5", "已过期"));
        list.add(getMap("6", "已取消"));

        return list;
    }

    public static String getOrderStatusNameById(String id) { //根据order_status的key值获取名称

        List<Map<String, Object>> list = getOrderStatusList();

        return getNameById(id, list);
    }

    /**
    **获取order_time数据列表
    */
    public static List<Map<String, Object>> getOrderTimeList() {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        list.add(getMap("1", "09:00~10:00"));
        list.add(getMap("2", "10:00~11:00"));
        list.add(getMap("3", "11:00~12:00"));
        list.add(getMap("4", "12:00~13:00"));
        list.add(getMap("5", "13:00~14:00"));
        list.add(getMap("6", "14:00~15:00"));
        list.add(getMap("7", "15:00~16:00"));
        list.add(getMap("8", "16:00~17:00"));
        list.add(getMap("9", "17:00~18:00"));
        list.add(getMap("10", "18:00~19:00"));
        list.add(getMap("11", "19:00~20:00"));
        list.add(getMap("12", "20:00~21:00"));

        return list;
    }

    public static String getOrderTimeNameById(String id) { //根据order_time的key值获取名称

        List<Map<String, Object>> list = getOrderTimeList();

        return getNameById(id, list);
    }

    /**
    **获取sign_status数据列表
    */
    public static List<Map<String, Object>> getSignStatusList() {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        list.add(getMap("1", "待参会"));
        list.add(getMap("2", "已签到"));
        list.add(getMap("3", "已迟到"));
        list.add(getMap("4", "已缺勤"));

        return list;
    }

    public static String getSignStatusNameById(String id) { //根据sign_status的key值获取名称

        List<Map<String, Object>> list = getSignStatusList();

        return getNameById(id, list);
    }
    
    /**
     **获取order_model数据列表
     */
     public static List<Map<String, Object>> getOrderModelList() {
         List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
         list.add(getMap("1",
                 "自动模式"));
         list.add(getMap("2",
                 "审核模式"));

         return list;
     }

     public static String getOrderModelNameById(String id) { //根据order_model的key值获取名称

         List<Map<String, Object>> list = getOrderModelList();

         return getNameById(id, list);
     }

    public static String getNameById(String id, List<Map<String, Object>> list) {
        if (id == null) {
            return null;
        }

        if (id.endsWith(",")) {
            id = id.substring(0, id.length() - 1);
        }

        String[] idsplit = id.split(",");
        String rs = "";

        for (String tmp : idsplit) {
            for (Map<String, Object> map : list) {
                if (map.get("id").toString().equals(tmp)) {
                    rs += (map.get("name").toString() + ",");
                }
            }
        }

        if (rs.endsWith(",")) {
            rs = rs.substring(0, rs.length() - 1);
        }

        return rs;
    }

    private static Map<String, Object> getMap(String id, String name) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("id", id);
        map.put("name", name);

        return map;
    }
}

