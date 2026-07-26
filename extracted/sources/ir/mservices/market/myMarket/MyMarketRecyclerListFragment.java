package ir.mservices.market.myMarket;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle$State;
import androidx.recyclerview.widget.h;
import androidx.recyclerview.widget.k;
import com.airbnb.lottie.LottieAnimationView;
import defpackage.a79;
import defpackage.am2;
import defpackage.bp2;
import defpackage.bp7;
import defpackage.c24;
import defpackage.c5;
import defpackage.d56;
import defpackage.dd5;
import defpackage.dp7;
import defpackage.ds6;
import defpackage.dt2;
import defpackage.dw1;
import defpackage.fa1;
import defpackage.fp6;
import defpackage.g27;
import defpackage.j71;
import defpackage.js3;
import defpackage.js6;
import defpackage.js8;
import defpackage.jx2;
import defpackage.k04;
import defpackage.k68;
import defpackage.lu7;
import defpackage.lw;
import defpackage.m88;
import defpackage.mr7;
import defpackage.ms6;
import defpackage.nv2;
import defpackage.o79;
import defpackage.og5;
import defpackage.p3;
import defpackage.pk5;
import defpackage.pk8;
import defpackage.pq6;
import defpackage.pr7;
import defpackage.q79;
import defpackage.qj8;
import defpackage.qu2;
import defpackage.rr6;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.t32;
import defpackage.td5;
import defpackage.u03;
import defpackage.wd4;
import defpackage.x79;
import defpackage.xf5;
import defpackage.yq6;
import defpackage.zk8;
import ir.mservices.market.activity.BaseFragmentContentActivity;
import ir.mservices.market.common.ui.recycler.layoutManager.MyketStaggeredLayoutManager;
import ir.mservices.market.common.ui.recycler.layoutManager.PaddingLayoutManager$Padding;
import ir.mservices.market.core.analytics.ActionBarEventBuilder;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.login.data.LoginData;
import ir.mservices.market.login.data.PhoneBindData;
import ir.mservices.market.myMarket.MyMarketAction;
import ir.mservices.market.myMarket.MyMarketRecyclerListFragment;
import ir.mservices.market.theme.ThemeMode;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import ir.mservices.market.viewModel.c;
import java.util.LinkedHashMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* JADX INFO: loaded from: classes3.dex */
public final class MyMarketRecyclerListFragment extends Hilt_MyMarketRecyclerListFragment {
    public static final /* synthetic */ int r1 = 0;
    public c5 i1;
    public xf5 j1;
    public k68 k1;
    public pr7 l1;
    public qu2 m1;
    public bp7 n1;
    public d56 o1;
    public MenuItem p1;
    public final o79 q1;

    public MyMarketRecyclerListFragment() {
        final MyMarketRecyclerListFragment$special$$inlined$viewModels$default$1 myMarketRecyclerListFragment$special$$inlined$viewModels$default$1 = new MyMarketRecyclerListFragment$special$$inlined$viewModels$default$1(this);
        final c24 c24VarB = a.b(LazyThreadSafetyMode.c, new bp2() { // from class: ir.mservices.market.myMarket.MyMarketRecyclerListFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) myMarketRecyclerListFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.q1 = new o79(g27.a(MyMarketViewModel.class), new bp2() { // from class: ir.mservices.market.myMarket.MyMarketRecyclerListFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.myMarket.MyMarketRecyclerListFragment$special$$inlined$viewModels$default$5
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
        }, new bp2() { // from class: ir.mservices.market.myMarket.MyMarketRecyclerListFragment$special$$inlined$viewModels$default$4
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

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, defpackage.mm2
    public final void B(Bundle bundle, String str) {
        js3.p(str, "requestKey");
        js3.p(bundle, "result");
        super.B(bundle, str);
        if (str.equalsIgnoreCase(R1())) {
            Object objP = dt2.p(bundle, "BUNDLE_KEY_DATA", DialogDataModel.class);
            js3.n(objP, "null cannot be cast to non-null type ir.mservices.market.version2.fragments.dialog.DialogDataModel");
            DialogDataModel dialogDataModel = (DialogDataModel) objP;
            String str2 = dialogDataModel.b;
            if (m88.T(str2, "DIALOG_KEY_LOGIN_HEADER", true)) {
                if (dialogDataModel.d == DialogResult.a) {
                    S1().r(new MyMarketAction.RefreshAction(true));
                    pk5.g(this.J0, new NavIntentDirections.Profile(), -1);
                    return;
                }
                return;
            }
            if (m88.T(str2, "DIALOG_KEY_LOGIN_PROFILE", true)) {
                if (dialogDataModel.d == DialogResult.a) {
                    S1().r(new MyMarketAction.RefreshAction(true));
                    pk5.g(this.J0, new NavIntentDirections.MynetSocial(), -1);
                    return;
                }
                return;
            }
            if (m88.T(str2, "DIALOG_KEY_LOGIN_FINANCIAL", true) && dialogDataModel.d == DialogResult.a) {
                S1().r(new MyMarketAction.RefreshAction(true));
                MyMarketViewModel myMarketViewModelS1 = S1();
                myMarketViewModelS1.v.performAuthorize(new td5(myMarketViewModelS1), new td5(myMarketViewModelS1));
            }
        }
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String C() {
        String strL = L(rs6.page_name_my_market);
        js3.o(strL, "getString(...)");
        return strL;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final int H0() {
        return sj8.b().p;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final boolean H1() {
        return false;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final int M0() {
        return sj8.b().p;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final boolean M1() {
        return false;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final int P0() {
        return sj8.b().p;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String Q0(BaseFragmentContentActivity baseFragmentContentActivity) {
        String string = baseFragmentContentActivity.getString(rs6.menu_item_my_market);
        js3.o(string, "getString(...)");
        return string;
    }

    public final c5 Q1() {
        c5 c5Var = this.i1;
        if (c5Var != null) {
            return c5Var;
        }
        js3.V("accountManager");
        throw null;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final int R0() {
        return sj8.b().p;
    }

    public final String R1() {
        return dw1.n("MyMarketRecyclerListFragment_", this.H0);
    }

    public final MyMarketViewModel S1() {
        return (MyMarketViewModel) this.q1.getValue();
    }

    public final xf5 T1() {
        xf5 xf5Var = this.j1;
        if (xf5Var != null) {
            return xf5Var;
        }
        js3.V("myketUIUtils");
        throw null;
    }

    public final LinkedHashMap U1() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("lang", this.F0.b());
        linkedHashMap.put("theme", sj8.f());
        linkedHashMap.put("style", sj8.e());
        return linkedHashMap;
    }

    public final void V1(String str, String str2) {
        xf5 xf5VarT1 = T1();
        FragmentActivity fragmentActivityF = F();
        am2 am2Var = this.J0;
        bp7 bp7Var = this.n1;
        if (bp7Var == null) {
            js3.V("serverMonitor");
            throw null;
        }
        dp7 dp7Var = (dp7) bp7Var.e.get(str);
        String str3 = dp7Var == null ? bp7Var.d.h : dp7Var.h;
        js3.o(str3, "getServerUrl(...)");
        xf5VarT1.k(fragmentActivityF, am2Var, js8.j(str3, str, str2, null, U1(), false), "", false, true, true, true, true, false);
    }

    public final void W1() {
        if (this.p1 == null) {
            return;
        }
        xf5 xf5VarT1 = T1();
        MenuItem menuItem = this.p1;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(H());
        int i = pk8.w;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        View view = ((pk8) a79.f0(layoutInflaterFrom, js6.theme_toggle, null, false, null)).l;
        js3.o(view, "getRoot(...)");
        View viewI = xf5VarT1.i(this, menuItem, view);
        if (viewI != null) {
            Resources resources = viewI.getResources();
            js3.o(resources, "getResources(...)");
            Drawable drawableMutate = p3.k(resources, yq6.ic_night_mode_on).mutate();
            int i2 = sj8.b().n;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawableMutate.setColorFilter(new PorterDuffColorFilter(i2, mode));
            Resources resources2 = viewI.getResources();
            js3.o(resources2, "getResources(...)");
            Drawable drawableMutate2 = p3.k(resources2, yq6.ic_night_mode).mutate();
            drawableMutate2.setColorFilter(new PorterDuffColorFilter(sj8.b().n, mode));
            ImageView imageView = (ImageView) viewI.findViewById(rr6.icon);
            if (sj8.g != ThemeMode.b) {
                drawableMutate = drawableMutate2;
            }
            imageView.setImageDrawable(drawableMutate);
            ((LottieAnimationView) viewI.findViewById(rr6.animation)).setVisibility(4);
        }
    }

    public final NavIntentDirections.Login X1(String str, String str2, String str3) {
        return new NavIntentDirections.Login(new wd4(new DialogDataModel(R1(), str, null, 12), new LoginData(new PhoneBindData(""), str2, str3, (String) null, (String) null, (String) null, (String) null, 1016)));
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, androidx.fragment.app.d
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        js3.p(layoutInflater, "inflater");
        return super.Z(layoutInflater, viewGroup, bundle);
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, ir.mservices.market.common.base.BaseContentFragment, ir.mservices.market.version2.fragments.base.BaseFragment, androidx.fragment.app.d
    public final void b0() throws Exception {
        super.b0();
        this.J0.x(R1());
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final void f1(Menu menu, MenuInflater menuInflater) {
        js3.p(menu, "menu");
        js3.p(menuInflater, "menuInflater");
        menuInflater.inflate(ms6.my_market, menu);
        this.p1 = menu.findItem(rr6.action_night_mode);
        MenuItem menuItemFindItem = menu.findItem(rr6.action_setting);
        Drawable icon = menuItemFindItem.getIcon();
        if (icon != null) {
            icon.setColorFilter(new PorterDuffColorFilter(sj8.b().n, PorterDuff.Mode.MULTIPLY));
        }
        xf5.j(T1(), this, menuItemFindItem);
        W1();
        super.f1(menu, menuInflater);
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean g1(MenuItem menuItem) {
        js3.p(menuItem, "menuItem");
        if (menuItem.getItemId() != rr6.action_night_mode) {
            if (menuItem.getItemId() == rr6.action_setting) {
                NavIntentDirections.Setting setting = new NavIntentDirections.Setting();
                ActionBarEventBuilder actionBarEventBuilder = new ActionBarEventBuilder();
                actionBarEventBuilder.b("action_bar_my_market_settings");
                actionBarEventBuilder.a();
                pk5.g(this.J0, setting, -1);
            }
            return false;
        }
        ActionBarEventBuilder actionBarEventBuilder2 = new ActionBarEventBuilder();
        ThemeMode themeMode = sj8.g;
        ThemeMode themeMode2 = ThemeMode.b;
        actionBarEventBuilder2.b(themeMode == themeMode2 ? "my_market_night_mode_off" : "my_market_night_mode_on");
        actionBarEventBuilder2.a();
        int[] iArr = new int[2];
        View actionView = menuItem.getActionView();
        if (actionView != null) {
            actionView.getLocationOnScreen(iArr);
        }
        pr7 pr7Var = this.l1;
        if (pr7Var == null) {
            js3.V("settingsManager");
            throw null;
        }
        String str = sj8.g == themeMode2 ? "off" : "on";
        ((mr7) pr7Var.b.get()).b("NIGHT_MODE", pr7Var.b(), str);
        pr7Var.a.i(lu7.e0, str);
        pr7 pr7Var2 = this.l1;
        if (pr7Var2 == null) {
            js3.V("settingsManager");
            throw null;
        }
        String strB = pr7Var2.b();
        js3.o(strB, "getNightMode(...)");
        sj8.i(strB);
        int iA = (int) s1().a(24.0f);
        t32.b().g(new k04(iArr[0] + iA, iArr[1] + iA));
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [md5] */
    /* JADX WARN: Type inference failed for: r0v3, types: [md5] */
    /* JADX WARN: Type inference failed for: r0v4, types: [md5] */
    /* JADX WARN: Type inference failed for: r0v5, types: [md5] */
    /* JADX WARN: Type inference failed for: r0v6, types: [md5] */
    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final ir.mservices.market.version2.ui.recycler.adapter.a j1() {
        dd5 dd5Var = new dd5(v1(), p3.g(F()), this.F0.f());
        final int i = 0;
        dd5Var.n = new og5(this) { // from class: md5
            public final /* synthetic */ MyMarketRecyclerListFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:52:0x0212  */
            @Override // defpackage.og5
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void m(android.view.View r22, defpackage.qg5 r23, java.lang.Object r24) {
                /*
                    Method dump skipped, instruction units count: 896
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.md5.m(android.view.View, qg5, java.lang.Object):void");
            }
        };
        final int i2 = 1;
        dd5Var.o = new og5(this) { // from class: md5
            public final /* synthetic */ MyMarketRecyclerListFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:52:0x0212  */
            @Override // defpackage.og5
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void m(android.view.View r22, defpackage.qg5 r23, java.lang.Object r24) {
                /*
                    Method dump skipped, instruction units count: 896
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.md5.m(android.view.View, qg5, java.lang.Object):void");
            }
        };
        final int i3 = 2;
        dd5Var.p = new og5(this) { // from class: md5
            public final /* synthetic */ MyMarketRecyclerListFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:52:0x0212  */
            @Override // defpackage.og5
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void m(android.view.View r22, defpackage.qg5 r23, java.lang.Object r24) {
                /*
                    Method dump skipped, instruction units count: 896
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.md5.m(android.view.View, qg5, java.lang.Object):void");
            }
        };
        final int i4 = 3;
        dd5Var.q = new og5(this) { // from class: md5
            public final /* synthetic */ MyMarketRecyclerListFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:52:0x0212  */
            @Override // defpackage.og5
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void m(android.view.View r22, defpackage.qg5 r23, java.lang.Object r24) {
                /*
                    Method dump skipped, instruction units count: 896
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.md5.m(android.view.View, qg5, java.lang.Object):void");
            }
        };
        final int i5 = 4;
        dd5Var.r = new og5(this) { // from class: md5
            public final /* synthetic */ MyMarketRecyclerListFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:52:0x0212  */
            @Override // defpackage.og5
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void m(android.view.View r22, defpackage.qg5 r23, java.lang.Object r24) {
                /*
                    Method dump skipped, instruction units count: 896
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.md5.m(android.view.View, qg5, java.lang.Object):void");
            }
        };
        return dd5Var;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        super.k0(view, bundle);
        this.J0.d(R1(), this);
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new MyMarketRecyclerListFragment$onViewCreated$1(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.e, new MyMarketRecyclerListFragment$onViewCreated$2(this, null));
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final k k1() {
        MyketStaggeredLayoutManager myketStaggeredLayoutManager = new MyketStaggeredLayoutManager(v1());
        myketStaggeredLayoutManager.N = u1();
        return myketStaggeredLayoutManager;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final c l1() {
        return S1();
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, ir.mservices.market.common.base.BaseContentFragment
    public void onEvent(qj8 qj8Var) {
        Handler handler;
        js3.p(qj8Var, "event");
        super.onEvent(qj8Var);
        u03 u03Var = new u03(9, this);
        synchronized (zk8.class) {
            handler = zk8.a;
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
                zk8.a = handler;
            }
        }
        lw.f(null, null, handler.post(u03Var));
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final int q1() {
        return fp6.layout_animation_fall_down_fast;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final h t1() {
        return new nv2(K().getDimensionPixelSize(pq6.space_xl), K().getDimensionPixelSize(pq6.space_xl));
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final PaddingLayoutManager$Padding u1() {
        int dimensionPixelSize = K().getDimensionPixelSize(pq6.horizontal_space_inner) + K().getDimensionPixelSize(pq6.horizontal_space_outer);
        return new PaddingLayoutManager$Padding(dimensionPixelSize, 0, dimensionPixelSize, K().getDimensionPixelSize(pq6.space_8));
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final int v1() {
        return K().getInteger(ds6.mymarket_max_span);
    }
}
