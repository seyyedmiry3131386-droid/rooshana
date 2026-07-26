package defpackage;

import androidx.lifecycle.Lifecycle$State;

/* JADX INFO: loaded from: classes.dex */
public final class bz0 implements g64 {
    public final i64 a = new i64(this, true);
    public Lifecycle$State b;
    public Lifecycle$State c;

    public bz0() {
        Lifecycle$State lifecycle$State = Lifecycle$State.b;
        this.b = lifecycle$State;
        this.c = lifecycle$State;
    }

    @Override // defpackage.g64
    public final i64 D() {
        return this.a;
    }

    public final void a() {
        Lifecycle$State lifecycle$State = this.b.ordinal() < this.c.ordinal() ? this.b : this.c;
        i64 i64Var = this.a;
        if (i64Var.d == Lifecycle$State.b && lifecycle$State == Lifecycle$State.a) {
            return;
        }
        i64Var.g(lifecycle$State);
    }
}
