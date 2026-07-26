package kotlinx.coroutines;

import defpackage.g51;
import defpackage.io5;
import defpackage.io7;
import defpackage.mq0;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "kotlinx.coroutines.JobSupport$children$1", f = "JobSupport.kt", l = {1003, 1005}, m = "invokeSuspend")
final class JobSupport$children$1 extends RestrictedSuspendLambda implements qp2 {
    public io5 b;
    public mq0 c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ c f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JobSupport$children$1(g51 g51Var, c cVar) {
        super(2, g51Var);
        this.f = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        JobSupport$children$1 jobSupport$children$1 = new JobSupport$children$1(g51Var, this.f);
        jobSupport$children$1.e = obj;
        return jobSupport$children$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((JobSupport$children$1) create((io7) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0066 -> B:25:0x007a). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r5.d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L24
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            mq0 r1 = r5.c
            io5 r3 = r5.b
            java.lang.Object r4 = r5.e
            io7 r4 = (defpackage.io7) r4
            kotlin.b.b(r6)
            goto L7a
        L18:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L20:
            kotlin.b.b(r6)
            goto L7f
        L24:
            kotlin.b.b(r6)
            java.lang.Object r6 = r5.e
            io7 r6 = (defpackage.io7) r6
            kotlinx.coroutines.c r1 = r5.f
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.c.a
            java.lang.Object r1 = r4.get(r1)
            boolean r4 = r1 instanceof defpackage.mq0
            if (r4 == 0) goto L41
            mq0 r1 = (defpackage.mq0) r1
            kotlinx.coroutines.c r1 = r1.e
            r5.d = r3
            r6.b(r5, r1)
            return r0
        L41:
            boolean r3 = r1 instanceof defpackage.gm3
            if (r3 == 0) goto L7f
            gm3 r1 = (defpackage.gm3) r1
            io5 r1 = r1.d()
            if (r1 == 0) goto L7f
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = kotlinx.coroutines.internal.a.a
            java.lang.Object r3 = r3.get(r1)
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"
            defpackage.js3.n(r3, r4)
            kotlinx.coroutines.internal.a r3 = (kotlinx.coroutines.internal.a) r3
            r4 = r3
            r3 = r1
            r1 = r4
            r4 = r6
        L5e:
            boolean r6 = r1.equals(r3)
            if (r6 != 0) goto L7f
            boolean r6 = r1 instanceof defpackage.mq0
            if (r6 == 0) goto L7a
            mq0 r1 = (defpackage.mq0) r1
            kotlinx.coroutines.c r6 = r1.e
            r5.e = r4
            r5.b = r3
            r5.c = r1
            r5.d = r2
            r4.b(r5, r6)
            kotlin.coroutines.intrinsics.CoroutineSingletons r6 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            return r0
        L7a:
            kotlinx.coroutines.internal.a r1 = r1.h()
            goto L5e
        L7f:
            tx8 r6 = defpackage.tx8.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.JobSupport$children$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
