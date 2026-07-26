package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n00 b;
    public final /* synthetic */ o00 c;

    public /* synthetic */ k00(n00 n00Var, o00 o00Var, int i) {
        this.a = i;
        this.b = n00Var;
        this.c = o00Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        final o00 o00Var = this.c;
        n00 n00Var = this.b;
        switch (i) {
            case 0:
                b62 b62Var = n00Var.c;
                String str = j29.a;
                hd1 hd1Var = b62Var.a.s;
                final be beVarA0 = hd1Var.a0();
                final int i2 = 1;
                hd1Var.b0(beVarA0, 1032, new q94() { // from class: fd1
                    @Override // defpackage.q94
                    public final void invoke(Object obj) {
                        switch (i2) {
                            case 0:
                                ((ce) obj).q(beVarA0, o00Var);
                                break;
                            default:
                                ((ce) obj).w(beVarA0, o00Var);
                                break;
                        }
                    }
                });
                break;
            default:
                b62 b62Var2 = n00Var.c;
                String str2 = j29.a;
                hd1 hd1Var2 = b62Var2.a.s;
                final be beVarA02 = hd1Var2.a0();
                final int i3 = 0;
                hd1Var2.b0(beVarA02, 1031, new q94() { // from class: fd1
                    @Override // defpackage.q94
                    public final void invoke(Object obj) {
                        switch (i3) {
                            case 0:
                                ((ce) obj).q(beVarA02, o00Var);
                                break;
                            default:
                                ((ce) obj).w(beVarA02, o00Var);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
