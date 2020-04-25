package com.edu;

/**
 * @author wangjie
 * @date 2020/4/23 - 11:44
 */

public class hello implements say {

    @Override
    public void say() {
        System.out.println("this is a implements");
    }

    public static void main(String[] args) {
        System.out.println("hello world");

        hello h = new hello();
        h.say();


    }


}
