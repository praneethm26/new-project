public class Whileloop {
    public static void main(String[] args) {
    int factorial = 1, number = 5, tempNum = 0;
    tempNum = number;
    while (tempNum != 0) {
    factorial *= tempNum;
    --tempNum;
    System.out.println(factorial);
    }
    }

}
