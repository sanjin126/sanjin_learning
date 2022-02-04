package com.sanjin.service;

import com.sanjin.bean.Fruit;

import java.util.List;

/**
 * @author sanjin
 * @date 2022/2/5 上午12:43
 * @description
 */
public interface FruitService {
    List<Fruit> getFruitList(int pageNo, String keyword);

    //新增库存
    boolean addFruit(Fruit fruit);

    //修改库存
    boolean updateFruit(Fruit fruit);

    boolean delFruitById(int fid);

    Fruit getFruitById(int fid);

    int getPageCount(String keyword);

}
