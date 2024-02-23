package array_Programs;
public class Array_Class1 
{

	public static void main(String[] args) 
	{
		String Name[]=new String[4];
		Name[0]="Ram";
		Name[1]="Minakshi";
		Name[2]="Rahul";
		Name[3]="Suraj";
		int Age[]=new int[4];
		Age[0]=11;
		Age[1]=45;
		Age[2]=56;
		Age[3]=78;
		int mob_no[]=new int[4];
		mob_no[0]=78654390;
		mob_no[1]=876541234;
		mob_no[2]=786548760;
		mob_no[3]=876541234;
		String Email_id[]=new String[4];
		Email_id[0]="deshkjhgrwqa@tyu";
		Email_id[1]="deshkjhgrwqa@tyu";
		Email_id[2]="deshkjhgrwqa@tyu";
		Email_id[3]="deshkjhgrwqa@tyu";
		System.out.println("Name"+"  "+"Age"+"  "+"mob_no"+"    "+"Email_id");
		for(int i=0;i<=3;i++)
		{
			System.out.println(Name[i]+"   "+Age[i]+"   "+mob_no[i]+"  "+Email_id[i]);
		}
		

	}

}
