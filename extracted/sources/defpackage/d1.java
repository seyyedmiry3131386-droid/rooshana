package defpackage;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Handler;
import android.os.LocaleList;
import android.text.style.LocaleSpan;
import android.view.Window;
import io.sentry.android.core.internal.util.p;
import io.sentry.android.replay.util.d;
import io.sentry.transport.n;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class d1 {
    public static void a(Window window, p pVar, Handler handler) {
        if (pVar == null) {
            return;
        }
        window.addOnFrameMetricsAvailableListener(pVar, handler);
    }

    public static void b(Window window, p pVar) {
        if (pVar == null) {
            return;
        }
        window.removeOnFrameMetricsAvailableListener(pVar);
    }

    public static /* synthetic */ MediaCodec.CryptoInfo.Pattern c() {
        return new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    public static /* synthetic */ LocaleList d(Locale[] localeArr) {
        return new LocaleList(localeArr);
    }

    public static /* synthetic */ LocaleSpan e(LocaleList localeList) {
        return new LocaleSpan(localeList);
    }

    public static /* synthetic */ void f() {
    }

    public static void g(zi1 zi1Var) {
        if ((Build.VERSION.SDK_INT <= 23 || zi1Var != ForkJoinPool.commonPool()) && !zi1Var.a.isTerminated()) {
            zi1Var.shutdown();
            throw null;
        }
    }

    public static /* synthetic */ void h(it2 it2Var) {
        boolean zIsTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || it2Var != ForkJoinPool.commonPool()) && !(zIsTerminated = it2Var.isTerminated())) {
            it2Var.shutdown();
            boolean z = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = it2Var.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        it2Var.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void i(wx4 wx4Var) {
        boolean zIsTerminated;
        ExecutorService executorService = wx4Var.a;
        if ((Build.VERSION.SDK_INT <= 23 || wx4Var != ForkJoinPool.commonPool()) && !(zIsTerminated = executorService.isTerminated())) {
            wx4Var.shutdown();
            boolean z = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        wx4Var.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void j(zx4 zx4Var) {
        boolean zIsTerminated;
        ExecutorService executorService = zx4Var.a;
        if ((Build.VERSION.SDK_INT <= 23 || zx4Var != ForkJoinPool.commonPool()) && !(zIsTerminated = executorService.isTerminated())) {
            zx4Var.shutdown();
            boolean z = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        zx4Var.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void k(d dVar) {
        boolean zIsTerminated;
        ScheduledExecutorService scheduledExecutorService = dVar.a;
        if ((Build.VERSION.SDK_INT <= 23 || dVar != ForkJoinPool.commonPool()) && !(zIsTerminated = scheduledExecutorService.isTerminated())) {
            dVar.shutdown();
            boolean z = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = scheduledExecutorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        dVar.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static /* synthetic */ void l(n nVar) {
        boolean zIsTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || nVar != ForkJoinPool.commonPool()) && !(zIsTerminated = nVar.isTerminated())) {
            nVar.shutdown();
            boolean z = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = nVar.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        nVar.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static /* synthetic */ void m(ExecutorService executorService) {
        boolean zIsTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || executorService != ForkJoinPool.commonPool()) && !(zIsTerminated = executorService.isTerminated())) {
            executorService.shutdown();
            boolean z = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        executorService.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
