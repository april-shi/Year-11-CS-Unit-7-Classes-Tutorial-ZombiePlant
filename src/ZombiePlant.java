public class ZombiePlant {

    private int potency;
    private int treatmentsNeeded;

    public ZombiePlant (int potency, int treatmentsNeeded) {

        this.potency = potency;
        this.treatmentsNeeded = treatmentsNeeded;

    }

    public int getPotencyRequired() {

        return potency;

    }

    public int treatmentsNeeded () {

        if (treatmentsNeeded < 0) {

            return treatmentsNeeded = 0;

        }

        return treatmentsNeeded;

    }

    public boolean isDangerous() {

        if (treatmentsNeeded > 0) {

            return true;
        }

        return false;

    }

    public void treat(int treatmentPotency) {

        if (treatmentPotency <= potency && treatmentPotency > 0) {

            treatmentsNeeded--;

        } else if (treatmentPotency > potency && treatmentPotency > 0) {

            treatmentsNeeded++;

        }

        if (treatmentsNeeded == 0) {

            return;

        }


    }

}
