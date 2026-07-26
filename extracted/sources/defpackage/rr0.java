package defpackage;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import com.google.android.material.progressindicator.CircularProgressIndicatorSpec;
import java.util.ArrayList;
import org.pcap4j.packet.namednumber.EtherType;

/* JADX INFO: loaded from: classes.dex */
public final class rr0 extends y {
    public static final w82 k = yk.b;
    public static final int[] l = {0, EtherType.IEEE802_3_MAX_LENGTH, 3000, 4500};
    public static final float[] m = {0.1f, 0.87f};
    public static final mo0 n = new mo0(Float.class, "animationFraction", 10);
    public static final mo0 o = new mo0(Float.class, "completeEndFraction", 11);
    public ObjectAnimator c;
    public ObjectAnimator d;
    public final TimeInterpolator e;
    public final CircularProgressIndicatorSpec f;
    public int g;
    public float h;
    public float i;
    public s80 j;

    public rr0(Context context, CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(1);
        this.g = 0;
        this.j = null;
        this.f = circularProgressIndicatorSpec;
        this.e = ub1.H(context, vp6.motionEasingStandardInterpolator, k);
    }

    @Override // defpackage.y
    public final void D() {
        G();
        this.g = 0;
        ((mw1) ((ArrayList) this.b).get(0)).c = this.f.e[0];
        this.i = 0.0f;
        this.c.start();
    }

    @Override // defpackage.y
    public final void F() {
        this.j = null;
    }

    public final void G() {
        ObjectAnimator objectAnimator = this.c;
        CircularProgressIndicatorSpec circularProgressIndicatorSpec = this.f;
        if (objectAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, n, 0.0f, 1.0f);
            this.c = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (circularProgressIndicatorSpec.n * 6000.0f));
            this.c.setInterpolator(null);
            this.c.setRepeatCount(-1);
            this.c.addListener(new qr0(this, 0));
        }
        if (this.d == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, o, 0.0f, 1.0f);
            this.d = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration((long) (circularProgressIndicatorSpec.n * 500.0f));
            this.d.addListener(new qr0(this, 1));
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
        CircularProgressIndicatorSpec circularProgressIndicatorSpec = this.f;
        objectAnimator.setDuration((long) (circularProgressIndicatorSpec.n * 6000.0f));
        this.d.setDuration((long) (circularProgressIndicatorSpec.n * 500.0f));
        this.g = 0;
        ((mw1) ((ArrayList) this.b).get(0)).c = circularProgressIndicatorSpec.e[0];
        this.i = 0.0f;
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
        if (((mm3) this.a).isVisible()) {
            this.d.start();
        } else {
            d();
        }
    }
}
