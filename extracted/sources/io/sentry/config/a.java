package io.sentry.config;

import android.content.Context;
import android.os.Process;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.compose.ui.node.h;
import androidx.compose.ui.node.m;
import com.j256.ormlite.stmt.query.SimpleComparison;
import defpackage.bl4;
import defpackage.dw1;
import defpackage.g77;
import defpackage.js3;
import defpackage.o40;
import defpackage.qm0;
import defpackage.w47;
import defpackage.z4;
import io.sentry.SentryLevel;
import io.sentry.android.core.o0;
import io.sentry.android.replay.y;
import io.sentry.b6;
import io.sentry.c1;
import io.sentry.e5;
import io.sentry.e6;
import io.sentry.f2;
import io.sentry.g3;
import io.sentry.h0;
import io.sentry.h3;
import io.sentry.h4;
import io.sentry.k;
import io.sentry.k1;
import io.sentry.k4;
import io.sentry.k6;
import io.sentry.m6;
import io.sentry.p6;
import io.sentry.protocol.a0;
import io.sentry.protocol.b0;
import io.sentry.protocol.c0;
import io.sentry.protocol.f;
import io.sentry.protocol.g0;
import io.sentry.protocol.q;
import io.sentry.protocol.u;
import io.sentry.protocol.v;
import io.sentry.r2;
import io.sentry.t;
import io.sentry.u0;
import io.sentry.u1;
import io.sentry.util.i;
import io.sentry.util.l;
import io.sentry.util.network.NetworkBody$NetworkBodyWarning;
import io.sentry.w4;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.net.URI;
import java.net.URLDecoder;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static Boolean a;
    public static io.sentry.internal.debugmeta.c b;

    public static Date A(long j) {
        Calendar calendar = Calendar.getInstance(io.sentry.vendor.gson.internal.bind.util.a.a);
        calendar.setTimeInMillis(j);
        return calendar.getTime();
    }

    public static Date B(String str) {
        try {
            return io.sentry.vendor.gson.internal.bind.util.a.c(str, new ParsePosition(0));
        } catch (ParseException unused) {
            throw new IllegalArgumentException(dw1.n("timestamp is not ISO format ", str));
        }
    }

    public static Date C(String str) {
        try {
            return A(new BigDecimal(str).setScale(3, RoundingMode.DOWN).movePointRight(3).longValue());
        } catch (NumberFormatException unused) {
            throw new IllegalArgumentException(dw1.n("timestamp is not millis format ", str));
        }
    }

    public static io.sentry.internal.debugmeta.c D() {
        Method declaredMethod;
        io.sentry.internal.debugmeta.c cVar = b;
        if (cVar != null) {
            return cVar;
        }
        Method method = null;
        try {
            declaredMethod = h.class.getDeclaredMethod("getChildren$ui_release", null);
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
            declaredMethod = null;
        }
        try {
            Method declaredMethod2 = h.class.getDeclaredMethod("getOuterCoordinator$ui_release", null);
            declaredMethod2.setAccessible(true);
            method = declaredMethod2;
        } catch (NoSuchMethodException unused2) {
        }
        io.sentry.internal.debugmeta.c cVar2 = new io.sentry.internal.debugmeta.c(10, declaredMethod, method, false);
        b = cVar2;
        return cVar2;
    }

    public static void E(b6 b6Var) {
        if (b6Var.getProfilingTracesDirPath() != null) {
            return;
        }
        File file = new File(System.getProperty("java.io.tmpdir"), "sentry_profiling_traces");
        if (file.mkdirs() || file.exists()) {
            b6Var.setProfilingTracesDirPath(file.getAbsolutePath());
        } else {
            throw new IllegalArgumentException("Creating a fallback directory for profiling failed in " + file.getAbsolutePath());
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [c24, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [c24, java.lang.Object] */
    public static final Window F(View view) throws IllegalAccessException {
        Field field;
        js3.p(view, "<this>");
        Object obj = y.a;
        View rootView = view.getRootView();
        js3.o(rootView, "getRootView(...)");
        Class cls = (Class) y.a.getValue();
        if (cls == null || !cls.isInstance(rootView) || (field = (Field) y.b.getValue()) == null) {
            return null;
        }
        Object obj2 = field.get(rootView);
        js3.n(obj2, "null cannot be cast to non-null type android.view.Window");
        return (Window) obj2;
    }

    public static String H(Date date) {
        TimeZone timeZone = io.sentry.vendor.gson.internal.bind.util.a.a;
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb = new StringBuilder(23 + (timeZone.getRawOffset() == 0 ? 1 : 6));
        io.sentry.vendor.gson.internal.bind.util.a.b(sb, gregorianCalendar.get(1), 4);
        sb.append('-');
        io.sentry.vendor.gson.internal.bind.util.a.b(sb, gregorianCalendar.get(2) + 1, 2);
        sb.append('-');
        io.sentry.vendor.gson.internal.bind.util.a.b(sb, gregorianCalendar.get(5), 2);
        sb.append('T');
        io.sentry.vendor.gson.internal.bind.util.a.b(sb, gregorianCalendar.get(11), 2);
        sb.append(':');
        io.sentry.vendor.gson.internal.bind.util.a.b(sb, gregorianCalendar.get(12), 2);
        sb.append(':');
        io.sentry.vendor.gson.internal.bind.util.a.b(sb, gregorianCalendar.get(13), 2);
        sb.append('.');
        io.sentry.vendor.gson.internal.bind.util.a.b(sb, gregorianCalendar.get(14), 3);
        int offset = timeZone.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i = offset / 60000;
            int iAbs = Math.abs(i / 60);
            int iAbs2 = Math.abs(i % 60);
            sb.append(offset >= 0 ? '+' : '-');
            io.sentry.vendor.gson.internal.bind.util.a.b(sb, iAbs, 2);
            sb.append(':');
            io.sentry.vendor.gson.internal.bind.util.a.b(sb, iAbs2, 2);
        } else {
            sb.append('Z');
        }
        return sb.toString();
    }

    public static boolean I(Context context) {
        W(context, "The application context is required.");
        return context.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) == 0;
    }

    public static boolean J(h0 h0Var, Class cls) {
        return cls.isInstance(h0Var.b("sentry:typeCheckHint"));
    }

    public static boolean K(h0 h0Var) {
        return Boolean.TRUE.equals(h0Var.c("sentry:isFromHybridSdk", Boolean.class));
    }

    public static boolean L(w4 w4Var, b6 b6Var) {
        return io.sentry.util.c.a(b6Var.getSerializer(), b6Var.getLogger(), w4Var) <= b6.MAX_EVENT_SIZE_BYTES;
    }

    public static boolean N(h hVar) throws IllegalAccessException, InvocationTargetException {
        z4 z4Var = hVar.H;
        Boolean bool = a;
        Boolean bool2 = Boolean.FALSE;
        if (js3.i(bool, bool2)) {
            return ((m) z4Var.e).R0();
        }
        if (js3.i(bool, Boolean.TRUE)) {
            Method method = (Method) D().c;
            js3.m(method);
            Object objInvoke = method.invoke(hVar, null);
            js3.n(objInvoke, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
            return ((m) objInvoke).R0();
        }
        if (bool != null) {
            throw new NoWhenBranchMatchedException();
        }
        try {
            boolean zR0 = ((m) z4Var.e).R0();
            a = bool2;
            return zR0;
        } catch (NoSuchMethodError unused) {
            a = Boolean.TRUE;
            Method method2 = (Method) D().c;
            js3.m(method2);
            Object objInvoke2 = method2.invoke(hVar, null);
            js3.n(objInvoke2, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
            return ((m) objInvoke2).R0();
        }
    }

    public static boolean O(Double d, boolean z) {
        return d == null ? z : !d.isNaN() && d.doubleValue() >= 0.0d && d.doubleValue() <= 1.0d;
    }

    public static void P(Class cls, Object obj, u0 u0Var) {
        u0Var.i(SentryLevel.DEBUG, "%s is not %s", obj != null ? obj.getClass().getCanonicalName() : "Hint", cls.getCanonicalName());
    }

    public static ConcurrentHashMap Q(Map map) {
        if (map == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                concurrentHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return concurrentHashMap;
    }

    public static k R(String str) {
        String str2;
        Object obj = null;
        try {
            URI uri = new URI(str);
            if (uri.isAbsolute()) {
                try {
                    uri.toURL();
                } catch (Exception unused) {
                    return new k(obj, obj, obj, 6);
                }
            }
            String rawPath = "";
            if (uri.getScheme() == null) {
                str2 = "";
            } else {
                str2 = uri.getScheme() + "://";
            }
            String rawAuthority = uri.getRawAuthority() == null ? "" : uri.getRawAuthority();
            if (uri.getRawPath() != null) {
                rawPath = uri.getRawPath();
            }
            return new k(str2 + u(rawAuthority) + rawPath, uri.getRawQuery(), uri.getRawFragment(), 6);
        } catch (Exception unused2) {
            return new k(obj, obj, obj, 6);
        }
    }

    public static io.sentry.internal.debugmeta.c S(String str, String str2, boolean z, u0 u0Var) {
        if (str.isEmpty()) {
            return null;
        }
        if (str2 != null) {
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            if (lowerCase.contains("application/x-www-form-urlencoded")) {
                try {
                    HashMap map = new HashMap();
                    for (String str3 : str.split("&", -1)) {
                        int iIndexOf = str3.indexOf(SimpleComparison.EQUAL_TO_OPERATION);
                        if (iIndexOf > 0) {
                            String strDecode = URLDecoder.decode(str3.substring(0, iIndexOf), "UTF-8");
                            String strDecode2 = iIndexOf < str3.length() + (-1) ? URLDecoder.decode(str3.substring(iIndexOf + 1), "UTF-8") : "";
                            if (map.containsKey(strDecode)) {
                                Object obj = map.get(strDecode);
                                if (obj instanceof List) {
                                    ((List) obj).add(strDecode2);
                                } else {
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add((String) obj);
                                    arrayList.add(strDecode2);
                                    map.put(strDecode, arrayList);
                                }
                            } else {
                                map.put(strDecode, strDecode2);
                            }
                        }
                    }
                    return new io.sentry.internal.debugmeta.c(12, map, z ? Collections.singletonList(NetworkBody$NetworkBodyWarning.TEXT_TRUNCATED) : null, false);
                } catch (UnsupportedEncodingException e) {
                    u0Var.i(SentryLevel.WARNING, "Failed to parse form data: " + e.getMessage(), new Object[0]);
                    return new io.sentry.internal.debugmeta.c(12, list, Collections.singletonList(NetworkBody$NetworkBodyWarning.BODY_PARSE_ERROR), false);
                }
            }
            if (lowerCase.contains("application/json")) {
                try {
                    io.sentry.vendor.gson.stream.a aVar = new io.sentry.vendor.gson.stream.a(new StringReader(str));
                    try {
                        f2 f2Var = new f2(11, (byte) 0);
                        qm0 qm0Var = (qm0) f2Var.b;
                        Serializable serializableE = f2Var.e(aVar, 0);
                        qm0Var.c = serializableE;
                        if (serializableE != null || z || qm0Var.b || qm0Var.a) {
                            io.sentry.internal.debugmeta.c cVar = new io.sentry.internal.debugmeta.c(12, serializableE, (z || qm0Var.a) ? Collections.singletonList(NetworkBody$NetworkBodyWarning.JSON_TRUNCATED) : qm0Var.b ? Collections.singletonList(NetworkBody$NetworkBodyWarning.INVALID_JSON) : null, false);
                            aVar.close();
                            return cVar;
                        }
                        io.sentry.internal.debugmeta.c cVar2 = new io.sentry.internal.debugmeta.c(12, list, list, false);
                        aVar.close();
                        return cVar2;
                    } finally {
                    }
                } catch (Exception e2) {
                    u0Var.i(SentryLevel.WARNING, "Failed to parse JSON: " + e2.getMessage(), new Object[0]);
                    return new io.sentry.internal.debugmeta.c(12, list, Collections.singletonList(NetworkBody$NetworkBodyWarning.INVALID_JSON), false);
                }
            }
        }
        return new io.sentry.internal.debugmeta.c(12, str, z ? Collections.singletonList(NetworkBody$NetworkBodyWarning.TEXT_TRUNCATED) : null, false);
    }

    public static byte[] T(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int i = inputStream.read(bArr, 0, 1024);
                if (i == -1) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return byteArray;
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static byte[] U(long j, String str) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArr;
        File file = new File(str);
        if (!file.exists()) {
            throw new IOException(o40.y("File '", file.getName(), "' doesn't exists"));
        }
        if (!file.isFile()) {
            throw new IOException(o40.y("Reading path ", str, " failed, because it's not a file."));
        }
        if (!file.canRead()) {
            throw new IOException(o40.y("Reading the item ", str, " failed, because can't read the file."));
        }
        if (file.length() > j) {
            throw new IOException(String.format("Reading file failed, because size located at '%s' with %d bytes is bigger than the maximum allowed size of %d bytes.", str, Long.valueOf(file.length()), Long.valueOf(j)));
        }
        FileInputStream fileInputStream = new FileInputStream(str);
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    bArr = new byte[1024];
                } finally {
                }
            } finally {
            }
            while (true) {
                int i = bufferedInputStream.read(bArr);
                if (i == -1) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    bufferedInputStream.close();
                    fileInputStream.close();
                    return byteArray;
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static String V(File file) throws IOException {
        if (file == null || !file.exists() || !file.isFile() || !file.canRead()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        try {
            String line = bufferedReader.readLine();
            if (line != null) {
                sb.append(line);
            }
            while (true) {
                String line2 = bufferedReader.readLine();
                if (line2 == null) {
                    bufferedReader.close();
                    return sb.toString();
                }
                sb.append("\n");
                sb.append(line2);
            }
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void W(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void X(k4 k4Var, io.sentry.internal.debugmeta.c cVar, u0 u0Var) {
        if (k4Var.a != null) {
            cVar.q("event_id");
            cVar.w(u0Var, k4Var.a);
        }
        cVar.q("contexts");
        cVar.w(u0Var, k4Var.b);
        if (k4Var.c != null) {
            cVar.q("sdk");
            cVar.w(u0Var, k4Var.c);
        }
        if (k4Var.d != null) {
            cVar.q("request");
            cVar.w(u0Var, k4Var.d);
        }
        AbstractMap abstractMap = k4Var.e;
        if (abstractMap != null && !abstractMap.isEmpty()) {
            cVar.q("tags");
            cVar.w(u0Var, k4Var.e);
        }
        if (k4Var.f != null) {
            cVar.q("release");
            cVar.z(k4Var.f);
        }
        if (k4Var.g != null) {
            cVar.q("environment");
            cVar.z(k4Var.g);
        }
        if (k4Var.h != null) {
            cVar.q("platform");
            cVar.z(k4Var.h);
        }
        if (k4Var.i != null) {
            cVar.q("user");
            cVar.w(u0Var, k4Var.i);
        }
        if (k4Var.k != null) {
            cVar.q("server_name");
            cVar.z(k4Var.k);
        }
        if (k4Var.l != null) {
            cVar.q("dist");
            cVar.z(k4Var.l);
        }
        List list = k4Var.m;
        if (list != null && !list.isEmpty()) {
            cVar.q("breadcrumbs");
            cVar.w(u0Var, k4Var.m);
        }
        if (k4Var.n != null) {
            cVar.q("debug_meta");
            cVar.w(u0Var, k4Var.n);
        }
        AbstractMap abstractMap2 = k4Var.o;
        if (abstractMap2 == null || abstractMap2.isEmpty()) {
            return;
        }
        cVar.q("extra");
        cVar.w(u0Var, k4Var.o);
    }

    public static boolean Y(h0 h0Var) {
        return !(io.sentry.hints.d.class.isInstance(h0Var.b("sentry:typeCheckHint")) || io.sentry.hints.b.class.isInstance(h0Var.b("sentry:typeCheckHint"))) || o0.class.isInstance(h0Var.b("sentry:typeCheckHint"));
    }

    public static boolean Z(b6 b6Var, b6 b6Var2, boolean z) {
        boolean z2 = io.sentry.util.h.a;
        if (!z2 && (b6Var2.getVersionDetector() instanceof g3)) {
            b6Var2.setVersionDetector(new t(b6Var2, 1));
        }
        if (!b6Var2.getVersionDetector().a()) {
            return !z || b6Var == null || b6Var2.isForceInit() || b6Var.getInitPriority().ordinal() <= b6Var2.getInitPriority().ordinal();
        }
        b6Var2.getLogger().i(SentryLevel.ERROR, "Not initializing Sentry because mixed SDK versions have been detected.", new Object[0]);
        throw new IllegalStateException(o40.y("Sentry SDK has detected a mix of versions. This is not supported and likely leads to crashes. Please always use the same version of all SDK modules (dependencies). See ", z2 ? "https://docs.sentry.io/platforms/android/troubleshooting/mixed-versions" : "https://docs.sentry.io/platforms/java/troubleshooting/mixed-versions", " for more details."));
    }

    public static void a(String str) {
        e5.d().a(str);
    }

    public static k a0(c1 c1Var, String str, List list, k1 k1Var) {
        b6 b6VarM = c1Var.m();
        if (b6VarM.isTraceSampling() && f(str, b6VarM.getTracePropagationTargets())) {
            b6 b6VarM2 = c1Var.m();
            if (k1Var != null && !k1Var.j()) {
                e6 e6VarE = k1Var.e();
                io.sentry.d dVarL = k1Var.l(list);
                if (b6VarM2.isPropagateTraceparent()) {
                    k6 k6VarX = k1Var.x();
                    kVar = new k(k6VarX.a, k6VarX.b, e6VarE.c, 2);
                }
                return new k(e6VarE, dVarL, kVar, 5);
            }
            f2 f2Var = new f2((char) 0, 10);
            f2Var.b = null;
            c1Var.x(new l(f2Var, b6VarM2));
            k kVar = (k) f2Var.b;
            if (kVar != null) {
                io.sentry.c cVar = (io.sentry.c) kVar.d;
                m6 m6Var = (m6) kVar.c;
                v vVar = (v) kVar.b;
                return new k(new e6(vVar, m6Var, null), io.sentry.d.a(cVar, list), b6VarM2.isPropagateTraceparent() ? new k(vVar, m6Var, kVar, 2) : null, 5);
            }
        }
        return null;
    }

    public static p6 b(p6 p6Var) {
        if (p6Var.c != null) {
            return p6Var;
        }
        return new p6(p6Var.a, p6Var.b, c(null, p6Var.b, p6Var.a), p6Var.d, p6Var.e);
    }

    public static void b0(w4 w4Var, b6 b6Var) {
        ArrayList arrayListD = w4Var.d();
        if (arrayListD != null) {
            Iterator it = arrayListD.iterator();
            while (it.hasNext()) {
                a0 a0Var = ((u) it.next()).e;
                if (a0Var != null) {
                    c0(a0Var, w4Var, b6Var, "Truncated exception stack frames of event %s");
                }
            }
        }
        ArrayList arrayListE = w4Var.e();
        if (arrayListE != null) {
            Iterator it2 = arrayListE.iterator();
            while (it2.hasNext()) {
                a0 a0Var2 = ((c0) it2.next()).i;
                if (a0Var2 != null) {
                    c0(a0Var2, w4Var, b6Var, "Truncated thread stack frames for event %s");
                }
            }
        }
    }

    public static Double c(Double d, Double d2, Boolean bool) {
        if (d != null) {
            return d;
        }
        double dC = i.a().c();
        if (d2 == null || bool == null) {
            return Double.valueOf(dC);
        }
        if (bool.booleanValue()) {
            return Double.valueOf(d2.doubleValue() * dC);
        }
        return Double.valueOf(((1.0d - d2.doubleValue()) * dC) + d2.doubleValue());
    }

    public static void c0(a0 a0Var, w4 w4Var, b6 b6Var, String str) {
        List list = a0Var.a;
        if (list == null || list.size() <= 500) {
            return;
        }
        ArrayList arrayList = new ArrayList(500);
        arrayList.addAll(list.subList(0, 250));
        arrayList.addAll(list.subList(list.size() - 250, list.size()));
        a0Var.a = arrayList;
        b6Var.getLogger().i(SentryLevel.DEBUG, str, w4Var.a);
    }

    public static String d(String str) {
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new BigInteger("10".concat(str), 16).toByteArray());
            byteBufferWrap.get();
            return String.format("%08x-%04x-%04x-%04x-%04x%08x", Integer.valueOf(byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN).getInt()), Short.valueOf(byteBufferWrap.getShort()), Short.valueOf(byteBufferWrap.getShort()), Short.valueOf(byteBufferWrap.order(ByteOrder.BIG_ENDIAN).getShort()), Short.valueOf(byteBufferWrap.getShort()), Integer.valueOf(byteBufferWrap.getInt()));
        } catch (NumberFormatException | BufferUnderflowException unused) {
            return null;
        }
    }

    public static CopyOnWriteArrayList d0(CopyOnWriteArrayList copyOnWriteArrayList) {
        ArrayList arrayList = new ArrayList();
        if (copyOnWriteArrayList != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            if (it.hasNext()) {
                throw bl4.o(it);
            }
        }
        return new CopyOnWriteArrayList(arrayList);
    }

    public static ClassLoader e(ClassLoader classLoader) {
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        return contextClassLoader != null ? contextClassLoader : ClassLoader.getSystemClassLoader();
    }

    public static boolean f(String str, List list) {
        if (list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (str.contains(str2)) {
                return true;
            }
            if (str.matches(str2)) {
                return true;
            }
        }
        return false;
    }

    public static FileInputStream g(File file, FileInputStream fileInputStream) {
        return h4.b().m().isTracingEnabled() ? new io.sentry.instrumentation.file.d(io.sentry.instrumentation.file.d.b(file, fileInputStream)) : fileInputStream;
    }

    public static FileInputStream h(FileInputStream fileInputStream, FileDescriptor fileDescriptor) {
        if (!h4.b().m().isTracingEnabled()) {
            return fileInputStream;
        }
        k1 k1VarO = io.sentry.util.h.a ? h4.b().o() : h4.b().d();
        return new io.sentry.instrumentation.file.d(new io.sentry.instrumentation.file.b(null, k1VarO != null ? k1VarO.u("file.read") : null, fileInputStream, h4.b().m()), fileDescriptor);
    }

    public static FileInputStream i(FileInputStream fileInputStream, String str) {
        if (h4.b().m().isTracingEnabled()) {
            return new io.sentry.instrumentation.file.d(io.sentry.instrumentation.file.d.b(str != null ? new File(str) : null, fileInputStream));
        }
        return fileInputStream;
    }

    public static FileOutputStream j(File file, FileOutputStream fileOutputStream, boolean z) {
        return h4.b().m().isTracingEnabled() ? new io.sentry.instrumentation.file.e(io.sentry.instrumentation.file.e.b(file, fileOutputStream, z)) : fileOutputStream;
    }

    public static FileOutputStream k(FileOutputStream fileOutputStream, File file) {
        return h4.b().m().isTracingEnabled() ? new io.sentry.instrumentation.file.e(io.sentry.instrumentation.file.e.b(file, fileOutputStream, false)) : fileOutputStream;
    }

    public static FileOutputStream l(FileOutputStream fileOutputStream, FileDescriptor fileDescriptor) {
        if (!h4.b().m().isTracingEnabled()) {
            return fileOutputStream;
        }
        k1 k1VarO = io.sentry.util.h.a ? h4.b().o() : h4.b().d();
        return new io.sentry.instrumentation.file.e(new io.sentry.instrumentation.file.b(null, k1VarO != null ? k1VarO.u("file.write") : null, fileOutputStream, h4.b().m()), fileDescriptor);
    }

    public static FileOutputStream m(FileOutputStream fileOutputStream, String str) {
        if (h4.b().m().isTracingEnabled()) {
            return new io.sentry.instrumentation.file.e(io.sentry.instrumentation.file.e.b(str != null ? new File(str) : null, fileOutputStream, true));
        }
        return fileOutputStream;
    }

    public static k n(Object obj, Long l, boolean z, io.sentry.util.network.b bVar, List list, u1 u1Var) {
        LinkedHashMap linkedHashMapE;
        io.sentry.internal.debugmeta.c cVarE = z ? bVar.e(obj) : null;
        switch (u1Var.a) {
            case 26:
                w47 w47Var = (w47) obj;
                js3.p(w47Var, "req");
                linkedHashMapE = io.sentry.okhttp.c.e(w47Var.c);
                break;
            default:
                g77 g77Var = (g77) obj;
                js3.p(g77Var, "resp");
                linkedHashMapE = io.sentry.okhttp.c.e(g77Var.f);
                break;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str != null) {
                hashSet.add(str.toLowerCase(Locale.ROOT));
            }
        }
        for (Map.Entry entry : linkedHashMapE.entrySet()) {
            if (hashSet.contains(((String) entry.getKey()).toLowerCase(Locale.ROOT))) {
                linkedHashMap.put((String) entry.getKey(), (String) entry.getValue());
            }
        }
        return new k(l, cVarE, linkedHashMap, 7);
    }

    public static h0 o(Object obj) {
        h0 h0Var = new h0();
        h0Var.d(obj, "sentry:typeCheckHint");
        return h0Var;
    }

    public static boolean p(File file) {
        if (file == null || !file.exists()) {
            return true;
        }
        if (file.isFile()) {
            return file.delete();
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return true;
        }
        for (File file2 : fileArrListFiles) {
            if (!p(file2)) {
                return false;
            }
        }
        return file.delete();
    }

    public static boolean q(k4 k4Var, String str, h3 h3Var, u0 u0Var) {
        int i;
        int i2;
        int i3;
        i = 8;
        i2 = 2;
        i3 = 0;
        switch (str) {
            case "debug_meta":
                k4Var.n = (f) h3Var.M0(u0Var, new io.sentry.clientreport.a(i));
                return true;
            case "server_name":
                k4Var.k = h3Var.S();
                return true;
            case "contexts":
                k4Var.b.l(io.sentry.clientreport.a.c(h3Var, u0Var));
                return true;
            case "environment":
                k4Var.g = h3Var.S();
                return true;
            case "breadcrumbs":
                k4Var.m = h3Var.Z0(u0Var, new io.sentry.e(i3));
                return true;
            case "sdk":
                k4Var.c = (io.sentry.protocol.t) h3Var.M0(u0Var, new io.sentry.clientreport.a(21));
                return true;
            case "dist":
                k4Var.l = h3Var.S();
                return true;
            case "tags":
                k4Var.e = Q((Map) h3Var.O0());
                return true;
            case "user":
                k4Var.i = (g0) h3Var.M0(u0Var, new b0(i2));
                return true;
            case "extra":
                k4Var.o = Q((Map) h3Var.O0());
                return true;
            case "event_id":
                k4Var.a = (v) h3Var.M0(u0Var, new io.sentry.clientreport.a(23));
                return true;
            case "release":
                k4Var.f = h3Var.S();
                return true;
            case "request":
                k4Var.d = (q) h3Var.M0(u0Var, new io.sentry.clientreport.a(19));
                return true;
            case "platform":
                k4Var.h = h3Var.S();
                return true;
            default:
                return false;
        }
    }

    public static BigDecimal r(Double d) {
        return BigDecimal.valueOf(d.doubleValue()).setScale(6, RoundingMode.DOWN);
    }

    public static io.sentry.c s(io.sentry.c cVar, Boolean bool, Double d, Double d2) {
        if (cVar == null) {
            cVar = new io.sentry.c(r2.a);
        }
        if (cVar.d == null) {
            Double d3 = cVar.c;
            if (d3 != null) {
                d = d3;
            }
            Double dC = c(d2, d, bool);
            if (cVar.f) {
                cVar.d = dC;
            }
        }
        if (cVar.f && cVar.g) {
            cVar.f = false;
        }
        return cVar;
    }

    public static boolean t(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static String u(String str) {
        if (!str.contains("@")) {
            return str;
        }
        if (str.startsWith("@")) {
            return "[Filtered]".concat(str);
        }
        StringBuilder sbC = bl4.C(str.substring(0, str.indexOf(64)).contains(":") ? "[Filtered]:[Filtered]" : "[Filtered]");
        sbC.append(str.substring(str.indexOf(64)));
        return sbC.toString();
    }

    public static io.sentry.internal.debugmeta.c v(byte[] bArr, String str, String str2, u0 u0Var) {
        Object obj = null;
        if (bArr.length == 0) {
            return null;
        }
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            if (lowerCase.contains("image/") || lowerCase.contains("video/") || lowerCase.contains("audio/") || lowerCase.contains("application/octet-stream") || lowerCase.contains("application/pdf") || lowerCase.contains("application/zip") || lowerCase.contains("application/gzip")) {
                return new io.sentry.internal.debugmeta.c(12, "[Binary data, " + bArr.length + " bytes, type: " + str + "]", obj, false);
            }
        }
        try {
            return S(new String(bArr, 0, Math.min(bArr.length, 153600), str2), str, bArr.length > 153600, u0Var);
        } catch (UnsupportedEncodingException e) {
            u0Var.i(SentryLevel.WARNING, "Failed to decode bytes: " + e.getMessage(), new Object[0]);
            return new io.sentry.internal.debugmeta.c(12, dw1.k(bArr.length, " bytes]", new StringBuilder("[Failed to decode bytes, ")), Collections.singletonList(NetworkBody$NetworkBodyWarning.BODY_PARSE_ERROR), false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x018c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static io.sentry.android.replay.viewhierarchy.f w(android.view.View r13, io.sentry.android.replay.viewhierarchy.f r14, int r15, defpackage.y r16) {
        /*
            Method dump skipped, instruction units count: 490
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.config.a.w(android.view.View, io.sentry.android.replay.viewhierarchy.f, int, y):io.sentry.android.replay.viewhierarchy.f");
    }

    public static String x() {
        byte[] bArr = new byte[16];
        i.a().b(bArr);
        byte b2 = (byte) (bArr[6] & 15);
        bArr[6] = b2;
        bArr[6] = (byte) (b2 | 64);
        byte b3 = (byte) (bArr[8] & 63);
        bArr[8] = b3;
        bArr[8] = (byte) (b3 | 128);
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < 8; i++) {
            j2 = (j2 << 8) | ((long) (bArr[i] & 255));
        }
        for (int i2 = 8; i2 < 16; i2++) {
            j = (j << 8) | ((long) (bArr[i2] & 255));
        }
        UUID uuid = new UUID(j2, j);
        char[] cArr = io.sentry.util.m.a;
        long mostSignificantBits = uuid.getMostSignificantBits();
        long leastSignificantBits = uuid.getLeastSignificantBits();
        char[] cArr2 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, cArr[(int) (((-1152921504606846976L) & leastSignificantBits) >>> 60)], cArr[(int) ((1080863910568919040L & leastSignificantBits) >>> 56)], cArr[(int) ((67553994410557440L & leastSignificantBits) >>> 52)], cArr[(int) ((4222124650659840L & leastSignificantBits) >>> 48)], cArr[(int) ((263882790666240L & leastSignificantBits) >>> 44)], cArr[(int) ((16492674416640L & leastSignificantBits) >>> 40)], cArr[(int) ((1030792151040L & leastSignificantBits) >>> 36)], cArr[(int) ((64424509440L & leastSignificantBits) >>> 32)], cArr[(int) ((4026531840L & leastSignificantBits) >>> 28)], cArr[(int) ((251658240 & leastSignificantBits) >>> 24)], cArr[(int) ((15728640 & leastSignificantBits) >>> 20)], cArr[(int) ((983040 & leastSignificantBits) >>> 16)], cArr[(int) ((61440 & leastSignificantBits) >>> 12)], cArr[(int) ((3840 & leastSignificantBits) >>> 8)], cArr[(int) ((240 & leastSignificantBits) >>> 4)], cArr[(int) (15 & leastSignificantBits)]};
        io.sentry.util.m.a(cArr2, mostSignificantBits);
        char[] cArr3 = io.sentry.util.m.a;
        return new String(cArr2);
    }

    public static String y(KeyEvent.Callback callback) {
        if (callback == null) {
            return null;
        }
        String canonicalName = callback.getClass().getCanonicalName();
        return canonicalName != null ? canonicalName : callback.getClass().getSimpleName();
    }

    public static Date z() {
        return Calendar.getInstance(io.sentry.vendor.gson.internal.bind.util.a.a).getTime();
    }

    public abstract int G();

    public abstract boolean M();
}
