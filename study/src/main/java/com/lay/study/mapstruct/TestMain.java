//package com.lay.study.mapstruct;
//
//import com.lay.study.mapstruct.beans.GoodInfoDTO;
//import com.lay.study.mapstruct.beans.GoodInfoPO;
//import com.lay.study.mapstruct.beans.GoodTypeBean;
//import com.lay.study.mapstruct.mapper.GoodInfoMapper;
//
///**
// * Created by chenyalei on 2018/9/29.
// */
//public class TestMain {
//
//    public static void main(String[] args) {
//
//        GoodInfoPO goodInfoPO = GoodInfoPO.builder()
//                .id(1L)
//                .price(100L)
//                .typeId(10L)
//                .build();
//        GoodTypeBean goodTypeBean = GoodTypeBean.builder().id(11L).name("typeName").order(11).show(11).build();
//
//        GoodInfoDTO goodInfoDTO = GoodInfoMapper.MAPPER.po2DTO(goodInfoPO);
//
//        System.out.println(goodInfoDTO);
//    }
//}
