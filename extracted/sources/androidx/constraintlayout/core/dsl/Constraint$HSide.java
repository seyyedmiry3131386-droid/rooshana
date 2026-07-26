package androidx.constraintlayout.core.dsl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class Constraint$HSide {
    public static final /* synthetic */ Constraint$HSide[] a = {new Constraint$HSide("LEFT", 0), new Constraint$HSide("RIGHT", 1), new Constraint$HSide("START", 2), new Constraint$HSide("END", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    Constraint$HSide EF5;

    public static Constraint$HSide valueOf(String str) {
        return (Constraint$HSide) Enum.valueOf(Constraint$HSide.class, str);
    }

    public static Constraint$HSide[] values() {
        return (Constraint$HSide[]) a.clone();
    }
}
