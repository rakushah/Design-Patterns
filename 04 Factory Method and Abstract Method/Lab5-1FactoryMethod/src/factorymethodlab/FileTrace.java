package factorymethodlab;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileTrace implements Trace{
	String filePath = "C:\\Users\\985103\\Data\\trace.log";
	boolean debug=false;
	@Override
	public void setDebug(boolean debug) {
		
		this.debug=debug;
	}

	@Override
	public void debug(String message) {
		if (debug) {
			write("fileTrace debug message :"+message);
		}
	}

	@Override
	public void error(String message) {
		if (debug) {
			write("fileTrace error message :"+message);
		}
		
	}
	public void write(String data){
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(new File(filePath)))) {
		    bw.write(data);
		    bw.close();
		    }catch (FileNotFoundException ex) {
		    System.out.println(ex.toString());
		    } catch (IOException e) {
				e.printStackTrace();
			}
			
	}
}
