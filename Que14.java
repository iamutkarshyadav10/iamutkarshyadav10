class Que14
{
  public static void main(String args[]) 
  {
   for (int i = 1; i <= 15; i++) 
   {
        for (int j = 1; j <= 47; j++) 
		{
          if(i < 9 && j < 12)
		      {
              if((i+j)%2 == 0 && j != 11)
			  {
                 System.out.print("*");
			  }
              else 
			  {
                 System.out.print(" ");
			  }
        } 
		  else 
		  {
             System.out.print("=");
          }
    }
        System.out.println();
  }  
}
}