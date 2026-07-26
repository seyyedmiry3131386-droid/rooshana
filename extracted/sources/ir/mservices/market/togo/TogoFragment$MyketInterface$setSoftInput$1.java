package ir.mservices.market.togo;

import androidx.fragment.app.FragmentActivity;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.togo.TogoFragment$MyketInterface$setSoftInput$1", f = "TogoFragment.kt", l = {}, m = "invokeSuspend", v = 1)
public final class TogoFragment$MyketInterface$setSoftInput$1 extends SuspendLambda implements qp2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TogoFragment$MyketInterface$setSoftInput$1(String str, g51 g51Var) {
        super(2, g51Var);
        this.b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        TogoFragment$MyketInterface$setSoftInput$1 togoFragment$MyketInterface$setSoftInput$1 = new TogoFragment$MyketInterface$setSoftInput$1(this.b, g51Var);
        togoFragment$MyketInterface$setSoftInput$1.a = obj;
        return togoFragment$MyketInterface$setSoftInput$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        TogoFragment$MyketInterface$setSoftInput$1 togoFragment$MyketInterface$setSoftInput$1 = (TogoFragment$MyketInterface$setSoftInput$1) create((FragmentActivity) obj, (g51) obj2);
        tx8 tx8Var = tx8.a;
        togoFragment$MyketInterface$setSoftInput$1.invokeSuspend(tx8Var);
        return tx8Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.a
            androidx.fragment.app.FragmentActivity r0 = (androidx.fragment.app.FragmentActivity) r0
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            kotlin.b.b(r4)
            java.lang.String r4 = r3.b
            if (r4 != 0) goto Lf
            java.lang.String r4 = ""
        Lf:
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r4 = r4.toLowerCase(r1)
            java.lang.String r1 = "toLowerCase(...)"
            defpackage.js3.o(r4, r1)
            int r1 = r4.hashCode()
            r2 = -934437708(0xffffffffc84d9cb4, float:-210546.81)
            if (r1 == r2) goto L46
            r2 = 110749(0x1b09d, float:1.55192E-40)
            if (r1 == r2) goto L3a
            r2 = 2129323981(0x7eeae7cd, float:1.5612146E38)
            if (r1 == r2) goto L2e
            goto L4e
        L2e:
            java.lang.String r1 = "nothing"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L37
            goto L4e
        L37:
            r4 = 48
            goto L52
        L3a:
            java.lang.String r1 = "pan"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L43
            goto L4e
        L43:
            r4 = 32
            goto L52
        L46:
            java.lang.String r1 = "resize"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L50
        L4e:
            r4 = 0
            goto L52
        L50:
            r4 = 16
        L52:
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L5b
            r0.setSoftInputMode(r4)
        L5b:
            tx8 r4 = defpackage.tx8.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.togo.TogoFragment$MyketInterface$setSoftInput$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
