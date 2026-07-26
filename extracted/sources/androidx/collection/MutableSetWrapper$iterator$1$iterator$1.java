package androidx.collection;

import defpackage.g51;
import defpackage.io7;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tb5;
import defpackage.tx8;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.collection.MutableSetWrapper$iterator$1$iterator$1", f = "ScatterSet.kt", l = {1188}, m = "invokeSuspend")
final class MutableSetWrapper$iterator$1$iterator$1 extends RestrictedSuspendLambda implements qp2 {
    public b b;
    public tb5 c;
    public long[] d;
    public int e;
    public int f;
    public int g;
    public int h;
    public long i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ tb5 l;
    public final /* synthetic */ b m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutableSetWrapper$iterator$1$iterator$1(tb5 tb5Var, b bVar, g51 g51Var) {
        super(2, g51Var);
        this.l = tb5Var;
        this.m = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        MutableSetWrapper$iterator$1$iterator$1 mutableSetWrapper$iterator$1$iterator$1 = new MutableSetWrapper$iterator$1$iterator$1(this.l, this.m, g51Var);
        mutableSetWrapper$iterator$1$iterator$1.k = obj;
        return mutableSetWrapper$iterator$1$iterator$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((MutableSetWrapper$iterator$1$iterator$1) create((io7) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0052 -> B:22:0x00a2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0054 -> B:14:0x0067). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0070 -> B:19:0x0097). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.j
            r3 = 0
            r4 = 8
            r5 = 1
            if (r2 == 0) goto L2f
            if (r2 != r5) goto L27
            int r2 = r0.h
            int r6 = r0.g
            long r7 = r0.i
            int r9 = r0.f
            int r10 = r0.e
            long[] r11 = r0.d
            tb5 r12 = r0.c
            androidx.collection.b r13 = r0.b
            java.lang.Object r14 = r0.k
            io7 r14 = (defpackage.io7) r14
            kotlin.b.b(r22)
            goto L97
        L27:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L2f:
            kotlin.b.b(r22)
            java.lang.Object r2 = r0.k
            io7 r2 = (defpackage.io7) r2
            tb5 r6 = r0.l
            sb5 r7 = r6.b
            long[] r7 = r7.a
            int r8 = r7.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto La7
            androidx.collection.b r9 = r0.m
            r10 = r3
        L44:
            r11 = r7[r10]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto La2
            int r13 = r10 - r8
            int r13 = ~r13
            int r13 = r13 >>> 31
            int r13 = 8 - r13
            r14 = r2
            r2 = r3
            r19 = r11
            r12 = r6
            r11 = r7
            r6 = r13
            r13 = r9
            r9 = r10
            r10 = r8
            r7 = r19
        L67:
            if (r2 >= r6) goto L9a
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r7
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L97
            int r3 = r9 << 3
            int r3 = r3 + r2
            r13.b = r3
            sb5 r4 = r12.b
            java.lang.Object[] r4 = r4.b
            r3 = r4[r3]
            r0.k = r14
            r0.b = r13
            r0.c = r12
            r0.d = r11
            r0.e = r10
            r0.f = r9
            r0.i = r7
            r0.g = r6
            r0.h = r2
            r0.j = r5
            r14.b(r0, r3)
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            return r1
        L97:
            long r7 = r7 >> r4
            int r2 = r2 + r5
            goto L67
        L9a:
            if (r6 != r4) goto La7
            r8 = r10
            r7 = r11
            r6 = r12
            r2 = r14
            r10 = r9
            r9 = r13
        La2:
            if (r10 == r8) goto La7
            int r10 = r10 + 1
            goto L44
        La7:
            tx8 r1 = defpackage.tx8.a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableSetWrapper$iterator$1$iterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
