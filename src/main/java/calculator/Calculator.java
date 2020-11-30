package calculator;

/**
 * @author Dimitrijs Fedotovs <a href="http://www.bug.guru">www.bug.guru</a>
 * @version 1.0
 * @since 1.0
 */
public class Calculator {

    public String calculate(String[] expr) {
        double a = Double.parseDouble(expr[0]);
        String op1 = expr[1];
        double b = Double.parseDouble(expr[2]);
        if (expr.length > 3) {
            String op2 = expr[3];
            double c = Double.parseDouble(expr[4]);
            double result = 0;
            String op = op1 + op2;

            switch (op) {
                case "+":
                    result = a + b;
                    break;
                case "-":
                    result = a - b;
                    break;
                case "*":
                    result = a * b;
                    break;
                case "/":
                    result = a / b;
                    break;
                case "--":
                    result = a - b - c;
                    break;
                case "-+":
                    result = a - b + c;
                    break;
                case "++":
                    result = a + b + c;
                    break;
                case "+-":
                    result = a + b - c;
                    break;
                case "//":
                    result = a / b / c;
                    break;
                case "/*":
                    result = a / b * c;
                    break;
                case "**":
                    result = a * b * c;
                    break;
                case "*/":
                    result = a * b / c;
                    break;
                case "/-":
                    result = a / b - c;
                    break;
                case "+/":
                    result = a + b / c;
                    break;
                case "/+":
                    result = a / b + c;
                    break;
                case "*-":
                    result = a * b - c;
                    break;
                default:
                    return "error";
            }
            return String.valueOf(result);
        }
        double result1 = 0;
        String op3 = op1;
        switch (op3) {
            case "+":
                result1 = a + b;
                break;
            case "-":
                result1 = a - b;
                break;
            case "*":
                result1 = a * b;
                break;
            case "/":
                result1 = a / b;
                break;
            default:
                return "error";
        }
        return String.valueOf(result1);
    }
}