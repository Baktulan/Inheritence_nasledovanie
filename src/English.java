public class English extends Course {
    private int countOfTimes;
    private String phrasalVerbs;

    public English(int price, int countOfParticipant) {
        super(price, countOfParticipant);
    }

    public English(int price, int countOfParticipant, int countOfTimes, String phrasalVerbs) {
        super(price, countOfParticipant);
        this.countOfTimes = countOfTimes;
        this.phrasalVerbs = phrasalVerbs;
    }

    public int getCountOfTimes() {
        return countOfTimes;
    }

    public void setCountOfTimes(int countOfTimes) {
        this.countOfTimes = countOfTimes;
    }

    public String getPhrasalVerbs() {
        return phrasalVerbs;
    }

    public void setPhrasalVerbs(String phrasalVerbs) {
        this.phrasalVerbs = phrasalVerbs;
    }

    @Override
    public String toString() {
        return "English: " +
                "countOfTimes: " + countOfTimes +"\n"+
                "phrasalVerbs: " + phrasalVerbs + "\n"+ super.toString();
    }
}
