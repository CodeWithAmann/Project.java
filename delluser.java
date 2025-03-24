public class delluser {
    public static void main(String[] args) {
        String s1 = "Hello";   // Stored in String pool
        String s2 = "Hello";   // Reuses the same object from the pool
        String s3 = new String("Hello"); // Creates a new object in the heap
        
        System.out.println(s1 == s2); // true (Same object from the pool)
        System.out.println(s1 == s3); // false (s3 is a different object in heap)


        System.out.println("Hello");
        
    }
}


TTT
HHH
OOO
EEE
WWW