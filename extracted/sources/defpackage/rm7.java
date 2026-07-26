package defpackage;

import android.content.ContentProviderClient;
import android.content.res.TypedArray;
import android.drm.DrmManagerClient;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import com.google.android.gms.internal.measurement.p0;
import com.google.common.collect.ImmutableList;
import io.sentry.SentryLevel;
import io.sentry.c1;
import io.sentry.f;
import io.sentry.internal.debugmeta.c;
import io.sentry.u0;
import ir.mservices.market.app.detail.update.b;
import ir.mservices.market.app.update.common.modal.a;
import ir.mservices.market.core.notification.PushMessage;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.pcap4j.packet.namednumber.TcpPort;
import org.pcap4j.packet.namednumber.UdpPort;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class rm7 {
    public static void A(TcpPort tcpPort, HashMap map, TcpPort tcpPort2, TcpPort tcpPort3, TcpPort tcpPort4) {
        map.put(tcpPort.value(), tcpPort2);
        map.put(tcpPort3.value(), tcpPort4);
    }

    public static void B(UdpPort udpPort, HashMap map, UdpPort udpPort2, UdpPort udpPort3, UdpPort udpPort4) {
        map.put(udpPort.value(), udpPort2);
        map.put(udpPort3.value(), udpPort4);
    }

    public static /* synthetic */ Object C(a aVar, String str, int i, PushMessage pushMessage, Object obj, String str2, String str3, b bVar, SuspendLambda suspendLambda, int i2) {
        if ((i2 & 4) != 0) {
            pushMessage = null;
        }
        if ((i2 & 8) != 0) {
            obj = null;
        }
        return aVar.d(str, i, pushMessage, obj, str2, str3, bVar, suspendLambda);
    }

    public static xk9 D(rk9 rk9Var, cl9 cl9Var, o77 o77Var, ArrayList arrayList) {
        String str = cl9Var.a;
        if (rk9Var.f(str)) {
            xk9 xk9VarD = rk9Var.d(str);
            if (xk9VarD instanceof pk9) {
                return ((pk9) xk9VarD).b(o77Var, arrayList);
            }
            throw new IllegalArgumentException(t61.i(str, " is not a function"));
        }
        if (!"hasOwnProperty".equals(str)) {
            throw new IllegalArgumentException(dw1.n("Object has no function ", str));
        }
        c67.o(1, "hasOwnProperty", arrayList);
        return rk9Var.f(((rn6) o77Var.b).D(o77Var, (xk9) arrayList.get(0)).l()) ? xk9.u0 : xk9.v0;
    }

    public static void a(c1 c1Var, String str) {
        f fVar = new f();
        fVar.d = str;
        c1Var.k(fVar);
    }

    public static k79 b(q79 q79Var, ps0 ps0Var, ta5 ta5Var) {
        return q79Var.b(yh0.u(ps0Var), ta5Var);
    }

    public static boolean c(u0 u0Var, String str) {
        if (str != null && !str.isEmpty()) {
            return true;
        }
        u0Var.i(SentryLevel.INFO, "No cached dir path is defined in options.", new Object[0]);
        return false;
    }

    public static bi8 d(bi8 bi8Var, bi8 bi8Var2) {
        boolean z = bi8Var2 instanceof eh0;
        if (!z || !(bi8Var instanceof eh0)) {
            return (!z || (bi8Var instanceof eh0)) ? (z || !(bi8Var instanceof eh0)) ? bi8Var2.d(new yu7(6, bi8Var)) : bi8Var : bi8Var2;
        }
        eh0 eh0Var = (eh0) bi8Var2;
        sr7 sr7Var = eh0Var.a;
        float f = eh0Var.b;
        if (Float.isNaN(f)) {
            f = ((eh0) bi8Var).b;
        }
        return new eh0(sr7Var, f);
    }

    public static p81 e(cb8 cb8Var, byte[] bArr, int i) {
        lj3 lj3VarM = ImmutableList.m();
        cb8Var.m(bArr, 0, i, bb8.c, new ts5(22, lj3VarM));
        return new p81(lj3VarM.S());
    }

    public static int f(int i, int i2, int i3) {
        return p0.v(i) + i2 + i3;
    }

    public static int g(int i, int i2, int i3, int i4) {
        return p0.v(i) + i2 + i3 + i4;
    }

    public static int h(int i, int i2, gj8 gj8Var) {
        return (gj8Var.hashCode() + i) * i2;
    }

    public static int i(int i, int i2, List list) {
        return (list.hashCode() + i) * i2;
    }

    public static int j(xr7 xr7Var, int i, int i2) {
        return (xr7Var.hashCode() + i) * i2;
    }

    public static int k(String str, int i, int i2) {
        return (str.hashCode() + i) * i2;
    }

    public static ClassCastException l(int i, ArrayList arrayList) {
        arrayList.get(i).getClass();
        return new ClassCastException();
    }

    public static String m(char c, String str, String str2) {
        return str + str2 + c;
    }

    public static String n(int i, String str) {
        return str + i;
    }

    public static String o(int i, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(i);
        return sb.toString();
    }

    public static String p(Uri uri, String str) {
        return str + uri;
    }

    public static String q(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static StringBuilder r(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder s(long j, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(j);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder t(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    public static void u(int i, String str, String str2, StringBuilder sb, byte[] bArr) {
        sb.append(new String(bArr));
        sb.append(str);
        sb.append(i);
        sb.append(str2);
    }

    public static void v(int i, HashMap map, String str, int i2, String str2) {
        map.put(str, Integer.valueOf(i));
        map.put(str2, Integer.valueOf(i2));
    }

    public static void w(rj2 rj2Var, cp8 cp8Var) {
        cp8Var.f(new androidx.media3.common.b(rj2Var));
    }

    public static /* synthetic */ void x(AutoCloseable autoCloseable) throws Exception {
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (autoCloseable instanceof ExecutorService) {
            d1.m((ExecutorService) autoCloseable);
            return;
        }
        if (autoCloseable instanceof TypedArray) {
            ((TypedArray) autoCloseable).recycle();
            return;
        }
        if (autoCloseable instanceof MediaMetadataRetriever) {
            ((MediaMetadataRetriever) autoCloseable).release();
            return;
        }
        if (autoCloseable instanceof MediaDrm) {
            ((MediaDrm) autoCloseable).release();
        } else if (autoCloseable instanceof DrmManagerClient) {
            ((DrmManagerClient) autoCloseable).release();
        } else {
            if (!(autoCloseable instanceof ContentProviderClient)) {
                throw new IllegalArgumentException();
            }
            ((ContentProviderClient) autoCloseable).release();
        }
    }

    public static void y(HashMap map, String str, c cVar, String str2, u0 u0Var) {
        Object obj = map.get(str);
        cVar.q(str2);
        cVar.w(u0Var, obj);
    }

    public static void z(ConcurrentHashMap concurrentHashMap, String str, c cVar, String str2, u0 u0Var) {
        Object obj = concurrentHashMap.get(str);
        cVar.q(str2);
        cVar.w(u0Var, obj);
    }
}
