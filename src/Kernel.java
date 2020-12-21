/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ной
 */
import java.util.HashMap;

public class Kernel {

    private Stack stack;
    private HashMap<Integer, SystemCall> Systemcall;

    Kernel(Stack stack) {
        this.stack = stack;
        Systemcall = new HashMap();
        Systemcall.put(0, new SystemCall("A"));
        Systemcall.put(1, new SystemCall("A", "B"));
        Systemcall.put(2, new SystemCall("A", "B", "C"));
        Systemcall.put(3, new SystemCall("A", "B", "C", "D"));
    }

    public void ExecuteCall(int f) {
        Systemcall.get(f);
        if (!Systemcall.containsKey(f)) {
            System.out.print("Сall " + f + " don´t exist\n");
            return;
        }
        System.out.print(Systemcall.get(f).Execute());
    }

    public void calls() {
        Systemcall.entrySet().forEach(
        entry
        -> System.out.println(entry.getKey() + " " + " " + entry.getValue().getArgs()));
    }
}
