package com.lay.study.guava;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.Ordering;
import com.google.common.primitives.Ints;
import com.sun.org.apache.xpath.internal.operations.Or;
import lombok.extern.log4j.Log4j;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Lay on 2016/3/21.
 */
@Log4j
public class GuavaTest {

    @Test
    /**
     * 前置条件测试
     */
    public void preconditionsTest(){

        log.info("----start----");
        int i = 2, j = 1;
//        Preconditions.checkArgument(i < j, "Expected i < j, but %s > %s", i, j);


        GuavaVo vo = null;
//        Preconditions.checkNotNull(vo);

//        Preconditions.checkState(i<j,"Expected i < j, but %s > %s", i, j);

//        Preconditions.checkElementIndex(i,j);

        Preconditions.checkPositionIndex(i,j);

    }

    @Test
    public void objectTest(){

        boolean boo1 = Objects.equal("a", "a"); // returns true
        Assert.assertTrue(boo1);
        boolean boo2 = Objects.equal(null, "a"); // returns false
        Assert.assertFalse(boo2);
        boolean boo3 = Objects.equal("a", null); // returns false
        Assert.assertFalse(boo3);
        boolean boo4 = Objects.equal(null, null); // returns true
        Assert.assertTrue(boo4);

        GuavaVo guavaVo = new GuavaVo();
        int hashCode = Objects.hashCode(guavaVo);
        log.info("hashCode:"+hashCode);

        GuavaVo guavaVo1 = new GuavaVo();
        guavaVo1.setName("Tom");
        int hashCode1 = Objects.hashCode(guavaVo1);
        log.info("hashCode1:"+hashCode1);

    }

    @Test
    public void orderTest(){

        Ordering ordering = new Ordering() {
            @Override
            public int compare(Object o, Object t1) {
                return 0;
            }
        };

        Ordering<String> stringOrdering = new Ordering<String>() {
            @Override
            public int compare(String left, String right) {
                return Ints.compare(left.length(), right.length());
            }
        };
    }



}