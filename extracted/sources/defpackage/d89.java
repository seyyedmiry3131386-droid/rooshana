package defpackage;

import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import io.sentry.android.core.t0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class d89 extends e89 {
    public boolean g;

    @Override // defpackage.e89
    public final void e(View view, float f) {
        Method method;
        if (view instanceof MotionLayout) {
            ((MotionLayout) view).setProgress(a(f));
            return;
        }
        if (this.g) {
            return;
        }
        try {
            method = view.getClass().getMethod("setProgress", Float.TYPE);
        } catch (NoSuchMethodException unused) {
            this.g = true;
            method = null;
        }
        if (method != null) {
            try {
                method.invoke(view, Float.valueOf(a(f)));
            } catch (IllegalAccessException e) {
                t0.e("ViewOscillator", "unable to setProgress", e);
            } catch (InvocationTargetException e2) {
                t0.e("ViewOscillator", "unable to setProgress", e2);
            }
        }
    }
}
