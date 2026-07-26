package ir.mservices.market.views;

import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import defpackage.js3;
import defpackage.pq6;
import defpackage.r80;
import defpackage.sj8;

/* JADX INFO: loaded from: classes3.dex */
public final class LoadingView extends CircularProgressIndicator {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        js3.p(context, "context");
        setTrackThickness(context.getResources().getDimensionPixelSize(pq6.loading_indicator_thickness));
        setIndicatorSize(context.getResources().getDimensionPixelSize(pq6.loading_empty_indicator_size));
        setIndicatorColor(sj8.b().u);
        setIndeterminate(true);
        setIndeterminateAnimationType(1);
    }

    public final void d(boolean z) {
        r80 r80Var = this.l;
        if (z) {
            int i = this.e;
            if (i <= 0) {
                r80Var.run();
                return;
            } else {
                removeCallbacks(r80Var);
                postDelayed(r80Var, i);
                return;
            }
        }
        if (getVisibility() != 0) {
            removeCallbacks(r80Var);
            return;
        }
        r80 r80Var2 = this.m;
        removeCallbacks(r80Var2);
        long jUptimeMillis = SystemClock.uptimeMillis() - this.g;
        long j = this.f;
        if (jUptimeMillis >= j) {
            r80Var2.run();
        } else {
            postDelayed(r80Var2, j - jUptimeMillis);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoadingView(Context context) {
        this(context, null);
        js3.p(context, "context");
    }
}
