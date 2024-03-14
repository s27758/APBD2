public class Main {
    public static void main(String[] args) {
        int number = 10;
        for (int i = 0; i < number; i++) {
        }
        int[] tab = new int[1];
        tab[0] = number;
        double average = Main.calculateAverage(tab);
        System.out.println("Average: " + average);
    }
    public static double calculateAverage(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0.0;
        }
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.length;
    }
}
