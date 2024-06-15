public class Amstrong {
    int x = 10;
    public static void main(String[] args) {
        Amstrong myObj = new Amstrong();
        myObj.x = 25; // will generate an error: cannot assign a value to a final variable
        System.out.println(myObj.x);
    }
}