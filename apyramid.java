public class apyramid  {
    public static void main(String[] args){
        //alphabet pyramid for n=4 a  aba  abcba abcdcba in pyramid pattern
        int n = 4; // Number of rows in the pyramid
        for (int i = 0; i < n; i++) { 
            
            // Print leading spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // Print ascending part of the pyramid
            for (char ch = 'a'; ch < 'a' + i + 1; ch++) {
                System.out.print(ch);
            }

            // Print descending part of the pyramid
            for (char ch = (char) ('a' + i - 1); ch >= 'a'; ch--) {
                System.out.print(ch);
            }

            // Move to the next line after each row
            System.out.println();
        } 
    }
}