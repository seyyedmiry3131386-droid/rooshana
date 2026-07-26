package defpackage;

import j$.util.Objects;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class v12 {
    public final byte[] a;
    public final String b;
    public final byte[] c;

    public v12(byte[] bArr, String str, byte[] bArr2) {
        this.a = bArr;
        this.b = str;
        this.c = bArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v12)) {
            return false;
        }
        v12 v12Var = (v12) obj;
        return Arrays.equals(this.a, v12Var.a) && this.b.contentEquals(v12Var.b) && Arrays.equals(this.c, v12Var.c);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Arrays.hashCode(this.a)), this.b, Integer.valueOf(Arrays.hashCode(this.c)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EncryptedTopic=");
        Charset charset = zp0.a;
        sb.append(new String(this.a, charset));
        sb.append(", KeyIdentifier=");
        sb.append(this.b);
        sb.append(", EncapsulatedKey=");
        sb.append(new String(this.c, charset));
        sb.append(" }");
        return dw1.n("EncryptedTopic { ", sb.toString());
    }
}
