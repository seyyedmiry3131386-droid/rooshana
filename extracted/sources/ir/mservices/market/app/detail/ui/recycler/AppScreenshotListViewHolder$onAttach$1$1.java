package ir.mservices.market.app.detail.ui.recycler;

import defpackage.bz6;
import defpackage.e71;
import defpackage.g51;
import defpackage.lm;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.detail.ui.recycler.AppScreenshotListViewHolder$onAttach$1$1", f = "AppScreenshotList.kt", l = {184}, m = "invokeSuspend", v = 1)
final class AppScreenshotListViewHolder$onAttach$1$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ lm b;
    public final /* synthetic */ AppScreenshotListData c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppScreenshotListViewHolder$onAttach$1$1(lm lmVar, AppScreenshotListData appScreenshotListData, g51 g51Var) {
        super(2, g51Var);
        this.b = lmVar;
        this.c = appScreenshotListData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new AppScreenshotListViewHolder$onAttach$1$1(this.b, this.c, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((AppScreenshotListViewHolder$onAttach$1$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            bz6 bz6Var = this.c.a;
            this.a = 1;
            if (this.b.L(bz6Var, this) == coroutineSingletons) {
                return coroutineSingletons;
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
