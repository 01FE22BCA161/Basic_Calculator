/**
 * The Calculator class performs basic arithmetic operations such as addition, subtraction,
 * multiplication, and division.
 */
class Calculator{

    float add(float op1,float op2){
        return(op1 + op2);
    }

    float sub(float op1,float op2){
        return(op1 - op2);
    }

    float multi(float op1,float op2){
        return(op1 * op2);
    }

    float div(float op1,float op2){
        return(op1 / op2);
    }

public static void main(String[] args){
    Calculator c=new Calculator();
    float op1 = 10;
    float op2 = 5;
    float add_result = c.add(op1,op2);
    System.out.println("Result is:"+add_result);

    float sub_result = c.sub(op1,op2);
    System.out.println("Result is:"+sub_result);

    float mult_result = c.multi(op1,op2);
    System.out.println("Result is:"+mult_result);

    float div_result = c.div(op1,op2);
    System.out.println("Result is:"+div_result);
}
}