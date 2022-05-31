package com.example.appgui;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class ReviewController {
//    @FXML
//    private final Stage travelBeginsStage = new Stage();
//    @FXML
//    public static Button rate1 = new Button();
//    @FXML
//    public Button rate2 = new Button();
//    @FXML
//    public Button rate3 = new Button();
//    @FXML
//    public Button rate4 = new Button();
//    @FXML
//    public Button rate5 = new Button();

    public void rate(ActionEvent event){
        int rate;
        String selectedBtn = ((Button)event.getSource()).getId();
        switch (selectedBtn){
            case "rate1":
                rate = 1;
                break;
            case "rate2":
                rate = 2;
                break;
            case "rate3":
                rate = 3;
                break;
            case "rate4":
                rate = 4;
                break;
            case "rate5":
                rate = 5;
                break;
            default:
                rate = -1;
                break;
        }
        System.out.println("user rating: "+rate);
//        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
//        window.close();
    }


}