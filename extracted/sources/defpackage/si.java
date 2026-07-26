package defpackage;

import android.os.Build;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class si implements v69 {
    public final ViewConfiguration a;

    public si(ViewConfiguration viewConfiguration) {
        this.a = viewConfiguration;
    }

    @Override // defpackage.v69
    public final long a() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // defpackage.v69
    public final long b() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // defpackage.v69
    public final float c() {
        if (Build.VERSION.SDK_INT >= 34) {
            return i3.l(this.a);
        }
        return 2.0f;
    }

    @Override // defpackage.v69
    public final long d() {
        float f = 48;
        return br9.f(f, f);
    }

    @Override // defpackage.v69
    public final float e() {
        return this.a.getScaledMaximumFlingVelocity();
    }

    @Override // defpackage.v69
    public final float f() {
        return this.a.getScaledTouchSlop();
    }

    @Override // defpackage.v69
    public final float g() {
        if (Build.VERSION.SDK_INT >= 34) {
            return i3.k(this.a);
        }
        return 16.0f;
    }
}
