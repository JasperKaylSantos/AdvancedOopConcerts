public class Health extends Insurance {
    public Health() {
        super("Health");
    }

    public void setCost() {
        super.cost = 200;// setcost
    }

    public void display() {
       
       System.out.println(super.getType() + " insurance with monthlyfee of $" + super.getCost());
    }
}