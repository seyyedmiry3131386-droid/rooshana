package androidx.constraintlayout.core.dsl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class Constraint$ChainMode {
    public static final /* synthetic */ Constraint$ChainMode[] a = {new Constraint$ChainMode("SPREAD", 0), new Constraint$ChainMode("SPREAD_INSIDE", 1), new Constraint$ChainMode("PACKED", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    Constraint$ChainMode EF5;

    public static Constraint$ChainMode valueOf(String str) {
        return (Constraint$ChainMode) Enum.valueOf(Constraint$ChainMode.class, str);
    }

    public static Constraint$ChainMode[] values() {
        return (Constraint$ChainMode[]) a.clone();
    }
}
