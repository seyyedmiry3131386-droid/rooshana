package ir.mservices.market.movie.ui.home;

import androidx.paging.e;
import androidx.paging.m;
import defpackage.bp2;
import defpackage.bz6;
import defpackage.g51;
import defpackage.gu9;
import defpackage.m22;
import defpackage.pa2;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xe2;
import defpackage.y97;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.movie.ui.home.MovieHomeViewModel$doRequest$1", f = "MovieHomeViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class MovieHomeViewModel$doRequest$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ MovieHomeViewModel a;

    /* JADX INFO: renamed from: ir.mservices.market.movie.ui.home.MovieHomeViewModel$doRequest$1$2, reason: invalid class name */
    final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements qp2 {
        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((MovieHomeViewModel) this.receiver).setDivider((RecyclerItem) obj, (RecyclerItem) obj2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieHomeViewModel$doRequest$1(MovieHomeViewModel movieHomeViewModel, g51 g51Var) {
        super(2, g51Var);
        this.a = movieHomeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new MovieHomeViewModel$doRequest$1(this.a, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((MovieHomeViewModel$doRequest$1) create((bz6) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        final MovieHomeViewModel movieHomeViewModel = this.a;
        final pa2 pa2Var = movieHomeViewModel.x;
        final String str = movieHomeViewModel.B;
        if (str == null) {
            str = "main";
        }
        pa2Var.getClass();
        return new bz6(e.b(gu9.x((xe2) new m(gu9.n(false), new bp2() { // from class: ir.mservices.market.movie.ui.home.model.a
            @Override // defpackage.bp2
            public final Object invoke() {
                return new ir.mservices.market.model.paging.a(new MovieHomeRepositoryImpl$getHome$1$1(pa2Var, str, movieHomeViewModel, null), null);
            }
        }).a, new m22(28, movieHomeViewModel)), y97.G(movieHomeViewModel)), null, new AnonymousClass2(2, movieHomeViewModel, MovieHomeViewModel.class, "setDivider", "setDivider(Lir/mservices/market/common/ui/recycler/RecyclerItem;Lir/mservices/market/common/ui/recycler/RecyclerItem;)Lir/mservices/market/common/ui/recycler/RecyclerItem;", 0), null, 10);
    }
}
