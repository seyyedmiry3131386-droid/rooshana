package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class kr9 extends xq9 {
    public final byte[] q;

    public kr9(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.q = bArr;
    }

    @Override // defpackage.xq9
    public final byte[] p0() {
        return this.q;
    }
}
