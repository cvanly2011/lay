package com.lay.study.guava;

import com.google.common.collect.BoundType;
import com.google.common.collect.Range;
import com.google.common.primitives.Ints;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Lay on 2016/3/21.
 */
public class RangeTest {


    @Test
    public void test(){

        boolean boo = Range.closed(1, 3).contains(2);//return true
        Assert.assertTrue(boo);
        boolean boo1 = Range.closed(1, 3).contains(4);//return false
        Assert.assertFalse(boo1);
        boolean boo2 = Range.lessThan(5).contains(5); //return false
        Assert.assertFalse(boo2);
        boolean boo3 = Range.closed(1, 4).containsAll(Ints.asList(1, 2, 3)); //return true
        Assert.assertTrue(boo3);

        Assert.assertTrue(Range.closedOpen(4, 4).isEmpty());// returns true
        Assert.assertTrue(Range.openClosed(4, 4).isEmpty()); // returns true
        Assert.assertFalse(Range.closed(4, 4).isEmpty()); // returns false
//        Range.open(4, 4).isEmpty(); // Range.open throws IllegalArgumentException
        Assert.assertEquals(Range.closed(3, 10).lowerEndpoint(),new Integer(3));// returns 3
        Assert.assertEquals(Range.open(3, 10).lowerEndpoint(),new Integer(3)); // returns 3
        Assert.assertEquals(Range.closed(3, 10).lowerBoundType(),BoundType.CLOSED); // returns CLOSED
        Assert.assertEquals(Range.open(3, 10).upperBoundType(),BoundType.OPEN); // returns OPEN
    }
}
