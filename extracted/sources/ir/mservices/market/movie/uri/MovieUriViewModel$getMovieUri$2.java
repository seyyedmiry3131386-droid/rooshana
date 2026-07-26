package ir.mservices.market.movie.uri;

import defpackage.e71;
import defpackage.g51;
import defpackage.h99;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.movie.data.webapi.PlayerMovieDto;
import ir.myket.movie.common.domain.models.PlaySource;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.movie.uri.MovieUriViewModel$getMovieUri$2", f = "MovieUriViewModel.kt", l = {96, 101, 115, 120, 138, 144, 145}, m = "invokeSuspend", v = 1)
final class MovieUriViewModel$getMovieUri$2 extends SuspendLambda implements qp2 {
    public Object a;
    public MovieUriViewModel b;
    public String c;
    public h99 d;
    public int e;
    public int f;
    public final /* synthetic */ MovieUriViewModel g;
    public final /* synthetic */ String h;
    public final /* synthetic */ String i;
    public final /* synthetic */ PlayerMovieDto j;
    public final /* synthetic */ List k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ String m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieUriViewModel$getMovieUri$2(MovieUriViewModel movieUriViewModel, String str, String str2, PlayerMovieDto playerMovieDto, List list, boolean z, String str3, g51 g51Var) {
        super(2, g51Var);
        PlaySource[] playSourceArr = PlaySource.a;
        this.g = movieUriViewModel;
        this.h = str;
        this.i = str2;
        this.j = playerMovieDto;
        this.k = list;
        this.l = z;
        this.m = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        PlaySource[] playSourceArr = PlaySource.a;
        return new MovieUriViewModel$getMovieUri$2(this.g, this.h, this.i, this.j, this.k, this.l, this.m, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((MovieUriViewModel$getMovieUri$2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x01a1, code lost:
    
        if (r2.emit(r9, r20) == r6) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01a5, code lost:
    
        r0 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01cb, code lost:
    
        if (r2.emit(r1, r20) == r6) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0213, code lost:
    
        if (r2.emit(r12, r20) == r6) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0245, code lost:
    
        if (r1.emit(r2, r20) == r6) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0287, code lost:
    
        if (r9.emit(r2, r20) != r6) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x012c A[PHI: r0
      0x012c: PHI (r0v8 java.lang.Object) = (r0v7 java.lang.Object), (r0v18 java.lang.Object) binds: [B:38:0x0128, B:9:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x028e  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 692
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.movie.uri.MovieUriViewModel$getMovieUri$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
