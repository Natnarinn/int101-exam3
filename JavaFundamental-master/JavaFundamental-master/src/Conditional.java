public class Conditional {

    public static void main(String[] args) {
        System.out.println(testQuiz1());
        System.out.println(testQuiz2());
        /*
    Syntax
    if (condition | boolean ) {
        // DO or CHECK something if true do this chunk of code
    }

    if (condition | boolean) {
        // the condition (boolean) is true do this chunk of code
    } else if (condition | boolean ) {
        // check the condition true? if true do this chunk of code
    }

     */
    }

    public static String testQuiz1() {
        int number = -1;
        if( number >= 0){
            return "is positive";
        } else {
            return "is not positive";
        }
        /*
         Check if the number is positive or not

         Expected Output
         Input Data : 35
         Output: (NUMBER) is positive
         */
    }

    public static String testQuiz2() {
        // Input between 1 - 7 return the name of that week day if non matches return "No day matches"
        int inputDay = 8;
        if( inputDay == 1){
            return "monday";
        } else  if( inputDay == 2){
            return "tuesday";
        } else  if( inputDay == 3){
            return "wednesday";
        } else  if( inputDay == 4){
            return "thursday";
        } else  if( inputDay == 5){
            return "friday";
        } else  if( inputDay == 6){
            return "saturday";
        } else  if( inputDay == 7){
            return "sunday";
        } else {
            return "No day matches";
        }


    }


}
