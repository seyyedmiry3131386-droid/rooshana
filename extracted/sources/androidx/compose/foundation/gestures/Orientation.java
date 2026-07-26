package androidx.compose.foundation.gestures;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class Orientation {
    public static final Orientation a;
    public static final Orientation b;
    public static final /* synthetic */ Orientation[] c;

    static {
        Orientation orientation = new Orientation("Vertical", 0);
        a = orientation;
        Orientation orientation2 = new Orientation("Horizontal", 1);
        b = orientation2;
        Orientation[] orientationArr = {orientation, orientation2};
        c = orientationArr;
        kotlin.enums.a.a(orientationArr);
    }

    public static Orientation valueOf(String str) {
        return (Orientation) Enum.valueOf(Orientation.class, str);
    }

    public static Orientation[] values() {
        return (Orientation[]) c.clone();
    }
}
