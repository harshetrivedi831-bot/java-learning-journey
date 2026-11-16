package codeSample;


class Parent {
    private void display() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    public void display() {
        System.out.println("Child");
    }
}

public class Driver {
    public static void main(String[] args) {
        Parent p = new Child();
        /*
         * here at line no 22 accessing private member which is not 
         * allowed and throw compile time exception { observe code }
         */
         p.display();
       
    }
}
