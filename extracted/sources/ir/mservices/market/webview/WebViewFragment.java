package ir.mservices.market.webview;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;
import androidx.databinding.DataBinderMapperImpl;
import defpackage.au7;
import defpackage.bi5;
import defpackage.bp2;
import defpackage.c24;
import defpackage.cb4;
import defpackage.eb4;
import defpackage.f09;
import defpackage.fa1;
import defpackage.fg5;
import defpackage.g27;
import defpackage.gb4;
import defpackage.ho6;
import defpackage.ib4;
import defpackage.io6;
import defpackage.j71;
import defpackage.js3;
import defpackage.js6;
import defpackage.jx2;
import defpackage.kb4;
import defpackage.lk1;
import defpackage.ms6;
import defpackage.o79;
import defpackage.q40;
import defpackage.q79;
import defpackage.rr6;
import defpackage.rs6;
import defpackage.s40;
import defpackage.sj8;
import defpackage.t40;
import defpackage.ue7;
import defpackage.v41;
import defpackage.x79;
import defpackage.yc9;
import defpackage.yq2;
import defpackage.yu7;
import defpackage.zc9;
import ir.mservices.market.activity.BaseFragmentContentActivity;
import ir.mservices.market.core.analytics.ActionBarEventBuilder;
import ir.mservices.market.togo.TogoAction;
import ir.mservices.market.views.MyketWebView;
import ir.mservices.market.views.TryAgainView;
import java.util.Map;
import java.util.Stack;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.a;

/* JADX INFO: loaded from: classes3.dex */
public final class WebViewFragment extends Hilt_WebViewFragment {
    public static final /* synthetic */ int c1 = 0;
    public final bi5 V0 = new bi5(g27.a(zc9.class), new yc9(this, 0));
    public v41 W0;
    public final o79 X0;
    public final Stack Y0;
    public final io6 Z0;
    public final ho6 a1;
    public final lk1 b1;

    public WebViewFragment() {
        final WebViewFragment$special$$inlined$viewModels$default$1 webViewFragment$special$$inlined$viewModels$default$1 = new WebViewFragment$special$$inlined$viewModels$default$1(this);
        final c24 c24VarB = a.b(LazyThreadSafetyMode.c, new bp2() { // from class: ir.mservices.market.webview.WebViewFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) webViewFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.X0 = new o79(g27.a(WebViewViewModel.class), new bp2() { // from class: ir.mservices.market.webview.WebViewFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.webview.WebViewFragment$special$$inlined$viewModels$default$5
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
        }, new bp2() { // from class: ir.mservices.market.webview.WebViewFragment$special$$inlined$viewModels$default$4
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
        this.Y0 = new Stack();
        this.Z0 = new io6(1, this);
        this.a1 = new ho6(3, this);
        this.b1 = new lk1(4);
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String C() {
        String strL = L(rs6.page_name_webview_banner_link);
        js3.o(strL, "getString(...)");
        return strL;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean E0() {
        return false;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String Q0(BaseFragmentContentActivity baseFragmentContentActivity) {
        return k1().b;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean V0() {
        return k1().d;
    }

    @Override // androidx.fragment.app.d
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        js3.p(layoutInflater, "inflater");
        int i = v41.y;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        v41 v41Var = (v41) fa1.c(layoutInflater, js6.content_web_view_fragment, viewGroup, false);
        this.W0 = v41Var;
        View view = v41Var.l;
        js3.o(view, "getRoot(...)");
        return view;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment, ir.mservices.market.version2.fragments.base.BaseFragment, androidx.fragment.app.d
    public final void b0() throws Exception {
        super.b0();
        v41 v41Var = this.W0;
        js3.m(v41Var);
        v41Var.v.removeAllViews();
        MyketWebView myketWebView = v41Var.x;
        myketWebView.clearHistory();
        myketWebView.clearCache(false);
        myketWebView.loadUrl("about:blank");
        myketWebView.onPause();
        myketWebView.removeAllViews();
        myketWebView.setWebViewClient(new WebViewClient());
        myketWebView.setWebChromeClient(null);
        myketWebView.destroy();
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean b1() {
        return false;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean c1() {
        return false;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final yq2 e1() {
        t40 t40Var = t40.g;
        q40 q40Var = q40.g;
        Stack stack = this.Y0;
        if (stack.empty()) {
            return k1().g ? q40Var : t40Var;
        }
        stack.pop();
        if (stack.empty()) {
            return k1().g ? q40Var : t40Var;
        }
        String str = (String) stack.pop();
        js3.m(str);
        l1(str);
        return s40.g;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final void f1(Menu menu, MenuInflater menuInflater) {
        js3.p(menu, "menu");
        js3.p(menuInflater, "menuInflater");
        if (k1().c) {
            menuInflater.inflate(ms6.web_view, menu);
            Drawable icon = menu.findItem(rr6.action_share).getIcon();
            if (icon != null) {
                icon.setColorFilter(new PorterDuffColorFilter(sj8.b().n, PorterDuff.Mode.MULTIPLY));
            }
        }
        super.f1(menu, menuInflater);
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean g1(MenuItem menuItem) {
        js3.p(menuItem, "menuItem");
        if (!k1().c || menuItem.getItemId() != rr6.action_share || k1().a.length() > 0) {
            return false;
        }
        ActionBarEventBuilder actionBarEventBuilder = new ActionBarEventBuilder();
        actionBarEventBuilder.b("action_bar_web_banner_share");
        actionBarEventBuilder.a();
        au7.a(H(), k1().a, new yu7(13, this));
        return false;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        super.k0(view, bundle);
        o79 o79Var = this.X0;
        ((WebViewViewModel) o79Var.getValue()).r(new TogoAction.InitAction(yq2.c0(view.getContext())));
        if (fg5.c(Uri.parse(k1().a))) {
            ((WebViewViewModel) o79Var.getValue()).r(TogoAction.SetupHeaderAction.INSTANCE);
        }
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.removeAllCookies(null);
        v41 v41Var = this.W0;
        js3.m(v41Var);
        cookieManager.setAcceptThirdPartyCookies(v41Var.x, true);
        v41 v41Var2 = this.W0;
        js3.m(v41Var2);
        TryAgainView tryAgainView = v41Var2.w;
        tryAgainView.setPrimaryColor(sj8.b().c, sj8.b().d);
        tryAgainView.setOnTryAgainListener(new f09(6, this));
        tryAgainView.setOnSettingListener(new ue7(10, this));
        v41 v41Var3 = this.W0;
        js3.m(v41Var3);
        MyketWebView myketWebView = v41Var3.x;
        WebSettings settings = myketWebView.getSettings();
        settings.setDomStorageEnabled(true);
        settings.setMixedContentMode(2);
        myketWebView.stopLoading();
        myketWebView.requestFocus(130);
        myketWebView.setOnTouchListener(this.b1);
        myketWebView.setWebChromeClient(this.a1);
        myketWebView.setWebViewClient(this.Z0);
        m1();
    }

    public final zc9 k1() {
        return (zc9) this.V0.getValue();
    }

    public final void l1(String str) {
        v41 v41Var = this.W0;
        js3.m(v41Var);
        v41Var.x.loadUrl(str, (Map) ((WebViewViewModel) this.X0.getValue()).y.a.getValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1() {
        /*
            r3 = this;
            android.content.Context r0 = r3.H()
            boolean r0 = defpackage.s7.G(r0)
            if (r0 != 0) goto L10
            cb4 r0 = defpackage.cb4.b
            r3.n1(r0)
            return
        L10:
            gb4 r0 = defpackage.gb4.b
            r3.n1(r0)
            java.util.Stack r0 = r3.Y0
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L40
            zc9 r0 = r3.k1()
            java.lang.String r0 = r0.a
            if (r0 == 0) goto L3a
            kotlin.text.Regex r1 = new kotlin.text.Regex
            java.lang.String r2 = "^\\p{Alpha}+://.*$"
            r1.<init>(r2)
            boolean r1 = r1.f(r0)
            if (r1 != 0) goto L38
            java.lang.String r1 = "http://"
            java.lang.String r0 = r1.concat(r0)
        L38:
            if (r0 != 0) goto L3c
        L3a:
            java.lang.String r0 = ""
        L3c:
            r3.l1(r0)
            return
        L40:
            java.lang.Object r0 = r0.peek()
            java.lang.String r1 = "peek(...)"
            defpackage.js3.o(r0, r1)
            java.lang.String r0 = (java.lang.String) r0
            r3.l1(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.webview.WebViewFragment.m1():void");
    }

    public final void n1(kb4 kb4Var) {
        v41 v41Var = this.W0;
        js3.m(v41Var);
        TryAgainView tryAgainView = v41Var.w;
        MyketWebView myketWebView = v41Var.x;
        js3.o(myketWebView, "webView");
        myketWebView.setVisibility(kb4Var.a ? 0 : 8);
        js3.o(tryAgainView, "tryAgain");
        tryAgainView.setVisibility(0);
        if (kb4Var.equals(cb4.b)) {
            tryAgainView.u(L(rs6.internet_connection_exception));
            return;
        }
        if (kb4Var.equals(eb4.b)) {
            tryAgainView.v();
        } else {
            if (!kb4Var.equals(gb4.b) && !kb4Var.equals(ib4.b)) {
                throw new NoWhenBranchMatchedException();
            }
            tryAgainView.t();
        }
    }
}
