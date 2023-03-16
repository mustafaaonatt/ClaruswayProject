package week6.inhPract;

public class AlarmClock extends Watch {
    private String alarm;

    public void setAlarm(String newAlarm) {
        if (alarm != null) {
            System.out.println("Alarm changed from " + alarm + " to " + newAlarm + ". ");
        } else {
            System.out.println("Alarm set to " + newAlarm + ". ");
        }
        alarm = newAlarm;
    }

    public void acDetail() {
        if (alarm != null) {
            System.out.println("Alarm was set to " + alarm + ". ");
        } else {
            System.out.println("There is no alarm was set. ");
        }
    }

    public void removeAlarm() {
        alarm = null;
    }

}

