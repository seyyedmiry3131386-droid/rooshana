package androidx.constraintlayout.core.dsl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class KeyAttributes$Fit {
    public static final /* synthetic */ KeyAttributes$Fit[] a = {new KeyAttributes$Fit("SPLINE", 0), new KeyAttributes$Fit("LINEAR", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    KeyAttributes$Fit EF5;

    public static KeyAttributes$Fit valueOf(String str) {
        return (KeyAttributes$Fit) Enum.valueOf(KeyAttributes$Fit.class, str);
    }

    public static KeyAttributes$Fit[] values() {
        return (KeyAttributes$Fit[]) a.clone();
    }
}
