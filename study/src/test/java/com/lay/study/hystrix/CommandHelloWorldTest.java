package com.lay.study.hystrix;

import org.junit.Test;
import rx.Observable;

import java.util.concurrent.Future;

import static org.junit.Assert.*;

/**
 * Created by lay on 2017/12/4.
 */
public class CommandHelloWorldTest {

    @Test
    public void helloWorldTest() throws Exception {

        String s = new CommandHelloWorld("Bob").execute();

        System.out.println(s);

        Future<String> s1 = new CommandHelloWorld("Bob").queue();
        System.out.println(s1.get());


        Observable<String> s2 = new CommandHelloWorld("Bob").observe();
        System.out.println(s2);
    }
}