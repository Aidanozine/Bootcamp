package Book3.chapter7;
import java.awt.event.*;
import javax.swing.*;

public class TickTockAnon {
    private String tickMessage = "Tick...";
    private String tockMessage = "Tock...";

    public static void main(String[] args) {
        TickTockAnon tanon = new TickTockAnon();
        tanon.go();
    }

    private void go(){
        Timer t = new Timer(1000, new ActionListener(){
            private boolean tick = true;

            @Override
            public void actionPerformed(ActionEvent event){
                if (tick){
                    System.out.println(tickMessage);
                } else {
                    System.out.println(tockMessage);
                }
                tick = !tick;
            }
        });
        t.start();
        JOptionPane.showMessageDialog(null, "Click OK to end programme");
        System.exit(0);
    }
}
