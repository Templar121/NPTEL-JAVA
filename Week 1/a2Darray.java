class a2Darray {
    public static void main(String args[]) {
        int my2Darray [ ][ ] = new int [3] [3];
        int i, j;
        for (i = 0; i < 3; i++) 
                for (j = 0; j < 3; j++) 
                    my2Darray [i] [j] = i * j;
        
        for (i = 0; i < 3; i++){
                for (j = 0; j< 3; j++)
                System.out.print(my2Darray [i] [j] + " ");
                System.out.println();
                    }
                System.out.println();
            }

            


   
    }