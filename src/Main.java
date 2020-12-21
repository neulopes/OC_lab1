/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ной
 */
public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack();
        Kernel kernel = new Kernel(stack);
        kernel.calls();

        stack.push("A");

        kernel.ExecuteCall(0);

        stack.push("A");
        stack.push("B");
        kernel.ExecuteCall(1);

        stack.push("A");
        stack.push("B");
        stack.push("C");
        kernel.ExecuteCall(2);

        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        kernel.ExecuteCall(3);

        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        stack.push("E");
        kernel.ExecuteCall(4);
    }
}
