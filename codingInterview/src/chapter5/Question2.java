package chapter5;

public class Question2 {
    public String printBinary(double num){
        if(num>=1 || num<0){
            return "ERROR";
        }
        StringBuilder result = new StringBuilder();
        double checker = 0.5;
        result.append(".");
        while(num>0){
            if(num>=checker){
                result.append(1);
                num -= checker;
            }else{
                result.append(0);
            }
            checker /= 2;

        }

        return result.toString();
    }
}
