package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class pn {
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    public static pn c;
    public u67 a;

    public static synchronized pn a() {
        try {
            if (c == null) {
                d();
            }
        } catch (Throwable th) {
            throw th;
        }
        return c;
    }

    public static synchronized PorterDuffColorFilter c(int i, PorterDuff.Mode mode) {
        return u67.h(i, mode);
    }

    public static synchronized void d() {
        if (c == null) {
            pn pnVar = new pn();
            c = pnVar;
            pnVar.a = u67.d();
            c.a.m(new on(0));
        }
    }

    public static void e(Drawable drawable, x11 x11Var, int[] iArr) {
        PorterDuff.Mode mode = u67.h;
        int[] state = drawable.getState();
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z = x11Var.b;
            if (z || x11Var.a) {
                PorterDuffColorFilter porterDuffColorFilterH = null;
                ColorStateList colorStateList = z ? (ColorStateList) x11Var.c : null;
                PorterDuff.Mode mode2 = x11Var.a ? (PorterDuff.Mode) x11Var.d : u67.h;
                if (colorStateList != null && mode2 != null) {
                    porterDuffColorFilterH = u67.h(colorStateList.getColorForState(iArr, 0), mode2);
                }
                drawable.setColorFilter(porterDuffColorFilterH);
            } else {
                drawable.clearColorFilter();
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
            }
        }
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.a.f(context, i);
    }
}
