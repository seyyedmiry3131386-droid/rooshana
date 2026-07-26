package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class uj implements g67 {
    public final AnimatedImageDrawable a;

    public uj(AnimatedImageDrawable animatedImageDrawable) {
        this.a = animatedImageDrawable;
    }

    @Override // defpackage.g67
    public final void a() {
        this.a.stop();
        this.a.clearAnimationCallbacks();
    }

    @Override // defpackage.g67
    public final int c() {
        return i29.d(Bitmap.Config.ARGB_8888) * this.a.getIntrinsicHeight() * this.a.getIntrinsicWidth() * 2;
    }

    @Override // defpackage.g67
    public final Class d() {
        return Drawable.class;
    }

    @Override // defpackage.g67
    public final Object get() {
        return this.a;
    }
}
