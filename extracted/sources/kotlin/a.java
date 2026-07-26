package kotlin;

import defpackage.bp2;
import defpackage.c24;
import defpackage.eq;
import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static c24 a(bp2 bp2Var) {
        js3.p(bp2Var, "initializer");
        return new SynchronizedLazyImpl(bp2Var);
    }

    public static c24 b(LazyThreadSafetyMode lazyThreadSafetyMode, bp2 bp2Var) {
        eq eqVar = eq.L;
        js3.p(bp2Var, "initializer");
        int iOrdinal = lazyThreadSafetyMode.ordinal();
        if (iOrdinal == 0) {
            return new SynchronizedLazyImpl(bp2Var);
        }
        if (iOrdinal == 1) {
            SafePublicationLazyImpl safePublicationLazyImpl = new SafePublicationLazyImpl();
            safePublicationLazyImpl.a = bp2Var;
            safePublicationLazyImpl.b = eqVar;
            return safePublicationLazyImpl;
        }
        if (iOrdinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        UnsafeLazyImpl unsafeLazyImpl = new UnsafeLazyImpl();
        unsafeLazyImpl.a = bp2Var;
        unsafeLazyImpl.b = eqVar;
        return unsafeLazyImpl;
    }
}
