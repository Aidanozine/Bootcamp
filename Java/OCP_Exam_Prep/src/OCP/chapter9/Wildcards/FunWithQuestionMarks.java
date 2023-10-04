/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter9.Wildcards;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author desmo
 */
class A{}

class B extends A{}

class C extends B{}

public class FunWithQuestionMarks {
    public static void main(String[] args) {
        
        List<?> list = new ArrayList<A>(); //ANYTHING -- Think Super Mario Bros.
        
        List<? extends A> list1 = new ArrayList<A>(); //? extends: All my children; my childrens' children and me
        
        List<? extends A> list2 = new ArrayList<B>();
        
        List<? extends A> list3 = new ArrayList<C>();
        
        List<? super A> list4 = new ArrayList<A>(); //? super: All the way up the family tree
        
        List<? super A> list5 = new ArrayList<Object>();
        
        A a = new A();
        B b = new B();
        C c = new C();

        List<? super C> list6 = new ArrayList<Object>();
        // ? super C -->  C, B, A
        List<? super C> list7 = new ArrayList<A>();
        
        List<? super C> list8 = new ArrayList<B>();
        
        List<? super C> list9 = new ArrayList<C>();
    }
}
