
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ной
 */
public class Stack {

    private List<String> stack = new ArrayList<String>();

    public void push(String element) {
        stack.add(element);
    }

    public String pop() {
        if (stack.size() >= 1) {
            String element = stack.get(stack.size() - 1);
            stack.remove(stack.size() - 1);
            return element;
        } else {
            return null;
        }
    }
}
