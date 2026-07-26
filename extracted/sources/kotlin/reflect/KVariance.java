package kotlin.reflect;

import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class KVariance {
    public static final /* synthetic */ KVariance[] a;

    static {
        KVariance[] kVarianceArr = {new KVariance("INVARIANT", 0), new KVariance("IN", 1), new KVariance("OUT", 2)};
        a = kVarianceArr;
        a.a(kVarianceArr);
    }

    public static KVariance valueOf(String str) {
        return (KVariance) Enum.valueOf(KVariance.class, str);
    }

    public static KVariance[] values() {
        return (KVariance[]) a.clone();
    }
}
