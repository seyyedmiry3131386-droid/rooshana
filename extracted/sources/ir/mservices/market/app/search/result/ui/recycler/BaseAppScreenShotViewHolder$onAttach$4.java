package ir.mservices.market.app.search.result.ui.recycler;

import defpackage.bz6;
import defpackage.e71;
import defpackage.g51;
import defpackage.ox5;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.version2.ui.recycler.filter.GeneralFilter;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.search.result.ui.recycler.BaseAppScreenShotViewHolder$onAttach$4", f = "SearchScreenShotApp.kt", l = {317}, m = "invokeSuspend", v = 1)
final class BaseAppScreenShotViewHolder$onAttach$4 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ b b;
    public final /* synthetic */ BaseSearchScreenshotData c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseAppScreenShotViewHolder$onAttach$4(g51 g51Var, b bVar, BaseSearchScreenshotData baseSearchScreenshotData) {
        super(2, g51Var);
        this.b = bVar;
        this.c = baseSearchScreenshotData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new BaseAppScreenShotViewHolder$onAttach$4(g51Var, this.b, this.c);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((BaseAppScreenShotViewHolder$onAttach$4) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.b;
            ox5 ox5Var = bVar.K;
            if (ox5Var != null) {
                bz6 bz6Var = new bz6(bVar.C(this.c, bVar.O), (GeneralFilter) null, (qp2) null, 6);
                this.a = 1;
                if (ox5Var.L(bz6Var, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return tx8.a;
    }
}
