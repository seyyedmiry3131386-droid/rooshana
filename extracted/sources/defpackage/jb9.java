package defpackage;

import androidx.media3.common.ParserException;
import androidx.media3.common.b;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class jb9 extends q68 {
    public jp8 n;
    public int o;
    public boolean p;
    public y85 q;
    public hl5 r;

    @Override // defpackage.q68
    public final void a(long j) {
        this.g = j;
        this.p = j != 0;
        y85 y85Var = this.q;
        this.o = y85Var != null ? y85Var.e : 0;
    }

    @Override // defpackage.q68
    public final long b(h26 h26Var) {
        byte b = h26Var.a[0];
        if ((b & 1) == 1) {
            return -1L;
        }
        jp8 jp8Var = this.n;
        vy2.t(jp8Var);
        int i = jp8Var.b;
        y85 y85Var = (y85) jp8Var.c;
        int i2 = !((pv1[]) jp8Var.f)[(b >> 1) & (255 >>> (8 - i))].b ? y85Var.e : y85Var.f;
        long j = this.p ? (this.o + i2) / 4 : 0;
        byte[] bArr = h26Var.a;
        int length = bArr.length;
        int i3 = h26Var.c + 4;
        if (length < i3) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i3);
            h26Var.H(bArrCopyOf.length, bArrCopyOf);
        } else {
            h26Var.I(i3);
        }
        byte[] bArr2 = h26Var.a;
        int i4 = h26Var.c;
        bArr2[i4 - 4] = (byte) (j & 255);
        bArr2[i4 - 3] = (byte) ((j >>> 8) & 255);
        bArr2[i4 - 2] = (byte) ((j >>> 16) & 255);
        bArr2[i4 - 1] = (byte) ((j >>> 24) & 255);
        this.p = true;
        this.o = i2;
        return j;
    }

    /* JADX WARN: Type inference failed for: r1v59, types: [byte[], java.io.Serializable] */
    @Override // defpackage.q68
    public final boolean c(h26 h26Var, long j, rn6 rn6Var) throws ParserException {
        jp8 jp8Var;
        if (this.n != null) {
            ((b) rn6Var.b).getClass();
            return false;
        }
        y85 y85Var = this.q;
        int i = 4;
        if (y85Var == null) {
            c67.n(1, h26Var, false);
            h26Var.p();
            int iX = h26Var.x();
            int iP = h26Var.p();
            int iL = h26Var.l();
            if (iL <= 0) {
                iL = -1;
            }
            int iL2 = h26Var.l();
            int i2 = iL2 > 0 ? iL2 : -1;
            h26Var.l();
            int iX2 = h26Var.x();
            int iPow = (int) Math.pow(2.0d, iX2 & 15);
            int iPow2 = (int) Math.pow(2.0d, (iX2 & 240) >> 4);
            h26Var.x();
            ?? CopyOf = Arrays.copyOf(h26Var.a, h26Var.c);
            y85 y85Var2 = new y85();
            y85Var2.a = iX;
            y85Var2.b = iP;
            y85Var2.c = iL;
            y85Var2.d = i2;
            y85Var2.e = iPow;
            y85Var2.f = iPow2;
            y85Var2.g = CopyOf;
            this.q = y85Var2;
        } else {
            hl5 hl5Var = this.r;
            if (hl5Var == null) {
                this.r = c67.i(h26Var, true, true);
            } else {
                int i3 = h26Var.c;
                byte[] bArr = new byte[i3];
                System.arraycopy(h26Var.a, 0, bArr, 0, i3);
                int i4 = y85Var.a;
                int i5 = 5;
                c67.n(5, h26Var, false);
                int iX3 = h26Var.x() + 1;
                ao0 ao0Var = new ao0(h26Var.a);
                int i6 = 8;
                ao0Var.t(h26Var.b * 8);
                int i7 = 0;
                while (true) {
                    int i8 = 16;
                    if (i7 < iX3) {
                        int i9 = i6;
                        if (ao0Var.i(24) != 5653314) {
                            throw ParserException.a(null, "expected code book to start with [0x56, 0x43, 0x42] at " + ((ao0Var.d * 8) + ao0Var.e));
                        }
                        int i10 = ao0Var.i(16);
                        int i11 = ao0Var.i(24);
                        if (ao0Var.h()) {
                            ao0Var.t(i5);
                            int i12 = 0;
                            while (i12 < i11) {
                                int i13 = 0;
                                for (int i14 = i11 - i12; i14 > 0; i14 >>>= 1) {
                                    i13++;
                                }
                                i12 += ao0Var.i(i13);
                            }
                        } else {
                            boolean zH = ao0Var.h();
                            for (int i15 = 0; i15 < i11; i15++) {
                                if (!zH) {
                                    ao0Var.t(i5);
                                } else if (ao0Var.h()) {
                                    ao0Var.t(i5);
                                }
                            }
                        }
                        int i16 = ao0Var.i(4);
                        if (i16 > 2) {
                            throw ParserException.a(null, "lookup type greater than 2 not decodable: " + i16);
                        }
                        if (i16 == 1 || i16 == 2) {
                            ao0Var.t(32);
                            ao0Var.t(32);
                            int i17 = ao0Var.i(4) + 1;
                            ao0Var.t(1);
                            ao0Var.t((int) ((i16 == 1 ? i10 != 0 ? (long) Math.floor(Math.pow(i11, 1.0d / ((double) i10))) : 0L : ((long) i11) * ((long) i10)) * ((long) i17)));
                        }
                        i7++;
                        i6 = i9;
                        i5 = 5;
                    } else {
                        int i18 = i6;
                        int i19 = 6;
                        int i20 = ao0Var.i(6) + 1;
                        for (int i21 = 0; i21 < i20; i21++) {
                            if (ao0Var.i(16) != 0) {
                                throw ParserException.a(null, "placeholder of time domain transforms not zeroed out");
                            }
                        }
                        int i22 = 1;
                        int i23 = ao0Var.i(6) + 1;
                        int i24 = 0;
                        while (true) {
                            int i25 = 3;
                            if (i24 < i23) {
                                int i26 = ao0Var.i(i8);
                                if (i26 == 0) {
                                    int i27 = i18;
                                    ao0Var.t(i27);
                                    ao0Var.t(16);
                                    ao0Var.t(16);
                                    ao0Var.t(6);
                                    ao0Var.t(i27);
                                    int i28 = ao0Var.i(4) + 1;
                                    int i29 = 0;
                                    while (i29 < i28) {
                                        ao0Var.t(i27);
                                        i29++;
                                        i27 = 8;
                                    }
                                } else {
                                    if (i26 != i22) {
                                        throw ParserException.a(null, "floor type greater than 1 not decodable: " + i26);
                                    }
                                    int i30 = ao0Var.i(5);
                                    int[] iArr = new int[i30];
                                    int i31 = -1;
                                    for (int i32 = 0; i32 < i30; i32++) {
                                        int i33 = ao0Var.i(i);
                                        iArr[i32] = i33;
                                        if (i33 > i31) {
                                            i31 = i33;
                                        }
                                    }
                                    int i34 = i31 + 1;
                                    int[] iArr2 = new int[i34];
                                    int i35 = 0;
                                    while (i35 < i34) {
                                        iArr2[i35] = ao0Var.i(i25) + 1;
                                        int i36 = ao0Var.i(2);
                                        int i37 = i18;
                                        if (i36 > 0) {
                                            ao0Var.t(i37);
                                        }
                                        int[] iArr3 = iArr2;
                                        int i38 = 0;
                                        for (int i39 = 1; i38 < (i39 << i36); i39 = 1) {
                                            ao0Var.t(i37);
                                            i38++;
                                            i37 = 8;
                                        }
                                        i35++;
                                        iArr2 = iArr3;
                                        i18 = 8;
                                        i25 = 3;
                                    }
                                    int[] iArr4 = iArr2;
                                    ao0Var.t(2);
                                    int i40 = ao0Var.i(4);
                                    int i41 = 0;
                                    int i42 = 0;
                                    for (int i43 = 0; i43 < i30; i43++) {
                                        i41 += iArr4[iArr[i43]];
                                        while (i42 < i41) {
                                            ao0Var.t(i40);
                                            i42++;
                                        }
                                    }
                                }
                                i24++;
                                i18 = 8;
                                i19 = 6;
                                i = 4;
                                i8 = 16;
                                i22 = 1;
                            } else {
                                int i44 = ao0Var.i(i19) + 1;
                                int i45 = 0;
                                while (i45 < i44) {
                                    if (ao0Var.i(16) > 2) {
                                        throw ParserException.a(null, "residueType greater than 2 is not decodable");
                                    }
                                    ao0Var.t(24);
                                    ao0Var.t(24);
                                    ao0Var.t(24);
                                    int i46 = ao0Var.i(i19) + 1;
                                    int i47 = 8;
                                    ao0Var.t(8);
                                    int[] iArr5 = new int[i46];
                                    for (int i48 = 0; i48 < i46; i48++) {
                                        iArr5[i48] = ((ao0Var.h() ? ao0Var.i(5) : 0) * 8) + ao0Var.i(3);
                                    }
                                    int i49 = 0;
                                    while (i49 < i46) {
                                        int i50 = 0;
                                        while (i50 < i47) {
                                            if ((iArr5[i49] & (1 << i50)) != 0) {
                                                ao0Var.t(i47);
                                            }
                                            i50++;
                                            i47 = 8;
                                        }
                                        i49++;
                                        i47 = 8;
                                    }
                                    i45++;
                                    i19 = 6;
                                }
                                int i51 = ao0Var.i(i19) + 1;
                                for (int i52 = 0; i52 < i51; i52++) {
                                    int i53 = ao0Var.i(16);
                                    if (i53 != 0) {
                                        wn5.F("VorbisUtil", "mapping type other than 0 not supported: " + i53);
                                    } else {
                                        int i54 = ao0Var.h() ? ao0Var.i(4) + 1 : 1;
                                        if (ao0Var.h()) {
                                            int i55 = ao0Var.i(8) + 1;
                                            for (int i56 = 0; i56 < i55; i56++) {
                                                int i57 = i4 - 1;
                                                int i58 = 0;
                                                for (int i59 = i57; i59 > 0; i59 >>>= 1) {
                                                    i58++;
                                                }
                                                ao0Var.t(i58);
                                                int i60 = 0;
                                                while (i57 > 0) {
                                                    i60++;
                                                    i57 >>>= 1;
                                                }
                                                ao0Var.t(i60);
                                            }
                                        }
                                        if (ao0Var.i(2) != 0) {
                                            throw ParserException.a(null, "to reserved bits must be zero after mapping coupling steps");
                                        }
                                        if (i54 > 1) {
                                            for (int i61 = 0; i61 < i4; i61++) {
                                                ao0Var.t(4);
                                            }
                                        }
                                        for (int i62 = 0; i62 < i54; i62++) {
                                            ao0Var.t(8);
                                            ao0Var.t(8);
                                            ao0Var.t(8);
                                        }
                                    }
                                }
                                int i63 = ao0Var.i(6);
                                int i64 = i63 + 1;
                                pv1[] pv1VarArr = new pv1[i64];
                                for (int i65 = 0; i65 < i64; i65++) {
                                    boolean zH2 = ao0Var.h();
                                    ao0Var.i(16);
                                    ao0Var.i(16);
                                    ao0Var.i(8);
                                    pv1VarArr[i65] = new pv1(5, zH2);
                                }
                                if (!ao0Var.h()) {
                                    throw ParserException.a(null, "framing bit after modes not set as expected");
                                }
                                int i66 = 0;
                                while (i63 > 0) {
                                    i66++;
                                    i63 >>>= 1;
                                }
                                jp8Var = new jp8(y85Var, hl5Var, bArr, pv1VarArr, i66);
                            }
                        }
                    }
                }
            }
        }
        jp8Var = null;
        this.n = jp8Var;
        if (jp8Var == null) {
            return true;
        }
        y85 y85Var3 = (y85) jp8Var.c;
        ArrayList arrayList = new ArrayList();
        arrayList.add((byte[]) y85Var3.g);
        arrayList.add((byte[]) jp8Var.e);
        jv4 jv4VarG = c67.g(ImmutableList.o((String[]) ((hl5) jp8Var.d).b));
        rj2 rj2Var = new rj2();
        rj2Var.l = tv4.m("audio/ogg");
        rj2Var.m = tv4.m("audio/vorbis");
        rj2Var.h = y85Var3.d;
        rj2Var.i = y85Var3.c;
        rj2Var.E = y85Var3.a;
        rj2Var.F = y85Var3.b;
        rj2Var.p = arrayList;
        rj2Var.k = jv4VarG;
        rn6Var.b = new b(rj2Var);
        return true;
    }

    @Override // defpackage.q68
    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.n = null;
            this.q = null;
            this.r = null;
        }
        this.o = 0;
        this.p = false;
    }
}
