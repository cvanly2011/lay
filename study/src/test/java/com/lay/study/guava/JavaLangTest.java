//package com.lay.study.guava;
//
//import com.lay.study.guava.GuavaVo;
//import com.lay.study.lombok.LomVo;
//import lombok.extern.log4j.Log4j;
//import org.junit.Assert;
//import org.junit.Test;
//
//import java.util.Objects;
//
//import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;
//
///**
// * Created by Lay on 2016/3/21.
// */
//@Log4j
//public class JavaLangTest {
//
//    @Test
//    public void langTest(){
//
//        boolean boo1 = Objects.equals(null, "a");
//        Assert.assertFalse(boo1);
//
//        GuavaVo guavaVo = new GuavaVo("Tom",12);
//        String toString = guavaVo.toString();
//        String toString1 = Objects.toString(guavaVo);
//        log.info(toString+"--"+toString1);
//
//        LomVo lomVo = new LomVo();
//        String toString2 = lomVo.toString();
//        lomVo.setName("Tom");
//        lomVo.setAge(12);
//        String toString3 = Objects.toString(lomVo);
//        log.info(toString2+"--"+toString3);
//    }
//}
