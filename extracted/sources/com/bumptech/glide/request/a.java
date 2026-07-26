package com.bumptech.glide.request;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.engine.b;
import com.bumptech.glide.load.engine.d;
import defpackage.bt2;
import defpackage.ft2;
import defpackage.g57;
import defpackage.g67;
import defpackage.i29;
import defpackage.ko9;
import defpackage.lr8;
import defpackage.ly7;
import defpackage.m58;
import defpackage.m91;
import defpackage.md4;
import defpackage.p57;
import defpackage.sv5;
import defpackage.sx3;
import defpackage.v47;
import defpackage.ve8;
import defpackage.vy2;
import defpackage.wv8;
import defpackage.x80;
import defpackage.xk0;
import defpackage.zo1;
import io.sentry.android.core.t0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class a implements v47, ly7 {
    public static final boolean A = Log.isLoggable("GlideRequest", 2);
    public final m58 a;
    public final Object b;
    public final g57 c;
    public final Context d;
    public final ft2 e;
    public final Object f;
    public final Class g;
    public final x80 h;
    public final int i;
    public final int j;
    public final Priority k;
    public final ve8 l;
    public final List m;
    public final lr8 n;
    public final ko9 o;
    public g67 p;
    public wv8 q;
    public volatile b r;
    public SingleRequest$Status s;
    public Drawable t;
    public Drawable u;
    public Drawable v;
    public int w;
    public int x;
    public boolean y;
    public final RuntimeException z;

    public a(Context context, ft2 ft2Var, Object obj, Object obj2, Class cls, x80 x80Var, int i, int i2, Priority priority, ve8 ve8Var, ArrayList arrayList, g57 g57Var, b bVar, lr8 lr8Var) {
        ko9 ko9Var = vy2.d;
        if (A) {
            String.valueOf(hashCode());
        }
        this.a = new m58();
        this.b = obj;
        this.d = context;
        this.e = ft2Var;
        this.f = obj2;
        this.g = cls;
        this.h = x80Var;
        this.i = i;
        this.j = i2;
        this.k = priority;
        this.l = ve8Var;
        this.m = arrayList;
        this.c = g57Var;
        this.r = bVar;
        this.n = lr8Var;
        this.o = ko9Var;
        this.s = SingleRequest$Status.a;
        if (this.z == null && ((Map) ft2Var.h.b).containsKey(bt2.class)) {
            this.z = new RuntimeException("Glide request origin trace");
        }
    }

    @Override // defpackage.v47
    public final boolean a() {
        boolean z;
        synchronized (this.b) {
            z = this.s == SingleRequest$Status.d;
        }
        return z;
    }

    @Override // defpackage.v47
    public final void b() {
        synchronized (this.b) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.v47
    public final boolean c() {
        boolean z;
        synchronized (this.b) {
            z = this.s == SingleRequest$Status.d;
        }
        return z;
    }

    @Override // defpackage.v47
    public final void clear() {
        synchronized (this.b) {
            try {
                if (this.y) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.a.a();
                SingleRequest$Status singleRequest$Status = this.s;
                SingleRequest$Status singleRequest$Status2 = SingleRequest$Status.f;
                if (singleRequest$Status == singleRequest$Status2) {
                    return;
                }
                d();
                g67 g67Var = this.p;
                if (g67Var != null) {
                    this.p = null;
                } else {
                    g67Var = null;
                }
                g57 g57Var = this.c;
                if (g57Var == null || g57Var.f(this)) {
                    this.l.j(e());
                }
                this.s = singleRequest$Status2;
                if (g67Var != null) {
                    this.r.getClass();
                    b.f(g67Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        if (this.y) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
        this.a.a();
        this.l.d(this);
        wv8 wv8Var = this.q;
        if (wv8Var != null) {
            synchronized (((b) wv8Var.d)) {
                ((d) wv8Var.b).j((a) wv8Var.c);
            }
            this.q = null;
        }
    }

    public final Drawable e() {
        if (this.u == null) {
            this.u = this.h.f;
        }
        return this.u;
    }

    public final void f(GlideException glideException, int i) {
        int i2;
        this.a.a();
        synchronized (this.b) {
            try {
                glideException.getClass();
                int i3 = this.e.i;
                if (i3 <= i) {
                    t0.n("Glide", "Load failed for [" + this.f + "] with dimensions [" + this.w + "x" + this.x + "]", glideException);
                    if (i3 <= 4) {
                        ArrayList arrayList = new ArrayList();
                        GlideException.a(glideException, arrayList);
                        int size = arrayList.size();
                        int i4 = 0;
                        while (i4 < size) {
                            int i5 = i4 + 1;
                            i4 = i5;
                        }
                    }
                }
                Drawable drawableE = null;
                this.q = null;
                this.s = SingleRequest$Status.e;
                g57 g57Var = this.c;
                if (g57Var != null) {
                    g57Var.j(this);
                }
                boolean z = true;
                this.y = true;
                try {
                    List<p57> list = this.m;
                    if (list != null) {
                        for (p57 p57Var : list) {
                            Object obj = this.f;
                            ve8 ve8Var = this.l;
                            g57 g57Var2 = this.c;
                            if (g57Var2 != null) {
                                g57Var2.getRoot().a();
                            }
                            p57Var.a(obj, ve8Var);
                        }
                    }
                    g57 g57Var3 = this.c;
                    if (g57Var3 != null && !g57Var3.d(this)) {
                        z = false;
                    }
                    if (z) {
                        if (this.f == null) {
                            if (this.v == null) {
                                this.h.getClass();
                                this.v = null;
                            }
                            drawableE = this.v;
                        }
                        if (drawableE == null) {
                            if (this.t == null) {
                                x80 x80Var = this.h;
                                Drawable drawable = x80Var.d;
                                this.t = drawable;
                                if (drawable == null && (i2 = x80Var.e) > 0) {
                                    Context context = this.d;
                                    x80Var.getClass();
                                    this.t = m91.t(context, context, i2, context.getTheme());
                                }
                            }
                            drawableE = this.t;
                        }
                        if (drawableE == null) {
                            drawableE = e();
                        }
                        this.l.g(drawableE);
                    }
                } finally {
                    this.y = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.v47
    public final boolean g(v47 v47Var) {
        int i;
        int i2;
        Object obj;
        Class cls;
        x80 x80Var;
        Priority priority;
        int size;
        int i3;
        int i4;
        Object obj2;
        Class cls2;
        x80 x80Var2;
        Priority priority2;
        int size2;
        if (!(v47Var instanceof a)) {
            return false;
        }
        synchronized (this.b) {
            try {
                i = this.i;
                i2 = this.j;
                obj = this.f;
                cls = this.g;
                x80Var = this.h;
                priority = this.k;
                List list = this.m;
                size = list != null ? list.size() : 0;
            } finally {
            }
        }
        a aVar = (a) v47Var;
        synchronized (aVar.b) {
            try {
                i3 = aVar.i;
                i4 = aVar.j;
                obj2 = aVar.f;
                cls2 = aVar.g;
                x80Var2 = aVar.h;
                priority2 = aVar.k;
                List list2 = aVar.m;
                size2 = list2 != null ? list2.size() : 0;
            } finally {
            }
        }
        if (i == i3 && i2 == i4) {
            char[] cArr = i29.a;
            if ((obj == null ? obj2 == null : obj.equals(obj2)) && cls.equals(cls2)) {
                if ((x80Var == null ? x80Var2 == null : x80Var.o(x80Var2)) && priority == priority2 && size == size2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void h(g67 g67Var, DataSource dataSource, boolean z) {
        this.a.a();
        g67 g67Var2 = null;
        try {
            synchronized (this.b) {
                try {
                    this.q = null;
                    if (g67Var == null) {
                        f(new GlideException("Expected to receive a Resource<R> with an object of " + this.g + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj = g67Var.get();
                    try {
                        if (obj == null || !this.g.isAssignableFrom(obj.getClass())) {
                            this.p = null;
                            StringBuilder sb = new StringBuilder("Expected to receive an object of ");
                            sb.append(this.g);
                            sb.append(" but instead got ");
                            sb.append(obj != null ? obj.getClass() : "");
                            sb.append("{");
                            sb.append(obj);
                            sb.append("} inside Resource{");
                            sb.append(g67Var);
                            sb.append("}.");
                            sb.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                            f(new GlideException(sb.toString()), 5);
                        } else {
                            g57 g57Var = this.c;
                            if (g57Var == null || g57Var.e(this)) {
                                j(g67Var, obj, dataSource);
                                return;
                            } else {
                                this.p = null;
                                this.s = SingleRequest$Status.d;
                            }
                        }
                        this.r.getClass();
                        b.f(g67Var);
                    } catch (Throwable th) {
                        g67Var2 = g67Var;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (g67Var2 != null) {
                this.r.getClass();
                b.f(g67Var2);
            }
            throw th3;
        }
    }

    @Override // defpackage.v47
    public final boolean i() {
        boolean z;
        synchronized (this.b) {
            z = this.s == SingleRequest$Status.f;
        }
        return z;
    }

    @Override // defpackage.v47
    public final boolean isRunning() {
        boolean z;
        synchronized (this.b) {
            try {
                SingleRequest$Status singleRequest$Status = this.s;
                z = singleRequest$Status == SingleRequest$Status.b || singleRequest$Status == SingleRequest$Status.c;
            } finally {
            }
        }
        return z;
    }

    public final void j(g67 g67Var, Object obj, DataSource dataSource) {
        boolean zB;
        g57 g57Var = this.c;
        if (g57Var != null) {
            g57Var.getRoot().a();
        }
        this.s = SingleRequest$Status.d;
        this.p = g67Var;
        int i = this.e.i;
        Object obj2 = this.f;
        if (i <= 3) {
            Objects.toString(dataSource);
            Objects.toString(obj2);
            int i2 = md4.a;
            SystemClock.elapsedRealtimeNanos();
        }
        if (g57Var != null) {
            g57Var.h(this);
        }
        this.y = true;
        try {
            List list = this.m;
            ve8 ve8Var = this.l;
            if (list != null) {
                Iterator it = list.iterator();
                zB = false;
                while (it.hasNext()) {
                    zB |= ((p57) it.next()).b(obj, obj2, ve8Var, dataSource);
                }
            } else {
                zB = false;
            }
            if (!zB) {
                ve8Var.i(obj, this.n.e(dataSource));
            }
            this.y = false;
        } catch (Throwable th) {
            this.y = false;
            throw th;
        }
    }

    @Override // defpackage.v47
    public final void k() {
        synchronized (this.b) {
            try {
                if (this.y) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.a.a();
                int i = md4.a;
                SystemClock.elapsedRealtimeNanos();
                if (this.f == null) {
                    if (i29.j(this.i, this.j)) {
                        this.w = this.i;
                        this.x = this.j;
                    }
                    if (this.v == null) {
                        this.h.getClass();
                        this.v = null;
                    }
                    f(new GlideException("Received null model"), this.v == null ? 5 : 3);
                    return;
                }
                SingleRequest$Status singleRequest$Status = this.s;
                if (singleRequest$Status == SingleRequest$Status.b) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (singleRequest$Status == SingleRequest$Status.d) {
                    h(this.p, DataSource.e, false);
                    return;
                }
                List<p57> list = this.m;
                if (list != null) {
                    for (p57 p57Var : list) {
                    }
                }
                SingleRequest$Status singleRequest$Status2 = SingleRequest$Status.c;
                this.s = singleRequest$Status2;
                if (i29.j(this.i, this.j)) {
                    l(this.i, this.j);
                } else {
                    this.l.f(this);
                }
                SingleRequest$Status singleRequest$Status3 = this.s;
                if (singleRequest$Status3 == SingleRequest$Status.b || singleRequest$Status3 == singleRequest$Status2) {
                    g57 g57Var = this.c;
                    if (g57Var == null || g57Var.d(this)) {
                        this.l.h(e());
                    }
                }
                if (A) {
                    SystemClock.elapsedRealtimeNanos();
                }
            } catch (Throwable th) {
                throw th;
            }
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
    public final void l(int i, int i2) {
        Object obj;
        a aVar = this;
        int iRound = i;
        aVar.a.a();
        Object obj2 = aVar.b;
        synchronized (obj2) {
            try {
                try {
                    boolean z = A;
                    if (z) {
                        int i3 = md4.a;
                        SystemClock.elapsedRealtimeNanos();
                    }
                    if (aVar.s == SingleRequest$Status.c) {
                        SingleRequest$Status singleRequest$Status = SingleRequest$Status.b;
                        aVar.s = singleRequest$Status;
                        aVar.h.getClass();
                        if (iRound != Integer.MIN_VALUE) {
                            iRound = Math.round(iRound * 1.0f);
                        }
                        aVar.w = iRound;
                        aVar.x = i2 == Integer.MIN_VALUE ? i2 : Math.round(1.0f * i2);
                        if (z) {
                            int i4 = md4.a;
                            SystemClock.elapsedRealtimeNanos();
                        }
                        b bVar = aVar.r;
                        try {
                            ft2 ft2Var = aVar.e;
                            Object obj3 = aVar.f;
                            x80 x80Var = aVar.h;
                            try {
                                sx3 sx3Var = x80Var.j;
                                int i5 = aVar.w;
                                try {
                                    int i6 = aVar.x;
                                    Class cls = x80Var.o;
                                    try {
                                        Class cls2 = aVar.g;
                                        Priority priority = aVar.k;
                                        try {
                                            zo1 zo1Var = x80Var.b;
                                            xk0 xk0Var = x80Var.n;
                                            try {
                                                boolean z2 = x80Var.k;
                                                boolean z3 = x80Var.r;
                                                try {
                                                    sv5 sv5Var = x80Var.m;
                                                    boolean z4 = x80Var.g;
                                                    boolean z5 = x80Var.s;
                                                    ko9 ko9Var = aVar.o;
                                                    Object obj4 = obj2;
                                                    try {
                                                        aVar.q = bVar.a(ft2Var, obj3, sx3Var, i5, i6, cls, cls2, priority, zo1Var, xk0Var, z2, z3, sv5Var, z4, z5, aVar, ko9Var);
                                                        if (aVar.s != singleRequest$Status) {
                                                            aVar.q = null;
                                                        }
                                                        if (z) {
                                                            int i7 = md4.a;
                                                            SystemClock.elapsedRealtimeNanos();
                                                        }
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        obj = obj4;
                                                        throw th;
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    obj = obj2;
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                obj = obj2;
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            obj = obj2;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        obj = obj2;
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    obj = obj2;
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                obj = obj2;
                            }
                        } catch (Throwable th8) {
                            th = th8;
                            obj = obj2;
                        }
                    }
                } catch (Throwable th9) {
                    th = th9;
                    obj = obj2;
                }
            } catch (Throwable th10) {
                th = th10;
                obj = aVar;
            }
        }
    }

    public final String toString() {
        Object obj;
        Class cls;
        synchronized (this.b) {
            obj = this.f;
            cls = this.g;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}
