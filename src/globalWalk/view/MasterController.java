package globalWalk.view;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Rectangle;

public class MasterController {

    // Profil siden bruker denne som Controller, siden den har ingen spesielle funksjoner

    public void clickProfile(MouseEvent mouseEvent) {
        System.out.println("Går til profil siden");
    }

    public void clickList(MouseEvent mouseEvent) {
        System.out.println("Går til list siden");
    }

    public void clickCompetition(MouseEvent mouseEvent) {
        System.out.println("Går til konkurranse siden");
    }

    public void clickHome(MouseEvent mouseEvent) {
        System.out.println("Går til hjemmesiden");
    }

    public void clickStep(MouseEvent mouseEvent) {
        System.out.println("Går til pedometer siden");
    }

    public void clickSettings(MouseEvent mouseEvent) {
        System.out.println("Går til innstilinger");
    }
}
