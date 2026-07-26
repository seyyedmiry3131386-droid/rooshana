package defpackage;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class ys8 extends b60 {
    public int i;
    public int j;
    public boolean k;
    public int l;
    public byte[] m;
    public int n;
    public long o;

    @Override // defpackage.b60
    public final f00 a(f00 f00Var) throws AudioProcessor$UnhandledAudioFormatException {
        if (!j29.Q(f00Var.c)) {
            throw new AudioProcessor$UnhandledAudioFormatException(f00Var);
        }
        this.k = true;
        return (this.i == 0 && this.j == 0) ? f00.e : f00Var;
    }

    @Override // defpackage.b60, defpackage.g00
    public final boolean c() {
        return super.c() && this.n == 0;
    }

    @Override // defpackage.b60, defpackage.g00
    public final ByteBuffer d() {
        int i;
        if (super.c() && (i = this.n) > 0) {
            k(i).put(this.m, 0, this.n).flip();
            this.n = 0;
        }
        return super.d();
    }

    @Override // defpackage.g00
    public final void e(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        if (i == 0) {
            return;
        }
        int iMin = Math.min(i, this.l);
        this.o += (long) (iMin / this.b.d);
        this.l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.l > 0) {
            return;
        }
        int i2 = i - iMin;
        int length = (this.n + i2) - this.m.length;
        ByteBuffer byteBufferK = k(length);
        int i3 = j29.i(length, 0, this.n);
        byteBufferK.put(this.m, 0, i3);
        int i4 = j29.i(length - i3, 0, i2);
        byteBuffer.limit(byteBuffer.position() + i4);
        byteBufferK.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i5 = i2 - i4;
        int i6 = this.n - i3;
        this.n = i6;
        byte[] bArr = this.m;
        System.arraycopy(bArr, i3, bArr, 0, i6);
        byteBuffer.get(this.m, this.n, i5);
        this.n += i5;
        byteBufferK.flip();
    }

    @Override // defpackage.b60
    public final void h() {
        if (this.k) {
            this.k = false;
            int i = this.j;
            int i2 = this.b.d;
            this.m = new byte[i * i2];
            this.l = this.i * i2;
        }
        this.n = 0;
    }

    @Override // defpackage.b60
    public final void i() {
        if (this.k) {
            int i = this.n;
            if (i > 0) {
                this.o += (long) (i / this.b.d);
            }
            this.n = 0;
        }
    }

    @Override // defpackage.b60
    public final void j() {
        this.m = j29.b;
    }
}
