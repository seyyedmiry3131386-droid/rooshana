package androidx.constraintlayout.core.dsl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class OnSwipe$Side {
    public static final /* synthetic */ OnSwipe$Side[] a = {new OnSwipe$Side("TOP", 0), new OnSwipe$Side("LEFT", 1), new OnSwipe$Side("RIGHT", 2), new OnSwipe$Side("BOTTOM", 3), new OnSwipe$Side("MIDDLE", 4), new OnSwipe$Side("START", 5), new OnSwipe$Side("END", 6)};

    /* JADX INFO: Fake field, exist only in values array */
    OnSwipe$Side EF5;

    public static OnSwipe$Side valueOf(String str) {
        return (OnSwipe$Side) Enum.valueOf(OnSwipe$Side.class, str);
    }

    public static OnSwipe$Side[] values() {
        return (OnSwipe$Side[]) a.clone();
    }
}
