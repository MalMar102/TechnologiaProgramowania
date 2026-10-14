package pl.malek;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) {

        Rental myRental = new Rental();
        myRental.addCar(new Car("DW 12345", "Toyota Corolla"));
        myRental.addCar(new Car("KR 98765", "Ford Focus"));

        VBox root = new VBox(10);
        root.setPadding(new Insets(20));

        Label title = new Label("=== WYPOŻYCZALNIA SAMOCHODÓW ===");
        title.setStyle("-fx-font-weight: bold; -fx-font-size: 14px;");

        ListView<String> carListView = new ListView<>();
        for (Car c : myRental.getCars()) {
            carListView.getItems().add(c.getInfo());
        }

        HBox form = new HBox(10);
        
        TextField regInput = new TextField();
        regInput.setPromptText("Nr rejestracyjny");
        
        TextField brandInput = new TextField();
        brandInput.setPromptText("Marka i model");
        
        Button addButton = new Button("Dodaj auto");

        addButton.setOnAction(event -> {
            String reg = regInput.getText();
            String brand = brandInput.getText();
            
            if (!reg.isEmpty() && !brand.isEmpty()) {
                Car newCar = new Car(reg, brand);
                myRental.addCar(newCar);
                carListView.getItems().add(newCar.getInfo());
                
                regInput.clear();
                brandInput.clear();
            }
        });

        form.getChildren().addAll(regInput, brandInput, addButton);
        root.getChildren().addAll(title, carListView, form);

        Scene scene = new Scene(root, 450, 350);
        stage.setTitle("Wypożyczalnia Samochodów");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}