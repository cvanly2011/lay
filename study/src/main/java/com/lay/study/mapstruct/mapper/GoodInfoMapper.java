//package com.lay.study.mapstruct.mapper;
//
//import com.lay.study.mapstruct.beans.GoodInfoDTO;
//import com.lay.study.mapstruct.beans.GoodInfoPO;
//import com.lay.study.mapstruct.beans.GoodTypeBean;
//import org.mapstruct.Mapper;
//import org.mapstruct.Mapping;
//import org.mapstruct.Mappings;
//import org.mapstruct.factory.Mappers;
//
///**
// * Created by chenyalei on 2018/9/29.
// */
//@Mapper
//public interface GoodInfoMapper {
//
//    public static GoodInfoMapper MAPPER = Mappers.getMapper(GoodInfoMapper.class);
//
////    @Mappings({
////            @Mapping(source = "type.name",target = "typeName"),
////            @Mapping(source = "good.id",target = "goodId"),
////            @Mapping(source = "good.title",target = "goodName"),
////            @Mapping(source = "good.price",target = "goodPrice")
////    })
////    GoodInfoDTO from(GoodInfoPO good, GoodTypeBean type);
//
//    @Mappings(value = {
//            @Mapping(source = "id",target = "goodId"),
//            @Mapping(source = "name",target = "goodName"),
//            @Mapping(source = "price",target = "goodPrice")
//    })
//    GoodInfoDTO po2DTO(GoodInfoPO good);
//
//}
