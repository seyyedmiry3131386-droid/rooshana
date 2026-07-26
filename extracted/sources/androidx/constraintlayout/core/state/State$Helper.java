package androidx.constraintlayout.core.state;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class State$Helper {
    public static final /* synthetic */ State$Helper[] a = {new State$Helper("HORIZONTAL_CHAIN", 0), new State$Helper("VERTICAL_CHAIN", 1), new State$Helper("ALIGN_HORIZONTALLY", 2), new State$Helper("ALIGN_VERTICALLY", 3), new State$Helper("BARRIER", 4), new State$Helper("LAYER", 5), new State$Helper("HORIZONTAL_FLOW", 6), new State$Helper("VERTICAL_FLOW", 7), new State$Helper("GRID", 8), new State$Helper("ROW", 9), new State$Helper("COLUMN", 10), new State$Helper("FLOW", 11)};

    /* JADX INFO: Fake field, exist only in values array */
    State$Helper EF5;

    public static State$Helper valueOf(String str) {
        return (State$Helper) Enum.valueOf(State$Helper.class, str);
    }

    public static State$Helper[] values() {
        return (State$Helper[]) a.clone();
    }
}
