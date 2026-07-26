package defpackage;

import java.io.IOException;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes.dex */
public class ul9 {
    public static final pl9 c;
    public final ol9 a;
    public final Character b;

    static {
        new sl9("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        new sl9("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new ul9("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new ul9("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        c = new pl9();
    }

    public ul9(ol9 ol9Var, Character ch) {
        this.a = ol9Var;
        if (ch != null && ol9Var.g[61] != -1) {
            throw new IllegalArgumentException(h27.o("Padding character %s was already in alphabet", ch));
        }
        this.b = ch;
    }

    public void a(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        a27.o(0, i, bArr.length);
        while (i2 < i) {
            ol9 ol9Var = this.a;
            b(sb, bArr, i2, Math.min(ol9Var.f, i - i2));
            i2 += ol9Var.f;
        }
    }

    public final void b(StringBuilder sb, byte[] bArr, int i, int i2) {
        a27.o(i, i + i2, bArr.length);
        ol9 ol9Var = this.a;
        int i3 = ol9Var.f;
        int i4 = ol9Var.d;
        if (i2 > i3) {
            throw new IllegalArgumentException();
        }
        int i5 = 0;
        long j = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            j = (j | ((long) (bArr[i + i6] & 255))) << 8;
        }
        int i7 = ((i2 + 1) * 8) - i4;
        while (i5 < i2 * 8) {
            sb.append(ol9Var.b[ol9Var.c & ((int) (j >>> (i7 - i5)))]);
            i5 += i4;
        }
        if (this.b != null) {
            while (i5 < ol9Var.f * 8) {
                sb.append('=');
                i5 += i4;
            }
        }
    }

    public final String c(int i, byte[] bArr) {
        a27.o(0, i, bArr.length);
        ol9 ol9Var = this.a;
        int i2 = ol9Var.e;
        int i3 = ol9Var.f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb = new StringBuilder(o27.o(i, i3) * i2);
        try {
            a(sb, bArr, i);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ul9) {
            ul9 ul9Var = (ul9) obj;
            if (this.a.equals(ul9Var.a)) {
                Object obj2 = ul9Var.b;
                Character ch = this.b;
                if (ch == obj2) {
                    return true;
                }
                if (ch != null && ch.equals(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode();
        Character ch = this.b;
        return iHashCode ^ (ch == null ? 0 : ch.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        ol9 ol9Var = this.a;
        sb.append(ol9Var);
        if (8 % ol9Var.d != 0) {
            Character ch = this.b;
            if (ch == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public ul9(String str, String str2) {
        this(new ol9(str, str2.toCharArray()), (Character) '=');
    }
}
