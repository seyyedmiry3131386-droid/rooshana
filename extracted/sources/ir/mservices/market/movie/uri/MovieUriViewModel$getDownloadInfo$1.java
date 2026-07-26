package ir.mservices.market.movie.uri;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.movie.data.webapi.EpisodeDto;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.movie.uri.MovieUriViewModel$getDownloadInfo$1", f = "MovieUriViewModel.kt", l = {248, 250, 257, 259}, m = "invokeSuspend", v = 1)
final class MovieUriViewModel$getDownloadInfo$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ MovieUriViewModel b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ EpisodeDto e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieUriViewModel$getDownloadInfo$1(MovieUriViewModel movieUriViewModel, String str, String str2, EpisodeDto episodeDto, g51 g51Var) {
        super(2, g51Var);
        this.b = movieUriViewModel;
        this.c = str;
        this.d = str2;
        this.e = episodeDto;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new MovieUriViewModel$getDownloadInfo$1(this.b, this.c, this.d, this.e, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((MovieUriViewModel$getDownloadInfo$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x009c, code lost:
    
        if (r0.emit(r15, r14) == r7) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c4, code lost:
    
        if (r15.emit(r0, r14) == r7) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d6, code lost:
    
        if (r0.emit(r1, r14) == r7) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e3  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.movie.uri.MovieUriViewModel$getDownloadInfo$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
