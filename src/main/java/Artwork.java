public class Artwork {

    private String title;
    private Artist artist;
    private int price;
    private int nft;

    //Constructor
    public Artwork(String title, Artist artist){
          this.title = title;
          this.artist = artist;
          this.price = 0;
          this.nft = 0;
    }

    //Getters&Setters

    public String getTitle(){
      return this.title;
    }
    public void setTitle(String title){
       this.title=title;
    }

    public Artist getArtist(){
        return this.artist;
    }
    public void setArtist(Artist artist){
        this.artist = artist;
    }

    public int getPrice(){
      return this.price;
    }
    public void setPrice(int price){
        this.price = price;
    }

    public int getNft(){
       return this.nft;
    }
    public void setNft(int nft){
       this.nft = nft;
    }


}
