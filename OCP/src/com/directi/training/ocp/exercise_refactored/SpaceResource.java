package com.directi.training.ocp.exercise_refactored;

public class SpaceResource implements Resource {
    @Override
    public int findFree() {
        return 0;
    }

    @Override
    public void markBusy(int resourceId) {
        System.out.println("Marking space resource with id " + resourceId + "busy\n");
    }

    @Override
    public void markFree(int resourceId) {
        System.out.println("Marking space resource with id " + resourceId + "free\n");
    }
}
