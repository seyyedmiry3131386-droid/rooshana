package defpackage;

import androidx.paging.m;
import ir.mservices.market.movie.data.webapi.BackgroundImageDto;
import ir.mservices.market.movie.data.webapi.MovieListDto;
import ir.mservices.market.movie.ui.list.model.a;

/* JADX INFO: loaded from: classes3.dex */
public final class k45 {
    public final c75 a;

    public k45(c75 c75Var) {
        js3.p(c75Var, "movieService");
        this.a = c75Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static ir.mservices.market.movie.data.webapi.MovieListDto a(ir.mservices.market.movie.data.webapi.MovieListDto r11, boolean r12, ir.mservices.market.movie.data.webapi.BackgroundImageDto r13) {
        /*
            java.util.List r0 = r11.getIgnoreConditions()
            r1 = 0
            if (r0 == 0) goto L33
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = defpackage.wu0.V(r0, r3)
            r2.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
        L16:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L34
            java.lang.Object r3 = r0.next()
            ir.mservices.market.version2.webapi.responsedto.MovieIgnoreConditionDto r3 = (ir.mservices.market.version2.webapi.responsedto.MovieIgnoreConditionDto) r3
            ir.mservices.market.version2.ui.recycler.filter.FilterCondition$IntCondition r4 = new ir.mservices.market.version2.ui.recycler.filter.FilterCondition$IntCondition
            java.lang.String r5 = r3.getCondition()
            java.lang.Integer r3 = r3.getPercent()
            r4.<init>(r5, r3)
            r2.add(r4)
            goto L16
        L33:
            r2 = r1
        L34:
            ir.mservices.market.version2.ui.recycler.filter.GeneralFilter r0 = ir.mservices.market.version2.ui.recycler.filter.a.b(r2)
            if (r0 == 0) goto L7c
            java.util.List r2 = r11.getMovies()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L47:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L68
            java.lang.Object r4 = r2.next()
            r6 = r4
            ir.mservices.market.movie.data.webapi.MovieDto r6 = (ir.mservices.market.movie.data.webapi.MovieDto) r6
            ir.mservices.market.movie.ui.common.MovieHomeMovieData r5 = new ir.mservices.market.movie.ui.common.MovieHomeMovieData
            r9 = 14
            r10 = 0
            r7 = 0
            r8 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            boolean r5 = r0.u(r5)
            if (r5 != 0) goto L47
            r3.add(r4)
            goto L47
        L68:
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L72
            if (r12 != 0) goto L71
            goto L72
        L71:
            r3 = r1
        L72:
            if (r3 == 0) goto L78
            java.util.ArrayList r1 = kotlin.collections.a.Q0(r3)
        L78:
            if (r1 == 0) goto L7c
        L7a:
            r6 = r1
            goto L85
        L7c:
            java.util.List r12 = r11.getMovies()
            java.util.ArrayList r1 = kotlin.collections.a.Q0(r12)
            goto L7a
        L85:
            if (r13 == 0) goto L91
            ir.mservices.market.movie.data.webapi.MovieDto$Companion r12 = ir.mservices.market.movie.data.webapi.MovieDto.Companion
            ir.mservices.market.movie.data.webapi.MovieDto r12 = r12.getEmpty()
            r13 = 0
            r6.add(r13, r12)
        L91:
            ir.mservices.market.movie.data.webapi.MovieListDto r2 = new ir.mservices.market.movie.data.webapi.MovieListDto
            java.lang.String r3 = r11.getTitle()
            boolean r4 = r11.getEol()
            java.lang.String r5 = r11.getAnalyticsName()
            java.util.List r7 = r11.getIgnoreConditions()
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k45.a(ir.mservices.market.movie.data.webapi.MovieListDto, boolean, ir.mservices.market.movie.data.webapi.BackgroundImageDto):ir.mservices.market.movie.data.webapi.MovieListDto");
    }

    public final xe2 b(MovieListDto movieListDto, String str, Object obj, boolean z, BackgroundImageDto backgroundImageDto) {
        js3.p(str, "listKey");
        return (xe2) new m(gu9.n(z), new a(movieListDto, str, this, obj, backgroundImageDto)).a;
    }
}
