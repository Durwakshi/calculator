package com.company;


class GetSet{
    int id;
    String name;
    public int getId(){
        return id;
    }

    public String getName() {
        return name;
    }
    public void setName(String n){
        name =n;
    }

    public void setId(int i) {
        id = i;
    }
}
public class dd_lec_40_gettersetter {
    public static void main(String[] args) {
     GetSet harry = new GetSet();
     harry.setId(454);
     harry.setName("durwakshi");
        System.out.println(harry.getName());
        System.out.println(harry.getId());
    }
}
