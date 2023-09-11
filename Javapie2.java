/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javapie;

import java.util.ArrayList;
import java.util.List;
import org.python.util.PythonInterpreter;
import org.python.core.*;

/**
 *
 * @author HTC
 */
public class Javapie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("running python code in java");
        List<Double> z = new ArrayList<>();
        PythonInterpreter pinj = new PythonInterpreter();
        /*pinj.exec("""
                  import math
                  def sigmoid(x):
                      return 1/(1+math.exp(-x))
                  x=[i for i in range(-10,10)]
                  z=[round(sigmoid(i),5) for i in range(-10,10)]
                  print(x)
                  print(z)
                  """);*/
        pinj.execfile("C:\\Netbeans\\javapie\\src\\javapie\\pmain.py");
        for(int i=-10;i<=10;i++){
            System.out.print(i+" ");
        }
        for(int j=-10;j<=10;j++){
            pinj.set("arg", j);
            pinj.exec("val = sigmoid(arg)");
            Double returnVal = (Double) pinj.eval("val").__tojava__(Double.class);
            z.add(returnVal);
        }
        System.out.println(z);
    }
    
}
