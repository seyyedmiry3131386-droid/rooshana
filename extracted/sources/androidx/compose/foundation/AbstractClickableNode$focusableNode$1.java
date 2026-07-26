package androidx.compose.foundation;

import defpackage.dp2;
import defpackage.tx8;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class AbstractClickableNode$focusableNode$1 extends FunctionReferenceImpl implements dp2 {
    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(boolean r20) {
        /*
            r19 = this;
            r0 = r19
            java.lang.Object r1 = r0.receiver
            androidx.compose.foundation.a r1 = (androidx.compose.foundation.a) r1
            db5 r2 = r1.D
            if (r20 == 0) goto Le
            r1.M0()
            return
        Le:
            ab5 r3 = r1.q
            r4 = 0
            if (r3 == 0) goto L7a
            java.lang.Object[] r3 = r2.c
            long[] r5 = r2.a
            int r6 = r5.length
            int r6 = r6 + (-2)
            r7 = 3
            if (r6 < 0) goto L6a
            r9 = 0
        L1e:
            r10 = r5[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L65
            int r12 = r9 - r6
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = 0
        L38:
            if (r14 >= r12) goto L62
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L59
            int r15 = r9 << 3
            int r15 = r15 + r14
            r15 = r3[r15]
            rj6 r15 = (defpackage.rj6) r15
            e71 r8 = r1.o0()
            r16 = r13
            androidx.compose.foundation.AbstractClickableNode$onFocusChange$1$1 r13 = new androidx.compose.foundation.AbstractClickableNode$onFocusChange$1$1
            r13.<init>(r1, r15, r4)
            defpackage.bt2.G(r8, r4, r4, r13, r7)
            goto L5b
        L59:
            r16 = r13
        L5b:
            long r10 = r10 >> r16
            int r14 = r14 + 1
            r13 = r16
            goto L38
        L62:
            r8 = r13
            if (r12 != r8) goto L6a
        L65:
            if (r9 == r6) goto L6a
            int r9 = r9 + 1
            goto L1e
        L6a:
            rj6 r3 = r1.F
            if (r3 == 0) goto L7a
            e71 r5 = r1.o0()
            androidx.compose.foundation.AbstractClickableNode$onFocusChange$2$1 r6 = new androidx.compose.foundation.AbstractClickableNode$onFocusChange$2$1
            r6.<init>(r1, r3, r4)
            defpackage.bt2.G(r5, r4, r4, r6, r7)
        L7a:
            r2.a()
            r1.F = r4
            r1.getClass()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AbstractClickableNode$focusableNode$1.b(boolean):void");
    }

    @Override // defpackage.dp2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b(((Boolean) obj).booleanValue());
        return tx8.a;
    }
}
