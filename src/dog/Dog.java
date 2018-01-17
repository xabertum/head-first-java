/**
 * 
 */
package dog;

/**
 * @author xabertum
 *
 */
public class Dog {

    String dogName;
     
    
    /**
     * @param args
     */
    public static void main(String[] args) {
	
	Dog dog1 =  new Dog();
	dog1.dogName = "Bart";
	
	//now make a Dog Array
	
	Dog[] myDogs = new Dog[3];
	
	// and put some dogs on it
	myDogs[0] = dog1;
	myDogs[1] = new Dog();
	myDogs[2] = new Dog();
	
	// now access the Digs using the Array
	// references
	
	myDogs[1].dogName = "Fred";
	myDogs[2].dogName = "Marge";
	
	
	
	
	

    }

}
