package cs112.lab08;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

//import javafx.scene.image;



import java.io.IOException;

public class HelloApplication extends Application implements EventHandler<ActionEvent> {

    //CONSTANTS
    private TextField titleLabelTextField;
    private Label messageLabel;
    private Button drawCardButton;
  //  private image cardImageViewField; //??

    //array of LoteriaCards to use for game:
    private static final LoteriaCard[] LOTERIA_CARDS = {
            new LoteriaCard("Las matematicas", "1.png", 1),
            new LoteriaCard("Las ciencias", "2.png", 2),
            new LoteriaCard("La Tecnología", "8.png", 8),
            new LoteriaCard("La ingeniería", "9.png", 9),
    };


    @Override
    public void start(Stage stage) throws IOException {
        LoteriaCard defaultCardImage = new LoteriaCard();
        //removed FXML code, fill this in with components, scene, stage, etc.
        //set up components
        Label titleLabel = new Label("Welcome to EChALE STEM Loteria!");
        ImageView cardImageView = new ImageView(defaultCardImage.getImage());
        Label messageLabel = new Label("Click the button below to randomly draw a card. " +
                "The progress bar will indicate how far we're into the game.");
        Button drawCardButton = new Button("Draw Random Card");
        drawCardButton.setOnAction(this);

        //customize components
       // titleLabel.setAlignment((Pos.CENTER));
        titleLabel.setFont(new Font(15));

        cardImageView.setFitHeight(300);
        cardImageView.setPreserveRatio(true);



        //Components
        VBox layout = new VBox();
        layout.getChildren().addAll(titleLabel, cardImageView, messageLabel, drawCardButton);
        layout.setAlignment((Pos.CENTER));
        layout.setSpacing(5);

        /*
        layout.getChildren().add(titleLabel);
        layout.getChildren().add(cardImageView);
        layout.getChildren().add(messageLabel);
        layout.getChildren().add(drawCardButton);
        */


        //setup scene and show
        Scene scene = new Scene(layout, 350, 500);
        stage.setScene(scene);
        stage.setTitle("EChALE STEM Loteria!"); //setting title of main window
        stage.show();


    }
    /*
    //anonymous class
    drawCardButton.setOnAction(new EventHandler<ActionEvent>() {
        @Override public void handle(ActionEvent e) {
            messageLabel.setText(titleLabelTextField.getText());
        }
    }); */

    @Override
    public  void handle(ActionEvent actionEvent){
        System.out.println("Button clicked");
        //changes card image to random

        //message label changes with new card

    }
    public static void main(String[] args) {
        launch();
    }
}