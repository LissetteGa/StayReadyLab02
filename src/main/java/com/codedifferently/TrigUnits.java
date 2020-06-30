package com.codedifferently;

public class TrigUnits {
    
    protected static String trigUnitsMode = "Degrees";

    public static String getMode() {
        return trigUnitsMode;
    }

    //Rotates from Degrees and Radians
    public void switchUnitsMode() {
        if (trigUnitsMode == "Degrees") {
            trigUnitsMode = "Radians";    
        } else {
            trigUnitsMode = "Degrees";
        }
    }

    //Sets the trig units to the type given
    public void switchUnitsMode(String mode) {
        trigUnitsMode = mode;
    }
    
}
