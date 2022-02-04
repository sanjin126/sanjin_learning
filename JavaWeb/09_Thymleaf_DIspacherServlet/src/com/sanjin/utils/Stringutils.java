package com.sanjin.utils;

/**
 * @author sanjin
 * @date 2022/1/27 下午5:38
 * @description
 */
public class Stringutils {
    public static boolean isNotEmpty(String ...strs){
        boolean flag = true;
        for (String str : strs){
            if (str == null || "".equals(str)){
                flag = false;
            }
        }
        return flag;
    }

}
