package defpackage;

import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import io.sentry.android.core.t0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class t99 extends u99 {
    public boolean k;

    @Override // defpackage.u99
    public final boolean d(float f, long j, wx3 wx3Var, View view) {
        Method method;
        t99 t99Var;
        float fB;
        if (view instanceof MotionLayout) {
            float fB2 = b(f, j, wx3Var, view);
            t99Var = this;
            ((MotionLayout) view).setProgress(fB2);
        } else {
            if (this.k) {
                return false;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.k = true;
                method = null;
            }
            if (method != null) {
                try {
                    fB = b(f, j, wx3Var, view);
                    t99Var = this;
                } catch (IllegalAccessException e) {
                    e = e;
                    t99Var = this;
                } catch (InvocationTargetException e2) {
                    e = e2;
                    t99Var = this;
                }
                try {
                    method.invoke(view, Float.valueOf(fB));
                } catch (IllegalAccessException e3) {
                    e = e3;
                    t0.e("ViewTimeCycle", "unable to setProgress", e);
                } catch (InvocationTargetException e4) {
                    e = e4;
                    t0.e("ViewTimeCycle", "unable to setProgress", e);
                }
            } else {
                t99Var = this;
            }
        }
        return t99Var.h;
    }
}
