package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: loaded from: classes.dex */
public final class qf9 {
    public final sa7 a;

    public qf9(WindowInsetsController windowInsetsController) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.a = new pf9(windowInsetsController, new hl5(windowInsetsController));
        } else {
            this.a = new of9(windowInsetsController, new hl5(windowInsetsController));
        }
    }

    public qf9(Window window, View view) {
        hl5 hl5Var = new hl5(view);
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.a = new pf9(window, hl5Var);
            return;
        }
        if (i >= 30) {
            this.a = new of9(window, hl5Var);
        } else if (i >= 26) {
            this.a = new nf9(window, hl5Var);
        } else {
            this.a = new mf9(window, hl5Var);
        }
    }
}
