package edu.cis232.images;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ImageController {

    @FXML
    private ImageView image;

    
	Image harambe = new Image(getClass().getResource("harambe.jpg").toString());
	//Alternatively, could use a URL instead of a local resource
	//Image harambe = new Image("http://pixel.nymag.com/imgs/daily/selectall/2016/07/27/27-harambe-gorilla-heaven.w710.h473.2x.jpg");
    
    @FXML
    public void initialize(){
    	image.setImage(harambe);
    }

}
