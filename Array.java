
public class Array {

	public static void main(String[] args) {
		class Array {
		    public static void main(String[] args) {
		        // Declare and initialize a 3D array
		        int[][][] array = {
		            {
		                {1, 2, 3},
		                {4, 5, 6}
		            },
		            {
		                {7, 8, 9},
		                {10, 11, 12}
		            }
		        };

		        // Print the 3D array elements
		        System.out.println("Elements of the 3D array:");
		        for (int i = 0; i < array.length; i++) {
		            System.out.println("Layer " + (i + 1) + ":");
		            for (int j = 0; j < array[i].length; j++) {
		                for (int k = 0; k < array[i][j].length; k++) {
		                    System.out.print(array[i][j][k] + " ");
		                }
		                System.out.println(); // New line after each row
		            }
		            System.out.println(); // New line after each layer
		        }
		    }
		}


	}

}
