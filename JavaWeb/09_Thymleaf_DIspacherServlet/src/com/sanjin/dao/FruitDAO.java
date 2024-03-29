package com.sanjin.dao;



import com.sanjin.bean.Fruit;

import java.util.List;

public interface FruitDAO {
    //查询库存列表
    List<Fruit> getFruitList(int pageNo, String keyword);

    //新增库存
    boolean addFruit(Fruit fruit);

    //修改库存
    boolean updateFruit(Fruit fruit);

    //根据名称查询特定库存
    Fruit getFruitByFname(String fname);

    //删除特定库存记录
    boolean delFruit(String fname);

    boolean delFruitById(int fid);

    Fruit getFruitById(int id);

    int getFruitCount(String keyword);
}
