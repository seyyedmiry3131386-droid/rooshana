package defpackage;

import android.net.Uri;
import android.os.Bundle;
import androidx.media3.common.StreamKey;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class jp4 {
    public static final jp4 g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public final String a;
    public final fp4 b;
    public final ep4 c;
    public final qp4 d;
    public final ap4 e;
    public final gp4 f;

    static {
        yo4 yo4Var = new yo4();
        ImmutableMap.l();
        ImmutableList.q();
        List list = Collections.EMPTY_LIST;
        ImmutableList.q();
        dp4 dp4Var = new dp4();
        g = new jp4("", new ap4(yo4Var), null, new ep4(dp4Var), qp4.K, gp4.d);
        h = Integer.toString(0, 36);
        i = Integer.toString(1, 36);
        j = Integer.toString(2, 36);
        k = Integer.toString(3, 36);
        l = Integer.toString(4, 36);
        m = Integer.toString(5, 36);
    }

    public jp4(String str, ap4 ap4Var, fp4 fp4Var, ep4 ep4Var, qp4 qp4Var, gp4 gp4Var) {
        this.a = str;
        this.b = fp4Var;
        this.c = ep4Var;
        this.d = qp4Var;
        this.e = ap4Var;
        this.f = gp4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Cloneable] */
    /* JADX WARN: Type inference failed for: r1v56 */
    public static jp4 b(Bundle bundle) {
        ap4 ap4Var;
        gp4 gp4Var;
        ImmutableMap immutableMapB;
        cp4 cp4Var;
        wo4 wo4Var;
        ImmutableList immutableListS;
        fp4 fp4Var;
        String string = bundle.getString(h, "");
        string.getClass();
        Bundle bundle2 = bundle.getBundle(i);
        ep4 ep4VarB = bundle2 == null ? ep4.f : ep4.b(bundle2);
        Bundle bundle3 = bundle.getBundle(j);
        qp4 qp4VarB = bundle3 == null ? qp4.K : qp4.b(bundle3);
        Bundle bundle4 = bundle.getBundle(k);
        if (bundle4 == null) {
            ap4Var = ap4.r;
        } else {
            yo4 yo4Var = new yo4();
            String str = zo4.j;
            zo4 zo4Var = zo4.i;
            long j2 = zo4Var.a;
            long j3 = zo4Var.d;
            long j4 = zo4Var.b;
            long jV = j29.V(bundle4.getLong(str, j2));
            boolean z = true;
            vy2.j(jV >= 0);
            yo4Var.a = jV;
            long jV2 = j29.V(bundle4.getLong(zo4.k, zo4Var.c));
            vy2.j(jV2 == Long.MIN_VALUE || jV2 >= 0);
            yo4Var.b = jV2;
            yo4Var.c = bundle4.getBoolean(zo4.l, zo4Var.e);
            yo4Var.d = bundle4.getBoolean(zo4.m, zo4Var.f);
            yo4Var.e = bundle4.getBoolean(zo4.n, zo4Var.g);
            yo4Var.f = bundle4.getBoolean(zo4.q, zo4Var.h);
            long j5 = bundle4.getLong(zo4.o, j4);
            if (j5 != j4) {
                vy2.j(j5 >= 0);
                yo4Var.a = j5;
            }
            long j6 = bundle4.getLong(zo4.p, j3);
            if (j6 != j3) {
                if (j6 != Long.MIN_VALUE && j6 < 0) {
                    z = false;
                }
                vy2.j(z);
                yo4Var.b = j6;
            }
            ap4Var = new ap4(yo4Var);
        }
        ap4 ap4Var2 = ap4Var;
        Bundle bundle5 = bundle.getBundle(l);
        if (bundle5 == null) {
            gp4Var = gp4.d;
        } else {
            pa2 pa2Var = new pa2(16, false);
            pa2Var.c = (Uri) bundle5.getParcelable(gp4.e);
            pa2Var.b = bundle5.getString(gp4.f);
            pa2Var.d = bundle5.getBundle(gp4.g);
            gp4Var = new gp4(pa2Var);
        }
        gp4 gp4Var2 = gp4Var;
        Bundle bundle6 = bundle.getBundle(m);
        if (bundle6 == null) {
            fp4Var = null;
        } else {
            Bundle bundle7 = bundle6.getBundle(fp4.k);
            if (bundle7 == null) {
                cp4Var = null;
            } else {
                String string2 = bundle7.getString(cp4.i);
                string2.getClass();
                UUID uuidFromString = UUID.fromString(string2);
                Uri uri = (Uri) bundle7.getParcelable(cp4.j);
                String str2 = cp4.k;
                Bundle bundle8 = Bundle.EMPTY;
                Bundle bundle9 = bundle7.getBundle(str2);
                if (bundle9 == null) {
                    bundle9 = bundle8;
                }
                if (bundle9 == bundle8) {
                    immutableMapB = ImmutableMap.l();
                } else {
                    HashMap map = new HashMap();
                    if (bundle9 != bundle8) {
                        for (String str3 : bundle9.keySet()) {
                            String string3 = bundle9.getString(str3);
                            if (string3 != null) {
                                map.put(str3, string3);
                            }
                        }
                    }
                    immutableMapB = ImmutableMap.b(map);
                }
                boolean z2 = bundle7.getBoolean(cp4.l, false);
                boolean z3 = bundle7.getBoolean(cp4.m, false);
                boolean z4 = bundle7.getBoolean(cp4.n, false);
                String str4 = cp4.o;
                ArrayList<Integer> arrayList = new ArrayList<>();
                ArrayList<Integer> integerArrayList = bundle7.getIntegerArrayList(str4);
                if (integerArrayList != null) {
                    arrayList = integerArrayList;
                }
                ImmutableList immutableListN = ImmutableList.n(arrayList);
                byte[] byteArray = bundle7.getByteArray(cp4.p);
                bp4 bp4Var = new bp4();
                bp4Var.d = uuidFromString;
                bp4Var.e = uri;
                bp4Var.f = ImmutableMap.b(immutableMapB);
                bp4Var.a = z2;
                bp4Var.c = z4;
                bp4Var.b = z3;
                bp4Var.g = ImmutableList.n(immutableListN);
                bp4Var.h = byteArray != null ? Arrays.copyOf(byteArray, byteArray.length) : 0;
                cp4Var = new cp4(bp4Var);
            }
            Bundle bundle10 = bundle6.getBundle(fp4.l);
            if (bundle10 == null) {
                wo4Var = null;
            } else {
                Uri uri2 = (Uri) bundle10.getParcelable(wo4.b);
                uri2.getClass();
                vo4 vo4Var = new vo4(0);
                vo4Var.b = uri2;
                wo4Var = new wo4(vo4Var);
            }
            ArrayList parcelableArrayList = bundle6.getParcelableArrayList(fp4.m);
            if (parcelableArrayList == null) {
                immutableListS = ImmutableList.q();
            } else {
                lj3 lj3VarM = ImmutableList.m();
                int i2 = 0;
                while (i2 < parcelableArrayList.size()) {
                    Bundle bundle11 = (Bundle) parcelableArrayList.get(i2);
                    bundle11.getClass();
                    lj3VarM.O(new StreamKey(bundle11.getInt(StreamKey.d, 0), bundle11.getInt(StreamKey.e, 0), bundle11.getInt(StreamKey.f, 0)));
                    i2++;
                    parcelableArrayList = parcelableArrayList;
                }
                immutableListS = lj3VarM.S();
            }
            ImmutableList immutableList = immutableListS;
            ArrayList parcelableArrayList2 = bundle6.getParcelableArrayList(fp4.o);
            ImmutableList immutableListQ = parcelableArrayList2 == null ? ImmutableList.q() : yh0.s(new vj3(24), parcelableArrayList2);
            long j7 = bundle6.getLong(fp4.p, -9223372036854775807L);
            Uri uri3 = (Uri) bundle6.getParcelable(fp4.i);
            uri3.getClass();
            fp4Var = new fp4(uri3, bundle6.getString(fp4.j), cp4Var, wo4Var, immutableList, bundle6.getString(fp4.n), immutableListQ, j7);
        }
        return new jp4(string, ap4Var2, fp4Var, ep4VarB, qp4VarB, gp4Var2);
    }

    /* JADX WARN: Type inference failed for: r2v9, types: [byte[], java.lang.Cloneable] */
    public final xo4 a() {
        bp4 bp4Var;
        xo4 xo4Var = new xo4();
        xo4Var.d = new yo4();
        xo4Var.e = new bp4();
        xo4Var.f = Collections.EMPTY_LIST;
        xo4Var.h = ImmutableList.q();
        xo4Var.l = new dp4();
        xo4Var.m = gp4.d;
        xo4Var.j = -9223372036854775807L;
        yo4 yo4Var = new yo4();
        ap4 ap4Var = this.e;
        yo4Var.a = ap4Var.b;
        yo4Var.b = ap4Var.d;
        yo4Var.c = ap4Var.e;
        yo4Var.d = ap4Var.f;
        yo4Var.e = ap4Var.g;
        yo4Var.f = ap4Var.h;
        xo4Var.d = yo4Var;
        xo4Var.a = this.a;
        xo4Var.k = this.d;
        xo4Var.l = this.c.a();
        xo4Var.m = this.f;
        fp4 fp4Var = this.b;
        if (fp4Var != null) {
            xo4Var.g = fp4Var.f;
            xo4Var.c = fp4Var.b;
            xo4Var.b = fp4Var.a;
            xo4Var.f = fp4Var.e;
            xo4Var.h = fp4Var.g;
            cp4 cp4Var = fp4Var.c;
            if (cp4Var != null) {
                bp4Var = new bp4();
                bp4Var.d = cp4Var.a;
                bp4Var.e = cp4Var.b;
                bp4Var.f = cp4Var.c;
                bp4Var.a = cp4Var.d;
                bp4Var.b = cp4Var.e;
                bp4Var.c = cp4Var.f;
                bp4Var.g = cp4Var.g;
                bp4Var.h = cp4Var.h;
            } else {
                bp4Var = new bp4();
            }
            xo4Var.e = bp4Var;
            xo4Var.i = fp4Var.d;
            xo4Var.j = fp4Var.h;
        }
        return xo4Var;
    }

    public final Bundle c(boolean z) {
        fp4 fp4Var;
        Bundle bundle = new Bundle();
        String str = this.a;
        if (!str.equals("")) {
            bundle.putString(h, str);
        }
        ep4 ep4Var = ep4.f;
        ep4 ep4Var2 = this.c;
        if (!ep4Var2.equals(ep4Var)) {
            bundle.putBundle(i, ep4Var2.c());
        }
        qp4 qp4Var = qp4.K;
        qp4 qp4Var2 = this.d;
        if (!qp4Var2.equals(qp4Var)) {
            bundle.putBundle(j, qp4Var2.c());
        }
        zo4 zo4Var = zo4.i;
        ap4 ap4Var = this.e;
        if (!ap4Var.equals(zo4Var)) {
            Bundle bundle2 = new Bundle();
            long j2 = ap4Var.a;
            if (j2 != zo4Var.a) {
                bundle2.putLong(zo4.j, j2);
            }
            long j3 = ap4Var.c;
            if (j3 != zo4Var.c) {
                bundle2.putLong(zo4.k, j3);
            }
            long j4 = ap4Var.b;
            if (j4 != zo4Var.b) {
                bundle2.putLong(zo4.o, j4);
            }
            long j5 = ap4Var.d;
            if (j5 != zo4Var.d) {
                bundle2.putLong(zo4.p, j5);
            }
            boolean z2 = ap4Var.e;
            if (z2 != zo4Var.e) {
                bundle2.putBoolean(zo4.l, z2);
            }
            boolean z3 = ap4Var.f;
            if (z3 != zo4Var.f) {
                bundle2.putBoolean(zo4.m, z3);
            }
            boolean z4 = ap4Var.g;
            if (z4 != zo4Var.g) {
                bundle2.putBoolean(zo4.n, z4);
            }
            boolean z5 = ap4Var.h;
            if (z5 != zo4Var.h) {
                bundle2.putBoolean(zo4.q, z5);
            }
            bundle.putBundle(k, bundle2);
        }
        gp4 gp4Var = gp4.d;
        gp4 gp4Var2 = this.f;
        if (!gp4Var2.equals(gp4Var)) {
            Bundle bundle3 = new Bundle();
            Uri uri = gp4Var2.a;
            if (uri != null) {
                bundle3.putParcelable(gp4.e, uri);
            }
            String str2 = gp4Var2.b;
            if (str2 != null) {
                bundle3.putString(gp4.f, str2);
            }
            Bundle bundle4 = gp4Var2.c;
            if (bundle4 != null) {
                bundle3.putBundle(gp4.g, bundle4);
            }
            bundle.putBundle(l, bundle3);
        }
        if (z && (fp4Var = this.b) != null) {
            ImmutableList immutableList = fp4Var.g;
            List list = fp4Var.e;
            Bundle bundle5 = new Bundle();
            bundle5.putParcelable(fp4.i, fp4Var.a);
            String str3 = fp4Var.b;
            if (str3 != null) {
                bundle5.putString(fp4.j, str3);
            }
            cp4 cp4Var = fp4Var.c;
            if (cp4Var != null) {
                String str4 = fp4.k;
                ImmutableList immutableList2 = cp4Var.g;
                ImmutableMap immutableMap = cp4Var.c;
                Bundle bundle6 = new Bundle();
                bundle6.putString(cp4.i, cp4Var.a.toString());
                Uri uri2 = cp4Var.b;
                if (uri2 != null) {
                    bundle6.putParcelable(cp4.j, uri2);
                }
                if (!immutableMap.isEmpty()) {
                    String str5 = cp4.k;
                    Bundle bundle7 = new Bundle();
                    Iterator it = immutableMap.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        bundle7.putString((String) entry.getKey(), (String) entry.getValue());
                    }
                    bundle6.putBundle(str5, bundle7);
                }
                boolean z6 = cp4Var.d;
                if (z6) {
                    bundle6.putBoolean(cp4.l, z6);
                }
                boolean z7 = cp4Var.e;
                if (z7) {
                    bundle6.putBoolean(cp4.m, z7);
                }
                boolean z8 = cp4Var.f;
                if (z8) {
                    bundle6.putBoolean(cp4.n, z8);
                }
                if (!immutableList2.isEmpty()) {
                    bundle6.putIntegerArrayList(cp4.o, new ArrayList<>(immutableList2));
                }
                byte[] bArr = cp4Var.h;
                if (bArr != null) {
                    bundle6.putByteArray(cp4.p, bArr);
                }
                bundle5.putBundle(str4, bundle6);
            }
            wo4 wo4Var = fp4Var.d;
            if (wo4Var != null) {
                String str6 = fp4.l;
                Bundle bundle8 = new Bundle();
                bundle8.putParcelable(wo4.b, wo4Var.a);
                bundle5.putBundle(str6, bundle8);
            }
            if (!list.isEmpty()) {
                bundle5.putParcelableArrayList(fp4.m, yh0.O(list, new vj3(22)));
            }
            String str7 = fp4Var.f;
            if (str7 != null) {
                bundle5.putString(fp4.n, str7);
            }
            if (!immutableList.isEmpty()) {
                bundle5.putParcelableArrayList(fp4.o, yh0.O(immutableList, new vj3(23)));
            }
            long j6 = fp4Var.h;
            if (j6 != -9223372036854775807L) {
                bundle5.putLong(fp4.p, j6);
            }
            bundle.putBundle(m, bundle5);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jp4)) {
            return false;
        }
        jp4 jp4Var = (jp4) obj;
        return Objects.equals(this.a, jp4Var.a) && this.e.equals(jp4Var.e) && Objects.equals(this.b, jp4Var.b) && Objects.equals(this.c, jp4Var.c) && Objects.equals(this.d, jp4Var.d) && Objects.equals(this.f, jp4Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        fp4 fp4Var = this.b;
        return this.f.hashCode() + ((this.d.hashCode() + ((this.e.hashCode() + ((this.c.hashCode() + ((iHashCode + (fp4Var != null ? fp4Var.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }
}
