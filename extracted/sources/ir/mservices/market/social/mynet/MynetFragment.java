package ir.mservices.market.social.mynet;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.h;
import defpackage.bp2;
import defpackage.c24;
import defpackage.d16;
import defpackage.g27;
import defpackage.j71;
import defpackage.js3;
import defpackage.jx2;
import defpackage.ms6;
import defpackage.o79;
import defpackage.og5;
import defpackage.p3;
import defpackage.pk5;
import defpackage.pq6;
import defpackage.q79;
import defpackage.rr6;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.vr1;
import defpackage.x79;
import defpackage.xf5;
import defpackage.xh7;
import ir.mservices.market.activity.BaseFragmentContentActivity;
import ir.mservices.market.app.home.data.HomeBannerDto;
import ir.mservices.market.app.home.ui.recycler.HomeBannerData;
import ir.mservices.market.app.home.ui.recycler.HomeMoreTitleRowData;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.movie.data.webapi.CommonDataKt;
import ir.mservices.market.movie.ui.home.recycler.MovieHomeBannerData;
import ir.mservices.market.pika.common.model.NearbyRepository;
import ir.mservices.market.social.mynet.MynetFragment;
import ir.mservices.market.social.profile.user.UserProfileRefId;
import ir.mservices.market.social.users.common.data.UserDto;
import ir.mservices.market.social.users.common.recycler.UserCardData;
import ir.mservices.market.version2.webapi.responsedto.LinkDTO;
import ir.mservices.market.viewModel.c;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* JADX INFO: loaded from: classes3.dex */
public final class MynetFragment extends Hilt_MynetFragment {
    public static final /* synthetic */ int k1 = 0;
    public final o79 i1;
    public xf5 j1;

    public MynetFragment() {
        final MynetFragment$special$$inlined$viewModels$default$1 mynetFragment$special$$inlined$viewModels$default$1 = new MynetFragment$special$$inlined$viewModels$default$1(this);
        final c24 c24VarB = a.b(LazyThreadSafetyMode.c, new bp2() { // from class: ir.mservices.market.social.mynet.MynetFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) mynetFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.i1 = new o79(g27.a(MynetViewModel.class), new bp2() { // from class: ir.mservices.market.social.mynet.MynetFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.social.mynet.MynetFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                q79 q79VarH;
                x79 x79Var = (x79) c24VarB.getValue();
                jx2 jx2Var = x79Var instanceof jx2 ? (jx2) x79Var : null;
                return (jx2Var == null || (q79VarH = jx2Var.h()) == null) ? this.g.h() : q79VarH;
            }
        }, new bp2() { // from class: ir.mservices.market.social.mynet.MynetFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                x79 x79Var = (x79) c24VarB.getValue();
                jx2 jx2Var = x79Var instanceof jx2 ? (jx2) x79Var : null;
                return jx2Var != null ? jx2Var.i() : j71.b;
            }
        });
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String C() {
        String strL = L(rs6.page_name_mynet);
        js3.o(strL, "getString(...)");
        return strL;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final boolean H1() {
        return false;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String Q0(BaseFragmentContentActivity baseFragmentContentActivity) {
        String string = baseFragmentContentActivity.getString(rs6.menu_item_mynet);
        js3.o(string, "getString(...)");
        return string;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean U0() {
        return false;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final void f1(Menu menu, MenuInflater menuInflater) {
        js3.p(menu, "menu");
        js3.p(menuInflater, "menuInflater");
        super.f1(menu, menuInflater);
        menuInflater.inflate(ms6.list_search, menu);
        MenuItem menuItemFindItem = menu.findItem(rr6.action_search);
        Drawable icon = menuItemFindItem.getIcon();
        if (icon != null) {
            icon.setColorFilter(new PorterDuffColorFilter(sj8.b().n, PorterDuff.Mode.MULTIPLY));
        }
        xf5 xf5Var = this.j1;
        if (xf5Var != null) {
            xf5.j(xf5Var, this, menuItemFindItem);
        } else {
            js3.V("myketUIUtils");
            throw null;
        }
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean g1(MenuItem menuItem) {
        js3.p(menuItem, "menuItem");
        if (menuItem.getItemId() != rr6.action_search) {
            return false;
        }
        pk5.g(this.J0, new NavIntentDirections.SocialSearch(new xh7("", "mynet")), -1);
        return true;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final ir.mservices.market.version2.ui.recycler.adapter.a j1() {
        vr1 vr1Var = new vr1(p3.g(F()), this.F0.f(), 1);
        final int i = 0;
        vr1Var.o = new og5(this) { // from class: ug5
            public final /* synthetic */ MynetFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                String host;
                int i2 = i;
                MynetFragment mynetFragment = this.b;
                switch (i2) {
                    case 0:
                        UserCardData userCardData = (UserCardData) obj;
                        int i3 = MynetFragment.k1;
                        js3.p(view, "<unused var>");
                        js3.p((b29) qg5Var, "<unused var>");
                        js3.p(userCardData, "recyclerData");
                        UserDto userDto = userCardData.a;
                        pk5.e(mynetFragment.F(), userDto.getAccountKey(), userDto.getNickname(), UserProfileRefId.i);
                        break;
                    case 1:
                        UserCardData userCardData2 = (UserCardData) obj;
                        int i4 = MynetFragment.k1;
                        js3.p(view, "<unused var>");
                        js3.p((d19) qg5Var, "<unused var>");
                        js3.p(userCardData2, "recyclerData");
                        UserDto userDto2 = userCardData2.a;
                        pk5.e(mynetFragment.F(), userDto2.getAccountKey(), userDto2.getNickname(), UserProfileRefId.i);
                        break;
                    case 2:
                        HomeMoreTitleRowData homeMoreTitleRowData = (HomeMoreTitleRowData) obj;
                        int i5 = MynetFragment.k1;
                        js3.p(view, "<unused var>");
                        js3.p((tb3) qg5Var, "<unused var>");
                        js3.p(homeMoreTitleRowData, "recyclerData");
                        String str = homeMoreTitleRowData.b;
                        if (str != null && !f88.n0(str)) {
                            pk5.g(mynetFragment.J0, new NavIntentDirections.UserList(new g19(str, homeMoreTitleRowData.a)), -1);
                            break;
                        }
                        break;
                    case 3:
                        HomeBannerData homeBannerData = (HomeBannerData) obj;
                        int i6 = MynetFragment.k1;
                        js3.p(view, "<unused var>");
                        js3.p((ib3) qg5Var, "<unused var>");
                        js3.p(homeBannerData, "recyclerData");
                        HomeBannerDto homeBannerDto = homeBannerData.a;
                        String action = homeBannerDto.getAction();
                        if (action == null || f88.n0(action)) {
                            lw.g(null, "Home Banner action is null or empty", null);
                        } else {
                            Uri uri = Uri.parse(homeBannerDto.getAction());
                            String scheme = uri.getScheme();
                            if (scheme == null || f88.n0(scheme) || (host = uri.getHost()) == null || f88.n0(host)) {
                                lw.g(null, "Home Banner action is malformed", homeBannerDto.getAction());
                            } else {
                                boolean zT = m88.T(uri.getScheme(), LinkDTO.LINK_TYPE_MYKET_INTENT, true);
                                boolean zT2 = m88.T(uri.getHost(), CommonDataKt.HOME_MOVIE_TYPE_LIST, true);
                                String str2 = uri.getPathSegments().size() > 0 ? uri.getPathSegments().get(0) : "";
                                String queryParameter = uri.getQueryParameter("title");
                                if (zT && zT2) {
                                    js3.m(str2);
                                    if (!f88.n0(str2) && queryParameter != null && !f88.n0(queryParameter)) {
                                        pk5.g(mynetFragment.J0, new NavIntentDirections.Package(new oy5(queryParameter, str2, "Home Apps - ".concat(str2), js8.p(uri, "refId"))), -1);
                                    }
                                }
                                js8.s(mynetFragment.F(), homeBannerDto.getAction());
                            }
                        }
                        break;
                    case 4:
                        MovieHomeBannerData movieHomeBannerData = (MovieHomeBannerData) obj;
                        int i7 = MynetFragment.k1;
                        js3.p(view, "<unused var>");
                        js3.p((e35) qg5Var, "<unused var>");
                        js3.p(movieHomeBannerData, "recyclerData");
                        FragmentActivity fragmentActivityF = mynetFragment.F();
                        String action2 = movieHomeBannerData.a.getAction();
                        if (action2 != null) {
                            t61.w(action2, "parse(...)", fragmentActivityF, NearbyRepository.SERVICE_ID, null);
                        }
                        break;
                    default:
                        MovieHomeBannerData movieHomeBannerData2 = (MovieHomeBannerData) obj;
                        int i8 = MynetFragment.k1;
                        js3.p(view, "<unused var>");
                        js3.p((b45) qg5Var, "<unused var>");
                        js3.p(movieHomeBannerData2, "recyclerData");
                        FragmentActivity fragmentActivityF2 = mynetFragment.F();
                        String action3 = movieHomeBannerData2.a.getAction();
                        if (action3 != null) {
                            t61.w(action3, "parse(...)", fragmentActivityF2, NearbyRepository.SERVICE_ID, null);
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        vr1Var.p = new og5(this) { // from class: ug5
            public final /* synthetic */ MynetFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                String host;
                int i22 = i2;
                MynetFragment mynetFragment = this.b;
                switch (i22) {
                    case 0:
                        UserCardData userCardData = (UserCardData) obj;
                        int i3 = MynetFragment.k1;
                        js3.p(view, "<unused var>");
                        js3.p((b29) qg5Var, "<unused var>");
                        js3.p(userCardData, "recyclerData");
                        UserDto userDto = userCardData.a;
                        pk5.e(mynetFragment.F(), userDto.getAccountKey(), userDto.getNickname(), UserProfileRefId.i);
                        break;
                    case 1:
                        UserCardData userCardData2 = (UserCardData) obj;
                        int i4 = MynetFragment.k1;
                        js3.p(view, "<unused var>");
                        js3.p((d19) qg5Var, "<unused var>");
                        js3.p(userCardData2, "recyclerData");
                        UserDto userDto2 = userCardData2.a;
                        pk5.e(mynetFragment.F(), userDto2.getAccountKey(), userDto2.getNickname(), UserProfileRefId.i);
                        break;
                    case 2:
                        HomeMoreTitleRowData homeMoreTitleRowData = (HomeMoreTitleRowData) obj;
                        int i5 = MynetFragment.k1;
                        js3.p(view, "<unused var>");
                        js3.p((tb3) qg5Var, "<unused var>");
                        js3.p(homeMoreTitleRowData, "recyclerData");
                        String str = homeMoreTitleRowData.b;
                        if (str != null && !f88.n0(str)) {
                            pk5.g(mynetFragment.J0, new NavIntentDirections.UserList(new g19(str, homeMoreTitleRowData.a)), -1);
                            break;
                        }
                        break;
                    case 3:
                        HomeBannerData homeBannerData = (HomeBannerData) obj;
                        int i6 = MynetFragment.k1;
                        js3.p(view, "<unused var>");
                        js3.p((ib3) qg5Var, "<unused var>");
                        js3.p(homeBannerData, "recyclerData");
                        HomeBannerDto homeBannerDto = homeBannerData.a;
                        String action = homeBannerDto.getAction();
                        if (action == null || f88.n0(action)) {
                            lw.g(null, "Home Banner action is null or empty", null);
                        } else {
                            Uri uri = Uri.parse(homeBannerDto.getAction());
                            String scheme = uri.getScheme();
                            if (scheme == null || f88.n0(scheme) || (host = uri.getHost()) == null || f88.n0(host)) {
                                lw.g(null, "Home Banner action is malformed", homeBannerDto.getAction());
                            } else {
                                boolean zT = m88.T(uri.getScheme(), LinkDTO.LINK_TYPE_MYKET_INTENT, true);
                                boolean zT2 = m88.T(uri.getHost(), CommonDataKt.HOME_MOVIE_TYPE_LIST, true);
                                String str2 = uri.getPathSegments().size() > 0 ? uri.getPathSegments().get(0) : "";
                                String queryParameter = uri.getQueryParameter("title");
                                if (zT && zT2) {
                                    js3.m(str2);
                                    if (!f88.n0(str2) && queryParameter != null && !f88.n0(queryParameter)) {
                                        pk5.g(mynetFragment.J0, new NavIntentDirections.Package(new oy5(queryParameter, str2, "Home Apps - ".concat(str2), js8.p(uri, "refId"))), -1);
                                    }
                                }
                                js8.s(mynetFragment.F(), homeBannerDto.getAction());
                            }
                        }
                        break;
                    case 4:
                        MovieHomeBannerData movieHomeBannerData = (MovieHomeBannerData) obj;
                        int i7 = MynetFragment.k1;
                        js3.p(view, "<unused var>");
                        js3.p((e35) qg5Var, "<unused var>");
                        js3.p(movieHomeBannerData, "recyclerData");
                        FragmentActivity fragmentActivityF = mynetFragment.F();
                        String action2 = movieHomeBannerData.a.getAction();
                        if (action2 != null) {
                            t61.w(action2, "parse(...)", fragmentActivityF, NearbyRepository.SERVICE_ID, null);
                        }
                        break;
                    default:
                        MovieHomeBannerData movieHomeBannerData2 = (MovieHomeBannerData) obj;
                        int i8 = MynetFragment.k1;
                        js3.p(view, "<unused var>");
                        js3.p((b45) qg5Var, "<unused var>");
                        js3.p(movieHomeBannerData2, "recyclerData");
                        FragmentActivity fragmentActivityF2 = mynetFragment.F();
                        String action3 = movieHomeBannerData2.a.getAction();
                        if (action3 != null) {
                            t61.w(action3, "parse(...)", fragmentActivityF2, NearbyRepository.SERVICE_ID, null);
                        }
                        break;
                }
            }
        };
        final int i3 = 2;
        vr1Var.q = new og5(this) { // from class: ug5
            public final /* synthetic */ MynetFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                String host;
                int i22 = i3;
                MynetFragment mynetFragment = this.b;
                switch (i22) {
                    case 0:
                        UserCardData userCardData = (UserCardData) obj;
                        int i32 = MynetFragment.k1;
                        js3.p(view, "<unused var>");
                        js3.p((b29) qg5Var, "<unused var>");
                        js3.p(userCardData, "recyclerData");
                        UserDto userDto = userCardData.a;
                        pk5.e(mynetFragment.F(), userDto.getAccountKey(), userDto.getNickname(), UserProfileRefId.i);
                        break;
                    case 1:
                        UserCardData userCardData2 = (UserCardData) obj;
                        int i4 = MynetFragment.k1;
                        js3.p(view, "<unused var>");
                        js3.p((d19) qg5Var, "<unused var>");
                        js3.p(userCardData2, "recyclerData");
                        UserDto userDto2 = userCardData2.a;
                        pk5.e(mynetFragment.F(), userDto2.getAccountKey(), userDto2.getNickname(), UserProfileRefId.i);
                        break;
                    case 2:
                        HomeMoreTitleRowData homeMoreTitleRowData = (HomeMoreTitleRowData) obj;
                        int i5 = MynetFragment.k1;
                        js3.p(view, "<unused var>");
                        js3.p((tb3) qg5Var, "<unused var>");
                        js3.p(homeMoreTitleRowData, "recyclerData");
                        String str = homeMoreTitleRowData.b;
                        if (str != null && !f88.n0(str)) {
                            pk5.g(mynetFragment.J0, new NavIntentDirections.UserList(new g19(str, homeMoreTitleRowData.a)), -1);
                            break;
                        }
                        break;
                    case 3:
                        HomeBannerData homeBannerData = (HomeBannerData) obj;
                        int i6 = MynetFragment.k1;
                        js3.p(view, "<unused var>");
                        js3.p((ib3) qg5Var, "<unused var>");
                        js3.p(homeBannerData, "recyclerData");
                        HomeBannerDto homeBannerDto = homeBannerData.a;
                        String action = homeBannerDto.getAction();
                        if (action == null || f88.n0(action)) {
                            lw.g(null, "Home Banner action is null or empty", null);
                        } else {
                            Uri uri = Uri.parse(homeBannerDto.getAction());
                            String scheme = uri.getScheme();
                            if (scheme == null || f88.n0(scheme) || (host = uri.getHost()) == null || f88.n0(host)) {
                                lw.g(null, "Home Banner action is malformed", homeBannerDto.getAction());
                            } else {
                                boolean zT = m88.T(uri.getScheme(), LinkDTO.LINK_TYPE_MYKET_INTENT, true);
                                boolean zT2 = m88.T(uri.getHost(), CommonDataKt.HOME_MOVIE_TYPE_LIST, true);
                                String str2 = uri.getPathSegments().size() > 0 ? uri.getPathSegments().get(0) : "";
                                String queryParameter = uri.getQueryParameter("title");
                                if (zT && zT2) {
                                    js3.m(str2);
                                    if (!f88.n0(str2) && queryParameter != null && !f88.n0(queryParameter)) {
                                        pk5.g(mynetFragment.J0, new NavIntentDirections.Package(new oy5(queryParameter, str2, "Home Apps - ".concat(str2), js8.p(uri, "refId"))), -1);
                                    }
                                }
                                js8.s(mynetFragment.F(), homeBannerDto.getAction());
                            }
                        }
                        break;
                    case 4:
                        MovieHomeBannerData movieHomeBannerData = (MovieHomeBannerData) obj;
                        int i7 = MynetFragment.k1;
                        js3.p(view, "<unused var>");
                        js3.p((e35) qg5Var, "<unused var>");
                        js3.p(movieHomeBannerData, "recyclerData");
                        FragmentActivity fragmentActivityF = mynetFragment.F();
                        String action2 = movieHomeBannerData.a.getAction();
                        if (action2 != null) {
                            t61.w(action2, "parse(...)", fragmentActivityF, NearbyRepository.SERVICE_ID, null);
                        }
                        break;
                    default:
                        MovieHomeBannerData movieHomeBannerData2 = (MovieHomeBannerData) obj;
                        int i8 = MynetFragment.k1;
                        js3.p(view, "<unused var>");
                        js3.p((b45) qg5Var, "<unused var>");
                        js3.p(movieHomeBannerData2, "recyclerData");
                        FragmentActivity fragmentActivityF2 = mynetFragment.F();
                        String action3 = movieHomeBannerData2.a.getAction();
                        if (action3 != null) {
                            t61.w(action3, "parse(...)", fragmentActivityF2, NearbyRepository.SERVICE_ID, null);
                        }
                        break;
                }
            }
        };
        final int i4 = 3;
        vr1Var.r = new og5(this) { // from class: ug5
            public final /* synthetic */ MynetFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                String host;
                int i22 = i4;
                MynetFragment mynetFragment = this.b;
                switch (i22) {
                    case 0:
                        UserCardData userCardData = (UserCardData) obj;
                        int i32 = MynetFragment.k1;
                        js3.p(view, "<unused var>");
                        js3.p((b29) qg5Var, "<unused var>");
                        js3.p(userCardData, "recyclerData");
                        UserDto userDto = userCardData.a;
                        pk5.e(mynetFragment.F(), userDto.getAccountKey(), userDto.getNickname(), UserProfileRefId.i);
                        break;
                    case 1:
                        UserCardData userCardData2 = (UserCardData) obj;
                        int i42 = MynetFragment.k1;
                        js3.p(view, "<unused var>");
                        js3.p((d19) qg5Var, "<unused var>");
                        js3.p(userCardData2, "recyclerData");
                        UserDto userDto2 = userCardData2.a;
                        pk5.e(mynetFragment.F(), userDto2.getAccountKey(), userDto2.getNickname(), UserProfileRefId.i);
                        break;
                    case 2:
                        HomeMoreTitleRowData homeMoreTitleRowData = (HomeMoreTitleRowData) obj;
                        int i5 = MynetFragment.k1;
                        js3.p(view, "<unused var>");
                        js3.p((tb3) qg5Var, "<unused var>");
                        js3.p(homeMoreTitleRowData, "recyclerData");
                        String str = homeMoreTitleRowData.b;
                        if (str != null && !f88.n0(str)) {
                            pk5.g(mynetFragment.J0, new NavIntentDirections.UserList(new g19(str, homeMoreTitleRowData.a)), -1);
                            break;
                        }
                        break;
                    case 3:
                        HomeBannerData homeBannerData = (HomeBannerData) obj;
                        int i6 = MynetFragment.k1;
                        js3.p(view, "<unused var>");
                        js3.p((ib3) qg5Var, "<unused var>");
                        js3.p(homeBannerData, "recyclerData");
                        HomeBannerDto homeBannerDto = homeBannerData.a;
                        String action = homeBannerDto.getAction();
                        if (action == null || f88.n0(action)) {
                            lw.g(null, "Home Banner action is null or empty", null);
                        } else {
                            Uri uri = Uri.parse(homeBannerDto.getAction());
                            String scheme = uri.getScheme();
                            if (scheme == null || f88.n0(scheme) || (host = uri.getHost()) == null || f88.n0(host)) {
                                lw.g(null, "Home Banner action is malformed", homeBannerDto.getAction());
                            } else {
                                boolean zT = m88.T(uri.getScheme(), LinkDTO.LINK_TYPE_MYKET_INTENT, true);
                                boolean zT2 = m88.T(uri.getHost(), CommonDataKt.HOME_MOVIE_TYPE_LIST, true);
                                String str2 = uri.getPathSegments().size() > 0 ? uri.getPathSegments().get(0) : "";
                                String queryParameter = uri.getQueryParameter("title");
                                if (zT && zT2) {
                                    js3.m(str2);
                                    if (!f88.n0(str2) && queryParameter != null && !f88.n0(queryParameter)) {
                                        pk5.g(mynetFragment.J0, new NavIntentDirections.Package(new oy5(queryParameter, str2, "Home Apps - ".concat(str2), js8.p(uri, "refId"))), -1);
                                    }
                                }
                                js8.s(mynetFragment.F(), homeBannerDto.getAction());
                            }
                        }
                        break;
                    case 4:
                        MovieHomeBannerData movieHomeBannerData = (MovieHomeBannerData) obj;
                        int i7 = MynetFragment.k1;
                        js3.p(view, "<unused var>");
                        js3.p((e35) qg5Var, "<unused var>");
                        js3.p(movieHomeBannerData, "recyclerData");
                        FragmentActivity fragmentActivityF = mynetFragment.F();
                        String action2 = movieHomeBannerData.a.getAction();
                        if (action2 != null) {
                            t61.w(action2, "parse(...)", fragmentActivityF, NearbyRepository.SERVICE_ID, null);
                        }
                        break;
                    default:
                        MovieHomeBannerData movieHomeBannerData2 = (MovieHomeBannerData) obj;
                        int i8 = MynetFragment.k1;
                        js3.p(view, "<unused var>");
                        js3.p((b45) qg5Var, "<unused var>");
                        js3.p(movieHomeBannerData2, "recyclerData");
                        FragmentActivity fragmentActivityF2 = mynetFragment.F();
                        String action3 = movieHomeBannerData2.a.getAction();
                        if (action3 != null) {
                            t61.w(action3, "parse(...)", fragmentActivityF2, NearbyRepository.SERVICE_ID, null);
                        }
                        break;
                }
            }
        };
        final int i5 = 4;
        vr1Var.s = new og5(this) { // from class: ug5
            public final /* synthetic */ MynetFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                String host;
                int i22 = i5;
                MynetFragment mynetFragment = this.b;
                switch (i22) {
                    case 0:
                        UserCardData userCardData = (UserCardData) obj;
                        int i32 = MynetFragment.k1;
                        js3.p(view, "<unused var>");
                        js3.p((b29) qg5Var, "<unused var>");
                        js3.p(userCardData, "recyclerData");
                        UserDto userDto = userCardData.a;
                        pk5.e(mynetFragment.F(), userDto.getAccountKey(), userDto.getNickname(), UserProfileRefId.i);
                        break;
                    case 1:
                        UserCardData userCardData2 = (UserCardData) obj;
                        int i42 = MynetFragment.k1;
                        js3.p(view, "<unused var>");
                        js3.p((d19) qg5Var, "<unused var>");
                        js3.p(userCardData2, "recyclerData");
                        UserDto userDto2 = userCardData2.a;
                        pk5.e(mynetFragment.F(), userDto2.getAccountKey(), userDto2.getNickname(), UserProfileRefId.i);
                        break;
                    case 2:
                        HomeMoreTitleRowData homeMoreTitleRowData = (HomeMoreTitleRowData) obj;
                        int i52 = MynetFragment.k1;
                        js3.p(view, "<unused var>");
                        js3.p((tb3) qg5Var, "<unused var>");
                        js3.p(homeMoreTitleRowData, "recyclerData");
                        String str = homeMoreTitleRowData.b;
                        if (str != null && !f88.n0(str)) {
                            pk5.g(mynetFragment.J0, new NavIntentDirections.UserList(new g19(str, homeMoreTitleRowData.a)), -1);
                            break;
                        }
                        break;
                    case 3:
                        HomeBannerData homeBannerData = (HomeBannerData) obj;
                        int i6 = MynetFragment.k1;
                        js3.p(view, "<unused var>");
                        js3.p((ib3) qg5Var, "<unused var>");
                        js3.p(homeBannerData, "recyclerData");
                        HomeBannerDto homeBannerDto = homeBannerData.a;
                        String action = homeBannerDto.getAction();
                        if (action == null || f88.n0(action)) {
                            lw.g(null, "Home Banner action is null or empty", null);
                        } else {
                            Uri uri = Uri.parse(homeBannerDto.getAction());
                            String scheme = uri.getScheme();
                            if (scheme == null || f88.n0(scheme) || (host = uri.getHost()) == null || f88.n0(host)) {
                                lw.g(null, "Home Banner action is malformed", homeBannerDto.getAction());
                            } else {
                                boolean zT = m88.T(uri.getScheme(), LinkDTO.LINK_TYPE_MYKET_INTENT, true);
                                boolean zT2 = m88.T(uri.getHost(), CommonDataKt.HOME_MOVIE_TYPE_LIST, true);
                                String str2 = uri.getPathSegments().size() > 0 ? uri.getPathSegments().get(0) : "";
                                String queryParameter = uri.getQueryParameter("title");
                                if (zT && zT2) {
                                    js3.m(str2);
                                    if (!f88.n0(str2) && queryParameter != null && !f88.n0(queryParameter)) {
                                        pk5.g(mynetFragment.J0, new NavIntentDirections.Package(new oy5(queryParameter, str2, "Home Apps - ".concat(str2), js8.p(uri, "refId"))), -1);
                                    }
                                }
                                js8.s(mynetFragment.F(), homeBannerDto.getAction());
                            }
                        }
                        break;
                    case 4:
                        MovieHomeBannerData movieHomeBannerData = (MovieHomeBannerData) obj;
                        int i7 = MynetFragment.k1;
                        js3.p(view, "<unused var>");
                        js3.p((e35) qg5Var, "<unused var>");
                        js3.p(movieHomeBannerData, "recyclerData");
                        FragmentActivity fragmentActivityF = mynetFragment.F();
                        String action2 = movieHomeBannerData.a.getAction();
                        if (action2 != null) {
                            t61.w(action2, "parse(...)", fragmentActivityF, NearbyRepository.SERVICE_ID, null);
                        }
                        break;
                    default:
                        MovieHomeBannerData movieHomeBannerData2 = (MovieHomeBannerData) obj;
                        int i8 = MynetFragment.k1;
                        js3.p(view, "<unused var>");
                        js3.p((b45) qg5Var, "<unused var>");
                        js3.p(movieHomeBannerData2, "recyclerData");
                        FragmentActivity fragmentActivityF2 = mynetFragment.F();
                        String action3 = movieHomeBannerData2.a.getAction();
                        if (action3 != null) {
                            t61.w(action3, "parse(...)", fragmentActivityF2, NearbyRepository.SERVICE_ID, null);
                        }
                        break;
                }
            }
        };
        final int i6 = 5;
        vr1Var.t = new og5(this) { // from class: ug5
            public final /* synthetic */ MynetFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                String host;
                int i22 = i6;
                MynetFragment mynetFragment = this.b;
                switch (i22) {
                    case 0:
                        UserCardData userCardData = (UserCardData) obj;
                        int i32 = MynetFragment.k1;
                        js3.p(view, "<unused var>");
                        js3.p((b29) qg5Var, "<unused var>");
                        js3.p(userCardData, "recyclerData");
                        UserDto userDto = userCardData.a;
                        pk5.e(mynetFragment.F(), userDto.getAccountKey(), userDto.getNickname(), UserProfileRefId.i);
                        break;
                    case 1:
                        UserCardData userCardData2 = (UserCardData) obj;
                        int i42 = MynetFragment.k1;
                        js3.p(view, "<unused var>");
                        js3.p((d19) qg5Var, "<unused var>");
                        js3.p(userCardData2, "recyclerData");
                        UserDto userDto2 = userCardData2.a;
                        pk5.e(mynetFragment.F(), userDto2.getAccountKey(), userDto2.getNickname(), UserProfileRefId.i);
                        break;
                    case 2:
                        HomeMoreTitleRowData homeMoreTitleRowData = (HomeMoreTitleRowData) obj;
                        int i52 = MynetFragment.k1;
                        js3.p(view, "<unused var>");
                        js3.p((tb3) qg5Var, "<unused var>");
                        js3.p(homeMoreTitleRowData, "recyclerData");
                        String str = homeMoreTitleRowData.b;
                        if (str != null && !f88.n0(str)) {
                            pk5.g(mynetFragment.J0, new NavIntentDirections.UserList(new g19(str, homeMoreTitleRowData.a)), -1);
                            break;
                        }
                        break;
                    case 3:
                        HomeBannerData homeBannerData = (HomeBannerData) obj;
                        int i62 = MynetFragment.k1;
                        js3.p(view, "<unused var>");
                        js3.p((ib3) qg5Var, "<unused var>");
                        js3.p(homeBannerData, "recyclerData");
                        HomeBannerDto homeBannerDto = homeBannerData.a;
                        String action = homeBannerDto.getAction();
                        if (action == null || f88.n0(action)) {
                            lw.g(null, "Home Banner action is null or empty", null);
                        } else {
                            Uri uri = Uri.parse(homeBannerDto.getAction());
                            String scheme = uri.getScheme();
                            if (scheme == null || f88.n0(scheme) || (host = uri.getHost()) == null || f88.n0(host)) {
                                lw.g(null, "Home Banner action is malformed", homeBannerDto.getAction());
                            } else {
                                boolean zT = m88.T(uri.getScheme(), LinkDTO.LINK_TYPE_MYKET_INTENT, true);
                                boolean zT2 = m88.T(uri.getHost(), CommonDataKt.HOME_MOVIE_TYPE_LIST, true);
                                String str2 = uri.getPathSegments().size() > 0 ? uri.getPathSegments().get(0) : "";
                                String queryParameter = uri.getQueryParameter("title");
                                if (zT && zT2) {
                                    js3.m(str2);
                                    if (!f88.n0(str2) && queryParameter != null && !f88.n0(queryParameter)) {
                                        pk5.g(mynetFragment.J0, new NavIntentDirections.Package(new oy5(queryParameter, str2, "Home Apps - ".concat(str2), js8.p(uri, "refId"))), -1);
                                    }
                                }
                                js8.s(mynetFragment.F(), homeBannerDto.getAction());
                            }
                        }
                        break;
                    case 4:
                        MovieHomeBannerData movieHomeBannerData = (MovieHomeBannerData) obj;
                        int i7 = MynetFragment.k1;
                        js3.p(view, "<unused var>");
                        js3.p((e35) qg5Var, "<unused var>");
                        js3.p(movieHomeBannerData, "recyclerData");
                        FragmentActivity fragmentActivityF = mynetFragment.F();
                        String action2 = movieHomeBannerData.a.getAction();
                        if (action2 != null) {
                            t61.w(action2, "parse(...)", fragmentActivityF, NearbyRepository.SERVICE_ID, null);
                        }
                        break;
                    default:
                        MovieHomeBannerData movieHomeBannerData2 = (MovieHomeBannerData) obj;
                        int i8 = MynetFragment.k1;
                        js3.p(view, "<unused var>");
                        js3.p((b45) qg5Var, "<unused var>");
                        js3.p(movieHomeBannerData2, "recyclerData");
                        FragmentActivity fragmentActivityF2 = mynetFragment.F();
                        String action3 = movieHomeBannerData2.a.getAction();
                        if (action3 != null) {
                            t61.w(action3, "parse(...)", fragmentActivityF2, NearbyRepository.SERVICE_ID, null);
                        }
                        break;
                }
            }
        };
        return vr1Var;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final c l1() {
        return (MynetViewModel) this.i1.getValue();
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final h t1() {
        return new d16(K().getDimensionPixelSize(pq6.space_l), 0, 0, 0, 1, false, this.F0.f());
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final int v1() {
        return 1;
    }
}
