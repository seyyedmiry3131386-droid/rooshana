package defpackage;

import android.view.View;
import androidx.recyclerview.widget.o;

/* JADX INFO: loaded from: classes.dex */
public final class ba4 implements rr5 {
    public int a;
    public int b;

    public /* synthetic */ ba4(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public int a() {
        int i = this.b;
        if (i == 2) {
            return 10;
        }
        if (i == 5) {
            return 11;
        }
        if (i == 29) {
            return 12;
        }
        if (i == 42) {
            return 16;
        }
        if (i != 22) {
            return i != 23 ? 0 : 15;
        }
        return 1073741824;
    }

    public void b(o oVar) {
        View view = oVar.a;
        this.a = view.getLeft();
        this.b = view.getTop();
        view.getRight();
        view.getBottom();
    }

    @Override // defpackage.rr5
    public int h(int i) {
        if (i >= 0 && i <= this.b) {
            wn5.j0(i, this.a, i);
        }
        return i;
    }

    @Override // defpackage.rr5
    public int q(int i) {
        if (i >= 0 && i <= this.a) {
            wn5.i0(i, this.b, i);
        }
        return i;
    }
}
