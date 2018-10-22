package net.ferhatkurt;

import javafx.application.*;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class AnaClass extends Application{
	
	private double x=0,y=0;
	
	@Override
	public void start(Stage anaSahne) throws Exception {
		
		Parent kok = FXMLLoader.load(this.getClass().getResource("Tasarim.fxml"));
		
		kok.setOnMousePressed(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent mouse) {
				x=mouse.getSceneX();
				y=mouse.getSceneY();
			}
			
		});
		kok.setOnMouseDragged(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				
				anaSahne.setX(event.getScreenX()-x);
				anaSahne.setY(event.getScreenY()-y);
							
			}
			
		});
		
	
		anaSahne.getIcons().add(new Image(this.getClass().getResourceAsStream("Logo.png")));
		anaSahne.setTitle("Game Bot v1.2");
		anaSahne.setScene(new Scene(kok));		
		anaSahne.initStyle(StageStyle.UNDECORATED);
		anaSahne.show();
		
		
	}
	
	public static void main(String [] args) {
		try {
		launch(args);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
