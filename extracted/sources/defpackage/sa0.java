package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class sa0 extends fc1 {
    public long j;
    public int k;
    public int l;

    @Override // defpackage.fc1
    public final void f() {
        super.f();
        this.k = 0;
    }

    public final boolean l(fc1 fc1Var) {
        ByteBuffer byteBuffer;
        vy2.j(!fc1Var.d(1073741824));
        vy2.j(!fc1Var.d(268435456));
        vy2.j(!fc1Var.d(4));
        if (m()) {
            if (this.k >= this.l) {
                return false;
            }
            ByteBuffer byteBuffer2 = fc1Var.e;
            if (byteBuffer2 != null && (byteBuffer = this.e) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i = this.k;
        this.k = i + 1;
        if (i == 0) {
            this.g = fc1Var.g;
            if (fc1Var.d(1)) {
                this.b = 1;
            }
        }
        ByteBuffer byteBuffer3 = fc1Var.e;
        if (byteBuffer3 != null) {
            i(byteBuffer3.remaining());
            this.e.put(byteBuffer3);
        }
        this.j = fc1Var.g;
        return true;
    }

    public final boolean m() {
        return this.k > 0;
    }
}
