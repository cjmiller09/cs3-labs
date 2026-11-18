//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Stack;


public class ExpressionSolver
{
   /** Returns the result of applying the given operator 
       to the given operands. Only addition, subtraction,
       multiplication and division are supported.
       
       @throws UnsupportedOperationException if op isn't 
               a supported operator.
   **/
   private static double calc(double one, double two, String op) {
      if(op.equals("+")) {
         return one + two;
      }
      else if(op.equals("-")) {
         return one - two;
      }
      else if(op.equals("*")) {
         return one * two;
      }
      else if(op.equals("/")) {
         return one / two;
      }
      else if(op.equals("^")) {
         return Math.pow(one, two);
      }
      else {
         throw new UnsupportedOperationException("Unsupported operator: " + op);
      }
   }

   /*** Postfix Evaluator ***/   
   public static double solvePostfix(String expression) {
      Stack<Double> stack = new Stack<>();
      String[] tokens = expression.trim().split("\\s+");
      
      for (String token : tokens) {
         if (token.isEmpty()) continue;
         
         // Check if the token is a number
         if (isNumber(token)) {
               stack.push(Double.parseDouble(token));
         } 
         else {
               // It's an operator (+, -, *, /)
               double two = stack.pop();
               double one = stack.pop();
               double result = calc(one, two, token);
               stack.push(result);
         }
      }
      return stack.pop();
   }
        
   /*** Prefix Evaluator ***/   
   public static double solvePrefix(String expression) {
      Stack<Double> stack = new Stack<>();
      String[] tokens = expression.trim().split("\\s+");
      for(int i=tokens.length-1; i>=0; i--){
         String token = tokens[i];
         if(token.isEmpty()) continue;
         if(isNumber(token)){
            stack.push(Double.parseDouble(token));
         } 
         else{
            double one = stack.pop();
            double two = stack.pop();
            double result = calc(one, two, token);
            stack.push(result);
         }
      }
      return stack.pop();
   }
   
   //This catches both kinds of exceptions
   //that parseDouble might throw.
   public static boolean isNumber(String symbol) {
      try {
         Double.parseDouble(symbol);
         return true;
      }
      catch (NullPointerException | NumberFormatException e) {
         return false;
      }
   }
}