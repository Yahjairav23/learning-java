public class App {
    public static void main(String[] args) {
        // System.out.println("Hello World");
        Factory myFactory = new Factory();
        
        myFactory.design();
        myFactory.build();

        Car car1 = new Car();
        car1.design();
        car1.build();
        car1.brand
    }
}

/*
ACCESS MODIFIERS
    public
        -can be accessed from any class, anywhere
    protected
        -only subclasses can access the protected methods
    default(when no access modifier is provided)
        -can only be called from the same class or package
    private
        -can only be called within the same class
*/