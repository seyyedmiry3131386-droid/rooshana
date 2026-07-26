package ir.mservices.market.togo;

import androidx.fragment.app.FragmentActivity;
import defpackage.am2;
import defpackage.dw1;
import defpackage.f88;
import defpackage.g51;
import defpackage.js3;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xm8;
import ir.mservices.market.data.NavIntentDirections;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.togo.TogoFragment$MyketInterface$openUrl$1", f = "TogoFragment.kt", l = {}, m = "invokeSuspend", v = 1)
public final class TogoFragment$MyketInterface$openUrl$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ TogoFragment c;
    public final /* synthetic */ String d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TogoFragment$MyketInterface$openUrl$1(String str, boolean z, TogoFragment togoFragment, String str2, boolean z2, boolean z3, boolean z4, boolean z5, g51 g51Var) {
        super(2, g51Var);
        this.a = str;
        this.b = z;
        this.c = togoFragment;
        this.d = str2;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new TogoFragment$MyketInterface$openUrl$1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        TogoFragment$MyketInterface$openUrl$1 togoFragment$MyketInterface$openUrl$1 = (TogoFragment$MyketInterface$openUrl$1) create((FragmentActivity) obj, (g51) obj2);
        tx8 tx8Var = tx8.a;
        togoFragment$MyketInterface$openUrl$1.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        tx8 tx8Var = tx8.a;
        String str = this.a;
        if (str != null && !f88.n0(str)) {
            boolean z = this.b;
            TogoFragment togoFragment = this.c;
            if (z) {
                int i = TogoFragment.o1;
                togoFragment.J0.q();
            }
            NavIntentDirections.Togo togo = new NavIntentDirections.Togo(new xm8(this.a, this.d, this.e, this.f, this.g, this.h, false));
            int i2 = TogoFragment.o1;
            am2 am2Var = togoFragment.J0;
            js3.o(am2Var, "access$getFragmentNavigation$p$s1244246067(...)");
            dw1.C(am2Var, togo, null, 6);
        }
        return tx8Var;
    }
}
