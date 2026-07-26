package defpackage;

import androidx.compose.ui.node.h;
import androidx.compose.ui.node.m;
import androidx.datastore.core.CorruptionException;
import com.sun.jna.Native;
import ir.mservices.market.social.profile.list.ProfileListFragment;
import ir.mservices.market.version2.webapi.responsedto.RequestDTO;
import ir.myket.core.utils.PersianCalendar;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.logging.Logger;
import kotlin.Pair;
import kotlin.text.Regex;
import okhttp3.TlsVersion;

/* JADX INFO: loaded from: classes3.dex */
public final class ol3 implements h32, f82, RequestDTO, g71, go5, k71 {
    public final /* synthetic */ int a;

    public /* synthetic */ ol3(int i) {
        this.a = i;
    }

    public static final int b(int i, boolean z) {
        int[] iArr = PersianCalendar.a;
        if (i < 0 || i > 11) {
            throw new IllegalArgumentException();
        }
        if (i == 11) {
            return z ? 30 : 29;
        }
        int[] iArr2 = PersianCalendar.b;
        return iArr2[i + 1] - iArr2[i];
    }

    public static final int c(int i, boolean z) {
        int[] iArr = PersianCalendar.a;
        if (i <= 0) {
            throw new IllegalArgumentException(rm7.n(i, "Year cannot be negative or zero. Year: "));
        }
        if (z && i >= 1349) {
            int[] iArr2 = PersianCalendar.a;
            if (i < 1417) {
                return iArr2[i - 1349];
            }
        }
        int i2 = (z ? i - 1 : -i) + 38;
        int iFloor = ((int) Math.floor(((double) i2) / 2820.0d)) * 1029983;
        int i3 = i2 % 2820;
        if (i3 < 0) {
            i3 += 2820;
        }
        int iFloor2 = ((int) Math.floor(((double) (i3 - 38)) * 365.24219d)) + 1 + iFloor;
        double d = ((double) i3) * 0.24219d;
        int iO = o((d - Math.floor(d)) * ((double) 1000));
        int i4 = i - 1;
        if (z && i == 1) {
            z = false;
            i4 = 1;
        } else if (!z) {
            i4 = i + 1;
        }
        return (!q(i4, z) || iO > 202) ? iFloor2 : iFloor2 + 1;
    }

    public static final boolean e(s26 s26Var) {
        s26 s26Var2 = o67.f;
        return !m88.S(s26Var.b(), ".class", true);
    }

    public static a57 i(int i, dt4 dt4Var, byte[] bArr) {
        js3.p(bArr, "<this>");
        gh9.a(bArr.length, 0, i);
        return new a57(i, dt4Var, bArr);
    }

    public static a57 k(String str, dt4 dt4Var) {
        Charset charset = zp0.a;
        Regex regex = dt4.e;
        Charset charsetA = dt4Var.a(null);
        if (charsetA == null) {
            String str2 = dt4Var + "; charset=utf-8";
            js3.p(str2, "<this>");
            try {
                dt4Var = ok4.A(str2);
            } catch (IllegalArgumentException unused) {
                dt4Var = null;
            }
        } else {
            charset = charsetA;
        }
        byte[] bytes = str.getBytes(charset);
        js3.o(bytes, "getBytes(...)");
        return i(bytes.length, dt4Var, bytes);
    }

    public static /* synthetic */ a57 m(byte[] bArr, dt4 dt4Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            dt4Var = null;
        }
        if ((i2 & 4) != 0) {
            i = bArr.length;
        }
        return i(i, dt4Var, bArr);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static TlsVersion n(String str) {
        js3.p(str, "javaName");
        int iHashCode = str.hashCode();
        if (iHashCode != 79201641) {
            if (iHashCode != 79923350) {
                switch (iHashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return TlsVersion.e;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return TlsVersion.d;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return TlsVersion.c;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return TlsVersion.f;
            }
        } else if (str.equals("SSLv3")) {
            return TlsVersion.g;
        }
        throw new IllegalArgumentException("Unexpected TLS version: ".concat(str));
    }

    public static int o(double d) {
        return ((int) Math.floor(d)) + (d >= 0.0d ? 0 : 1);
    }

    public static ProfileListFragment p(String str, boolean z) {
        ProfileListFragment profileListFragment = new ProfileListFragment();
        profileListFragment.u0(is3.g(new Pair("BUNDLE_KEY_IS_APP", Boolean.valueOf(z)), new Pair("BUNDLE_KEY_ACCOUNT_KEY", str)));
        return profileListFragment;
    }

    public static boolean q(int i, boolean z) {
        double dR = (((double) r(i, z)) * 0.24219d) + 0.025d;
        double dR2 = (((double) (z ? r(i + 1, true) : r(i - 1, false))) * 0.24219d) + 0.025d;
        double d = 1000;
        double dO = o((dR - ((double) o(dR))) * d);
        double dO2 = o((dR2 - ((double) o(dR2))) * d);
        double d2 = 266;
        return dO <= d2 && dO2 > d2;
    }

    public static int r(int i, boolean z) {
        if (z) {
            int i2 = (i + 38) % 2820;
            return i2 < 0 ? i2 + 2820 : i2;
        }
        int i3 = ((-i) + 39) % 2820;
        return i3 < 0 ? i3 + 2820 : i3;
    }

    public static s26 s(s26 s26Var, s26 s26Var2) {
        js3.p(s26Var, "<this>");
        js3.p(s26Var2, "base");
        String strS = s26Var2.a.s();
        s26 s26Var3 = o67.f;
        String strReplace = f88.t0(s26Var.a.s(), strS).replace('\\', '/');
        js3.o(strReplace, "replace(...)");
        return s26Var3.e(strReplace);
    }

    @Override // defpackage.go5
    public boolean d(gx4 gx4Var) {
        return false;
    }

    @Override // defpackage.go5
    public int f() {
        return 8;
    }

    public void finalize() throws Throwable {
        LinkedHashSet linkedHashSet;
        switch (this.a) {
            case 10:
                Logger logger = Native.a;
                WeakHashMap weakHashMap = nl0.d;
                Iterator it = new LinkedList(nl0.f.keySet()).iterator();
                while (it.hasNext()) {
                    ((nl0) it.next()).a();
                }
                Map map = gt4.c;
                Iterator it2 = new LinkedList(gt4.c.keySet()).iterator();
                while (it2.hasNext()) {
                    ((gt4) it2.next()).P();
                }
                HashMap map2 = uh5.j;
                synchronized (map2) {
                    linkedHashSet = new LinkedHashSet(map2.values());
                    break;
                }
                Iterator it3 = linkedHashSet.iterator();
                while (it3.hasNext()) {
                    uh5 uh5Var = (uh5) ((Reference) it3.next()).get();
                    if (uh5Var != null) {
                        uh5Var.a();
                    }
                }
                Native.s();
                Native.f = null;
                System.setProperty("jna.loaded", "false");
                super.finalize();
                return;
            default:
                super.finalize();
                return;
        }
    }

    @Override // defpackage.f82
    public Object g() {
        return new hd4();
    }

    @Override // defpackage.go5
    public void h(h hVar, long j, tz2 tz2Var, int i, boolean z) {
        z4 z4Var = hVar.H;
        m mVar = (m) z4Var.e;
        dp2 dp2Var = m.O;
        ((m) z4Var.e).O0(m.U, mVar.G0(j), tz2Var, 1, z);
    }

    @Override // defpackage.h32
    public void j(Serializable serializable) {
        int i = ul3.e;
    }

    @Override // defpackage.go5
    public boolean l(h hVar) {
        en7 en7VarH = hVar.H();
        boolean z = false;
        if (en7VarH != null && en7VarH.d) {
            z = true;
        }
        return !z;
    }

    public String toString() {
        switch (this.a) {
            case 26:
                return "ReusedSlotId";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.g71
    public Object a(CorruptionException corruptionException) throws CorruptionException {
        throw corruptionException;
    }
}
