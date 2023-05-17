package PersonalExercise;

public class MethodOverloading {
    public static void main(String[] args) {
       String [] names = {"John", "Ebube", "Precious", "Enyi"};

       for(String i : names){
           System.out.println(i);
       }

       int [] [] numbers = {{1,2,3,4},{6,7,8,9}};
       for(int i =0; i< numbers.length; i++){
          for (int j = 0; j < numbers[i].length; ++j){
              System.out.println(numbers[i][j]);
          }
       }

        //TODO:Method overloading
//        int myNum = myOverloadedMethod(5,5);
//        double secondNumber = secondMethod (10,10);
//        System.out.println("int : " + myNum );
//        System.out.println("double : " + secondNumber );



//        int result = sum(10);
//        System.out.println(result);
    }

//    private static int sum(int num) {
//        if(num > 0){
//            return num + sum(num - 1);
//        }else{
//            return 0;
//        }
//    }
    //TODO:Method overloading
//    static int myOverloadedMethod(int x, int y){
//        return x + y;
//    }
//      //TODO:Method overloading
//    static double secondMethod(double x, double y){
//        return x + y;
//    }
}
