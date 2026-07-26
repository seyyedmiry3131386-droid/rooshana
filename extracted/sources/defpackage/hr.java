package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* JADX INFO: loaded from: classes3.dex */
@so7
public final class hr extends kr {
    public static final hr INSTANCE = new hr();
    public static final /* synthetic */ Object b = a.b(LazyThreadSafetyMode.b, new v7(8));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof hr);
    }

    public final int hashCode() {
        return 373342585;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
    public final px3 serializer() {
        return (px3) b.getValue();
    }

    public final String toString() {
        return "HomeTab";
    }
}
