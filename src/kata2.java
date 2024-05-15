
public class kata2 {


    public static int findShort(String s) {
        // Split the string into words
        String[] words = s.split(" ");

        // Initialize the shortest length with the maximum integer value
        int shortestLength = Integer.MAX_VALUE;

        // Iterate over the words to find the shortest one
        for (String word : words) {
            int length = word.length();
            if (length < shortestLength) {
                shortestLength = length;
            }
        }

        return shortestLength;
 
}
}
