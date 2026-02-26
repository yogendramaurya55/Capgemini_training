package func_classes;

public class Game {
	
	String gameName;
    String authorName;
    float price;
    
    Game(String gameName , String authorName ,float  price){
    	this.authorName = authorName;
    	this.price = price;
    	this.gameName = gameName;
    	
    }
    
    @Override
    public String toString() {
    	return gameName + " " + authorName + " " +  price;
    }

}

