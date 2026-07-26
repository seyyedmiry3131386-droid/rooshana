package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* JADX INFO: loaded from: classes3.dex */
@so7
public final class gr extends kr {
    public static final gr INSTANCE = new gr();
    public static final /* synthetic */ Object b = a.b(LazyThreadSafetyMode.b, new v7(7));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof gr);
    }

    public final int hashCode() {
        return -914969210;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
    public final px3 serializer() {
        return (px3) b.getValue();
    }

    public final String toString() {
        return "GameTab";
    }
}
