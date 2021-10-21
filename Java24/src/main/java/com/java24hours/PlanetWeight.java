package com.java24hours;

class PlanetWeight {
    public static void main(String[] arguments) {
        System.out.print("Twoja waga na Ziemi wynosi ");
        double weight = 81;
        System.out.println(weight);
        
        System.out.print("Twoja waga na Merkurym wynosi ");
        double mercury = weight * .378;
        System.out.println(mercury);
        
        System.out.print("Twoja waga na Księżycu wynosi ");
        double moon = weight * .166;
        System.out.println(moon);
        
        System.out.print("Twoja waga na Jowiszu wynosi ");
        double jupiter = weight * 2.364;
        System.out.println(jupiter);
        
        System.out.print("Twoja waga na Wenus ");
        double venus = weight * .907;
        System.out.println(venus);
        
        System.out.print("Twoja waga na Uranie ");
        double uranus = weight * .889;
        System.out.println(uranus);
    }
}
