package com.sanjin.dao.impl;


import com.sanjin.bean.Fruit;
import com.sanjin.dao.FruitDAO;
import com.sanjin.dao.base.BaseDAO;

import java.util.List;

public class FruitDAOImpl extends BaseDAO<Fruit> implements FruitDAO {
    public static void main(String[] args) {
        System.out.println(new FruitDAOImpl().getConn());
    }
    @Override
    public List<Fruit> getFruitList(int pageNo, String keyword) {
        return super.executeQuery("select * from t_fruit where fname like ? or remark like ? limit ?,5",
                "%"+keyword+"%", "%"+keyword+"%",(pageNo-1)*5);
    }

    @Override
    public boolean addFruit(Fruit fruit) {
        String sql = "insert into t_fruit values(0,?,?,?,?)";
        int count = super.executeUpdate(sql,fruit.getFname(),fruit.getPrice(),fruit.getFcount(),fruit.getRemark()) ;
        //insert语句返回的是自增列的值，而不是影响行数
        //System.out.println(count);
        return count>0;
    }

    @Override
    public boolean updateFruit(Fruit fruit) {
        String sql = "update t_fruit set fcount = ?,fname=?,price=?,remark=? where fid = ? " ;
        return super.executeUpdate(sql,fruit.getFcount(),fruit.getFname(),fruit.getPrice(),
                fruit.getRemark(),fruit.getFid())>0;
    }

    @Override
    public Fruit getFruitByFname(String fname) {
        return super.load("select * from t_fruit where fname like ? ",fname);
    }

    @Override
    public boolean delFruit(String fname) {
        String sql = "delete from t_fruit where fname like ? " ;
        return super.executeUpdate(sql,fname)>0;
    }

    @Override
    public boolean delFruitById(int fid) {
        String sql = "delete from t_fruit where fid=? " ;
        return super.executeUpdate(sql, fid)>0;
    }

    @Override
    public Fruit getFruitById(int id) {
        return super.load("select * from t_fruit where fid=?", id);
    }

    @Override
    public int getFruitCount(String keyword) {
        String sql = "select count(*) from t_fruit where fname like ? or remark like ? ";
        Object[] objects = executeComplexQuery(sql,"%"+keyword+"%", "%"+keyword+"%");
        return ((Long)objects[0]).intValue();

    }
}