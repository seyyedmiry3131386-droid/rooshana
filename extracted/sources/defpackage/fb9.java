package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fb9 implements bx4 {
    public static volatile l37 c;
    public final /* synthetic */ int a;
    public final Object b;

    public fb9(l37 l37Var) {
        this.a = 0;
        this.b = l37Var;
    }

    @Override // defpackage.bx4
    public final ax4 a(vp7 vp7Var) {
        switch (this.a) {
            case 0:
                return new xi0(3, (l37) this.b);
            case 1:
                return new xi0(1, (av) this.b);
            default:
                return new le3((ql4) this.b);
        }
    }

    public fb9(int i) {
        this.a = i;
        switch (i) {
            case 2:
                this.b = new ql4(28);
                break;
            default:
                this.b = new av(11);
                break;
        }
    }
}
