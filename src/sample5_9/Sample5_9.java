package sample5_9;

import java.io.*;

public class Sample5_9 {
	public static void main (String[]args)
	{
		if(args.length!=1)
		{
			System.out.println("�Ы��w���T���ɮצW��");
			System.exit(1);
		}
		try 
		{
			BufferedReader br = new BufferedReader(new FileReader(args[0]));
			
			String str;
			while((str=br.readLine())!=null)
			{
				System.out.println(str);
			}
			br.close();
		}
		catch(IOException e)
		{
			System.out.println("��J��X���~");
		}
	}
}
