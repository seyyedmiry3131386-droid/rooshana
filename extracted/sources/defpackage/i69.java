package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public abstract class i69 {
    public static lf9 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        lf9 lf9VarH = lf9.h(null, rootWindowInsets);
        if9 if9Var = lf9VarH.a;
        if9Var.t(lf9VarH);
        if9Var.d(view.getRootView());
        return lf9VarH;
    }

    public static void b(View view, int i, int i2) {
        view.setScrollIndicators(i, i2);
    }
}
