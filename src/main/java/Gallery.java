import java.util.ArrayList;

public class Gallery {

   private String name;
   private int till;
   private ArrayList<Artwork> stock;

   //constructor

   public Gallery(String name){
       this.name = name;
       this.till = 0;
       this.stock = new ArrayList<>();

   }

   //getters and setters
   public String getName(){
       return this.name;
   }

    public void setName(String name){
       this.name = name;}

   public int getTill(){
       return this.till;
   }

    public void setTill(int till){
       this.till = till;
    }

   public ArrayList<Artwork> getStock(){ return this.stock;}

    public void setStock(ArrayList<Artwork> stock){
       this.stock = stock;
    }

    // Methods

    public int countTill(){return this.till;}

    public void addToTill(Artwork artwork) {this.till += artwork.getPrice();}






}
