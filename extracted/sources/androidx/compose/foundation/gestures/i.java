package androidx.compose.foundation.gestures;

import defpackage.ah6;
import defpackage.dh7;
import defpackage.dt2;
import defpackage.f49;
import defpackage.hh2;
import defpackage.hk3;
import defpackage.io7;
import defpackage.ip0;
import defpackage.iz4;
import defpackage.li1;
import defpackage.o27;
import defpackage.qj1;
import defpackage.ql4;
import defpackage.qp2;
import defpackage.vg6;

/* JADX INFO: loaded from: classes.dex */
public final class i {
    public final o a;
    public final ql4 b;
    public final qp2 c;
    public qj1 d;
    public boolean f;
    public li1 g;
    public final kotlinx.coroutines.channels.a e = dt2.b(Integer.MAX_VALUE, 6, null);
    public final hh2 h = new hh2(17, (byte) 0);

    public i(o oVar, ql4 ql4Var, qp2 qp2Var, qj1 qj1Var) {
        this.a = oVar;
        this.b = ql4Var;
        this.c = qp2Var;
        this.d = qj1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(androidx.compose.foundation.gestures.i r16, androidx.compose.foundation.gestures.o r17, defpackage.iz4 r18, float r19, float r20, kotlin.coroutines.jvm.internal.ContinuationImpl r21) {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.i.a(androidx.compose.foundation.gestures.i, androidx.compose.foundation.gestures.o, iz4, float, float, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(androidx.compose.foundation.gestures.i r14, kotlin.jvm.internal.Ref$ObjectRef r15, kotlin.jvm.internal.Ref$FloatRef r16, androidx.compose.foundation.gestures.o r17, kotlin.jvm.internal.Ref$ObjectRef r18, long r19, kotlin.coroutines.jvm.internal.ContinuationImpl r21) {
        /*
            r0 = r19
            r2 = r21
            boolean r3 = r2 instanceof androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1
            if (r3 == 0) goto L17
            r3 = r2
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1 r3 = (androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1) r3
            int r4 = r3.g
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L17
            int r4 = r4 - r5
            r3.g = r4
            goto L1c
        L17:
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1 r3 = new androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1
            r3.<init>(r2)
        L1c:
            java.lang.Object r2 = r3.f
            kotlin.coroutines.intrinsics.CoroutineSingletons r4 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r5 = r3.g
            r6 = 1
            if (r5 == 0) goto L40
            if (r5 != r6) goto L38
            kotlin.jvm.internal.Ref$ObjectRef r14 = r3.e
            androidx.compose.foundation.gestures.o r0 = r3.d
            kotlin.jvm.internal.Ref$FloatRef r1 = r3.c
            kotlin.jvm.internal.Ref$ObjectRef r4 = r3.b
            androidx.compose.foundation.gestures.i r3 = r3.a
            kotlin.b.b(r2)
            r9 = r14
            r8 = r0
            r14 = r3
            goto L6d
        L38:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L40:
            kotlin.b.b(r2)
            r7 = 0
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 >= 0) goto L4c
            java.lang.Boolean r14 = java.lang.Boolean.FALSE
            return r14
        L4c:
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$2 r2 = new androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$2
            r5 = 0
            r2.<init>(r14, r5)
            r3.a = r14
            r3.b = r15
            r7 = r16
            r3.c = r7
            r8 = r17
            r3.d = r8
            r9 = r18
            r3.e = r9
            r3.g = r6
            java.lang.Object r2 = kotlinx.coroutines.a.n(r0, r2, r3)
            if (r2 != r4) goto L6b
            return r4
        L6b:
            r4 = r15
            r1 = r7
        L6d:
            iz4 r2 = (defpackage.iz4) r2
            if (r2 == 0) goto La8
            java.lang.Object r0 = r4.a
            iz4 r0 = (defpackage.iz4) r0
            boolean r0 = r0.c
            long r10 = r2.a
            long r12 = r2.b
            iz4 r3 = new iz4
            r20 = r0
            r15 = r3
            r16 = r10
            r18 = r12
            r15.<init>(r16, r18, r20)
            r0 = r15
            r4.a = r0
            long r3 = r8.e(r10)
            float r0 = r8.i(r3)
            r1.a = r0
            r0 = 30
            r3 = 0
            xk r0 = defpackage.wu8.b(r3, r3, r0)
            r9.a = r0
            r14.f(r2)
            float r14 = r1.a
            boolean r14 = defpackage.hz4.a(r14)
            r14 = r14 ^ r6
            goto La9
        La8:
            r14 = 0
        La9:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.i.b(androidx.compose.foundation.gestures.i, kotlin.jvm.internal.Ref$ObjectRef, kotlin.jvm.internal.Ref$FloatRef, androidx.compose.foundation.gestures.o, kotlin.jvm.internal.Ref$ObjectRef, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static iz4 e(kotlinx.coroutines.channels.a aVar) {
        iz4 iz4Var = null;
        io7 io7VarH = o27.h(new MouseWheelScrollingLogic$untilNull$1(new hk3(12, aVar), null));
        while (io7VarH.hasNext()) {
            iz4 iz4VarA = (iz4) io7VarH.next();
            if (iz4Var != null) {
                iz4VarA = iz4Var.a(iz4VarA);
            }
            iz4Var = iz4VarA;
        }
        return iz4Var;
    }

    public final float c(dh7 dh7Var, float f) {
        o oVar = this.a;
        long jH = oVar.h(oVar.d(f));
        o oVar2 = dh7Var.a;
        return oVar.g(oVar.e(oVar2.c(oVar2.k, jH, 1)));
    }

    public final boolean d(vg6 vg6Var, long j) {
        long jX = this.b.x(this.d, vg6Var);
        o oVar = this.a;
        float fI = oVar.i(oVar.e(jX));
        if (fI == 0.0f ? false : fI > 0.0f ? oVar.a.d() : oVar.a.b()) {
            return !(this.e.o(new iz4(jX, ((ah6) kotlin.collections.a.o0(vg6Var.a)).b, false)) instanceof ip0);
        }
        return this.f;
    }

    public final void f(iz4 iz4Var) {
        long j = iz4Var.b;
        long j2 = iz4Var.a;
        hh2 hh2Var = this.h;
        ((f49) hh2Var.b).a(Float.intBitsToFloat((int) (j2 >> 32)), j);
        ((f49) hh2Var.c).a(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(androidx.compose.foundation.gestures.o r5, defpackage.qp2 r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof androidx.compose.foundation.gestures.MouseWheelScrollingLogic$userScroll$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic$userScroll$1 r0 = (androidx.compose.foundation.gestures.MouseWheelScrollingLogic$userScroll$1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic$userScroll$1 r0 = new androidx.compose.foundation.gestures.MouseWheelScrollingLogic$userScroll$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.b.b(r7)
            goto L4d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            kotlin.b.b(r7)
            r4.f = r3
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic$userScroll$2 r7 = new androidx.compose.foundation.gestures.MouseWheelScrollingLogic$userScroll$2
            r2 = 0
            r7.<init>(r2, r6, r5)
            r0.c = r3
            bf2 r5 = new bf2
            w61 r6 = r0.getContext()
            r2 = 1
            r5.<init>(r6, r0, r2)
            java.lang.Object r5 = defpackage.b47.u(r5, r3, r5, r7)
            if (r5 != r1) goto L4d
            return r1
        L4d:
            r5 = 0
            r4.f = r5
            tx8 r5 = defpackage.tx8.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.i.g(androidx.compose.foundation.gestures.o, qp2, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
