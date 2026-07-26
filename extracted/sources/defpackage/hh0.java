package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class hh0 {
    public final /* synthetic */ int a = 0;
    public int b;

    public /* synthetic */ hh0() {
    }

    public static String c(int i) {
        return "" + ((char) ((i >> 24) & 255)) + ((char) ((i >> 16) & 255)) + ((char) ((i >> 8) & 255)) + ((char) (i & 255));
    }

    public void b(int i) {
        this.b = i | this.b;
    }

    public boolean d(int i) {
        return (this.b & i) == i;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return c(this.b);
            default:
                return super.toString();
        }
    }

    public hh0(int i) {
        this.b = i;
    }
}
