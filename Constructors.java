class Program{

    int value;
    // CREATING A CONSTRUCTOR
    // public is an access modifier
    // constructor cannot have a writtn type
    // it must match the class name and be uppercased

    public Program(){
        // to call a constructor within a constructor we have to just call this with parenthesis and it must be the first line of the constructor
        this(7);
        // cannot call two constructors within one constructor because it has to be on the first line.
        
        System.out.println("first constrictor");
        value = 12;
    }

    // constructors can also take in parameters
    public Program(int value){
        // use this.value so that java know you are setting the value for Program to the param value
        this.value = value;
    }
}
public class Constructors {
    public static void main(String[] args) {
        Program myProgram = new Program(); //this line will make the constructor run. 
        Program intProgram = new Program(6); // because this new program takes in a variable, it will run the second Program constructor. 
    }
}