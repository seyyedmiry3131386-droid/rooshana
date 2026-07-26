package defpackage;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* JADX INFO: loaded from: classes.dex */
public final class tq0 extends c77 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    public /* synthetic */ tq0(int i, Object obj) {
        this.n = i;
        this.o = obj;
    }

    @Override // defpackage.c77
    public final void f(int i) {
        switch (this.n) {
            case 0:
                break;
            default:
                zg8 zg8Var = (zg8) this.o;
                zg8Var.e = true;
                yg8 yg8Var = (yg8) zg8Var.f.get();
                if (yg8Var != null) {
                    yg8Var.a();
                }
                break;
        }
    }

    @Override // defpackage.c77
    public final void g(Typeface typeface, boolean z) {
        switch (this.n) {
            case 0:
                Chip chip = (Chip) this.o;
                xq0 xq0Var = chip.e;
                chip.setText(xq0Var.j1 ? xq0Var.O : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
            default:
                if (!z) {
                    zg8 zg8Var = (zg8) this.o;
                    zg8Var.e = true;
                    yg8 yg8Var = (yg8) zg8Var.f.get();
                    if (yg8Var != null) {
                        yg8Var.a();
                    }
                    break;
                }
                break;
        }
    }

    private final void w(int i) {
    }
}
