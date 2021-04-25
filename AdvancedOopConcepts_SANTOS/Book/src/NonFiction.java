public class NonFiction extends Book {

    public NonFiction(String title) {
        super(title);
        setPrice();
    }

   
    @Override
    public void setPrice() {
        price=75.99;

    }
    
    @Override
    public String toString() {
        System.out.println("******Non-Fiction Book******");
        return "Title :"+getTitle()+"\nPrice :$"+getPrice()+"\n";
    }

}
