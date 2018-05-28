package com.lay.study.jvm;

/**
 * VM Args -Xss128k
 * @author yalei.chen
 * @date 2018/2/26
 * @since JDK 1.8
 */
public class JavaVMStackSOF {

    private int stackLength=1;
    public void stackLeak()  {
        stackLength++;
        stackLeak();
    }

    public static void main( String[]args )throws Throwable{

        JavaVMStackSOF oom=new JavaVMStackSOF();
        try{
            oom.stackLeak();
        }catch (Throwable e) {
            System.out.println( "stack length "+oom.stackLength );
            throw e;
        }
    }
}
