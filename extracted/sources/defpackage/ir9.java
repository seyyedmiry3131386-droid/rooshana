package defpackage;

import android.content.Context;
import android.os.Binder;
import androidx.compose.foundation.text.selection.CrossStatus;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.t0;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ir9 {
    public static ir9 e;
    public final /* synthetic */ int a;
    public boolean b;
    public Object c;
    public Object d;

    public ir9(int i) {
        this.a = i;
        switch (i) {
            case 1:
                break;
            case 3:
                this.c = Collections.newSetFromMap(new WeakHashMap());
                this.d = new HashSet();
                break;
            case 6:
                this.c = new Object();
                break;
            default:
                this.b = false;
                this.c = null;
                this.d = null;
                break;
        }
    }

    public static void f(BufferedInputStream bufferedInputStream, long j) throws IOException {
        while (j > 0) {
            long jSkip = bufferedInputStream.skip(j);
            if (jSkip != 0) {
                j -= jSkip;
            } else {
                if (bufferedInputStream.read() == -1) {
                    throw new EOFException("Unexpected end of stream while skipping bytes");
                }
                j--;
            }
        }
    }

    public static ir9 g(Context context) {
        ir9 ir9Var;
        synchronized (ir9.class) {
            try {
                if (e == null) {
                    e = bt2.s(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new ir9(context) : new ir9(0);
                }
                ir9 ir9Var2 = e;
                if (ir9Var2 != null && ((hr9) ir9Var2.d) != null && !ir9Var2.b) {
                    try {
                        context.getContentResolver().registerContentObserver(ar9.a, true, (hr9) e.d);
                        ir9 ir9Var3 = e;
                        ir9Var3.getClass();
                        ir9Var3.b = true;
                    } catch (SecurityException e2) {
                        t0.e("GservicesLoader", "Unable to register Gservices content observer", e2);
                    }
                }
                ir9Var = e;
                ir9Var.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
        return ir9Var;
    }

    public static synchronized void k() {
        Context context;
        try {
            ir9 ir9Var = e;
            if (ir9Var != null && (context = (Context) ir9Var.c) != null && ((hr9) ir9Var.d) != null && ir9Var.b) {
                context.getContentResolver().unregisterContentObserver((hr9) e.d);
            }
            e = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public boolean a(long j) {
        Object obj;
        List list = (List) ((nc2) this.d).c;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (ct2.h(((ch6) obj).a, j)) {
                break;
            }
            i++;
        }
        ch6 ch6Var = (ch6) obj;
        if (ch6Var != null) {
            return ch6Var.h;
        }
        return false;
    }

    public boolean b(v47 v47Var) {
        boolean z = true;
        if (v47Var == null) {
            return true;
        }
        boolean zRemove = ((Set) this.c).remove(v47Var);
        if (!((HashSet) this.d).remove(v47Var) && !zRemove) {
            z = false;
        }
        if (z) {
            v47Var.clear();
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0058 A[Catch: all -> 0x0045, TryCatch #1 {all -> 0x0045, blocks: (B:5:0x0011, B:6:0x001d, B:8:0x0025, B:21:0x0058, B:13:0x0038, B:15:0x0040, B:18:0x0047, B:20:0x004f, B:24:0x005f, B:27:0x0069), top: B:50:0x0011, outer: #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public io.sentry.android.core.v0 c(java.io.BufferedInputStream r10, int r11, java.io.File r12) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.c
            io.sentry.android.core.SentryAndroidOptions r0 = (io.sentry.android.core.SentryAndroidOptions) r0
            r1 = 0
            io.sentry.android.core.u0 r2 = new io.sentry.android.core.u0     // Catch: java.lang.Throwable -> L7a
            r2.<init>(r10, r11)     // Catch: java.lang.Throwable -> L7a
            java.io.InputStreamReader r10 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L7c
            java.nio.charset.Charset r11 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L7c
            r10.<init>(r2, r11)     // Catch: java.lang.Throwable -> L7c
            io.sentry.e2 r11 = new io.sentry.e2     // Catch: java.lang.Throwable -> L45
            r11.<init>(r10)     // Catch: java.lang.Throwable -> L45
            io.sentry.vendor.gson.stream.a r3 = r11.a     // Catch: java.lang.Throwable -> L45
            r11.P0()     // Catch: java.lang.Throwable -> L45
            r4 = r1
            r5 = r4
        L1d:
            io.sentry.vendor.gson.stream.JsonToken r6 = r3.peek()     // Catch: java.lang.Throwable -> L45
            io.sentry.vendor.gson.stream.JsonToken r7 = io.sentry.vendor.gson.stream.JsonToken.NAME     // Catch: java.lang.Throwable -> L45
            if (r6 != r7) goto L5f
            java.lang.String r6 = r3.m0()     // Catch: java.lang.Throwable -> L45
            int r7 = r6.hashCode()     // Catch: java.lang.Throwable -> L45
            r8 = 55126294(0x3492916, float:5.9115755E-37)
            if (r7 == r8) goto L47
            r8 = 1874684019(0x6fbd6873, float:1.1723788E29)
            if (r7 == r8) goto L38
            goto L58
        L38:
            java.lang.String r7 = "platform"
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L45
            if (r6 == 0) goto L58
            java.lang.String r4 = r11.S()     // Catch: java.lang.Throwable -> L45
            goto L5b
        L45:
            r11 = move-exception
            goto L7e
        L47:
            java.lang.String r7 = "timestamp"
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L45
            if (r6 == 0) goto L58
            io.sentry.u0 r5 = r0.getLogger()     // Catch: java.lang.Throwable -> L45
            java.util.Date r5 = r11.v0(r5)     // Catch: java.lang.Throwable -> L45
            goto L5b
        L58:
            r11.z()     // Catch: java.lang.Throwable -> L45
        L5b:
            if (r4 == 0) goto L1d
            if (r5 == 0) goto L1d
        L5f:
            java.lang.String r11 = "native"
            boolean r11 = r11.equals(r4)     // Catch: java.lang.Throwable -> L45
            if (r11 == 0) goto L73
            if (r5 == 0) goto L73
            io.sentry.android.core.v0 r11 = new io.sentry.android.core.v0     // Catch: java.lang.Throwable -> L45
            long r3 = r5.getTime()     // Catch: java.lang.Throwable -> L45
            r11.<init>(r12, r3)     // Catch: java.lang.Throwable -> L45
            r1 = r11
        L73:
            r10.close()     // Catch: java.lang.Throwable -> L7c
            r2.close()     // Catch: java.lang.Throwable -> L7a
            return r1
        L7a:
            r10 = move-exception
            goto L90
        L7c:
            r10 = move-exception
            goto L87
        L7e:
            r10.close()     // Catch: java.lang.Throwable -> L82
            goto L86
        L82:
            r10 = move-exception
            r11.addSuppressed(r10)     // Catch: java.lang.Throwable -> L7c
        L86:
            throw r11     // Catch: java.lang.Throwable -> L7c
        L87:
            r2.close()     // Catch: java.lang.Throwable -> L8b
            goto L8f
        L8b:
            r11 = move-exception
            r10.addSuppressed(r11)     // Catch: java.lang.Throwable -> L7a
        L8f:
            throw r10     // Catch: java.lang.Throwable -> L7a
        L90:
            io.sentry.u0 r11 = r0.getLogger()
            io.sentry.SentryLevel r0 = io.sentry.SentryLevel.DEBUG
            java.lang.String r12 = r12.getName()
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r12
            java.lang.String r12 = "Error parsing event JSON from: %s"
            r11.e(r0, r10, r12, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ir9.c(java.io.BufferedInputStream, int, java.io.File):io.sentry.android.core.v0");
    }

    public CrossStatus d() {
        vl1 vl1Var = (vl1) this.d;
        int i = vl1Var.b;
        int i2 = vl1Var.c;
        return i < i2 ? CrossStatus.b : i > i2 ? CrossStatus.a : CrossStatus.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054 A[Catch: all -> 0x0045, TryCatch #1 {all -> 0x0045, blocks: (B:4:0x0011, B:5:0x001d, B:7:0x0025, B:20:0x0054, B:12:0x0038, B:14:0x0040, B:17:0x0047, B:19:0x004f, B:24:0x005d), top: B:40:0x0011, outer: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.i26 e(java.lang.String r9) {
        /*
            r8 = this;
            r0 = 0
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L66
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L66
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L66
            byte[] r9 = r9.getBytes(r3)     // Catch: java.lang.Throwable -> L66
            r2.<init>(r9)     // Catch: java.lang.Throwable -> L66
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L66
            io.sentry.e2 r9 = new io.sentry.e2     // Catch: java.lang.Throwable -> L45
            r9.<init>(r1)     // Catch: java.lang.Throwable -> L45
            io.sentry.vendor.gson.stream.a r2 = r9.a     // Catch: java.lang.Throwable -> L45
            r9.P0()     // Catch: java.lang.Throwable -> L45
            r3 = -1
            r4 = r0
        L1d:
            io.sentry.vendor.gson.stream.JsonToken r5 = r2.peek()     // Catch: java.lang.Throwable -> L45
            io.sentry.vendor.gson.stream.JsonToken r6 = io.sentry.vendor.gson.stream.JsonToken.NAME     // Catch: java.lang.Throwable -> L45
            if (r5 != r6) goto L5b
            java.lang.String r5 = r2.m0()     // Catch: java.lang.Throwable -> L45
            int r6 = r5.hashCode()     // Catch: java.lang.Throwable -> L45
            r7 = -1106363674(0xffffffffbe0e3ae6, float:-0.13889655)
            if (r6 == r7) goto L47
            r7 = 3575610(0x368f3a, float:5.010497E-39)
            if (r6 == r7) goto L38
            goto L54
        L38:
            java.lang.String r6 = "type"
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> L45
            if (r5 == 0) goto L54
            java.lang.String r4 = r9.S()     // Catch: java.lang.Throwable -> L45
            goto L57
        L45:
            r9 = move-exception
            goto L6c
        L47:
            java.lang.String r6 = "length"
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> L45
            if (r5 == 0) goto L54
            int r3 = r9.nextInt()     // Catch: java.lang.Throwable -> L45
            goto L57
        L54:
            r9.z()     // Catch: java.lang.Throwable -> L45
        L57:
            if (r4 == 0) goto L1d
            if (r3 < 0) goto L1d
        L5b:
            if (r3 < 0) goto L68
            i26 r9 = new i26     // Catch: java.lang.Throwable -> L45
            r9.<init>(r4, r3)     // Catch: java.lang.Throwable -> L45
            r1.close()     // Catch: java.lang.Throwable -> L66
            return r9
        L66:
            r9 = move-exception
            goto L75
        L68:
            r1.close()     // Catch: java.lang.Throwable -> L66
            return r0
        L6c:
            r1.close()     // Catch: java.lang.Throwable -> L70
            goto L74
        L70:
            r1 = move-exception
            r9.addSuppressed(r1)     // Catch: java.lang.Throwable -> L66
        L74:
            throw r9     // Catch: java.lang.Throwable -> L66
        L75:
            java.lang.Object r1 = r8.c
            io.sentry.android.core.SentryAndroidOptions r1 = (io.sentry.android.core.SentryAndroidOptions) r1
            io.sentry.u0 r1 = r1.getLogger()
            io.sentry.SentryLevel r2 = io.sentry.SentryLevel.DEBUG
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "Error parsing item header"
            r1.e(r2, r9, r4, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ir9.e(java.lang.String):i26");
    }

    public void h(iv9 iv9Var) {
        synchronized (this.c) {
            try {
                if (((ArrayDeque) this.d) == null) {
                    this.d = new ArrayDeque();
                }
                ((ArrayDeque) this.d).add(iv9Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String i(String str) {
        Object objB;
        Context context = (Context) this.c;
        if (context != null && (!cr9.a() || cr9.b(context))) {
            try {
                try {
                    rn6 rn6Var = new rn6(this, str, 25);
                    try {
                        objB = rn6Var.B();
                    } catch (SecurityException unused) {
                        long jClearCallingIdentity = Binder.clearCallingIdentity();
                        try {
                            objB = rn6Var.B();
                        } finally {
                            Binder.restoreCallingIdentity(jClearCallingIdentity);
                        }
                    }
                    return (String) objB;
                } catch (SecurityException e2) {
                    e = e2;
                    t0.e("GservicesLoader", "Unable to read GServices for: ".concat(str), e);
                    return null;
                }
            } catch (IllegalStateException e3) {
                e = e3;
                t0.e("GservicesLoader", "Unable to read GServices for: ".concat(str), e);
                return null;
            } catch (NullPointerException e4) {
                e = e4;
                t0.e("GservicesLoader", "Unable to read GServices for: ".concat(str), e);
                return null;
            }
        }
        return null;
    }

    public void j(bf8 bf8Var) {
        iv9 iv9Var;
        synchronized (this.c) {
            if (((ArrayDeque) this.d) != null && !this.b) {
                this.b = true;
                while (true) {
                    synchronized (this.c) {
                        try {
                            iv9Var = (iv9) ((ArrayDeque) this.d).poll();
                            if (iv9Var == null) {
                                this.b = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    iv9Var.a(bf8Var);
                }
            }
        }
    }

    public String toString() {
        switch (this.a) {
            case 3:
                StringBuilder sb = new StringBuilder();
                sb.append(super.toString());
                sb.append("{numRequests=");
                sb.append(((Set) this.c).size());
                sb.append(", isPaused=");
                return t61.l(sb, this.b, "}");
            case 4:
                return "SingleSelectionLayout(isStartHandle=" + this.b + ", crossed=" + d() + ", info=\n\t" + ((vl1) this.d) + ')';
            default:
                return super.toString();
        }
    }

    public ir9(Context context) {
        this.a = 0;
        this.b = false;
        this.c = context;
        this.d = new hr9(null);
    }

    public ir9(ue4 ue4Var, nc2 nc2Var) {
        this.a = 2;
        this.c = ue4Var;
        this.d = nc2Var;
    }

    public ir9(SentryAndroidOptions sentryAndroidOptions) {
        this.a = 5;
        this.d = new ArrayList();
        this.b = false;
        this.c = sentryAndroidOptions;
    }

    public ir9(boolean z, xm7 xm7Var, vl1 vl1Var) {
        this.a = 4;
        this.b = z;
        this.c = xm7Var;
        this.d = vl1Var;
    }
}
