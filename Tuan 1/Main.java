package com.company;
import java.util.Locale;
public class Main {
    public static void vietHoa(String args)
    {
        String []arr =args.split(" ");
        String chuoi="";
        for (String name:arr)
        {
            if(name.length()>0)
            {
                name = name.replaceFirst(name.charAt(0)+"",(name.charAt(0)+"").toUpperCase());
                chuoi = chuoi + name +" ";
            }
        }
        System.out.println(chuoi);
    }


    public static void main(String[] args) {
        vietHoa("lop hoc java. bat dau luc muoi hai gio");
    }

}
