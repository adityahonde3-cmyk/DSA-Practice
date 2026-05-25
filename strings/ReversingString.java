public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello";
        StringBuilder sb = new StringBuilder(str);
        
        // Reverse using built-in method
        String reversed = sb.reverse().toString();
        System.out.println(reversed); // Output: olleH
    }
}