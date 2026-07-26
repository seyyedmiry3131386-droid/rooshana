package ir.mservices.market.activity;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.c;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentContainerView;
import androidx.navigation.fragment.NavHostFragment;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.circularreveal.coordinatorlayout.CircularRevealCoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarMenuView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.navigationrail.NavigationRailFrameLayout;
import defpackage.as0;
import defpackage.ba7;
import defpackage.bd;
import defpackage.bk5;
import defpackage.bl4;
import defpackage.bo6;
import defpackage.br3;
import defpackage.br9;
import defpackage.bs0;
import defpackage.bt2;
import defpackage.c5;
import defpackage.c56;
import defpackage.c67;
import defpackage.co6;
import defpackage.cr3;
import defpackage.d04;
import defpackage.dm1;
import defpackage.dp3;
import defpackage.dr3;
import defpackage.ds0;
import defpackage.dt2;
import defpackage.dw1;
import defpackage.ec9;
import defpackage.ee;
import defpackage.eg5;
import defpackage.er3;
import defpackage.f69;
import defpackage.fj5;
import defpackage.fw4;
import defpackage.gp3;
import defpackage.gu9;
import defpackage.h04;
import defpackage.h69;
import defpackage.hh2;
import defpackage.hp6;
import defpackage.hq;
import defpackage.hs1;
import defpackage.hz2;
import defpackage.i04;
import defpackage.i10;
import defpackage.ij5;
import defpackage.ip6;
import defpackage.is3;
import defpackage.j2;
import defpackage.ja1;
import defpackage.jm;
import defpackage.js3;
import defpackage.js6;
import defpackage.js8;
import defpackage.k04;
import defpackage.k50;
import defpackage.k68;
import defpackage.l04;
import defpackage.l7;
import defpackage.lj5;
import defpackage.lk3;
import defpackage.lu7;
import defpackage.lw;
import defpackage.lw8;
import defpackage.m04;
import defpackage.m49;
import defpackage.m91;
import defpackage.ni5;
import defpackage.os1;
import defpackage.p40;
import defpackage.pk5;
import defpackage.pq6;
import defpackage.q0;
import defpackage.q6;
import defpackage.q69;
import defpackage.qj8;
import defpackage.ql0;
import defpackage.qq;
import defpackage.qu2;
import defpackage.qz8;
import defpackage.r0;
import defpackage.rb4;
import defpackage.rj;
import defpackage.rr6;
import defpackage.rs6;
import defpackage.sb7;
import defpackage.sj8;
import defpackage.sm;
import defpackage.su;
import defpackage.t15;
import defpackage.t32;
import defpackage.t61;
import defpackage.u52;
import defpackage.u86;
import defpackage.ul3;
import defpackage.us;
import defpackage.vv2;
import defpackage.we0;
import defpackage.wi5;
import defpackage.wl2;
import defpackage.wo5;
import defpackage.wq2;
import defpackage.xf5;
import defpackage.xm8;
import defpackage.xz7;
import defpackage.yi5;
import defpackage.yq;
import defpackage.z67;
import defpackage.zc9;
import defpackage.zo3;
import defpackage.zq;
import defpackage.zt5;
import ir.mservices.market.app.detail.ui.AppDetailFragment;
import ir.mservices.market.app.update.common.modal.a;
import ir.mservices.market.common.base.BaseContentFragment;
import ir.mservices.market.common.ui.behavior.ScrollAwareFabBehavior;
import ir.mservices.market.core.analytics.ClickEventBuilder;
import ir.mservices.market.core.analytics.ViewEventBuilder;
import ir.mservices.market.core.notification.BadPushMessageException;
import ir.mservices.market.core.notification.PushMessage;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.data.install.PendingInstall;
import ir.mservices.market.data.permission.Permission;
import ir.mservices.market.data.permission.PermissionReasonId;
import ir.mservices.market.data.permission.PermissionResult;
import ir.mservices.market.movie.data.webapi.CommonDataKt;
import ir.mservices.market.service.MyketPackageInstallerService;
import ir.mservices.market.version2.download.DownloadDataModel;
import ir.mservices.market.version2.fragments.SingleImageFragment;
import ir.mservices.market.version2.fragments.SplashScreenFragment;
import ir.mservices.market.version2.fragments.base.BaseNavigationFragment;
import ir.mservices.market.version2.fragments.dialog.AlertBottomDialogFragment;
import ir.mservices.market.version2.fragments.dialog.AppFailedStorageDialogFragment;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import ir.mservices.market.version2.manager.install.InstallConsumer$MutexState;
import ir.mservices.market.version2.services.d;
import ir.mservices.market.version2.webapi.requestdto.AppStatusDto;
import ir.mservices.market.version2.webapi.requestdto.GrabberRequestDto;
import ir.mservices.market.views.DialogHeaderComponent;
import ir.mservices.market.views.InsetsFrameLayout;
import ir.mservices.market.views.MiniPlayerView;
import ir.mservices.market.views.MyketTextView;
import ir.myket.callback.domain.models.CallbackUrlType;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class LaunchContentActivity extends hz2 implements jm, zt5, bk5 {
    public static final /* synthetic */ int B1 = 0;
    public d04 A0;
    public final h04 A1;
    public lu7 B0;
    public eg5 C0;
    public c5 D0;
    public er3 E0;
    public co6 F0;
    public ee G0;
    public d H0;
    public a I0;
    public we0 J0;
    public wo5 K0;
    public t15 L0;
    public i10 M0;
    public k50 N0;
    public dp3 O0;
    public fw4 P0;
    public ul3 Q0;
    public zo3 R0;
    public gp3 S0;
    public ir.mservices.market.core.notification.a T0;
    public qu2 U0;
    public xf5 V0;
    public k68 W0;
    public ir.mservices.market.version2.manager.a X0;
    public ec9 Y0;
    public hs1 Z0;
    public lw8 a1;
    public qz8 b1;
    public final Object c1;
    public AppBarLayout d1;
    public AppBarLayout.LayoutParams e1;
    public c f1;
    public boolean g1;
    public CollapsingToolbarLayout h1;
    public FrameLayout i1;
    public m04 j1;
    public FloatingActionButton k1;
    public c l1;
    public FragmentContainerView m1;
    public CircularRevealCoordinatorLayout n1;
    public ImageView o1;
    public int p1;
    public InsetsFrameLayout q1;
    public boolean r1;
    public xz7 s1;
    public FrameLayout t1;
    public FrameLayout u1;
    public Bundle v1;
    public rb4 w1;
    public int x1;
    public int y1;
    public boolean z0;
    public MiniPlayerView z1;

    public LaunchContentActivity() {
        this.y0 = false;
        I(new sm(this, 12));
        this.c1 = bt2.D(ir.myket.callback.manager.a.class);
        this.r1 = true;
        this.y1 = 0;
        this.A1 = new h04();
    }

    public static String o0(int i) {
        if (i == rr6.mainFeature) {
            return "home";
        }
        if (i == rr6.movieHomeRoot) {
            return CommonDataKt.MOVIE_TYPE_MOVIE;
        }
        if (i == rr6.gameFeature) {
            return "game";
        }
        if (i == rr6.rootUpdate) {
            return AppStatusDto.Type.UPDATE;
        }
        lw.g(null, "id is not valid", null);
        return "home";
    }

    public static int p0(int i) {
        if (i == 0) {
            return rr6.mainFeature;
        }
        if (i == 1) {
            return rr6.gameFeature;
        }
        if (i == 2) {
            return rr6.movieHomeRoot;
        }
        if (i == 3) {
            return rr6.rootUpdate;
        }
        throw new IllegalArgumentException("index is not valid");
    }

    @Override // defpackage.jm
    public final void A(int i) {
        this.r1 = i == 0;
        t32.b().g(new i04(i, this.p1));
    }

    public final void A0(BaseContentFragment baseContentFragment) {
        this.h1.setScrimVisibleHeightTrigger(baseContentFragment.G0(this) * 2);
        this.h1.setContentScrimColor(sj8.b().N);
        if (baseContentFragment.Z0()) {
            this.h1.setContentScrimColor(sj8.b().N);
        } else {
            this.h1.setContentScrimColor(baseContentFragment.R0());
        }
        this.h1.setStatusBarScrimColor(sj8.b().N);
        c cVar = this.f1;
        if (cVar != null) {
            cVar.b(new AppBarLayout.ScrollingViewBehavior());
        }
        a0(baseContentFragment.R0());
        int i = !(baseContentFragment instanceof AppDetailFragment) ? sj8.b().m : sj8.b().N;
        MaterialToolbar materialToolbarV = V();
        if (materialToolbarV != null) {
            materialToolbarV.setTitleTextColor(i);
            materialToolbarV.setSubtitleTextColor(i);
        }
    }

    @Override // ir.mservices.market.activity.BaseNavigationContentActivity, defpackage.mm2
    public final void B(Bundle bundle, String str) {
        super.B(bundle, str);
        if (str.equalsIgnoreCase(m0())) {
            DialogDataModel dialogDataModel = (DialogDataModel) dt2.p(bundle, "BUNDLE_KEY_DATA", DialogDataModel.class);
            String str2 = dialogDataModel.b;
            Bundle bundle2 = dialogDataModel.c;
            boolean zEqualsIgnoreCase = "DIALOG_KEY_INSTALL_RESULT_SUCCEED".equalsIgnoreCase(str2);
            InstallConsumer$MutexState installConsumer$MutexState = InstallConsumer$MutexState.c;
            if (zEqualsIgnoreCase) {
                this.T0.a.cancel(11);
                String string = bundle2.getString("packageName", null);
                int i = bundle2.getInt("BUNDLE_KEY_VERSION_CODE", -1);
                lw.d(null, null, string);
                if (dialogDataModel.d != DialogResult.a) {
                    ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                    clickEventBuilder.b("run_dialog_cancel");
                    clickEventBuilder.a();
                    u0();
                    return;
                }
                String strR = this.O0.r(i, string);
                this.R0.e(installConsumer$MutexState);
                if (!TextUtils.isEmpty(strR)) {
                    if (!js8.t(8, this, strR, string) && !dp3.M(string)) {
                        u0();
                        lw.g(null, "Can not run application after installation.", null);
                    }
                    this.O0.e(i, string);
                    return;
                }
                ClickEventBuilder clickEventBuilder2 = new ClickEventBuilder();
                clickEventBuilder2.b("run_dialog_open");
                clickEventBuilder2.a();
                if (dp3.M(string)) {
                    return;
                }
                u0();
                lw.g(null, "Can not run application after installation.", null);
                return;
            }
            if ("DIALOG_KEY_INSTALL_RESULT_NOT_SUCCEED".equalsIgnoreCase(str2)) {
                u0();
                return;
            }
            if ("DIALOG_KEY_FAILED_STORAGE".equalsIgnoreCase(str2)) {
                if (dialogDataModel.d == DialogResult.a) {
                    this.I.e(this, 4);
                    return;
                } else {
                    u0();
                    return;
                }
            }
            if ("DIALOG_KEY_INSTALL_RESULT_NOT_MATCH_SING".equalsIgnoreCase(str2)) {
                boolean z = bundle2.getBoolean("IS_INSTALL_SCENARIO", false);
                String string2 = bundle2.getString("packageName", "");
                lw.b(null, null, TextUtils.isEmpty(string2));
                if (dialogDataModel.d != DialogResult.a) {
                    dw1.y("app_sign_not_matched_cancel");
                    if (z) {
                        u0();
                        return;
                    }
                    return;
                }
                boolean zP = this.O0.P(string2);
                if (z) {
                    if (zP) {
                        this.R0.e(installConsumer$MutexState);
                    } else {
                        u0();
                    }
                }
                dw1.y("app_sign_not_matched_settings");
                return;
            }
            if ("DIALOG_KEY_INSTALL_RESULT_RETRY".equalsIgnoreCase(str2)) {
                PendingInstall pendingInstall = (PendingInstall) dt2.p(bundle2, "BUNDLE_KEY_INSTALL_DATA", PendingInstall.class);
                lw.d(null, null, pendingInstall);
                lw.d(null, null, pendingInstall.getPackageName());
                if (dialogDataModel.d == DialogResult.a) {
                    dw1.y("try_dialog_retry");
                    this.O0.E(pendingInstall.getPackageName(), pendingInstall.getTitle(), Integer.valueOf(pendingInstall.getVersionCode()), pendingInstall.getIconPath());
                    u0();
                    return;
                } else {
                    ClickEventBuilder clickEventBuilder3 = new ClickEventBuilder();
                    clickEventBuilder3.b("try_dialog_cancel");
                    clickEventBuilder3.a();
                    u0();
                    return;
                }
            }
            if ("DIALOG_KEY_NEW_VERSION_NOTE".equalsIgnoreCase(str2)) {
                ViewEventBuilder viewEventBuilder = new ViewEventBuilder();
                viewEventBuilder.b("notification_update_dialog");
                viewEventBuilder.a();
                if (26 <= Build.VERSION.SDK_INT) {
                    if (!this.I.b(this, 3) || ir.mservices.market.core.notification.a.d(this.T0.i, "download")) {
                        this.I.d(this, PermissionReasonId.d);
                        return;
                    }
                    return;
                }
                return;
            }
            if ("DIALOG_KEY_APP_USAGE_RESULT".equalsIgnoreCase(str2)) {
                u0();
                return;
            }
            if (!"DIALOG_KEY_VPN".equalsIgnoreCase(str2)) {
                if ("DIALOG_KEY_SPLASH_SCREEN".equalsIgnoreCase(str2) && dialogDataModel.d == DialogResult.a) {
                    k0();
                    return;
                }
                return;
            }
            if (dialogDataModel.d != DialogResult.a) {
                DownloadDataModel downloadDataModel = (DownloadDataModel) dt2.s(bundle2, "download_data_model", DownloadDataModel.class);
                if (downloadDataModel != null) {
                    this.X0.b(this, downloadDataModel, true);
                    return;
                }
                return;
            }
            Intent intent = new Intent("android.net.vpn.SETTINGS");
            intent.setFlags(268435456);
            Intent intentV = gu9.v(this, intent, new Intent("android.settings.SETTINGS"));
            if (intentV != null) {
                startActivity(intentV);
                return;
            }
            DownloadDataModel downloadDataModel2 = (DownloadDataModel) dt2.s(bundle2, "download_data_model", DownloadDataModel.class);
            if (downloadDataModel2 != null) {
                this.X0.b(this, downloadDataModel2, true);
            }
        }
    }

    @Override // ir.mservices.market.activity.BaseContentActivity, defpackage.z80
    public final String C() {
        return null;
    }

    @Override // ir.mservices.market.activity.BaseNavigationContentActivity, defpackage.am2
    public final void E() {
        rb4 rb4Var = this.w1;
        ((NavigationBarView) rb4Var.c).setSelectedItemId(rr6.mainFeature);
    }

    @Override // ir.mservices.market.activity.BaseContentActivity
    public final MaterialToolbar S() {
        MaterialToolbar materialToolbar = (MaterialToolbar) findViewById(rr6.myket_toolbar);
        materialToolbar.setContentInsetStartWithNavigation(0);
        materialToolbar.setTitleMarginStart(getResources().getDimensionPixelSize(pq6.space_8));
        return materialToolbar;
    }

    @Override // ir.mservices.market.activity.Hilt_BaseNavigationContentActivity, ir.mservices.market.activity.BaseContentActivity
    public final String T() {
        return getString(rs6.page_name_main);
    }

    @Override // ir.mservices.market.activity.BaseContentActivity
    public final String U() {
        String str = "SubscriberId: " + this.O;
        if (getIntent() == null) {
            return str;
        }
        StringBuilder sbE = bl4.E(str, ", Intent for LaunchActivity is:");
        sbE.append(getIntent().toString());
        return sbE.toString();
    }

    @Override // ir.mservices.market.activity.BaseNavigationContentActivity, defpackage.am2
    public final void clearAll() {
        super.clearAll();
        rb4 rb4Var = this.w1;
        ((NavigationBarView) rb4Var.c).setSelectedItemId(p0(0));
    }

    @Override // ir.mservices.market.activity.BaseFragmentContentActivity, ir.mservices.market.activity.BaseNavigationContentActivity
    public final void e0(androidx.fragment.app.d dVar) {
        super.e0(dVar);
        if (dVar instanceof BaseContentFragment) {
            BaseContentFragment baseContentFragment = (BaseContentFragment) dVar;
            boolean z = dVar instanceof ba7;
            h0();
            if (P() != null) {
                P().d0(!z && baseContentFragment.a1());
                W();
            }
            this.a1.getClass();
            lw8.b(this);
            this.z0 = false;
            this.i1.removeAllViews();
            this.q1.removeAllViews();
            ir.mservices.market.core.ext.a.i(this);
            ir.mservices.market.core.ext.a.h(this);
            v0(false, baseContentFragment, Boolean.TRUE);
            this.i1.setBackgroundColor(baseContentFragment.Z0() ? baseContentFragment.R0() : sj8.b().N);
            A0(baseContentFragment);
            j(baseContentFragment.Y0());
            this.d1.setExpanded(baseContentFragment.d1(), false);
            l0(baseContentFragment.M0(), baseContentFragment.V0());
            this.z1.setCanShowMiniPlayer(s() instanceof ba7);
            this.k1.h(null, true);
            this.k1.setOnClickListener(null);
            this.l1.b(new ScrollAwareFabBehavior());
            js3.p(this.k1, "floatingActionButton");
            this.k1.h(null, true);
            this.l1.b(null);
        }
    }

    @Override // defpackage.bk5
    public final boolean f(MenuItem menuItem) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        fj5 fj5Var;
        String strO0 = o0(menuItem.getItemId());
        this.x1 = menuItem.getItemId();
        sb7.p("MyketLaunchActivity", "Tab: " + strO0 + " onClick()", "");
        StringBuilder sb = new StringBuilder("Subscriber: ");
        sb.append(this.O);
        sb.append("navHostFragment: ");
        sb.append(this.Y);
        sb.append(", navHostFragment.controller: ");
        NavHostFragment navHostFragment = this.Y;
        sb.append(navHostFragment != null ? navHostFragment.z0() : "navHost is null");
        lw.d("navController must not be null", sb.toString(), this.X);
        ij5 ij5Var = this.X;
        Bundle bundle = this.v1;
        js3.p(ij5Var, "navController");
        ni5 ni5Var = ij5Var.b;
        wi5 wi5VarF = ni5Var.f();
        if (((wi5VarF == null || (fj5Var = wi5VarF.c) == null) ? null : fj5Var.l(menuItem.getItemId())) instanceof l7) {
            i = ip6.nav_default_enter_anim;
            i2 = ip6.nav_default_exit_anim;
            i3 = ip6.nav_default_pop_enter_anim;
            i4 = ip6.nav_default_pop_exit_anim;
        } else {
            i = hp6.nav_default_enter_anim;
            i2 = hp6.nav_default_exit_anim;
            i3 = hp6.nav_default_pop_enter_anim;
            i4 = hp6.nav_default_pop_exit_anim;
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
            ij5Var.c(menuItem.getItemId(), bundle, new lj5(true, true, i5, false, z, i6, i7, i8, i9));
            wi5 wi5VarF2 = ni5Var.f();
            if (wi5VarF2 != null) {
                int i11 = wi5.f;
                Iterator it = m91.u(wi5VarF2).iterator();
                while (it.hasNext() && ((wi5) it.next()).b.a != menuItem.getItemId()) {
                }
            }
        } catch (IllegalArgumentException unused) {
        }
        q0(o0(((NavigationBarView) this.w1.c).getSelectedItemId()), strO0);
        int iC = this.y1;
        if (iC <= 0) {
            iC = this.B0.c(-1, lu7.G0);
        }
        boolean z2 = iC > 0 || this.Q0.a();
        we0 we0Var = this.J0;
        we0Var.a.b("bottom_navigation_click", AppMeasurementSdk.ConditionalUserProperty.NAME, strO0);
        if (z2) {
            we0Var.a.b("bottom_navigation_click", AppMeasurementSdk.ConditionalUserProperty.NAME, strO0.concat("_badge"));
        }
        if (z2) {
            w0();
        }
        this.v1 = null;
        return true;
    }

    @Override // ir.mservices.market.activity.BaseNavigationContentActivity
    public final void h0() {
        androidx.fragment.app.d dVarS = s();
        if (dVarS instanceof BaseContentFragment) {
            this.n1.setBackgroundColor(((BaseContentFragment) dVarS).H0());
        }
    }

    @Override // ir.mservices.market.activity.BaseContentActivity, defpackage.rn8
    public final void j(boolean z) {
        super.j(z);
        this.d1.setExpanded(z, false);
    }

    public final void k0() {
        this.t1.setVisibility(8);
        lu7 lu7Var = this.B0;
        String str = lu7.G;
        boolean zB = lu7Var.b(str, true);
        lu7 lu7Var2 = this.B0;
        String str2 = lu7.H;
        boolean zB2 = lu7Var2.b(str2, true);
        if (!this.C0.k()) {
            if (zB) {
                this.B0.j(str, false);
                this.B0.j(str2, false);
            } else if (zB2) {
                this.B0.j(str2, false);
                pk5.h(this, new NavIntentDirections.VersionNote(new m49(new DialogDataModel(m0(), "DIALOG_KEY_NEW_VERSION_NOTE", new Bundle()))));
            }
        }
        t0();
        y0();
    }

    @Override // ir.mservices.market.activity.BaseContentActivity, defpackage.rn8
    public final void l(boolean z) {
        androidx.fragment.app.d dVarS = s();
        if (dVarS instanceof BaseContentFragment) {
            v0(true, (BaseContentFragment) dVarS, Boolean.valueOf(z));
            this.h1.requestLayout();
        }
    }

    public final void l0(int i, boolean z) {
        rb4 rb4Var = this.w1;
        ((NavigationBarView) rb4Var.c).setVisibility(z ? 0 : 8);
        ImageView imageView = (ImageView) rb4Var.d;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
            Drawable drawable = imageView.getDrawable();
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(sj8.b().l, PorterDuff.Mode.MULTIPLY));
            }
        }
        FragmentContainerView fragmentContainerView = this.m1;
        int iA = this.A0.e() ? this.w1.A() : 0;
        int iA2 = this.A0.f() ? this.w1.A() : 0;
        rb4 rb4Var2 = this.w1;
        NavigationBarView navigationBarView = (NavigationBarView) rb4Var2.c;
        fragmentContainerView.setPaddingRelative(iA, 0, iA2, ((navigationBarView instanceof BottomNavigationView) && navigationBarView.getVisibility() == 0) ? rb4Var2.s().getResources().getDimensionPixelOffset(pq6.bottom_navigation_height) : 0);
        this.h1.setPaddingRelative(this.w1.A(), this.h1.getPaddingTop(), 0, 0);
        MiniPlayerView miniPlayerView = this.z1;
        rb4 rb4Var3 = this.w1;
        boolean z2 = ((NavigationBarView) rb4Var3.c) instanceof BottomNavigationView;
        int iA3 = rb4Var3.A();
        if (z2) {
            ViewGroup.LayoutParams layoutParams = miniPlayerView.getLayoutParams();
            js3.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = miniPlayerView.getResources().getDimensionPixelSize(pq6.space_4);
            marginLayoutParams.setMarginStart(miniPlayerView.getResources().getDimensionPixelSize(pq6.horizontal_space_outer));
            marginLayoutParams.setMarginEnd(miniPlayerView.getResources().getDimensionPixelSize(pq6.horizontal_space_outer));
            miniPlayerView.setLayoutParams(marginLayoutParams);
            miniPlayerView.requestLayout();
        } else {
            miniPlayerView.getClass();
            u52 u52Var = new u52(iA3, 9);
            WeakHashMap weakHashMap = q69.a;
            h69.m(miniPlayerView, u52Var);
        }
        this.w1.M(this, i);
    }

    public final String m0() {
        return getClass().getSimpleName() + "_" + this.O;
    }

    @Override // ir.mservices.market.activity.BaseContentActivity, defpackage.rn8
    public final boolean n() {
        return this.r1;
    }

    public final String n0() {
        if (this.B0.b(lu7.d0, true)) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(getAssets().open("starter.txt"), StandardCharsets.UTF_8));
                try {
                    String line = bufferedReader.readLine();
                    if (TextUtils.isEmpty(line)) {
                        lw.g(null, "Starter file exist but its content is empty!", null);
                    }
                    bufferedReader.close();
                    return line;
                } finally {
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Override // ir.mservices.market.activity.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        androidx.fragment.app.d dVarB = pk5.b(this);
        if (dVarB != null) {
            dVarB.U(i, i2, intent);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02e4  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // ir.mservices.market.activity.BaseNavigationContentActivity, ir.mservices.market.activity.BaseContentActivity, ir.mservices.market.activity.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r15) {
        /*
            Method dump skipped, instruction units count: 1574
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.activity.LaunchContentActivity.onCreate(android.os.Bundle):void");
    }

    @Override // ir.mservices.market.activity.BaseNavigationContentActivity, ir.mservices.market.activity.BaseContentActivity, ir.mservices.market.activity.Hilt_BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        x(m0());
        this.T0.a.cancel(12);
        super.onDestroy();
    }

    public void onEvent(c56 c56Var) {
        for (Permission permission : c56Var.a) {
            if (4 == permission.a) {
                if (permission.d == PermissionResult.GRANTED) {
                    pk5.h(this, new NavIntentDirections.AppUsage(new su(new DialogDataModel(m0(), "DIALOG_KEY_APP_USAGE_RESULT"))));
                } else {
                    u0();
                }
            }
        }
    }

    @Override // ir.mservices.market.activity.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        r0[] r0VarArrZ;
        dr3 dr3VarA;
        super.onNewIntent(intent);
        intent.getAction();
        intent.toString();
        if (TextUtils.isEmpty(intent.getAction()) || "android.intent.action.MAIN".equalsIgnoreCase(intent.getAction())) {
            return;
        }
        er3 er3Var = this.E0;
        synchronized (er3Var) {
            try {
                q0 q0Var = new q0(this, intent);
                Uri referrer = getReferrer();
                if (referrer != null) {
                    q0Var.l = referrer.getHost();
                }
                if (TextUtils.isEmpty(intent.getAction())) {
                    lw.g(null, "action is Null or empty!", null);
                    dr3VarA = null;
                } else {
                    WeakReference weakReference = er3Var.i;
                    if (weakReference == null) {
                        r0VarArrZ = br9.z();
                        er3Var.i = new WeakReference(r0VarArrZ);
                    } else {
                        r0VarArrZ = (r0[]) weakReference.get();
                        if (r0VarArrZ == null) {
                            r0VarArrZ = br9.z();
                            er3Var.i = new WeakReference(r0VarArrZ);
                        }
                    }
                    int length = r0VarArrZ.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            dr3VarA = null;
                            break;
                        }
                        r0 r0Var = r0VarArrZ[i];
                        if (r0Var.b(q0Var)) {
                            dr3VarA = r0Var.a(er3Var, q0Var);
                            break;
                        }
                        i++;
                    }
                    String strC = q0Var.c();
                    if (strC != null && (strC.contains(q0Var.b(rs6.myket_domain)) || strC.contains(q0Var.b(rs6.myket_net_domain)))) {
                        String string = q0Var.b.getData().toString();
                        GrabberRequestDto grabberRequestDto = new GrabberRequestDto(string, q0Var.l);
                        sb7.p("Grabber", "Request", grabberRequestDto.toString());
                        er3Var.d.l(grabberRequestDto, new br3(this, 0), new cr3(this, string));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (dr3VarA != null && dr3VarA.b != -1 && ((NavigationBarView) this.w1.c).getSelectedItemId() != p0(dr3VarA.b)) {
            if (!dr3VarA.h(6)) {
                lw.g(null, null, null);
            }
            this.v1 = ((NavIntentDirections) dr3VarA.c).getArguments();
            ((NavigationBarView) this.w1.c).setSelectedItemId(p0(dr3VarA.b));
        }
        if (dr3VarA == null) {
            return;
        }
        if (dr3VarA.h(6)) {
            if (!dr3VarA.h(6)) {
                lw.g(null, null, null);
            }
            NavIntentDirections navIntentDirections = (NavIntentDirections) dr3VarA.c;
            if (navIntentDirections instanceof NavIntentDirections.WebView) {
                xf5 xf5Var = this.V0;
                xf5Var.getClass();
                zc9 zc9VarH = z67.h(((NavIntentDirections.WebView) navIntentDirections).getArguments());
                xf5Var.k(this, this, zc9VarH.a, zc9VarH.b, zc9VarH.c, zc9VarH.e, false, false, true, false);
                return;
            }
            if (!(navIntentDirections instanceof NavIntentDirections.Togo)) {
                if (navIntentDirections instanceof NavIntentDirections.RootIntentDirections) {
                    r(Integer.valueOf(navIntentDirections.getDestinationId()));
                    return;
                } else {
                    pk5.h(this, navIntentDirections);
                    return;
                }
            }
            xf5 xf5Var2 = this.V0;
            xf5Var2.getClass();
            xm8 xm8VarE = c67.e(((NavIntentDirections.Togo) navIntentDirections).getArguments());
            String str = xm8VarE.a;
            String str2 = xm8VarE.b;
            if (str2 == null) {
                str2 = "";
            }
            xf5Var2.k(this, this, str, str2, false, true, true, xm8VarE.d, xm8VarE.e, xm8VarE.f);
            return;
        }
        if (dr3VarA.h(2)) {
            if (!dr3VarA.h(2)) {
                lw.g(null, null, null);
            }
            Intent intent2 = (Intent) dr3VarA.e;
            if (intent2 != null) {
                try {
                    startActivity(intent2);
                    return;
                } catch (ActivityNotFoundException unused) {
                    return;
                }
            }
            return;
        }
        if (!dr3VarA.h(4)) {
            if (dr3VarA.h(5) && t32.b().c()) {
                t32 t32VarB = t32.b();
                if (!dr3VarA.h(5)) {
                    lw.g(null, null, null);
                }
                t32VarB.g((u86) dr3VarA.f);
                return;
            }
            return;
        }
        if (!dr3VarA.h(4)) {
            lw.g(null, null, null);
        }
        BaseNavigationFragment baseNavigationFragment = (BaseNavigationFragment) dr3VarA.d;
        try {
            wl2 wl2VarL = L();
            wl2VarL.getClass();
            p40 p40Var = new p40(wl2VarL);
            p40Var.h(0, baseNavigationFragment, baseNavigationFragment.B0(), 1);
            p40Var.e();
        } catch (Exception e) {
            lw.g(e, "Could not start Intent", "Intent: " + intent.getDataString());
        }
    }

    @Override // ir.mservices.market.activity.BaseContentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        sb7.p("MyketLaunchActivity", "onPause called", null);
        if (((SplashScreenFragment) L().G("Splash_Screen")) != null) {
            t0();
        }
    }

    @Override // ir.mservices.market.activity.BaseNavigationContentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        super.e0(s());
    }

    @Override // ir.mservices.market.activity.BaseContentActivity, ir.mservices.market.activity.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        sb7.p("MyketLaunchActivity", "onResume called", null);
        this.z0 = false;
        androidx.fragment.app.d dVarB = pk5.b(this);
        if (dVarB != null) {
            dVarB.g0();
        }
        t32.b().g(new l04());
        if (wq2.I().equalsIgnoreCase("Xiaomi")) {
            lu7 lu7Var = this.B0;
            String str = lu7.l0;
            boolean zB = lu7Var.b(str, false);
            this.P0.getClass();
            if (zB != fw4.d()) {
                this.M0.b("");
                lu7 lu7Var2 = this.B0;
                this.P0.getClass();
                lu7Var2.j(str, fw4.d());
            }
        }
    }

    @Override // ir.mservices.market.activity.BaseContentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("BUNDLE_KEY_IS_SAVED_INSTANCE", true);
        bundle.putInt("BUNDLE_KEY_TAB", ((NavigationBarView) this.w1.c).getSelectedItemId());
    }

    @Override // ir.mservices.market.activity.BaseNavigationContentActivity, ir.mservices.market.activity.BaseContentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
        m04 m04Var = this.j1;
        m04Var.getClass();
        t32.b().l(m04Var, true);
        ContextCompat.registerReceiver(this, this.A1, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"), 2);
        this.d1.a(this);
    }

    @Override // ir.mservices.market.activity.BaseNavigationContentActivity, ir.mservices.market.activity.BaseContentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        m04 m04Var = this.j1;
        m04Var.getClass();
        t32.b().o(m04Var);
        unregisterReceiver(this.A1);
        super.onStop();
    }

    public final void q0(String str, String str2) {
        if (s() instanceof AppDetailFragment) {
            this.N0.a.b("detail_exit", AppMeasurementSdk.ConditionalUserProperty.NAME, t61.j(str, " to ", str2));
        }
    }

    public final void r0() {
        if ("android.intent.action.MAIN".equalsIgnoreCase(getIntent().getAction())) {
            String strN0 = n0();
            if (!TextUtils.isEmpty(strN0)) {
                this.U0.a(new cr3(this, strN0), 5000L);
            }
        } else {
            ij5 ij5VarG0 = g0();
            int i = g0().b.g().g.a;
            ni5 ni5Var = ij5VarG0.b;
            if (ni5Var.l(i, false, false)) {
                ni5Var.b();
            }
            onNewIntent(getIntent());
        }
        this.H0.getAuthorizeData(new hh2(8, this, this.B0.f(lu7.h0, ""), false));
        if (TextUtils.isEmpty(this.D0.a()) || !this.D0.d()) {
            return;
        }
        new Handler().postDelayed(new q6(20, this), 5000L);
    }

    public final void s0(int i, String str) {
        try {
            int i2 = SingleImageFragment.P0;
            js3.p(str, "mainUrl");
            SingleImageFragment singleImageFragment = new SingleImageFragment();
            Bundle bundle = new Bundle();
            bundle.putString("BUNDLE_KEY_AVATAR_URL", str);
            bundle.putBoolean("BUNDLE_KEY_IS_CIRCLE", false);
            bundle.putInt("BUNDLE_KEY_RADIUS", i);
            singleImageFragment.u0(bundle);
            wl2 wl2VarL = L();
            wl2VarL.getClass();
            p40 p40Var = new p40(wl2VarL);
            p40Var.k(rr6.avatar_container, singleImageFragment, null);
            p40Var.e();
        } catch (Exception e) {
            lw.g(e, "cannot open image", null);
        }
    }

    public final void t0() {
        try {
            if (L().G("Splash_Screen") != null) {
                wl2 wl2VarL = L();
                wl2VarL.getClass();
                p40 p40Var = new p40(wl2VarL);
                p40Var.j(L().G("Splash_Screen"));
                p40Var.e();
            }
        } catch (Exception unused) {
        }
        ir.mservices.market.core.ext.a.i(this);
    }

    @Override // ir.mservices.market.activity.BaseContentActivity, defpackage.rn8
    public final void u(View view) {
        this.q1.removeAllViews();
        if (view != null) {
            this.q1.addView(view, new ViewGroup.LayoutParams(-1, -1));
        }
    }

    public final void u0() {
        this.R0.e(InstallConsumer$MutexState.a);
    }

    public final void v0(boolean z, BaseContentFragment baseContentFragment, Boolean bool) {
        if (this.e1 != null) {
            CollapsingToolbarLayout collapsingToolbarLayout = this.h1;
            j2 j2Var = new j2(this, baseContentFragment, 18);
            WeakHashMap weakHashMap = q69.a;
            h69.m(collapsingToolbarLayout, j2Var);
            f69.c(this.h1);
            if (!z || !baseContentFragment.c1() || !bool.booleanValue()) {
                this.e1.a = 0;
                return;
            }
            boolean zZ0 = baseContentFragment.Z0();
            this.e1.a = (zZ0 ? baseContentFragment.O0() : 4) | (baseContentFragment.b1() ? 16 : 0) | 1;
        }
    }

    public final void w0() {
        View childAt;
        View viewInflate;
        rb4 rb4Var = this.w1;
        int iC = this.y1;
        if (iC <= 0) {
            iC = this.B0.c(-1, lu7.G0);
        }
        NavigationBarView navigationBarView = (NavigationBarView) rb4Var.c;
        d04 d04Var = (d04) rb4Var.f;
        FrameLayout.LayoutParams layoutParams = null;
        if (d04Var == null) {
            js3.V("languageHelper");
            throw null;
        }
        int i = (d04Var.f() && (navigationBarView instanceof BottomNavigationView)) ? 0 : 3;
        View childAt2 = navigationBarView.getChildAt(0);
        if (childAt2 instanceof NavigationBarMenuView) {
            childAt = ((NavigationBarMenuView) childAt2).getChildAt(i);
        } else if (childAt2 instanceof NavigationRailFrameLayout) {
            View childAt3 = ((NavigationRailFrameLayout) childAt2).getChildAt(0);
            js3.n(childAt3, "null cannot be cast to non-null type android.view.ViewGroup");
            childAt = ((ViewGroup) childAt3).getChildAt(i);
        } else {
            childAt = null;
        }
        NavigationBarItemView navigationBarItemView = childAt instanceof NavigationBarItemView ? (NavigationBarItemView) childAt : null;
        if (navigationBarItemView == null) {
            lw.g(null, "NavigationMenuView must not be null in setMenuBadge!", null);
            return;
        }
        int childCount = navigationBarItemView.getChildCount();
        int i2 = 0;
        while (true) {
            if (i2 < childCount) {
                View childAt4 = navigationBarItemView.getChildAt(i2);
                if (childAt4 != null && childAt4.getId() == rr6.badge) {
                    navigationBarItemView.removeView(childAt4);
                    break;
                }
                i2++;
            } else {
                break;
            }
        }
        if (iC > 0) {
            viewInflate = getLayoutInflater().inflate(js6.badge_text, (ViewGroup) navigationBarItemView, false);
            boolean z = viewInflate instanceof MyketTextView;
            MyketTextView myketTextView = z ? (MyketTextView) viewInflate : null;
            if (myketTextView != null) {
                lw8 lw8Var = (lw8) rb4Var.e;
                if (lw8Var == null) {
                    js3.V("uiUtils");
                    throw null;
                }
                myketTextView.setText(lw8.e(lw8Var, String.valueOf(iC)));
            }
            MyketTextView myketTextView2 = z ? (MyketTextView) viewInflate : null;
            if (myketTextView2 != null) {
                myketTextView2.setTextColor(sj8.b().E);
            }
            layoutParams = new FrameLayout.LayoutParams(-2, -2);
        } else {
            viewInflate = null;
        }
        if (layoutParams == null || viewInflate == null) {
            return;
        }
        viewInflate.getBackground().setColorFilter(new PorterDuffColorFilter(sj8.b().D, PorterDuff.Mode.MULTIPLY));
        layoutParams.topMargin = navigationBarView instanceof BottomNavigationView ? rb4Var.s().getResources().getDimensionPixelSize(pq6.space_4) : rb4Var.s().getResources().getDimensionPixelSize(pq6.space_16);
        layoutParams.rightMargin = rb4Var.s().getResources().getDimensionPixelSize(pq6.bottom_nav_badge_margin);
        layoutParams.gravity = 8388661;
        navigationBarItemView.addView(viewInflate, layoutParams);
    }

    public final void x0(PendingInstall pendingInstall) {
        boolean zK = this.O0.K(pendingInstall.getPackageName());
        Bundle bundle = new Bundle();
        bundle.putInt("BUNDLE_KEY_VERSION_CODE", pendingInstall.getVersionCode());
        bundle.putString("packageName", pendingInstall.getPackageName());
        pk5.h(this, new NavIntentDirections.InstallSucceed(new qq(new DialogDataModel(m0(), "DIALOG_KEY_INSTALL_RESULT_SUCCEED", bundle), pendingInstall.getTitle(), pendingInstall.getIconPath(), zK)));
    }

    @Override // ir.mservices.market.activity.BaseNavigationContentActivity, defpackage.am2
    public final void y(yi5 yi5Var, Integer num) {
        if (num != null) {
            rb4 rb4Var = this.w1;
            ((NavigationBarView) rb4Var.c).setSelectedItemId(p0(num.intValue()));
        }
        super.y(yi5Var, num);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [c24, java.lang.Object] */
    public final void y0() {
        String strF = this.B0.f(lu7.Z, null);
        if (TextUtils.isEmpty(strF)) {
            return;
        }
        PushMessage pushMessage = (PushMessage) new vv2().c(strF, PushMessage.class);
        if (TextUtils.isEmpty(pushMessage.s()) || TextUtils.isEmpty(pushMessage.l()) || TextUtils.isEmpty(pushMessage.d())) {
            lw.g(null, "Something is wrong with pop-up notif", strF);
        } else {
            try {
                if (this.F0.a(pushMessage)) {
                    if (!TextUtils.isEmpty(pushMessage.j())) {
                        ((ir.myket.callback.manager.a) this.c1.getValue()).b(new ql0(pushMessage.j(), CallbackUrlType.h));
                    }
                    pk5.h(this, new NavIntentDirections.InAppNotification(new lk3(new DialogDataModel(m0(), "DIALOG_KEY_NO_RESULT", new Bundle()), pushMessage)));
                } else {
                    is3.A("ignore", pushMessage.m());
                }
            } catch (BadPushMessageException e) {
                lw.g(e, null, null);
            }
        }
        this.B0.i(lu7.Z, null);
    }

    @Override // ir.mservices.market.activity.BaseContentActivity, defpackage.rn8
    public final void z(View view) {
        this.i1.removeAllViews();
        this.i1.setBackgroundColor(sj8.b().N);
        if (view != null) {
            this.i1.addView(view, new ViewGroup.LayoutParams(-1, -1));
        }
    }

    public final void z0(String str, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putString("packageName", str);
        bundle.putBoolean("IS_INSTALL_SCENARIO", z);
        pk5.h(this, new NavIntentDirections.SignNotMatch(new us(new DialogDataModel(m0(), "DIALOG_KEY_INSTALL_RESULT_NOT_MATCH_SING", bundle), str)));
    }

    public void onEvent(yq yqVar) {
        String str = yqVar.a;
        String str2 = yqVar.b;
        String string = getString(rs6.free_space_error);
        if (g() instanceof AppFailedStorageDialogFragment) {
            AppFailedStorageDialogFragment appFailedStorageDialogFragment = (AppFailedStorageDialogFragment) g();
            if (appFailedStorageDialogFragment.O0().a.b.equalsIgnoreCase("DIALOG_KEY_FAILED_STORAGE")) {
                appFailedStorageDialogFragment.a1++;
                dm1 dm1Var = appFailedStorageDialogFragment.Y0;
                js3.m(dm1Var);
                DialogHeaderComponent dialogHeaderComponent = dm1Var.x;
                dialogHeaderComponent.setTitle(appFailedStorageDialogFragment.O0().b);
                dialogHeaderComponent.setSubtitle(dialogHeaderComponent.getResources().getString(rs6.storage_failed_subtitle, String.valueOf(appFailedStorageDialogFragment.a1)));
                dm1 dm1Var2 = appFailedStorageDialogFragment.Y0;
                js3.m(dm1Var2);
                dm1Var2.v.setText(appFailedStorageDialogFragment.K().getString(rs6.apps_free_space_error));
                return;
            }
            return;
        }
        DialogDataModel dialogDataModel = new DialogDataModel(m0(), "DIALOG_KEY_FAILED_STORAGE", new Bundle());
        boolean z = false;
        if (this.W0.o() != null) {
            z = true;
        }
        pk5.h(this, new NavIntentDirections.FailedStorage(new hq(dialogDataModel, str, string, str2, z)));
    }

    public void onEvent(MyketPackageInstallerService.PreapprovalMessage preapprovalMessage) {
        Intent intent;
        if (preapprovalMessage.b != -1 || preapprovalMessage.a.getExtras() == null || (intent = (Intent) dt2.p(preapprovalMessage.a.getExtras(), "android.intent.extra.INTENT", Intent.class)) == null || intent.resolveActivity(getPackageManager()) == null) {
            return;
        }
        startActivityForResult(intent, 50001);
    }

    public void onEvent(k04 k04Var) {
        this.n1.measure(0, 0);
        int width = this.n1.getWidth();
        int height = this.n1.getHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        this.n1.draw(new Canvas(bitmapCreateBitmap));
        this.o1.setImageBitmap(bitmapCreateBitmap);
        this.w1.N();
        rb4 rb4Var = this.w1;
        rb4Var.getClass();
        rb4Var.M(this, sj8.b().F);
        this.z1.B();
        t32.b().g(new qj8());
        ir.mservices.market.core.ext.a.i(this);
        ir.mservices.market.core.ext.a.h(this);
        W();
        h0();
        androidx.fragment.app.d dVarS = s();
        if (dVarS instanceof BaseContentFragment) {
            A0((BaseContentFragment) dVarS);
        }
        w0();
        int i = k04Var.a;
        int i2 = k04Var.b;
        if (i < 0 || i2 < 0) {
            return;
        }
        float fHypot = (float) Math.hypot(width, height);
        CircularRevealCoordinatorLayout circularRevealCoordinatorLayout = this.n1;
        float f = k04Var.a;
        float f2 = i2;
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(circularRevealCoordinatorLayout, bs0.a, as0.b, new ds0(f, f2, 0.0f), new ds0(f, f2, fHypot));
        Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(circularRevealCoordinatorLayout, (int) f, (int) f2, 0.0f, fHypot);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfObject, animatorCreateCircularReveal);
        animatorSet.setDuration(750L);
        animatorSet.addListener(new rj(3, this));
        animatorSet.start();
    }

    public void onEvent(bo6 bo6Var) {
        y0();
    }

    public void onEvent(os1 os1Var) {
        ViewEventBuilder viewEventBuilder = new ViewEventBuilder();
        viewEventBuilder.b("app_sign_not_matched");
        viewEventBuilder.a();
        z0(os1Var.a, false);
    }

    public void onEvent(zq zqVar) {
        androidx.fragment.app.d dVarG = g();
        if ((dVarG instanceof AlertBottomDialogFragment) && ((AlertBottomDialogFragment) dVarG).i1.a.b.equalsIgnoreCase("DIALOG_KEY_VPN")) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putSerializable("download_data_model", zqVar.a);
        pk5.h(this, new NavIntentDirections.AlertBottom(new bd(new DialogDataModel(m0(), "DIALOG_KEY_VPN", bundle), getString(rs6.vpn_on_title), getString(rs6.vpn_on_description), getString(rs6.settings), getString(rs6.not_yet_button), true)));
    }
}
