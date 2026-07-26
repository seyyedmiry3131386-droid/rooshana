package ir.mservices.market.movie.streamers.moreStreamers;

import androidx.paging.e;
import androidx.paging.m;
import defpackage.bz6;
import defpackage.g51;
import defpackage.gu9;
import defpackage.m22;
import defpackage.qm5;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xe2;
import defpackage.y97;
import ir.mservices.market.movie.streamers.moreStreamers.model.a;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.movie.streamers.moreStreamers.MoreStreamersViewModel$doRequest$1", f = "MoreStreamersViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class MoreStreamersViewModel$doRequest$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ MoreStreamersViewModel a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoreStreamersViewModel$doRequest$1(MoreStreamersViewModel moreStreamersViewModel, g51 g51Var) {
        super(2, g51Var);
        this.a = moreStreamersViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new MoreStreamersViewModel$doRequest$1(this.a, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((MoreStreamersViewModel$doRequest$1) create((bz6) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        MoreStreamersViewModel moreStreamersViewModel = this.a;
        qm5 qm5Var = moreStreamersViewModel.v;
        qm5Var.getClass();
        return new bz6(e.b(gu9.x((xe2) new m(gu9.n(false), new a(null, qm5Var, moreStreamersViewModel)).a, new m22(21, moreStreamersViewModel)), y97.G(moreStreamersViewModel)), null, null, null, 14);
    }
}
