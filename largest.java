public class largest {
    public static void main(String[] args) {
        int[] scores = { 1, 12, 5, 6, 6, 2, 0, 3, 5, 8 };

        int largest = scores[0];
        for (int score : scores) {
            if (score > largest) {
                largest = score;
            }
        }

        System.out.println("Largest Element in the Array: " + largest);
    }
}
