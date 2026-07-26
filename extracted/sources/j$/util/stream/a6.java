package j$.util.stream;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class a6 extends w5 {
    public q6 c;

    @Override // j$.util.stream.e5, j$.util.stream.j5
    public final void c(long j) {
        q6 q6Var;
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        if (j <= 0) {
            q6Var = new q6();
        } else {
            q6Var = new q6((int) j);
        }
        this.c = q6Var;
    }

    @Override // j$.util.stream.e5, j$.util.stream.j5
    public final void end() {
        long[] jArr = (long[]) this.c.b();
        Arrays.sort(jArr);
        long length = jArr.length;
        j5 j5Var = this.a;
        j5Var.c(length);
        int i = 0;
        if (!this.b) {
            int length2 = jArr.length;
            while (i < length2) {
                j5Var.accept(jArr[i]);
                i++;
            }
        } else {
            int length3 = jArr.length;
            while (i < length3) {
                long j = jArr[i];
                if (j5Var.e()) {
                    break;
                }
                j5Var.accept(j);
                i++;
            }
        }
        j5Var.end();
    }

    @Override // j$.util.stream.i5, j$.util.stream.j5, java.util.function.LongConsumer
    public final void accept(long j) {
        this.c.accept(j);
    }
}
