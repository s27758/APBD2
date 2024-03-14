public class Main {
    public static void main(String[] args) {
        int number = 10;
        for (int i = 0; i < number; i++) {
        }
        int[] tab = new int[1];
        tab[0] = number;
        double average = Main.calculateAverage(tab);
        System.out.println("Average: " + average);
        int max = Main.findMax(tab);
        System.out.println("Maksymalna wartość w tablicy: " + max);
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
    public static int findMax(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
