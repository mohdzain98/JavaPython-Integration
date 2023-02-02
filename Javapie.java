package javapie;
import org.python.util.PythonInterpreter;

public class Javapie {

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
