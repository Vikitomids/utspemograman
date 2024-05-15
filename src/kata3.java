
public class kata3 {

        public static boolean isNarcissistic(int num) {
           
            String strNum = String.valueOf(num);
            int length = strNum.length();

            
            int sum = 0;
            for (char digitChar : strNum.toCharArray()) {
                int digit = Character.getNumericValue(digitChar);
                sum += Math.pow(digit, length);
            }

            
            return sum == num;
        }

        public static void main(String[] args) {
            // Test cases
            System.out.println(isNarcissistic(153));
            System.out.println(isNarcissistic(1652));
        }
    }
