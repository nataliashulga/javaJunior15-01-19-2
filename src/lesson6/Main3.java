package lesson6;

public class Main3 {
    public static void main(String[] args) {
        int[][] numbers = {{1,1,1,1},
                           {1,1,1,1},
                           {1,1,1,1},
                           {1,1,1,1}};

        for(int i = 0; i < numbers.length; i++){
            for(int j =0; j <= i; j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
