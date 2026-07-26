package androidx.datastore.core;

import defpackage.e71;
import defpackage.g51;
import defpackage.o77;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.datastore.core.SimpleActor$offer$2", f = "SimpleActor.kt", l = {114, 114}, m = "invokeSuspend", v = 1)
final class SimpleActor$offer$2 extends SuspendLambda implements qp2 {
    public Object a;
    public int b;
    public final /* synthetic */ o77 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleActor$offer$2(o77 o77Var, g51 g51Var) {
        super(2, g51Var);
        this.c = o77Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new SimpleActor$offer$2(this.c, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((SimpleActor$offer$2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
    
        if (r1.invoke(r7, r6) != r0) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0052 A[PHI: r1 r7
      0x0052: PHI (r1v1 qp2) = (r1v3 qp2), (r1v5 qp2) binds: [B:13:0x004f, B:9:0x001a] A[DONT_GENERATE, DONT_INLINE]
      0x0052: PHI (r7v7 java.lang.Object) = (r7v15 java.lang.Object), (r7v0 java.lang.Object) binds: [B:13:0x004f, B:9:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005b -> B:18:0x005e). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r6.b
            r2 = 2
            r3 = 1
            o77 r4 = r6.c
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.b.b(r7)
            goto L5e
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            java.lang.Object r1 = r6.a
            qp2 r1 = (defpackage.qp2) r1
            kotlin.b.b(r7)
            goto L52
        L22:
            kotlin.b.b(r7)
            java.lang.Object r7 = r4.d
            pt2 r7 = (defpackage.pt2) r7
            java.lang.Object r7 = r7.b
            java.util.concurrent.atomic.AtomicInteger r7 = (java.util.concurrent.atomic.AtomicInteger) r7
            int r7 = r7.get()
            if (r7 <= 0) goto L6f
        L33:
            java.lang.Object r7 = r4.a
            e71 r7 = (defpackage.e71) r7
            w61 r7 = r7.getCoroutineContext()
            kotlinx.coroutines.a.f(r7)
            java.lang.Object r7 = r4.b
            r1 = r7
            qp2 r1 = (defpackage.qp2) r1
            java.lang.Object r7 = r4.c
            kotlinx.coroutines.channels.a r7 = (kotlinx.coroutines.channels.a) r7
            r6.a = r1
            r6.b = r3
            java.lang.Object r7 = r7.l(r6)
            if (r7 != r0) goto L52
            goto L5d
        L52:
            r5 = 0
            r6.a = r5
            r6.b = r2
            java.lang.Object r7 = r1.invoke(r7, r6)
            if (r7 != r0) goto L5e
        L5d:
            return r0
        L5e:
            java.lang.Object r7 = r4.d
            pt2 r7 = (defpackage.pt2) r7
            java.lang.Object r7 = r7.b
            java.util.concurrent.atomic.AtomicInteger r7 = (java.util.concurrent.atomic.AtomicInteger) r7
            int r7 = r7.decrementAndGet()
            if (r7 != 0) goto L33
            tx8 r7 = defpackage.tx8.a
            return r7
        L6f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SimpleActor$offer$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
