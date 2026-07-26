package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class pe9 extends te9 {
    public static final PathInterpolator e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final w82 f = new w82(0);
    public static final DecelerateInterpolator g = new DecelerateInterpolator(1.5f);
    public static final AccelerateInterpolator h = new AccelerateInterpolator(1.5f);

    public static void f(View view, ue9 ue9Var) {
        mu0 mu0VarK = k(view);
        if (mu0VarK != null) {
            mu0VarK.g(ue9Var);
            if (mu0VarK.a == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(viewGroup.getChildAt(i), ue9Var);
            }
        }
    }

    public static void g(View view, ue9 ue9Var, lf9 lf9Var, boolean z) {
        mu0 mu0VarK = k(view);
        if (mu0VarK != null) {
            mu0VarK.b = lf9Var;
            if (!z) {
                mu0VarK.h(ue9Var);
                z = mu0VarK.a == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), ue9Var, lf9Var, z);
            }
        }
    }

    public static void h(View view, lf9 lf9Var, List list) {
        mu0 mu0VarK = k(view);
        if (mu0VarK != null) {
            lf9Var = mu0VarK.i(lf9Var, list);
            if (mu0VarK.a == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                h(viewGroup.getChildAt(i), lf9Var, list);
            }
        }
    }

    public static void i(View view, ue9 ue9Var, rn6 rn6Var) {
        mu0 mu0VarK = k(view);
        if (mu0VarK != null) {
            mu0VarK.j(ue9Var, rn6Var);
            if (mu0VarK.a == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                i(viewGroup.getChildAt(i), ue9Var, rn6Var);
            }
        }
    }

    public static WindowInsets j(View view, WindowInsets windowInsets) {
        return view.getTag(xr6.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static mu0 k(View view) {
        Object tag = view.getTag(xr6.tag_window_insets_animation_callback);
        if (tag instanceof oe9) {
            return ((oe9) tag).a;
        }
        return null;
    }
}
