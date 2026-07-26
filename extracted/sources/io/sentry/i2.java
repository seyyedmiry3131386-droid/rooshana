package io.sentry;

import java.io.Closeable;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class i2 implements b0, Closeable {
    public final b6 a;
    public final x4 b;
    public final x4 c;
    public volatile k0 d = null;

    public i2(b6 b6Var) {
        this.a = b6Var;
        t tVar = new t(b6Var, 2);
        this.c = new x4(tVar);
        this.b = new x4(tVar);
    }

    @Override // io.sentry.b0
    public final c6 b(c6 c6Var, h0 h0Var) {
        if (c6Var.h == null) {
            c6Var.h = "java";
        }
        if (y(c6Var, h0Var)) {
            u(c6Var);
            io.sentry.protocol.t tVar = this.a.getSessionReplay().l;
            if (tVar != null) {
                c6Var.c = tVar;
            }
        }
        return c6Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.d != null) {
            this.d.f.shutdown();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // io.sentry.b0
    public final w4 d(w4 w4Var, h0 h0Var) {
        ArrayList arrayList;
        if (w4Var.h == null) {
            w4Var.h = "java";
        }
        Throwable th = w4Var.j;
        if (th != null) {
            AtomicInteger atomicInteger = new AtomicInteger(-1);
            HashSet hashSet = new HashSet();
            ArrayDeque arrayDeque = new ArrayDeque();
            this.c.a(th, atomicInteger, hashSet, arrayDeque, null);
            w4Var.t = new c2(new ArrayList(arrayDeque));
        }
        io.sentry.protocol.f fVar = w4Var.n;
        b6 b6Var = this.a;
        io.sentry.protocol.f fVarA = io.sentry.protocol.f.a(fVar, b6Var);
        if (fVarA != null) {
            w4Var.n = fVarA;
        }
        Map mapA = b6Var.getModulesLoader().a();
        if (mapA != null) {
            AbstractMap abstractMap = w4Var.y;
            if (abstractMap == null) {
                w4Var.y = new HashMap(mapA);
            } else {
                abstractMap.putAll(mapA);
            }
        }
        if (y(w4Var, h0Var)) {
            u(w4Var);
            if (w4Var.e() == null) {
                ArrayList<io.sentry.protocol.u> arrayListD = w4Var.d();
                if (arrayListD == null || arrayListD.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = null;
                    for (io.sentry.protocol.u uVar : arrayListD) {
                        if (uVar.f != null && uVar.d != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(uVar.d);
                        }
                    }
                }
                boolean zIsAttachThreads = b6Var.isAttachThreads();
                boolean zC = false;
                x4 x4Var = this.b;
                if (zIsAttachThreads || io.sentry.hints.a.class.isInstance(h0Var.b("sentry:typeCheckHint"))) {
                    Object objB = h0Var.b("sentry:typeCheckHint");
                    boolean zIsAttachStacktrace = b6Var.isAttachStacktrace();
                    if (objB instanceof io.sentry.hints.a) {
                        zC = ((io.sentry.hints.a) objB).c();
                        zIsAttachStacktrace = true;
                    }
                    w4Var.s = new c2(x4Var.b(Thread.getAllStackTraces(), arrayList, zC, zIsAttachStacktrace));
                } else if (b6Var.isAttachStacktrace() && ((arrayListD == null || arrayListD.isEmpty()) && !io.sentry.hints.d.class.isInstance(h0Var.b("sentry:typeCheckHint")))) {
                    boolean zIsAttachStacktrace2 = b6Var.isAttachStacktrace();
                    HashMap map = new HashMap();
                    Thread threadCurrentThread = Thread.currentThread();
                    map.put(threadCurrentThread, threadCurrentThread.getStackTrace());
                    w4Var.s = new c2(x4Var.b(map, null, false, zIsAttachStacktrace2));
                    return w4Var;
                }
            }
        }
        return w4Var;
    }

    @Override // io.sentry.b0
    public final io.sentry.protocol.d0 g(io.sentry.protocol.d0 d0Var, h0 h0Var) {
        if (d0Var.h == null) {
            d0Var.h = "java";
        }
        io.sentry.protocol.f fVarA = io.sentry.protocol.f.a(d0Var.n, this.a);
        if (fVarA != null) {
            d0Var.n = fVarA;
        }
        if (y(d0Var, h0Var)) {
            u(d0Var);
        }
        return d0Var;
    }

    @Override // io.sentry.b0
    public final g5 k(g5 g5Var) {
        return g5Var;
    }

    public final void u(k4 k4Var) {
        if (k4Var.f == null) {
            k4Var.f = this.a.getRelease();
        }
        if (k4Var.g == null) {
            k4Var.g = this.a.getEnvironment();
        }
        if (k4Var.k == null) {
            k4Var.k = this.a.getServerName();
        }
        if (this.a.isAttachServerName() && k4Var.k == null) {
            if (this.d == null) {
                this.d = k0.a();
            }
            if (this.d != null) {
                k0 k0Var = this.d;
                if (k0Var.c < System.currentTimeMillis() && k0Var.d.compareAndSet(false, true)) {
                    k0Var.b();
                }
                k4Var.k = k0Var.b;
            }
        }
        if (k4Var.l == null) {
            k4Var.l = this.a.getDist();
        }
        if (k4Var.c == null) {
            k4Var.c = this.a.getSdkVersion();
        }
        b6 b6Var = this.a;
        if (k4Var.e == null) {
            k4Var.c(new HashMap(b6Var.getTags()));
        } else {
            for (Map.Entry<String, String> entry : b6Var.getTags().entrySet()) {
                if (!k4Var.e.containsKey(entry.getKey())) {
                    k4Var.b(entry.getKey(), entry.getValue());
                }
            }
        }
        io.sentry.protocol.g0 g0Var = k4Var.i;
        if (g0Var == null) {
            g0Var = new io.sentry.protocol.g0();
            k4Var.i = g0Var;
        }
        if (g0Var.d == null && this.a.isSendDefaultPii()) {
            g0Var.d = "{{auto}}";
        }
    }

    public final boolean y(k4 k4Var, h0 h0Var) {
        if (io.sentry.config.a.Y(h0Var)) {
            return true;
        }
        this.a.getLogger().i(SentryLevel.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", k4Var.a);
        return false;
    }
}
