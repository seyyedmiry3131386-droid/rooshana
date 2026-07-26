package coil3.compose;

import androidx.compose.ui.layout.f;
import androidx.compose.ui.node.j;
import defpackage.b96;
import defpackage.bl4;
import defpackage.d14;
import defpackage.dl4;
import defpackage.dp2;
import defpackage.el4;
import defpackage.g51;
import defpackage.h31;
import defpackage.hx4;
import defpackage.my7;
import defpackage.q;
import defpackage.qp2;
import defpackage.tx8;
import defpackage.yk4;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class b implements my7, d14 {
    public long b;
    public ArrayList c;

    @Override // defpackage.d14
    public final /* synthetic */ int a(j jVar, yk4 yk4Var, int i) {
        return f.d(this, jVar, yk4Var, i);
    }

    @Override // defpackage.d14
    public final /* synthetic */ int b(j jVar, yk4 yk4Var, int i) {
        return f.c(this, jVar, yk4Var, i);
    }

    @Override // defpackage.d14
    public final dl4 c(el4 el4Var, yk4 yk4Var, long j) {
        j(j);
        b96 b96VarT = yk4Var.t(j);
        return el4Var.D(b96VarT.a, b96VarT.b, kotlin.collections.b.I(), new q(b96VarT, 2));
    }

    @Override // defpackage.hx4
    public final /* synthetic */ hx4 d(hx4 hx4Var) {
        return bl4.g(this, hx4Var);
    }

    @Override // defpackage.d14
    public final /* synthetic */ int e(j jVar, yk4 yk4Var, int i) {
        return f.b(this, jVar, yk4Var, i);
    }

    @Override // defpackage.d14
    public final /* synthetic */ int f(j jVar, yk4 yk4Var, int i) {
        return f.a(this, jVar, yk4Var, i);
    }

    @Override // defpackage.hx4
    public final /* synthetic */ boolean g(dp2 dp2Var) {
        return bl4.a(this, dp2Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.my7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(defpackage.g51 r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof coil3.compose.ConstraintsSizeResolver$size$1
            if (r0 == 0) goto L13
            r0 = r8
            coil3.compose.ConstraintsSizeResolver$size$1 r0 = (coil3.compose.ConstraintsSizeResolver$size$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L1a
        L13:
            coil3.compose.ConstraintsSizeResolver$size$1 r0 = new coil3.compose.ConstraintsSizeResolver$size$1
            kotlin.coroutines.jvm.internal.ContinuationImpl r8 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r8
            r0.<init>(r7, r8)
        L1a:
            java.lang.Object r8 = r0.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            kotlin.jvm.internal.Ref$ObjectRef r0 = r0.a
            kotlin.b.b(r8)     // Catch: java.lang.Throwable -> L2b
            goto L64
        L2b:
            r8 = move-exception
            goto L74
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L35:
            kotlin.b.b(r8)
            long r4 = r7.b
            boolean r8 = defpackage.h31.k(r4)
            if (r8 == 0) goto L80
            kotlin.jvm.internal.Ref$ObjectRef r8 = new kotlin.jvm.internal.Ref$ObjectRef
            r8.<init>()
            r0.a = r8     // Catch: java.lang.Throwable -> L70
            r0.d = r3     // Catch: java.lang.Throwable -> L70
            om0 r2 = new om0     // Catch: java.lang.Throwable -> L70
            g51 r0 = defpackage.ok4.I(r0)     // Catch: java.lang.Throwable -> L70
            r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L70
            r2.v()     // Catch: java.lang.Throwable -> L70
            r8.a = r2     // Catch: java.lang.Throwable -> L70
            java.util.ArrayList r0 = r7.c     // Catch: java.lang.Throwable -> L70
            r0.add(r2)     // Catch: java.lang.Throwable -> L70
            java.lang.Object r0 = r2.u()     // Catch: java.lang.Throwable -> L70
            if (r0 != r1) goto L63
            return r1
        L63:
            r0 = r8
        L64:
            java.util.ArrayList r8 = r7.c
            java.lang.Object r0 = r0.a
            java.util.Collection r8 = defpackage.wu8.g(r8)
            r8.remove(r0)
            goto L80
        L70:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
        L74:
            java.util.ArrayList r1 = r7.c
            java.lang.Object r0 = r0.a
            java.util.Collection r1 = defpackage.wu8.g(r1)
            r1.remove(r0)
            throw r8
        L80:
            long r0 = r7.b
            dy7 r8 = new dy7
            int r2 = defpackage.h31.h(r0)
            mo1 r3 = defpackage.mo1.a
            r4 = 2147483647(0x7fffffff, float:NaN)
            if (r2 == r4) goto L98
            defpackage.at2.E(r2)
            lo1 r5 = new lo1
            r5.<init>(r2)
            goto L99
        L98:
            r5 = r3
        L99:
            int r0 = defpackage.h31.g(r0)
            if (r0 == r4) goto La7
            defpackage.at2.E(r0)
            lo1 r3 = new lo1
            r3.<init>(r0)
        La7:
            r8.<init>(r5, r3)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.compose.b.h(g51):java.lang.Object");
    }

    @Override // defpackage.hx4
    public final Object i(qp2 qp2Var, Object obj) {
        return qp2Var.invoke(obj, this);
    }

    public final void j(long j) {
        this.b = j;
        if (h31.k(j)) {
            return;
        }
        ArrayList arrayList = this.c;
        if (arrayList.isEmpty()) {
            return;
        }
        this.c = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((g51) it.next()).resumeWith(tx8.a);
        }
    }
}
