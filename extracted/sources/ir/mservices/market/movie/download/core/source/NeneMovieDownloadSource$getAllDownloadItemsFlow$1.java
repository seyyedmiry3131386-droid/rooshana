package ir.mservices.market.movie.download.core.source;

import defpackage.bs1;
import defpackage.es1;
import defpackage.g51;
import defpackage.js3;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.ze2;
import ir.mservices.market.movie.download.core.model.MovieDownloadMetaData;
import java.util.Iterator;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.movie.download.core.source.NeneMovieDownloadSource$getAllDownloadItemsFlow$1", f = "NeneMovieDownloadSource.kt", l = {102}, m = "invokeSuspend", v = 1)
final class NeneMovieDownloadSource$getAllDownloadItemsFlow$1 extends SuspendLambda implements qp2 {
    public Iterator a;
    public int b;
    public int c;
    public /* synthetic */ Object d;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        throw null;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((NeneMovieDownloadSource$getAllDownloadItemsFlow$1) create((ze2) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ze2 ze2Var = (ze2) this.d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.c;
        if (i == 0) {
            b.b(obj);
            throw null;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i2 = this.b;
        Iterator it = this.a;
        b.b(obj);
        while (it.hasNext()) {
            Object obj2 = ((es1) ((bs1) it.next())).e;
            js3.n(obj2, "null cannot be cast to non-null type ir.mservices.market.movie.download.core.model.MovieDownloadMetaData");
            this.d = ze2Var;
            this.a = it;
            this.b = i2;
            this.c = 1;
            if (ze2Var.emit((MovieDownloadMetaData) obj2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return tx8.a;
    }
}
