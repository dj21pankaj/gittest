package interface_study;

public interface Father 
{
	void look();
	default void money() {
		System.out.println("father money");
	}
    static void nature() {
    	System.out.println("father nature");
    }
}
