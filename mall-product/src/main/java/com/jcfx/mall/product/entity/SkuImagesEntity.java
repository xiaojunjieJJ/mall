package com.jcfx.mall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * skuͼƬ
 *
 * @author Bob Shaw
 * @email hninee@163.com
 * @date 2022-12-20 22:35:23
 */
@Data
@TableName("pms_sku_images")
public class SkuImagesEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId
    private Long id;
    /**
     * sku_id
     */
    private Long skuId;
    /**
     * ͼƬ??ַ
     */
    private String imgUrl;
    /**
     * ???
     */
    private Integer imgSort;
    /**
     * Ĭ??ͼ[0 - ????Ĭ??ͼ??1 - ??Ĭ??ͼ]
     */
    private Integer defaultImg;

}
