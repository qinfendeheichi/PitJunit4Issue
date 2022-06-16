package Hang;

import junit.framework.TestCase;

public class TestClass1 extends TestCase {
    public TestClass1(){
        new CodeClass().doMath();
        //just make sure that it covers the mutation
        System.err.println("execute Constructor TestClass1");
    }

    public void test1(){
        System.err.println("execute test1 in TestClass1");
    }

    public void test2(){
        System.err.println("execute test2 in TestClass1");
    }

}
