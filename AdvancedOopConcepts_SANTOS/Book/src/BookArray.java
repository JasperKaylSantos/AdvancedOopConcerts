public class BookArray {

    public static void main(String[] args) {
        
        Book bookArray[]={new Fiction("Star trek"),
                            new Fiction("Ender's Game"),
                            new Fiction("86"),
                            new Fiction("Gray"),
                            new Fiction("North"),
                            new NonFiction("Star Wars"),
                            new NonFiction("Transformers"),
                            new NonFiction("Consume"),
                            new NonFiction("La Casa De Papel"),
                            new NonFiction("The Eight")};

        for(int i=0;i<bookArray.length;i++)
        {
            System.out.println(bookArray[i].toString());
        }
    }

}