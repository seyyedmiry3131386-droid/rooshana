package ir.mservices.market.download;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle$State;
import com.google.android.material.tabs.TabLayout;
import defpackage.bp2;
import defpackage.br9;
import defpackage.bt5;
import defpackage.c24;
import defpackage.d11;
import defpackage.dt2;
import defpackage.dw1;
import defpackage.fa1;
import defpackage.g27;
import defpackage.j71;
import defpackage.js3;
import defpackage.js6;
import defpackage.jx2;
import defpackage.kh2;
import defpackage.lz5;
import defpackage.mm2;
import defpackage.ms6;
import defpackage.o79;
import defpackage.p3;
import defpackage.pk5;
import defpackage.pq6;
import defpackage.q79;
import defpackage.rn8;
import defpackage.rr6;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.sr1;
import defpackage.un8;
import defpackage.uy6;
import defpackage.x79;
import defpackage.yq6;
import defpackage.zl;
import ir.mservices.market.core.Font$CustomTypefaceSpan;
import ir.mservices.market.core.analytics.ClickEventBuilder;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.download.DownloadContentAction;
import ir.mservices.market.download.DownloadContentFragment;
import ir.mservices.market.download.app.DownloadViewModel;
import ir.mservices.market.download.app.RecentDownloadAction;
import ir.mservices.market.download.movie.MovieRecentDownloadAction;
import ir.mservices.market.download.movie.MovieRecentDownloadViewModel;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import ir.mservices.market.viewModel.BaseMultiSelectViewModel;
import ir.mservices.market.views.SmallFillOvalButton;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* JADX INFO: loaded from: classes3.dex */
public final class DownloadContentFragment extends Hilt_DownloadContentFragment implements mm2 {
    public static final /* synthetic */ int d1 = 0;
    public sr1 V0;
    public un8 W0;
    public final o79 X0;
    public final o79 Y0;
    public final o79 Z0;
    public lz5 a1;
    public zl b1;
    public ValueAnimator c1;

    public DownloadContentFragment() {
        final DownloadContentFragment$special$$inlined$viewModels$default$1 downloadContentFragment$special$$inlined$viewModels$default$1 = new DownloadContentFragment$special$$inlined$viewModels$default$1(this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.c;
        final c24 c24VarB = a.b(lazyThreadSafetyMode, new bp2() { // from class: ir.mservices.market.download.DownloadContentFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) downloadContentFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.X0 = new o79(g27.a(DownloadContentViewModel.class), new bp2() { // from class: ir.mservices.market.download.DownloadContentFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.download.DownloadContentFragment$special$$inlined$viewModels$default$5
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
        }, new bp2() { // from class: ir.mservices.market.download.DownloadContentFragment$special$$inlined$viewModels$default$4
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
        final DownloadContentFragment$special$$inlined$viewModels$default$6 downloadContentFragment$special$$inlined$viewModels$default$6 = new DownloadContentFragment$special$$inlined$viewModels$default$6(this);
        final c24 c24VarB2 = a.b(lazyThreadSafetyMode, new bp2() { // from class: ir.mservices.market.download.DownloadContentFragment$special$$inlined$viewModels$default$7
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) downloadContentFragment$special$$inlined$viewModels$default$6.invoke();
            }
        });
        this.Y0 = new o79(g27.a(DownloadViewModel.class), new bp2() { // from class: ir.mservices.market.download.DownloadContentFragment$special$$inlined$viewModels$default$8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB2.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.download.DownloadContentFragment$special$$inlined$viewModels$default$10
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                q79 q79VarH;
                x79 x79Var = (x79) c24VarB2.getValue();
                jx2 jx2Var = x79Var instanceof jx2 ? (jx2) x79Var : null;
                return (jx2Var == null || (q79VarH = jx2Var.h()) == null) ? this.g.h() : q79VarH;
            }
        }, new bp2() { // from class: ir.mservices.market.download.DownloadContentFragment$special$$inlined$viewModels$default$9
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                x79 x79Var = (x79) c24VarB2.getValue();
                jx2 jx2Var = x79Var instanceof jx2 ? (jx2) x79Var : null;
                return jx2Var != null ? jx2Var.i() : j71.b;
            }
        });
        final DownloadContentFragment$special$$inlined$viewModels$default$11 downloadContentFragment$special$$inlined$viewModels$default$11 = new DownloadContentFragment$special$$inlined$viewModels$default$11(this);
        final c24 c24VarB3 = a.b(lazyThreadSafetyMode, new bp2() { // from class: ir.mservices.market.download.DownloadContentFragment$special$$inlined$viewModels$default$12
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) downloadContentFragment$special$$inlined$viewModels$default$11.invoke();
            }
        });
        this.Z0 = new o79(g27.a(MovieRecentDownloadViewModel.class), new bp2() { // from class: ir.mservices.market.download.DownloadContentFragment$special$$inlined$viewModels$default$13
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB3.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.download.DownloadContentFragment$special$$inlined$viewModels$default$15
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                q79 q79VarH;
                x79 x79Var = (x79) c24VarB3.getValue();
                jx2 jx2Var = x79Var instanceof jx2 ? (jx2) x79Var : null;
                return (jx2Var == null || (q79VarH = jx2Var.h()) == null) ? this.g.h() : q79VarH;
            }
        }, new bp2() { // from class: ir.mservices.market.download.DownloadContentFragment$special$$inlined$viewModels$default$14
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                x79 x79Var = (x79) c24VarB3.getValue();
                jx2 jx2Var = x79Var instanceof jx2 ? (jx2) x79Var : null;
                return jx2Var != null ? jx2Var.i() : j71.b;
            }
        });
    }

    @Override // defpackage.mm2
    public final void B(Bundle bundle, String str) {
        js3.p(str, "requestKey");
        js3.p(bundle, "result");
        if (str.equalsIgnoreCase(k1())) {
            Object objP = dt2.p(bundle, "BUNDLE_KEY_DATA", DialogDataModel.class);
            js3.n(objP, "null cannot be cast to non-null type ir.mservices.market.version2.fragments.dialog.DialogDataModel");
            DialogDataModel dialogDataModel = (DialogDataModel) objP;
            String str2 = dialogDataModel.b;
            if (!"DIALOG_KEY_ALERT_PAUSE_ALL".equalsIgnoreCase(str2)) {
                if ("DIALOG_KEY_ALERT_REMOVE_ALL_APPS".equalsIgnoreCase(str2) && dialogDataModel.d == DialogResult.a) {
                    l1().r(RecentDownloadAction.RemoveAllApps.INSTANCE);
                    return;
                }
                return;
            }
            DialogResult dialogResult = dialogDataModel.d;
            if (dialogResult != DialogResult.a) {
                if (dialogResult == DialogResult.b) {
                    dw1.y("pause_all_cancel");
                }
            } else {
                ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                clickEventBuilder.b("pause_all_ok");
                clickEventBuilder.a();
                l1().r(RecentDownloadAction.PauseAllActiveDownload.INSTANCE);
                ((MovieRecentDownloadViewModel) this.Z0.getValue()).r(MovieRecentDownloadAction.PauseAllDownloadAction.INSTANCE);
            }
        }
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String C() {
        String strL = L(rs6.page_name_recent_download);
        js3.o(strL, "getString(...)");
        return strL;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final BaseMultiSelectViewModel J0() {
        return l1();
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final List L0() {
        return br9.B(l1());
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void T(Bundle bundle) {
        super.T(bundle);
        bt5 bt5VarF = F();
        rn8 rn8Var = bt5VarF instanceof rn8 ? (rn8) bt5VarF : null;
        if (rn8Var != null) {
            un8 un8Var = this.W0;
            js3.m(un8Var);
            rn8Var.z(un8Var.l);
        }
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean U0() {
        return false;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean W0() {
        return true;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean X0() {
        return false;
    }

    @Override // androidx.fragment.app.d
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        js3.p(layoutInflater, "inflater");
        int i = sr1.x;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        sr1 sr1Var = (sr1) fa1.c(layoutInflater, js6.download_content_fragment, viewGroup, false);
        this.V0 = sr1Var;
        js3.m(sr1Var);
        View view = sr1Var.l;
        js3.o(view, "getRoot(...)");
        return view;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean Z0() {
        return true;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment, ir.mservices.market.version2.fragments.base.BaseFragment, androidx.fragment.app.d
    public final void b0() throws Exception {
        super.b0();
        DownloadContentViewModel downloadContentViewModel = (DownloadContentViewModel) this.X0.getValue();
        sr1 sr1Var = this.V0;
        js3.m(sr1Var);
        downloadContentViewModel.r(new DownloadContentAction.UpdateSelectedPageAction(sr1Var.w.getCurrentItem()));
        this.J0.x(k1());
        ValueAnimator valueAnimator = this.c1;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            valueAnimator.cancel();
        }
        zl zlVar = this.b1;
        if (zlVar != null) {
            sr1 sr1Var2 = this.V0;
            js3.m(sr1Var2);
            sr1Var2.w.removeCallbacks(zlVar);
        }
        this.b1 = null;
        this.c1 = null;
        this.V0 = null;
        this.W0 = null;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean c1() {
        return false;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean g1(MenuItem menuItem) {
        js3.p(menuItem, "menuItem");
        if (menuItem.getItemId() == rr6.action_remove_apps) {
            DialogDataModel dialogDataModel = new DialogDataModel(k1(), "DIALOG_KEY_ALERT_REMOVE_ALL_APPS", null, 12);
            String strL = L(rs6.are_you_sure_remove_all_apps);
            js3.o(strL, "getString(...)");
            pk5.g(this.J0, new NavIntentDirections.Confirm(new d11(dialogDataModel, strL, L(rs6.return_change), L(rs6.inbox_remove_all_messages), sj8.b().c, sj8.b().d, sj8.b())), -1);
        }
        return false;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final void h1(boolean z) {
        if (!z) {
            ValueAnimator valueAnimator = this.c1;
            if (valueAnimator != null) {
                valueAnimator.removeAllUpdateListeners();
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(K().getDimensionPixelSize(pq6.tab_height), 0);
            valueAnimatorOfInt.setDuration(150L);
            final int i = 1;
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: pr1
                public final /* synthetic */ DownloadContentFragment b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    int i2 = i;
                    DownloadContentFragment downloadContentFragment = this.b;
                    switch (i2) {
                        case 0:
                            int i3 = DownloadContentFragment.d1;
                            js3.p(valueAnimator2, "it");
                            sr1 sr1Var = downloadContentFragment.V0;
                            js3.m(sr1Var);
                            TabLayout tabLayout = sr1Var.v;
                            Object animatedValue = valueAnimator2.getAnimatedValue();
                            js3.n(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                            tabLayout.setPadding(0, ((Integer) animatedValue).intValue(), 0, 0);
                            break;
                        default:
                            int i4 = DownloadContentFragment.d1;
                            js3.p(valueAnimator2, "it");
                            sr1 sr1Var2 = downloadContentFragment.V0;
                            js3.m(sr1Var2);
                            TabLayout tabLayout2 = sr1Var2.v;
                            Object animatedValue2 = valueAnimator2.getAnimatedValue();
                            js3.n(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
                            tabLayout2.setPadding(0, ((Integer) animatedValue2).intValue(), 0, 0);
                            break;
                    }
                }
            });
            valueAnimatorOfInt.start();
            this.c1 = valueAnimatorOfInt;
            return;
        }
        ValueAnimator valueAnimator2 = this.c1;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllUpdateListeners();
            valueAnimator2.cancel();
        }
        sr1 sr1Var = this.V0;
        js3.m(sr1Var);
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(sr1Var.v.getPaddingTop(), K().getDimensionPixelSize(pq6.tab_height));
        valueAnimatorOfInt2.setDuration(100L);
        final int i2 = 0;
        valueAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: pr1
            public final /* synthetic */ DownloadContentFragment b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                int i22 = i2;
                DownloadContentFragment downloadContentFragment = this.b;
                switch (i22) {
                    case 0:
                        int i3 = DownloadContentFragment.d1;
                        js3.p(valueAnimator22, "it");
                        sr1 sr1Var2 = downloadContentFragment.V0;
                        js3.m(sr1Var2);
                        TabLayout tabLayout = sr1Var2.v;
                        Object animatedValue = valueAnimator22.getAnimatedValue();
                        js3.n(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                        tabLayout.setPadding(0, ((Integer) animatedValue).intValue(), 0, 0);
                        break;
                    default:
                        int i4 = DownloadContentFragment.d1;
                        js3.p(valueAnimator22, "it");
                        sr1 sr1Var22 = downloadContentFragment.V0;
                        js3.m(sr1Var22);
                        TabLayout tabLayout2 = sr1Var22.v;
                        Object animatedValue2 = valueAnimator22.getAnimatedValue();
                        js3.n(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
                        tabLayout2.setPadding(0, ((Integer) animatedValue2).intValue(), 0, 0);
                        break;
                }
            }
        });
        valueAnimatorOfInt2.start();
        this.c1 = valueAnimatorOfInt2;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        super.k0(view, bundle);
        this.J0.d(k1(), this);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(H());
        int i = un8.A;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        final int i2 = 0;
        un8 un8Var = (un8) fa1.c(layoutInflaterFrom, js6.toolbar_recent_download, null, false);
        ImageView imageView = un8Var.v;
        Drawable drawable = imageView.getDrawable();
        int i3 = sj8.b().n;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawable.setColorFilter(new PorterDuffColorFilter(i3, mode));
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: or1
            public final /* synthetic */ DownloadContentFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ws5 ws5VarC;
                int i4 = i2;
                DownloadContentFragment downloadContentFragment = this.b;
                switch (i4) {
                    case 0:
                        int i5 = DownloadContentFragment.d1;
                        FragmentActivity fragmentActivityF = downloadContentFragment.F();
                        if (fragmentActivityF != null && (ws5VarC = fragmentActivityF.c()) != null) {
                            ws5VarC.b();
                            break;
                        }
                        break;
                    default:
                        int i6 = DownloadContentFragment.d1;
                        dw1.y("pause_all");
                        String strL = downloadContentFragment.L(rs6.are_you_sure_stop_all_downloads);
                        js3.o(strL, "getString(...)");
                        pk5.g(downloadContentFragment.J0, new NavIntentDirections.AlertBottom(new bd(new DialogDataModel(downloadContentFragment.k1(), "DIALOG_KEY_ALERT_PAUSE_ALL", null, 12), null, strL, downloadContentFragment.L(rs6.stop_downloads), downloadContentFragment.L(rs6.return_change), true)), -1);
                        break;
                }
            }
        });
        uy6.n(sj8.b().O.c, imageView);
        SpannableString spannableString = new SpannableString(K().getString(rs6.menu_item_recent_download));
        spannableString.setSpan((Font$CustomTypefaceSpan) kh2.b.c.c, 0, spannableString.length(), 33);
        spannableString.setSpan(new AbsoluteSizeSpan(K().getDimensionPixelSize(pq6.font_size_large)), 0, spannableString.length(), 33);
        un8Var.z.setText(spannableString);
        SmallFillOvalButton smallFillOvalButton = un8Var.y;
        smallFillOvalButton.setText(smallFillOvalButton.getResources().getString(rs6.stop_apps));
        final int i4 = 1;
        smallFillOvalButton.setOnClickListener(new View.OnClickListener(this) { // from class: or1
            public final /* synthetic */ DownloadContentFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ws5 ws5VarC;
                int i42 = i4;
                DownloadContentFragment downloadContentFragment = this.b;
                switch (i42) {
                    case 0:
                        int i5 = DownloadContentFragment.d1;
                        FragmentActivity fragmentActivityF = downloadContentFragment.F();
                        if (fragmentActivityF != null && (ws5VarC = fragmentActivityF.c()) != null) {
                            ws5VarC.b();
                            break;
                        }
                        break;
                    default:
                        int i6 = DownloadContentFragment.d1;
                        dw1.y("pause_all");
                        String strL = downloadContentFragment.L(rs6.are_you_sure_stop_all_downloads);
                        js3.o(strL, "getString(...)");
                        pk5.g(downloadContentFragment.J0, new NavIntentDirections.AlertBottom(new bd(new DialogDataModel(downloadContentFragment.k1(), "DIALOG_KEY_ALERT_PAUSE_ALL", null, 12), null, strL, downloadContentFragment.L(rs6.stop_downloads), downloadContentFragment.L(rs6.return_change), true)), -1);
                        break;
                }
            }
        });
        T0(ms6.download_list_more, un8Var.x);
        this.W0 = un8Var;
        sr1 sr1Var = this.V0;
        js3.m(sr1Var);
        TabLayout tabLayout = sr1Var.v;
        tabLayout.setTabTextColors(sj8.b().n, sj8.b().c);
        Resources resources = tabLayout.getResources();
        js3.o(resources, "getResources(...)");
        Drawable drawableK = p3.k(resources, yq6.tab_indicator);
        drawableK.setColorFilter(new PorterDuffColorFilter(sj8.b().c, mode));
        tabLayout.setSelectedTabIndicator(drawableK);
        tabLayout.setTabRippleColor(ColorStateList.valueOf(p3.a(sj8.b().O.c, 12)));
        Iterator it = L0().iterator();
        while (it.hasNext()) {
            ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new DownloadContentFragment$onViewCreated$1$2$1((BaseMultiSelectViewModel) it.next(), sr1Var, this, null));
        }
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new DownloadContentFragment$onViewCreated$1$3(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new DownloadContentFragment$onViewCreated$1$4(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new DownloadContentFragment$onViewCreated$1$5(null, sr1Var, this));
        ir.mservices.market.version2.core.utils.a.c(this, 0L, new DownloadContentFragment$onViewCreated$1$6(null, sr1Var, this));
    }

    public final String k1() {
        return dw1.n("DownloadContentFragment_", this.H0);
    }

    public final DownloadViewModel l1() {
        return (DownloadViewModel) this.Y0.getValue();
    }
}
