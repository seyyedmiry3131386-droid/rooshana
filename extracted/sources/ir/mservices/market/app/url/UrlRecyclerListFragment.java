package ir.mservices.market.app.url;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.h;
import defpackage.bi5;
import defpackage.bn6;
import defpackage.bp2;
import defpackage.c24;
import defpackage.d16;
import defpackage.ds6;
import defpackage.f88;
import defpackage.g27;
import defpackage.j71;
import defpackage.js3;
import defpackage.jx2;
import defpackage.m88;
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
import defpackage.t09;
import defpackage.t61;
import defpackage.vo4;
import defpackage.w09;
import defpackage.x79;
import defpackage.xf5;
import defpackage.yh7;
import defpackage.yw6;
import ir.mservices.market.activity.BaseFragmentContentActivity;
import ir.mservices.market.app.common.recycler.AppNestedData;
import ir.mservices.market.app.detail.ui.Tracker;
import ir.mservices.market.app.url.UrlRecyclerListFragment;
import ir.mservices.market.app.url.recycler.AppReviewData;
import ir.mservices.market.appDetail.ToolbarData;
import ir.mservices.market.common.comment.data.CommentScenario;
import ir.mservices.market.common.comment.data.SubmitReviewData;
import ir.mservices.market.common.comment.data.response.ReviewResultDto;
import ir.mservices.market.common.ui.recycler.layoutManager.PaddingLayoutManager$Padding;
import ir.mservices.market.core.analytics.ActionBarEventBuilder;
import ir.mservices.market.core.analytics.ClickEventBuilder;
import ir.mservices.market.data.AppBarSampleData;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.data.StartApplicationData;
import ir.mservices.market.movie.data.webapi.CommonDataKt;
import ir.mservices.market.movie.ui.home.recycler.MovieHomeBannersItemData;
import ir.mservices.market.pika.common.model.NearbyRepository;
import ir.mservices.market.version2.webapi.responsedto.ApplicationDTO;
import ir.mservices.market.version2.webapi.responsedto.InCompleteReviewDto;
import ir.mservices.market.viewModel.c;
import ir.mservices.market.views.MyketRatingBar;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.a;

/* JADX INFO: loaded from: classes3.dex */
public final class UrlRecyclerListFragment extends Hilt_UrlRecyclerListFragment {
    public static final /* synthetic */ int l1 = 0;
    public xf5 i1;
    public final o79 j1;
    public final bi5 k1;

    public UrlRecyclerListFragment() {
        final UrlRecyclerListFragment$special$$inlined$viewModels$default$1 urlRecyclerListFragment$special$$inlined$viewModels$default$1 = new UrlRecyclerListFragment$special$$inlined$viewModels$default$1(this);
        final c24 c24VarB = a.b(LazyThreadSafetyMode.c, new bp2() { // from class: ir.mservices.market.app.url.UrlRecyclerListFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) urlRecyclerListFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.j1 = new o79(g27.a(UrlViewModel.class), new bp2() { // from class: ir.mservices.market.app.url.UrlRecyclerListFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.app.url.UrlRecyclerListFragment$special$$inlined$viewModels$default$5
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
        }, new bp2() { // from class: ir.mservices.market.app.url.UrlRecyclerListFragment$special$$inlined$viewModels$default$4
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
        this.k1 = new bi5(g27.a(t09.class), new yw6(25, this));
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String C() {
        String strL = L(rs6.page_name_url_list);
        js3.o(strL, "getString(...)");
        return strL;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final boolean H1() {
        return false;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String Q0(BaseFragmentContentActivity baseFragmentContentActivity) {
        String str = R1().c;
        if (str == null || f88.n0(str)) {
            return "";
        }
        String str2 = R1().c;
        js3.m(str2);
        return str2;
    }

    public final void Q1(AppReviewData appReviewData, float f) {
        InCompleteReviewDto inCompleteReviewDto = appReviewData.b;
        String packageName = inCompleteReviewDto.getPackageName();
        js3.o(packageName, "getPackageName(...)");
        CommentScenario.SubmitReview submitReview = new CommentScenario.SubmitReview(new SubmitReviewData(packageName, f, null, true, true, new ToolbarData(inCompleteReviewDto), "_url", "HOME", 4, null));
        FragmentActivity fragmentActivityF = F();
        if (fragmentActivityF != null) {
            pk5.c(fragmentActivityF, submitReview);
        }
    }

    public final t09 R1() {
        return (t09) this.k1.getValue();
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final void f1(Menu menu, MenuInflater menuInflater) {
        js3.p(menu, "menu");
        js3.p(menuInflater, "menuInflater");
        menuInflater.inflate(ms6.list_search, menu);
        MenuItem menuItemFindItem = menu.findItem(rr6.action_search);
        Drawable icon = menuItemFindItem.getIcon();
        if (icon != null) {
            icon.setColorFilter(new PorterDuffColorFilter(sj8.b().n, PorterDuff.Mode.MULTIPLY));
        }
        xf5 xf5Var = this.i1;
        if (xf5Var == null) {
            js3.V("myketUIUtils");
            throw null;
        }
        xf5.j(xf5Var, this, menuItemFindItem);
        super.f1(menu, menuInflater);
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean g1(MenuItem menuItem) {
        js3.p(menuItem, "menuItem");
        if (menuItem.getItemId() == rr6.action_search) {
            ActionBarEventBuilder actionBarEventBuilder = new ActionBarEventBuilder();
            actionBarEventBuilder.b("list_search");
            actionBarEventBuilder.a();
            ActionBarEventBuilder actionBarEventBuilder2 = new ActionBarEventBuilder();
            actionBarEventBuilder2.b("app_list_search_url");
            actionBarEventBuilder2.a();
            pk5.g(this.J0, new NavIntentDirections.Search(new yh7("", "List")), -1);
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [s09] */
    /* JADX WARN: Type inference failed for: r2v5, types: [s09] */
    /* JADX WARN: Type inference failed for: r2v6, types: [s09] */
    /* JADX WARN: Type inference failed for: r2v7, types: [s09] */
    /* JADX WARN: Type inference failed for: r2v8, types: [s09] */
    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final ir.mservices.market.version2.ui.recycler.adapter.a j1() {
        w09 w09Var = new w09(v1(), p3.g(F()));
        int iE = t61.e(K(), pq6.horizontal_space_outer, 2, w09Var.l.a);
        w09Var.m = iE;
        w09Var.n = t61.e(K(), pq6.space_8, 2, iE / v1());
        bn6 bn6Var = new bn6(F());
        final int i = 0;
        w09Var.o = new og5(this) { // from class: s09
            public final /* synthetic */ UrlRecyclerListFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                int i2 = i;
                UrlRecyclerListFragment urlRecyclerListFragment = this.b;
                switch (i2) {
                    case 0:
                        AppReviewData appReviewData = (AppReviewData) obj;
                        int i3 = UrlRecyclerListFragment.l1;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.app.url.recycler.a) qg5Var, "<unused var>");
                        js3.p(appReviewData, "recyclerData");
                        ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                        clickEventBuilder.b("home_reviews_more_detail");
                        clickEventBuilder.a();
                        String packageName = appReviewData.b.getPackageName();
                        js3.o(packageName, "getPackageName(...)");
                        pk5.g(urlRecyclerListFragment.J0, new NavIntentDirections.AppDetail(new hp(packageName, false, new Tracker("url", null, ReviewResultDto.REVIEW_POST_ACTION_REVIEW), false, null, "ReviewIncomplete", null, null, null, null, null, null, null)), -1);
                        break;
                    case 1:
                        h95 h95Var = (h95) qg5Var;
                        AppNestedData appNestedData = (AppNestedData) obj;
                        int i4 = UrlRecyclerListFragment.l1;
                        js3.p(view, "<unused var>");
                        js3.p(h95Var, "viewHolder");
                        js3.p(appNestedData, "recyclerData");
                        ImageView imageViewX = h95Var.x();
                        ApplicationDTO applicationDTO = appNestedData.a;
                        if (applicationDTO != null) {
                            String iconPath = applicationDTO.getIconPath();
                            js3.o(iconPath, "getIconPath(...)");
                            String title = applicationDTO.getTitle();
                            js3.o(title, "getTitle(...)");
                            String packageName2 = applicationDTO.getPackageName();
                            js3.o(packageName2, "getPackageName(...)");
                            StartApplicationData startApplicationData = new StartApplicationData(new AppBarSampleData(iconPath, title, packageName2, null, applicationDTO.getTagline(), null, null, null, 232, null), applicationDTO.getInstallCallbackUrl(), applicationDTO.getClickCallback());
                            String packageName3 = applicationDTO.getPackageName();
                            js3.o(packageName3, "getPackageName(...)");
                            Tracker tracker = new Tracker("url", urlRecyclerListFragment.R1().b, "verticalList");
                            boolean z = urlRecyclerListFragment.s1().b(imageViewX.getDrawable()) != null;
                            String refId = applicationDTO.getRefId();
                            js3.o(refId, "getRefId(...)");
                            pk5.f(urlRecyclerListFragment.J0, new NavIntentDirections.AppDetail(new hp(packageName3, false, tracker, z, null, refId, applicationDTO.getCallbackUrl(), null, startApplicationData, null, null, null, null)));
                        }
                        break;
                    case 2:
                        AppReviewData appReviewData2 = (AppReviewData) obj;
                        int i5 = UrlRecyclerListFragment.l1;
                        js3.p(view, "view");
                        js3.p((ir.mservices.market.app.url.recycler.a) qg5Var, "<unused var>");
                        js3.p(appReviewData2, "recyclerData");
                        ClickEventBuilder clickEventBuilder2 = new ClickEventBuilder();
                        clickEventBuilder2.b("home_reviews_more_stars");
                        clickEventBuilder2.a();
                        MyketRatingBar myketRatingBar = view instanceof MyketRatingBar ? (MyketRatingBar) view : null;
                        urlRecyclerListFragment.Q1(appReviewData2, myketRatingBar != null ? myketRatingBar.getRating() : 0.0f);
                        break;
                    case 3:
                        AppReviewData appReviewData3 = (AppReviewData) obj;
                        int i6 = UrlRecyclerListFragment.l1;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.app.url.recycler.a) qg5Var, "<unused var>");
                        js3.p(appReviewData3, "recyclerData");
                        ClickEventBuilder clickEventBuilder3 = new ClickEventBuilder();
                        clickEventBuilder3.b("home_reviews_more_write_review");
                        clickEventBuilder3.a();
                        urlRecyclerListFragment.Q1(appReviewData3, 0.0f);
                        break;
                    default:
                        MovieHomeBannersItemData movieHomeBannersItemData = (MovieHomeBannersItemData) obj;
                        int i7 = UrlRecyclerListFragment.l1;
                        js3.p(view, "<unused var>");
                        js3.p((h35) qg5Var, "<unused var>");
                        js3.p(movieHomeBannersItemData, "recyclerData");
                        FragmentActivity fragmentActivityF = urlRecyclerListFragment.F();
                        String action = movieHomeBannersItemData.a.getAction();
                        if (action != null) {
                            t61.w(action, "parse(...)", fragmentActivityF, NearbyRepository.SERVICE_ID, null);
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        w09Var.s = new og5(this) { // from class: s09
            public final /* synthetic */ UrlRecyclerListFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                int i22 = i2;
                UrlRecyclerListFragment urlRecyclerListFragment = this.b;
                switch (i22) {
                    case 0:
                        AppReviewData appReviewData = (AppReviewData) obj;
                        int i3 = UrlRecyclerListFragment.l1;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.app.url.recycler.a) qg5Var, "<unused var>");
                        js3.p(appReviewData, "recyclerData");
                        ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                        clickEventBuilder.b("home_reviews_more_detail");
                        clickEventBuilder.a();
                        String packageName = appReviewData.b.getPackageName();
                        js3.o(packageName, "getPackageName(...)");
                        pk5.g(urlRecyclerListFragment.J0, new NavIntentDirections.AppDetail(new hp(packageName, false, new Tracker("url", null, ReviewResultDto.REVIEW_POST_ACTION_REVIEW), false, null, "ReviewIncomplete", null, null, null, null, null, null, null)), -1);
                        break;
                    case 1:
                        h95 h95Var = (h95) qg5Var;
                        AppNestedData appNestedData = (AppNestedData) obj;
                        int i4 = UrlRecyclerListFragment.l1;
                        js3.p(view, "<unused var>");
                        js3.p(h95Var, "viewHolder");
                        js3.p(appNestedData, "recyclerData");
                        ImageView imageViewX = h95Var.x();
                        ApplicationDTO applicationDTO = appNestedData.a;
                        if (applicationDTO != null) {
                            String iconPath = applicationDTO.getIconPath();
                            js3.o(iconPath, "getIconPath(...)");
                            String title = applicationDTO.getTitle();
                            js3.o(title, "getTitle(...)");
                            String packageName2 = applicationDTO.getPackageName();
                            js3.o(packageName2, "getPackageName(...)");
                            StartApplicationData startApplicationData = new StartApplicationData(new AppBarSampleData(iconPath, title, packageName2, null, applicationDTO.getTagline(), null, null, null, 232, null), applicationDTO.getInstallCallbackUrl(), applicationDTO.getClickCallback());
                            String packageName3 = applicationDTO.getPackageName();
                            js3.o(packageName3, "getPackageName(...)");
                            Tracker tracker = new Tracker("url", urlRecyclerListFragment.R1().b, "verticalList");
                            boolean z = urlRecyclerListFragment.s1().b(imageViewX.getDrawable()) != null;
                            String refId = applicationDTO.getRefId();
                            js3.o(refId, "getRefId(...)");
                            pk5.f(urlRecyclerListFragment.J0, new NavIntentDirections.AppDetail(new hp(packageName3, false, tracker, z, null, refId, applicationDTO.getCallbackUrl(), null, startApplicationData, null, null, null, null)));
                        }
                        break;
                    case 2:
                        AppReviewData appReviewData2 = (AppReviewData) obj;
                        int i5 = UrlRecyclerListFragment.l1;
                        js3.p(view, "view");
                        js3.p((ir.mservices.market.app.url.recycler.a) qg5Var, "<unused var>");
                        js3.p(appReviewData2, "recyclerData");
                        ClickEventBuilder clickEventBuilder2 = new ClickEventBuilder();
                        clickEventBuilder2.b("home_reviews_more_stars");
                        clickEventBuilder2.a();
                        MyketRatingBar myketRatingBar = view instanceof MyketRatingBar ? (MyketRatingBar) view : null;
                        urlRecyclerListFragment.Q1(appReviewData2, myketRatingBar != null ? myketRatingBar.getRating() : 0.0f);
                        break;
                    case 3:
                        AppReviewData appReviewData3 = (AppReviewData) obj;
                        int i6 = UrlRecyclerListFragment.l1;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.app.url.recycler.a) qg5Var, "<unused var>");
                        js3.p(appReviewData3, "recyclerData");
                        ClickEventBuilder clickEventBuilder3 = new ClickEventBuilder();
                        clickEventBuilder3.b("home_reviews_more_write_review");
                        clickEventBuilder3.a();
                        urlRecyclerListFragment.Q1(appReviewData3, 0.0f);
                        break;
                    default:
                        MovieHomeBannersItemData movieHomeBannersItemData = (MovieHomeBannersItemData) obj;
                        int i7 = UrlRecyclerListFragment.l1;
                        js3.p(view, "<unused var>");
                        js3.p((h35) qg5Var, "<unused var>");
                        js3.p(movieHomeBannersItemData, "recyclerData");
                        FragmentActivity fragmentActivityF = urlRecyclerListFragment.F();
                        String action = movieHomeBannersItemData.a.getAction();
                        if (action != null) {
                            t61.w(action, "parse(...)", fragmentActivityF, NearbyRepository.SERVICE_ID, null);
                        }
                        break;
                }
            }
        };
        final int i3 = 2;
        w09Var.q = new og5(this) { // from class: s09
            public final /* synthetic */ UrlRecyclerListFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                int i22 = i3;
                UrlRecyclerListFragment urlRecyclerListFragment = this.b;
                switch (i22) {
                    case 0:
                        AppReviewData appReviewData = (AppReviewData) obj;
                        int i32 = UrlRecyclerListFragment.l1;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.app.url.recycler.a) qg5Var, "<unused var>");
                        js3.p(appReviewData, "recyclerData");
                        ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                        clickEventBuilder.b("home_reviews_more_detail");
                        clickEventBuilder.a();
                        String packageName = appReviewData.b.getPackageName();
                        js3.o(packageName, "getPackageName(...)");
                        pk5.g(urlRecyclerListFragment.J0, new NavIntentDirections.AppDetail(new hp(packageName, false, new Tracker("url", null, ReviewResultDto.REVIEW_POST_ACTION_REVIEW), false, null, "ReviewIncomplete", null, null, null, null, null, null, null)), -1);
                        break;
                    case 1:
                        h95 h95Var = (h95) qg5Var;
                        AppNestedData appNestedData = (AppNestedData) obj;
                        int i4 = UrlRecyclerListFragment.l1;
                        js3.p(view, "<unused var>");
                        js3.p(h95Var, "viewHolder");
                        js3.p(appNestedData, "recyclerData");
                        ImageView imageViewX = h95Var.x();
                        ApplicationDTO applicationDTO = appNestedData.a;
                        if (applicationDTO != null) {
                            String iconPath = applicationDTO.getIconPath();
                            js3.o(iconPath, "getIconPath(...)");
                            String title = applicationDTO.getTitle();
                            js3.o(title, "getTitle(...)");
                            String packageName2 = applicationDTO.getPackageName();
                            js3.o(packageName2, "getPackageName(...)");
                            StartApplicationData startApplicationData = new StartApplicationData(new AppBarSampleData(iconPath, title, packageName2, null, applicationDTO.getTagline(), null, null, null, 232, null), applicationDTO.getInstallCallbackUrl(), applicationDTO.getClickCallback());
                            String packageName3 = applicationDTO.getPackageName();
                            js3.o(packageName3, "getPackageName(...)");
                            Tracker tracker = new Tracker("url", urlRecyclerListFragment.R1().b, "verticalList");
                            boolean z = urlRecyclerListFragment.s1().b(imageViewX.getDrawable()) != null;
                            String refId = applicationDTO.getRefId();
                            js3.o(refId, "getRefId(...)");
                            pk5.f(urlRecyclerListFragment.J0, new NavIntentDirections.AppDetail(new hp(packageName3, false, tracker, z, null, refId, applicationDTO.getCallbackUrl(), null, startApplicationData, null, null, null, null)));
                        }
                        break;
                    case 2:
                        AppReviewData appReviewData2 = (AppReviewData) obj;
                        int i5 = UrlRecyclerListFragment.l1;
                        js3.p(view, "view");
                        js3.p((ir.mservices.market.app.url.recycler.a) qg5Var, "<unused var>");
                        js3.p(appReviewData2, "recyclerData");
                        ClickEventBuilder clickEventBuilder2 = new ClickEventBuilder();
                        clickEventBuilder2.b("home_reviews_more_stars");
                        clickEventBuilder2.a();
                        MyketRatingBar myketRatingBar = view instanceof MyketRatingBar ? (MyketRatingBar) view : null;
                        urlRecyclerListFragment.Q1(appReviewData2, myketRatingBar != null ? myketRatingBar.getRating() : 0.0f);
                        break;
                    case 3:
                        AppReviewData appReviewData3 = (AppReviewData) obj;
                        int i6 = UrlRecyclerListFragment.l1;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.app.url.recycler.a) qg5Var, "<unused var>");
                        js3.p(appReviewData3, "recyclerData");
                        ClickEventBuilder clickEventBuilder3 = new ClickEventBuilder();
                        clickEventBuilder3.b("home_reviews_more_write_review");
                        clickEventBuilder3.a();
                        urlRecyclerListFragment.Q1(appReviewData3, 0.0f);
                        break;
                    default:
                        MovieHomeBannersItemData movieHomeBannersItemData = (MovieHomeBannersItemData) obj;
                        int i7 = UrlRecyclerListFragment.l1;
                        js3.p(view, "<unused var>");
                        js3.p((h35) qg5Var, "<unused var>");
                        js3.p(movieHomeBannersItemData, "recyclerData");
                        FragmentActivity fragmentActivityF = urlRecyclerListFragment.F();
                        String action = movieHomeBannersItemData.a.getAction();
                        if (action != null) {
                            t61.w(action, "parse(...)", fragmentActivityF, NearbyRepository.SERVICE_ID, null);
                        }
                        break;
                }
            }
        };
        final int i4 = 3;
        w09Var.p = new og5(this) { // from class: s09
            public final /* synthetic */ UrlRecyclerListFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                int i22 = i4;
                UrlRecyclerListFragment urlRecyclerListFragment = this.b;
                switch (i22) {
                    case 0:
                        AppReviewData appReviewData = (AppReviewData) obj;
                        int i32 = UrlRecyclerListFragment.l1;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.app.url.recycler.a) qg5Var, "<unused var>");
                        js3.p(appReviewData, "recyclerData");
                        ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                        clickEventBuilder.b("home_reviews_more_detail");
                        clickEventBuilder.a();
                        String packageName = appReviewData.b.getPackageName();
                        js3.o(packageName, "getPackageName(...)");
                        pk5.g(urlRecyclerListFragment.J0, new NavIntentDirections.AppDetail(new hp(packageName, false, new Tracker("url", null, ReviewResultDto.REVIEW_POST_ACTION_REVIEW), false, null, "ReviewIncomplete", null, null, null, null, null, null, null)), -1);
                        break;
                    case 1:
                        h95 h95Var = (h95) qg5Var;
                        AppNestedData appNestedData = (AppNestedData) obj;
                        int i42 = UrlRecyclerListFragment.l1;
                        js3.p(view, "<unused var>");
                        js3.p(h95Var, "viewHolder");
                        js3.p(appNestedData, "recyclerData");
                        ImageView imageViewX = h95Var.x();
                        ApplicationDTO applicationDTO = appNestedData.a;
                        if (applicationDTO != null) {
                            String iconPath = applicationDTO.getIconPath();
                            js3.o(iconPath, "getIconPath(...)");
                            String title = applicationDTO.getTitle();
                            js3.o(title, "getTitle(...)");
                            String packageName2 = applicationDTO.getPackageName();
                            js3.o(packageName2, "getPackageName(...)");
                            StartApplicationData startApplicationData = new StartApplicationData(new AppBarSampleData(iconPath, title, packageName2, null, applicationDTO.getTagline(), null, null, null, 232, null), applicationDTO.getInstallCallbackUrl(), applicationDTO.getClickCallback());
                            String packageName3 = applicationDTO.getPackageName();
                            js3.o(packageName3, "getPackageName(...)");
                            Tracker tracker = new Tracker("url", urlRecyclerListFragment.R1().b, "verticalList");
                            boolean z = urlRecyclerListFragment.s1().b(imageViewX.getDrawable()) != null;
                            String refId = applicationDTO.getRefId();
                            js3.o(refId, "getRefId(...)");
                            pk5.f(urlRecyclerListFragment.J0, new NavIntentDirections.AppDetail(new hp(packageName3, false, tracker, z, null, refId, applicationDTO.getCallbackUrl(), null, startApplicationData, null, null, null, null)));
                        }
                        break;
                    case 2:
                        AppReviewData appReviewData2 = (AppReviewData) obj;
                        int i5 = UrlRecyclerListFragment.l1;
                        js3.p(view, "view");
                        js3.p((ir.mservices.market.app.url.recycler.a) qg5Var, "<unused var>");
                        js3.p(appReviewData2, "recyclerData");
                        ClickEventBuilder clickEventBuilder2 = new ClickEventBuilder();
                        clickEventBuilder2.b("home_reviews_more_stars");
                        clickEventBuilder2.a();
                        MyketRatingBar myketRatingBar = view instanceof MyketRatingBar ? (MyketRatingBar) view : null;
                        urlRecyclerListFragment.Q1(appReviewData2, myketRatingBar != null ? myketRatingBar.getRating() : 0.0f);
                        break;
                    case 3:
                        AppReviewData appReviewData3 = (AppReviewData) obj;
                        int i6 = UrlRecyclerListFragment.l1;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.app.url.recycler.a) qg5Var, "<unused var>");
                        js3.p(appReviewData3, "recyclerData");
                        ClickEventBuilder clickEventBuilder3 = new ClickEventBuilder();
                        clickEventBuilder3.b("home_reviews_more_write_review");
                        clickEventBuilder3.a();
                        urlRecyclerListFragment.Q1(appReviewData3, 0.0f);
                        break;
                    default:
                        MovieHomeBannersItemData movieHomeBannersItemData = (MovieHomeBannersItemData) obj;
                        int i7 = UrlRecyclerListFragment.l1;
                        js3.p(view, "<unused var>");
                        js3.p((h35) qg5Var, "<unused var>");
                        js3.p(movieHomeBannersItemData, "recyclerData");
                        FragmentActivity fragmentActivityF = urlRecyclerListFragment.F();
                        String action = movieHomeBannersItemData.a.getAction();
                        if (action != null) {
                            t61.w(action, "parse(...)", fragmentActivityF, NearbyRepository.SERVICE_ID, null);
                        }
                        break;
                }
            }
        };
        w09Var.r = new vo4(16, bn6Var);
        final int i5 = 4;
        w09Var.t = new og5(this) { // from class: s09
            public final /* synthetic */ UrlRecyclerListFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                int i22 = i5;
                UrlRecyclerListFragment urlRecyclerListFragment = this.b;
                switch (i22) {
                    case 0:
                        AppReviewData appReviewData = (AppReviewData) obj;
                        int i32 = UrlRecyclerListFragment.l1;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.app.url.recycler.a) qg5Var, "<unused var>");
                        js3.p(appReviewData, "recyclerData");
                        ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                        clickEventBuilder.b("home_reviews_more_detail");
                        clickEventBuilder.a();
                        String packageName = appReviewData.b.getPackageName();
                        js3.o(packageName, "getPackageName(...)");
                        pk5.g(urlRecyclerListFragment.J0, new NavIntentDirections.AppDetail(new hp(packageName, false, new Tracker("url", null, ReviewResultDto.REVIEW_POST_ACTION_REVIEW), false, null, "ReviewIncomplete", null, null, null, null, null, null, null)), -1);
                        break;
                    case 1:
                        h95 h95Var = (h95) qg5Var;
                        AppNestedData appNestedData = (AppNestedData) obj;
                        int i42 = UrlRecyclerListFragment.l1;
                        js3.p(view, "<unused var>");
                        js3.p(h95Var, "viewHolder");
                        js3.p(appNestedData, "recyclerData");
                        ImageView imageViewX = h95Var.x();
                        ApplicationDTO applicationDTO = appNestedData.a;
                        if (applicationDTO != null) {
                            String iconPath = applicationDTO.getIconPath();
                            js3.o(iconPath, "getIconPath(...)");
                            String title = applicationDTO.getTitle();
                            js3.o(title, "getTitle(...)");
                            String packageName2 = applicationDTO.getPackageName();
                            js3.o(packageName2, "getPackageName(...)");
                            StartApplicationData startApplicationData = new StartApplicationData(new AppBarSampleData(iconPath, title, packageName2, null, applicationDTO.getTagline(), null, null, null, 232, null), applicationDTO.getInstallCallbackUrl(), applicationDTO.getClickCallback());
                            String packageName3 = applicationDTO.getPackageName();
                            js3.o(packageName3, "getPackageName(...)");
                            Tracker tracker = new Tracker("url", urlRecyclerListFragment.R1().b, "verticalList");
                            boolean z = urlRecyclerListFragment.s1().b(imageViewX.getDrawable()) != null;
                            String refId = applicationDTO.getRefId();
                            js3.o(refId, "getRefId(...)");
                            pk5.f(urlRecyclerListFragment.J0, new NavIntentDirections.AppDetail(new hp(packageName3, false, tracker, z, null, refId, applicationDTO.getCallbackUrl(), null, startApplicationData, null, null, null, null)));
                        }
                        break;
                    case 2:
                        AppReviewData appReviewData2 = (AppReviewData) obj;
                        int i52 = UrlRecyclerListFragment.l1;
                        js3.p(view, "view");
                        js3.p((ir.mservices.market.app.url.recycler.a) qg5Var, "<unused var>");
                        js3.p(appReviewData2, "recyclerData");
                        ClickEventBuilder clickEventBuilder2 = new ClickEventBuilder();
                        clickEventBuilder2.b("home_reviews_more_stars");
                        clickEventBuilder2.a();
                        MyketRatingBar myketRatingBar = view instanceof MyketRatingBar ? (MyketRatingBar) view : null;
                        urlRecyclerListFragment.Q1(appReviewData2, myketRatingBar != null ? myketRatingBar.getRating() : 0.0f);
                        break;
                    case 3:
                        AppReviewData appReviewData3 = (AppReviewData) obj;
                        int i6 = UrlRecyclerListFragment.l1;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.app.url.recycler.a) qg5Var, "<unused var>");
                        js3.p(appReviewData3, "recyclerData");
                        ClickEventBuilder clickEventBuilder3 = new ClickEventBuilder();
                        clickEventBuilder3.b("home_reviews_more_write_review");
                        clickEventBuilder3.a();
                        urlRecyclerListFragment.Q1(appReviewData3, 0.0f);
                        break;
                    default:
                        MovieHomeBannersItemData movieHomeBannersItemData = (MovieHomeBannersItemData) obj;
                        int i7 = UrlRecyclerListFragment.l1;
                        js3.p(view, "<unused var>");
                        js3.p((h35) qg5Var, "<unused var>");
                        js3.p(movieHomeBannersItemData, "recyclerData");
                        FragmentActivity fragmentActivityF = urlRecyclerListFragment.F();
                        String action = movieHomeBannersItemData.a.getAction();
                        if (action != null) {
                            t61.w(action, "parse(...)", fragmentActivityF, NearbyRepository.SERVICE_ID, null);
                        }
                        break;
                }
            }
        };
        return w09Var;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        super.k0(view, bundle);
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final c l1() {
        return (UrlViewModel) this.j1.getValue();
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final h t1() {
        return m88.T(R1().d, CommonDataKt.SUMMARY_ACTION_REVIEWS, true) ? new d16(K().getDimensionPixelSize(pq6.space_s), K().getDimensionPixelSize(pq6.space_16), K().getDimensionPixelSize(pq6.horizontal_space_outer), K().getDimensionPixelSize(pq6.horizontal_space_outer), K().getDimensionPixelSize(pq6.space_s), 0, v1(), false, this.F0.f()) : m88.T(R1().d, "Banners", true) ? new d16(0, 0, K().getDimensionPixelSize(pq6.space_8), 0, v1(), false, this.F0.f()) : new d16(K().getDimensionPixelSize(pq6.space_4), K().getDimensionPixelSize(pq6.horizontal_space_outer), K().getDimensionPixelSize(pq6.space_4), 0, v1(), false, this.F0.f());
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final PaddingLayoutManager$Padding u1() {
        if (!R1().d.equalsIgnoreCase("Banners")) {
            return super.u1();
        }
        int dimensionPixelSize = K().getDimensionPixelSize(pq6.space_16);
        int dimensionPixelSize2 = K().getDimensionPixelSize(pq6.horizontal_space_outer);
        int dimensionPixelSize3 = K().getDimensionPixelSize(pq6.space_8);
        Pair pair = this.F0.f() ? new Pair(Integer.valueOf(dimensionPixelSize2 - dimensionPixelSize3), Integer.valueOf(dimensionPixelSize2)) : new Pair(Integer.valueOf(dimensionPixelSize2), Integer.valueOf(dimensionPixelSize2 - dimensionPixelSize3));
        return new PaddingLayoutManager$Padding(((Number) pair.a).intValue(), dimensionPixelSize, ((Number) pair.b).intValue(), dimensionPixelSize);
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final int v1() {
        if (m88.T(R1().d, "Banners", true)) {
            return K().getInteger(ds6.movie_banner_list_item);
        }
        return 1;
    }
}
