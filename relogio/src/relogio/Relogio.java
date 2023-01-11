package relogio;

import java.io.IOException;
import java.time.LocalTime;
import java.time.temporal.TemporalUnit;
import java.util.concurrent.TimeUnit;
import javax.swing.*;
import java.util.ArrayList;

public class Relogio 
{
	public static void main(String[] args) throws InterruptedException, IOException
	{
		
		int i=0,hora1;
		Numero n = new Numero();
		n.mostraN();
		
		
		while (true)
		{
			LocalTime hora = LocalTime.now();
			int num,h1,h2,m1,m2,s1,s2;
			h1 = Integer.parseInt(String.valueOf(hora.toString().charAt(0)));
			h2 = Integer.parseInt(String.valueOf(hora.toString().charAt(1)));
			m1 = Integer.parseInt(String.valueOf(hora.toString().charAt(3)));
			m2 = Integer.parseInt(String.valueOf(hora.toString().charAt(4)));
			s1 = Integer.parseInt(String.valueOf(hora.toString().charAt(6)));
			s2 = Integer.parseInt(String.valueOf(hora.toString().charAt(7)));
			
			for(i=0;i<8;i++)
			{
				if(m1==0) m1=10;
				if(m2==0) m2=10;
				if(s1==0) s1=10;
				if(s2==0) s2=10;
				System.out.println("	"+n.arrayn.get(i+8*(h1-1))+"	"+n.arrayn.get(i+8*(h2-1))+"		"+n.arrayn.get(i+8*(m1-1))+"	"+n.arrayn.get(i+8*(m2-1))+"		"+n.arrayn.get(i+8*(s1-1))+"	"+n.arrayn.get(i+8*(s2-1)));
				
			}
			
			TimeUnit.SECONDS.sleep(1);
			limpaTela();
			
		}
	}
	public static void limpaTela() throws InterruptedException, IOException
	{
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		
	}
}
