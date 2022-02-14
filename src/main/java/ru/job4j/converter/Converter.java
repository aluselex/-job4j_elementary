package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rls = value / 70;
        return rls;
    }

    public static float rubleToDollar(float value) {
        float rls = value / 60;
        return rls;
    }

    public static void main(String[] args) {
      float euro = Converter.rubleToEuro(140);
      float dollar = Converter.rubleToDollar(140);
      System.out.println("140 rubles are " + euro + " euro.");
      System.out.println("140 rubles are " + dollar + " dollar.");
      float in = 140;
      float expected = 2;
      float out = Converter.rubleToEuro(in);
      boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        expected = 140 / 60f;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println("140 rubles are 140/60. Test result : " + passed);

    }

}
