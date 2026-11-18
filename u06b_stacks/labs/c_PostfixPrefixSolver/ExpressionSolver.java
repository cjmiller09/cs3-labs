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
      else {
         throw new UnsupportedOperationException("Unsupported operator: " + op);
      }
   }

   /*** Postfix Evaluator ***/   
   public static double solvePostfix(String expression) {
      Stack<Character> postfix = new Stack<>();
      while(expression.length() > 0){
         char val = expression.charAt(0);
      }
      return 0.0;
   } 
        
   /*** Prefix Evaluator ***/   
   public static double solvePrefix(String expression) {
   
      return 0.0;
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