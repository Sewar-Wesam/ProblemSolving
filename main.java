import java.util.Scanner;

public class main {

	
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in); 
		System.out.println("Enter the car position \n"); 
		int carPosition=input.nextInt(); 
		int [] gazStations= {10,20,30,40,50}; 
		NearestGazStation(gazStations,carPosition);

	} 
	
	static void  NearestGazStation(int [] gazStations,int carPosition) {
		
		if(gazStations.length==0) {System.out.println("Invalid array !");} 
		int left=0,right=gazStations.length-1,mid=(left+right)/2;  
		int min_distance=100;
		int index=0;
		while(left<=right) { 
			//System.out.println("left"+left+"\n");
		if(carPosition==gazStations[mid]) {
			
			System.out.println("the index of gaz stations is "+mid);
			return;
		} 
		else if(carPosition > gazStations[mid]  ) { 
			// we need the right part of the array 
			//System.out.println(Math.abs(carPosition-gazStations[mid])+" \n");
			if(min_distance>Math.abs(carPosition-gazStations[mid])) { 
				
				index=mid;
				min_distance=Math.abs(carPosition-gazStations[mid]);
				//System.out.println("index"+index+"and min dist "+ min_distance+"\n");
			}
			left=mid+1; 
			mid=(left+right)/2;
			//System.out.println("left"+left+"mid"+mid+"\n");
			
		} 
		else if(carPosition<gazStations[mid]) { 
			
			// we need the left part of the array
			//System.out.println("left side \n");
			if(min_distance> Math.abs(carPosition-gazStations[mid])) {
				
				min_distance=Math.abs(carPosition-gazStations[mid]);
				index=mid;
			} 
			right=mid-1; 
			mid=(left+right)/2;
		}
		
		}
		System.out.println("The index of the nearest gaz Station is "+index); 
		return;
	
	}

}
