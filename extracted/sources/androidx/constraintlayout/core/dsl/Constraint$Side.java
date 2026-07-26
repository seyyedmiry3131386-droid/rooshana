package androidx.constraintlayout.core.dsl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class Constraint$Side {
    public static final /* synthetic */ Constraint$Side[] a = {new Constraint$Side("LEFT", 0), new Constraint$Side("RIGHT", 1), new Constraint$Side("TOP", 2), new Constraint$Side("BOTTOM", 3), new Constraint$Side("START", 4), new Constraint$Side("END", 5), new Constraint$Side("BASELINE", 6)};

    /* JADX INFO: Fake field, exist only in values array */
    Constraint$Side EF5;

    public static Constraint$Side valueOf(String str) {
        return (Constraint$Side) Enum.valueOf(Constraint$Side.class, str);
    }

    public static Constraint$Side[] values() {
        return (Constraint$Side[]) a.clone();
    }
}
