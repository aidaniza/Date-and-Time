import java.io.*;
import java.net.*;

class DateClient
{
    public static void main(String args[]) throws Exception
    {
        Socket soc=new Socket("192.168.192.131",43454);        
        BufferedReader in=new BufferedReader(
                new InputStreamReader(
                        soc.getInputStream()
                        )
                    );

        System.out.println(in.readLine());
    }    
}
