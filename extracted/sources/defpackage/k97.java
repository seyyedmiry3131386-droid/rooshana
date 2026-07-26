package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class k97 extends s0 {
    public int c;
    public int d;
    public final /* synthetic */ l97 e;

    public k97(l97 l97Var) {
        this.e = l97Var;
        this.c = l97Var.d;
        this.d = l97Var.c;
    }

    @Override // defpackage.s0
    public final void a() {
        int i = this.c;
        if (i == 0) {
            this.a = 2;
            return;
        }
        l97 l97Var = this.e;
        Object[] objArr = l97Var.a;
        int i2 = this.d;
        this.b = objArr[i2];
        this.a = 1;
        this.d = (i2 + 1) % l97Var.b;
        this.c = i - 1;
    }
}
