package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import androidx.databinding.DataBinderMapperImpl;
import androidx.lifecycle.Lifecycle$Event;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.snackbar.Snackbar$SnackbarLayout;
import ir.mservices.market.activity.LaunchContentActivity;
import ir.mservices.market.core.analytics.ViewEventBuilder;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.data.install.PendingInstall;
import ir.mservices.market.data.install.PreInstall;
import ir.mservices.market.service.MyketPackageInstallerService;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.version2.manager.install.InstallConsumer$MutexState;
import ir.mservices.market.version2.manager.install.a;
import ir.mservices.market.version2.manager.install.e;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class zo3 implements f64, ht5 {
    public static final Object r = new Object();
    public Thread a;
    public boolean b;
    public LaunchContentActivity c;
    public PendingInstall g;
    public y7 i;
    public dp3 j;
    public ps1 k;
    public ye5 l;
    public if1 m;
    public lu7 n;
    public a o;
    public ir.mservices.market.core.notification.a p;
    public InstallConsumer$MutexState d = InstallConsumer$MutexState.a;
    public int e = 0;
    public boolean f = false;
    public int h = -1;
    public final q6 q = new q6(19, this);

    public static void a(zo3 zo3Var, PendingInstall pendingInstall) {
        Handler handler;
        pendingInstall.getPackageName();
        g7 g7Var = new g7(zo3Var, pendingInstall, 27);
        synchronized (zk8.class) {
            handler = zk8.a;
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
                zk8.a = handler;
            }
        }
        lw.f(null, null, handler.postDelayed(g7Var, 3000L));
    }

    @jt5(Lifecycle$Event.ON_DESTROY)
    private void onDestroy() {
        lw.d(null, null, this.a);
        this.c.a.f(this);
        this.i.b();
        this.a.interrupt();
        this.c = null;
        this.h = -1;
        this.g = null;
    }

    public final void b() {
        LaunchContentActivity launchContentActivity = this.c;
        if (launchContentActivity != null) {
            String strValueOf = String.valueOf(this.o.g.size());
            xz7 xz7VarI = xz7.i(launchContentActivity.n1);
            launchContentActivity.s1 = xz7VarI;
            xz7VarI.k = 8000;
            Snackbar$SnackbarLayout snackbar$SnackbarLayout = (Snackbar$SnackbarLayout) xz7VarI.i;
            snackbar$SnackbarLayout.setClickable(false);
            snackbar$SnackbarLayout.setFocusable(false);
            snackbar$SnackbarLayout.setFocusableInTouchMode(false);
            snackbar$SnackbarLayout.removeAllViews();
            snackbar$SnackbarLayout.setBackground(null);
            snackbar$SnackbarLayout.setOnTouchListener(new q90(2));
            LayoutInflater layoutInflater = launchContentActivity.getLayoutInflater();
            int i = lp3.A;
            DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
            lp3 lp3Var = (lp3) fa1.c(layoutInflater, js6.install_snackbar, null, false);
            lp3Var.v.setOnClickListener(new r5(5, launchContentActivity));
            MyketTextView myketTextView = lp3Var.w;
            int i2 = rs6.cancel_installation_process;
            lw8 lw8Var = launchContentActivity.a1;
            lw8Var.getClass();
            myketTextView.setText(launchContentActivity.getString(i2, lw8.e(lw8Var, strValueOf)));
            snackbar$SnackbarLayout.setPadding(0, 0, 0, ((NavigationBarView) launchContentActivity.w1.c).getVisibility() == 0 ? launchContentActivity.getResources().getDimensionPixelSize(pq6.bottom_navigation_height) : 0);
            snackbar$SnackbarLayout.addView(lp3Var.l, 0);
            xz7 xz7Var = launchContentActivity.s1;
            xz7Var.l = true;
            xz7Var.j();
        } else {
            this.f = true;
        }
        this.o.b();
        this.e = 0;
        e(InstallConsumer$MutexState.a);
    }

    public final String c(PendingInstall pendingInstall) {
        return "PackageName: " + pendingInstall.getPackageName() + ", pendingVersionCode: " + pendingInstall.getVersionCode() + ", installedVersionCode: " + this.j.p(pendingInstall.getPackageName());
    }

    public final void d(PendingInstall pendingInstall) {
        Object objCast;
        boolean zB = this.n.b(lu7.v0, true);
        if (pendingInstall.getPreInstall() != PreInstall.Default && dp3.L(this.c) && zB) {
            t32 t32VarB = t32.b();
            synchronized (t32VarB.c) {
                objCast = MyketPackageInstallerService.Message.class.cast(t32VarB.c.get(MyketPackageInstallerService.Message.class));
            }
            MyketPackageInstallerService.Message message = (MyketPackageInstallerService.Message) objCast;
            if (message != null) {
                t32.b().m(message);
            }
            ((e) this.l).e(pendingInstall);
            return;
        }
        if1 if1Var = this.m;
        if1Var.getClass();
        sb7.p("Installer", "DefaultInstaller - startInstallIntent", "packageName=" + pendingInstall.getPackageName() + "installQueue size=" + if1Var.b.g.size());
        if1Var.e = pendingInstall;
        if1Var.b.g(pendingInstall);
        Intent intentG = if1Var.a.g(pendingInstall.getFilePath());
        if (intentG.resolveActivity(if1Var.d.getPackageManager()) != null) {
            if1Var.d.startActivityForResult(intentG, 10000);
        } else {
            if1Var.a(4);
        }
    }

    public final void e(InstallConsumer$MutexState installConsumer$MutexState) {
        if (this.d == installConsumer$MutexState) {
            return;
        }
        if (installConsumer$MutexState == InstallConsumer$MutexState.a) {
            h();
        } else {
            this.d = installConsumer$MutexState;
        }
    }

    public final void f(int i, PendingInstall pendingInstall) {
        ir.mservices.market.core.notification.a aVar = this.p;
        switch (i) {
            case 1:
            case 3:
                aVar.a.cancel(12);
                if (pendingInstall != null) {
                    String packageName = pendingInstall.getPackageName();
                    if (aVar.j.G(packageName)) {
                        aVar.e(packageName, pendingInstall.getTitle());
                    }
                }
                break;
            case 2:
            default:
                aVar.getClass();
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                aVar.a.cancel(12);
                aVar.a.cancel(11);
                break;
        }
        sb7.p("Installer", "Consumer - onInstallationResult", "pendingInstall=" + pendingInstall + ", installResult =" + i);
        InstallConsumer$MutexState installConsumer$MutexState = InstallConsumer$MutexState.a;
        switch (i) {
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
                this.e = 0;
                break;
            case 3:
                e(installConsumer$MutexState);
                return;
            case 8:
                dw1.y("install_dialog_cancel");
                if (this.o.g.size() >= 1) {
                    int i2 = this.e + 1;
                    this.e = i2;
                    if (i2 == 3) {
                        ViewEventBuilder viewEventBuilder = new ViewEventBuilder();
                        viewEventBuilder.b("install_snack_bar");
                        viewEventBuilder.a();
                        b();
                        return;
                    }
                } else {
                    this.e = 0;
                }
                e(installConsumer$MutexState);
                return;
        }
        if (this.c == null || pendingInstall == null) {
            lw.g(null, "InstallConsumer onInstallationResult() can not send install result", null);
            e(installConsumer$MutexState);
        } else {
            if (!this.b) {
                j(i, pendingInstall);
                return;
            }
            this.g = pendingInstall;
            this.h = i;
            this.d = InstallConsumer$MutexState.d;
        }
    }

    public final void h() {
        Object obj = r;
        synchronized (obj) {
            this.d = InstallConsumer$MutexState.a;
            obj.notify();
        }
    }

    public final void i(PendingInstall pendingInstall) {
        if (!TextUtils.isEmpty(pendingInstall.getPackageName())) {
            this.o.h(dp3.w(pendingInstall.getPackageName()));
            this.o.h(dp3.y(pendingInstall.getPackageName()));
        }
        if (this.d == InstallConsumer$MutexState.b) {
            h();
        }
    }

    public final void j(int i, PendingInstall pendingInstall) {
        Handler handler;
        LaunchContentActivity launchContentActivity = this.c;
        launchContentActivity.getClass();
        sb7.p("MyketLaunchActivity", "installResult=" + i, null);
        if (i == 1) {
            launchContentActivity.x0(pendingInstall);
        } else if (i != 2) {
            if (i == 4) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("BUNDLE_KEY_INSTALL_DATA", pendingInstall);
                pk5.h(launchContentActivity, new NavIntentDirections.InstallRetry(new pq(new DialogDataModel(launchContentActivity.m0(), "DIALOG_KEY_INSTALL_RESULT_RETRY", bundle), pendingInstall.getTitle(), pendingInstall.getIconPath())));
            } else if (i != 5) {
                if (i == 6) {
                    pk5.h(launchContentActivity, new NavIntentDirections.FailedStorage(new hq(new DialogDataModel(launchContentActivity.m0(), "DIALOG_KEY_FAILED_STORAGE", new Bundle()), pendingInstall.getTitle(), launchContentActivity.getString(rs6.install_dialog_status_failure_storage), pendingInstall.getIconPath(), launchContentActivity.W0.o() != null)));
                } else if (i != 7) {
                    if (i == 9) {
                        if (TextUtils.isEmpty(pendingInstall.getPostInstallIntent())) {
                            launchContentActivity.x0(pendingInstall);
                        } else {
                            g6 g6Var = new g6(launchContentActivity, pendingInstall, 18);
                            synchronized (zk8.class) {
                                handler = zk8.a;
                                if (handler == null) {
                                    handler = new Handler(Looper.getMainLooper());
                                    zk8.a = handler;
                                }
                            }
                            lw.f(null, null, handler.postDelayed(g6Var, 500L));
                        }
                    }
                }
                pk5.h(launchContentActivity, new NavIntentDirections.InstallUnSucceed(new sq(new DialogDataModel(launchContentActivity.m0(), "DIALOG_KEY_INSTALL_RESULT_NOT_SUCCEED", new Bundle()), pendingInstall.getTitle(), pendingInstall.getIconPath(), i)));
            } else {
                launchContentActivity.z0(pendingInstall.getPackageName(), true);
            }
        } else if (dp3.M(pendingInstall.getPackageName())) {
            launchContentActivity.R0.e(InstallConsumer$MutexState.c);
        } else {
            launchContentActivity.u0();
        }
        this.h = -1;
        this.g = null;
    }

    @jt5(Lifecycle$Event.ON_PAUSE)
    public void onPause() {
        this.b = true;
    }

    @jt5(Lifecycle$Event.ON_RESUME)
    public void onResume() {
        int i;
        this.b = false;
        int iOrdinal = this.d.ordinal();
        if (iOrdinal == 2) {
            h();
            return;
        }
        if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                return;
            }
            lw.g(null, null, null);
        } else {
            PendingInstall pendingInstall = this.g;
            if (pendingInstall == null || (i = this.h) == -1) {
                return;
            }
            j(i, pendingInstall);
        }
    }
}
