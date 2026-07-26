package kotlinx.serialization.json.internal;

import defpackage.br9;
import defpackage.bt2;
import defpackage.bv3;
import defpackage.cc1;
import defpackage.dt2;
import defpackage.fz1;
import defpackage.hv3;
import defpackage.iv3;
import defpackage.js3;
import defpackage.kv3;
import defpackage.l02;
import defpackage.ln2;
import defpackage.no7;
import defpackage.o78;
import defpackage.pg;
import defpackage.pu3;
import defpackage.px3;
import defpackage.rb4;
import defpackage.rm7;
import defpackage.t0;
import defpackage.tz0;
import defpackage.yq2;
import org.pcap4j.packet.constant.Ssh2PublicKeyAlgorithmName;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends yq2 implements hv3 {
    public final pu3 g;
    public final WriteMode h;
    public final t0 i;
    public final rb4 j;
    public int k;
    public l02 l;
    public final bv3 m;
    public final a n;

    public c(pu3 pu3Var, WriteMode writeMode, t0 t0Var, no7 no7Var, l02 l02Var) {
        js3.p(no7Var, "descriptor");
        this.g = pu3Var;
        this.h = writeMode;
        this.i = t0Var;
        this.j = pu3Var.b;
        this.k = -1;
        this.l = l02Var;
        bv3 bv3Var = pu3Var.a;
        this.m = bv3Var;
        this.n = bv3Var.d ? null : new a(no7Var);
    }

    @Override // defpackage.yq2, defpackage.cc1
    public final byte B() {
        t0 t0Var = this.i;
        long jI = t0Var.i();
        byte b = (byte) jI;
        if (jI == b) {
            return b;
        }
        t0.t(t0Var, "Failed to parse byte for input '" + jI + '\'', 0, null, 6);
        throw null;
    }

    @Override // defpackage.yq2, defpackage.cc1
    public final short C() {
        t0 t0Var = this.i;
        long jI = t0Var.i();
        short s = (short) jI;
        if (jI == s) {
            return s;
        }
        t0.t(t0Var, "Failed to parse short for input '" + jI + '\'', 0, null, 6);
        throw null;
    }

    @Override // defpackage.yq2, defpackage.cc1
    public final float D() {
        t0 t0Var = this.i;
        String strL = t0Var.l();
        try {
            float f = Float.parseFloat(strL);
            if (Math.abs(f) <= Float.MAX_VALUE) {
                return f;
            }
            br9.Q(t0Var, Float.valueOf(f));
            throw null;
        } catch (IllegalArgumentException unused) {
            t0.t(t0Var, rm7.m('\'', "Failed to parse type 'float' for input '", strL), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.yq2, defpackage.cc1
    public final double F() {
        t0 t0Var = this.i;
        String strL = t0Var.l();
        try {
            double d = Double.parseDouble(strL);
            if (Math.abs(d) <= Double.MAX_VALUE) {
                return d;
            }
            br9.Q(t0Var, Double.valueOf(d));
            throw null;
        } catch (IllegalArgumentException unused) {
            t0.t(t0Var, rm7.m('\'', "Failed to parse type 'double' for input '", strL), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.yq2, defpackage.tz0
    public final void a(no7 no7Var) {
        js3.p(no7Var, "descriptor");
        if (no7Var.e() == 0 && bt2.C(this.g, no7Var)) {
            while (i(no7Var) != -1) {
            }
        }
        t0 t0Var = this.i;
        if (t0Var.I()) {
            br9.A(t0Var, "");
            throw null;
        }
        t0Var.h(this.h.b);
        pg pgVar = (pg) t0Var.c;
        int i = pgVar.b;
        int[] iArr = (int[]) pgVar.d;
        if (iArr[i] == -2) {
            iArr[i] = -1;
            pgVar.b = i - 1;
        }
        int i2 = pgVar.b;
        if (i2 != -1) {
            pgVar.b = i2 - 1;
        }
    }

    @Override // defpackage.tz0
    public final rb4 b() {
        return this.j;
    }

    @Override // defpackage.yq2, defpackage.cc1
    public final tz0 c(no7 no7Var) {
        js3.p(no7Var, "descriptor");
        pu3 pu3Var = this.g;
        WriteMode writeModeH = ln2.h(pu3Var, no7Var);
        t0 t0Var = this.i;
        pg pgVar = (pg) t0Var.c;
        int i = pgVar.b + 1;
        pgVar.b = i;
        if (i == ((Object[]) pgVar.c).length) {
            pgVar.t();
        }
        ((Object[]) pgVar.c)[i] = no7Var;
        t0Var.h(writeModeH.a);
        if (t0Var.z() != 4) {
            int iOrdinal = writeModeH.ordinal();
            return (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) ? new c(pu3Var, writeModeH, t0Var, no7Var, this.l) : (this.h == writeModeH && pu3Var.a.d) ? this : new c(pu3Var, writeModeH, t0Var, no7Var, this.l);
        }
        t0.t(t0Var, "Unexpected leading comma", 0, null, 6);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011f  */
    @Override // defpackage.yq2, defpackage.cc1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.px3 r11) {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.c.e(px3):java.lang.Object");
    }

    @Override // defpackage.yq2, defpackage.cc1
    public final boolean g() {
        boolean z;
        boolean z2;
        t0 t0Var = this.i;
        int iG = t0Var.G();
        if (iG == t0Var.v().length()) {
            t0.t(t0Var, "EOF", 0, null, 6);
            throw null;
        }
        if (t0Var.v().charAt(iG) == '\"') {
            iG++;
            z = true;
        } else {
            z = false;
        }
        int iC = t0Var.C(iG);
        if (iC >= t0Var.v().length() || iC == -1) {
            t0.t(t0Var, "EOF", 0, null, 6);
            throw null;
        }
        int i = iC + 1;
        int iCharAt = t0Var.v().charAt(iC) | ' ';
        if (iCharAt == 102) {
            t0Var.d(i, "alse");
            z2 = false;
        } else {
            if (iCharAt != 116) {
                t0.t(t0Var, "Expected valid boolean literal prefix, but had '" + t0Var.l() + '\'', 0, null, 6);
                throw null;
            }
            t0Var.d(i, "rue");
            z2 = true;
        }
        if (!z) {
            return z2;
        }
        if (t0Var.b == t0Var.v().length()) {
            t0.t(t0Var, "EOF", 0, null, 6);
            throw null;
        }
        if (t0Var.v().charAt(t0Var.b) == '\"') {
            t0Var.b++;
            return z2;
        }
        t0.t(t0Var, "Expected closing quotation mark", 0, null, 6);
        throw null;
    }

    @Override // defpackage.yq2, defpackage.cc1
    public final char h() {
        t0 t0Var = this.i;
        String strL = t0Var.l();
        if (strL.length() == 1) {
            return strL.charAt(0);
        }
        t0.t(t0Var, rm7.m('\'', "Expected single char, but got '", strL), 0, null, 6);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00f6, code lost:
    
        r1 = r3.b;
        r4 = (int[]) r3.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00ff, code lost:
    
        if (r4[r1] != (-2)) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0101, code lost:
    
        r4[r1] = -1;
        r3.b = r1 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0106, code lost:
    
        r1 = r3.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0108, code lost:
    
        if (r1 == (-1)) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x010a, code lost:
    
        r3.b = r1 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x010d, code lost:
    
        r1 = defpackage.f88.p0(6, r2.H(0, r2.b), r5);
        r5 = defpackage.o40.B(r1, "Encountered an unknown key '", r5, "' at offset ", " at path: ");
        r5.append(r3.j());
        r5.append("\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: ");
        r5.append((java.lang.Object) defpackage.br9.D(r1, r2.v()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0142, code lost:
    
        throw new kotlinx.serialization.json.internal.JsonDecodingException(r5.toString());
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.tz0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int i(defpackage.no7 r22) {
        /*
            Method dump skipped, instruction units count: 639
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.c.i(no7):int");
    }

    @Override // defpackage.hv3
    public final kv3 m() {
        return new b(this.g.a, this.i).b();
    }

    @Override // defpackage.yq2, defpackage.cc1
    public final int p() {
        t0 t0Var = this.i;
        long jI = t0Var.i();
        int i = (int) jI;
        if (jI == i) {
            return i;
        }
        t0.t(t0Var, "Failed to parse int for input '" + jI + '\'', 0, null, 6);
        throw null;
    }

    @Override // defpackage.yq2, defpackage.cc1
    public final cc1 r(no7 no7Var) {
        js3.p(no7Var, "descriptor");
        return o78.a(no7Var) ? new iv3(this.i, this.g) : this;
    }

    @Override // defpackage.yq2, defpackage.tz0
    public final Object s(no7 no7Var, int i, px3 px3Var, Object obj) {
        pg pgVar = (pg) this.i.c;
        js3.p(no7Var, "descriptor");
        js3.p(px3Var, "deserializer");
        boolean z = this.h == WriteMode.e && (i & 1) == 0;
        if (z) {
            int[] iArr = (int[]) pgVar.d;
            int i2 = pgVar.b;
            if (iArr[i2] == -2) {
                ((Object[]) pgVar.c)[i2] = fz1.n;
            }
        }
        Object objS = super.s(no7Var, i, px3Var, obj);
        if (z) {
            int[] iArr2 = (int[]) pgVar.d;
            int i3 = pgVar.b;
            if (iArr2[i3] != -2) {
                int i4 = i3 + 1;
                pgVar.b = i4;
                if (i4 == ((Object[]) pgVar.c).length) {
                    pgVar.t();
                }
            }
            Object[] objArr = (Object[]) pgVar.c;
            int i5 = pgVar.b;
            objArr[i5] = objS;
            ((int[]) pgVar.d)[i5] = -2;
        }
        return objS;
    }

    @Override // defpackage.yq2, defpackage.cc1
    public final String v() {
        boolean z = this.m.c;
        t0 t0Var = this.i;
        return z ? t0Var.m() : t0Var.j();
    }

    @Override // defpackage.yq2, defpackage.cc1
    public final int w(no7 no7Var) {
        js3.p(no7Var, "enumDescriptor");
        return bt2.A(no7Var, this.g, v(), " at path " + ((pg) this.i.c).j());
    }

    @Override // defpackage.yq2, defpackage.cc1
    public final long x() {
        return this.i.i();
    }

    @Override // defpackage.yq2, defpackage.cc1
    public final boolean y() {
        a aVar = this.n;
        if (!(aVar != null ? aVar.b : false)) {
            t0 t0Var = this.i;
            int iC = t0Var.C(t0Var.G());
            int length = t0Var.v().length() - iC;
            boolean z = false;
            if (length >= 4 && iC != -1) {
                int i = 0;
                while (true) {
                    if (i < 4) {
                        if (Ssh2PublicKeyAlgorithmName.NULL.charAt(i) != t0Var.v().charAt(iC + i)) {
                            break;
                        }
                        i++;
                    } else if (length <= 4 || dt2.e(t0Var.v().charAt(iC + 4)) != 0) {
                        z = true;
                        t0Var.b = iC + 4;
                    }
                }
            }
            if (!z) {
                return true;
            }
        }
        return false;
    }
}
