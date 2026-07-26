package defpackage;

import androidx.media3.common.ParserException;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class py2 {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final float l;
    public final int m;
    public final String n;
    public final vp7 o;

    public py2(List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, float f, int i11, String str, vp7 vp7Var) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = i9;
        this.k = i10;
        this.l = f;
        this.m = i11;
        this.n = str;
        this.o = vp7Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static py2 a(h26 h26Var, boolean z, vp7 vp7Var) {
        boolean z2;
        tu2 tu2VarQ;
        int i;
        int i2 = 4;
        try {
            if (z) {
                h26Var.K(4);
            } else {
                h26Var.K(21);
            }
            int iX = h26Var.x() & 3;
            int iX2 = h26Var.x();
            int i3 = h26Var.b;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                z2 = true;
                if (i5 >= iX2) {
                    break;
                }
                h26Var.K(1);
                int iD = h26Var.D();
                for (int i7 = 0; i7 < iD; i7++) {
                    int iD2 = h26Var.D();
                    i6 += iD2 + 4;
                    h26Var.K(iD2);
                }
                i5++;
            }
            h26Var.J(i3);
            byte[] bArr = new byte[i6];
            vp7 vp7Var2 = vp7Var;
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            float f = 1.0f;
            String strA = null;
            int i18 = 0;
            int i19 = 0;
            while (i18 < iX2) {
                int iX3 = h26Var.x() & 63;
                int iD3 = h26Var.D();
                int i20 = i4;
                vp7 vp7VarS = vp7Var2;
                while (i20 < iD3) {
                    boolean z3 = z2;
                    int iD4 = h26Var.D();
                    int i21 = iX;
                    System.arraycopy(s7.d, i4, bArr, i19, i2);
                    int i22 = i19 + 4;
                    System.arraycopy(h26Var.a, h26Var.b, bArr, i22, iD4);
                    if (iX3 == 32 && i20 == 0) {
                        vp7VarS = s7.S(bArr, i22, i22 + iD4);
                    } else {
                        if (iX3 == 33 && i20 == 0) {
                            jh5 jh5VarR = s7.R(bArr, i22, i22 + iD4, vp7VarS);
                            i8 = jh5VarR.a + 1;
                            i9 = jh5VarR.g;
                            int i23 = jh5VarR.h;
                            i11 = jh5VarR.c + 8;
                            i12 = jh5VarR.d + 8;
                            int i24 = jh5VarR.k;
                            i10 = i23;
                            int i25 = jh5VarR.l;
                            int i26 = jh5VarR.m;
                            float f2 = jh5VarR.i;
                            int i27 = jh5VarR.j;
                            gh5 gh5Var = jh5VarR.b;
                            if (gh5Var != null) {
                                i = i27;
                                strA = ku0.a(gh5Var.a, gh5Var.b, gh5Var.c, gh5Var.d, gh5Var.e, gh5Var.f);
                            } else {
                                i = i27;
                            }
                            i17 = i;
                            f = f2;
                            i15 = i26;
                            i14 = i25;
                            i13 = i24;
                        } else if (iX3 == 39 && i20 == 0 && (tu2VarQ = s7.Q(bArr, i22, i22 + iD4)) != null && vp7VarS != null) {
                            i4 = 0;
                            i16 = tu2VarQ.a == ((fh5) ((ImmutableList) vp7VarS.b).get(0)).b ? 4 : 5;
                        }
                        i4 = 0;
                    }
                    i19 = i22 + iD4;
                    h26Var.K(iD4);
                    i20++;
                    z2 = z3;
                    iX = i21;
                    i2 = 4;
                }
                i18++;
                vp7Var2 = vp7VarS;
                i2 = 4;
            }
            return new py2(i6 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), iX + 1, i8, i9, i10, i11, i12, i13, i14, i15, i16, f, i17, strA, vp7Var2);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw ParserException.a(e, "Error parsing".concat(z ? "L-HEVC config" : "HEVC config"));
        }
    }
}
