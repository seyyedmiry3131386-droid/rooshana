package defpackage;

import android.app.Activity;
import android.view.Choreographer;
import android.view.View;
import com.microsoft.clarity.i.q;
import com.microsoft.clarity.k.l;
import io.sentry.SentryLevel;
import io.sentry.android.core.ActivityLifecycleIntegration;
import io.sentry.android.core.AnrIntegration;
import io.sentry.android.core.FeedbackShakeIntegration;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.anr.AnrProfilingIntegration;
import io.sentry.android.core.anr.d;
import io.sentry.android.core.c0;
import io.sentry.android.core.internal.util.s;
import io.sentry.android.core.p1;
import io.sentry.android.ndk.b;
import io.sentry.android.replay.capture.e;
import io.sentry.android.replay.n;
import io.sentry.b4;
import io.sentry.b6;
import io.sentry.cache.tape.g;
import io.sentry.config.a;
import io.sentry.f;
import io.sentry.g1;
import io.sentry.k1;
import io.sentry.k6;
import io.sentry.ndk.NativeScope;
import io.sentry.protocol.g0;
import io.sentry.protocol.v;
import io.sentry.r;
import io.sentry.u0;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.IOException;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r59 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r59(ActivityLifecycleIntegration activityLifecycleIntegration, k1 k1Var, k1 k1Var2) {
        this.a = 4;
        this.b = k1Var;
        this.c = k1Var2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String strB = null;
        switch (this.a) {
            case 0:
                n00 n00Var = (n00) this.b;
                Exception exc = (Exception) this.c;
                b62 b62Var = n00Var.c;
                String str = j29.a;
                hd1 hd1Var = b62Var.a.s;
                be beVarA0 = hd1Var.a0();
                hd1Var.b0(beVarA0, 1030, new l31(beVarA0, exc, 11));
                return;
            case 1:
                n00 n00Var2 = (n00) this.b;
                String str2 = (String) this.c;
                b62 b62Var2 = n00Var2.c;
                String str3 = j29.a;
                hd1 hd1Var2 = b62Var2.a.s;
                be beVarA02 = hd1Var2.a0();
                hd1Var2.b0(beVarA02, 1019, new sc1(beVarA02, str2, 2));
                return;
            case 2:
                w99 w99Var = (w99) this.b;
                View[] viewArr = (View[]) this.c;
                if (w99Var.p != -1) {
                    for (View view : viewArr) {
                        view.setTag(w99Var.p, Long.valueOf(System.nanoTime()));
                    }
                }
                if (w99Var.q != -1) {
                    for (View view2 : viewArr) {
                        view2.setTag(w99Var.q, null);
                    }
                    return;
                }
                return;
            case 3:
                ((g1) this.c).a(((b4) this.b).m().getShutdownTimeoutMillis());
                return;
            case 4:
                ActivityLifecycleIntegration.d((k1) this.b, (k1) this.c);
                return;
            case 5:
                AnrIntegration anrIntegration = (AnrIntegration) this.b;
                SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.c;
                r rVarA = anrIntegration.c.a();
                try {
                    if (!anrIntegration.b) {
                        anrIntegration.b(sentryAndroidOptions);
                        break;
                    }
                    rVarA.close();
                    return;
                } finally {
                }
            case 6:
                ((c0) this.b).d((u0) this.c);
                return;
            case 7:
                FeedbackShakeIntegration feedbackShakeIntegration = (FeedbackShakeIntegration) this.b;
                Activity activity2 = (Activity) this.c;
                if (feedbackShakeIntegration.e || activity2.isFinishing() || activity2.isDestroyed()) {
                    return;
                }
                try {
                    feedbackShakeIntegration.e = true;
                    Runnable runnable = feedbackShakeIntegration.c.getFeedbackOptions().h;
                    feedbackShakeIntegration.f = runnable;
                    feedbackShakeIntegration.c.getFeedbackOptions().h = new r59(feedbackShakeIntegration, runnable, 8);
                    new p1(activity2).show();
                    return;
                } catch (Throwable th) {
                    feedbackShakeIntegration.e = false;
                    feedbackShakeIntegration.c.getFeedbackOptions().h = feedbackShakeIntegration.f;
                    feedbackShakeIntegration.f = null;
                    feedbackShakeIntegration.c.getLogger().f(SentryLevel.ERROR, "Failed to show feedback dialog on shake.", th);
                    return;
                }
            case 8:
                FeedbackShakeIntegration feedbackShakeIntegration2 = (FeedbackShakeIntegration) this.b;
                Runnable runnable2 = (Runnable) this.c;
                feedbackShakeIntegration2.e = false;
                feedbackShakeIntegration2.c.getFeedbackOptions().h = runnable2;
                if (runnable2 != null) {
                    runnable2.run();
                }
                feedbackShakeIntegration2.f = null;
                return;
            case 9:
                p1 p1Var = (p1) this.b;
                Activity activity3 = (Activity) this.c;
                p1Var.getClass();
                if (activity3.isFinishing() || activity3.isDestroyed()) {
                    return;
                }
                p1Var.show();
                return;
            case 10:
                AnrProfilingIntegration anrProfilingIntegration = (AnrProfilingIntegration) this.b;
                d dVar = (d) this.c;
                anrProfilingIntegration.getClass();
                if (dVar == null) {
                    return;
                }
                try {
                    dVar.close();
                    return;
                } catch (IOException unused) {
                    anrProfilingIntegration.i.i(SentryLevel.WARNING, "Failed to close AnrProfileManager", new Object[0]);
                    return;
                }
            case 11:
                s sVar = (s) this.b;
                u0 u0Var = (u0) this.c;
                sVar.getClass();
                try {
                    sVar.j = Choreographer.getInstance();
                    return;
                } catch (Throwable th2) {
                    u0Var.f(SentryLevel.ERROR, "Error retrieving Choreographer instance. Slow and frozen frames will not be reported.", th2);
                    return;
                }
            case 12:
                b bVar = (b) this.b;
                f fVar = (f) this.c;
                b6 b6Var = bVar.a;
                SentryLevel sentryLevel = fVar.i;
                String lowerCase = sentryLevel != null ? sentryLevel.name().toLowerCase(Locale.ROOT) : null;
                String strH = a.H(fVar.b());
                try {
                    ConcurrentHashMap concurrentHashMap = fVar.f;
                    if (!concurrentHashMap.isEmpty()) {
                        strB = b6Var.getSerializer().b(concurrentHashMap);
                    }
                    break;
                } catch (Throwable th3) {
                    b6Var.getLogger().e(SentryLevel.ERROR, th3, "Breadcrumb data is not serializable.", new Object[0]);
                }
                String str4 = strB;
                NativeScope nativeScope = bVar.b;
                String str5 = fVar.d;
                String str6 = fVar.g;
                String str7 = fVar.e;
                nativeScope.getClass();
                NativeScope.nativeAddBreadcrumb(lowerCase, str5, str6, str7, strH, str4);
                return;
            case 13:
                b bVar2 = (b) this.b;
                g0 g0Var = (g0) this.c;
                NativeScope nativeScope2 = bVar2.b;
                if (g0Var == null) {
                    nativeScope2.getClass();
                    NativeScope.nativeRemoveUser();
                    return;
                }
                String str8 = g0Var.b;
                String str9 = g0Var.a;
                String str10 = g0Var.d;
                String str11 = g0Var.c;
                nativeScope2.getClass();
                NativeScope.nativeSetUser(str8, str9, str10, str11);
                return;
            case 14:
                b bVar3 = (b) this.b;
                k6 k6Var = (k6) this.c;
                NativeScope nativeScope3 = bVar3.b;
                String string = k6Var.a.toString();
                String string2 = k6Var.b.toString();
                nativeScope3.getClass();
                NativeScope.nativeSetTrace(string, string2);
                return;
            case 15:
                File file = (File) this.b;
                e eVar = (e) this.c;
                a.p(file);
                eVar.l(-1);
                return;
            case 16:
                n nVar = (n) this.b;
                b6 b6Var2 = (b6) this.c;
                try {
                    nVar.run();
                    return;
                } catch (Throwable th4) {
                    b6Var2.getLogger().f(SentryLevel.ERROR, "Failed to execute task ReplayIntegration.finalize_previous_replay", th4);
                    return;
                }
            case 17:
                Runnable runnable3 = (Runnable) this.b;
                io.sentry.android.replay.util.d dVar2 = (io.sentry.android.replay.util.d) this.c;
                try {
                    runnable3.run();
                    return;
                } catch (Throwable th5) {
                    u0 logger = dVar2.b.getLogger();
                    SentryLevel sentryLevel2 = SentryLevel.ERROR;
                    StringBuilder sb = new StringBuilder("Failed to execute task ");
                    sb.append(runnable3 instanceof io.sentry.android.replay.util.e ? ((io.sentry.android.replay.util.e) runnable3).a : "");
                    logger.f(sentryLevel2, sb.toString(), th5);
                    return;
                }
            case 18:
                io.sentry.cache.f fVar2 = (io.sentry.cache.f) this.b;
                g0 g0Var2 = (g0) this.c;
                if (g0Var2 == null) {
                    fVar2.a("user.json");
                    return;
                } else {
                    fVar2.d(g0Var2, "user.json");
                    return;
                }
            case 19:
                io.sentry.cache.f fVar3 = (io.sentry.cache.f) this.b;
                f fVar4 = (f) this.c;
                fVar3.getClass();
                try {
                    ((g) fVar3.b.a()).d(fVar4);
                    return;
                } catch (IOException e) {
                    fVar3.a.getLogger().f(SentryLevel.ERROR, "Failed to add breadcrumb to file queue", e);
                    return;
                }
            case 20:
                ((io.sentry.cache.f) this.b).d((io.sentry.protocol.e) this.c, "contexts.json");
                return;
            case 21:
                ((io.sentry.cache.f) this.b).d((v) this.c, "replay.json");
                return;
            case 22:
                io.sentry.cache.f fVar5 = (io.sentry.cache.f) this.b;
                String str12 = (String) this.c;
                if (str12 == null) {
                    fVar5.a("transaction.json");
                    return;
                } else {
                    fVar5.d(str12, "transaction.json");
                    return;
                }
            case 23:
                io.sentry.cache.f fVar6 = (io.sentry.cache.f) this.b;
                Runnable runnable4 = (Runnable) this.c;
                fVar6.getClass();
                try {
                    runnable4.run();
                    return;
                } catch (Throwable th6) {
                    fVar6.a.getLogger().f(SentryLevel.ERROR, "Serialization task failed", th6);
                    return;
                }
            case 24:
                l.a((l) this.b, (Activity) this.c);
                return;
            case 25:
                q.a((q) this.b, (Activity) this.c);
                return;
            default:
                q.a((q) this.b, (dp2) this.c);
                return;
        }
    }

    public /* synthetic */ r59(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
