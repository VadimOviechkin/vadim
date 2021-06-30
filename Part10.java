public class Part10 {

    public static void main(String[] args) {
        //int arrayLength = Integer.parseInt(args[0]);
        int arrayLength = 10;//for testing
        int[] array = new int[arrayLength];
        int temp;
        boolean isPrime;
        for (int i = 1, n = 0; n <= arrayLength - 1; i++) {
            isPrime = true;
            for (int f = 2; f <= i / 2; f++) {
                temp = i % f;
                if (temp == 0) {
                    isPrime = false;
                }
            }
            if (i == 2) {
                isPrime = false;
            }
            if (isPrime) {
                array[n] = i;
                n++;
            }
        }

        for (int element : array) {
            if (element == 0) break;
            System.out.print(element + " ");
        }
    }
}