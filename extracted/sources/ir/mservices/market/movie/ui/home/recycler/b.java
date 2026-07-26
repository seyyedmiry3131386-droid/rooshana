package ir.mservices.market.movie.ui.home.recycler;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.b77;
import defpackage.bt2;
import defpackage.cc7;
import defpackage.f88;
import defpackage.js3;
import defpackage.l06;
import defpackage.og5;
import defpackage.pq6;
import defpackage.q39;
import defpackage.qa3;
import defpackage.qg5;
import defpackage.qs3;
import defpackage.rr6;
import defpackage.sj8;
import defpackage.t35;
import defpackage.yq6;
import ir.mservices.market.movie.data.webapi.HomeMovieListDto;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.SmallBoldTextButton;
import ir.myket.core.utils.GraphicUtils$Dimension;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b extends ir.mservices.market.version2.ui.recycler.a {
    public static final /* synthetic */ int R = 0;
    public final og5 K;
    public final og5 L;
    public final SmallBoldTextButton M;
    public final MyketTextView N;
    public final ConstraintLayout O;
    public final View P;
    public qa3 Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(View view, GraphicUtils$Dimension graphicUtils$Dimension, boolean z, og5 og5Var, og5 og5Var2) {
        super(view, graphicUtils$Dimension, z);
        js3.p(graphicUtils$Dimension, "dimension");
        this.K = og5Var;
        this.L = og5Var2;
        View viewFindViewById = view.findViewById(rr6.section_more_title);
        js3.o(viewFindViewById, "findViewById(...)");
        this.M = (SmallBoldTextButton) viewFindViewById;
        View viewFindViewById2 = view.findViewById(rr6.header_title);
        js3.o(viewFindViewById2, "findViewById(...)");
        this.N = (MyketTextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(rr6.header_row);
        js3.o(viewFindViewById3, "findViewById(...)");
        this.O = (ConstraintLayout) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(rr6.header_shimmer);
        js3.o(viewFindViewById4, "findViewById(...)");
        this.P = viewFindViewById4;
    }

    @Override // ir.mservices.market.version2.ui.recycler.a
    public final l06 A() {
        return new t35(1);
    }

    @Override // ir.mservices.market.version2.ui.recycler.a
    public final int B() {
        return 1;
    }

    @Override // ir.mservices.market.version2.ui.recycler.a
    public final int C() {
        return this.a.getResources().getDimensionPixelSize(pq6.horizontal_space_outer);
    }

    @Override // ir.mservices.market.version2.ui.recycler.a, defpackage.qg5
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void s(MovieHomeMoviesRowData movieHomeMoviesRowData) {
        js3.p(movieHomeMoviesRowData, "data");
        super.s(movieHomeMoviesRowData);
        l06 l06Var = this.C;
        js3.n(l06Var, "null cannot be cast to non-null type ir.mservices.market.movie.ui.home.recycler.MovieHomeMoviesHorizontalDataAdapter");
        ((t35) l06Var).m = new qs3(15, this);
        View view = this.a;
        js3.o(view, "itemView");
        bt2.G(cc7.q(view), null, null, new MovieHomeMoviesHorizontalViewHolder$onAttach$2(movieHomeMoviesRowData, this, null), 3);
    }

    @Override // ir.mservices.market.version2.ui.recycler.a, defpackage.qg5
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void t(MovieHomeMoviesRowData movieHomeMoviesRowData) {
        boolean z;
        js3.p(movieHomeMoviesRowData, "data");
        super.t(movieHomeMoviesRowData);
        this.O.setLayoutDirection(3);
        this.N.setVisibility(8);
        this.M.setVisibility(8);
        HomeMovieListDto homeMovieListDto = movieHomeMoviesRowData.g;
        if (homeMovieListDto != null) {
            L(homeMovieListDto, movieHomeMoviesRowData);
            z = false;
        } else {
            z = true;
        }
        this.P.setVisibility(z ? 0 : 8);
    }

    public final void L(HomeMovieListDto homeMovieListDto, MovieHomeMoviesRowData movieHomeMoviesRowData) {
        Drawable drawable;
        boolean zN0 = f88.n0(homeMovieListDto.getListKey());
        String headerTitle = homeMovieListDto.getHeaderTitle();
        boolean z = headerTitle == null || f88.n0(headerTitle);
        this.P.setVisibility(8);
        String headerTitle2 = homeMovieListDto.getHeaderTitle();
        MyketTextView myketTextView = this.N;
        myketTextView.setText(headerTitle2);
        myketTextView.setTextColor(sj8.b().m);
        myketTextView.setVisibility(!z ? 0 : 8);
        int i = movieHomeMoviesRowData.h ? sj8.b().j : sj8.b().c;
        SmallBoldTextButton smallBoldTextButton = this.M;
        smallBoldTextButton.setPrimaryColor(i);
        smallBoldTextButton.setTextColor(i);
        Resources resources = this.a.getResources();
        js3.o(resources, "getResources(...)");
        int i2 = yq6.ic_arrow_end;
        try {
            drawable = q39.a(resources, i2, null);
            if (drawable == null) {
                ThreadLocal threadLocal = b77.a;
                drawable = resources.getDrawable(i2, null);
                if (drawable == null) {
                    throw new Resources.NotFoundException();
                }
            }
        } catch (Exception unused) {
            ThreadLocal threadLocal2 = b77.a;
            drawable = resources.getDrawable(i2, null);
            if (drawable == null) {
                throw new Resources.NotFoundException();
            }
        }
        smallBoldTextButton.setSmallIcon(drawable);
        smallBoldTextButton.setVisibility(zN0 ? 8 : 0);
        qg5.v(this.O, zN0 ? null : this.K, this, movieHomeMoviesRowData);
    }
}
