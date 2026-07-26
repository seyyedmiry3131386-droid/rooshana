package io.sentry;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class m3 {
    public final io.sentry.protocol.v a;
    public final io.sentry.protocol.v b;
    public final ConcurrentHashMap c;
    public final File d;
    public final double e;
    public final String f = "android";

    public m3(io.sentry.protocol.v vVar, io.sentry.protocol.v vVar2, Map map, File file, n4 n4Var) {
        this.a = vVar;
        this.b = vVar2;
        this.c = new ConcurrentHashMap(map);
        this.d = file;
        this.e = n4Var.d() / 1.0E9d;
    }
}
