package Hang;

import junit.framework.TestCase;

public class TestClass2 extends TestCase {
    public TestClass2(){
        System.err.println("execute Constructor TestClass2");
        //with math mutation, expected value should be 1
        assertEquals(9, new CodeClass().doMath());
    }

    public void test1(){
        System.err.println("execute test1 in TestClass2");
    }

    public void test2(){
        System.err.println("execute test2 in TestClass2");
    }
}
