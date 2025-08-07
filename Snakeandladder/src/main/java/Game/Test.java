package Game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class Player{
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	private String name;
	private int position;
}

public class Test {
public static void main(String[] args) {
	boolean t=true;
	Random Rand=new Random();
	Scanner sc=new Scanner(System.in);
	Player p1=new Player();
	Player p2=new Player();
	int dis=0;
	System.out.println("Welcome to the game");
	System.out.println("set name of 1st player");
	p1.setName(sc.next()+sc.nextLine());
	p1.setPosition(1);
	System.out.println("set name of 2nd player");
	p2.setName(sc.next()+sc.nextLine());
	p2.setPosition(1);
	List<Player> Pl=new ArrayList<>();
	Pl.add(p1);
	Pl.add(p2);
	
	while(t==true) {
		for(Player P:Pl) {
			System.out.println("your turn "+P.getName());
			System.out.println("Tap 1 to roll the dics");
			int c=sc.nextInt();
			
			if(c==1) {
				dis=Rand.nextInt(6)+1;
				System.out.println("your discs"+dis);
			}
			 if(P.getPosition()+dis<20 || P.getPosition()+dis==20) {
				P.setPosition(dis+P.getPosition());
				System.out.println(P.getPosition());
		         if(P.getPosition()==6|| P.getPosition()== 12||P.getPosition()==18) {
		        	 if(P.getPosition()==6) {
		        		 P.setPosition(P.getPosition()-3);
		        		 System.out.println(P.getPosition());
		        	 }else if(P.getPosition()==12) {
		        		 P.setPosition(P.getPosition()-2);
		        		 System.out.println(P.getPosition());
		        	 }else if(P.getPosition()==18) {
		        		 P.setPosition(P.getPosition()-5);
		        		 System.out.println(P.getPosition());
		        	 }
		         }else if(P.getPosition()==4|| P.getPosition()== 8||P.getPosition()==14) {
		        	 if(P.getPosition()==4) {
		        		 P.setPosition(P.getPosition()+3);
		        	 }else if(P.getPosition()==8) {
		        		 P.setPosition(P.getPosition()+2);
		        	 }else if(P.getPosition()==14) {
		        		 P.setPosition(P.getPosition()+3);
		        	 }
		         }
		         
		         System.out.println(P.getName()+" Your at position "+P.getPosition());
		         System.out.println("--------------------------");
			}
			 
			 if(P.getPosition()==20) {
				
				System.out.println("Your win this Match"+P.getName());
				 System.out.println("___________________________________________");
				t=false;
				break;
			}	
		}
	}
	System.out.println("Game is end");
	System.out.println("Play Again"); //create new branch -> abc	
}
	
		
}


