package defpackage;

import kotlin.collections.builders.MapBuilder;
import kotlin.time.Instant;
import kotlin.uuid.Uuid;

/* JADX INFO: loaded from: classes3.dex */
public abstract class dk6 {
    public static final MapBuilder a;

    static {
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put(g27.a(String.class), b88.a);
        mapBuilder.put(g27.a(Character.TYPE), wp0.a);
        mapBuilder.put(g27.a(char[].class), qp0.c);
        mapBuilder.put(g27.a(Double.TYPE), jr1.a);
        mapBuilder.put(g27.a(double[].class), cr1.c);
        mapBuilder.put(g27.a(Float.TYPE), je2.a);
        mapBuilder.put(g27.a(float[].class), fe2.c);
        mapBuilder.put(g27.a(Long.TYPE), se4.a);
        mapBuilder.put(g27.a(long[].class), ge4.c);
        mapBuilder.put(g27.a(tw8.class), xw8.a);
        mapBuilder.put(g27.a(Integer.TYPE), xq3.a);
        mapBuilder.put(g27.a(int[].class), jq3.c);
        mapBuilder.put(g27.a(ow8.class), sw8.a);
        mapBuilder.put(g27.a(Short.TYPE), jv7.a);
        mapBuilder.put(g27.a(short[].class), iv7.c);
        mapBuilder.put(g27.a(yw8.class), cx8.a);
        mapBuilder.put(g27.a(Byte.TYPE), mj0.a);
        mapBuilder.put(g27.a(byte[].class), cj0.c);
        mapBuilder.put(g27.a(gw8.class), kw8.a);
        mapBuilder.put(g27.a(Boolean.TYPE), ee0.a);
        mapBuilder.put(g27.a(boolean[].class), de0.c);
        mapBuilder.put(g27.a(tx8.class), wx8.b);
        mapBuilder.put(g27.a(Void.class), vo5.a);
        try {
            ps0 ps0VarA = g27.a(qx1.class);
            int i = qx1.d;
            mapBuilder.put(ps0VarA, tx1.a);
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        try {
            mapBuilder.put(g27.a(uw8.class), ww8.c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused2) {
        }
        try {
            mapBuilder.put(g27.a(pw8.class), rw8.c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused3) {
        }
        try {
            mapBuilder.put(g27.a(zw8.class), bx8.c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused4) {
        }
        try {
            mapBuilder.put(g27.a(hw8.class), jw8.c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused5) {
        }
        try {
            mapBuilder.put(g27.a(Uuid.class), t29.a);
        } catch (ClassNotFoundException | NoClassDefFoundError unused6) {
        }
        try {
            ps0 ps0VarA2 = g27.a(Instant.class);
            Instant instant = Instant.c;
            mapBuilder.put(ps0VarA2, dq3.a);
        } catch (ClassNotFoundException | NoClassDefFoundError unused7) {
        }
        a = mapBuilder.b();
    }
}
