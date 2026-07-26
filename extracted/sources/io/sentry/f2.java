package io.sentry;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import defpackage.dc0;
import defpackage.js3;
import defpackage.qm0;
import io.sentry.util.AutoClosableReentrantLock;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Serializable;
import java.net.InetAddress;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: loaded from: classes3.dex */
public final class f2 implements io.sentry.cache.tape.f, io.sentry.featureflags.b {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ f2(char c, int i) {
        this.a = i;
    }

    public static Long f(String str) {
        String strTrim = str.trim();
        try {
            if (strTrim.endsWith("GB")) {
                return Long.valueOf(Long.parseLong(strTrim.substring(0, strTrim.length() - 2)) * 1073741824);
            }
            if (strTrim.endsWith("MB")) {
                return Long.valueOf(Long.parseLong(strTrim.substring(0, strTrim.length() - 2)) * b6.MAX_EVENT_SIZE_BYTES);
            }
            if (strTrim.endsWith("KB")) {
                return Long.valueOf(Long.parseLong(strTrim.substring(0, strTrim.length() - 2)) * 1024);
            }
            if (strTrim.endsWith("B")) {
                return Long.valueOf(Long.parseLong(strTrim.substring(0, strTrim.length() - 1)));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Double g(String str) {
        String strTrim = str.trim();
        if (strTrim.equals("0")) {
            return Double.valueOf(0.0d);
        }
        if (strTrim.endsWith("ms")) {
            return Double.valueOf(Double.parseDouble(strTrim.substring(0, strTrim.length() - 2)));
        }
        if (strTrim.endsWith("ns")) {
            return Double.valueOf(Double.parseDouble(strTrim.substring(0, strTrim.length() - 2)) / 1000000.0d);
        }
        if (strTrim.endsWith("us")) {
            return Double.valueOf(Double.parseDouble(strTrim.substring(0, strTrim.length() - 2)) / 1000.0d);
        }
        if (strTrim.endsWith("s")) {
            return Double.valueOf(Double.parseDouble(strTrim.substring(0, strTrim.length() - 1)) * 1000.0d);
        }
        return null;
    }

    public void a(io.sentry.android.core.n0 n0Var) {
        ((io.sentry.android.core.j0) this.b).getClass();
        int i = Build.VERSION.SDK_INT;
        if (i < 26 || i > 28) {
            return;
        }
        String callingPackage = n0Var.getCallingPackage();
        String packageName = n0Var.getContext().getPackageName();
        if (callingPackage == null || !callingPackage.equals(packageName)) {
            throw new SecurityException("Provider does not allow for granting of Uri permissions");
        }
    }

    @Override // io.sentry.cache.tape.f
    public void b(Object obj, OutputStream outputStream) throws IOException {
        f fVar = (f) obj;
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, io.sentry.cache.f.c));
        try {
            ((io.sentry.cache.f) this.b).a.getSerializer().a(fVar, bufferedWriter);
            bufferedWriter.close();
        } catch (Throwable th) {
            try {
                bufferedWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public io.sentry.protocol.c c() {
        if (((io.sentry.protocol.c) this.b) == null) {
            this.b = new io.sentry.protocol.c();
        }
        return (io.sentry.protocol.c) this.b;
    }

    @Override // io.sentry.featureflags.b
    public void clear() {
        ((AutoClosableReentrantLock) this.b).a().close();
    }

    @Override // io.sentry.featureflags.b
    public io.sentry.featureflags.b clone() {
        return new f2(9, (byte) 0);
    }

    @Override // io.sentry.cache.tape.f
    public Object d(byte[] bArr) {
        io.sentry.cache.f fVar = (io.sentry.cache.f) this.b;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr), io.sentry.cache.f.c));
            try {
                f fVar2 = (f) fVar.a.getSerializer().c(bufferedReader, f.class);
                bufferedReader.close();
                return fVar2;
            } finally {
            }
        } catch (Throwable th) {
            fVar.a.getLogger().e(SentryLevel.ERROR, th, "Error reading entity from scope cache", new Object[0]);
            return null;
        }
    }

    public Serializable e(io.sentry.vendor.gson.stream.a aVar, int i) {
        qm0 qm0Var = (qm0) this.b;
        if (qm0Var.b) {
            return null;
        }
        if (i >= 100) {
            qm0Var.a = true;
            return null;
        }
        try {
            switch (io.sentry.util.network.a.a[aVar.peek().ordinal()]) {
                case 1:
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    try {
                        aVar.P0();
                        while (aVar.hasNext() && !qm0Var.b) {
                            linkedHashMap.put(aVar.m0(), e(aVar, i + 1));
                        }
                        aVar.t0();
                        return linkedHashMap;
                    } catch (Exception unused) {
                        qm0Var.b = true;
                        return linkedHashMap;
                    }
                case 2:
                    ArrayList arrayList = new ArrayList();
                    try {
                        aVar.c1();
                        while (aVar.hasNext() && !qm0Var.b) {
                            arrayList.add(e(aVar, i + 1));
                        }
                        aVar.W0();
                        return arrayList;
                    } catch (Exception unused2) {
                        qm0Var.b = true;
                        return arrayList;
                    }
                case 3:
                    return aVar.t();
                case 4:
                    return Double.valueOf(aVar.nextDouble());
                case 5:
                    return Boolean.valueOf(aVar.y());
                case 6:
                    aVar.I();
                    return null;
                default:
                    qm0Var.b = true;
                    return null;
            }
        } catch (Exception unused3) {
            qm0Var.b = true;
            return null;
        }
        qm0Var.b = true;
        return null;
    }

    public void h(io.sentry.internal.debugmeta.c cVar, u0 u0Var, Object obj) throws IOException {
        io.sentry.vendor.gson.stream.b bVar = (io.sentry.vendor.gson.stream.b) cVar.b;
        if (obj == null) {
            bVar.k();
            return;
        }
        if (obj instanceof Character) {
            cVar.z(Character.toString(((Character) obj).charValue()));
            return;
        }
        if (obj instanceof String) {
            cVar.z((String) obj);
            return;
        }
        if (obj instanceof Boolean) {
            cVar.A(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Number) {
            cVar.y((Number) obj);
            return;
        }
        if (obj instanceof Date) {
            try {
                cVar.z(io.sentry.config.a.H((Date) obj));
                return;
            } catch (Exception e) {
                u0Var.f(SentryLevel.ERROR, "Error when serializing Date", e);
                bVar.k();
                return;
            }
        }
        if (obj instanceof TimeZone) {
            try {
                cVar.z(((TimeZone) obj).getID());
                return;
            } catch (Exception e2) {
                u0Var.f(SentryLevel.ERROR, "Error when serializing TimeZone", e2);
                bVar.k();
                return;
            }
        }
        if (obj instanceof g2) {
            ((g2) obj).serialize(cVar, u0Var);
            return;
        }
        if (obj instanceof Collection) {
            j(cVar, u0Var, (Collection) obj);
            return;
        }
        int i = 0;
        if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            ArrayList arrayList = new ArrayList(zArr.length);
            int length = zArr.length;
            while (i < length) {
                arrayList.add(Boolean.valueOf(zArr[i]));
                i++;
            }
            j(cVar, u0Var, arrayList);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            ArrayList arrayList2 = new ArrayList(bArr.length);
            int length2 = bArr.length;
            while (i < length2) {
                arrayList2.add(Byte.valueOf(bArr[i]));
                i++;
            }
            j(cVar, u0Var, arrayList2);
            return;
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            ArrayList arrayList3 = new ArrayList(sArr.length);
            int length3 = sArr.length;
            while (i < length3) {
                arrayList3.add(Short.valueOf(sArr[i]));
                i++;
            }
            j(cVar, u0Var, arrayList3);
            return;
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            ArrayList arrayList4 = new ArrayList(cArr.length);
            int length4 = cArr.length;
            while (i < length4) {
                arrayList4.add(Character.valueOf(cArr[i]));
                i++;
            }
            j(cVar, u0Var, arrayList4);
            return;
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            ArrayList arrayList5 = new ArrayList(iArr.length);
            int length5 = iArr.length;
            while (i < length5) {
                arrayList5.add(Integer.valueOf(iArr[i]));
                i++;
            }
            j(cVar, u0Var, arrayList5);
            return;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            ArrayList arrayList6 = new ArrayList(jArr.length);
            int length6 = jArr.length;
            while (i < length6) {
                arrayList6.add(Long.valueOf(jArr[i]));
                i++;
            }
            j(cVar, u0Var, arrayList6);
            return;
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            ArrayList arrayList7 = new ArrayList(fArr.length);
            int length7 = fArr.length;
            while (i < length7) {
                arrayList7.add(Float.valueOf(fArr[i]));
                i++;
            }
            j(cVar, u0Var, arrayList7);
            return;
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            ArrayList arrayList8 = new ArrayList(dArr.length);
            int length8 = dArr.length;
            while (i < length8) {
                arrayList8.add(Double.valueOf(dArr[i]));
                i++;
            }
            j(cVar, u0Var, arrayList8);
            return;
        }
        if (obj.getClass().isArray()) {
            j(cVar, u0Var, Arrays.asList((Object[]) obj));
            return;
        }
        if (obj instanceof Map) {
            k(cVar, u0Var, (Map) obj);
            return;
        }
        if (obj instanceof Locale) {
            cVar.z(obj.toString());
            return;
        }
        if (obj instanceof AtomicIntegerArray) {
            AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
            Charset charset = io.sentry.util.c.a;
            int length9 = atomicIntegerArray.length();
            ArrayList arrayList9 = new ArrayList(length9);
            while (i < length9) {
                arrayList9.add(Integer.valueOf(atomicIntegerArray.get(i)));
                i++;
            }
            j(cVar, u0Var, arrayList9);
            return;
        }
        if (obj instanceof AtomicBoolean) {
            cVar.A(((AtomicBoolean) obj).get());
            return;
        }
        if (obj instanceof URI) {
            cVar.z(obj.toString());
            return;
        }
        if (obj instanceof InetAddress) {
            cVar.z(obj.toString());
            return;
        }
        if (obj instanceof UUID) {
            cVar.z(obj.toString());
            return;
        }
        if (obj instanceof Currency) {
            cVar.z(obj.toString());
            return;
        }
        if (obj instanceof Calendar) {
            k(cVar, u0Var, io.sentry.util.c.b((Calendar) obj));
            return;
        }
        if (obj.getClass().isEnum()) {
            cVar.z(obj.toString());
            return;
        }
        try {
            h(cVar, u0Var, ((dc0) this.b).u(u0Var, obj));
        } catch (Exception e3) {
            u0Var.f(SentryLevel.ERROR, "Failed serializing unknown object.", e3);
            cVar.z("[OBJECT]");
        }
    }

    @Override // io.sentry.featureflags.b
    public io.sentry.protocol.i i() {
        ((AutoClosableReentrantLock) this.b).a().close();
        return null;
    }

    public void j(io.sentry.internal.debugmeta.c cVar, u0 u0Var, Collection collection) throws IOException {
        io.sentry.vendor.gson.stream.b bVar = (io.sentry.vendor.gson.stream.b) cVar.b;
        bVar.D();
        bVar.b();
        int i = bVar.c;
        int[] iArr = bVar.b;
        if (i == iArr.length) {
            bVar.b = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = bVar.b;
        int i2 = bVar.c;
        bVar.c = i2 + 1;
        iArr2[i2] = 1;
        bVar.a.write(91);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            h(cVar, u0Var, it.next());
        }
        bVar.d(']', 1, 2);
    }

    public void k(io.sentry.internal.debugmeta.c cVar, u0 u0Var, Map map) throws IOException {
        cVar.d();
        for (Object obj : map.keySet()) {
            if (obj instanceof String) {
                cVar.q((String) obj);
                h(cVar, u0Var, map.get(obj));
            }
        }
        cVar.n();
    }

    public /* synthetic */ f2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public Object m30clone() {
        switch (this.a) {
            case 9:
                return new f2(9, (byte) 0);
            default:
                return super.clone();
        }
    }

    public f2(int i, byte b) {
        this.a = i;
        switch (i) {
            case 5:
                Looper mainLooper = Looper.getMainLooper();
                js3.o(mainLooper, "getMainLooper(...)");
                this.b = new Handler(mainLooper);
                break;
            case 6:
            case 8:
            case 10:
            default:
                this.b = new io.sentry.android.core.j0(r2.a);
                break;
            case 7:
                this.b = new io.sentry.util.e(new u1(25));
                break;
            case 9:
                this.b = new AutoClosableReentrantLock();
                break;
            case 11:
                this.b = new qm0();
                break;
        }
    }

    public f2(int i) {
        this.a = 0;
        this.b = new dc0(i, 15);
    }
}
