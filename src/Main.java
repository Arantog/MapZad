public class Main {
    public static void main(String[] args) {
        Storage storage = new Storage();
        storage.addToStorage("computer","ibm");
        storage.addToStorage("computer2","lenovo");
        storage.addToStorage("computer3","lenovo");
        storage.addToStorage("computer3","asus");
        //storage.findValues("lenovo");
        storage.printValues("computer3");

    }
}
