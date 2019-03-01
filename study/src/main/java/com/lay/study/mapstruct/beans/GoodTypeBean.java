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
public class GoodTypeBean {

    private Long id;
    private String name;
    private int show;
    private int order;

}
