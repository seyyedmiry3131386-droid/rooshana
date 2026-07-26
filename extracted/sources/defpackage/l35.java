package defpackage;

import android.view.View;
import android.view.ViewGroup;
import ir.mservices.market.common.ui.recycler.AddaxBoxData;
import ir.mservices.market.common.ui.recycler.DividerData;
import ir.mservices.market.movie.ui.home.recycler.MovieHomeBannerData;
import ir.mservices.market.movie.ui.home.recycler.MovieHomeSingleMovieData;
import ir.myket.core.utils.GraphicUtils$Dimension;

/* JADX INFO: loaded from: classes3.dex */
public final class l35 extends b80 {
    public final GraphicUtils$Dimension s;
    public final boolean t;
    public nb3 u;
    public nb3 v;
    public nb3 w;
    public nb3 x;

    public l35(GraphicUtils$Dimension graphicUtils$Dimension, boolean z, int i) {
        super(i);
        this.s = graphicUtils$Dimension;
        this.t = z;
    }

    @Override // defpackage.b80, ir.mservices.market.version2.ui.recycler.adapter.a
    public final qg5 I(int i, View view, ViewGroup viewGroup) {
        int i2 = MovieHomeBannerData.e;
        GraphicUtils$Dimension graphicUtils$Dimension = this.s;
        if (i == i2) {
            nb3 nb3Var = this.u;
            if (nb3Var != null) {
                return new e35(view, graphicUtils$Dimension, nb3Var);
            }
            js3.V("onBannerClickListener");
            throw null;
        }
        if (i == MovieHomeBannerData.f) {
            nb3 nb3Var2 = this.v;
            if (nb3Var2 != null) {
                return new b45(view, graphicUtils$Dimension, nb3Var2);
            }
            js3.V("onSingleBannerClickListener");
            throw null;
        }
        if (i == MovieHomeSingleMovieData.e) {
            nb3 nb3Var3 = this.w;
            if (nb3Var3 != null) {
                return new c45(view, graphicUtils$Dimension, nb3Var3);
            }
            js3.V("onSingleMovieClickListener");
            throw null;
        }
        if (i == DividerData.k) {
            return new oq1(view);
        }
        if (i == AddaxBoxData.c) {
            nb3 nb3Var4 = this.x;
            if (nb3Var4 != null) {
                return new rc(0, nb3Var4, view);
            }
            js3.V("onActionClickListener");
            throw null;
        }
        if (i == AddaxBoxData.d) {
            nb3 nb3Var5 = this.x;
            if (nb3Var5 != null) {
                return new rc(2, nb3Var5, view);
            }
            js3.V("onActionClickListener");
            throw null;
        }
        if (i != AddaxBoxData.e) {
            return super.I(i, view, viewGroup);
        }
        nb3 nb3Var6 = this.x;
        if (nb3Var6 != null) {
            return new rc(1, nb3Var6, view);
        }
        js3.V("onActionClickListener");
        throw null;
    }

    @Override // defpackage.b80
    public final GraphicUtils$Dimension O() {
        return this.s;
    }

    @Override // defpackage.b80
    public final boolean P() {
        return this.t;
    }
}
