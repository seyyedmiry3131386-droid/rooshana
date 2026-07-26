package defpackage;

import j$.util.DesugarCollections;
import j$.util.DesugarTimeZone;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ih9 {
    public static final TimeZone a;
    public static final String b;

    static {
        TimeZone timeZone = DesugarTimeZone.getTimeZone("GMT");
        js3.m(timeZone);
        a = timeZone;
        b = f88.u0(f88.t0(hs5.class.getName(), "okhttp3."), "Client");
    }

    public static final boolean a(se3 se3Var, se3 se3Var2) {
        js3.p(se3Var, "<this>");
        js3.p(se3Var2, "other");
        return js3.i(se3Var.d, se3Var2.d) && se3Var.e == se3Var2.e && js3.i(se3Var.a, se3Var2.a);
    }

    public static final int b(long j, TimeUnit timeUnit) {
        js3.p(timeUnit, "unit");
        if (j < 0) {
            throw new IllegalStateException("timeout".concat(" < 0").toString());
        }
        long millis = timeUnit.toMillis(j);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException("timeout".concat(" too large").toString());
        }
        if (millis != 0 || j <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException("timeout".concat(" too small").toString());
    }

    public static final void c(Socket socket) {
        js3.p(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            if (!js3.i(e2.getMessage(), "bio == null")) {
                throw e2;
            }
        } catch (Exception unused) {
        }
    }

    public static final String d(String str, Object... objArr) {
        js3.p(str, "format");
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    public static final long e(g77 g77Var) {
        String strA = g77Var.f.a("Content-Length");
        if (strA == null) {
            return -1L;
        }
        byte[] bArr = gh9.a;
        try {
            return Long.parseLong(strA);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final Charset f(ph0 ph0Var, Charset charset) {
        js3.p(ph0Var, "<this>");
        js3.p(charset, "default");
        int iA = ph0Var.A(gh9.b);
        if (iA == -1) {
            return charset;
        }
        if (iA == 0) {
            return zp0.a;
        }
        if (iA == 1) {
            return zp0.b;
        }
        if (iA == 2) {
            Charset charset2 = zp0.a;
            Charset charset3 = zp0.f;
            if (charset3 != null) {
                return charset3;
            }
            Charset charsetForName = Charset.forName("UTF-32LE");
            js3.o(charsetForName, "forName(...)");
            zp0.f = charsetForName;
            return charsetForName;
        }
        if (iA == 3) {
            return zp0.c;
        }
        if (iA != 4) {
            throw new AssertionError();
        }
        Charset charset4 = zp0.a;
        Charset charset5 = zp0.g;
        if (charset5 != null) {
            return charset5;
        }
        Charset charsetForName2 = Charset.forName("UTF-32BE");
        js3.o(charsetForName2, "forName(...)");
        zp0.g = charsetForName2;
        return charsetForName2;
    }

    public static final boolean g(t18 t18Var, int i) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        js3.p(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jC = t18Var.i().e() ? t18Var.i().c() - jNanoTime : Long.MAX_VALUE;
        t18Var.i().d(Math.min(jC, timeUnit.toNanos(i)) + jNanoTime);
        try {
            gh0 gh0Var = new gh0();
            while (t18Var.f0(gh0Var, 8192L) != -1) {
                gh0Var.b();
            }
            if (jC == Long.MAX_VALUE) {
                t18Var.i().a();
                return true;
            }
            t18Var.i().d(jNanoTime + jC);
            return true;
        } catch (InterruptedIOException unused) {
            if (jC == Long.MAX_VALUE) {
                t18Var.i().a();
                return false;
            }
            t18Var.i().d(jNanoTime + jC);
            return false;
        } catch (Throwable th) {
            if (jC == Long.MAX_VALUE) {
                t18Var.i().a();
            } else {
                t18Var.i().d(jNanoTime + jC);
            }
            throw th;
        }
    }

    public static final by2 h(List list) {
        ay2 ay2Var = new ay2(0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ox2 ox2Var = (ox2) it.next();
            ay2Var.c(ox2Var.a.s(), ox2Var.b.s());
        }
        return ay2Var.e();
    }

    public static final String i(se3 se3Var, boolean z) {
        js3.p(se3Var, "<this>");
        int i = se3Var.e;
        String strM = se3Var.d;
        if (f88.c0(strM, ":", false)) {
            strM = rm7.m(']', "[", strM);
        }
        if (!z) {
            String str = se3Var.a;
            js3.p(str, "scheme");
            if (i == (str.equals("http") ? 80 : str.equals("https") ? 443 : -1)) {
                return strM;
            }
        }
        return strM + ':' + i;
    }

    public static final List j(List list) {
        js3.p(list, "<this>");
        if (list.isEmpty()) {
            return EmptyList.a;
        }
        if (list.size() == 1) {
            List listSingletonList = Collections.singletonList(list.get(0));
            js3.o(listSingletonList, "singletonList(...)");
            return listSingletonList;
        }
        Object[] array = list.toArray();
        js3.o(array, "toArray(...)");
        List listUnmodifiableList = DesugarCollections.unmodifiableList(ew.r0(array));
        js3.o(listUnmodifiableList, "unmodifiableList(...)");
        return listUnmodifiableList;
    }

    public static final List k(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return EmptyList.a;
        }
        if (objArr.length == 1) {
            List listSingletonList = Collections.singletonList(objArr[0]);
            js3.o(listSingletonList, "singletonList(...)");
            return listSingletonList;
        }
        List listUnmodifiableList = DesugarCollections.unmodifiableList(ew.r0((Object[]) objArr.clone()));
        js3.o(listUnmodifiableList, "unmodifiableList(...)");
        return listUnmodifiableList;
    }
}
