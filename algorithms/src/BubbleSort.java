
public class BubbleSort {
	public static void main(String args[]) {
		 
        Integer vector[] = {10,9,8,7,6,5,4,3,2,1};
        boolean change = true;
        int aux;
        while (change) {
        	change = false;
            for (int i = 0; i < vector.length - 1; i++) {
                if (vector[i] > vector[i + 1]) {
                    aux = vector[i];
                    vector[i] = vector[i + 1];
                    vector[i + 1] = aux;
                    change = true;
                }
            }
        }
    }
}
