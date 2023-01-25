import java.util.ArrayList;

public class Customer {

    private String name;
    private int wallet;

    private ArrayList<Artwork> artCollection;

    // Constructor

    public Customer(String name, int wallet){
        this.name = name;
        this.wallet = wallet;
        this.artCollection = new ArrayList<Artwork>();

    }

    // Getters & Setters

    public String getName(){return this.name;}
    public void setName(String name){ this.name = name;}

    public int getWallet(){return this.wallet;}
    public void setWallet(int wallet){this.wallet = wallet;}

    // Methods

    public void purchaseArtWork(Artwork artwork){
        artCollection.add(artwork);
    }

    public int countWallet(){return this.wallet;}

    public void  removeMoneyFromWallet(Artwork artwork){
              this.wallet -= artwork.getPrice();              
    }






}
