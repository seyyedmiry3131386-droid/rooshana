package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import io.sentry.SentryLevel;
import io.sentry.a1;
import io.sentry.android.core.FeedbackShakeIntegration;
import io.sentry.android.core.SentryPerformanceProvider;
import io.sentry.android.core.c0;
import io.sentry.android.core.j1;
import io.sentry.android.core.s0;
import io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$3$2;
import io.sentry.android.replay.capture.m;
import io.sentry.b6;
import io.sentry.cache.a;
import io.sentry.cache.c;
import io.sentry.cache.f;
import io.sentry.cache.tape.e;
import io.sentry.cache.tape.j;
import io.sentry.f2;
import io.sentry.g6;
import io.sentry.h6;
import io.sentry.hints.i;
import io.sentry.i6;
import io.sentry.j6;
import io.sentry.k;
import io.sentry.k2;
import io.sentry.l;
import io.sentry.l6;
import io.sentry.m1;
import io.sentry.r6;
import io.sentry.u0;
import io.sentry.util.d;
import io.sentry.util.network.b;
import io.sentry.v3;
import io.sentry.z3;
import io.sentry.z4;
import ir.mservices.market.myAccount.dialog.username.UsernameBottomDialogFragment;
import ir.mservices.market.version2.activity.WebViewActivity;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import ir.mservices.market.version2.model.CallbackUrlModel;
import ir.mservices.market.webview.WebViewFragment;
import ir.myket.callback.domain.models.CallbackUrlType;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f09 implements nd8, gb8, a47, wt5, at5, vt5, l6, z3, j1, d, b, v3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f09(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // io.sentry.android.core.j1
    public void a() {
        FeedbackShakeIntegration feedbackShakeIntegration = (FeedbackShakeIntegration) this.b;
        WeakReference weakReference = feedbackShakeIntegration.d;
        Activity activity2 = weakReference != null ? (Activity) weakReference.get() : null;
        Boolean bool = c0.e.d;
        if (activity2 == null || feedbackShakeIntegration.c == null || feedbackShakeIntegration.e || Boolean.TRUE.equals(bool)) {
            return;
        }
        activity2.runOnUiThread(new r59(feedbackShakeIntegration, activity2, 7));
    }

    @Override // io.sentry.v3
    public void b(k kVar) {
        ((a1) this.b).v(new k());
    }

    @Override // io.sentry.util.d
    public Object c() {
        j jVar;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 16:
                z4 z4Var = (z4) obj;
                int i2 = SentryPerformanceProvider.f;
                return z4Var;
            case 21:
                return ((c) obj).a.getSerializer();
            case 22:
                f fVar = (f) obj;
                b6 b6Var = fVar.a;
                File fileB = a.b(b6Var, ".scope-cache");
                if (fileB == null) {
                    b6Var.getLogger().i(SentryLevel.INFO, "Cache dir is not set, cannot store in scope cache", new Object[0]);
                    return new io.sentry.cache.tape.b();
                }
                File file = new File(fileB, "breadcrumbs.json");
                try {
                    int maxBreadcrumbs = b6Var.getMaxBreadcrumbs();
                    RandomAccessFile randomAccessFileD = j.d(file);
                    try {
                        try {
                            jVar = new j(file, randomAccessFileD, maxBreadcrumbs);
                        } catch (Throwable th) {
                            randomAccessFileD.close();
                            throw th;
                        }
                    } catch (IOException e) {
                        b6Var.getLogger().f(SentryLevel.ERROR, "Failed to create breadcrumbs queue", e);
                        return new io.sentry.cache.tape.b();
                    }
                    break;
                } catch (IOException unused) {
                    file.delete();
                    int maxBreadcrumbs2 = b6Var.getMaxBreadcrumbs();
                    RandomAccessFile randomAccessFileD2 = j.d(file);
                    try {
                        jVar = new j(file, randomAccessFileD2, maxBreadcrumbs2);
                    } catch (Throwable th2) {
                        randomAccessFileD2.close();
                        throw th2;
                    }
                    break;
                }
                return new e(jVar, new f2(6, fVar));
            default:
                return Boolean.valueOf(i.f((u0) obj, "androidx.core.app.FrameMetricsAggregator"));
        }
    }

    @Override // io.sentry.l6
    public void d(j6 j6Var) {
        h6 h6Var = (h6) this.b;
        l lVar = h6Var.q;
        if (lVar != null) {
            lVar.b(j6Var);
        }
        g6 g6Var = h6Var.f;
        r6 r6Var = h6Var.r;
        if (r6Var.i == null) {
            if (g6Var.a) {
                h6Var.z(g6Var.b, null);
                return;
            }
            return;
        }
        if (r6Var.h) {
            ListIterator listIterator = h6Var.c.listIterator();
            while (listIterator.hasNext()) {
                j6 j6Var2 = (j6) listIterator.next();
                if (!j6Var2.g && j6Var2.b == null) {
                    return;
                }
            }
        }
        h6Var.v();
    }

    @Override // io.sentry.util.network.b
    public io.sentry.internal.debugmeta.c e(Object obj) {
        return io.sentry.okhttp.c.b((io.sentry.okhttp.c) this.b, (g77) obj);
    }

    @Override // defpackage.nd8
    public Object execute() {
        switch (this.a) {
            case 0:
                qb7 qb7Var = (qb7) ((jt0) ((v24) this.b).i);
                SQLiteDatabase sQLiteDatabaseB = qb7Var.b();
                sQLiteDatabaseB.beginTransaction();
                try {
                    sQLiteDatabaseB.compileStatement("DELETE FROM log_event_dropped").execute();
                    sQLiteDatabaseB.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + qb7Var.b.a()).execute();
                    sQLiteDatabaseB.setTransactionSuccessful();
                    sQLiteDatabaseB.endTransaction();
                    return null;
                } catch (Throwable th) {
                    sQLiteDatabaseB.endTransaction();
                    throw th;
                }
            default:
                o77 o77Var = (o77) this.b;
                Iterator it = ((Iterable) ((qb7) ((i42) o77Var.b)).g(new y45(23))).iterator();
                while (it.hasNext()) {
                    ((pa2) o77Var.c).y((d30) it.next(), 1, false);
                }
                return null;
        }
    }

    @Override // defpackage.vt5
    public void f() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 5:
                ((WebViewActivity) obj).p0();
                break;
            default:
                int i2 = WebViewFragment.c1;
                ((WebViewFragment) obj).m1();
                break;
        }
    }

    @Override // io.sentry.z3
    public void g(a1 a1Var) {
        i6 i6VarT;
        switch (this.a) {
            case 12:
                a1Var.H(new ur4((m1) this.b, a1Var, 21));
                break;
            case 13:
            case 16:
            default:
                m mVar = (m) this.b;
                js3.p(a1Var, "it");
                a1Var.l(mVar.i());
                String strG = a1Var.G();
                String strE0 = strG != null ? f88.E0('.', strG, strG) : null;
                io.sentry.android.replay.capture.a aVar = mVar.l;
                ox3 ox3Var = io.sentry.android.replay.capture.b.s[2];
                aVar.getClass();
                js3.p(ox3Var, "property");
                Object andSet = aVar.b.getAndSet(strE0);
                if (!js3.i(andSet, strE0)) {
                    BaseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$3$2 baseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$3$2 = new BaseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$3$2(andSet, strE0, aVar.d);
                    io.sentry.android.replay.capture.b bVar = aVar.c;
                    b6 b6Var = bVar.a;
                    if (b6Var.getThreadChecker().c()) {
                        ((ScheduledExecutorService) bVar.e.getValue()).submit(new io.sentry.android.replay.util.e(new k2(6, baseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$3$2), "CaptureStrategy.runInBackground"));
                    } else {
                        try {
                            baseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$3$2.invoke();
                        } catch (Throwable th) {
                            b6Var.getLogger().f(SentryLevel.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
                        }
                    }
                }
                break;
            case 14:
                AtomicLong atomicLong = ((s0) this.b).a;
                if (atomicLong.get() == 0 && (i6VarT = a1Var.t()) != null && i6VarT.c() != null) {
                    atomicLong.set(i6VarT.c().getTime());
                    break;
                }
                break;
            case 15:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
                i6 i6VarT2 = a1Var.t();
                if (i6VarT2 != null && i6VarT2.c() != null) {
                    atomicBoolean.set(true);
                    break;
                }
                break;
            case 17:
                a1Var.H(new ur4((io.sentry.android.core.internal.gestures.f) this.b, a1Var, 26));
                break;
            case 18:
                androidx.fragment.app.d dVar = (androidx.fragment.app.d) this.b;
                js3.p(a1Var, "it");
                String canonicalName = dVar.getClass().getCanonicalName();
                if (canonicalName == null) {
                    canonicalName = dVar.getClass().getSimpleName();
                }
                a1Var.y(canonicalName);
                break;
            case 19:
                io.sentry.android.replay.capture.e eVar = (io.sentry.android.replay.capture.e) this.b;
                js3.p(a1Var, "it");
                a1Var.l(eVar.i());
                break;
        }
    }

    @Override // defpackage.a47
    public void h(long j, h26 h26Var) {
        yq2.R(j, h26Var, ((cm7) this.b).c);
    }

    @Override // defpackage.at5
    public void l(bf8 bf8Var) {
        switch (this.a) {
            case 4:
                jc9.b((Intent) this.b);
                break;
            case 7:
                ((ig9) this.b).b.d(null);
                break;
            default:
                ((ScheduledFuture) this.b).cancel(false);
                break;
        }
    }

    @Override // defpackage.wt5
    public void n(String str) {
        UsernameBottomDialogFragment usernameBottomDialogFragment = (UsernameBottomDialogFragment) this.b;
        usernameBottomDialogFragment.getClass();
        usernameBottomDialogFragment.R0(DialogResult.b, new Bundle());
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [c24, java.lang.Object] */
    @Override // defpackage.gb8
    public void onSuccess(Object obj) {
        Object next;
        p09 p09Var = (p09) this.b;
        List<CallbackUrlModel> list = (List) obj;
        if (list != null) {
            for (CallbackUrlModel callbackUrlModel : list) {
                ir.myket.callback.manager.a aVar = (ir.myket.callback.manager.a) p09Var.b.getValue();
                js3.m(callbackUrlModel);
                String strB = callbackUrlModel.b();
                js3.o(strB, "getUrl(...)");
                String type = callbackUrlModel.getType();
                Enum r5 = CallbackUrlType.m;
                Iterator it = ((z0) CallbackUrlType.o).iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (m88.T(((Enum) next).name(), type, true)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                Enum r7 = (Enum) next;
                if (r7 != null) {
                    r5 = r7;
                }
                aVar.b(new ql0(strB, (CallbackUrlType) r5, callbackUrlModel.a()));
            }
        }
        o09 o09Var = p09Var.a;
        y45 y45Var = new y45(0);
        y45 y45Var2 = new y45(1);
        ArrayList arrayList = (ArrayList) o09Var.b;
        w wVar = new w(o09Var, y45Var, y45Var2, p09Var);
        wVar.b(new Void[0]);
        arrayList.add(wVar);
    }

    public /* synthetic */ f09(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj2;
    }
}
