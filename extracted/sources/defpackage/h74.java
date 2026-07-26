package defpackage;

import android.animation.ObjectAnimator;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class h74 extends y {
    public static final mo0 i = new mo0(Float.class, "animationFraction", 17);
    public ObjectAnimator c;
    public final w82 d;
    public final LinearProgressIndicatorSpec e;
    public int f;
    public boolean g;
    public float h;

    public h74(LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(3);
        this.f = 1;
        this.e = linearProgressIndicatorSpec;
        this.d = new w82(1);
    }

    @Override // defpackage.y
    public final void D() {
        G();
        H();
        this.c.start();
    }

    public final void G() {
        if (this.c == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, i, 0.0f, 1.0f);
            this.c = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (this.e.n * 333.0f));
            this.c.setInterpolator(null);
            this.c.setRepeatCount(-1);
            this.c.addListener(new s5(8, this));
        }
    }

    public final void H() {
        this.g = true;
        this.f = 1;
        for (mw1 mw1Var : (ArrayList) this.b) {
            LinearProgressIndicatorSpec linearProgressIndicatorSpec = this.e;
            mw1Var.c = linearProgressIndicatorSpec.e[0];
            mw1Var.d = linearProgressIndicatorSpec.i / 2;
        }
    }

    @Override // defpackage.y
    public final void d() {
        ObjectAnimator objectAnimator = this.c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // defpackage.y
    public final void q() {
        G();
        this.c.setDuration((long) (this.e.n * 333.0f));
        H();
    }

    @Override // defpackage.y
    public final void F() {
    }

    @Override // defpackage.y
    public final void y() {
    }

    @Override // defpackage.y
    public final void x(s80 s80Var) {
    }
}
