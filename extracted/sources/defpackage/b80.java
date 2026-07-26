package defpackage;

import android.view.View;
import android.view.ViewGroup;
import ir.mservices.market.common.ext.ui.recycler.ExtHeaderRowData;
import ir.mservices.market.movie.ui.home.recycler.MovieHomeBannersRowData;
import ir.mservices.market.movie.ui.home.recycler.MovieHomeMoviesRowData;
import ir.mservices.market.movie.ui.home.recycler.MovieHomeReelsRowData;
import ir.mservices.market.version2.ui.recycler.adapter.a;
import ir.myket.core.utils.GraphicUtils$Dimension;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b80 extends a {
    public og5 l;
    public og5 m;
    public og5 n;
    public og5 o;
    public og5 p;
    public og5 q;
    public og5 r;

    @Override // ir.mservices.market.version2.ui.recycler.adapter.a
    public qg5 I(int i, View view, ViewGroup viewGroup) {
        if (i == MovieHomeMoviesRowData.s) {
            GraphicUtils$Dimension graphicUtils$DimensionO = O();
            boolean zP = P();
            og5 og5Var = this.n;
            if (og5Var == null) {
                js3.V("onMoviesMoreClickListener");
                throw null;
            }
            og5 og5Var2 = this.r;
            if (og5Var2 != null) {
                return new p35(view, graphicUtils$DimensionO, zP, og5Var, og5Var2);
            }
            js3.V("onMovieClickListener");
            throw null;
        }
        if (i == MovieHomeMoviesRowData.u) {
            GraphicUtils$Dimension graphicUtils$DimensionO2 = O();
            boolean zP2 = P();
            og5 og5Var3 = this.n;
            if (og5Var3 == null) {
                js3.V("onMoviesMoreClickListener");
                throw null;
            }
            og5 og5Var4 = this.r;
            if (og5Var4 != null) {
                return new q35(view, graphicUtils$DimensionO2, zP2, og5Var3, og5Var4);
            }
            js3.V("onMovieClickListener");
            throw null;
        }
        if (i == MovieHomeMoviesRowData.t) {
            GraphicUtils$Dimension graphicUtils$DimensionO3 = O();
            boolean zP3 = P();
            og5 og5Var5 = this.n;
            if (og5Var5 == null) {
                js3.V("onMoviesMoreClickListener");
                throw null;
            }
            og5 og5Var6 = this.r;
            if (og5Var6 != null) {
                return new r35(view, graphicUtils$DimensionO3, zP3, og5Var5, og5Var6);
            }
            js3.V("onMovieClickListener");
            throw null;
        }
        if (i == MovieHomeMoviesRowData.v) {
            GraphicUtils$Dimension graphicUtils$DimensionO4 = O();
            boolean zP4 = P();
            og5 og5Var7 = this.n;
            if (og5Var7 == null) {
                js3.V("onMoviesMoreClickListener");
                throw null;
            }
            og5 og5Var8 = this.r;
            if (og5Var8 != null) {
                return new ir.mservices.market.movie.ui.home.recycler.a(view, graphicUtils$DimensionO4, zP4, og5Var7, og5Var8);
            }
            js3.V("onMovieClickListener");
            throw null;
        }
        if (i == MovieHomeBannersRowData.q) {
            i35 i35Var = new i35(view, O(), P());
            og5 og5Var9 = this.m;
            if (og5Var9 == null) {
                js3.V("onBannersItemClickListener");
                throw null;
            }
            i35Var.L = og5Var9;
            og5 og5Var10 = this.l;
            if (og5Var10 != null) {
                i35Var.K = og5Var10;
                return i35Var;
            }
            js3.V("onBannersMoreClickListener");
            throw null;
        }
        if (i == MovieHomeBannersRowData.s) {
            j35 j35Var = new j35(view, O(), P());
            og5 og5Var11 = this.m;
            if (og5Var11 == null) {
                js3.V("onBannersItemClickListener");
                throw null;
            }
            j35Var.L = og5Var11;
            og5 og5Var12 = this.l;
            if (og5Var12 != null) {
                j35Var.K = og5Var12;
                return j35Var;
            }
            js3.V("onBannersMoreClickListener");
            throw null;
        }
        if (i == MovieHomeBannersRowData.r) {
            k35 k35Var = new k35(view, O(), P());
            og5 og5Var13 = this.m;
            if (og5Var13 == null) {
                js3.V("onBannersItemClickListener");
                throw null;
            }
            k35Var.L = og5Var13;
            og5 og5Var14 = this.l;
            if (og5Var14 != null) {
                k35Var.K = og5Var14;
                return k35Var;
            }
            js3.V("onBannersMoreClickListener");
            throw null;
        }
        if (i == ExtHeaderRowData.l) {
            GraphicUtils$Dimension graphicUtils$DimensionO5 = O();
            boolean zP5 = P();
            og5 og5Var15 = this.o;
            if (og5Var15 != null) {
                return new x62(view, graphicUtils$DimensionO5, zP5, null, og5Var15);
            }
            js3.V("onShimmerHeaderClickListener");
            throw null;
        }
        if (i == MovieHomeReelsRowData.p) {
            GraphicUtils$Dimension graphicUtils$DimensionO6 = O();
            boolean zP6 = P();
            og5 og5Var16 = this.p;
            if (og5Var16 == null) {
                js3.V("onReelItemClickListener");
                throw null;
            }
            og5 og5Var17 = this.q;
            if (og5Var17 != null) {
                js3.p(graphicUtils$DimensionO6, "dimension");
                return new y35(view, graphicUtils$DimensionO6, zP6, og5Var16, og5Var17);
            }
            js3.V("onReelHeaderClickListener");
            throw null;
        }
        if (i == MovieHomeReelsRowData.o) {
            GraphicUtils$Dimension graphicUtils$DimensionO7 = O();
            boolean zP7 = P();
            og5 og5Var18 = this.p;
            if (og5Var18 == null) {
                js3.V("onReelItemClickListener");
                throw null;
            }
            og5 og5Var19 = this.q;
            if (og5Var19 != null) {
                js3.p(graphicUtils$DimensionO7, "dimension");
                return new v35(view, graphicUtils$DimensionO7, zP7, og5Var18, og5Var19);
            }
            js3.V("onReelHeaderClickListener");
            throw null;
        }
        if (i == MovieHomeReelsRowData.q) {
            GraphicUtils$Dimension graphicUtils$DimensionO8 = O();
            boolean zP8 = P();
            og5 og5Var20 = this.p;
            if (og5Var20 == null) {
                js3.V("onReelItemClickListener");
                throw null;
            }
            og5 og5Var21 = this.q;
            if (og5Var21 != null) {
                js3.p(graphicUtils$DimensionO8, "dimension");
                return new z35(view, graphicUtils$DimensionO8, zP8, og5Var20, og5Var21);
            }
            js3.V("onReelHeaderClickListener");
            throw null;
        }
        if (i != MovieHomeReelsRowData.r) {
            return null;
        }
        GraphicUtils$Dimension graphicUtils$DimensionO9 = O();
        boolean zP9 = P();
        og5 og5Var22 = this.p;
        if (og5Var22 == null) {
            js3.V("onReelItemClickListener");
            throw null;
        }
        og5 og5Var23 = this.q;
        if (og5Var23 != null) {
            js3.p(graphicUtils$DimensionO9, "dimension");
            return new a45(view, graphicUtils$DimensionO9, zP9, og5Var22, og5Var23);
        }
        js3.V("onReelHeaderClickListener");
        throw null;
    }

    public abstract GraphicUtils$Dimension O();

    public abstract boolean P();
}
