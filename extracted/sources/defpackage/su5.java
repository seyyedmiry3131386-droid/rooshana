package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class su5 extends ri2 {
    public static final su5 e;
    public static final su5 f;
    public static final su5 g;
    public static final su5 h;
    public final /* synthetic */ int d;

    static {
        int i = 1;
        e = new su5(i, 2, 0);
        int i2 = 1;
        f = new su5(i2, i2, 1);
        g = new su5(i, 2, 2);
        int i3 = 1;
        h = new su5(i3, i3, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ su5(int i, int i2, int i3) {
        super(i, i2, 1, (byte) 0);
        this.d = i3;
    }

    @Override // defpackage.ri2
    public final void a(vl1 vl1Var, ou ouVar, fz7 fz7Var, l37 l37Var, lv5 lv5Var) {
        switch (this.d) {
            case 0:
                Object objInvoke = ((bp2) vl1Var.e(0)).invoke();
                ge geVar = (ge) vl1Var.e(1);
                int iD = vl1Var.d(0);
                geVar.getClass();
                fz7Var.X(fz7Var.c(geVar), objInvoke);
                ouVar.m(iD, objInvoke);
                ouVar.c(objInvoke);
                break;
            case 1:
                ge geVar2 = (ge) vl1Var.e(0);
                int iD2 = vl1Var.d(0);
                ouVar.j();
                geVar2.getClass();
                ouVar.b(iD2, fz7Var.E(fz7Var.c(geVar2)));
                break;
            case 2:
                Object objE = vl1Var.e(0);
                ge geVar3 = (ge) vl1Var.e(1);
                int iD3 = vl1Var.d(0);
                if (objE instanceof n37) {
                    n37 n37Var = (n37) objE;
                    ((zb5) l37Var.e).b(n37Var);
                    ((sb5) l37Var.h).d(n37Var);
                }
                Object objM = fz7Var.M(fz7Var.c(geVar3), iD3, objE);
                if (objM instanceof n37) {
                    l37Var.f((n37) objM);
                } else if (objM instanceof my6) {
                    ((my6) objM).d();
                }
                break;
            default:
                Object objE2 = vl1Var.e(0);
                int iD4 = vl1Var.d(0);
                if (objE2 instanceof n37) {
                    n37 n37Var2 = (n37) objE2;
                    ((zb5) l37Var.e).b(n37Var2);
                    ((sb5) l37Var.h).d(n37Var2);
                }
                Object objM2 = fz7Var.M(fz7Var.t, iD4, objE2);
                if (objM2 instanceof n37) {
                    l37Var.f((n37) objM2);
                } else if (objM2 instanceof my6) {
                    ((my6) objM2).d();
                }
                break;
        }
    }

    @Override // defpackage.ri2
    public ge b(vl1 vl1Var) {
        switch (this.d) {
            case 0:
                return (ge) vl1Var.e(1);
            case 1:
                return (ge) vl1Var.e(0);
            default:
                return super.b(vl1Var);
        }
    }
}
