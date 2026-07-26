package defpackage;

import androidx.compose.foundation.lazy.b;
import androidx.fragment.app.d;
import androidx.paging.m;
import com.google.protobuf.j;
import ir.mservices.market.common.ext.model.c;
import ir.mservices.market.core.analytics.ClickEventBuilder;
import java.util.HashMap;
import java.util.List;
import org.pcap4j.packet.namednumber.GtpV1MessageType;
import org.pcap4j.packet.namednumber.GtpV2MessageType;
import org.pcap4j.packet.namednumber.IcmpV6Type;
import org.pcap4j.packet.namednumber.IpNumber;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class dw1 {
    public static void A(GtpV2MessageType gtpV2MessageType, HashMap map, GtpV2MessageType gtpV2MessageType2, GtpV2MessageType gtpV2MessageType3, GtpV2MessageType gtpV2MessageType4) {
        map.put(gtpV2MessageType.value(), gtpV2MessageType2);
        map.put(gtpV2MessageType3.value(), gtpV2MessageType4);
    }

    public static void B(IpNumber ipNumber, HashMap map, IpNumber ipNumber2, IpNumber ipNumber3, IpNumber ipNumber4) {
        map.put(ipNumber.value(), ipNumber2);
        map.put(ipNumber3.value(), ipNumber4);
    }

    public static /* synthetic */ void C(am2 am2Var, yi5 yi5Var, Integer num, int i) {
        if ((i & 4) != 0) {
            num = null;
        }
        am2Var.y(yi5Var, num);
    }

    public static f34 E(r79 r79Var, int i) {
        b bVar = (b) r79Var.b;
        c08 c08VarK = ql3.k();
        dp2 dp2VarE = c08VarK != null ? c08VarK.e() : null;
        c08 c08VarM = ql3.m(c08VarK);
        try {
            v34 v34Var = (v34) ((s08) bVar.f).getValue();
            ql3.u(c08VarK, c08VarM, dp2VarE);
            g34 g34Var = bVar.p;
            long j = v34Var.j;
            boolean z = bVar.d;
            us3 us3Var = new us3(i, v34Var);
            ry ryVar = g34Var.c;
            if (ryVar == null) {
                return fz1.h;
            }
            pa2 pa2Var = g34Var.b;
            nj6 nj6Var = (nj6) ryVar.e;
            boolean z2 = nj6Var instanceof nh;
            mj6 mj6Var = new mj6(ryVar, i, pa2Var, us3Var);
            mj6Var.d = new h31(j);
            if (!z2) {
                nj6Var.a(mj6Var);
            } else if (z) {
                nh nhVar = (nh) nj6Var;
                nhVar.b.add(new hk6(1, mj6Var));
                if (!nhVar.c) {
                    nhVar.c = true;
                    nhVar.a.post(nhVar);
                }
            } else {
                nh nhVar2 = (nh) nj6Var;
                nhVar2.b.add(new hk6(0, mj6Var));
                if (!nhVar2.c) {
                    nhVar2.c = true;
                    nhVar2.a.post(nhVar2);
                }
            }
            te.Y(i, "compose:lazy:schedule_prefetch:index");
            return mj6Var;
        } catch (Throwable th) {
            ql3.u(c08VarK, c08VarM, dp2VarE);
            throw th;
        }
    }

    public static void a(q12 q12Var, px3 px3Var, Object obj) {
        js3.p(px3Var, "serializer");
        if (px3Var.getDescriptor().c()) {
            q12Var.g(px3Var, obj);
        } else if (obj == null) {
            q12Var.e();
        } else {
            q12Var.g(px3Var, obj);
        }
    }

    public static float b(long j, qj1 qj1Var) {
        float fC;
        float fO;
        if (!kj8.a(jj8.b(j), 4294967296L)) {
            tn3.b("Only Sp can convert to Px");
        }
        float[] fArr = li2.a;
        if (qj1Var.O() >= 1.03f) {
            ki2 ki2VarA = li2.a(qj1Var.O());
            fC = jj8.c(j);
            if (ki2VarA != null) {
                return ki2VarA.b(fC);
            }
            fO = qj1Var.O();
        } else {
            fC = jj8.c(j);
            fO = qj1Var.O();
        }
        return fO * fC;
    }

    public static l32 c(jf3 jf3Var) {
        return new l32(jf3Var.e(), jf3Var.b(), jf3Var.a(), jf3Var.c());
    }

    public static long d(qj1 qj1Var, float f) {
        float[] fArr = li2.a;
        if (qj1Var.O() < 1.03f) {
            return w07.h(f / qj1Var.O(), 4294967296L);
        }
        ki2 ki2VarA = li2.a(qj1Var.O());
        return w07.h(ki2VarA != null ? ki2VarA.a(f) : f / qj1Var.O(), 4294967296L);
    }

    public static xe2 e(wv8 wv8Var, String str, Object obj, boolean z) {
        wv8Var.getClass();
        js3.p(str, "url");
        return (xe2) new m(gu9.o(z), new c(wv8Var, str, obj, false)).a;
    }

    public static float f(float f, float f2, float f3, float f4) {
        return ((f - f2) * f3) + f4;
    }

    public static int g(float f, int i, int i2) {
        return (Float.floatToIntBits(f) + i) * i2;
    }

    public static int h(int i, int i2, int i3, int i4) {
        return j.e0(i) + i2 + i3 + i4;
    }

    public static cx7 i(va0 va0Var, nx4 nx4Var) {
        cx7 cx7Var = new cx7(va0Var);
        nx4Var.a(cx7Var);
        return cx7Var;
    }

    public static String j(int i, int i2, String str, String str2) {
        return str + i + str2 + i2;
    }

    public static String k(int i, String str, StringBuilder sb) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    public static String l(String str, int i, int i2) {
        return str.substring(i2, str.length() - i);
    }

    public static String m(String str, d dVar, String str2) {
        return str + dVar + str2;
    }

    public static String n(String str, String str2) {
        return str + str2;
    }

    public static String o(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String p(String str, String str2, String str3, String str4, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb.toString();
    }

    public static String q(StringBuilder sb, int i, char c) {
        sb.append(i);
        sb.append(c);
        return sb.toString();
    }

    public static String r(StringBuilder sb, String str, char c, to6 to6Var, String str2) {
        sb.append(str);
        sb.append(c);
        sb.append(to6Var);
        String string = sb.toString();
        js3.p(string, str2);
        return string;
    }

    public static String s(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static String t(StringBuilder sb, List list, char c) {
        sb.append(list);
        sb.append(c);
        return sb.toString();
    }

    public static HashMap u(IcmpV6Type icmpV6Type, HashMap map, HashMap map2) {
        map.put(icmpV6Type.value(), map2);
        return new HashMap();
    }

    public static void v(int i, int i2, int i3, int i4, int i5) {
        ub1.d(i);
        ub1.d(i2);
        ub1.d(i3);
        ub1.d(i4);
        ub1.d(i5);
    }

    public static void w(ps0 ps0Var, StringBuilder sb, char c) {
        sb.append(ax3.a(ps0Var));
        sb.append(c);
    }

    public static /* synthetic */ void x(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static void y(String str) {
        ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
        clickEventBuilder.b(str);
        clickEventBuilder.a();
    }

    public static void z(GtpV1MessageType gtpV1MessageType, HashMap map, GtpV1MessageType gtpV1MessageType2, GtpV1MessageType gtpV1MessageType3, GtpV1MessageType gtpV1MessageType4) {
        map.put(gtpV1MessageType.value(), gtpV1MessageType2);
        map.put(gtpV1MessageType3.value(), gtpV1MessageType4);
    }
}
