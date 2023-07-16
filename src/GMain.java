//package experimentalGraph;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import java.util.*;
//import javafx. util. Pair;



public class GMain {
	
	int mn=0;
	static int n=0;

	
	private int once=1;
	public static int stin=0;
	public static String arr[] = new String[50];
	public static ArrayList<Data<Integer,Integer,Integer,String,Double>> adj = new ArrayList<Data<Integer,Integer,Integer,String,Double>>();

	static int nik[] = new int[50]; 
	
	
	
	
/*adj_list-----------------------------------------------------------adj_list*/		
	void Gadd(int id,int val,String s,double p) {
		
		
		if(once==1) {	
		for(int i=0;i<50;i++) {
			adj.add(new Data<Integer,Integer,Integer,String,Double>());
			nik[i]=0;
		}
		once=0;
		}

		
		for(int i=1;i<=n;i++) {
			
//			System.out.println("value of n in for : "+n);
//			System.out.println("value of (i) in for : "+i);
//			System.out.println("Hello");
//			System.out.println("pid id: "+adj.get(i).pid());
//			System.out.println("pval val: "+adj.get(i).pval());
			
			
			
			if((nik[i]==0) && (adj.get(i).pid()!=null) && (adj.get(i).pid()==id)) {
				
				
//				System.out.println("repeat : "+id);
				int x=adj.get(i).pval();
				x+=val;
				
				adj.get(mn).padd(i,id,x,s,p);
				adj.get(i).padd(mn,id,x,s,p);

				return;
				
				
			}
			
		}
		
		
		n=n+1;

		
		if(n==20) return ;  //incomplete
		
		adj.get(mn).padd(n,id,val,s,p);
		
		adj.get(n).padd(mn,id,val,s,p);
		
		
		
		}
/*------------------------------------------------------------------------------------------*/	
	
	void testprint() {
		int x=n;
		System.out.println("Value of n in testprint: "+x);
	}
	
	


	
	
/*DFS--------------------------------------------------------------------------------------DFS*/
		void dfs(Integer i,boolean vis[],String arr[])
		{
			
			vis[i]=true;
			if((nik[i]==0) && (adj.get(i).pid()!=null)) {
				
//					System.out.println(adj.get(i).pval()+":"+adj.get(i).cname());
					stin++;
					arr[stin]=adj.get(i).pid()+adj.get(i).cname()+" "+adj.get(i).pval()+" "+adj.get(i).pro();
					
					
//					arr.add(adj.get(i).pval()+":"+adj.get(i).cname());
//					Integer it : adj.get(i))			
					if(i==n) return;
					i++;
			}
			else
			{
//					
				   if(i==n) return;
					i++;
			}
			
			if(vis[i]==false)
					dfs(i,vis,arr);
		}
	
		
		String[] gdis()
		{

//			System.out.print(adj.get(0).pid()+" "+adj.get(0).pval()+" "+adj.get(0).cname());
			
			for(int i=0;i<stin;i++) {	
				arr[i]=null;
			}
			stin=-1;
			boolean vis[] = new boolean[n+1];
			for(int i=1;i<=n;i++) {
				if(vis[i]==false) {
					dfs(i,vis,arr);		
				}
			}
			
//			System.out.println(adj.get(0).pval()+":"+adj.get(0).cname());
			return arr;
		}
/*-----------------------------------------------------------------------------------------*/	
		
/*----------------------------delete----------------------------------------------------------*/		
		int gdel(int id)
		{
			
			for(int i=1;i<=n;i++)
			{
				
				if(adj.get(i).pid()!=null && adj.get(i).pid()==id)
				{
//					System.out.println("kalla");
					int invest= adj.get(i).pval();
					double pp=0;
					
					switch(id)
					{
						case 1: AllWeatherFrame aw = new AllWeatherFrame();
								pp=aw.AWppval;
								break;
								
						case 2: TopFive tt = new TopFive();
								pp=tt.AWppval;
								break;
								
						case 3: Green ge = new Green();
								pp=ge.AWppval;
								break;
								
						case 4: Tata hot = new Tata();
								pp=hot.AWppval;
								break;		
								
						case 5: Electric em = new Electric();
								pp=em.AWppval;
								break;
								
					}
					
					int sum=0;

					
					
					if(pp>=0)
						sum=(int)( invest+((invest*pp)/100) );
					else
						sum=(int)( invest-((invest*Math.abs(pp))/100) );	
					
					adj.get(i).padd(null,null,null,null,null);
					nik[i]=1;
//					System.out.println(sum);
//					n--;
					return sum;
					
				}
			}
			return -1;
		}
/*-------------------------------------------------------------------------------------------*/		
		


	
	public static void main(String[] args) {
		GMain ob=new GMain();
		
//		ob.Gadd(8, 5, "ABc");

		
		ob.Gadd(8, 1000, "ABc",8.99);
//
		ob.Gadd(4, 5, "Afgjc",99.99);
//
//		
//		ob.Gadd(9, 50, "hggjjh");

		
//		ob.gdel(8);
//		JOptionPane.showMessageDialog(null,ob.gdis());
		
		String [] abc=ob.gdis();
//		System.out.println(abc[0]);
		
		System.out.println("stin: "+stin);
		for(int i=0;i<=stin;i++) {	
			
			if(abc[i]!=null)
				System.out.println(abc[i]);
			else
				System.out.println("null");			
		
			
		
		}	
		
		System.out.println("value of n = "+n);
		
		
		
		System.out.println("-----------------------------------");
//		ob.Gadd(5, 100, "hggjjh",78.2);
		int sum=ob.gdel(8);
//		int sum2=ob.gdel(4);
		
		
		String [] ab=ob.gdis();
//		System.out.println(abc[0]);
		
		System.out.println("stin: "+stin);
		for(int i=0;i<=stin;i++) {	
			
			if(ab[i]!=null) {
				int x=(int)(ab[i].charAt(0))-48;
				String dis = ab[i].substring(1,ab[i].length()-1);
				System.out.println("ID="+x+" ||||"+dis);
			}
			else
				System.out.println("nulloo");			
		
			
		
		}	
		System.out.println("value of n = "+n);
		System.out.println("---------------------------------");
		
		

		
//		System.out.print(adj.get(0).pid()+" "+adj.get(0).pval()+" "+adj.get(0).cname());
	}
}


/*-----------------Brute Force Obsevations-------------
 * 
 * 
public static void main(String[] args) {
	// TODO Auto-generated method stub
	int n=7;
	int m=2;
	//Pair<Integer,Integer> p = new Pair<>(5,5);
	ArrayList<Pair<Integer,Integer<String>> adj = new ArrayList<Pair<Integer,Integer,String>>();
	
	for(int i=0;i<=n;i++)
			adj.add(new Pair<Integer,Integer.String>());
	
	
//	for(int i=0;i<n;i++)
//	{
		adj.get(1).add(2,6,"AAV");
		adj.get(2).add(1,6,"AAV");
		
		
		adj.get(5).add(6,3,"hhh");
		adj.get(6).add(5,3,"hhh");
//	}
	
	for(int i=0;i<n;i++)
	{
//		for(int j=0;j<adj.get(i).psize();j++)
		if(adj.get(i).pfkey()==null) continue;
		for(int j=0;j<1;j++)
			System.out.print(adj.get(i).pfkey()+" "+adj.get(i).pskey()+" "+adj.get(i),cname);
		System.out.println();
	}

}
*
*
-------------------------------------------------------*/
