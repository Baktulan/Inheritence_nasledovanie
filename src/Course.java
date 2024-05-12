public class Course {
    private int price;
    private int countOfParticipant;


    public Course(int price, int countOfParticipant){
        this.price = price;
        this.countOfParticipant = countOfParticipant;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public int getPrice(){
        return price;
    }
    public void setCountOfParticipant(int countOfParticipant){
        this.countOfParticipant=countOfParticipant;
    }
    public int getCountOfParticipant(){
        return countOfParticipant;
    }

    public void getInfo(){
        System.out.println("Price: "+price+"\n"+
                "Participants: "+ countOfParticipant+"\n");
    }

    @Override
    public String toString() {
        return "Course: " +
                "price: " + price +
                ", countOfParticipant: " + countOfParticipant;
    }
}



