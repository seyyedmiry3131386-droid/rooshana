package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* JADX INFO: loaded from: classes3.dex */
@so7
public final class df6 implements kj5 {
    public static final df6 INSTANCE = new df6();
    public static final /* synthetic */ Object a = a.b(LazyThreadSafetyMode.b, new js5(6));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof df6);
    }

    public final int hashCode() {
        return 1850622454;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
    public final px3 serializer() {
        return (px3) a.getValue();
    }

    public final String toString() {
        return "PlayerScreen";
    }
}
