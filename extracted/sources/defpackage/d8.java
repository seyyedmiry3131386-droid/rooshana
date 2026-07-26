package defpackage;

import androidx.compose.ui.viewinterop.AndroidViewHolder;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bp2 b;

    public /* synthetic */ d8(int i, bp2 bp2Var) {
        this.a = i;
        this.b = bp2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        bp2 bp2Var = this.b;
        switch (i) {
            case 0:
                bp2Var.invoke();
                break;
            case 1:
                bp2Var.invoke();
                break;
            case 2:
                bp2Var.invoke();
                break;
            case 3:
                dp2 dp2Var = AndroidViewHolder.A;
                bp2Var.invoke();
                break;
            case 4:
                bp2Var.invoke();
                break;
            default:
                bp2Var.invoke();
                break;
        }
    }
}
