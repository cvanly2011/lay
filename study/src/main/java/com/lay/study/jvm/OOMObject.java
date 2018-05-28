package com.lay.study.jvm;

/**
 * 内存占位符，一个OOMObject对象大约占64kb
 * @author yalei.chen
 * @date 2018/2/26
 * @since JDK 1.8
 */
public class OOMObject {

    public byte[]placeholder=new byte[64*1024];
}
