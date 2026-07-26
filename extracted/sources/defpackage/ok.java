package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ok {
    public static final ThreadLocal i = new ThreadLocal();
    public final do3 e;
    public mk h;
    public final fw7 a = new fw7(0);
    public final ArrayList b = new ArrayList();
    public final r79 c = new r79(4, this);
    public final b7 d = new b7(3, this);
    public boolean f = false;
    public float g = 1.0f;

    public ok(do3 do3Var) {
        this.e = do3Var;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [android.animation.ValueAnimator$DurationScaleChangeListener, lk] */
    public final void a(l38 l38Var) {
        ArrayList arrayList = this.b;
        if (arrayList.size() == 0) {
            ((Choreographer) this.e.a).postFrameCallback(new nk(this.d, 0));
            if (Build.VERSION.SDK_INT >= 33) {
                this.g = ValueAnimator.getDurationScale();
                if (this.h == null) {
                    this.h = new mk(this);
                }
                final mk mkVar = this.h;
                if (mkVar.a == null) {
                    ?? r2 = new ValueAnimator.DurationScaleChangeListener() { // from class: lk
                        @Override // android.animation.ValueAnimator.DurationScaleChangeListener
                        public final void onChanged(float f) {
                            mkVar.b.g = f;
                        }
                    };
                    mkVar.a = r2;
                    ValueAnimator.registerDurationScaleChangeListener(r2);
                }
            }
        }
        if (arrayList.contains(l38Var)) {
            return;
        }
        arrayList.add(l38Var);
    }
}
