package ir.mservices.market.movie.download.core.source;

import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.w05;
import defpackage.xe2;
import defpackage.ze2;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.movie.download.core.source.NeneMovieDownloadSource$isEpisodeDownloadFinish$$inlined$transform$1", f = "NeneMovieDownloadSource.kt", l = {36}, m = "invokeSuspend", v = 1)
public final class NeneMovieDownloadSource$isEpisodeDownloadFinish$$inlined$transform$1 extends SuspendLambda implements qp2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ xe2 c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NeneMovieDownloadSource$isEpisodeDownloadFinish$$inlined$transform$1(xe2 xe2Var, g51 g51Var, String str) {
        super(2, g51Var);
        this.c = xe2Var;
        this.d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        NeneMovieDownloadSource$isEpisodeDownloadFinish$$inlined$transform$1 neneMovieDownloadSource$isEpisodeDownloadFinish$$inlined$transform$1 = new NeneMovieDownloadSource$isEpisodeDownloadFinish$$inlined$transform$1(this.c, g51Var, this.d);
        neneMovieDownloadSource$isEpisodeDownloadFinish$$inlined$transform$1.b = obj;
        return neneMovieDownloadSource$isEpisodeDownloadFinish$$inlined$transform$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((NeneMovieDownloadSource$isEpisodeDownloadFinish$$inlined$transform$1) create((ze2) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            w05 w05Var = new w05((ze2) this.b, this.d, 3);
            this.b = null;
            this.a = 1;
            if (this.c.a(w05Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        return tx8.a;
    }
}
