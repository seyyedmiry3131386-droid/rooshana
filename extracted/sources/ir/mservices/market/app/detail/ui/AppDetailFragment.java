package ir.mservices.market.app.detail.ui;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.g;
import androidx.lifecycle.Lifecycle$State;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import com.airbnb.lottie.LottieAnimationView;
import defpackage.ap;
import defpackage.bp;
import defpackage.bp2;
import defpackage.bt2;
import defpackage.bt5;
import defpackage.by4;
import defpackage.c24;
import defpackage.c5;
import defpackage.co6;
import defpackage.cp3;
import defpackage.d16;
import defpackage.d56;
import defpackage.dd;
import defpackage.de;
import defpackage.dp;
import defpackage.dp3;
import defpackage.ds6;
import defpackage.dt2;
import defpackage.dw1;
import defpackage.en;
import defpackage.eq;
import defpackage.f88;
import defpackage.fa1;
import defpackage.fw0;
import defpackage.g27;
import defpackage.ga4;
import defpackage.gp;
import defpackage.ha4;
import defpackage.hh2;
import defpackage.hi6;
import defpackage.hp;
import defpackage.ht;
import defpackage.ia4;
import defpackage.j71;
import defpackage.ja4;
import defpackage.js3;
import defpackage.js6;
import defpackage.js8;
import defpackage.jx2;
import defpackage.k50;
import defpackage.lk2;
import defpackage.lw;
import defpackage.m91;
import defpackage.ms6;
import defpackage.o79;
import defpackage.og5;
import defpackage.ot4;
import defpackage.p3;
import defpackage.p40;
import defpackage.pk5;
import defpackage.pq6;
import defpackage.ps1;
import defpackage.pt2;
import defpackage.q79;
import defpackage.qj8;
import defpackage.ql0;
import defpackage.qp;
import defpackage.qs6;
import defpackage.ra3;
import defpackage.rf7;
import defpackage.rn8;
import defpackage.rq4;
import defpackage.rr6;
import defpackage.rs6;
import defpackage.s7;
import defpackage.sj8;
import defpackage.t40;
import defpackage.t61;
import defpackage.tt3;
import defpackage.vv2;
import defpackage.vy7;
import defpackage.wd4;
import defpackage.wu0;
import defpackage.x79;
import defpackage.xf5;
import defpackage.y97;
import defpackage.yd5;
import defpackage.yh7;
import defpackage.yq2;
import defpackage.yq6;
import defpackage.yr;
import defpackage.zo;
import ir.mservices.market.activity.BaseContentActivity;
import ir.mservices.market.activity.BaseNavigationContentActivity;
import ir.mservices.market.activity.LaunchContentActivity;
import ir.mservices.market.app.detail.data.AppRateDto;
import ir.mservices.market.app.detail.data.ApplicationFullDto;
import ir.mservices.market.app.detail.data.RateDto;
import ir.mservices.market.app.detail.data.SummaryIconDto;
import ir.mservices.market.app.detail.data.SummaryTextDto;
import ir.mservices.market.app.detail.reivews.recycler.AIReviewSummaryData;
import ir.mservices.market.app.detail.reivews.recycler.OwnReviewData;
import ir.mservices.market.app.detail.reivews.recycler.a;
import ir.mservices.market.app.detail.ui.AppDetailAction;
import ir.mservices.market.app.detail.ui.AppDetailFragment;
import ir.mservices.market.app.detail.ui.AppDetailViewModel;
import ir.mservices.market.app.detail.ui.recommendation.AppDetailRecommendationFragment;
import ir.mservices.market.app.detail.ui.recycler.AppBarData;
import ir.mservices.market.app.detail.ui.recycler.AppDownloadData;
import ir.mservices.market.app.detail.ui.recycler.AppMoreDescriptionData;
import ir.mservices.market.app.detail.ui.recycler.AppRatingModuleData;
import ir.mservices.market.app.detail.ui.recycler.AppSummaryIconData;
import ir.mservices.market.app.detail.ui.recycler.AppSummaryRateData;
import ir.mservices.market.app.detail.ui.recycler.AppSummarySizeData;
import ir.mservices.market.app.detail.ui.recycler.AppSummaryTextData;
import ir.mservices.market.app.detail.ui.recycler.b;
import ir.mservices.market.app.detail.ui.recycler.d;
import ir.mservices.market.app.detail.ui.recycler.f;
import ir.mservices.market.app.home.data.AddaxBoxDto;
import ir.mservices.market.appDetail.DetailToolbarView;
import ir.mservices.market.appDetail.DetailsTransition;
import ir.mservices.market.appDetail.ToolbarData;
import ir.mservices.market.common.comment.data.CommentScenario;
import ir.mservices.market.common.comment.data.LikeOrDislikeData;
import ir.mservices.market.common.comment.data.SubmitReviewData;
import ir.mservices.market.common.comment.data.response.ReviewDto;
import ir.mservices.market.common.data.SummaryDialogDto;
import ir.mservices.market.common.ui.recycler.AddaxBoxData;
import ir.mservices.market.common.ui.recycler.layoutManager.PaddingLayoutManager$Padding;
import ir.mservices.market.core.analytics.ActionBarEventBuilder;
import ir.mservices.market.core.analytics.ClickEventBuilder;
import ir.mservices.market.core.analytics.LaunchAppDetailsEventBuilder;
import ir.mservices.market.data.AppBarSampleData;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.data.StartApplicationData;
import ir.mservices.market.download.common.data.AppDownloadInfo;
import ir.mservices.market.login.data.LoginData;
import ir.mservices.market.login.data.PhoneBindData;
import ir.mservices.market.model.paging.MyketPagingError;
import ir.mservices.market.myReview.common.MyReviewType;
import ir.mservices.market.pika.common.model.NearbyRepository;
import ir.mservices.market.version2.download.DownloadDataModel;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import ir.mservices.market.version2.model.AppDownloadFlowStatus;
import ir.mservices.market.version2.webapi.responsedto.ApplicationDTO;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import ir.mservices.market.version2.webapi.responsedto.RestrictedAppDTO;
import ir.mservices.market.viewModel.c;
import ir.mservices.market.views.AppIconView;
import ir.mservices.market.views.BigFillOvalButton;
import ir.mservices.market.views.MyketRatingBar;
import ir.mservices.market.views.MyketRecentDownloadView;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.TryAgainView;
import ir.mservices.market.vpnService.cheetah.data.ApplicationCheetahDto;
import ir.myket.callback.domain.models.CallbackUrlType;
import ir.myket.core.utils.GraphicUtils$Dimension;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class AppDetailFragment extends Hilt_AppDetailFragment {
    public static final /* synthetic */ int M1 = 0;
    public MenuItem A1;
    public MenuItem B1;
    public MenuItem C1;
    public FrameLayout D1;
    public ConstraintLayout E1;
    public DetailToolbarView F1;
    public by4 G1;
    public String H1;
    public boolean I1;
    public qp J1;
    public final eq K1;
    public final c24 L1;
    public d56 i1;
    public rf7 j1;
    public dp3 k1;
    public ra3 l1;
    public k50 m1;
    public c5 n1;
    public xf5 o1;
    public fw0 p1;
    public ir.mservices.market.version2.manager.a q1;
    public ps1 r1;
    public co6 s1;
    public final Object t1 = kotlin.a.b(LazyThreadSafetyMode.a, new de(2, this));
    public hp u1;
    public lk2 v1;
    public final o79 w1;
    public MenuItem x1;
    public MenuItem y1;
    public ot4 z1;

    public AppDetailFragment() {
        final AppDetailFragment$special$$inlined$viewModels$default$1 appDetailFragment$special$$inlined$viewModels$default$1 = new AppDetailFragment$special$$inlined$viewModels$default$1(this);
        final c24 c24VarB = kotlin.a.b(LazyThreadSafetyMode.c, new bp2() { // from class: ir.mservices.market.app.detail.ui.AppDetailFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) appDetailFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.w1 = new o79(g27.a(AppDetailViewModel.class), new bp2() { // from class: ir.mservices.market.app.detail.ui.AppDetailFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.app.detail.ui.AppDetailFragment$special$$inlined$viewModels$default$5
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
        }, new bp2() { // from class: ir.mservices.market.app.detail.ui.AppDetailFragment$special$$inlined$viewModels$default$4
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
        this.H1 = "";
        this.K1 = new eq(27);
        this.L1 = kotlin.a.a(new bp(this, 0));
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, defpackage.mm2
    public final void B(Bundle bundle, String str) {
        String string;
        by4 by4Var;
        js3.p(str, "requestKey");
        js3.p(bundle, "result");
        if (str.equalsIgnoreCase(V1()) && (by4Var = this.G1) != null) {
            by4Var.a(bundle);
        }
        if (str.equalsIgnoreCase(W1())) {
            Object objP = dt2.p(bundle, "BUNDLE_KEY_DATA", DialogDataModel.class);
            js3.n(objP, "null cannot be cast to non-null type ir.mservices.market.version2.fragments.dialog.DialogDataModel");
            DialogDataModel dialogDataModel = (DialogDataModel) objP;
            Bundle bundle2 = dialogDataModel.c;
            String str2 = dialogDataModel.b;
            if ("DIALOG_KEY_LOGIN_BOOKMARK".equalsIgnoreCase(str2)) {
                if (dialogDataModel.d == DialogResult.a) {
                    k2();
                    return;
                }
                return;
            }
            if ("DIALOG_KEY_EDIT_RATE".equalsIgnoreCase(str2)) {
                DialogResult dialogResult = dialogDataModel.d;
                if (dialogResult != DialogResult.a) {
                    if (dialogResult == DialogResult.b) {
                        U1();
                        ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                        clickEventBuilder.b("review_edit_cancel");
                        clickEventBuilder.a();
                        return;
                    }
                    return;
                }
                OwnReviewData ownReviewData = (OwnReviewData) dt2.s(bundle2, "BUNDLE_KEY_DATA", OwnReviewData.class);
                if (ownReviewData != null) {
                    g2(ownReviewData);
                }
                U1();
                ClickEventBuilder clickEventBuilder2 = new ClickEventBuilder();
                clickEventBuilder2.b("review_edit_ok");
                clickEventBuilder2.a();
                return;
            }
            if (!"DIALOG_KEY_SHOULD_BE_INSTALLED".equalsIgnoreCase(str2)) {
                if ("DIALOG_KEY_SURVEY".equalsIgnoreCase(str2)) {
                    DialogResult dialogResult2 = dialogDataModel.d;
                    if (dialogResult2 == DialogResult.a) {
                        AppDetailViewModel appDetailViewModelR1 = R1();
                        bt2.G(y97.G(appDetailViewModelR1), null, null, new AppDetailViewModel$startSurveyFlow$1(appDetailViewModelR1, null), 3);
                        return;
                    } else {
                        if (dialogResult2 == DialogResult.b) {
                            AppDetailViewModel appDetailViewModelR12 = R1();
                            bt2.G(y97.G(appDetailViewModelR12), null, null, new AppDetailViewModel$cancelSurveyFlow$1(appDetailViewModelR12, null), 3);
                            return;
                        }
                        return;
                    }
                }
                if (!"DIALOG_KEY_MORE_REVIEW".equalsIgnoreCase(str2)) {
                    if ("DIALOG_KEY_PLAY_DETAIL".equalsIgnoreCase(str2) && dialogDataModel.d == DialogResult.a) {
                        Context contextH = H();
                        hh2.H(new hh2(contextH, contextH != null ? contextH.getString(rs6.suggest_request_failed) : null));
                        return;
                    }
                    return;
                }
                if (dialogDataModel.d != DialogResult.a) {
                    dw1.y("detail_write_more_review_cancel");
                    return;
                }
                ClickEventBuilder clickEventBuilder3 = new ClickEventBuilder();
                clickEventBuilder3.b("detail_write_more_review");
                clickEventBuilder3.a();
                MyReviewType[] myReviewTypeArr = MyReviewType.c;
                pk5.g(this.J0, new NavIntentDirections.MyReview(new yd5(0)), -1);
                return;
            }
            DialogResult dialogResult3 = dialogDataModel.d;
            if (dialogResult3 != DialogResult.a) {
                if (dialogResult3 != DialogResult.b || (string = bundle2.getString("BUNDLE_KEY_EVENT_CANCEL")) == null || f88.n0(string)) {
                    return;
                }
                ClickEventBuilder clickEventBuilder4 = new ClickEventBuilder();
                clickEventBuilder4.b(bundle2.getString("BUNDLE_KEY_EVENT_CANCEL"));
                clickEventBuilder4.a();
                R1().W(0.0f);
                return;
            }
            String string2 = bundle2.getString("BUNDLE_KEY_EVENT_OK");
            if (string2 != null && !f88.n0(string2)) {
                ClickEventBuilder clickEventBuilder5 = new ClickEventBuilder();
                clickEventBuilder5.b(bundle2.getString("BUNDLE_KEY_EVENT_OK"));
                clickEventBuilder5.a();
            }
            N1(0);
            ApplicationFullDto applicationFullDtoR = R1().R();
            if (applicationFullDtoR != null) {
                int iOrdinal = S1().d(applicationFullDtoR.getPackageName(), applicationFullDtoR.getVersion().getCode(), applicationFullDtoR.getVersion().isIncompatible(), applicationFullDtoR.getForceUpdate()).ordinal();
                if (iOrdinal == 1) {
                    j2();
                } else if (iOrdinal == 2) {
                    lw.g(null, "Incorrect dl state. State==UPDATE but should install dialog shown!", null);
                } else {
                    if (iOrdinal != 6) {
                        return;
                    }
                    lw.g(null, "Incorrect dl state. State==INSTALLED but should install dialog shown!", null);
                }
            }
        }
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String C() {
        String strL = L(rs6.page_name_detail);
        js3.o(strL, "getString(...)");
        return strL;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final boolean G1() {
        hp hpVar = this.u1;
        if (hpVar != null) {
            return hpVar.i == null;
        }
        js3.V("navArgs");
        throw null;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final int H0() {
        return Q1() ? sj8.b().p : sj8.b().l;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final boolean H1() {
        return false;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String I0() {
        hp hpVar = this.u1;
        if (hpVar == null) {
            js3.V("navArgs");
            throw null;
        }
        if (f88.n0(hpVar.a)) {
            return null;
        }
        hp hpVar2 = this.u1;
        if (hpVar2 != null) {
            return dw1.n("Detail for packageName: ", hpVar2.a);
        }
        js3.V("navArgs");
        throw null;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final void I1() {
        hp hpVar = this.u1;
        if (hpVar == null) {
            js3.V("navArgs");
            throw null;
        }
        if (hpVar.i != null) {
            R1().i();
        } else {
            super.I1();
        }
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final void K1(View view) {
        super.K1(view);
        view.setVisibility(8);
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final void L1(ja4 ja4Var) {
        js3.p(ja4Var, "state");
        if (ja4Var instanceof ha4) {
            if (R1().R() == null) {
                TryAgainView tryAgainViewC1 = C1();
                if (tryAgainViewC1 != null) {
                    tryAgainViewC1.t();
                    tryAgainViewC1.setColors(sj8.b().l);
                }
                hp hpVar = this.u1;
                if (hpVar != null) {
                    e2(hpVar.i != null);
                    return;
                } else {
                    js3.V("navArgs");
                    throw null;
                }
            }
            return;
        }
        if (!(ja4Var instanceof ga4)) {
            if (!(ja4Var instanceof ia4)) {
                throw new NoWhenBranchMatchedException();
            }
            TryAgainView tryAgainViewC12 = C1();
            if (tryAgainViewC12 != null) {
                tryAgainViewC12.v();
            }
            FragmentActivity fragmentActivityF = F();
            BaseNavigationContentActivity baseNavigationContentActivity = fragmentActivityF instanceof BaseNavigationContentActivity ? (BaseNavigationContentActivity) fragmentActivityF : null;
            if (baseNavigationContentActivity != null) {
                ir.mservices.market.core.ext.a.i(baseNavigationContentActivity);
                baseNavigationContentActivity.h0();
            }
            bt5 bt5VarF = F();
            rn8 rn8Var = bt5VarF instanceof rn8 ? (rn8) bt5VarF : null;
            if (rn8Var != null) {
                ((BaseContentActivity) rn8Var).a0(H0());
            }
            DetailToolbarView detailToolbarView = this.F1;
            if (detailToolbarView != null) {
                detailToolbarView.setBackgroundColor(H0());
            }
            ir.mservices.market.version2.ui.recycler.adapter.a aVar = this.Z0;
            if ((aVar != null ? ((ArrayList) aVar.D().d).size() : 0) > 1) {
                ir.mservices.market.version2.core.utils.a.c(this, 750L, new AppDetailFragment$showLoadState$3(this, null));
                return;
            }
            return;
        }
        ErrorDTO errorDTO = ((MyketPagingError) ((ga4) ja4Var).b).a;
        if (errorDTO.getHttpStatus() == 404) {
            if (errorDTO.getCode() == 200) {
                h2(0, errorDTO.getTranslatedMessage());
            } else {
                String extra = errorDTO.getExtra();
                if (extra == null || f88.n0(extra)) {
                    h2(8, errorDTO.getTranslatedMessage());
                } else {
                    try {
                        RestrictedAppDTO restrictedAppDTO = (RestrictedAppDTO) new vv2().c(errorDTO.getExtra(), RestrictedAppDTO.class);
                        FrameLayout frameLayout = this.D1;
                        if (frameLayout != null) {
                            frameLayout.setVisibility(8);
                        }
                        ConstraintLayout constraintLayout = this.E1;
                        if (constraintLayout != null) {
                            constraintLayout.setVisibility(0);
                            TextView textView = (TextView) constraintLayout.findViewById(rr6.textTitle);
                            if (textView != null) {
                                textView.setText(restrictedAppDTO != null ? restrictedAppDTO.getTitle() : null);
                                textView.setTextColor(sj8.b().m);
                            }
                            TextView textView2 = (TextView) constraintLayout.findViewById(rr6.description);
                            if (textView2 != null) {
                                textView2.setText(restrictedAppDTO != null ? restrictedAppDTO.getText() : null);
                                textView2.setTextColor(sj8.b().m);
                            }
                            AppIconView appIconView = (AppIconView) constraintLayout.findViewById(rr6.imagecell);
                            if (appIconView != null) {
                                AppIconView.setImageUrl$default(appIconView, restrictedAppDTO != null ? restrictedAppDTO.getIconPath() : null, null, false, 6, null);
                            }
                            LottieAnimationView lottieAnimationView = (LottieAnimationView) constraintLayout.findViewById(rr6.image);
                            if (lottieAnimationView != null) {
                                ir.mservices.market.core.ext.a.e(lottieAnimationView, qs6.no_access);
                            }
                        }
                    } catch (Exception unused) {
                        h2(8, errorDTO.getTranslatedMessage());
                    }
                }
            }
            bt5 bt5VarF2 = F();
            rn8 rn8Var2 = bt5VarF2 instanceof rn8 ? (rn8) bt5VarF2 : null;
            if (rn8Var2 != null) {
                ((BaseContentActivity) rn8Var2).a0(H0());
            }
            TryAgainView tryAgainViewC13 = C1();
            if (tryAgainViewC13 != null) {
                tryAgainViewC13.v();
            }
        } else {
            TryAgainView tryAgainViewC14 = C1();
            if (tryAgainViewC14 != null) {
                tryAgainViewC14.u(errorDTO.getTranslatedMessage());
            }
        }
        MenuItem menuItem = this.A1;
        if (menuItem != null) {
            rq4.O(menuItem, false, this.z1, this.y1);
        }
        MenuItem menuItem2 = this.B1;
        if (menuItem2 != null) {
            rq4.O(menuItem2, false, this.z1, this.y1);
        }
        MenuItem menuItem3 = this.C1;
        if (menuItem3 != null) {
            menuItem3.setVisible(false);
        }
        hp hpVar2 = this.u1;
        if (hpVar2 != null) {
            e2(hpVar2.i != null);
        } else {
            js3.V("navArgs");
            throw null;
        }
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final boolean M1() {
        return this.I1;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final int P0() {
        return Q1() ? sj8.b().p : sj8.b().F;
    }

    public final boolean Q1() {
        if (!yq2.n0(H())) {
            ir.mservices.market.version2.ui.recycler.adapter.a aVar = this.Z0;
            if ((aVar != null ? ((ArrayList) aVar.D().d).size() : 0) < 1) {
                hp hpVar = this.u1;
                if (hpVar == null) {
                    js3.V("navArgs");
                    throw null;
                }
                if (hpVar.i != null) {
                }
            }
            return true;
        }
        return false;
    }

    public final AppDetailViewModel R1() {
        return (AppDetailViewModel) this.w1.getValue();
    }

    public final ir.mservices.market.version2.manager.a S1() {
        ir.mservices.market.version2.manager.a aVar = this.q1;
        if (aVar != null) {
            return aVar;
        }
        js3.V("appManager");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [c24, java.lang.Object] */
    @Override // ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void T(Bundle bundle) {
        super.T(bundle);
        RecyclerView recyclerViewY1 = y1();
        vy7 vy7Var = new vy7();
        vy7Var.h = new ArrayList();
        vy7Var.i = new ArrayList();
        vy7Var.j = new ArrayList();
        vy7Var.k = new ArrayList();
        vy7Var.l = new ArrayList();
        vy7Var.m = new ArrayList();
        vy7Var.n = new ArrayList();
        vy7Var.o = new ArrayList();
        vy7Var.p = new ArrayList();
        vy7Var.q = new ArrayList();
        vy7Var.r = new ArrayList();
        vy7Var.s = new DecelerateInterpolator();
        vy7Var.t = 5;
        vy7Var.g = false;
        vy7Var.c = 250L;
        vy7Var.f = 0L;
        vy7Var.d = 250L;
        recyclerViewY1.setItemAnimator(vy7Var);
        bt5 bt5VarF = F();
        rn8 rn8Var = bt5VarF instanceof rn8 ? (rn8) bt5VarF : null;
        if (rn8Var != null) {
            rn8Var.z(this.F1);
            DetailToolbarView detailToolbarView = this.F1;
            if (detailToolbarView != null) {
                detailToolbarView.setOnBackClickListener(new dp(this, 0));
            }
            ((BaseContentActivity) rn8Var).a0(H0());
        }
        String str = R1().R0;
        if (str != null) {
            if (f88.n0(str)) {
                str = null;
            }
            if (str != null) {
                ((ir.myket.callback.manager.a) this.t1.getValue()).b(new ql0(str, CallbackUrlType.k, 0));
                R1().R0 = null;
            }
        }
        hp hpVar = this.u1;
        if (hpVar == null) {
            js3.V("navArgs");
            throw null;
        }
        String str2 = hpVar.c.a;
        if (str2 != null && !f88.n0(str2)) {
            LaunchAppDetailsEventBuilder launchAppDetailsEventBuilder = new LaunchAppDetailsEventBuilder("app_detail_page");
            hp hpVar2 = this.u1;
            if (hpVar2 == null) {
                js3.V("navArgs");
                throw null;
            }
            Tracker tracker = hpVar2.c;
            String str3 = tracker.a;
            String str4 = tracker.c;
            Bundle bundle2 = launchAppDetailsEventBuilder.c;
            bundle2.putString("label", str3);
            if (!TextUtils.isEmpty(str4)) {
                bundle2.putString("type", str4);
            }
            launchAppDetailsEventBuilder.a();
        }
        if (F() != null) {
            hp hpVar3 = this.u1;
            if (hpVar3 == null) {
                js3.V("navArgs");
                throw null;
            }
            by4 by4Var = new by4(hpVar3.a, F(), V1(), this.K1);
            ir.mservices.market.version2.ui.recycler.adapter.a aVar = this.Z0;
            js3.n(aVar, "null cannot be cast to non-null type ir.mservices.market.app.detail.ui.AppDetailAdapter");
            ((zo) aVar).T = by4Var;
            this.G1 = by4Var;
        }
    }

    public final k50 T1() {
        k50 k50Var = this.m1;
        if (k50Var != null) {
            return k50Var;
        }
        js3.V("barnamehAnalytics");
        throw null;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean U0() {
        return false;
    }

    public final fw0 U1() {
        fw0 fw0Var = this.p1;
        if (fw0Var != null) {
            return fw0Var;
        }
        js3.V("commentAnalytics");
        throw null;
    }

    public final String V1() {
        return t61.i(W1(), "_DIALOG_KEY_MORE_MENU");
    }

    @Override // ir.mservices.market.app.detail.ui.Hilt_AppDetailFragment, ir.mservices.market.common.base.BaseContentFragment, ir.mservices.market.version2.fragments.base.BaseNavigationFragment, defpackage.cz2, androidx.fragment.app.d
    public final void W(Context context) {
        js3.p(context, "context");
        Bundle bundle = this.g;
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.u1 = m91.m(bundle);
        super.W(context);
    }

    public final String W1() {
        return dw1.n("AppDetailFragment_", this.H0);
    }

    public final ra3 X1() {
        ra3 ra3Var = this.l1;
        if (ra3Var != null) {
            return ra3Var;
        }
        js3.V("homeAnalytics");
        throw null;
    }

    public final dp3 Y1() {
        dp3 dp3Var = this.k1;
        if (dp3Var != null) {
            return dp3Var;
        }
        js3.V("installManager");
        throw null;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, androidx.fragment.app.d
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        js3.p(layoutInflater, "inflater");
        if (((Boolean) this.L1.getValue()).booleanValue() && s1().c() == 2) {
            int i = qp.v;
            DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
            this.J1 = (qp) fa1.c(layoutInflater, js6.app_detail_suggestion_place, viewGroup, false);
        }
        FragmentActivity fragmentActivityF = F();
        if (fragmentActivityF != null) {
            DetailToolbarView detailToolbarView = new DetailToolbarView(fragmentActivityF);
            detailToolbarView.setBackgroundColor(H0());
            detailToolbarView.setVisibility(8);
            detailToolbarView.setAlpha(0.0f);
            this.F1 = detailToolbarView;
        }
        View viewZ = super.Z(layoutInflater, viewGroup, bundle);
        View viewInflate = layoutInflater.inflate(js6.app_not_found, viewGroup, false);
        js3.n(viewZ, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        ConstraintLayout constraintLayout = (ConstraintLayout) viewZ;
        js3.m(viewInflate);
        viewInflate.setVisibility(8);
        this.D1 = (FrameLayout) viewInflate;
        constraintLayout.addView(viewInflate);
        View viewInflate2 = layoutInflater.inflate(js6.restricted_app_detail, viewGroup, false);
        js3.m(viewInflate2);
        viewInflate2.setVisibility(8);
        this.E1 = (ConstraintLayout) viewInflate2;
        constraintLayout.addView(viewInflate2);
        qp qpVar = this.J1;
        if (qpVar != null) {
            constraintLayout.addView(qpVar.l);
        }
        return viewZ;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean Z0() {
        return true;
    }

    public final boolean Z1(String str) {
        return Y1().G(str) && !NearbyRepository.SERVICE_ID.equalsIgnoreCase(str);
    }

    public final void a2(ApplicationDTO applicationDTO, ImageView imageView, Tracker tracker) {
        js3.p(applicationDTO, "app");
        String iconPath = applicationDTO.getIconPath();
        js3.o(iconPath, "getIconPath(...)");
        String title = applicationDTO.getTitle();
        js3.o(title, "getTitle(...)");
        String packageName = applicationDTO.getPackageName();
        js3.o(packageName, "getPackageName(...)");
        StartApplicationData startApplicationData = new StartApplicationData(new AppBarSampleData(iconPath, title, packageName, null, applicationDTO.getTagline(), null, null, null, 232, null), applicationDTO.getInstallCallbackUrl(), applicationDTO.getClickCallback());
        String packageName2 = applicationDTO.getPackageName();
        js3.o(packageName2, "getPackageName(...)");
        boolean z = s1().b(imageView.getDrawable()) != null;
        String refId = applicationDTO.getRefId();
        js3.o(refId, "getRefId(...)");
        pk5.f(this.J0, new NavIntentDirections.AppDetail(new hp(packageName2, false, tracker, z, null, refId, applicationDTO.getCallbackUrl(), null, startApplicationData, null, null, null, null)));
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, ir.mservices.market.common.base.BaseContentFragment, ir.mservices.market.version2.fragments.base.BaseFragment, androidx.fragment.app.d
    public final void b0() throws Exception {
        this.J0.x(W1());
        this.J0.x(V1());
        this.D1 = null;
        this.E1 = null;
        this.J1 = null;
        this.G1 = null;
        super.b0();
        lk2 lk2Var = this.v1;
        if (lk2Var != null) {
            lk2Var.b();
        }
        this.v1 = null;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean b1() {
        return false;
    }

    public final void b2(String str, List list) {
        int[] iArrO0;
        ApplicationFullDto applicationFullDtoR = R1().R();
        if (applicationFullDtoR != null) {
            String str2 = this.H0;
            js3.o(str2, "getSubscriberId(...)");
            AppRateDto rate = applicationFullDtoR.getRate();
            float total = rate != null ? rate.getTotal() : 0.0f;
            R1();
            int[] iArrQ = AppDetailViewModel.Q(list);
            R1();
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (((RateDto) obj).getValue() - 1 >= 0) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(wu0.V(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Integer.valueOf(((RateDto) it.next()).getRateOnlyCount()));
                }
                iArrO0 = kotlin.collections.a.O0(arrayList2);
            } else {
                iArrO0 = new int[5];
            }
            pk5.g(this.J0, new NavIntentDirections.Reviews(new yr(str, str2, total, iArrQ, iArrO0, (ReviewDto) R1().B0.a.getValue(), new ToolbarData(applicationFullDtoR, R1().T(), R1().U(), R1().S()))), -1);
        }
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean c1() {
        return false;
    }

    public final void c2(String str, String str2) {
        FragmentActivity fragmentActivityF = F();
        Uri uri = Uri.parse(str);
        js3.o(uri, "parse(...)");
        js8.q(fragmentActivityF, uri, null, null);
        ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
        clickEventBuilder.b(str2);
        clickEventBuilder.a();
    }

    public final void d2(SummaryDialogDto summaryDialogDto) {
        pk5.g(this.J0, new NavIntentDirections.AlertButtonComponent(new dd(new DialogDataModel(W1(), "DIALOG_KEY_NO_RESULT", null, 12), summaryDialogDto.getTitle(), -1, summaryDialogDto.getIcon(), summaryDialogDto.getDescription(), null, K().getString(rs6.button_ok), sj8.b().c, sj8.b().d, sj8.b(), 0)), -1);
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final yq2 e1() {
        dw1.y("detail_back");
        return t40.g;
    }

    public final void e2(boolean z) {
        m1().setBackgroundColor((yq2.n0(H()) || !z) ? sj8.b().l : sj8.b().p);
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void f0() {
        AppDetailViewModel appDetailViewModelR1 = R1();
        bt2.G(y97.G(appDetailViewModelR1), null, null, new AppDetailViewModel$stopPlayingVideoShot$1(appDetailViewModelR1, null), 3);
        super.f0();
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final void f1(Menu menu, MenuInflater menuInflater) {
        Drawable icon;
        js3.p(menu, "menu");
        js3.p(menuInflater, "menuInflater");
        menuInflater.inflate(ms6.detail, menu);
        MenuItem menuItemFindItem = menu.findItem(rr6.action_more);
        this.y1 = menuItemFindItem;
        if (menuItemFindItem != null && (icon = menuItemFindItem.getIcon()) != null) {
            icon.setColorFilter(new PorterDuffColorFilter(sj8.b().n, PorterDuff.Mode.MULTIPLY));
        }
        ot4 ot4VarS0 = S0(ms6.detail_more, this.y1);
        this.z1 = ot4VarS0;
        if (ot4VarS0 != null) {
            this.A1 = ot4VarS0.findItem(rr6.action_bookmark);
            this.B1 = ot4VarS0.findItem(rr6.action_share);
            MenuItem menuItemFindItem2 = ot4VarS0.findItem(rr6.action_uninstall);
            if (menuItemFindItem2 != null) {
                hp hpVar = this.u1;
                if (hpVar == null) {
                    js3.V("navArgs");
                    throw null;
                }
                rq4.O(menuItemFindItem2, Z1(hpVar.a), this.z1, this.y1);
            } else {
                menuItemFindItem2 = null;
            }
            this.C1 = menuItemFindItem2;
        }
        MenuItem menuItemFindItem3 = menu.findItem(rr6.action_search);
        Drawable icon2 = menuItemFindItem3.getIcon();
        if (icon2 != null) {
            icon2.setColorFilter(new PorterDuffColorFilter(sj8.b().n, PorterDuff.Mode.MULTIPLY));
        }
        this.x1 = menuItemFindItem3;
        View actionView = menu.findItem(rr6.action_recent_download).getActionView();
        MyketRecentDownloadView myketRecentDownloadView = actionView != null ? (MyketRecentDownloadView) actionView.findViewById(rr6.recent_download_view) : null;
        if (myketRecentDownloadView != null) {
            ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new AppDetailFragment$onCreateMenu$3$1(myketRecentDownloadView, myketRecentDownloadView, null));
            myketRecentDownloadView.setOnClickListener(new dp(this, 1));
        }
        xf5 xf5Var = this.o1;
        if (xf5Var == null) {
            js3.V("myketUIUtils");
            throw null;
        }
        xf5.j(xf5Var, this, this.x1);
        ApplicationFullDto applicationFullDtoR = R1().R();
        l2(applicationFullDtoR != null ? applicationFullDtoR.isBookmarked() : false);
        super.f1(menu, menuInflater);
    }

    public final void f2(String str, ReviewDto reviewDto) {
        ApplicationFullDto applicationFullDtoR = R1().R();
        if (applicationFullDtoR != null) {
            pk5.g(this.J0, new NavIntentDirections.AllSubReviews(new ht(str, reviewDto, new ToolbarData(applicationFullDtoR, R1().T(), R1().U(), R1().S()), "detail_detail_review", this.H0, reviewDto.getId())), -1);
        }
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean g1(MenuItem menuItem) {
        js3.p(menuItem, "menuItem");
        int itemId = menuItem.getItemId();
        if (itemId == rr6.action_bookmark) {
            ActionBarEventBuilder actionBarEventBuilder = new ActionBarEventBuilder();
            actionBarEventBuilder.b("action_bar_app_detail_bookmark");
            actionBarEventBuilder.a();
            MenuItem menuItem2 = this.A1;
            if (menuItem2 != null) {
                menuItem2.setEnabled(false);
            }
            k2();
            return true;
        }
        if (itemId == rr6.action_share) {
            ActionBarEventBuilder actionBarEventBuilder2 = new ActionBarEventBuilder();
            actionBarEventBuilder2.b("action_bar_app_detail_share");
            actionBarEventBuilder2.a();
            i1(new hi6(rr6.action_share, "SHARE_REQUEST_TAG"));
            AppDetailViewModel appDetailViewModelR1 = R1();
            bt2.G(y97.G(appDetailViewModelR1), null, null, new AppDetailViewModel$shareApp$1(appDetailViewModelR1, null), 3);
            return true;
        }
        if (itemId == rr6.action_search) {
            ActionBarEventBuilder actionBarEventBuilder3 = new ActionBarEventBuilder();
            actionBarEventBuilder3.b("action_bar_app_detail_search");
            actionBarEventBuilder3.a();
            pk5.g(this.J0, new NavIntentDirections.Search(new yh7("", "Detail")), -1);
            return false;
        }
        if (itemId != rr6.action_uninstall) {
            return false;
        }
        ActionBarEventBuilder actionBarEventBuilder4 = new ActionBarEventBuilder();
        actionBarEventBuilder4.b("action_bar_app_detail_uninstall");
        actionBarEventBuilder4.a();
        hp hpVar = this.u1;
        if (hpVar == null) {
            js3.V("navArgs");
            throw null;
        }
        String str = hpVar.a;
        ApplicationInfo applicationInfoL = Y1().l(dp3.y(str));
        if (applicationInfoL == null || (applicationInfoL.flags & 129) != 1) {
            Y1().Q(str);
            ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
            clickEventBuilder.b("detail_button_uninstall_enable");
            clickEventBuilder.a();
            return false;
        }
        Context contextH = H();
        hh2.H(new hh2(contextH, contextH != null ? contextH.getString(rs6.app_not_uninstallable) : null));
        ClickEventBuilder clickEventBuilder2 = new ClickEventBuilder();
        clickEventBuilder2.b("detail_button_uninstall_disable");
        clickEventBuilder2.a();
        return false;
    }

    public final void g2(OwnReviewData ownReviewData) {
        ApplicationFullDto applicationFullDtoR = R1().R();
        if (applicationFullDtoR != null) {
            String packageName = applicationFullDtoR.getPackageName();
            ReviewDto reviewDto = (ReviewDto) ownReviewData.b.getValue();
            float rate = reviewDto != null ? reviewDto.getRate() : 0.0f;
            ReviewDto reviewDto2 = (ReviewDto) ownReviewData.b.getValue();
            CommentScenario.SubmitReview submitReview = new CommentScenario.SubmitReview(new SubmitReviewData(packageName, rate, reviewDto2 != null ? reviewDto2.getComment() : null, false, false, new ToolbarData(applicationFullDtoR, R1().T(), R1().U(), R1().S()), "_detail", "DETAIL"));
            FragmentActivity fragmentActivityF = F();
            if (fragmentActivityF != null) {
                pk5.c(fragmentActivityF, submitReview);
            }
        }
    }

    public final void h2(int i, String str) {
        ConstraintLayout constraintLayout = this.E1;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
        }
        FrameLayout frameLayout = this.D1;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
            MyketTextView myketTextView = (MyketTextView) frameLayout.findViewById(rr6.title);
            myketTextView.setText(str);
            myketTextView.setTextColor(sj8.b().m);
            BigFillOvalButton bigFillOvalButton = (BigFillOvalButton) frameLayout.findViewById(rr6.action_button);
            if (bigFillOvalButton != null) {
                bigFillOvalButton.setVisibility(i);
                bigFillOvalButton.setOnClickListener(new dp(this, 2));
            }
            MyketTextView myketTextView2 = (MyketTextView) frameLayout.findViewById(rr6.description);
            if (myketTextView2 != null) {
                myketTextView2.setVisibility(i);
                myketTextView2.setTextColor(sj8.b().n);
            }
            LottieAnimationView lottieAnimationView = (LottieAnimationView) frameLayout.findViewById(rr6.image);
            if (lottieAnimationView != null) {
                ir.mservices.market.core.ext.a.e(lottieAnimationView, qs6.no_result);
            }
        }
    }

    public final void i2(String str, ReviewDto reviewDto, boolean z) {
        CommentScenario.LikeOrDislikeReview likeOrDislikeReview = new CommentScenario.LikeOrDislikeReview(new LikeOrDislikeData(str, reviewDto.getId(), reviewDto.getParentId(), z));
        FragmentActivity fragmentActivityF = F();
        if (fragmentActivityF != null) {
            pk5.c(fragmentActivityF, likeOrDislikeReview);
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [cp] */
    /* JADX WARN: Type inference failed for: r0v11, types: [cp] */
    /* JADX WARN: Type inference failed for: r0v13, types: [cp] */
    /* JADX WARN: Type inference failed for: r0v14, types: [cp] */
    /* JADX WARN: Type inference failed for: r0v15, types: [cp] */
    /* JADX WARN: Type inference failed for: r0v16, types: [cp] */
    /* JADX WARN: Type inference failed for: r0v17, types: [cp] */
    /* JADX WARN: Type inference failed for: r0v18, types: [cp] */
    /* JADX WARN: Type inference failed for: r0v47, types: [cp] */
    /* JADX WARN: Type inference failed for: r0v48, types: [cp] */
    /* JADX WARN: Type inference failed for: r0v49, types: [cp] */
    /* JADX WARN: Type inference failed for: r0v5, types: [cp] */
    /* JADX WARN: Type inference failed for: r0v50, types: [cp] */
    /* JADX WARN: Type inference failed for: r0v9, types: [cp] */
    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final ir.mservices.market.version2.ui.recycler.adapter.a j1() {
        K().getValue(pq6.app_info_height_factor, new TypedValue(), true);
        GraphicUtils$Dimension graphicUtils$DimensionG = p3.g(F());
        int iV1 = v1();
        boolean zF = this.F0.f();
        hp hpVar = this.u1;
        if (hpVar == null) {
            js3.V("navArgs");
            throw null;
        }
        zo zoVar = new zo(graphicUtils$DimensionG, iV1, zF, hpVar.i != null);
        final int i = 9;
        zoVar.r = new og5(this) { // from class: cp
            public final /* synthetic */ AppDetailFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                String highResUrl;
                AppRateDto rate;
                List<RateDto> rates;
                int i2 = i;
                AppDetailFragment appDetailFragment = this.b;
                switch (i2) {
                    case 0:
                        AppRatingModuleData appRatingModuleData = (AppRatingModuleData) obj;
                        int i3 = AppDetailFragment.M1;
                        js3.p(view, "view");
                        js3.p((d) qg5Var, "<unused var>");
                        js3.p(appRatingModuleData, "recyclerData");
                        appDetailFragment.U1();
                        boolean z = view instanceof MyketRatingBar;
                        dw1.y(z ? "review_stars_detail" : "review_write_detail");
                        ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                        clickEventBuilder.b("review_new_detail");
                        clickEventBuilder.a();
                        fw0 fw0VarU1 = appDetailFragment.U1();
                        ApplicationFullDto applicationFullDtoR = appDetailFragment.R1().R();
                        fw0VarU1.d(applicationFullDtoR.getPackageName(), applicationFullDtoR.getVersion().getCode(), applicationFullDtoR.getVersion().isIncompatible(), applicationFullDtoR.getForceUpdate());
                        AppDetailViewModel appDetailViewModelR1 = appDetailFragment.R1();
                        MyketRatingBar myketRatingBar = z ? (MyketRatingBar) view : null;
                        appDetailViewModelR1.W(myketRatingBar != null ? myketRatingBar.getRating() : 0.0f);
                        Bundle bundle = new Bundle();
                        hp hpVar2 = appDetailFragment.u1;
                        if (hpVar2 == null) {
                            js3.V("navArgs");
                            throw null;
                        }
                        bundle.putString("packageName", hpVar2.a);
                        bundle.putString("BUNDLE_KEY_EVENT_OK", "detail_dd_new_review_ok");
                        bundle.putString("BUNDLE_KEY_EVENT_CANCEL", "detail_dd_new_review_cancel");
                        AppDetailViewModel appDetailViewModelR12 = appDetailFragment.R1();
                        if (!appDetailViewModelR12.B.G(appDetailViewModelR12.J0.a)) {
                            pk5.g(appDetailFragment.J0, new NavIntentDirections.AlertBottom(new bd(new DialogDataModel(appDetailFragment.W1(), "DIALOG_KEY_SHOULD_BE_INSTALLED", bundle, 8), null, appDetailFragment.L(rs6.app_must_installed), appDetailFragment.L(rs6.download_app), appDetailFragment.L(rs6.button_cancel), true)), -1);
                            return;
                        }
                        ApplicationFullDto applicationFullDtoR2 = appDetailFragment.R1().R();
                        if (applicationFullDtoR2 != null) {
                            CommentScenario.SubmitReview submitReview = new CommentScenario.SubmitReview(new SubmitReviewData(applicationFullDtoR2.getPackageName(), ((Number) appRatingModuleData.b.getValue()).floatValue(), null, false, true, new ToolbarData(applicationFullDtoR2, appDetailFragment.R1().T(), appDetailFragment.R1().U(), appDetailFragment.R1().S()), "_detail", "DETAIL", 4, null));
                            FragmentActivity fragmentActivityF = appDetailFragment.F();
                            if (fragmentActivityF != null) {
                                pk5.c(fragmentActivityF, submitReview);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        AIReviewSummaryData aIReviewSummaryData = (AIReviewSummaryData) obj;
                        int i4 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(aIReviewSummaryData, "recyclerData");
                        appDetailFragment.R1().r(new AppDetailAction.ReviewAILikeAction(true, aIReviewSummaryData.a.getId()));
                        return;
                    case 2:
                        AIReviewSummaryData aIReviewSummaryData2 = (AIReviewSummaryData) obj;
                        int i5 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(aIReviewSummaryData2, "recyclerData");
                        appDetailFragment.R1().r(new AppDetailAction.ReviewAILikeAction(false, aIReviewSummaryData2.a.getId()));
                        return;
                    case 3:
                        int i6 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p((AIReviewSummaryData) obj, "<unused var>");
                        appDetailFragment.R1().r(AppDetailAction.ShowMoreAIAction.INSTANCE);
                        dw1.y("detail__ai_review_more_description");
                        return;
                    case 4:
                        AppDownloadData appDownloadData = (AppDownloadData) obj;
                        int i7 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(appDownloadData, "recyclerData");
                        sb7.p("AppDetail", "App Install Click", "Packagename: " + appDownloadData.g);
                        ApplicationFullDto applicationFullDtoR3 = appDetailFragment.R1().R();
                        if (applicationFullDtoR3 != null) {
                            appDetailFragment.Y1().C(new DownloadDataModel(applicationFullDtoR3, "detail", appDetailFragment.R1().T(), appDetailFragment.R1().S(), appDetailFragment.R1().U()));
                        }
                        dw1.y("button_install");
                        return;
                    case 5:
                        AppDownloadData appDownloadData2 = (AppDownloadData) obj;
                        int i8 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(appDownloadData2, "recyclerData");
                        sb7.p("AppDetail", "App Update Click", "Packagename: " + appDownloadData2.g);
                        ApplicationFullDto applicationFullDtoR4 = appDetailFragment.R1().R();
                        if (applicationFullDtoR4 != null) {
                            ps1 ps1Var = appDetailFragment.r1;
                            if (ps1Var == null) {
                                js3.V("downloadManager");
                                throw null;
                            }
                            AppDownloadInfo appDownloadInfoI = ps1Var.i(applicationFullDtoR4.getPackageName(), null);
                            if (wq2.l(applicationFullDtoR4.getSize().getLength(), appDownloadInfoI != null ? appDownloadInfoI.getLocalSize() : 0L)) {
                                appDetailFragment.j2();
                            } else {
                                appDetailFragment.S1();
                                ir.mservices.market.version2.manager.a.e(applicationFullDtoR4.getTitle(), applicationFullDtoR4.getIcon().getUrl());
                            }
                        }
                        dw1.y("detail_button_update");
                        return;
                    case 6:
                        AppDownloadData appDownloadData3 = (AppDownloadData) obj;
                        int i9 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(appDownloadData3, "recyclerData");
                        sb7.p("AppDetail", "App Run Click", "Packagename: " + appDownloadData3);
                        ClickEventBuilder clickEventBuilder2 = new ClickEventBuilder();
                        clickEventBuilder2.b("detail_button_run");
                        clickEventBuilder2.a();
                        ApplicationFullDto applicationFullDtoR5 = appDetailFragment.R1().R();
                        if (applicationFullDtoR5 != null) {
                            String strR = appDetailFragment.Y1().r(applicationFullDtoR5.getVersion().getCode(), applicationFullDtoR5.getPackageName());
                            if (strR != null && !f88.n0(strR)) {
                                Context contextH = appDetailFragment.H();
                                String packageName = applicationFullDtoR5.getPackageName();
                                Uri uri = Uri.parse(strR);
                                js3.o(uri, "parse(...)");
                                if (!js8.q(contextH, uri, packageName, null)) {
                                    dp3.M(applicationFullDtoR5.getPackageName());
                                }
                                appDetailFragment.Y1().e(applicationFullDtoR5.getVersion().getCode(), applicationFullDtoR5.getPackageName());
                                return;
                            }
                            if (!appDetailFragment.Y1().K(applicationFullDtoR5.getPackageName())) {
                                Context contextH2 = appDetailFragment.H();
                                hh2.H(new hh2(contextH2, contextH2 != null ? contextH2.getString(rs6.app_not_runnable) : null));
                                return;
                            }
                            ApplicationCheetahDto cheetah = applicationFullDtoR5.getCheetah();
                            if (cheetah == null || !cheetah.getEnable()) {
                                dp3.M(applicationFullDtoR5.getPackageName());
                                return;
                            } else {
                                pk5.g(appDetailFragment.J0, new NavIntentDirections.Cheetah(new eq0(applicationFullDtoR5.getPackageName(), applicationFullDtoR5.getIcon().getUrl(), false)), -1);
                                return;
                            }
                        }
                        return;
                    case 7:
                        AppSummaryTextData appSummaryTextData = (AppSummaryTextData) obj;
                        int i10 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((nt) qg5Var, "<unused var>");
                        js3.p(appSummaryTextData, "recyclerData");
                        ClickEventBuilder clickEventBuilder3 = new ClickEventBuilder();
                        SummaryTextDto summaryTextDto = appSummaryTextData.a;
                        clickEventBuilder3.b("app_detail_summary_" + summaryTextDto.getAnalyticId());
                        clickEventBuilder3.a();
                        if (summaryTextDto.getSummaryDialog() != null) {
                            appDetailFragment.d2(summaryTextDto.getSummaryDialog());
                            return;
                        }
                        String action = summaryTextDto.getAction();
                        if (action == null || f88.n0(action)) {
                            return;
                        }
                        Context contextH3 = appDetailFragment.H();
                        String action2 = summaryTextDto.getAction();
                        if (action2 != null) {
                            t61.v(action2, "parse(...)", contextH3, NearbyRepository.SERVICE_ID, null);
                            return;
                        }
                        return;
                    case 8:
                        AppSummaryIconData appSummaryIconData = (AppSummaryIconData) obj;
                        int i11 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((lt) qg5Var, "<unused var>");
                        js3.p(appSummaryIconData, "recyclerData");
                        ClickEventBuilder clickEventBuilder4 = new ClickEventBuilder();
                        SummaryIconDto summaryIconDto = appSummaryIconData.a;
                        clickEventBuilder4.b("app_detail_summary_" + summaryIconDto.getAnalyticId());
                        clickEventBuilder4.a();
                        if (summaryIconDto.getSummaryDialog() != null) {
                            appDetailFragment.d2(summaryIconDto.getSummaryDialog());
                            return;
                        }
                        String action3 = summaryIconDto.getAction();
                        if (action3 == null || f88.n0(action3)) {
                            return;
                        }
                        Context contextH4 = appDetailFragment.H();
                        String action4 = summaryIconDto.getAction();
                        if (action4 != null) {
                            t61.v(action4, "parse(...)", contextH4, NearbyRepository.SERVICE_ID, null);
                            return;
                        }
                        return;
                    case 9:
                        AppBarData appBarData = (AppBarData) obj;
                        int i12 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.app.detail.ui.recycler.a) qg5Var, "<unused var>");
                        js3.p(appBarData, "recyclerData");
                        ClickEventBuilder clickEventBuilder5 = new ClickEventBuilder();
                        clickEventBuilder5.b("detail_icon");
                        clickEventBuilder5.a();
                        AppBarSampleData appBarSampleData = (AppBarSampleData) appBarData.g.getValue();
                        if (appBarSampleData == null || (highResUrl = appBarSampleData.getHighResUrl()) == null) {
                            return;
                        }
                        FragmentActivity fragmentActivityF2 = appDetailFragment.F();
                        zt5 zt5Var = fragmentActivityF2 instanceof zt5 ? (zt5) fragmentActivityF2 : null;
                        if (zt5Var != null) {
                            ((LaunchContentActivity) zt5Var).s0(appDetailFragment.K().getDimensionPixelSize(pq6.margin_default_v2_triple), highResUrl);
                            return;
                        }
                        return;
                    case 10:
                        AppSummaryRateData appSummaryRateData = (AppSummaryRateData) obj;
                        int i13 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((mt) qg5Var, "<unused var>");
                        js3.p(appSummaryRateData, "recyclerData");
                        ClickEventBuilder clickEventBuilder6 = new ClickEventBuilder();
                        clickEventBuilder6.b("app_detail_summary_" + appSummaryRateData.a.getAnalyticId());
                        clickEventBuilder6.a();
                        ClickEventBuilder clickEventBuilder7 = new ClickEventBuilder();
                        clickEventBuilder7.b("detail_all_review_info");
                        clickEventBuilder7.a();
                        ApplicationFullDto applicationFullDtoR6 = appDetailFragment.R1().R();
                        if (applicationFullDtoR6 == null || (rate = applicationFullDtoR6.getRate()) == null || (rates = rate.getRates()) == null) {
                            return;
                        }
                        hp hpVar3 = appDetailFragment.u1;
                        if (hpVar3 != null) {
                            appDetailFragment.b2(hpVar3.a, rates);
                            return;
                        } else {
                            js3.V("navArgs");
                            throw null;
                        }
                    case 11:
                        AppSummarySizeData appSummarySizeData = (AppSummarySizeData) obj;
                        int i14 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((f) qg5Var, "<unused var>");
                        js3.p(appSummarySizeData, "recyclerData");
                        ClickEventBuilder clickEventBuilder8 = new ClickEventBuilder();
                        clickEventBuilder8.b("app_detail_summary_" + appSummarySizeData.c);
                        clickEventBuilder8.a();
                        SummaryDialogDto summaryDialogDto = appSummarySizeData.d;
                        if (summaryDialogDto != null) {
                            appDetailFragment.d2(summaryDialogDto);
                            return;
                        }
                        return;
                    case 12:
                        rc rcVar = (rc) qg5Var;
                        AddaxBoxData addaxBoxData = (AddaxBoxData) obj;
                        int i15 = AppDetailFragment.M1;
                        js3.p(view, "view");
                        js3.p(rcVar, "viewHolder");
                        js3.p(addaxBoxData, "recyclerData");
                        AddaxBoxDto addaxBoxDto = addaxBoxData.a;
                        ClickEventBuilder clickEventBuilder9 = new ClickEventBuilder();
                        clickEventBuilder9.b("addax_action_detail_" + addaxBoxDto.getId());
                        clickEventBuilder9.a();
                        ClickEventBuilder clickEventBuilder10 = new ClickEventBuilder();
                        clickEventBuilder10.b("addax_action_detail_" + addaxBoxDto.getId() + "_" + addaxBoxDto.getDisplayMode());
                        clickEventBuilder10.a();
                        FragmentActivity fragmentActivityF3 = appDetailFragment.F();
                        if (fragmentActivityF3 != null) {
                            new wv8(fragmentActivityF3, appDetailFragment.v1).m(view, rcVar, addaxBoxData);
                            return;
                        }
                        return;
                    default:
                        AppMoreDescriptionData appMoreDescriptionData = (AppMoreDescriptionData) obj;
                        int i16 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((ar) qg5Var, "<unused var>");
                        js3.p(appMoreDescriptionData, "recyclerData");
                        ApplicationFullDto applicationFullDtoR7 = appDetailFragment.R1().R();
                        if (applicationFullDtoR7 != null) {
                            pk5.g(appDetailFragment.J0, new NavIntentDirections.MoreDescription(new tx4(appMoreDescriptionData.a, new ToolbarData(applicationFullDtoR7, appDetailFragment.R1().T(), appDetailFragment.R1().U(), appDetailFragment.R1().S()))), -1);
                            return;
                        }
                        return;
                }
            }
        };
        zoVar.s = new ap(this, 6);
        zoVar.t = new ap(this, 16);
        zoVar.u = new ap(this, 27);
        final int i2 = 4;
        zoVar.v = new og5(this) { // from class: cp
            public final /* synthetic */ AppDetailFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                String highResUrl;
                AppRateDto rate;
                List<RateDto> rates;
                int i22 = i2;
                AppDetailFragment appDetailFragment = this.b;
                switch (i22) {
                    case 0:
                        AppRatingModuleData appRatingModuleData = (AppRatingModuleData) obj;
                        int i3 = AppDetailFragment.M1;
                        js3.p(view, "view");
                        js3.p((d) qg5Var, "<unused var>");
                        js3.p(appRatingModuleData, "recyclerData");
                        appDetailFragment.U1();
                        boolean z = view instanceof MyketRatingBar;
                        dw1.y(z ? "review_stars_detail" : "review_write_detail");
                        ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                        clickEventBuilder.b("review_new_detail");
                        clickEventBuilder.a();
                        fw0 fw0VarU1 = appDetailFragment.U1();
                        ApplicationFullDto applicationFullDtoR = appDetailFragment.R1().R();
                        fw0VarU1.d(applicationFullDtoR.getPackageName(), applicationFullDtoR.getVersion().getCode(), applicationFullDtoR.getVersion().isIncompatible(), applicationFullDtoR.getForceUpdate());
                        AppDetailViewModel appDetailViewModelR1 = appDetailFragment.R1();
                        MyketRatingBar myketRatingBar = z ? (MyketRatingBar) view : null;
                        appDetailViewModelR1.W(myketRatingBar != null ? myketRatingBar.getRating() : 0.0f);
                        Bundle bundle = new Bundle();
                        hp hpVar2 = appDetailFragment.u1;
                        if (hpVar2 == null) {
                            js3.V("navArgs");
                            throw null;
                        }
                        bundle.putString("packageName", hpVar2.a);
                        bundle.putString("BUNDLE_KEY_EVENT_OK", "detail_dd_new_review_ok");
                        bundle.putString("BUNDLE_KEY_EVENT_CANCEL", "detail_dd_new_review_cancel");
                        AppDetailViewModel appDetailViewModelR12 = appDetailFragment.R1();
                        if (!appDetailViewModelR12.B.G(appDetailViewModelR12.J0.a)) {
                            pk5.g(appDetailFragment.J0, new NavIntentDirections.AlertBottom(new bd(new DialogDataModel(appDetailFragment.W1(), "DIALOG_KEY_SHOULD_BE_INSTALLED", bundle, 8), null, appDetailFragment.L(rs6.app_must_installed), appDetailFragment.L(rs6.download_app), appDetailFragment.L(rs6.button_cancel), true)), -1);
                            return;
                        }
                        ApplicationFullDto applicationFullDtoR2 = appDetailFragment.R1().R();
                        if (applicationFullDtoR2 != null) {
                            CommentScenario.SubmitReview submitReview = new CommentScenario.SubmitReview(new SubmitReviewData(applicationFullDtoR2.getPackageName(), ((Number) appRatingModuleData.b.getValue()).floatValue(), null, false, true, new ToolbarData(applicationFullDtoR2, appDetailFragment.R1().T(), appDetailFragment.R1().U(), appDetailFragment.R1().S()), "_detail", "DETAIL", 4, null));
                            FragmentActivity fragmentActivityF = appDetailFragment.F();
                            if (fragmentActivityF != null) {
                                pk5.c(fragmentActivityF, submitReview);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        AIReviewSummaryData aIReviewSummaryData = (AIReviewSummaryData) obj;
                        int i4 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(aIReviewSummaryData, "recyclerData");
                        appDetailFragment.R1().r(new AppDetailAction.ReviewAILikeAction(true, aIReviewSummaryData.a.getId()));
                        return;
                    case 2:
                        AIReviewSummaryData aIReviewSummaryData2 = (AIReviewSummaryData) obj;
                        int i5 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(aIReviewSummaryData2, "recyclerData");
                        appDetailFragment.R1().r(new AppDetailAction.ReviewAILikeAction(false, aIReviewSummaryData2.a.getId()));
                        return;
                    case 3:
                        int i6 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p((AIReviewSummaryData) obj, "<unused var>");
                        appDetailFragment.R1().r(AppDetailAction.ShowMoreAIAction.INSTANCE);
                        dw1.y("detail__ai_review_more_description");
                        return;
                    case 4:
                        AppDownloadData appDownloadData = (AppDownloadData) obj;
                        int i7 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(appDownloadData, "recyclerData");
                        sb7.p("AppDetail", "App Install Click", "Packagename: " + appDownloadData.g);
                        ApplicationFullDto applicationFullDtoR3 = appDetailFragment.R1().R();
                        if (applicationFullDtoR3 != null) {
                            appDetailFragment.Y1().C(new DownloadDataModel(applicationFullDtoR3, "detail", appDetailFragment.R1().T(), appDetailFragment.R1().S(), appDetailFragment.R1().U()));
                        }
                        dw1.y("button_install");
                        return;
                    case 5:
                        AppDownloadData appDownloadData2 = (AppDownloadData) obj;
                        int i8 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(appDownloadData2, "recyclerData");
                        sb7.p("AppDetail", "App Update Click", "Packagename: " + appDownloadData2.g);
                        ApplicationFullDto applicationFullDtoR4 = appDetailFragment.R1().R();
                        if (applicationFullDtoR4 != null) {
                            ps1 ps1Var = appDetailFragment.r1;
                            if (ps1Var == null) {
                                js3.V("downloadManager");
                                throw null;
                            }
                            AppDownloadInfo appDownloadInfoI = ps1Var.i(applicationFullDtoR4.getPackageName(), null);
                            if (wq2.l(applicationFullDtoR4.getSize().getLength(), appDownloadInfoI != null ? appDownloadInfoI.getLocalSize() : 0L)) {
                                appDetailFragment.j2();
                            } else {
                                appDetailFragment.S1();
                                ir.mservices.market.version2.manager.a.e(applicationFullDtoR4.getTitle(), applicationFullDtoR4.getIcon().getUrl());
                            }
                        }
                        dw1.y("detail_button_update");
                        return;
                    case 6:
                        AppDownloadData appDownloadData3 = (AppDownloadData) obj;
                        int i9 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(appDownloadData3, "recyclerData");
                        sb7.p("AppDetail", "App Run Click", "Packagename: " + appDownloadData3);
                        ClickEventBuilder clickEventBuilder2 = new ClickEventBuilder();
                        clickEventBuilder2.b("detail_button_run");
                        clickEventBuilder2.a();
                        ApplicationFullDto applicationFullDtoR5 = appDetailFragment.R1().R();
                        if (applicationFullDtoR5 != null) {
                            String strR = appDetailFragment.Y1().r(applicationFullDtoR5.getVersion().getCode(), applicationFullDtoR5.getPackageName());
                            if (strR != null && !f88.n0(strR)) {
                                Context contextH = appDetailFragment.H();
                                String packageName = applicationFullDtoR5.getPackageName();
                                Uri uri = Uri.parse(strR);
                                js3.o(uri, "parse(...)");
                                if (!js8.q(contextH, uri, packageName, null)) {
                                    dp3.M(applicationFullDtoR5.getPackageName());
                                }
                                appDetailFragment.Y1().e(applicationFullDtoR5.getVersion().getCode(), applicationFullDtoR5.getPackageName());
                                return;
                            }
                            if (!appDetailFragment.Y1().K(applicationFullDtoR5.getPackageName())) {
                                Context contextH2 = appDetailFragment.H();
                                hh2.H(new hh2(contextH2, contextH2 != null ? contextH2.getString(rs6.app_not_runnable) : null));
                                return;
                            }
                            ApplicationCheetahDto cheetah = applicationFullDtoR5.getCheetah();
                            if (cheetah == null || !cheetah.getEnable()) {
                                dp3.M(applicationFullDtoR5.getPackageName());
                                return;
                            } else {
                                pk5.g(appDetailFragment.J0, new NavIntentDirections.Cheetah(new eq0(applicationFullDtoR5.getPackageName(), applicationFullDtoR5.getIcon().getUrl(), false)), -1);
                                return;
                            }
                        }
                        return;
                    case 7:
                        AppSummaryTextData appSummaryTextData = (AppSummaryTextData) obj;
                        int i10 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((nt) qg5Var, "<unused var>");
                        js3.p(appSummaryTextData, "recyclerData");
                        ClickEventBuilder clickEventBuilder3 = new ClickEventBuilder();
                        SummaryTextDto summaryTextDto = appSummaryTextData.a;
                        clickEventBuilder3.b("app_detail_summary_" + summaryTextDto.getAnalyticId());
                        clickEventBuilder3.a();
                        if (summaryTextDto.getSummaryDialog() != null) {
                            appDetailFragment.d2(summaryTextDto.getSummaryDialog());
                            return;
                        }
                        String action = summaryTextDto.getAction();
                        if (action == null || f88.n0(action)) {
                            return;
                        }
                        Context contextH3 = appDetailFragment.H();
                        String action2 = summaryTextDto.getAction();
                        if (action2 != null) {
                            t61.v(action2, "parse(...)", contextH3, NearbyRepository.SERVICE_ID, null);
                            return;
                        }
                        return;
                    case 8:
                        AppSummaryIconData appSummaryIconData = (AppSummaryIconData) obj;
                        int i11 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((lt) qg5Var, "<unused var>");
                        js3.p(appSummaryIconData, "recyclerData");
                        ClickEventBuilder clickEventBuilder4 = new ClickEventBuilder();
                        SummaryIconDto summaryIconDto = appSummaryIconData.a;
                        clickEventBuilder4.b("app_detail_summary_" + summaryIconDto.getAnalyticId());
                        clickEventBuilder4.a();
                        if (summaryIconDto.getSummaryDialog() != null) {
                            appDetailFragment.d2(summaryIconDto.getSummaryDialog());
                            return;
                        }
                        String action3 = summaryIconDto.getAction();
                        if (action3 == null || f88.n0(action3)) {
                            return;
                        }
                        Context contextH4 = appDetailFragment.H();
                        String action4 = summaryIconDto.getAction();
                        if (action4 != null) {
                            t61.v(action4, "parse(...)", contextH4, NearbyRepository.SERVICE_ID, null);
                            return;
                        }
                        return;
                    case 9:
                        AppBarData appBarData = (AppBarData) obj;
                        int i12 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.app.detail.ui.recycler.a) qg5Var, "<unused var>");
                        js3.p(appBarData, "recyclerData");
                        ClickEventBuilder clickEventBuilder5 = new ClickEventBuilder();
                        clickEventBuilder5.b("detail_icon");
                        clickEventBuilder5.a();
                        AppBarSampleData appBarSampleData = (AppBarSampleData) appBarData.g.getValue();
                        if (appBarSampleData == null || (highResUrl = appBarSampleData.getHighResUrl()) == null) {
                            return;
                        }
                        FragmentActivity fragmentActivityF2 = appDetailFragment.F();
                        zt5 zt5Var = fragmentActivityF2 instanceof zt5 ? (zt5) fragmentActivityF2 : null;
                        if (zt5Var != null) {
                            ((LaunchContentActivity) zt5Var).s0(appDetailFragment.K().getDimensionPixelSize(pq6.margin_default_v2_triple), highResUrl);
                            return;
                        }
                        return;
                    case 10:
                        AppSummaryRateData appSummaryRateData = (AppSummaryRateData) obj;
                        int i13 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((mt) qg5Var, "<unused var>");
                        js3.p(appSummaryRateData, "recyclerData");
                        ClickEventBuilder clickEventBuilder6 = new ClickEventBuilder();
                        clickEventBuilder6.b("app_detail_summary_" + appSummaryRateData.a.getAnalyticId());
                        clickEventBuilder6.a();
                        ClickEventBuilder clickEventBuilder7 = new ClickEventBuilder();
                        clickEventBuilder7.b("detail_all_review_info");
                        clickEventBuilder7.a();
                        ApplicationFullDto applicationFullDtoR6 = appDetailFragment.R1().R();
                        if (applicationFullDtoR6 == null || (rate = applicationFullDtoR6.getRate()) == null || (rates = rate.getRates()) == null) {
                            return;
                        }
                        hp hpVar3 = appDetailFragment.u1;
                        if (hpVar3 != null) {
                            appDetailFragment.b2(hpVar3.a, rates);
                            return;
                        } else {
                            js3.V("navArgs");
                            throw null;
                        }
                    case 11:
                        AppSummarySizeData appSummarySizeData = (AppSummarySizeData) obj;
                        int i14 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((f) qg5Var, "<unused var>");
                        js3.p(appSummarySizeData, "recyclerData");
                        ClickEventBuilder clickEventBuilder8 = new ClickEventBuilder();
                        clickEventBuilder8.b("app_detail_summary_" + appSummarySizeData.c);
                        clickEventBuilder8.a();
                        SummaryDialogDto summaryDialogDto = appSummarySizeData.d;
                        if (summaryDialogDto != null) {
                            appDetailFragment.d2(summaryDialogDto);
                            return;
                        }
                        return;
                    case 12:
                        rc rcVar = (rc) qg5Var;
                        AddaxBoxData addaxBoxData = (AddaxBoxData) obj;
                        int i15 = AppDetailFragment.M1;
                        js3.p(view, "view");
                        js3.p(rcVar, "viewHolder");
                        js3.p(addaxBoxData, "recyclerData");
                        AddaxBoxDto addaxBoxDto = addaxBoxData.a;
                        ClickEventBuilder clickEventBuilder9 = new ClickEventBuilder();
                        clickEventBuilder9.b("addax_action_detail_" + addaxBoxDto.getId());
                        clickEventBuilder9.a();
                        ClickEventBuilder clickEventBuilder10 = new ClickEventBuilder();
                        clickEventBuilder10.b("addax_action_detail_" + addaxBoxDto.getId() + "_" + addaxBoxDto.getDisplayMode());
                        clickEventBuilder10.a();
                        FragmentActivity fragmentActivityF3 = appDetailFragment.F();
                        if (fragmentActivityF3 != null) {
                            new wv8(fragmentActivityF3, appDetailFragment.v1).m(view, rcVar, addaxBoxData);
                            return;
                        }
                        return;
                    default:
                        AppMoreDescriptionData appMoreDescriptionData = (AppMoreDescriptionData) obj;
                        int i16 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((ar) qg5Var, "<unused var>");
                        js3.p(appMoreDescriptionData, "recyclerData");
                        ApplicationFullDto applicationFullDtoR7 = appDetailFragment.R1().R();
                        if (applicationFullDtoR7 != null) {
                            pk5.g(appDetailFragment.J0, new NavIntentDirections.MoreDescription(new tx4(appMoreDescriptionData.a, new ToolbarData(applicationFullDtoR7, appDetailFragment.R1().T(), appDetailFragment.R1().U(), appDetailFragment.R1().S()))), -1);
                            return;
                        }
                        return;
                }
            }
        };
        final int i3 = 5;
        zoVar.w = new og5(this) { // from class: cp
            public final /* synthetic */ AppDetailFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                String highResUrl;
                AppRateDto rate;
                List<RateDto> rates;
                int i22 = i3;
                AppDetailFragment appDetailFragment = this.b;
                switch (i22) {
                    case 0:
                        AppRatingModuleData appRatingModuleData = (AppRatingModuleData) obj;
                        int i32 = AppDetailFragment.M1;
                        js3.p(view, "view");
                        js3.p((d) qg5Var, "<unused var>");
                        js3.p(appRatingModuleData, "recyclerData");
                        appDetailFragment.U1();
                        boolean z = view instanceof MyketRatingBar;
                        dw1.y(z ? "review_stars_detail" : "review_write_detail");
                        ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                        clickEventBuilder.b("review_new_detail");
                        clickEventBuilder.a();
                        fw0 fw0VarU1 = appDetailFragment.U1();
                        ApplicationFullDto applicationFullDtoR = appDetailFragment.R1().R();
                        fw0VarU1.d(applicationFullDtoR.getPackageName(), applicationFullDtoR.getVersion().getCode(), applicationFullDtoR.getVersion().isIncompatible(), applicationFullDtoR.getForceUpdate());
                        AppDetailViewModel appDetailViewModelR1 = appDetailFragment.R1();
                        MyketRatingBar myketRatingBar = z ? (MyketRatingBar) view : null;
                        appDetailViewModelR1.W(myketRatingBar != null ? myketRatingBar.getRating() : 0.0f);
                        Bundle bundle = new Bundle();
                        hp hpVar2 = appDetailFragment.u1;
                        if (hpVar2 == null) {
                            js3.V("navArgs");
                            throw null;
                        }
                        bundle.putString("packageName", hpVar2.a);
                        bundle.putString("BUNDLE_KEY_EVENT_OK", "detail_dd_new_review_ok");
                        bundle.putString("BUNDLE_KEY_EVENT_CANCEL", "detail_dd_new_review_cancel");
                        AppDetailViewModel appDetailViewModelR12 = appDetailFragment.R1();
                        if (!appDetailViewModelR12.B.G(appDetailViewModelR12.J0.a)) {
                            pk5.g(appDetailFragment.J0, new NavIntentDirections.AlertBottom(new bd(new DialogDataModel(appDetailFragment.W1(), "DIALOG_KEY_SHOULD_BE_INSTALLED", bundle, 8), null, appDetailFragment.L(rs6.app_must_installed), appDetailFragment.L(rs6.download_app), appDetailFragment.L(rs6.button_cancel), true)), -1);
                            return;
                        }
                        ApplicationFullDto applicationFullDtoR2 = appDetailFragment.R1().R();
                        if (applicationFullDtoR2 != null) {
                            CommentScenario.SubmitReview submitReview = new CommentScenario.SubmitReview(new SubmitReviewData(applicationFullDtoR2.getPackageName(), ((Number) appRatingModuleData.b.getValue()).floatValue(), null, false, true, new ToolbarData(applicationFullDtoR2, appDetailFragment.R1().T(), appDetailFragment.R1().U(), appDetailFragment.R1().S()), "_detail", "DETAIL", 4, null));
                            FragmentActivity fragmentActivityF = appDetailFragment.F();
                            if (fragmentActivityF != null) {
                                pk5.c(fragmentActivityF, submitReview);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        AIReviewSummaryData aIReviewSummaryData = (AIReviewSummaryData) obj;
                        int i4 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(aIReviewSummaryData, "recyclerData");
                        appDetailFragment.R1().r(new AppDetailAction.ReviewAILikeAction(true, aIReviewSummaryData.a.getId()));
                        return;
                    case 2:
                        AIReviewSummaryData aIReviewSummaryData2 = (AIReviewSummaryData) obj;
                        int i5 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(aIReviewSummaryData2, "recyclerData");
                        appDetailFragment.R1().r(new AppDetailAction.ReviewAILikeAction(false, aIReviewSummaryData2.a.getId()));
                        return;
                    case 3:
                        int i6 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p((AIReviewSummaryData) obj, "<unused var>");
                        appDetailFragment.R1().r(AppDetailAction.ShowMoreAIAction.INSTANCE);
                        dw1.y("detail__ai_review_more_description");
                        return;
                    case 4:
                        AppDownloadData appDownloadData = (AppDownloadData) obj;
                        int i7 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(appDownloadData, "recyclerData");
                        sb7.p("AppDetail", "App Install Click", "Packagename: " + appDownloadData.g);
                        ApplicationFullDto applicationFullDtoR3 = appDetailFragment.R1().R();
                        if (applicationFullDtoR3 != null) {
                            appDetailFragment.Y1().C(new DownloadDataModel(applicationFullDtoR3, "detail", appDetailFragment.R1().T(), appDetailFragment.R1().S(), appDetailFragment.R1().U()));
                        }
                        dw1.y("button_install");
                        return;
                    case 5:
                        AppDownloadData appDownloadData2 = (AppDownloadData) obj;
                        int i8 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(appDownloadData2, "recyclerData");
                        sb7.p("AppDetail", "App Update Click", "Packagename: " + appDownloadData2.g);
                        ApplicationFullDto applicationFullDtoR4 = appDetailFragment.R1().R();
                        if (applicationFullDtoR4 != null) {
                            ps1 ps1Var = appDetailFragment.r1;
                            if (ps1Var == null) {
                                js3.V("downloadManager");
                                throw null;
                            }
                            AppDownloadInfo appDownloadInfoI = ps1Var.i(applicationFullDtoR4.getPackageName(), null);
                            if (wq2.l(applicationFullDtoR4.getSize().getLength(), appDownloadInfoI != null ? appDownloadInfoI.getLocalSize() : 0L)) {
                                appDetailFragment.j2();
                            } else {
                                appDetailFragment.S1();
                                ir.mservices.market.version2.manager.a.e(applicationFullDtoR4.getTitle(), applicationFullDtoR4.getIcon().getUrl());
                            }
                        }
                        dw1.y("detail_button_update");
                        return;
                    case 6:
                        AppDownloadData appDownloadData3 = (AppDownloadData) obj;
                        int i9 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(appDownloadData3, "recyclerData");
                        sb7.p("AppDetail", "App Run Click", "Packagename: " + appDownloadData3);
                        ClickEventBuilder clickEventBuilder2 = new ClickEventBuilder();
                        clickEventBuilder2.b("detail_button_run");
                        clickEventBuilder2.a();
                        ApplicationFullDto applicationFullDtoR5 = appDetailFragment.R1().R();
                        if (applicationFullDtoR5 != null) {
                            String strR = appDetailFragment.Y1().r(applicationFullDtoR5.getVersion().getCode(), applicationFullDtoR5.getPackageName());
                            if (strR != null && !f88.n0(strR)) {
                                Context contextH = appDetailFragment.H();
                                String packageName = applicationFullDtoR5.getPackageName();
                                Uri uri = Uri.parse(strR);
                                js3.o(uri, "parse(...)");
                                if (!js8.q(contextH, uri, packageName, null)) {
                                    dp3.M(applicationFullDtoR5.getPackageName());
                                }
                                appDetailFragment.Y1().e(applicationFullDtoR5.getVersion().getCode(), applicationFullDtoR5.getPackageName());
                                return;
                            }
                            if (!appDetailFragment.Y1().K(applicationFullDtoR5.getPackageName())) {
                                Context contextH2 = appDetailFragment.H();
                                hh2.H(new hh2(contextH2, contextH2 != null ? contextH2.getString(rs6.app_not_runnable) : null));
                                return;
                            }
                            ApplicationCheetahDto cheetah = applicationFullDtoR5.getCheetah();
                            if (cheetah == null || !cheetah.getEnable()) {
                                dp3.M(applicationFullDtoR5.getPackageName());
                                return;
                            } else {
                                pk5.g(appDetailFragment.J0, new NavIntentDirections.Cheetah(new eq0(applicationFullDtoR5.getPackageName(), applicationFullDtoR5.getIcon().getUrl(), false)), -1);
                                return;
                            }
                        }
                        return;
                    case 7:
                        AppSummaryTextData appSummaryTextData = (AppSummaryTextData) obj;
                        int i10 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((nt) qg5Var, "<unused var>");
                        js3.p(appSummaryTextData, "recyclerData");
                        ClickEventBuilder clickEventBuilder3 = new ClickEventBuilder();
                        SummaryTextDto summaryTextDto = appSummaryTextData.a;
                        clickEventBuilder3.b("app_detail_summary_" + summaryTextDto.getAnalyticId());
                        clickEventBuilder3.a();
                        if (summaryTextDto.getSummaryDialog() != null) {
                            appDetailFragment.d2(summaryTextDto.getSummaryDialog());
                            return;
                        }
                        String action = summaryTextDto.getAction();
                        if (action == null || f88.n0(action)) {
                            return;
                        }
                        Context contextH3 = appDetailFragment.H();
                        String action2 = summaryTextDto.getAction();
                        if (action2 != null) {
                            t61.v(action2, "parse(...)", contextH3, NearbyRepository.SERVICE_ID, null);
                            return;
                        }
                        return;
                    case 8:
                        AppSummaryIconData appSummaryIconData = (AppSummaryIconData) obj;
                        int i11 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((lt) qg5Var, "<unused var>");
                        js3.p(appSummaryIconData, "recyclerData");
                        ClickEventBuilder clickEventBuilder4 = new ClickEventBuilder();
                        SummaryIconDto summaryIconDto = appSummaryIconData.a;
                        clickEventBuilder4.b("app_detail_summary_" + summaryIconDto.getAnalyticId());
                        clickEventBuilder4.a();
                        if (summaryIconDto.getSummaryDialog() != null) {
                            appDetailFragment.d2(summaryIconDto.getSummaryDialog());
                            return;
                        }
                        String action3 = summaryIconDto.getAction();
                        if (action3 == null || f88.n0(action3)) {
                            return;
                        }
                        Context contextH4 = appDetailFragment.H();
                        String action4 = summaryIconDto.getAction();
                        if (action4 != null) {
                            t61.v(action4, "parse(...)", contextH4, NearbyRepository.SERVICE_ID, null);
                            return;
                        }
                        return;
                    case 9:
                        AppBarData appBarData = (AppBarData) obj;
                        int i12 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.app.detail.ui.recycler.a) qg5Var, "<unused var>");
                        js3.p(appBarData, "recyclerData");
                        ClickEventBuilder clickEventBuilder5 = new ClickEventBuilder();
                        clickEventBuilder5.b("detail_icon");
                        clickEventBuilder5.a();
                        AppBarSampleData appBarSampleData = (AppBarSampleData) appBarData.g.getValue();
                        if (appBarSampleData == null || (highResUrl = appBarSampleData.getHighResUrl()) == null) {
                            return;
                        }
                        FragmentActivity fragmentActivityF2 = appDetailFragment.F();
                        zt5 zt5Var = fragmentActivityF2 instanceof zt5 ? (zt5) fragmentActivityF2 : null;
                        if (zt5Var != null) {
                            ((LaunchContentActivity) zt5Var).s0(appDetailFragment.K().getDimensionPixelSize(pq6.margin_default_v2_triple), highResUrl);
                            return;
                        }
                        return;
                    case 10:
                        AppSummaryRateData appSummaryRateData = (AppSummaryRateData) obj;
                        int i13 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((mt) qg5Var, "<unused var>");
                        js3.p(appSummaryRateData, "recyclerData");
                        ClickEventBuilder clickEventBuilder6 = new ClickEventBuilder();
                        clickEventBuilder6.b("app_detail_summary_" + appSummaryRateData.a.getAnalyticId());
                        clickEventBuilder6.a();
                        ClickEventBuilder clickEventBuilder7 = new ClickEventBuilder();
                        clickEventBuilder7.b("detail_all_review_info");
                        clickEventBuilder7.a();
                        ApplicationFullDto applicationFullDtoR6 = appDetailFragment.R1().R();
                        if (applicationFullDtoR6 == null || (rate = applicationFullDtoR6.getRate()) == null || (rates = rate.getRates()) == null) {
                            return;
                        }
                        hp hpVar3 = appDetailFragment.u1;
                        if (hpVar3 != null) {
                            appDetailFragment.b2(hpVar3.a, rates);
                            return;
                        } else {
                            js3.V("navArgs");
                            throw null;
                        }
                    case 11:
                        AppSummarySizeData appSummarySizeData = (AppSummarySizeData) obj;
                        int i14 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((f) qg5Var, "<unused var>");
                        js3.p(appSummarySizeData, "recyclerData");
                        ClickEventBuilder clickEventBuilder8 = new ClickEventBuilder();
                        clickEventBuilder8.b("app_detail_summary_" + appSummarySizeData.c);
                        clickEventBuilder8.a();
                        SummaryDialogDto summaryDialogDto = appSummarySizeData.d;
                        if (summaryDialogDto != null) {
                            appDetailFragment.d2(summaryDialogDto);
                            return;
                        }
                        return;
                    case 12:
                        rc rcVar = (rc) qg5Var;
                        AddaxBoxData addaxBoxData = (AddaxBoxData) obj;
                        int i15 = AppDetailFragment.M1;
                        js3.p(view, "view");
                        js3.p(rcVar, "viewHolder");
                        js3.p(addaxBoxData, "recyclerData");
                        AddaxBoxDto addaxBoxDto = addaxBoxData.a;
                        ClickEventBuilder clickEventBuilder9 = new ClickEventBuilder();
                        clickEventBuilder9.b("addax_action_detail_" + addaxBoxDto.getId());
                        clickEventBuilder9.a();
                        ClickEventBuilder clickEventBuilder10 = new ClickEventBuilder();
                        clickEventBuilder10.b("addax_action_detail_" + addaxBoxDto.getId() + "_" + addaxBoxDto.getDisplayMode());
                        clickEventBuilder10.a();
                        FragmentActivity fragmentActivityF3 = appDetailFragment.F();
                        if (fragmentActivityF3 != null) {
                            new wv8(fragmentActivityF3, appDetailFragment.v1).m(view, rcVar, addaxBoxData);
                            return;
                        }
                        return;
                    default:
                        AppMoreDescriptionData appMoreDescriptionData = (AppMoreDescriptionData) obj;
                        int i16 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((ar) qg5Var, "<unused var>");
                        js3.p(appMoreDescriptionData, "recyclerData");
                        ApplicationFullDto applicationFullDtoR7 = appDetailFragment.R1().R();
                        if (applicationFullDtoR7 != null) {
                            pk5.g(appDetailFragment.J0, new NavIntentDirections.MoreDescription(new tx4(appMoreDescriptionData.a, new ToolbarData(applicationFullDtoR7, appDetailFragment.R1().T(), appDetailFragment.R1().U(), appDetailFragment.R1().S()))), -1);
                            return;
                        }
                        return;
                }
            }
        };
        final int i4 = 6;
        zoVar.x = new og5(this) { // from class: cp
            public final /* synthetic */ AppDetailFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                String highResUrl;
                AppRateDto rate;
                List<RateDto> rates;
                int i22 = i4;
                AppDetailFragment appDetailFragment = this.b;
                switch (i22) {
                    case 0:
                        AppRatingModuleData appRatingModuleData = (AppRatingModuleData) obj;
                        int i32 = AppDetailFragment.M1;
                        js3.p(view, "view");
                        js3.p((d) qg5Var, "<unused var>");
                        js3.p(appRatingModuleData, "recyclerData");
                        appDetailFragment.U1();
                        boolean z = view instanceof MyketRatingBar;
                        dw1.y(z ? "review_stars_detail" : "review_write_detail");
                        ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                        clickEventBuilder.b("review_new_detail");
                        clickEventBuilder.a();
                        fw0 fw0VarU1 = appDetailFragment.U1();
                        ApplicationFullDto applicationFullDtoR = appDetailFragment.R1().R();
                        fw0VarU1.d(applicationFullDtoR.getPackageName(), applicationFullDtoR.getVersion().getCode(), applicationFullDtoR.getVersion().isIncompatible(), applicationFullDtoR.getForceUpdate());
                        AppDetailViewModel appDetailViewModelR1 = appDetailFragment.R1();
                        MyketRatingBar myketRatingBar = z ? (MyketRatingBar) view : null;
                        appDetailViewModelR1.W(myketRatingBar != null ? myketRatingBar.getRating() : 0.0f);
                        Bundle bundle = new Bundle();
                        hp hpVar2 = appDetailFragment.u1;
                        if (hpVar2 == null) {
                            js3.V("navArgs");
                            throw null;
                        }
                        bundle.putString("packageName", hpVar2.a);
                        bundle.putString("BUNDLE_KEY_EVENT_OK", "detail_dd_new_review_ok");
                        bundle.putString("BUNDLE_KEY_EVENT_CANCEL", "detail_dd_new_review_cancel");
                        AppDetailViewModel appDetailViewModelR12 = appDetailFragment.R1();
                        if (!appDetailViewModelR12.B.G(appDetailViewModelR12.J0.a)) {
                            pk5.g(appDetailFragment.J0, new NavIntentDirections.AlertBottom(new bd(new DialogDataModel(appDetailFragment.W1(), "DIALOG_KEY_SHOULD_BE_INSTALLED", bundle, 8), null, appDetailFragment.L(rs6.app_must_installed), appDetailFragment.L(rs6.download_app), appDetailFragment.L(rs6.button_cancel), true)), -1);
                            return;
                        }
                        ApplicationFullDto applicationFullDtoR2 = appDetailFragment.R1().R();
                        if (applicationFullDtoR2 != null) {
                            CommentScenario.SubmitReview submitReview = new CommentScenario.SubmitReview(new SubmitReviewData(applicationFullDtoR2.getPackageName(), ((Number) appRatingModuleData.b.getValue()).floatValue(), null, false, true, new ToolbarData(applicationFullDtoR2, appDetailFragment.R1().T(), appDetailFragment.R1().U(), appDetailFragment.R1().S()), "_detail", "DETAIL", 4, null));
                            FragmentActivity fragmentActivityF = appDetailFragment.F();
                            if (fragmentActivityF != null) {
                                pk5.c(fragmentActivityF, submitReview);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        AIReviewSummaryData aIReviewSummaryData = (AIReviewSummaryData) obj;
                        int i42 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(aIReviewSummaryData, "recyclerData");
                        appDetailFragment.R1().r(new AppDetailAction.ReviewAILikeAction(true, aIReviewSummaryData.a.getId()));
                        return;
                    case 2:
                        AIReviewSummaryData aIReviewSummaryData2 = (AIReviewSummaryData) obj;
                        int i5 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(aIReviewSummaryData2, "recyclerData");
                        appDetailFragment.R1().r(new AppDetailAction.ReviewAILikeAction(false, aIReviewSummaryData2.a.getId()));
                        return;
                    case 3:
                        int i6 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p((AIReviewSummaryData) obj, "<unused var>");
                        appDetailFragment.R1().r(AppDetailAction.ShowMoreAIAction.INSTANCE);
                        dw1.y("detail__ai_review_more_description");
                        return;
                    case 4:
                        AppDownloadData appDownloadData = (AppDownloadData) obj;
                        int i7 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(appDownloadData, "recyclerData");
                        sb7.p("AppDetail", "App Install Click", "Packagename: " + appDownloadData.g);
                        ApplicationFullDto applicationFullDtoR3 = appDetailFragment.R1().R();
                        if (applicationFullDtoR3 != null) {
                            appDetailFragment.Y1().C(new DownloadDataModel(applicationFullDtoR3, "detail", appDetailFragment.R1().T(), appDetailFragment.R1().S(), appDetailFragment.R1().U()));
                        }
                        dw1.y("button_install");
                        return;
                    case 5:
                        AppDownloadData appDownloadData2 = (AppDownloadData) obj;
                        int i8 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(appDownloadData2, "recyclerData");
                        sb7.p("AppDetail", "App Update Click", "Packagename: " + appDownloadData2.g);
                        ApplicationFullDto applicationFullDtoR4 = appDetailFragment.R1().R();
                        if (applicationFullDtoR4 != null) {
                            ps1 ps1Var = appDetailFragment.r1;
                            if (ps1Var == null) {
                                js3.V("downloadManager");
                                throw null;
                            }
                            AppDownloadInfo appDownloadInfoI = ps1Var.i(applicationFullDtoR4.getPackageName(), null);
                            if (wq2.l(applicationFullDtoR4.getSize().getLength(), appDownloadInfoI != null ? appDownloadInfoI.getLocalSize() : 0L)) {
                                appDetailFragment.j2();
                            } else {
                                appDetailFragment.S1();
                                ir.mservices.market.version2.manager.a.e(applicationFullDtoR4.getTitle(), applicationFullDtoR4.getIcon().getUrl());
                            }
                        }
                        dw1.y("detail_button_update");
                        return;
                    case 6:
                        AppDownloadData appDownloadData3 = (AppDownloadData) obj;
                        int i9 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(appDownloadData3, "recyclerData");
                        sb7.p("AppDetail", "App Run Click", "Packagename: " + appDownloadData3);
                        ClickEventBuilder clickEventBuilder2 = new ClickEventBuilder();
                        clickEventBuilder2.b("detail_button_run");
                        clickEventBuilder2.a();
                        ApplicationFullDto applicationFullDtoR5 = appDetailFragment.R1().R();
                        if (applicationFullDtoR5 != null) {
                            String strR = appDetailFragment.Y1().r(applicationFullDtoR5.getVersion().getCode(), applicationFullDtoR5.getPackageName());
                            if (strR != null && !f88.n0(strR)) {
                                Context contextH = appDetailFragment.H();
                                String packageName = applicationFullDtoR5.getPackageName();
                                Uri uri = Uri.parse(strR);
                                js3.o(uri, "parse(...)");
                                if (!js8.q(contextH, uri, packageName, null)) {
                                    dp3.M(applicationFullDtoR5.getPackageName());
                                }
                                appDetailFragment.Y1().e(applicationFullDtoR5.getVersion().getCode(), applicationFullDtoR5.getPackageName());
                                return;
                            }
                            if (!appDetailFragment.Y1().K(applicationFullDtoR5.getPackageName())) {
                                Context contextH2 = appDetailFragment.H();
                                hh2.H(new hh2(contextH2, contextH2 != null ? contextH2.getString(rs6.app_not_runnable) : null));
                                return;
                            }
                            ApplicationCheetahDto cheetah = applicationFullDtoR5.getCheetah();
                            if (cheetah == null || !cheetah.getEnable()) {
                                dp3.M(applicationFullDtoR5.getPackageName());
                                return;
                            } else {
                                pk5.g(appDetailFragment.J0, new NavIntentDirections.Cheetah(new eq0(applicationFullDtoR5.getPackageName(), applicationFullDtoR5.getIcon().getUrl(), false)), -1);
                                return;
                            }
                        }
                        return;
                    case 7:
                        AppSummaryTextData appSummaryTextData = (AppSummaryTextData) obj;
                        int i10 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((nt) qg5Var, "<unused var>");
                        js3.p(appSummaryTextData, "recyclerData");
                        ClickEventBuilder clickEventBuilder3 = new ClickEventBuilder();
                        SummaryTextDto summaryTextDto = appSummaryTextData.a;
                        clickEventBuilder3.b("app_detail_summary_" + summaryTextDto.getAnalyticId());
                        clickEventBuilder3.a();
                        if (summaryTextDto.getSummaryDialog() != null) {
                            appDetailFragment.d2(summaryTextDto.getSummaryDialog());
                            return;
                        }
                        String action = summaryTextDto.getAction();
                        if (action == null || f88.n0(action)) {
                            return;
                        }
                        Context contextH3 = appDetailFragment.H();
                        String action2 = summaryTextDto.getAction();
                        if (action2 != null) {
                            t61.v(action2, "parse(...)", contextH3, NearbyRepository.SERVICE_ID, null);
                            return;
                        }
                        return;
                    case 8:
                        AppSummaryIconData appSummaryIconData = (AppSummaryIconData) obj;
                        int i11 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((lt) qg5Var, "<unused var>");
                        js3.p(appSummaryIconData, "recyclerData");
                        ClickEventBuilder clickEventBuilder4 = new ClickEventBuilder();
                        SummaryIconDto summaryIconDto = appSummaryIconData.a;
                        clickEventBuilder4.b("app_detail_summary_" + summaryIconDto.getAnalyticId());
                        clickEventBuilder4.a();
                        if (summaryIconDto.getSummaryDialog() != null) {
                            appDetailFragment.d2(summaryIconDto.getSummaryDialog());
                            return;
                        }
                        String action3 = summaryIconDto.getAction();
                        if (action3 == null || f88.n0(action3)) {
                            return;
                        }
                        Context contextH4 = appDetailFragment.H();
                        String action4 = summaryIconDto.getAction();
                        if (action4 != null) {
                            t61.v(action4, "parse(...)", contextH4, NearbyRepository.SERVICE_ID, null);
                            return;
                        }
                        return;
                    case 9:
                        AppBarData appBarData = (AppBarData) obj;
                        int i12 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.app.detail.ui.recycler.a) qg5Var, "<unused var>");
                        js3.p(appBarData, "recyclerData");
                        ClickEventBuilder clickEventBuilder5 = new ClickEventBuilder();
                        clickEventBuilder5.b("detail_icon");
                        clickEventBuilder5.a();
                        AppBarSampleData appBarSampleData = (AppBarSampleData) appBarData.g.getValue();
                        if (appBarSampleData == null || (highResUrl = appBarSampleData.getHighResUrl()) == null) {
                            return;
                        }
                        FragmentActivity fragmentActivityF2 = appDetailFragment.F();
                        zt5 zt5Var = fragmentActivityF2 instanceof zt5 ? (zt5) fragmentActivityF2 : null;
                        if (zt5Var != null) {
                            ((LaunchContentActivity) zt5Var).s0(appDetailFragment.K().getDimensionPixelSize(pq6.margin_default_v2_triple), highResUrl);
                            return;
                        }
                        return;
                    case 10:
                        AppSummaryRateData appSummaryRateData = (AppSummaryRateData) obj;
                        int i13 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((mt) qg5Var, "<unused var>");
                        js3.p(appSummaryRateData, "recyclerData");
                        ClickEventBuilder clickEventBuilder6 = new ClickEventBuilder();
                        clickEventBuilder6.b("app_detail_summary_" + appSummaryRateData.a.getAnalyticId());
                        clickEventBuilder6.a();
                        ClickEventBuilder clickEventBuilder7 = new ClickEventBuilder();
                        clickEventBuilder7.b("detail_all_review_info");
                        clickEventBuilder7.a();
                        ApplicationFullDto applicationFullDtoR6 = appDetailFragment.R1().R();
                        if (applicationFullDtoR6 == null || (rate = applicationFullDtoR6.getRate()) == null || (rates = rate.getRates()) == null) {
                            return;
                        }
                        hp hpVar3 = appDetailFragment.u1;
                        if (hpVar3 != null) {
                            appDetailFragment.b2(hpVar3.a, rates);
                            return;
                        } else {
                            js3.V("navArgs");
                            throw null;
                        }
                    case 11:
                        AppSummarySizeData appSummarySizeData = (AppSummarySizeData) obj;
                        int i14 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((f) qg5Var, "<unused var>");
                        js3.p(appSummarySizeData, "recyclerData");
                        ClickEventBuilder clickEventBuilder8 = new ClickEventBuilder();
                        clickEventBuilder8.b("app_detail_summary_" + appSummarySizeData.c);
                        clickEventBuilder8.a();
                        SummaryDialogDto summaryDialogDto = appSummarySizeData.d;
                        if (summaryDialogDto != null) {
                            appDetailFragment.d2(summaryDialogDto);
                            return;
                        }
                        return;
                    case 12:
                        rc rcVar = (rc) qg5Var;
                        AddaxBoxData addaxBoxData = (AddaxBoxData) obj;
                        int i15 = AppDetailFragment.M1;
                        js3.p(view, "view");
                        js3.p(rcVar, "viewHolder");
                        js3.p(addaxBoxData, "recyclerData");
                        AddaxBoxDto addaxBoxDto = addaxBoxData.a;
                        ClickEventBuilder clickEventBuilder9 = new ClickEventBuilder();
                        clickEventBuilder9.b("addax_action_detail_" + addaxBoxDto.getId());
                        clickEventBuilder9.a();
                        ClickEventBuilder clickEventBuilder10 = new ClickEventBuilder();
                        clickEventBuilder10.b("addax_action_detail_" + addaxBoxDto.getId() + "_" + addaxBoxDto.getDisplayMode());
                        clickEventBuilder10.a();
                        FragmentActivity fragmentActivityF3 = appDetailFragment.F();
                        if (fragmentActivityF3 != null) {
                            new wv8(fragmentActivityF3, appDetailFragment.v1).m(view, rcVar, addaxBoxData);
                            return;
                        }
                        return;
                    default:
                        AppMoreDescriptionData appMoreDescriptionData = (AppMoreDescriptionData) obj;
                        int i16 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((ar) qg5Var, "<unused var>");
                        js3.p(appMoreDescriptionData, "recyclerData");
                        ApplicationFullDto applicationFullDtoR7 = appDetailFragment.R1().R();
                        if (applicationFullDtoR7 != null) {
                            pk5.g(appDetailFragment.J0, new NavIntentDirections.MoreDescription(new tx4(appMoreDescriptionData.a, new ToolbarData(applicationFullDtoR7, appDetailFragment.R1().T(), appDetailFragment.R1().U(), appDetailFragment.R1().S()))), -1);
                            return;
                        }
                        return;
                }
            }
        };
        zoVar.y = new en(2);
        final int i5 = 7;
        zoVar.c0 = new og5(this) { // from class: cp
            public final /* synthetic */ AppDetailFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                String highResUrl;
                AppRateDto rate;
                List<RateDto> rates;
                int i22 = i5;
                AppDetailFragment appDetailFragment = this.b;
                switch (i22) {
                    case 0:
                        AppRatingModuleData appRatingModuleData = (AppRatingModuleData) obj;
                        int i32 = AppDetailFragment.M1;
                        js3.p(view, "view");
                        js3.p((d) qg5Var, "<unused var>");
                        js3.p(appRatingModuleData, "recyclerData");
                        appDetailFragment.U1();
                        boolean z = view instanceof MyketRatingBar;
                        dw1.y(z ? "review_stars_detail" : "review_write_detail");
                        ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                        clickEventBuilder.b("review_new_detail");
                        clickEventBuilder.a();
                        fw0 fw0VarU1 = appDetailFragment.U1();
                        ApplicationFullDto applicationFullDtoR = appDetailFragment.R1().R();
                        fw0VarU1.d(applicationFullDtoR.getPackageName(), applicationFullDtoR.getVersion().getCode(), applicationFullDtoR.getVersion().isIncompatible(), applicationFullDtoR.getForceUpdate());
                        AppDetailViewModel appDetailViewModelR1 = appDetailFragment.R1();
                        MyketRatingBar myketRatingBar = z ? (MyketRatingBar) view : null;
                        appDetailViewModelR1.W(myketRatingBar != null ? myketRatingBar.getRating() : 0.0f);
                        Bundle bundle = new Bundle();
                        hp hpVar2 = appDetailFragment.u1;
                        if (hpVar2 == null) {
                            js3.V("navArgs");
                            throw null;
                        }
                        bundle.putString("packageName", hpVar2.a);
                        bundle.putString("BUNDLE_KEY_EVENT_OK", "detail_dd_new_review_ok");
                        bundle.putString("BUNDLE_KEY_EVENT_CANCEL", "detail_dd_new_review_cancel");
                        AppDetailViewModel appDetailViewModelR12 = appDetailFragment.R1();
                        if (!appDetailViewModelR12.B.G(appDetailViewModelR12.J0.a)) {
                            pk5.g(appDetailFragment.J0, new NavIntentDirections.AlertBottom(new bd(new DialogDataModel(appDetailFragment.W1(), "DIALOG_KEY_SHOULD_BE_INSTALLED", bundle, 8), null, appDetailFragment.L(rs6.app_must_installed), appDetailFragment.L(rs6.download_app), appDetailFragment.L(rs6.button_cancel), true)), -1);
                            return;
                        }
                        ApplicationFullDto applicationFullDtoR2 = appDetailFragment.R1().R();
                        if (applicationFullDtoR2 != null) {
                            CommentScenario.SubmitReview submitReview = new CommentScenario.SubmitReview(new SubmitReviewData(applicationFullDtoR2.getPackageName(), ((Number) appRatingModuleData.b.getValue()).floatValue(), null, false, true, new ToolbarData(applicationFullDtoR2, appDetailFragment.R1().T(), appDetailFragment.R1().U(), appDetailFragment.R1().S()), "_detail", "DETAIL", 4, null));
                            FragmentActivity fragmentActivityF = appDetailFragment.F();
                            if (fragmentActivityF != null) {
                                pk5.c(fragmentActivityF, submitReview);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        AIReviewSummaryData aIReviewSummaryData = (AIReviewSummaryData) obj;
                        int i42 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(aIReviewSummaryData, "recyclerData");
                        appDetailFragment.R1().r(new AppDetailAction.ReviewAILikeAction(true, aIReviewSummaryData.a.getId()));
                        return;
                    case 2:
                        AIReviewSummaryData aIReviewSummaryData2 = (AIReviewSummaryData) obj;
                        int i52 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(aIReviewSummaryData2, "recyclerData");
                        appDetailFragment.R1().r(new AppDetailAction.ReviewAILikeAction(false, aIReviewSummaryData2.a.getId()));
                        return;
                    case 3:
                        int i6 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p((AIReviewSummaryData) obj, "<unused var>");
                        appDetailFragment.R1().r(AppDetailAction.ShowMoreAIAction.INSTANCE);
                        dw1.y("detail__ai_review_more_description");
                        return;
                    case 4:
                        AppDownloadData appDownloadData = (AppDownloadData) obj;
                        int i7 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(appDownloadData, "recyclerData");
                        sb7.p("AppDetail", "App Install Click", "Packagename: " + appDownloadData.g);
                        ApplicationFullDto applicationFullDtoR3 = appDetailFragment.R1().R();
                        if (applicationFullDtoR3 != null) {
                            appDetailFragment.Y1().C(new DownloadDataModel(applicationFullDtoR3, "detail", appDetailFragment.R1().T(), appDetailFragment.R1().S(), appDetailFragment.R1().U()));
                        }
                        dw1.y("button_install");
                        return;
                    case 5:
                        AppDownloadData appDownloadData2 = (AppDownloadData) obj;
                        int i8 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(appDownloadData2, "recyclerData");
                        sb7.p("AppDetail", "App Update Click", "Packagename: " + appDownloadData2.g);
                        ApplicationFullDto applicationFullDtoR4 = appDetailFragment.R1().R();
                        if (applicationFullDtoR4 != null) {
                            ps1 ps1Var = appDetailFragment.r1;
                            if (ps1Var == null) {
                                js3.V("downloadManager");
                                throw null;
                            }
                            AppDownloadInfo appDownloadInfoI = ps1Var.i(applicationFullDtoR4.getPackageName(), null);
                            if (wq2.l(applicationFullDtoR4.getSize().getLength(), appDownloadInfoI != null ? appDownloadInfoI.getLocalSize() : 0L)) {
                                appDetailFragment.j2();
                            } else {
                                appDetailFragment.S1();
                                ir.mservices.market.version2.manager.a.e(applicationFullDtoR4.getTitle(), applicationFullDtoR4.getIcon().getUrl());
                            }
                        }
                        dw1.y("detail_button_update");
                        return;
                    case 6:
                        AppDownloadData appDownloadData3 = (AppDownloadData) obj;
                        int i9 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(appDownloadData3, "recyclerData");
                        sb7.p("AppDetail", "App Run Click", "Packagename: " + appDownloadData3);
                        ClickEventBuilder clickEventBuilder2 = new ClickEventBuilder();
                        clickEventBuilder2.b("detail_button_run");
                        clickEventBuilder2.a();
                        ApplicationFullDto applicationFullDtoR5 = appDetailFragment.R1().R();
                        if (applicationFullDtoR5 != null) {
                            String strR = appDetailFragment.Y1().r(applicationFullDtoR5.getVersion().getCode(), applicationFullDtoR5.getPackageName());
                            if (strR != null && !f88.n0(strR)) {
                                Context contextH = appDetailFragment.H();
                                String packageName = applicationFullDtoR5.getPackageName();
                                Uri uri = Uri.parse(strR);
                                js3.o(uri, "parse(...)");
                                if (!js8.q(contextH, uri, packageName, null)) {
                                    dp3.M(applicationFullDtoR5.getPackageName());
                                }
                                appDetailFragment.Y1().e(applicationFullDtoR5.getVersion().getCode(), applicationFullDtoR5.getPackageName());
                                return;
                            }
                            if (!appDetailFragment.Y1().K(applicationFullDtoR5.getPackageName())) {
                                Context contextH2 = appDetailFragment.H();
                                hh2.H(new hh2(contextH2, contextH2 != null ? contextH2.getString(rs6.app_not_runnable) : null));
                                return;
                            }
                            ApplicationCheetahDto cheetah = applicationFullDtoR5.getCheetah();
                            if (cheetah == null || !cheetah.getEnable()) {
                                dp3.M(applicationFullDtoR5.getPackageName());
                                return;
                            } else {
                                pk5.g(appDetailFragment.J0, new NavIntentDirections.Cheetah(new eq0(applicationFullDtoR5.getPackageName(), applicationFullDtoR5.getIcon().getUrl(), false)), -1);
                                return;
                            }
                        }
                        return;
                    case 7:
                        AppSummaryTextData appSummaryTextData = (AppSummaryTextData) obj;
                        int i10 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((nt) qg5Var, "<unused var>");
                        js3.p(appSummaryTextData, "recyclerData");
                        ClickEventBuilder clickEventBuilder3 = new ClickEventBuilder();
                        SummaryTextDto summaryTextDto = appSummaryTextData.a;
                        clickEventBuilder3.b("app_detail_summary_" + summaryTextDto.getAnalyticId());
                        clickEventBuilder3.a();
                        if (summaryTextDto.getSummaryDialog() != null) {
                            appDetailFragment.d2(summaryTextDto.getSummaryDialog());
                            return;
                        }
                        String action = summaryTextDto.getAction();
                        if (action == null || f88.n0(action)) {
                            return;
                        }
                        Context contextH3 = appDetailFragment.H();
                        String action2 = summaryTextDto.getAction();
                        if (action2 != null) {
                            t61.v(action2, "parse(...)", contextH3, NearbyRepository.SERVICE_ID, null);
                            return;
                        }
                        return;
                    case 8:
                        AppSummaryIconData appSummaryIconData = (AppSummaryIconData) obj;
                        int i11 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((lt) qg5Var, "<unused var>");
                        js3.p(appSummaryIconData, "recyclerData");
                        ClickEventBuilder clickEventBuilder4 = new ClickEventBuilder();
                        SummaryIconDto summaryIconDto = appSummaryIconData.a;
                        clickEventBuilder4.b("app_detail_summary_" + summaryIconDto.getAnalyticId());
                        clickEventBuilder4.a();
                        if (summaryIconDto.getSummaryDialog() != null) {
                            appDetailFragment.d2(summaryIconDto.getSummaryDialog());
                            return;
                        }
                        String action3 = summaryIconDto.getAction();
                        if (action3 == null || f88.n0(action3)) {
                            return;
                        }
                        Context contextH4 = appDetailFragment.H();
                        String action4 = summaryIconDto.getAction();
                        if (action4 != null) {
                            t61.v(action4, "parse(...)", contextH4, NearbyRepository.SERVICE_ID, null);
                            return;
                        }
                        return;
                    case 9:
                        AppBarData appBarData = (AppBarData) obj;
                        int i12 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.app.detail.ui.recycler.a) qg5Var, "<unused var>");
                        js3.p(appBarData, "recyclerData");
                        ClickEventBuilder clickEventBuilder5 = new ClickEventBuilder();
                        clickEventBuilder5.b("detail_icon");
                        clickEventBuilder5.a();
                        AppBarSampleData appBarSampleData = (AppBarSampleData) appBarData.g.getValue();
                        if (appBarSampleData == null || (highResUrl = appBarSampleData.getHighResUrl()) == null) {
                            return;
                        }
                        FragmentActivity fragmentActivityF2 = appDetailFragment.F();
                        zt5 zt5Var = fragmentActivityF2 instanceof zt5 ? (zt5) fragmentActivityF2 : null;
                        if (zt5Var != null) {
                            ((LaunchContentActivity) zt5Var).s0(appDetailFragment.K().getDimensionPixelSize(pq6.margin_default_v2_triple), highResUrl);
                            return;
                        }
                        return;
                    case 10:
                        AppSummaryRateData appSummaryRateData = (AppSummaryRateData) obj;
                        int i13 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((mt) qg5Var, "<unused var>");
                        js3.p(appSummaryRateData, "recyclerData");
                        ClickEventBuilder clickEventBuilder6 = new ClickEventBuilder();
                        clickEventBuilder6.b("app_detail_summary_" + appSummaryRateData.a.getAnalyticId());
                        clickEventBuilder6.a();
                        ClickEventBuilder clickEventBuilder7 = new ClickEventBuilder();
                        clickEventBuilder7.b("detail_all_review_info");
                        clickEventBuilder7.a();
                        ApplicationFullDto applicationFullDtoR6 = appDetailFragment.R1().R();
                        if (applicationFullDtoR6 == null || (rate = applicationFullDtoR6.getRate()) == null || (rates = rate.getRates()) == null) {
                            return;
                        }
                        hp hpVar3 = appDetailFragment.u1;
                        if (hpVar3 != null) {
                            appDetailFragment.b2(hpVar3.a, rates);
                            return;
                        } else {
                            js3.V("navArgs");
                            throw null;
                        }
                    case 11:
                        AppSummarySizeData appSummarySizeData = (AppSummarySizeData) obj;
                        int i14 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((f) qg5Var, "<unused var>");
                        js3.p(appSummarySizeData, "recyclerData");
                        ClickEventBuilder clickEventBuilder8 = new ClickEventBuilder();
                        clickEventBuilder8.b("app_detail_summary_" + appSummarySizeData.c);
                        clickEventBuilder8.a();
                        SummaryDialogDto summaryDialogDto = appSummarySizeData.d;
                        if (summaryDialogDto != null) {
                            appDetailFragment.d2(summaryDialogDto);
                            return;
                        }
                        return;
                    case 12:
                        rc rcVar = (rc) qg5Var;
                        AddaxBoxData addaxBoxData = (AddaxBoxData) obj;
                        int i15 = AppDetailFragment.M1;
                        js3.p(view, "view");
                        js3.p(rcVar, "viewHolder");
                        js3.p(addaxBoxData, "recyclerData");
                        AddaxBoxDto addaxBoxDto = addaxBoxData.a;
                        ClickEventBuilder clickEventBuilder9 = new ClickEventBuilder();
                        clickEventBuilder9.b("addax_action_detail_" + addaxBoxDto.getId());
                        clickEventBuilder9.a();
                        ClickEventBuilder clickEventBuilder10 = new ClickEventBuilder();
                        clickEventBuilder10.b("addax_action_detail_" + addaxBoxDto.getId() + "_" + addaxBoxDto.getDisplayMode());
                        clickEventBuilder10.a();
                        FragmentActivity fragmentActivityF3 = appDetailFragment.F();
                        if (fragmentActivityF3 != null) {
                            new wv8(fragmentActivityF3, appDetailFragment.v1).m(view, rcVar, addaxBoxData);
                            return;
                        }
                        return;
                    default:
                        AppMoreDescriptionData appMoreDescriptionData = (AppMoreDescriptionData) obj;
                        int i16 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((ar) qg5Var, "<unused var>");
                        js3.p(appMoreDescriptionData, "recyclerData");
                        ApplicationFullDto applicationFullDtoR7 = appDetailFragment.R1().R();
                        if (applicationFullDtoR7 != null) {
                            pk5.g(appDetailFragment.J0, new NavIntentDirections.MoreDescription(new tx4(appMoreDescriptionData.a, new ToolbarData(applicationFullDtoR7, appDetailFragment.R1().T(), appDetailFragment.R1().U(), appDetailFragment.R1().S()))), -1);
                            return;
                        }
                        return;
                }
            }
        };
        final int i6 = 8;
        zoVar.d0 = new og5(this) { // from class: cp
            public final /* synthetic */ AppDetailFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                String highResUrl;
                AppRateDto rate;
                List<RateDto> rates;
                int i22 = i6;
                AppDetailFragment appDetailFragment = this.b;
                switch (i22) {
                    case 0:
                        AppRatingModuleData appRatingModuleData = (AppRatingModuleData) obj;
                        int i32 = AppDetailFragment.M1;
                        js3.p(view, "view");
                        js3.p((d) qg5Var, "<unused var>");
                        js3.p(appRatingModuleData, "recyclerData");
                        appDetailFragment.U1();
                        boolean z = view instanceof MyketRatingBar;
                        dw1.y(z ? "review_stars_detail" : "review_write_detail");
                        ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                        clickEventBuilder.b("review_new_detail");
                        clickEventBuilder.a();
                        fw0 fw0VarU1 = appDetailFragment.U1();
                        ApplicationFullDto applicationFullDtoR = appDetailFragment.R1().R();
                        fw0VarU1.d(applicationFullDtoR.getPackageName(), applicationFullDtoR.getVersion().getCode(), applicationFullDtoR.getVersion().isIncompatible(), applicationFullDtoR.getForceUpdate());
                        AppDetailViewModel appDetailViewModelR1 = appDetailFragment.R1();
                        MyketRatingBar myketRatingBar = z ? (MyketRatingBar) view : null;
                        appDetailViewModelR1.W(myketRatingBar != null ? myketRatingBar.getRating() : 0.0f);
                        Bundle bundle = new Bundle();
                        hp hpVar2 = appDetailFragment.u1;
                        if (hpVar2 == null) {
                            js3.V("navArgs");
                            throw null;
                        }
                        bundle.putString("packageName", hpVar2.a);
                        bundle.putString("BUNDLE_KEY_EVENT_OK", "detail_dd_new_review_ok");
                        bundle.putString("BUNDLE_KEY_EVENT_CANCEL", "detail_dd_new_review_cancel");
                        AppDetailViewModel appDetailViewModelR12 = appDetailFragment.R1();
                        if (!appDetailViewModelR12.B.G(appDetailViewModelR12.J0.a)) {
                            pk5.g(appDetailFragment.J0, new NavIntentDirections.AlertBottom(new bd(new DialogDataModel(appDetailFragment.W1(), "DIALOG_KEY_SHOULD_BE_INSTALLED", bundle, 8), null, appDetailFragment.L(rs6.app_must_installed), appDetailFragment.L(rs6.download_app), appDetailFragment.L(rs6.button_cancel), true)), -1);
                            return;
                        }
                        ApplicationFullDto applicationFullDtoR2 = appDetailFragment.R1().R();
                        if (applicationFullDtoR2 != null) {
                            CommentScenario.SubmitReview submitReview = new CommentScenario.SubmitReview(new SubmitReviewData(applicationFullDtoR2.getPackageName(), ((Number) appRatingModuleData.b.getValue()).floatValue(), null, false, true, new ToolbarData(applicationFullDtoR2, appDetailFragment.R1().T(), appDetailFragment.R1().U(), appDetailFragment.R1().S()), "_detail", "DETAIL", 4, null));
                            FragmentActivity fragmentActivityF = appDetailFragment.F();
                            if (fragmentActivityF != null) {
                                pk5.c(fragmentActivityF, submitReview);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        AIReviewSummaryData aIReviewSummaryData = (AIReviewSummaryData) obj;
                        int i42 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(aIReviewSummaryData, "recyclerData");
                        appDetailFragment.R1().r(new AppDetailAction.ReviewAILikeAction(true, aIReviewSummaryData.a.getId()));
                        return;
                    case 2:
                        AIReviewSummaryData aIReviewSummaryData2 = (AIReviewSummaryData) obj;
                        int i52 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(aIReviewSummaryData2, "recyclerData");
                        appDetailFragment.R1().r(new AppDetailAction.ReviewAILikeAction(false, aIReviewSummaryData2.a.getId()));
                        return;
                    case 3:
                        int i62 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p((AIReviewSummaryData) obj, "<unused var>");
                        appDetailFragment.R1().r(AppDetailAction.ShowMoreAIAction.INSTANCE);
                        dw1.y("detail__ai_review_more_description");
                        return;
                    case 4:
                        AppDownloadData appDownloadData = (AppDownloadData) obj;
                        int i7 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(appDownloadData, "recyclerData");
                        sb7.p("AppDetail", "App Install Click", "Packagename: " + appDownloadData.g);
                        ApplicationFullDto applicationFullDtoR3 = appDetailFragment.R1().R();
                        if (applicationFullDtoR3 != null) {
                            appDetailFragment.Y1().C(new DownloadDataModel(applicationFullDtoR3, "detail", appDetailFragment.R1().T(), appDetailFragment.R1().S(), appDetailFragment.R1().U()));
                        }
                        dw1.y("button_install");
                        return;
                    case 5:
                        AppDownloadData appDownloadData2 = (AppDownloadData) obj;
                        int i8 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(appDownloadData2, "recyclerData");
                        sb7.p("AppDetail", "App Update Click", "Packagename: " + appDownloadData2.g);
                        ApplicationFullDto applicationFullDtoR4 = appDetailFragment.R1().R();
                        if (applicationFullDtoR4 != null) {
                            ps1 ps1Var = appDetailFragment.r1;
                            if (ps1Var == null) {
                                js3.V("downloadManager");
                                throw null;
                            }
                            AppDownloadInfo appDownloadInfoI = ps1Var.i(applicationFullDtoR4.getPackageName(), null);
                            if (wq2.l(applicationFullDtoR4.getSize().getLength(), appDownloadInfoI != null ? appDownloadInfoI.getLocalSize() : 0L)) {
                                appDetailFragment.j2();
                            } else {
                                appDetailFragment.S1();
                                ir.mservices.market.version2.manager.a.e(applicationFullDtoR4.getTitle(), applicationFullDtoR4.getIcon().getUrl());
                            }
                        }
                        dw1.y("detail_button_update");
                        return;
                    case 6:
                        AppDownloadData appDownloadData3 = (AppDownloadData) obj;
                        int i9 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(appDownloadData3, "recyclerData");
                        sb7.p("AppDetail", "App Run Click", "Packagename: " + appDownloadData3);
                        ClickEventBuilder clickEventBuilder2 = new ClickEventBuilder();
                        clickEventBuilder2.b("detail_button_run");
                        clickEventBuilder2.a();
                        ApplicationFullDto applicationFullDtoR5 = appDetailFragment.R1().R();
                        if (applicationFullDtoR5 != null) {
                            String strR = appDetailFragment.Y1().r(applicationFullDtoR5.getVersion().getCode(), applicationFullDtoR5.getPackageName());
                            if (strR != null && !f88.n0(strR)) {
                                Context contextH = appDetailFragment.H();
                                String packageName = applicationFullDtoR5.getPackageName();
                                Uri uri = Uri.parse(strR);
                                js3.o(uri, "parse(...)");
                                if (!js8.q(contextH, uri, packageName, null)) {
                                    dp3.M(applicationFullDtoR5.getPackageName());
                                }
                                appDetailFragment.Y1().e(applicationFullDtoR5.getVersion().getCode(), applicationFullDtoR5.getPackageName());
                                return;
                            }
                            if (!appDetailFragment.Y1().K(applicationFullDtoR5.getPackageName())) {
                                Context contextH2 = appDetailFragment.H();
                                hh2.H(new hh2(contextH2, contextH2 != null ? contextH2.getString(rs6.app_not_runnable) : null));
                                return;
                            }
                            ApplicationCheetahDto cheetah = applicationFullDtoR5.getCheetah();
                            if (cheetah == null || !cheetah.getEnable()) {
                                dp3.M(applicationFullDtoR5.getPackageName());
                                return;
                            } else {
                                pk5.g(appDetailFragment.J0, new NavIntentDirections.Cheetah(new eq0(applicationFullDtoR5.getPackageName(), applicationFullDtoR5.getIcon().getUrl(), false)), -1);
                                return;
                            }
                        }
                        return;
                    case 7:
                        AppSummaryTextData appSummaryTextData = (AppSummaryTextData) obj;
                        int i10 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((nt) qg5Var, "<unused var>");
                        js3.p(appSummaryTextData, "recyclerData");
                        ClickEventBuilder clickEventBuilder3 = new ClickEventBuilder();
                        SummaryTextDto summaryTextDto = appSummaryTextData.a;
                        clickEventBuilder3.b("app_detail_summary_" + summaryTextDto.getAnalyticId());
                        clickEventBuilder3.a();
                        if (summaryTextDto.getSummaryDialog() != null) {
                            appDetailFragment.d2(summaryTextDto.getSummaryDialog());
                            return;
                        }
                        String action = summaryTextDto.getAction();
                        if (action == null || f88.n0(action)) {
                            return;
                        }
                        Context contextH3 = appDetailFragment.H();
                        String action2 = summaryTextDto.getAction();
                        if (action2 != null) {
                            t61.v(action2, "parse(...)", contextH3, NearbyRepository.SERVICE_ID, null);
                            return;
                        }
                        return;
                    case 8:
                        AppSummaryIconData appSummaryIconData = (AppSummaryIconData) obj;
                        int i11 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((lt) qg5Var, "<unused var>");
                        js3.p(appSummaryIconData, "recyclerData");
                        ClickEventBuilder clickEventBuilder4 = new ClickEventBuilder();
                        SummaryIconDto summaryIconDto = appSummaryIconData.a;
                        clickEventBuilder4.b("app_detail_summary_" + summaryIconDto.getAnalyticId());
                        clickEventBuilder4.a();
                        if (summaryIconDto.getSummaryDialog() != null) {
                            appDetailFragment.d2(summaryIconDto.getSummaryDialog());
                            return;
                        }
                        String action3 = summaryIconDto.getAction();
                        if (action3 == null || f88.n0(action3)) {
                            return;
                        }
                        Context contextH4 = appDetailFragment.H();
                        String action4 = summaryIconDto.getAction();
                        if (action4 != null) {
                            t61.v(action4, "parse(...)", contextH4, NearbyRepository.SERVICE_ID, null);
                            return;
                        }
                        return;
                    case 9:
                        AppBarData appBarData = (AppBarData) obj;
                        int i12 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.app.detail.ui.recycler.a) qg5Var, "<unused var>");
                        js3.p(appBarData, "recyclerData");
                        ClickEventBuilder clickEventBuilder5 = new ClickEventBuilder();
                        clickEventBuilder5.b("detail_icon");
                        clickEventBuilder5.a();
                        AppBarSampleData appBarSampleData = (AppBarSampleData) appBarData.g.getValue();
                        if (appBarSampleData == null || (highResUrl = appBarSampleData.getHighResUrl()) == null) {
                            return;
                        }
                        FragmentActivity fragmentActivityF2 = appDetailFragment.F();
                        zt5 zt5Var = fragmentActivityF2 instanceof zt5 ? (zt5) fragmentActivityF2 : null;
                        if (zt5Var != null) {
                            ((LaunchContentActivity) zt5Var).s0(appDetailFragment.K().getDimensionPixelSize(pq6.margin_default_v2_triple), highResUrl);
                            return;
                        }
                        return;
                    case 10:
                        AppSummaryRateData appSummaryRateData = (AppSummaryRateData) obj;
                        int i13 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((mt) qg5Var, "<unused var>");
                        js3.p(appSummaryRateData, "recyclerData");
                        ClickEventBuilder clickEventBuilder6 = new ClickEventBuilder();
                        clickEventBuilder6.b("app_detail_summary_" + appSummaryRateData.a.getAnalyticId());
                        clickEventBuilder6.a();
                        ClickEventBuilder clickEventBuilder7 = new ClickEventBuilder();
                        clickEventBuilder7.b("detail_all_review_info");
                        clickEventBuilder7.a();
                        ApplicationFullDto applicationFullDtoR6 = appDetailFragment.R1().R();
                        if (applicationFullDtoR6 == null || (rate = applicationFullDtoR6.getRate()) == null || (rates = rate.getRates()) == null) {
                            return;
                        }
                        hp hpVar3 = appDetailFragment.u1;
                        if (hpVar3 != null) {
                            appDetailFragment.b2(hpVar3.a, rates);
                            return;
                        } else {
                            js3.V("navArgs");
                            throw null;
                        }
                    case 11:
                        AppSummarySizeData appSummarySizeData = (AppSummarySizeData) obj;
                        int i14 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((f) qg5Var, "<unused var>");
                        js3.p(appSummarySizeData, "recyclerData");
                        ClickEventBuilder clickEventBuilder8 = new ClickEventBuilder();
                        clickEventBuilder8.b("app_detail_summary_" + appSummarySizeData.c);
                        clickEventBuilder8.a();
                        SummaryDialogDto summaryDialogDto = appSummarySizeData.d;
                        if (summaryDialogDto != null) {
                            appDetailFragment.d2(summaryDialogDto);
                            return;
                        }
                        return;
                    case 12:
                        rc rcVar = (rc) qg5Var;
                        AddaxBoxData addaxBoxData = (AddaxBoxData) obj;
                        int i15 = AppDetailFragment.M1;
                        js3.p(view, "view");
                        js3.p(rcVar, "viewHolder");
                        js3.p(addaxBoxData, "recyclerData");
                        AddaxBoxDto addaxBoxDto = addaxBoxData.a;
                        ClickEventBuilder clickEventBuilder9 = new ClickEventBuilder();
                        clickEventBuilder9.b("addax_action_detail_" + addaxBoxDto.getId());
                        clickEventBuilder9.a();
                        ClickEventBuilder clickEventBuilder10 = new ClickEventBuilder();
                        clickEventBuilder10.b("addax_action_detail_" + addaxBoxDto.getId() + "_" + addaxBoxDto.getDisplayMode());
                        clickEventBuilder10.a();
                        FragmentActivity fragmentActivityF3 = appDetailFragment.F();
                        if (fragmentActivityF3 != null) {
                            new wv8(fragmentActivityF3, appDetailFragment.v1).m(view, rcVar, addaxBoxData);
                            return;
                        }
                        return;
                    default:
                        AppMoreDescriptionData appMoreDescriptionData = (AppMoreDescriptionData) obj;
                        int i16 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((ar) qg5Var, "<unused var>");
                        js3.p(appMoreDescriptionData, "recyclerData");
                        ApplicationFullDto applicationFullDtoR7 = appDetailFragment.R1().R();
                        if (applicationFullDtoR7 != null) {
                            pk5.g(appDetailFragment.J0, new NavIntentDirections.MoreDescription(new tx4(appMoreDescriptionData.a, new ToolbarData(applicationFullDtoR7, appDetailFragment.R1().T(), appDetailFragment.R1().U(), appDetailFragment.R1().S()))), -1);
                            return;
                        }
                        return;
                }
            }
        };
        final int i7 = 10;
        zoVar.e0 = new og5(this) { // from class: cp
            public final /* synthetic */ AppDetailFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                String highResUrl;
                AppRateDto rate;
                List<RateDto> rates;
                int i22 = i7;
                AppDetailFragment appDetailFragment = this.b;
                switch (i22) {
                    case 0:
                        AppRatingModuleData appRatingModuleData = (AppRatingModuleData) obj;
                        int i32 = AppDetailFragment.M1;
                        js3.p(view, "view");
                        js3.p((d) qg5Var, "<unused var>");
                        js3.p(appRatingModuleData, "recyclerData");
                        appDetailFragment.U1();
                        boolean z = view instanceof MyketRatingBar;
                        dw1.y(z ? "review_stars_detail" : "review_write_detail");
                        ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                        clickEventBuilder.b("review_new_detail");
                        clickEventBuilder.a();
                        fw0 fw0VarU1 = appDetailFragment.U1();
                        ApplicationFullDto applicationFullDtoR = appDetailFragment.R1().R();
                        fw0VarU1.d(applicationFullDtoR.getPackageName(), applicationFullDtoR.getVersion().getCode(), applicationFullDtoR.getVersion().isIncompatible(), applicationFullDtoR.getForceUpdate());
                        AppDetailViewModel appDetailViewModelR1 = appDetailFragment.R1();
                        MyketRatingBar myketRatingBar = z ? (MyketRatingBar) view : null;
                        appDetailViewModelR1.W(myketRatingBar != null ? myketRatingBar.getRating() : 0.0f);
                        Bundle bundle = new Bundle();
                        hp hpVar2 = appDetailFragment.u1;
                        if (hpVar2 == null) {
                            js3.V("navArgs");
                            throw null;
                        }
                        bundle.putString("packageName", hpVar2.a);
                        bundle.putString("BUNDLE_KEY_EVENT_OK", "detail_dd_new_review_ok");
                        bundle.putString("BUNDLE_KEY_EVENT_CANCEL", "detail_dd_new_review_cancel");
                        AppDetailViewModel appDetailViewModelR12 = appDetailFragment.R1();
                        if (!appDetailViewModelR12.B.G(appDetailViewModelR12.J0.a)) {
                            pk5.g(appDetailFragment.J0, new NavIntentDirections.AlertBottom(new bd(new DialogDataModel(appDetailFragment.W1(), "DIALOG_KEY_SHOULD_BE_INSTALLED", bundle, 8), null, appDetailFragment.L(rs6.app_must_installed), appDetailFragment.L(rs6.download_app), appDetailFragment.L(rs6.button_cancel), true)), -1);
                            return;
                        }
                        ApplicationFullDto applicationFullDtoR2 = appDetailFragment.R1().R();
                        if (applicationFullDtoR2 != null) {
                            CommentScenario.SubmitReview submitReview = new CommentScenario.SubmitReview(new SubmitReviewData(applicationFullDtoR2.getPackageName(), ((Number) appRatingModuleData.b.getValue()).floatValue(), null, false, true, new ToolbarData(applicationFullDtoR2, appDetailFragment.R1().T(), appDetailFragment.R1().U(), appDetailFragment.R1().S()), "_detail", "DETAIL", 4, null));
                            FragmentActivity fragmentActivityF = appDetailFragment.F();
                            if (fragmentActivityF != null) {
                                pk5.c(fragmentActivityF, submitReview);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        AIReviewSummaryData aIReviewSummaryData = (AIReviewSummaryData) obj;
                        int i42 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(aIReviewSummaryData, "recyclerData");
                        appDetailFragment.R1().r(new AppDetailAction.ReviewAILikeAction(true, aIReviewSummaryData.a.getId()));
                        return;
                    case 2:
                        AIReviewSummaryData aIReviewSummaryData2 = (AIReviewSummaryData) obj;
                        int i52 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(aIReviewSummaryData2, "recyclerData");
                        appDetailFragment.R1().r(new AppDetailAction.ReviewAILikeAction(false, aIReviewSummaryData2.a.getId()));
                        return;
                    case 3:
                        int i62 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p((AIReviewSummaryData) obj, "<unused var>");
                        appDetailFragment.R1().r(AppDetailAction.ShowMoreAIAction.INSTANCE);
                        dw1.y("detail__ai_review_more_description");
                        return;
                    case 4:
                        AppDownloadData appDownloadData = (AppDownloadData) obj;
                        int i72 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(appDownloadData, "recyclerData");
                        sb7.p("AppDetail", "App Install Click", "Packagename: " + appDownloadData.g);
                        ApplicationFullDto applicationFullDtoR3 = appDetailFragment.R1().R();
                        if (applicationFullDtoR3 != null) {
                            appDetailFragment.Y1().C(new DownloadDataModel(applicationFullDtoR3, "detail", appDetailFragment.R1().T(), appDetailFragment.R1().S(), appDetailFragment.R1().U()));
                        }
                        dw1.y("button_install");
                        return;
                    case 5:
                        AppDownloadData appDownloadData2 = (AppDownloadData) obj;
                        int i8 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(appDownloadData2, "recyclerData");
                        sb7.p("AppDetail", "App Update Click", "Packagename: " + appDownloadData2.g);
                        ApplicationFullDto applicationFullDtoR4 = appDetailFragment.R1().R();
                        if (applicationFullDtoR4 != null) {
                            ps1 ps1Var = appDetailFragment.r1;
                            if (ps1Var == null) {
                                js3.V("downloadManager");
                                throw null;
                            }
                            AppDownloadInfo appDownloadInfoI = ps1Var.i(applicationFullDtoR4.getPackageName(), null);
                            if (wq2.l(applicationFullDtoR4.getSize().getLength(), appDownloadInfoI != null ? appDownloadInfoI.getLocalSize() : 0L)) {
                                appDetailFragment.j2();
                            } else {
                                appDetailFragment.S1();
                                ir.mservices.market.version2.manager.a.e(applicationFullDtoR4.getTitle(), applicationFullDtoR4.getIcon().getUrl());
                            }
                        }
                        dw1.y("detail_button_update");
                        return;
                    case 6:
                        AppDownloadData appDownloadData3 = (AppDownloadData) obj;
                        int i9 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(appDownloadData3, "recyclerData");
                        sb7.p("AppDetail", "App Run Click", "Packagename: " + appDownloadData3);
                        ClickEventBuilder clickEventBuilder2 = new ClickEventBuilder();
                        clickEventBuilder2.b("detail_button_run");
                        clickEventBuilder2.a();
                        ApplicationFullDto applicationFullDtoR5 = appDetailFragment.R1().R();
                        if (applicationFullDtoR5 != null) {
                            String strR = appDetailFragment.Y1().r(applicationFullDtoR5.getVersion().getCode(), applicationFullDtoR5.getPackageName());
                            if (strR != null && !f88.n0(strR)) {
                                Context contextH = appDetailFragment.H();
                                String packageName = applicationFullDtoR5.getPackageName();
                                Uri uri = Uri.parse(strR);
                                js3.o(uri, "parse(...)");
                                if (!js8.q(contextH, uri, packageName, null)) {
                                    dp3.M(applicationFullDtoR5.getPackageName());
                                }
                                appDetailFragment.Y1().e(applicationFullDtoR5.getVersion().getCode(), applicationFullDtoR5.getPackageName());
                                return;
                            }
                            if (!appDetailFragment.Y1().K(applicationFullDtoR5.getPackageName())) {
                                Context contextH2 = appDetailFragment.H();
                                hh2.H(new hh2(contextH2, contextH2 != null ? contextH2.getString(rs6.app_not_runnable) : null));
                                return;
                            }
                            ApplicationCheetahDto cheetah = applicationFullDtoR5.getCheetah();
                            if (cheetah == null || !cheetah.getEnable()) {
                                dp3.M(applicationFullDtoR5.getPackageName());
                                return;
                            } else {
                                pk5.g(appDetailFragment.J0, new NavIntentDirections.Cheetah(new eq0(applicationFullDtoR5.getPackageName(), applicationFullDtoR5.getIcon().getUrl(), false)), -1);
                                return;
                            }
                        }
                        return;
                    case 7:
                        AppSummaryTextData appSummaryTextData = (AppSummaryTextData) obj;
                        int i10 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((nt) qg5Var, "<unused var>");
                        js3.p(appSummaryTextData, "recyclerData");
                        ClickEventBuilder clickEventBuilder3 = new ClickEventBuilder();
                        SummaryTextDto summaryTextDto = appSummaryTextData.a;
                        clickEventBuilder3.b("app_detail_summary_" + summaryTextDto.getAnalyticId());
                        clickEventBuilder3.a();
                        if (summaryTextDto.getSummaryDialog() != null) {
                            appDetailFragment.d2(summaryTextDto.getSummaryDialog());
                            return;
                        }
                        String action = summaryTextDto.getAction();
                        if (action == null || f88.n0(action)) {
                            return;
                        }
                        Context contextH3 = appDetailFragment.H();
                        String action2 = summaryTextDto.getAction();
                        if (action2 != null) {
                            t61.v(action2, "parse(...)", contextH3, NearbyRepository.SERVICE_ID, null);
                            return;
                        }
                        return;
                    case 8:
                        AppSummaryIconData appSummaryIconData = (AppSummaryIconData) obj;
                        int i11 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((lt) qg5Var, "<unused var>");
                        js3.p(appSummaryIconData, "recyclerData");
                        ClickEventBuilder clickEventBuilder4 = new ClickEventBuilder();
                        SummaryIconDto summaryIconDto = appSummaryIconData.a;
                        clickEventBuilder4.b("app_detail_summary_" + summaryIconDto.getAnalyticId());
                        clickEventBuilder4.a();
                        if (summaryIconDto.getSummaryDialog() != null) {
                            appDetailFragment.d2(summaryIconDto.getSummaryDialog());
                            return;
                        }
                        String action3 = summaryIconDto.getAction();
                        if (action3 == null || f88.n0(action3)) {
                            return;
                        }
                        Context contextH4 = appDetailFragment.H();
                        String action4 = summaryIconDto.getAction();
                        if (action4 != null) {
                            t61.v(action4, "parse(...)", contextH4, NearbyRepository.SERVICE_ID, null);
                            return;
                        }
                        return;
                    case 9:
                        AppBarData appBarData = (AppBarData) obj;
                        int i12 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.app.detail.ui.recycler.a) qg5Var, "<unused var>");
                        js3.p(appBarData, "recyclerData");
                        ClickEventBuilder clickEventBuilder5 = new ClickEventBuilder();
                        clickEventBuilder5.b("detail_icon");
                        clickEventBuilder5.a();
                        AppBarSampleData appBarSampleData = (AppBarSampleData) appBarData.g.getValue();
                        if (appBarSampleData == null || (highResUrl = appBarSampleData.getHighResUrl()) == null) {
                            return;
                        }
                        FragmentActivity fragmentActivityF2 = appDetailFragment.F();
                        zt5 zt5Var = fragmentActivityF2 instanceof zt5 ? (zt5) fragmentActivityF2 : null;
                        if (zt5Var != null) {
                            ((LaunchContentActivity) zt5Var).s0(appDetailFragment.K().getDimensionPixelSize(pq6.margin_default_v2_triple), highResUrl);
                            return;
                        }
                        return;
                    case 10:
                        AppSummaryRateData appSummaryRateData = (AppSummaryRateData) obj;
                        int i13 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((mt) qg5Var, "<unused var>");
                        js3.p(appSummaryRateData, "recyclerData");
                        ClickEventBuilder clickEventBuilder6 = new ClickEventBuilder();
                        clickEventBuilder6.b("app_detail_summary_" + appSummaryRateData.a.getAnalyticId());
                        clickEventBuilder6.a();
                        ClickEventBuilder clickEventBuilder7 = new ClickEventBuilder();
                        clickEventBuilder7.b("detail_all_review_info");
                        clickEventBuilder7.a();
                        ApplicationFullDto applicationFullDtoR6 = appDetailFragment.R1().R();
                        if (applicationFullDtoR6 == null || (rate = applicationFullDtoR6.getRate()) == null || (rates = rate.getRates()) == null) {
                            return;
                        }
                        hp hpVar3 = appDetailFragment.u1;
                        if (hpVar3 != null) {
                            appDetailFragment.b2(hpVar3.a, rates);
                            return;
                        } else {
                            js3.V("navArgs");
                            throw null;
                        }
                    case 11:
                        AppSummarySizeData appSummarySizeData = (AppSummarySizeData) obj;
                        int i14 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((f) qg5Var, "<unused var>");
                        js3.p(appSummarySizeData, "recyclerData");
                        ClickEventBuilder clickEventBuilder8 = new ClickEventBuilder();
                        clickEventBuilder8.b("app_detail_summary_" + appSummarySizeData.c);
                        clickEventBuilder8.a();
                        SummaryDialogDto summaryDialogDto = appSummarySizeData.d;
                        if (summaryDialogDto != null) {
                            appDetailFragment.d2(summaryDialogDto);
                            return;
                        }
                        return;
                    case 12:
                        rc rcVar = (rc) qg5Var;
                        AddaxBoxData addaxBoxData = (AddaxBoxData) obj;
                        int i15 = AppDetailFragment.M1;
                        js3.p(view, "view");
                        js3.p(rcVar, "viewHolder");
                        js3.p(addaxBoxData, "recyclerData");
                        AddaxBoxDto addaxBoxDto = addaxBoxData.a;
                        ClickEventBuilder clickEventBuilder9 = new ClickEventBuilder();
                        clickEventBuilder9.b("addax_action_detail_" + addaxBoxDto.getId());
                        clickEventBuilder9.a();
                        ClickEventBuilder clickEventBuilder10 = new ClickEventBuilder();
                        clickEventBuilder10.b("addax_action_detail_" + addaxBoxDto.getId() + "_" + addaxBoxDto.getDisplayMode());
                        clickEventBuilder10.a();
                        FragmentActivity fragmentActivityF3 = appDetailFragment.F();
                        if (fragmentActivityF3 != null) {
                            new wv8(fragmentActivityF3, appDetailFragment.v1).m(view, rcVar, addaxBoxData);
                            return;
                        }
                        return;
                    default:
                        AppMoreDescriptionData appMoreDescriptionData = (AppMoreDescriptionData) obj;
                        int i16 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((ar) qg5Var, "<unused var>");
                        js3.p(appMoreDescriptionData, "recyclerData");
                        ApplicationFullDto applicationFullDtoR7 = appDetailFragment.R1().R();
                        if (applicationFullDtoR7 != null) {
                            pk5.g(appDetailFragment.J0, new NavIntentDirections.MoreDescription(new tx4(appMoreDescriptionData.a, new ToolbarData(applicationFullDtoR7, appDetailFragment.R1().T(), appDetailFragment.R1().U(), appDetailFragment.R1().S()))), -1);
                            return;
                        }
                        return;
                }
            }
        };
        final int i8 = 11;
        zoVar.f0 = new og5(this) { // from class: cp
            public final /* synthetic */ AppDetailFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                String highResUrl;
                AppRateDto rate;
                List<RateDto> rates;
                int i22 = i8;
                AppDetailFragment appDetailFragment = this.b;
                switch (i22) {
                    case 0:
                        AppRatingModuleData appRatingModuleData = (AppRatingModuleData) obj;
                        int i32 = AppDetailFragment.M1;
                        js3.p(view, "view");
                        js3.p((d) qg5Var, "<unused var>");
                        js3.p(appRatingModuleData, "recyclerData");
                        appDetailFragment.U1();
                        boolean z = view instanceof MyketRatingBar;
                        dw1.y(z ? "review_stars_detail" : "review_write_detail");
                        ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                        clickEventBuilder.b("review_new_detail");
                        clickEventBuilder.a();
                        fw0 fw0VarU1 = appDetailFragment.U1();
                        ApplicationFullDto applicationFullDtoR = appDetailFragment.R1().R();
                        fw0VarU1.d(applicationFullDtoR.getPackageName(), applicationFullDtoR.getVersion().getCode(), applicationFullDtoR.getVersion().isIncompatible(), applicationFullDtoR.getForceUpdate());
                        AppDetailViewModel appDetailViewModelR1 = appDetailFragment.R1();
                        MyketRatingBar myketRatingBar = z ? (MyketRatingBar) view : null;
                        appDetailViewModelR1.W(myketRatingBar != null ? myketRatingBar.getRating() : 0.0f);
                        Bundle bundle = new Bundle();
                        hp hpVar2 = appDetailFragment.u1;
                        if (hpVar2 == null) {
                            js3.V("navArgs");
                            throw null;
                        }
                        bundle.putString("packageName", hpVar2.a);
                        bundle.putString("BUNDLE_KEY_EVENT_OK", "detail_dd_new_review_ok");
                        bundle.putString("BUNDLE_KEY_EVENT_CANCEL", "detail_dd_new_review_cancel");
                        AppDetailViewModel appDetailViewModelR12 = appDetailFragment.R1();
                        if (!appDetailViewModelR12.B.G(appDetailViewModelR12.J0.a)) {
                            pk5.g(appDetailFragment.J0, new NavIntentDirections.AlertBottom(new bd(new DialogDataModel(appDetailFragment.W1(), "DIALOG_KEY_SHOULD_BE_INSTALLED", bundle, 8), null, appDetailFragment.L(rs6.app_must_installed), appDetailFragment.L(rs6.download_app), appDetailFragment.L(rs6.button_cancel), true)), -1);
                            return;
                        }
                        ApplicationFullDto applicationFullDtoR2 = appDetailFragment.R1().R();
                        if (applicationFullDtoR2 != null) {
                            CommentScenario.SubmitReview submitReview = new CommentScenario.SubmitReview(new SubmitReviewData(applicationFullDtoR2.getPackageName(), ((Number) appRatingModuleData.b.getValue()).floatValue(), null, false, true, new ToolbarData(applicationFullDtoR2, appDetailFragment.R1().T(), appDetailFragment.R1().U(), appDetailFragment.R1().S()), "_detail", "DETAIL", 4, null));
                            FragmentActivity fragmentActivityF = appDetailFragment.F();
                            if (fragmentActivityF != null) {
                                pk5.c(fragmentActivityF, submitReview);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        AIReviewSummaryData aIReviewSummaryData = (AIReviewSummaryData) obj;
                        int i42 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(aIReviewSummaryData, "recyclerData");
                        appDetailFragment.R1().r(new AppDetailAction.ReviewAILikeAction(true, aIReviewSummaryData.a.getId()));
                        return;
                    case 2:
                        AIReviewSummaryData aIReviewSummaryData2 = (AIReviewSummaryData) obj;
                        int i52 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(aIReviewSummaryData2, "recyclerData");
                        appDetailFragment.R1().r(new AppDetailAction.ReviewAILikeAction(false, aIReviewSummaryData2.a.getId()));
                        return;
                    case 3:
                        int i62 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p((AIReviewSummaryData) obj, "<unused var>");
                        appDetailFragment.R1().r(AppDetailAction.ShowMoreAIAction.INSTANCE);
                        dw1.y("detail__ai_review_more_description");
                        return;
                    case 4:
                        AppDownloadData appDownloadData = (AppDownloadData) obj;
                        int i72 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(appDownloadData, "recyclerData");
                        sb7.p("AppDetail", "App Install Click", "Packagename: " + appDownloadData.g);
                        ApplicationFullDto applicationFullDtoR3 = appDetailFragment.R1().R();
                        if (applicationFullDtoR3 != null) {
                            appDetailFragment.Y1().C(new DownloadDataModel(applicationFullDtoR3, "detail", appDetailFragment.R1().T(), appDetailFragment.R1().S(), appDetailFragment.R1().U()));
                        }
                        dw1.y("button_install");
                        return;
                    case 5:
                        AppDownloadData appDownloadData2 = (AppDownloadData) obj;
                        int i82 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(appDownloadData2, "recyclerData");
                        sb7.p("AppDetail", "App Update Click", "Packagename: " + appDownloadData2.g);
                        ApplicationFullDto applicationFullDtoR4 = appDetailFragment.R1().R();
                        if (applicationFullDtoR4 != null) {
                            ps1 ps1Var = appDetailFragment.r1;
                            if (ps1Var == null) {
                                js3.V("downloadManager");
                                throw null;
                            }
                            AppDownloadInfo appDownloadInfoI = ps1Var.i(applicationFullDtoR4.getPackageName(), null);
                            if (wq2.l(applicationFullDtoR4.getSize().getLength(), appDownloadInfoI != null ? appDownloadInfoI.getLocalSize() : 0L)) {
                                appDetailFragment.j2();
                            } else {
                                appDetailFragment.S1();
                                ir.mservices.market.version2.manager.a.e(applicationFullDtoR4.getTitle(), applicationFullDtoR4.getIcon().getUrl());
                            }
                        }
                        dw1.y("detail_button_update");
                        return;
                    case 6:
                        AppDownloadData appDownloadData3 = (AppDownloadData) obj;
                        int i9 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(appDownloadData3, "recyclerData");
                        sb7.p("AppDetail", "App Run Click", "Packagename: " + appDownloadData3);
                        ClickEventBuilder clickEventBuilder2 = new ClickEventBuilder();
                        clickEventBuilder2.b("detail_button_run");
                        clickEventBuilder2.a();
                        ApplicationFullDto applicationFullDtoR5 = appDetailFragment.R1().R();
                        if (applicationFullDtoR5 != null) {
                            String strR = appDetailFragment.Y1().r(applicationFullDtoR5.getVersion().getCode(), applicationFullDtoR5.getPackageName());
                            if (strR != null && !f88.n0(strR)) {
                                Context contextH = appDetailFragment.H();
                                String packageName = applicationFullDtoR5.getPackageName();
                                Uri uri = Uri.parse(strR);
                                js3.o(uri, "parse(...)");
                                if (!js8.q(contextH, uri, packageName, null)) {
                                    dp3.M(applicationFullDtoR5.getPackageName());
                                }
                                appDetailFragment.Y1().e(applicationFullDtoR5.getVersion().getCode(), applicationFullDtoR5.getPackageName());
                                return;
                            }
                            if (!appDetailFragment.Y1().K(applicationFullDtoR5.getPackageName())) {
                                Context contextH2 = appDetailFragment.H();
                                hh2.H(new hh2(contextH2, contextH2 != null ? contextH2.getString(rs6.app_not_runnable) : null));
                                return;
                            }
                            ApplicationCheetahDto cheetah = applicationFullDtoR5.getCheetah();
                            if (cheetah == null || !cheetah.getEnable()) {
                                dp3.M(applicationFullDtoR5.getPackageName());
                                return;
                            } else {
                                pk5.g(appDetailFragment.J0, new NavIntentDirections.Cheetah(new eq0(applicationFullDtoR5.getPackageName(), applicationFullDtoR5.getIcon().getUrl(), false)), -1);
                                return;
                            }
                        }
                        return;
                    case 7:
                        AppSummaryTextData appSummaryTextData = (AppSummaryTextData) obj;
                        int i10 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((nt) qg5Var, "<unused var>");
                        js3.p(appSummaryTextData, "recyclerData");
                        ClickEventBuilder clickEventBuilder3 = new ClickEventBuilder();
                        SummaryTextDto summaryTextDto = appSummaryTextData.a;
                        clickEventBuilder3.b("app_detail_summary_" + summaryTextDto.getAnalyticId());
                        clickEventBuilder3.a();
                        if (summaryTextDto.getSummaryDialog() != null) {
                            appDetailFragment.d2(summaryTextDto.getSummaryDialog());
                            return;
                        }
                        String action = summaryTextDto.getAction();
                        if (action == null || f88.n0(action)) {
                            return;
                        }
                        Context contextH3 = appDetailFragment.H();
                        String action2 = summaryTextDto.getAction();
                        if (action2 != null) {
                            t61.v(action2, "parse(...)", contextH3, NearbyRepository.SERVICE_ID, null);
                            return;
                        }
                        return;
                    case 8:
                        AppSummaryIconData appSummaryIconData = (AppSummaryIconData) obj;
                        int i11 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((lt) qg5Var, "<unused var>");
                        js3.p(appSummaryIconData, "recyclerData");
                        ClickEventBuilder clickEventBuilder4 = new ClickEventBuilder();
                        SummaryIconDto summaryIconDto = appSummaryIconData.a;
                        clickEventBuilder4.b("app_detail_summary_" + summaryIconDto.getAnalyticId());
                        clickEventBuilder4.a();
                        if (summaryIconDto.getSummaryDialog() != null) {
                            appDetailFragment.d2(summaryIconDto.getSummaryDialog());
                            return;
                        }
                        String action3 = summaryIconDto.getAction();
                        if (action3 == null || f88.n0(action3)) {
                            return;
                        }
                        Context contextH4 = appDetailFragment.H();
                        String action4 = summaryIconDto.getAction();
                        if (action4 != null) {
                            t61.v(action4, "parse(...)", contextH4, NearbyRepository.SERVICE_ID, null);
                            return;
                        }
                        return;
                    case 9:
                        AppBarData appBarData = (AppBarData) obj;
                        int i12 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.app.detail.ui.recycler.a) qg5Var, "<unused var>");
                        js3.p(appBarData, "recyclerData");
                        ClickEventBuilder clickEventBuilder5 = new ClickEventBuilder();
                        clickEventBuilder5.b("detail_icon");
                        clickEventBuilder5.a();
                        AppBarSampleData appBarSampleData = (AppBarSampleData) appBarData.g.getValue();
                        if (appBarSampleData == null || (highResUrl = appBarSampleData.getHighResUrl()) == null) {
                            return;
                        }
                        FragmentActivity fragmentActivityF2 = appDetailFragment.F();
                        zt5 zt5Var = fragmentActivityF2 instanceof zt5 ? (zt5) fragmentActivityF2 : null;
                        if (zt5Var != null) {
                            ((LaunchContentActivity) zt5Var).s0(appDetailFragment.K().getDimensionPixelSize(pq6.margin_default_v2_triple), highResUrl);
                            return;
                        }
                        return;
                    case 10:
                        AppSummaryRateData appSummaryRateData = (AppSummaryRateData) obj;
                        int i13 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((mt) qg5Var, "<unused var>");
                        js3.p(appSummaryRateData, "recyclerData");
                        ClickEventBuilder clickEventBuilder6 = new ClickEventBuilder();
                        clickEventBuilder6.b("app_detail_summary_" + appSummaryRateData.a.getAnalyticId());
                        clickEventBuilder6.a();
                        ClickEventBuilder clickEventBuilder7 = new ClickEventBuilder();
                        clickEventBuilder7.b("detail_all_review_info");
                        clickEventBuilder7.a();
                        ApplicationFullDto applicationFullDtoR6 = appDetailFragment.R1().R();
                        if (applicationFullDtoR6 == null || (rate = applicationFullDtoR6.getRate()) == null || (rates = rate.getRates()) == null) {
                            return;
                        }
                        hp hpVar3 = appDetailFragment.u1;
                        if (hpVar3 != null) {
                            appDetailFragment.b2(hpVar3.a, rates);
                            return;
                        } else {
                            js3.V("navArgs");
                            throw null;
                        }
                    case 11:
                        AppSummarySizeData appSummarySizeData = (AppSummarySizeData) obj;
                        int i14 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((f) qg5Var, "<unused var>");
                        js3.p(appSummarySizeData, "recyclerData");
                        ClickEventBuilder clickEventBuilder8 = new ClickEventBuilder();
                        clickEventBuilder8.b("app_detail_summary_" + appSummarySizeData.c);
                        clickEventBuilder8.a();
                        SummaryDialogDto summaryDialogDto = appSummarySizeData.d;
                        if (summaryDialogDto != null) {
                            appDetailFragment.d2(summaryDialogDto);
                            return;
                        }
                        return;
                    case 12:
                        rc rcVar = (rc) qg5Var;
                        AddaxBoxData addaxBoxData = (AddaxBoxData) obj;
                        int i15 = AppDetailFragment.M1;
                        js3.p(view, "view");
                        js3.p(rcVar, "viewHolder");
                        js3.p(addaxBoxData, "recyclerData");
                        AddaxBoxDto addaxBoxDto = addaxBoxData.a;
                        ClickEventBuilder clickEventBuilder9 = new ClickEventBuilder();
                        clickEventBuilder9.b("addax_action_detail_" + addaxBoxDto.getId());
                        clickEventBuilder9.a();
                        ClickEventBuilder clickEventBuilder10 = new ClickEventBuilder();
                        clickEventBuilder10.b("addax_action_detail_" + addaxBoxDto.getId() + "_" + addaxBoxDto.getDisplayMode());
                        clickEventBuilder10.a();
                        FragmentActivity fragmentActivityF3 = appDetailFragment.F();
                        if (fragmentActivityF3 != null) {
                            new wv8(fragmentActivityF3, appDetailFragment.v1).m(view, rcVar, addaxBoxData);
                            return;
                        }
                        return;
                    default:
                        AppMoreDescriptionData appMoreDescriptionData = (AppMoreDescriptionData) obj;
                        int i16 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((ar) qg5Var, "<unused var>");
                        js3.p(appMoreDescriptionData, "recyclerData");
                        ApplicationFullDto applicationFullDtoR7 = appDetailFragment.R1().R();
                        if (applicationFullDtoR7 != null) {
                            pk5.g(appDetailFragment.J0, new NavIntentDirections.MoreDescription(new tx4(appMoreDescriptionData.a, new ToolbarData(applicationFullDtoR7, appDetailFragment.R1().T(), appDetailFragment.R1().U(), appDetailFragment.R1().S()))), -1);
                            return;
                        }
                        return;
                }
            }
        };
        final int i9 = 12;
        zoVar.A = new og5(this) { // from class: cp
            public final /* synthetic */ AppDetailFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                String highResUrl;
                AppRateDto rate;
                List<RateDto> rates;
                int i22 = i9;
                AppDetailFragment appDetailFragment = this.b;
                switch (i22) {
                    case 0:
                        AppRatingModuleData appRatingModuleData = (AppRatingModuleData) obj;
                        int i32 = AppDetailFragment.M1;
                        js3.p(view, "view");
                        js3.p((d) qg5Var, "<unused var>");
                        js3.p(appRatingModuleData, "recyclerData");
                        appDetailFragment.U1();
                        boolean z = view instanceof MyketRatingBar;
                        dw1.y(z ? "review_stars_detail" : "review_write_detail");
                        ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                        clickEventBuilder.b("review_new_detail");
                        clickEventBuilder.a();
                        fw0 fw0VarU1 = appDetailFragment.U1();
                        ApplicationFullDto applicationFullDtoR = appDetailFragment.R1().R();
                        fw0VarU1.d(applicationFullDtoR.getPackageName(), applicationFullDtoR.getVersion().getCode(), applicationFullDtoR.getVersion().isIncompatible(), applicationFullDtoR.getForceUpdate());
                        AppDetailViewModel appDetailViewModelR1 = appDetailFragment.R1();
                        MyketRatingBar myketRatingBar = z ? (MyketRatingBar) view : null;
                        appDetailViewModelR1.W(myketRatingBar != null ? myketRatingBar.getRating() : 0.0f);
                        Bundle bundle = new Bundle();
                        hp hpVar2 = appDetailFragment.u1;
                        if (hpVar2 == null) {
                            js3.V("navArgs");
                            throw null;
                        }
                        bundle.putString("packageName", hpVar2.a);
                        bundle.putString("BUNDLE_KEY_EVENT_OK", "detail_dd_new_review_ok");
                        bundle.putString("BUNDLE_KEY_EVENT_CANCEL", "detail_dd_new_review_cancel");
                        AppDetailViewModel appDetailViewModelR12 = appDetailFragment.R1();
                        if (!appDetailViewModelR12.B.G(appDetailViewModelR12.J0.a)) {
                            pk5.g(appDetailFragment.J0, new NavIntentDirections.AlertBottom(new bd(new DialogDataModel(appDetailFragment.W1(), "DIALOG_KEY_SHOULD_BE_INSTALLED", bundle, 8), null, appDetailFragment.L(rs6.app_must_installed), appDetailFragment.L(rs6.download_app), appDetailFragment.L(rs6.button_cancel), true)), -1);
                            return;
                        }
                        ApplicationFullDto applicationFullDtoR2 = appDetailFragment.R1().R();
                        if (applicationFullDtoR2 != null) {
                            CommentScenario.SubmitReview submitReview = new CommentScenario.SubmitReview(new SubmitReviewData(applicationFullDtoR2.getPackageName(), ((Number) appRatingModuleData.b.getValue()).floatValue(), null, false, true, new ToolbarData(applicationFullDtoR2, appDetailFragment.R1().T(), appDetailFragment.R1().U(), appDetailFragment.R1().S()), "_detail", "DETAIL", 4, null));
                            FragmentActivity fragmentActivityF = appDetailFragment.F();
                            if (fragmentActivityF != null) {
                                pk5.c(fragmentActivityF, submitReview);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        AIReviewSummaryData aIReviewSummaryData = (AIReviewSummaryData) obj;
                        int i42 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(aIReviewSummaryData, "recyclerData");
                        appDetailFragment.R1().r(new AppDetailAction.ReviewAILikeAction(true, aIReviewSummaryData.a.getId()));
                        return;
                    case 2:
                        AIReviewSummaryData aIReviewSummaryData2 = (AIReviewSummaryData) obj;
                        int i52 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(aIReviewSummaryData2, "recyclerData");
                        appDetailFragment.R1().r(new AppDetailAction.ReviewAILikeAction(false, aIReviewSummaryData2.a.getId()));
                        return;
                    case 3:
                        int i62 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p((AIReviewSummaryData) obj, "<unused var>");
                        appDetailFragment.R1().r(AppDetailAction.ShowMoreAIAction.INSTANCE);
                        dw1.y("detail__ai_review_more_description");
                        return;
                    case 4:
                        AppDownloadData appDownloadData = (AppDownloadData) obj;
                        int i72 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(appDownloadData, "recyclerData");
                        sb7.p("AppDetail", "App Install Click", "Packagename: " + appDownloadData.g);
                        ApplicationFullDto applicationFullDtoR3 = appDetailFragment.R1().R();
                        if (applicationFullDtoR3 != null) {
                            appDetailFragment.Y1().C(new DownloadDataModel(applicationFullDtoR3, "detail", appDetailFragment.R1().T(), appDetailFragment.R1().S(), appDetailFragment.R1().U()));
                        }
                        dw1.y("button_install");
                        return;
                    case 5:
                        AppDownloadData appDownloadData2 = (AppDownloadData) obj;
                        int i82 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(appDownloadData2, "recyclerData");
                        sb7.p("AppDetail", "App Update Click", "Packagename: " + appDownloadData2.g);
                        ApplicationFullDto applicationFullDtoR4 = appDetailFragment.R1().R();
                        if (applicationFullDtoR4 != null) {
                            ps1 ps1Var = appDetailFragment.r1;
                            if (ps1Var == null) {
                                js3.V("downloadManager");
                                throw null;
                            }
                            AppDownloadInfo appDownloadInfoI = ps1Var.i(applicationFullDtoR4.getPackageName(), null);
                            if (wq2.l(applicationFullDtoR4.getSize().getLength(), appDownloadInfoI != null ? appDownloadInfoI.getLocalSize() : 0L)) {
                                appDetailFragment.j2();
                            } else {
                                appDetailFragment.S1();
                                ir.mservices.market.version2.manager.a.e(applicationFullDtoR4.getTitle(), applicationFullDtoR4.getIcon().getUrl());
                            }
                        }
                        dw1.y("detail_button_update");
                        return;
                    case 6:
                        AppDownloadData appDownloadData3 = (AppDownloadData) obj;
                        int i92 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(appDownloadData3, "recyclerData");
                        sb7.p("AppDetail", "App Run Click", "Packagename: " + appDownloadData3);
                        ClickEventBuilder clickEventBuilder2 = new ClickEventBuilder();
                        clickEventBuilder2.b("detail_button_run");
                        clickEventBuilder2.a();
                        ApplicationFullDto applicationFullDtoR5 = appDetailFragment.R1().R();
                        if (applicationFullDtoR5 != null) {
                            String strR = appDetailFragment.Y1().r(applicationFullDtoR5.getVersion().getCode(), applicationFullDtoR5.getPackageName());
                            if (strR != null && !f88.n0(strR)) {
                                Context contextH = appDetailFragment.H();
                                String packageName = applicationFullDtoR5.getPackageName();
                                Uri uri = Uri.parse(strR);
                                js3.o(uri, "parse(...)");
                                if (!js8.q(contextH, uri, packageName, null)) {
                                    dp3.M(applicationFullDtoR5.getPackageName());
                                }
                                appDetailFragment.Y1().e(applicationFullDtoR5.getVersion().getCode(), applicationFullDtoR5.getPackageName());
                                return;
                            }
                            if (!appDetailFragment.Y1().K(applicationFullDtoR5.getPackageName())) {
                                Context contextH2 = appDetailFragment.H();
                                hh2.H(new hh2(contextH2, contextH2 != null ? contextH2.getString(rs6.app_not_runnable) : null));
                                return;
                            }
                            ApplicationCheetahDto cheetah = applicationFullDtoR5.getCheetah();
                            if (cheetah == null || !cheetah.getEnable()) {
                                dp3.M(applicationFullDtoR5.getPackageName());
                                return;
                            } else {
                                pk5.g(appDetailFragment.J0, new NavIntentDirections.Cheetah(new eq0(applicationFullDtoR5.getPackageName(), applicationFullDtoR5.getIcon().getUrl(), false)), -1);
                                return;
                            }
                        }
                        return;
                    case 7:
                        AppSummaryTextData appSummaryTextData = (AppSummaryTextData) obj;
                        int i10 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((nt) qg5Var, "<unused var>");
                        js3.p(appSummaryTextData, "recyclerData");
                        ClickEventBuilder clickEventBuilder3 = new ClickEventBuilder();
                        SummaryTextDto summaryTextDto = appSummaryTextData.a;
                        clickEventBuilder3.b("app_detail_summary_" + summaryTextDto.getAnalyticId());
                        clickEventBuilder3.a();
                        if (summaryTextDto.getSummaryDialog() != null) {
                            appDetailFragment.d2(summaryTextDto.getSummaryDialog());
                            return;
                        }
                        String action = summaryTextDto.getAction();
                        if (action == null || f88.n0(action)) {
                            return;
                        }
                        Context contextH3 = appDetailFragment.H();
                        String action2 = summaryTextDto.getAction();
                        if (action2 != null) {
                            t61.v(action2, "parse(...)", contextH3, NearbyRepository.SERVICE_ID, null);
                            return;
                        }
                        return;
                    case 8:
                        AppSummaryIconData appSummaryIconData = (AppSummaryIconData) obj;
                        int i11 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((lt) qg5Var, "<unused var>");
                        js3.p(appSummaryIconData, "recyclerData");
                        ClickEventBuilder clickEventBuilder4 = new ClickEventBuilder();
                        SummaryIconDto summaryIconDto = appSummaryIconData.a;
                        clickEventBuilder4.b("app_detail_summary_" + summaryIconDto.getAnalyticId());
                        clickEventBuilder4.a();
                        if (summaryIconDto.getSummaryDialog() != null) {
                            appDetailFragment.d2(summaryIconDto.getSummaryDialog());
                            return;
                        }
                        String action3 = summaryIconDto.getAction();
                        if (action3 == null || f88.n0(action3)) {
                            return;
                        }
                        Context contextH4 = appDetailFragment.H();
                        String action4 = summaryIconDto.getAction();
                        if (action4 != null) {
                            t61.v(action4, "parse(...)", contextH4, NearbyRepository.SERVICE_ID, null);
                            return;
                        }
                        return;
                    case 9:
                        AppBarData appBarData = (AppBarData) obj;
                        int i12 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.app.detail.ui.recycler.a) qg5Var, "<unused var>");
                        js3.p(appBarData, "recyclerData");
                        ClickEventBuilder clickEventBuilder5 = new ClickEventBuilder();
                        clickEventBuilder5.b("detail_icon");
                        clickEventBuilder5.a();
                        AppBarSampleData appBarSampleData = (AppBarSampleData) appBarData.g.getValue();
                        if (appBarSampleData == null || (highResUrl = appBarSampleData.getHighResUrl()) == null) {
                            return;
                        }
                        FragmentActivity fragmentActivityF2 = appDetailFragment.F();
                        zt5 zt5Var = fragmentActivityF2 instanceof zt5 ? (zt5) fragmentActivityF2 : null;
                        if (zt5Var != null) {
                            ((LaunchContentActivity) zt5Var).s0(appDetailFragment.K().getDimensionPixelSize(pq6.margin_default_v2_triple), highResUrl);
                            return;
                        }
                        return;
                    case 10:
                        AppSummaryRateData appSummaryRateData = (AppSummaryRateData) obj;
                        int i13 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((mt) qg5Var, "<unused var>");
                        js3.p(appSummaryRateData, "recyclerData");
                        ClickEventBuilder clickEventBuilder6 = new ClickEventBuilder();
                        clickEventBuilder6.b("app_detail_summary_" + appSummaryRateData.a.getAnalyticId());
                        clickEventBuilder6.a();
                        ClickEventBuilder clickEventBuilder7 = new ClickEventBuilder();
                        clickEventBuilder7.b("detail_all_review_info");
                        clickEventBuilder7.a();
                        ApplicationFullDto applicationFullDtoR6 = appDetailFragment.R1().R();
                        if (applicationFullDtoR6 == null || (rate = applicationFullDtoR6.getRate()) == null || (rates = rate.getRates()) == null) {
                            return;
                        }
                        hp hpVar3 = appDetailFragment.u1;
                        if (hpVar3 != null) {
                            appDetailFragment.b2(hpVar3.a, rates);
                            return;
                        } else {
                            js3.V("navArgs");
                            throw null;
                        }
                    case 11:
                        AppSummarySizeData appSummarySizeData = (AppSummarySizeData) obj;
                        int i14 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((f) qg5Var, "<unused var>");
                        js3.p(appSummarySizeData, "recyclerData");
                        ClickEventBuilder clickEventBuilder8 = new ClickEventBuilder();
                        clickEventBuilder8.b("app_detail_summary_" + appSummarySizeData.c);
                        clickEventBuilder8.a();
                        SummaryDialogDto summaryDialogDto = appSummarySizeData.d;
                        if (summaryDialogDto != null) {
                            appDetailFragment.d2(summaryDialogDto);
                            return;
                        }
                        return;
                    case 12:
                        rc rcVar = (rc) qg5Var;
                        AddaxBoxData addaxBoxData = (AddaxBoxData) obj;
                        int i15 = AppDetailFragment.M1;
                        js3.p(view, "view");
                        js3.p(rcVar, "viewHolder");
                        js3.p(addaxBoxData, "recyclerData");
                        AddaxBoxDto addaxBoxDto = addaxBoxData.a;
                        ClickEventBuilder clickEventBuilder9 = new ClickEventBuilder();
                        clickEventBuilder9.b("addax_action_detail_" + addaxBoxDto.getId());
                        clickEventBuilder9.a();
                        ClickEventBuilder clickEventBuilder10 = new ClickEventBuilder();
                        clickEventBuilder10.b("addax_action_detail_" + addaxBoxDto.getId() + "_" + addaxBoxDto.getDisplayMode());
                        clickEventBuilder10.a();
                        FragmentActivity fragmentActivityF3 = appDetailFragment.F();
                        if (fragmentActivityF3 != null) {
                            new wv8(fragmentActivityF3, appDetailFragment.v1).m(view, rcVar, addaxBoxData);
                            return;
                        }
                        return;
                    default:
                        AppMoreDescriptionData appMoreDescriptionData = (AppMoreDescriptionData) obj;
                        int i16 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((ar) qg5Var, "<unused var>");
                        js3.p(appMoreDescriptionData, "recyclerData");
                        ApplicationFullDto applicationFullDtoR7 = appDetailFragment.R1().R();
                        if (applicationFullDtoR7 != null) {
                            pk5.g(appDetailFragment.J0, new NavIntentDirections.MoreDescription(new tx4(appMoreDescriptionData.a, new ToolbarData(applicationFullDtoR7, appDetailFragment.R1().T(), appDetailFragment.R1().U(), appDetailFragment.R1().S()))), -1);
                            return;
                        }
                        return;
                }
            }
        };
        final int i10 = 13;
        zoVar.z = new og5(this) { // from class: cp
            public final /* synthetic */ AppDetailFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                String highResUrl;
                AppRateDto rate;
                List<RateDto> rates;
                int i22 = i10;
                AppDetailFragment appDetailFragment = this.b;
                switch (i22) {
                    case 0:
                        AppRatingModuleData appRatingModuleData = (AppRatingModuleData) obj;
                        int i32 = AppDetailFragment.M1;
                        js3.p(view, "view");
                        js3.p((d) qg5Var, "<unused var>");
                        js3.p(appRatingModuleData, "recyclerData");
                        appDetailFragment.U1();
                        boolean z = view instanceof MyketRatingBar;
                        dw1.y(z ? "review_stars_detail" : "review_write_detail");
                        ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                        clickEventBuilder.b("review_new_detail");
                        clickEventBuilder.a();
                        fw0 fw0VarU1 = appDetailFragment.U1();
                        ApplicationFullDto applicationFullDtoR = appDetailFragment.R1().R();
                        fw0VarU1.d(applicationFullDtoR.getPackageName(), applicationFullDtoR.getVersion().getCode(), applicationFullDtoR.getVersion().isIncompatible(), applicationFullDtoR.getForceUpdate());
                        AppDetailViewModel appDetailViewModelR1 = appDetailFragment.R1();
                        MyketRatingBar myketRatingBar = z ? (MyketRatingBar) view : null;
                        appDetailViewModelR1.W(myketRatingBar != null ? myketRatingBar.getRating() : 0.0f);
                        Bundle bundle = new Bundle();
                        hp hpVar2 = appDetailFragment.u1;
                        if (hpVar2 == null) {
                            js3.V("navArgs");
                            throw null;
                        }
                        bundle.putString("packageName", hpVar2.a);
                        bundle.putString("BUNDLE_KEY_EVENT_OK", "detail_dd_new_review_ok");
                        bundle.putString("BUNDLE_KEY_EVENT_CANCEL", "detail_dd_new_review_cancel");
                        AppDetailViewModel appDetailViewModelR12 = appDetailFragment.R1();
                        if (!appDetailViewModelR12.B.G(appDetailViewModelR12.J0.a)) {
                            pk5.g(appDetailFragment.J0, new NavIntentDirections.AlertBottom(new bd(new DialogDataModel(appDetailFragment.W1(), "DIALOG_KEY_SHOULD_BE_INSTALLED", bundle, 8), null, appDetailFragment.L(rs6.app_must_installed), appDetailFragment.L(rs6.download_app), appDetailFragment.L(rs6.button_cancel), true)), -1);
                            return;
                        }
                        ApplicationFullDto applicationFullDtoR2 = appDetailFragment.R1().R();
                        if (applicationFullDtoR2 != null) {
                            CommentScenario.SubmitReview submitReview = new CommentScenario.SubmitReview(new SubmitReviewData(applicationFullDtoR2.getPackageName(), ((Number) appRatingModuleData.b.getValue()).floatValue(), null, false, true, new ToolbarData(applicationFullDtoR2, appDetailFragment.R1().T(), appDetailFragment.R1().U(), appDetailFragment.R1().S()), "_detail", "DETAIL", 4, null));
                            FragmentActivity fragmentActivityF = appDetailFragment.F();
                            if (fragmentActivityF != null) {
                                pk5.c(fragmentActivityF, submitReview);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        AIReviewSummaryData aIReviewSummaryData = (AIReviewSummaryData) obj;
                        int i42 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(aIReviewSummaryData, "recyclerData");
                        appDetailFragment.R1().r(new AppDetailAction.ReviewAILikeAction(true, aIReviewSummaryData.a.getId()));
                        return;
                    case 2:
                        AIReviewSummaryData aIReviewSummaryData2 = (AIReviewSummaryData) obj;
                        int i52 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(aIReviewSummaryData2, "recyclerData");
                        appDetailFragment.R1().r(new AppDetailAction.ReviewAILikeAction(false, aIReviewSummaryData2.a.getId()));
                        return;
                    case 3:
                        int i62 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p((AIReviewSummaryData) obj, "<unused var>");
                        appDetailFragment.R1().r(AppDetailAction.ShowMoreAIAction.INSTANCE);
                        dw1.y("detail__ai_review_more_description");
                        return;
                    case 4:
                        AppDownloadData appDownloadData = (AppDownloadData) obj;
                        int i72 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(appDownloadData, "recyclerData");
                        sb7.p("AppDetail", "App Install Click", "Packagename: " + appDownloadData.g);
                        ApplicationFullDto applicationFullDtoR3 = appDetailFragment.R1().R();
                        if (applicationFullDtoR3 != null) {
                            appDetailFragment.Y1().C(new DownloadDataModel(applicationFullDtoR3, "detail", appDetailFragment.R1().T(), appDetailFragment.R1().S(), appDetailFragment.R1().U()));
                        }
                        dw1.y("button_install");
                        return;
                    case 5:
                        AppDownloadData appDownloadData2 = (AppDownloadData) obj;
                        int i82 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(appDownloadData2, "recyclerData");
                        sb7.p("AppDetail", "App Update Click", "Packagename: " + appDownloadData2.g);
                        ApplicationFullDto applicationFullDtoR4 = appDetailFragment.R1().R();
                        if (applicationFullDtoR4 != null) {
                            ps1 ps1Var = appDetailFragment.r1;
                            if (ps1Var == null) {
                                js3.V("downloadManager");
                                throw null;
                            }
                            AppDownloadInfo appDownloadInfoI = ps1Var.i(applicationFullDtoR4.getPackageName(), null);
                            if (wq2.l(applicationFullDtoR4.getSize().getLength(), appDownloadInfoI != null ? appDownloadInfoI.getLocalSize() : 0L)) {
                                appDetailFragment.j2();
                            } else {
                                appDetailFragment.S1();
                                ir.mservices.market.version2.manager.a.e(applicationFullDtoR4.getTitle(), applicationFullDtoR4.getIcon().getUrl());
                            }
                        }
                        dw1.y("detail_button_update");
                        return;
                    case 6:
                        AppDownloadData appDownloadData3 = (AppDownloadData) obj;
                        int i92 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(appDownloadData3, "recyclerData");
                        sb7.p("AppDetail", "App Run Click", "Packagename: " + appDownloadData3);
                        ClickEventBuilder clickEventBuilder2 = new ClickEventBuilder();
                        clickEventBuilder2.b("detail_button_run");
                        clickEventBuilder2.a();
                        ApplicationFullDto applicationFullDtoR5 = appDetailFragment.R1().R();
                        if (applicationFullDtoR5 != null) {
                            String strR = appDetailFragment.Y1().r(applicationFullDtoR5.getVersion().getCode(), applicationFullDtoR5.getPackageName());
                            if (strR != null && !f88.n0(strR)) {
                                Context contextH = appDetailFragment.H();
                                String packageName = applicationFullDtoR5.getPackageName();
                                Uri uri = Uri.parse(strR);
                                js3.o(uri, "parse(...)");
                                if (!js8.q(contextH, uri, packageName, null)) {
                                    dp3.M(applicationFullDtoR5.getPackageName());
                                }
                                appDetailFragment.Y1().e(applicationFullDtoR5.getVersion().getCode(), applicationFullDtoR5.getPackageName());
                                return;
                            }
                            if (!appDetailFragment.Y1().K(applicationFullDtoR5.getPackageName())) {
                                Context contextH2 = appDetailFragment.H();
                                hh2.H(new hh2(contextH2, contextH2 != null ? contextH2.getString(rs6.app_not_runnable) : null));
                                return;
                            }
                            ApplicationCheetahDto cheetah = applicationFullDtoR5.getCheetah();
                            if (cheetah == null || !cheetah.getEnable()) {
                                dp3.M(applicationFullDtoR5.getPackageName());
                                return;
                            } else {
                                pk5.g(appDetailFragment.J0, new NavIntentDirections.Cheetah(new eq0(applicationFullDtoR5.getPackageName(), applicationFullDtoR5.getIcon().getUrl(), false)), -1);
                                return;
                            }
                        }
                        return;
                    case 7:
                        AppSummaryTextData appSummaryTextData = (AppSummaryTextData) obj;
                        int i102 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((nt) qg5Var, "<unused var>");
                        js3.p(appSummaryTextData, "recyclerData");
                        ClickEventBuilder clickEventBuilder3 = new ClickEventBuilder();
                        SummaryTextDto summaryTextDto = appSummaryTextData.a;
                        clickEventBuilder3.b("app_detail_summary_" + summaryTextDto.getAnalyticId());
                        clickEventBuilder3.a();
                        if (summaryTextDto.getSummaryDialog() != null) {
                            appDetailFragment.d2(summaryTextDto.getSummaryDialog());
                            return;
                        }
                        String action = summaryTextDto.getAction();
                        if (action == null || f88.n0(action)) {
                            return;
                        }
                        Context contextH3 = appDetailFragment.H();
                        String action2 = summaryTextDto.getAction();
                        if (action2 != null) {
                            t61.v(action2, "parse(...)", contextH3, NearbyRepository.SERVICE_ID, null);
                            return;
                        }
                        return;
                    case 8:
                        AppSummaryIconData appSummaryIconData = (AppSummaryIconData) obj;
                        int i11 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((lt) qg5Var, "<unused var>");
                        js3.p(appSummaryIconData, "recyclerData");
                        ClickEventBuilder clickEventBuilder4 = new ClickEventBuilder();
                        SummaryIconDto summaryIconDto = appSummaryIconData.a;
                        clickEventBuilder4.b("app_detail_summary_" + summaryIconDto.getAnalyticId());
                        clickEventBuilder4.a();
                        if (summaryIconDto.getSummaryDialog() != null) {
                            appDetailFragment.d2(summaryIconDto.getSummaryDialog());
                            return;
                        }
                        String action3 = summaryIconDto.getAction();
                        if (action3 == null || f88.n0(action3)) {
                            return;
                        }
                        Context contextH4 = appDetailFragment.H();
                        String action4 = summaryIconDto.getAction();
                        if (action4 != null) {
                            t61.v(action4, "parse(...)", contextH4, NearbyRepository.SERVICE_ID, null);
                            return;
                        }
                        return;
                    case 9:
                        AppBarData appBarData = (AppBarData) obj;
                        int i12 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.app.detail.ui.recycler.a) qg5Var, "<unused var>");
                        js3.p(appBarData, "recyclerData");
                        ClickEventBuilder clickEventBuilder5 = new ClickEventBuilder();
                        clickEventBuilder5.b("detail_icon");
                        clickEventBuilder5.a();
                        AppBarSampleData appBarSampleData = (AppBarSampleData) appBarData.g.getValue();
                        if (appBarSampleData == null || (highResUrl = appBarSampleData.getHighResUrl()) == null) {
                            return;
                        }
                        FragmentActivity fragmentActivityF2 = appDetailFragment.F();
                        zt5 zt5Var = fragmentActivityF2 instanceof zt5 ? (zt5) fragmentActivityF2 : null;
                        if (zt5Var != null) {
                            ((LaunchContentActivity) zt5Var).s0(appDetailFragment.K().getDimensionPixelSize(pq6.margin_default_v2_triple), highResUrl);
                            return;
                        }
                        return;
                    case 10:
                        AppSummaryRateData appSummaryRateData = (AppSummaryRateData) obj;
                        int i13 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((mt) qg5Var, "<unused var>");
                        js3.p(appSummaryRateData, "recyclerData");
                        ClickEventBuilder clickEventBuilder6 = new ClickEventBuilder();
                        clickEventBuilder6.b("app_detail_summary_" + appSummaryRateData.a.getAnalyticId());
                        clickEventBuilder6.a();
                        ClickEventBuilder clickEventBuilder7 = new ClickEventBuilder();
                        clickEventBuilder7.b("detail_all_review_info");
                        clickEventBuilder7.a();
                        ApplicationFullDto applicationFullDtoR6 = appDetailFragment.R1().R();
                        if (applicationFullDtoR6 == null || (rate = applicationFullDtoR6.getRate()) == null || (rates = rate.getRates()) == null) {
                            return;
                        }
                        hp hpVar3 = appDetailFragment.u1;
                        if (hpVar3 != null) {
                            appDetailFragment.b2(hpVar3.a, rates);
                            return;
                        } else {
                            js3.V("navArgs");
                            throw null;
                        }
                    case 11:
                        AppSummarySizeData appSummarySizeData = (AppSummarySizeData) obj;
                        int i14 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((f) qg5Var, "<unused var>");
                        js3.p(appSummarySizeData, "recyclerData");
                        ClickEventBuilder clickEventBuilder8 = new ClickEventBuilder();
                        clickEventBuilder8.b("app_detail_summary_" + appSummarySizeData.c);
                        clickEventBuilder8.a();
                        SummaryDialogDto summaryDialogDto = appSummarySizeData.d;
                        if (summaryDialogDto != null) {
                            appDetailFragment.d2(summaryDialogDto);
                            return;
                        }
                        return;
                    case 12:
                        rc rcVar = (rc) qg5Var;
                        AddaxBoxData addaxBoxData = (AddaxBoxData) obj;
                        int i15 = AppDetailFragment.M1;
                        js3.p(view, "view");
                        js3.p(rcVar, "viewHolder");
                        js3.p(addaxBoxData, "recyclerData");
                        AddaxBoxDto addaxBoxDto = addaxBoxData.a;
                        ClickEventBuilder clickEventBuilder9 = new ClickEventBuilder();
                        clickEventBuilder9.b("addax_action_detail_" + addaxBoxDto.getId());
                        clickEventBuilder9.a();
                        ClickEventBuilder clickEventBuilder10 = new ClickEventBuilder();
                        clickEventBuilder10.b("addax_action_detail_" + addaxBoxDto.getId() + "_" + addaxBoxDto.getDisplayMode());
                        clickEventBuilder10.a();
                        FragmentActivity fragmentActivityF3 = appDetailFragment.F();
                        if (fragmentActivityF3 != null) {
                            new wv8(fragmentActivityF3, appDetailFragment.v1).m(view, rcVar, addaxBoxData);
                            return;
                        }
                        return;
                    default:
                        AppMoreDescriptionData appMoreDescriptionData = (AppMoreDescriptionData) obj;
                        int i16 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((ar) qg5Var, "<unused var>");
                        js3.p(appMoreDescriptionData, "recyclerData");
                        ApplicationFullDto applicationFullDtoR7 = appDetailFragment.R1().R();
                        if (applicationFullDtoR7 != null) {
                            pk5.g(appDetailFragment.J0, new NavIntentDirections.MoreDescription(new tx4(appMoreDescriptionData.a, new ToolbarData(applicationFullDtoR7, appDetailFragment.R1().T(), appDetailFragment.R1().U(), appDetailFragment.R1().S()))), -1);
                            return;
                        }
                        return;
                }
            }
        };
        zoVar.b0 = new ap(this, 0);
        zoVar.B = new ap(this, 1);
        zoVar.C = new ap(this, 2);
        zoVar.D = new ap(this, 3);
        zoVar.q = new pt2(7, this);
        zoVar.o = new ap(this, 4);
        zoVar.p = new ap(this, 5);
        zoVar.E = new ap(this, 7);
        zoVar.F = new ap(this, 8);
        zoVar.G = new ap(this, 9);
        zoVar.H = new en(1);
        zoVar.J = new ap(this, 10);
        zoVar.I = new ap(this, 11);
        zoVar.L = new ap(this, 12);
        zoVar.K = new ap(this, 13);
        zoVar.M = new ap(this, 14);
        zoVar.Z = new ap(this, 15);
        zoVar.N = new ap(this, 17);
        zoVar.O = new ap(this, 18);
        zoVar.P = new ap(this, 19);
        zoVar.Q = new ap(this, 20);
        zoVar.R = new ap(this, 21);
        zoVar.S = new ap(this, 22);
        zoVar.U = new ap(this, 23);
        zoVar.V = new ap(this, 24);
        zoVar.W = new ap(this, 25);
        zoVar.X = new ap(this, 26);
        zoVar.Y = new ap(this, 28);
        final int i11 = 0;
        zoVar.a0 = new og5(this) { // from class: cp
            public final /* synthetic */ AppDetailFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                String highResUrl;
                AppRateDto rate;
                List<RateDto> rates;
                int i22 = i11;
                AppDetailFragment appDetailFragment = this.b;
                switch (i22) {
                    case 0:
                        AppRatingModuleData appRatingModuleData = (AppRatingModuleData) obj;
                        int i32 = AppDetailFragment.M1;
                        js3.p(view, "view");
                        js3.p((d) qg5Var, "<unused var>");
                        js3.p(appRatingModuleData, "recyclerData");
                        appDetailFragment.U1();
                        boolean z = view instanceof MyketRatingBar;
                        dw1.y(z ? "review_stars_detail" : "review_write_detail");
                        ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                        clickEventBuilder.b("review_new_detail");
                        clickEventBuilder.a();
                        fw0 fw0VarU1 = appDetailFragment.U1();
                        ApplicationFullDto applicationFullDtoR = appDetailFragment.R1().R();
                        fw0VarU1.d(applicationFullDtoR.getPackageName(), applicationFullDtoR.getVersion().getCode(), applicationFullDtoR.getVersion().isIncompatible(), applicationFullDtoR.getForceUpdate());
                        AppDetailViewModel appDetailViewModelR1 = appDetailFragment.R1();
                        MyketRatingBar myketRatingBar = z ? (MyketRatingBar) view : null;
                        appDetailViewModelR1.W(myketRatingBar != null ? myketRatingBar.getRating() : 0.0f);
                        Bundle bundle = new Bundle();
                        hp hpVar2 = appDetailFragment.u1;
                        if (hpVar2 == null) {
                            js3.V("navArgs");
                            throw null;
                        }
                        bundle.putString("packageName", hpVar2.a);
                        bundle.putString("BUNDLE_KEY_EVENT_OK", "detail_dd_new_review_ok");
                        bundle.putString("BUNDLE_KEY_EVENT_CANCEL", "detail_dd_new_review_cancel");
                        AppDetailViewModel appDetailViewModelR12 = appDetailFragment.R1();
                        if (!appDetailViewModelR12.B.G(appDetailViewModelR12.J0.a)) {
                            pk5.g(appDetailFragment.J0, new NavIntentDirections.AlertBottom(new bd(new DialogDataModel(appDetailFragment.W1(), "DIALOG_KEY_SHOULD_BE_INSTALLED", bundle, 8), null, appDetailFragment.L(rs6.app_must_installed), appDetailFragment.L(rs6.download_app), appDetailFragment.L(rs6.button_cancel), true)), -1);
                            return;
                        }
                        ApplicationFullDto applicationFullDtoR2 = appDetailFragment.R1().R();
                        if (applicationFullDtoR2 != null) {
                            CommentScenario.SubmitReview submitReview = new CommentScenario.SubmitReview(new SubmitReviewData(applicationFullDtoR2.getPackageName(), ((Number) appRatingModuleData.b.getValue()).floatValue(), null, false, true, new ToolbarData(applicationFullDtoR2, appDetailFragment.R1().T(), appDetailFragment.R1().U(), appDetailFragment.R1().S()), "_detail", "DETAIL", 4, null));
                            FragmentActivity fragmentActivityF = appDetailFragment.F();
                            if (fragmentActivityF != null) {
                                pk5.c(fragmentActivityF, submitReview);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        AIReviewSummaryData aIReviewSummaryData = (AIReviewSummaryData) obj;
                        int i42 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(aIReviewSummaryData, "recyclerData");
                        appDetailFragment.R1().r(new AppDetailAction.ReviewAILikeAction(true, aIReviewSummaryData.a.getId()));
                        return;
                    case 2:
                        AIReviewSummaryData aIReviewSummaryData2 = (AIReviewSummaryData) obj;
                        int i52 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(aIReviewSummaryData2, "recyclerData");
                        appDetailFragment.R1().r(new AppDetailAction.ReviewAILikeAction(false, aIReviewSummaryData2.a.getId()));
                        return;
                    case 3:
                        int i62 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p((AIReviewSummaryData) obj, "<unused var>");
                        appDetailFragment.R1().r(AppDetailAction.ShowMoreAIAction.INSTANCE);
                        dw1.y("detail__ai_review_more_description");
                        return;
                    case 4:
                        AppDownloadData appDownloadData = (AppDownloadData) obj;
                        int i72 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(appDownloadData, "recyclerData");
                        sb7.p("AppDetail", "App Install Click", "Packagename: " + appDownloadData.g);
                        ApplicationFullDto applicationFullDtoR3 = appDetailFragment.R1().R();
                        if (applicationFullDtoR3 != null) {
                            appDetailFragment.Y1().C(new DownloadDataModel(applicationFullDtoR3, "detail", appDetailFragment.R1().T(), appDetailFragment.R1().S(), appDetailFragment.R1().U()));
                        }
                        dw1.y("button_install");
                        return;
                    case 5:
                        AppDownloadData appDownloadData2 = (AppDownloadData) obj;
                        int i82 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(appDownloadData2, "recyclerData");
                        sb7.p("AppDetail", "App Update Click", "Packagename: " + appDownloadData2.g);
                        ApplicationFullDto applicationFullDtoR4 = appDetailFragment.R1().R();
                        if (applicationFullDtoR4 != null) {
                            ps1 ps1Var = appDetailFragment.r1;
                            if (ps1Var == null) {
                                js3.V("downloadManager");
                                throw null;
                            }
                            AppDownloadInfo appDownloadInfoI = ps1Var.i(applicationFullDtoR4.getPackageName(), null);
                            if (wq2.l(applicationFullDtoR4.getSize().getLength(), appDownloadInfoI != null ? appDownloadInfoI.getLocalSize() : 0L)) {
                                appDetailFragment.j2();
                            } else {
                                appDetailFragment.S1();
                                ir.mservices.market.version2.manager.a.e(applicationFullDtoR4.getTitle(), applicationFullDtoR4.getIcon().getUrl());
                            }
                        }
                        dw1.y("detail_button_update");
                        return;
                    case 6:
                        AppDownloadData appDownloadData3 = (AppDownloadData) obj;
                        int i92 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(appDownloadData3, "recyclerData");
                        sb7.p("AppDetail", "App Run Click", "Packagename: " + appDownloadData3);
                        ClickEventBuilder clickEventBuilder2 = new ClickEventBuilder();
                        clickEventBuilder2.b("detail_button_run");
                        clickEventBuilder2.a();
                        ApplicationFullDto applicationFullDtoR5 = appDetailFragment.R1().R();
                        if (applicationFullDtoR5 != null) {
                            String strR = appDetailFragment.Y1().r(applicationFullDtoR5.getVersion().getCode(), applicationFullDtoR5.getPackageName());
                            if (strR != null && !f88.n0(strR)) {
                                Context contextH = appDetailFragment.H();
                                String packageName = applicationFullDtoR5.getPackageName();
                                Uri uri = Uri.parse(strR);
                                js3.o(uri, "parse(...)");
                                if (!js8.q(contextH, uri, packageName, null)) {
                                    dp3.M(applicationFullDtoR5.getPackageName());
                                }
                                appDetailFragment.Y1().e(applicationFullDtoR5.getVersion().getCode(), applicationFullDtoR5.getPackageName());
                                return;
                            }
                            if (!appDetailFragment.Y1().K(applicationFullDtoR5.getPackageName())) {
                                Context contextH2 = appDetailFragment.H();
                                hh2.H(new hh2(contextH2, contextH2 != null ? contextH2.getString(rs6.app_not_runnable) : null));
                                return;
                            }
                            ApplicationCheetahDto cheetah = applicationFullDtoR5.getCheetah();
                            if (cheetah == null || !cheetah.getEnable()) {
                                dp3.M(applicationFullDtoR5.getPackageName());
                                return;
                            } else {
                                pk5.g(appDetailFragment.J0, new NavIntentDirections.Cheetah(new eq0(applicationFullDtoR5.getPackageName(), applicationFullDtoR5.getIcon().getUrl(), false)), -1);
                                return;
                            }
                        }
                        return;
                    case 7:
                        AppSummaryTextData appSummaryTextData = (AppSummaryTextData) obj;
                        int i102 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((nt) qg5Var, "<unused var>");
                        js3.p(appSummaryTextData, "recyclerData");
                        ClickEventBuilder clickEventBuilder3 = new ClickEventBuilder();
                        SummaryTextDto summaryTextDto = appSummaryTextData.a;
                        clickEventBuilder3.b("app_detail_summary_" + summaryTextDto.getAnalyticId());
                        clickEventBuilder3.a();
                        if (summaryTextDto.getSummaryDialog() != null) {
                            appDetailFragment.d2(summaryTextDto.getSummaryDialog());
                            return;
                        }
                        String action = summaryTextDto.getAction();
                        if (action == null || f88.n0(action)) {
                            return;
                        }
                        Context contextH3 = appDetailFragment.H();
                        String action2 = summaryTextDto.getAction();
                        if (action2 != null) {
                            t61.v(action2, "parse(...)", contextH3, NearbyRepository.SERVICE_ID, null);
                            return;
                        }
                        return;
                    case 8:
                        AppSummaryIconData appSummaryIconData = (AppSummaryIconData) obj;
                        int i112 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((lt) qg5Var, "<unused var>");
                        js3.p(appSummaryIconData, "recyclerData");
                        ClickEventBuilder clickEventBuilder4 = new ClickEventBuilder();
                        SummaryIconDto summaryIconDto = appSummaryIconData.a;
                        clickEventBuilder4.b("app_detail_summary_" + summaryIconDto.getAnalyticId());
                        clickEventBuilder4.a();
                        if (summaryIconDto.getSummaryDialog() != null) {
                            appDetailFragment.d2(summaryIconDto.getSummaryDialog());
                            return;
                        }
                        String action3 = summaryIconDto.getAction();
                        if (action3 == null || f88.n0(action3)) {
                            return;
                        }
                        Context contextH4 = appDetailFragment.H();
                        String action4 = summaryIconDto.getAction();
                        if (action4 != null) {
                            t61.v(action4, "parse(...)", contextH4, NearbyRepository.SERVICE_ID, null);
                            return;
                        }
                        return;
                    case 9:
                        AppBarData appBarData = (AppBarData) obj;
                        int i12 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.app.detail.ui.recycler.a) qg5Var, "<unused var>");
                        js3.p(appBarData, "recyclerData");
                        ClickEventBuilder clickEventBuilder5 = new ClickEventBuilder();
                        clickEventBuilder5.b("detail_icon");
                        clickEventBuilder5.a();
                        AppBarSampleData appBarSampleData = (AppBarSampleData) appBarData.g.getValue();
                        if (appBarSampleData == null || (highResUrl = appBarSampleData.getHighResUrl()) == null) {
                            return;
                        }
                        FragmentActivity fragmentActivityF2 = appDetailFragment.F();
                        zt5 zt5Var = fragmentActivityF2 instanceof zt5 ? (zt5) fragmentActivityF2 : null;
                        if (zt5Var != null) {
                            ((LaunchContentActivity) zt5Var).s0(appDetailFragment.K().getDimensionPixelSize(pq6.margin_default_v2_triple), highResUrl);
                            return;
                        }
                        return;
                    case 10:
                        AppSummaryRateData appSummaryRateData = (AppSummaryRateData) obj;
                        int i13 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((mt) qg5Var, "<unused var>");
                        js3.p(appSummaryRateData, "recyclerData");
                        ClickEventBuilder clickEventBuilder6 = new ClickEventBuilder();
                        clickEventBuilder6.b("app_detail_summary_" + appSummaryRateData.a.getAnalyticId());
                        clickEventBuilder6.a();
                        ClickEventBuilder clickEventBuilder7 = new ClickEventBuilder();
                        clickEventBuilder7.b("detail_all_review_info");
                        clickEventBuilder7.a();
                        ApplicationFullDto applicationFullDtoR6 = appDetailFragment.R1().R();
                        if (applicationFullDtoR6 == null || (rate = applicationFullDtoR6.getRate()) == null || (rates = rate.getRates()) == null) {
                            return;
                        }
                        hp hpVar3 = appDetailFragment.u1;
                        if (hpVar3 != null) {
                            appDetailFragment.b2(hpVar3.a, rates);
                            return;
                        } else {
                            js3.V("navArgs");
                            throw null;
                        }
                    case 11:
                        AppSummarySizeData appSummarySizeData = (AppSummarySizeData) obj;
                        int i14 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((f) qg5Var, "<unused var>");
                        js3.p(appSummarySizeData, "recyclerData");
                        ClickEventBuilder clickEventBuilder8 = new ClickEventBuilder();
                        clickEventBuilder8.b("app_detail_summary_" + appSummarySizeData.c);
                        clickEventBuilder8.a();
                        SummaryDialogDto summaryDialogDto = appSummarySizeData.d;
                        if (summaryDialogDto != null) {
                            appDetailFragment.d2(summaryDialogDto);
                            return;
                        }
                        return;
                    case 12:
                        rc rcVar = (rc) qg5Var;
                        AddaxBoxData addaxBoxData = (AddaxBoxData) obj;
                        int i15 = AppDetailFragment.M1;
                        js3.p(view, "view");
                        js3.p(rcVar, "viewHolder");
                        js3.p(addaxBoxData, "recyclerData");
                        AddaxBoxDto addaxBoxDto = addaxBoxData.a;
                        ClickEventBuilder clickEventBuilder9 = new ClickEventBuilder();
                        clickEventBuilder9.b("addax_action_detail_" + addaxBoxDto.getId());
                        clickEventBuilder9.a();
                        ClickEventBuilder clickEventBuilder10 = new ClickEventBuilder();
                        clickEventBuilder10.b("addax_action_detail_" + addaxBoxDto.getId() + "_" + addaxBoxDto.getDisplayMode());
                        clickEventBuilder10.a();
                        FragmentActivity fragmentActivityF3 = appDetailFragment.F();
                        if (fragmentActivityF3 != null) {
                            new wv8(fragmentActivityF3, appDetailFragment.v1).m(view, rcVar, addaxBoxData);
                            return;
                        }
                        return;
                    default:
                        AppMoreDescriptionData appMoreDescriptionData = (AppMoreDescriptionData) obj;
                        int i16 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((ar) qg5Var, "<unused var>");
                        js3.p(appMoreDescriptionData, "recyclerData");
                        ApplicationFullDto applicationFullDtoR7 = appDetailFragment.R1().R();
                        if (applicationFullDtoR7 != null) {
                            pk5.g(appDetailFragment.J0, new NavIntentDirections.MoreDescription(new tx4(appMoreDescriptionData.a, new ToolbarData(applicationFullDtoR7, appDetailFragment.R1().T(), appDetailFragment.R1().U(), appDetailFragment.R1().S()))), -1);
                            return;
                        }
                        return;
                }
            }
        };
        final int i12 = 1;
        zoVar.g0 = new og5(this) { // from class: cp
            public final /* synthetic */ AppDetailFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                String highResUrl;
                AppRateDto rate;
                List<RateDto> rates;
                int i22 = i12;
                AppDetailFragment appDetailFragment = this.b;
                switch (i22) {
                    case 0:
                        AppRatingModuleData appRatingModuleData = (AppRatingModuleData) obj;
                        int i32 = AppDetailFragment.M1;
                        js3.p(view, "view");
                        js3.p((d) qg5Var, "<unused var>");
                        js3.p(appRatingModuleData, "recyclerData");
                        appDetailFragment.U1();
                        boolean z = view instanceof MyketRatingBar;
                        dw1.y(z ? "review_stars_detail" : "review_write_detail");
                        ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                        clickEventBuilder.b("review_new_detail");
                        clickEventBuilder.a();
                        fw0 fw0VarU1 = appDetailFragment.U1();
                        ApplicationFullDto applicationFullDtoR = appDetailFragment.R1().R();
                        fw0VarU1.d(applicationFullDtoR.getPackageName(), applicationFullDtoR.getVersion().getCode(), applicationFullDtoR.getVersion().isIncompatible(), applicationFullDtoR.getForceUpdate());
                        AppDetailViewModel appDetailViewModelR1 = appDetailFragment.R1();
                        MyketRatingBar myketRatingBar = z ? (MyketRatingBar) view : null;
                        appDetailViewModelR1.W(myketRatingBar != null ? myketRatingBar.getRating() : 0.0f);
                        Bundle bundle = new Bundle();
                        hp hpVar2 = appDetailFragment.u1;
                        if (hpVar2 == null) {
                            js3.V("navArgs");
                            throw null;
                        }
                        bundle.putString("packageName", hpVar2.a);
                        bundle.putString("BUNDLE_KEY_EVENT_OK", "detail_dd_new_review_ok");
                        bundle.putString("BUNDLE_KEY_EVENT_CANCEL", "detail_dd_new_review_cancel");
                        AppDetailViewModel appDetailViewModelR12 = appDetailFragment.R1();
                        if (!appDetailViewModelR12.B.G(appDetailViewModelR12.J0.a)) {
                            pk5.g(appDetailFragment.J0, new NavIntentDirections.AlertBottom(new bd(new DialogDataModel(appDetailFragment.W1(), "DIALOG_KEY_SHOULD_BE_INSTALLED", bundle, 8), null, appDetailFragment.L(rs6.app_must_installed), appDetailFragment.L(rs6.download_app), appDetailFragment.L(rs6.button_cancel), true)), -1);
                            return;
                        }
                        ApplicationFullDto applicationFullDtoR2 = appDetailFragment.R1().R();
                        if (applicationFullDtoR2 != null) {
                            CommentScenario.SubmitReview submitReview = new CommentScenario.SubmitReview(new SubmitReviewData(applicationFullDtoR2.getPackageName(), ((Number) appRatingModuleData.b.getValue()).floatValue(), null, false, true, new ToolbarData(applicationFullDtoR2, appDetailFragment.R1().T(), appDetailFragment.R1().U(), appDetailFragment.R1().S()), "_detail", "DETAIL", 4, null));
                            FragmentActivity fragmentActivityF = appDetailFragment.F();
                            if (fragmentActivityF != null) {
                                pk5.c(fragmentActivityF, submitReview);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        AIReviewSummaryData aIReviewSummaryData = (AIReviewSummaryData) obj;
                        int i42 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(aIReviewSummaryData, "recyclerData");
                        appDetailFragment.R1().r(new AppDetailAction.ReviewAILikeAction(true, aIReviewSummaryData.a.getId()));
                        return;
                    case 2:
                        AIReviewSummaryData aIReviewSummaryData2 = (AIReviewSummaryData) obj;
                        int i52 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(aIReviewSummaryData2, "recyclerData");
                        appDetailFragment.R1().r(new AppDetailAction.ReviewAILikeAction(false, aIReviewSummaryData2.a.getId()));
                        return;
                    case 3:
                        int i62 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p((AIReviewSummaryData) obj, "<unused var>");
                        appDetailFragment.R1().r(AppDetailAction.ShowMoreAIAction.INSTANCE);
                        dw1.y("detail__ai_review_more_description");
                        return;
                    case 4:
                        AppDownloadData appDownloadData = (AppDownloadData) obj;
                        int i72 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(appDownloadData, "recyclerData");
                        sb7.p("AppDetail", "App Install Click", "Packagename: " + appDownloadData.g);
                        ApplicationFullDto applicationFullDtoR3 = appDetailFragment.R1().R();
                        if (applicationFullDtoR3 != null) {
                            appDetailFragment.Y1().C(new DownloadDataModel(applicationFullDtoR3, "detail", appDetailFragment.R1().T(), appDetailFragment.R1().S(), appDetailFragment.R1().U()));
                        }
                        dw1.y("button_install");
                        return;
                    case 5:
                        AppDownloadData appDownloadData2 = (AppDownloadData) obj;
                        int i82 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(appDownloadData2, "recyclerData");
                        sb7.p("AppDetail", "App Update Click", "Packagename: " + appDownloadData2.g);
                        ApplicationFullDto applicationFullDtoR4 = appDetailFragment.R1().R();
                        if (applicationFullDtoR4 != null) {
                            ps1 ps1Var = appDetailFragment.r1;
                            if (ps1Var == null) {
                                js3.V("downloadManager");
                                throw null;
                            }
                            AppDownloadInfo appDownloadInfoI = ps1Var.i(applicationFullDtoR4.getPackageName(), null);
                            if (wq2.l(applicationFullDtoR4.getSize().getLength(), appDownloadInfoI != null ? appDownloadInfoI.getLocalSize() : 0L)) {
                                appDetailFragment.j2();
                            } else {
                                appDetailFragment.S1();
                                ir.mservices.market.version2.manager.a.e(applicationFullDtoR4.getTitle(), applicationFullDtoR4.getIcon().getUrl());
                            }
                        }
                        dw1.y("detail_button_update");
                        return;
                    case 6:
                        AppDownloadData appDownloadData3 = (AppDownloadData) obj;
                        int i92 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(appDownloadData3, "recyclerData");
                        sb7.p("AppDetail", "App Run Click", "Packagename: " + appDownloadData3);
                        ClickEventBuilder clickEventBuilder2 = new ClickEventBuilder();
                        clickEventBuilder2.b("detail_button_run");
                        clickEventBuilder2.a();
                        ApplicationFullDto applicationFullDtoR5 = appDetailFragment.R1().R();
                        if (applicationFullDtoR5 != null) {
                            String strR = appDetailFragment.Y1().r(applicationFullDtoR5.getVersion().getCode(), applicationFullDtoR5.getPackageName());
                            if (strR != null && !f88.n0(strR)) {
                                Context contextH = appDetailFragment.H();
                                String packageName = applicationFullDtoR5.getPackageName();
                                Uri uri = Uri.parse(strR);
                                js3.o(uri, "parse(...)");
                                if (!js8.q(contextH, uri, packageName, null)) {
                                    dp3.M(applicationFullDtoR5.getPackageName());
                                }
                                appDetailFragment.Y1().e(applicationFullDtoR5.getVersion().getCode(), applicationFullDtoR5.getPackageName());
                                return;
                            }
                            if (!appDetailFragment.Y1().K(applicationFullDtoR5.getPackageName())) {
                                Context contextH2 = appDetailFragment.H();
                                hh2.H(new hh2(contextH2, contextH2 != null ? contextH2.getString(rs6.app_not_runnable) : null));
                                return;
                            }
                            ApplicationCheetahDto cheetah = applicationFullDtoR5.getCheetah();
                            if (cheetah == null || !cheetah.getEnable()) {
                                dp3.M(applicationFullDtoR5.getPackageName());
                                return;
                            } else {
                                pk5.g(appDetailFragment.J0, new NavIntentDirections.Cheetah(new eq0(applicationFullDtoR5.getPackageName(), applicationFullDtoR5.getIcon().getUrl(), false)), -1);
                                return;
                            }
                        }
                        return;
                    case 7:
                        AppSummaryTextData appSummaryTextData = (AppSummaryTextData) obj;
                        int i102 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((nt) qg5Var, "<unused var>");
                        js3.p(appSummaryTextData, "recyclerData");
                        ClickEventBuilder clickEventBuilder3 = new ClickEventBuilder();
                        SummaryTextDto summaryTextDto = appSummaryTextData.a;
                        clickEventBuilder3.b("app_detail_summary_" + summaryTextDto.getAnalyticId());
                        clickEventBuilder3.a();
                        if (summaryTextDto.getSummaryDialog() != null) {
                            appDetailFragment.d2(summaryTextDto.getSummaryDialog());
                            return;
                        }
                        String action = summaryTextDto.getAction();
                        if (action == null || f88.n0(action)) {
                            return;
                        }
                        Context contextH3 = appDetailFragment.H();
                        String action2 = summaryTextDto.getAction();
                        if (action2 != null) {
                            t61.v(action2, "parse(...)", contextH3, NearbyRepository.SERVICE_ID, null);
                            return;
                        }
                        return;
                    case 8:
                        AppSummaryIconData appSummaryIconData = (AppSummaryIconData) obj;
                        int i112 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((lt) qg5Var, "<unused var>");
                        js3.p(appSummaryIconData, "recyclerData");
                        ClickEventBuilder clickEventBuilder4 = new ClickEventBuilder();
                        SummaryIconDto summaryIconDto = appSummaryIconData.a;
                        clickEventBuilder4.b("app_detail_summary_" + summaryIconDto.getAnalyticId());
                        clickEventBuilder4.a();
                        if (summaryIconDto.getSummaryDialog() != null) {
                            appDetailFragment.d2(summaryIconDto.getSummaryDialog());
                            return;
                        }
                        String action3 = summaryIconDto.getAction();
                        if (action3 == null || f88.n0(action3)) {
                            return;
                        }
                        Context contextH4 = appDetailFragment.H();
                        String action4 = summaryIconDto.getAction();
                        if (action4 != null) {
                            t61.v(action4, "parse(...)", contextH4, NearbyRepository.SERVICE_ID, null);
                            return;
                        }
                        return;
                    case 9:
                        AppBarData appBarData = (AppBarData) obj;
                        int i122 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.app.detail.ui.recycler.a) qg5Var, "<unused var>");
                        js3.p(appBarData, "recyclerData");
                        ClickEventBuilder clickEventBuilder5 = new ClickEventBuilder();
                        clickEventBuilder5.b("detail_icon");
                        clickEventBuilder5.a();
                        AppBarSampleData appBarSampleData = (AppBarSampleData) appBarData.g.getValue();
                        if (appBarSampleData == null || (highResUrl = appBarSampleData.getHighResUrl()) == null) {
                            return;
                        }
                        FragmentActivity fragmentActivityF2 = appDetailFragment.F();
                        zt5 zt5Var = fragmentActivityF2 instanceof zt5 ? (zt5) fragmentActivityF2 : null;
                        if (zt5Var != null) {
                            ((LaunchContentActivity) zt5Var).s0(appDetailFragment.K().getDimensionPixelSize(pq6.margin_default_v2_triple), highResUrl);
                            return;
                        }
                        return;
                    case 10:
                        AppSummaryRateData appSummaryRateData = (AppSummaryRateData) obj;
                        int i13 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((mt) qg5Var, "<unused var>");
                        js3.p(appSummaryRateData, "recyclerData");
                        ClickEventBuilder clickEventBuilder6 = new ClickEventBuilder();
                        clickEventBuilder6.b("app_detail_summary_" + appSummaryRateData.a.getAnalyticId());
                        clickEventBuilder6.a();
                        ClickEventBuilder clickEventBuilder7 = new ClickEventBuilder();
                        clickEventBuilder7.b("detail_all_review_info");
                        clickEventBuilder7.a();
                        ApplicationFullDto applicationFullDtoR6 = appDetailFragment.R1().R();
                        if (applicationFullDtoR6 == null || (rate = applicationFullDtoR6.getRate()) == null || (rates = rate.getRates()) == null) {
                            return;
                        }
                        hp hpVar3 = appDetailFragment.u1;
                        if (hpVar3 != null) {
                            appDetailFragment.b2(hpVar3.a, rates);
                            return;
                        } else {
                            js3.V("navArgs");
                            throw null;
                        }
                    case 11:
                        AppSummarySizeData appSummarySizeData = (AppSummarySizeData) obj;
                        int i14 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((f) qg5Var, "<unused var>");
                        js3.p(appSummarySizeData, "recyclerData");
                        ClickEventBuilder clickEventBuilder8 = new ClickEventBuilder();
                        clickEventBuilder8.b("app_detail_summary_" + appSummarySizeData.c);
                        clickEventBuilder8.a();
                        SummaryDialogDto summaryDialogDto = appSummarySizeData.d;
                        if (summaryDialogDto != null) {
                            appDetailFragment.d2(summaryDialogDto);
                            return;
                        }
                        return;
                    case 12:
                        rc rcVar = (rc) qg5Var;
                        AddaxBoxData addaxBoxData = (AddaxBoxData) obj;
                        int i15 = AppDetailFragment.M1;
                        js3.p(view, "view");
                        js3.p(rcVar, "viewHolder");
                        js3.p(addaxBoxData, "recyclerData");
                        AddaxBoxDto addaxBoxDto = addaxBoxData.a;
                        ClickEventBuilder clickEventBuilder9 = new ClickEventBuilder();
                        clickEventBuilder9.b("addax_action_detail_" + addaxBoxDto.getId());
                        clickEventBuilder9.a();
                        ClickEventBuilder clickEventBuilder10 = new ClickEventBuilder();
                        clickEventBuilder10.b("addax_action_detail_" + addaxBoxDto.getId() + "_" + addaxBoxDto.getDisplayMode());
                        clickEventBuilder10.a();
                        FragmentActivity fragmentActivityF3 = appDetailFragment.F();
                        if (fragmentActivityF3 != null) {
                            new wv8(fragmentActivityF3, appDetailFragment.v1).m(view, rcVar, addaxBoxData);
                            return;
                        }
                        return;
                    default:
                        AppMoreDescriptionData appMoreDescriptionData = (AppMoreDescriptionData) obj;
                        int i16 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((ar) qg5Var, "<unused var>");
                        js3.p(appMoreDescriptionData, "recyclerData");
                        ApplicationFullDto applicationFullDtoR7 = appDetailFragment.R1().R();
                        if (applicationFullDtoR7 != null) {
                            pk5.g(appDetailFragment.J0, new NavIntentDirections.MoreDescription(new tx4(appMoreDescriptionData.a, new ToolbarData(applicationFullDtoR7, appDetailFragment.R1().T(), appDetailFragment.R1().U(), appDetailFragment.R1().S()))), -1);
                            return;
                        }
                        return;
                }
            }
        };
        final int i13 = 2;
        zoVar.h0 = new og5(this) { // from class: cp
            public final /* synthetic */ AppDetailFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                String highResUrl;
                AppRateDto rate;
                List<RateDto> rates;
                int i22 = i13;
                AppDetailFragment appDetailFragment = this.b;
                switch (i22) {
                    case 0:
                        AppRatingModuleData appRatingModuleData = (AppRatingModuleData) obj;
                        int i32 = AppDetailFragment.M1;
                        js3.p(view, "view");
                        js3.p((d) qg5Var, "<unused var>");
                        js3.p(appRatingModuleData, "recyclerData");
                        appDetailFragment.U1();
                        boolean z = view instanceof MyketRatingBar;
                        dw1.y(z ? "review_stars_detail" : "review_write_detail");
                        ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                        clickEventBuilder.b("review_new_detail");
                        clickEventBuilder.a();
                        fw0 fw0VarU1 = appDetailFragment.U1();
                        ApplicationFullDto applicationFullDtoR = appDetailFragment.R1().R();
                        fw0VarU1.d(applicationFullDtoR.getPackageName(), applicationFullDtoR.getVersion().getCode(), applicationFullDtoR.getVersion().isIncompatible(), applicationFullDtoR.getForceUpdate());
                        AppDetailViewModel appDetailViewModelR1 = appDetailFragment.R1();
                        MyketRatingBar myketRatingBar = z ? (MyketRatingBar) view : null;
                        appDetailViewModelR1.W(myketRatingBar != null ? myketRatingBar.getRating() : 0.0f);
                        Bundle bundle = new Bundle();
                        hp hpVar2 = appDetailFragment.u1;
                        if (hpVar2 == null) {
                            js3.V("navArgs");
                            throw null;
                        }
                        bundle.putString("packageName", hpVar2.a);
                        bundle.putString("BUNDLE_KEY_EVENT_OK", "detail_dd_new_review_ok");
                        bundle.putString("BUNDLE_KEY_EVENT_CANCEL", "detail_dd_new_review_cancel");
                        AppDetailViewModel appDetailViewModelR12 = appDetailFragment.R1();
                        if (!appDetailViewModelR12.B.G(appDetailViewModelR12.J0.a)) {
                            pk5.g(appDetailFragment.J0, new NavIntentDirections.AlertBottom(new bd(new DialogDataModel(appDetailFragment.W1(), "DIALOG_KEY_SHOULD_BE_INSTALLED", bundle, 8), null, appDetailFragment.L(rs6.app_must_installed), appDetailFragment.L(rs6.download_app), appDetailFragment.L(rs6.button_cancel), true)), -1);
                            return;
                        }
                        ApplicationFullDto applicationFullDtoR2 = appDetailFragment.R1().R();
                        if (applicationFullDtoR2 != null) {
                            CommentScenario.SubmitReview submitReview = new CommentScenario.SubmitReview(new SubmitReviewData(applicationFullDtoR2.getPackageName(), ((Number) appRatingModuleData.b.getValue()).floatValue(), null, false, true, new ToolbarData(applicationFullDtoR2, appDetailFragment.R1().T(), appDetailFragment.R1().U(), appDetailFragment.R1().S()), "_detail", "DETAIL", 4, null));
                            FragmentActivity fragmentActivityF = appDetailFragment.F();
                            if (fragmentActivityF != null) {
                                pk5.c(fragmentActivityF, submitReview);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        AIReviewSummaryData aIReviewSummaryData = (AIReviewSummaryData) obj;
                        int i42 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(aIReviewSummaryData, "recyclerData");
                        appDetailFragment.R1().r(new AppDetailAction.ReviewAILikeAction(true, aIReviewSummaryData.a.getId()));
                        return;
                    case 2:
                        AIReviewSummaryData aIReviewSummaryData2 = (AIReviewSummaryData) obj;
                        int i52 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(aIReviewSummaryData2, "recyclerData");
                        appDetailFragment.R1().r(new AppDetailAction.ReviewAILikeAction(false, aIReviewSummaryData2.a.getId()));
                        return;
                    case 3:
                        int i62 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p((AIReviewSummaryData) obj, "<unused var>");
                        appDetailFragment.R1().r(AppDetailAction.ShowMoreAIAction.INSTANCE);
                        dw1.y("detail__ai_review_more_description");
                        return;
                    case 4:
                        AppDownloadData appDownloadData = (AppDownloadData) obj;
                        int i72 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(appDownloadData, "recyclerData");
                        sb7.p("AppDetail", "App Install Click", "Packagename: " + appDownloadData.g);
                        ApplicationFullDto applicationFullDtoR3 = appDetailFragment.R1().R();
                        if (applicationFullDtoR3 != null) {
                            appDetailFragment.Y1().C(new DownloadDataModel(applicationFullDtoR3, "detail", appDetailFragment.R1().T(), appDetailFragment.R1().S(), appDetailFragment.R1().U()));
                        }
                        dw1.y("button_install");
                        return;
                    case 5:
                        AppDownloadData appDownloadData2 = (AppDownloadData) obj;
                        int i82 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(appDownloadData2, "recyclerData");
                        sb7.p("AppDetail", "App Update Click", "Packagename: " + appDownloadData2.g);
                        ApplicationFullDto applicationFullDtoR4 = appDetailFragment.R1().R();
                        if (applicationFullDtoR4 != null) {
                            ps1 ps1Var = appDetailFragment.r1;
                            if (ps1Var == null) {
                                js3.V("downloadManager");
                                throw null;
                            }
                            AppDownloadInfo appDownloadInfoI = ps1Var.i(applicationFullDtoR4.getPackageName(), null);
                            if (wq2.l(applicationFullDtoR4.getSize().getLength(), appDownloadInfoI != null ? appDownloadInfoI.getLocalSize() : 0L)) {
                                appDetailFragment.j2();
                            } else {
                                appDetailFragment.S1();
                                ir.mservices.market.version2.manager.a.e(applicationFullDtoR4.getTitle(), applicationFullDtoR4.getIcon().getUrl());
                            }
                        }
                        dw1.y("detail_button_update");
                        return;
                    case 6:
                        AppDownloadData appDownloadData3 = (AppDownloadData) obj;
                        int i92 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(appDownloadData3, "recyclerData");
                        sb7.p("AppDetail", "App Run Click", "Packagename: " + appDownloadData3);
                        ClickEventBuilder clickEventBuilder2 = new ClickEventBuilder();
                        clickEventBuilder2.b("detail_button_run");
                        clickEventBuilder2.a();
                        ApplicationFullDto applicationFullDtoR5 = appDetailFragment.R1().R();
                        if (applicationFullDtoR5 != null) {
                            String strR = appDetailFragment.Y1().r(applicationFullDtoR5.getVersion().getCode(), applicationFullDtoR5.getPackageName());
                            if (strR != null && !f88.n0(strR)) {
                                Context contextH = appDetailFragment.H();
                                String packageName = applicationFullDtoR5.getPackageName();
                                Uri uri = Uri.parse(strR);
                                js3.o(uri, "parse(...)");
                                if (!js8.q(contextH, uri, packageName, null)) {
                                    dp3.M(applicationFullDtoR5.getPackageName());
                                }
                                appDetailFragment.Y1().e(applicationFullDtoR5.getVersion().getCode(), applicationFullDtoR5.getPackageName());
                                return;
                            }
                            if (!appDetailFragment.Y1().K(applicationFullDtoR5.getPackageName())) {
                                Context contextH2 = appDetailFragment.H();
                                hh2.H(new hh2(contextH2, contextH2 != null ? contextH2.getString(rs6.app_not_runnable) : null));
                                return;
                            }
                            ApplicationCheetahDto cheetah = applicationFullDtoR5.getCheetah();
                            if (cheetah == null || !cheetah.getEnable()) {
                                dp3.M(applicationFullDtoR5.getPackageName());
                                return;
                            } else {
                                pk5.g(appDetailFragment.J0, new NavIntentDirections.Cheetah(new eq0(applicationFullDtoR5.getPackageName(), applicationFullDtoR5.getIcon().getUrl(), false)), -1);
                                return;
                            }
                        }
                        return;
                    case 7:
                        AppSummaryTextData appSummaryTextData = (AppSummaryTextData) obj;
                        int i102 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((nt) qg5Var, "<unused var>");
                        js3.p(appSummaryTextData, "recyclerData");
                        ClickEventBuilder clickEventBuilder3 = new ClickEventBuilder();
                        SummaryTextDto summaryTextDto = appSummaryTextData.a;
                        clickEventBuilder3.b("app_detail_summary_" + summaryTextDto.getAnalyticId());
                        clickEventBuilder3.a();
                        if (summaryTextDto.getSummaryDialog() != null) {
                            appDetailFragment.d2(summaryTextDto.getSummaryDialog());
                            return;
                        }
                        String action = summaryTextDto.getAction();
                        if (action == null || f88.n0(action)) {
                            return;
                        }
                        Context contextH3 = appDetailFragment.H();
                        String action2 = summaryTextDto.getAction();
                        if (action2 != null) {
                            t61.v(action2, "parse(...)", contextH3, NearbyRepository.SERVICE_ID, null);
                            return;
                        }
                        return;
                    case 8:
                        AppSummaryIconData appSummaryIconData = (AppSummaryIconData) obj;
                        int i112 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((lt) qg5Var, "<unused var>");
                        js3.p(appSummaryIconData, "recyclerData");
                        ClickEventBuilder clickEventBuilder4 = new ClickEventBuilder();
                        SummaryIconDto summaryIconDto = appSummaryIconData.a;
                        clickEventBuilder4.b("app_detail_summary_" + summaryIconDto.getAnalyticId());
                        clickEventBuilder4.a();
                        if (summaryIconDto.getSummaryDialog() != null) {
                            appDetailFragment.d2(summaryIconDto.getSummaryDialog());
                            return;
                        }
                        String action3 = summaryIconDto.getAction();
                        if (action3 == null || f88.n0(action3)) {
                            return;
                        }
                        Context contextH4 = appDetailFragment.H();
                        String action4 = summaryIconDto.getAction();
                        if (action4 != null) {
                            t61.v(action4, "parse(...)", contextH4, NearbyRepository.SERVICE_ID, null);
                            return;
                        }
                        return;
                    case 9:
                        AppBarData appBarData = (AppBarData) obj;
                        int i122 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.app.detail.ui.recycler.a) qg5Var, "<unused var>");
                        js3.p(appBarData, "recyclerData");
                        ClickEventBuilder clickEventBuilder5 = new ClickEventBuilder();
                        clickEventBuilder5.b("detail_icon");
                        clickEventBuilder5.a();
                        AppBarSampleData appBarSampleData = (AppBarSampleData) appBarData.g.getValue();
                        if (appBarSampleData == null || (highResUrl = appBarSampleData.getHighResUrl()) == null) {
                            return;
                        }
                        FragmentActivity fragmentActivityF2 = appDetailFragment.F();
                        zt5 zt5Var = fragmentActivityF2 instanceof zt5 ? (zt5) fragmentActivityF2 : null;
                        if (zt5Var != null) {
                            ((LaunchContentActivity) zt5Var).s0(appDetailFragment.K().getDimensionPixelSize(pq6.margin_default_v2_triple), highResUrl);
                            return;
                        }
                        return;
                    case 10:
                        AppSummaryRateData appSummaryRateData = (AppSummaryRateData) obj;
                        int i132 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((mt) qg5Var, "<unused var>");
                        js3.p(appSummaryRateData, "recyclerData");
                        ClickEventBuilder clickEventBuilder6 = new ClickEventBuilder();
                        clickEventBuilder6.b("app_detail_summary_" + appSummaryRateData.a.getAnalyticId());
                        clickEventBuilder6.a();
                        ClickEventBuilder clickEventBuilder7 = new ClickEventBuilder();
                        clickEventBuilder7.b("detail_all_review_info");
                        clickEventBuilder7.a();
                        ApplicationFullDto applicationFullDtoR6 = appDetailFragment.R1().R();
                        if (applicationFullDtoR6 == null || (rate = applicationFullDtoR6.getRate()) == null || (rates = rate.getRates()) == null) {
                            return;
                        }
                        hp hpVar3 = appDetailFragment.u1;
                        if (hpVar3 != null) {
                            appDetailFragment.b2(hpVar3.a, rates);
                            return;
                        } else {
                            js3.V("navArgs");
                            throw null;
                        }
                    case 11:
                        AppSummarySizeData appSummarySizeData = (AppSummarySizeData) obj;
                        int i14 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((f) qg5Var, "<unused var>");
                        js3.p(appSummarySizeData, "recyclerData");
                        ClickEventBuilder clickEventBuilder8 = new ClickEventBuilder();
                        clickEventBuilder8.b("app_detail_summary_" + appSummarySizeData.c);
                        clickEventBuilder8.a();
                        SummaryDialogDto summaryDialogDto = appSummarySizeData.d;
                        if (summaryDialogDto != null) {
                            appDetailFragment.d2(summaryDialogDto);
                            return;
                        }
                        return;
                    case 12:
                        rc rcVar = (rc) qg5Var;
                        AddaxBoxData addaxBoxData = (AddaxBoxData) obj;
                        int i15 = AppDetailFragment.M1;
                        js3.p(view, "view");
                        js3.p(rcVar, "viewHolder");
                        js3.p(addaxBoxData, "recyclerData");
                        AddaxBoxDto addaxBoxDto = addaxBoxData.a;
                        ClickEventBuilder clickEventBuilder9 = new ClickEventBuilder();
                        clickEventBuilder9.b("addax_action_detail_" + addaxBoxDto.getId());
                        clickEventBuilder9.a();
                        ClickEventBuilder clickEventBuilder10 = new ClickEventBuilder();
                        clickEventBuilder10.b("addax_action_detail_" + addaxBoxDto.getId() + "_" + addaxBoxDto.getDisplayMode());
                        clickEventBuilder10.a();
                        FragmentActivity fragmentActivityF3 = appDetailFragment.F();
                        if (fragmentActivityF3 != null) {
                            new wv8(fragmentActivityF3, appDetailFragment.v1).m(view, rcVar, addaxBoxData);
                            return;
                        }
                        return;
                    default:
                        AppMoreDescriptionData appMoreDescriptionData = (AppMoreDescriptionData) obj;
                        int i16 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((ar) qg5Var, "<unused var>");
                        js3.p(appMoreDescriptionData, "recyclerData");
                        ApplicationFullDto applicationFullDtoR7 = appDetailFragment.R1().R();
                        if (applicationFullDtoR7 != null) {
                            pk5.g(appDetailFragment.J0, new NavIntentDirections.MoreDescription(new tx4(appMoreDescriptionData.a, new ToolbarData(applicationFullDtoR7, appDetailFragment.R1().T(), appDetailFragment.R1().U(), appDetailFragment.R1().S()))), -1);
                            return;
                        }
                        return;
                }
            }
        };
        final int i14 = 3;
        zoVar.i0 = new og5(this) { // from class: cp
            public final /* synthetic */ AppDetailFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                String highResUrl;
                AppRateDto rate;
                List<RateDto> rates;
                int i22 = i14;
                AppDetailFragment appDetailFragment = this.b;
                switch (i22) {
                    case 0:
                        AppRatingModuleData appRatingModuleData = (AppRatingModuleData) obj;
                        int i32 = AppDetailFragment.M1;
                        js3.p(view, "view");
                        js3.p((d) qg5Var, "<unused var>");
                        js3.p(appRatingModuleData, "recyclerData");
                        appDetailFragment.U1();
                        boolean z = view instanceof MyketRatingBar;
                        dw1.y(z ? "review_stars_detail" : "review_write_detail");
                        ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                        clickEventBuilder.b("review_new_detail");
                        clickEventBuilder.a();
                        fw0 fw0VarU1 = appDetailFragment.U1();
                        ApplicationFullDto applicationFullDtoR = appDetailFragment.R1().R();
                        fw0VarU1.d(applicationFullDtoR.getPackageName(), applicationFullDtoR.getVersion().getCode(), applicationFullDtoR.getVersion().isIncompatible(), applicationFullDtoR.getForceUpdate());
                        AppDetailViewModel appDetailViewModelR1 = appDetailFragment.R1();
                        MyketRatingBar myketRatingBar = z ? (MyketRatingBar) view : null;
                        appDetailViewModelR1.W(myketRatingBar != null ? myketRatingBar.getRating() : 0.0f);
                        Bundle bundle = new Bundle();
                        hp hpVar2 = appDetailFragment.u1;
                        if (hpVar2 == null) {
                            js3.V("navArgs");
                            throw null;
                        }
                        bundle.putString("packageName", hpVar2.a);
                        bundle.putString("BUNDLE_KEY_EVENT_OK", "detail_dd_new_review_ok");
                        bundle.putString("BUNDLE_KEY_EVENT_CANCEL", "detail_dd_new_review_cancel");
                        AppDetailViewModel appDetailViewModelR12 = appDetailFragment.R1();
                        if (!appDetailViewModelR12.B.G(appDetailViewModelR12.J0.a)) {
                            pk5.g(appDetailFragment.J0, new NavIntentDirections.AlertBottom(new bd(new DialogDataModel(appDetailFragment.W1(), "DIALOG_KEY_SHOULD_BE_INSTALLED", bundle, 8), null, appDetailFragment.L(rs6.app_must_installed), appDetailFragment.L(rs6.download_app), appDetailFragment.L(rs6.button_cancel), true)), -1);
                            return;
                        }
                        ApplicationFullDto applicationFullDtoR2 = appDetailFragment.R1().R();
                        if (applicationFullDtoR2 != null) {
                            CommentScenario.SubmitReview submitReview = new CommentScenario.SubmitReview(new SubmitReviewData(applicationFullDtoR2.getPackageName(), ((Number) appRatingModuleData.b.getValue()).floatValue(), null, false, true, new ToolbarData(applicationFullDtoR2, appDetailFragment.R1().T(), appDetailFragment.R1().U(), appDetailFragment.R1().S()), "_detail", "DETAIL", 4, null));
                            FragmentActivity fragmentActivityF = appDetailFragment.F();
                            if (fragmentActivityF != null) {
                                pk5.c(fragmentActivityF, submitReview);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        AIReviewSummaryData aIReviewSummaryData = (AIReviewSummaryData) obj;
                        int i42 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(aIReviewSummaryData, "recyclerData");
                        appDetailFragment.R1().r(new AppDetailAction.ReviewAILikeAction(true, aIReviewSummaryData.a.getId()));
                        return;
                    case 2:
                        AIReviewSummaryData aIReviewSummaryData2 = (AIReviewSummaryData) obj;
                        int i52 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(aIReviewSummaryData2, "recyclerData");
                        appDetailFragment.R1().r(new AppDetailAction.ReviewAILikeAction(false, aIReviewSummaryData2.a.getId()));
                        return;
                    case 3:
                        int i62 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p((AIReviewSummaryData) obj, "<unused var>");
                        appDetailFragment.R1().r(AppDetailAction.ShowMoreAIAction.INSTANCE);
                        dw1.y("detail__ai_review_more_description");
                        return;
                    case 4:
                        AppDownloadData appDownloadData = (AppDownloadData) obj;
                        int i72 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(appDownloadData, "recyclerData");
                        sb7.p("AppDetail", "App Install Click", "Packagename: " + appDownloadData.g);
                        ApplicationFullDto applicationFullDtoR3 = appDetailFragment.R1().R();
                        if (applicationFullDtoR3 != null) {
                            appDetailFragment.Y1().C(new DownloadDataModel(applicationFullDtoR3, "detail", appDetailFragment.R1().T(), appDetailFragment.R1().S(), appDetailFragment.R1().U()));
                        }
                        dw1.y("button_install");
                        return;
                    case 5:
                        AppDownloadData appDownloadData2 = (AppDownloadData) obj;
                        int i82 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(appDownloadData2, "recyclerData");
                        sb7.p("AppDetail", "App Update Click", "Packagename: " + appDownloadData2.g);
                        ApplicationFullDto applicationFullDtoR4 = appDetailFragment.R1().R();
                        if (applicationFullDtoR4 != null) {
                            ps1 ps1Var = appDetailFragment.r1;
                            if (ps1Var == null) {
                                js3.V("downloadManager");
                                throw null;
                            }
                            AppDownloadInfo appDownloadInfoI = ps1Var.i(applicationFullDtoR4.getPackageName(), null);
                            if (wq2.l(applicationFullDtoR4.getSize().getLength(), appDownloadInfoI != null ? appDownloadInfoI.getLocalSize() : 0L)) {
                                appDetailFragment.j2();
                            } else {
                                appDetailFragment.S1();
                                ir.mservices.market.version2.manager.a.e(applicationFullDtoR4.getTitle(), applicationFullDtoR4.getIcon().getUrl());
                            }
                        }
                        dw1.y("detail_button_update");
                        return;
                    case 6:
                        AppDownloadData appDownloadData3 = (AppDownloadData) obj;
                        int i92 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(appDownloadData3, "recyclerData");
                        sb7.p("AppDetail", "App Run Click", "Packagename: " + appDownloadData3);
                        ClickEventBuilder clickEventBuilder2 = new ClickEventBuilder();
                        clickEventBuilder2.b("detail_button_run");
                        clickEventBuilder2.a();
                        ApplicationFullDto applicationFullDtoR5 = appDetailFragment.R1().R();
                        if (applicationFullDtoR5 != null) {
                            String strR = appDetailFragment.Y1().r(applicationFullDtoR5.getVersion().getCode(), applicationFullDtoR5.getPackageName());
                            if (strR != null && !f88.n0(strR)) {
                                Context contextH = appDetailFragment.H();
                                String packageName = applicationFullDtoR5.getPackageName();
                                Uri uri = Uri.parse(strR);
                                js3.o(uri, "parse(...)");
                                if (!js8.q(contextH, uri, packageName, null)) {
                                    dp3.M(applicationFullDtoR5.getPackageName());
                                }
                                appDetailFragment.Y1().e(applicationFullDtoR5.getVersion().getCode(), applicationFullDtoR5.getPackageName());
                                return;
                            }
                            if (!appDetailFragment.Y1().K(applicationFullDtoR5.getPackageName())) {
                                Context contextH2 = appDetailFragment.H();
                                hh2.H(new hh2(contextH2, contextH2 != null ? contextH2.getString(rs6.app_not_runnable) : null));
                                return;
                            }
                            ApplicationCheetahDto cheetah = applicationFullDtoR5.getCheetah();
                            if (cheetah == null || !cheetah.getEnable()) {
                                dp3.M(applicationFullDtoR5.getPackageName());
                                return;
                            } else {
                                pk5.g(appDetailFragment.J0, new NavIntentDirections.Cheetah(new eq0(applicationFullDtoR5.getPackageName(), applicationFullDtoR5.getIcon().getUrl(), false)), -1);
                                return;
                            }
                        }
                        return;
                    case 7:
                        AppSummaryTextData appSummaryTextData = (AppSummaryTextData) obj;
                        int i102 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((nt) qg5Var, "<unused var>");
                        js3.p(appSummaryTextData, "recyclerData");
                        ClickEventBuilder clickEventBuilder3 = new ClickEventBuilder();
                        SummaryTextDto summaryTextDto = appSummaryTextData.a;
                        clickEventBuilder3.b("app_detail_summary_" + summaryTextDto.getAnalyticId());
                        clickEventBuilder3.a();
                        if (summaryTextDto.getSummaryDialog() != null) {
                            appDetailFragment.d2(summaryTextDto.getSummaryDialog());
                            return;
                        }
                        String action = summaryTextDto.getAction();
                        if (action == null || f88.n0(action)) {
                            return;
                        }
                        Context contextH3 = appDetailFragment.H();
                        String action2 = summaryTextDto.getAction();
                        if (action2 != null) {
                            t61.v(action2, "parse(...)", contextH3, NearbyRepository.SERVICE_ID, null);
                            return;
                        }
                        return;
                    case 8:
                        AppSummaryIconData appSummaryIconData = (AppSummaryIconData) obj;
                        int i112 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((lt) qg5Var, "<unused var>");
                        js3.p(appSummaryIconData, "recyclerData");
                        ClickEventBuilder clickEventBuilder4 = new ClickEventBuilder();
                        SummaryIconDto summaryIconDto = appSummaryIconData.a;
                        clickEventBuilder4.b("app_detail_summary_" + summaryIconDto.getAnalyticId());
                        clickEventBuilder4.a();
                        if (summaryIconDto.getSummaryDialog() != null) {
                            appDetailFragment.d2(summaryIconDto.getSummaryDialog());
                            return;
                        }
                        String action3 = summaryIconDto.getAction();
                        if (action3 == null || f88.n0(action3)) {
                            return;
                        }
                        Context contextH4 = appDetailFragment.H();
                        String action4 = summaryIconDto.getAction();
                        if (action4 != null) {
                            t61.v(action4, "parse(...)", contextH4, NearbyRepository.SERVICE_ID, null);
                            return;
                        }
                        return;
                    case 9:
                        AppBarData appBarData = (AppBarData) obj;
                        int i122 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.app.detail.ui.recycler.a) qg5Var, "<unused var>");
                        js3.p(appBarData, "recyclerData");
                        ClickEventBuilder clickEventBuilder5 = new ClickEventBuilder();
                        clickEventBuilder5.b("detail_icon");
                        clickEventBuilder5.a();
                        AppBarSampleData appBarSampleData = (AppBarSampleData) appBarData.g.getValue();
                        if (appBarSampleData == null || (highResUrl = appBarSampleData.getHighResUrl()) == null) {
                            return;
                        }
                        FragmentActivity fragmentActivityF2 = appDetailFragment.F();
                        zt5 zt5Var = fragmentActivityF2 instanceof zt5 ? (zt5) fragmentActivityF2 : null;
                        if (zt5Var != null) {
                            ((LaunchContentActivity) zt5Var).s0(appDetailFragment.K().getDimensionPixelSize(pq6.margin_default_v2_triple), highResUrl);
                            return;
                        }
                        return;
                    case 10:
                        AppSummaryRateData appSummaryRateData = (AppSummaryRateData) obj;
                        int i132 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((mt) qg5Var, "<unused var>");
                        js3.p(appSummaryRateData, "recyclerData");
                        ClickEventBuilder clickEventBuilder6 = new ClickEventBuilder();
                        clickEventBuilder6.b("app_detail_summary_" + appSummaryRateData.a.getAnalyticId());
                        clickEventBuilder6.a();
                        ClickEventBuilder clickEventBuilder7 = new ClickEventBuilder();
                        clickEventBuilder7.b("detail_all_review_info");
                        clickEventBuilder7.a();
                        ApplicationFullDto applicationFullDtoR6 = appDetailFragment.R1().R();
                        if (applicationFullDtoR6 == null || (rate = applicationFullDtoR6.getRate()) == null || (rates = rate.getRates()) == null) {
                            return;
                        }
                        hp hpVar3 = appDetailFragment.u1;
                        if (hpVar3 != null) {
                            appDetailFragment.b2(hpVar3.a, rates);
                            return;
                        } else {
                            js3.V("navArgs");
                            throw null;
                        }
                    case 11:
                        AppSummarySizeData appSummarySizeData = (AppSummarySizeData) obj;
                        int i142 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((f) qg5Var, "<unused var>");
                        js3.p(appSummarySizeData, "recyclerData");
                        ClickEventBuilder clickEventBuilder8 = new ClickEventBuilder();
                        clickEventBuilder8.b("app_detail_summary_" + appSummarySizeData.c);
                        clickEventBuilder8.a();
                        SummaryDialogDto summaryDialogDto = appSummarySizeData.d;
                        if (summaryDialogDto != null) {
                            appDetailFragment.d2(summaryDialogDto);
                            return;
                        }
                        return;
                    case 12:
                        rc rcVar = (rc) qg5Var;
                        AddaxBoxData addaxBoxData = (AddaxBoxData) obj;
                        int i15 = AppDetailFragment.M1;
                        js3.p(view, "view");
                        js3.p(rcVar, "viewHolder");
                        js3.p(addaxBoxData, "recyclerData");
                        AddaxBoxDto addaxBoxDto = addaxBoxData.a;
                        ClickEventBuilder clickEventBuilder9 = new ClickEventBuilder();
                        clickEventBuilder9.b("addax_action_detail_" + addaxBoxDto.getId());
                        clickEventBuilder9.a();
                        ClickEventBuilder clickEventBuilder10 = new ClickEventBuilder();
                        clickEventBuilder10.b("addax_action_detail_" + addaxBoxDto.getId() + "_" + addaxBoxDto.getDisplayMode());
                        clickEventBuilder10.a();
                        FragmentActivity fragmentActivityF3 = appDetailFragment.F();
                        if (fragmentActivityF3 != null) {
                            new wv8(fragmentActivityF3, appDetailFragment.v1).m(view, rcVar, addaxBoxData);
                            return;
                        }
                        return;
                    default:
                        AppMoreDescriptionData appMoreDescriptionData = (AppMoreDescriptionData) obj;
                        int i16 = AppDetailFragment.M1;
                        js3.p(view, "<unused var>");
                        js3.p((ar) qg5Var, "<unused var>");
                        js3.p(appMoreDescriptionData, "recyclerData");
                        ApplicationFullDto applicationFullDtoR7 = appDetailFragment.R1().R();
                        if (applicationFullDtoR7 != null) {
                            pk5.g(appDetailFragment.J0, new NavIntentDirections.MoreDescription(new tx4(appMoreDescriptionData.a, new ToolbarData(applicationFullDtoR7, appDetailFragment.R1().T(), appDetailFragment.R1().U(), appDetailFragment.R1().S()))), -1);
                            return;
                        }
                        return;
                }
            }
        };
        return zoVar;
    }

    public final void j2() {
        ApplicationFullDto applicationFullDtoR = R1().R();
        if (applicationFullDtoR != null) {
            AppDownloadFlowStatus appDownloadFlowStatusD = S1().d(applicationFullDtoR.getPackageName(), applicationFullDtoR.getVersion().getCode(), applicationFullDtoR.getVersion().isIncompatible(), applicationFullDtoR.getForceUpdate());
            if (appDownloadFlowStatusD == AppDownloadFlowStatus.b || appDownloadFlowStatusD == AppDownloadFlowStatus.c) {
                String strR = Y1().r(applicationFullDtoR.getVersion().getCode(), applicationFullDtoR.getPackageName());
                if (strR != null) {
                    f88.n0(strR);
                }
                dp3 dp3VarY1 = Y1();
                String packageName = applicationFullDtoR.getPackageName();
                int code = applicationFullDtoR.getVersion().getCode();
                hp hpVar = this.u1;
                if (hpVar == null) {
                    js3.V("navArgs");
                    throw null;
                }
                dp3VarY1.j.put(new AbstractMap.SimpleEntry(packageName, Integer.valueOf(code)), hpVar.l);
                S1().b(F(), new DownloadDataModel(applicationFullDtoR, "detail", R1().T(), R1().S(), R1().U()), false);
            }
        }
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        super.k0(view, bundle);
        A().k = new DetailsTransition();
        A().l = new DetailsTransition();
        this.J0.d(W1(), this);
        this.J0.d(V1(), this);
        AppDetailViewModel appDetailViewModelR1 = R1();
        rf7 rf7Var = this.j1;
        if (rf7Var == null) {
            js3.V("screenQualityHelper");
            throw null;
        }
        float fC = rf7Var.c(F());
        if (this.j1 == null) {
            js3.V("screenQualityHelper");
            throw null;
        }
        int iA = rf7.a(F());
        boolean zO0 = yq2.o0(H());
        c24 c24Var = this.L1;
        AppDetailAction.InitAction initAction = new AppDetailAction.InitAction(fC, iA, zO0, ((Boolean) c24Var.getValue()).booleanValue(), yq2.n0(H()));
        int i = 1;
        int i2 = 0;
        appDetailViewModelR1.r(initAction);
        if (this.J1 != null && G().F(rr6.app_detail_suggestion_content) == null && ((Boolean) c24Var.getValue()).booleanValue()) {
            g gVarG = G();
            gVarG.getClass();
            p40 p40Var = new p40(gVarG);
            int i3 = rr6.app_detail_suggestion_content;
            hp hpVar = this.u1;
            if (hpVar == null) {
                js3.V("navArgs");
                throw null;
            }
            String str = hpVar.a;
            js3.p(str, "packageName");
            AppDetailRecommendationFragment appDetailRecommendationFragment = new AppDetailRecommendationFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putString("packageName", str);
            appDetailRecommendationFragment.u0(bundle2);
            p40Var.k(i3, appDetailRecommendationFragment, null);
            p40Var.e();
        }
        ir.mservices.market.version2.core.utils.a.c(this, 0L, new AppDetailFragment$onViewCreated$2(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new AppDetailFragment$onViewCreated$3(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new AppDetailFragment$onViewCreated$4(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new AppDetailFragment$onViewCreated$5(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new AppDetailFragment$onViewCreated$6(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new AppDetailFragment$onViewCreated$7(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new AppDetailFragment$onViewCreated$8(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new AppDetailFragment$onViewCreated$9(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new AppDetailFragment$onViewCreated$10(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new AppDetailFragment$onViewCreated$11(this, null));
        this.v1 = (lk2) n0(new ap(this, 29), new s7(i));
        RecyclerView recyclerViewY1 = y1();
        recyclerViewY1.setVerticalScrollBarEnabled(false);
        recyclerViewY1.setOverScrollMode(2);
        recyclerViewY1.setItemAnimator(null);
        recyclerViewY1.j(new gp(i2, this));
    }

    public final void k2() {
        c5 c5Var = this.n1;
        if (c5Var == null) {
            js3.V("accountManager");
            throw null;
        }
        if (c5Var.d()) {
            i1(new hi6(rr6.action_bookmark, "BOOKMARK_REQUEST_TAG"));
            AppDetailViewModel appDetailViewModelR1 = R1();
            ApplicationFullDto applicationFullDtoR = appDetailViewModelR1.R();
            if (applicationFullDtoR != null) {
                bt2.G(y97.G(appDetailViewModelR1), null, null, new AppDetailViewModel$toggleBookmark$1$1(null, applicationFullDtoR, appDetailViewModelR1), 3);
            }
        } else {
            DialogDataModel dialogDataModel = new DialogDataModel(W1(), "DIALOG_KEY_LOGIN_BOOKMARK", null, 12);
            PhoneBindData phoneBindData = new PhoneBindData("");
            String strL = L(rs6.bind_message_bookmark);
            String strL2 = L(rs6.login_label_app_detail_bookmark);
            js3.o(strL2, "getString(...)");
            pk5.g(this.J0, new NavIntentDirections.Login(new wd4(dialogDataModel, new LoginData(phoneBindData, strL, strL2, (String) null, (String) null, (String) null, (String) null, 1016))), -1);
        }
        ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
        clickEventBuilder.b(!((Boolean) R1().O.getValue()).booleanValue() ? "detail_bookmark_on" : "detail_bookmark_off");
        clickEventBuilder.a();
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final c l1() {
        return R1();
    }

    public final void l2(boolean z) {
        SpannableString spannableStringH;
        Resources resourcesK = K();
        js3.o(resourcesK, "getResources(...)");
        Drawable drawableK = p3.k(resourcesK, yq6.ic_action_bookmark_off);
        Drawable drawableMutate = drawableK.mutate();
        int i = sj8.b().n;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(i, mode));
        Resources resourcesK2 = K();
        js3.o(resourcesK2, "getResources(...)");
        Drawable drawableK2 = p3.k(resourcesK2, yq6.ic_action_bookmark_on);
        drawableK2.mutate().setColorFilter(new PorterDuffColorFilter(sj8.b().n, mode));
        MenuItem menuItem = this.A1;
        if (menuItem != null) {
            if (z) {
                drawableK = drawableK2;
            }
            menuItem.setIcon(drawableK);
            if (z) {
                Resources resourcesK3 = K();
                js3.o(resourcesK3, "getResources(...)");
                String string = K().getString(rs6.remove_bookmark);
                js3.o(string, "getString(...)");
                spannableStringH = tt3.H(resourcesK3, string);
            } else {
                Resources resourcesK4 = K();
                js3.o(resourcesK4, "getResources(...)");
                String string2 = K().getString(rs6.add_bookmark);
                js3.o(string2, "getString(...)");
                spannableStringH = tt3.H(resourcesK4, string2);
            }
            menuItem.setTitle(spannableStringH);
        }
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, ir.mservices.market.common.base.BaseContentFragment
    public void onEvent(qj8 qj8Var) {
        js3.p(qj8Var, "event");
        super.onEvent(qj8Var);
        DetailToolbarView detailToolbarView = this.F1;
        if (detailToolbarView != null) {
            detailToolbarView.setBackgroundColor(H0());
            detailToolbarView.A();
        }
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final int q1() {
        return -1;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final h t1() {
        int dimensionPixelSize = K().getDimensionPixelSize(pq6.horizontal_space_inner) + K().getDimensionPixelSize(pq6.horizontal_space_outer);
        return new d16(0, 0, dimensionPixelSize, dimensionPixelSize, 0, K().getDimensionPixelSize(pq6.review_detail_horizontal_item_space), v1(), false, this.F0.f());
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final PaddingLayoutManager$Padding u1() {
        int i;
        int dimensionPixelSize = K().getDimensionPixelSize(pq6.tablet_app_detail_suggestion_width);
        if (this.F0.f()) {
            i = 0;
        } else {
            i = dimensionPixelSize;
            dimensionPixelSize = 0;
        }
        return new PaddingLayoutManager$Padding(dimensionPixelSize, 0, i, 0);
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final int v1() {
        return K().getInteger(ds6.detail_max_span);
    }

    public final void onEvent(cp3 cp3Var) {
        js3.p(cp3Var, "event");
        DetailToolbarView detailToolbarView = this.F1;
        if (detailToolbarView != null) {
            detailToolbarView.A();
        }
    }
}
