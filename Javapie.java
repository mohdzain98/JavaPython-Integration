/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javapie;

import org.python.util.PythonInterpreter;

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
        PythonInterpreter pinj = new PythonInterpreter();
        pinj.exec("""
                  import math
                  def sigmoid(x):
                      return 1/(1+math.exp(-x))
                  x=[i for i in range(-10,10)]
                  z=[round(sigmoid(i),5) for i in range(-10,10)]
                  print(x)
                  print(z)
                  """);
        
    }
    
}
