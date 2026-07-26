package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public abstract class h69 {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(xr6.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static lf9 b(View view, lf9 lf9Var, Rect rect) {
        WindowInsets windowInsetsG = lf9Var.g();
        if (windowInsetsG != null) {
            return lf9.h(view, view.computeSystemWindowInsets(windowInsetsG, rect));
        }
        rect.setEmpty();
        return lf9Var;
    }

    public static ColorStateList c(View view) {
        return view.getBackgroundTintList();
    }

    public static PorterDuff.Mode d(View view) {
        return view.getBackgroundTintMode();
    }

    public static float e(View view) {
        return view.getElevation();
    }

    public static String f(View view) {
        return view.getTransitionName();
    }

    public static float g(View view) {
        return view.getTranslationZ();
    }

    public static float h(View view) {
        return view.getZ();
    }

    public static boolean i(View view) {
        return view.isNestedScrollingEnabled();
    }

    public static void j(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void k(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void l(View view, float f) {
        view.setElevation(f);
    }

    public static void m(View view, ms5 ms5Var) {
        g69 g69Var = ms5Var != null ? new g69(view, ms5Var) : null;
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(xr6.tag_on_apply_window_listener, g69Var);
        }
        if (view.getTag(xr6.tag_compat_insets_dispatch) != null) {
            return;
        }
        if (g69Var != null) {
            view.setOnApplyWindowInsetsListener(g69Var);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(xr6.tag_window_insets_animation_callback));
        }
    }

    public static void n(View view, String str) {
        view.setTransitionName(str);
    }

    public static void o(View view, float f) {
        view.setTranslationZ(f);
    }

    public static void p(View view) {
        view.stopNestedScroll();
    }
}
