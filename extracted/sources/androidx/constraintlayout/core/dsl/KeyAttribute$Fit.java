package androidx.constraintlayout.core.dsl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class KeyAttribute$Fit {
    public static final /* synthetic */ KeyAttribute$Fit[] a = {new KeyAttribute$Fit("SPLINE", 0), new KeyAttribute$Fit("LINEAR", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    KeyAttribute$Fit EF5;

    public static KeyAttribute$Fit valueOf(String str) {
        return (KeyAttribute$Fit) Enum.valueOf(KeyAttribute$Fit.class, str);
    }

    public static KeyAttribute$Fit[] values() {
        return (KeyAttribute$Fit[]) a.clone();
    }
}
