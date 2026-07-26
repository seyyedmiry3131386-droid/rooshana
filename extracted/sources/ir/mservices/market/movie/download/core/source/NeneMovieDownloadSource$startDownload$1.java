package ir.mservices.market.movie.download.core.source;

import defpackage.tb1;
import ir.mservices.market.movie.download.core.b;
import ir.mservices.market.movie.download.core.model.MovieDownloadMetaData;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.movie.download.core.source.NeneMovieDownloadSource", f = "NeneMovieDownloadSource.kt", l = {281}, m = "startDownload", v = 1)
final class NeneMovieDownloadSource$startDownload$1 extends ContinuationImpl {
    public MovieDownloadMetaData a;
    public b b;
    public /* synthetic */ Object c;
    public final /* synthetic */ a d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NeneMovieDownloadSource$startDownload$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.d(null, null, null, this);
    }
}
