/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter7;

/**
 *
 * @author desmo
 */
public class ClassA {

    private int x = 10;

    class ClassB {

        private int x = 20;

        class ClassC {

            private int x = 30;

            public void allTheX() {
                System.out.println(x); // 30
                System.out.println(this.x); // 30
                System.out.println(ClassB.this.x); // 20
                System.out.println(ClassA.this.x); // 10
            }
        }
    }

    public static void main(String[] args) {
        ClassA a = new ClassA();
        ClassA.ClassB b = a.new ClassB();
        ClassA.ClassB.ClassC c = b.new ClassC();
        c.allTheX();
    }
}
