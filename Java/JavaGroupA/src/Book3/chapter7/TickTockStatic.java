package Book3.chapter7;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TickTockStatic {
    private static String tickMessage = "Tick...";
    private static String tockMessage = "Tock...";

    public static void main(String[] args) {
        TickTockStatic ticking = new TickTockStatic();
        ticking.go();
    }

    private void go(){
        Timer time = new Timer(1000, new TickTockStatic.Ticker());
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
