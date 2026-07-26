package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class v96 extends t96 {
    @Override // defpackage.t96, defpackage.r96
    public final void a(long j, long j2) {
        if (!Float.isNaN(Float.NaN)) {
            this.a.setZoom(Float.NaN);
        }
        if ((9223372034707292159L & j2) != 9205357640488583168L) {
            this.a.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
        } else {
            this.a.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }
}
