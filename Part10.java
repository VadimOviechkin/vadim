public class Part10 {

    public static void main(String[] args) {
        int[] array = new int[Integer.parseInt(args[0])];
        int temp;
        int some = 0;
        boolean isPrime = true;
        for (int i = 2, n = 0; i <= Integer.parseInt(args[0]); i++) {
            isPrime = true;
            for (int f = 2; f <= i / 2; f++) {
                temp = i % f;
                if (temp == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                array[n] = i;
                n++;
                some++;
            }
        }
        System.out.print(some);
        for(int n = 0; n >= some; n++){
            if (n == some){
                System.out.print(array[n]);
            } else {
                System.out.print(array[n] + " ");
            }
        }
    }
}