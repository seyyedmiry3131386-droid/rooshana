package defpackage;

import android.animation.ValueAnimator;
import android.content.ContentProviderClient;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.drm.DrmManagerClient;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.widget.EditText;
import androidx.compose.runtime.g;
import androidx.compose.ui.node.i;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import org.pcap4j.packet.namednumber.DnsResourceRecordType;
import org.pcap4j.packet.namednumber.Dot11InformationElementId;
import org.pcap4j.packet.namednumber.Dot11VenueInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class o40 {
    public static StringBuilder A(int i, String str) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(str);
        return sb;
    }

    public static StringBuilder B(int i, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(i);
        sb.append(str4);
        return sb;
    }

    public static void C(int i, qz0 qz0Var, int i2, qp2 qp2Var) {
        qz0Var.l0(Integer.valueOf(i));
        qz0Var.b(qp2Var, Integer.valueOf(i2));
    }

    public static void D(int i, ConstraintLayout constraintLayout) {
        constraintLayout.setBackground(new ColorDrawable(i));
    }

    public static void E(int i, String str, String str2) {
        wn5.k0(str2, str + i);
    }

    public static void F(wv8 wv8Var, long j) {
        wv8Var.v().o();
        wv8Var.P(j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void G(Cursor cursor) throws Exception {
        if (cursor instanceof AutoCloseable) {
            cursor.close();
            return;
        }
        if (cursor instanceof ExecutorService) {
            d1.m((ExecutorService) cursor);
            return;
        }
        if (cursor instanceof TypedArray) {
            ((TypedArray) cursor).recycle();
            return;
        }
        if (cursor instanceof MediaMetadataRetriever) {
            ((MediaMetadataRetriever) cursor).release();
            return;
        }
        if (cursor instanceof MediaDrm) {
            ((MediaDrm) cursor).release();
        } else if (cursor instanceof DrmManagerClient) {
            ((DrmManagerClient) cursor).release();
        } else {
            if (!(cursor instanceof ContentProviderClient)) {
                throw new IllegalArgumentException();
            }
            ((ContentProviderClient) cursor).release();
        }
    }

    public static void H(String str, String str2, String str3) {
        wn5.k0(str3, str + str2);
    }

    public static void I(String str, String str2, String str3, String str4, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    public static void J(StringBuilder sb, int i, String str, int i2, String str2) {
        sb.append(i);
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
    }

    public static void K(StringBuilder sb, boolean z, String str, String str2) {
        sb.append(z);
        sb.append(str);
        sb.append(str2);
    }

    public static void L(DnsResourceRecordType dnsResourceRecordType, HashMap map, DnsResourceRecordType dnsResourceRecordType2, DnsResourceRecordType dnsResourceRecordType3, DnsResourceRecordType dnsResourceRecordType4) {
        map.put(dnsResourceRecordType.value(), dnsResourceRecordType2);
        map.put(dnsResourceRecordType3.value(), dnsResourceRecordType4);
    }

    public static void M(Dot11InformationElementId dot11InformationElementId, HashMap map, Dot11InformationElementId dot11InformationElementId2, Dot11InformationElementId dot11InformationElementId3, Dot11InformationElementId dot11InformationElementId4) {
        map.put(dot11InformationElementId.value(), dot11InformationElementId2);
        map.put(dot11InformationElementId3.value(), dot11InformationElementId4);
    }

    public static void N(Dot11VenueInfo dot11VenueInfo, HashMap map, Dot11VenueInfo dot11VenueInfo2, Dot11VenueInfo dot11VenueInfo3, Dot11VenueInfo dot11VenueInfo4) {
        map.put(dot11VenueInfo.value(), dot11VenueInfo2);
        map.put(dot11VenueInfo3.value(), dot11VenueInfo4);
    }

    public static /* synthetic */ boolean O(Object obj) {
        return obj != null;
    }

    public static void P(EditText... editTextArr) {
        if (editTextArr.length == 0) {
            return;
        }
        xs0 xs0Var = new xs0(1, editTextArr);
        for (EditText editText : editTextArr) {
            editText.setOnFocusChangeListener(xs0Var);
        }
        EditText editText2 = editTextArr[0];
        editText2.postDelayed(new pe0(1, editText2), 100L);
    }

    public static int a(qj1 qj1Var, float f) {
        float fS = qj1Var.S(f);
        if (Float.isInfinite(fS)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(fS);
    }

    public static long b(long j, qj1 qj1Var) {
        if (j != 9205357640488583168L) {
            return br9.f(qj1Var.L(Float.intBitsToFloat((int) (j >> 32))), qj1Var.L(Float.intBitsToFloat((int) (j & 4294967295L))));
        }
        return 9205357640488583168L;
    }

    public static float c(long j, qj1 qj1Var) {
        if (!kj8.a(jj8.b(j), 4294967296L)) {
            tn3.b("Only Sp can convert to Px");
        }
        return qj1Var.S(qj1Var.s(j));
    }

    public static long d(long j, qj1 qj1Var) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float fS = qj1Var.S(Float.intBitsToFloat((int) (j >> 32)));
        float fS2 = qj1Var.S(Float.intBitsToFloat((int) (j & 4294967295L)));
        return (((long) Float.floatToRawIntBits(fS)) << 32) | (((long) Float.floatToRawIntBits(fS2)) & 4294967295L);
    }

    public static long e(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    public static /* synthetic */ void g(hv1 hv1Var, long j, float f, long j2, iv1 iv1Var, int i) {
        if ((i & 4) != 0) {
            j2 = hv1Var.d0();
        }
        long j3 = j2;
        if ((i & 16) != 0) {
            iv1Var = dc2.a;
        }
        hv1Var.E(j, f, j3, iv1Var);
    }

    public static void h(hv1 hv1Var, og ogVar, long j, long j2, float f, tc0 tc0Var, int i, int i2) {
        hv1Var.a0(ogVar, 0L, j, (i2 & 16) != 0 ? j : j2, (i2 & 32) != 0 ? 1.0f : f, tc0Var, (i2 & 512) != 0 ? 1 : i);
    }

    public static /* synthetic */ void j(hv1 hv1Var, u26 u26Var, ch0 ch0Var, float f, p88 p88Var, int i) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        iv1 iv1Var = p88Var;
        if ((i & 8) != 0) {
            iv1Var = dc2.a;
        }
        hv1Var.M(u26Var, ch0Var, f2, iv1Var, (i & 32) != 0 ? 3 : 0);
    }

    public static /* synthetic */ void k(hv1 hv1Var, ch0 ch0Var, long j, long j2, float f, iv1 iv1Var, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = e(hv1Var.d(), j3);
        }
        hv1Var.g0(ch0Var, j3, j2, (i & 8) != 0 ? 1.0f : f, (i & 16) != 0 ? dc2.a : iv1Var);
    }

    public static /* synthetic */ void l(hv1 hv1Var, long j, long j2, float f, int i) {
        if ((i & 4) != 0) {
            j2 = e(hv1Var.d(), 0L);
        }
        long j3 = j2;
        if ((i & 8) != 0) {
            f = 1.0f;
        }
        hv1Var.l0(j, 0L, j3, f, (i & 64) != 0 ? 3 : 0);
    }

    public static /* synthetic */ void m(i iVar, ch0 ch0Var, long j, long j2, long j3, iv1 iv1Var, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j4 = j;
        iVar.c(ch0Var, j4, (i & 4) != 0 ? e(iVar.d(), j4) : j2, j3, 1.0f, (i & 32) != 0 ? dc2.a : iv1Var);
    }

    public static long o(j41 j41Var) {
        byte[] bArr = (byte[]) ((zd1) j41Var).b.get("exo_len");
        if (bArr != null) {
            return ByteBuffer.wrap(bArr).getLong();
        }
        return -1L;
    }

    public static int p(int i, int i2, int i3, int i4) {
        return ((i * i2) / i3) + i4;
    }

    public static int q(fe0 fe0Var, int i, int i2) {
        return (fe0Var.hashCode() + i) * i2;
    }

    public static ab5 r(qz0 qz0Var) {
        ab5 ab5Var = new ab5();
        qz0Var.l0(ab5Var);
        return ab5Var;
    }

    public static wb5 s(long j, th0 th0Var) {
        return g.g(new zu0(j), th0Var);
    }

    public static on6 t(w91 w91Var, int i) {
        return dr1.b(new v91(w91Var, i));
    }

    public static Object u(int i, ArrayList arrayList) {
        return arrayList.get(arrayList.size() - i);
    }

    public static Object v(ValueAnimator valueAnimator, String str, String str2) {
        js3.p(valueAnimator, str);
        Object animatedValue = valueAnimator.getAnimatedValue();
        js3.n(animatedValue, str2);
        return animatedValue;
    }

    public static String w(RecyclerView recyclerView, StringBuilder sb) {
        sb.append(recyclerView.C());
        return sb.toString();
    }

    public static String x(Object obj, String str) {
        return str + obj;
    }

    public static String y(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String z(String str, String str2, String str3, String str4, StringBuilder sb) {
        String property = System.getProperty(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(property);
        sb.append(str4);
        return property;
    }
}
