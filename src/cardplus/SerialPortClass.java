package cardplus;

import com.fazecast.jSerialComm.*;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class SerialPortClass {
    public static SerialPort comPort;
    public static InputStream in;
    static String s;
    
    public static String convert(InputStream inputStream, Charset charset){
	
	try (Scanner scanner = new Scanner(inputStream, charset.name())) {
		return scanner.useDelimiter("\n").next();
	}
        catch(Exception e)
        {   
                JOptionPane.showMessageDialog(null, "Card Not Detected !", "Error :Timeout", JOptionPane.ERROR_MESSAGE);
        }
        return null;
}
    public String getID(){
        try {
            comPort = SerialPort.getCommPorts()[0];
            comPort.openPort();
            comPort.setComPortTimeouts(SerialPort.TIMEOUT_READ_BLOCKING, 5000, 0);
            in = comPort.getInputStream();
            Charset charset=StandardCharsets.UTF_8;
            s=convert(in,charset);
            System.out.println(s);
            in.close();
            comPort.closePort();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Please check if you have connected the DEVICE PROPERLY !", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return s;
    }
    
}
