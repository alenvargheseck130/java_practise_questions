/*
b. Write a program that displays the following to standard output with a 1/2 a second delay
between each line.
   J    A   V     V   A
   J   A A   V   V   A A
J  J  AAAAA   V V   AAAAA
 JJ  A     A   V   A     A
 */


public class practice {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("   J    A   V     V   A");
        Thread.sleep(500);
        System.out.println("   J   A A   V   V   A  A");
        Thread.sleep(500);
        System.out.println("J  J  AAAAAA  V V   AAAAAA");
        Thread.sleep(500);
        System.out.println(" JJ  A      A  V   A      A");
    }
}
