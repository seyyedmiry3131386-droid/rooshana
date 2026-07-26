package defpackage;

import android.os.SystemClock;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import androidx.core.app.FrameMetricsAggregator;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.microsoft.clarity.i.q;
import io.sentry.SentryLevel;
import io.sentry.android.core.SystemEventsBreadcrumbsIntegration;
import io.sentry.android.core.anr.AnrProfilingIntegration;
import io.sentry.android.core.b0;
import io.sentry.android.core.c0;
import io.sentry.android.core.d;
import io.sentry.android.core.h;
import io.sentry.android.core.j0;
import io.sentry.android.core.k1;
import io.sentry.android.core.l1;
import io.sentry.android.core.performance.g;
import io.sentry.android.core.s;
import io.sentry.android.core.t0;
import io.sentry.android.ndk.b;
import io.sentry.config.a;
import io.sentry.h4;
import io.sentry.internal.modules.f;
import io.sentry.metrics.c;
import io.sentry.ndk.NativeScope;
import io.sentry.u1;
import io.sentry.z4;
import ir.mservices.market.app.suggest.search.ui.SuggestListAction;
import ir.mservices.market.app.suggest.search.ui.SuggestListFragment;
import ir.mservices.market.app.suggest.search.ui.SuggestListViewModel;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kb8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kb8(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 0;
        switch (this.a) {
            case 0:
                final SuggestListFragment suggestListFragment = (SuggestListFragment) this.b;
                WebView webView = suggestListFragment.l1;
                if (webView != null) {
                    webView.evaluateJavascript("(function() { return ('<html>'+document.getElementsByTagName('html')[0].innerHTML+'</html>'); })();", new ValueCallback() { // from class: lb8
                        @Override // android.webkit.ValueCallback
                        public final void onReceiveValue(Object obj) {
                            int i2 = SuggestListFragment.o1;
                            ((SuggestListViewModel) suggestListFragment.k1.getValue()).r(new SuggestListAction.GoogleResultReceivedAction((String) obj));
                        }
                    });
                    return;
                }
                return;
            case 1:
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) this.b;
                int[] iArr = SwipeRefreshLayout.O;
                swipeRefreshLayout.l();
                return;
            case 2:
                qd8 qd8Var = ((sd8) this.b).a;
                ViewParent parent = qd8Var.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(qd8Var);
                    return;
                }
                return;
            case 3:
                ((TextInputLayout) this.b).e.requestLayout();
                return;
            case 4:
                ig9 ig9Var = (ig9) this.b;
                t0.m("FirebaseMessaging", "Service took too long to process intent: " + ig9Var.a.getAction() + " finishing.");
                ig9Var.b.d(null);
                return;
            case 5:
                o77 o77Var = (o77) this.b;
                ((qb7) ((od8) o77Var.d)).y(new f09(9, o77Var));
                return;
            case 6:
                File[] fileArrListFiles = ((File) this.b).listFiles();
                if (fileArrListFiles == null) {
                    return;
                }
                int length = fileArrListFiles.length;
                while (i < length) {
                    File file = fileArrListFiles[i];
                    if (file.lastModified() < h4.f - TimeUnit.MINUTES.toMillis(5L)) {
                        a.p(file);
                    }
                    i++;
                }
                return;
            case 7:
                z4 z4Var = (z4) this.b;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = z4Var.a;
                while (i < 40) {
                    try {
                        scheduledThreadPoolExecutor.schedule(z4Var.c, 365L, TimeUnit.DAYS).cancel(true);
                        i++;
                    } catch (RejectedExecutionException unused) {
                        return;
                    }
                }
                scheduledThreadPoolExecutor.purge();
                return;
            case 8:
                io.sentry.android.core.a aVar = (io.sentry.android.core.a) this.b;
                aVar.h = SystemClock.uptimeMillis();
                aVar.i.set(false);
                return;
            case 9:
                ((FrameMetricsAggregator) ((d) this.b).a.a()).a.A();
                return;
            case 10:
                ((h) this.b).h(true);
                return;
            case 11:
                ((s) this.b).a(null, true);
                return;
            case 12:
                b0 b0Var = (b0) this.b;
                if (b0Var != null) {
                    ProcessLifecycleOwner.i.f.f(b0Var);
                    return;
                }
                return;
            case 13:
                z21 z21Var = ((l1) this.b).g;
                while (true) {
                    k1 k1Var = (k1) z21Var.d;
                    if (k1Var == null) {
                        z21Var.e = null;
                        z21Var.a = 0;
                        z21Var.b = 0;
                        return;
                    } else {
                        z21Var.d = k1Var.c;
                        j0 j0Var = (j0) z21Var.c;
                        k1Var.c = (k1) j0Var.a;
                        j0Var.a = k1Var;
                    }
                }
                break;
            case 14:
                SystemEventsBreadcrumbsIntegration systemEventsBreadcrumbsIntegration = (SystemEventsBreadcrumbsIntegration) this.b;
                systemEventsBreadcrumbsIntegration.k(systemEventsBreadcrumbsIntegration.c);
                return;
            case 15:
                AnrProfilingIntegration anrProfilingIntegration = (AnrProfilingIntegration) this.b;
                anrProfilingIntegration.getClass();
                anrProfilingIntegration.e = SystemClock.uptimeMillis();
                return;
            case 16:
                ((f) this.b).a();
                return;
            case 17:
                g.a(((io.sentry.android.core.performance.f) this.b).b);
                return;
            case 18:
                ((b) this.b).b.getClass();
                NativeScope.nativeClearAttachments();
                return;
            case 19:
                io.sentry.android.replay.screenshot.f fVar = (io.sentry.android.replay.screenshot.f) this.b;
                if (!fVar.g.isRecycled()) {
                    synchronized (fVar.g) {
                        if (!fVar.g.isRecycled()) {
                            fVar.g.recycle();
                        }
                        break;
                    }
                }
                fVar.j.close();
                return;
            case 20:
                io.sentry.cache.f fVar2 = (io.sentry.cache.f) this.b;
                fVar2.getClass();
                try {
                    ((io.sentry.cache.tape.g) fVar2.b.a()).clear();
                    return;
                } catch (IOException e) {
                    fVar2.a.getLogger().f(SentryLevel.ERROR, "Failed to clear breadcrumbs from file queue", e);
                    return;
                }
            case 21:
                io.sentry.logger.d dVar = (io.sentry.logger.d) this.b;
                dVar.d.a(dVar.a.getShutdownTimeoutMillis());
                return;
            case 22:
                c cVar = (c) this.b;
                cVar.d.a(cVar.a.getShutdownTimeoutMillis());
                return;
            default:
                q.b((q) this.b);
                return;
        }
    }

    public /* synthetic */ kb8(io.sentry.android.core.a aVar, u1 u1Var) {
        this.a = 8;
        this.b = aVar;
    }

    public /* synthetic */ kb8(c0 c0Var, b0 b0Var) {
        this.a = 12;
        this.b = b0Var;
    }
}
