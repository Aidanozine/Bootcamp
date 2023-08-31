package Book3.chapter7;

import java.awt.event.*;
import javax.swing.*;

public class TickTockInner {
    private String tickMessage = "Tick...";
    private String tockMessage = "Tock...";

    public static void main(String[] args) {
        TickTockInner ticking = new TickTockInner();
        ticking.go();
    }

    private void go(){
        Timer time = new Timer(1000, new Ticker());
        time.start();

        JOptionPane.showMessageDialog(null, "Click OK to exit programme");
        System.exit(0);
    }

    class Ticker implements ActionListener {
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
    }
}
