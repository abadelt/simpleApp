package it.badelt.playground;

public class SimpleApp {

    public static void main(String [] args) {
        System.out.println("Simple App was started via main(String [] args)");
        SimpleApp app = new SimpleApp("main");
        System.out.println(app.sayHello());
    }

    private String greeting;

    public SimpleApp(String greeting) {
        this.greeting = greeting;
    }

    public String sayHello() {
        return "Hello " + greeting + "!";
    }

}
