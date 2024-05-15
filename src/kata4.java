
public class kata4 {


        public static int find(int[] integers) {
            int oddCount = 0;
            int evenCount = 0;
            int oddIndex = -1;
            int evenIndex = -1;

            for (int i = 0; i < integers.length; i++) {
                if (integers[i] % 2 == 0) {
                    evenCount++;
                    evenIndex = i;
                } else {
                    oddCount++;
                    oddIndex = i;
                }
            }

            
            if (oddCount == 1) {
                return integers[oddIndex];
            } else {
                return integers[evenIndex];
            }
        }

        public static void main(String[] args) {
        
            int[] arr1 = {2, 4, 0, 100, 4, 11, 2602, 36};
            int[] arr2 = {160, 3, 1719, 19, 11, 13, -21};

            System.out.println(find(arr1));
            System.out.println(find(arr2));
        }
}
