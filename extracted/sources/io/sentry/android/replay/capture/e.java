package io.sentry.android.replay.capture;

import android.view.MotionEvent;
import defpackage.br9;
import defpackage.dp2;
import defpackage.f09;
import defpackage.js3;
import defpackage.ox3;
import defpackage.qp2;
import defpackage.r59;
import defpackage.tx8;
import io.sentry.SentryLevel;
import io.sentry.SentryReplayEvent$ReplayType;
import io.sentry.android.replay.r;
import io.sentry.b6;
import io.sentry.c1;
import io.sentry.c4;
import io.sentry.c6;
import io.sentry.k2;
import io.sentry.util.Random;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.Ref$BooleanRef;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends b {
    public final b6 t;
    public final c1 u;
    public final io.sentry.transport.f v;
    public final Random w;
    public final ArrayList x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(b6 b6Var, c4 c4Var, io.sentry.transport.d dVar, Random random, io.sentry.android.replay.util.d dVar2) {
        super(b6Var, c4Var, dVar, dVar2);
        js3.p(b6Var, "options");
        js3.p(dVar, "dateProvider");
        js3.p(random, "random");
        js3.p(dVar2, "executor");
        this.t = b6Var;
        this.u = c4Var;
        this.v = dVar;
        this.w = random;
        this.x = new ArrayList();
    }

    @Override // io.sentry.android.replay.capture.b, io.sentry.android.replay.capture.k
    public final void a(MotionEvent motionEvent) {
        super.a(motionEvent);
        long jB = this.v.b() - this.t.getSessionReplay().h;
        ConcurrentLinkedDeque concurrentLinkedDeque = this.p;
        js3.p(concurrentLinkedDeque, "events");
        Iterator it = concurrentLinkedDeque.iterator();
        js3.o(it, "iterator(...)");
        while (it.hasNext()) {
            if (((io.sentry.rrweb.b) it.next()).b < jB) {
                it.remove();
            }
        }
    }

    @Override // io.sentry.android.replay.capture.k
    public final void b() throws Exception {
        o("pause", new dp2() { // from class: io.sentry.android.replay.capture.BufferCaptureStrategy$pause$1
            {
                super(1);
            }

            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                j jVar = (j) obj;
                js3.p(jVar, "segment");
                if (jVar instanceof h) {
                    e eVar = this.g;
                    eVar.x.add(jVar);
                    eVar.l(eVar.j() + 1);
                }
                return tx8.a;
            }
        });
    }

    @Override // io.sentry.android.replay.capture.k
    public final void c(r rVar) throws Exception {
        o("configuration_changed", new dp2() { // from class: io.sentry.android.replay.capture.BufferCaptureStrategy$onConfigurationChanged$1
            {
                super(1);
            }

            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                j jVar = (j) obj;
                js3.p(jVar, "segment");
                if (jVar instanceof h) {
                    e eVar = this.g;
                    eVar.x.add(jVar);
                    eVar.l(eVar.j() + 1);
                }
                return tx8.a;
            }
        });
        m(rVar);
    }

    @Override // io.sentry.android.replay.capture.k
    public final k d() {
        boolean z = this.g.get();
        b6 b6Var = this.t;
        if (z) {
            b6Var.getLogger().i(SentryLevel.DEBUG, "Not converting to session mode, because the process is about to terminate", new Object[0]);
            return this;
        }
        m mVar = new m(b6Var, this.u, this.v, this.d);
        mVar.m(k());
        mVar.e(j(), i(), SentryReplayEvent$ReplayType.BUFFER);
        return mVar;
    }

    @Override // io.sentry.android.replay.capture.k
    public final void f(final qp2 qp2Var) {
        final long jB = this.v.b();
        this.d.submit(new io.sentry.android.replay.util.e(new Runnable() { // from class: io.sentry.android.replay.capture.d
            @Override // java.lang.Runnable
            public final void run() {
                final e eVar = this.a;
                io.sentry.android.replay.h hVar = eVar.h;
                if (hVar != null) {
                    qp2Var.invoke(hVar, Long.valueOf(jB));
                }
                final long jB2 = eVar.v.b() - eVar.t.getSessionReplay().h;
                io.sentry.android.replay.h hVar2 = eVar.h;
                String strU = hVar2 != null ? hVar2.u(jB2) : null;
                a aVar = eVar.l;
                ox3 ox3Var = b.s[2];
                aVar.getClass();
                js3.p(ox3Var, "property");
                Object andSet = aVar.b.getAndSet(strU);
                if (!js3.i(andSet, strU)) {
                    BaseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$3$2 baseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$3$2 = new BaseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$3$2(andSet, strU, aVar.d);
                    b bVar = aVar.c;
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
                ArrayList arrayList = eVar.x;
                final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                kotlin.collections.a.B0(new dp2() { // from class: io.sentry.android.replay.capture.BufferCaptureStrategy$rotate$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.dp2
                    public final Object invoke(Object obj) {
                        h hVar3 = (h) obj;
                        js3.p(hVar3, "it");
                        c6 c6Var = hVar3.a;
                        if (c6Var.u.getTime() >= jB2) {
                            return Boolean.FALSE;
                        }
                        e eVar2 = eVar;
                        eVar2.l(eVar2.j() - 1);
                        File file = c6Var.p;
                        b6 b6Var2 = eVar2.t;
                        if (file != null) {
                            try {
                                if (!file.delete()) {
                                    b6Var2.getLogger().i(SentryLevel.ERROR, "Failed to delete replay segment: %s", file.getAbsolutePath());
                                }
                            } catch (Throwable th2) {
                                b6Var2.getLogger().e(SentryLevel.ERROR, th2, "Failed to delete replay segment: %s", file.getAbsolutePath());
                            }
                        }
                        ref$BooleanRef.a = true;
                        return Boolean.TRUE;
                    }
                }, arrayList);
                if (ref$BooleanRef.a) {
                    int i = 0;
                    for (Object obj : arrayList) {
                        int i2 = i + 1;
                        if (i < 0) {
                            br9.P();
                            throw null;
                        }
                        h hVar3 = (h) obj;
                        hVar3.a.t = i;
                        List<io.sentry.rrweb.b> list = hVar3.b.b;
                        if (list != null) {
                            for (io.sentry.rrweb.b bVar2 : list) {
                                if (bVar2 instanceof io.sentry.rrweb.j) {
                                    ((io.sentry.rrweb.j) bVar2).d = i;
                                }
                            }
                        }
                        i = i2;
                    }
                }
            }
        }, "BufferCaptureStrategy.add_frame"));
    }

    @Override // io.sentry.android.replay.capture.k
    public final void g(final dp2 dp2Var, boolean z) throws Exception {
        b6 b6Var = this.t;
        Double d = b6Var.getSessionReplay().e;
        Random random = this.w;
        js3.p(random, "<this>");
        if (d == null || d.doubleValue() < random.c()) {
            b6Var.getLogger().i(SentryLevel.INFO, "Replay wasn't sampled by onErrorSampleRate, not capturing for event", new Object[0]);
            return;
        }
        c1 c1Var = this.u;
        if (c1Var != null) {
            c1Var.x(new f09(19, this));
        }
        if (!z) {
            o("capture_replay", new dp2() { // from class: io.sentry.android.replay.capture.BufferCaptureStrategy$captureReplay$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.dp2
                public final Object invoke(Object obj) throws InterruptedException {
                    j jVar = (j) obj;
                    js3.p(jVar, "segment");
                    e eVar = this.g;
                    ArrayList arrayList = eVar.x;
                    c1 c1Var2 = eVar.u;
                    h hVar = (h) kotlin.collections.a.E0(arrayList);
                    while (hVar != null) {
                        h.a(hVar, c1Var2);
                        hVar = (h) kotlin.collections.a.E0(arrayList);
                        Thread.sleep(100L);
                    }
                    if (jVar instanceof h) {
                        h hVar2 = (h) jVar;
                        h.a(hVar2, c1Var2);
                        Date date = hVar2.a.u;
                        js3.o(date, "getTimestamp(...)");
                        dp2Var.invoke(date);
                    }
                    return tx8.a;
                }
            });
        } else {
            this.g.set(true);
            b6Var.getLogger().i(SentryLevel.DEBUG, "Not capturing replay for crashed event, will be captured on next launch", new Object[0]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o(java.lang.String r11, defpackage.dp2 r12) throws java.lang.Exception {
        /*
            r10 = this;
            io.sentry.android.replay.r r6 = r10.k()
            io.sentry.b6 r0 = r10.t
            if (r6 != 0) goto L1b
            io.sentry.u0 r12 = r0.getLogger()
            io.sentry.SentryLevel r0 = io.sentry.SentryLevel.DEBUG
            java.lang.String r1 = "Recorder config is not set, not creating segment for task: "
            java.lang.String r11 = r1.concat(r11)
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r12.i(r0, r11, r1)
            return
        L1b:
            io.sentry.d6 r0 = r0.getSessionReplay()
            long r0 = r0.h
            io.sentry.transport.f r2 = r10.v
            long r2 = r2.b()
            io.sentry.android.replay.h r4 = r10.h
            if (r4 == 0) goto L5e
            io.sentry.util.AutoClosableReentrantLock r5 = r4.f
            io.sentry.r r5 = r5.a()
            java.util.ArrayList r4 = r4.i     // Catch: java.lang.Throwable -> L43
            java.lang.Object r4 = kotlin.collections.a.p0(r4)     // Catch: java.lang.Throwable -> L43
            io.sentry.android.replay.i r4 = (io.sentry.android.replay.i) r4     // Catch: java.lang.Throwable -> L43
            r7 = 0
            if (r4 == 0) goto L46
            long r8 = r4.b     // Catch: java.lang.Throwable -> L43
            java.lang.Long r4 = java.lang.Long.valueOf(r8)     // Catch: java.lang.Throwable -> L43
            goto L47
        L43:
            r0 = move-exception
            r11 = r0
            goto L57
        L46:
            r4 = r7
        L47:
            defpackage.m91.i(r5, r7)
            if (r4 == 0) goto L5e
            long r4 = r4.longValue()
            java.util.Date r4 = io.sentry.config.a.A(r4)
            if (r4 != 0) goto L64
            goto L5e
        L57:
            throw r11     // Catch: java.lang.Throwable -> L58
        L58:
            r0 = move-exception
            r12 = r0
            defpackage.m91.i(r5, r11)
            throw r12
        L5e:
            long r0 = r2 - r0
            java.util.Date r4 = io.sentry.config.a.A(r0)
        L64:
            defpackage.js3.m(r4)
            long r0 = r4.getTime()
            long r2 = r2 - r0
            io.sentry.protocol.v r5 = r10.i()
            io.sentry.android.replay.util.e r8 = new io.sentry.android.replay.util.e
            java.lang.String r0 = "BufferCaptureStrategy."
            java.lang.String r11 = r0.concat(r11)
            io.sentry.android.replay.capture.c r0 = new io.sentry.android.replay.capture.c
            r1 = r10
            r7 = r12
            r0.<init>(r1, r2, r4, r5, r6, r7)
            r8.<init>(r0, r11)
            java.util.concurrent.ScheduledExecutorService r11 = r1.d
            r11.submit(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.replay.capture.e.o(java.lang.String, dp2):void");
    }

    @Override // io.sentry.android.replay.capture.b, io.sentry.android.replay.capture.k
    public final void stop() {
        io.sentry.android.replay.h hVar = this.h;
        this.d.submit(new io.sentry.android.replay.util.e(new r59(hVar != null ? hVar.g() : null, this, 15), "BufferCaptureStrategy.stop"));
        super.stop();
    }
}
