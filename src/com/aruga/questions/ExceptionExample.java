package com.aruga.questions;

public class ExceptionExample {
    public static void main(String[] args) {
        String returnVal = method1();
        System.out.println(returnVal);
    }
    static  String method1(){
        try {
            int i = 9/0;
        } catch (NumberFormatException exception){
            System.out.println("Exception caught NumberFormatException");
            return "from NumberFormatException";
        }catch (ArithmeticException exception){
            System.out.println("Exception caught ArithmeticException");
            return "from ArithmeticException";
        }catch (Exception e){
            System.out.println("Exception caught");
            return "from Exception";
        }
        finally {
            System.out.println("finally block executing");
        }
        System.out.println("end");
        return "from end";
    }

}

/** OUTPUT:
 Exception caught
 finally block executing
 from ArithmeticException

 1. The code enters the try block and encounters the line int i = 9/0;. This line throws an ArithmeticException since we are dividing by zero.
 2. Since the exception is of type ArithmeticException, the code jumps to the corresponding catch block.
 3. The message "Exception caught" is printed.
 4. The catch block returns the string "from ArithmeticException".
 5. The finally block is executed regardless of whether an exception was caught or not. In this case, it prints "finally block executing".
 7. The returned value "from ArithmeticException" is assigned to the returnVal variable.
 8. Finally, "from ArithmeticException" is printed by the System.out.println(returnVal); statement.

 The reason why the other catch blocks for NumberFormatException and Exception are not executed is that the specific ArithmeticException catch block is matched first, and the program flow exits the try-catch block after that.
 */

