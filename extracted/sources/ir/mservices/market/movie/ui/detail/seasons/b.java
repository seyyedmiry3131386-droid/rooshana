package ir.mservices.market.movie.ui.detail.seasons;

import defpackage.uz6;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends uz6 {
    public final /* synthetic */ MovieSeasonsRecyclerListFragment a;

    public b(MovieSeasonsRecyclerListFragment movieSeasonsRecyclerListFragment) {
        this.a = movieSeasonsRecyclerListFragment;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0049  */
    @Override // defpackage.uz6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(androidx.recyclerview.widget.RecyclerView r8, int r9, int r10) {
        /*
            r7 = this;
            androidx.recyclerview.widget.k r9 = r8.getLayoutManager()
            boolean r10 = r9 instanceof androidx.recyclerview.widget.GridLayoutManager
            r0 = 0
            if (r10 == 0) goto Lc
            androidx.recyclerview.widget.GridLayoutManager r9 = (androidx.recyclerview.widget.GridLayoutManager) r9
            goto Ld
        Lc:
            r9 = r0
        Ld:
            if (r9 == 0) goto Lb7
            int r9 = r9.O0()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            r1 = -1
            if (r9 == r1) goto L1b
            goto L1c
        L1b:
            r10 = r0
        L1c:
            if (r10 == 0) goto Lb7
            int r9 = r10.intValue()
            androidx.recyclerview.widget.o r8 = r8.I(r9)
            r10 = 0
            ir.mservices.market.movie.ui.detail.seasons.MovieSeasonsRecyclerListFragment r1 = r7.a
            if (r8 == 0) goto L4f
            boolean r2 = r8 instanceof defpackage.oq1
            if (r2 == 0) goto L49
            android.view.View r8 = r8.a
            int r8 = r8.getTop()
            r65 r2 = r1.q1
            if (r2 == 0) goto L43
            android.view.View r2 = r2.v
            int r2 = r2.getBottom()
            if (r8 > r2) goto L49
            r8 = 1
            goto L4a
        L43:
            java.lang.String r8 = "headerBinding"
            defpackage.js3.V(r8)
            throw r0
        L49:
            r8 = r10
        L4a:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            goto L50
        L4f:
            r8 = r0
        L50:
            if (r8 == 0) goto L57
            int r8 = r8.intValue()
            goto L58
        L57:
            r8 = r10
        L58:
            ir.mservices.market.version2.ui.recycler.adapter.a r2 = r1.Z0
            if (r2 == 0) goto Lb7
            oj3 r2 = r2.D()
            java.util.List r2 = r2.d
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L6d:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L91
            java.lang.Object r4 = r2.next()
            int r5 = r10 + 1
            if (r10 < 0) goto L8d
            r6 = r4
            ir.mservices.market.common.ui.recycler.RecyclerItem r6 = (ir.mservices.market.common.ui.recycler.RecyclerItem) r6
            ir.mservices.market.common.ui.recycler.MyketRecyclerData r6 = r6.c
            boolean r6 = r6 instanceof ir.mservices.market.movie.ui.detail.seasons.recycler.MovieSeasonFixedTitleData
            if (r6 == 0) goto L8b
            int r6 = r9 + r8
            if (r10 > r6) goto L8b
            r3.add(r4)
        L8b:
            r10 = r5
            goto L6d
        L8d:
            defpackage.br9.P()
            throw r0
        L91:
            java.lang.Object r8 = kotlin.collections.a.v0(r3)
            ir.mservices.market.common.ui.recycler.RecyclerItem r8 = (ir.mservices.market.common.ui.recycler.RecyclerItem) r8
            if (r8 == 0) goto Lb7
            ir.mservices.market.common.ui.recycler.MyketRecyclerData r8 = r8.c
            java.lang.String r9 = "null cannot be cast to non-null type ir.mservices.market.movie.ui.detail.seasons.recycler.MovieSeasonFixedTitleData"
            defpackage.js3.n(r8, r9)
            ir.mservices.market.movie.ui.detail.seasons.recycler.MovieSeasonFixedTitleData r8 = (ir.mservices.market.movie.ui.detail.seasons.recycler.MovieSeasonFixedTitleData) r8
            int r9 = ir.mservices.market.movie.ui.detail.seasons.MovieSeasonsRecyclerListFragment.s1
            ir.mservices.market.movie.ui.detail.seasons.MovieSeasonsViewModel r9 = r1.R1()
            int r10 = r8.d
            fu0 r1 = defpackage.y97.G(r9)
            ir.mservices.market.movie.ui.detail.seasons.MovieSeasonsViewModel$changeSelectedSeason$1 r2 = new ir.mservices.market.movie.ui.detail.seasons.MovieSeasonsViewModel$changeSelectedSeason$1
            r2.<init>(r9, r10, r8, r0)
            r8 = 3
            defpackage.bt2.G(r1, r0, r0, r2, r8)
        Lb7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.movie.ui.detail.seasons.b.b(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}
