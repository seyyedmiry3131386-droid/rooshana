package defpackage;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.google.common.collect.ImmutableList;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class nt8 implements cb8 {
    public final h26 a = new h26();
    public final boolean b;
    public final int c;
    public final int d;
    public final String e;
    public final float f;
    public final int g;

    public nt8(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.c = 0;
            this.d = -1;
            this.e = "sans-serif";
            this.b = false;
            this.f = 0.85f;
            this.g = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.c = bArr[24];
        this.d = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.e = "Serif".equals(new String(bArr, 43, bArr.length - 43, StandardCharsets.UTF_8)) ? "serif" : "sans-serif";
        int i = bArr[25] * 20;
        this.g = i;
        boolean z = (bArr[0] & 32) != 0;
        this.b = z;
        if (z) {
            this.f = j29.h(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.0f, 0.95f);
        } else {
            this.f = 0.85f;
        }
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    public static void b(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            boolean z = (i & 1) != 0;
            boolean z2 = (i & 2) != 0;
            if (z) {
                if (z2) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                }
            } else if (z2) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            }
            boolean z3 = (i & 4) != 0;
            if (z3) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            }
            if (z3 || z || z2) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
        }
    }

    @Override // defpackage.cb8
    public final /* synthetic */ ta8 d(byte[] bArr, int i, int i2) {
        return rm7.e(this, bArr, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cb8
    public final void m(byte[] bArr, int i, int i2, bb8 bb8Var, n31 n31Var) {
        String strV;
        int i3;
        int i4;
        h26 h26Var = this.a;
        h26Var.H(i + i2, bArr);
        h26Var.J(i);
        int i5 = 1;
        int i6 = 0;
        int i7 = 2;
        vy2.j(h26Var.a() >= 2);
        int iD = h26Var.D();
        if (iD == 0) {
            strV = "";
        } else {
            int i8 = h26Var.b;
            Charset charsetF = h26Var.F();
            int i9 = iD - (h26Var.b - i8);
            if (charsetF == null) {
                charsetF = StandardCharsets.UTF_8;
            }
            strV = h26Var.v(i9, charsetF);
        }
        if (strV.isEmpty()) {
            n31Var.accept(new o81(ImmutableList.q(), -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strV);
        b(spannableStringBuilder, this.c, 0, 0, spannableStringBuilder.length(), 16711680);
        a(spannableStringBuilder, this.d, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        String str = this.e;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float fH = this.f;
        while (h26Var.a() >= 8) {
            int i10 = h26Var.b;
            int iJ = h26Var.j();
            int iJ2 = h26Var.j();
            if (iJ2 == 1937013100) {
                vy2.j(h26Var.a() >= i7 ? i5 : i6);
                int iD2 = h26Var.D();
                int i11 = i6;
                while (i11 < iD2) {
                    vy2.j(h26Var.a() >= 12 ? i5 : i6);
                    int iD3 = h26Var.D();
                    int iD4 = h26Var.D();
                    h26Var.K(i7);
                    int i12 = i11;
                    int iX = h26Var.x();
                    h26Var.K(i5);
                    int iJ3 = h26Var.j();
                    if (iD4 > spannableStringBuilder.length()) {
                        StringBuilder sbR = rm7.r(iD4, "Truncating styl end (", ") to cueText.length() (");
                        sbR.append(spannableStringBuilder.length());
                        sbR.append(").");
                        wn5.k0("Tx3gParser", sbR.toString());
                        iD4 = spannableStringBuilder.length();
                    }
                    if (iD3 >= iD4) {
                        wn5.k0("Tx3gParser", "Ignoring styl with start (" + iD3 + ") >= end (" + iD4 + ").");
                        i4 = i12;
                    } else {
                        i4 = i12;
                        int i13 = iD4;
                        b(spannableStringBuilder, iX, this.c, iD3, i13, 0);
                        a(spannableStringBuilder, iJ3, this.d, iD3, i13, 0);
                    }
                    i11 = i4 + 1;
                    i5 = 1;
                    i6 = 0;
                    i7 = 2;
                }
                i3 = i7;
            } else if (iJ2 == 1952608120 && this.b) {
                i3 = 2;
                vy2.j(h26Var.a() >= 2);
                fH = j29.h(h26Var.D() / this.g, 0.0f, 0.95f);
            } else {
                i3 = 2;
            }
            h26Var.J(i10 + iJ);
            i7 = i3;
            i5 = 1;
            i6 = 0;
        }
        n31Var.accept(new o81(ImmutableList.s(new l81(spannableStringBuilder, null, null, null, fH, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0)), -9223372036854775807L, -9223372036854775807L));
    }

    @Override // defpackage.cb8
    public final /* synthetic */ void reset() {
    }
}
