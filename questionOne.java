 class questionOne {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4},{5, 6, 7, 8},{9, 10, 11, 12},{13, 14, 15,16}};

        for(int i = 0 ; i < arr[0].length ;i++){
            System.out.print(arr[0][i] + " ");
        }
        for (int i = 0; i < 3 ; i++) {
            System.out.print(arr[i+1][3] + " ");
        }

        for(int i = arr[3].length -1 ; i >= 1 ;i--){
            System.out.print(arr[3][i -1] + " ");
        }

        for(int i = 3 ; i >= 1 ;i--){
            System.out.print(arr[i][0] + " ");
        }

        for( int i = 1 ;i < 3 ;i++){
            System.out.print(arr[1][i] + " ");
        }

        for(int i = 2 ; i< 3 ;i++){
            System.out.print(arr[i][2] + " ");
        }

        System.out.print(arr[2][1]);

    }
    
}