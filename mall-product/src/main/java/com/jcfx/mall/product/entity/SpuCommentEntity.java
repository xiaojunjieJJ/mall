package com.jcfx.mall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * ??Ʒ???
 *
 * @author Bob Shaw
 * @email hninee@163.com
 * @date 2022-12-20 22:35:23
 */
@Data
@TableName("pms_spu_comment")
public class SpuCommentEntity implements Serializable {
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
     * spu_id
     */
    private Long spuId;
    /**
     * ??Ʒ?
     */
    private String spuName;
    /**
     * ??Ա?ǳ
     */
    private String memberNickName;
    /**
     * ?Ǽ?
     */
    private Integer star;
    /**
     * ??Աip
     */
    private String memberIp;
    /**
     * ????ʱ?
     */
    private Date createTime;
    /**
     * ??ʾ״̬[0-????ʾ??1-??ʾ]
     */
    private Integer showStatus;
    /**
     * ????ʱ???????
     */
    private String spuAttributes;
    /**
     * ?????
     */
    private Integer likesCount;
    /**
     * ?ظ??
     */
    private Integer replyCount;
    /**
     * ????ͼƬ/??Ƶ[json???ݣ?[{type:?ļ?????,url:??Դ·??}]]
     */
    private String resources;
    /**
     * ???
     */
    private String content;
    /**
     * ?û?ͷ?
     */
    private String memberIcon;
    /**
     * ????????[0 - ????Ʒ??ֱ?????ۣ?1 - ?????۵Ļظ?]
     */
    private Integer commentType;

}
