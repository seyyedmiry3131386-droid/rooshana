package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class no5 implements hr8 {
    public final ax a;
    public final ti3 b;

    public no5(ax axVar, ti3 ti3Var) {
        this.a = axVar;
        this.b = ti3Var;
    }

    @Override // defpackage.hr8
    public final void a() {
        ti3 ti3Var = this.b;
        boolean z = ti3Var instanceof ib8;
        ax axVar = this.a;
        if (z) {
            wh3 wh3Var = ((ib8) ti3Var).a;
            axVar.getClass();
        } else {
            if (!(ti3Var instanceof p32)) {
                throw new NoWhenBranchMatchedException();
            }
            wh3 wh3Var2 = ((p32) ti3Var).a;
            axVar.getClass();
        }
    }
}
