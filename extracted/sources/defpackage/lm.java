package defpackage;

import android.view.View;
import android.view.ViewGroup;
import ir.mservices.market.app.bookmark.ui.recycler.BookmarkApplicationData;
import ir.mservices.market.app.common.recycler.AppData;
import ir.mservices.market.app.detail.ui.recycler.AppScreenshotData;
import ir.mservices.market.app.detail.ui.recycler.AppVideoShotData;
import ir.mservices.market.app.detail.ui.recycler.h;
import ir.mservices.market.appUsage.recycler.InstalledAppUsageData;
import ir.mservices.market.common.ui.recycler.DividerData;
import ir.mservices.market.download.movie.recycler.MovieDownloadData;
import ir.mservices.market.movie.ui.detail.recycler.MovieDownloadEpisodeData;
import ir.mservices.market.movie.ui.detail.recycler.MovieEpisodeData;
import ir.mservices.market.movie.ui.detail.recycler.b;
import ir.mservices.market.movie.ui.detail.seasons.recycler.MovieSeasonFixedTitleData;
import ir.mservices.market.myReview.complete.recycler.CompleteReview;
import ir.mservices.market.reels.home.ui.recycler.ReelHomeData;
import ir.mservices.market.securityShield.recycler.DeviceScanData;
import ir.mservices.market.securityShield.recycler.DeviceScanTipData;
import ir.mservices.market.securityShield.recycler.HarmFulAppViewData;
import ir.mservices.market.social.list.common.app.recycler.ProfileAppData;
import ir.mservices.market.social.list.common.movie.recycler.ProfileMovieData;
import ir.mservices.market.social.profile.common.recycler.ProfileInfoData;
import ir.mservices.market.social.profile.user.recycler.UserProfileActionData;
import ir.mservices.market.version2.ui.recycler.adapter.a;
import ir.mservices.market.virtualKeyboard.recycler.VirtualKeyboardItemData;
import ir.mservices.market.virtualKeyboard.recycler.VirtualKeyboardRemoveData;

/* JADX INFO: loaded from: classes3.dex */
public final class lm extends a {
    public final /* synthetic */ int l;
    public Object m;
    public og5 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lm(int i, int i2) {
        super(i);
        this.l = i2;
    }

    @Override // ir.mservices.market.version2.ui.recycler.adapter.a
    public final qg5 I(int i, View view, ViewGroup viewGroup) {
        qg5 q17Var;
        qg5 aVar;
        qg5 qa9Var;
        switch (this.l) {
            case 0:
                if (i != BookmarkApplicationData.k) {
                    return null;
                }
                z95 z95Var = this.k;
                bn6 bn6Var = (bn6) this.m;
                if (bn6Var == null) {
                    js3.V("fastDownloadClickListener");
                    throw null;
                }
                v4 v4Var = (v4) this.n;
                if (v4Var != null) {
                    return new ir.mservices.market.app.bookmark.ui.recycler.a(view, z95Var, bn6Var, v4Var);
                }
                js3.V("onAppClickListener");
                throw null;
            case 1:
                if (i == AppScreenshotData.j) {
                    return new bs(view, (og5) this.m);
                }
                if (i == AppVideoShotData.j) {
                    return new h(view, this.n, null, null);
                }
                return null;
            case 2:
                if (i != AppData.d) {
                    return null;
                }
                og5 og5Var = this.n;
                if (og5Var == null) {
                    js3.V("onClickListener");
                    throw null;
                }
                bn6 bn6Var2 = (bn6) this.m;
                if (bn6Var2 != null) {
                    return new ir.mservices.market.app.common.recycler.a(view, og5Var, bn6Var2, null);
                }
                js3.V("fastDownloadListener");
                throw null;
            case 3:
                if (i != InstalledAppUsageData.b) {
                    return null;
                }
                ru ruVar = (ru) this.m;
                if (ruVar == null) {
                    js3.V("onInstalledAppClickListener");
                    throw null;
                }
                ru ruVar2 = (ru) this.n;
                if (ruVar2 != null) {
                    return new sp3(view, ruVar, ruVar2);
                }
                js3.V("onRemoveAppClickListener");
                throw null;
            case 4:
                if (i != CompleteReview.e) {
                    return null;
                }
                nx0 nx0Var = (nx0) this.m;
                if (nx0Var == null) {
                    js3.V("onMenuClickListener");
                    throw null;
                }
                nx0 nx0Var2 = (nx0) this.n;
                if (nx0Var2 != null) {
                    return new ir.mservices.market.myReview.complete.recycler.a(view, nx0Var, nx0Var2);
                }
                js3.V("onAppClickListener");
                throw null;
            case 5:
                if (i != MovieDownloadData.g) {
                    return null;
                }
                l25 l25Var = (l25) this.m;
                if (l25Var == null) {
                    js3.V("onItemClickListener");
                    throw null;
                }
                l25 l25Var2 = (l25) this.n;
                if (l25Var2 != null) {
                    return new ir.mservices.market.download.movie.recycler.a(view, l25Var, l25Var2);
                }
                js3.V("onDownloadClickListener");
                throw null;
            case 6:
                if (i == MovieSeasonFixedTitleData.g) {
                    return new ft1(view);
                }
                if (i == MovieEpisodeData.e) {
                    z65 z65Var = (z65) this.m;
                    if (z65Var != null) {
                        return new b(view, z65Var);
                    }
                    js3.V("onEpisodeClickListener");
                    throw null;
                }
                if (i != MovieDownloadEpisodeData.e) {
                    if (i == DividerData.k) {
                        return new oq1(view);
                    }
                    return null;
                }
                z65 z65Var2 = (z65) this.n;
                if (z65Var2 != null) {
                    return new ir.mservices.market.movie.ui.detail.recycler.a(view, z65Var2);
                }
                js3.V("onDownloadEpisodeClickListener");
                throw null;
            case 7:
                if (i == ReelHomeData.c) {
                    h17 h17Var = (h17) this.m;
                    if (h17Var == null) {
                        js3.V("onReelClickListenerSquare");
                        throw null;
                    }
                    q17Var = new r17(view, h17Var);
                } else {
                    if (i != ReelHomeData.d) {
                        return null;
                    }
                    h17 h17Var2 = (h17) this.n;
                    if (h17Var2 == null) {
                        js3.V("onReelClickListenerRectangle");
                        throw null;
                    }
                    q17Var = new q17(view, h17Var2);
                }
                return q17Var;
            case 8:
                if (i == ProfileAppData.c) {
                    dj7 dj7Var = (dj7) this.m;
                    if (dj7Var == null) {
                        js3.V("onAppClickListener");
                        throw null;
                    }
                    aVar = new ir.mservices.market.social.list.common.app.recycler.a(view, dj7Var, null);
                } else {
                    if (i != ProfileMovieData.c) {
                        return null;
                    }
                    dj7 dj7Var2 = (dj7) this.n;
                    if (dj7Var2 == null) {
                        js3.V("onMovieClickListener");
                        throw null;
                    }
                    aVar = new ir.mservices.market.social.list.common.movie.recycler.a(view, dj7Var2, null);
                }
                return aVar;
            case 9:
                if (i == DeviceScanData.f) {
                    ir.mservices.market.securityShield.recycler.a aVar2 = new ir.mservices.market.securityShield.recycler.a(view);
                    w91 w91Var = (w91) qg5.r();
                    aVar2.w = (lw8) w91Var.E.get();
                    return aVar2;
                }
                if (i == DeviceScanTipData.b) {
                    el7 el7Var = (el7) this.m;
                    if (el7Var != null) {
                        return new zl1(view, el7Var);
                    }
                    js3.V("onMoreClickListener");
                    throw null;
                }
                if (i != HarmFulAppViewData.c) {
                    if (i == DividerData.k) {
                        return new oq1(view);
                    }
                    return null;
                }
                el7 el7Var2 = (el7) this.n;
                if (el7Var2 != null) {
                    return new gx2(view, el7Var2);
                }
                js3.V("onRemoveClickListener");
                throw null;
            case 10:
                if (i == DividerData.k) {
                    return new oq1(view);
                }
                if (i != UserProfileActionData.f) {
                    if (i == ProfileInfoData.c) {
                        return new l5(view);
                    }
                    return null;
                }
                q19 q19Var = (q19) this.n;
                if (q19Var == null) {
                    js3.V("messagesClickListener");
                    throw null;
                }
                q19 q19Var2 = (q19) this.m;
                if (q19Var2 != null) {
                    return new ir.mservices.market.social.profile.user.recycler.a(view, q19Var, q19Var2);
                }
                js3.V("onRelationClickListener");
                throw null;
            default:
                if (i == VirtualKeyboardItemData.c) {
                    ir.mservices.market.virtualKeyboard.a aVar3 = (ir.mservices.market.virtualKeyboard.a) this.m;
                    if (aVar3 == null) {
                        js3.V("onItemClickListener");
                        throw null;
                    }
                    qa9Var = new la9(view, aVar3);
                } else {
                    if (i != VirtualKeyboardRemoveData.a) {
                        return null;
                    }
                    ir.mservices.market.virtualKeyboard.a aVar4 = (ir.mservices.market.virtualKeyboard.a) this.n;
                    if (aVar4 == null) {
                        js3.V("onRemoveClickListener");
                        throw null;
                    }
                    qa9Var = new qa9(view, aVar4);
                }
                return qa9Var;
        }
    }
}
