package Book2.chapter1;

//class Greeter {
//    public Greeter() {}
//    public void sayHello()
//    {
//        System.out.println("Hello, World!");
//    }
//}

//import javax.swing.JOptionPane;
//class Greeter {
//    public Greeter() {}
//    public void sayHello()
//    {
//        JOptionPane.showMessageDialog(null,
//                "Hello, World!", "Greeter",
//                JOptionPane.INFORMATION_MESSAGE);
//    }
//}

class Greeter {
    public Greeter() {}
    public void sayHello()
    {
        javax.swing.JOptionPane.showMessageDialog(null,
                "Hello, World!", "Greeter",
                javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }
}