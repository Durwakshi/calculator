package com.company;

public class dd_lec_14_strmethod {
    public static void main(String[] args) {
        String name = "Durwa";
        System.out.println(name);

        //1.length
        System.out.println(name.length());

        //2. toLowerCase
        System.out.println(name.toLowerCase());

        //3. toUpperCase
        String tup = name.toUpperCase();
        System.out.println(tup);

        // 4 trim
        String a = "     deeee     ";
        System.out.println(a.trim());

        //5. substring(int start)
        System.out.println(name.substring(2));

        //6. substring(int start, int end)
        System.out.println(name.substring(0,3));//end is not included

        //7. replace( , )
        System.out.println(name.replace('u','a'));
        System.out.println(name.replace("urwa","hairya"));//"" bcoz string

        //8. startsWith
        System.out.println(name.startsWith("du"));

        //9 endsWith
        System.out.println(name.endsWith("ya"));

        //10.charAt
        System.out.println(name.charAt(3));

        //11. indexOf
        System.out.println(name.indexOf("u"));
        System.out.println(name.indexOf("wa"));
        System.out.println(name.indexOf("u",3));

        //12 lastIndexOf
        System.out.println(name.lastIndexOf("w"));

        //13. equals
        System.out.println(name.equals("durwa"));

        //14. equalsIgnoreCase
        System.out.println((name.equalsIgnoreCase("DURwa")));




      //escape sequence char
        System.out.println("my name is \"durwa");


    }
}
