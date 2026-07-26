package ir.mservices.market.version2.manager.install;

import defpackage.e71;
import defpackage.g51;
import defpackage.lh0;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.version2.manager.install.PreapprovalManager$1", f = "PreapprovalManager.kt", l = {88, 90}, m = "invokeSuspend", v = 1)
final class PreapprovalManager$1 extends SuspendLambda implements qp2 {
    public lh0 a;
    public int b;
    public final /* synthetic */ f c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreapprovalManager$1(f fVar, g51 g51Var) {
        super(2, g51Var);
        this.c = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new PreapprovalManager$1(this.c, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((PreapprovalManager$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Path cross not found for [B:18:0x004e, B:11:0x002f], limit reached: 22 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004c -> B:11:0x002f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0056 -> B:11:0x002f). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r7.b
            ir.mservices.market.version2.manager.install.f r2 = r7.c
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L22
            if (r1 == r4) goto L1c
            if (r1 != r3) goto L14
            lh0 r1 = r7.a
            kotlin.b.b(r8)
            goto L2f
        L14:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1c:
            lh0 r1 = r7.a
            kotlin.b.b(r8)
            goto L3a
        L22:
            kotlin.b.b(r8)
            kotlinx.coroutines.channels.a r8 = r2.j
            r8.getClass()
            lh0 r1 = new lh0
            r1.<init>(r8)
        L2f:
            r7.a = r1
            r7.b = r4
            java.lang.Object r8 = r1.d(r7)
            if (r8 != r0) goto L3a
            goto L58
        L3a:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L59
            java.lang.Object r8 = r1.f()
            ri6 r8 = (defpackage.ri6) r8
            r5 = 34
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 < r5) goto L2f
            r7.a = r1
            r7.b = r3
            java.lang.Object r8 = ir.mservices.market.version2.manager.install.f.b(r2, r8, r7)
            if (r8 != r0) goto L2f
        L58:
            return r0
        L59:
            tx8 r8 = defpackage.tx8.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.version2.manager.install.PreapprovalManager$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
