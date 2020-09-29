class Methods{

    String animal;
    int value;

    // CREATING METHODS
    // we will start with the basic bare minimums to create a method.
    // void = return type
    // method name
    // parenthesis that will carry any parameters
    // curly braces

    void run(){
        System.out.println("running");
        System.out.println("My " + animal +" is " + value + " years old.");
    }

}

public class Objects {
    // 'public' = access modifier
    // there can only be one public class and one public static void main
    // other classes that you create cannot have the public access modifier 
    // you can use other classes to hold your instance variales and methods and use the public class to call them
    public static void main(String[] args) {
        // to initiate a Methods instance we create a Methods variable with a new Methods
        Methods obj = new Methods();
        // next we set the variable
        obj.animal = "giraffe";
        obj.value = 17;
        // we invoke the method on our obj
        obj.run();
    }
}


/*
RETURN TYPES

void = does not return anything
int or any of the other objec variables.

The methods can take in arguments just as they do in Javascript.
*/