package com.bumptech.glide;

import android.R;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.d;
import com.bumptech.glide.integration.volley.VolleyGlideModule;
import com.bumptech.glide.load.engine.b;
import defpackage.cv;
import defpackage.dr3;
import defpackage.et2;
import defpackage.ft2;
import defpackage.gv;
import defpackage.ht2;
import defpackage.i29;
import defpackage.it2;
import defpackage.jg4;
import defpackage.jt2;
import defpackage.kt4;
import defpackage.ng4;
import defpackage.ok4;
import defpackage.p6;
import defpackage.pc0;
import defpackage.pt2;
import defpackage.r79;
import defpackage.ry;
import defpackage.rz5;
import defpackage.s57;
import defpackage.u57;
import defpackage.vy2;
import defpackage.wv;
import defpackage.ys2;
import defpackage.za9;
import io.sentry.android.core.t0;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ComponentCallbacks2 {
    public static volatile a h;
    public static volatile boolean i;
    public final pc0 a;
    public final ng4 b;
    public final ft2 c;
    public final dr3 d;
    public final u57 e;
    public final gv f;
    public final ArrayList g = new ArrayList();

    public a(Context context, b bVar, ng4 ng4Var, pc0 pc0Var, dr3 dr3Var, u57 u57Var, gv gvVar, int i2, ys2 ys2Var, wv wvVar, List list, List list2, za9 za9Var, pt2 pt2Var) {
        this.a = pc0Var;
        this.d = dr3Var;
        this.b = ng4Var;
        this.e = u57Var;
        this.f = gvVar;
        this.c = new ft2(context, dr3Var, new ry(this, list2, za9Var), new cv(29), ys2Var, wvVar, list, bVar, pt2Var, i2);
    }

    public static a a(Context context) {
        GeneratedAppGlideModule generatedAppGlideModule;
        if (h == null) {
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) GeneratedAppGlideModuleImpl.class.getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext().getApplicationContext());
            } catch (ClassNotFoundException unused) {
                if (Log.isLoggable("Glide", 5)) {
                    t0.m("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                }
                generatedAppGlideModule = null;
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e);
            } catch (InstantiationException e2) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e2);
            } catch (NoSuchMethodException e3) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e3);
            } catch (InvocationTargetException e4) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e4);
            }
            synchronized (a.class) {
                if (h == null) {
                    if (i) {
                        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
                    }
                    i = true;
                    try {
                        c(context, generatedAppGlideModule);
                        i = false;
                    } catch (Throwable th) {
                        i = false;
                        throw th;
                    }
                }
            }
        }
        return h;
    }

    public static u57 b(Context context) {
        ok4.p(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return a(context).e;
    }

    public static void c(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        List list;
        et2 et2Var = new et2();
        Context applicationContext = context.getApplicationContext();
        List list2 = Collections.EMPTY_LIST;
        int i2 = 2;
        if (generatedAppGlideModule == null || generatedAppGlideModule.P()) {
            ArrayList arrayList = new ArrayList();
            try {
                ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
                if (applicationInfo != null && applicationInfo.metaData != null) {
                    if (Log.isLoggable("ManifestParser", 2)) {
                        Objects.toString(applicationInfo.metaData);
                    }
                    for (String str : applicationInfo.metaData.keySet()) {
                        if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                            arrayList.add(vy2.K(str));
                        }
                    }
                }
            } catch (PackageManager.NameNotFoundException e) {
                if (Log.isLoggable("ManifestParser", 6)) {
                    t0.e("ManifestParser", "Failed to parse glide modules", e);
                }
            }
            list = arrayList;
        } else {
            list = list2;
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.Q().isEmpty()) {
            HashSet hashSetQ = generatedAppGlideModule.Q();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                VolleyGlideModule volleyGlideModule = (VolleyGlideModule) it.next();
                if (hashSetQ.contains(volleyGlideModule.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        volleyGlideModule.toString();
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((VolleyGlideModule) it2.next()).getClass().toString();
            }
        }
        et2Var.n = generatedAppGlideModule != null ? generatedAppGlideModule.R() : null;
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            ((VolleyGlideModule) it3.next()).getClass();
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.O(applicationContext, et2Var);
        }
        if (et2Var.g == null) {
            p6 p6Var = new p6(1);
            if (it2.c == 0) {
                it2.c = Math.min(4, Runtime.getRuntime().availableProcessors());
            }
            int i3 = it2.c;
            if (TextUtils.isEmpty("source")) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: source");
            }
            et2Var.g = new it2(new ThreadPoolExecutor(i3, i3, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new ht2(p6Var, "source", false)));
        }
        if (et2Var.h == null) {
            int i4 = it2.c;
            p6 p6Var2 = new p6(1);
            if (TextUtils.isEmpty("disk-cache")) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: disk-cache");
            }
            et2Var.h = new it2(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new ht2(p6Var2, "disk-cache", true)));
        }
        if (et2Var.o == null) {
            if (it2.c == 0) {
                it2.c = Math.min(4, Runtime.getRuntime().availableProcessors());
            }
            int i5 = it2.c >= 4 ? 2 : 1;
            p6 p6Var3 = new p6(1);
            if (TextUtils.isEmpty("animation")) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: animation");
            }
            et2Var.o = new it2(new ThreadPoolExecutor(i5, i5, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new ht2(p6Var3, "animation", true)));
        }
        if (et2Var.j == null) {
            et2Var.j = new rz5(new kt4(applicationContext));
        }
        if (et2Var.k == null) {
            et2Var.k = new gv(11);
        }
        if (et2Var.d == null) {
            int i6 = et2Var.j.a;
            if (i6 > 0) {
                et2Var.d = new jg4(i6);
            } else {
                et2Var.d = new gv(i2);
            }
        }
        if (et2Var.e == null) {
            et2Var.e = new dr3(et2Var.j.c);
        }
        if (et2Var.f == null) {
            et2Var.f = new ng4(et2Var.j.b);
        }
        if (et2Var.i == null) {
            et2Var.i = new r79(applicationContext);
        }
        if (et2Var.c == null) {
            et2Var.c = new b(et2Var.f, et2Var.i, et2Var.h, et2Var.g, new it2(new ThreadPoolExecutor(0, Integer.MAX_VALUE, it2.b, TimeUnit.MILLISECONDS, new SynchronousQueue(), new ht2(new p6(1), "source-unlimited", false))), et2Var.o);
        }
        List list3 = et2Var.p;
        if (list3 == null) {
            et2Var.p = Collections.EMPTY_LIST;
        } else {
            et2Var.p = DesugarCollections.unmodifiableList(list3);
        }
        jt2 jt2Var = et2Var.b;
        jt2Var.getClass();
        a aVar = new a(applicationContext, et2Var.c, et2Var.f, et2Var.d, et2Var.e, new u57(et2Var.n), et2Var.k, et2Var.l, et2Var.m, et2Var.a, et2Var.p, list, generatedAppGlideModule, new pt2(jt2Var));
        applicationContext.registerComponentCallbacks(aVar);
        h = aVar;
    }

    public static s57 e(Context context) {
        return b(context).c(context);
    }

    public static s57 f(View view) {
        u57 u57VarB = b(view.getContext());
        u57VarB.getClass();
        char[] cArr = i29.a;
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            return u57VarB.c(view.getContext().getApplicationContext());
        }
        ok4.p(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity activityA = u57.a(view.getContext());
        if (activityA == null) {
            return u57VarB.c(view.getContext().getApplicationContext());
        }
        if (!(activityA instanceof FragmentActivity)) {
            return u57VarB.c(view.getContext().getApplicationContext());
        }
        FragmentActivity fragmentActivity = (FragmentActivity) activityA;
        wv wvVar = u57VarB.c;
        wvVar.clear();
        u57.b(fragmentActivity.L().c.S(), wvVar);
        View viewFindViewById = fragmentActivity.findViewById(R.id.content);
        d dVar = null;
        while (!view.equals(viewFindViewById) && (dVar = (d) wvVar.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        wvVar.clear();
        return dVar != null ? u57VarB.d(dVar) : u57VarB.e(fragmentActivity);
    }

    public final void d(s57 s57Var) {
        synchronized (this.g) {
            try {
                if (!this.g.contains(s57Var)) {
                    throw new IllegalStateException("Cannot unregister not yet registered manager");
                }
                this.g.remove(s57Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        i29.a();
        this.b.j(0L);
        this.a.l();
        this.d.a();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i2) {
        i29.a();
        synchronized (this.g) {
            try {
                Iterator it = this.g.iterator();
                while (it.hasNext()) {
                    ((s57) it.next()).getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.b.l(i2);
        this.a.j(i2);
        this.d.j(i2);
    }
}
