import com.arseniy.firstproject.Dog; 

/** 
 * My very first program
 */
class MyFirstProgram {

    public static void main(String args[]){

        // create a dog
        Dog dog = new Dog();
        // give it a name
        dog.setName("Arisha");

        System.out.println("\nI have a big dog.\n");
        // ask the dog to say hello
        dog.sayHello();
    }		
}
