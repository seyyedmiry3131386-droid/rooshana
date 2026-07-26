package ir.mservices.market.togo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle$State;
import defpackage.an2;
import defpackage.b56;
import defpackage.bi5;
import defpackage.bl4;
import defpackage.bp2;
import defpackage.bt2;
import defpackage.bt5;
import defpackage.c24;
import defpackage.cc7;
import defpackage.d56;
import defpackage.db4;
import defpackage.dp3;
import defpackage.dt2;
import defpackage.du;
import defpackage.dw1;
import defpackage.dy3;
import defpackage.f88;
import defpackage.fa1;
import defpackage.fb4;
import defpackage.fg5;
import defpackage.fk0;
import defpackage.g27;
import defpackage.g76;
import defpackage.gh9;
import defpackage.hb4;
import defpackage.hh2;
import defpackage.ho6;
import defpackage.hs5;
import defpackage.j71;
import defpackage.jb4;
import defpackage.js3;
import defpackage.js6;
import defpackage.jx2;
import defpackage.k68;
import defpackage.lb4;
import defpackage.lk1;
import defpackage.lu7;
import defpackage.mm2;
import defpackage.mp1;
import defpackage.o40;
import defpackage.o79;
import defpackage.pk0;
import defpackage.pq6;
import defpackage.q40;
import defpackage.q79;
import defpackage.rf7;
import defpackage.rh5;
import defpackage.rn8;
import defpackage.rs6;
import defpackage.s40;
import defpackage.s7;
import defpackage.s71;
import defpackage.sg4;
import defpackage.sj8;
import defpackage.t32;
import defpackage.t40;
import defpackage.tm8;
import defpackage.ts5;
import defpackage.ue7;
import defpackage.ug1;
import defpackage.up1;
import defpackage.x79;
import defpackage.xm8;
import defpackage.yq2;
import defpackage.yw6;
import ir.mservices.market.activity.BaseFragmentContentActivity;
import ir.mservices.market.common.uploadImage.UploadImageAction;
import ir.mservices.market.common.uploadImage.UploadImageViewModel;
import ir.mservices.market.togo.TogoAction;
import ir.mservices.market.togo.data.AttachImageCallbackData;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import ir.mservices.market.version2.ui.crop.util.PhotoUtils$PhotoData;
import ir.mservices.market.views.MyketWebView;
import ir.mservices.market.views.TryAgainView;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Stack;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;

/* JADX INFO: loaded from: classes3.dex */
public final class TogoFragment extends Hilt_TogoFragment implements mm2 {
    public static final /* synthetic */ int o1 = 0;
    public dp3 V0;
    public ir.mservices.market.version2.manager.a W0;
    public d56 X0;
    public b56 Y0;
    public rf7 Z0;
    public du a1;
    public lu7 b1;
    public k68 c1;
    public g76 d1;
    public pk0 e1;
    public an2 f1;
    public final Stack g1 = new Stack();
    public final bi5 h1 = new bi5(g27.a(xm8.class), new yw6(22, this));
    public boolean i1 = true;
    public final o79 j1;
    public final o79 k1;
    public final ho6 l1;
    public final b m1;
    public final lk1 n1;

    public final class MyketInterface {
        public MyketInterface() {
        }

        @JavascriptInterface
        public final void attachImage(String str, String str2, String str3, boolean z) {
            TogoFragment togoFragment = TogoFragment.this;
            ir.mservices.market.version2.core.utils.a.b(togoFragment, new TogoFragment$MyketInterface$attachImage$1(togoFragment, str, str2, str3, z, null));
        }

        @JavascriptInterface
        public final void back() {
            TogoFragment togoFragment = TogoFragment.this;
            ir.mservices.market.version2.core.utils.a.b(togoFragment, new TogoFragment$MyketInterface$back$1(togoFragment, null));
        }

        @JavascriptInterface
        public final void changeBottomNavigationVisibility(boolean z) {
            ir.mservices.market.version2.core.utils.a.b(TogoFragment.this, new TogoFragment$MyketInterface$changeBottomNavigationVisibility$1(z, null));
        }

        @JavascriptInterface
        public final void changeTitle(String str) {
            ir.mservices.market.version2.core.utils.a.b(TogoFragment.this, new TogoFragment$MyketInterface$changeTitle$1(str, null));
        }

        @JavascriptInterface
        public final void changeToolbarVisibility(boolean z) {
            TogoFragment togoFragment = TogoFragment.this;
            ir.mservices.market.version2.core.utils.a.b(togoFragment, new TogoFragment$MyketInterface$changeToolbarVisibility$1(togoFragment, z, null));
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [c24, java.lang.Object] */
        @JavascriptInterface
        public final void clearCache() throws IOException {
            pk0 pk0Var = TogoFragment.this.e1;
            if (pk0Var == null) {
                js3.V("cacheInterceptor");
                throw null;
            }
            fk0 fk0Var = ((hs5) pk0Var.a.getValue()).k;
            if (fk0Var != null) {
                mp1 mp1Var = fk0Var.a;
                mp1Var.close();
                gh9.c(mp1Var.b, mp1Var.a);
            }
        }

        @JavascriptInterface
        public final void clearStack() {
            TogoFragment togoFragment = TogoFragment.this;
            ir.mservices.market.version2.core.utils.a.b(togoFragment, new TogoFragment$MyketInterface$clearStack$1(togoFragment, null));
        }

        @JavascriptInterface
        public final void close() {
            TogoFragment togoFragment = TogoFragment.this;
            ir.mservices.market.version2.core.utils.a.b(togoFragment, new TogoFragment$MyketInterface$close$1(togoFragment, null));
        }

        @JavascriptInterface
        public final String getAccountId() {
            ug1 ug1Var = up1.a;
            return (String) bt2.Q(sg4.a, new TogoFragment$MyketInterface$getAccountId$1(TogoFragment.this, null));
        }

        @JavascriptInterface
        public final String getAccountKey() {
            ug1 ug1Var = up1.a;
            return (String) bt2.Q(sg4.a, new TogoFragment$MyketInterface$getAccountKey$1(TogoFragment.this, null));
        }

        @JavascriptInterface
        public final String getAndroidApi() {
            ug1 ug1Var = up1.a;
            return (String) bt2.Q(sg4.a, new TogoFragment$MyketInterface$getAndroidApi$1(2, null));
        }

        @JavascriptInterface
        public final String getAppPackageName() {
            ug1 ug1Var = up1.a;
            return (String) bt2.Q(sg4.a, new TogoFragment$MyketInterface$getAppPackageName$1(TogoFragment.this, null));
        }

        @JavascriptInterface
        public final String getAppStatus(String str, int i, boolean z) {
            ug1 ug1Var = up1.a;
            return (String) bt2.Q(sg4.a, new TogoFragment$MyketInterface$getAppStatus$1(str, TogoFragment.this, i, z, null));
        }

        @JavascriptInterface
        public final String getAuthToken() {
            ug1 ug1Var = up1.a;
            return (String) bt2.Q(sg4.a, new TogoFragment$MyketInterface$getAuthToken$1(TogoFragment.this, null));
        }

        @JavascriptInterface
        public final String getBinds() {
            ug1 ug1Var = up1.a;
            return (String) bt2.Q(sg4.a, new TogoFragment$MyketInterface$getBinds$1(TogoFragment.this, null));
        }

        @JavascriptInterface
        public final int getClientVersion() {
            ug1 ug1Var = up1.a;
            return ((Number) bt2.Q(sg4.a, new TogoFragment$MyketInterface$getClientVersion$1(2, null))).intValue();
        }

        @JavascriptInterface
        public final String getCookie(String str) {
            ug1 ug1Var = up1.a;
            return (String) bt2.Q(sg4.a, new TogoFragment$MyketInterface$getCookie$1(null, TogoFragment.this, str));
        }

        @JavascriptInterface
        public final String getInstalledApps() {
            ug1 ug1Var = up1.a;
            return (String) bt2.Q(sg4.a, new TogoFragment$MyketInterface$getInstalledApps$1(TogoFragment.this, null));
        }

        @JavascriptInterface
        public final String getLang() {
            ug1 ug1Var = up1.a;
            return (String) bt2.Q(sg4.a, new TogoFragment$MyketInterface$getLang$1(TogoFragment.this, null));
        }

        @JavascriptInterface
        public final void getMetadata(String str) {
            int i = TogoFragment.o1;
            TogoFragment.this.n1().r(new TogoAction.GetMetadataAction(str));
        }

        @JavascriptInterface
        public final String getPlatform() {
            ug1 ug1Var = up1.a;
            return (String) bt2.Q(sg4.a, new TogoFragment$MyketInterface$getPlatform$1(2, null));
        }

        @JavascriptInterface
        public final String getProfileInfo() {
            ug1 ug1Var = up1.a;
            return (String) bt2.Q(sg4.a, new TogoFragment$MyketInterface$getProfileInfo$1(TogoFragment.this, null));
        }

        @JavascriptInterface
        public final String getStore() {
            ug1 ug1Var = up1.a;
            return (String) bt2.Q(sg4.a, new TogoFragment$MyketInterface$getStore$1(2, null));
        }

        @JavascriptInterface
        public final String getStyle() {
            ug1 ug1Var = up1.a;
            return (String) bt2.Q(sg4.a, new TogoFragment$MyketInterface$getStyle$1(2, null));
        }

        @JavascriptInterface
        public final String getTheme() {
            ug1 ug1Var = up1.a;
            return (String) bt2.Q(sg4.a, new TogoFragment$MyketInterface$getTheme$1(2, null));
        }

        @JavascriptInterface
        public final String isAppInstalled(String str) {
            ug1 ug1Var = up1.a;
            return (String) bt2.Q(sg4.a, new TogoFragment$MyketInterface$isAppInstalled$1(null, TogoFragment.this, str));
        }

        @JavascriptInterface
        public final boolean isLogin() {
            ug1 ug1Var = up1.a;
            return ((Boolean) bt2.Q(sg4.a, new TogoFragment$MyketInterface$isLogin$1(TogoFragment.this, null))).booleanValue();
        }

        @JavascriptInterface
        public final void login(String str, String str2, String str3, String str4) {
            login(str, str2, null, null, null, str3, str4);
        }

        @JavascriptInterface
        public final void openAppSetting(String str) {
            TogoFragment togoFragment = TogoFragment.this;
            ir.mservices.market.version2.core.utils.a.b(togoFragment, new TogoFragment$MyketInterface$openAppSetting$1(null, togoFragment, str));
        }

        @JavascriptInterface
        public final boolean openIntent(String str, String str2) {
            return openIntent(str, str2, false);
        }

        @JavascriptInterface
        public final void openStartDownload(String str, String str2) {
            if (str == null || f88.n0(str)) {
                return;
            }
            TogoFragment togoFragment = TogoFragment.this;
            ir.mservices.market.version2.core.utils.a.b(togoFragment, new TogoFragment$MyketInterface$openStartDownload$1(null, togoFragment, str, str2));
        }

        @JavascriptInterface
        public final void openUrl(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            TogoFragment togoFragment = TogoFragment.this;
            ir.mservices.market.version2.core.utils.a.b(togoFragment, new TogoFragment$MyketInterface$openUrl$1(str, z3, togoFragment, str2, z, z2, z4, z5, null));
        }

        @JavascriptInterface
        public final void requestAdId(long j, String str, String str2) {
            int i = TogoFragment.o1;
            TogoFragment.this.n1().r(new TogoAction.GetGoogleAdId(j, str, str2));
        }

        @JavascriptInterface
        public final void runApp(String str) {
            TogoFragment togoFragment = TogoFragment.this;
            ir.mservices.market.version2.core.utils.a.b(togoFragment, new TogoFragment$MyketInterface$runApp$1(null, togoFragment, str));
        }

        @JavascriptInterface
        public final void safeDomains(String[] strArr) {
            if (strArr == null || strArr.length == 0) {
                return;
            }
            TogoFragment togoFragment = TogoFragment.this;
            ir.mservices.market.version2.core.utils.a.b(togoFragment, new TogoFragment$MyketInterface$safeDomains$1(togoFragment, strArr, null));
        }

        @JavascriptInterface
        public final void setBackButton(String str) {
            int i = TogoFragment.o1;
            TogoViewModel togoViewModelN1 = TogoFragment.this.n1();
            if (str == null) {
                str = "";
            }
            togoViewModelN1.r(new TogoAction.ButtonTypeAction(str));
        }

        @JavascriptInterface
        public final void setCacheControl(boolean z) {
            int i = TogoFragment.o1;
            TogoFragment.this.n1().r(new TogoAction.CacheControlAction(z));
        }

        @JavascriptInterface
        public final void setCookie(String str, String str2) {
            TogoFragment togoFragment = TogoFragment.this;
            ir.mservices.market.version2.core.utils.a.b(togoFragment, new TogoFragment$MyketInterface$setCookie$1(null, togoFragment, str, str2));
        }

        @JavascriptInterface
        public final void setNativeBackEnable(boolean z, String str) {
            int i = TogoFragment.o1;
            TogoFragment.this.n1().r(new TogoAction.NativeBackEnableAction(new rh5(z, str)));
        }

        @JavascriptInterface
        public final void setSoftInput(String str) {
            ir.mservices.market.version2.core.utils.a.b(TogoFragment.this, new TogoFragment$MyketInterface$setSoftInput$1(str, null));
        }

        @JavascriptInterface
        public final void shareImage(String str, String str2) {
            TogoFragment togoFragment = TogoFragment.this;
            ir.mservices.market.version2.core.utils.a.b(togoFragment, new TogoFragment$MyketInterface$shareImage$1(str, this, str2, togoFragment, null));
        }

        @JavascriptInterface
        public final void shareText(String str) {
            TogoFragment togoFragment = TogoFragment.this;
            ir.mservices.market.version2.core.utils.a.b(togoFragment, new TogoFragment$MyketInterface$shareText$1(null, togoFragment, str));
        }

        @JavascriptInterface
        public final void showToast(String str) {
            if (str == null || f88.n0(str)) {
                return;
            }
            TogoFragment togoFragment = TogoFragment.this;
            ir.mservices.market.version2.core.utils.a.b(togoFragment, new TogoFragment$MyketInterface$showToast$1(null, togoFragment, str));
        }

        @JavascriptInterface
        @SuppressLint({"MissingPermission"})
        public final void startDownload(String str, String str2) {
            if (str == null || f88.n0(str)) {
                return;
            }
            TogoFragment togoFragment = TogoFragment.this;
            ir.mservices.market.version2.core.utils.a.b(togoFragment, new TogoFragment$MyketInterface$startDownload$1(null, togoFragment, str, str2));
        }

        @JavascriptInterface
        public final void uninstall(String str) {
            TogoFragment togoFragment = TogoFragment.this;
            ir.mservices.market.version2.core.utils.a.b(togoFragment, new TogoFragment$MyketInterface$uninstall$1(null, togoFragment, str));
        }

        @JavascriptInterface
        public final void login(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            if (isLogin()) {
                TogoFragment togoFragment = TogoFragment.this;
                ir.mservices.market.version2.core.utils.a.b(togoFragment, new TogoFragment$MyketInterface$login$1(null, togoFragment, str6));
            } else {
                TogoFragment togoFragment2 = TogoFragment.this;
                ir.mservices.market.version2.core.utils.a.b(togoFragment2, new TogoFragment$MyketInterface$login$2(togoFragment2, str6, str7, str2, str3, str4, str5, null));
            }
        }

        @JavascriptInterface
        public final boolean openIntent(String str, String str2, boolean z) {
            ug1 ug1Var = up1.a;
            return ((Boolean) bt2.Q(sg4.a, new TogoFragment$MyketInterface$openIntent$1(TogoFragment.this, z, str, str2, null))).booleanValue();
        }

        @JavascriptInterface
        public final void openUrl(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
            openUrl(str, str2, z, z2, z3, z4, false);
        }

        @JavascriptInterface
        public final void openUrl(String str, String str2, boolean z, boolean z2, boolean z3) {
            openUrl(str, str2, z, z2, z3, true, false);
        }

        @JavascriptInterface
        public final String getAppStatus(String str, int i, boolean z, long j) {
            ug1 ug1Var = up1.a;
            return (String) bt2.Q(sg4.a, new TogoFragment$MyketInterface$getAppStatus$2(str, TogoFragment.this, i, z, j, null));
        }
    }

    public TogoFragment() {
        final TogoFragment$special$$inlined$viewModels$default$1 togoFragment$special$$inlined$viewModels$default$1 = new TogoFragment$special$$inlined$viewModels$default$1(this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.c;
        final c24 c24VarB = kotlin.a.b(lazyThreadSafetyMode, new bp2() { // from class: ir.mservices.market.togo.TogoFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) togoFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.j1 = new o79(g27.a(UploadImageViewModel.class), new bp2() { // from class: ir.mservices.market.togo.TogoFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.togo.TogoFragment$special$$inlined$viewModels$default$5
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
        }, new bp2() { // from class: ir.mservices.market.togo.TogoFragment$special$$inlined$viewModels$default$4
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
        final TogoFragment$special$$inlined$viewModels$default$6 togoFragment$special$$inlined$viewModels$default$6 = new TogoFragment$special$$inlined$viewModels$default$6(this);
        final c24 c24VarB2 = kotlin.a.b(lazyThreadSafetyMode, new bp2() { // from class: ir.mservices.market.togo.TogoFragment$special$$inlined$viewModels$default$7
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) togoFragment$special$$inlined$viewModels$default$6.invoke();
            }
        });
        this.k1 = new o79(g27.a(TogoViewModel.class), new bp2() { // from class: ir.mservices.market.togo.TogoFragment$special$$inlined$viewModels$default$8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB2.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.togo.TogoFragment$special$$inlined$viewModels$default$10
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
        }, new bp2() { // from class: ir.mservices.market.togo.TogoFragment$special$$inlined$viewModels$default$9
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
        this.l1 = new ho6(1, this);
        this.m1 = new b(this);
        this.n1 = new lk1(3);
    }

    @Override // defpackage.mm2
    public final void B(Bundle bundle, String str) {
        js3.p(str, "requestKey");
        js3.p(bundle, "result");
        if (str.equalsIgnoreCase(m1())) {
            Object objP = dt2.p(bundle, "BUNDLE_KEY_DATA", DialogDataModel.class);
            js3.n(objP, "null cannot be cast to non-null type ir.mservices.market.version2.fragments.dialog.DialogDataModel");
            DialogDataModel dialogDataModel = (DialogDataModel) objP;
            Bundle bundle2 = dialogDataModel.c;
            String str2 = dialogDataModel.b;
            if ("DIALOG_KEY_PROGRESS".equalsIgnoreCase(str2)) {
                this.G0.a(n1());
                return;
            }
            if ("DIALOG_KEY_LOGIN_TOGO".equalsIgnoreCase(str2)) {
                String string = bundle2.getString("BUNDLE_KEY_SUCCESS_CALLBACK");
                String string2 = bundle2.getString("BUNDLE_KEY_ERROR_CALLBACK");
                if (dialogDataModel.d == DialogResult.a) {
                    n1().r(new TogoAction.GetAccountInfoAction(string, string2));
                } else {
                    k1(string2, null);
                }
            }
        }
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String C() {
        String strL = L(rs6.page_name_togo);
        js3.o(strL, "getString(...)");
        return strL;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final int G0(Context context) {
        if (this.i1) {
            return context.getResources().getDimensionPixelSize(pq6.actionbar_size);
        }
        return 0;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String Q0(BaseFragmentContentActivity baseFragmentContentActivity) {
        String str = l1().b;
        return (str == null || f88.n0(str)) ? "" : str;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void T(Bundle bundle) {
        super.T(bundle);
        an2 an2Var = this.f1;
        js3.m(an2Var);
        View view = an2Var.w;
        js3.o(view, "shadow");
        view.setVisibility(l1().d ? 0 : 8);
        bt5 bt5VarF = F();
        rn8 rn8Var = bt5VarF instanceof rn8 ? (rn8) bt5VarF : null;
        if (rn8Var != null) {
            rn8Var.j(this.i1);
        }
    }

    @Override // androidx.fragment.app.d
    public final void U(int i, int i2, Intent intent) throws Throwable {
        Object objA;
        super.U(i, i2, intent);
        if (i != 9081) {
            return;
        }
        int i3 = 1;
        String str = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        if (F() != null) {
            if ((intent != null ? intent.getData() : null) != null) {
                AttachImageCallbackData attachImageCallbackData = (AttachImageCallbackData) n1().G.a.getValue();
                if (attachImageCallbackData != null && attachImageCallbackData.getHasCrop()) {
                    g76 g76Var = this.d1;
                    if (g76Var != null) {
                        g76Var.c(i2, i, intent, F(), this.J0, new PhotoUtils$PhotoData(this.H0, "FREE"));
                        return;
                    } else {
                        js3.V("photoUtils");
                        throw null;
                    }
                }
                Bitmap bitmapO = dy3.o(F(), intent.getData(), 2048);
                try {
                    String str2 = System.currentTimeMillis() + "_cropped.png";
                    if (this.d1 == null) {
                        js3.V("photoUtils");
                        throw null;
                    }
                    File file = new File(g76.b(q0()), str2);
                    if (bitmapO != null) {
                        FileOutputStream fileOutputStreamK = io.sentry.config.a.k(new FileOutputStream(file), file);
                        try {
                            bitmapO.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStreamK);
                            fileOutputStreamK.close();
                            objA = Uri.fromFile(file);
                        } finally {
                        }
                    } else {
                        objA = null;
                    }
                } catch (Throwable th) {
                    objA = kotlin.b.a(th);
                }
                boolean z4 = objA instanceof Result.Failure;
                Object obj = objA;
                if (z4) {
                    obj = null;
                }
                Uri uri = (Uri) obj;
                if (uri != null) {
                    t32.b().j(new s71(uri, true, this.H0));
                    return;
                }
                o1().r(new UploadImageAction.ImagePathAction(str, i3, z3 ? 1 : 0));
                n1().r(new TogoAction.AttachImageAction(null, 1, null));
                hh2.H(s7.L(F(), rs6.select_image_error));
                return;
            }
        }
        o1().r(new UploadImageAction.ImagePathAction(z2 ? 1 : 0, i3, z ? 1 : 0));
        n1().r(new TogoAction.AttachImageAction(null, 1, null));
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean U0() {
        return false;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean V0() {
        return l1().c;
    }

    @Override // ir.mservices.market.togo.Hilt_TogoFragment, ir.mservices.market.common.base.BaseContentFragment, ir.mservices.market.version2.fragments.base.BaseNavigationFragment, defpackage.cz2, androidx.fragment.app.d
    public final void W(Context context) {
        js3.p(context, "context");
        super.W(context);
        this.i1 = l1().e;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean Y0() {
        return this.i1;
    }

    @Override // androidx.fragment.app.d
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        js3.p(layoutInflater, "inflater");
        int i = an2.z;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        an2 an2Var = (an2) fa1.c(layoutInflater, js6.fragment_togo, viewGroup, false);
        this.f1 = an2Var;
        js3.m(an2Var);
        View view = an2Var.l;
        js3.o(view, "getRoot(...)");
        return view;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment, ir.mservices.market.version2.fragments.base.BaseFragment, androidx.fragment.app.d
    public final void b0() throws Exception {
        Window window;
        an2 an2Var = this.f1;
        js3.m(an2Var);
        View view = an2Var.l;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        an2 an2Var2 = this.f1;
        js3.m(an2Var2);
        MyketWebView myketWebView = an2Var2.y;
        myketWebView.clearHistory();
        myketWebView.removeJavascriptInterface("Myket");
        myketWebView.loadUrl("about:blank");
        myketWebView.clearCache(false);
        myketWebView.onPause();
        myketWebView.removeAllViews();
        myketWebView.setWebViewClient(new WebViewClient());
        myketWebView.setWebChromeClient(null);
        myketWebView.destroy();
        this.f1 = null;
        this.J0.x(m1());
        FragmentActivity fragmentActivityF = F();
        if (fragmentActivityF != null && (window = fragmentActivityF.getWindow()) != null) {
            window.setSoftInputMode(32);
        }
        super.b0();
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
        s40 s40Var = s40.g;
        rh5 rh5Var = (rh5) n1().L0.a.getValue();
        if (rh5Var != null && !rh5Var.a) {
            rh5 rh5Var2 = (rh5) n1().L0.a.getValue();
            k1(rh5Var2 != null ? rh5Var2.b : null, null);
            return s40Var;
        }
        if (js3.i(n1().J.a.getValue(), tm8.b)) {
            return l1().g ? q40Var : t40Var;
        }
        Stack stack = this.g1;
        if (stack.empty()) {
            return l1().g ? q40Var : t40Var;
        }
        stack.pop();
        if (stack.empty()) {
            return l1().g ? q40Var : t40Var;
        }
        Object objPop = stack.pop();
        js3.o(objPop, "pop(...)");
        n1().r(new TogoAction.LoadPageAction((String) objPop));
        return s40Var;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        super.k0(view, bundle);
        n1().r(new TogoAction.InitAction(yq2.c0(view.getContext())));
        UploadImageViewModel uploadImageViewModelO1 = o1();
        String str = this.H0;
        js3.o(str, "getSubscriberId(...)");
        uploadImageViewModelO1.r(new UploadImageAction.SubscriberIdAction(str));
        this.J0.d(m1(), this);
        if (fg5.c(Uri.parse(l1().a))) {
            n1().r(TogoAction.SetupHeaderAction.INSTANCE);
        }
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setAcceptCookie(true);
        an2 an2Var = this.f1;
        js3.m(an2Var);
        cookieManager.setAcceptThirdPartyCookies(an2Var.y, true);
        cookieManager.flush();
        an2 an2Var2 = this.f1;
        js3.m(an2Var2);
        MyketWebView myketWebView = an2Var2.y;
        myketWebView.stopLoading();
        myketWebView.setWebViewClient(this.m1);
        myketWebView.setWebChromeClient(this.l1);
        myketWebView.requestFocus(130);
        WebSettings settings = myketWebView.getSettings();
        settings.setCacheMode(-1);
        settings.setDomStorageEnabled(true);
        settings.setMixedContentMode(2);
        myketWebView.addJavascriptInterface(new MyketInterface(), "Myket");
        myketWebView.setOnTouchListener(this.n1);
        an2 an2Var3 = this.f1;
        js3.m(an2Var3);
        TryAgainView tryAgainView = an2Var3.x;
        tryAgainView.setPrimaryColor(sj8.b().c, sj8.b().d);
        tryAgainView.setOnTryAgainListener(new ts5(27, this));
        tryAgainView.setOnSettingListener(new ue7(6, this));
        cc7.d(view, 0, 0, 10, 3);
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.e, new TogoFragment$onViewCreated$1(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new TogoFragment$onViewCreated$2(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new TogoFragment$onViewCreated$3(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new TogoFragment$onViewCreated$4(null, view, this));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new TogoFragment$onViewCreated$5(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new TogoFragment$onViewCreated$6(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new TogoFragment$onViewCreated$7(this, null));
        n1().r(TogoAction.CreateCookieAction.INSTANCE);
    }

    public final void k1(String str, String str2) {
        if (str == null || f88.n0(str)) {
            return;
        }
        an2 an2Var = this.f1;
        js3.m(an2Var);
        MyketWebView myketWebView = an2Var.y;
        String strY = null;
        if (str2 != null) {
            if (f88.n0(str2)) {
                str2 = null;
            }
            if (str2 != null) {
                strY = o40.y("'", str2, "'");
            }
        }
        if (strY == null) {
            strY = "";
        }
        myketWebView.loadUrl(bl4.w("javascript:", str, "(", strY, ");"));
    }

    public final xm8 l1() {
        return (xm8) this.h1.getValue();
    }

    public final String m1() {
        return dw1.n("TogoFragment_", this.H0);
    }

    public final TogoViewModel n1() {
        return (TogoViewModel) this.k1.getValue();
    }

    public final UploadImageViewModel o1() {
        return (UploadImageViewModel) this.j1.getValue();
    }

    public final void p1() {
        if (!s7.G(H())) {
            q1(db4.c);
            return;
        }
        q1(hb4.c);
        Stack stack = this.g1;
        String str = stack.isEmpty() ? l1().a : (String) stack.peek();
        js3.m(str);
        n1().r(new TogoAction.LoadPageAction(str));
    }

    public final void q1(lb4 lb4Var) {
        an2 an2Var = this.f1;
        js3.m(an2Var);
        TryAgainView tryAgainView = an2Var.x;
        View view = an2Var.v;
        js3.o(view, "blankView");
        view.setVisibility(lb4Var.a ? 0 : 8);
        MyketWebView myketWebView = an2Var.y;
        js3.o(myketWebView, "webView");
        myketWebView.setVisibility(lb4Var.b ? 0 : 8);
        js3.o(tryAgainView, "tryAgain");
        tryAgainView.setVisibility(0);
        if (lb4Var.equals(db4.c)) {
            tryAgainView.u(L(rs6.internet_connection_exception));
            return;
        }
        if (lb4Var.equals(fb4.c)) {
            tryAgainView.v();
        } else {
            if (!lb4Var.equals(hb4.c) && !lb4Var.equals(jb4.c)) {
                throw new NoWhenBranchMatchedException();
            }
            tryAgainView.t();
        }
    }
}
