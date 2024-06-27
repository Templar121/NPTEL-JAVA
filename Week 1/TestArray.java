public class TestArray {
    public static void main(String[] args) {

        int a[] = {10, 20, 30, 40, 50};
        // Traversing the array
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);

        }
        float sum = 0, avg;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        avg = sum / a.length;
        System.out.println("Average = " + avg);

    }
}
