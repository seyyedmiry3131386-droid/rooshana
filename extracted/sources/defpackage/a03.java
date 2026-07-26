package defpackage;

import android.net.Uri;
import android.util.SparseArray;
import androidx.media3.common.ParserException;
import androidx.media3.common.b;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class a03 implements zp4, r03 {
    public final xe1 a;
    public final af1 b;
    public final pt2 c;
    public final fq8 d;
    public final vw1 e;
    public final sw1 f;
    public final fv g;
    public final pg h;
    public final qc1 i;
    public final IdentityHashMap j;
    public final xg5 k;
    public final fv l;
    public final boolean m;
    public final int n;
    public final ee6 o;
    public final pt2 p = new pt2(26, this);
    public yp4 q;
    public int r;
    public zo8 s;
    public x03[] t;
    public x03[] u;
    public int v;
    public b01 w;

    public a03(xe1 xe1Var, af1 af1Var, pt2 pt2Var, fq8 fq8Var, vw1 vw1Var, sw1 sw1Var, fv fvVar, pg pgVar, qc1 qc1Var, fv fvVar2, boolean z, int i, ee6 ee6Var) {
        this.a = xe1Var;
        this.b = af1Var;
        this.c = pt2Var;
        this.d = fq8Var;
        this.e = vw1Var;
        this.f = sw1Var;
        this.g = fvVar;
        this.h = pgVar;
        this.i = qc1Var;
        this.l = fvVar2;
        this.m = z;
        this.n = i;
        this.o = ee6Var;
        fvVar2.getClass();
        this.w = new b01(ImmutableList.q(), ImmutableList.q());
        this.j = new IdentityHashMap();
        this.k = new xg5(14);
        this.t = new x03[0];
        this.u = new x03[0];
    }

    public static b j(b bVar, b bVar2, boolean z) {
        jv4 jv4Var;
        int i;
        String str;
        String str2;
        ImmutableList immutableList;
        int i2;
        int i3;
        String str3;
        ImmutableList immutableListQ = ImmutableList.q();
        if (bVar2 != null) {
            str2 = bVar2.k;
            jv4Var = bVar2.l;
            i2 = bVar2.F;
            i = bVar2.e;
            i3 = bVar2.f;
            str = bVar2.d;
            str3 = bVar2.b;
            immutableList = bVar2.c;
        } else {
            String strV = j29.v(1, bVar.k);
            jv4Var = bVar.l;
            if (z) {
                i2 = bVar.F;
                i = bVar.e;
                i3 = bVar.f;
                str = bVar.d;
                str3 = bVar.b;
                str2 = strV;
                immutableList = bVar.c;
            } else {
                i = 0;
                str = null;
                str2 = strV;
                immutableList = immutableListQ;
                i2 = -1;
                i3 = 0;
                str3 = null;
            }
        }
        String strD = tv4.d(str2);
        int i4 = z ? bVar.h : -1;
        int i5 = z ? bVar.i : -1;
        rj2 rj2Var = new rj2();
        rj2Var.a = bVar.a;
        rj2Var.b = str3;
        rj2Var.c = ImmutableList.n(immutableList);
        rj2Var.l = tv4.m(bVar.m);
        rj2Var.m = tv4.m(strD);
        rj2Var.j = str2;
        rj2Var.k = jv4Var;
        rj2Var.h = i4;
        rj2Var.i = i5;
        rj2Var.E = i2;
        rj2Var.e = i;
        rj2Var.f = i3;
        rj2Var.d = str;
        return new b(rj2Var);
    }

    @Override // defpackage.ko7
    public final boolean a() {
        return this.w.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.r03
    public final void b() {
        for (x03 x03Var : this.t) {
            wv8 wv8Var = x03Var.j;
            yz2 yz2Var = x03Var.d;
            ArrayList arrayList = x03Var.n;
            if (!arrayList.isEmpty()) {
                zz2 zz2Var = (zz2) tv8.q(arrayList);
                int iB = yz2Var.b(zz2Var);
                int i = zz2Var.o;
                if (iB == 1) {
                    if (!zz2Var.f()) {
                        vy2.s(i != -1);
                        j03 j03VarA = yz2Var.g.a(false, yz2Var.e[yz2Var.h.b(zz2Var.d)]);
                        j03VarA.getClass();
                        ImmutableList immutableList = j03VarA.r;
                        int i2 = (int) (zz2Var.j - j03VarA.k);
                        zz2Var.K = i2 < 0 ? 0L : ((e03) (i2 < immutableList.size() ? ((g03) immutableList.get(i2)).m : j03VarA.s).get(i)).c;
                    }
                } else if (iB == 0) {
                    x03Var.r.post(new g7(x03Var, zz2Var, 25));
                } else if (iB == 2 && !x03Var.T && wv8Var.E()) {
                    wv8Var.n();
                }
            }
        }
        this.q.l(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0056 A[SYNTHETIC] */
    @Override // defpackage.r03
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(android.net.Uri r18, defpackage.dc0 r19, boolean r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            x03[] r2 = r0.t
            int r3 = r2.length
            r6 = 0
            r7 = 1
        L9:
            if (r6 >= r3) goto L90
            r8 = r2[r6]
            yz2 r9 = r8.d
            android.net.Uri[] r10 = r9.e
            boolean r11 = defpackage.j29.l(r10, r1)
            if (r11 != 0) goto L1e
            r8 = r19
            r4 = 1
            r16 = 1
            goto L8b
        L1e:
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r20 != 0) goto L40
            fv r8 = r8.i
            p62 r13 = r9.r
            ba4 r13 = defpackage.sa7.e(r13)
            r8.getClass()
            r8 = r19
            ca4 r13 = defpackage.fv.y(r13, r8)
            if (r13 == 0) goto L42
            int r14 = r13.a
            r15 = 2
            if (r14 != r15) goto L42
            long r13 = r13.b
            goto L43
        L40:
            r8 = r19
        L42:
            r13 = r11
        L43:
            r15 = 0
            r16 = 1
        L46:
            int r4 = r10.length
            r5 = -1
            if (r15 >= r4) goto L56
            r4 = r10[r15]
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L53
            goto L57
        L53:
            int r15 = r15 + 1
            goto L46
        L56:
            r15 = r5
        L57:
            if (r15 != r5) goto L5a
            goto L87
        L5a:
            p62 r4 = r9.r
            int r4 = r4.t(r15)
            if (r4 != r5) goto L63
            goto L87
        L63:
            r9.o = r1
            int r5 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r5 == 0) goto L8a
            p62 r5 = r9.r
            boolean r4 = r5.o(r4, r13)
            if (r4 == 0) goto L8a
            af1 r4 = r9.g
            java.util.HashMap r4 = r4.d
            java.lang.Object r4 = r4.get(r1)
            ze1 r4 = (defpackage.ze1) r4
            if (r4 == 0) goto L84
            boolean r4 = defpackage.ze1.a(r4, r13)
            r4 = r4 ^ 1
            goto L85
        L84:
            r4 = 0
        L85:
            if (r4 == 0) goto L8a
        L87:
            r4 = r16
            goto L8b
        L8a:
            r4 = 0
        L8b:
            r7 = r7 & r4
            int r6 = r6 + 1
            goto L9
        L90:
            yp4 r1 = r0.q
            r1.l(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a03.c(android.net.Uri, dc0, boolean):boolean");
    }

    public final x03 d(String str, int i, Uri[] uriArr, b[] bVarArr, b bVar, List list, Map map, long j) {
        return new x03(str, i, this.p, new yz2(this.a, this.b, uriArr, bVarArr, this.c, this.d, this.k, list, this.o), map, this.i, j, bVar, this.e, this.f, this.g, this.h, this.n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0199  */
    /* JADX WARN: Type inference failed for: r30v0 */
    /* JADX WARN: Type inference failed for: r30v2 */
    /* JADX WARN: Type inference failed for: r30v3, types: [int] */
    /* JADX WARN: Type inference failed for: r30v5 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v5, types: [int] */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v40 */
    /* JADX WARN: Type inference failed for: r9v5 */
    @Override // defpackage.zp4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long e(defpackage.p62[] r40, boolean[] r41, defpackage.pc7[] r42, boolean[] r43, long r44) {
        /*
            Method dump skipped, instruction units count: 856
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a03.e(p62[], boolean[], pc7[], boolean[], long):long");
    }

    @Override // defpackage.ko7
    public final long f() {
        return this.w.f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.zp4
    public final long g(long j, ll7 ll7Var) {
        x03[] x03VarArr = this.u;
        int length = x03VarArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            x03 x03Var = x03VarArr[i];
            if (x03Var.A == 2) {
                yz2 yz2Var = x03Var.d;
                af1 af1Var = yz2Var.g;
                int iD = yz2Var.r.d();
                Uri[] uriArr = yz2Var.e;
                j03 j03VarA = (iD >= uriArr.length || iD == -1) ? null : af1Var.a(true, uriArr[yz2Var.r.l()]);
                if (j03VarA != null) {
                    ImmutableList immutableList = j03VarA.r;
                    if (!immutableList.isEmpty()) {
                        long j2 = j03VarA.h - af1Var.n;
                        long j3 = j - j2;
                        int iC = j29.c(immutableList, Long.valueOf(j3), true);
                        long j4 = ((g03) immutableList.get(iC)).e;
                        return ll7Var.a(j3, j4, (!j03VarA.c || iC == immutableList.size() - 1) ? j4 : ((g03) immutableList.get(iC + 1)).e) + j2;
                    }
                }
            } else {
                i++;
            }
        }
        return j;
    }

    @Override // defpackage.zp4
    public final void h() throws IOException {
        for (x03 x03Var : this.t) {
            x03Var.G();
            if (x03Var.T && !x03Var.D) {
                throw ParserException.a(null, "Loading finished before preparation is complete.");
            }
        }
    }

    @Override // defpackage.zp4
    public final long i(long j) {
        x03[] x03VarArr = this.u;
        if (x03VarArr.length > 0) {
            boolean zJ = x03VarArr[0].J(j, false);
            int i = 1;
            while (true) {
                x03[] x03VarArr2 = this.u;
                if (i >= x03VarArr2.length) {
                    break;
                }
                x03VarArr2[i].J(j, zJ);
                i++;
            }
            if (zJ) {
                ((SparseArray) this.k.b).clear();
            }
        }
        return j;
    }

    @Override // defpackage.zp4
    public final long k() {
        return -9223372036854775807L;
    }

    @Override // defpackage.zp4
    public final void m(yp4 yp4Var, long j) {
        xe1 xe1Var;
        boolean z;
        List list;
        List list2;
        HashSet hashSet;
        int i;
        HashSet hashSet2;
        int i2;
        boolean z2;
        xe1 xe1Var2;
        int i3;
        boolean z3;
        Uri[] uriArr;
        this.q = yp4Var;
        af1 af1Var = this.b;
        af1Var.getClass();
        af1Var.e.add(this);
        n03 n03Var = af1Var.j;
        n03Var.getClass();
        List list3 = n03Var.f;
        List list4 = n03Var.e;
        Map map = Collections.EMPTY_MAP;
        boolean zIsEmpty = list4.isEmpty();
        List list5 = n03Var.g;
        int i4 = 0;
        this.r = 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        xe1 xe1Var3 = this.a;
        boolean z4 = this.m;
        if (zIsEmpty) {
            xe1Var = xe1Var3;
            z = z4;
            list = list3;
            list2 = list5;
        } else {
            b bVar = n03Var.h;
            int size = list4.size();
            int[] iArr = new int[size];
            int i5 = 0;
            int i6 = 0;
            while (true) {
                list2 = list5;
                if (i5 >= list4.size()) {
                    break;
                }
                b bVar2 = ((m03) list4.get(i5)).b;
                int i7 = bVar2.v;
                String str = bVar2.k;
                if (i7 > 0 || j29.v(2, str) != null) {
                    iArr[i5] = 2;
                    i6++;
                } else if (j29.v(1, str) != null) {
                    iArr[i5] = 1;
                    i4++;
                } else {
                    iArr[i5] = -1;
                }
                i5++;
                list5 = list2;
            }
            if (i6 > 0) {
                z3 = false;
                xe1Var2 = xe1Var3;
                i3 = i6;
                z2 = true;
            } else if (i4 < size) {
                z2 = false;
                xe1Var2 = xe1Var3;
                i3 = size - i4;
                z3 = true;
            } else {
                z2 = false;
                xe1Var2 = xe1Var3;
                i3 = size;
                z3 = false;
            }
            Uri[] uriArr2 = new Uri[i3];
            b[] bVarArr = new b[i3];
            int[] iArr2 = new int[i3];
            int i8 = 0;
            int i9 = 0;
            while (i8 < list4.size()) {
                if (z2) {
                    uriArr = uriArr2;
                    if (iArr[i8] == 2) {
                    }
                    i8++;
                    uriArr2 = uriArr;
                } else {
                    uriArr = uriArr2;
                }
                if (!z3 || iArr[i8] != 1) {
                    m03 m03Var = (m03) list4.get(i8);
                    uriArr[i9] = m03Var.a;
                    bVarArr[i9] = m03Var.b;
                    iArr2[i9] = i8;
                    i9++;
                }
                i8++;
                uriArr2 = uriArr;
            }
            Uri[] uriArr3 = uriArr2;
            String str2 = bVarArr[0].k;
            int iU = j29.u(2, str2);
            int iU2 = j29.u(1, str2);
            boolean z5 = (iU2 == 1 || (iU2 == 0 && list3.isEmpty())) && iU <= 1 && iU2 + iU > 0;
            xe1 xe1Var4 = xe1Var2;
            list = list3;
            z = z4;
            x03 x03VarD = d("main", (z2 || iU2 <= 0) ? 0 : 1, uriArr3, bVarArr, n03Var.h, n03Var.i, map, j);
            arrayList.add(x03VarD);
            arrayList2.add(iArr2);
            if (z && z5) {
                ArrayList arrayList3 = new ArrayList();
                if (iU > 0) {
                    b[] bVarArr2 = new b[i3];
                    int i10 = 0;
                    while (i10 < i3) {
                        b bVar3 = bVarArr[i10];
                        String strV = j29.v(2, bVar3.k);
                        String strD = tv4.d(strV);
                        rj2 rj2Var = new rj2();
                        rj2Var.a = bVar3.a;
                        rj2Var.b = bVar3.b;
                        rj2Var.c = ImmutableList.n(bVar3.c);
                        rj2Var.l = tv4.m(bVar3.m);
                        rj2Var.m = tv4.m(strD);
                        rj2Var.j = strV;
                        rj2Var.k = bVar3.l;
                        rj2Var.h = bVar3.h;
                        rj2Var.i = bVar3.i;
                        rj2Var.t = bVar3.u;
                        rj2Var.u = bVar3.v;
                        rj2Var.x = bVar3.y;
                        rj2Var.e = bVar3.e;
                        rj2Var.f = bVar3.f;
                        bVarArr2[i10] = new b(rj2Var);
                        i10++;
                        bVarArr = bVarArr;
                    }
                    b[] bVarArr3 = bVarArr;
                    arrayList3.add(new yo8("main", bVarArr2));
                    if (iU2 > 0 && (bVar != null || list.isEmpty())) {
                        arrayList3.add(new yo8("main:audio", j(bVarArr3[0], bVar, false)));
                    }
                    List list6 = n03Var.i;
                    if (list6 != null) {
                        for (int i11 = 0; i11 < list6.size(); i11++) {
                            arrayList3.add(new yo8(rm7.n(i11, "main:cc:"), xe1Var4.j((b) list6.get(i11))));
                        }
                    }
                    xe1Var = xe1Var4;
                } else {
                    xe1Var = xe1Var4;
                    b[] bVarArr4 = new b[i3];
                    for (int i12 = 0; i12 < i3; i12++) {
                        bVarArr4[i12] = j(bVarArr[i12], bVar, true);
                    }
                    arrayList3.add(new yo8("main", bVarArr4));
                }
                rj2 rj2Var2 = new rj2();
                rj2Var2.a = "ID3";
                rj2Var2.m = tv4.m("application/id3");
                yo8 yo8Var = new yo8("main:id3", new b(rj2Var2));
                arrayList3.add(yo8Var);
                x03VarD.H((yo8[]) arrayList3.toArray(new yo8[0]), arrayList3.indexOf(yo8Var));
            } else {
                xe1Var = xe1Var4;
            }
        }
        ArrayList arrayList4 = new ArrayList(list.size());
        ArrayList arrayList5 = new ArrayList(list.size());
        ArrayList arrayList6 = new ArrayList(list.size());
        HashSet hashSet3 = new HashSet();
        int i13 = 0;
        while (i13 < list.size()) {
            List list7 = list;
            String str3 = ((l03) list7.get(i13)).c;
            if (hashSet3.add(str3)) {
                arrayList4.clear();
                arrayList5.clear();
                arrayList6.clear();
                boolean z6 = true;
                for (int i14 = 0; i14 < list7.size(); i14++) {
                    if (str3.equals(((l03) list7.get(i14)).c)) {
                        l03 l03Var = (l03) list7.get(i14);
                        arrayList6.add(Integer.valueOf(i14));
                        Uri uri = l03Var.a;
                        b bVar4 = l03Var.b;
                        arrayList4.add(uri);
                        arrayList5.add(bVar4);
                        z6 &= j29.u(1, bVar4.k) == 1;
                    }
                }
                String strConcat = "audio:".concat(str3);
                String str4 = j29.a;
                list = list7;
                hashSet2 = hashSet3;
                i2 = i13;
                x03 x03VarD2 = d(strConcat, 1, (Uri[]) arrayList4.toArray(new Uri[0]), (b[]) arrayList5.toArray(new b[0]), null, Collections.EMPTY_LIST, map, j);
                arrayList2.add(a.g(arrayList6));
                arrayList.add(x03VarD2);
                if (z && z6) {
                    x03VarD2.H(new yo8[]{new yo8(strConcat, (b[]) arrayList5.toArray(new b[0]))}, new int[0]);
                }
            } else {
                hashSet2 = hashSet3;
                i2 = i13;
                list = list7;
            }
            i13 = i2 + 1;
            hashSet3 = hashSet2;
        }
        this.v = arrayList.size();
        ArrayList arrayList7 = new ArrayList(list2.size());
        ArrayList arrayList8 = new ArrayList(list2.size());
        ArrayList arrayList9 = new ArrayList(list2.size());
        HashSet hashSet4 = new HashSet();
        int i15 = 0;
        while (i15 < list2.size()) {
            List list8 = list2;
            String str5 = ((l03) list8.get(i15)).c;
            if (hashSet4.add(str5)) {
                arrayList7.clear();
                arrayList8.clear();
                arrayList9.clear();
                for (int i16 = 0; i16 < list8.size(); i16++) {
                    if (str5.equals(((l03) list8.get(i16)).c)) {
                        l03 l03Var2 = (l03) list8.get(i16);
                        arrayList9.add(Integer.valueOf(i16));
                        arrayList7.add(l03Var2.a);
                        arrayList8.add(l03Var2.b);
                    }
                }
                String strConcat2 = "subtitle:".concat(str5);
                b[] bVarArr5 = (b[]) arrayList8.toArray(new b[0]);
                String str6 = j29.a;
                list2 = list8;
                hashSet = hashSet4;
                i = i15;
                x03 x03VarD3 = d(strConcat2, 3, (Uri[]) arrayList7.toArray(new Uri[0]), bVarArr5, null, ImmutableList.q(), map, j);
                arrayList2.add(a.g(arrayList9));
                arrayList.add(x03VarD3);
                int length = bVarArr5.length;
                b[] bVarArr6 = new b[length];
                for (int i17 = 0; i17 < length; i17++) {
                    bVarArr6[i17] = xe1Var.j(bVarArr5[i17]);
                }
                x03VarD3.H(new yo8[]{new yo8(strConcat2, bVarArr6)}, new int[0]);
            } else {
                hashSet = hashSet4;
                i = i15;
                list2 = list8;
            }
            i15 = i + 1;
            hashSet4 = hashSet;
        }
        this.t = (x03[]) arrayList.toArray(new x03[0]);
        this.r = this.t.length;
        for (int i18 = 0; i18 < this.v; i18++) {
            this.t[i18].d.l = true;
        }
        for (x03 x03Var : this.t) {
            if (!x03Var.D) {
                ab4 ab4Var = new ab4();
                ab4Var.a = x03Var.P;
                x03Var.p(new bb4(ab4Var));
            }
        }
        this.u = this.t;
    }

    @Override // defpackage.zp4
    public final zo8 n() {
        zo8 zo8Var = this.s;
        zo8Var.getClass();
        return zo8Var;
    }

    @Override // defpackage.ko7
    public final boolean p(bb4 bb4Var) {
        if (this.s != null) {
            return this.w.p(bb4Var);
        }
        for (x03 x03Var : this.t) {
            if (!x03Var.D) {
                ab4 ab4Var = new ab4();
                ab4Var.a = x03Var.P;
                x03Var.p(new bb4(ab4Var));
            }
        }
        return false;
    }

    @Override // defpackage.ko7
    public final long q() {
        return this.w.q();
    }

    @Override // defpackage.zp4
    public final void s(long j, boolean z) throws Throwable {
        for (x03 x03Var : this.u) {
            if (x03Var.C && !x03Var.E()) {
                int length = x03Var.v.length;
                for (int i = 0; i < length; i++) {
                    x03Var.v[i].i(z, x03Var.N[i], j);
                }
            }
        }
    }

    @Override // defpackage.ko7
    public final void v(long j) {
        this.w.v(j);
    }
}
