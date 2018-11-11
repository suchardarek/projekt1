public class Calculator {
    public String calculate (int val1, int val2, String sign){
        switch (sign) {
            case "+":
                return Integer.toString(this.add(val1, val2));
            case "-":
                return Integer.toString(this.subtract(val1, val2));
            case "*":
                if (val1 == 0 || val2 == 0) { return "Po co mnożyć przez 0?";}
                return Integer.toString(this.multiply(val1, val2));
            case "/":
                if (val2 == 0) {return "Dzielenie przez 0 jest zabronione";}
                return Integer.toString(this.divide(val1, val2));
            default:
                return "Błędny operator matematyczny!";
        }
    }

    private int add(int val1, int val2){
        return val1 + val2;
    }

    private int subtract(int val1, int val2){
        return val1 - val2;
    }

    private int multiply(int val1, int val2){
        return val1 * val2;
    }

    private int divide(int val1, int val2){
        return val1 / val2;
    }
}
