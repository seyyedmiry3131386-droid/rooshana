package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class g81 {
    public final /* synthetic */ int a = 0;
    public String b;
    public String c;

    public /* synthetic */ g81() {
    }

    public String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder("CssProperty{key='");
                sb.append(this.b);
                sb.append("', value='");
                return dw1.s(sb, this.c, "'}");
            default:
                return super.toString();
        }
    }

    public g81(String str, String str2) {
        js3.p(str, "movieId");
        js3.p(str2, "movieType");
        this.b = str;
        this.c = str2;
    }
}
