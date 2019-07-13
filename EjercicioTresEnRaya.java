// LABORATORIO NRO 16 : EJERCICIO TRES EN RAYA
// AUTOR: FANNY LORENA LORENZO QUILLA

import java.util.Scanner;
public class EjercicioTresEnRaya {
	
	public static void mostrarTablero( String [] elTablero)
	{
		System.out.println(elTablero[7]+  "  |  " + elTablero[8]+  "  |  "+ elTablero[9]);
		System.out.println("____________");
		System.out.println(elTablero[4]+  "  |  " + elTablero[5]+  "  |  "+ elTablero[6]);
		System.out.println("____________");
		System.out.println(elTablero[1]+  "  |  " + elTablero[2]+  "  |  "+ elTablero[3]);
	}
	
	public static String ingreseLetra()
	{
		String miLetra;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese su letra X u O");
		miLetra = sc.next();
	
		while ( ! ( miLetra.equals("X") ||  miLetra.equals("O") ) )
			
		{		System.out.println();
				System.out.println("Ingrese su letra X u O");
	    		miLetra = sc.next();
		}
	
		return miLetra;
	}
	
	public static boolean esJugadaGanadora( String [] elTablero, String laLetra){
		boolean gano= false;
			gano  =  ( elTablero[1].equals(laLetra) && elTablero[2].equals(laLetra) &&  elTablero[3].equals(laLetra) ) ||
				 ( elTablero[4].equals(laLetra) && elTablero[5].equals(laLetra) &&  elTablero[6].equals(laLetra) ) ||
				 ( elTablero[7].equals(laLetra) && elTablero[8].equals(laLetra) &&  elTablero[9].equals(laLetra) ) ||
				 ( elTablero[1].equals(laLetra) && elTablero[4].equals(laLetra) &&  elTablero[7].equals(laLetra) ) ||
				 ( elTablero[2].equals(laLetra) && elTablero[5].equals(laLetra) &&  elTablero[8].equals(laLetra) ) ||
				 ( elTablero[3].equals(laLetra) && elTablero[6].equals(laLetra) &&  elTablero[9].equals(laLetra) ) ||
				 ( elTablero[3].equals(laLetra) && elTablero[5].equals(laLetra) &&  elTablero[7].equals(laLetra) ) ||
				 ( elTablero[1].equals(laLetra) && elTablero[5].equals(laLetra) &&  elTablero[9].equals(laLetra) ) ;
		
		return gano;
	} 
		
	public static int ingreseJugada()
	{
		int jugada;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese jugada 1-9");
		jugada = sc.nextInt();
	
		while ( jugada> 9 || jugada <1 )
		{		System.out.println("Ingrese jugada:");
	    		jugada = sc.nextInt();
		}	
		return jugada;
	}
	public static int númeroProgramado(String [] t, String l){
		int num=0;
		String f;
		if (l.equals("X"));{
			f="O";}
		if (l.equals("O"));{
        	f="X";}
		
		if ((t[2].equals(l) && t[3].equals(l) || t[4].equals(l) && t[7].equals(l) || t[5].equals(l) && t[9].equals(l))&& t[1].equals("") )
			num =1;
			else if ((t[1].equals(l) && t[3].equals(l) || t[5].equals(l) && t[8].equals(l))&&t[2].equals(""))
				num =2;
			else if ((t[1].equals(l) && t[2].equals(l) || t[7].equals(l) && t[5].equals(l) || t[9].equals(l) && t[6].equals(l))&&t[3].equals(""))
				num = 3;
			else if ((t[5].equals(l) && t[6].equals(l) || t[1].equals(l) && t[7].equals(l) )&&t[4].equals(""))
				num = 4;
			else if ((t[4].equals(l) && t[6].equals(l) || t[2].equals(l) && t[8].equals(l) || t[1].equals(l) && t[9].equals(l) || t[3].equals(l) && t[7].equals(l))&&t[5].equals(""))
				num = 5;
			else if((t[4].equals(l) && t[5].equals(l) || t[3].equals(l) && t[9].equals(l))&&t[6].equals(""))
				num = 6;
			else if((t[8].equals(l) && t[9].equals(l) || t[4].equals(l) && t[1].equals(l) || t[5].equals(l) && t[3].equals(l))&&t[7].equals(""))
				num = 7;
			else if ((t[7].equals(l) && t[9].equals(l) || t[2].equals(l) && t[5].equals(l))&&t[8].equals(""))
				num = 8;
			else if ((t[7].equals(l) && t[8].equals(l) || t[6].equals(l) && t[3].equals(l) || t[1].equals(l) && t[5].equals(l))&&t[9].equals(""))
			num = 9;
	   else
			if ((t[2].equals(f) && t[3].equals(f) || t[4].equals(f) && t[7].equals(f) || t[5].equals(f) && t[9].equals(f) )&&t[1].equals(""))
				num =1;
				else if ((t[1].equals(f) && t[3].equals(f) || t[5].equals(f) && t[8].equals(f))&&t[2].equals(""))
					num =2;
				else if ((t[1].equals(f) && t[2].equals(f) || t[7].equals(f) && t[5].equals(f) || t[9].equals(f) && t[6].equals(f))&&t[3].equals(""))
					num = 3;
				else if ((t[5].equals(f) && t[6].equals(f) || t[1].equals(f) && t[7].equals(f) )&&t[4].equals(""))
					num = 4;
				else if ((t[4].equals(f) && t[6].equals(f) || t[2].equals(f) && t[8].equals(f) || t[1].equals(f) && t[9].equals(f) || t[3].equals(f) && t[7].equals(f))&&t[5].equals(""))
					num = 5;
				else if ((t[4].equals(f) && t[5].equals(f) || t[3].equals(f) && t[9].equals(f))&&t[6].equals(""))
					num = 6;
				else if ((t[8].equals(f) && t[9].equals(f) || t[4].equals(f) && t[1].equals(f) || t[5].equals(f) && t[3].equals(f))&&t[7].equals(""))
					num = 7;
				else if ((t[7].equals(f) && t[9].equals(f) || t[2].equals(f) && t[5].equals(f))&&t[8].equals(""))
					num = 8;
				else if ((t[7].equals(f) && t[8].equals(f) || t[6].equals(f) && t[3].equals(f) || t[1].equals(f) && t[5].equals(f))&&t[9].equals(""))
				num = 9;
			else
				if (t[1].equals(""))
					num = 1;
				else if (t[3].equals(""))
					num = 3;
				else if (t[7].equals(""))
					num = 7;
				else if (t[9].equals(""))
					num = 9;
				else
					if (t[5].equals(""))
						num =5;
					else 
						if(t[2].equals(""))
							num = 2;
						else if (t[4].equals(""))
							num = 4;
						else if (t[6].equals(""))
							num = 6;
						else
							num = 8;
					
		return num;
	}
	public static void main(String [] args)
	{
		String miLetra;
		int jugada;
		String []  tablero =  {"","","","","","","","","",""};
		miLetra = ingreseLetra();
		mostrarTablero(tablero);
		int contador = 1;
			
		while(contador <= 9 ){
			if (contador%2!=0){
						
				System.out.println("\n");	
				jugada = ingreseJugada();
				while (!tablero[jugada].equals("")){
					jugada = ingreseJugada();
				}
			}
			else{
				System.out.println("\nTurno del ordenador\n");
				jugada = númeroProgramado(tablero, miLetra);
			}
				
				tablero[jugada] = miLetra;
				mostrarTablero(tablero);
				
				if (esJugadaGanadora(tablero, miLetra))
				{
					System.out.println("GANO " + miLetra);
					break;
				}
			 
			if(miLetra.equals("X"))
    			miLetra  = "O";
    		else
    			miLetra = "X";
			contador++;
		}
		System.out.println("TERMINAMOS!!!!");
		
	}

}