package com.godOfJava1.c6;

public class ControlLabel {
    public static void main(String[] args){
        ControlLabel control = new ControlLabel();
        //control.printTimesTable();
    }

    public void printTimesTable() { // 구구단.
        for(int level = 2; level < 10; level++) {
            for(int unit = 1; unit < 10; unit++) {
                System.out.println(level + "*" + unit + "=" + (level * unit));
            }
            System.out.println();
        }
    }

    public void printTimesTableSkip4Case() {
        for(int level = 2; level < 10; level++) {
            if (level == 4) continue;
            for(int unit = 1; unit < 10; unit++) {
                if (unit == 4) continue;
                System.out.println(level + "*" + unit + "=" + (level * unit));
            }
            System.out.println();
        }
    }

    public void printTimesTableSkipAfter4Case() {
        startLabel:
        for(int level = 2; level < 10; level++) {
            if (level == 4) continue;
            for(int unit = 1; unit < 10; unit++) {
                if (unit == 4) continue startLabel;
                System.out.println(level + "*" + unit + "=" + (level * unit));
            }
            System.out.println();
        }
    }
}
