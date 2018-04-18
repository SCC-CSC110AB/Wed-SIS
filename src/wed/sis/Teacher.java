package wed.sis;

/**
 *
 * @author john
 */
public class Teacher extends Person {
    private int numOfCreditsTeaching;

    public Teacher(int numOfCreditsTeaching, String name, int age) {
        super(name, age);
        this.numOfCreditsTeaching = numOfCreditsTeaching;
    }

    public int getNumOfCreditsTeaching() {
        return numOfCreditsTeaching;
    }

    public void setNumOfCreditsTeaching(int numOfCreditsTeaching) {
        this.numOfCreditsTeaching = numOfCreditsTeaching;
    }
    
}
