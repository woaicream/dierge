package com;

import learnmyself.UserSerivce;
import learnmyself.impl.UserServiceimpl;
import org.junit.Test;

public class Testfactory {
    @Test
    public void tset01(){
        UserServiceimpl userService =new UserServiceimpl();
        userService.adduser();



    }

    public void test02(){
        UserSerivce userSerivce =new UserServiceimpl();
        userSerivce.adduser();

    }
    @Test
    public void test03() throws Exception {
        UserSerivce userSerivce =(UserSerivce)Class.forName("learnmyself.impl.UserServiceimpl").newInstance();
        userSerivce.adduser();

    }
}
