package wed.sis;

/**
 *
 * @author john
 */
public class WedSIS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person sally = new Person("Sally", 19);
        
        System.out.println(sally.getName());
        
        System.out.println(Person.getNumberOfPeople());
        
        Student joe = new Student(12, "Joe", 23);
        
        System.out.println(joe.getNumOfCreditsTaking());
        
        System.out.println(Person.getNumberOfPeople());
        
        System.out.println(joe);
    }
    
}
