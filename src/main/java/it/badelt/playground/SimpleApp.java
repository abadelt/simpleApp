package it.badelt.playground;

public class SimpleApp {

    public static void main(String [] args) {
        System.out.println("Simple App was started via main(String [] args)");
        SimpleApp app = new SimpleApp("main");
        System.out.println(app.sayHello());

        System.out.println("Sleeping for an hour...");
        try {
            Thread.sleep(1*60*60*1000);
        } catch (InterruptedException e) {
            System.out.println("Sleep was interrupted.");
            e.printStackTrace();
        }
        System.out.println("Done - exiting process.");
    }

    private String greeting;

    public SimpleApp(String greeting) {
        this.greeting = greeting;
    }

    public String sayHello() {
        return "Hello " + greeting + "!";
    }

}
