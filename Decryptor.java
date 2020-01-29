import java.util.Arrays;
import java.util.HashMap;

/*
 * Place your @author tags here.
 * @author First Last : netid@iastate.edu
 * @author Chris Peterson : cep1@iastate.edu
 * @author Camden Berry : caberry@iastate.edu
 * @author Cade Breeding : breeding@iastate.edu
 * @author Ethan Ochoa : eochoa01@iastate.edu
 */
public class DecryptorSkeleton {
    public static void main(String[] args) {
        int[] toDecrypt = {
                101001, 1001101, 1010011, 11010, 10, 10000000, 1001100, 1101011, 11,
                11010, 1001000, 110101, 1001100, 1111111, 11100, 10101, 10, 10000000,
                1001100, 1101011, 1011101, 1, 1100, 1011101, 11010, 111, 111010
        };

        convertBinaryArrayToDecimalArray(toDecrypt);
        System.out.print("   Convert binary to decimal: ");
        System.out.println(Arrays.toString(toDecrypt));

        shiftArrayValues(toDecrypt);
        System.out.print("          Run the mod method: ");
        System.out.println(Arrays.toString(toDecrypt));

        divideArrayValues(toDecrypt);
        System.out.print("       Integer division by 5: ");
        System.out.println(Arrays.toString(toDecrypt)); 

        System.out.print("Convert integers to a string: ");
        System.out.println(A1Z26Cypher(toDecrypt));

    }


    /*
     * Runs a for loop through each value of the array
     * For each value
     * 		-Converts the number to a string
     * 		-Converts that string into an integer
     * 		-Assigns that integer to the element's index
     */
    public static void convertBinaryArrayToDecimalArray(int[] toDecrypt) {
    	for (int i = 0; i < toDecrypt.length; i++)
    		toDecrypt[i] = Integer.parseInt(toDecrypt[i] + "",2);	
    }


    /*
     * Runs a for loop that goes through each value of the array
     * Uses mod 3 on the index of each element
     * 		-If mod 3 = 0, subtracts 1
     * 		-If mod 3 = 1, subtracts 2
     * 		-If mod 3 = 2, subtracts 3
     */
    public static void shiftArrayValues(int[] toDecrypt) {
        // TODO
    	for (int i = 0; i < toDecrypt.length; i++)
            toDecrypt[i] = i % 3 == 0 ? toDecrypt[i] - 1 :
                           i % 3 == 1 ? toDecrypt[i] - 2 : toDecrypt[i] - 3;
    }


    /*
     * Performs integer division on each element and reassigns it to the index
     */
    public static void divideArrayValues(int[] toDecrypt) {
    	for (int i = 0; i < toDecrypt.length; i++)
    		toDecrypt[i] = toDecrypt[i] / 5;
    }


    /*
     * Assigns each number (0-26) a character value
     * Reads entire array and creates string by translating int values
     */
    public static String A1Z26Cypher(int[] toDecrypt) {
        HashMap<Integer, Character> cypher = new HashMap<>();
        cypher.put(0, ' ');
        cypher.put(1, 'a');
        cypher.put(2, 'b');
        cypher.put(3, 'c');
        cypher.put(4, 'd');
        cypher.put(5, 'e');
        cypher.put(6, 'f');
        cypher.put(7, 'g');
        cypher.put(8, 'h');
        cypher.put(9, 'i');
        cypher.put(10, 'j');
        cypher.put(11, 'k');
        cypher.put(12, 'l');
        cypher.put(13, 'm');
        cypher.put(14, 'n');
        cypher.put(15, 'o');
        cypher.put(16, 'p');
        cypher.put(17, 'q');
        cypher.put(18, 'r');
        cypher.put(19, 's');
        cypher.put(20, 't');
        cypher.put(21, 'u');
        cypher.put(22, 'v');
        cypher.put(23, 'w');
        cypher.put(24, 'x');
        cypher.put(25, 'y');
        cypher.put(26, 'z');

        StringBuilder solution = new StringBuilder();
        for (int i = 0; i < toDecrypt.length; i++)
        	solution.append(cypher.get(toDecrypt[i]));
        solution.append('!');
        return solution.toString();
    }
}