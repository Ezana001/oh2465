import java.util.Scanner;
 public  class  Shape {
   protected String colorIdentifier;
   protected   int color,menuChoice;
    protected void   accept ()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("------MENU------");
        while (menuChoice < 1 || menuChoice > 3)
        {
            System.out.println("CHOOSE THE TYPE OF THE SHAPE!");
            System.out.println("1.CIRCLE\n2.RECTANGLE\n3.TRIANGLE\n");
            System.out.print("Choice:");
            menuChoice = input.nextInt();
            if (menuChoice < 1 || menuChoice > 3)
            {
                System.out.println("ENTER VALID COLOR");
            }
        }
    }

   protected void display ()
    {
        System.out.println("THE COLOR OF THE CIRCLE IS "+ colorIdentifier);

    }
    protected void colorSetter()
    {
        Scanner input = new Scanner(System.in);
        //color must be string for after ward operation
        while (color < 1 || color > 3)
        {
            System.out.println("ENTER THE COLOR OF THE SHAPE");
            System.out.println("1.RED\n2.BLUE\n3.GREEN\n");
            System.out.print("Choice:");
            color = input.nextInt();
            if (color < 1 || color > 3)
            {
                System.out.println("ENTER VALID COLOR");
            }
            else if (color == 1)
            {
                colorIdentifier= "RED";
            }
            else if (color == 2)
            {
                colorIdentifier = "BLUE";
            }
            else
            {
                colorIdentifier = "GREEN" ;
            }
        }
    }

}