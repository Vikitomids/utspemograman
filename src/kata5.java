
public class kata5 {


    public static int nbYear(int p0, double percent, int aug, int p) {
        int years = 0;
        while (p0 < p) {
            p0 += (int) (p0 * percent / 100) + aug;
            years++;
        }
        return years;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(nbYear(1000, 2, 50, 1200));    // Output: 3
        System.out.println(nbYear(1500, 5, 100, 5000));   // Output: 15
        System.out.println(nbYear(1500000, 2.5, 10000, 2000000));  // Output: 10
    }
}
  
