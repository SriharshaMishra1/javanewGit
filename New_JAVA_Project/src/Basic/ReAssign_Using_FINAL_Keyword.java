package Basic;

public class ReAssign_Using_FINAL_Keyword {
		
		String studentName="Sriharsha";
		static String clr_dress="Blue";
		int Rollno;
		static int i4=2400;

		
		
		public ReAssign_Using_FINAL_Keyword(String nickname)
		{
			this.studentName=nickname;
			System.out.println("nick name of student is "+studentName);
		}
		
		public double score()
		{
			int i, i1,i2,i3,i4;
		    i4=2400;
			i1=406;
			i2=411;
			i3=524;
			i=(i1+i2+i3);
			System.out.println("Obtained Total marks is "+i);
			double total=i4/i;
			return total; 
			
		}
		public static void main(String[] args) {
			
			final long regdno=10013061000l;
			
			ReAssign_Using_FINAL_Keyword obj=new ReAssign_Using_FINAL_Keyword("deepu");
			obj.studentName="sriharsha mishra";
			System.out.println("certificate name is "+obj.studentName);
			obj.Rollno=54;
			System.out.println("Total score by the student is "+obj.score()+" OutOf 5.0 by "+i4);
			System.out.println("Dress clr is "+ReAssign_Using_FINAL_Keyword.clr_dress);
			System.out.println("registration no is "+regdno);
		}
	


	}


