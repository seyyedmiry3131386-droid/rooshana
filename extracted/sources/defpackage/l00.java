package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ l00(Object obj, String str, long j, long j2, int i) {
        this.a = i;
        this.e = obj;
        this.b = str;
        this.c = j;
        this.d = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        n00 n00Var = (n00) this.e;
        switch (i) {
            case 0:
                b62 b62Var = n00Var.c;
                String str = j29.a;
                hd1 hd1Var = b62Var.a.s;
                be beVarA0 = hd1Var.a0();
                hd1Var.b0(beVarA0, 1008, new sc1(beVarA0, this.b, this.d, this.c, 1));
                break;
            default:
                b62 b62Var2 = n00Var.c;
                String str2 = j29.a;
                hd1 hd1Var2 = b62Var2.a.s;
                be beVarA02 = hd1Var2.a0();
                hd1Var2.b0(beVarA02, 1016, new sc1(beVarA02, this.b, this.d, this.c, 3));
                break;
        }
    }
}
