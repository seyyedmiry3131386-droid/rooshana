package j$.util.stream;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class h6 extends v5 {
    public int[] c;
    public int d;

    @Override // j$.util.stream.d5, j$.util.stream.j5
    public final void c(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.c = new int[(int) j];
    }

    @Override // j$.util.stream.d5, j$.util.stream.j5
    public final void end() {
        int i = 0;
        Arrays.sort(this.c, 0, this.d);
        long j = this.d;
        j5 j5Var = this.a;
        j5Var.c(j);
        if (!this.b) {
            while (i < this.d) {
                j5Var.accept(this.c[i]);
                i++;
            }
        } else {
            while (i < this.d && !j5Var.e()) {
                j5Var.accept(this.c[i]);
                i++;
            }
        }
        j5Var.end();
        this.c = null;
    }

    @Override // j$.util.stream.h5, java.util.function.IntConsumer
    public final void accept(int i) {
        int[] iArr = this.c;
        int i2 = this.d;
        this.d = i2 + 1;
        iArr[i2] = i;
    }
}
