package defpackage;

import java.util.ArrayDeque;
import kotlinx.coroutines.android.a;

/* JADX INFO: loaded from: classes.dex */
public final class y36 extends y61 {
    public final pp1 c = new pp1(0);

    @Override // defpackage.y61
    public final boolean D0(w61 w61Var) {
        js3.p(w61Var, "context");
        ug1 ug1Var = up1.a;
        if (sg4.a.f.D0(w61Var)) {
            return true;
        }
        pp1 pp1Var = this.c;
        return !(pp1Var.b || !pp1Var.a);
    }

    @Override // defpackage.y61
    public final void U(w61 w61Var, Runnable runnable) {
        js3.p(w61Var, "context");
        js3.p(runnable, "block");
        pp1 pp1Var = this.c;
        pp1Var.getClass();
        ug1 ug1Var = up1.a;
        a aVar = sg4.a.f;
        if (aVar.D0(w61Var) || pp1Var.b || !pp1Var.a) {
            aVar.U(w61Var, new g7(pp1Var, runnable, 19));
        } else {
            if (!((ArrayDeque) pp1Var.d).offer(runnable)) {
                throw new IllegalStateException("cannot enqueue any more runnables");
            }
            pp1Var.a();
        }
    }
}
