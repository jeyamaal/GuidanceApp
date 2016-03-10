package guidanceapp.jey.com.guidanceapp;

/**
 * Created by Jeyamaal on 11-Mar-16.
 */
public class CgpaCalculation  {



    public double get1stsemCGPA(double first){

        double result=(4*(first)+5*first)/5.0;

        return result;
    }

    public double get2ndsemCGPA(double first,double second){

        double result=(second*19+get1stsemCGPA(first))/2.0;

        return result;
    }


    public double get3rdsemCGPA(double first,double second,double third){

        double result=(third*20+get2ndsemCGPA(first,second))/3.0;

        return result;
    }


    public double get4thsemCGPA(double first,double second,double third,double fourth){

        double result=(fourth*20+get3rdsemCGPA(first,second,third))/4.0;

        return result;
    }

}
