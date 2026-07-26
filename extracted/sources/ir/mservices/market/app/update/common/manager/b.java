package ir.mservices.market.app.update.common.manager;

import android.content.Context;
import defpackage.ak3;
import defpackage.ja1;
import defpackage.js3;
import defpackage.nz8;
import defpackage.ok4;
import defpackage.om0;
import defpackage.oz8;
import defpackage.vp7;
import defpackage.wx7;
import ir.mservices.market.version2.model.InActiveAppUpdateModel;
import java.util.ArrayList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public final oz8 a;
    public final Context b;
    public final l c;

    public b(oz8 oz8Var, Context context) {
        js3.p(oz8Var, "updateInActiveAppDAO");
        this.a = oz8Var;
        this.b = context;
        this.c = ja1.b(null);
        nz8 nz8Var = new nz8(oz8Var, new ak3(this), new ak3(this), this);
        ((ArrayList) oz8Var.b).add(nz8Var);
        nz8Var.b(new Void[0]);
    }

    public final Object a(String str, boolean z, SuspendLambda suspendLambda) {
        InActiveAppUpdateModel inActiveAppUpdateModel = new InActiveAppUpdateModel(str, z);
        om0 om0Var = new om0(1, ok4.I(suspendLambda));
        om0Var.v();
        this.a.z(inActiveAppUpdateModel, new vp7(this, inActiveAppUpdateModel, om0Var, str), new wx7(this, om0Var, z), this);
        Object objU = om0Var.u();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        return objU;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.String r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof ir.mservices.market.app.update.common.manager.InActiveAppUpdateManager$isAppActive$1
            if (r0 == 0) goto L13
            r0 = r7
            ir.mservices.market.app.update.common.manager.InActiveAppUpdateManager$isAppActive$1 r0 = (ir.mservices.market.app.update.common.manager.InActiveAppUpdateManager$isAppActive$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ir.mservices.market.app.update.common.manager.InActiveAppUpdateManager$isAppActive$1 r0 = new ir.mservices.market.app.update.common.manager.InActiveAppUpdateManager$isAppActive$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r6 = r0.a
            kotlin.b.b(r7)
            goto L48
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            kotlin.b.b(r7)
            o4 r7 = new o4
            r2 = 9
            kotlinx.coroutines.flow.l r4 = r5.c
            r7.<init>(r4, r2)
            r0.a = r6
            r0.d = r3
            java.lang.Object r7 = kotlinx.coroutines.flow.d.q(r7, r0)
            if (r7 != r1) goto L48
            return r1
        L48:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L4e:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L66
            java.lang.Object r0 = r7.next()
            r1 = r0
            ir.mservices.market.version2.model.InActiveAppUpdateModel r1 = (ir.mservices.market.version2.model.InActiveAppUpdateModel) r1
            java.lang.String r1 = r1.a()
            boolean r1 = defpackage.js3.i(r1, r6)
            if (r1 == 0) goto L4e
            goto L67
        L66:
            r0 = 0
        L67:
            ir.mservices.market.version2.model.InActiveAppUpdateModel r0 = (ir.mservices.market.version2.model.InActiveAppUpdateModel) r0
            if (r0 == 0) goto L6f
            boolean r3 = r0.b()
        L6f:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.app.update.common.manager.b.b(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
