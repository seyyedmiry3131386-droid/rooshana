package androidx.constraintlayout.core.dsl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class Helper$Type {
    public static final /* synthetic */ Helper$Type[] a = {new Helper$Type("VERTICAL_GUIDELINE", 0), new Helper$Type("HORIZONTAL_GUIDELINE", 1), new Helper$Type("VERTICAL_CHAIN", 2), new Helper$Type("HORIZONTAL_CHAIN", 3), new Helper$Type("BARRIER", 4)};

    /* JADX INFO: Fake field, exist only in values array */
    Helper$Type EF5;

    public static Helper$Type valueOf(String str) {
        return (Helper$Type) Enum.valueOf(Helper$Type.class, str);
    }

    public static Helper$Type[] values() {
        return (Helper$Type[]) a.clone();
    }
}
