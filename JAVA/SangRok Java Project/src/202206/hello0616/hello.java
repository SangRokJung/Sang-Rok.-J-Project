package hello0616;

import java.io.BufferedWriter;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class hello {

    public static void main(String[] args) {
        Path file = Paths.get("/Users/snagrockjung/Documents");
        BufferedWriter writer = null;
    
        try{
            writer = Files.newBufferedWriter(file);
            writer.write('A');
            writer.write('B');
    
            if  (writer != null)
                writer.close();
        }
        catch(IOException excp){
            excp.printStackTrace();
        }
    }
}

