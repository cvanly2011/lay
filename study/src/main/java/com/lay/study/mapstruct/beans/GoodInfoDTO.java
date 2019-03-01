package com.lay.study.mapstruct.beans;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by chenyalei on 2018/9/29.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GoodInfoDTO {

    //商品编号
    private String goodId;
    //商品名称
    private String goodName;
    //商品价格
    private double goodPrice;
    //类型名称
    private String typeName;

}
