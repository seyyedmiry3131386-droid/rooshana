package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import io.sentry.android.core.t0;

/* JADX INFO: loaded from: classes.dex */
public abstract class rk8 {
    public static final ThreadLocal a = new ThreadLocal();
    public static final int[] b = {-16842910};
    public static final int[] c = {R.attr.state_focused};
    public static final int[] d = {R.attr.state_pressed};
    public static final int[] e = {R.attr.state_checked};
    public static final int[] f = new int[0];
    public static final int[] g = new int[1];

    public static void a(View view, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(lu6.AppCompatTheme);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(lu6.AppCompatTheme_windowActionBar)) {
                t0.d("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i) {
        ColorStateList colorStateListD = d(context, i);
        if (colorStateListD != null && colorStateListD.isStateful()) {
            return colorStateListD.getColorForState(b, colorStateListD.getDefaultColor());
        }
        ThreadLocal threadLocal = a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f2 = typedValue.getFloat();
        return sv0.e(c(context, i), Math.round(Color.alpha(r4) * f2));
    }

    public static int c(Context context, int i) {
        int[] iArr = g;
        iArr[0] = i;
        sk6 sk6VarC = sk6.C(context, null, iArr);
        try {
            return ((TypedArray) sk6VarC.c).getColor(0, 0);
        } finally {
            sk6VarC.G();
        }
    }

    public static ColorStateList d(Context context, int i) {
        int[] iArr = g;
        iArr[0] = i;
        sk6 sk6VarC = sk6.C(context, null, iArr);
        try {
            return sk6VarC.t(0);
        } finally {
            sk6VarC.G();
        }
    }
}
