import java.util.HashMap;

public class RecurringSequence {
    public static String findRecurringSequence(int numerator,int denominator){
        int integralPart=numerator/denominator;
        int remainder=numerator%denominator;

        if(remainder==0) return "No recurring sequence";
        StringBuilder decimalPart=new StringBuilder();
        HashMap<Integer,Integer> remainderPosition=new HashMap<>();
        int position=0;
        while (remainder!=0) {
            if(remainderPosition.containsKey(remainder)){
                int start=remainderPosition.get(remainder);
                String recurringSequence=decimalPart.substring(start);
                return "Recurring Sequence "+ recurringSequence;
            }
            remainderPosition.put(remainder, position);
            remainder*=10;
            int digit=remainder/denominator;
            decimalPart.append(digit);
            remainder%=denominator;
            position++;
        }
        return "No recuring sequence";
    }
    public static void main(String[] args) {
        System.out.println(findRecurringSequence(8, 3)); // Output: Recurring sequence is 6
        System.out.println(findRecurringSequence(50, 22)); // Output: Recurring sequence is 27
        System.out.println(findRecurringSequence(11, 2)); // Output: No recurring sequence
    }    
}
