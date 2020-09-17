/*
 *Course: CS1011-051
 *Fall 2020-2021
 *File header contains class GUI
 *Name: Parker
 *Created 9/16/2020
 */

package jfx;
/*
 *  Course CS1011-051
 *  Fall 2020-2021
 *  GUI purpose:
 *  @author Parker
 *  @version created on 9/16/2020 at 6:18 PM
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class GUI extends Application {
    public static void main(String[] args) {
    launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        //Loads FXML file as a pane
        Pane root = FXMLLoader.load(getClass().getResource("Game.fxml"));
        //Creates the scene
        Scene scene = new Scene(root);
        //"Sets the stage" Prepares it to be graphically displayed to the user
        stage.setScene(scene);
        //Sets stage title
        stage.setTitle("Example Game");
        //Specifies whether the user is allowed to resize the window.
        stage.setResizable(false);
        //Tells JavaFX to show the main window
        stage.show();
    }
}