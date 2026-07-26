package defpackage;

import android.view.View;
import android.view.ViewGroup;
import ir.mservices.market.app.home.ui.recycler.HomeAppsRowData;
import ir.mservices.market.app.home.ui.recycler.HomeBannerData;
import ir.mservices.market.app.home.ui.recycler.HomeMoreTitleRowData;
import ir.mservices.market.common.ext.ui.recycler.ExtHeaderRowData;
import ir.mservices.market.common.ui.recycler.DividerData;
import ir.mservices.market.download.app.recycler.AppDownloadData;
import ir.mservices.market.movie.streamers.recycler.OtherStreamersMoreData;
import ir.mservices.market.movie.streamers.recycler.OtherStreamersRowData;
import ir.mservices.market.movie.streamers.recycler.StreamerAvatarData;
import ir.mservices.market.movie.streamers.recycler.StreamerHeaderData;
import ir.mservices.market.movie.streamers.recycler.StreamerMovieData;
import ir.mservices.market.movie.streamers.recycler.StreamerMovieTitleData;
import ir.mservices.market.movie.streamers.recycler.StreamerMoviesMoreData;
import ir.mservices.market.movie.streamers.recycler.StreamerNameData;
import ir.mservices.market.movie.ui.home.recycler.MovieHomeBannerData;
import ir.mservices.market.setting.recycler.SettingAppVersion;
import ir.mservices.market.setting.recycler.SettingNestedData;
import ir.mservices.market.social.users.common.recycler.UserCardRowData;
import ir.mservices.market.version2.ui.recycler.EmptyData;
import ir.mservices.market.version2.ui.recycler.adapter.a;
import ir.myket.core.utils.GraphicUtils$Dimension;

/* JADX INFO: loaded from: classes3.dex */
public final class vr1 extends a {
    public final /* synthetic */ int l;
    public final GraphicUtils$Dimension m;
    public final boolean n;
    public og5 o;
    public Object p;
    public Object q;
    public Object r;
    public og5 s;
    public Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vr1(GraphicUtils$Dimension graphicUtils$Dimension, boolean z, int i) {
        super(1);
        this.l = i;
        this.m = graphicUtils$Dimension;
        this.n = z;
    }

    @Override // ir.mservices.market.version2.ui.recycler.adapter.a
    public final qg5 I(int i, View view, ViewGroup viewGroup) {
        qg5 x62Var;
        qg5 b45Var;
        y09 y09Var;
        switch (this.l) {
            case 0:
                if (i == HomeAppsRowData.o) {
                    it1 it1Var = (it1) this.q;
                    if (it1Var == null) {
                        js3.V("onDigestedRecommendationAppClickListener");
                        throw null;
                    }
                    x62Var = new sa3(view, this.m, this.n, it1Var, 1);
                } else if (i == HomeAppsRowData.m) {
                    it1 it1Var2 = (it1) this.s;
                    if (it1Var2 == null) {
                        js3.V("onRecommendationAppClickListener");
                        throw null;
                    }
                    gd1 gd1Var = new gd1(17);
                    ca7 ca7Var = (ca7) this.r;
                    if (ca7Var == null) {
                        js3.V("onRecommendedAppFastDownloadClickListener");
                        throw null;
                    }
                    x62Var = new ta3(view, this.m, this.n, it1Var2, gd1Var, ca7Var, 7);
                } else {
                    if (i == AppDownloadData.B) {
                        bn6 bn6Var = (bn6) this.p;
                        if (bn6Var == null) {
                            js3.V("fastDownloadListener");
                            throw null;
                        }
                        it1 it1Var3 = (it1) this.o;
                        if (it1Var3 != null) {
                            return new ir.mservices.market.download.app.recycler.a(view, bn6Var, it1Var3, this.k);
                        }
                        js3.V("onActiveClickListener");
                        throw null;
                    }
                    if (i != ExtHeaderRowData.l) {
                        if (i == DividerData.k) {
                            return new oq1(view);
                        }
                        if (i == EmptyData.a) {
                            return new m12(0, view);
                        }
                        return null;
                    }
                    it1 it1Var4 = (it1) this.t;
                    if (it1Var4 == null) {
                        js3.V("onShimmerHeaderClickListener");
                        throw null;
                    }
                    x62Var = new x62(view, this.m, this.n, null, it1Var4);
                }
                return x62Var;
            case 1:
                int i2 = UserCardRowData.j;
                boolean z = this.n;
                GraphicUtils$Dimension graphicUtils$Dimension = this.m;
                if (i == i2) {
                    ug5 ug5Var = (ug5) this.o;
                    if (ug5Var == null) {
                        js3.V("onUserClickListener");
                        throw null;
                    }
                    y09Var = new y09(view, graphicUtils$Dimension, z, ug5Var, 3);
                } else if (i == UserCardRowData.k) {
                    ug5 ug5Var2 = (ug5) this.p;
                    if (ug5Var2 == null) {
                        js3.V("onUserHorizontalClickListener");
                        throw null;
                    }
                    y09Var = new y09(view, graphicUtils$Dimension, z, ug5Var2, 0);
                } else if (i == UserCardRowData.l) {
                    ug5 ug5Var3 = (ug5) this.p;
                    if (ug5Var3 == null) {
                        js3.V("onUserHorizontalClickListener");
                        throw null;
                    }
                    y09Var = new y09(view, graphicUtils$Dimension, z, ug5Var3, 2);
                } else {
                    if (i != UserCardRowData.m) {
                        if (i == HomeMoreTitleRowData.j) {
                            ug5 ug5Var4 = (ug5) this.q;
                            if (ug5Var4 == null) {
                                js3.V("onMoreClickListener");
                                throw null;
                            }
                            b45Var = new tb3(0, ug5Var4, view);
                        } else if (i == HomeBannerData.c) {
                            ug5 ug5Var5 = (ug5) this.r;
                            if (ug5Var5 == null) {
                                js3.V("onAppBannerClickListener");
                                throw null;
                            }
                            b45Var = new ib3(view, graphicUtils$Dimension, ug5Var5);
                        } else if (i == MovieHomeBannerData.e) {
                            ug5 ug5Var6 = (ug5) this.s;
                            if (ug5Var6 == null) {
                                js3.V("onMovieBannerClickListener");
                                throw null;
                            }
                            b45Var = new e35(view, graphicUtils$Dimension, ug5Var6);
                        } else {
                            if (i != MovieHomeBannerData.f) {
                                if (i == DividerData.k) {
                                    return new oq1(view);
                                }
                                return null;
                            }
                            ug5 ug5Var7 = (ug5) this.t;
                            if (ug5Var7 == null) {
                                js3.V("onMovieSingleBannerClickListener");
                                throw null;
                            }
                            b45Var = new b45(view, graphicUtils$Dimension, ug5Var7);
                        }
                        return b45Var;
                    }
                    ug5 ug5Var8 = (ug5) this.p;
                    if (ug5Var8 == null) {
                        js3.V("onUserHorizontalClickListener");
                        throw null;
                    }
                    y09Var = new y09(view, graphicUtils$Dimension, z, ug5Var8, 1);
                }
                return y09Var;
            case 2:
                if (i != SettingNestedData.h) {
                    if (i != SettingAppVersion.d) {
                        return null;
                    }
                    ft1 ft1Var = new ft1(7, view);
                    ft1Var.x = (lw8) ((w91) qg5.r()).E.get();
                    return ft1Var;
                }
                cr7 cr7Var = (cr7) this.p;
                if (cr7Var == null) {
                    js3.V("onSettingClickListener");
                    throw null;
                }
                y45 y45Var = (y45) this.q;
                if (y45Var == null) {
                    js3.V("onSettingLongClickListener");
                    throw null;
                }
                cr7 cr7Var2 = (cr7) this.s;
                if (cr7Var2 == null) {
                    js3.V("onSettingMultiOptionClickListener");
                    throw null;
                }
                cr7 cr7Var3 = (cr7) this.t;
                if (cr7Var3 == null) {
                    js3.V("onSettingMultiOptionOnCheckedChangedListener");
                    throw null;
                }
                cr7 cr7Var4 = (cr7) this.r;
                if (cr7Var4 == null) {
                    js3.V("onSettingThemeStyleClickListener");
                    throw null;
                }
                ir.mservices.market.setting.a aVar = (ir.mservices.market.setting.a) this.o;
                if (aVar != null) {
                    return new zq7(view, this.m, this.n, cr7Var, y45Var, cr7Var2, cr7Var3, cr7Var4, aVar);
                }
                js3.V("onKidsModeClickListener");
                throw null;
            default:
                if (i == StreamerHeaderData.f) {
                    return new l5(22, view);
                }
                if (i == StreamerAvatarData.f) {
                    return new t68(view);
                }
                if (i == StreamerNameData.h) {
                    f78 f78Var = (f78) this.o;
                    if (f78Var == null) {
                        js3.V("onFollowButtonClickListener");
                        throw null;
                    }
                    f78 f78Var2 = (f78) this.p;
                    if (f78Var2 != null) {
                        return new ir.mservices.market.movie.streamers.recycler.a(view, f78Var, f78Var2);
                    }
                    js3.V("onUnFollowButtonClickListener");
                    throw null;
                }
                if (i == DividerData.k) {
                    return new oq1(view);
                }
                if (i == StreamerMovieData.b) {
                    og5 og5Var = (og5) this.q;
                    if (og5Var != null) {
                        return new v68(view, og5Var);
                    }
                    js3.V("onMovieClickListener");
                    throw null;
                }
                if (i == StreamerMoviesMoreData.b) {
                    og5 og5Var2 = this.s;
                    if (og5Var2 != null) {
                        return new y68(view, og5Var2);
                    }
                    js3.V("onStreamerMoviesMoreClickListener");
                    throw null;
                }
                if (i == OtherStreamersRowData.i) {
                    f78 f78Var3 = (f78) this.r;
                    if (f78Var3 == null) {
                        js3.V("onStreamerClickListener");
                        throw null;
                    }
                    GraphicUtils$Dimension graphicUtils$Dimension2 = this.m;
                    js3.p(graphicUtils$Dimension2, "dimension");
                    fl6 fl6Var = new fl6(view, graphicUtils$Dimension2, this.n);
                    fl6Var.L = f78Var3;
                    return fl6Var;
                }
                if (i != OtherStreamersMoreData.b) {
                    if (i == StreamerMovieTitleData.a) {
                        return new l5(23, view);
                    }
                    return null;
                }
                f78 f78Var4 = (f78) this.t;
                if (f78Var4 != null) {
                    return new tw5(view, f78Var4);
                }
                js3.V("onMoreStreamersClickListener");
                throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vr1(int i, GraphicUtils$Dimension graphicUtils$Dimension, boolean z) {
        super(i);
        this.l = 2;
        this.m = graphicUtils$Dimension;
        this.n = z;
    }
}
