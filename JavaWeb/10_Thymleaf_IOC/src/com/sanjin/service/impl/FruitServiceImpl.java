package com.sanjin.service.impl;

import com.sanjin.bean.Fruit;
import com.sanjin.dao.FruitDAO;
import com.sanjin.dao.impl.FruitDAOImpl;
import com.sanjin.service.FruitService;

import java.util.List;

/**
 * @author sanjin
 * @date 2022/2/5 上午12:45
 * @description
 */
public class FruitServiceImpl implements FruitService {

    private FruitDAO fDao = new FruitDAOImpl();

    @Override
    public List<Fruit> getFruitList(int pageNo, String keyword) {
        List<Fruit> fruitList = fDao.getFruitList(pageNo, keyword);
        return fruitList;
    }

    @Override
    public boolean addFruit(Fruit fruit) {
        boolean flag = fDao.addFruit(fruit);
        return flag;
    }

    @Override
    public boolean updateFruit(Fruit fruit) {
        return fDao.updateFruit(fruit);
    }

    @Override
    public boolean delFruitById(int fid) {
        return fDao.delFruitById(fid);
    }

    @Override
    public Fruit getFruitById(int fid) {
        return fDao.getFruitById(fid);
    }

    @Override
    public int getPageCount(String keyword) {
        int fruitCount = fDao.getFruitCount(keyword);
        int pageCount = (fruitCount+5-1)/5 ;
        return pageCount;
    }
}
