package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.b;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.exoplayer.hls.a;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import com.google.common.collect.ImmutableList;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class x03 implements pa4, sa4, ko7, x72, nc7 {
    public static final Set Y = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    public int A;
    public int B;
    public boolean C;
    public boolean D;
    public int E;
    public b F;
    public b G;
    public boolean H;
    public zo8 I;
    public Set J;
    public int[] K;
    public int L;
    public boolean M;
    public boolean[] N;
    public boolean[] O;
    public long P;
    public long Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public long V;
    public DrmInitData W;
    public zz2 X;
    public final String a;
    public final int b;
    public final pt2 c;
    public final yz2 d;
    public final qc1 e;
    public final b f;
    public final vw1 g;
    public final sw1 h;
    public final fv i;
    public final wv8 j = new wv8("Loader:HlsSampleStreamWrapper");
    public final pg k;
    public final int l;
    public final ir9 m;
    public final ArrayList n;
    public final List o;
    public final t03 p;
    public final t03 q;
    public final Handler r;
    public final ArrayList s;
    public final Map t;
    public cr0 u;
    public w03[] v;
    public int[] w;
    public final HashSet x;
    public final SparseIntArray y;
    public v03 z;

    /* JADX WARN: Type inference failed for: r1v12, types: [t03] */
    /* JADX WARN: Type inference failed for: r1v13, types: [t03] */
    public x03(String str, int i, pt2 pt2Var, yz2 yz2Var, Map map, qc1 qc1Var, long j, b bVar, vw1 vw1Var, sw1 sw1Var, fv fvVar, pg pgVar, int i2) {
        this.a = str;
        this.b = i;
        this.c = pt2Var;
        this.d = yz2Var;
        this.t = map;
        this.e = qc1Var;
        this.f = bVar;
        this.g = vw1Var;
        this.h = sw1Var;
        this.i = fvVar;
        this.k = pgVar;
        this.l = i2;
        ir9 ir9Var = new ir9(1);
        ir9Var.c = null;
        final int i3 = 0;
        ir9Var.b = false;
        ir9Var.d = null;
        this.m = ir9Var;
        this.w = new int[0];
        Set set = Y;
        this.x = new HashSet(set.size());
        this.y = new SparseIntArray(set.size());
        this.v = new w03[0];
        this.O = new boolean[0];
        this.N = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.n = arrayList;
        this.o = DesugarCollections.unmodifiableList(arrayList);
        this.s = new ArrayList();
        this.p = new Runnable(this) { // from class: t03
            public final /* synthetic */ x03 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i3) {
                    case 0:
                        this.b.F();
                        break;
                    default:
                        x03 x03Var = this.b;
                        x03Var.C = true;
                        x03Var.F();
                        break;
                }
            }
        };
        final int i4 = 1;
        this.q = new Runnable(this) { // from class: t03
            public final /* synthetic */ x03 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i4) {
                    case 0:
                        this.b.F();
                        break;
                    default:
                        x03 x03Var = this.b;
                        x03Var.C = true;
                        x03Var.F();
                        break;
                }
            }
        };
        this.r = j29.p(null);
        this.P = j;
        this.Q = j;
    }

    public static b A(b bVar, b bVar2, boolean z) {
        String strB;
        if (bVar == null) {
            return bVar2;
        }
        String str = bVar.k;
        String strD = bVar2.n;
        int iH = tv4.h(strD);
        if (j29.u(iH, str) == 1) {
            strB = j29.v(iH, str);
            strD = tv4.d(strB);
        } else {
            strB = tv4.b(str, strD);
        }
        rj2 rj2VarA = bVar2.a();
        rj2VarA.a = bVar.a;
        rj2VarA.b = bVar.b;
        rj2VarA.c = ImmutableList.n(bVar.c);
        rj2VarA.d = bVar.d;
        rj2VarA.e = bVar.e;
        rj2VarA.f = bVar.f;
        rj2VarA.h = z ? bVar.h : -1;
        rj2VarA.i = z ? bVar.i : -1;
        rj2VarA.j = strB;
        if (iH == 2) {
            rj2VarA.t = bVar.u;
            rj2VarA.u = bVar.v;
            rj2VarA.x = bVar.y;
        }
        if (strD != null) {
            rj2VarA.m = tv4.m(strD);
        }
        int i = bVar.F;
        if (i != -1 && iH == 1) {
            rj2VarA.E = i;
        }
        jv4 jv4VarB = bVar.l;
        if (jv4VarB != null) {
            jv4 jv4Var = bVar2.l;
            if (jv4Var != null) {
                jv4VarB = jv4Var.b(jv4VarB);
            }
            rj2VarA.k = jv4VarB;
        }
        return new b(rj2VarA);
    }

    public static int D(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 3;
    }

    public static uo1 y(int i, int i2) {
        wn5.k0("HlsSampleStreamWrapper", "Unmapped track with id " + i + " of type " + i2);
        return new uo1();
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B(int r18) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x03.B(int):void");
    }

    public final zz2 C() {
        return (zz2) o40.u(1, this.n);
    }

    public final boolean E() {
        return this.Q != -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void F() {
        int i;
        if (!this.H && this.K == null && this.C) {
            int i2 = 0;
            for (w03 w03Var : this.v) {
                if (w03Var.t() == null) {
                    return;
                }
            }
            zo8 zo8Var = this.I;
            if (zo8Var != null) {
                int i3 = zo8Var.a;
                int[] iArr = new int[i3];
                this.K = iArr;
                Arrays.fill(iArr, -1);
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = 0;
                    while (true) {
                        w03[] w03VarArr = this.v;
                        if (i5 < w03VarArr.length) {
                            b bVarT = w03VarArr[i5].t();
                            vy2.t(bVarT);
                            b bVar = this.I.a(i4).d[0];
                            String str = bVarT.n;
                            String str2 = bVar.n;
                            int iH = tv4.h(str);
                            if (iH != 3) {
                                if (iH == tv4.h(str2)) {
                                    break;
                                } else {
                                    i5++;
                                }
                            } else if (Objects.equals(str, str2) && (!("application/cea-608".equals(str) || "application/cea-708".equals(str)) || bVarT.K == bVar.K)) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                    }
                    this.K[i4] = i5;
                }
                Iterator it = this.s.iterator();
                while (it.hasNext()) {
                    ((s03) it.next()).a();
                }
                return;
            }
            int length = this.v.length;
            int i6 = 0;
            int i7 = -1;
            int i8 = -2;
            while (true) {
                int i9 = 1;
                if (i6 >= length) {
                    break;
                }
                b bVarT2 = this.v[i6].t();
                vy2.t(bVarT2);
                String str3 = bVarT2.n;
                if (tv4.l(str3)) {
                    i9 = 2;
                } else if (!tv4.i(str3)) {
                    i9 = tv4.k(str3) ? 3 : -2;
                }
                if (D(i9) > D(i8)) {
                    i7 = i6;
                    i8 = i9;
                } else if (i9 == i8 && i7 != -1) {
                    i7 = -1;
                }
                i6++;
            }
            yo8 yo8Var = this.d.h;
            int i10 = yo8Var.a;
            this.L = -1;
            this.K = new int[length];
            for (int i11 = 0; i11 < length; i11++) {
                this.K[i11] = i11;
            }
            yo8[] yo8VarArr = new yo8[length];
            int i12 = 0;
            while (i12 < length) {
                b bVarT3 = this.v[i12].t();
                vy2.t(bVarT3);
                String str4 = this.a;
                b bVar2 = this.f;
                if (i12 == i7) {
                    b[] bVarArr = new b[i10];
                    for (int i13 = i2; i13 < i10; i13++) {
                        b bVarD = yo8Var.d[i13];
                        if (i8 == 1 && bVar2 != null) {
                            bVarD = bVarD.d(bVar2);
                        }
                        bVarArr[i13] = i10 == 1 ? bVarT3.d(bVarD) : A(bVarD, bVarT3, true);
                    }
                    yo8VarArr[i12] = new yo8(str4, bVarArr);
                    this.L = i12;
                    i = 0;
                } else {
                    if (i8 != 2 || !tv4.i(bVarT3.n)) {
                        bVar2 = null;
                    }
                    StringBuilder sbE = bl4.E(str4, ":muxed:");
                    sbE.append(i12 < i7 ? i12 : i12 - 1);
                    i = 0;
                    yo8VarArr[i12] = new yo8(sbE.toString(), A(bVar2, bVarT3, false));
                }
                i12++;
                i2 = i;
            }
            int i14 = i2;
            this.I = z(yo8VarArr);
            vy2.s(this.J == null ? 1 : i14);
            this.J = Collections.EMPTY_SET;
            this.D = true;
            this.c.x();
        }
    }

    public final void G() throws IOException {
        wv8 wv8Var = this.j;
        IOException iOException = (IOException) wv8Var.d;
        if (iOException != null) {
            throw iOException;
        }
        qa4 qa4Var = (qa4) wv8Var.c;
        if (qa4Var != null) {
            int i = qa4Var.a;
            IOException iOException2 = qa4Var.e;
            if (iOException2 != null && qa4Var.f > i) {
                throw iOException2;
            }
        }
        yz2 yz2Var = this.d;
        BehindLiveWindowException behindLiveWindowException = yz2Var.n;
        if (behindLiveWindowException != null) {
            throw behindLiveWindowException;
        }
        Uri uri = yz2Var.o;
        if (uri == null || !uri.equals(yz2Var.p)) {
            return;
        }
        af1 af1Var = yz2Var.g;
        ze1 ze1Var = (ze1) af1Var.d.get(yz2Var.o);
        wv8 wv8Var2 = ze1Var.b;
        IOException iOException3 = (IOException) wv8Var2.d;
        if (iOException3 != null) {
            throw iOException3;
        }
        qa4 qa4Var2 = (qa4) wv8Var2.c;
        if (qa4Var2 != null) {
            int i2 = qa4Var2.a;
            IOException iOException4 = qa4Var2.e;
            if (iOException4 != null && qa4Var2.f > i2) {
                throw iOException4;
            }
        }
        IOException iOException5 = ze1Var.j;
        if (iOException5 != null) {
            throw iOException5;
        }
    }

    public final void H(yo8[] yo8VarArr, int... iArr) {
        this.I = z(yo8VarArr);
        this.J = new HashSet();
        for (int i : iArr) {
            this.J.add(this.I.a(i));
        }
        this.L = 0;
        this.r.post(new u03(0, this.c));
        this.D = true;
    }

    public final void I() {
        for (w03 w03Var : this.v) {
            w03Var.z(this.R);
        }
        this.R = false;
    }

    public final boolean J(long j, boolean z) {
        zz2 zz2Var;
        boolean z2;
        boolean zC;
        this.P = j;
        if (E()) {
            this.Q = j;
            return true;
        }
        boolean z3 = this.d.q;
        ArrayList arrayList = this.n;
        if (z3) {
            for (int i = 0; i < arrayList.size(); i++) {
                zz2Var = (zz2) arrayList.get(i);
                if (zz2Var.g == j) {
                    break;
                }
            }
            zz2Var = null;
        } else {
            zz2Var = null;
        }
        if (this.C && !z && !arrayList.isEmpty()) {
            int length = this.v.length;
            for (int i2 = 0; i2 < length; i2++) {
                w03 w03Var = this.v[i2];
                if (zz2Var != null) {
                    zC = w03Var.B(zz2Var.e(i2));
                } else {
                    long jF = f();
                    zC = w03Var.C(j, jF == Long.MIN_VALUE || j < jF);
                }
                if (!zC && (this.O[i2] || !this.M)) {
                    z2 = false;
                    break;
                }
            }
            z2 = true;
            if (z2) {
                return false;
            }
        }
        this.Q = j;
        this.T = false;
        arrayList.clear();
        wv8 wv8Var = this.j;
        if (!wv8Var.E()) {
            wv8Var.d = null;
            I();
            return true;
        }
        if (this.C) {
            for (w03 w03Var2 : this.v) {
                w03Var2.j();
            }
        }
        wv8Var.n();
        return true;
    }

    @Override // defpackage.ko7
    public final boolean a() {
        return this.j.E();
    }

    @Override // defpackage.sa4
    public final void b() {
        for (w03 w03Var : this.v) {
            w03Var.z(true);
            pw1 pw1Var = w03Var.h;
            if (pw1Var != null) {
                pw1Var.c(w03Var.e);
                w03Var.h = null;
                w03Var.g = null;
            }
        }
    }

    @Override // defpackage.pa4
    public final void c(ra4 ra4Var, long j, long j2, boolean z) {
        cr0 cr0Var = (cr0) ra4Var;
        this.u = null;
        long j3 = cr0Var.a;
        da4 da4Var = new da4(cr0Var.b, cr0Var.i.c, j2);
        this.i.getClass();
        this.k.n(da4Var, cr0Var.c, this.b, cr0Var.d, cr0Var.e, cr0Var.f, cr0Var.g, cr0Var.h);
        if (z) {
            return;
        }
        if (E() || this.E == 0) {
            I();
        }
        if (this.E > 0) {
            this.c.l(this);
        }
    }

    @Override // defpackage.pa4
    public final void d(ra4 ra4Var, long j, long j2) {
        cr0 cr0Var = (cr0) ra4Var;
        this.u = null;
        if (cr0Var instanceof uz2) {
            uz2 uz2Var = (uz2) cr0Var;
            byte[] bArr = uz2Var.j;
            yz2 yz2Var = this.d;
            yz2Var.m = bArr;
            a aVar = yz2Var.j;
            Uri uri = uz2Var.b.a;
            byte[] bArr2 = uz2Var.l;
            bArr2.getClass();
            LinkedHashMap linkedHashMap = aVar.a;
            uri.getClass();
        }
        long j3 = cr0Var.a;
        da4 da4Var = new da4(cr0Var.b, cr0Var.i.c, j2);
        this.i.getClass();
        this.k.o(da4Var, cr0Var.c, this.b, cr0Var.d, cr0Var.e, cr0Var.f, cr0Var.g, cr0Var.h);
        if (this.D) {
            this.c.l(this);
            return;
        }
        ab4 ab4Var = new ab4();
        ab4Var.a = this.P;
        p(new bb4(ab4Var));
    }

    @Override // defpackage.ko7
    public final long f() {
        if (E()) {
            return this.Q;
        }
        if (this.T) {
            return Long.MIN_VALUE;
        }
        return C().h;
    }

    @Override // defpackage.pa4
    public final void j(ra4 ra4Var, long j, long j2, int i) {
        da4 da4Var;
        cr0 cr0Var = (cr0) ra4Var;
        if (i == 0) {
            long j3 = cr0Var.a;
            da4Var = new da4(cr0Var.b);
        } else {
            long j4 = cr0Var.a;
            da4Var = new da4(cr0Var.b, cr0Var.i.c, j2);
        }
        da4 da4Var2 = da4Var;
        this.k.r(da4Var2, cr0Var.c, this.b, cr0Var.d, cr0Var.e, cr0Var.f, cr0Var.g, cr0Var.h, i);
    }

    @Override // defpackage.x72
    public final void l() {
        this.U = true;
        this.r.post(this.q);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [w03[]] */
    /* JADX WARN: Type inference failed for: r1v1, types: [w03[]] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [cp8] */
    /* JADX WARN: Type inference failed for: r5v4, types: [oc7, w03] */
    /* JADX WARN: Type inference failed for: r5v6, types: [uo1] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // defpackage.x72
    public final cp8 o(int i, int i2) {
        Integer numValueOf = Integer.valueOf(i2);
        Set set = Y;
        boolean zContains = set.contains(numValueOf);
        HashSet hashSet = this.x;
        SparseIntArray sparseIntArray = this.y;
        ?? w03Var = 0;
        w03Var = 0;
        if (zContains) {
            vy2.j(set.contains(Integer.valueOf(i2)));
            int i3 = sparseIntArray.get(i2, -1);
            if (i3 != -1) {
                if (hashSet.add(Integer.valueOf(i2))) {
                    this.w[i3] = i;
                }
                w03Var = this.w[i3] == i ? this.v[i3] : y(i, i2);
            }
        } else {
            int i4 = 0;
            while (true) {
                ?? r1 = this.v;
                if (i4 >= r1.length) {
                    break;
                }
                if (this.w[i4] == i) {
                    w03Var = r1[i4];
                    break;
                }
                i4++;
            }
        }
        if (w03Var == 0) {
            if (this.U) {
                return y(i, i2);
            }
            int length = this.v.length;
            boolean z = i2 == 1 || i2 == 2;
            w03Var = new w03(this.e, this.g, this.h, this.t);
            w03Var.t = this.P;
            if (z) {
                w03Var.I = this.W;
                w03Var.z = true;
            }
            long j = this.V;
            if (w03Var.F != j) {
                w03Var.F = j;
                w03Var.z = true;
            }
            if (this.X != null) {
                w03Var.C = r6.k;
            }
            w03Var.f = this;
            int i5 = length + 1;
            int[] iArrCopyOf = Arrays.copyOf(this.w, i5);
            this.w = iArrCopyOf;
            iArrCopyOf[length] = i;
            w03[] w03VarArr = this.v;
            String str = j29.a;
            ?? CopyOf = Arrays.copyOf(w03VarArr, w03VarArr.length + 1);
            CopyOf[w03VarArr.length] = w03Var;
            this.v = (w03[]) CopyOf;
            boolean[] zArrCopyOf = Arrays.copyOf(this.O, i5);
            this.O = zArrCopyOf;
            zArrCopyOf[length] = z;
            this.M |= z;
            hashSet.add(Integer.valueOf(i2));
            sparseIntArray.append(i2, length);
            if (D(i2) > D(this.A)) {
                this.B = length;
                this.A = i2;
            }
            this.N = Arrays.copyOf(this.N, i5);
        }
        if (i2 != 5) {
            return w03Var;
        }
        if (this.z == null) {
            this.z = new v03(w03Var, this.l);
        }
        return this.z;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0200  */
    @Override // defpackage.ko7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean p(defpackage.bb4 r75) {
        /*
            Method dump skipped, instruction units count: 1338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x03.p(bb4):boolean");
    }

    @Override // defpackage.ko7
    public final long q() {
        if (this.T) {
            return Long.MIN_VALUE;
        }
        if (E()) {
            return this.Q;
        }
        long jMax = this.P;
        zz2 zz2VarC = C();
        if (!zz2VarC.H) {
            ArrayList arrayList = this.n;
            zz2VarC = arrayList.size() > 1 ? (zz2) o40.u(2, arrayList) : null;
        }
        if (zz2VarC != null) {
            jMax = Math.max(jMax, zz2VarC.h);
        }
        if (this.C) {
            for (w03 w03Var : this.v) {
                jMax = Math.max(jMax, w03Var.n());
            }
        }
        return jMax;
    }

    @Override // defpackage.nc7
    public final void r() {
        this.r.post(this.p);
    }

    @Override // defpackage.pa4
    public final ca4 u(ra4 ra4Var, long j, long j2, IOException iOException, int i) {
        boolean zO;
        ca4 ca4Var;
        int i2;
        cr0 cr0Var = (cr0) ra4Var;
        boolean z = cr0Var instanceof zz2;
        if (z && !((zz2) cr0Var).f() && (iOException instanceof HttpDataSource$InvalidResponseCodeException) && ((i2 = ((HttpDataSource$InvalidResponseCodeException) iOException).e) == 410 || i2 == 404)) {
            return wv8.h;
        }
        long j3 = cr0Var.i.b;
        da4 da4Var = new da4(cr0Var.b, cr0Var.i.c, j2);
        j29.k0(cr0Var.g);
        j29.k0(cr0Var.h);
        dc0 dc0Var = new dc0(i, 5, iOException);
        yz2 yz2Var = this.d;
        ba4 ba4VarE = sa7.e(yz2Var.r);
        this.i.getClass();
        ca4 ca4VarY = fv.y(ba4VarE, dc0Var);
        if (ca4VarY == null || ca4VarY.a != 2) {
            zO = false;
        } else {
            long j4 = ca4VarY.b;
            p62 p62Var = yz2Var.r;
            zO = p62Var.o(p62Var.t(yz2Var.h.b(cr0Var.d)), j4);
        }
        if (zO) {
            if (z && j3 == 0) {
                ArrayList arrayList = this.n;
                vy2.s(((zz2) arrayList.remove(arrayList.size() - 1)) == cr0Var);
                if (arrayList.isEmpty()) {
                    this.Q = this.P;
                } else {
                    ((zz2) tv8.q(arrayList)).J = true;
                }
            }
            ca4Var = wv8.i;
        } else {
            long jA = fv.A(dc0Var);
            ca4Var = jA != -9223372036854775807L ? new ca4(0, jA, false) : wv8.j;
        }
        ca4 ca4Var2 = ca4Var;
        int i3 = ca4Var2.a;
        boolean z2 = i3 == 0 || i3 == 1;
        this.k.p(da4Var, cr0Var.c, this.b, cr0Var.d, cr0Var.e, cr0Var.f, cr0Var.g, cr0Var.h, iOException, !z2);
        if (!z2) {
            this.u = null;
        }
        if (zO) {
            if (!this.D) {
                ab4 ab4Var = new ab4();
                ab4Var.a = this.P;
                p(new bb4(ab4Var));
                return ca4Var2;
            }
            this.c.l(this);
        }
        return ca4Var2;
    }

    @Override // defpackage.ko7
    public final void v(long j) {
        wv8 wv8Var = this.j;
        if (((IOException) wv8Var.d) == null && !E()) {
            boolean zE = wv8Var.E();
            yz2 yz2Var = this.d;
            List list = this.o;
            if (zE) {
                this.u.getClass();
                if (yz2Var.n != null ? false : yz2Var.r.e(j, this.u, list)) {
                    wv8Var.n();
                    return;
                }
                return;
            }
            int size = list.size();
            while (size > 0 && yz2Var.b((zz2) list.get(size - 1)) == 2) {
                size--;
            }
            if (size < list.size()) {
                B(size);
            }
            int size2 = (yz2Var.n != null || yz2Var.r.length() < 2) ? list.size() : yz2Var.r.j(j, list);
            if (size2 < this.n.size()) {
                B(size2);
            }
        }
    }

    public final void w() {
        vy2.s(this.D);
        this.I.getClass();
        this.J.getClass();
    }

    public final boolean x(int i) {
        int i2 = i;
        while (true) {
            ArrayList arrayList = this.n;
            if (i2 >= arrayList.size()) {
                zz2 zz2Var = (zz2) arrayList.get(i);
                for (int i3 = 0; i3 < this.v.length; i3++) {
                    if (this.v[i3].q() > zz2Var.e(i3)) {
                        return false;
                    }
                }
                return true;
            }
            if (((zz2) arrayList.get(i2)).L) {
                return false;
            }
            i2++;
        }
    }

    public final zo8 z(yo8[] yo8VarArr) {
        for (int i = 0; i < yo8VarArr.length; i++) {
            yo8 yo8Var = yo8VarArr[i];
            b[] bVarArr = new b[yo8Var.a];
            for (int i2 = 0; i2 < yo8Var.a; i2++) {
                b bVar = yo8Var.d[i2];
                int iL = this.g.l(bVar);
                rj2 rj2VarA = bVar.a();
                rj2VarA.N = iL;
                bVarArr[i2] = new b(rj2VarA);
            }
            yo8VarArr[i] = new yo8(yo8Var.b, bVarArr);
        }
        return new zo8(yo8VarArr);
    }

    @Override // defpackage.x72
    public final void t(kl7 kl7Var) {
    }
}
