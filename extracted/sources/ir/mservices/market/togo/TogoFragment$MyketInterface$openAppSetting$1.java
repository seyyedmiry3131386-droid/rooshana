package ir.mservices.market.togo;

import androidx.fragment.app.FragmentActivity;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.togo.TogoFragment$MyketInterface$openAppSetting$1", f = "TogoFragment.kt", l = {}, m = "invokeSuspend", v = 1)
public final class TogoFragment$MyketInterface$openAppSetting$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ TogoFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TogoFragment$MyketInterface$openAppSetting$1(g51 g51Var, TogoFragment togoFragment, String str) {
        super(2, g51Var);
        this.a = str;
        this.b = togoFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new TogoFragment$MyketInterface$openAppSetting$1(g51Var, this.b, this.a);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        TogoFragment$MyketInterface$openAppSetting$1 togoFragment$MyketInterface$openAppSetting$1 = (TogoFragment$MyketInterface$openAppSetting$1) create((FragmentActivity) obj, (g51) obj2);
        tx8 tx8Var = tx8.a;
        togoFragment$MyketInterface$openAppSetting$1.invokeSuspend(tx8Var);
        return tx8Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0027  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            kotlin.b.b(r5)
            java.lang.String r5 = r4.a
            if (r5 == 0) goto L33
            boolean r0 = defpackage.f88.n0(r5)
            java.lang.String r1 = "installManager"
            r2 = 0
            ir.mservices.market.togo.TogoFragment r3 = r4.b
            if (r0 != 0) goto L24
            dp3 r0 = r3.V0
            if (r0 == 0) goto L20
            boolean r0 = r0.G(r5)
            if (r0 == 0) goto L24
            r0 = r5
            goto L25
        L20:
            defpackage.js3.V(r1)
            throw r2
        L24:
            r0 = r2
        L25:
            if (r0 == 0) goto L33
            dp3 r0 = r3.V0
            if (r0 == 0) goto L2f
            r0.P(r5)
            goto L33
        L2f:
            defpackage.js3.V(r1)
            throw r2
        L33:
            tx8 r5 = defpackage.tx8.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.togo.TogoFragment$MyketInterface$openAppSetting$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
