package defpackage;

import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Looper;
import android.os.RemoteException;
import android.view.MenuItem;
import android.view.Surface;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.common.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.j0;
import ir.mservices.market.app.detail.data.MoneyBackSummaryDto;
import ir.mservices.market.app.detail.data.MoreDescriptionData;
import ir.mservices.market.app.detail.data.PermissionDto;
import ir.mservices.market.app.detail.data.ShamadDto;
import ir.mservices.market.app.detail.more.ui.MoreDescriptionFragment;
import ir.mservices.market.app.detail.more.ui.recycler.MoreClickableData;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.intro.IntroNotificationFragment;
import ir.mservices.market.movie.data.webapi.HomeMovieBannerDto;
import ir.mservices.market.movie.data.webapi.SearchMovieDto;
import ir.mservices.market.movie.streamers.moreStreamers.MoreStreamersFragment;
import ir.mservices.market.movie.streamers.recycler.OtherStreamerData;
import ir.mservices.market.movie.ui.bookmark.MovieBookmarkRecyclerListFragment;
import ir.mservices.market.movie.ui.bookmark.recycler.MovieBookmarkData;
import ir.mservices.market.movie.ui.common.MovieHomeMovieData;
import ir.mservices.market.movie.ui.home.recycler.MovieHomeBannersItemData;
import ir.mservices.market.movie.ui.list.MovieBannerListRecyclerListFragment;
import ir.mservices.market.movie.ui.search.result.MovieSearchRecyclerListFragment;
import ir.mservices.market.movie.ui.search.result.recycler.BaseMovieSearchMovieData;
import ir.mservices.market.myAccount.recycler.MyAccountItemData;
import ir.mservices.market.myAccount.recycler.MyAccountLinkItemData;
import ir.mservices.market.myAccount.recycler.d;
import ir.mservices.market.myMarket.recycler.MyMarketData;
import ir.mservices.market.myMarket.recycler.MyMarketHorizontalItemData;
import ir.mservices.market.myReview.MyReviewsContentFragment;
import ir.mservices.market.myReview.common.MyReviewType;
import ir.mservices.market.pika.common.model.NearbyRepository;
import ir.mservices.market.social.profile.user.UserProfileRefId;
import ir.mservices.market.social.search.MynetSearchRecyclerListFragment;
import ir.mservices.market.social.users.common.data.UserDto;
import ir.mservices.market.social.users.common.recycler.UserCardData;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.version2.fragments.dialog.PermissionDialogFragment;
import ir.mservices.market.version2.fragments.dialog.c;
import ir.mservices.market.version2.ui.recycler.adapter.a;
import ir.mservices.market.version2.webapi.responsedto.LinkDTO;
import ir.mservices.market.views.MyketVideoView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qs3 implements r7, xm4, ro4, hs4, n31, fs4, og5, yp2, fe8, wa1, bk5, tt5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qs3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ro4
    public void a(go4 go4Var) {
        switch (this.a) {
            case 4:
                aq7 aq7Var = (aq7) this.b;
                if (go4Var.E() && go4Var.k.isEmpty()) {
                    aq7 aq7Var2 = go4Var.p.c;
                    if (aq7Var2.c < aq7Var.c && y97.k(aq7Var, aq7Var2)) {
                        go4Var.p = go4Var.p.g(aq7Var);
                        break;
                    }
                }
                break;
            case 5:
                gn4 gn4Var = go4Var.a;
                Bundle bundle = (Bundle) this.b;
                if (go4Var.E()) {
                    ImmutableList immutableList = go4Var.t;
                    ImmutableList immutableList2 = go4Var.u;
                    go4Var.I = bundle;
                    ImmutableList immutableListF0 = go4.F0(go4Var.y, go4Var.v, bundle, go4Var.s, go4Var.r);
                    go4Var.t = immutableListF0;
                    go4Var.u = go4.E0(go4Var.y, go4Var.v, go4Var.I, immutableListF0, go4Var.r);
                    boolean zEquals = go4Var.t.equals(immutableList);
                    go4Var.u.equals(immutableList2);
                    gn4Var.getClass();
                    vy2.s(Looper.myLooper() == gn4Var.e.getLooper());
                    en4 en4Var = gn4Var.d;
                    en4Var.p();
                    if (!zEquals) {
                        en4Var.u();
                    }
                    break;
                }
                break;
            default:
                a21 a21Var = (a21) this.b;
                eq7 eq7Var = go4Var.e;
                gn4 gn4Var2 = go4Var.a;
                if (go4Var.D != null) {
                    wn5.F("MCImplBase", "Cannot be notified about the connection result many times. Probably a bug or malicious app.");
                    gn4Var2.a();
                } else {
                    xf3 xf3Var = a21Var.c;
                    ImmutableList immutableList3 = a21Var.n;
                    Bundle bundle2 = a21Var.i;
                    go4Var.D = xf3Var;
                    go4Var.q = a21Var.d;
                    go4Var.v = a21Var.e;
                    cb6 cb6Var = a21Var.f;
                    go4Var.w = cb6Var;
                    cb6 cb6Var2 = a21Var.g;
                    go4Var.x = cb6Var2;
                    cb6 cb6VarN0 = go4.n0(cb6Var, cb6Var2);
                    go4Var.y = cb6VarN0;
                    ImmutableList immutableList4 = a21Var.k;
                    go4Var.r = immutableList4;
                    ImmutableList immutableList5 = a21Var.l;
                    go4Var.s = immutableList5;
                    ImmutableList immutableListF02 = go4.F0(cb6VarN0, go4Var.v, bundle2, immutableList5, immutableList4);
                    go4Var.t = immutableListF02;
                    go4Var.u = go4.E0(go4Var.y, go4Var.v, bundle2, immutableListF02, go4Var.r);
                    j0 j0Var = new j0(4);
                    for (int i = 0; i < immutableList3.size(); i++) {
                        cw0 cw0Var = (cw0) immutableList3.get(i);
                        wp7 wp7Var = cw0Var.a;
                        if (wp7Var != null && wp7Var.a == 0) {
                            j0Var.c(wp7Var.b, cw0Var);
                        }
                    }
                    j0Var.a(true);
                    go4Var.p = a21Var.j;
                    MediaSession.Token tokenH = a21Var.m;
                    if (tokenH == null) {
                        tokenH = eq7Var.a.h();
                    }
                    if (tokenH != null) {
                        go4Var.E = new MediaController(go4Var.d, tokenH);
                    }
                    try {
                        a21Var.c.asBinder().linkToDeath(go4Var.g, 0);
                        go4Var.m = new eq7(eq7Var.a.a(), a21Var.a, a21Var.b, eq7Var.a.f(), a21Var.c, a21Var.h, tokenH);
                        go4Var.I = bundle2;
                        gn4Var2.h0();
                    } catch (RemoteException unused) {
                        gn4Var2.a();
                    }
                }
                break;
        }
    }

    @Override // defpackage.n31
    public void accept(Object obj) {
        Surface surface = (Surface) this.b;
        qg6 qg6Var = (qg6) obj;
        qg6Var.L0();
        e62 e62Var = (e62) qg6Var.a;
        e62Var.c1();
        e62Var.Q0();
        e62Var.W0(surface);
        int i = surface == null ? 0 : -1;
        e62Var.L0(i, i);
    }

    @Override // defpackage.yp2
    public Object apply(Object obj) {
        return ((ha5) ((ji4) this.b).c).d.get(obj);
    }

    @Override // defpackage.fs4
    public void b(qg6 qg6Var, hq4 hq4Var) {
        ((n31) this.b).accept(qg6Var);
    }

    @Override // defpackage.xm4
    public int c(Object obj) {
        b bVar = (b) this.b;
        sm4 sm4Var = (sm4) obj;
        String str = sm4Var.b;
        return ((str.equals(bVar.n) || str.equals(ym4.b(bVar))) && sm4Var.c(bVar, false) && sm4Var.d(bVar)) ? 1 : 0;
    }

    @Override // defpackage.bk5
    public boolean f(MenuItem menuItem) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        ij5 ij5Var = (ij5) this.b;
        js3.p(menuItem, "item");
        ni5 ni5Var = ij5Var.b;
        wi5 wi5VarF = ni5Var.f();
        js3.m(wi5VarF);
        fj5 fj5Var = wi5VarF.c;
        js3.m(fj5Var);
        if (fj5Var.l(menuItem.getItemId()) instanceof l7) {
            i = hp6.nav_default_enter_anim;
            i2 = hp6.nav_default_exit_anim;
            i3 = hp6.nav_default_pop_enter_anim;
            i4 = hp6.nav_default_pop_exit_anim;
        } else {
            i = ip6.nav_default_enter_anim;
            i2 = ip6.nav_default_exit_anim;
            i3 = ip6.nav_default_pop_enter_anim;
            i4 = ip6.nav_default_pop_exit_anim;
        }
        int i6 = i;
        int i7 = i2;
        int i8 = i3;
        int i9 = i4;
        if ((menuItem.getOrder() & 196608) == 0) {
            int i10 = fj5.h;
            i5 = ja1.o(ni5Var.g()).b.a;
            z = true;
        } else {
            i5 = -1;
            z = false;
        }
        try {
            ij5Var.c(menuItem.getItemId(), null, new lj5(true, true, i5, false, z, i6, i7, i8, i9));
            wi5 wi5VarF2 = ni5Var.f();
            if (wi5VarF2 != null) {
                if (fl5.a(menuItem.getItemId(), wi5VarF2)) {
                    return true;
                }
            }
            return false;
        } catch (IllegalArgumentException unused) {
            int i11 = wi5.f;
            m91.s(new jc0(ij5Var.a), menuItem.getItemId());
            Objects.toString(ni5Var.f());
            return false;
        }
    }

    @Override // defpackage.r7
    public void g(Object obj) {
        IntroNotificationFragment introNotificationFragment = (IntroNotificationFragment) this.b;
        Boolean bool = (Boolean) obj;
        int i = IntroNotificationFragment.Y0;
        js3.p(bool, "it");
        FragmentActivity fragmentActivityF = introNotificationFragment.F();
        if (fragmentActivityF != null) {
            d56 d56Var = introNotificationFragment.V0;
            if (d56Var != null) {
                d56Var.a(fragmentActivityF, bool.booleanValue());
            } else {
                js3.V("permissionHelper");
                throw null;
            }
        }
    }

    @Override // defpackage.hs4
    public Object h(xq4 xq4Var, hq4 hq4Var, int i) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 7:
                return xq4Var.l(hq4Var, (ImmutableList) obj);
            default:
                fs4 fs4Var = (fs4) obj;
                ij3 ij3Var = ij3.b;
                if (!xq4Var.j()) {
                    fs4Var.b(xq4Var.t, hq4Var);
                    is4.s0(xq4Var, hq4Var, i, new bq7(0));
                }
                return ij3.b;
        }
    }

    @Override // defpackage.fe8
    public void i(com.google.android.material.tabs.b bVar, int i) {
        MyReviewsContentFragment myReviewsContentFragment = (MyReviewsContentFragment) this.b;
        int i2 = MyReviewsContentFragment.V0;
        MyReviewType myReviewType = (MyReviewType) myReviewsContentFragment.j1().z.get(i);
        js3.p(myReviewType, "position");
        String string = myReviewsContentFragment.K().getString(myReviewType.a);
        js3.o(string, "getString(...)");
        bVar.b(sa7.q(string));
    }

    @Override // defpackage.wa1
    public xa1 k() {
        pa2 pa2Var = (pa2) this.b;
        int i = MyketVideoView.C;
        is5 is5Var = new is5((cl0) pa2Var.d, (String) pa2Var.b, (nc2) pa2Var.c);
        nc2 nc2Var = is5Var.f;
        synchronized (nc2Var) {
            nc2Var.c = null;
            ((HashMap) nc2Var.b).put("SourceChannel", LinkDTO.LINK_TYPE_MYKET_INTENT);
        }
        return is5Var;
    }

    @Override // defpackage.og5
    public void m(View view, qg5 qg5Var, Object obj) {
        MoneyBackSummaryDto moneyBackSummary;
        String string;
        int i = this.a;
        String str = "";
        int i2 = 0;
        Object obj2 = this.b;
        switch (i) {
            case 11:
                MoreDescriptionFragment moreDescriptionFragment = (MoreDescriptionFragment) obj2;
                bi5 bi5Var = moreDescriptionFragment.i1;
                MoreClickableData moreClickableData = (MoreClickableData) obj;
                int i3 = MoreDescriptionFragment.l1;
                js3.p(view, "<unused var>");
                js3.p((sx4) qg5Var, "<unused var>");
                js3.p(moreClickableData, "recyclerData");
                String str2 = moreClickableData.a;
                int iHashCode = str2.hashCode();
                if (iHashCode == -1850241756) {
                    if (str2.equals("SHAMAD")) {
                        ShamadDto shamad = ((tx4) bi5Var.getValue()).a.getShamad();
                        String url = shamad != null ? shamad.getUrl() : null;
                        if (url == null || f88.n0(url)) {
                            lw.g(null, "shamad url is null or empty", null);
                            return;
                        } else {
                            fg5.d(moreDescriptionFragment.H(), url, "");
                            return;
                        }
                    }
                    return;
                }
                if (iHashCode == -747478639) {
                    if (str2.equals("GUARANTY") && (moneyBackSummary = ((tx4) bi5Var.getValue()).a.getMoneyBackSummary()) != null) {
                        String strJ = t61.j(moneyBackSummary.getValue(), " ", moneyBackSummary.getUnitText());
                        DialogDataModel dialogDataModel = new DialogDataModel(dw1.n("MoreDescriptionFragment_", moreDescriptionFragment.H0), "DIALOG_KEY_NO_RESULT", null, 12);
                        String string2 = moreDescriptionFragment.K().getString(rs6.guarantee_txt_title);
                        String string3 = moreDescriptionFragment.K().getString(rs6.guarantee_txt_desc, strJ);
                        String string4 = moreDescriptionFragment.K().getString(rs6.button_ok);
                        js3.o(string4, "getString(...)");
                        pk5.g(moreDescriptionFragment.J0, new NavIntentDirections.AlertCenter(new od(dialogDataModel, string2, string3, string4, 0)), -1);
                        return;
                    }
                    return;
                }
                if (iHashCode == -32525873 && str2.equals("PERMISSION")) {
                    MoreDescriptionData moreDescriptionData = ((tx4) bi5Var.getValue()).a;
                    DialogDataModel dialogDataModel2 = new DialogDataModel(dw1.n("MoreDescriptionFragment_", moreDescriptionFragment.H0), "DIALOG_KEY_NO_RESULT", null, 12);
                    String title = moreDescriptionData.getTitle();
                    String name = moreDescriptionData.getVersion().getName();
                    String iconPath = moreDescriptionData.getIconPath();
                    List<PermissionDto> permissions = moreDescriptionData.getPermissions();
                    PermissionDialogFragment.PermissionList permissionList = new PermissionDialogFragment.PermissionList();
                    permissionList.a = permissions;
                    pk5.g(moreDescriptionFragment.J0, new NavIntentDirections.Permission(new c(dialogDataModel2, title, name, iconPath, permissionList)), -1);
                    return;
                }
                return;
            case 12:
                OtherStreamerData otherStreamerData = (OtherStreamerData) obj;
                int i4 = MoreStreamersFragment.j1;
                js3.p(view, "<unused var>");
                js3.p((sw5) qg5Var, "<unused var>");
                js3.p(otherStreamerData, "recyclerData");
                pk5.g(((MoreStreamersFragment) obj2).J0, new NavIntentDirections.StreamerProfile(new h78(otherStreamerData.a.getId(), null)), -1);
                return;
            case 13:
                MovieBannerListRecyclerListFragment movieBannerListRecyclerListFragment = (MovieBannerListRecyclerListFragment) obj2;
                MovieHomeBannersItemData movieHomeBannersItemData = (MovieHomeBannersItemData) obj;
                int i5 = MovieBannerListRecyclerListFragment.m1;
                js3.p(view, "<unused var>");
                js3.p((h35) qg5Var, "<unused var>");
                js3.p(movieHomeBannersItemData, "recyclerData");
                HomeMovieBannerDto homeMovieBannerDto = movieHomeBannersItemData.a;
                qa3 qa3Var = movieBannerListRecyclerListFragment.j1;
                if (qa3Var == null) {
                    js3.V("homeAnalytics");
                    throw null;
                }
                String analyticsName = homeMovieBannerDto.getAnalyticsName();
                js3.p(analyticsName, AppMeasurementSdk.ConditionalUserProperty.NAME);
                qa3Var.a.b("movie_home_banner_list_item", AppMeasurementSdk.ConditionalUserProperty.NAME, analyticsName);
                FragmentActivity fragmentActivityF = movieBannerListRecyclerListFragment.F();
                String action = homeMovieBannerDto.getAction();
                if (action != null) {
                    t61.w(action, "parse(...)", fragmentActivityF, NearbyRepository.SERVICE_ID, null);
                    return;
                }
                return;
            case 14:
                MovieBookmarkData movieBookmarkData = (MovieBookmarkData) obj;
                int i6 = MovieBookmarkRecyclerListFragment.j1;
                js3.p(view, "<unused var>");
                js3.p((f05) qg5Var, "<unused var>");
                js3.p(movieBookmarkData, "recyclerData");
                SearchMovieDto searchMovieDto = movieBookmarkData.h;
                pk5.g(((MovieBookmarkRecyclerListFragment) obj2).J0, new NavIntentDirections.MovieDetail(new v15(searchMovieDto.getId(), searchMovieDto.getRefId(), false, searchMovieDto.getPosterUrl(), null)), -1);
                return;
            case 15:
                ir.mservices.market.movie.ui.home.recycler.b bVar = (ir.mservices.market.movie.ui.home.recycler.b) obj2;
                s35 s35Var = (s35) qg5Var;
                MovieHomeMovieData movieHomeMovieData = (MovieHomeMovieData) obj;
                js3.p(view, "view");
                js3.p(s35Var, "viewHolder");
                js3.p(movieHomeMovieData, "recyclerData");
                qa3 qa3Var2 = bVar.Q;
                if (qa3Var2 == null) {
                    js3.V("homeAnalytics");
                    throw null;
                }
                String str3 = movieHomeMovieData.f;
                l06 l06Var = bVar.C;
                int iIndexOf = l06Var != null ? l06Var.D().indexOf(new RecyclerItem(movieHomeMovieData)) : -1;
                ee eeVar = qa3Var2.a;
                if (str3 == null || f88.n0(str3)) {
                    eeVar.b("movie_home_item", "position", String.valueOf(iIndexOf));
                } else {
                    eeVar.b("movie_home_item", AppMeasurementSdk.ConditionalUserProperty.NAME, str3, "position", String.valueOf(iIndexOf));
                }
                bVar.L.m(view, s35Var, movieHomeMovieData);
                return;
            case 16:
                p65 p65Var = (p65) obj2;
                s35 s35Var2 = (s35) qg5Var;
                MovieHomeMovieData movieHomeMovieData2 = (MovieHomeMovieData) obj;
                js3.p(view, "view");
                js3.p(s35Var2, "viewHolder");
                js3.p(movieHomeMovieData2, "recyclerData");
                l06 l06Var2 = p65Var.C;
                js3.n(l06Var2, "null cannot be cast to non-null type ir.mservices.market.search.history.ui.recycler.MovieSearchMoviesHorizontalListDataAdapter");
                for (Object obj3 : (ArrayList) ((o65) l06Var2).D().d) {
                    int i7 = i2 + 1;
                    if (i2 < 0) {
                        br9.P();
                        throw null;
                    }
                    if (js3.i(((RecyclerItem) obj3).c, movieHomeMovieData2)) {
                        f65 f65Var = p65Var.M;
                        if (f65Var == null) {
                            js3.V("movieSearchAnalytics");
                            throw null;
                        }
                        String str4 = movieHomeMovieData2.f;
                        if (str4 == null || f88.n0(str4)) {
                            f65Var.a().b("movie_search_recommended", "position", String.valueOf(i2));
                        } else {
                            f65Var.a().b("movie_search_recommended", AppMeasurementSdk.ConditionalUserProperty.NAME, str4, "position", String.valueOf(i2));
                        }
                    }
                    i2 = i7;
                }
                hi7 hi7Var = p65Var.K;
                if (hi7Var != null) {
                    hi7Var.m(view, s35Var2, movieHomeMovieData2);
                    return;
                }
                return;
            case 17:
                MovieSearchRecyclerListFragment movieSearchRecyclerListFragment = (MovieSearchRecyclerListFragment) obj2;
                BaseMovieSearchMovieData baseMovieSearchMovieData = (BaseMovieSearchMovieData) obj;
                int i8 = MovieSearchRecyclerListFragment.b1;
                js3.p(view, "<unused var>");
                js3.p((d80) qg5Var, "<unused var>");
                js3.p(baseMovieSearchMovieData, "recyclerData");
                Bundle bundle = movieSearchRecyclerListFragment.g;
                if (bundle != null && (string = bundle.getString("BUNDLE_KEY_QUERY")) != null) {
                    str = string;
                }
                a aVar = movieSearchRecyclerListFragment.P0;
                if (aVar != null) {
                    Iterator it = ((ArrayList) aVar.D().d).iterator();
                    while (it.hasNext()) {
                        if (!js3.i(((RecyclerItem) it.next()).c, baseMovieSearchMovieData)) {
                            i2++;
                        }
                    }
                    i2 = -1;
                } else {
                    i2 = -1;
                }
                Integer numValueOf = Integer.valueOf(i2);
                if (i2 == -1) {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    int iIntValue = numValueOf.intValue();
                    f65 f65Var2 = movieSearchRecyclerListFragment.Z0;
                    if (f65Var2 == null) {
                        js3.V("movieSearchAnalytics");
                        throw null;
                    }
                    f65Var2.a().b("movie_search_result", "query", str, "position", String.valueOf(iIntValue));
                }
                SearchMovieDto searchMovieDto2 = baseMovieSearchMovieData.a;
                pk5.g(movieSearchRecyclerListFragment.J0, new NavIntentDirections.MovieDetail(new v15(searchMovieDto2.getId(), searchMovieDto2.getRefId(), false, searchMovieDto2.getPosterUrl(), null)), -1);
                return;
            case 18:
            default:
                UserCardData userCardData = (UserCardData) obj;
                int i9 = MynetSearchRecyclerListFragment.a1;
                js3.p(view, "<unused var>");
                js3.p((d19) qg5Var, "<unused var>");
                js3.p(userCardData, "recyclerData");
                UserDto userDto = userCardData.a;
                pk5.e(((MynetSearchRecyclerListFragment) obj2).F(), userDto.getAccountKey(), userDto.getNickname(), UserProfileRefId.i);
                return;
            case 19:
                ir.mservices.market.myAccount.recycler.c cVar = (ir.mservices.market.myAccount.recycler.c) qg5Var;
                MyAccountItemData myAccountItemData = (MyAccountItemData) obj;
                js3.p(view, "view");
                js3.p(cVar, "viewHolder");
                js3.p(myAccountItemData, "recyclerData");
                ((kc5) obj2).L.m(view, cVar, myAccountItemData);
                return;
            case 20:
                d dVar = (d) qg5Var;
                MyAccountLinkItemData myAccountLinkItemData = (MyAccountLinkItemData) obj;
                js3.p(view, "view");
                js3.p(dVar, "viewHolder");
                js3.p(myAccountLinkItemData, "recyclerData");
                ((kc5) obj2).L.m(view, dVar, myAccountLinkItemData);
                return;
            case 21:
                hd5 hd5Var = (hd5) qg5Var;
                MyMarketHorizontalItemData myMarketHorizontalItemData = (MyMarketHorizontalItemData) obj;
                js3.p(view, "view");
                js3.p(hd5Var, "viewHolder");
                js3.p(myMarketHorizontalItemData, "recyclerData");
                ((kc5) obj2).L.m(view, hd5Var, myMarketHorizontalItemData);
                return;
            case 22:
                sd5 sd5Var = (sd5) qg5Var;
                MyMarketData myMarketData = (MyMarketData) obj;
                js3.p(view, "view");
                js3.p(sd5Var, "viewHolder");
                js3.p(myMarketData, "recyclerData");
                ((kc5) obj2).L.m(view, sd5Var, myMarketData);
                return;
        }
    }

    @Override // defpackage.tt5
    public void onSuccess(Object obj) {
        switch (this.a) {
            case 27:
                ((ol5) this.b).invoke(obj);
                break;
            case 28:
                ((ol5) this.b).invoke(obj);
                break;
            default:
                ((ol5) this.b).invoke(obj);
                break;
        }
    }
}
