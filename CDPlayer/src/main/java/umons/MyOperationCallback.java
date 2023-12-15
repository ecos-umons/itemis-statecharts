package umons;

import umons.CDPlayer.CD;
public class MyOperationCallback implements CDPlayer.CD.OperationCallback {

        private String CDPlayerStatus = " ";

        public String toString() {
                String output = CDPlayerStatus;
                CDPlayerStatus = " ";
                return output;}
        public void turnOn() { CDPlayerStatus = CDPlayerStatus + "turned on ";}

        public void turnOff() {CDPlayerStatus = CDPlayerStatus +"turned off ";}

        public void playing() {CDPlayerStatus = CDPlayerStatus +"playing ";}

        public void stopped() {CDPlayerStatus = CDPlayerStatus +"stopped ";}

        public void paused() {CDPlayerStatus = CDPlayerStatus +"paused ";}

    }
