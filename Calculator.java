/**
 * The Calculator class performs basic arithmetic operations such as addition, subtraction,
 * multiplication, and division.
 */
class Calculator extends ExtendedCal{

   /**
    * The function "add" takes two float numbers as input and returns their sum.
    * 
    * @param op1 The first operand for addition.
    * @param op2 The op2 parameter is a float type, which means it can hold decimal numbers.
    * @return The sum of op1 and op2.
    */
    float add(float op1,float op2){
        return(op1 + op2);
    }

    /**
     * The function "sub" subtracts two float numbers and returns the result.
     * 
     * @param op1 The first operand for subtraction.
     * @param op2 The parameter "op2" is a float type variable that represents the second operand in
     * the subtraction operation.
     * @return the result of subtracting `op2` from `op1`.
     */
    float sub(float op1,float op2){
        return(op1 - op2);
    }

    /**
     * The function multi takes two float numbers as input and returns their product.
     * 
     * @param op1 The first operand for multiplication. It is a float data type.
     * @param op2 The op2 parameter is a float type variable that represents the second operand in a
     * multiplication operation.
     * @return the product of op1 and op2.
     */
    float multi(float op1,float op2){
        return(op1 * op2);
    }

    /**
     * The function div takes two float operands and returns their division.
     * 
     * @param op1 The first operand for the division operation.
     * @param op2 The parameter "op2" is the second operand of the division operation. It is the number
     * that will be divided by the first operand "op1".
     * @return the result of dividing op1 by op2.
     */
    float div(float op1,float op2){
        return(op1 / op2);
    }


    

// The `public static void main(String[] args)` method is the entry point of the Java program. It is
// the method that is executed when the program is run.
public static void main(String[] args){
    // In the given code, `Calculator c=new Calculator();` creates an instance of the `Calculator`
    // class. This allows us to access the methods and variables defined in the `Calculator` class.
    Calculator c=new Calculator();
    // The line `float op1 = 10;` is declaring a variable named `op1` of type `float` and assigning it
    // the value `10`. This variable is used as the first operand in the arithmetic operations
    // performed by the `Calculator` class.
    float op1 = 10;
    // The line `float op2 = 5;` is declaring a variable named `op2` of type `float` and assigning it
    // the value `5`. This variable is used as the second operand in the arithmetic operations
    // performed by the `Calculator` class.
    float op2 = 5;
    float add_result = c.add(op1,op2);
    System.out.println("Result for addition:"+add_result);

    float sub_result = c.sub(op1,op2);
    System.out.println("Result for substractoin:"+sub_result);

    float mult_result = c.multi(op1,op2);
    System.out.println("Result for multiplication:"+mult_result);

    float div_result = c.div(op1,op2);
    System.out.println("Result for division:"+div_result);
    
    float sq_result = c.square(op1);
    System.out.println("Result for square:"+sq_result);

    float cube_result= c.cube(op1);
    System.out.println("Result for cube:"+cube_result);
    
    float mod_result= c.mod(op1,op2);
    System.out.println("Result for mod :"+mod_result);

}
}


