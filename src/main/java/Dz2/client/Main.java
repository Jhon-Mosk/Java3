package Dz2.client;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/*
В базе есть:
логин: nick1 пароль: pass1
логин: nick2 пароль: pass2
логин: nick3 пароль: pass3
для смены ника нужно набрать /setnickname новый_ник
 */

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/client.fxml"));
        primaryStage.setTitle("2k18SummerChat");
        primaryStage.setScene(new Scene(root, 400, 400));
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
