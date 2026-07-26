package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class kz6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ RecyclerView b;

    public /* synthetic */ kz6(RecyclerView recyclerView, int i) {
        this.a = i;
        this.b = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                RecyclerView recyclerView = this.b;
                if (recyclerView.u && !recyclerView.isLayoutRequested()) {
                    if (!recyclerView.s) {
                        recyclerView.requestLayout();
                    } else if (!recyclerView.x) {
                        recyclerView.p();
                    } else {
                        recyclerView.w = true;
                    }
                    break;
                }
                break;
            default:
                RecyclerView recyclerView2 = this.b;
                qz6 qz6Var = recyclerView2.M;
                if (qz6Var != null) {
                    qz6Var.h();
                }
                recyclerView2.K0 = false;
                break;
        }
    }
}
