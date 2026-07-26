package io.sentry.android.replay.gestures;

import android.view.MotionEvent;
import android.view.Window;
import defpackage.js3;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.replay.ReplayState;
import io.sentry.android.replay.capture.k;
import io.sentry.android.replay.m;
import io.sentry.b6;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends io.sentry.android.replay.util.b {
    public final b6 b;
    public volatile ReplayIntegration c;

    public a(b6 b6Var, ReplayIntegration replayIntegration, Window.Callback callback) {
        super(callback);
        this.b = b6Var;
        this.c = replayIntegration;
    }

    @Override // io.sentry.android.replay.util.b, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        k kVar;
        if (motionEvent != null) {
            MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
            js3.o(motionEventObtainNoHistory, "obtainNoHistory(...)");
            try {
                ReplayIntegration replayIntegration = this.c;
                if (replayIntegration != null && replayIntegration.k.get()) {
                    m mVar = replayIntegration.q;
                    if ((mVar.a == ReplayState.STARTED || mVar.a == ReplayState.RESUMED) && (kVar = replayIntegration.m) != null) {
                        kVar.a(motionEventObtainNoHistory);
                    }
                }
            } finally {
                try {
                } finally {
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
