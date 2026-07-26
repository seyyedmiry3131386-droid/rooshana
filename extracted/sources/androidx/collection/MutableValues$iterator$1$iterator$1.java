package androidx.collection;

import defpackage.g51;
import defpackage.io7;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.collection.MutableValues$iterator$1$iterator$1", f = "ScatterMap.kt", l = {1696}, m = "invokeSuspend")
final class MutableValues$iterator$1$iterator$1 extends RestrictedSuspendLambda implements qp2 {
    public long[] b;
    public int c;
    public int d;
    public int e;
    public long f;
    public int g;
    public /* synthetic */ Object h;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        MutableValues$iterator$1$iterator$1 mutableValues$iterator$1$iterator$1 = new MutableValues$iterator$1$iterator$1(2, g51Var);
        mutableValues$iterator$1$iterator$1.h = obj;
        return mutableValues$iterator$1$iterator$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((MutableValues$iterator$1$iterator$1) create((io7) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
    
        r3 = 8 - ((~r6) >>> 31);
        r1 = 0;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r13.g
            if (r1 == 0) goto L6d
            r2 = 1
            if (r1 != r2) goto L65
            int r1 = r13.e
            int r3 = r13.d
            long r4 = r13.f
            int r6 = r13.c
            long[] r7 = r13.b
            java.lang.Object r8 = r13.h
            io7 r8 = (defpackage.io7) r8
            kotlin.b.b(r14)
        L1a:
            r14 = 8
            long r4 = r4 >> r14
            int r1 = r1 + r2
        L1e:
            if (r1 >= r3) goto L45
            r9 = 255(0xff, double:1.26E-321)
            long r9 = r9 & r4
            r11 = 128(0x80, double:6.3E-322)
            int r14 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r14 >= 0) goto L1a
            int r14 = r6 << 3
            int r14 = r14 + r1
            java.lang.Integer r9 = new java.lang.Integer
            r9.<init>(r14)
            r13.h = r8
            r13.b = r7
            r13.c = r6
            r13.f = r4
            r13.d = r3
            r13.e = r1
            r13.g = r2
            r8.b(r13, r9)
            kotlin.coroutines.intrinsics.CoroutineSingletons r14 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            return r0
        L45:
            if (r3 != r14) goto L62
        L47:
            if (r6 == 0) goto L62
            int r6 = r6 + 1
            r4 = r7[r6]
            long r9 = ~r4
            r1 = 7
            long r9 = r9 << r1
            long r9 = r9 & r4
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r1 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r1 == 0) goto L47
            int r1 = ~r6
            int r1 = r1 >>> 31
            int r3 = 8 - r1
            r1 = 0
            goto L1e
        L62:
            tx8 r14 = defpackage.tx8.a
            return r14
        L65:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L6d:
            kotlin.b.b(r14)
            java.lang.Object r14 = r13.h
            io7 r14 = (defpackage.io7) r14
            r14 = 0
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableValues$iterator$1$iterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
