package defpackage;

import android.util.SparseArray;
import androidx.media3.common.ParserException;
import com.google.common.collect.ImmutableList;
import j$.util.DesugarCollections;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class uk4 implements v72 {
    public static final byte[] f0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] g0;
    public static final byte[] h0;
    public static final byte[] i0;
    public static final UUID j0;
    public static final Map k0;
    public long A;
    public boolean B;
    public long C;
    public long D;
    public long E;
    public ce4 F;
    public ce4 G;
    public boolean H;
    public boolean I;
    public int J;
    public long K;
    public long L;
    public int M;
    public int N;
    public int[] O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public boolean T;
    public long U;
    public int V;
    public int W;
    public int X;
    public boolean Y;
    public boolean Z;
    public final ke1 a;
    public boolean a0;
    public final e39 b;
    public int b0;
    public final SparseArray c;
    public byte c0;
    public final boolean d;
    public boolean d0;
    public final boolean e;
    public x72 e0;
    public final ab8 f;
    public final h26 g;
    public final h26 h;
    public final h26 i;
    public final h26 j;
    public final h26 k;
    public final h26 l;
    public final h26 m;
    public final h26 n;
    public final h26 o;
    public final h26 p;
    public ByteBuffer q;
    public long r;
    public long s;
    public long t;
    public long u;
    public long v;
    public boolean w;
    public tk4 x;
    public boolean y;
    public int z;

    static {
        String str = j29.a;
        g0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        h0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        i0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        j0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        rm7.v(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        rm7.v(180, map, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        k0 = DesugarCollections.unmodifiableMap(map);
    }

    public uk4(ab8 ab8Var, int i) {
        ke1 ke1Var = new ke1(0);
        this.s = -1L;
        this.t = -9223372036854775807L;
        this.u = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.C = -1L;
        this.D = -1L;
        this.E = -9223372036854775807L;
        this.a = ke1Var;
        ke1Var.g = new nm5(26, this);
        this.f = ab8Var;
        this.d = (i & 1) == 0;
        this.e = (i & 2) == 0;
        this.b = new e39();
        this.c = new SparseArray();
        this.i = new h26(4);
        this.j = new h26(ByteBuffer.allocate(4).putInt(-1).array());
        this.k = new h26(4);
        this.g = new h26(s7.d);
        this.h = new h26(4);
        this.l = new h26();
        this.m = new h26();
        this.n = new h26(8);
        this.o = new h26();
        this.p = new h26();
        this.O = new int[1];
    }

    public static byte[] j(long j, long j2, String str) {
        vy2.j(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - (((long) i) * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (((long) i2) * 60000000);
        int i3 = (int) (j4 / 1000000);
        String str2 = String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (((long) i3) * 1000000)) / j2)));
        String str3 = j29.a;
        return str2.getBytes(StandardCharsets.UTF_8);
    }

    @Override // defpackage.v72
    public final v72 b() {
        return this;
    }

    public final void c(int i) {
        if (this.F == null || this.G == null) {
            throw ParserException.a(null, "Element " + i + " must be in a Cues");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:674:0x0bdf, code lost:
    
        r5 = true;
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:847:0x0f74, code lost:
    
        if (r5 == false) goto L858;
     */
    /* JADX WARN: Code restructure failed: missing block: B:848:0x0f76, code lost:
    
        r2 = r1.getPosition();
        r0 = r42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:849:0x0f7e, code lost:
    
        if (r0.B == false) goto L852;
     */
    /* JADX WARN: Code restructure failed: missing block: B:850:0x0f80, code lost:
    
        r0.D = r2;
        r44.a = r0.C;
        r0.B = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:851:0x0f8c, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:853:0x0f93, code lost:
    
        if (r0.y == false) goto L909;
     */
    /* JADX WARN: Code restructure failed: missing block: B:854:0x0f95, code lost:
    
        r6 = r0.D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:855:0x0f9b, code lost:
    
        if (r6 == (-1)) goto L910;
     */
    /* JADX WARN: Code restructure failed: missing block: B:856:0x0f9d, code lost:
    
        r44.a = r6;
        r0.D = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:857:0x0fa1, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:858:0x0fa2, code lost:
    
        r0 = r42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:861:0x0fbe, code lost:
    
        if (r5 != false) goto L871;
     */
    /* JADX WARN: Code restructure failed: missing block: B:862:0x0fc0, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:863:0x0fc1, code lost:
    
        r1 = r0.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:864:0x0fc7, code lost:
    
        if (r3 >= r1.size()) goto L936;
     */
    /* JADX WARN: Code restructure failed: missing block: B:865:0x0fc9, code lost:
    
        r1 = (defpackage.tk4) r1.valueAt(r3);
        r1.Z.getClass();
        r2 = r1.V;
     */
    /* JADX WARN: Code restructure failed: missing block: B:866:0x0fd6, code lost:
    
        if (r2 == null) goto L938;
     */
    /* JADX WARN: Code restructure failed: missing block: B:867:0x0fd8, code lost:
    
        r2.a(r1.Z, r1.k);
     */
    /* JADX WARN: Code restructure failed: missing block: B:868:0x0fdf, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:869:0x0fe2, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:871:0x0fe5, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:909:0x0fa8, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01bb, code lost:
    
        throw androidx.media3.common.ParserException.a(null, "Mandatory element SeekID or SeekPosition not found");
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:237:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x0908  */
    /* JADX WARN: Removed duplicated region for block: B:543:0x091f  */
    /* JADX WARN: Removed duplicated region for block: B:544:0x0921  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x0932  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x093f  */
    /* JADX WARN: Removed duplicated region for block: B:639:0x0aff  */
    /* JADX WARN: Removed duplicated region for block: B:645:0x0b14  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01de  */
    /* JADX WARN: Type inference failed for: r0v141 */
    /* JADX WARN: Type inference failed for: r0v73, types: [int] */
    /* JADX WARN: Type inference failed for: r0v78 */
    /* JADX WARN: Type inference failed for: r1v173 */
    /* JADX WARN: Type inference failed for: r1v174 */
    /* JADX WARN: Type inference failed for: r1v175 */
    /* JADX WARN: Type inference failed for: r1v176 */
    /* JADX WARN: Type inference failed for: r1v177 */
    /* JADX WARN: Type inference failed for: r1v178 */
    /* JADX WARN: Type inference failed for: r1v179 */
    /* JADX WARN: Type inference failed for: r1v182 */
    /* JADX WARN: Type inference failed for: r1v21, types: [w72] */
    /* JADX WARN: Type inference failed for: r1v22, types: [w72] */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v56 */
    /* JADX WARN: Type inference failed for: r1v57, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r1v6, types: [w72] */
    /* JADX WARN: Type inference failed for: r4v2, types: [nm5] */
    /* JADX WARN: Type inference failed for: r7v1, types: [ke1] */
    /* JADX WARN: Type inference failed for: r8v1, types: [e39] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.v72
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d(defpackage.w72 r43, defpackage.sd2 r44) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instruction units count: 4900
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uk4.d(w72, sd2):int");
    }

    public final void e(int i) {
        if (this.x != null) {
            return;
        }
        throw ParserException.a(null, "Element " + i + " must be in a TrackEntry");
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(defpackage.tk4 r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uk4.f(tk4, long, int, int, int):void");
    }

    @Override // defpackage.v72
    public final boolean g(w72 w72Var) throws EOFException, InterruptedIOException {
        dc0 dc0Var = new dc0(13, (byte) 0);
        h26 h26Var = (h26) dc0Var.c;
        oe1 oe1Var = (oe1) w72Var;
        long j = oe1Var.c;
        long j2 = 1024;
        if (j != -1 && j <= 1024) {
            j2 = j;
        }
        int i = (int) j2;
        oe1Var.e(h26Var.a, 0, 4, false);
        long jZ = h26Var.z();
        dc0Var.b = 4;
        while (true) {
            if (jZ != 440786851) {
                int i2 = dc0Var.b + 1;
                dc0Var.b = i2;
                if (i2 == i) {
                    break;
                }
                oe1Var.e(h26Var.a, 0, 1, false);
                jZ = ((jZ << 8) & (-256)) | ((long) (h26Var.a[0] & 255));
            } else {
                long jR = dc0Var.r(oe1Var);
                long j3 = dc0Var.b;
                if (jR != Long.MIN_VALUE && (j == -1 || j3 + jR < j)) {
                    while (true) {
                        long j4 = dc0Var.b;
                        long j5 = j3 + jR;
                        if (j4 < j5) {
                            if (dc0Var.r(oe1Var) == Long.MIN_VALUE) {
                                break;
                            }
                            long jR2 = dc0Var.r(oe1Var);
                            if (jR2 < 0 || jR2 > 2147483647L) {
                                break;
                            }
                            if (jR2 != 0) {
                                int i3 = (int) jR2;
                                oe1Var.l(i3, false);
                                dc0Var.b += i3;
                            }
                        } else if (j4 == j5) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.v72
    public final void h(long j, long j2) {
        this.E = -9223372036854775807L;
        this.J = 0;
        ke1 ke1Var = this.a;
        ke1Var.b = 0;
        ((ArrayDeque) ke1Var.e).clear();
        e39 e39Var = (e39) ke1Var.f;
        e39Var.a = 0;
        e39Var.b = 0;
        e39 e39Var2 = this.b;
        e39Var2.a = 0;
        e39Var2.b = 0;
        l();
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.c;
            if (i >= sparseArray.size()) {
                return;
            }
            at8 at8Var = ((tk4) sparseArray.valueAt(i)).V;
            if (at8Var != null) {
                at8Var.b = false;
                at8Var.c = 0;
            }
            i++;
        }
    }

    @Override // defpackage.v72
    public final List i() {
        return ImmutableList.q();
    }

    public final void k(w72 w72Var, int i) {
        h26 h26Var = this.i;
        if (h26Var.c >= i) {
            return;
        }
        byte[] bArr = h26Var.a;
        if (bArr.length < i) {
            h26Var.c(Math.max(bArr.length * 2, i));
        }
        byte[] bArr2 = h26Var.a;
        int i2 = h26Var.c;
        w72Var.readFully(bArr2, i2, i - i2);
        h26Var.I(i);
    }

    public final void l() {
        this.V = 0;
        this.W = 0;
        this.X = 0;
        this.Y = false;
        this.Z = false;
        this.a0 = false;
        this.b0 = 0;
        this.c0 = (byte) 0;
        this.d0 = false;
        this.l.G(0);
    }

    @Override // defpackage.v72
    public final void m(x72 x72Var) {
        if (this.e) {
            x72Var = new ry(x72Var, this.f);
        }
        this.e0 = x72Var;
    }

    public final long n(long j) throws ParserException {
        long j2 = this.t;
        if (j2 == -9223372036854775807L) {
            throw ParserException.a(null, "Can't scale timecode prior to timecodeScale being set.");
        }
        String str = j29.a;
        return j29.d0(j, j2, 1000L, RoundingMode.DOWN);
    }

    public final int o(w72 w72Var, tk4 tk4Var, int i, boolean z) throws ParserException {
        int iE;
        int iE2;
        int i2;
        if ("S_TEXT/UTF8".equals(tk4Var.c)) {
            p(w72Var, f0, i);
            int i3 = this.W;
            l();
            return i3;
        }
        if ("S_TEXT/ASS".equals(tk4Var.c) || "S_TEXT/SSA".equals(tk4Var.c)) {
            p(w72Var, h0, i);
            int i4 = this.W;
            l();
            return i4;
        }
        if ("S_TEXT/WEBVTT".equals(tk4Var.c)) {
            p(w72Var, i0, i);
            int i5 = this.W;
            l();
            return i5;
        }
        cp8 cp8Var = tk4Var.Z;
        boolean z2 = this.Y;
        h26 h26Var = this.l;
        if (!z2) {
            boolean z3 = tk4Var.i;
            h26 h26Var2 = this.i;
            if (z3) {
                this.R &= -1073741825;
                if (!this.Z) {
                    w72Var.readFully(h26Var2.a, 0, 1);
                    this.V++;
                    byte b = h26Var2.a[0];
                    if ((b & 128) == 128) {
                        throw ParserException.a(null, "Extension bit is set in signal byte");
                    }
                    this.c0 = b;
                    this.Z = true;
                }
                byte b2 = this.c0;
                if ((b2 & 1) == 1) {
                    boolean z4 = (b2 & 2) == 2;
                    this.R |= 1073741824;
                    if (!this.d0) {
                        h26 h26Var3 = this.n;
                        w72Var.readFully(h26Var3.a, 0, 8);
                        this.V += 8;
                        this.d0 = true;
                        h26Var2.a[0] = (byte) ((z4 ? 128 : 0) | 8);
                        h26Var2.J(0);
                        cp8Var.b(h26Var2, 1, 1);
                        this.W++;
                        h26Var3.J(0);
                        cp8Var.b(h26Var3, 8, 1);
                        this.W += 8;
                    }
                    if (z4) {
                        if (!this.a0) {
                            w72Var.readFully(h26Var2.a, 0, 1);
                            this.V++;
                            h26Var2.J(0);
                            this.b0 = h26Var2.x();
                            this.a0 = true;
                        }
                        int i6 = this.b0 * 4;
                        h26Var2.G(i6);
                        w72Var.readFully(h26Var2.a, 0, i6);
                        this.V += i6;
                        short s = (short) ((this.b0 / 2) + 1);
                        int i7 = (s * 6) + 2;
                        ByteBuffer byteBuffer = this.q;
                        if (byteBuffer == null || byteBuffer.capacity() < i7) {
                            this.q = ByteBuffer.allocate(i7);
                        }
                        this.q.position(0);
                        this.q.putShort(s);
                        int i8 = 0;
                        int i9 = 0;
                        while (true) {
                            i2 = this.b0;
                            if (i8 >= i2) {
                                break;
                            }
                            int iB = h26Var2.B();
                            if (i8 % 2 == 0) {
                                this.q.putShort((short) (iB - i9));
                            } else {
                                this.q.putInt(iB - i9);
                            }
                            i8++;
                            i9 = iB;
                        }
                        int i10 = (i - this.V) - i9;
                        if (i2 % 2 == 1) {
                            this.q.putInt(i10);
                        } else {
                            this.q.putShort((short) i10);
                            this.q.putInt(0);
                        }
                        byte[] bArrArray = this.q.array();
                        h26 h26Var4 = this.o;
                        h26Var4.H(i7, bArrArray);
                        cp8Var.b(h26Var4, i7, 1);
                        this.W += i7;
                    }
                }
            } else {
                byte[] bArr = tk4Var.j;
                if (bArr != null) {
                    h26Var.H(bArr.length, bArr);
                }
            }
            if ("A_OPUS".equals(tk4Var.c) ? z : tk4Var.g > 0) {
                this.R |= 268435456;
                this.p.G(0);
                int i11 = (h26Var.c + i) - this.V;
                h26Var2.G(4);
                byte[] bArr2 = h26Var2.a;
                bArr2[0] = (byte) ((i11 >> 24) & 255);
                bArr2[1] = (byte) ((i11 >> 16) & 255);
                bArr2[2] = (byte) ((i11 >> 8) & 255);
                bArr2[3] = (byte) (i11 & 255);
                cp8Var.b(h26Var2, 4, 2);
                this.W += 4;
            }
            this.Y = true;
        }
        int i12 = i + h26Var.c;
        if (!"V_MPEG4/ISO/AVC".equals(tk4Var.c) && !"V_MPEGH/ISO/HEVC".equals(tk4Var.c)) {
            if (tk4Var.V != null) {
                vy2.s(h26Var.c == 0);
                tk4Var.V.c(w72Var);
            }
            while (true) {
                int i13 = this.V;
                if (i13 >= i12) {
                    break;
                }
                int i14 = i12 - i13;
                int iA = h26Var.a();
                if (iA > 0) {
                    iE2 = Math.min(i14, iA);
                    cp8Var.d(iE2, h26Var);
                } else {
                    iE2 = cp8Var.e(w72Var, i14, false);
                }
                this.V += iE2;
                this.W += iE2;
            }
        } else {
            h26 h26Var5 = this.h;
            byte[] bArr3 = h26Var5.a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i15 = tk4Var.a0;
            int i16 = 4 - i15;
            while (this.V < i12) {
                int i17 = this.X;
                if (i17 == 0) {
                    int iMin = Math.min(i15, h26Var.a());
                    w72Var.readFully(bArr3, i16 + iMin, i15 - iMin);
                    if (iMin > 0) {
                        h26Var.h(bArr3, i16, iMin);
                    }
                    this.V += i15;
                    h26Var5.J(0);
                    this.X = h26Var5.B();
                    h26 h26Var6 = this.g;
                    h26Var6.J(0);
                    cp8Var.d(4, h26Var6);
                    this.W += 4;
                } else {
                    int iA2 = h26Var.a();
                    if (iA2 > 0) {
                        iE = Math.min(i17, iA2);
                        cp8Var.d(iE, h26Var);
                    } else {
                        iE = cp8Var.e(w72Var, i17, false);
                    }
                    this.V += iE;
                    this.W += iE;
                    this.X -= iE;
                }
            }
        }
        if ("A_VORBIS".equals(tk4Var.c)) {
            h26 h26Var7 = this.j;
            h26Var7.J(0);
            cp8Var.d(4, h26Var7);
            this.W += 4;
        }
        int i18 = this.W;
        l();
        return i18;
    }

    public final void p(w72 w72Var, byte[] bArr, int i) {
        int length = bArr.length + i;
        h26 h26Var = this.m;
        byte[] bArr2 = h26Var.a;
        if (bArr2.length < length) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, length + i);
            h26Var.getClass();
            h26Var.H(bArrCopyOf.length, bArrCopyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        w72Var.readFully(h26Var.a, bArr.length, i);
        h26Var.J(0);
        h26Var.I(length);
    }

    @Override // defpackage.v72
    public final void a() {
    }
}
