package defpackage;

import android.content.Context;
import android.view.View;
import android.view.animation.PathInterpolator;
import io.sentry.android.core.t0;

/* JADX INFO: loaded from: classes.dex */
public abstract class kj4 {
    public final PathInterpolator a = new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);
    public final View b;
    public final int c;
    public final int d;
    public final int e;
    public f40 f;

    public kj4(View view) {
        this.b = view;
        Context context = view.getContext();
        this.c = ub1.G(context, vp6.motionDurationMedium2, 300);
        this.d = ub1.G(context, vp6.motionDurationShort3, 150);
        this.e = ub1.G(context, vp6.motionDurationShort2, 100);
    }

    public final f40 a() {
        if (this.f == null) {
            t0.m("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        f40 f40Var = this.f;
        this.f = null;
        return f40Var;
    }
}
