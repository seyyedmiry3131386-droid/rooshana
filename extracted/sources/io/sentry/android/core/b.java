package io.sentry.android.core;

import android.app.Activity;
import androidx.core.app.FrameMetricsAggregator;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;
    public final /* synthetic */ Activity c;

    public /* synthetic */ b(d dVar, Activity activity2, int i) {
        this.a = i;
        this.b = dVar;
        this.c = activity2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((FrameMetricsAggregator) this.b.a.a()).a.q(this.c);
                break;
            default:
                ((FrameMetricsAggregator) this.b.a.a()).a.x(this.c);
                break;
        }
    }
}
