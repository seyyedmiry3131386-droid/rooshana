package androidx.activity;

import android.app.Application;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.Lifecycle$Event;
import androidx.lifecycle.Lifecycle$State;
import androidx.lifecycle.ReportFragment;
import androidx.lifecycle.d;
import defpackage.ai0;
import defpackage.ay0;
import defpackage.b64;
import defpackage.bn6;
import defpackage.bp4;
import defpackage.bs6;
import defpackage.bt5;
import defpackage.by0;
import defpackage.c24;
import defpackage.ca5;
import defpackage.ct5;
import defpackage.dk5;
import defpackage.dy0;
import defpackage.g64;
import defpackage.gj3;
import defpackage.hu4;
import defpackage.i64;
import defpackage.ia7;
import defpackage.j27;
import defpackage.j76;
import defpackage.js3;
import defpackage.jx2;
import defpackage.lr6;
import defpackage.o06;
import defpackage.o27;
import defpackage.o31;
import defpackage.oo1;
import defpackage.p79;
import defpackage.q79;
import defpackage.qd7;
import defpackage.r7;
import defpackage.rn6;
import defpackage.rq4;
import defpackage.rt4;
import defpackage.ry6;
import defpackage.s7;
import defpackage.st4;
import defpackage.t7;
import defpackage.ta5;
import defpackage.u79;
import defpackage.ux0;
import defpackage.vx0;
import defpackage.ws5;
import defpackage.wx0;
import defpackage.x41;
import defpackage.x79;
import defpackage.xo2;
import defpackage.xs5;
import defpackage.yx0;
import defpackage.z27;
import defpackage.zx0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.a;

/* JADX INFO: loaded from: classes.dex */
public class ComponentActivity extends androidx.core.app.ComponentActivity implements x79, jx2, qd7, xs5, dk5, bt5 {
    public static final /* synthetic */ int u = 0;
    public final x41 b = new x41();
    public final st4 c = new st4(new ux0(this, 0));
    public final rn6 d;
    public u79 e;
    public final by0 f;
    public final c24 g;
    public final AtomicInteger h;
    public final dy0 i;
    public final CopyOnWriteArrayList j;
    public final CopyOnWriteArrayList k;
    public final CopyOnWriteArrayList l;
    public final CopyOnWriteArrayList m;
    public final CopyOnWriteArrayList n;
    public final CopyOnWriteArrayList o;
    public boolean p;
    public boolean q;
    public final c24 r;
    public final c24 s;
    public final c24 t;

    public ComponentActivity() {
        rn6 rn6Var = new rn6(new bp4(this, new o06(17, this)));
        this.d = rn6Var;
        this.f = new by0(this);
        this.g = a.a(new vx0(this, 1));
        this.h = new AtomicInteger();
        this.i = new dy0(this);
        this.j = new CopyOnWriteArrayList();
        this.k = new CopyOnWriteArrayList();
        this.l = new CopyOnWriteArrayList();
        this.m = new CopyOnWriteArrayList();
        this.n = new CopyOnWriteArrayList();
        this.o = new CopyOnWriteArrayList();
        this.r = a.a(new vx0(this, 2));
        i64 i64Var = this.a;
        if (i64Var == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        final int i = 0;
        i64Var.a(new b64(this) { // from class: xx0
            public final /* synthetic */ ComponentActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.b64
            public final void g(g64 g64Var, Lifecycle$Event lifecycle$Event) {
                Window window;
                View viewPeekDecorView;
                switch (i) {
                    case 0:
                        ComponentActivity componentActivity = this.b;
                        int i2 = ComponentActivity.u;
                        if (lifecycle$Event == Lifecycle$Event.ON_STOP && (window = componentActivity.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        ComponentActivity componentActivity2 = this.b;
                        int i3 = ComponentActivity.u;
                        if (lifecycle$Event == Lifecycle$Event.ON_DESTROY) {
                            componentActivity2.b.b = null;
                            if (!componentActivity2.isChangingConfigurations()) {
                                componentActivity2.m().a();
                            }
                            by0 by0Var = componentActivity2.f;
                            ComponentActivity componentActivity3 = by0Var.d;
                            componentActivity3.getWindow().getDecorView().removeCallbacks(by0Var);
                            componentActivity3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(by0Var);
                        }
                        break;
                }
            }
        });
        final int i2 = 1;
        this.a.a(new b64(this) { // from class: xx0
            public final /* synthetic */ ComponentActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.b64
            public final void g(g64 g64Var, Lifecycle$Event lifecycle$Event) {
                Window window;
                View viewPeekDecorView;
                switch (i2) {
                    case 0:
                        ComponentActivity componentActivity = this.b;
                        int i22 = ComponentActivity.u;
                        if (lifecycle$Event == Lifecycle$Event.ON_STOP && (window = componentActivity.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        ComponentActivity componentActivity2 = this.b;
                        int i3 = ComponentActivity.u;
                        if (lifecycle$Event == Lifecycle$Event.ON_DESTROY) {
                            componentActivity2.b.b = null;
                            if (!componentActivity2.isChangingConfigurations()) {
                                componentActivity2.m().a();
                            }
                            by0 by0Var = componentActivity2.f;
                            ComponentActivity componentActivity3 = by0Var.d;
                            componentActivity3.getWindow().getDecorView().removeCallbacks(by0Var);
                            componentActivity3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(by0Var);
                        }
                        break;
                }
            }
        });
        this.a.a(new ry6(i2, this));
        rn6Var.u();
        rq4.u(this);
        if (Build.VERSION.SDK_INT == 23) {
            this.a.a(new gj3(this));
        }
        ((bn6) rn6Var.c).u("android:support:activity-result", new yx0(0, this));
        I(new zx0(this, 0));
        this.s = a.a(new vx0(this, 3));
        this.t = a.a(new vx0(this, 4));
    }

    public static void F(ws5 ws5Var, ComponentActivity componentActivity, g64 g64Var, Lifecycle$Event lifecycle$Event) {
        if (lifecycle$Event == Lifecycle$Event.ON_CREATE) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = componentActivity.getOnBackInvokedDispatcher();
            js3.o(onBackInvokedDispatcher, "getOnBackInvokedDispatcher(...)");
            ws5Var.c(onBackInvokedDispatcher);
        }
    }

    public static void G(ComponentActivity componentActivity) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e) {
            if (!js3.i(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e;
            }
        } catch (NullPointerException e2) {
            if (!js3.i(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e2;
            }
        }
    }

    @Override // androidx.core.app.ComponentActivity, defpackage.g64
    public final i64 D() {
        return this.a;
    }

    public final void H(hu4 hu4Var, g64 g64Var) {
        Lifecycle$State lifecycle$State = Lifecycle$State.a;
        st4 st4Var = this.c;
        st4Var.getClass();
        i64 i64VarD = g64Var.D();
        HashMap map = st4Var.c;
        rt4 rt4Var = (rt4) map.remove(hu4Var);
        if (rt4Var != null) {
            rt4Var.a.f(rt4Var.b);
            rt4Var.b = null;
        }
        map.put(hu4Var, new rt4(i64VarD, new wx0(st4Var, hu4Var)));
    }

    public final void I(ct5 ct5Var) {
        x41 x41Var = this.b;
        x41Var.getClass();
        ComponentActivity componentActivity = (ComponentActivity) x41Var.b;
        if (componentActivity != null) {
            ct5Var.a(componentActivity);
        }
        ((CopyOnWriteArraySet) x41Var.a).add(ct5Var);
    }

    public final void J() {
        View decorView = getWindow().getDecorView();
        js3.o(decorView, "getDecorView(...)");
        j27.k(decorView, this);
        View decorView2 = getWindow().getDecorView();
        js3.o(decorView2, "getDecorView(...)");
        z27.l(decorView2, this);
        View decorView3 = getWindow().getDecorView();
        js3.o(decorView3, "getDecorView(...)");
        o27.i(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        js3.o(decorView4, "getDecorView(...)");
        decorView4.setTag(bs6.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        js3.o(decorView5, "getDecorView(...)");
        decorView5.setTag(bs6.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        js3.o(decorView6, "getDecorView(...)");
        decorView6.setTag(lr6.view_tree_navigation_event_dispatcher_owner, this);
    }

    public final t7 K(r7 r7Var, s7 s7Var) {
        dy0 dy0Var = this.i;
        js3.p(dy0Var, "registry");
        return dy0Var.d("activity_rq#" + this.h.getAndIncrement(), this, s7Var, r7Var);
    }

    @Override // defpackage.dk5
    public final ai0 a() {
        return c().b;
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        J();
        View decorView = getWindow().getDecorView();
        js3.o(decorView, "getDecorView(...)");
        this.f.a(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // defpackage.xs5
    public final ws5 c() {
        return (ws5) this.t.getValue();
    }

    @Override // defpackage.jx2
    public q79 h() {
        return (q79) this.s.getValue();
    }

    @Override // defpackage.jx2
    public final ta5 i() {
        ta5 ta5Var = new ta5(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = ta5Var.a;
        if (application != null) {
            linkedHashMap.put(p79.e, getApplication());
        }
        linkedHashMap.put(rq4.b, this);
        linkedHashMap.put(rq4.c, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(rq4.d, extras);
        }
        return ta5Var;
    }

    @Override // defpackage.x79
    public final u79 m() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.e == null) {
            ay0 ay0Var = (ay0) getLastNonConfigurationInstance();
            if (ay0Var != null) {
                this.e = ay0Var.a;
            }
            if (this.e == null) {
                this.e = new u79();
            }
        }
        u79 u79Var = this.e;
        js3.m(u79Var);
        return u79Var;
    }

    @Override // defpackage.qd7
    public final bn6 o() {
        return (bn6) this.d.c;
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.i.a(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        ((oo1) this.r.getValue()).a();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        js3.p(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Iterator it = this.j.iterator();
        js3.o(it, "iterator(...)");
        while (it.hasNext()) {
            ((o31) it.next()).accept(configuration);
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.d.v(bundle);
        x41 x41Var = this.b;
        x41Var.getClass();
        x41Var.b = this;
        Iterator it = ((CopyOnWriteArraySet) x41Var.a).iterator();
        while (it.hasNext()) {
            ((ct5) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i = ReportFragment.b;
        d.b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        js3.p(menu, "menu");
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        MenuInflater menuInflater = getMenuInflater();
        Iterator it = this.c.b.iterator();
        while (it.hasNext()) {
            ((hu4) it.next()).c(menu, menuInflater);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        js3.p(menuItem, "item");
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            Iterator it = this.c.b.iterator();
            while (it.hasNext()) {
                if (((hu4) it.next()).a(menuItem)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        if (this.p) {
            return;
        }
        Iterator it = this.m.iterator();
        js3.o(it, "iterator(...)");
        while (it.hasNext()) {
            ((o31) it.next()).accept(new ca5(z));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        js3.p(intent, "intent");
        super.onNewIntent(intent);
        Iterator it = this.l.iterator();
        js3.o(it, "iterator(...)");
        while (it.hasNext()) {
            ((o31) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        js3.p(menu, "menu");
        Iterator it = this.c.b.iterator();
        while (it.hasNext()) {
            ((hu4) it.next()).b(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        if (this.q) {
            return;
        }
        Iterator it = this.n.iterator();
        js3.o(it, "iterator(...)");
        while (it.hasNext()) {
            ((o31) it.next()).accept(new j76(z));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        js3.p(menu, "menu");
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = this.c.b.iterator();
        while (it.hasNext()) {
            ((hu4) it.next()).d(menu);
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        js3.p(strArr, "permissions");
        js3.p(iArr, "grantResults");
        if (this.i.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        ay0 ay0Var;
        u79 u79Var = this.e;
        if (u79Var == null && (ay0Var = (ay0) getLastNonConfigurationInstance()) != null) {
            u79Var = ay0Var.a;
        }
        if (u79Var == null) {
            return null;
        }
        ay0 ay0Var2 = new ay0();
        ay0Var2.a = u79Var;
        return ay0Var2;
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        js3.p(bundle, "outState");
        i64 i64Var = this.a;
        if (i64Var != null) {
            js3.n(i64Var, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            i64Var.g(Lifecycle$State.c);
        }
        super.onSaveInstanceState(bundle);
        this.d.w(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.k.iterator();
        js3.o(it, "iterator(...)");
        while (it.hasNext()) {
            ((o31) it.next()).accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.o.iterator();
        js3.o(it, "iterator(...)");
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (ia7.h()) {
                ia7.d("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            ((xo2) this.g.getValue()).a();
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        J();
        View decorView = getWindow().getDecorView();
        js3.o(decorView, "getDecorView(...)");
        this.f.a(decorView);
        super.setContentView(i);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i) {
        js3.p(intent, "intent");
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        js3.p(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // defpackage.bt5
    public final void v(o31 o31Var) {
        js3.p(o31Var, "listener");
        this.j.add(o31Var);
    }

    @Override // defpackage.bt5
    public final void w(o31 o31Var) {
        js3.p(o31Var, "listener");
        this.j.remove(o31Var);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        js3.p(intent, "intent");
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        js3.p(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        js3.p(configuration, "newConfig");
        this.p = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.p = false;
            Iterator it = this.m.iterator();
            js3.o(it, "iterator(...)");
            while (it.hasNext()) {
                ((o31) it.next()).accept(new ca5(z));
            }
        } catch (Throwable th) {
            this.p = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        js3.p(configuration, "newConfig");
        this.q = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.q = false;
            Iterator it = this.n.iterator();
            js3.o(it, "iterator(...)");
            while (it.hasNext()) {
                ((o31) it.next()).accept(new j76(z));
            }
        } catch (Throwable th) {
            this.q = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        J();
        View decorView = getWindow().getDecorView();
        js3.o(decorView, "getDecorView(...)");
        this.f.a(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        J();
        View decorView = getWindow().getDecorView();
        js3.o(decorView, "getDecorView(...)");
        this.f.a(decorView);
        super.setContentView(view, layoutParams);
    }
}
