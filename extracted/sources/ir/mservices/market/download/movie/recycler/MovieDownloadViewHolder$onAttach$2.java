package ir.mservices.market.download.movie.recycler;

import defpackage.e71;
import defpackage.fu7;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.w25;
import kotlin.KotlinNothingValueException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.download.movie.recycler.MovieDownloadViewHolder$onAttach$2", f = "MovieDownload.kt", l = {189}, m = "invokeSuspend", v = 1)
final class MovieDownloadViewHolder$onAttach$2 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ MovieDownloadData b;
    public final /* synthetic */ a c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieDownloadViewHolder$onAttach$2(MovieDownloadData movieDownloadData, a aVar, g51 g51Var) {
        super(2, g51Var);
        this.b = movieDownloadData;
        this.c = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new MovieDownloadViewHolder$onAttach$2(this.b, this.c, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        ((MovieDownloadViewHolder$onAttach$2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        return CoroutineSingletons.a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            MovieDownloadData movieDownloadData = this.b;
            fu7 fu7Var = movieDownloadData.f;
            w25 w25Var = new w25(movieDownloadData, this.c);
            this.a = 1;
            if (fu7Var.a(w25Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
