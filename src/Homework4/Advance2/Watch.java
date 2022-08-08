package Homework4.Advance2;

public class Watch {
    private boolean isBroken;

    public Watch(boolean isBroken) {
        this.isBroken = isBroken;
    }

    public void Tick() {
        if (isBroken) {
            throw new WatchBrokenError();
        } else System.out.println("Часы тикают");
    }
}
