package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ch2 {
    public static final ch2 c;
    public static final ch2 d;
    public final /* synthetic */ int a;
    public final String b;

    static {
        int i = 0;
        c = new ch2("FLAT", i);
        d = new ch2("HALF_OPENED", i);
    }

    public /* synthetic */ ch2(String str, int i) {
        this.a = i;
        this.b = str;
    }

    public static ch2 a(h26 h26Var) {
        String str;
        h26Var.K(2);
        int iX = h26Var.x();
        int i = iX >> 1;
        int iX2 = ((h26Var.x() >> 3) & 31) | ((iX & 1) << 5);
        if (i == 4 || i == 5 || i == 7 || i == 8) {
            str = "dvhe";
        } else if (i == 9) {
            str = "dvav";
        } else {
            if (i != 10) {
                return null;
            }
            str = "dav1";
        }
        StringBuilder sbC = bl4.C(str);
        sbC.append(i < 10 ? ".0" : ".");
        sbC.append(i);
        return new ch2(rm7.o(iX2, iX2 < 10 ? ".0" : ".", sbC), 1);
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return this.b;
            default:
                return super.toString();
        }
    }
}
