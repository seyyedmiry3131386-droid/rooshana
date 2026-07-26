package androidx.constraintlayout.core.dsl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class OnSwipe$Mode {
    public static final /* synthetic */ OnSwipe$Mode[] a = {new OnSwipe$Mode("VELOCITY", 0), new OnSwipe$Mode("SPRING", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    OnSwipe$Mode EF5;

    public static OnSwipe$Mode valueOf(String str) {
        return (OnSwipe$Mode) Enum.valueOf(OnSwipe$Mode.class, str);
    }

    public static OnSwipe$Mode[] values() {
        return (OnSwipe$Mode[]) a.clone();
    }
}
