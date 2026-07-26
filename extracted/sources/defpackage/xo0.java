package defpackage;

import android.os.Build;
import android.view.View;
import androidx.transition.Transition;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class xo0 extends pr8 {
    public final /* synthetic */ int a = 0;
    public Object b;
    public Object c;

    public /* synthetic */ xo0() {
    }

    @Override // defpackage.pr8, defpackage.gr8
    public void a() {
        switch (this.a) {
            case 0:
                ((ks2) this.c).setVisibility(4);
                break;
        }
    }

    @Override // defpackage.pr8, defpackage.gr8
    public final void d(Transition transition) {
        switch (this.a) {
            case 0:
                transition.C(this);
                View view = (View) this.b;
                if (Build.VERSION.SDK_INT == 28) {
                    if (!r79.i) {
                        try {
                            if (!r79.e) {
                                try {
                                    r79.d = Class.forName("android.view.GhostView");
                                    break;
                                } catch (ClassNotFoundException unused) {
                                }
                                r79.e = true;
                            }
                            Method declaredMethod = r79.d.getDeclaredMethod("removeGhost", View.class);
                            r79.h = declaredMethod;
                            declaredMethod.setAccessible(true);
                            break;
                        } catch (NoSuchMethodException unused2) {
                        }
                        r79.i = true;
                    }
                    Method method = r79.h;
                    if (method != null) {
                        try {
                            method.invoke(null, view);
                            break;
                        } catch (IllegalAccessException unused3) {
                        } catch (InvocationTargetException e) {
                            throw new RuntimeException(e.getCause());
                        }
                    }
                } else {
                    int i = ms2.g;
                    ms2 ms2Var = (ms2) view.getTag(nr6.ghost_view);
                    if (ms2Var != null) {
                        int i2 = ms2Var.d - 1;
                        ms2Var.d = i2;
                        if (i2 <= 0) {
                            ((ls2) ms2Var.getParent()).removeView(ms2Var);
                        }
                    }
                }
                view.setTag(nr6.transition_transform, null);
                view.setTag(nr6.parent_matrix, null);
                return;
            default:
                ((ArrayList) ((wv) this.b).get(((qr8) this.c).b)).remove(transition);
                transition.C(this);
                return;
        }
    }

    @Override // defpackage.pr8, defpackage.gr8
    public void g() {
        switch (this.a) {
            case 0:
                ((ks2) this.c).setVisibility(0);
                break;
        }
    }

    public xo0(qr8 qr8Var, wv wvVar) {
        this.c = qr8Var;
        this.b = wvVar;
    }
}
