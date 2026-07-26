package ir.mservices.market.movie.streamers;

import androidx.paging.e;
import androidx.paging.m;
import defpackage.a67;
import defpackage.bp2;
import defpackage.bz6;
import defpackage.g51;
import defpackage.gu9;
import defpackage.h78;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.ut4;
import defpackage.xe2;
import defpackage.y97;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.movie.streamers.StreamerProfileViewModel$doRequest$1", f = "StreamerProfileViewModel.kt", l = {73}, m = "invokeSuspend", v = 1)
final class StreamerProfileViewModel$doRequest$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ StreamerProfileViewModel b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamerProfileViewModel$doRequest$1(StreamerProfileViewModel streamerProfileViewModel, g51 g51Var) {
        super(2, g51Var);
        this.b = streamerProfileViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new StreamerProfileViewModel$doRequest$1(this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((StreamerProfileViewModel$doRequest$1) create((bz6) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        final StreamerProfileViewModel streamerProfileViewModel = this.b;
        if (i == 0) {
            b.b(obj);
            final ut4 ut4Var = streamerProfileViewModel.v;
            h78 h78Var = streamerProfileViewModel.x;
            final String str = h78Var.a;
            final String str2 = h78Var.b;
            this.a = 1;
            ut4Var.getClass();
            obj = (xe2) new m(gu9.B(), new bp2() { // from class: ir.mservices.market.movie.streamers.model.a
                @Override // defpackage.bp2
                public final Object invoke() {
                    return new ir.mservices.market.model.paging.b(new StreamersRepositoryImpl$getStreamer$2$1(null, ut4Var, streamerProfileViewModel, str, str2));
                }
            }).a;
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        bz6 bz6Var = new bz6(e.b(gu9.x((xe2) obj, new a67(17, streamerProfileViewModel)), y97.G(streamerProfileViewModel)), null, null, null, 14);
        bz6Var.c = new StreamerProfileViewModel$doRequest$1$2$1(2, streamerProfileViewModel, StreamerProfileViewModel.class, "setDivider", "setDivider(Lir/mservices/market/common/ui/recycler/RecyclerItem;Lir/mservices/market/common/ui/recycler/RecyclerItem;)Lir/mservices/market/common/ui/recycler/RecyclerItem;", 0);
        return bz6Var;
    }
}
