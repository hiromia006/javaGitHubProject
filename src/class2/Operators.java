package class2;

public class Operators {
    public static void main(String[] args) {
        //Unary Operator
        int mark = 500;
        System.out.println("++expr : " + ++mark); //502
        System.out.println("expr++ : " + mark++); // 502
        System.out.println("expr : " + mark); //503

        System.out.println("expr --: " + mark--); //503
        System.out.println("--expr : " + --mark); // 501
        System.out.println("expr : " + mark); //501

        System.out.println("==================================================");

        //Assignment Operator
        int number1 = 30, number2 = 50;
        number1 += 80;//number1=number + 80; =30+80=110
        System.out.println("number1 : " + number1);

        number2 -= 30; // number2=number2-30;
        System.out.println("number2 : " + number2);

        number1 *= 10;//110*10=1100
        System.out.println("number1 : " + number1);

//        number1 /= 5;
//        System.out.println("number1 : " + ++number1);//221
//
//        number1 %= 5;
//        System.out.println("number1 : " + number1);//1

        System.out.println("==================================================");
        //Ternary Operator number1=1100, number2=20;
        int maxNumber = (number1 > number2) ? number1 : number2;
        System.out.println("maxNumber : " + maxNumber);

        System.out.println(" number1 > number2 " + (number1 > number2));
        System.out.println(" number1 < number2 " + (number1 < number2));
        System.out.println(" number1 >= number2 " + (number1 >= number2));
        System.out.println(" number1 <= number2 " + (number1 <= number2));
        System.out.println(" number1 == number2 " + (number1 == number2));
        System.out.println(" number1 != number2 " + (number1 != number2));

        //Logical Operator
        System.out.println(((number1 > number2)) && (number1 >= number2));
        System.out.println(((number1 < number2)) && (number1 >= number2));
        System.out.println(((number1 < number2)) || (number1 >= number2));
        System.out.println(((number1 < number2)) || (number1 == number2));


    }
}
