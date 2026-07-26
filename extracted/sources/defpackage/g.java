package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class g {
    public String a;
    public int b;
    public int c;

    public g(String str, int i, int i2, int i3, long j) {
        this.a = str;
        this.c = i;
        this.b = i2;
    }

    public String a(String str) {
        String str2 = this.a;
        String strS = dw1.s(new StringBuilder("["), str.substring(this.b, (str.length() - this.c) + 1), "]");
        if (this.b > 0) {
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.b > 20 ? "..." : "");
            sb2.append(str2.substring(Math.max(0, this.b - 20), this.b));
            sb.append(sb2.toString());
            sb.append(strS);
            strS = sb.toString();
        }
        if (this.c <= 0) {
            return strS;
        }
        StringBuilder sbC = bl4.C(strS);
        int iMin = Math.min((str2.length() - this.c) + 21, str2.length());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str2.substring((str2.length() - this.c) + 1, iMin));
        sb3.append((str2.length() - this.c) + 1 < str2.length() - 20 ? "..." : "");
        sbC.append(sb3.toString());
        return sbC.toString();
    }
}
