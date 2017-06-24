public class QSNormal {
	public QSNormal(){}
public static int partition(int[] a,char[] b,int begin,int middle,int end){
		
		while(begin!=end){
			 if(a[begin]>=middle){
				while(end!=begin){
					if(a[end]<middle){
						swap(a,b,begin,end);
						break;
					}
					else end--;
				}
				if(begin==end)
					return begin;
				}
			begin++;}
		return begin;
		
	}
	public static void swap(int[] a,char[] b,int x ,int y){
		int[] temp2 = {0};
		temp2[0] = a[x];
		a[x] = a[y];
		a[y] = temp2[0];
		
		char[] temp3 = {' '};
		temp3[0] = b[x];
		b[x] = b[y];
		b[y] = temp3[0];
	}
	public static void sort(int[] a,char[] b,int x, int y, int z ){
		
		if(a[z]<= a[y]){
			swap(a,b,y,z);
			if(a[y]<= a[x]){
				swap(a,b,x,y);
				if(a[z]<=a[y])
					swap(a,b,y,z);
			}
			}
		
		if(a[y]<= a[x]){
			swap(a,b,x,y);
			if(a[z]<=a[y])
				swap(a,b,y,z);
			}
		
			}
		
		
	
	public static void qsort(int[] a,char[] b, int begin,int end){
		if(a.length==0)
			return;
		int middle = (begin+end)/2;
		if(end-begin<=2)
			sort(a,b,begin,middle,end-1);
		else{
			sort(a,b,begin,middle,end-1);
			middle =a[middle];
			int y = partition(a,b,begin+1,middle,end-1);
			qsort(a,b,begin,y);
			qsort(a,b,y,end);
			
		}
			
	}
	}