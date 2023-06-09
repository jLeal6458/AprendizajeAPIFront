package com.jleal6458.aprendizajeAPIFront;

import com.jleal6458.aprendizajeAPIFront.controllers.PsychologistController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/jleal6458/aprendizajeAPIFront/fxml/PsychologistController.fxml"));
        Parent root = loader.load();
        PsychologistController psychologistController = loader.getController();

        stage.setTitle("Aplicación Título");
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
