package kotlinx.coroutines.flow.internal;

import defpackage.fo7;
import defpackage.g51;
import defpackage.rk6;
import defpackage.tx8;
import defpackage.w61;
import defpackage.xe2;
import defpackage.ze2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.BufferOverflow;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b extends a {
    public final xe2 d;

    public b(xe2 xe2Var, w61 w61Var, int i, BufferOverflow bufferOverflow) {
        super(w61Var, i, bufferOverflow);
        this.d = xe2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    @Override // kotlinx.coroutines.flow.internal.a, defpackage.xe2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.ze2 r5, defpackage.g51 r6) {
        /*
            r4 = this;
            int r0 = r4.b
            r1 = -3
            if (r0 != r1) goto L6e
            w61 r0 = r6.getContext()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            sy0 r2 = new sy0
            r3 = 5
            r2.<init>(r3)
            w61 r3 = r4.a
            java.lang.Object r1 = r3.J(r2, r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L24
            w61 r1 = r0.l0(r3)
            goto L29
        L24:
            r1 = 0
            w61 r1 = defpackage.ct2.i(r0, r3, r1)
        L29:
            boolean r2 = defpackage.js3.i(r1, r0)
            if (r2 == 0) goto L38
            java.lang.Object r5 = r4.j(r5, r6)
            kotlin.coroutines.intrinsics.CoroutineSingletons r6 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            if (r5 != r6) goto L77
            return r5
        L38:
            eq r2 = defpackage.eq.u
            u61 r3 = r1.r0(r2)
            u61 r0 = r0.r0(r2)
            boolean r0 = defpackage.js3.i(r3, r0)
            if (r0 == 0) goto L6e
            w61 r0 = r6.getContext()
            boolean r2 = r5 instanceof defpackage.fo7
            if (r2 != 0) goto L5b
            boolean r2 = r5 instanceof defpackage.oo5
            if (r2 == 0) goto L55
            goto L5b
        L55:
            kotlinx.coroutines.flow.internal.m r2 = new kotlinx.coroutines.flow.internal.m
            r2.<init>(r5, r0)
            r5 = r2
        L5b:
            kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2 r0 = new kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2
            r2 = 0
            r0.<init>(r4, r2)
            java.lang.Object r2 = defpackage.is3.M(r1)
            java.lang.Object r5 = defpackage.ct2.C(r1, r5, r2, r0, r6)
            kotlin.coroutines.intrinsics.CoroutineSingletons r6 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            if (r5 != r6) goto L77
            return r5
        L6e:
            java.lang.Object r5 = super.a(r5, r6)
            kotlin.coroutines.intrinsics.CoroutineSingletons r6 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            if (r5 != r6) goto L77
            return r5
        L77:
            tx8 r5 = defpackage.tx8.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.b.a(ze2, g51):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.internal.a
    public final Object f(rk6 rk6Var, g51 g51Var) {
        Object objJ = j(new fo7(rk6Var), g51Var);
        return objJ == CoroutineSingletons.a ? objJ : tx8.a;
    }

    public abstract Object j(ze2 ze2Var, g51 g51Var);

    @Override // kotlinx.coroutines.flow.internal.a
    public final String toString() {
        return this.d + " -> " + super.toString();
    }
}
