package defpackage;

import ir.myket.network.server.c;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class vd1 implements dl0 {
    public final /* synthetic */ int a = 1;
    public final dl0 b;
    public final Object c;

    public vd1(dl0 dl0Var, c cVar) {
        this.b = dl0Var;
        this.c = cVar;
    }

    @Override // defpackage.dl0
    public final w47 b1() {
        switch (this.a) {
            case 0:
                return this.b.b1();
            default:
                w47 w47VarB1 = this.b.b1();
                js3.o(w47VarB1, "request(...)");
                return w47VarB1;
        }
    }

    @Override // defpackage.dl0
    public final void cancel() {
        switch (this.a) {
            case 0:
                this.b.cancel();
                break;
            default:
                this.b.cancel();
                break;
        }
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ Object m53clone() {
        switch (this.a) {
        }
        return clone();
    }

    @Override // defpackage.dl0
    public final void l0(il0 il0Var) {
        switch (this.a) {
            case 0:
                this.b.l0(new qq4((Object) this, (Object) il0Var, false));
                break;
            default:
                c cVar = (c) this.c;
                o77 o77Var = new o77();
                dl0 dl0Var = this.b;
                o77Var.a = dl0Var;
                o77Var.b = il0Var;
                o77Var.c = cVar;
                o77Var.d = new AtomicBoolean(true);
                dl0Var.l0(o77Var);
                break;
        }
    }

    @Override // defpackage.dl0
    public final boolean r0() {
        switch (this.a) {
        }
        return this.b.r0();
    }

    @Override // defpackage.dl0
    public final dl0 clone() {
        switch (this.a) {
            case 0:
                return new vd1((Executor) this.c, this.b.clone());
            default:
                return new vd1(this.b.clone(), (c) this.c);
        }
    }

    public vd1(Executor executor, dl0 dl0Var) {
        this.c = executor;
        this.b = dl0Var;
    }
}
