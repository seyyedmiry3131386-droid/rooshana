package defpackage;

import com.bumptech.glide.load.engine.b;

/* JADX INFO: loaded from: classes.dex */
public final class i22 implements g67 {
    public final boolean a;
    public final boolean b;
    public final g67 c;
    public final h22 d;
    public final sx3 e;
    public int f;
    public boolean g;

    public i22(g67 g67Var, boolean z, boolean z2, sx3 sx3Var, h22 h22Var) {
        ok4.p(g67Var, "Argument must not be null");
        this.c = g67Var;
        this.a = z;
        this.b = z2;
        this.e = sx3Var;
        ok4.p(h22Var, "Argument must not be null");
        this.d = h22Var;
    }

    @Override // defpackage.g67
    public final synchronized void a() {
        if (this.f > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.g) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.g = true;
        if (this.b) {
            this.c.a();
        }
    }

    public final synchronized void b() {
        if (this.g) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f++;
    }

    @Override // defpackage.g67
    public final int c() {
        return this.c.c();
    }

    @Override // defpackage.g67
    public final Class d() {
        return this.c.d();
    }

    public final void e() {
        boolean z;
        synchronized (this) {
            int i = this.f;
            if (i <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z = true;
            int i2 = i - 1;
            this.f = i2;
            if (i2 != 0) {
                z = false;
            }
        }
        if (z) {
            ((b) this.d).e(this.e, this);
        }
    }

    @Override // defpackage.g67
    public final Object get() {
        return this.c.get();
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.a + ", listener=" + this.d + ", key=" + this.e + ", acquired=" + this.f + ", isRecycled=" + this.g + ", resource=" + this.c + '}';
    }
}
