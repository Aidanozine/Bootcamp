/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter8;

/**
 *
 * @author desmo
 */
public class InstanceMethods {

    public static void main(String[] args) {
        System.out.println("Is str empty?");
        var str = "";
        StringChecker methodRef = str::isEmpty;
        System.out.println(methodRef.check());

        System.out.println("Is str2 zoo?");
        String str2 = "zoo";
        StringStart methodRef2 = str2::startsWith;
        System.out.println(methodRef2.check("z"));

        System.out.println("Is str2 empty?");
        StringParamChecker mRef = String::isEmpty;
        StringParamChecker lambda = (s) -> s.isEmpty();
        System.out.println(mRef.paramCheck("zoo"));
        
        System.out.println("Starts with z?");
        StringParamChecker2 mr = String::startsWith;
        StringParamChecker2 l = (st,p) -> st.startsWith(p);
        System.out.println(mr.beginningCheck("zoo","z"));
    }
}

@FunctionalInterface
interface StringChecker {

    boolean check();
}

@FunctionalInterface
interface StringStart {

    boolean check(String prefix);
}

@FunctionalInterface
interface StringParamChecker {

    boolean paramCheck(String text);
}

@FunctionalInterface
interface StringParamChecker2 {

    boolean beginningCheck(String text, String prefix);
}
