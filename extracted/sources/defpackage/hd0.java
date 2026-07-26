package defpackage;

import com.google.common.hash.c;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: loaded from: classes.dex */
public final class hd0 {
    public final AtomicLongArray a;
    public final be4 b;

    public hd0(long[] jArr) {
        wn5.i("data length is zero!", jArr.length > 0);
        this.a = new AtomicLongArray(jArr);
        this.b = (be4) c.a.get();
        long jBitCount = 0;
        for (long j : jArr) {
            jBitCount += (long) Long.bitCount(j);
        }
        this.b.add(jBitCount);
    }

    public static long[] a(AtomicLongArray atomicLongArray) {
        int length = atomicLongArray.length();
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            jArr[i] = atomicLongArray.get(i);
        }
        return jArr;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hd0) {
            return Arrays.equals(a(this.a), a(((hd0) obj).a));
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(a(this.a));
    }
}
