package io.sentry.cache.tape;

import defpackage.bl4;
import defpackage.dw1;
import defpackage.rm7;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements Closeable, Iterable {
    public static final byte[] k = new byte[4096];
    public RandomAccessFile a;
    public final File b;
    public long c;
    public int d;
    public h e;
    public h f;
    public final byte[] g = new byte[32];
    public int h = 0;
    public final int i;
    public boolean j;

    public j(File file, RandomAccessFile randomAccessFile, int i) throws IOException {
        this.b = file;
        this.a = randomAccessFile;
        this.i = i;
        y();
    }

    public static int D(int i, byte[] bArr) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    public static void L0(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    public static void N0(int i, long j, byte[] bArr) {
        bArr[i] = (byte) (j >> 56);
        bArr[i + 1] = (byte) (j >> 48);
        bArr[i + 2] = (byte) (j >> 40);
        bArr[i + 3] = (byte) (j >> 32);
        bArr[i + 4] = (byte) (j >> 24);
        bArr[i + 5] = (byte) (j >> 16);
        bArr[i + 6] = (byte) (j >> 8);
        bArr[i + 7] = (byte) j;
    }

    public static long P(int i, byte[] bArr) {
        return ((((long) bArr[i]) & 255) << 56) + ((((long) bArr[i + 1]) & 255) << 48) + ((((long) bArr[i + 2]) & 255) << 40) + ((((long) bArr[i + 3]) & 255) << 32) + ((((long) bArr[i + 4]) & 255) << 24) + ((((long) bArr[i + 5]) & 255) << 16) + ((((long) bArr[i + 6]) & 255) << 8) + (((long) bArr[i + 7]) & 255);
    }

    public static RandomAccessFile d(File file) throws IOException {
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                randomAccessFile.writeInt(-2147483647);
                randomAccessFile.writeLong(4096L);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        }
        return new RandomAccessFile(file, "rwd");
    }

    public final void C0(int i, long j, byte[] bArr) throws IOException {
        long jF0 = F0(j);
        long j2 = ((long) i) + jF0;
        long j3 = this.c;
        if (j2 <= j3) {
            this.a.seek(jF0);
            this.a.write(bArr, 0, i);
            return;
        }
        int i2 = (int) (j3 - jF0);
        this.a.seek(jF0);
        this.a.write(bArr, 0, i2);
        this.a.seek(32L);
        this.a.write(bArr, i2, i - i2);
    }

    public final long F0(long j) {
        long j2 = this.c;
        return j < j2 ? j : (j + 32) - j2;
    }

    public final void H0(long j, int i, long j2, long j3) throws IOException {
        this.a.seek(0L);
        byte[] bArr = this.g;
        L0(bArr, 0, -2147483647);
        N0(4, j, bArr);
        L0(bArr, 12, i);
        N0(16, j2, bArr);
        N0(24, j3, bArr);
        this.a.write(bArr, 0, 32);
    }

    public final void U(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(bl4.q(i, "Cannot remove negative (", ") number of elements."));
        }
        if (i == 0) {
            return;
        }
        int i2 = this.d;
        if (i == i2) {
            clear();
            return;
        }
        if (i2 == 0) {
            throw new NoSuchElementException();
        }
        if (i > i2) {
            throw new IllegalArgumentException(dw1.k(this.d, ").", rm7.r(i, "Cannot remove more elements (", ") than present in queue (")));
        }
        h hVar = this.e;
        long j = hVar.a;
        int iD = hVar.b;
        long jF0 = j;
        long j2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            j2 += (long) (iD + 4);
            jF0 = F0(jF0 + 4 + ((long) iD));
            byte[] bArr = this.g;
            if (!r0(4, jF0, bArr)) {
                return;
            }
            iD = D(0, bArr);
        }
        H0(this.c, this.d - i, jF0, this.f.a);
        this.d -= i;
        this.h++;
        this.e = new h(iD, jF0);
        while (j2 > 0) {
            int iMin = (int) Math.min(j2, 4096);
            C0(iMin, j, k);
            long j3 = iMin;
            j2 -= j3;
            j += j3;
        }
    }

    public final void clear() throws IOException {
        if (this.j) {
            throw new IllegalStateException("closed");
        }
        H0(4096L, 0, 0L, 0L);
        this.a.seek(32L);
        this.a.write(k, 0, 4064);
        this.d = 0;
        h hVar = h.c;
        this.e = hVar;
        this.f = hVar;
        if (this.c > 4096) {
            this.a.setLength(4096L);
            this.a.getChannel().force(true);
        }
        this.c = 4096L;
        this.h++;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.j = true;
        this.a.close();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new i(this);
    }

    public final void l0() {
        this.a.close();
        File file = this.b;
        file.delete();
        this.a = d(file);
        y();
    }

    public final boolean r0(int i, long j, byte[] bArr) throws IOException {
        try {
            long jF0 = F0(j);
            long j2 = ((long) i) + jF0;
            long j3 = this.c;
            if (j2 <= j3) {
                this.a.seek(jF0);
                this.a.readFully(bArr, 0, i);
                return true;
            }
            int i2 = (int) (j3 - jF0);
            this.a.seek(jF0);
            this.a.readFully(bArr, 0, i2);
            this.a.seek(32L);
            this.a.readFully(bArr, i2, i - i2);
            return true;
        } catch (EOFException unused) {
            l0();
            return false;
        } catch (IOException e) {
            throw e;
        } catch (Throwable unused2) {
            l0();
            return false;
        }
    }

    public final String toString() {
        return "QueueFile{file=" + this.b + ", zero=true, length=" + this.c + ", size=" + this.d + ", first=" + this.e + ", last=" + this.f + '}';
    }

    public final h u(long j) {
        if (j != 0) {
            byte[] bArr = this.g;
            if (r0(4, j, bArr)) {
                return new h(D(0, bArr), j);
            }
        }
        return h.c;
    }

    public final void y() throws IOException {
        this.a.seek(0L);
        RandomAccessFile randomAccessFile = this.a;
        byte[] bArr = this.g;
        randomAccessFile.readFully(bArr);
        this.c = P(4, bArr);
        this.d = D(12, bArr);
        long jP = P(16, bArr);
        long jP2 = P(24, bArr);
        if (this.c > this.a.length()) {
            throw new IOException("File is truncated. Expected length: " + this.c + ", Actual length: " + this.a.length());
        }
        if (this.c <= 32) {
            throw new IOException(bl4.s(this.c, ") is invalid.", new StringBuilder("File is corrupt; length stored in header (")));
        }
        this.e = u(jP);
        this.f = u(jP2);
    }
}
