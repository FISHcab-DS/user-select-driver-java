package com.example.appgui;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.Timer;
import java.util.TimerTask;

public class MyTimerTask extends TimerTask {
    public static int interval1;
    public static int interval2;
    @FXML
    public static Label min_label;
    @FXML
    public static Label status_label;
    @FXML
    public static Button arrivedBtn;

    Timer timer = new Timer();

    public MyTimerTask(int interval1, int interval2, Label min_label, Label status_label, Button arrivedBtn) {
        MyTimerTask.interval1 = interval1;
        MyTimerTask.interval2 = interval2 + 1;
        MyTimerTask.min_label = min_label;
        MyTimerTask.status_label = status_label;
        MyTimerTask.arrivedBtn = arrivedBtn;
    }

    @Override
    public void run() {
        if(interval1+interval2 > 0){
            if(interval1 > 0){
                Platform.runLater(() -> min_label.setText(String.valueOf(interval1)));
                System.out.println(interval1);
                interval1--;
            }else{
                Platform.runLater(() -> status_label.setText("Your driver has arrived"));
                Platform.runLater(() -> min_label.setText(String.valueOf(interval2)));
                System.out.println(interval2);
                interval2--;
            }
        }else{
            timer.cancel();
            Platform.runLater(() -> status_label.setText("You have reached the destination"));
            arrivedBtn.setDisable(false);
        }
    }
}
