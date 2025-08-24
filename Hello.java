public class Hello {
    public static void main(String[] args) {
        // Create an object of Hello (constructor initializes A[10])
        Array h = new Array();

        // Provide an array
        int[] values = {1, 2, 3, 2, 2, 5, 6, 2, 8, 9};

        // Set the array in Hello
        h.setArrey(values);

        // Count how many times '2' appears
        int result = h.occur(2);

        // Print the result
        System.out.println("Number of times 2 occurs: " + result);
         // Print the result
        System.out.println("Number of times 2 occurs: " + result);
    }
}







