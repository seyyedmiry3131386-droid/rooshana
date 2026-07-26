package defpackage;

import android.app.Application;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.os.StrictMode;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.ScrollingTabContainerView;
import androidx.appcompat.widget.b;
import androidx.loader.content.ModernAsyncTask$Status;
import androidx.media3.session.legacy.MediaBrowserServiceCompat;
import androidx.media3.session.legacy.MediaSessionCompat$Token;
import com.google.android.gms.common.ConnectionResult;
import com.google.common.util.concurrent.a;
import io.sentry.android.core.t0;
import ir.mservices.market.activity.LaunchContentActivity;
import ir.mservices.market.data.install.PendingInstall;
import ir.mservices.market.download.common.data.AppDownloadInfo;
import ir.mservices.market.search.SearchFragment;
import ir.mservices.market.search.history.ui.SearchHistoryRecyclerListFragment;
import ir.mservices.market.search.history.ui.SearchViewModel;
import ir.mservices.market.version2.activity.WebViewActivity;
import ir.mservices.market.version2.fragments.content.CropContentFragment;
import ir.mservices.market.version2.fragments.dialog.ProgressDialogFragment;
import ir.mservices.market.version2.manager.install.InstallConsumer$MutexState;
import ir.mservices.market.version2.ui.crop.CropImageView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes.dex */
public final class g6 implements Runnable {
    public final /* synthetic */ int a;
    public Object b;
    public final Object c;

    public /* synthetic */ g6(int i, Object obj, Object obj2, boolean z) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    private final void a() {
        boolean z;
        dx dxVar = (dx) this.c;
        Object obj = this.b;
        if (dxVar.c.get()) {
            fj9 fj9Var = dxVar.e;
            if (fj9Var.h == dxVar) {
                SystemClock.uptimeMillis();
                fj9Var.h = null;
                fj9Var.b();
            }
        } else {
            fj9 fj9Var2 = dxVar.e;
            if (fj9Var2.g != dxVar) {
                if (fj9Var2.h == dxVar) {
                    SystemClock.uptimeMillis();
                    fj9Var2.h = null;
                    fj9Var2.b();
                }
            } else if (!fj9Var2.c) {
                SystemClock.uptimeMillis();
                fj9Var2.g = null;
                ta4 ta4Var = fj9Var2.a;
                if (ta4Var != null) {
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        ta4Var.h(obj);
                    } else {
                        synchronized (ta4Var.a) {
                            z = ta4Var.f == bb5.k;
                            ta4Var.f = obj;
                        }
                        if (z) {
                            yu.h().i(ta4Var.j);
                        }
                    }
                }
            }
        }
        dxVar.b = ModernAsyncTask$Status.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        mt4 mt4Var;
        kx kxVar;
        bf3 bf3Var;
        Throwable th = null;
        int i = 0;
        switch (this.a) {
            case 0:
                e6 e6Var = (e6) this.b;
                b bVar = (b) this.c;
                ot4 ot4Var = bVar.c;
                if (ot4Var != null && (mt4Var = ot4Var.e) != null) {
                    mt4Var.o(ot4Var);
                }
                View view = (View) bVar.h;
                if (view != null && view.getWindowToken() != null) {
                    if (e6Var.b()) {
                        bVar.t = e6Var;
                    } else if (e6Var.e != null) {
                        e6Var.d(0, 0, false, false);
                        bVar.t = e6Var;
                    }
                }
                bVar.v = null;
                return;
            case 1:
                ((n7) this.b).a = this.c;
                return;
            case 2:
                ((Application) this.b).unregisterActivityLifecycleCallbacks((n7) this.c);
                return;
            case 3:
                Object obj = this.c;
                Object obj2 = this.b;
                try {
                    Method method = o7.d;
                    if (method != null) {
                        method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        o7.e.invoke(obj2, obj, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e) {
                    if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                        throw e;
                    }
                    return;
                } catch (Throwable th2) {
                    t0.e("ActivityRecreator", "Exception while invoking performStopActivity", th2);
                    return;
                }
            case 4:
                aw0 aw0Var = (aw0) ((AtomicReference) this.b).get();
                if (aw0Var != null) {
                    Iterator it = ((cx) this.c).k.iterator();
                    while (it.hasNext()) {
                        ((dp2) it.next()).invoke(aw0Var);
                    }
                    return;
                }
                return;
            case 5:
                p46 p46VarX = ((nc2) this.b).x();
                if (p46VarX == null) {
                    throw new IllegalStateException("No pending post available");
                }
                ((t32) this.c).d(p46VarX);
                return;
            case 6:
                kxVar = (kx) this.c;
                try {
                    ((Runnable) this.b).run();
                    return;
                } finally {
                }
            case 7:
                kxVar = (kx) this.c;
                try {
                    ((Runnable) this.b).run();
                    return;
                } finally {
                }
            case 8:
                try {
                    ((mk0) this.c).b.put((x47) this.b);
                    return;
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            case 9:
                ck4 ck4Var = (ck4) this.b;
                Typeface typeface = (Typeface) this.c;
                z67 z67Var = (z67) ck4Var.b;
                if (z67Var != null) {
                    z67Var.k(typeface);
                    return;
                }
                return;
            case 10:
                zc7 zc7Var = ((CropImageView) this.c).A;
                if (zc7Var != null) {
                    Uri uri = (Uri) this.b;
                    CropContentFragment cropContentFragment = (CropContentFragment) ((ca7) zc7Var).b;
                    int i2 = CropContentFragment.c1;
                    if (cropContentFragment.J0.g() instanceof ProgressDialogFragment) {
                        cropContentFragment.J0.q();
                    }
                    pk5.a(cropContentFragment.J0);
                    t32.b().j(new s71(uri, true, cropContentFragment.b1.c));
                    return;
                }
                return;
            case 11:
                q6 q6Var = (q6) this.c;
                CropImageView cropImageView = (CropImageView) q6Var.b;
                cropImageView.g = cropImageView.F;
                cropImageView.setImageBitmap((Bitmap) this.b);
                z94 z94Var = ((CropImageView) q6Var.b).y;
                if (z94Var != null) {
                    ((CropContentFragment) ((r79) z94Var).b).a1.setVisibility(8);
                }
                ((CropImageView) q6Var.b).S = false;
                return;
            case 12:
                ps1 ps1Var = (ps1) this.c;
                ArrayList arrayList = (ArrayList) this.b;
                ps1Var.getClass();
                if (arrayList.isEmpty()) {
                    return;
                }
                bs1 bs1Var = (bs1) arrayList.get(0);
                arrayList.remove(0);
                AppDownloadInfo appDownloadInfoE = ps1Var.e(bs1Var);
                if (appDownloadInfoE != null) {
                    appDownloadInfoE.pauseDownload(ps1Var.b);
                }
                g6 g6Var = ps1Var.a;
                js3.p(g6Var, "callback");
                lw.f(null, null, o27.f().postDelayed(g6Var, 50L));
                return;
            case 13:
                cx2 cx2VarA = cx2.a();
                cx2VarA.getClass();
                i29.a();
                cx2VarA.d.set(true);
                ((ed2) this.c).b.b = true;
                ((ed2) this.c).a.getViewTreeObserver().removeOnDrawListener((ed2) this.b);
                ((ed2) this.c).b.a.clear();
                return;
            case 14:
                dq2 dq2Var = (dq2) this.c;
                Future future = (Future) this.b;
                if (future instanceof xr3) {
                    com.google.common.util.concurrent.b bVar2 = (com.google.common.util.concurrent.b) ((xr3) future);
                    if (bVar2 instanceof h0) {
                        Object obj3 = bVar2.a;
                        if (obj3 instanceof a) {
                            th = ((a) obj3).a;
                        }
                    } else {
                        bVar2.getClass();
                    }
                    if (th != null) {
                        dq2Var.onFailure(th);
                        return;
                    }
                }
                try {
                    dq2Var.onSuccess(ja1.t(future));
                    return;
                } catch (ExecutionException e2) {
                    dq2Var.onFailure(e2.getCause());
                    return;
                } catch (Throwable th3) {
                    dq2Var.onFailure(th3);
                    return;
                }
            case 15:
                ht2 ht2Var = (ht2) this.c;
                if (ht2Var.d) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    ((Runnable) this.b).run();
                    return;
                } catch (Throwable th4) {
                    ht2Var.c.getClass();
                    if (Log.isLoggable("GlideExecutor", 6)) {
                        t0.e("GlideExecutor", "Request threw uncaught throwable", th4);
                        return;
                    }
                    return;
                }
            case 16:
                ((om0) this.b).E((kotlinx.coroutines.android.a) this.c);
                return;
            case 17:
                ok4.I((g51) this.b).resumeWith(kotlin.b.a((Throwable) this.c));
                return;
            case 18:
                InstallConsumer$MutexState installConsumer$MutexState = InstallConsumer$MutexState.c;
                LaunchContentActivity launchContentActivity = (LaunchContentActivity) this.c;
                PendingInstall pendingInstall = (PendingInstall) this.b;
                launchContentActivity.O0.e(pendingInstall.getVersionCode(), pendingInstall.getPackageName());
                if (js8.t(8, launchContentActivity, pendingInstall.getPostInstallIntent(), pendingInstall.getPostInstallPackageName())) {
                    launchContentActivity.R0.e(installConsumer$MutexState);
                    return;
                } else if (dp3.M(pendingInstall.getPackageName())) {
                    launchContentActivity.R0.e(installConsumer$MutexState);
                    return;
                } else {
                    launchContentActivity.u0();
                    return;
                }
            case 19:
                break;
            case 20:
                t0 t0Var = (t0) this.c;
                try {
                    t0Var.o(t0Var, (Object[]) this.b);
                    return;
                } catch (Exception e3) {
                    t0Var.e = e3;
                    if (t0Var.b != 2) {
                        t0Var.D(null);
                        return;
                    }
                    return;
                }
            case 21:
                rb4 rb4Var = (rb4) this.c;
                MediaSessionCompat$Token mediaSessionCompat$Token = (MediaSessionCompat$Token) this.b;
                ArrayList arrayList2 = (ArrayList) rb4Var.e;
                if (!arrayList2.isEmpty()) {
                    yf3 yf3VarA = mediaSessionCompat$Token.a();
                    if (yf3VarA != null) {
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            ((Bundle) it2.next()).putBinder("extra_session_binder", yf3VarA.asBinder());
                        }
                    }
                    arrayList2.clear();
                }
                wl4 wl4Var = (wl4) rb4Var.b;
                wl4Var.getClass();
                wl4Var.setSessionToken(mediaSessionCompat$Token.b);
                return;
            case 22:
                IBinder binder = ((Messenger) ((ql4) this.b).b).getBinder();
                tl4 tl4Var = (tl4) ((MediaBrowserServiceCompat) ((ca7) this.c).b).e.remove(binder);
                if (tl4Var != null) {
                    binder.unlinkToDeath(tl4Var, 0);
                    return;
                }
                return;
            case 23:
                a();
                return;
            case 24:
                ((di2) this.b).accept(this.c);
                return;
            case 25:
                ((om0) this.c).E((v42) this.b);
                return;
            case 26:
                View view2 = (View) this.b;
                int left = view2.getLeft();
                ScrollingTabContainerView scrollingTabContainerView = (ScrollingTabContainerView) this.c;
                scrollingTabContainerView.smoothScrollTo(left - ((scrollingTabContainerView.getWidth() - view2.getWidth()) / 2), 0);
                scrollingTabContainerView.a = null;
                return;
            case 27:
                SearchFragment searchFragment = (SearchFragment) this.c;
                String str = (String) this.b;
                int i3 = SearchFragment.b1;
                t32.b().g(new bi7());
                g64 g64VarS = searchFragment.s();
                ei7 ei7Var = g64VarS instanceof ei7 ? (ei7) g64VarS : null;
                if (ei7Var != null) {
                    SearchHistoryRecyclerListFragment searchHistoryRecyclerListFragment = (SearchHistoryRecyclerListFragment) ei7Var;
                    searchHistoryRecyclerListFragment.X0(str);
                    searchHistoryRecyclerListFragment.J0().getRecycledViewPool().a();
                    SearchViewModel searchViewModelU0 = searchHistoryRecyclerListFragment.U0();
                    String str2 = searchViewModelU0.F;
                    if (str2 == null || str2.length() == 0) {
                        l lVar = searchViewModelU0.d;
                        bz6 bz6Var = new bz6();
                        lVar.getClass();
                        lVar.p(null, bz6Var);
                        searchViewModelU0.k = false;
                    }
                    xt3 xt3Var = searchViewModelU0.H;
                    if (xt3Var != null) {
                        xt3Var.g(null);
                    }
                    searchViewModelU0.H = null;
                    searchHistoryRecyclerListFragment.U0().F();
                    searchHistoryRecyclerListFragment.d1 = searchFragment.S0;
                    return;
                }
                return;
            case 28:
                WebViewActivity webViewActivity = ((uc9) this.c).a;
                webViewActivity.u0(1);
                webViewActivity.s0((String) this.b);
                return;
            default:
                ConnectionResult connectionResult = (ConnectionResult) this.b;
                gg1 gg1Var = (gg1) this.c;
                ku2 ku2Var = (ku2) gg1Var.f;
                sl slVar = (sl) gg1Var.b;
                wh9 wh9Var = (wh9) ku2Var.j.get((cm) gg1Var.c);
                if (wh9Var == null) {
                    return;
                }
                if (connectionResult.b != 0) {
                    wh9Var.l(connectionResult, null);
                    return;
                }
                gg1Var.a = true;
                if (slVar.requiresSignIn()) {
                    if (!gg1Var.a || (bf3Var = (bf3) gg1Var.d) == null) {
                        return;
                    }
                    ((d70) slVar).getRemoteService(bf3Var, (Set) gg1Var.e);
                    return;
                }
                try {
                    au2 au2Var = (au2) slVar;
                    ((d70) slVar).getRemoteService(null, au2Var.requiresSignIn() ? au2Var.a : Collections.EMPTY_SET);
                    return;
                } catch (SecurityException e4) {
                    t0.e("GoogleApiManager", "Failed to get service from broker. ", e4);
                    ((d70) slVar).disconnect("Failed to get service from broker.");
                    wh9Var.l(new ConnectionResult(10, null, null), null);
                    return;
                }
        }
        while (true) {
            try {
                ((Runnable) this.b).run();
            } catch (Throwable th5) {
                is3.w(EmptyCoroutineContext.a, th5);
            }
            Runnable runnableH0 = ((t64) this.c).H0();
            if (runnableH0 == null) {
                return;
            }
            try {
                this.b = runnableH0;
                i++;
                if (i >= 16) {
                    t64 t64Var = (t64) this.c;
                    if (dy3.M(t64Var.d, t64Var)) {
                        t64 t64Var2 = (t64) this.c;
                        dy3.L(t64Var2.d, t64Var2, this);
                        return;
                    }
                }
            } catch (Throwable th6) {
                t64 t64Var3 = (t64) this.c;
                synchronized (t64Var3.g) {
                    t64.h.decrementAndGet(t64Var3);
                    throw th6;
                }
            }
        }
    }

    public String toString() {
        switch (this.a) {
            case 14:
                pa2 pa2VarF = gu9.F(this);
                dq2 dq2Var = (dq2) this.c;
                pa2 pa2Var = new pa2(17, false);
                ((pa2) pa2VarF.d).d = pa2Var;
                pa2VarF.d = pa2Var;
                pa2Var.c = dq2Var;
                return pa2VarF.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ g6(Object obj, Object obj2, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public g6(t32 t32Var) {
        this.a = 5;
        this.c = t32Var;
        this.b = new nc2(27);
    }

    public g6(SearchFragment searchFragment) {
        this.a = 27;
        this.c = searchFragment;
        this.b = "";
    }

    public g6(cx cxVar) {
        this.a = 4;
        this.c = cxVar;
        this.b = new AtomicReference(null);
    }
}
