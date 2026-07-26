package io.sentry.android.replay.capture;

import defpackage.dp2;
import defpackage.f09;
import defpackage.js3;
import defpackage.qp2;
import defpackage.tx8;
import io.sentry.SentryLevel;
import io.sentry.SentryReplayEvent$ReplayType;
import io.sentry.android.replay.r;
import io.sentry.b6;
import io.sentry.c1;
import io.sentry.protocol.v;
import io.sentry.u1;
import java.io.File;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends b {
    public final b6 t;
    public final c1 u;
    public final io.sentry.transport.f v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(b6 b6Var, c1 c1Var, io.sentry.transport.f fVar, ScheduledExecutorService scheduledExecutorService) {
        super(b6Var, c1Var, fVar, scheduledExecutorService);
        js3.p(b6Var, "options");
        js3.p(fVar, "dateProvider");
        js3.p(scheduledExecutorService, "executor");
        this.t = b6Var;
        this.u = c1Var;
        this.v = fVar;
    }

    @Override // io.sentry.android.replay.capture.k
    public final void b() {
        o("pause", new dp2() { // from class: io.sentry.android.replay.capture.SessionCaptureStrategy$pause$1
            {
                super(1);
            }

            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                j jVar = (j) obj;
                js3.p(jVar, "segment");
                if (jVar instanceof h) {
                    m mVar = this.g;
                    h.a((h) jVar, mVar.u);
                    mVar.l(mVar.j() + 1);
                }
                return tx8.a;
            }
        });
    }

    @Override // io.sentry.android.replay.capture.k
    public final void c(r rVar) {
        o("onConfigurationChanged", new dp2() { // from class: io.sentry.android.replay.capture.SessionCaptureStrategy$onConfigurationChanged$1
            {
                super(1);
            }

            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                j jVar = (j) obj;
                js3.p(jVar, "segment");
                if (jVar instanceof h) {
                    h hVar = (h) jVar;
                    m mVar = this.g;
                    h.a(hVar, mVar.u);
                    mVar.l(mVar.j() + 1);
                    mVar.n(hVar.a.u);
                }
                return tx8.a;
            }
        });
        m(rVar);
    }

    @Override // io.sentry.android.replay.capture.k
    public final k d() {
        return this;
    }

    @Override // io.sentry.android.replay.capture.b, io.sentry.android.replay.capture.k
    public final void e(int i, v vVar, SentryReplayEvent$ReplayType sentryReplayEvent$ReplayType) {
        js3.p(vVar, "replayId");
        super.e(i, vVar, sentryReplayEvent$ReplayType);
        c1 c1Var = this.u;
        if (c1Var != null) {
            c1Var.x(new f09(20, this));
        }
    }

    @Override // io.sentry.android.replay.capture.k
    public final void f(final qp2 qp2Var) {
        final r rVarK = k();
        final long jB = this.v.b();
        this.d.submit(new io.sentry.android.replay.util.e(new Runnable() { // from class: io.sentry.android.replay.capture.l
            @Override // java.lang.Runnable
            public final void run() {
                m mVar = this.a;
                io.sentry.android.replay.h hVar = mVar.h;
                b6 b6Var = mVar.t;
                if (hVar != null) {
                    qp2Var.invoke(hVar, Long.valueOf(jB));
                }
                Date date = (Date) mVar.j.a(mVar, b.s[1]);
                if (date == null) {
                    b6Var.getLogger().i(SentryLevel.DEBUG, "Segment timestamp is not set, not recording frame", new Object[0]);
                    return;
                }
                if (mVar.g.get()) {
                    b6Var.getLogger().i(SentryLevel.DEBUG, "Not capturing segment, because the app is terminating, will be captured on next launch", new Object[0]);
                    return;
                }
                r rVar = rVarK;
                if (rVar == null) {
                    b6Var.getLogger().i(SentryLevel.DEBUG, "Recorder config is not set, not capturing a segment", new Object[0]);
                    return;
                }
                long jB2 = mVar.v.b();
                if (jB2 - date.getTime() >= b6Var.getSessionReplay().i) {
                    j jVarH = b.h(mVar, b6Var.getSessionReplay().i, date, mVar.i(), mVar.j(), rVar.b, rVar.a, rVar.e, rVar.f);
                    if (jVarH instanceof h) {
                        h hVar2 = (h) jVarH;
                        h.a(hVar2, mVar.u);
                        mVar.l(mVar.j() + 1);
                        mVar.n(hVar2.a.u);
                    }
                }
                if (jB2 - mVar.k.get() >= b6Var.getSessionReplay().j) {
                    b6Var.getReplayController().stop();
                    b6Var.getLogger().i(SentryLevel.INFO, "Session replay deadline exceeded (1h), stopping recording", new Object[0]);
                }
            }
        }, "SessionCaptureStrategy.add_frame"));
    }

    @Override // io.sentry.android.replay.capture.k
    public final void g(dp2 dp2Var, boolean z) {
        b6 b6Var = this.t;
        if (b6Var.getSessionReplay().m) {
            b6Var.getLogger().i(SentryLevel.DEBUG, "Replay is already running in 'session' mode, not capturing for event", new Object[0]);
        }
        this.g.set(z);
    }

    public final void o(String str, dp2 dp2Var) {
        r rVarK = k();
        if (rVarK == null) {
            this.t.getLogger().i(SentryLevel.DEBUG, "Recorder config is not set, not creating segment for task: ".concat(str), new Object[0]);
            return;
        }
        long jB = this.v.b();
        Date date = (Date) this.j.a(this, b.s[1]);
        if (date == null) {
            return;
        }
        long time = jB - date.getTime();
        v vVarI = i();
        this.d.submit(new io.sentry.android.replay.util.e(new c(this, time, date, vVarI, rVarK, dp2Var), "SessionCaptureStrategy.".concat(str)));
    }

    @Override // io.sentry.android.replay.capture.b, io.sentry.android.replay.capture.k
    public final void stop() {
        io.sentry.android.replay.h hVar = this.h;
        final File fileG = hVar != null ? hVar.g() : null;
        o("stop", new dp2() { // from class: io.sentry.android.replay.capture.SessionCaptureStrategy$stop$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                j jVar = (j) obj;
                js3.p(jVar, "segment");
                boolean z = jVar instanceof h;
                m mVar = this.g;
                if (z) {
                    h.a((h) jVar, mVar.u);
                }
                mVar.l(-1);
                io.sentry.config.a.p(fileG);
                return tx8.a;
            }
        });
        c1 c1Var = this.u;
        if (c1Var != null) {
            c1Var.x(new u1(24));
        }
        super.stop();
    }
}
