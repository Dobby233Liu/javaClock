import java.util.*;
import java.io.*;

public class Main
{
	public static int time;
	public static void main(String[] args)
	{
	Timer timec=new Timer();
	timec.schedule(new TimerTask(){
		@Override
		public void run()
		{
		try
		{
		System.out.flush();
	    int o = 0;
		for(int i = 0; i < 10; i++) 
			System.out.print("\r\n"); 
		}
		catch (Exception e) {}
		System.out.println("        "+new Date().toLocaleString());
		int o = 0;
		for(int i=o;i<=15;i++){
		System.out.println();
		}
		}
	},0,1000);
	}
}
