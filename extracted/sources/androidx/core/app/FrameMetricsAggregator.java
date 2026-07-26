package androidx.core.app;

import android.os.Build;
import defpackage.cv;
import defpackage.io2;

/* JADX INFO: loaded from: classes.dex */
public class FrameMetricsAggregator {
    public final cv a;

    public FrameMetricsAggregator() {
        this(1);
    }

    public FrameMetricsAggregator(int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.a = new io2(i);
        } else {
            this.a = new cv(23);
        }
    }
}
