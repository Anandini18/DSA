Q Link : https://www.codingninjas.com/studio/problems/family-structure_981243?leftPanelTab=0

public class Solution {
	public static String kthChildNthGeneration(int n, long k) {
		return (getChild(n, k)==true)?("Male"):("Female");
	}

	public static boolean getChild(int n, int k){
		// First generation is male only
		// Every first child of any generation is a male.
		if(n==1 || k==1) return true;

        // If child is even, then parent lies at k/2;
		// If child is odd, then parent lies at (k+1)/2;

		// If child is even, then parent remains same as child,
		// If child is odd, then the child is opposite to that parent.
		return (k%2!=0)?(getChild(n,(k+1)/2)):!(getChild(n, k/2));
	}
}
