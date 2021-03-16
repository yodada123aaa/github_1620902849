/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author talentter-bu
 */
class Multiplication
{
    int calculate(int operand1, int operand2)
    {
        return operand1 * operand2;
    }
}
class Division extends Multiplication
{
    @Override
    int calculate(int operand1, int operand2)
    {
        return operand1 / operand2;
    }
}
public class OverridingExample {
    public static void main(String[] args) {
        Multiplication mulcal = new Multiplication();
        System.out.println("Multiplication of two operands is "+mulcal.calculate(3, 9));
        Multiplication divcal = new Division();
        System.out.println("Division of two operands is "+divcal.calculate(9, 3));
    }
}
