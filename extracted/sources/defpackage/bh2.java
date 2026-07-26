package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bh2 {
    public static final bh2 c;
    public static final bh2 d;
    public final /* synthetic */ int a;
    public final String b;

    static {
        int i = 0;
        c = new bh2("VERTICAL", i);
        d = new bh2("HORIZONTAL", i);
    }

    public /* synthetic */ bh2(String str, int i) {
        this.a = i;
        this.b = str;
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
