package io.sentry;

import defpackage.ur4;
import io.sentry.vendor.gson.stream.JsonToken;
import j$.util.DesugarTimeZone;
import java.io.Reader;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes3.dex */
public final class e2 implements h3 {
    public final io.sentry.vendor.gson.stream.a a;
    public final ArrayDeque b = new ArrayDeque();
    public int c = 0;

    public e2(Reader reader) {
        this.a = new io.sentry.vendor.gson.stream.a(reader);
    }

    @Override // io.sentry.h3
    public final Integer C() {
        if (this.a.peek() != JsonToken.NULL) {
            return Integer.valueOf(nextInt());
        }
        g();
        return null;
    }

    @Override // io.sentry.h3
    public final void H(u0 u0Var, AbstractMap abstractMap, String str) throws Throwable {
        d2 d2Var;
        d2 d2Var2 = null;
        try {
            try {
                d2Var = new d2(this.c, this.a.peek());
                this.b.addLast(d2Var);
            } catch (Throwable th) {
                th = th;
                b(d2Var2);
                throw th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            abstractMap.put(str, O0());
            b(d2Var);
        } catch (Exception e2) {
            e = e2;
            d2Var2 = d2Var;
            u0Var.e(SentryLevel.ERROR, e, "Error deserializing unknown key: %s", str);
            if (d2Var2 != null) {
                try {
                    k(d2Var2);
                } catch (Exception e3) {
                    u0Var.f(SentryLevel.ERROR, "Stream unrecoverable after unknown key deserialization failure.", e3);
                }
            }
            b(d2Var2);
        } catch (Throwable th2) {
            th = th2;
            d2Var2 = d2Var;
            b(d2Var2);
            throw th;
        }
    }

    @Override // io.sentry.h3
    public final Float J0() {
        if (this.a.peek() != JsonToken.NULL) {
            return Float.valueOf(nextFloat());
        }
        g();
        return null;
    }

    @Override // io.sentry.h3
    public final Long L() {
        if (this.a.peek() != JsonToken.NULL) {
            return Long.valueOf(nextLong());
        }
        g();
        return null;
    }

    @Override // io.sentry.h3
    public final Object M0(u0 u0Var, s1 s1Var) {
        if (this.a.peek() != JsonToken.NULL) {
            return s1Var.a(this, u0Var);
        }
        g();
        return null;
    }

    @Override // io.sentry.h3
    public final Object O0() {
        c2 c2Var = new c2();
        boolean zB = false;
        while (!zB) {
            int[] iArr = v1.a;
            io.sentry.vendor.gson.stream.a aVar = this.a;
            int i = iArr[aVar.peek().ordinal()];
            ArrayList arrayList = c2Var.a;
            switch (i) {
                case 1:
                    c1();
                    arrayList.add(new y1());
                    break;
                case 2:
                    W0();
                    zB = c2Var.b();
                    break;
                case 3:
                    P0();
                    arrayList.add(new z1());
                    break;
                case 4:
                    t0();
                    zB = c2Var.b();
                    break;
                case 5:
                    arrayList.add(new a2(aVar.m0()));
                    break;
                case 6:
                    final int i2 = 0;
                    zB = c2Var.c(new w1(this) { // from class: io.sentry.t1
                        public final /* synthetic */ e2 b;

                        {
                            this.b = this;
                        }

                        @Override // io.sentry.w1
                        public final Object e() {
                            switch (i2) {
                                case 0:
                                    return this.b.t();
                                default:
                                    e2 e2Var = this.b;
                                    boolean zY = e2Var.a.y();
                                    e2Var.d();
                                    return Boolean.valueOf(zY);
                            }
                        }
                    });
                    break;
                case 7:
                    zB = c2Var.c(new ur4(c2Var, this, 19));
                    break;
                case 8:
                    final int i3 = 1;
                    zB = c2Var.c(new w1(this) { // from class: io.sentry.t1
                        public final /* synthetic */ e2 b;

                        {
                            this.b = this;
                        }

                        @Override // io.sentry.w1
                        public final Object e() {
                            switch (i3) {
                                case 0:
                                    return this.b.t();
                                default:
                                    e2 e2Var = this.b;
                                    boolean zY = e2Var.a.y();
                                    e2Var.d();
                                    return Boolean.valueOf(zY);
                            }
                        }
                    });
                    break;
                case 9:
                    g();
                    zB = c2Var.c(new u1(0));
                    break;
                case 10:
                    zB = true;
                    break;
            }
        }
        x1 x1VarA = c2Var.a();
        if (x1VarA != null) {
            return x1VarA.getValue();
        }
        return null;
    }

    @Override // io.sentry.h3
    public final void P0() {
        this.a.P0();
        d();
        this.c++;
    }

    @Override // io.sentry.h3
    public final TimeZone Q(u0 u0Var) {
        if (this.a.peek() == JsonToken.NULL) {
            g();
            return null;
        }
        try {
            return DesugarTimeZone.getTimeZone(t());
        } catch (Exception e) {
            u0Var.f(SentryLevel.ERROR, "Error when deserializing TimeZone", e);
            return null;
        }
    }

    @Override // io.sentry.h3
    public final String S() {
        if (this.a.peek() != JsonToken.NULL) {
            return t();
        }
        g();
        return null;
    }

    @Override // io.sentry.h3
    public final void T(boolean z) {
        this.a.b = z;
    }

    @Override // io.sentry.h3
    public final HashMap V(u0 u0Var, s1 s1Var) {
        boolean z;
        io.sentry.vendor.gson.stream.a aVar = this.a;
        if (aVar.peek() == JsonToken.NULL) {
            g();
            return null;
        }
        P0();
        HashMap map = new HashMap();
        if (aVar.hasNext()) {
            while (true) {
                String strM0 = aVar.m0();
                d2 d2Var = new d2(this.c, aVar.peek());
                this.b.addLast(d2Var);
                try {
                    try {
                        map.put(strM0, s1Var.a(this, u0Var));
                    } catch (Exception e) {
                        u0Var.f(SentryLevel.WARNING, "Failed to deserialize object in map.", e);
                        try {
                            k(d2Var);
                            z = true;
                        } catch (Exception e2) {
                            u0Var.f(SentryLevel.ERROR, "Stream unrecoverable, aborting map deserialization.", e2);
                            z = false;
                        }
                        if (!z) {
                            b(d2Var);
                            break;
                        }
                        t0();
                        return map;
                    }
                    b(d2Var);
                    if (aVar.peek() != JsonToken.BEGIN_OBJECT && aVar.peek() != JsonToken.NAME) {
                        break;
                    }
                } catch (Throwable th) {
                    b(d2Var);
                    throw th;
                }
            }
        }
        t0();
        return map;
    }

    @Override // io.sentry.h3
    public final void W0() {
        this.a.W0();
        this.c--;
    }

    @Override // io.sentry.h3
    public final ArrayList Z0(u0 u0Var, s1 s1Var) {
        boolean z;
        io.sentry.vendor.gson.stream.a aVar = this.a;
        if (aVar.peek() == JsonToken.NULL) {
            g();
            return null;
        }
        c1();
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (!aVar.hasNext()) {
                break;
            }
            d2 d2Var = new d2(this.c, aVar.peek());
            this.b.addLast(d2Var);
            try {
                try {
                    arrayList.add(s1Var.a(this, u0Var));
                } catch (Exception e) {
                    u0Var.f(SentryLevel.WARNING, "Failed to deserialize object in list.", e);
                    try {
                        k(d2Var);
                        z = true;
                    } catch (Exception e2) {
                        u0Var.f(SentryLevel.ERROR, "Stream unrecoverable, aborting list deserialization.", e2);
                        z = false;
                    }
                    if (!z) {
                        b(d2Var);
                        W0();
                        return arrayList;
                    }
                }
                b(d2Var);
            } catch (Throwable th) {
                b(d2Var);
                throw th;
            }
        }
        W0();
        return arrayList;
    }

    public final void b(d2 d2Var) {
        if (d2Var == null) {
            return;
        }
        ArrayDeque arrayDeque = this.b;
        if (arrayDeque.isEmpty() || arrayDeque.peekLast() != d2Var) {
            arrayDeque.remove(d2Var);
        } else {
            arrayDeque.removeLast();
        }
    }

    @Override // io.sentry.h3
    public final void c1() {
        this.a.c1();
        d();
        this.c++;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    public final void d() {
        d2 d2Var = (d2) this.b.peekLast();
        if (d2Var != null) {
            d2Var.c = true;
        }
    }

    public final void g() {
        this.a.I();
        d();
    }

    @Override // io.sentry.h3
    public final Double h0() {
        if (this.a.peek() != JsonToken.NULL) {
            return Double.valueOf(nextDouble());
        }
        g();
        return null;
    }

    @Override // io.sentry.h3
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    public final void k(d2 d2Var) {
        io.sentry.vendor.gson.stream.a aVar;
        while (true) {
            int i = this.c;
            int i2 = d2Var.a;
            aVar = this.a;
            if (i <= i2) {
                break;
            }
            JsonToken jsonTokenPeek = aVar.peek();
            if (jsonTokenPeek == JsonToken.END_OBJECT) {
                t0();
            } else if (jsonTokenPeek == JsonToken.END_ARRAY) {
                W0();
            } else {
                z();
            }
        }
        if (d2Var.c || aVar.peek() != d2Var.b) {
            return;
        }
        z();
    }

    @Override // io.sentry.h3
    public final String m0() {
        return this.a.m0();
    }

    @Override // io.sentry.h3
    public final double nextDouble() {
        double dNextDouble = this.a.nextDouble();
        d();
        return dNextDouble;
    }

    @Override // io.sentry.h3
    public final float nextFloat() {
        double dNextDouble = this.a.nextDouble();
        d();
        return (float) dNextDouble;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d7  */
    @Override // io.sentry.h3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int nextInt() {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.e2.nextInt():int");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b8  */
    @Override // io.sentry.h3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long nextLong() {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.e2.nextLong():long");
    }

    @Override // io.sentry.h3
    public final JsonToken peek() {
        return this.a.peek();
    }

    @Override // io.sentry.h3
    public final String t() {
        String strT = this.a.t();
        d();
        return strT;
    }

    @Override // io.sentry.h3
    public final void t0() {
        this.a.t0();
        this.c--;
    }

    @Override // io.sentry.h3
    public final Date v0(u0 u0Var) {
        if (this.a.peek() == JsonToken.NULL) {
            g();
            return null;
        }
        String strT = t();
        if (strT == null) {
            return null;
        }
        try {
            try {
                return io.sentry.config.a.B(strT);
            } catch (Exception e) {
                u0Var.f(SentryLevel.ERROR, "Error when deserializing millis timestamp format.", e);
                return null;
            }
        } catch (Exception unused) {
            return io.sentry.config.a.C(strT);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00a3, code lost:
    
        r2.b();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:61:0x009d. Please report as an issue. */
    @Override // io.sentry.h3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z() {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.e2.z():void");
    }

    @Override // io.sentry.h3
    public final Boolean z0() {
        io.sentry.vendor.gson.stream.a aVar = this.a;
        if (aVar.peek() == JsonToken.NULL) {
            g();
            return null;
        }
        boolean zY = aVar.y();
        d();
        return Boolean.valueOf(zY);
    }
}
