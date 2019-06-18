package Basic;

public class Parten7 {
	public static void main(String[] args) {

		for (int i = 1; i <= 4; i++) {
			for (int j = 4; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}

		System.out.println("...............");

		for (int i = 4; i >= 1; i--) {
			for (int j = 4; j >= 1; j--) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println("...............");

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println("...............");

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}

		System.out.println("...............");

		for (int i = 4; i >= 1; i--) {
			for (int j = 4; j >= i; j--) {

				System.out.print(i);
			}
			System.out.println();
		}

		System.out.println("...............");

		for (int i = 4; i >= 1; i--) {
			for (int j = 4; j >= i; j--) {
				System.out.print(j);
			}
			System.out.println();
		}

		System.out.println("...............");

		for (int i = 1; i <= 4; i++) {
			for (int j = 3; j >= i; j--) {
				System.out.print("-");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println("...............");

		for (int i = 4; i >= 1; i--) {
			for (int j = i; j > 1; j--) {
				System.out.print("-");
			}
			for (int k = i; k <= 4; k++) {
				System.out.print(k);
			}
			System.out.println();
		}

		System.out.println("...............");
		for (int i = 4; i >= 1; i--) {
			for (int j = 3; j >= i; j--) {
				System.out.print("");
			}
			for (int k = 4; k >= i; k--) {
				System.out.print(k);
			}
			System.out.println();
		}

		System.out.println("...............");
		for (int i = 1; i <= 5; i++) {
			for (int j = i; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = i; k <= 5; k++) {
				System.out.print(k);
			}
			System.out.println();
		}

		System.out.println("...............");

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("-");
			}
			for (int k = 5; k >= i; k--) {
				System.out.print(k);
			}
			System.out.println();
		}

		System.out.println("...............");

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("");
			}
			for (int k = 5; k >= i; k--) {
				System.out.print(k);
			}
			System.out.println();
		}

		System.out.println("...............");

		for (int i = 5; i >= 1; i--) {
			for (int j = i; j <= 4; j++) {
				System.out.print("-");
			}
			for (int k = i; k >= 1; k--) {
				System.out.print(k);
			}
			System.out.println();
		}
		System.out.println("...............");

		int num = 1, row = 4;
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("" +num + " ");
				++num;
			}
			System.out.println();
		}

		System.out.println("...............");

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if ((i == 1 && j == 1) || (i == 1 && j == 5) || (i == 2 && j == 2) || (i == 2 && j == 4)
						|| (i == 3 && j == 3) || (i == 4 && j == 2) || (i == 4 && j == 4) || (i == 5 && j == 1)
						|| (i == 5 && j == 5)) {
					System.out.print("x ");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		System.out.println("....................");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if ((i == 1 || j == 1) || (i == 5 || j == 5)) {
					System.out.print("x");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();

		}
		System.out.println("...................");

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 4; k >= i; k--) {
				System.out.print("*");
			}
			for (int l = 3; l >= i; l--) {
				System.out.print("*");
			}

			System.out.println();
		}

				
		for(int i=2;i<=4;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
		
			for(int l=2;l<=i;l++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("...........");
		
		for(int i=1;i<=4;i++)
		{
			for(int j=3;j>=i;j--)
			{
				System.out.print("-");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=3;k>=i;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("..............");
		
		
		
		for(int i=1;i<=4;i++ )
		{
			for(int j=1;j<=7;j++)
			{
				if((i==1&&j==4)||(i==2&&j==3)||(i==2&&j==5)||
						(i==3&&j==2)||(i==3&&j==6)||(i==4&&j==1)||
						(i==4&&j==2)||(i==4&&j==3)||(i==4&&j==4)||
						(i==4&&j==5)||(i==4&&i==6)||(i==4&&j==7))
				{
					System.out.print("x");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
				
		System.out.println("....................");
		int no=5;
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("-");
			}
			for(int k=no;k>=1;k--)
			{
				System.out.print(no);
			}
			System.out.println();
			no=no-2;
		}
		System.out.println("..................");
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
       System.out.println(".........................");
       for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
      System.out.println("......................");
  	
		for(int i=1;i<=4;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
		
			for(int l=2;l<=i;l++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("..................");
		for(int i=1;i<=4;i++)
		 {
			 for(int j=1;j<=i;j++)
			 {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
		 for(int i=1;i<=4;i++) {
			 for(int j=3;j>=i;j--)
			 {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
		 System.out.println("...................");
			for(int i=1;i<=4;i++)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print(" ");
				}
				
				for(int l=4;l>=i;l--)
				{
					System.out.print("*");
				}
				for(int k=3;k>=i;k--)
				{
					System.out.print("*");
				}
				System.out.println();
		
			}
			System.out.println("...............");
			for(int i=1;i<=4;i++)
			{
				for(int j=3;j>=i;j--)
				{
					System.out.print(" ");
				}
				for(int k=1;k<=i;k++)
				{
					System.out.print(" *");
				}
				System.out.println();
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}

		
	
}
