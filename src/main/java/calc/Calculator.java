package calc;

public class Calculator {
    public double defaultvalue;



    public Calculator(double defaultvalue){
        this.defaultvalue = defaultvalue;

    }
    public double add(double valueToAdd){
        return this.defaultvalue + valueToAdd;
    }

    public double multiply(double valueToMultiply){
        return this.defaultvalue * valueToMultiply;
    }

    public double divide(double valueToDivide){
        return this.defaultvalue / valueToDivide;
    }

    public double sqrt(double value){
       return Math.sqrt(value);
    }
    public double exponent(double valueToPower){
        return Math.pow(this.defaultvalue,valueToPower);
    }

    public double substract(double valueTosubstract){
        return this.defaultvalue - valueTosubstract;
    }

}
