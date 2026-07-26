package io.sentry.android.replay.capture;

import android.view.MotionEvent;
import defpackage.dp2;
import defpackage.qp2;
import io.sentry.SentryReplayEvent$ReplayType;
import io.sentry.android.replay.r;
import io.sentry.protocol.v;

/* JADX INFO: loaded from: classes3.dex */
public interface k {
    void a(MotionEvent motionEvent);

    void b();

    void c(r rVar);

    k d();

    void e(int i, v vVar, SentryReplayEvent$ReplayType sentryReplayEvent$ReplayType);

    void f(qp2 qp2Var);

    void g(dp2 dp2Var, boolean z);

    void stop();
}
