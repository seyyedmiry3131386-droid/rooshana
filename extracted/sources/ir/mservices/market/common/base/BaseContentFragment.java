package ir.mservices.market.common.base;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.g;
import androidx.lifecycle.Lifecycle$State;
import defpackage.ba7;
import defpackage.bp2;
import defpackage.bt2;
import defpackage.bt5;
import defpackage.cc7;
import defpackage.d04;
import defpackage.dt2;
import defpackage.ea7;
import defpackage.ee;
import defpackage.fa1;
import defpackage.fp6;
import defpackage.fu7;
import defpackage.h40;
import defpackage.hi6;
import defpackage.j79;
import defpackage.ja1;
import defpackage.js3;
import defpackage.js6;
import defpackage.ki6;
import defpackage.l60;
import defpackage.lw;
import defpackage.mk2;
import defpackage.n;
import defpackage.nt6;
import defpackage.ot4;
import defpackage.pq6;
import defpackage.qj8;
import defpackage.rn8;
import defpackage.rr6;
import defpackage.s40;
import defpackage.sb7;
import defpackage.sj8;
import defpackage.t32;
import defpackage.t40;
import defpackage.t61;
import defpackage.t95;
import defpackage.tf5;
import defpackage.tt3;
import defpackage.u95;
import defpackage.vy2;
import defpackage.w91;
import defpackage.xb5;
import defpackage.y97;
import defpackage.yq2;
import defpackage.zn2;
import ir.mservices.market.activity.BaseFragmentContentActivity;
import ir.mservices.market.app.bookmark.BookmarkContentFragment;
import ir.mservices.market.app.bookmark.ui.AppBookmarkRecyclerListFragment;
import ir.mservices.market.app.detail.more.ui.MoreDescriptionFragment;
import ir.mservices.market.app.home.GameHomeFragment;
import ir.mservices.market.common.base.BaseContentFragment;
import ir.mservices.market.download.app.DownloadRecyclerListFragment;
import ir.mservices.market.togo.TogoFragment;
import ir.mservices.market.version2.ApplicationLauncher;
import ir.mservices.market.version2.fragments.base.BaseNavigationFragment;
import ir.mservices.market.version2.ui.ScreenWatchAnalyticsEvent;
import ir.mservices.market.viewModel.BaseMultiSelectViewModel;
import ir.mservices.market.views.MultiSelectTitleView;
import ir.mservices.market.views.MyketTextView;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseContentFragment extends BaseNavigationFragment {
    public static final /* synthetic */ int R0 = 0;
    public boolean L0;
    public MultiSelectTitleView M0;
    public ValueAnimator N0;
    public h40 Q0;
    public boolean K0 = true;
    public final l O0 = ja1.b(null);
    public final i P0 = vy2.e(0, 7, null);

    public abstract String C();

    public boolean D0() {
        return !(this instanceof DownloadRecyclerListFragment);
    }

    public boolean E0() {
        return !(this instanceof TogoFragment);
    }

    public final void F0() {
        ir.mservices.market.version2.core.utils.a.c(this, 0L, new BaseContentFragment$dismissPopupWindow$1(this, null));
    }

    public int G0(Context context) {
        return context.getResources().getDimensionPixelSize(pq6.actionbar_size);
    }

    public int H0() {
        return sj8.b().l;
    }

    public String I0() {
        return null;
    }

    public BaseMultiSelectViewModel J0() {
        return null;
    }

    public ViewGroup.LayoutParams K0() {
        return new ViewGroup.LayoutParams(-1, K().getDimensionPixelSize(pq6.tab_height));
    }

    public List L0() {
        return EmptyList.a;
    }

    public int M0() {
        return sj8.b().l;
    }

    public String N0() {
        return C();
    }

    public int O0() {
        return 2;
    }

    public int P0() {
        return sj8.b().l;
    }

    public String Q0(BaseFragmentContentActivity baseFragmentContentActivity) {
        return "";
    }

    public int R0() {
        return sj8.b().l;
    }

    public final ot4 S0(int i, MenuItem menuItem) {
        if (menuItem != null) {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(H());
            int i2 = j79.x;
            DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
            menuItem.setActionView(((j79) fa1.c(layoutInflaterFrom, js6.view_menu_more, null, false)).l);
        }
        return T0(i, menuItem != null ? menuItem.getActionView() : null);
    }

    @Override // androidx.fragment.app.d
    public void T(Bundle bundle) {
        this.H = true;
        if (D0()) {
            FragmentActivity fragmentActivityF = F();
            BaseFragmentContentActivity baseFragmentContentActivity = fragmentActivityF instanceof BaseFragmentContentActivity ? (BaseFragmentContentActivity) fragmentActivityF : null;
            if (baseFragmentContentActivity != null) {
                baseFragmentContentActivity.e0(this);
            }
        }
    }

    public final ot4 T0(int i, final View view) {
        final d04 d04Var = this.F0;
        js3.o(d04Var, "languageHelper");
        final l lVar = this.O0;
        js3.p(lVar, "popupUiState");
        final i iVar = this.P0;
        js3.p(iVar, "dismissPopupState");
        if (view == null) {
            return null;
        }
        ((ImageView) view.findViewById(rr6.more)).getDrawable().setColorFilter(new PorterDuffColorFilter(sj8.b().n, PorterDuff.Mode.MULTIPLY));
        final ot4 ot4Var = new ot4(H());
        new MenuInflater(H()).inflate(i, ot4Var);
        view.setOnClickListener(new View.OnClickListener() { // from class: ir.mservices.market.core.a
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r11v1 */
            /* JADX WARN: Type inference failed for: r11v2, types: [boolean, int] */
            /* JADX WARN: Type inference failed for: r11v7 */
            /* JADX WARN: Type inference failed for: r14v2, types: [android.view.View, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r18v0 */
            /* JADX WARN: Type inference failed for: r18v1 */
            /* JADX WARN: Type inference failed for: r18v2 */
            /* JADX WARN: Type inference failed for: r18v3 */
            /* JADX WARN: Type inference failed for: r18v5 */
            /* JADX WARN: Type inference failed for: r4v14 */
            /* JADX WARN: Type inference failed for: r4v15, types: [int] */
            /* JADX WARN: Type inference failed for: r4v27 */
            /* JADX WARN: Type inference failed for: r8v0, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                final BaseContentFragment baseContentFragment = this.a;
                View view3 = view;
                ot4 ot4Var2 = ot4Var;
                fu7 fu7Var = iVar;
                final xb5 xb5Var = lVar;
                d04 d04Var2 = d04Var;
                try {
                    ?? linearLayout = new LinearLayout(baseContentFragment.H());
                    boolean z = true;
                    linearLayout.setOrientation(1);
                    int dimensionPixelSize = linearLayout.getResources().getDimensionPixelSize(pq6.space_8);
                    ?? r11 = 0;
                    linearLayout.setPadding(0, dimensionPixelSize, 0, dimensionPixelSize);
                    PopupWindow popupWindow = new PopupWindow((View) linearLayout, baseContentFragment.K().getDimensionPixelSize(pq6.popup_window_item_width), -2, true);
                    Context context = view2.getContext();
                    js3.o(context, "getContext(...)");
                    ea7 ea7Var = new ea7(context);
                    ea7Var.b = sj8.b().p;
                    ea7Var.c(baseContentFragment.K().getDimensionPixelSize(pq6.space_8));
                    ea7Var.h = 0;
                    ea7Var.j = true;
                    popupWindow.setBackgroundDrawable(ea7Var.a());
                    bt2.G(cc7.q(view3), null, null, new PopupWindowUtils$handleMoreMenuItem$1$1(fu7Var, popupWindow, xb5Var, null), 3);
                    int size = ot4Var2.f.size();
                    int i2 = 0;
                    while (i2 < size) {
                        MenuItem item = ot4Var2.getItem(i2);
                        LayoutInflater layoutInflaterFrom = LayoutInflater.from(baseContentFragment.H());
                        int i3 = ki6.y;
                        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
                        ki6 ki6Var = (ki6) fa1.c(layoutInflaterFrom, js6.popup_window_item, linearLayout, r11);
                        js3.o(ki6Var, "inflate(...)");
                        ImageView imageView = ki6Var.v;
                        ?? r14 = ki6Var.l;
                        js3.o(r14, "getRoot(...)");
                        r14.setVisibility(item.isVisible() ? r11 : 8);
                        r14.setBackground(y97.B(0.0f, r11, 3));
                        MyketTextView myketTextView = ki6Var.x;
                        Resources resourcesK = baseContentFragment.K();
                        ?? r18 = r11;
                        js3.o(resourcesK, "getResources(...)");
                        CharSequence title = item.getTitle();
                        if (title == null) {
                            title = "";
                        }
                        myketTextView.setText(tt3.H(resourcesK, title));
                        imageView.setImageDrawable(item.getIcon());
                        imageView.setColorFilter(new PorterDuffColorFilter(sj8.b().n, PorterDuff.Mode.MULTIPLY));
                        ki6Var.w.setIndicatorSize(baseContentFragment.K().getDimensionPixelSize(pq6.popup_loading_icon_size));
                        r14.setOnClickListener(new tf5(baseContentFragment, item, popupWindow, 2));
                        bt2.G(cc7.q(view3), null, null, new PopupWindowUtils$handleMoreMenuItem$1$2$2(xb5Var, item, ki6Var, null), 3);
                        linearLayout.addView(r14);
                        i2++;
                        r11 = r18 == true ? 1 : 0;
                        z = true;
                    }
                    ?? r182 = r11;
                    popupWindow.setOutsideTouchable(z);
                    popupWindow.setElevation(baseContentFragment.K().getDimensionPixelSize(pq6.space_16));
                    int[] iArr = new int[2];
                    view3.getLocationOnScreen(iArr);
                    int dimensionPixelSize2 = baseContentFragment.K().getDimensionPixelSize(pq6.space_4);
                    int width = d04Var2.f() ? iArr[r182 == true ? 1 : 0] + view3.getWidth() + dimensionPixelSize2 : (iArr[r182 == true ? 1 : 0] - popupWindow.getWidth()) - dimensionPixelSize2;
                    popupWindow.setAnimationStyle(nt6.PopupAnimation);
                    popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: mi6
                        @Override // android.widget.PopupWindow.OnDismissListener
                        public final void onDismiss() {
                            l lVar2 = (l) xb5Var;
                            hi6 hi6Var = (hi6) lVar2.getValue();
                            if (hi6Var instanceof hi6) {
                                baseContentFragment.G0.a(hi6Var.b);
                            }
                            lVar2.o(null);
                        }
                    });
                    popupWindow.showAtLocation(view3, r182 == true ? 1 : 0, width, iArr[1] + (view3.getHeight() / 4));
                } catch (Exception e) {
                    lw.g(e, "Popup Window failed with an exception!", null);
                }
            }
        });
        return ot4Var;
    }

    public boolean U0() {
        return !(this instanceof BookmarkContentFragment);
    }

    public boolean V0() {
        return this instanceof ba7;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNavigationFragment, defpackage.cz2, androidx.fragment.app.d
    public void W(Context context) {
        js3.p(context, "context");
        super.W(context);
        sb7.p("MyketContentFragment", t61.i(C(), " onAttach()"), I0());
    }

    public boolean W0() {
        return this instanceof BookmarkContentFragment;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseFragment, androidx.fragment.app.d
    public void X(Bundle bundle) {
        super.X(bundle);
        if (bundle == null || bundle.isEmpty()) {
            String strC = C();
            Bundle bundle2 = new Bundle();
            ee eeVar = (ee) ((w91) ApplicationLauncher.o.b()).o.get();
            bundle2.putString("screen_name", strC);
            eeVar.getClass();
            eeVar.a(bundle2, "screen_show");
        }
        if (bundle != null) {
            bundle.isEmpty();
        }
    }

    public boolean X0() {
        return !(this instanceof AppBookmarkRecyclerListFragment);
    }

    @Override // androidx.fragment.app.d
    public final Animation Y(int i, boolean z) {
        if (!z || i != fp6.enter_page_forward) {
            return null;
        }
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(H(), i);
        this.L0 = true;
        animationLoadAnimation.setAnimationListener(new a(this));
        return animationLoadAnimation;
    }

    public boolean Y0() {
        return true;
    }

    public boolean Z0() {
        return this instanceof MoreDescriptionFragment;
    }

    @Override // androidx.fragment.app.d
    public void a0() {
        ScreenWatchAnalyticsEvent screenWatchAnalyticsEvent;
        Bundle bundle = this.g;
        if (bundle != null && (screenWatchAnalyticsEvent = (ScreenWatchAnalyticsEvent) dt2.p(bundle, "SCREEN_WATCH_ANALYTICS_EVENT", ScreenWatchAnalyticsEvent.class)) != null) {
            screenWatchAnalyticsEvent.a();
        }
        this.H = true;
    }

    public boolean a1() {
        return !(this instanceof GameHomeFragment);
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseFragment, androidx.fragment.app.d
    public void b0() throws Exception {
        bt5 bt5VarF = F();
        rn8 rn8Var = bt5VarF instanceof rn8 ? (rn8) bt5VarF : null;
        if (rn8Var != null) {
            this.K0 = rn8Var.n();
        }
        t32.b().o(this);
        h40 h40Var = this.Q0;
        if (h40Var != null) {
            h40Var.e();
        }
        this.Q0 = null;
        this.M0 = null;
        ValueAnimator valueAnimator = this.N0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            valueAnimator.removeAllUpdateListeners();
            valueAnimator.removeAllListeners();
        }
        this.N0 = null;
        super.b0();
    }

    public boolean b1() {
        return !(this instanceof MoreDescriptionFragment);
    }

    @Override // androidx.fragment.app.d
    public final void c0() {
        this.H = true;
        sb7.p("MyketContentFragment", t61.i(C(), " onDetach()"), I0());
    }

    public boolean c1() {
        return !(this instanceof BookmarkContentFragment);
    }

    public boolean d1() {
        return this.K0;
    }

    public yq2 e1() {
        t40 t40Var = t40.g;
        if (!W0()) {
            return t40Var;
        }
        if (L0().isEmpty()) {
            lw.g(null, "hasMultiSelect is true but getViewModel is not BaseMultiSelectViewModel!!", null);
            return t40Var;
        }
        for (BaseMultiSelectViewModel baseMultiSelectViewModel : L0()) {
            if (((t95) baseMultiSelectViewModel.w.a.getValue()).b) {
                baseMultiSelectViewModel.x(new u95("on", "back"));
                sb7.p("MultiSelect", "back", "data:");
                baseMultiSelectViewModel.s();
                return s40.g;
            }
        }
        return t40Var;
    }

    @Override // androidx.fragment.app.d
    public void f0() {
        ScreenWatchAnalyticsEvent screenWatchAnalyticsEvent;
        this.H = true;
        if (this.g == null || (screenWatchAnalyticsEvent = (ScreenWatchAnalyticsEvent) dt2.p(p0(), "SCREEN_WATCH_ANALYTICS_EVENT", ScreenWatchAnalyticsEvent.class)) == null) {
            return;
        }
        screenWatchAnalyticsEvent.b();
        p0().putParcelable("SCREEN_WATCH_ANALYTICS_EVENT", screenWatchAnalyticsEvent);
    }

    public void f1(Menu menu, MenuInflater menuInflater) {
        js3.p(menu, "menu");
        js3.p(menuInflater, "menuInflater");
    }

    @Override // androidx.fragment.app.d
    public void g0() {
        this.H = true;
        Bundle bundle = this.g;
        if (bundle != null) {
            ScreenWatchAnalyticsEvent screenWatchAnalyticsEvent = (ScreenWatchAnalyticsEvent) dt2.p(bundle, "SCREEN_WATCH_ANALYTICS_EVENT", ScreenWatchAnalyticsEvent.class);
            if (screenWatchAnalyticsEvent == null) {
                screenWatchAnalyticsEvent = new ScreenWatchAnalyticsEvent(C());
            }
            screenWatchAnalyticsEvent.c(F());
            p0().putParcelable("SCREEN_WATCH_ANALYTICS_EVENT", screenWatchAnalyticsEvent);
        }
    }

    public boolean g1(MenuItem menuItem) {
        js3.p(menuItem, "menuItem");
        return false;
    }

    public void h1(boolean z) {
    }

    public final void i1(hi6 hi6Var) {
        l lVar = this.O0;
        lVar.getClass();
        lVar.p(null, hi6Var);
    }

    @Override // androidx.fragment.app.d
    public void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        final int i = 0;
        t32.b().l(this, false);
        FragmentActivity fragmentActivityF = F();
        if (fragmentActivityF != null) {
            l60 l60Var = new l60(i, this);
            zn2 zn2VarN = N();
            Lifecycle$State lifecycle$State = Lifecycle$State.a;
            fragmentActivityF.H(l60Var, zn2VarN);
        }
        if (D0()) {
            this.Q0 = ir.mservices.market.core.ext.a.a(F(), new n(16, this));
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        final int i2 = 1;
        A().o = true;
        Handler handler = this.N;
        mk2 mk2Var = this.O;
        if (handler != null) {
            handler.removeCallbacks(mk2Var);
        }
        g gVar = this.v;
        if (gVar != null) {
            this.N = gVar.x.u;
        } else {
            this.N = new Handler(Looper.getMainLooper());
        }
        this.N.removeCallbacks(mk2Var);
        this.N.postDelayed(mk2Var, timeUnit.toMillis(100L));
        if (W0()) {
            Context context = view.getContext();
            js3.o(context, "getContext(...)");
            MultiSelectTitleView multiSelectTitleView = new MultiSelectTitleView(context, null);
            this.M0 = multiSelectTitleView;
            ((ViewGroup) view).addView(multiSelectTitleView, K0());
            sb7.p("MultiSelect", "MultiSelectTitleView created", "");
            if (L0().isEmpty()) {
                lw.g(null, "hasMultiSelect is true but no viewModel set!", null);
            }
            for (BaseMultiSelectViewModel baseMultiSelectViewModel : L0()) {
                MultiSelectTitleView multiSelectTitleView2 = this.M0;
                if (multiSelectTitleView2 != null) {
                    multiSelectTitleView2.setOnMultiSelectRemove(new bp2(this) { // from class: k60
                        public final /* synthetic */ BaseContentFragment b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.bp2
                        public final Object invoke() {
                            int i3 = i;
                            tx8 tx8Var = tx8.a;
                            BaseContentFragment baseContentFragment = this.b;
                            switch (i3) {
                                case 0:
                                    int i4 = BaseContentFragment.R0;
                                    BaseMultiSelectViewModel baseMultiSelectViewModelJ0 = baseContentFragment.J0();
                                    if (baseMultiSelectViewModelJ0 != null) {
                                        baseMultiSelectViewModelJ0.v();
                                    }
                                    break;
                                default:
                                    int i5 = BaseContentFragment.R0;
                                    BaseMultiSelectViewModel baseMultiSelectViewModelJ02 = baseContentFragment.J0();
                                    if (baseMultiSelectViewModelJ02 != null) {
                                        baseMultiSelectViewModelJ02.x(new u95("on", "x"));
                                        baseMultiSelectViewModelJ02.s();
                                    }
                                    break;
                            }
                            return tx8Var;
                        }
                    });
                    multiSelectTitleView2.setOnMultiSelectCancel(new bp2(this) { // from class: k60
                        public final /* synthetic */ BaseContentFragment b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.bp2
                        public final Object invoke() {
                            int i3 = i2;
                            tx8 tx8Var = tx8.a;
                            BaseContentFragment baseContentFragment = this.b;
                            switch (i3) {
                                case 0:
                                    int i4 = BaseContentFragment.R0;
                                    BaseMultiSelectViewModel baseMultiSelectViewModelJ0 = baseContentFragment.J0();
                                    if (baseMultiSelectViewModelJ0 != null) {
                                        baseMultiSelectViewModelJ0.v();
                                    }
                                    break;
                                default:
                                    int i5 = BaseContentFragment.R0;
                                    BaseMultiSelectViewModel baseMultiSelectViewModelJ02 = baseContentFragment.J0();
                                    if (baseMultiSelectViewModelJ02 != null) {
                                        baseMultiSelectViewModelJ02.x(new u95("on", "x"));
                                        baseMultiSelectViewModelJ02.s();
                                    }
                                    break;
                            }
                            return tx8Var;
                        }
                    });
                }
                ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new BaseContentFragment$onViewCreated$4$2(baseMultiSelectViewModel, this, null));
            }
        }
    }

    public void onEvent(qj8 qj8Var) {
        js3.p(qj8Var, "event");
        FragmentActivity fragmentActivityF = F();
        if (fragmentActivityF != null) {
            fragmentActivityF.invalidateOptionsMenu();
        }
    }
}
