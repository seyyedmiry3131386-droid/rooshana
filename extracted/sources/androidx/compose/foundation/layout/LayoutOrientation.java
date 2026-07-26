package androidx.compose.foundation.layout;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class LayoutOrientation {
    public static final LayoutOrientation a;
    public static final /* synthetic */ LayoutOrientation[] b;

    static {
        LayoutOrientation layoutOrientation = new LayoutOrientation("Horizontal", 0);
        a = layoutOrientation;
        LayoutOrientation[] layoutOrientationArr = {layoutOrientation, new LayoutOrientation("Vertical", 1)};
        b = layoutOrientationArr;
        kotlin.enums.a.a(layoutOrientationArr);
    }

    public static LayoutOrientation valueOf(String str) {
        return (LayoutOrientation) Enum.valueOf(LayoutOrientation.class, str);
    }

    public static LayoutOrientation[] values() {
        return (LayoutOrientation[]) b.clone();
    }
}
