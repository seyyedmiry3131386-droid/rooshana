package defpackage;

import android.net.Uri;
import android.util.Pair;
import androidx.media3.common.b;
import androidx.media3.exoplayer.hls.a;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import com.google.common.collect.ImmutableList;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class yz2 {
    public final xe1 a;
    public final xa1 b;
    public final xa1 c;
    public final xg5 d;
    public final Uri[] e;
    public final b[] f;
    public final af1 g;
    public final yo8 h;
    public final List i;
    public final ee6 k;
    public boolean l;
    public BehindLiveWindowException n;
    public Uri o;
    public Uri p;
    public boolean q;
    public p62 r;
    public final a j = new a();
    public byte[] m = j29.b;
    public long s = -9223372036854775807L;

    public yz2(xe1 xe1Var, af1 af1Var, Uri[] uriArr, b[] bVarArr, pt2 pt2Var, fq8 fq8Var, xg5 xg5Var, List list, ee6 ee6Var) {
        this.a = xe1Var;
        this.g = af1Var;
        this.e = uriArr;
        this.f = bVarArr;
        this.d = xg5Var;
        this.i = list;
        this.k = ee6Var;
        xa1 xa1VarK = ((wa1) pt2Var.b).k();
        this.b = xa1VarK;
        if (fq8Var != null) {
            xa1VarK.c(fq8Var);
        }
        this.c = ((wa1) pt2Var.b).k();
        this.h = new yo8("", bVarArr);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < uriArr.length; i2++) {
            if ((bVarArr[i2].f & 16384) == 0) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        yo8 yo8Var = this.h;
        int[] iArrG = com.google.common.primitives.a.g(arrayList);
        wz2 wz2Var = new wz2(yo8Var, iArrG);
        b bVar = yo8Var.d[iArrG[0]];
        while (true) {
            if (i >= wz2Var.b) {
                i = -1;
                break;
            } else if (wz2Var.d[i] == bVar) {
                break;
            } else {
                i++;
            }
        }
        wz2Var.g = i;
        this.r = wz2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static xz2 d(j03 j03Var, long j, int i) {
        long j2 = j03Var.k;
        ImmutableList immutableList = j03Var.s;
        int i2 = (int) (j - j2);
        ImmutableList immutableList2 = j03Var.r;
        if (i2 == immutableList2.size()) {
            if (i == -1) {
                i = 0;
            }
            if (i < immutableList.size()) {
                return new xz2((h03) immutableList.get(i), j, i);
            }
            return null;
        }
        g03 g03Var = (g03) immutableList2.get(i2);
        if (i == -1) {
            return new xz2(g03Var, j, -1);
        }
        if (i < g03Var.m.size()) {
            return new xz2((h03) g03Var.m.get(i), j, i);
        }
        int i3 = i2 + 1;
        if (i3 < immutableList2.size()) {
            return new xz2((h03) immutableList2.get(i3), j + 1, -1);
        }
        if (immutableList.isEmpty()) {
            return null;
        }
        return new xz2((h03) immutableList.get(0), j + 1, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final mm4[] a(zz2 zz2Var, long j) {
        List listQ;
        yz2 yz2Var = this;
        zz2 zz2Var2 = zz2Var;
        int iB = zz2Var2 == null ? -1 : yz2Var.h.b(zz2Var2.d);
        int length = yz2Var.r.length();
        mm4[] mm4VarArr = new mm4[length];
        boolean z = false;
        int i = 0;
        while (i < length) {
            int i2 = yz2Var.r.i(i);
            Uri uri = yz2Var.e[i2];
            af1 af1Var = yz2Var.g;
            if (af1Var.e(uri)) {
                j03 j03VarA = af1Var.a(z, uri);
                j03VarA.getClass();
                long j2 = j03VarA.h - af1Var.n;
                Pair pairC = yz2Var.c(zz2Var2, i2 != iB ? true : z, j03VarA, j2, j);
                long jLongValue = ((Long) pairC.first).longValue();
                int iIntValue = ((Integer) pairC.second).intValue();
                long j3 = j03VarA.k;
                ImmutableList immutableList = j03VarA.s;
                ImmutableList immutableList2 = j03VarA.r;
                int i3 = (int) (jLongValue - j3);
                if (i3 < 0 || immutableList2.size() < i3) {
                    listQ = ImmutableList.q();
                } else {
                    ArrayList arrayList = new ArrayList();
                    if (i3 < immutableList2.size()) {
                        if (iIntValue != -1) {
                            g03 g03Var = (g03) immutableList2.get(i3);
                            if (iIntValue == 0) {
                                arrayList.add(g03Var);
                            } else if (iIntValue < g03Var.m.size()) {
                                ImmutableList immutableList3 = g03Var.m;
                                arrayList.addAll(immutableList3.subList(iIntValue, immutableList3.size()));
                            }
                            i3++;
                        }
                        arrayList.addAll(immutableList2.subList(i3, immutableList2.size()));
                        iIntValue = 0;
                    }
                    if (j03VarA.n != -9223372036854775807L) {
                        if (iIntValue == -1) {
                            iIntValue = 0;
                        }
                        if (iIntValue < immutableList.size()) {
                            arrayList.addAll(immutableList.subList(iIntValue, immutableList.size()));
                        }
                    }
                    listQ = DesugarCollections.unmodifiableList(arrayList);
                }
                mm4VarArr[i] = new vz2(j2, listQ);
            } else {
                mm4VarArr[i] = mm4.k0;
            }
            i++;
            yz2Var = this;
            zz2Var2 = zz2Var;
            z = false;
        }
        return mm4VarArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int b(zz2 zz2Var) {
        int i = zz2Var.o;
        if (i == -1) {
            return 1;
        }
        j03 j03VarA = this.g.a(false, this.e[this.h.b(zz2Var.d)]);
        j03VarA.getClass();
        ImmutableList immutableList = j03VarA.r;
        int i2 = (int) (zz2Var.j - j03VarA.k);
        if (i2 < 0) {
            return 1;
        }
        ImmutableList immutableList2 = i2 < immutableList.size() ? ((g03) immutableList.get(i2)).m : j03VarA.s;
        if (i >= immutableList2.size()) {
            return 2;
        }
        e03 e03Var = (e03) immutableList2.get(i);
        if (e03Var.m) {
            return 0;
        }
        return Objects.equals(Uri.parse(ib7.q(j03VarA.a, e03Var.a)), zz2Var.b.a) ? 1 : 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Pair c(zz2 zz2Var, boolean z, j03 j03Var, long j, long j2) {
        int i;
        boolean z2 = true;
        if (zz2Var != null) {
            long j3 = zz2Var.j;
            int i2 = zz2Var.o;
            if (!z) {
                if (!zz2Var.H) {
                    return new Pair(Long.valueOf(j3), Integer.valueOf(i2));
                }
                if (i2 == -1) {
                    j3 = j3 != -1 ? j3 + 1 : -1L;
                }
                return new Pair(Long.valueOf(j3), Integer.valueOf(i2 != -1 ? i2 + 1 : -1));
            }
        }
        long j4 = j03Var.u;
        ImmutableList immutableList = j03Var.s;
        long j5 = j03Var.k;
        ImmutableList immutableList2 = j03Var.r;
        long j6 = j + j4;
        long j7 = (zz2Var == null || this.q) ? j2 : zz2Var.g;
        if (!j03Var.o && j7 >= j6) {
            return new Pair(Long.valueOf(j5 + ((long) immutableList2.size())), -1);
        }
        long j8 = j7 - j;
        Long lValueOf = Long.valueOf(j8);
        int i3 = 0;
        if (this.g.m && zz2Var != null) {
            z2 = false;
        }
        int iC = j29.c(immutableList2, lValueOf, z2);
        long j9 = ((long) iC) + j5;
        if (iC >= 0) {
            g03 g03Var = (g03) immutableList2.get(iC);
            ImmutableList immutableList3 = j8 < g03Var.e + g03Var.c ? g03Var.m : immutableList;
            while (true) {
                if (i3 >= immutableList3.size()) {
                    break;
                }
                e03 e03Var = (e03) immutableList3.get(i3);
                if (j8 >= e03Var.e + e03Var.c) {
                    i3++;
                } else if (e03Var.l) {
                    j9 += immutableList3 == immutableList ? 1L : 0L;
                    i = i3;
                }
            }
            i = -1;
        } else {
            i = -1;
        }
        return new Pair(Long.valueOf(j9), Integer.valueOf(i));
    }

    public final uz2 e(Uri uri, int i, boolean z) {
        if (uri == null) {
            return null;
        }
        a aVar = this.j;
        byte[] bArr = (byte[]) aVar.a.remove(uri);
        if (bArr != null) {
            return null;
        }
        db1 db1Var = new db1(uri, 0L, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 1);
        b bVar = this.f[i];
        int iN = this.r.n();
        Object objQ = this.r.q();
        byte[] bArr2 = this.m;
        uz2 uz2Var = new uz2(this.c, db1Var, 3, bVar, iN, objQ, -9223372036854775807L, -9223372036854775807L);
        if (bArr2 == null) {
            bArr2 = j29.b;
        }
        uz2Var.j = bArr2;
        return uz2Var;
    }
}
