//package experimentalGraph;
//
//import RealProject.Data;

//public class Pair<T1, T2> {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		
//		
//	}
//
//}



public class Data<W,T1,T2,S1,D1> {
	W	ind;
	T1 p1;
	T2 p2;
	S1 st1;
	D1 pro;
	int ori_in=0;
	void padd(W was,T1 a,T2 b,S1 c,D1 x) {
		this.ind=was;
		this.p1=a;
		this.p2=b;
		this.st1=c;
		this.pro=x;
		
	}
	
	int psize()
	{
		return 2; 
	}
	
	
	Data<W,T1,T2,S1,D1> pget()
	{
	System.out.println( this.p1+","+this.p2+","+this.st1+","+this.pro);
		return this;
	}
	
	
	W pver()
	{
		W x=this.ind;
		return x;
	}
	
	T1 pid()
	{
		T1 x=this.p1;
		return x;
	}
		
	
	T2 pval()
	{
		T2 x=this.p2;
		return x;
	}
	
	S1 cname()
	{
		S1 x=this.st1;
		return x;
	}
	
	D1 pro()
	{
		D1 x=this.pro;
		return x;
	}
	

	
// Pair Example	-----------------------------
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Data<Integer,Integer,Integer,String,Double> ob = new Data<Integer,Integer,Integer,String,Double>();
		ob.padd(null,1,2,"ABC",5.89);
		
		//System.out.println(ob.pget());
		
		System.out.println(ob.pid()+":"+ob.pval()+":"+ob.cname()+" profit : "+ob.pro());
		
		
	}
// ------------------------------------
}