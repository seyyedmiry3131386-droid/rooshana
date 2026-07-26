package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class g69 implements View.OnApplyWindowInsetsListener {
    public lf9 a = null;
    public final /* synthetic */ View b;
    public final /* synthetic */ ms5 c;

    public g69(View view, ms5 ms5Var) {
        this.b = view;
        this.c = ms5Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        lf9 lf9VarH = lf9.h(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        ms5 ms5Var = this.c;
        if (i < 30) {
            h69.a(windowInsets, this.b);
            if (lf9VarH.equals(this.a)) {
                return ms5Var.q(view, lf9VarH).g();
            }
        }
        this.a = lf9VarH;
        lf9 lf9VarQ = ms5Var.q(view, lf9VarH);
        if (i >= 30) {
            return lf9VarQ.g();
        }
        WeakHashMap weakHashMap = q69.a;
        f69.c(view);
        return lf9VarQ.g();
    }
}
