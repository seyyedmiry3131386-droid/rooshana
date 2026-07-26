package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public abstract class b60 implements g00 {
    public f00 b;
    public f00 c;
    public f00 d;
    public f00 e;
    public ByteBuffer f;
    public ByteBuffer g;
    public boolean h;

    public b60() {
        ByteBuffer byteBuffer = g00.a;
        this.f = byteBuffer;
        this.g = byteBuffer;
        f00 f00Var = f00.e;
        this.d = f00Var;
        this.e = f00Var;
        this.b = f00Var;
        this.c = f00Var;
    }

    public abstract f00 a(f00 f00Var);

    @Override // defpackage.g00
    public boolean b() {
        return this.e != f00.e;
    }

    @Override // defpackage.g00
    public boolean c() {
        return this.h && this.g == g00.a;
    }

    @Override // defpackage.g00
    public ByteBuffer d() {
        ByteBuffer byteBuffer = this.g;
        this.g = g00.a;
        return byteBuffer;
    }

    @Override // defpackage.g00
    public final f00 f(f00 f00Var) {
        this.d = f00Var;
        this.e = a(f00Var);
        return b() ? this.e : f00.e;
    }

    @Override // defpackage.g00
    public final void flush() {
        this.g = g00.a;
        this.h = false;
        this.b = this.d;
        this.c = this.e;
        h();
    }

    @Override // defpackage.g00
    public final void g() {
        this.h = true;
        i();
    }

    public final ByteBuffer k(int i) {
        if (this.f.capacity() < i) {
            this.f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        ByteBuffer byteBuffer = this.f;
        this.g = byteBuffer;
        return byteBuffer;
    }

    @Override // defpackage.g00
    public final void reset() {
        ByteBuffer byteBuffer = g00.a;
        this.g = byteBuffer;
        this.h = false;
        this.f = byteBuffer;
        f00 f00Var = f00.e;
        this.d = f00Var;
        this.e = f00Var;
        this.b = f00Var;
        this.c = f00Var;
        j();
    }

    public void h() {
    }

    public void i() {
    }

    public void j() {
    }
}
