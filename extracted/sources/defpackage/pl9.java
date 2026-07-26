package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pl9 extends ul9 {
    public final char[] d;

    public pl9() {
        ol9 ol9Var = new ol9("base16()", "0123456789ABCDEF".toCharArray());
        super(ol9Var, (Character) null);
        this.d = new char[512];
        char[] cArr = ol9Var.b;
        if (cArr.length != 16) {
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < 256; i++) {
            char[] cArr2 = this.d;
            cArr2[i] = cArr[i >>> 4];
            cArr2[i | 256] = cArr[i & 15];
        }
    }

    @Override // defpackage.ul9
    public final void a(StringBuilder sb, byte[] bArr, int i) {
        a27.o(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bArr[i2] & 255;
            char[] cArr = this.d;
            sb.append(cArr[i3]);
            sb.append(cArr[i3 | 256]);
        }
    }
}
