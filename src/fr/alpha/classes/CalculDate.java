package fr.alpha.classes;

import java.util.Scanner;

public class CalculDate {
	public static void main(String[] args) {
		String tab[] = {"Tu as ", " ans"};
		Scanner sc = new Scanner(System.in);
		System.out.print("Entrée le nombre de jours : ");

		String tabMois[] = {"Janvier", "Février", "Mars", "Avril", "Mai","Juin","Juillet", "Août","Septembre","Octobre","Novembre","Décembre"};
		String tabJour[] = {"Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi","Samedi","Dimanche"};
		String tabMoisJour[][] = {tabMois,tabJour};
		int nbDjours= sc.nextInt();
		final int M31 =31;
		final int M30 =30;
		int C31 = 0;
		int C30 = 0;
		
		for (int i = 0; i < tabMois.length; i++)
		{   
		    
		    
			if (i < 7 && i % 2 == 0 || i >= 7 && i % 2 == 1)
		    	C31++;
		    else
		    	C30++;
		    /*
		    if (i < 7 && i % 2 == 0 || i >= 7 && i % 2 == 1)
		    	C31++;
		    else
		    	C30++;
		    //*/
		    	
			if (nbDjours <= (M31*C31) + (M30*C30) - 1 ) 
			{
				System.out.println("Ce nombre de jours correspond au mois de : " + tabMoisJour[0][i]);
				break;
		}

		}
	}
}
