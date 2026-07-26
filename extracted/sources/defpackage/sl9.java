package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sl9 extends ul9 {
    public sl9(String str, String str2) {
        ol9 ol9Var = new ol9(str, str2.toCharArray());
        super(ol9Var, (Character) '=');
        if (ol9Var.b.length != 64) {
            throw new IllegalArgumentException();
        }
    }

    @Override // defpackage.ul9
    public final void a(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        a27.o(0, i, bArr.length);
        for (int i3 = i; i3 >= 3; i3 -= 3) {
            int i4 = ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2] & 255) << 16) | (bArr[i2 + 2] & 255);
            ol9 ol9Var = this.a;
            char[] cArr = ol9Var.b;
            char[] cArr2 = ol9Var.b;
            sb.append(cArr[i4 >>> 18]);
            sb.append(cArr2[(i4 >>> 12) & 63]);
            sb.append(cArr2[(i4 >>> 6) & 63]);
            sb.append(cArr2[i4 & 63]);
            i2 += 3;
        }
        if (i2 < i) {
            b(sb, bArr, i2, i - i2);
        }
    }
}
