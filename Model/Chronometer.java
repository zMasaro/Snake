/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;


import View.FrmSnake;
import java.util.concurrent.TimeUnit;
/**
 *
 * @author Johel M
 */
public class Chronometer extends Thread {

    private FrmSnake frmSnake;
    private int hours = 0;
    private int minutes = 0;
    private int seconds = 0;
    private int milliseconds;
    
    @Override
    public void run() {
        while (hours < 5) {
            try {
                TimeUnit.MILLISECONDS.sleep(9);
                updateTime();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public Chronometer(FrmSnake frmSnake) {
        this.frmSnake = frmSnake;
    }

    public void updateTime() {

        milliseconds++;
        if (milliseconds == 100) {
            seconds++;
            milliseconds = 0;
        }
        if (seconds == 60) {
            minutes++;
            seconds = 0;
        }
        if (minutes == 60) {
            hours++;
            minutes = 0;
        }
        frmSnake.getLbTime().setText(showTimer());

    }

    public String showTimer() {
        return "h:" + hours + " m:" + minutes + " s:" + seconds;
    }

}
