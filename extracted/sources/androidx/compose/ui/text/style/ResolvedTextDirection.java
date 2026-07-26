package androidx.compose.ui.text.style;

import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ResolvedTextDirection {
    public static final ResolvedTextDirection a;
    public static final ResolvedTextDirection b;
    public static final /* synthetic */ ResolvedTextDirection[] c;

    static {
        ResolvedTextDirection resolvedTextDirection = new ResolvedTextDirection("Ltr", 0);
        a = resolvedTextDirection;
        ResolvedTextDirection resolvedTextDirection2 = new ResolvedTextDirection("Rtl", 1);
        b = resolvedTextDirection2;
        ResolvedTextDirection[] resolvedTextDirectionArr = {resolvedTextDirection, resolvedTextDirection2};
        c = resolvedTextDirectionArr;
        a.a(resolvedTextDirectionArr);
    }

    public static ResolvedTextDirection valueOf(String str) {
        return (ResolvedTextDirection) Enum.valueOf(ResolvedTextDirection.class, str);
    }

    public static ResolvedTextDirection[] values() {
        return (ResolvedTextDirection[]) c.clone();
    }
}
