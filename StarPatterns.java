/**
 * This program makes little pictures using stars. These methods
 * are so much fun to write.
 *
 * (Look in the StarInstructions.txt file to see what each method
 *  should draw.)
 *
 * @author  [          ] <-- you
 * @version [          ] <-- today
 */


public class StarPatterns 
{
    public static int findNthPrime(int n)
    {
        int count = 1;
        int i = 3;
        while (count < n) {
            boolean isPrime = true;
            for (int j=2;j<i;j++) {
                if (i%j==0) isPrime = false;
            }
            if (isPrime) count++;
            i++;
        }
        return i-1;
    }
    
    public static int findFibonacciAt(int n)
    {
        int count = 2;
        int i = 1;
        int j = 1;
        while (count < n) {
            int k = i + j;
            i = j;
            j = k;
            count++;
        }
        return j;
    }
    public static void starGrid(int h, int w)
    {           
        for (int i=0; i<h; i++)
        {
            for (int j=0; j<w; j++)
            {               
                System.out.print(i + "" + j + " ");
            }
            System.out.println();
        }   
    }
    
    public static void starBox(int h, int w)
    {
        for (int i=0; i<h; i++)
        {
            for (int j=0; j<w; j++)
            {   
                if (i==0 || i==h-1 || j==0 || j==w-1) System.out.print("*");
                else System.out.print(" ");
                //System.out.print(i + "" + j + " ");
            }
            System.out.println();
        }   
    }

    public static void starX(int h)
    {
        int w = h;

        for (int i=0; i<h; i++)
        {
            for (int j=0; j<w; j++)
            {
                if (i==j || i+j==h-1) System.out.print("*");
                else System.out.print(" ");
                //System.out.print(i + "" + j + " ");
            }
            System.out.println();
        }   
    }
    
    public static void starZ(int h)
    {
        int w = h;
        
        for (int i=0; i<h; i++)
        {
            for (int j=0; j<w; j++)
            {
                if (i==0 || i==h-1 || i+j==h-1) System.out.print("*");
                else System.out.print(" ");
                //System.out.print(i + "" + j + " ");
            }
            System.out.println();
        }
    }

    public static void starXBox(int h)
    {
        int w = h;
        
        for (int i=0; i<h; i++)
        {
            for (int j=0; j<w; j++)
            {
                if (i==0 || i==h-1 || j==0 || j==w-1 || i==j || i+j==h-1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void twoStarBoxes(int h, int w)
    {
        for (int i=0; i<h; i++)
        {
            for (int j=0; j<w; j++)
            {
                if (i<h/2 && j<w/2 || j>=w/2 && i>=h/2) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void starTriangle(int h)
    {
        int w = h;
        
        for (int i=0; i<h; i++)
        {
            for (int j=0; j<w; j++)
            {
                if (j<=i) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void emptyTriangle(int h)
    {
        int w = h;
        
        for (int i=0; i<h; i++)
        {
            for (int j=0; j<w; j++)
            {
                if (j==i || j==0 || i==h-1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void starTriangleUR(int h)
    {
        int w = h;
        
        for (int i=0; i<h; i++)
        {
            for (int j=0; j<w; j++)
            {
                if (i<=j) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void isoscelesStarTriangle(int h)
    {
        int w = h * 2;
        
        for (int i=0; i<h; i++)
        {
            for (int j=0; j<w; j++)
            {
                if (j<=(w/2)+i && j>=(w/2)-i) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
    
    public static void checkerBoard(int h, int w)
    {
        
        for (int i=0; i<h; i++)
        {
            for (int j=0; j<w; j++)
            {
                if (i%2==0 && j%2==0 || i%2==1 && j%2==1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void biggerCheckerBoard(int h, int w)
    {
        h*=3;
        w*=3;
        
        for (int i=0; i<h; i++)
        {
            for (int j=0; j<w; j++)
            {
                if (i/3%2==0 && j/3%2==0 || i/3%2==1 && j/3%2==1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void upsideDownCheckeredTriangle(int h)
    {
        int w = h * 2;
        
        for (int i=0; i<h; i++)
        {
            for (int j=0; j<w; j++)
            {
                if ((j>=i && j<(w)-i) && (i%2==0 && j%2==0 || i%2==1 && j%2==1)) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void primeStars(int h)
    {
        int w = findNthPrime(h);
        
        for (int i=0; i<h; i++)
        {
            for (int j=0; j<w; j++)
            {
                if (j<=findNthPrime(i+1)-1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void fibonacciStars(int h)
    {
        int w = findFibonacciAt(h);
        
        for (int i=0; i<h; i++)
        {
            for (int j=0; j<w; j++)
            {
                if (j<=findFibonacciAt(i+1)-1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void starFlag()
    {
        int h = 13;
        int w = 17 + 20;
        
        for (int i=0; i<h; i++)
        {
            for (int j=0; j<w; j++)
            {
                if (j<=17 && i<=7) System.out.print("*");
                else if (i%2==0) System.out.print("R");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) 
    {
        starGrid(5, 5);
        System.out.println();

        starBox(7, 9);
        System.out.println();
        
        starX(7);
        System.out.println();
        
        starZ(7);
        System.out.println();
            
        starXBox(9);
        System.out.println();
        
        twoStarBoxes(8, 14);
        System.out.println();
        
        starTriangle(6);
        System.out.println();
        
        emptyTriangle(6);
        System.out.println();
        
        starTriangleUR(8);
        System.out.println();
        
        isoscelesStarTriangle(5);
        System.out.println();
        
        checkerBoard(5, 8);
        System.out.println();
        
        biggerCheckerBoard(7, 9);
        System.out.println();
        
        upsideDownCheckeredTriangle(7);
        System.out.println();
        
        System.out.println(findNthPrime(7));
        System.out.println();
        
        primeStars(7);
        System.out.println();
        
        System.out.println(findFibonacciAt(6));
        System.out.println();
        
        fibonacciStars(7);
        System.out.println();
        
        starFlag();
        System.out.println();
    }
     
}