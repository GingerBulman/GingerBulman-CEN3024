package bulman_Drone;

import java.util.Scanner;

public class Bulman_Drone {
	//Name: Zachary Bulman
	//Date: 5/14/2022
	//Program Name: Bulman_Drone
	//Purpose: Simulation using button, drone movement in x, y,z location
	

	   public static class Drone{
	        private int x;   
	        private int y;   
	        private int z;   

	      
	        public Drone(){
	            x = 0;
	            y = 0;
	            z = 0;
	        }

	        public Drone(int x, int y, int z){
	            this.x = x;
	            this.y = y;
	            this.z = z;
	        }

	        public void moveUp(){
	            z++;
	            System.out.println("Moved up");
	        }

	        public void moveDown(){
	            z--;
	            System.out.println("Moved down");
	        }
	        
	        public void moveBackward(){
	            x--;
	            System.out.println("Moved backward in south direction");
	        }
	        
	        public void moveForward(){
	            x++;
	            System.out.println("Moved forward in north direction");
	        }
	        
	        public void moveRight(){
	            y--;
	            System.out.println("Moved right in west direction");
	        }

	        public void moveLeft(){
	            y++;
	            System.out.println("Moved left in east direction");
	        }

	        public void display(){
	            System.out.println("Coordinates:");
	            System.out.println("x = " + x);
	            System.out.println("y = " + y);
	            System.out.println("z = " + z);
	        }
	    }

	    public static void main(String[] args) {
	        
	        Drone D = new Drone(7, 5, 8);
	        
	        D.display();

	        Scanner scanner = new Scanner(System.in);

	        int DroneP;

	        while(true){
	         
	            System.out.print("\n1. Move Forward\n2. Move Backward\n3. Move Left\n4. Move Right\n5. Move Up\n6. Move Down\n7. Display coordinates\n0. Exit\nChoose an option: ");
	            
	      
	            DroneP = scanner.nextInt();

	            switch(DroneP){
	                
	                case 1:
	                    D.moveForward();
	                    break;
	                case 2:
	                    D.moveBackward();
	                    break;
	                case 3:
	                    D.moveLeft();
	                    break;
	                case 4:
	                    D.moveRight();
	                    break;
	                case 5:
	                    D.moveUp();
	                    break;
	                case 6:
	                    D.moveDown();
	                    break;
	                case 7:
	                    D.display();
	                    break;
	                case 0:
	                    System.out.println("Exiting....");
	                    return;
	                default:
	                    System.out.println("Invalid choice!");
	            }
	        }
	    }

}

