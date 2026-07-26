package io.sentry.android.replay;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import defpackage.bp2;
import defpackage.c24;
import defpackage.dp2;
import defpackage.f88;
import defpackage.js3;
import defpackage.m88;
import defpackage.m91;
import defpackage.o40;
import defpackage.ok4;
import defpackage.qp2;
import defpackage.r59;
import defpackage.tx8;
import io.sentry.DataCategory;
import io.sentry.IConnectionStatusProvider$ConnectionStatus;
import io.sentry.SentryLevel;
import io.sentry.SentryReplayOptions$SentryReplayQuality;
import io.sentry.a1;
import io.sentry.b6;
import io.sentry.c4;
import io.sentry.d6;
import io.sentry.e5;
import io.sentry.f2;
import io.sentry.g1;
import io.sentry.j0;
import io.sentry.n0;
import io.sentry.q1;
import io.sentry.r3;
import io.sentry.s3;
import io.sentry.t2;
import io.sentry.util.AutoClosableReentrantLock;
import io.sentry.util.Random;
import io.sentry.z3;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes3.dex */
public final class ReplayIntegration implements q1, Closeable, s3, n0, io.sentry.transport.o {
    public static final /* synthetic */ int r = 0;
    public final Context a;
    public final io.sentry.transport.d b;
    public volatile IConnectionStatusProvider$ConnectionStatus c;
    public b6 d;
    public c4 e;
    public x f;
    public io.sentry.android.replay.gestures.b g;
    public final c24 h;
    public final c24 i;
    public final c24 j;
    public final AtomicBoolean k;
    public final AtomicBoolean l;
    public io.sentry.android.replay.capture.k m;
    public r3 n;
    public final f2 o;
    public final AutoClosableReentrantLock p;
    public final m q;

    static {
        e5.d().b("maven:io.sentry:sentry-android-replay", "8.43.1");
    }

    public ReplayIntegration(Context context) {
        io.sentry.transport.d dVar = io.sentry.transport.d.a;
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext != null ? applicationContext : context;
        this.b = dVar;
        this.c = IConnectionStatusProvider$ConnectionStatus.UNKNOWN;
        this.h = kotlin.a.a(new bp2() { // from class: io.sentry.android.replay.ReplayIntegration$random$2
            @Override // defpackage.bp2
            public final Object invoke() {
                return new Random();
            }
        });
        this.i = kotlin.a.a(new bp2() { // from class: io.sentry.android.replay.ReplayIntegration$rootViewsSpy$2
            @Override // defpackage.bp2
            public final Object invoke() {
                o oVar = new o();
                new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new n(oVar, 0));
                return oVar;
            }
        });
        this.j = kotlin.a.a(new bp2() { // from class: io.sentry.android.replay.ReplayIntegration$replayExecutor$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new j0(2));
                js3.m(scheduledExecutorServiceNewSingleThreadScheduledExecutor);
                b6 b6Var = this.g.d;
                if (b6Var != null) {
                    return new io.sentry.android.replay.util.d(scheduledExecutorServiceNewSingleThreadScheduledExecutor, b6Var);
                }
                js3.V("options");
                throw null;
            }
        });
        this.k = new AtomicBoolean(false);
        this.l = new AtomicBoolean(false);
        this.n = t2.a;
        this.o = new f2(5, (byte) 0);
        this.p = new AutoClosableReentrantLock();
        m mVar = new m();
        mVar.a = ReplayState.INITIAL;
        this.q = mVar;
    }

    @Override // io.sentry.s3
    public final void D(a aVar) {
        this.n = aVar;
    }

    @Override // io.sentry.transport.o
    public final void I(io.sentry.transport.p pVar) throws Exception {
        if (this.m instanceof io.sentry.android.replay.capture.m) {
            if (pVar.d(DataCategory.All) || pVar.d(DataCategory.Replay)) {
                r0();
            } else {
                s0();
            }
        }
    }

    @Override // io.sentry.q1
    public final void J(b6 b6Var) {
        Double d;
        this.d = b6Var;
        if (Build.VERSION.SDK_INT < 26) {
            b6Var.getLogger().i(SentryLevel.INFO, "Session replay is only supported on API 26 and above", new Object[0]);
            return;
        }
        Double d2 = b6Var.getSessionReplay().d;
        if ((d2 == null || d2.doubleValue() <= 0.0d) && ((d = b6Var.getSessionReplay().e) == null || d.doubleValue() <= 0.0d)) {
            b6Var.getLogger().i(SentryLevel.INFO, "Session replay is disabled, no sample rate specified", new Object[0]);
            return;
        }
        c4 c4Var = c4.a;
        this.e = c4Var;
        this.f = new x(b6Var, this, this, this.o, (io.sentry.android.replay.util.d) this.j.getValue());
        this.g = new io.sentry.android.replay.gestures.b(b6Var, this);
        this.k.set(true);
        b6Var.getConnectionStatusProvider().E0(this);
        io.sentry.transport.p pVarE = c4Var.e();
        if (pVarE != null) {
            pVarE.d.add(this);
        }
        io.sentry.config.a.a("Replay");
        b6 b6Var2 = this.d;
        if (b6Var2 == null) {
            js3.V("options");
            throw null;
        }
        g1 executorService = b6Var2.getExecutorService();
        js3.o(executorService, "getExecutorService(...)");
        b6 b6Var3 = this.d;
        if (b6Var3 == null) {
            js3.V("options");
            throw null;
        }
        try {
            executorService.submit(new r59(new n(this, 1), b6Var3, 16));
        } catch (Throwable th) {
            b6Var3.getLogger().f(SentryLevel.ERROR, "Failed to submit task ReplayIntegration.finalize_previous_replay to executor", th);
        }
    }

    @Override // io.sentry.s3
    public final void K() throws Exception {
        io.sentry.android.replay.capture.k eVar;
        m mVar = this.q;
        io.sentry.r rVarA = this.p.a();
        try {
            if (!this.k.get()) {
                m91.i(rVarA, null);
                return;
            }
            ReplayState replayState = ReplayState.STARTED;
            if (!mVar.a(replayState)) {
                b6 b6Var = this.d;
                if (b6Var == null) {
                    js3.V("options");
                    throw null;
                }
                b6Var.getLogger().i(SentryLevel.DEBUG, "Session replay is already being recorded, not starting a new one", new Object[0]);
                m91.i(rVarA, null);
                return;
            }
            Random random = (Random) this.h.getValue();
            b6 b6Var2 = this.d;
            if (b6Var2 == null) {
                js3.V("options");
                throw null;
            }
            Double d = b6Var2.getSessionReplay().d;
            js3.p(random, "<this>");
            boolean z = d != null && d.doubleValue() >= random.c();
            if (!z) {
                b6 b6Var3 = this.d;
                if (b6Var3 == null) {
                    js3.V("options");
                    throw null;
                }
                Double d2 = b6Var3.getSessionReplay().e;
                if (!(d2 != null && d2.doubleValue() > 0.0d)) {
                    b6 b6Var4 = this.d;
                    if (b6Var4 == null) {
                        js3.V("options");
                        throw null;
                    }
                    b6Var4.getLogger().i(SentryLevel.INFO, "Session replay is not started, full session was not sampled and onErrorSampleRate is not specified", new Object[0]);
                    m91.i(rVarA, null);
                    return;
                }
            }
            mVar.a = replayState;
            if (z) {
                b6 b6Var5 = this.d;
                if (b6Var5 == null) {
                    js3.V("options");
                    throw null;
                }
                eVar = new io.sentry.android.replay.capture.m(b6Var5, this.e, this.b, (io.sentry.android.replay.util.d) this.j.getValue());
            } else {
                b6 b6Var6 = this.d;
                if (b6Var6 == null) {
                    js3.V("options");
                    throw null;
                }
                eVar = new io.sentry.android.replay.capture.e(b6Var6, this.e, this.b, (Random) this.h.getValue(), (io.sentry.android.replay.util.d) this.j.getValue());
            }
            this.m = eVar;
            x xVar = this.f;
            if (xVar != null) {
                xVar.f.getAndSet(true);
            }
            io.sentry.android.replay.capture.k kVar = this.m;
            if (kVar != null) {
                kVar.e(0, new io.sentry.protocol.v(), null);
            }
            if (o40.O(this.f)) {
                RootViewsSpy$listeners$1 rootViewsSpy$listeners$1 = ((o) this.i.getValue()).c;
                x xVar2 = this.f;
                js3.n(xVar2, "null cannot be cast to non-null type io.sentry.android.replay.OnRootViewsChangedListener");
                rootViewsSpy$listeners$1.add(xVar2);
            }
            ((o) this.i.getValue()).c.add(this.g);
            m91.i(rVarA, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                m91.i(rVarA, th);
                throw th2;
            }
        }
    }

    @Override // io.sentry.s3
    public final r3 P() {
        return this.n;
    }

    public final void R(String str) {
        File[] fileArrListFiles;
        b6 b6Var = this.d;
        if (b6Var == null) {
            js3.V("options");
            throw null;
        }
        String cacheDirPath = b6Var.getCacheDirPath();
        if (cacheDirPath == null || (fileArrListFiles = new File(cacheDirPath).listFiles()) == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            String name = file.getName();
            js3.m(name);
            if (m88.Z(name, "replay_", false)) {
                String string = k().toString();
                js3.o(string, "toString(...)");
                if (!f88.c0(name, string, false) && (f88.n0(str) || !f88.c0(name, str, false))) {
                    io.sentry.config.a.p(file);
                }
            }
        }
    }

    public final boolean U() {
        return this.q.a.compareTo(ReplayState.STARTED) >= 0 && this.q.a.compareTo(ReplayState.STOPPED) < 0;
    }

    @Override // io.sentry.s3
    public final void b() throws Exception {
        this.l.set(true);
        r0();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Exception {
        io.sentry.transport.p pVarE;
        m mVar = this.q;
        io.sentry.r rVarA = this.p.a();
        try {
            if (this.k.get()) {
                ReplayState replayState = ReplayState.CLOSED;
                if (mVar.a(replayState)) {
                    b6 b6Var = this.d;
                    if (b6Var == null) {
                        js3.V("options");
                        throw null;
                    }
                    b6Var.getConnectionStatusProvider().S0(this);
                    c4 c4Var = this.e;
                    if (c4Var != null && (pVarE = c4Var.e()) != null) {
                        pVarE.d.remove(this);
                    }
                    stop();
                    x xVar = this.f;
                    if (xVar != null) {
                        xVar.close();
                    }
                    this.f = null;
                    ((o) this.i.getValue()).close();
                    ((io.sentry.android.replay.util.d) this.j.getValue()).shutdown();
                    mVar.a = replayState;
                    m91.i(rVarA, null);
                    return;
                }
            }
            m91.i(rVarA, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                m91.i(rVarA, th);
                throw th2;
            }
        }
    }

    @Override // io.sentry.s3
    public final void d(Boolean bool) {
        if (this.k.get() && U()) {
            io.sentry.protocol.v vVar = io.sentry.protocol.v.b;
            io.sentry.android.replay.capture.k kVar = this.m;
            if (vVar.equals(kVar != null ? ((io.sentry.android.replay.capture.b) kVar).i() : null)) {
                b6 b6Var = this.d;
                if (b6Var != null) {
                    b6Var.getLogger().i(SentryLevel.DEBUG, "Replay id is not set, not capturing for event", new Object[0]);
                    return;
                } else {
                    js3.V("options");
                    throw null;
                }
            }
            io.sentry.android.replay.capture.k kVar2 = this.m;
            if (kVar2 != null) {
                kVar2.g(new dp2() { // from class: io.sentry.android.replay.ReplayIntegration$captureReplay$1
                    {
                        super(1);
                    }

                    @Override // defpackage.dp2
                    public final Object invoke(Object obj) {
                        Date date = (Date) obj;
                        js3.p(date, "newTimestamp");
                        ReplayIntegration replayIntegration = this.g;
                        io.sentry.android.replay.capture.k kVar3 = replayIntegration.m;
                        if (kVar3 != null) {
                            ((io.sentry.android.replay.capture.b) kVar3).l(Integer.valueOf(((io.sentry.android.replay.capture.b) kVar3).j()).intValue() + 1);
                        }
                        io.sentry.android.replay.capture.k kVar4 = replayIntegration.m;
                        if (kVar4 != null) {
                            ((io.sentry.android.replay.capture.b) kVar4).n(date);
                        }
                        return tx8.a;
                    }
                }, bool.equals(Boolean.TRUE));
            }
            io.sentry.android.replay.capture.k kVar3 = this.m;
            this.m = kVar3 != null ? kVar3.d() : null;
        }
    }

    @Override // io.sentry.n0
    public final void g(IConnectionStatusProvider$ConnectionStatus iConnectionStatusProvider$ConnectionStatus) throws Exception {
        js3.p(iConnectionStatusProvider$ConnectionStatus, "status");
        this.c = iConnectionStatusProvider$ConnectionStatus;
        if (this.m instanceof io.sentry.android.replay.capture.m) {
            if (iConnectionStatusProvider$ConnectionStatus == IConnectionStatusProvider$ConnectionStatus.DISCONNECTED) {
                r0();
            } else {
                s0();
            }
        }
    }

    @Override // io.sentry.s3
    public final io.sentry.protocol.v k() {
        io.sentry.protocol.v vVarI;
        io.sentry.android.replay.capture.k kVar = this.m;
        if (kVar != null && (vVarI = ((io.sentry.android.replay.capture.b) kVar).i()) != null) {
            return vVarI;
        }
        io.sentry.protocol.v vVar = io.sentry.protocol.v.b;
        js3.o(vVar, "EMPTY_ID");
        return vVar;
    }

    public final void k0(final Bitmap bitmap) throws Exception {
        c4 c4Var;
        c4 c4Var2;
        io.sentry.transport.p pVarE;
        io.sentry.transport.p pVarE2;
        js3.p(bitmap, "bitmap");
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        c4 c4Var3 = this.e;
        if (c4Var3 != null) {
            c4Var3.s(new z3() { // from class: io.sentry.android.replay.j
                @Override // io.sentry.z3
                public final void g(a1 a1Var) {
                    int i = ReplayIntegration.r;
                    js3.p(a1Var, "it");
                    String strG = a1Var.G();
                    ref$ObjectRef.a = strG != null ? f88.E0('.', strG, strG) : null;
                }
            });
        }
        io.sentry.android.replay.capture.k kVar = this.m;
        if (kVar != null) {
            kVar.f(new qp2() { // from class: io.sentry.android.replay.ReplayIntegration$onScreenshotRecorded$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.qp2
                public final Object invoke(Object obj, Object obj2) throws IOException {
                    h hVar = (h) obj;
                    long jLongValue = ((Number) obj2).longValue();
                    js3.p(hVar, "$this$onScreenshotRecorded");
                    b6 b6Var = this.g.d;
                    if (b6Var == null) {
                        js3.V("options");
                        throw null;
                    }
                    b6Var.getSessionReplay().getClass();
                    Bitmap bitmap2 = bitmap;
                    String str = (String) ref$ObjectRef.a;
                    js3.p(bitmap2, "bitmap");
                    if (hVar.g() != null && !bitmap2.isRecycled()) {
                        File fileG = hVar.g();
                        if (fileG != null) {
                            fileG.mkdirs();
                        }
                        File file = new File(hVar.g(), jLongValue + ".jpg");
                        file.createNewFile();
                        synchronized (bitmap2) {
                            if (!bitmap2.isRecycled()) {
                                FileOutputStream fileOutputStream = new FileOutputStream(file);
                                try {
                                    bitmap2.compress(Bitmap.CompressFormat.JPEG, hVar.a.getSessionReplay().f.screenshotQuality, fileOutputStream);
                                    fileOutputStream.flush();
                                    fileOutputStream.close();
                                    hVar.b(file, jLongValue, str);
                                } finally {
                                }
                            }
                        }
                    }
                    return tx8.a;
                }
            });
        }
        if (this.m instanceof io.sentry.android.replay.capture.m) {
            if (this.c == IConnectionStatusProvider$ConnectionStatus.DISCONNECTED || !(((c4Var = this.e) == null || (pVarE2 = c4Var.e()) == null || !pVarE2.d(DataCategory.All)) && ((c4Var2 = this.e) == null || (pVarE = c4Var2.e()) == null || !pVarE.d(DataCategory.Replay)))) {
                r0();
            }
        }
    }

    public final void l0(int i, int i2) {
        x xVar;
        v vVar;
        q qVar;
        if (this.k.get() && U()) {
            b6 b6Var = this.d;
            if (b6Var == null) {
                js3.V("options");
                throw null;
            }
            if (b6Var.getSessionReplay().k) {
                Context context = this.a;
                b6 b6Var2 = this.d;
                if (b6Var2 == null) {
                    js3.V("options");
                    throw null;
                }
                d6 sessionReplay = b6Var2.getSessionReplay();
                js3.o(sessionReplay, "getSessionReplay(...)");
                js3.p(context, "context");
                float f = i2;
                float f2 = f / context.getResources().getDisplayMetrics().density;
                SentryReplayOptions$SentryReplayQuality sentryReplayOptions$SentryReplayQuality = sessionReplay.f;
                int iV = ok4.V(f2 * sentryReplayOptions$SentryReplayQuality.sizeScale);
                int i3 = iV % 16;
                int iMax = i3 <= 8 ? Math.max(16, iV - i3) : iV + (16 - i3);
                float f3 = i;
                int iV2 = ok4.V((f3 / context.getResources().getDisplayMetrics().density) * sentryReplayOptions$SentryReplayQuality.sizeScale);
                int i4 = iV2 % 16;
                int iMax2 = i4 <= 8 ? Math.max(16, iV2 - i4) : iV2 + (16 - i4);
                r rVar = new r(iMax2, iMax, iMax2 / f3, iMax / f, sessionReplay.g, sentryReplayOptions$SentryReplayQuality.bitRate);
                if (this.k.get() && U()) {
                    io.sentry.android.replay.capture.k kVar = this.m;
                    if (kVar != null) {
                        kVar.c(rVar);
                    }
                    x xVar2 = this.f;
                    if (xVar2 != null && xVar2.f.get()) {
                        if (xVar2.m == null) {
                            io.sentry.r rVarA = xVar2.k.a();
                            try {
                                if (xVar2.m == null) {
                                    xVar2.m = new v(xVar2.a, xVar2.d);
                                }
                                m91.i(rVarA, null);
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    m91.i(rVarA, th);
                                    throw th2;
                                }
                            }
                        }
                        v vVar2 = xVar2.m;
                        if (vVar2 != null) {
                            vVar2.d = rVar;
                        }
                        v vVar3 = xVar2.m;
                        if (vVar3 != null) {
                            vVar3.c = new q(xVar2.a, xVar2.b, rVar, xVar2);
                        }
                        WeakReference weakReference = (WeakReference) kotlin.collections.a.v0(xVar2.g);
                        View view = weakReference != null ? (View) weakReference.get() : null;
                        if (view != null && (vVar = xVar2.m) != null && (qVar = vVar.c) != null) {
                            qVar.a(view);
                        }
                        f2 f2Var = xVar2.d;
                        v vVar4 = xVar2.m;
                        Handler handler = (Handler) f2Var.b;
                        if (vVar4 != null) {
                            handler.removeCallbacks(vVar4);
                        }
                        f2 f2Var2 = xVar2.d;
                        v vVar5 = xVar2.m;
                        if (!(vVar5 == null ? false : ((Handler) f2Var2.b).postDelayed(vVar5, 100L))) {
                            xVar2.a.getLogger().i(SentryLevel.WARNING, "Failed to post the capture runnable, main looper is shutting down.", new Object[0]);
                        }
                    }
                    if (this.q.a != ReplayState.PAUSED || (xVar = this.f) == null) {
                        return;
                    }
                    xVar.k();
                }
            }
        }
    }

    public final void r0() throws Exception {
        m mVar = this.q;
        io.sentry.r rVarA = this.p.a();
        try {
            if (this.k.get()) {
                ReplayState replayState = ReplayState.PAUSED;
                if (mVar.a(replayState)) {
                    x xVar = this.f;
                    if (xVar != null) {
                        xVar.k();
                    }
                    io.sentry.android.replay.capture.k kVar = this.m;
                    if (kVar != null) {
                        kVar.b();
                    }
                    mVar.a = replayState;
                    m91.i(rVarA, null);
                    return;
                }
            }
            m91.i(rVarA, null);
        } finally {
        }
    }

    public final void s0() throws Exception {
        c4 c4Var;
        c4 c4Var2;
        io.sentry.transport.p pVarE;
        io.sentry.transport.p pVarE2;
        io.sentry.r rVarA = this.p.a();
        try {
            if (this.k.get()) {
                m mVar = this.q;
                ReplayState replayState = ReplayState.RESUMED;
                if (mVar.a(replayState)) {
                    if (!this.l.get() && this.c != IConnectionStatusProvider$ConnectionStatus.DISCONNECTED && (((c4Var = this.e) == null || (pVarE2 = c4Var.e()) == null || !pVarE2.d(DataCategory.All)) && ((c4Var2 = this.e) == null || (pVarE = c4Var2.e()) == null || !pVarE.d(DataCategory.Replay)))) {
                        m mVar2 = this.q;
                        mVar2.getClass();
                        mVar2.a = replayState;
                        io.sentry.android.replay.capture.k kVar = this.m;
                        if (kVar != null) {
                            ((io.sentry.android.replay.capture.b) kVar).n(io.sentry.config.a.z());
                        }
                        x xVar = this.f;
                        if (xVar != null) {
                            xVar.u();
                        }
                        m91.i(rVarA, null);
                        return;
                    }
                    m91.i(rVarA, null);
                    return;
                }
            }
            m91.i(rVarA, null);
        } finally {
        }
    }

    @Override // io.sentry.s3
    public final void stop() throws Exception {
        m mVar = this.q;
        io.sentry.r rVarA = this.p.a();
        try {
            if (this.k.get()) {
                ReplayState replayState = ReplayState.STOPPED;
                if (mVar.a(replayState)) {
                    if (o40.O(this.f)) {
                        RootViewsSpy$listeners$1 rootViewsSpy$listeners$1 = ((o) this.i.getValue()).c;
                        x xVar = this.f;
                        js3.n(xVar, "null cannot be cast to non-null type io.sentry.android.replay.OnRootViewsChangedListener");
                        rootViewsSpy$listeners$1.remove(xVar);
                    }
                    ((o) this.i.getValue()).c.remove(this.g);
                    x xVar2 = this.f;
                    if (xVar2 != null) {
                        xVar2.reset();
                    }
                    x xVar3 = this.f;
                    if (xVar3 != null) {
                        xVar3.y();
                    }
                    io.sentry.android.replay.gestures.b bVar = this.g;
                    if (bVar != null) {
                        bVar.c();
                    }
                    io.sentry.android.replay.capture.k kVar = this.m;
                    if (kVar != null) {
                        kVar.stop();
                    }
                    this.m = null;
                    mVar.a = replayState;
                    m91.i(rVarA, null);
                    return;
                }
            }
            m91.i(rVarA, null);
        } finally {
        }
    }

    @Override // io.sentry.s3
    public final void u() throws Exception {
        this.l.set(false);
        s0();
    }

    @Override // io.sentry.s3
    public final void y(io.sentry.protocol.v vVar) {
        io.sentry.android.replay.capture.k kVar;
        js3.p(vVar, "traceId");
        if (this.k.get() && U() && (kVar = this.m) != null) {
            io.sentry.android.replay.capture.b bVar = (io.sentry.android.replay.capture.b) kVar;
            if (vVar.equals(io.sentry.protocol.v.b)) {
                return;
            }
            synchronized (bVar.q) {
                if (bVar.r.size() < 100) {
                    String string = vVar.toString();
                    js3.o(string, "toString(...)");
                    if (!bVar.r.contains(string)) {
                        bVar.r.add(string);
                    }
                }
            }
        }
    }
}
