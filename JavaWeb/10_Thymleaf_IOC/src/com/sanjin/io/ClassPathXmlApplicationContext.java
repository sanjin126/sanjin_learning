package com.sanjin.io;

import java.util.HashMap;
import java.util.Map;

/**
 * @author sanjin
 * @date 2022/2/5 下午9:28
 * @description
 */
public class ClassPathXmlApplicationContext implements BeanFactory{

    private Map<String, Object> beanMap = new HashMap<String, Object>();

    public ClassPathXmlApplicationContext() {

    }

    @Override
    public Object getBean(String id) {
        return beanMap.get(id);
    }
}
