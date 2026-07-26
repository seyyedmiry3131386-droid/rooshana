package io.sentry.android.replay.capture;

import defpackage.bp2;
import defpackage.c24;
import defpackage.g27;
import defpackage.hg0;
import defpackage.js3;
import defpackage.ox3;
import io.sentry.SentryLevel;
import io.sentry.SentryReplayEvent$ReplayType;
import io.sentry.android.replay.r;
import io.sentry.b6;
import io.sentry.c1;
import io.sentry.j0;
import io.sentry.k2;
import io.sentry.protocol.v;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b implements k {
    public static final /* synthetic */ ox3[] s;
    public final b6 a;
    public final c1 b;
    public final io.sentry.transport.f c;
    public final ScheduledExecutorService d;
    public final c24 e;
    public final hg0 f;
    public final AtomicBoolean g;
    public io.sentry.android.replay.h h;
    public final a i;
    public final a j;
    public final AtomicLong k;
    public final a l;
    public final a m;
    public final a n;
    public final a o;
    public final ConcurrentLinkedDeque p;
    public final Object q;
    public final ArrayList r;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(b.class, "recorderConfig", "getRecorderConfig$sentry_android_replay_release()Lio/sentry/android/replay/ScreenshotRecorderConfig;", 0);
        g27.a.getClass();
        s = new ox3[]{mutablePropertyReference1Impl, new MutablePropertyReference1Impl(b.class, "segmentTimestamp", "getSegmentTimestamp()Ljava/util/Date;", 0), new MutablePropertyReference1Impl(b.class, "screenAtStart", "getScreenAtStart()Ljava/lang/String;", 0), new MutablePropertyReference1Impl(b.class, "currentReplayId", "getCurrentReplayId()Lio/sentry/protocol/SentryId;", 0), new MutablePropertyReference1Impl(b.class, "currentSegment", "getCurrentSegment()I", 0), new MutablePropertyReference1Impl(b.class, "replayType", "getReplayType()Lio/sentry/SentryReplayEvent$ReplayType;", 0)};
    }

    public b(b6 b6Var, c1 c1Var, io.sentry.transport.f fVar, ScheduledExecutorService scheduledExecutorService) {
        js3.p(b6Var, "options");
        js3.p(fVar, "dateProvider");
        js3.p(scheduledExecutorService, "replayExecutor");
        this.a = b6Var;
        this.b = c1Var;
        this.c = fVar;
        this.d = scheduledExecutorService;
        this.e = kotlin.a.a(new bp2() { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$persistingExecutor$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new j0(3));
                js3.m(scheduledExecutorServiceNewSingleThreadScheduledExecutor);
                return new io.sentry.android.replay.util.d(scheduledExecutorServiceNewSingleThreadScheduledExecutor, this.g.a);
            }
        });
        js3.p(fVar, "dateProvider");
        hg0 hg0Var = new hg0();
        hg0Var.c = fVar;
        hg0Var.d = new LinkedHashMap(10);
        this.f = hg0Var;
        this.g = new AtomicBoolean(false);
        this.i = new a(this, this, 3);
        this.j = new a(this, this, 4);
        this.k = new AtomicLong();
        this.l = new a(this, this, 5);
        this.m = new a(v.b, this, this);
        this.n = new a(this, this, 1);
        this.o = new a(this, this, 2);
        this.p = new ConcurrentLinkedDeque();
        this.q = new Object();
        this.r = new ArrayList();
    }

    public static j h(b bVar, long j, Date date, v vVar, int i, int i2, int i3, int i4, int i5) {
        List listP0;
        a aVar = bVar.o;
        ox3[] ox3VarArr = s;
        SentryReplayEvent$ReplayType sentryReplayEvent$ReplayType = (SentryReplayEvent$ReplayType) aVar.a(bVar, ox3VarArr[5]);
        io.sentry.android.replay.h hVar = bVar.h;
        String str = (String) bVar.l.a(bVar, ox3VarArr[2]);
        ConcurrentLinkedDeque concurrentLinkedDeque = bVar.p;
        js3.p(vVar, "replayId");
        js3.p(sentryReplayEvent$ReplayType, "replayType");
        js3.p(concurrentLinkedDeque, "events");
        synchronized (bVar.q) {
            listP0 = kotlin.collections.a.P0(bVar.r);
            bVar.r.clear();
        }
        return g.a(bVar.b, bVar.a, j, date, vVar, i, i2, i3, sentryReplayEvent$ReplayType, hVar, i4, i5, str, null, concurrentLinkedDeque, listP0);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x019c  */
    @Override // io.sentry.android.replay.capture.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(android.view.MotionEvent r21) {
        /*
            Method dump skipped, instruction units count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.replay.capture.b.a(android.view.MotionEvent):void");
    }

    @Override // io.sentry.android.replay.capture.k
    public void e(int i, v vVar, SentryReplayEvent$ReplayType sentryReplayEvent$ReplayType) {
        js3.p(vVar, "replayId");
        this.h = new io.sentry.android.replay.h(this.a, vVar);
        ox3[] ox3VarArr = s;
        ox3 ox3Var = ox3VarArr[3];
        a aVar = this.m;
        aVar.getClass();
        js3.p(ox3Var, "property");
        Object andSet = aVar.b.getAndSet(vVar);
        if (!js3.i(andSet, vVar)) {
            BaseCaptureStrategy$special$$inlined$persistableAtomic$default$1$2 baseCaptureStrategy$special$$inlined$persistableAtomic$default$1$2 = new BaseCaptureStrategy$special$$inlined$persistableAtomic$default$1$2(andSet, vVar, aVar.d);
            b bVar = aVar.c;
            b6 b6Var = bVar.a;
            if (b6Var.getThreadChecker().c()) {
                ((ScheduledExecutorService) bVar.e.getValue()).submit(new io.sentry.android.replay.util.e(new k2(1, baseCaptureStrategy$special$$inlined$persistableAtomic$default$1$2), "CaptureStrategy.runInBackground"));
            } else {
                try {
                    baseCaptureStrategy$special$$inlined$persistableAtomic$default$1$2.invoke();
                } catch (Throwable th) {
                    b6Var.getLogger().f(SentryLevel.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
                }
            }
        }
        l(i);
        if (sentryReplayEvent$ReplayType == null) {
            sentryReplayEvent$ReplayType = this instanceof m ? SentryReplayEvent$ReplayType.SESSION : SentryReplayEvent$ReplayType.BUFFER;
        }
        js3.p(sentryReplayEvent$ReplayType, "<set-?>");
        ox3 ox3Var2 = ox3VarArr[5];
        a aVar2 = this.o;
        aVar2.getClass();
        js3.p(ox3Var2, "property");
        Object andSet2 = aVar2.b.getAndSet(sentryReplayEvent$ReplayType);
        if (!js3.i(andSet2, sentryReplayEvent$ReplayType)) {
            BaseCaptureStrategy$special$$inlined$persistableAtomic$default$3$2 baseCaptureStrategy$special$$inlined$persistableAtomic$default$3$2 = new BaseCaptureStrategy$special$$inlined$persistableAtomic$default$3$2(andSet2, sentryReplayEvent$ReplayType, aVar2.d);
            b bVar2 = aVar2.c;
            b6 b6Var2 = bVar2.a;
            if (b6Var2.getThreadChecker().c()) {
                ((ScheduledExecutorService) bVar2.e.getValue()).submit(new io.sentry.android.replay.util.e(new k2(3, baseCaptureStrategy$special$$inlined$persistableAtomic$default$3$2), "CaptureStrategy.runInBackground"));
            } else {
                try {
                    baseCaptureStrategy$special$$inlined$persistableAtomic$default$3$2.invoke();
                } catch (Throwable th2) {
                    b6Var2.getLogger().f(SentryLevel.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th2);
                }
            }
        }
        n(io.sentry.config.a.z());
        this.k.set(this.c.b());
    }

    public final v i() {
        return (v) this.m.a(this, s[3]);
    }

    public final int j() {
        return ((Number) this.n.a(this, s[4])).intValue();
    }

    public final r k() {
        return (r) this.i.a(this, s[0]);
    }

    public final void l(int i) {
        ox3 ox3Var = s[4];
        Integer numValueOf = Integer.valueOf(i);
        a aVar = this.n;
        aVar.getClass();
        js3.p(ox3Var, "property");
        Object andSet = aVar.b.getAndSet(numValueOf);
        if (js3.i(andSet, numValueOf)) {
            return;
        }
        BaseCaptureStrategy$special$$inlined$persistableAtomic$default$2$2 baseCaptureStrategy$special$$inlined$persistableAtomic$default$2$2 = new BaseCaptureStrategy$special$$inlined$persistableAtomic$default$2$2(andSet, numValueOf, aVar.d);
        b bVar = aVar.c;
        b6 b6Var = bVar.a;
        if (b6Var.getThreadChecker().c()) {
            ((ScheduledExecutorService) bVar.e.getValue()).submit(new io.sentry.android.replay.util.e(new k2(2, baseCaptureStrategy$special$$inlined$persistableAtomic$default$2$2), "CaptureStrategy.runInBackground"));
            return;
        }
        try {
            baseCaptureStrategy$special$$inlined$persistableAtomic$default$2$2.invoke();
        } catch (Throwable th) {
            b6Var.getLogger().f(SentryLevel.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
        }
    }

    public final void m(r rVar) {
        ox3 ox3Var = s[0];
        a aVar = this.i;
        aVar.getClass();
        js3.p(ox3Var, "property");
        Object andSet = aVar.b.getAndSet(rVar);
        if (js3.i(andSet, rVar)) {
            return;
        }
        BaseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$1$2 baseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$1$2 = new BaseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$1$2(andSet, rVar, aVar.d);
        b bVar = aVar.c;
        b6 b6Var = bVar.a;
        if (b6Var.getThreadChecker().c()) {
            ((ScheduledExecutorService) bVar.e.getValue()).submit(new io.sentry.android.replay.util.e(new k2(4, baseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$1$2), "CaptureStrategy.runInBackground"));
            return;
        }
        try {
            baseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$1$2.invoke();
        } catch (Throwable th) {
            b6Var.getLogger().f(SentryLevel.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
        }
    }

    public final void n(Date date) {
        ox3 ox3Var = s[1];
        a aVar = this.j;
        aVar.getClass();
        js3.p(ox3Var, "property");
        Object andSet = aVar.b.getAndSet(date);
        if (js3.i(andSet, date)) {
            return;
        }
        BaseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$2$2 baseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$2$2 = new BaseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$2$2(andSet, date, aVar.d);
        b bVar = aVar.c;
        b6 b6Var = bVar.a;
        if (b6Var.getThreadChecker().c()) {
            ((ScheduledExecutorService) bVar.e.getValue()).submit(new io.sentry.android.replay.util.e(new k2(5, baseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$2$2), "CaptureStrategy.runInBackground"));
            return;
        }
        try {
            baseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$2$2.invoke();
        } catch (Throwable th) {
            b6Var.getLogger().f(SentryLevel.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
        }
    }

    @Override // io.sentry.android.replay.capture.k
    public void stop() {
        io.sentry.android.replay.h hVar = this.h;
        if (hVar != null) {
            hVar.close();
        }
        this.k.set(0L);
        n(null);
        v vVar = v.b;
        js3.o(vVar, "EMPTY_ID");
        ox3 ox3Var = s[3];
        a aVar = this.m;
        aVar.getClass();
        js3.p(ox3Var, "property");
        Object andSet = aVar.b.getAndSet(vVar);
        if (js3.i(andSet, vVar)) {
            return;
        }
        BaseCaptureStrategy$special$$inlined$persistableAtomic$default$1$2 baseCaptureStrategy$special$$inlined$persistableAtomic$default$1$2 = new BaseCaptureStrategy$special$$inlined$persistableAtomic$default$1$2(andSet, vVar, aVar.d);
        b bVar = aVar.c;
        b6 b6Var = bVar.a;
        if (b6Var.getThreadChecker().c()) {
            ((ScheduledExecutorService) bVar.e.getValue()).submit(new io.sentry.android.replay.util.e(new k2(1, baseCaptureStrategy$special$$inlined$persistableAtomic$default$1$2), "CaptureStrategy.runInBackground"));
            return;
        }
        try {
            baseCaptureStrategy$special$$inlined$persistableAtomic$default$1$2.invoke();
        } catch (Throwable th) {
            b6Var.getLogger().f(SentryLevel.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
        }
    }
}
