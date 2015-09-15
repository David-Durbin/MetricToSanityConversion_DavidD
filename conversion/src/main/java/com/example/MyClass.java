package com.example;

//import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

public class MyClass
{

    public static void main(String[] args)
    {

        // constants
        final int inchesPerFoot = 12;
        final int ouncesPerPound = 16;
        final double inchesPerMeter = 39.370; // multiply meters by this then divide by 12 for feet
        final double milesPerKilometer = 0.62137; // multiply kilometers by this for miles
        final double centimetersPerInch = 0.39370; // multiply CM by this for inches
        final double kilosToOunces = 35.274;  // multiply kilos by this then divide by 16 for lbs
        final double gallonsPerLiter = 0.26417; // multiply liters by this for gallons
        final double feetpersecToKpH = 0.9113444;  // multiply KpH by this for ft/s

        // input variables
        int meters = 28;
        int kilometers = 168;
        int centimeters = 47;
        int kph = 27;
        int kilos = 92;
        int liters = 200;

        System.out.println(meters + " meters equals " + (int) (meters * inchesPerMeter / inchesPerFoot) + " feet "
        + (int) (meters * inchesPerMeter % inchesPerFoot) + " inches." );
        System.out.println(kilometers + " kilometers equals " + Math.round(kilometers * milesPerKilometer) + " miles.");
        System.out.println(centimeters + " centimeters equals " + Math.round(centimeters * centimetersPerInch) + " inches.");
        System.out.println(kph + " kilometers per second equals " + Math.round(kph * feetpersecToKpH) + " feet per second.");
        System.out.println(kilos + " kilograms equals " + (int) (kilos * kilosToOunces / ouncesPerPound) + " pounds "
        + Math.round(kilos * kilosToOunces % ouncesPerPound) + " ounces.");
        System.out.println(liters + " liters equals " + liters * gallonsPerLiter + " gallons.");

    }
}
