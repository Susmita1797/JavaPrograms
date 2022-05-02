package BasicPrograms;

public class MergeSort {
	
	public static void conquer(int a[], si, mid, ei) {
		
		int merge[] = new int[ei-si +1];
		
		int idx1 = si;
		int idx2 = mid+1;
		int x=0;
		
		while(idx1<=mid && idx2<=ei) {
			
			if(a[idx1]<=a[idx2]) {
				
				
				
			}
		}
		
	}
	
	public static void divide(int a[], int si, int ei) {
		if(si>=ei) {
			
			return ;
		}
		
		
		int mid=si+(ei-si)/2;  // (si+ei)/2;
		
		divide(a,si,mid);
		
		
	}

	public static void main(String[] args) {
		
		//divide&Conquer technique
		
		int a[] = {6,3,9,5,3,8};
		
		int n=a.length;
		
		

	}

}
