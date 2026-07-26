package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class j74 extends y {
    public static final int[] k = {533, 567, 850, 750};
    public static final int[] l = {1267, 1000, 333, 0};
    public static final mo0 m = new mo0(Float.class, "animationFraction", 18);
    public ObjectAnimator c;
    public ObjectAnimator d;
    public final Interpolator[] e;
    public final LinearProgressIndicatorSpec f;
    public int g;
    public boolean h;
    public float i;
    public s80 j;

    public j74(Context context, LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(2);
        this.g = 0;
        this.j = null;
        this.f = linearProgressIndicatorSpec;
        this.e = new Interpolator[]{AnimationUtils.loadInterpolator(context, ep6.linear_indeterminate_line1_head_interpolator), AnimationUtils.loadInterpolator(context, ep6.linear_indeterminate_line1_tail_interpolator), AnimationUtils.loadInterpolator(context, ep6.linear_indeterminate_line2_head_interpolator), AnimationUtils.loadInterpolator(context, ep6.linear_indeterminate_line2_tail_interpolator)};
    }

    @Override // defpackage.y
    public final void D() {
        G();
        H();
        this.c.start();
    }

    @Override // defpackage.y
    public final void F() {
        this.j = null;
    }

    public final void G() {
        ObjectAnimator objectAnimator = this.c;
        int i = 0;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = this.f;
        mo0 mo0Var = m;
        if (objectAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, mo0Var, 0.0f, 1.0f);
            this.c = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (linearProgressIndicatorSpec.n * 1800.0f));
            this.c.setInterpolator(null);
            this.c.setRepeatCount(-1);
            this.c.addListener(new i74(this, i));
        }
        if (this.d == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, mo0Var, 1.0f);
            this.d = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration((long) (linearProgressIndicatorSpec.n * 1800.0f));
            this.d.setInterpolator(null);
            this.d.addListener(new i74(this, 1));
        }
    }

    public final void H() {
        this.g = 0;
        Iterator it = ((ArrayList) this.b).iterator();
        while (it.hasNext()) {
            ((mw1) it.next()).c = this.f.e[0];
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
        ObjectAnimator objectAnimator = this.c;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = this.f;
        objectAnimator.setDuration((long) (linearProgressIndicatorSpec.n * 1800.0f));
        this.d.setDuration((long) (linearProgressIndicatorSpec.n * 1800.0f));
        H();
    }

    @Override // defpackage.y
    public final void x(s80 s80Var) {
        this.j = s80Var;
    }

    @Override // defpackage.y
    public final void y() {
        ObjectAnimator objectAnimator = this.d;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        d();
        if (((mm3) this.a).isVisible()) {
            this.d.setFloatValues(this.i, 1.0f);
            this.d.setDuration((long) ((1.0f - this.i) * 1800.0f));
            this.d.start();
        }
    }
}
