import java.util.Scanner;
class hotel1 {
	Scanner Sc=new Scanner(System.in);

	int r[] = {210,180,220,235,205,350,890,1400,1200,1799,80},s[]= {210,180,200,235,205,350,890,1400,1200,1799,55},o[]= {2,2,4,2,2,6,2,1,4,2,8},n[]= {20,30,10,5,12,4,5,1,3,10,120},v[]= {17,10,2,3,0,1,3,1,2,8,25},it1=0,it2=0,c1,c2,c3,c4,it3=0,it4=0,it5=0,it6=0,sp2,sp3,sp4;

	
	int st[]= {3,3,3,4,4,4,5,5,5,5,1},sr[]= {3,4,5,1},rt[]= {3,3,4,1},pos;
	String str1,str2,str3,str4,a[][] = new String[40][40],add[] = new String[40],address[] = new String[40],rooms[]=new String[40],hname;
	void hotel()
	{

	
	
		address[0]="Beach road,chinna waltiar\t";
		address[1]="jagadhamba cinema hall\t\t";
		address[2]="\tRama krishna bus stop ,beach road";
		address[3]="near diamond park,asslimetta\t";
		a[0][0]=add[0]=str1="THE PARK";
		a[0][1]=rooms[0]="executive studio\t";
		a[0][2]="210\t\t";
		a[0][3]="210\t\t";
		a[0][4]="2\t\t";
		a[0][5]="20\t\t";
		a[0][6]="17";
		a[1][0]="THE PARK";
		a[1][1]=rooms[1]="standrad studio\t";
		a[1][2]="180\t\t";
		a[1][3]="180\t\t";
		a[1][4]="2\t\t";
		a[1][5]="30\t\t";
		a[1][6]="10\t\t";
		a[2][0]="THE PARK";
		a[2][1]=rooms[2]="family room\t\t";
		a[2][2]="220\t\t";
		a[2][3]="200\t\t";
		a[2][4]="4\t\t";
		a[2][5]="10\t\t";
		a[2][6]="2\t\t";
		a[3][0]=add[1]=str2="GREEN PARK";
		a[3][1]=rooms[3]="executive studio\t";
		a[3][2]="235\t\t";
		a[3][3]="235\t\t";
		a[3][4]="2\t\t";
		a[3][5]="5\t\t";
		a[3][6]="3\t\t";		
		a[4][0]="GREEN PARK";
		a[4][1]=rooms[4]="standrad studio\t";
		a[4][2]="205\t\t";
		a[4][3]="205\t\t";
		a[4][4]="2\t\t";
		a[4][5]="12\t\t";
		a[4][6]="0\t\t";
		a[5][0]="GREEN PARK";
		a[5][1]=rooms[5]="family room\t";
		a[5][2]="350\t\t";
		a[5][3]="350\t\t";
		a[5][4]="6\t\t";
		a[5][5]="4\t\t";
		a[5][6]="1\t\t";
		a[6][0]=add[2]=str3="NOVOTEL";
		a[6][1]=rooms[6]="ultra luxury room\t";
		a[6][2]="890\t\t";
		a[6][3]="890\t\t";
		a[6][4]="2\t\t";
		a[6][5]="5\t\t";
		a[6][6]="3\t\t";
		a[7][0]="NOVOTEL";
		a[7][1]=rooms[7]="etilist studio\t";
		a[7][2]="1400\t\t";
		a[7][3]="1400\t\t";
		a[7][4]="1\t\t";
		a[7][5]="1\t\t";
		a[7][6]="1\t\t";
		a[8][0]="NOVOTEL";
		a[8][1]=rooms[8]="penthouse Apartment\t";
		a[8][2]="1200\t\t";
		a[8][3]="1200\t\t";
		a[8][4]="4\t\t";
		a[8][5]="3\t\t";
		a[8][6]="2\t\t";
		a[9][0]="NOVOTEL";
		a[9][1]=rooms[9]="Glod plated luxury\t";
		a[9][2]="1799\t\t";
		a[9][3]="1799\t\t";
		a[9][4]="2\t\t";
		a[9][5]="10\t\t";
		a[9][6]="8\t\t";
		a[10][0]=add[3]="HOTEL DSP";
		a[10][1]=rooms[10]="non AC room\t\t";
		a[10][2]="80\t\t";
		a[10][3]="55\t\t";
		a[10][4]="8\t\t";
		a[10][5]="120\t\t";
		a[10][6]="25\t\t";
	System.out.println("hotel name\t\taddress\t\t\t\tstar rating\tno of room types");
	 for(int i=0;i<4;i++)
	 {
		 System.out.print(add[i]+"\t"+address[i]+"\t\t"+s[i]+"\t"+rt[i]+"\n");
	 }
	 System.out.println("hotel\t\troom type\tregular price\tsale price\tmax occupancy\tno.of rooms\tno.of vanacies\n");
	 for(int i=0;i<11;i++)
	 {
		 for(int j=0;j<7;j++)
		 {
			 System.out.print(a[i][j]+"   ");
		 }
		 System.out.print("\n");
	 }
	}
	void cheap()
	{
		System.out.println("the cheapest room available in any hotel is at  ");
		 int small=r[0];
		 for(int i=0;i<11;i++)
		 {
			 
			 if(r[i]<=small)
			 {
				 small=r[i];
			 }
		 }
	     for(int i=0;i<11;i++)
	     {
	    	 if(small==r[i])
	    	 {
	    		 for(int j=0;j<7;j++)
	    		 {
	    			
	    		 
	    			 if(j==1)
	    			 {
	    				 System.out.println("room type is : "+a[i][j]);
	    				 
	    			 }
	    			 else
	    			 {
	    				if(j==2)
	    				{
	    					System.out.println("regular price is: "+a[i][j]);
	    				}
	    				else
	    				{
	    					if(j==3)
	    					{
	    						System.out.println("sale price is "+a[i][j]);
	    					}
	    					else
	    					{
	    						if(j==4)
	    						{
	    							System.out.println("occupancy are "+a[i][j]);
	    						}
	    						else
	    						{
	    							if(j==5)
	    							{
	    								System.out.println("no of rooms are :"+a[i][j]);
	    							}
	    							else
	    							{
	    								if(j==6)
	    								{
	    								System.out.println("no of vanacies :"+a[i][j]);
	    								}
	    								else
	    								{
	    									System.out.println("hotel is "+a[i][j]);
	    								}
	    							}
	    							
	    						}
	    					}
	    				}
	    			 }
	    		 
	    		 }
	    	 }
	     }
	}
	void match()
	{	

		
	
		System.out.print("enter minimum occupancy :");
		int occu=Sc.nextInt();
		System.out.print("enter regular price :");
		int reg=Sc.nextInt();
		System.out.print("minimum stars requried:");
		int star=Sc.nextInt();
		Sc.nextLine();
		int flag = 0;
		for(int i=0;i<11;i++)
	     {
			
	    	if(occu<=o[i]&&reg>=r[i]&&star<=st[i])
	    	{
	    		flag=1;
	    		pos=i;
	    	}
	    	else
	    	{
				flag=0;
			}
	     
		 if(flag==1)
		 {
			 for(int j=0;j<7;j++)
    		 {
    			
    		 
    			 if(j==1)
    			 {
    				 System.out.println("room type is : "+a[pos][j]);
    				 
    			 }
    			 else
    			 {
    				if(j==2)
    				{
    					System.out.println("regular price is: "+a[pos][j]);
    				}
    				else
    				{
    					if(j==3)
    					{
    						System.out.println("sale price is "+a[pos][j]);
    					}
    					else
    					{
    						if(j==4)
    						{
    							System.out.println("occupancy are "+a[pos][j]);
    						}
    						else
    						{
    							if(j==5)
    							{
    								System.out.println("no of rooms are :"+a[pos][j]);
    							}
    							else
    							{
    								if(j==6)
    								{
    								System.out.println("no of vanacies :"+a[pos][j]);
    								}
    								else
    								{
    									System.out.println("hotel is "+a[i][j]);
    								}
    							}
    							
    						}
    					}
    				}
    			 }
    		 
    		 }
    	 }
		 }
	     if(flag==0)
	     {
	    	 System.out.println("no room for those conditions!!!!");
	     }
	     
	}
	void sale()
	{
	while(it1!=1)
	{	int sp1;
		System.out.println("enter hotel name  :");
		hname=Sc.nextLine();
		if(hname.compareTo(add[0])==0||(hname.compareTo(add[1]))==0||(hname.compareTo(add[2]))==0||(hname.compareTo(add[3])==0))
		{		
		
			if(hname.compareTo(add[0])==0)
			{
				it1=1;
				System.out.println("1.executive studio \n2.standrad room\n3.family room \n enter the choice  from (1-3) :  ");
				c1=Sc.nextInt();
				Sc.nextLine();
				switch(c1)
				{
				case 1 : while(it3!=1)
							{
								System.out.print("enter the amt b/w 105 and 210 : ");
								sp1=Sc.nextInt();
								Sc.nextLine();
								if(sp1>=105&&sp1<=210)
								{
									System.out.println("sale price was updated ");
									it3=1;
									a[0][3]=String.valueOf(sp1);
								}
								else
								{
									System.out.print("enter the amt b/w 105 and 210 : ");
									sp1=Sc.nextInt();
									Sc.nextLine();
									
								}
							}
						break;
				case 2: while(it4!=1)
							{
								System.out.print("enter the amt b/w 90 and 180 : ");
								sp1=Sc.nextInt();
								Sc.nextLine();
								if(sp1>=90&&sp1<=180)
								{
									System.out.println("sale price was updated ");
									it4=1;
									a[1][3]=String.valueOf(sp1);
								}
								else
								{
									System.out.print("enter the amt b/w 90 and 180 : ");
									sp1=Sc.nextInt();
									Sc.nextLine();
									
								}
							}
						break;
				case 3: while(it5!=1)
							{
								System.out.println("enter the amt b/w 110 and 220 : ");
								sp1=Sc.nextInt();
								Sc.nextLine();
								if(sp1>=110&&sp1<=220)
								{
									System.out.println("sale price was updated ");
									it5=1;
								}
								else
								{
									System.out.print("enter the amt b/w 110 and 220 : ");
									sp1=Sc.nextInt();
									Sc.nextLine();
								}
							}
				default : System.out.print("enter the number b/w 1-3  : ");
				c1=Sc.nextInt();
				Sc.nextLine();		
				}
			}
			if(hname.compareTo(add[1])==0)
			{
				it1=1;
				System.out.println("1.executive studio \n2.standrad room\n3.family room \n enter the choice  from (1-3) :  ");
				c2=Sc.nextInt();
				Sc.nextLine();
				switch(c2)
				{
				case 1 : while(it3!=1)
							{
								System.out.print("enter the amt b/w 117 and 235 : ");
								sp2=Sc.nextInt();
								Sc.nextLine();
								if(sp2>=117&&sp2<=235)
								{
									System.out.println("sale price was updated ");
									it3=1;
								}
								else
								{
									System.out.print("enter the amt b/w 117 and 235 : ");
									sp2=Sc.nextInt();
									Sc.nextLine();
									
								}
							}
						break;
				case 2: while(it4!=1)
							{
								System.out.print("enter the amt b/w  102 and 205 : ");
								sp2=Sc.nextInt();
								Sc.nextLine();
								if(sp2>=102&&sp2<=205)
								{
									System.out.println("sale price was updated ");
									it4=1;
								}
								else
								{
									System.out.print("enter the amt b/w 102 and 205 : ");
									sp2=Sc.nextInt();
									Sc.nextLine();
									
								}
							}
						break;
				case 3: while(it5!=1)
							{
								System.out.println("enter the amt b/w 175 and 350 : ");
								sp2=Sc.nextInt();
								Sc.nextLine();
								if(sp2>=175&&sp2<=350)
								{
									System.out.println("sale price was updated ");
									it5=1;
								}
								else
								{
									System.out.print("enter the amt b/w 175 and 350 : ");
									sp2=Sc.nextInt();
									Sc.nextLine();
								}
							}
				default : System.out.print("enter the number b/w 1-3  : ");
				c2=Sc.nextInt();
				Sc.nextLine();
				}
			}
		
			if(hname.compareTo(add[2])==0)
			{
				it1=1;
				System.out.println("1.ultra luxury room\n2.etilist studio\n3.penthouse Apartment\n4.Glod plated luxury\n enter the choice  from (1-4) :  ");
				c3=Sc.nextInt();
				Sc.nextLine();
				switch(c3)
				{
				case 1 : while(it3!=1)
							{
								System.out.print("enter the amt b/w 445 and 890 : ");
								sp3=Sc.nextInt();
								Sc.nextLine();
								if(sp3>=445&&sp3<=890)
								{
									System.out.println("sale price was updated ");
									it3=1;
								}
								else
								{
									System.out.print("enter the amt b/w 445 and 890 : ");
									sp3=Sc.nextInt();
									Sc.nextLine();
									
								}
							}
						break;
				case 2: while(it4!=1)
							{
								System.out.print("enter the amt b/w 700 and 1400 : ");
								sp3=Sc.nextInt();
								Sc.nextLine();
								if(sp3>=700&&sp3<=1400)
								{
									System.out.println("sale price was updated ");
									it4=1;
								}
								else
								{
									System.out.print("enter the amt b/w 700 and 1400 : ");
									sp3=Sc.nextInt();
									Sc.nextLine();
									
								}
							}
						break;
				case 3: while(it5!=1)
							{
								System.out.println("enter the amt b/w 600 and 1200 : ");
								sp3=Sc.nextInt();
								Sc.nextLine();
								if(sp3>=600&&sp3<=1200)
								{
									System.out.println("sale price was updated ");
									it5=1;
								}
								else
								{
									System.out.print("enter the amt b/w 600 and 1200 : ");
									sp3=Sc.nextInt();
									Sc.nextLine();
								}
							}break;
				case 4: while(it6!=1)
						{
							it1=1;
							System.out.print("enter the amt b/w 899 and 1799 : ");
							sp3=Sc.nextInt();
							Sc.nextLine();
							if(sp3>=899&&sp3<=1799)
							{
								System.out.println("sale price updated ");
								it6=1;
							}
							else
							{
								System.out.print("enter the amt b/w 899 and 1799 : ");
								sp3=Sc.nextInt();
								Sc.nextLine();
							}
						}
				break;
					
				default : System.out.print("enter the number b/w 1-4  : ");
				c3=Sc.nextInt();
				Sc.nextLine();
							
				}
			}
			if(hname.compareTo(add[3])==0)
			{
				it1=1;
				System.out.println("1.family room enter 1 to conform it  :  ");
				c4=Sc.nextInt();
				Sc.nextLine();
				switch(c4)
				{
				case 1 : while(it3!=1)
							{
								System.out.print("enter the amt b/w 40 and 80 : ");
								sp4=Sc.nextInt();
								Sc.nextLine();
								if(sp4>=40&&sp4<=80)
								{
									System.out.println("sale price was updated ");
									it3=1;
								}
								else
								{
									System.out.print("enter the amt b/w 40 and 80 : ");
									sp1=Sc.nextInt();
									Sc.nextLine();
									
								}
							}
						break;
				default : System.out.print("enter the number  : ");
							
				}
			}
		}
		else
		{
			System.out.print("you entered the wrong hotel name \nplease try again!!\nenter the correct hotel name : ");
			
		}
	}
	
}
}

public  class hotelmanagement
{
public static void main(String []args) {	
		System.out.println("welcome to the hotel recommendation System.\n"+"developed by kaushik\tStudent ID :1210316530");	
		hotel1 h=new hotel1();
		Scanner Sc = new Scanner(System.in);		
		while(true)
		{
			System.out.println("please select an option from the menu");
			System.out.println("1.display all hotels\n2.find the cheapest room\n3.set a sale price\n4.find rooms matching criteria \n5.exit  ");
			int choice = Sc.nextInt();
			Sc.nextLine();
			switch(choice)
			{
			case 1 :h.hotel();
					 break;
			case 2 : h.cheap();
				         break;
			case 3 : h.sale();					 				 
					 break;	
			case 4 :h.match();
					 break;
					 
					 
				
			case 5 :
				System.exit(0);
			}
		}
	}
}