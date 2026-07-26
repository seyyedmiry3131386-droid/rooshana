package ir.mservices.market.movie.ui.home.recycler;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.widget.RelativeLayout;
import defpackage.a79;
import defpackage.b77;
import defpackage.bt2;
import defpackage.cc7;
import defpackage.e53;
import defpackage.f57;
import defpackage.js3;
import defpackage.js8;
import defpackage.lw;
import defpackage.lw8;
import defpackage.n35;
import defpackage.o35;
import defpackage.og5;
import defpackage.pq6;
import defpackage.q39;
import defpackage.qa3;
import defpackage.qg5;
import defpackage.sj8;
import defpackage.w91;
import defpackage.yq6;
import defpackage.zk8;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.common.ui.recycler.layoutManager.PaddingLayoutManager$Padding;
import ir.mservices.market.movie.data.webapi.BackgroundImageDto;
import ir.mservices.market.movie.data.webapi.HomeMovieListDto;
import ir.mservices.market.version2.ui.recycler.NestedRecyclerData;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.SmallBoldTextButton;
import ir.myket.core.utils.GraphicUtils$Dimension;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends b {
    public static final /* synthetic */ int V = 0;
    public n35 S;
    public e53 T;
    public int U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(View view, GraphicUtils$Dimension graphicUtils$Dimension, boolean z, og5 og5Var, og5 og5Var2) {
        super(view, graphicUtils$Dimension, z, og5Var, og5Var2);
        js3.p(graphicUtils$Dimension, "graphicUtilsDimension");
        this.U = -1;
        w91 w91Var = (w91) qg5.r();
        this.Q = (qa3) w91Var.H0.get();
    }

    @Override // ir.mservices.market.version2.ui.recycler.a
    public final float D(NestedRecyclerData nestedRecyclerData) {
        js3.p((MovieHomeMoviesRowData) nestedRecyclerData, "data");
        TypedValue typedValue = new TypedValue();
        this.a.getResources().getValue(pq6.small_movie_card_count, typedValue, true);
        return typedValue.getFloat();
    }

    @Override // ir.mservices.market.version2.ui.recycler.a
    /* JADX INFO: renamed from: H */
    public final void u(NestedRecyclerData nestedRecyclerData) {
        MovieHomeMoviesRowData movieHomeMoviesRowData = (MovieHomeMoviesRowData) nestedRecyclerData;
        js3.p(movieHomeMoviesRowData, "data");
        super.u(movieHomeMoviesRowData);
        n35 n35Var = this.S;
        if (n35Var != null) {
            this.y.g0(n35Var);
        }
        this.S = null;
    }

    @Override // ir.mservices.market.movie.ui.home.recycler.b, ir.mservices.market.version2.ui.recycler.a, defpackage.qg5
    /* JADX INFO: renamed from: J */
    public final void s(MovieHomeMoviesRowData movieHomeMoviesRowData) {
        js3.p(movieHomeMoviesRowData, "data");
        super.s(movieHomeMoviesRowData);
        n35 n35Var = new n35(this, movieHomeMoviesRowData, 0);
        this.y.j(n35Var);
        this.S = n35Var;
        View view = this.a;
        js3.o(view, "itemView");
        bt2.G(cc7.q(view), null, null, new MovieHomeImageBackgroundViewHolder$onAttach$3(null, this, movieHomeMoviesRowData), 3);
    }

    @Override // ir.mservices.market.movie.ui.home.recycler.b, ir.mservices.market.version2.ui.recycler.a, defpackage.qg5
    /* JADX INFO: renamed from: K */
    public final void t(MovieHomeMoviesRowData movieHomeMoviesRowData) {
        BackgroundImageDto backgroundImage;
        js3.p(movieHomeMoviesRowData, "data");
        super.t(movieHomeMoviesRowData);
        M().l.setClipToOutline(true);
        HomeMovieListDto homeMovieListDto = movieHomeMoviesRowData.g;
        if (homeMovieListDto != null && (backgroundImage = homeMovieListDto.getBackgroundImage()) != null) {
            N(backgroundImage, movieHomeMoviesRowData.r);
        }
        M().A.setAlpha(movieHomeMoviesRowData.q);
    }

    public final e53 M() {
        e53 e53Var = this.T;
        if (e53Var != null) {
            return e53Var;
        }
        js3.V("binding");
        throw null;
    }

    public final void N(BackgroundImageDto backgroundImageDto, float f) {
        Drawable drawable;
        RelativeLayout relativeLayout = M().v;
        Object obj = lw8.b;
        String bgColor = backgroundImageDto.getBgColor();
        int color = sj8.b().l;
        try {
            color = Color.parseColor(bgColor);
        } catch (Exception unused) {
        }
        relativeLayout.setBackgroundColor(color);
        View view = this.a;
        Context context = view.getContext();
        js3.o(context, "getContext(...)");
        ((f57) zk8.O(context, backgroundImageDto.getBgBannerPath()).i()).L(new o35(this, f)).P(M().y);
        MyketTextView myketTextView = M().x;
        Object obj2 = lw8.b;
        myketTextView.setTextColor(js8.w(backgroundImageDto.getTextColor()));
        SmallBoldTextButton smallBoldTextButton = M().z;
        int iW = js8.w(backgroundImageDto.getTextColor());
        smallBoldTextButton.setTextColor(iW);
        smallBoldTextButton.setPrimaryColor(iW);
        Resources resources = view.getResources();
        js3.o(resources, "getResources(...)");
        int i = yq6.ic_arrow_end;
        try {
            drawable = q39.a(resources, i, null);
            if (drawable == null) {
                ThreadLocal threadLocal = b77.a;
                drawable = resources.getDrawable(i, null);
                if (drawable == null) {
                    throw new Resources.NotFoundException();
                }
            }
        } catch (Exception unused2) {
            ThreadLocal threadLocal2 = b77.a;
            drawable = resources.getDrawable(i, null);
            if (drawable == null) {
                throw new Resources.NotFoundException();
            }
        }
        smallBoldTextButton.setSmallIcon(drawable);
    }

    @Override // ir.mservices.market.version2.ui.recycler.a, defpackage.qg5
    public final void u(MyketRecyclerData myketRecyclerData) {
        MovieHomeMoviesRowData movieHomeMoviesRowData = (MovieHomeMoviesRowData) myketRecyclerData;
        js3.p(movieHomeMoviesRowData, "data");
        super.u(movieHomeMoviesRowData);
        n35 n35Var = this.S;
        if (n35Var != null) {
            this.y.g0(n35Var);
        }
        this.S = null;
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof e53) {
            this.T = (e53) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }

    @Override // ir.mservices.market.version2.ui.recycler.a
    public final PaddingLayoutManager$Padding y(NestedRecyclerData nestedRecyclerData) {
        js3.p((MovieHomeMoviesRowData) nestedRecyclerData, "data");
        View view = this.a;
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(pq6.item_space);
        int iC = C();
        boolean z = this.x;
        int i = iC - (z ? dimensionPixelSize : 0);
        int iC2 = C();
        if (z) {
            dimensionPixelSize = 0;
        }
        return new PaddingLayoutManager$Padding(i, view.getResources().getDimensionPixelSize(pq6.space_12), iC2 - dimensionPixelSize, view.getResources().getDimensionPixelSize(pq6.space_24));
    }
}
