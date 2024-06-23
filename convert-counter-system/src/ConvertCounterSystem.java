import java.util.Stack;

public class ConvertCounterSystem<T> {
    public static String convertBinary(int number) {
        Stack<Integer> stack = new Stack<Integer>();
        while (number > 0) {
            int rem = number % 2;
            stack.push(rem);
            number /= 2;
        }

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        return result.toString();
    }

    public static String convertOctal(int number) {
        Stack<Integer> stack = new Stack<Integer>();
        while (number > 0) {
            stack.push(number % 8);
            number = number / 8;
        }
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        return result.toString();
    }

    public static String convertHexadecimal(int number) {
        Stack<Integer> stack = new Stack<Integer>();
        char[] hex = "0123456789ABCDEF".toCharArray();
        while (number > 0) {
            int rem = number % 16;
            stack.push(rem);
            number /= 16;
        }
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        return result.toString();
    }

    public static int convertBinaryToDecimal(String binary){
        return Integer.parseInt(binary, 2);
    }

    public static int convertOctalToDecimal(String octal){
        return Integer.parseInt(octal, 8);
    }

    public static int convertHexadecimalToDecimal(String hexadecimal){
        return Integer.parseInt(hexadecimal, 16);
    }
}
