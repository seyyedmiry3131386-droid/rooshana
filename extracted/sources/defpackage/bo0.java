package defpackage;

import android.text.SpannableStringBuilder;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class bo0 extends eo0 {
    public final h26 h = new h26();
    public final ao0 i = new ao0();
    public int j = -1;
    public final int k;
    public final zn0[] l;
    public zn0 m;
    public List n;
    public List o;
    public ao0 p;
    public int q;

    public bo0(int i, List list) {
        this.k = i == -1 ? 1 : i;
        if (list != null) {
            byte[] bArr = ku0.a;
            if (list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
                byte b = ((byte[]) list.get(0))[0];
            }
        }
        this.l = new zn0[8];
        for (int i2 = 0; i2 < 8; i2++) {
            this.l[i2] = new zn0();
        }
        this.m = this.l[0];
    }

    @Override // defpackage.eo0, defpackage.dc1
    public final void flush() {
        super.flush();
        this.n = null;
        this.o = null;
        this.q = 0;
        this.m = this.l[0];
        m();
        this.p = null;
    }

    @Override // defpackage.eo0
    public final r79 g() {
        List list = this.n;
        this.o = list;
        list.getClass();
        return new r79(11, list);
    }

    @Override // defpackage.eo0
    public final void h(co0 co0Var) {
        ByteBuffer byteBuffer = co0Var.e;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        h26 h26Var = this.h;
        h26Var.H(iLimit, bArrArray);
        while (h26Var.a() >= 3) {
            int iX = h26Var.x();
            int i = iX & 3;
            boolean z = (iX & 4) == 4;
            byte bX = (byte) h26Var.x();
            byte bX2 = (byte) h26Var.x();
            if (i == 2 || i == 3) {
                if (z) {
                    if (i == 3) {
                        k();
                        int i2 = (bX & 192) >> 6;
                        int i3 = this.j;
                        if (i3 != -1 && i2 != (i3 + 1) % 4) {
                            m();
                            wn5.k0("Cea708Decoder", "Sequence number discontinuity. previous=" + this.j + " current=" + i2);
                        }
                        this.j = i2;
                        int i4 = bX & 63;
                        if (i4 == 0) {
                            i4 = 64;
                        }
                        ao0 ao0Var = new ao0(i2, i4);
                        this.p = ao0Var;
                        byte[] bArr = ao0Var.b;
                        ao0Var.e = 1;
                        bArr[0] = bX2;
                    } else {
                        vy2.j(i == 2);
                        ao0 ao0Var2 = this.p;
                        if (ao0Var2 == null) {
                            wn5.F("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = ao0Var2.b;
                            int i5 = ao0Var2.e;
                            int i6 = i5 + 1;
                            ao0Var2.e = i6;
                            bArr2[i5] = bX;
                            ao0Var2.e = i5 + 2;
                            bArr2[i6] = bX2;
                        }
                    }
                    ao0 ao0Var3 = this.p;
                    if (ao0Var3.e == (ao0Var3.d * 2) - 1) {
                        k();
                    }
                }
            }
        }
    }

    @Override // defpackage.eo0
    public final boolean j() {
        return this.n != this.o;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void k() {
        char c;
        int i;
        boolean z;
        ao0 ao0Var = this.p;
        if (ao0Var == null) {
            return;
        }
        int i2 = 2;
        if (ao0Var.e != (ao0Var.d * 2) - 1) {
            wn5.w("DtvCcPacket ended prematurely; size is " + ((this.p.d * 2) - 1) + ", but current index is " + this.p.e + " (sequence number " + this.p.c + ");");
        }
        ao0 ao0Var2 = this.p;
        byte[] bArr = ao0Var2.b;
        int i3 = ao0Var2.e;
        ao0 ao0Var3 = this.i;
        ao0Var3.o(i3, bArr);
        boolean z2 = false;
        while (true) {
            if (ao0Var3.b() > 0) {
                int i4 = 3;
                int i5 = ao0Var3.i(3);
                int i6 = ao0Var3.i(5);
                if (i5 == 7) {
                    ao0Var3.t(i2);
                    i5 = ao0Var3.i(6);
                    if (i5 < 7) {
                        o40.E(i5, "Invalid extended service number: ", "Cea708Decoder");
                    }
                }
                if (i6 == 0) {
                    if (i5 != 0) {
                        wn5.k0("Cea708Decoder", "serviceNumber is non-zero (" + i5 + ") when blockSize is 0");
                    }
                } else if (i5 != this.k) {
                    ao0Var3.u(i6);
                } else {
                    int iG = (i6 * 8) + ao0Var3.g();
                    while (ao0Var3.g() < iG) {
                        int i7 = ao0Var3.i(8);
                        if (i7 != 16) {
                            if (i7 <= 31) {
                                if (i7 != 0) {
                                    if (i7 == i4) {
                                        this.n = l();
                                    } else if (i7 != 8) {
                                        switch (i7) {
                                            case 12:
                                                m();
                                                break;
                                            case 13:
                                                this.m.a('\n');
                                                break;
                                            case 14:
                                                break;
                                            default:
                                                if (i7 >= 17 && i7 <= 23) {
                                                    wn5.k0("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i7);
                                                    ao0Var3.t(8);
                                                } else if (i7 < 24 || i7 > 31) {
                                                    o40.E(i7, "Invalid C0 command: ", "Cea708Decoder");
                                                } else {
                                                    wn5.k0("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i7);
                                                    ao0Var3.t(16);
                                                }
                                                break;
                                        }
                                    } else {
                                        SpannableStringBuilder spannableStringBuilder = this.m.b;
                                        int length = spannableStringBuilder.length();
                                        if (length > 0) {
                                            spannableStringBuilder.delete(length - 1, length);
                                        }
                                    }
                                }
                                i = i2;
                            } else if (i7 <= 127) {
                                if (i7 == 127) {
                                    this.m.a((char) 9835);
                                } else {
                                    this.m.a((char) (i7 & 255));
                                }
                                i = i2;
                                z2 = true;
                            } else {
                                if (i7 <= 159) {
                                    zn0[] zn0VarArr = this.l;
                                    switch (i7) {
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                            z = true;
                                            int i8 = i7 - 128;
                                            if (this.q != i8) {
                                                this.q = i8;
                                                this.m = zn0VarArr[i8];
                                            }
                                            break;
                                        case 136:
                                            z = true;
                                            for (int i9 = 1; i9 <= 8; i9++) {
                                                if (ao0Var3.h()) {
                                                    zn0 zn0Var = zn0VarArr[8 - i9];
                                                    zn0Var.a.clear();
                                                    zn0Var.b.clear();
                                                    zn0Var.o = -1;
                                                    zn0Var.p = -1;
                                                    zn0Var.q = -1;
                                                    zn0Var.s = -1;
                                                    zn0Var.u = 0;
                                                }
                                            }
                                            break;
                                        case 137:
                                            for (int i10 = 1; i10 <= 8; i10++) {
                                                if (ao0Var3.h()) {
                                                    zn0VarArr[8 - i10].d = true;
                                                }
                                            }
                                            z = true;
                                            break;
                                        case 138:
                                            for (int i11 = 1; i11 <= 8; i11++) {
                                                if (ao0Var3.h()) {
                                                    zn0VarArr[8 - i11].d = false;
                                                }
                                            }
                                            z = true;
                                            break;
                                        case 139:
                                            for (int i12 = 1; i12 <= 8; i12++) {
                                                if (ao0Var3.h()) {
                                                    zn0VarArr[8 - i12].d = !r1.d;
                                                }
                                            }
                                            z = true;
                                            break;
                                        case 140:
                                            for (int i13 = 1; i13 <= 8; i13++) {
                                                if (ao0Var3.h()) {
                                                    zn0VarArr[8 - i13].d();
                                                }
                                            }
                                            z = true;
                                            break;
                                        case 141:
                                            ao0Var3.t(8);
                                            z = true;
                                            break;
                                        case 142:
                                            z = true;
                                            break;
                                        case 143:
                                            m();
                                            z = true;
                                            break;
                                        case 144:
                                            int i14 = i2;
                                            if (this.m.c) {
                                                ao0Var3.i(4);
                                                ao0Var3.i(i14);
                                                ao0Var3.i(i14);
                                                boolean zH = ao0Var3.h();
                                                boolean zH2 = ao0Var3.h();
                                                i4 = 3;
                                                ao0Var3.i(3);
                                                ao0Var3.i(3);
                                                this.m.e(zH, zH2);
                                                z = true;
                                            } else {
                                                ao0Var3.t(16);
                                                z = true;
                                                i4 = 3;
                                            }
                                            break;
                                        case 145:
                                            if (this.m.c) {
                                                int iC = zn0.c(ao0Var3.i(2), ao0Var3.i(2), ao0Var3.i(2), ao0Var3.i(2));
                                                int iC2 = zn0.c(ao0Var3.i(2), ao0Var3.i(2), ao0Var3.i(2), ao0Var3.i(2));
                                                ao0Var3.t(2);
                                                zn0.c(ao0Var3.i(2), ao0Var3.i(2), ao0Var3.i(2), 0);
                                                this.m.f(iC, iC2);
                                            } else {
                                                ao0Var3.t(24);
                                            }
                                            z = true;
                                            i4 = 3;
                                            break;
                                        case 146:
                                            if (this.m.c) {
                                                ao0Var3.t(4);
                                                int i15 = ao0Var3.i(4);
                                                ao0Var3.t(2);
                                                ao0Var3.i(6);
                                                zn0 zn0Var2 = this.m;
                                                if (zn0Var2.u != i15) {
                                                    zn0Var2.a('\n');
                                                }
                                                zn0Var2.u = i15;
                                            } else {
                                                ao0Var3.t(16);
                                            }
                                            z = true;
                                            i4 = 3;
                                            break;
                                        case 147:
                                        case 148:
                                        case 149:
                                        case 150:
                                        default:
                                            o40.E(i7, "Invalid C1 command: ", "Cea708Decoder");
                                            z = true;
                                            break;
                                        case 151:
                                            if (this.m.c) {
                                                int iC3 = zn0.c(ao0Var3.i(2), ao0Var3.i(2), ao0Var3.i(2), ao0Var3.i(2));
                                                ao0Var3.i(2);
                                                zn0.c(ao0Var3.i(2), ao0Var3.i(2), ao0Var3.i(2), 0);
                                                ao0Var3.h();
                                                ao0Var3.h();
                                                ao0Var3.i(2);
                                                ao0Var3.i(2);
                                                int i16 = ao0Var3.i(2);
                                                ao0Var3.t(8);
                                                zn0 zn0Var3 = this.m;
                                                zn0Var3.n = iC3;
                                                zn0Var3.k = i16;
                                            } else {
                                                ao0Var3.t(32);
                                            }
                                            z = true;
                                            i4 = 3;
                                            break;
                                        case 152:
                                        case 153:
                                        case 154:
                                        case ModuleDescriptor.MODULE_VERSION /* 155 */:
                                        case 156:
                                        case 157:
                                        case 158:
                                        case 159:
                                            int i17 = i7 - 152;
                                            zn0 zn0Var4 = zn0VarArr[i17];
                                            ao0Var3.t(i2);
                                            boolean zH3 = ao0Var3.h();
                                            ao0Var3.t(i2);
                                            int i18 = ao0Var3.i(i4);
                                            boolean zH4 = ao0Var3.h();
                                            int i19 = ao0Var3.i(7);
                                            int i20 = ao0Var3.i(8);
                                            int i21 = ao0Var3.i(4);
                                            int i22 = ao0Var3.i(4);
                                            ao0Var3.t(i2);
                                            ao0Var3.t(6);
                                            ao0Var3.t(i2);
                                            int i23 = ao0Var3.i(3);
                                            int i24 = ao0Var3.i(3);
                                            ArrayList arrayList = zn0Var4.a;
                                            zn0Var4.c = true;
                                            zn0Var4.d = zH3;
                                            zn0Var4.e = i18;
                                            zn0Var4.f = zH4;
                                            zn0Var4.g = i19;
                                            zn0Var4.h = i20;
                                            zn0Var4.i = i21;
                                            int i25 = i22 + 1;
                                            if (zn0Var4.j != i25) {
                                                zn0Var4.j = i25;
                                                while (true) {
                                                    if (arrayList.size() >= zn0Var4.j || arrayList.size() >= 15) {
                                                        arrayList.remove(0);
                                                    }
                                                }
                                            }
                                            if (i23 != 0 && zn0Var4.l != i23) {
                                                zn0Var4.l = i23;
                                                int i26 = i23 - 1;
                                                int i27 = zn0.B[i26];
                                                boolean z3 = zn0.A[i26];
                                                int i28 = zn0.y[i26];
                                                int i29 = zn0.z[i26];
                                                int i30 = zn0.x[i26];
                                                zn0Var4.n = i27;
                                                zn0Var4.k = i30;
                                            }
                                            if (i24 != 0 && zn0Var4.m != i24) {
                                                zn0Var4.m = i24;
                                                int i31 = i24 - 1;
                                                int i32 = zn0.D[i31];
                                                int i33 = zn0.C[i31];
                                                zn0Var4.e(false, false);
                                                zn0Var4.f(zn0.v, zn0.E[i31]);
                                            }
                                            if (this.q != i17) {
                                                this.q = i17;
                                                this.m = zn0VarArr[i17];
                                            }
                                            z = true;
                                            i4 = 3;
                                            break;
                                    }
                                } else {
                                    z = true;
                                    if (i7 <= 255) {
                                        this.m.a((char) (i7 & 255));
                                    } else {
                                        o40.E(i7, "Invalid base command: ", "Cea708Decoder");
                                        i = 2;
                                        c = 7;
                                    }
                                }
                                z2 = z;
                                i = 2;
                                c = 7;
                            }
                            c = 7;
                        } else {
                            int i34 = ao0Var3.i(8);
                            if (i34 <= 31) {
                                c = 7;
                                if (i34 > 7) {
                                    if (i34 <= 15) {
                                        ao0Var3.t(8);
                                    } else if (i34 <= 23) {
                                        ao0Var3.t(16);
                                    } else if (i34 <= 31) {
                                        ao0Var3.t(24);
                                    }
                                }
                            } else {
                                c = 7;
                                if (i34 <= 127) {
                                    if (i34 == 32) {
                                        this.m.a(' ');
                                    } else if (i34 == 33) {
                                        this.m.a((char) 160);
                                    } else if (i34 == 37) {
                                        this.m.a((char) 8230);
                                    } else if (i34 == 42) {
                                        this.m.a((char) 352);
                                    } else if (i34 == 44) {
                                        this.m.a((char) 338);
                                    } else if (i34 == 63) {
                                        this.m.a((char) 376);
                                    } else if (i34 == 57) {
                                        this.m.a((char) 8482);
                                    } else if (i34 == 58) {
                                        this.m.a((char) 353);
                                    } else if (i34 == 60) {
                                        this.m.a((char) 339);
                                    } else if (i34 != 61) {
                                        switch (i34) {
                                            case 48:
                                                this.m.a((char) 9608);
                                                break;
                                            case 49:
                                                this.m.a((char) 8216);
                                                break;
                                            case 50:
                                                this.m.a((char) 8217);
                                                break;
                                            case 51:
                                                this.m.a((char) 8220);
                                                break;
                                            case 52:
                                                this.m.a((char) 8221);
                                                break;
                                            case 53:
                                                this.m.a((char) 8226);
                                                break;
                                            default:
                                                switch (i34) {
                                                    case 118:
                                                        this.m.a((char) 8539);
                                                        break;
                                                    case 119:
                                                        this.m.a((char) 8540);
                                                        break;
                                                    case 120:
                                                        this.m.a((char) 8541);
                                                        break;
                                                    case 121:
                                                        this.m.a((char) 8542);
                                                        break;
                                                    case 122:
                                                        this.m.a((char) 9474);
                                                        break;
                                                    case 123:
                                                        this.m.a((char) 9488);
                                                        break;
                                                    case 124:
                                                        this.m.a((char) 9492);
                                                        break;
                                                    case 125:
                                                        this.m.a((char) 9472);
                                                        break;
                                                    case 126:
                                                        this.m.a((char) 9496);
                                                        break;
                                                    case 127:
                                                        this.m.a((char) 9484);
                                                        break;
                                                    default:
                                                        o40.E(i34, "Invalid G2 character: ", "Cea708Decoder");
                                                        break;
                                                }
                                                break;
                                        }
                                    } else {
                                        this.m.a((char) 8480);
                                    }
                                    i = 2;
                                    z2 = true;
                                } else if (i34 > 159) {
                                    i = 2;
                                    if (i34 <= 255) {
                                        if (i34 == 160) {
                                            this.m.a((char) 13252);
                                        } else {
                                            o40.E(i34, "Invalid G3 character: ", "Cea708Decoder");
                                            this.m.a('_');
                                        }
                                        z2 = true;
                                    } else {
                                        o40.E(i34, "Invalid extended command: ", "Cea708Decoder");
                                    }
                                } else if (i34 <= 135) {
                                    ao0Var3.t(32);
                                } else if (i34 <= 143) {
                                    ao0Var3.t(40);
                                } else if (i34 <= 159) {
                                    i = 2;
                                    ao0Var3.t(2);
                                    ao0Var3.t(ao0Var3.i(6) * 8);
                                }
                            }
                            i = 2;
                        }
                        i2 = i;
                    }
                }
            }
        }
        if (z2) {
            this.n = l();
        }
        this.p = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List l() {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bo0.l():java.util.List");
    }

    public final void m() {
        for (int i = 0; i < 8; i++) {
            this.l[i].d();
        }
    }
}
