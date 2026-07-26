package defpackage;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: loaded from: classes.dex */
public class of9 extends sa7 {
    public final WindowInsetsController b;
    public final hl5 c;
    public final Window d;

    public of9(WindowInsetsController windowInsetsController, hl5 hl5Var) {
        this.b = windowInsetsController;
        this.c = hl5Var;
    }

    @Override // defpackage.sa7
    public final void g(int i) {
        if ((i & 8) != 0) {
            ((ck4) this.c.b).g();
        }
        this.b.hide(i & (-9));
    }

    @Override // defpackage.sa7
    public boolean i() {
        this.b.setSystemBarsAppearance(0, 0);
        return (this.b.getSystemBarsAppearance() & 8) != 0;
    }

    @Override // defpackage.sa7
    public final void l(boolean z) {
        Window window = this.d;
        if (z) {
            if (window != null) {
                u(16);
            }
            this.b.setSystemBarsAppearance(16, 16);
        } else {
            if (window != null) {
                v(16);
            }
            this.b.setSystemBarsAppearance(0, 16);
        }
    }

    @Override // defpackage.sa7
    public final void m(boolean z) {
        Window window = this.d;
        if (z) {
            if (window != null) {
                u(8192);
            }
            this.b.setSystemBarsAppearance(8, 8);
        } else {
            if (window != null) {
                v(8192);
            }
            this.b.setSystemBarsAppearance(0, 8);
        }
    }

    @Override // defpackage.sa7
    public void n() {
        Window window = this.d;
        if (window == null) {
            this.b.setSystemBarsBehavior(2);
            return;
        }
        window.getDecorView().setTag(356039078, 2);
        v(2048);
        u(4096);
    }

    @Override // defpackage.sa7
    public final void o(int i) {
        if ((i & 8) != 0) {
            ((ck4) this.c.b).z();
        }
        this.b.show(i & (-9));
    }

    public final void u(int i) {
        View decorView = this.d.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    public final void v(int i) {
        View decorView = this.d.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }

    public of9(Window window, hl5 hl5Var) {
        this(window.getInsetsController(), hl5Var);
        this.d = window;
    }
}
