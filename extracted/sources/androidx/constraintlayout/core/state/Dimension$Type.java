package androidx.constraintlayout.core.state;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class Dimension$Type {
    public static final /* synthetic */ Dimension$Type[] a = {new Dimension$Type("FIXED", 0), new Dimension$Type("WRAP", 1), new Dimension$Type("MATCH_PARENT", 2), new Dimension$Type("MATCH_CONSTRAINT", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    Dimension$Type EF5;

    public static Dimension$Type valueOf(String str) {
        return (Dimension$Type) Enum.valueOf(Dimension$Type.class, str);
    }

    public static Dimension$Type[] values() {
        return (Dimension$Type[]) a.clone();
    }
}
