package ir.mservices.market.app.suggest.detail.ui;

import androidx.paging.e;
import androidx.paging.m;
import defpackage.bp2;
import defpackage.bz6;
import defpackage.g51;
import defpackage.gu9;
import defpackage.hh2;
import defpackage.js3;
import defpackage.l99;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xe2;
import defpackage.y97;
import defpackage.z45;
import ir.mservices.market.app.suggest.detail.data.PlayDetailHtmlRequestDto;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.suggest.detail.ui.PlayDetailViewModel$doRequest$1$1$1", f = "PlayDetailViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class PlayDetailViewModel$doRequest$1$1$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ PlayDetailViewModel a;
    public final /* synthetic */ l99 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayDetailViewModel$doRequest$1$1$1(PlayDetailViewModel playDetailViewModel, l99 l99Var, g51 g51Var) {
        super(2, g51Var);
        this.a = playDetailViewModel;
        this.b = l99Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new PlayDetailViewModel$doRequest$1$1$1(this.a, this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((PlayDetailViewModel$doRequest$1$1$1) create((bz6) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        final PlayDetailViewModel playDetailViewModel = this.a;
        final hh2 hh2Var = playDetailViewModel.u;
        final PlayDetailHtmlRequestDto playDetailHtmlRequestDto = new PlayDetailHtmlRequestDto((String) this.b.a);
        final String str = playDetailViewModel.w.a;
        hh2Var.getClass();
        js3.p(str, "packageName");
        return new bz6(e.b(gu9.x((xe2) new m(gu9.B(), new bp2() { // from class: ir.mservices.market.app.suggest.detail.model.a
            @Override // defpackage.bp2
            public final Object invoke() {
                return new ir.mservices.market.model.paging.b(new PlayDetailRepositoryImpl$getApplicationDetailFromPlayStore$1$1(hh2Var, playDetailHtmlRequestDto, str, playDetailViewModel, null));
            }
        }).a, new z45(18, playDetailViewModel)), y97.G(playDetailViewModel)), null, null, null, 14);
    }
}
