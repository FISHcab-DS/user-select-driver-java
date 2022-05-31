package com.example.appgui;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class SelectDriverListController implements Initializable {
    @FXML
    private final Stage travelBeginsStage = new Stage();
    @FXML
    public Label name_label = new Label();
    @FXML
    public Label pul_label = new Label();
    @FXML
    public Label dl_label = new Label();
    @FXML
    public Label eat_label = new Label();
    @FXML
    public Label capacity_label = new Label();
    @FXML
    public Label price_label = new Label();
    @FXML
    public TableView selectDriverTable = new TableView();
    @FXML
    public TableColumn<Driver, String> driver_name_col = new TableColumn<>();
    @FXML
    public TableColumn<Driver, Integer> capacity_col = new TableColumn<>();
    @FXML
    public TableColumn<Driver, String> eat_col = new TableColumn<>();
    @FXML
    public TableColumn<Driver, Double> rating_col = new TableColumn<>();
    private ObservableList<Driver> driver_list = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Request r = new Request();
        name_label.setText(r.name);
        pul_label.setText(r.pul);
        dl_label.setText(r.dl);
        eat_label.setText(r.eat);
        capacity_label.setText(String.valueOf(r.capacity));
        price_label.setText("RM "+r.price);

        driver_name_col.setCellValueFactory(new PropertyValueFactory<>("name"));
        capacity_col.setCellValueFactory(new PropertyValueFactory<>("capacity"));
        eat_col.setCellValueFactory(new PropertyValueFactory<>("eat"));
        rating_col.setCellValueFactory(new PropertyValueFactory<>("rating"));

        driver_list.add(new Driver("Tan Jinren", 4, "15:30", 4.9));
        driver_list.add(new Driver("Alvin Low", 4, "15:24", 4.5));
        driver_list.add(new Driver("Alice", 6, "15:27", 4.7));
        driver_list.add(new Driver("Nobita", 6, "15:34", 5.0));
        driver_list.add(new Driver("Abu bin Ali", 4, "15:33", 4.7));

        selectDriverTable.setItems(driver_list);
    }

    @FXML
    protected void confirm(ActionEvent event) throws Exception {
        System.out.println("confirm");
        Driver selectedDriver = (Driver) selectDriverTable.getSelectionModel().getSelectedItem();
        SelectedDriver driver = new SelectedDriver(selectedDriver.getName(), selectedDriver.getCapacity(),selectedDriver.getEat(),selectedDriver.getRating());
        TravelBegins travelBeginsPage = new TravelBegins();
        travelBeginsPage.start(travelBeginsStage);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.close();
    }

    @FXML
    protected void cancel(ActionEvent event) throws Exception {
        System.out.println("cancel");
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.close();
    }

}