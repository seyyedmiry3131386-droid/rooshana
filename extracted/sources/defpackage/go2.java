package defpackage;

import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.ParserException;
import androidx.media3.common.b;
import com.google.common.collect.ImmutableList;
import j$.util.DesugarCollections;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class go2 implements v72 {
    public static final byte[] N = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final b O;
    public fo2 B;
    public int C;
    public int D;
    public int E;
    public boolean F;
    public boolean G;
    public boolean K;
    public boolean L;
    public final ab8 a;
    public final int b;
    public final List c;
    public final byte[] h;
    public final h26 i;
    public final hm8 j;
    public int r;
    public int s;
    public long t;
    public int u;
    public h26 v;
    public long w;
    public int x;
    public final qq4 k = new qq4(25);
    public final h26 l = new h26(16);
    public final h26 e = new h26(s7.d);
    public final h26 f = new h26(6);
    public final h26 g = new h26();
    public final ArrayDeque m = new ArrayDeque();
    public final ArrayDeque n = new ArrayDeque();
    public final SparseArray d = new SparseArray();
    public ImmutableList q = ImmutableList.q();
    public long z = -9223372036854775807L;
    public long y = -9223372036854775807L;
    public long A = -9223372036854775807L;
    public x72 H = x72.j0;
    public cp8[] I = new cp8[0];
    public cp8[] J = new cp8[0];
    public final yb o = new yb(new do2(this));
    public final ql4 p = new ql4(11);
    public long M = -1;

    static {
        rj2 rj2Var = new rj2();
        rj2Var.m = tv4.m("application/x-emsg");
        O = new b(rj2Var);
    }

    public go2(ab8 ab8Var, int i, hm8 hm8Var, List list) {
        this.a = ab8Var;
        this.b = i;
        this.j = hm8Var;
        this.c = DesugarCollections.unmodifiableList(list);
        byte[] bArr = new byte[16];
        this.h = bArr;
        this.i = new h26(bArr);
    }

    public static DrmInitData e(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            s85 s85Var = (s85) list.get(i);
            if (s85Var.b == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = s85Var.c.a;
                jx9 jx9VarJ = bt2.J(bArr);
                UUID uuid = jx9VarJ == null ? null : (UUID) jx9VarJ.b;
                if (uuid == null) {
                    wn5.k0("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new DrmInitData.SchemeData(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData(null, false, (DrmInitData.SchemeData[]) arrayList.toArray(new DrmInitData.SchemeData[0]));
    }

    public static void f(h26 h26Var, int i, xo8 xo8Var) throws ParserException {
        h26Var.J(i + 8);
        int iJ = h26Var.j();
        byte[] bArr = lg0.a;
        if ((iJ & 1) != 0) {
            throw ParserException.c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (iJ & 2) != 0;
        int iB = h26Var.B();
        if (iB == 0) {
            Arrays.fill(xo8Var.l, 0, xo8Var.e, false);
            return;
        }
        int i2 = xo8Var.e;
        h26 h26Var2 = xo8Var.n;
        if (iB != i2) {
            StringBuilder sbR = rm7.r(iB, "Senc sample count ", " is different from fragment sample count");
            sbR.append(xo8Var.e);
            throw ParserException.a(null, sbR.toString());
        }
        Arrays.fill(xo8Var.l, 0, iB, z);
        h26Var2.G(h26Var.a());
        xo8Var.k = true;
        xo8Var.o = true;
        h26Var.h(h26Var2.a, 0, h26Var2.c);
        h26Var2.J(0);
        xo8Var.o = false;
    }

    public static Pair j(long j, h26 h26Var) throws ParserException {
        long jC;
        long jC2;
        h26 h26Var2 = h26Var;
        h26Var2.J(8);
        int iE = lg0.e(h26Var2.j());
        h26Var2.K(4);
        long jZ = h26Var2.z();
        if (iE == 0) {
            jC = h26Var2.z();
            jC2 = h26Var2.z();
        } else {
            jC = h26Var2.C();
            jC2 = h26Var2.C();
        }
        long j2 = jC2 + j;
        String str = j29.a;
        long jD0 = j29.d0(jC, 1000000L, jZ, RoundingMode.DOWN);
        h26Var2.K(2);
        int iD = h26Var2.D();
        int[] iArr = new int[iD];
        long[] jArr = new long[iD];
        long[] jArr2 = new long[iD];
        long[] jArr3 = new long[iD];
        long j3 = j2;
        long j4 = jD0;
        int i = 0;
        while (i < iD) {
            int iJ = h26Var2.j();
            if ((Integer.MIN_VALUE & iJ) != 0) {
                throw ParserException.a(null, "Unhandled indirect reference");
            }
            long jZ2 = h26Var2.z();
            iArr[i] = iJ & Integer.MAX_VALUE;
            jArr[i] = j3;
            jArr3[i] = j4;
            jC += jZ2;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            long jD02 = j29.d0(jC, 1000000L, jZ, RoundingMode.DOWN);
            jArr4[i] = jD02 - jArr5[i];
            h26Var2.K(4);
            j3 += (long) iArr[i];
            i++;
            iD = iD;
            h26Var2 = h26Var;
            j4 = jD02;
            jArr2 = jArr4;
            jArr3 = jArr5;
        }
        return Pair.create(Long.valueOf(jD0), new dr0(iArr, jArr, jArr2, jArr3));
    }

    @Override // defpackage.v72
    public final v72 b() {
        return this;
    }

    public final void c() {
        this.r = 0;
        this.u = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01e5, code lost:
    
        if (r32.D >= r32.C) goto L526;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01e7, code lost:
    
        r2 = r32.E;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01e9, code lost:
    
        if (r2 != 0) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01ee, code lost:
    
        if (r32.J.length > 0) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01f2, code lost:
    
        if (r32.F != false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01f4, code lost:
    
        r2 = defpackage.s7.M(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0204, code lost:
    
        if ((r4 + r2) > (r32.C - r32.D)) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0206, code lost:
    
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0209, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x020a, code lost:
    
        r0.readFully(r15, r6, r4 + r2);
        r9.J(0);
        r19 = r9.j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0217, code lost:
    
        if (r19 < 0) goto L527;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0219, code lost:
    
        r32.E = r19 - r2;
        r13 = r32.e;
        r25 = r4;
        r13.J(0);
        r5.d(4, r13);
        r32.D += 4;
        r32.C += r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0236, code lost:
    
        if (r32.J.length <= 0) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0238, code lost:
    
        if (r2 <= 0) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x023a, code lost:
    
        r13 = r15[4];
        r4 = r8.n;
        r20 = r6;
        r6 = r8.k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0246, code lost:
    
        if (j$.util.Objects.equals(r4, r12) != false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x024c, code lost:
    
        if (defpackage.tv4.b(r6, r12) == null) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x024f, code lost:
    
        r26 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0253, code lost:
    
        r26 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0258, code lost:
    
        if ((r13 & 31) == 6) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x025a, code lost:
    
        r12 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0262, code lost:
    
        if (j$.util.Objects.equals(r8.n, r12) != false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0268, code lost:
    
        if (defpackage.tv4.b(r6, r12) == null) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0272, code lost:
    
        if (((r13 & 126) >> 1) != 39) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0275, code lost:
    
        r12 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0277, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0279, code lost:
    
        r20 = r6;
        r26 = r12;
        r12 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x027f, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0280, code lost:
    
        r32.G = r4;
        r5.d(r2, r9);
        r32.D += r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x028a, code lost:
    
        if (r2 <= 0) goto L529;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x028e, code lost:
    
        if (r32.F != false) goto L530;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0294, code lost:
    
        if (defpackage.s7.D(r15, r2, r8) == false) goto L531;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0296, code lost:
    
        r32.F = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0299, code lost:
    
        r34 = r12;
        r6 = r20;
        r2 = r22;
        r4 = r25;
        r12 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02ac, code lost:
    
        throw androidx.media3.common.ParserException.a(null, "Invalid NAL length");
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02ad, code lost:
    
        r25 = r4;
        r20 = r6;
        r26 = r12;
        r12 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02b7, code lost:
    
        if (r32.G == false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02b9, code lost:
    
        r4 = r32.g;
        r4.G(r2);
        r0.readFully(r4.a, 0, r32.E);
        r5.d(r32.E, r4);
        r2 = r32.E;
        r2 = defpackage.s7.g0(r4.c, r4.a);
        r4.J(0);
        r4.I(r2);
        r2 = r8.p;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02e0, code lost:
    
        if (r2 != (-1)) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02e4, code lost:
    
        if (r7.a == 0) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x02e6, code lost:
    
        r7.w(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02ec, code lost:
    
        if (r7.a == r2) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x02ee, code lost:
    
        r7.w(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x02f1, code lost:
    
        r7.a(r10, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x02fd, code lost:
    
        if ((r22.a() & 4) == 0) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x02ff, code lost:
    
        r7.j(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0302, code lost:
    
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0305, code lost:
    
        r2 = r5.e(r0, r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x030c, code lost:
    
        r32.D += r2;
        r32.E -= r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0317, code lost:
    
        r22 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0319, code lost:
    
        r2 = r32.D;
        r4 = r32.C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x031d, code lost:
    
        if (r2 >= r4) goto L537;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x031f, code lost:
    
        r32.D += r5.e(r0, r4 - r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x032b, code lost:
    
        r0 = r22.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0331, code lost:
    
        if (r32.F != false) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0333, code lost:
    
        r0 = r0 | 67108864;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0336, code lost:
    
        r28 = r0;
        r0 = r22.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x033c, code lost:
    
        if (r0 == null) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x033e, code lost:
    
        r31 = r0.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0343, code lost:
    
        r31 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0345, code lost:
    
        r26 = r10;
        r5.a(r26, r28, r32.C, 0, r31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0356, code lost:
    
        if (r3.isEmpty() != false) goto L533;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0358, code lost:
    
        r0 = (defpackage.eo2) r3.removeFirst();
        r32.x -= r0.c;
        r4 = r0.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0369, code lost:
    
        if (r0.b == false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x036b, code lost:
    
        r4 = r4 + r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x036d, code lost:
    
        if (r14 == null) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x036f, code lost:
    
        r4 = r14.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0373, code lost:
    
        r7 = r4;
        r2 = r32.I;
        r4 = r2.length;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0378, code lost:
    
        if (r5 >= r4) goto L536;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x037a, code lost:
    
        r2[r5].a(r7, 1, r0.c, r32.x, null);
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x038c, code lost:
    
        if (r22.c() != false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x038e, code lost:
    
        r32.B = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0391, code lost:
    
        r32.r = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0396, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ce, code lost:
    
        r5 = r2.a;
        r6 = r2.b;
        r12 = "video/avc";
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00db, code lost:
    
        if (r32.r != 3) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00df, code lost:
    
        if (r2.m != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e1, code lost:
    
        r9 = r2.d.d[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ea, code lost:
    
        r9 = r6.h[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f0, code lost:
    
        r32.C = r9;
        r9 = r2.d.a.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fe, code lost:
    
        if (j$.util.Objects.equals(r9.n, "video/avc") == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0102, code lost:
    
        if ((r4 & 64) == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0104, code lost:
    
        r4 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0107, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0110, code lost:
    
        if (j$.util.Objects.equals(r9.n, "video/hevc") == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0114, code lost:
    
        if ((r4 & 128) == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0117, code lost:
    
        r32.F = !r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x011f, code lost:
    
        if (r2.f >= r2.i) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0121, code lost:
    
        r0.n(r32.C);
        r0 = r2.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x012a, code lost:
    
        if (r0 != null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x012d, code lost:
    
        r3 = r6.n;
        r0 = r0.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0131, code lost:
    
        if (r0 == 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0133, code lost:
    
        r3.K(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0136, code lost:
    
        r0 = r2.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x013a, code lost:
    
        if (r6.k == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0140, code lost:
    
        if (r6.l[r0] == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0142, code lost:
    
        r3.K(r3.D() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x014e, code lost:
    
        if (r2.c() != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0150, code lost:
    
        r32.B = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0153, code lost:
    
        r32.r = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0156, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x015f, code lost:
    
        if (r2.d.a.h != r21) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0161, code lost:
    
        r32.C -= 8;
        r0.n(r22);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x017a, code lost:
    
        if ("audio/ac4".equals(r2.d.a.g.n) == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x017c, code lost:
    
        r32.D = r2.d(r32.C, 7);
        defpackage.ub1.u(r32.C, r8);
        r5.d(7, r8);
        r32.D += 7;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0195, code lost:
    
        r8 = 0;
        r32.D = r2.d(r32.C, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x019f, code lost:
    
        r32.C += r32.D;
        r32.r = 4;
        r32.E = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01aa, code lost:
    
        r4 = r2.d;
        r8 = r4.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01b0, code lost:
    
        if (r2.m != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01b2, code lost:
    
        r15 = r4.f[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01b8, code lost:
    
        r34 = "video/hevc";
        r10 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01bc, code lost:
    
        r15 = r6.i[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01c3, code lost:
    
        if (r14 == null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01c5, code lost:
    
        r10 = r14.a(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01c9, code lost:
    
        r4 = r8.k;
        r8 = r8.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01cd, code lost:
    
        if (r4 == 0) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01cf, code lost:
    
        r9 = r32.f;
        r15 = r9.a;
        r15[0] = 0;
        r15[1] = 0;
        r15[r20] = 0;
        r6 = 4 - r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01df, code lost:
    
        r22 = r2;
     */
    @Override // defpackage.v72
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d(defpackage.w72 r33, defpackage.sd2 r34) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instruction units count: 2324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.go2.d(w72, sd2):int");
    }

    @Override // defpackage.v72
    public final boolean g(w72 w72Var) {
        b18 b18VarN = yh0.N(w72Var, true, false);
        this.q = b18VarN != null ? ImmutableList.s(b18VarN) : ImmutableList.q();
        return b18VarN == null;
    }

    @Override // defpackage.v72
    public final void h(long j, long j2) {
        SparseArray sparseArray = this.d;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((fo2) sparseArray.valueAt(i)).e();
        }
        this.n.clear();
        this.x = 0;
        ((PriorityQueue) this.o.e).clear();
        this.y = j2;
        this.m.clear();
        c();
    }

    @Override // defpackage.v72
    public final List i() {
        return this.q;
    }

    /* JADX WARN: Code restructure failed: missing block: B:344:0x07df, code lost:
    
        c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x07e2, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:307:0x06fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(long r54) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instruction units count: 2019
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.go2.k(long):void");
    }

    @Override // defpackage.v72
    public final void m(x72 x72Var) {
        int i;
        int i2 = this.b;
        if ((i2 & 32) == 0) {
            x72Var = new ry(x72Var, this.a);
        }
        this.H = x72Var;
        c();
        cp8[] cp8VarArr = new cp8[2];
        this.I = cp8VarArr;
        int i3 = 100;
        int i4 = 0;
        if ((i2 & 4) != 0) {
            cp8VarArr[0] = this.H.o(100, 5);
            i = 1;
            i3 = 101;
        } else {
            i = 0;
        }
        cp8[] cp8VarArr2 = (cp8[]) j29.X(i, this.I);
        this.I = cp8VarArr2;
        for (cp8 cp8Var : cp8VarArr2) {
            cp8Var.f(O);
        }
        List list = this.c;
        this.J = new cp8[list.size()];
        while (i4 < this.J.length) {
            cp8 cp8VarO = this.H.o(i3, 3);
            cp8VarO.f((b) list.get(i4));
            this.J[i4] = cp8VarO;
            i4++;
            i3++;
        }
    }

    @Override // defpackage.v72
    public final void a() {
    }
}
