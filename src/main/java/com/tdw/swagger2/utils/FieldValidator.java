package com.tdw.swagger2.utils;

import java.lang.reflect.Field;

/**
 * @author tangxs
 * @date 2017/11/15
 * 验证字段
 */
public class FieldValidator {

    /**
     * 验证账户字段
     * @param object
     * @param
     * @return
     */
    public static Boolean validaModelRequiredField(Object object,String ...filter) throws IllegalAccessException{
        for (Field f : object.getClass().getDeclaredFields())
        {
            f.setAccessible(true);
            Object obj = f.get(object);
            String fieldName = f.getName();
            boolean flag = false;
            for (String fName:filter)
            {
                if (fieldName.equals(fName))
                {
                    flag = true;
                    break;
                }
            }
            if (flag)
            {
                continue;
            }
            if (isEmpty(obj))
            {
                return false;
            }
        }
        return true;
    }

    public static boolean isEmpty(Object str) {
        if(str==null) {return true;}
        return str.getClass().getName().contains("String")?
                str == null || "".equals(str.toString().trim()) : str == null;
    }
}
