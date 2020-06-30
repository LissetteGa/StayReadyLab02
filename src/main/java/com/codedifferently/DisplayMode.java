package com.codedifferently;

public class DisplayMode {
    //String [] displayMode = {"Binary", "Octal", "Decimal", "Hexadecimal"};
    protected static String whichMode = "Decimal";

    public static String getMode(){
        return whichMode;
    }

    public void switchDisplayMode(){

        if(whichMode == "Decimal") {
            whichMode = "Hexadecimal";

        } else if(whichMode == "Hexadecimal") {
            whichMode = "Binary";

        } else if(whichMode == "Binary") {
            whichMode = "Octal";

        } else if(whichMode == "Octal") {
            whichMode = "Decimal";

        } else {
            System.out.println("Error");

        }
    }

    public void switchUnitsMode(String mode) {
        whichMode = mode;
    }
    
}