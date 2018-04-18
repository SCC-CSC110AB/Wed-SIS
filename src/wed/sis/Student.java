package wed.sis;

/**
 *
 * @author john
 */
public class Student extends Person {
    private int numOfCreditsTaking;

    public Student(int numOfCreditsTaking, String name, int age) {
        super(name, age);
        this.numOfCreditsTaking = numOfCreditsTaking;
    }

    public int getNumOfCreditsTaking() {
        return numOfCreditsTaking;
    }

    public void setNumOfCreditsTaking(int numOfCreditsTaking) {
        this.numOfCreditsTaking = numOfCreditsTaking;
    }

    @Override
    public String toString() {
        return super.toString()
                + " and is taking "
                + numOfCreditsTaking
                + " this semester";
    }
    
    
}
