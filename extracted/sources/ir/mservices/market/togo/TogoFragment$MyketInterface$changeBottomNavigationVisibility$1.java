package ir.mservices.market.togo;

import androidx.fragment.app.FragmentActivity;
import defpackage.g51;
import defpackage.qp2;
import defpackage.sj8;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.activity.LaunchContentActivity;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.togo.TogoFragment$MyketInterface$changeBottomNavigationVisibility$1", f = "TogoFragment.kt", l = {}, m = "invokeSuspend", v = 1)
public final class TogoFragment$MyketInterface$changeBottomNavigationVisibility$1 extends SuspendLambda implements qp2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TogoFragment$MyketInterface$changeBottomNavigationVisibility$1(boolean z, g51 g51Var) {
        super(2, g51Var);
        this.b = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        TogoFragment$MyketInterface$changeBottomNavigationVisibility$1 togoFragment$MyketInterface$changeBottomNavigationVisibility$1 = new TogoFragment$MyketInterface$changeBottomNavigationVisibility$1(this.b, g51Var);
        togoFragment$MyketInterface$changeBottomNavigationVisibility$1.a = obj;
        return togoFragment$MyketInterface$changeBottomNavigationVisibility$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        TogoFragment$MyketInterface$changeBottomNavigationVisibility$1 togoFragment$MyketInterface$changeBottomNavigationVisibility$1 = (TogoFragment$MyketInterface$changeBottomNavigationVisibility$1) create((FragmentActivity) obj, (g51) obj2);
        tx8 tx8Var = tx8.a;
        togoFragment$MyketInterface$changeBottomNavigationVisibility$1.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FragmentActivity fragmentActivity = (FragmentActivity) this.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        LaunchContentActivity launchContentActivity = fragmentActivity instanceof LaunchContentActivity ? (LaunchContentActivity) fragmentActivity : null;
        if (launchContentActivity != null) {
            launchContentActivity.l0(sj8.b().F, this.b);
        }
        return tx8.a;
    }
}
