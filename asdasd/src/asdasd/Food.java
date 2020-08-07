package asdasd;
interface Food {
    public void printFlavor();
}
class Pepper implements Food {
    public void printFlavor() { System.out.println("spicy"); }
}
    class Lunch {
    public static void main(String[] args) {
        Food pepper = new Pepper();
        pepper.printFlavor();
    }
}