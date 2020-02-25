import java.util.Scanner;
import java.util.logging.Logger;
class Main
{
    public static void main(String [] args)
    {

        Scanner s = new Scanner(System.in);
        Logger logg = Logger.getLogger(Main.class.getName());


        logg.info("Enter your choice: \n1.Interest \n2.House-construction\n");
        int option = s.nextInt();
        if(option==1)
        {
            logg.info("Enter principle amount:\n");
            double principleamount = s.nextDouble();
            logg.info("Enter time period:\n");
            int time = s.nextInt();
            logg.info("Enter rate of interest:\n");
            double rate = s.nextDouble();
            logg.info("Enter your choice: \n1.Simple \n2.Compound\n");
            int  choice = s.nextInt();

            if(choice==1)
            {
                Interest simple = new Interest(principleamount,time,rate);
                double res1=simple.simple_interest();
                logg.info("Total Interest: "+res1);

            }
            else if(choice==2)
            {
                Interest simple = new Interest(principleamount,time,rate);
                double res1 = simple.compound_interest();
                logg.info("Total Interest: "+res1);
            }
            else
            {
                logg.info("Please enter valid input..");
            }
        }

        else if(option==2)
        {
            logg.info("Enter material type(standard/above-standard/high-standard):\n");
            String material = s.next();
            logg.info("Enter total area:\n");
            double area = s.nextDouble();
            logg.info("is house fully automated or not?(yes/no):\n");
            String automated = s.next();


            House_Construction house = new House_Construction(material,area,automated);
            double res2=house.total_construction_cost();
            logg.info("Total amount needed to construct house: "+res2);
        }
        else
        {
            logg.info("Please enter valid input...");
        }
    }
}
