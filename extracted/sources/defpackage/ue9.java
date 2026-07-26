package defpackage;

import android.os.Build;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public final class ue9 {
    public te9 a;

    public ue9(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new se9(qe9.b(i, interpolator, j));
        } else {
            this.a = new pe9(i, interpolator, j);
        }
    }
}
