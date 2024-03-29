package com.jcfx.mall.ware.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jcfx.mall.ware.entity.WareSkuEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * 商品库存
 *
 * @author Bob Shaw
 * @email hninee@163.com
 * @date 2022-12-21 10:14:58
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {

    void addStock(@Param("skuId") Long skuId, @Param("wareId") Long wareId, @Param("skuNum") Integer skuNum);

    @Select("SELECT SUM(stock - stock_locked) FROM `wms_ware_sku` WHERE `sku_id` = #{skuId}}")
    Long getSkuStock(@Param("skuId") Long skuId);
}
