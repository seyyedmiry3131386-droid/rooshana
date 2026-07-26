package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vf9 implements uf9 {
    public final String b;
    public final xy6 c;
    public final xy6 d;

    public vf9(String str) {
        this.b = str;
        this.c = new xy6(str);
        this.d = new xy6(str.concat(" maximum"));
    }

    public final String toString() {
        return this.b;
    }
}
