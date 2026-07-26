package defpackage;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes.dex */
public final class mk {
    public lk a;
    public final /* synthetic */ ok b;

    public mk(ok okVar) {
        this.b = okVar;
    }

    public final boolean a() {
        boolean zUnregisterDurationScaleChangeListener = ValueAnimator.unregisterDurationScaleChangeListener(this.a);
        this.a = null;
        return zUnregisterDurationScaleChangeListener;
    }
}
