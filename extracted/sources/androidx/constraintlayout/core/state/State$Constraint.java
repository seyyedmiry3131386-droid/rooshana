package androidx.constraintlayout.core.state;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class State$Constraint {
    public static final /* synthetic */ State$Constraint[] a = {new State$Constraint("LEFT_TO_LEFT", 0), new State$Constraint("LEFT_TO_RIGHT", 1), new State$Constraint("RIGHT_TO_LEFT", 2), new State$Constraint("RIGHT_TO_RIGHT", 3), new State$Constraint("START_TO_START", 4), new State$Constraint("START_TO_END", 5), new State$Constraint("END_TO_START", 6), new State$Constraint("END_TO_END", 7), new State$Constraint("TOP_TO_TOP", 8), new State$Constraint("TOP_TO_BOTTOM", 9), new State$Constraint("TOP_TO_BASELINE", 10), new State$Constraint("BOTTOM_TO_TOP", 11), new State$Constraint("BOTTOM_TO_BOTTOM", 12), new State$Constraint("BOTTOM_TO_BASELINE", 13), new State$Constraint("BASELINE_TO_BASELINE", 14), new State$Constraint("BASELINE_TO_TOP", 15), new State$Constraint("BASELINE_TO_BOTTOM", 16), new State$Constraint("CENTER_HORIZONTALLY", 17), new State$Constraint("CENTER_VERTICALLY", 18), new State$Constraint("CIRCULAR_CONSTRAINT", 19)};

    /* JADX INFO: Fake field, exist only in values array */
    State$Constraint EF5;

    public static State$Constraint valueOf(String str) {
        return (State$Constraint) Enum.valueOf(State$Constraint.class, str);
    }

    public static State$Constraint[] values() {
        return (State$Constraint[]) a.clone();
    }
}
