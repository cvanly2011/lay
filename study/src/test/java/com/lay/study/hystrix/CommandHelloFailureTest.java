package com.lay.study.hystrix;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lay on 2017/12/4.
 */
public class CommandHelloFailureTest {

    @Test
    public void test() throws Exception {

        assertEquals("Hello Failure World!", new CommandHelloFailure("World").execute());
        assertEquals("Hello Failure Bob!", new CommandHelloFailure("Bob").execute());

    }
}