package defpackage;

import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public class mf9 extends sa7 {
    public final Window b;
    public final hl5 c;

    public mf9(Window window, hl5 hl5Var) {
        this.b = window;
        this.c = hl5Var;
    }

    @Override // defpackage.sa7
    public final void g(int i) {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                if (i2 == 1) {
                    u(4);
                } else if (i2 == 2) {
                    u(2);
                } else if (i2 == 8) {
                    ((ck4) this.c.b).g();
                }
            }
        }
    }

    @Override // defpackage.sa7
    public final boolean i() {
        return (this.b.getDecorView().getSystemUiVisibility() & 8192) != 0;
    }

    @Override // defpackage.sa7
    public final void m(boolean z) {
        if (!z) {
            v(8192);
            return;
        }
        Window window = this.b;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        u(8192);
    }

    @Override // defpackage.sa7
    public final void n() {
        this.b.getDecorView().setTag(356039078, 2);
        v(2048);
        u(4096);
    }

    @Override // defpackage.sa7
    public final void o(int i) {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                if (i2 == 1) {
                    v(4);
                    this.b.clearFlags(1024);
                } else if (i2 == 2) {
                    v(2);
                } else if (i2 == 8) {
                    ((ck4) this.c.b).z();
                }
            }
        }
    }

    public final void u(int i) {
        View decorView = this.b.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    public final void v(int i) {
        View decorView = this.b.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }
}
