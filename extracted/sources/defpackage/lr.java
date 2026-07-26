package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* JADX INFO: loaded from: classes3.dex */
@so7
public final class lr extends kr {
    public static final lr INSTANCE = new lr();
    public static final /* synthetic */ Object b = a.b(LazyThreadSafetyMode.b, new v7(11));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof lr);
    }

    public final int hashCode() {
        return -1756743537;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
    public final px3 serializer() {
        return (px3) b.getValue();
    }

    public final String toString() {
        return "UpdateTab";
    }
}
