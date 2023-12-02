package methodsOverridng;

 class SuperClassss {

    public void method() {
        System.out.println("SuperClass.method()");
    }
}

 class SubClasss extends SuperClassss {

    @Override
    public void method() {
        System.out.println("SubClass.method()");
        super.method();
    }
}

public class Main {

    public static void main(String[] args) {
    	SubClasss subClass1 = new SubClasss();
    	subClass1.method(); // This will print "SuperClass.method()"
    }
}