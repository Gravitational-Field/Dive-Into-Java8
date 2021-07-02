package com.lzj.test;

import org.junit.Test;

/**
 * @ClassName TestMethods
 * @Description: TODO
 * @Author Keen
 * @DATE 2021/1/9 11:46
 * @Version 1.0
 **/
public class TestMethods {

    public final int value = 10;


    @Test
    public void get( ) {
        int value = 11;
        System.out.println(this.value);
    }

}
