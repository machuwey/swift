import java.io.FileReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class swift {	   
	public static PrintStream out; 
/* 
	public static void main(String argv[]) {    
    try {
      Reader in = new InputStreamReader(System.in);	
      out = System.out;
      if (argv.length>0) {
    	  in = new FileReader(argv[0]);
      }
      if (argv.length>1) {
    	  out = new PrintStream(new FileOutputStream(argv[1]));
      }
      parser p = new parser(new Yylex(in));
      Object result = p.parse().value;      
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  */  
  public static void main(String args[]) {
    try {
        //Establecemos Input Stream Reader
        Reader in = new InputStreamReader(System.in);  
        //Sustituimos salida por el archivo      
        File file = new File(args[0]+".txt");
        PrintStream stream = new PrintStream(file);
        System.setOut(stream);
        out = System.out;
        if (args.length > 0) {
            in = new FileReader(args[0]);
        }
        
        if (args.length > 1) {
            out = new PrintStream(new FileOutputStream(args[1]));
        }
        
        parser p = new parser(new Yylex(in));
        Object result = p.parse().value;
        
    } catch (Exception e) {
        e.printStackTrace();
    }
}
}
