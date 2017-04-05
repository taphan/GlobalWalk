package globalWalk.view;
import javafx.beans.property.SimpleStringProperty;
 
public class Controller {
   private final SimpleStringProperty rank = new SimpleStringProperty("");
   private final SimpleStringProperty user = new SimpleStringProperty("");
   private final SimpleStringProperty steps = new SimpleStringProperty("");
   private final SimpleStringProperty medals = new SimpleStringProperty("");


   public Controller() {
        this("", "", "", "");
    }
 
    public Controller(String rank, String user, String steps, String medals) {
        setRank(rank);
        setUser(user);
        setSteps(steps);
        setMedals(medals);
    }
    
    public SimpleStringProperty getRank() {
    	return rank;
    }
    
    public void setRank(String num) {
        rank.set(num);
    }

    public SimpleStringProperty getUser() {
    	return user;
    }
    
    public void setUser(String name) {
        user.set(name);
    }

    public SimpleStringProperty getSteps() {
    	return steps;
    }
    
    public void setSteps(String num) {
        steps.set(num);
    }

    public SimpleStringProperty getMedals() {
    	return medals;
    }
    
    public void setMedals(String num) {
        medals.set(num);
    }

       //.
}
