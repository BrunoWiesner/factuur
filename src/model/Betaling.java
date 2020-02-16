package model;

public class Betaling {
    private String mededeling;

    public Betaling(String mededeling) {
        this.mededeling = mededeling;
    }

    public String getMededeling() {
        return mededeling;
    }

    @Override
    public String toString() {
        return "Betaling{" +
                "mededeling='" + mededeling + '\'' +
                '}';
    }

    public void setMededeling(String mededeling) {
        this.mededeling = mededeling;
    }
}
