package ir.mservices.market.version2.ui.recycler.filter;

import defpackage.w91;
import ir.mservices.market.version2.ApplicationLauncher;
import ir.mservices.market.version2.manager.d;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieWatchedFilter extends GeneralFilter {
    public final Integer b;
    public final transient d c;

    public MovieWatchedFilter(GeneralFilter generalFilter, Integer num) {
        super(generalFilter);
        this.b = num;
        this.c = (d) ((w91) ApplicationLauncher.o.b()).A0.get();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0092  */
    @Override // ir.mservices.market.common.Filter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean u(ir.mservices.market.common.ui.recycler.MyketRecyclerData r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.o85
            r1 = 0
            if (r0 == 0) goto L9
            r0 = r9
            o85 r0 = (defpackage.o85) r0
            goto La
        L9:
            r0 = r1
        La:
            if (r0 == 0) goto L1e
            ir.mservices.market.movie.ui.common.MovieHomeMovieData r0 = (ir.mservices.market.movie.ui.common.MovieHomeMovieData) r0
            g81 r2 = new g81
            ir.mservices.market.movie.data.webapi.MovieDto r0 = r0.a
            java.lang.String r3 = r0.getId()
            java.lang.String r0 = r0.getType()
            r2.<init>(r3, r0)
            goto L1f
        L1e:
            r2 = r1
        L1f:
            r0 = 1
            r3 = 0
            java.lang.Integer r4 = r8.b
            if (r4 == 0) goto L92
            int r4 = r4.intValue()
            if (r2 == 0) goto L8b
            java.lang.String r5 = r2.c
            java.lang.String r6 = "movie"
            boolean r5 = defpackage.js3.i(r5, r6)
            if (r5 == 0) goto L36
            goto L37
        L36:
            r2 = r1
        L37:
            if (r2 == 0) goto L8b
            ir.mservices.market.version2.manager.d r5 = r8.c
            if (r5 == 0) goto L85
            java.lang.String r2 = r2.b
            java.util.ArrayList r5 = r5.e
            yg2 r6 = new yg2
            r7 = 26
            r6.<init>(r7)
            java.util.List r5 = kotlin.collections.a.J0(r5, r6)
            java.util.Iterator r5 = r5.iterator()
        L50:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L66
            java.lang.Object r6 = r5.next()
            r7 = r6
            h85 r7 = (defpackage.h85) r7
            java.lang.String r7 = r7.b
            boolean r7 = defpackage.js3.i(r7, r2)
            if (r7 == 0) goto L50
            goto L67
        L66:
            r6 = r1
        L67:
            h85 r6 = (defpackage.h85) r6
            if (r6 == 0) goto L73
            int r1 = r6.a()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L73:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            int r1 = defpackage.bt2.t(r1, r2)
            if (r1 < 0) goto L7f
            r1 = r0
            goto L80
        L7f:
            r1 = r3
        L80:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            goto L8b
        L85:
            java.lang.String r9 = "movieProgressManager"
            defpackage.js3.V(r9)
            throw r1
        L8b:
            if (r1 == 0) goto L92
            boolean r1 = r1.booleanValue()
            goto L93
        L92:
            r1 = r3
        L93:
            if (r1 != 0) goto La3
            ir.mservices.market.common.Filter r1 = r8.a
            if (r1 == 0) goto L9e
            boolean r9 = r1.u(r9)
            goto L9f
        L9e:
            r9 = r3
        L9f:
            if (r9 == 0) goto La2
            goto La3
        La2:
            return r3
        La3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.version2.ui.recycler.filter.MovieWatchedFilter.u(ir.mservices.market.common.ui.recycler.MyketRecyclerData):boolean");
    }
}
