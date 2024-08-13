import java.io.*;
import java.util.*;

public class employee {
    String first_name;
    String last_name;
    Double sallary;

    employee(String f_n, String l_n, Double s_l)
    {
        this.first_name = f_n;
        this.last_name = l_n;
        this.sallary = s_l;

    }


    public void setfirst_name(String f1)
    {
        this.first_name = f1;
    }
    
    public String getfirst_name(){
        return first_name;
    }

    public void setlast_name(String l1)
    {
        this.last_name = l1;
    }

    public String getlast_name()
    {
        return last_name;
    }

    public void setsallary(Double d1)
    {
        this.sallary = d1;

    }
    public Double getsallary()
    {
        return sallary;
    }

    public Double Raise(Double rs)
    {
        Double temp1 = (this.sallary * rs)/100;
        this.sallary = (this.sallary+temp1);
        return this.sallary;
        
    }

}

class employee_test{
    public static void main(String args[])
    {
        employee e1 = new employee("Pratik", "Kale", 5000.0);

        e1.setfirst_name("Rishabh");
        System.out.println(e1.getfirst_name());
        
        e1.setlast_name("Mehta");
        System.out.println(e1.getlast_name());
        

        e1.setsallary(9000.0);

        System.out.println(e1.getsallary());

      
        double temp_sal = e1.Raise(10.0);
        e1.setsallary(temp_sal);
        System.out.println(e1.getsallary());



    }
}
