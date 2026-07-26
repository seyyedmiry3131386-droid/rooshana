package defpackage;

import androidx.media3.common.b;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.z0;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class qu4 implements zp4, yp4 {
    public final zp4[] a;
    public final boolean[] b;
    public final IdentityHashMap c;
    public final fv d;
    public final ArrayList e = new ArrayList();
    public final HashMap f = new HashMap();
    public yp4 g;
    public zo8 h;
    public zp4[] i;
    public b01 j;

    public qu4(fv fvVar, long[] jArr, zp4... zp4VarArr) {
        this.d = fvVar;
        this.a = zp4VarArr;
        fvVar.getClass();
        this.j = new b01(ImmutableList.q(), ImmutableList.q());
        this.c = new IdentityHashMap();
        this.i = new zp4[0];
        this.b = new boolean[zp4VarArr.length];
        for (int i = 0; i < zp4VarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.b[i] = true;
                this.a[i] = new nl8(zp4VarArr[i], j);
            }
        }
    }

    @Override // defpackage.ko7
    public final boolean a() {
        return this.j.a();
    }

    @Override // defpackage.yp4
    public final void d(zp4 zp4Var) {
        ArrayList arrayList = this.e;
        arrayList.remove(zp4Var);
        if (arrayList.isEmpty()) {
            zp4[] zp4VarArr = this.a;
            int i = 0;
            for (zp4 zp4Var2 : zp4VarArr) {
                i += zp4Var2.n().a;
            }
            yo8[] yo8VarArr = new yo8[i];
            int i2 = 0;
            for (int i3 = 0; i3 < zp4VarArr.length; i3++) {
                zo8 zo8VarN = zp4VarArr[i3].n();
                int i4 = zo8VarN.a;
                int i5 = 0;
                while (i5 < i4) {
                    yo8 yo8VarA = zo8VarN.a(i5);
                    b[] bVarArr = new b[yo8VarA.a];
                    for (int i6 = 0; i6 < yo8VarA.a; i6++) {
                        b bVar = yo8VarA.d[i6];
                        rj2 rj2VarA = bVar.a();
                        StringBuilder sb = new StringBuilder();
                        sb.append(i3);
                        sb.append(":");
                        String str = bVar.a;
                        if (str == null) {
                            str = "";
                        }
                        sb.append(str);
                        rj2VarA.a = sb.toString();
                        bVarArr[i6] = new b(rj2VarA);
                    }
                    yo8 yo8Var = new yo8(i3 + ":" + yo8VarA.b, bVarArr);
                    this.f.put(yo8Var, yo8VarA);
                    yo8VarArr[i2] = yo8Var;
                    i5++;
                    i2++;
                }
            }
            this.h = new zo8(yo8VarArr);
            yp4 yp4Var = this.g;
            yp4Var.getClass();
            yp4Var.d(this);
        }
    }

    @Override // defpackage.zp4
    public final long e(p62[] p62VarArr, boolean[] zArr, pc7[] pc7VarArr, boolean[] zArr2, long j) {
        IdentityHashMap identityHashMap;
        int[] iArr;
        int[] iArr2 = new int[p62VarArr.length];
        int[] iArr3 = new int[p62VarArr.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            int length = p62VarArr.length;
            identityHashMap = this.c;
            if (i2 >= length) {
                break;
            }
            pc7 pc7Var = pc7VarArr[i2];
            Integer num = pc7Var == null ? null : (Integer) identityHashMap.get(pc7Var);
            iArr2[i2] = num == null ? -1 : num.intValue();
            p62 p62Var = p62VarArr[i2];
            if (p62Var != null) {
                String str = p62Var.c().b;
                iArr3[i2] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr3[i2] = -1;
            }
            i2++;
        }
        identityHashMap.clear();
        int length2 = p62VarArr.length;
        pc7[] pc7VarArr2 = new pc7[length2];
        pc7[] pc7VarArr3 = new pc7[p62VarArr.length];
        p62[] p62VarArr2 = new p62[p62VarArr.length];
        zp4[] zp4VarArr = this.a;
        ArrayList arrayList = new ArrayList(zp4VarArr.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < zp4VarArr.length) {
            int i4 = i;
            while (i4 < p62VarArr.length) {
                pc7VarArr3[i4] = iArr2[i4] == i3 ? pc7VarArr[i4] : null;
                if (iArr3[i4] == i3) {
                    p62 p62Var2 = p62VarArr[i4];
                    p62Var2.getClass();
                    iArr = iArr2;
                    yo8 yo8Var = (yo8) this.f.get(p62Var2.c());
                    yo8Var.getClass();
                    p62VarArr2[i4] = new pu4(p62Var2, yo8Var);
                } else {
                    iArr = iArr2;
                    p62VarArr2[i4] = null;
                }
                i4++;
                iArr2 = iArr;
            }
            int[] iArr4 = iArr2;
            zp4[] zp4VarArr2 = zp4VarArr;
            int i5 = i3;
            long jE = zp4VarArr2[i3].e(p62VarArr2, zArr, pc7VarArr3, zArr2, j2);
            if (i5 == 0) {
                j2 = jE;
            } else if (jE != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i6 = 0; i6 < p62VarArr.length; i6++) {
                if (iArr3[i6] == i5) {
                    pc7 pc7Var2 = pc7VarArr3[i6];
                    pc7Var2.getClass();
                    pc7VarArr2[i6] = pc7VarArr3[i6];
                    identityHashMap.put(pc7Var2, Integer.valueOf(i5));
                    z = true;
                } else if (iArr4[i6] == i5) {
                    vy2.s(pc7VarArr3[i6] == null);
                }
            }
            if (z) {
                arrayList.add(zp4VarArr2[i5]);
            }
            i3 = i5 + 1;
            zp4VarArr = zp4VarArr2;
            iArr2 = iArr4;
            i = 0;
        }
        int i7 = i;
        System.arraycopy(pc7VarArr2, i7, pc7VarArr, i7, length2);
        this.i = (zp4[]) arrayList.toArray(new zp4[i7]);
        AbstractList abstractListJ = z0.j(new sr4(26), arrayList);
        this.d.getClass();
        this.j = new b01(arrayList, abstractListJ);
        return j2;
    }

    @Override // defpackage.ko7
    public final long f() {
        return this.j.f();
    }

    @Override // defpackage.zp4
    public final long g(long j, ll7 ll7Var) {
        zp4[] zp4VarArr = this.i;
        return (zp4VarArr.length > 0 ? zp4VarArr[0] : this.a[0]).g(j, ll7Var);
    }

    @Override // defpackage.zp4
    public final void h() {
        for (zp4 zp4Var : this.a) {
            zp4Var.h();
        }
    }

    @Override // defpackage.zp4
    public final long i(long j) {
        long jI = this.i[0].i(j);
        int i = 1;
        while (true) {
            zp4[] zp4VarArr = this.i;
            if (i >= zp4VarArr.length) {
                return jI;
            }
            if (zp4VarArr[i].i(jI) != jI) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }

    @Override // defpackage.zp4
    public final long k() {
        long j = -9223372036854775807L;
        for (zp4 zp4Var : this.i) {
            long jK = zp4Var.k();
            if (jK == -9223372036854775807L) {
                if (j != -9223372036854775807L && zp4Var.i(j) != j) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j == -9223372036854775807L) {
                for (zp4 zp4Var2 : this.i) {
                    if (zp4Var2 == zp4Var) {
                        break;
                    }
                    if (zp4Var2.i(jK) != jK) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j = jK;
            } else if (jK != j) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j;
    }

    @Override // defpackage.jo7
    public final void l(ko7 ko7Var) {
        yp4 yp4Var = this.g;
        yp4Var.getClass();
        yp4Var.l(this);
    }

    @Override // defpackage.zp4
    public final void m(yp4 yp4Var, long j) {
        this.g = yp4Var;
        ArrayList arrayList = this.e;
        zp4[] zp4VarArr = this.a;
        Collections.addAll(arrayList, zp4VarArr);
        for (zp4 zp4Var : zp4VarArr) {
            zp4Var.m(this, j);
        }
    }

    @Override // defpackage.zp4
    public final zo8 n() {
        zo8 zo8Var = this.h;
        zo8Var.getClass();
        return zo8Var;
    }

    @Override // defpackage.ko7
    public final boolean p(bb4 bb4Var) {
        ArrayList arrayList = this.e;
        if (arrayList.isEmpty()) {
            return this.j.p(bb4Var);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((zp4) arrayList.get(i)).p(bb4Var);
        }
        return false;
    }

    @Override // defpackage.ko7
    public final long q() {
        return this.j.q();
    }

    @Override // defpackage.zp4
    public final void s(long j, boolean z) {
        for (zp4 zp4Var : this.i) {
            zp4Var.s(j, z);
        }
    }

    @Override // defpackage.ko7
    public final void v(long j) {
        this.j.v(j);
    }
}
