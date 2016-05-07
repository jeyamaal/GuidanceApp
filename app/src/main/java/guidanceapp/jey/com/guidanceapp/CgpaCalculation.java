package guidanceapp.jey.com.guidanceapp;

/**
 * Class for CGPA calculation
 *
 * Created by Jeyamaal on 11-Mar-16.
 */
public class CgpaCalculation  {


            /** Calculate first semester gpa according to  no of credits
             *
             * @param first
             * @return
             */


            public double get1stsemCGPA(double first){

                double result=(4*(first*4)+5*first)/21.0;

                return result;
            }


            /**
             * Calculate second semester cgpa according to  no of credits
             *
             * @param first
             * @param second
             * @return
             */

            public double get2ndsemCGPA(double first,double second){

                double result=(((4*(second*4)+3*second)/19.0)+get1stsemCGPA(first))/2.0;

                return result;
            }

            /**
             * Calculate third semester cgpa according to  no of credits
             * @param first
             * @param second
             * @param third
             * @return
             */


            public double get3rdsemCGPA(double first,double second,double third){

                double result=((third)+get2ndsemCGPA(first,second))/2.0;

                return result;
            }

            /**
             * Calculate ffourth semester cgpa according to  no of credits
             *
             * @param first
             * @param second
             * @param third
             * @param fourth
             * @return
             */


            public double get4thsemCGPA(double first,double second,double third,double fourth){

                double result=((fourth)+get3rdsemCGPA(first,second,third))/2.0;

                return result;
            }

}
