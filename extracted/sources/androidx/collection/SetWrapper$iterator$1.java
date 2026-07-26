package androidx.collection;

import defpackage.g51;
import defpackage.io7;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.collection.SetWrapper$iterator$1", f = "ScatterSet.kt", l = {1153}, m = "invokeSuspend")
final class SetWrapper$iterator$1 extends RestrictedSuspendLambda implements qp2 {
    public Object[] b;
    public long[] c;
    public int d;
    public int e;
    public int f;
    public int g;
    public long h;
    public int i;
    public /* synthetic */ Object j;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        throw null;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((SetWrapper$iterator$1) create((io7) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0062, code lost:
    
        r4 = 8 - ((~(r7 - r8)) >>> 31);
        r2 = 0;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.i
            if (r2 == 0) goto L76
            r3 = 1
            if (r2 != r3) goto L6e
            int r2 = r0.g
            int r4 = r0.f
            long r5 = r0.h
            int r7 = r0.e
            int r8 = r0.d
            long[] r9 = r0.c
            java.lang.Object[] r10 = r0.b
            java.lang.Object r11 = r0.j
            io7 r11 = (defpackage.io7) r11
            kotlin.b.b(r18)
        L20:
            r12 = 8
            long r5 = r5 >> r12
            int r2 = r2 + r3
        L24:
            if (r2 >= r4) goto L4c
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r5
            r14 = 128(0x80, double:6.3E-322)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 >= 0) goto L20
            int r12 = r7 << 3
            int r12 = r12 + r2
            r12 = r10[r12]
            r0.j = r11
            r0.b = r10
            r0.c = r9
            r0.d = r8
            r0.e = r7
            r0.h = r5
            r0.f = r4
            r0.g = r2
            r0.i = r3
            r11.b(r0, r12)
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            return r1
        L4c:
            if (r4 != r12) goto L6b
        L4e:
            if (r7 == r8) goto L6b
            int r7 = r7 + 1
            r5 = r9[r7]
            long r13 = ~r5
            r2 = 7
            long r13 = r13 << r2
            long r13 = r13 & r5
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r2 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r2 == 0) goto L4e
            int r2 = r7 - r8
            int r2 = ~r2
            int r2 = r2 >>> 31
            int r4 = 8 - r2
            r2 = 0
            goto L24
        L6b:
            tx8 r1 = defpackage.tx8.a
            return r1
        L6e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L76:
            kotlin.b.b(r18)
            java.lang.Object r1 = r0.j
            io7 r1 = (defpackage.io7) r1
            r1 = 0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.SetWrapper$iterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
