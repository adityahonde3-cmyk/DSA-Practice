class Main {
    public static void main(String[] args) {

        int[] arr = {-10, -20, -3, -50};

        int max = Integer.MIN_VALUE; // SOLVES ALL PROBLEM   
//     “It will start from the smallest possible integer.”

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Maximum element: " + max);
    }
}

