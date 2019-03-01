package com.lay.springboot.study.mapper.mapper;

import com.lay.springboot.study.mapper.beans.Car;
import com.lay.springboot.study.mapper.beans.CarDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * Created by chenyalei on 2018/10/10.
 */
@Mapper
public interface CarMapper {

    CarMapper INSTANCE = Mappers.getMapper( CarMapper.class );

    @Mapping(source = "numberOfSeats", target = "seatCount")
    CarDto carToCarDto(Car car);
}
