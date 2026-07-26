package io.sentry.util;

import io.sentry.SentryLevel;
import io.sentry.h3;
import io.sentry.s1;
import io.sentry.u0;
import io.sentry.vendor.gson.stream.JsonToken;
import j$.util.DesugarTimeZone;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements h3 {
    public final ArrayDeque a;

    public f(Map map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.a = arrayDeque;
        arrayDeque.addLast(new AbstractMap.SimpleEntry(null, map));
    }

    @Override // io.sentry.h3
    public final Integer C() throws IOException {
        Object objB = b();
        if (objB instanceof Number) {
            return Integer.valueOf(((Number) objB).intValue());
        }
        return null;
    }

    @Override // io.sentry.h3
    public final void H(u0 u0Var, AbstractMap abstractMap, String str) {
        int size = this.a.size();
        try {
            abstractMap.put(str, b());
        } catch (Exception e) {
            u0Var.e(SentryLevel.ERROR, e, "Error deserializing unknown key: %s", str);
            d(size);
        }
    }

    @Override // io.sentry.h3
    public final Float J0() throws IOException {
        Object objB = b();
        if (objB instanceof Number) {
            return Float.valueOf(((Number) objB).floatValue());
        }
        return null;
    }

    @Override // io.sentry.h3
    public final Long L() throws IOException {
        Object objB = b();
        if (objB instanceof Number) {
            return Long.valueOf(((Number) objB).longValue());
        }
        return null;
    }

    @Override // io.sentry.h3
    public final Object M0(u0 u0Var, s1 s1Var) {
        ArrayDeque arrayDeque = this.a;
        Map.Entry entry = (Map.Entry) arrayDeque.peekLast();
        if (entry == null) {
            return null;
        }
        Object value = entry.getValue();
        if (u0Var != null) {
            return s1Var.a(this, u0Var);
        }
        arrayDeque.removeLast();
        return value;
    }

    @Override // io.sentry.h3
    public final Object O0() {
        return b();
    }

    @Override // io.sentry.h3
    public final void P0() throws IOException {
        ArrayDeque arrayDeque = this.a;
        Map.Entry entry = (Map.Entry) arrayDeque.peekLast();
        if (entry == null) {
            throw new IOException("No more entries");
        }
        Object value = entry.getValue();
        if (!(value instanceof Map)) {
            throw new IOException("Current token is not an object");
        }
        arrayDeque.removeLast();
        arrayDeque.addLast(new AbstractMap.SimpleEntry(null, JsonToken.END_OBJECT));
        Iterator it = ((Map) value).entrySet().iterator();
        while (it.hasNext()) {
            arrayDeque.addLast((Map.Entry) it.next());
        }
    }

    @Override // io.sentry.h3
    public final TimeZone Q(u0 u0Var) {
        String str = (String) b();
        if (str != null) {
            return DesugarTimeZone.getTimeZone(str);
        }
        return null;
    }

    @Override // io.sentry.h3
    public final String S() {
        return (String) b();
    }

    @Override // io.sentry.h3
    public final void T(boolean z) {
    }

    @Override // io.sentry.h3
    public final HashMap V(u0 u0Var, s1 s1Var) throws IOException {
        if (peek() == JsonToken.NULL) {
            if (b() == null) {
                return null;
            }
            throw new IOException("Expected null but was " + peek());
        }
        try {
            P0();
            HashMap map = new HashMap();
            if (peek() == JsonToken.NAME) {
                while (true) {
                    String strM0 = m0();
                    int size = this.a.size();
                    try {
                        map.put(strM0, s1Var.a(this, u0Var));
                    } catch (Exception e) {
                        u0Var.f(SentryLevel.WARNING, "Failed to deserialize object in map.", e);
                        d(size);
                    }
                    if (peek() != JsonToken.BEGIN_OBJECT && peek() != JsonToken.NAME) {
                        break;
                    }
                }
            }
            t0();
            return map;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    @Override // io.sentry.h3
    public final void W0() {
        ArrayDeque arrayDeque = this.a;
        if (arrayDeque.size() > 1) {
            arrayDeque.removeLast();
        }
    }

    @Override // io.sentry.h3
    public final ArrayList Z0(u0 u0Var, s1 s1Var) throws IOException {
        if (peek() == JsonToken.NULL) {
            if (b() == null) {
                return null;
            }
            throw new IOException("Expected null but was " + peek());
        }
        try {
            c1();
            ArrayList arrayList = new ArrayList();
            while (peek() != JsonToken.END_ARRAY) {
                int size = this.a.size();
                try {
                    arrayList.add(s1Var.a(this, u0Var));
                } catch (Exception e) {
                    u0Var.f(SentryLevel.WARNING, "Failed to deserialize object in list.", e);
                    d(size);
                }
            }
            W0();
            return arrayList;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public final Object b() throws IOException {
        try {
            ArrayDeque arrayDeque = this.a;
            Map.Entry entry = (Map.Entry) arrayDeque.peekLast();
            if (entry == null) {
                return null;
            }
            Object value = entry.getValue();
            arrayDeque.removeLast();
            return value;
        } catch (Exception e) {
            throw new IOException(e);
        }
    }

    @Override // io.sentry.h3
    public final void c1() throws IOException {
        ArrayDeque arrayDeque = this.a;
        Map.Entry entry = (Map.Entry) arrayDeque.peekLast();
        if (entry == null) {
            throw new IOException("No more entries");
        }
        Object value = entry.getValue();
        if (!(value instanceof List)) {
            throw new IOException("Current token is not an object");
        }
        arrayDeque.removeLast();
        arrayDeque.addLast(new AbstractMap.SimpleEntry(null, JsonToken.END_ARRAY));
        List list = (List) value;
        for (int size = list.size() - 1; size >= 0; size--) {
            arrayDeque.addLast(new AbstractMap.SimpleEntry(null, list.get(size)));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.clear();
    }

    public final void d(int i) {
        while (true) {
            ArrayDeque arrayDeque = this.a;
            if (arrayDeque.isEmpty() || arrayDeque.size() < i) {
                return;
            } else {
                arrayDeque.removeLast();
            }
        }
    }

    @Override // io.sentry.h3
    public final Double h0() throws IOException {
        Object objB = b();
        if (objB instanceof Number) {
            return Double.valueOf(((Number) objB).doubleValue());
        }
        return null;
    }

    @Override // io.sentry.h3
    public final boolean hasNext() {
        return !this.a.isEmpty();
    }

    @Override // io.sentry.h3
    public final String m0() throws IOException {
        Map.Entry entry = (Map.Entry) this.a.peekLast();
        if (entry != null && entry.getKey() != null) {
            return (String) entry.getKey();
        }
        throw new IOException("Expected a name but was " + peek());
    }

    @Override // io.sentry.h3
    public final double nextDouble() throws IOException {
        Object objB = b();
        if (objB instanceof Number) {
            return ((Number) objB).doubleValue();
        }
        throw new IOException("Expected double");
    }

    @Override // io.sentry.h3
    public final float nextFloat() throws IOException {
        Object objB = b();
        if (objB instanceof Number) {
            return ((Number) objB).floatValue();
        }
        throw new IOException("Expected float");
    }

    @Override // io.sentry.h3
    public final int nextInt() throws IOException {
        Object objB = b();
        if (objB instanceof Number) {
            return ((Number) objB).intValue();
        }
        throw new IOException("Expected int");
    }

    @Override // io.sentry.h3
    public final long nextLong() throws IOException {
        Object objB = b();
        if (objB instanceof Number) {
            return ((Number) objB).longValue();
        }
        throw new IOException("Expected long");
    }

    @Override // io.sentry.h3
    public final JsonToken peek() {
        ArrayDeque arrayDeque = this.a;
        if (arrayDeque.isEmpty()) {
            return JsonToken.END_DOCUMENT;
        }
        Map.Entry entry = (Map.Entry) arrayDeque.peekLast();
        if (entry == null) {
            return JsonToken.END_DOCUMENT;
        }
        if (entry.getKey() != null) {
            return JsonToken.NAME;
        }
        Object value = entry.getValue();
        return value instanceof Map ? JsonToken.BEGIN_OBJECT : value instanceof List ? JsonToken.BEGIN_ARRAY : value instanceof String ? JsonToken.STRING : value instanceof Number ? JsonToken.NUMBER : value instanceof Boolean ? JsonToken.BOOLEAN : value instanceof JsonToken ? (JsonToken) value : JsonToken.END_DOCUMENT;
    }

    @Override // io.sentry.h3
    public final String t() throws IOException {
        String str = (String) b();
        if (str != null) {
            return str;
        }
        throw new IOException("Expected string");
    }

    @Override // io.sentry.h3
    public final void t0() {
        ArrayDeque arrayDeque = this.a;
        if (arrayDeque.size() > 1) {
            arrayDeque.removeLast();
        }
    }

    @Override // io.sentry.h3
    public final Date v0(u0 u0Var) {
        String str = (String) b();
        if (str == null) {
            return null;
        }
        try {
            try {
                return io.sentry.config.a.B(str);
            } catch (Exception unused) {
                return io.sentry.config.a.C(str);
            }
        } catch (Exception e) {
            u0Var.f(SentryLevel.ERROR, "Error when deserializing millis timestamp format.", e);
            return null;
        }
    }

    @Override // io.sentry.h3
    public final void z() {
        ArrayDeque arrayDeque = this.a;
        if (arrayDeque.isEmpty()) {
            return;
        }
        arrayDeque.removeLast();
    }

    @Override // io.sentry.h3
    public final Boolean z0() {
        return (Boolean) b();
    }
}
