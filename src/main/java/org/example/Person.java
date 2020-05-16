package org.example;

import java.security.PublicKey;

public class Person {
    //Thuoc tinh/Bien thanh vien/ Bien Instant
    public String Name;
    public String Ho;
    public int Tuoi;

    public Person(String Name, String Ho, int Tuoi)
    {
        this.Name = Name;
        this.Tuoi = Tuoi;
        this.Ho = Ho;
    }

    public static PersonBuilder withName(String Name)
    {
        return new PersonBuilder(Name);
    }

    public void ShowData()
    {
        System.out.println("Xin chao ban: "+this.Ho +" "+ this.Name);
        System.out.println("Tuoi cua ban la: "+ this.Tuoi);
    }

    public static class PersonBuilder
    {
        private String Name;
        private String Ho;
        private int Tuoi;
        public PersonBuilder(String Name)
        {
            this.Name = Name;
        }

        public PersonBuilder andHo(String Ho)
        {
            this.Ho = Ho;
            return this;
        }

        public PersonBuilder andTuoi(int tuoi)
        {
            this.Tuoi = tuoi;
            return this;
        }

        public Person Build()
        {
            return new Person(this.Name, this.Ho, this.Tuoi);
        }
    }
}
