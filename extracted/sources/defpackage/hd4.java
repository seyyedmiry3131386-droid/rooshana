package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hd4 implements g67, g82 {
    public static final wv8 e = ml9.y(20, new ol3(3));
    public final m58 a = new m58();
    public g67 b;
    public boolean c;
    public boolean d;

    @Override // defpackage.g67
    public final synchronized void a() {
        this.a.a();
        this.d = true;
        if (!this.c) {
            this.b.a();
            this.b = null;
            e.d(this);
        }
    }

    @Override // defpackage.g82
    public final m58 b() {
        return this.a;
    }

    @Override // defpackage.g67
    public final int c() {
        return this.b.c();
    }

    @Override // defpackage.g67
    public final Class d() {
        return this.b.d();
    }

    public final synchronized void e() {
        this.a.a();
        if (!this.c) {
            throw new IllegalStateException("Already unlocked");
        }
        this.c = false;
        if (this.d) {
            a();
        }
    }

    @Override // defpackage.g67
    public final Object get() {
        return this.b.get();
    }
}
