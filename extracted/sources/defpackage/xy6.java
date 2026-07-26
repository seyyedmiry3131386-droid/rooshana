package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xy6 implements wy6 {
    public final String a;
    public final sc3 b = new sc3(1, null);
    public final sc3 c = new sc3(0, null);
    public final sc3 d = new sc3(1, null);
    public final sc3 e = new sc3(0, null);

    public xy6(String str) {
        this.a = str;
    }

    @Override // defpackage.wy6
    public final sc3 a() {
        return this.e;
    }

    @Override // defpackage.wy6
    public final sc3 b() {
        return this.b;
    }

    @Override // defpackage.wy6
    public final sc3 c() {
        return this.c;
    }

    @Override // defpackage.wy6
    public final sc3 d() {
        return this.d;
    }

    public final String toString() {
        String str = this.a;
        return str != null ? rm7.m(')', "RectRulers(", str) : super.toString();
    }
}
