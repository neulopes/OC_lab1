
import java.util.Arrays;
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
public class SystemCall {

    List<String> Arg;

    public SystemCall(String... args) {
        Arg = Arrays.asList(args);
    }

    public List getArgs() {
        return Arg;
    }

    public String Execute() {
        return "Call completed\n";
    }
}
