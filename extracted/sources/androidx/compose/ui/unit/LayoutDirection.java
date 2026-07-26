package androidx.compose.ui.unit;

import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class LayoutDirection {
    public static final LayoutDirection a;
    public static final LayoutDirection b;
    public static final /* synthetic */ LayoutDirection[] c;

    static {
        LayoutDirection layoutDirection = new LayoutDirection("Ltr", 0);
        a = layoutDirection;
        LayoutDirection layoutDirection2 = new LayoutDirection("Rtl", 1);
        b = layoutDirection2;
        LayoutDirection[] layoutDirectionArr = {layoutDirection, layoutDirection2};
        c = layoutDirectionArr;
        a.a(layoutDirectionArr);
    }

    public static LayoutDirection valueOf(String str) {
        return (LayoutDirection) Enum.valueOf(LayoutDirection.class, str);
    }

    public static LayoutDirection[] values() {
        return (LayoutDirection[]) c.clone();
    }
}
