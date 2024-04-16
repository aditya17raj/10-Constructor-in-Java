class demo
  {
    demo()  //defauilt constructor
    {
      System.out.println("This is Deafoult Constructor");
    }
    demo(int a , int b)  //parameterized constructor
    {
      System.out.println("Addition in Parameterized constructor = " 
      + (a+b));
    }
  }

public class Main {
  public static void main(String[] args) {
    demo d = new demo();
    demo d1 = new demo(10,20);
  }
}

// ..................A B O U T   C O N S T R U C T O R..................

// A constructor is a special method that is automatically invoked when an object of a class is created.

// The constructor is used to initialize the object's state (i.e. assign values to the object's member variables).

// The constructor is not a method with a return type and it does not have a return statement.

// A constructor can not be static and it can not be final.

// A constructor can not be inherit.