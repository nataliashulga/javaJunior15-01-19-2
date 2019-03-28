package lesson6;

public class Main2 {
    public static void main(String[] args) {
        int[][] numbers = new int[4][3];
        int startNum = 2;
        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers[0].length; i++){
                numbers[i][j] = startNum;
                startNum = startNum + 2;
            }
        }


        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers[0].length; j++){
                if(numbers[i][j] < 10){
                    System.out.print(numbers[i][j] + "  ");
                }else{
                    System.out.print(numbers[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
