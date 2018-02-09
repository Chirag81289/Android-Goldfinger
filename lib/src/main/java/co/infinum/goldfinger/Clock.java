package co.infinum.goldfinger;

class Clock {

    private static Clock INSTANCE;

    private Clock() {
    }

    static Clock instance() {
        if (INSTANCE == null) {
            INSTANCE = new Clock();
        }
        return INSTANCE;
    }

    long currentTimeMs() {
        return System.currentTimeMillis();
    }

    boolean isBeforeNow(long timeMs) {
        return timeMs < currentTimeMs();
    }
}
