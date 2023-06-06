public class 1{
    public static void main(String[] args) {
        // Declare and initialize an array
        int[] numbers = { 5, 2, 7, 1, 9 };

        // Accessing elements in the array
        System.out.println("Element at index 0: " + numbers[0]); // Output: 5
        System.out.println("Element at index 2: " + numbers[2]); // Output: 7

        // Modifying elements in the array
        numbers[1] = 10;
        System.out.println("Updated element at index 1: " + numbers[1]); // Output: 10

        // Length of the array
        System.out.println("Length of the array: " + numbers.length); // Output: 5

        // Iterating through the array
        System.out.println("Elements in the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
