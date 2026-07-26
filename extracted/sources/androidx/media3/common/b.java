package androidx.media3.common;

import android.text.TextUtils;
import androidx.media3.common.DrmInitData;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.z0;
import defpackage.bl4;
import defpackage.cv0;
import defpackage.dw1;
import defpackage.ir1;
import defpackage.j29;
import defpackage.jv4;
import defpackage.mu3;
import defpackage.rj2;
import defpackage.tv4;
import defpackage.vv1;
import defpackage.vy2;
import defpackage.wz3;
import defpackage.xj0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import org.pcap4j.packet.constant.Ssh2PublicKeyAlgorithmName;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final String A0;
    public static final b Q = new b(new rj2());
    public static final String R = Integer.toString(0, 36);
    public static final String S = Integer.toString(1, 36);
    public static final String T = Integer.toString(2, 36);
    public static final String U = Integer.toString(3, 36);
    public static final String V = Integer.toString(4, 36);
    public static final String W = Integer.toString(5, 36);
    public static final String X = Integer.toString(6, 36);
    public static final String Y = Integer.toString(7, 36);
    public static final String Z;
    public static final String a0;
    public static final String b0;
    public static final String c0;
    public static final String d0;
    public static final String e0;
    public static final String f0;
    public static final String g0;
    public static final String h0;
    public static final String i0;
    public static final String j0;
    public static final String k0;
    public static final String l0;
    public static final String m0;
    public static final String n0;
    public static final String o0;
    public static final String p0;
    public static final String q0;
    public static final String r0;
    public static final String s0;
    public static final String t0;
    public static final String u0;
    public static final String v0;
    public static final String w0;
    public static final String x0;
    public static final String y0;
    public static final String z0;
    public final float A;
    public final byte[] B;
    public final int C;
    public final cv0 D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final int N;
    public final int O;
    public int P;
    public final String a;
    public final String b;
    public final ImmutableList c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final String k;
    public final jv4 l;
    public final String m;
    public final String n;
    public final int o;
    public final int p;
    public final List q;
    public final DrmInitData r;
    public final long s;
    public final boolean t;
    public final int u;
    public final int v;
    public final int w;
    public final int x;
    public final float y;
    public final int z;

    static {
        Integer.toString(8, 36);
        Z = Integer.toString(9, 36);
        a0 = Integer.toString(10, 36);
        b0 = Integer.toString(11, 36);
        c0 = Integer.toString(12, 36);
        d0 = Integer.toString(13, 36);
        e0 = Integer.toString(14, 36);
        f0 = Integer.toString(15, 36);
        g0 = Integer.toString(16, 36);
        h0 = Integer.toString(17, 36);
        i0 = Integer.toString(18, 36);
        j0 = Integer.toString(19, 36);
        k0 = Integer.toString(20, 36);
        l0 = Integer.toString(21, 36);
        m0 = Integer.toString(22, 36);
        n0 = Integer.toString(23, 36);
        o0 = Integer.toString(24, 36);
        p0 = Integer.toString(25, 36);
        q0 = Integer.toString(26, 36);
        r0 = Integer.toString(27, 36);
        s0 = Integer.toString(28, 36);
        t0 = Integer.toString(29, 36);
        u0 = Integer.toString(30, 36);
        v0 = Integer.toString(31, 36);
        w0 = Integer.toString(32, 36);
        x0 = Integer.toString(33, 36);
        y0 = Integer.toString(34, 36);
        z0 = Integer.toString(35, 36);
        A0 = Integer.toString(36, 36);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(rj2 rj2Var) {
        boolean z;
        String str;
        this.a = rj2Var.a;
        String strW = j29.W(rj2Var.d);
        this.d = strW;
        if (rj2Var.c.isEmpty() && rj2Var.b != null) {
            this.c = ImmutableList.s(new wz3(strW, rj2Var.b));
            this.b = rj2Var.b;
        } else if (!rj2Var.c.isEmpty() && rj2Var.b == null) {
            ImmutableList immutableList = rj2Var.c;
            this.c = immutableList;
            Iterator<E> it = immutableList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = ((wz3) immutableList.get(0)).b;
                    break;
                }
                wz3 wz3Var = (wz3) it.next();
                if (TextUtils.equals(wz3Var.a, strW)) {
                    str = wz3Var.b;
                    break;
                }
            }
            this.b = str;
        } else if (rj2Var.c.isEmpty() && rj2Var.b == null) {
            z = true;
            vy2.s(z);
            this.c = rj2Var.c;
            this.b = rj2Var.b;
        } else {
            for (int i = 0; i < rj2Var.c.size(); i++) {
                if (((wz3) rj2Var.c.get(i)).b.equals(rj2Var.b)) {
                    z = true;
                    break;
                }
            }
            z = false;
            vy2.s(z);
            this.c = rj2Var.c;
            this.b = rj2Var.b;
        }
        this.e = rj2Var.e;
        vy2.r("Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set", rj2Var.g == 0 || (rj2Var.f & 32768) != 0);
        this.f = rj2Var.f;
        this.g = rj2Var.g;
        int i2 = rj2Var.h;
        this.h = i2;
        int i3 = rj2Var.i;
        this.i = i3;
        this.j = i3 != -1 ? i3 : i2;
        this.k = rj2Var.j;
        this.l = rj2Var.k;
        this.m = rj2Var.l;
        this.n = rj2Var.m;
        this.o = rj2Var.n;
        this.p = rj2Var.o;
        List list = rj2Var.p;
        this.q = list == null ? Collections.EMPTY_LIST : list;
        DrmInitData drmInitData = rj2Var.q;
        this.r = drmInitData;
        this.s = rj2Var.r;
        this.t = rj2Var.s;
        this.u = rj2Var.t;
        this.v = rj2Var.u;
        this.w = rj2Var.v;
        this.x = rj2Var.w;
        this.y = rj2Var.x;
        int i4 = rj2Var.y;
        this.z = i4 == -1 ? 0 : i4;
        float f = rj2Var.z;
        this.A = f == -1.0f ? 1.0f : f;
        this.B = rj2Var.A;
        this.C = rj2Var.B;
        this.D = rj2Var.C;
        this.E = rj2Var.D;
        this.F = rj2Var.E;
        this.G = rj2Var.F;
        this.H = rj2Var.G;
        int i5 = rj2Var.H;
        this.I = i5 == -1 ? 0 : i5;
        int i6 = rj2Var.I;
        this.J = i6 != -1 ? i6 : 0;
        this.K = rj2Var.J;
        this.L = rj2Var.K;
        this.M = rj2Var.L;
        this.N = rj2Var.M;
        int i7 = rj2Var.N;
        if (i7 != 0 || drmInitData == null) {
            this.O = i7;
        } else {
            this.O = 1;
        }
    }

    public static String c(b bVar) {
        char c;
        int i;
        String str;
        String str2;
        String str3;
        DrmInitData drmInitData;
        if (bVar == null) {
            return Ssh2PublicKeyAlgorithmName.NULL;
        }
        int i2 = bVar.e;
        ImmutableList immutableList = bVar.c;
        String str4 = bVar.d;
        int i3 = bVar.G;
        int i4 = bVar.F;
        int i5 = bVar.E;
        float f = bVar.y;
        cv0 cv0Var = bVar.D;
        float f2 = bVar.A;
        int i6 = bVar.x;
        int i7 = bVar.w;
        int i8 = bVar.v;
        int i9 = bVar.u;
        DrmInitData drmInitData2 = bVar.r;
        String str5 = bVar.k;
        int i10 = bVar.j;
        String str6 = bVar.m;
        int i11 = bVar.f;
        mu3 mu3Var = new mu3(String.valueOf(','));
        StringBuilder sbC = bl4.C("id=");
        sbC.append(bVar.a);
        sbC.append(", mimeType=");
        sbC.append(bVar.n);
        if (str6 != null) {
            sbC.append(", container=");
            sbC.append(str6);
        }
        if (i10 != -1) {
            sbC.append(", bitrate=");
            sbC.append(i10);
        }
        if (str5 != null) {
            sbC.append(", codecs=");
            sbC.append(str5);
        }
        if (drmInitData2 != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i12 = 0;
            c = 0;
            while (i12 < drmInitData2.d) {
                UUID uuid = drmInitData2.a[i12].b;
                if (uuid.equals(xj0.b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(xj0.c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(xj0.e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(xj0.d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(xj0.a)) {
                    linkedHashSet.add("universal");
                } else {
                    drmInitData = drmInitData2;
                    linkedHashSet.add("unknown (" + uuid + ")");
                    i12++;
                    drmInitData2 = drmInitData;
                }
                drmInitData = drmInitData2;
                i12++;
                drmInitData2 = drmInitData;
            }
            sbC.append(", drm=[");
            mu3Var.b(sbC, linkedHashSet.iterator());
            sbC.append(']');
        } else {
            c = 0;
        }
        if (i9 != -1 && i8 != -1) {
            sbC.append(", res=");
            sbC.append(i9);
            sbC.append("x");
            sbC.append(i8);
        }
        if (i7 != -1 && i6 != -1) {
            sbC.append(", decRes=");
            sbC.append(i7);
            sbC.append("x");
            sbC.append(i6);
        }
        double d = f2;
        int i13 = ir1.a;
        if (Math.copySign(d - 1.0d, 1.0d) > 0.001d && d != 1.0d && (!Double.isNaN(d) || !Double.isNaN(1.0d))) {
            sbC.append(", par=");
            Object[] objArr = new Object[1];
            objArr[c] = Float.valueOf(f2);
            String str7 = j29.a;
            sbC.append(String.format(Locale.US, "%.3f", objArr));
        }
        if (cv0Var != null) {
            int i14 = cv0Var.f;
            int i15 = cv0Var.e;
            if ((i15 != -1 && i14 != -1) || cv0Var.d()) {
                sbC.append(", color=");
                if (cv0Var.d()) {
                    String strB = cv0.b(cv0Var.a);
                    String strA = cv0.a(cv0Var.b);
                    String strC = cv0.c(cv0Var.c);
                    String str8 = j29.a;
                    Locale locale = Locale.US;
                    str2 = strB + "/" + strA + "/" + strC;
                } else {
                    str2 = "NA/NA/NA";
                }
                if (i15 == -1 || i14 == -1) {
                    str3 = "NA/NA";
                } else {
                    str3 = i15 + "/" + i14;
                }
                sbC.append(str2 + "/" + str3);
            }
        }
        if (f != -1.0f) {
            sbC.append(", fps=");
            sbC.append(f);
        }
        if (i5 != -1) {
            sbC.append(", maxSubLayers=");
            sbC.append(i5);
        }
        if (i4 != -1) {
            sbC.append(", channels=");
            sbC.append(i4);
        }
        if (i3 != -1) {
            sbC.append(", sample_rate=");
            sbC.append(i3);
        }
        if (str4 != null) {
            sbC.append(", language=");
            sbC.append(str4);
        }
        if (!immutableList.isEmpty()) {
            sbC.append(", labels=[");
            mu3Var.b(sbC, z0.j(new vv1(21), immutableList).iterator());
            sbC.append("]");
        }
        if (i2 != 0) {
            sbC.append(", selectionFlags=[");
            String str9 = j29.a;
            ArrayList arrayList = new ArrayList();
            if ((i2 & 4) != 0) {
                arrayList.add("auto");
            }
            if ((i2 & 1) != 0) {
                arrayList.add("default");
            }
            if ((i2 & 2) != 0) {
                arrayList.add("forced");
            }
            mu3Var.b(sbC, arrayList.iterator());
            sbC.append("]");
        }
        if (i11 != 0) {
            sbC.append(", roleFlags=[");
            String str10 = j29.a;
            ArrayList arrayList2 = new ArrayList();
            if ((i11 & 1) != 0) {
                arrayList2.add("main");
            }
            if ((i11 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i11 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i11 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i11 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i11 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i11 & 64) != 0) {
                arrayList2.add("caption");
            }
            i = i11;
            if ((i & 128) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i & 256) != 0) {
                arrayList2.add("sign");
            }
            if ((i & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i & 1024) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i & 8192) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i & 16384) != 0) {
                arrayList2.add("trick-play");
            }
            if ((i & 32768) != 0) {
                arrayList2.add("auxiliary");
            }
            mu3Var.b(sbC, arrayList2.iterator());
            sbC.append("]");
        } else {
            i = i11;
        }
        if ((i & 32768) != 0) {
            sbC.append(", auxiliaryTrackType=");
            int i16 = bVar.g;
            String str11 = j29.a;
            if (i16 == 0) {
                str = "undefined";
            } else if (i16 == 1) {
                str = "original";
            } else if (i16 == 2) {
                str = "depth-linear";
            } else if (i16 == 3) {
                str = "depth-inverse";
            } else {
                if (i16 != 4) {
                    throw new IllegalStateException("Unsupported auxiliary track type");
                }
                str = "depth metadata";
            }
            sbC.append(str);
        }
        return sbC.toString();
    }

    public final rj2 a() {
        rj2 rj2Var = new rj2();
        rj2Var.a = this.a;
        rj2Var.b = this.b;
        rj2Var.c = this.c;
        rj2Var.d = this.d;
        rj2Var.e = this.e;
        rj2Var.f = this.f;
        rj2Var.h = this.h;
        rj2Var.i = this.i;
        rj2Var.j = this.k;
        rj2Var.k = this.l;
        rj2Var.l = this.m;
        rj2Var.m = this.n;
        rj2Var.n = this.o;
        rj2Var.o = this.p;
        rj2Var.p = this.q;
        rj2Var.q = this.r;
        rj2Var.r = this.s;
        rj2Var.s = this.t;
        rj2Var.t = this.u;
        rj2Var.u = this.v;
        rj2Var.v = this.w;
        rj2Var.w = this.x;
        rj2Var.x = this.y;
        rj2Var.y = this.z;
        rj2Var.z = this.A;
        rj2Var.A = this.B;
        rj2Var.B = this.C;
        rj2Var.C = this.D;
        rj2Var.D = this.E;
        rj2Var.E = this.F;
        rj2Var.F = this.G;
        rj2Var.G = this.H;
        rj2Var.H = this.I;
        rj2Var.I = this.J;
        rj2Var.J = this.K;
        rj2Var.K = this.L;
        rj2Var.L = this.M;
        rj2Var.M = this.N;
        rj2Var.N = this.O;
        return rj2Var;
    }

    public final boolean b(b bVar) {
        List list = this.q;
        if (list.size() != bVar.q.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) bVar.q.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final b d(b bVar) {
        String str;
        String str2;
        int i;
        int i2;
        if (this == bVar) {
            return this;
        }
        int iH = tv4.h(this.n);
        String str3 = bVar.a;
        jv4 jv4VarB = bVar.l;
        ImmutableList immutableList = bVar.c;
        int i3 = bVar.M;
        int i4 = bVar.N;
        String str4 = bVar.b;
        if (str4 == null) {
            str4 = this.b;
        }
        if (immutableList.isEmpty()) {
            immutableList = this.c;
        }
        if ((iH != 3 && iH != 1) || (str = bVar.d) == null) {
            str = this.d;
        }
        int i5 = this.h;
        if (i5 == -1) {
            i5 = bVar.h;
        }
        int i6 = this.i;
        if (i6 == -1) {
            i6 = bVar.i;
        }
        String str5 = this.k;
        if (str5 == null) {
            String strV = j29.v(iH, bVar.k);
            if (j29.h0(strV).length == 1) {
                str5 = strV;
            }
        }
        jv4 jv4Var = this.l;
        if (jv4Var != null) {
            jv4VarB = jv4Var.b(jv4VarB);
        }
        float f = this.y;
        if (f == -1.0f && iH == 2) {
            f = bVar.y;
        }
        int i7 = this.e | bVar.e;
        int i8 = this.f | bVar.f;
        DrmInitData drmInitData = bVar.r;
        ArrayList arrayList = new ArrayList();
        ImmutableList immutableList2 = immutableList;
        if (drmInitData != null) {
            String str6 = drmInitData.c;
            DrmInitData.SchemeData[] schemeDataArr = drmInitData.a;
            int length = schemeDataArr.length;
            int i9 = 0;
            while (i9 < length) {
                int i10 = i9;
                DrmInitData.SchemeData schemeData = schemeDataArr[i10];
                int i11 = length;
                if (schemeData.e != null) {
                    arrayList.add(schemeData);
                }
                i9 = i10 + 1;
                length = i11;
            }
            str2 = str6;
        } else {
            str2 = null;
        }
        DrmInitData drmInitData2 = this.r;
        if (drmInitData2 != null) {
            if (str2 == null) {
                str2 = drmInitData2.c;
            }
            int size = arrayList.size();
            DrmInitData.SchemeData[] schemeDataArr2 = drmInitData2.a;
            String str7 = str2;
            int length2 = schemeDataArr2.length;
            int i12 = 0;
            while (i12 < length2) {
                int i13 = i12;
                DrmInitData.SchemeData schemeData2 = schemeDataArr2[i13];
                int i14 = length2;
                if (schemeData2.e != null) {
                    UUID uuid = schemeData2.b;
                    i2 = i4;
                    int i15 = 0;
                    while (true) {
                        if (i15 >= size) {
                            i = size;
                            arrayList.add(schemeData2);
                            break;
                        }
                        i = size;
                        if (((DrmInitData.SchemeData) arrayList.get(i15)).b.equals(uuid)) {
                            break;
                        }
                        i15++;
                        size = i;
                    }
                } else {
                    i = size;
                    i2 = i4;
                }
                i12 = i13 + 1;
                length2 = i14;
                i4 = i2;
                size = i;
            }
            str2 = str7;
        }
        int i16 = i4;
        DrmInitData drmInitData3 = arrayList.isEmpty() ? null : new DrmInitData(str2, false, (DrmInitData.SchemeData[]) arrayList.toArray(new DrmInitData.SchemeData[0]));
        rj2 rj2VarA = a();
        rj2VarA.a = str3;
        rj2VarA.b = str4;
        rj2VarA.c = ImmutableList.n(immutableList2);
        rj2VarA.d = str;
        rj2VarA.e = i7;
        rj2VarA.f = i8;
        rj2VarA.h = i5;
        rj2VarA.i = i6;
        rj2VarA.j = str5;
        rj2VarA.k = jv4VarB;
        rj2VarA.q = drmInitData3;
        rj2VarA.x = f;
        rj2VarA.L = i3;
        rj2VarA.M = i16;
        return new b(rj2VarA);
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        int i2 = this.P;
        return (i2 == 0 || (i = bVar.P) == 0 || i2 == i) && this.e == bVar.e && this.f == bVar.f && this.g == bVar.g && this.h == bVar.h && this.i == bVar.i && this.o == bVar.o && this.s == bVar.s && this.u == bVar.u && this.v == bVar.v && this.w == bVar.w && this.x == bVar.x && this.z == bVar.z && this.C == bVar.C && this.E == bVar.E && this.F == bVar.F && this.G == bVar.G && this.H == bVar.H && this.I == bVar.I && this.J == bVar.J && this.K == bVar.K && this.M == bVar.M && this.N == bVar.N && this.O == bVar.O && Float.compare(this.y, bVar.y) == 0 && Float.compare(this.A, bVar.A) == 0 && Objects.equals(this.a, bVar.a) && Objects.equals(this.b, bVar.b) && this.c.equals(bVar.c) && Objects.equals(this.k, bVar.k) && Objects.equals(this.m, bVar.m) && Objects.equals(this.n, bVar.n) && Objects.equals(this.d, bVar.d) && Arrays.equals(this.B, bVar.B) && Objects.equals(this.l, bVar.l) && Objects.equals(this.D, bVar.D) && Objects.equals(this.r, bVar.r) && b(bVar);
    }

    public final int hashCode() {
        if (this.P == 0) {
            String str = this.a;
            int iHashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.b;
            int iHashCode2 = (this.c.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            String str3 = this.d;
            int iHashCode3 = (((((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31;
            String str4 = this.k;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            jv4 jv4Var = this.l;
            int iHashCode5 = (iHashCode4 + (jv4Var == null ? 0 : jv4Var.hashCode())) * 961;
            String str5 = this.m;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.n;
            this.P = ((((((((((((((((((((dw1.g(this.A, (dw1.g(this.y, (((((((((((((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.o) * 31) + ((int) this.s)) * 31) + this.u) * 31) + this.v) * 31) + this.w) * 31) + this.x) * 31, 31) + this.z) * 31, 31) + this.C) * 31) + this.E) * 31) + this.F) * 31) + this.G) * 31) + this.H) * 31) + this.I) * 31) + this.J) * 31) + this.K) * 31) + this.M) * 31) + this.N) * 31) + this.O;
        }
        return this.P;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Format(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.m);
        sb.append(", ");
        sb.append(this.n);
        sb.append(", ");
        sb.append(this.k);
        sb.append(", ");
        sb.append(this.j);
        sb.append(", ");
        sb.append(this.d);
        sb.append(", [");
        sb.append(this.u);
        sb.append(", ");
        sb.append(this.v);
        sb.append(", ");
        sb.append(this.y);
        sb.append(", ");
        sb.append(this.D);
        sb.append("], [");
        sb.append(this.F);
        sb.append(", ");
        return dw1.k(this.G, "])", sb);
    }
}
