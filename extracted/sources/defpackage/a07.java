package defpackage;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.k;
import io.sentry.android.core.t0;

/* JADX INFO: loaded from: classes.dex */
public abstract class a07 {
    public int a = -1;
    public RecyclerView b;
    public k c;
    public boolean d;
    public boolean e;
    public View f;
    public final yz6 g;
    public boolean h;

    public a07() {
        yz6 yz6Var = new yz6();
        yz6Var.d = -1;
        yz6Var.f = false;
        yz6Var.g = 0;
        yz6Var.a = 0;
        yz6Var.b = 0;
        yz6Var.c = Integer.MIN_VALUE;
        yz6Var.e = null;
        this.g = yz6Var;
    }

    public PointF a(int i) {
        Object obj = this.c;
        if (obj instanceof zz6) {
            return ((zz6) obj).b(i);
        }
        t0.m("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + zz6.class.getCanonicalName());
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(int r9, int r10) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a07.b(int, int):void");
    }

    public abstract void c(View view, b07 b07Var, yz6 yz6Var);

    public final void d() {
        if (this.e) {
            this.e = false;
            d dVar = (d) this;
            dVar.p = 0;
            dVar.o = 0;
            dVar.k = null;
            this.b.E0.a = -1;
            this.f = null;
            this.a = -1;
            this.d = false;
            k kVar = this.c;
            if (kVar.e == this) {
                kVar.e = null;
            }
            this.c = null;
            this.b = null;
        }
    }
}
