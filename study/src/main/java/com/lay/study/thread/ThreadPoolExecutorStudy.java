package com.lay.study.thread;

/**
 * @Author yalei.chen
 * @Date 2017/9/26
 * @Since JDK 1.8
 */
public class ThreadPoolExecutorStudy {


    private static final int COUNT_BITS = Integer.SIZE - 3;
    private static final int CAPACITY   = (1 << COUNT_BITS) - 1;

    // runState is stored in the high-order bits
    private static final int RUNNING    = -1 << COUNT_BITS;
    private static final int SHUTDOWN   =  0 << COUNT_BITS;
    private static final int STOP       =  1 << COUNT_BITS;
    private static final int TIDYING    =  2 << COUNT_BITS;
    private static final int TERMINATED =  3 << COUNT_BITS;

    public static void main(String[] args) {


        print();


    }

    private static void print(){

        System.out.println("COUNT_BITS:"+COUNT_BITS);
        System.out.println("CAPACITY:"+CAPACITY);
        System.out.println("RUNNING:"+RUNNING);
        System.out.println("SHUTDOWN:"+SHUTDOWN);
        System.out.println("STOP:"+STOP);
        System.out.println("TIDYING:"+TIDYING);
        System.out.println("TERMINATED:"+TERMINATED);

        System.out.println("ctlof:"+ctlOf(1,2));

    }


    private static int ctlOf(int rs, int wc) { return rs | wc; }

}
