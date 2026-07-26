package ir.mservices.market.app.search.result.ui;

import defpackage.e71;
import defpackage.f88;
import defpackage.g51;
import defpackage.js3;
import defpackage.p3;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.search.result.ui.AppSearchRecyclerListFragment$onViewCreated$4", f = "AppSearchRecyclerListFragment.kt", l = {321}, m = "invokeSuspend", v = 1)
final class AppSearchRecyclerListFragment$onViewCreated$4 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ AppSearchRecyclerListFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppSearchRecyclerListFragment$onViewCreated$4(AppSearchRecyclerListFragment appSearchRecyclerListFragment, g51 g51Var) {
        super(2, g51Var);
        this.b = appSearchRecyclerListFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new AppSearchRecyclerListFragment$onViewCreated$4(this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((AppSearchRecyclerListFragment$onViewCreated$4) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String string;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            this.a = 1;
            if (kotlinx.coroutines.a.e(500L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        AppSearchRecyclerListFragment appSearchRecyclerListFragment = this.b;
        int i2 = p3.g(appSearchRecyclerListFragment.F()).b / appSearchRecyclerListFragment.b1;
        ir.mservices.market.version2.ui.recycler.adapter.a aVar = appSearchRecyclerListFragment.P0;
        if (aVar != null) {
            int iIntValue = new Integer(aVar.D().a()).intValue();
            if (!appSearchRecyclerListFragment.D && (((iIntValue / appSearchRecyclerListFragment.I0() < i2 && iIntValue != 0) || appSearchRecyclerListFragment.U0().F) && !js3.i(appSearchRecyclerListFragment.U0().E, Boolean.FALSE) && (string = appSearchRecyclerListFragment.p0().getString("BUNDLE_KEY_QUERY")) != null && !f88.n0(string))) {
                appSearchRecyclerListFragment.Y0();
            }
        }
        return tx8.a;
    }
}
