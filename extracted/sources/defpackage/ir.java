package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* JADX INFO: loaded from: classes3.dex */
@so7
public final class ir extends kr {
    public static final ir INSTANCE = new ir();
    public static final /* synthetic */ Object b = a.b(LazyThreadSafetyMode.b, new v7(9));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ir);
    }

    public final int hashCode() {
        return -925314206;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
    public final px3 serializer() {
        return (px3) b.getValue();
    }

    public final String toString() {
        return "MovieTab";
    }
}
