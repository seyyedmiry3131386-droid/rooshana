package kotlin.random;

import defpackage.js3;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
final class KotlinRandom extends Random {
    private static final long serialVersionUID = 0;

    @Override // java.util.Random
    public final int next(int i) {
        throw null;
    }

    @Override // java.util.Random
    public final boolean nextBoolean() {
        throw null;
    }

    @Override // java.util.Random
    public final void nextBytes(byte[] bArr) {
        js3.p(bArr, "bytes");
        throw null;
    }

    @Override // java.util.Random
    public final double nextDouble() {
        throw null;
    }

    @Override // java.util.Random
    public final float nextFloat() {
        throw null;
    }

    @Override // java.util.Random
    public final int nextInt() {
        throw null;
    }

    @Override // java.util.Random
    public final long nextLong() {
        throw null;
    }

    @Override // java.util.Random
    public final void setSeed(long j) {
        throw new UnsupportedOperationException("Setting seed is not supported.");
    }

    @Override // java.util.Random
    public final int nextInt(int i) {
        throw null;
    }
}
