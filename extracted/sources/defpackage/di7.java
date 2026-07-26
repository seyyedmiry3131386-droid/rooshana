package defpackage;

import android.view.View;
import android.view.ViewGroup;
import ir.mservices.market.common.ui.recycler.DividerData;
import ir.mservices.market.movie.ui.home.recycler.MovieHomeBannersRowData;
import ir.mservices.market.search.history.ui.a;
import ir.mservices.market.search.history.ui.recycler.AppSearchRecommendedData;
import ir.mservices.market.search.history.ui.recycler.MovieSearchHomeMoviesRowData;
import ir.mservices.market.search.history.ui.recycler.SearchAppData;
import ir.mservices.market.search.history.ui.recycler.SearchHistoryData;
import ir.mservices.market.search.history.ui.recycler.SearchHistoryHorizontalTagsData;
import ir.mservices.market.search.history.ui.recycler.SearchHistoryListTitleData;
import ir.mservices.market.search.history.ui.recycler.SearchListTitleData;
import ir.mservices.market.search.history.ui.recycler.SearchTermData;
import ir.mservices.market.social.users.common.recycler.UserCardRowData;
import ir.mservices.market.version2.ui.recycler.EmptyData;
import ir.myket.core.utils.GraphicUtils$Dimension;

/* JADX INFO: loaded from: classes3.dex */
public final class di7 extends l06 {
    public hi7 A;
    public hi7 B;
    public final GraphicUtils$Dimension m;
    public final boolean n;
    public hi7 o;
    public a p;
    public hi7 q;
    public hi7 r;
    public bn6 s;
    public hi7 t;
    public hi7 u;
    public hi7 v;
    public hi7 w;
    public a x;
    public hi7 y;
    public hi7 z;

    public di7(GraphicUtils$Dimension graphicUtils$Dimension, boolean z) {
        super(1);
        this.m = graphicUtils$Dimension;
        this.n = z;
    }

    @Override // ir.mservices.market.version2.ui.recycler.adapter.a
    public final qg5 I(int i, View view, ViewGroup viewGroup) {
        if (i == SearchHistoryData.e) {
            qi7 qi7Var = new qi7(view);
            qi7Var.w = (xf5) ((w91) qg5.r()).F.get();
            return qi7Var;
        }
        if (i == SearchTermData.e) {
            sj7 sj7Var = new sj7(view);
            sj7Var.w = (xf5) ((w91) qg5.r()).F.get();
            return sj7Var;
        }
        if (i == SearchAppData.b) {
            return new nh7(view);
        }
        if (i == DividerData.k) {
            return new oq1(view);
        }
        if (i == SearchListTitleData.e) {
            ft1 ft1Var = new ft1(6, view);
            w91 w91Var = (w91) qg5.r();
            ft1Var.x = (d04) w91Var.p.get();
            return ft1Var;
        }
        int i2 = AppSearchRecommendedData.i;
        boolean z = this.n;
        GraphicUtils$Dimension graphicUtils$Dimension = this.m;
        if (i == i2) {
            js3.p(graphicUtils$Dimension, "dimension");
            fs fsVar = new fs(view, graphicUtils$Dimension, z);
            w91 w91Var2 = (w91) qg5.r();
            fsVar.O = w91Var2.G0();
            fsVar.P = (lw8) w91Var2.E.get();
            return fsVar;
        }
        if (i == SearchHistoryHorizontalTagsData.i) {
            js3.p(graphicUtils$Dimension, "dimension");
            ir.mservices.market.search.history.ui.recycler.a aVar = new ir.mservices.market.search.history.ui.recycler.a(view, graphicUtils$Dimension, z);
            return aVar;
        }
        if (i == SearchHistoryListTitleData.c) {
            return new gi7(view);
        }
        if (i == MovieSearchHomeMoviesRowData.i) {
            js3.p(graphicUtils$Dimension, "dimension");
            p65 p65Var = new p65(view, graphicUtils$Dimension, z);
            w91 w91Var3 = (w91) qg5.r();
            p65Var.L = (lw8) w91Var3.E.get();
            p65Var.M = (f65) w91Var3.I0.get();
            p65Var.y.j(new gp(9, p65Var));
            return p65Var;
        }
        if (i == MovieHomeBannersRowData.q) {
            return new i35(view, graphicUtils$Dimension, z);
        }
        if (i == MovieHomeBannersRowData.s) {
            return new j35(view, graphicUtils$Dimension, z);
        }
        if (i == MovieHomeBannersRowData.r) {
            return new k35(view, graphicUtils$Dimension, z);
        }
        if (i == EmptyData.a) {
            return new m12(0, view);
        }
        if (i == UserCardRowData.j) {
            hi7 hi7Var = this.A;
            if (hi7Var != null) {
                return new y09(view, graphicUtils$Dimension, z, hi7Var, 3);
            }
            js3.V("onUserClickListener");
            throw null;
        }
        if (i == UserCardRowData.k) {
            hi7 hi7Var2 = this.B;
            if (hi7Var2 != null) {
                return new y09(view, graphicUtils$Dimension, z, hi7Var2, 0);
            }
            js3.V("onUserHorizontalClickListener");
            throw null;
        }
        if (i == UserCardRowData.l) {
            hi7 hi7Var3 = this.B;
            if (hi7Var3 != null) {
                return new y09(view, graphicUtils$Dimension, z, hi7Var3, 2);
            }
            js3.V("onUserHorizontalClickListener");
            throw null;
        }
        if (i != UserCardRowData.m) {
            return null;
        }
        hi7 hi7Var4 = this.B;
        if (hi7Var4 != null) {
            return new y09(view, graphicUtils$Dimension, z, hi7Var4, 1);
        }
        js3.V("onUserHorizontalClickListener");
        throw null;
    }

    @Override // ir.mservices.market.version2.ui.recycler.adapter.a, androidx.recyclerview.widget.g
    /* JADX INFO: renamed from: K */
    public final void l(qg5 qg5Var, int i) {
        int iE = e(i);
        if (iE == SearchHistoryData.e) {
            qi7 qi7Var = (qi7) qg5Var;
            a aVar = this.p;
            if (aVar == null) {
                js3.V("onRemoveClickListener");
                throw null;
            }
            qi7Var.y = aVar;
            hi7 hi7Var = this.o;
            if (hi7Var == null) {
                js3.V("setOnItemClickListener");
                throw null;
            }
            qi7Var.x = hi7Var;
        } else if (iE == SearchTermData.e) {
            sj7 sj7Var = (sj7) qg5Var;
            hi7 hi7Var2 = this.q;
            if (hi7Var2 == null) {
                js3.V("onTermClickListener");
                throw null;
            }
            sj7Var.x = hi7Var2;
        } else if (iE == SearchAppData.b) {
            nh7 nh7Var = (nh7) qg5Var;
            hi7 hi7Var3 = this.r;
            if (hi7Var3 == null) {
                js3.V("onAppClickListener");
                throw null;
            }
            nh7Var.w = hi7Var3;
        } else if (iE == AppSearchRecommendedData.i) {
            fs fsVar = (fs) qg5Var;
            bn6 bn6Var = this.s;
            if (bn6Var == null) {
                js3.V("fastDownloadClickListener");
                throw null;
            }
            fsVar.K = bn6Var;
            hi7 hi7Var4 = this.t;
            if (hi7Var4 == null) {
                js3.V("onHomeAppClickListener");
                throw null;
            }
            fsVar.L = hi7Var4;
            hi7 hi7Var5 = this.u;
            if (hi7Var5 == null) {
                js3.V("onMultiAppClickListener");
                throw null;
            }
            fsVar.M = hi7Var5;
            hi7 hi7Var6 = this.v;
            if (hi7Var6 == null) {
                js3.V("onAppDigestedClickListener");
                throw null;
            }
            fsVar.N = hi7Var6;
        } else if (iE == SearchHistoryHorizontalTagsData.i) {
            ir.mservices.market.search.history.ui.recycler.a aVar2 = (ir.mservices.market.search.history.ui.recycler.a) qg5Var;
            hi7 hi7Var7 = this.w;
            if (hi7Var7 == null) {
                js3.V("onSearchHistoryItemClickListener");
                throw null;
            }
            aVar2.K = hi7Var7;
        } else if (iE == SearchHistoryListTitleData.c) {
            gi7 gi7Var = (gi7) qg5Var;
            a aVar3 = this.x;
            if (aVar3 == null) {
                js3.V("onRemoveHistoryItemClickListener");
                throw null;
            }
            gi7Var.w = aVar3;
        } else if (iE == MovieSearchHomeMoviesRowData.i) {
            p65 p65Var = (p65) qg5Var;
            hi7 hi7Var8 = this.y;
            if (hi7Var8 == null) {
                js3.V("onMovieClickListener");
                throw null;
            }
            p65Var.K = hi7Var8;
        } else if (iE == MovieHomeBannersRowData.q) {
            i35 i35Var = (i35) qg5Var;
            hi7 hi7Var9 = this.z;
            if (hi7Var9 == null) {
                js3.V("onMovieBannersItemClickListener");
                throw null;
            }
            i35Var.L = hi7Var9;
        } else if (iE == MovieHomeBannersRowData.r) {
            k35 k35Var = (k35) qg5Var;
            hi7 hi7Var10 = this.z;
            if (hi7Var10 == null) {
                js3.V("onMovieBannersItemClickListener");
                throw null;
            }
            k35Var.L = hi7Var10;
        } else if (iE == MovieHomeBannersRowData.s) {
            j35 j35Var = (j35) qg5Var;
            hi7 hi7Var11 = this.z;
            if (hi7Var11 == null) {
                js3.V("onMovieBannersItemClickListener");
                throw null;
            }
            j35Var.L = hi7Var11;
        }
        super.l(qg5Var, i);
    }
}
