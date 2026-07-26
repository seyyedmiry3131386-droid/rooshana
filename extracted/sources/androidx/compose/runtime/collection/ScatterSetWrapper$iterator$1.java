package androidx.compose.runtime.collection;

import defpackage.g51;
import defpackage.io7;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.runtime.collection.ScatterSetWrapper$iterator$1", f = "ScatterSetWrapper.kt", l = {31}, m = "invokeSuspend", v = 1)
final class ScatterSetWrapper$iterator$1 extends RestrictedSuspendLambda implements qp2 {
    public Object[] b;
    public long[] c;
    public int d;
    public int e;
    public int f;
    public int g;
    public long h;
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ a k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScatterSetWrapper$iterator$1(a aVar, g51 g51Var) {
        super(2, g51Var);
        this.k = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        ScatterSetWrapper$iterator$1 scatterSetWrapper$iterator$1 = new ScatterSetWrapper$iterator$1(this.k, g51Var);
        scatterSetWrapper$iterator$1.j = obj;
        return scatterSetWrapper$iterator$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((ScatterSetWrapper$iterator$1) create((io7) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0095  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004f -> B:22:0x0093). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0051 -> B:14:0x0062). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006b -> B:19:0x008a). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.i
            r3 = 0
            r4 = 8
            r5 = 1
            if (r2 == 0) goto L2c
            if (r2 != r5) goto L24
            int r2 = r0.g
            int r6 = r0.f
            long r7 = r0.h
            int r9 = r0.e
            int r10 = r0.d
            long[] r11 = r0.c
            java.lang.Object[] r12 = r0.b
            java.lang.Object r13 = r0.j
            io7 r13 = (defpackage.io7) r13
            kotlin.b.b(r21)
            goto L8a
        L24:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L2c:
            kotlin.b.b(r21)
            java.lang.Object r2 = r0.j
            io7 r2 = (defpackage.io7) r2
            androidx.compose.runtime.collection.a r6 = r0.k
            androidx.collection.e r6 = r6.a
            java.lang.Object[] r7 = r6.b
            long[] r6 = r6.a
            int r8 = r6.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto L98
            r9 = r3
        L41:
            r10 = r6[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L93
            int r12 = r9 - r8
            int r12 = ~r12
            int r12 = r12 >>> 31
            int r12 = 8 - r12
            r13 = r2
            r2 = r3
            r18 = r10
            r11 = r6
            r10 = r8
            r6 = r12
            r12 = r7
            r7 = r18
        L62:
            if (r2 >= r6) goto L8d
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r7
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L8a
            int r3 = r9 << 3
            int r3 = r3 + r2
            r3 = r12[r3]
            r0.j = r13
            r0.b = r12
            r0.c = r11
            r0.d = r10
            r0.e = r9
            r0.h = r7
            r0.f = r6
            r0.g = r2
            r0.i = r5
            r13.b(r0, r3)
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            return r1
        L8a:
            long r7 = r7 >> r4
            int r2 = r2 + r5
            goto L62
        L8d:
            if (r6 != r4) goto L98
            r8 = r10
            r6 = r11
            r7 = r12
            r2 = r13
        L93:
            if (r9 == r8) goto L98
            int r9 = r9 + 1
            goto L41
        L98:
            tx8 r1 = defpackage.tx8.a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.collection.ScatterSetWrapper$iterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
