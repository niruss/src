import java.net.InetAddress;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Sys 
{
	public static void main(String[] args) throws Exception
	{
		DateFormat d=new SimpleDateFormat("dd/MM/yyyy");
		Date d1=new Date();
		System.out.println("Date: "+d.format(d1));
		
		InetAddress ip=InetAddress.getLocalHost();
		System.out.println("IP Address: "+ip.getHostAddress());
	}

}
