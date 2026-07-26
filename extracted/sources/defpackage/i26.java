package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class i26 {
    public final /* synthetic */ int a = 0;
    public String b;
    public int c;

    public /* synthetic */ i26() {
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return this.c + ": " + this.b;
            default:
                return super.toString();
        }
    }

    public i26(int i, String str, Object[] objArr) {
        this.b = String.format(str, objArr);
        this.c = i;
    }

    public i26(String str, int i) {
        this.b = str;
        this.c = i;
    }
}
