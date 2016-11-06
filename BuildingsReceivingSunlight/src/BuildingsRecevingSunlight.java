import java.util.Scanner;

/** Given are the heights of certain Buildings which lie adjacent to each other.
 * Sunlight starts falling from left side of the buildings. If there is a building
 * of certain Height, all the buildings to the right side of it having lesser heights
 * cannot see the sun. The task is to find the total number of such buildings that
 * receive sunlight.
 *
 * Created by nagen on 11/5/16.
 */

public class BuildingsRecevingSunlight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int problem = scan.nextInt();
        while(problem-- > 0) {
            int output = 0;
            int val = scan.nextInt();
            int curr = Integer.MIN_VALUE;
            for(int i = 0; i < val; i++) {
                int j = scan.nextInt();
                if(j >= curr) {
                    curr = j;
                    output++;
                }
            }
            System.out.println(output);
        }
        scan.close();
    }
}
