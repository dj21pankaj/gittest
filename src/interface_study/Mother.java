package interface_study;

public interface Mother
{
   void love();
   static void nature() {
	   System.out.println("mother nature");
   }
   default void money() {
	   System.out.println("mother money");
   }
	
}
