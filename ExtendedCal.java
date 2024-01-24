/**
 * The Calculator class extends the ExtendedCal class.
 */
  class ExtendedCal{
    /**
     * The function "square" takes a float as input and returns the square of that number.
     * 
     * @param op1 The parameter "op1" is a float type variable that represents the operand for which we
     * want to calculate the square.
     * @return the square of the input number.
     */
    float square(float op1){
        return(op1*op1);
    }
    /**
     * The function cube takes a float as input and returns the cube of that number.
     * 
     * @param op1 The parameter "op1" is a float type variable that represents the operand for the cube
     * function.
     * @return The cube of the input number.
     */
    float cube(float op1){
        return(op1*op1*op1);
    }
    // The `float mod(float op1, op2)` function in the Calculator class is calculating the modulus of
    // two numbers.
    float mod(float op1,float op2){
        return(op1 % op2);
    }
}