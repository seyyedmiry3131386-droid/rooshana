package retrofit2;

import defpackage.dl0;
import defpackage.g51;
import defpackage.ok4;
import defpackage.om0;
import defpackage.p2;
import defpackage.pt2;
import defpackage.sz3;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {
    public static final Object a(dl0 dl0Var, g51 g51Var) {
        om0 om0Var = new om0(1, ok4.I(g51Var));
        om0Var.v();
        om0Var.x(new sz3(dl0Var, 0));
        dl0Var.l0(new pt2(28, om0Var));
        Object objU = om0Var.u();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        return objU;
    }

    public static final Object b(dl0 dl0Var, g51 g51Var) {
        om0 om0Var = new om0(1, ok4.I(g51Var));
        om0Var.v();
        om0Var.x(new sz3(dl0Var, 1));
        dl0Var.l0(new p2(om0Var));
        Object objU = om0Var.u();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        return objU;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(java.lang.Throwable r5, defpackage.g51 r6) {
        /*
            boolean r0 = r6 instanceof retrofit2.KotlinExtensions$suspendAndThrow$1
            if (r0 == 0) goto L13
            r0 = r6
            retrofit2.KotlinExtensions$suspendAndThrow$1 r0 = (retrofit2.KotlinExtensions$suspendAndThrow$1) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            retrofit2.KotlinExtensions$suspendAndThrow$1 r0 = new retrofit2.KotlinExtensions$suspendAndThrow$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r0.b
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 == r2) goto L2b
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2b:
            kotlin.KotlinNothingValueException r5 = defpackage.t61.q(r6)
            throw r5
        L30:
            kotlin.b.b(r6)
            r0.b = r2
            ug1 r6 = defpackage.up1.a
            w61 r1 = r0.getContext()
            g6 r2 = new g6
            r3 = 17
            r4 = 0
            r2.<init>(r3, r0, r5, r4)
            r6.U(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.a.c(java.lang.Throwable, g51):void");
    }
}
