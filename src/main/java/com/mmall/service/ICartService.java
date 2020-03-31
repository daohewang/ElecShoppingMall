package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.vo.CartVo;

/**
 * Author: swordsmanye
 */
public interface ICartService {
    /**
     * 购物车List列表
     * @param userId
     * @return
     */
    ServerResponse<CartVo> list(Integer userId);

    /**
     * 购物车添加商品
     * @param userId    用户Id, 用于判断用户是否登录
     * @param productId 被添加产品的Id
     * @param count     被添加产品的数量
     * @return
     */
    ServerResponse<CartVo> add(Integer userId, Integer productId, Integer count);

    /**
     * 更新购物车某个产品数量
     * @param userId
     * @param productId
     * @param count
     * @return
     */
    ServerResponse<CartVo> update(Integer userId, Integer productId, Integer count);

    /**
     * 移除购物车某个产品
     * @param userId
     * @param productIds
     * @return
     */
    ServerResponse<CartVo> delectProduct(Integer userId, String productIds);

    /**
     * 购物车选中/取消选中某个商品
     * @param userId
     * @param productId
     * @param checked
     * @return
     */
    ServerResponse<CartVo> selectOrUnSelect(Integer userId, Integer productId, int checked);

    /**
     * 查询当前用户的购物车里面的产品数量,如果一个产品有10个,那么数量就是10.
     * @param userId
     * @return
     */
    ServerResponse<Integer> getCartProductCount(Integer userId);
}
