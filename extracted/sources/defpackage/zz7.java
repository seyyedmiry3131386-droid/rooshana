package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class zz7 extends uz6 {
    public boolean a = false;
    public final /* synthetic */ a08 b;

    public zz7(a08 a08Var) {
        this.b = a08Var;
    }

    @Override // defpackage.uz6
    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0 && this.a) {
            this.a = false;
            this.b.f();
        }
    }

    @Override // defpackage.uz6
    public final void b(RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        this.a = true;
    }
}
