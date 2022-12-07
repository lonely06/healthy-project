package com.itheima.service;

import com.itheima.pojo.Setmeal;

/**
 * 套餐
 */
public interface SetmealService {

    /**
     * 添加套餐
     * @param setmeal
     * @param checkgroupIds
     */
    void add(Setmeal setmeal, Integer[] checkgroupIds);
}
