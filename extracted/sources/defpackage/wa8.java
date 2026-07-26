package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wa8 implements Comparable {
    public final long a;
    public final byte[] b;

    public wa8(long j, byte[] bArr) {
        this.a = j;
        this.b = bArr;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.a, ((wa8) obj).a);
    }
}
