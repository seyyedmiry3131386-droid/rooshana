package defpackage;

import android.content.res.Resources;
import android.os.Build;
import com.google.android.gms.internal.measurement.n0;
import io.sentry.config.a;
import ir.mservices.market.pika.common.model.NearbyRepository;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Result;
import kotlin.b;
import kotlin.collections.builders.MapBuilder;
import kotlin.collections.builders.SetBuilder;

/* JADX INFO: loaded from: classes.dex */
public abstract class a77 {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;
    public static final /* synthetic */ int c = 0;

    public static SetBuilder a(SetBuilder setBuilder) {
        MapBuilder mapBuilder = setBuilder.a;
        mapBuilder.b();
        return mapBuilder.i > 0 ? setBuilder : SetBuilder.b;
    }

    public static final void b(int i, String str) {
        if (str.charAt(i) == '-') {
            return;
        }
        StringBuilder sbR = rm7.r(i, "Expected '-' (hyphen) at index ", ", but was '");
        sbR.append(str.charAt(i));
        sbR.append('\'');
        throw new IllegalArgumentException(sbR.toString().toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String c(java.io.File r11, int r12) {
        /*
            java.lang.String[] r11 = r11.list()
            kotlin.jvm.internal.Ref$ObjectRef r0 = new kotlin.jvm.internal.Ref$ObjectRef
            r0.<init>()
            r1 = 20
            if (r12 == r1) goto L20
            r1 = 30
            if (r12 != r1) goto L14
            java.lang.String r12 = "patch"
            goto L22
        L14:
            java.lang.RuntimeException r11 = new java.lang.RuntimeException
            java.lang.String r0 = "File type is not valid: "
            java.lang.String r12 = defpackage.rm7.n(r12, r0)
            r11.<init>(r12)
            throw r11
        L20:
            java.lang.String r12 = "main"
        L22:
            if (r11 == 0) goto L97
            int r1 = r11.length
            r2 = 0
            r3 = r2
        L27:
            if (r3 >= r1) goto L97
            r4 = r11[r3]
            defpackage.js3.m(r4)
            java.lang.String r5 = "."
            java.lang.String[] r6 = new java.lang.String[]{r5}
            r7 = 6
            java.util.List r6 = defpackage.f88.y0(r4, r6, r7)
            int r8 = r6.size()
            r9 = 3
            if (r8 < r9) goto L94
            int r8 = r6.size()
            r9 = 1
            int r8 = r8 - r9
            java.lang.Object r8 = r6.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r10 = "obb"
            boolean r8 = defpackage.m88.T(r8, r10, r9)
            if (r8 == 0) goto L94
            java.lang.Object r8 = r6.get(r2)
            boolean r8 = defpackage.js3.i(r8, r12)
            if (r8 == 0) goto L94
            java.lang.Object r8 = r0.a
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            if (r8 == 0) goto L92
            boolean r8 = defpackage.f88.n0(r8)
            if (r8 == 0) goto L6b
            goto L92
        L6b:
            java.lang.Object r8 = r0.a
            java.lang.String r8 = (java.lang.String) r8
            r10 = 0
            if (r8 == 0) goto L8d
            java.lang.String[] r5 = new java.lang.String[]{r5}
            java.util.List r5 = defpackage.f88.y0(r8, r5, r7)
            java.lang.Object r6 = r6.get(r9)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r5.get(r9)
            java.lang.String r7 = (java.lang.String) r7
            int r6 = r6.compareTo(r7)
            if (r6 <= 0) goto L8d
            goto L8e
        L8d:
            r5 = r10
        L8e:
            if (r5 == 0) goto L91
            goto L92
        L91:
            r4 = r10
        L92:
            r0.a = r4
        L94:
            int r3 = r3 + 1
            goto L27
        L97:
            java.lang.Object r11 = r0.a
            java.lang.String r11 = (java.lang.String) r11
            if (r11 != 0) goto L9f
            java.lang.String r11 = ""
        L9f:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a77.c(java.io.File, int):java.lang.String");
    }

    public static final void d(long j, byte[] bArr, int i, int i2, int i3) {
        int i4 = 7 - i2;
        int i5 = 8 - i3;
        if (i5 > i4) {
            return;
        }
        while (true) {
            int i6 = qy2.a[(int) ((j >> (i4 << 3)) & 255)];
            int i7 = i + 1;
            bArr[i] = (byte) (i6 >> 8);
            i += 2;
            bArr[i7] = (byte) i6;
            if (i4 == i5) {
                return;
            } else {
                i4--;
            }
        }
    }

    public static String e(Resources resources, float f) {
        float f2 = f / 1024.0f;
        float f3 = f2 / 1024.0f;
        float f4 = f3 / 1024.0f;
        if (f4 >= 1.0f) {
            String string = resources.getString(rs6.gigabyte, q(f4));
            js3.o(string, "getString(...)");
            return string;
        }
        if (f3 >= 1.0f) {
            String string2 = resources.getString(rs6.megabyte, q(f3));
            js3.o(string2, "getString(...)");
            return string2;
        }
        String string3 = resources.getString(rs6.kilobyte, q(f2));
        js3.o(string3, "getString(...)");
        return string3;
    }

    public static String f(File file, String str) {
        if (f88.n0(str)) {
            return "";
        }
        File file2 = new File(file, str);
        if (!file2.exists()) {
            file2 = null;
        }
        if (file2 == null) {
            lw.g(null, null, null);
            return "";
        }
        return str + ":" + file2.length();
    }

    public static String g(String str) {
        String str2;
        js3.p(str, "packageName");
        File file = new File(h(str));
        if (!file.exists() || !file.isDirectory()) {
            return "";
        }
        String[] strArr = {f(file, c(file, 20)), f(file, c(file, 30))};
        String str3 = strArr[0];
        if (str3 != null && !f88.n0(str3) && (str2 = strArr[1]) != null && !f88.n0(str2)) {
            return t61.j(strArr[0], ",", strArr[1]);
        }
        String str4 = strArr[0];
        if (str4 != null && !f88.n0(str4)) {
            return strArr[0];
        }
        String str5 = strArr[1];
        return (str5 == null || f88.n0(str5)) ? "" : strArr[1];
    }

    public static String h(String str) {
        js3.p(str, "packageName");
        return t61.j(k68.f, str.replace(".m.m.free", ""), File.separator);
    }

    public static String i(String str) throws NoSuchAlgorithmException, IOException {
        js3.p(str, "path");
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        FileInputStream fileInputStreamI = a.i(new FileInputStream(str), str);
        try {
            byte[] bArr = new byte[131072];
            while (true) {
                int i = fileInputStreamI.read(bArr);
                if (i == -1) {
                    fileInputStreamI.close();
                    byte[] bArrDigest = messageDigest.digest();
                    js3.o(bArrDigest, "digest(...)");
                    return vi0.a(bArrDigest, false);
                }
                messageDigest.update(bArr, 0, i);
            }
        } finally {
        }
    }

    public static final long j(int i, byte[] bArr) {
        return (((long) bArr[i + 7]) & 255) | ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i + 1]) & 255) << 48) | ((((long) bArr[i + 2]) & 255) << 40) | ((((long) bArr[i + 3]) & 255) << 32) | ((((long) bArr[i + 4]) & 255) << 24) | ((((long) bArr[i + 5]) & 255) << 16) | ((((long) bArr[i + 6]) & 255) << 8);
    }

    public static String k() {
        return t61.j(k68.f, NearbyRepository.SERVICE_ID, File.separator);
    }

    public static String l(File file) {
        Object objA;
        try {
            objA = file.getFreeSpace() + " / " + file.getTotalSpace();
        } catch (Throwable th) {
            objA = b.a(th);
        }
        if (objA instanceof Result.Failure) {
            objA = null;
        }
        return (String) objA;
    }

    public static Set m(Set set, Set set2) {
        js3.p(set, "<this>");
        js3.p(set2, "elements");
        Set setP0 = set2 instanceof Collection ? set2 : kotlin.collections.a.P0(set2);
        if (setP0.isEmpty()) {
            return kotlin.collections.a.T0(set);
        }
        if (!(setP0 instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(setP0);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (Object obj : set) {
            if (!((Set) setP0).contains(obj)) {
                linkedHashSet2.add(obj);
            }
        }
        return linkedHashSet2;
    }

    public static LinkedHashSet n(Set set, Object obj) {
        js3.p(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(kotlin.collections.b.L(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }

    public static void o(Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 29) {
            te.H(theme);
            return;
        }
        synchronized (dy3.d) {
            if (!dy3.f) {
                try {
                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                    dy3.e = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                }
                dy3.f = true;
            }
            Method method = dy3.e;
            if (method != null) {
                try {
                    method.invoke(theme, null);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                    dy3.e = null;
                }
            }
        }
    }

    public static Set p(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        js3.o(setSingleton, "singleton(...)");
        return setSingleton;
    }

    public static String q(float f) {
        return f % ((float) 1) == 0.0f ? String.valueOf((int) f) : m88.X(String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1)), ".0", "");
    }

    public static final double r(long j) {
        return ((j >>> 11) * ((double) 2048)) + (j & 2047);
    }

    public static final String s(int i, long j) {
        if (j >= 0) {
            js3.q(i);
            String string = Long.toString(j, i);
            js3.o(string, "toString(...)");
            return string;
        }
        long j2 = i;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        js3.q(i);
        String string2 = Long.toString(j3, i);
        js3.o(string2, "toString(...)");
        js3.q(i);
        String string3 = Long.toString(j4, i);
        js3.o(string3, "toString(...)");
        return string2.concat(string3);
    }

    public static xk9 t(Object obj) {
        if (obj == null) {
            return xk9.q0;
        }
        if (obj instanceof String) {
            return new cl9((String) obj);
        }
        if (obj instanceof Double) {
            return new nk9((Double) obj);
        }
        if (obj instanceof Long) {
            return new nk9(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new nk9(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new kk9((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            gk9 gk9Var = new gk9();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                gk9Var.q(gk9Var.o(), t(it.next()));
            }
            return gk9Var;
        }
        tk9 tk9Var = new tk9();
        Map map = (Map) obj;
        for (Object string : map.keySet()) {
            xk9 xk9VarT = t(map.get(string));
            if (string != null) {
                if (!(string instanceof String)) {
                    string = string.toString();
                }
                tk9Var.e((String) string, xk9VarT);
            }
        }
        return tk9Var;
    }

    public static xk9 u(n0 n0Var) {
        if (n0Var == null) {
            return xk9.p0;
        }
        int iX = n0Var.x() - 1;
        if (iX == 1) {
            return n0Var.r() ? new cl9(n0Var.s()) : xk9.w0;
        }
        if (iX == 2) {
            return n0Var.v() ? new nk9(Double.valueOf(n0Var.w())) : new nk9(null);
        }
        if (iX == 3) {
            return n0Var.t() ? new kk9(Boolean.valueOf(n0Var.u())) : new kk9(null);
        }
        if (iX != 4) {
            throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
        }
        List listP = n0Var.p();
        ArrayList arrayList = new ArrayList();
        Iterator it = listP.iterator();
        while (it.hasNext()) {
            arrayList.add(u((n0) it.next()));
        }
        return new zk9(n0Var.q(), arrayList);
    }
}
