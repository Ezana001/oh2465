public class Main
{
    public static void main(String[] args)
    {
       Shape s = new Shape() ;
       s.accept();
        if (s.menuChoice == 1 )
        {

            Circle c = new Circle();
            c.colorSetter();
            c.acceptRadius();
            c.calculateArea();
            c.calculatePerimeter();
            c.display();
        }
        else if (s.menuChoice == 2)
        {
            Rectangle r = new Rectangle();
            r.colorSetter();
            r.acceptLengthWidth();
            r.calculateArea();
            r.calculatePerimeter();
            r.display();
        }
        else if (s.menuChoice == 3)
        {
            Triangle t = new Triangle();
            t.colorSetter();
            t.acceptBaseHeight();
            t.calculateArea();
            t.calculatePerimeter();
            t.display();
        }


    }
}

