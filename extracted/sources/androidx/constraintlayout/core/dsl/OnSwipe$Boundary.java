package androidx.constraintlayout.core.dsl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class OnSwipe$Boundary {
    public static final /* synthetic */ OnSwipe$Boundary[] a = {new OnSwipe$Boundary("OVERSHOOT", 0), new OnSwipe$Boundary("BOUNCE_START", 1), new OnSwipe$Boundary("BOUNCE_END", 2), new OnSwipe$Boundary("BOUNCE_BOTH", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    OnSwipe$Boundary EF5;

    public static OnSwipe$Boundary valueOf(String str) {
        return (OnSwipe$Boundary) Enum.valueOf(OnSwipe$Boundary.class, str);
    }

    public static OnSwipe$Boundary[] values() {
        return (OnSwipe$Boundary[]) a.clone();
    }
}
