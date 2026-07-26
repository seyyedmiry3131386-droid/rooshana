package androidx.constraintlayout.core.state;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class State$Direction {
    public static final /* synthetic */ State$Direction[] a = {new State$Direction("LEFT", 0), new State$Direction("RIGHT", 1), new State$Direction("START", 2), new State$Direction("END", 3), new State$Direction("TOP", 4), new State$Direction("BOTTOM", 5)};

    /* JADX INFO: Fake field, exist only in values array */
    State$Direction EF5;

    public static State$Direction valueOf(String str) {
        return (State$Direction) Enum.valueOf(State$Direction.class, str);
    }

    public static State$Direction[] values() {
        return (State$Direction[]) a.clone();
    }
}
