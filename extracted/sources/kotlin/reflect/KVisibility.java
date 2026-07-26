package kotlin.reflect;

import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class KVisibility {
    public static final /* synthetic */ KVisibility[] a;

    static {
        KVisibility[] kVisibilityArr = {new KVisibility("PUBLIC", 0), new KVisibility("PROTECTED", 1), new KVisibility("INTERNAL", 2), new KVisibility("PRIVATE", 3)};
        a = kVisibilityArr;
        a.a(kVisibilityArr);
    }

    public static KVisibility valueOf(String str) {
        return (KVisibility) Enum.valueOf(KVisibility.class, str);
    }

    public static KVisibility[] values() {
        return (KVisibility[]) a.clone();
    }
}
