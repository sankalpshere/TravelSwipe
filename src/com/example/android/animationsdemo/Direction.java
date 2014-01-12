package com.example.android.animationsdemo;

public enum Direction {
    LEFT(225, 315), TOP(135, 225), RIGHT(45, 135), BOTTOM(315, 45);

    private final int mLowerLimit;
    private final int mUpperLimit;

    Direction(int lowerLimit, int upperLimit) {
        mLowerLimit = lowerLimit;
        mUpperLimit = upperLimit;
    }

    private boolean isAngleWithinRange(int angle) {
        if (mLowerLimit <= mUpperLimit) {
            return (mLowerLimit < angle && angle <= mUpperLimit);
        } else {
            return (mLowerLimit < angle || angle <= mUpperLimit);
        }
    }

    public static Direction computeDirectionFrom(int angle) {
        final int normalizedAngle = normalizeAngle(angle);

        if (LEFT.isAngleWithinRange(normalizedAngle)) {
            return LEFT;
        } else if (RIGHT.isAngleWithinRange(normalizedAngle)) {
            return RIGHT;
        } else if (BOTTOM.isAngleWithinRange(normalizedAngle)) {
            return BOTTOM;
        } else {
            return TOP;
        }
    }

    private static int normalizeAngle(int angle) {
        int normalizedAngle = angle % 360;
        normalizedAngle = (normalizedAngle + 360) % 360;
        return normalizedAngle;
    }
}
