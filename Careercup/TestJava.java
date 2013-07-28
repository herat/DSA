/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Careercup;
interface Earth {
    
}
interface Moon {
    
}
interface Animal extends Earth,Moon {
    int m = 5;
    public void move();
 }
class Dog implements Animal {
    static int m = 60;
    public void move(){ 
        //super.move();
        System.out.println("Dogs can walk and run");
    }
    public void move1() {
        
    }
 }
/**
 *
 * @author Herat
 */
public class TestJava {
    static {
        System.out.println("Static block");
    }
    TestJava() {
        System.out.println("Constructor");
    }
    public static void main(String[] args) {
        int[] a = {1,2,3};
        TestJava o = new TestJava();
        Dog ob = new Dog();
        ob.move();
        System.out.println(Dog.m+" "+Animal.m);
    }
}
