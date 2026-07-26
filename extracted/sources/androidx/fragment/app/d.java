package androidx.fragment.app;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.strictmode.FragmentStrictMode$Flag;
import androidx.fragment.app.strictmode.SetRetainInstanceUsageViolation;
import androidx.fragment.app.strictmode.SetUserVisibleHintViolation;
import androidx.lifecycle.Lifecycle$State;
import defpackage.b7;
import defpackage.bb5;
import defpackage.bn6;
import defpackage.bp4;
import defpackage.dw1;
import defpackage.g64;
import defpackage.hh2;
import defpackage.i64;
import defpackage.j27;
import defpackage.js3;
import defpackage.jx2;
import defpackage.lk2;
import defpackage.mk2;
import defpackage.nk2;
import defpackage.o06;
import defpackage.o27;
import defpackage.ok2;
import defpackage.p79;
import defpackage.pk2;
import defpackage.q6;
import defpackage.q79;
import defpackage.qd7;
import defpackage.qk2;
import defpackage.qm5;
import defpackage.r7;
import defpackage.rd7;
import defpackage.rn6;
import defpackage.rq4;
import defpackage.s7;
import defpackage.t61;
import defpackage.t7;
import defpackage.ta5;
import defpackage.tk2;
import defpackage.u79;
import defpackage.wl2;
import defpackage.x79;
import defpackage.y40;
import defpackage.ym2;
import defpackage.z27;
import defpackage.zm2;
import defpackage.zn2;
import ir.mservices.market.common.base.BaseContentFragment;
import j$.util.Objects;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class d implements ComponentCallbacks, View.OnCreateContextMenuListener, g64, x79, jx2, qd7 {
    public static final Object z0 = new Object();
    public int A;
    public String B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean H;
    public ViewGroup I;
    public View J;
    public boolean K;
    public qk2 M;
    public Handler N;
    public boolean P;
    public LayoutInflater Q;
    public boolean R;
    public String S;
    public i64 U;
    public zn2 V;
    public rd7 X;
    public rn6 Y;
    public Bundle b;
    public SparseArray c;
    public Bundle d;
    public Boolean e;
    public Bundle g;
    public d h;
    public int j;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public int u;
    public g v;
    public tk2 w;
    public d y;
    public int z;
    public int a = -1;
    public String f = UUID.randomUUID().toString();
    public String i = null;
    public Boolean k = null;
    public wl2 x = new wl2();
    public boolean G = true;
    public boolean L = true;
    public final mk2 O = new mk2(0, this);
    public Lifecycle$State T = Lifecycle$State.e;
    public final bb5 W = new bb5();
    public final AtomicInteger Z = new AtomicInteger();
    public final ArrayList x0 = new ArrayList();
    public final nk2 y0 = new nk2(this);

    public d() {
        O();
    }

    public final qk2 A() {
        if (this.M == null) {
            qk2 qk2Var = new qk2();
            Object obj = z0;
            qk2Var.i = obj;
            qk2Var.j = obj;
            qk2Var.k = null;
            qk2Var.l = obj;
            qk2Var.m = 1.0f;
            qk2Var.n = null;
            this.M = qk2Var;
        }
        return this.M;
    }

    @Override // defpackage.g64
    public final i64 D() {
        return this.U;
    }

    public final FragmentActivity F() {
        tk2 tk2Var = this.w;
        if (tk2Var == null) {
            return null;
        }
        return tk2Var.s;
    }

    public final g G() {
        if (this.w != null) {
            return this.x;
        }
        throw new IllegalStateException(dw1.m("Fragment ", this, " has not been attached yet."));
    }

    public Context H() {
        tk2 tk2Var = this.w;
        if (tk2Var == null) {
            return null;
        }
        return tk2Var.t;
    }

    public final int I() {
        Lifecycle$State lifecycle$State = this.T;
        return (lifecycle$State == Lifecycle$State.b || this.y == null) ? lifecycle$State.ordinal() : Math.min(lifecycle$State.ordinal(), this.y.I());
    }

    public final g J() {
        g gVar = this.v;
        if (gVar != null) {
            return gVar;
        }
        throw new IllegalStateException(dw1.m("Fragment ", this, " not associated with a fragment manager."));
    }

    public final Resources K() {
        return q0().getResources();
    }

    public final String L(int i) {
        return K().getString(i);
    }

    public final String M(int i, Object... objArr) {
        return K().getString(i, objArr);
    }

    public final zn2 N() {
        zn2 zn2Var = this.V;
        if (zn2Var != null) {
            return zn2Var;
        }
        throw new IllegalStateException(dw1.m("Can't access the Fragment View's LifecycleOwner for ", this, " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
    }

    public final void O() {
        this.U = new i64(this, true);
        this.Y = new rn6(new bp4(this, new o06(17, this)));
        this.X = null;
        ArrayList arrayList = this.x0;
        nk2 nk2Var = this.y0;
        if (arrayList.contains(nk2Var)) {
            return;
        }
        if (this.a >= 0) {
            nk2Var.a();
        } else {
            arrayList.add(nk2Var);
        }
    }

    public final void P() {
        O();
        this.S = this.f;
        this.f = UUID.randomUUID().toString();
        this.l = false;
        this.m = false;
        this.p = false;
        this.q = false;
        this.s = false;
        this.u = 0;
        this.v = null;
        this.x = new wl2();
        this.w = null;
        this.z = 0;
        this.A = 0;
        this.B = null;
        this.C = false;
        this.D = false;
    }

    public final boolean Q() {
        return this.w != null && this.l;
    }

    public final boolean R() {
        if (this.C) {
            return true;
        }
        g gVar = this.v;
        if (gVar != null) {
            d dVar = this.y;
            gVar.getClass();
            if (dVar == null ? false : dVar.R()) {
                return true;
            }
        }
        return false;
    }

    public final boolean S() {
        return this.u > 0;
    }

    public void T(Bundle bundle) {
        this.H = true;
    }

    public void U(int i, int i2, Intent intent) {
        if (g.N(2)) {
            toString();
            Objects.toString(intent);
        }
    }

    public void V(Activity activity2) {
        this.H = true;
    }

    public void W(Context context) {
        this.H = true;
        tk2 tk2Var = this.w;
        FragmentActivity fragmentActivity = tk2Var == null ? null : tk2Var.s;
        if (fragmentActivity != null) {
            this.H = false;
            V(fragmentActivity);
        }
    }

    public void X(Bundle bundle) {
        Bundle bundle2;
        this.H = true;
        Bundle bundle3 = this.b;
        if (bundle3 != null && (bundle2 = bundle3.getBundle("childFragmentManager")) != null) {
            this.x.b0(bundle2);
            wl2 wl2Var = this.x;
            wl2Var.I = false;
            wl2Var.J = false;
            wl2Var.P.g = false;
            wl2Var.v(1);
        }
        wl2 wl2Var2 = this.x;
        if (wl2Var2.w >= 1) {
            return;
        }
        wl2Var2.I = false;
        wl2Var2.J = false;
        wl2Var2.P.g = false;
        wl2Var2.v(1);
    }

    public Animation Y(int i, boolean z) {
        return null;
    }

    public View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    public void a0() {
        this.H = true;
    }

    public void b0() {
        this.H = true;
    }

    public void c0() {
        this.H = true;
    }

    public LayoutInflater d0(Bundle bundle) {
        tk2 tk2Var = this.w;
        if (tk2Var == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        FragmentActivity fragmentActivity = tk2Var.w;
        LayoutInflater layoutInflaterCloneInContext = fragmentActivity.getLayoutInflater().cloneInContext(fragmentActivity);
        layoutInflaterCloneInContext.setFactory2(this.x.f);
        return layoutInflaterCloneInContext;
    }

    public void e0(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.H = true;
        tk2 tk2Var = this.w;
        if ((tk2Var == null ? null : tk2Var.s) != null) {
            this.H = true;
        }
    }

    public void f0() {
        this.H = true;
    }

    public void g0() {
        this.H = true;
    }

    @Override // defpackage.jx2
    public q79 h() {
        Application application;
        if (this.v == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.X == null) {
            Context applicationContext = q0().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && g.N(3)) {
                Objects.toString(q0().getApplicationContext());
            }
            this.X = new rd7(application, this, this.g);
        }
        return this.X;
    }

    public void h0(Bundle bundle) {
    }

    @Override // defpackage.jx2
    public final ta5 i() {
        Application application;
        Context applicationContext = q0().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && g.N(3)) {
            Objects.toString(q0().getApplicationContext());
        }
        ta5 ta5Var = new ta5(0);
        LinkedHashMap linkedHashMap = ta5Var.a;
        if (application != null) {
            linkedHashMap.put(p79.e, application);
        }
        linkedHashMap.put(rq4.b, this);
        linkedHashMap.put(rq4.c, this);
        Bundle bundle = this.g;
        if (bundle != null) {
            linkedHashMap.put(rq4.d, bundle);
        }
        return ta5Var;
    }

    public void i0() {
        this.H = true;
    }

    public void j0() {
        this.H = true;
    }

    public void k0(View view, Bundle bundle) {
    }

    public void l0(Bundle bundle) {
        this.H = true;
    }

    @Override // defpackage.x79
    public final u79 m() {
        if (this.v == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        int I = I();
        Lifecycle$State lifecycle$State = Lifecycle$State.a;
        if (I == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap map = this.v.P.d;
        u79 u79Var = (u79) map.get(this.f);
        if (u79Var != null) {
            return u79Var;
        }
        u79 u79Var2 = new u79();
        map.put(this.f, u79Var2);
        return u79Var2;
    }

    public void m0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.x.U();
        this.t = true;
        this.V = new zn2(this, m(), new b7(27, this));
        View viewZ = Z(layoutInflater, viewGroup, bundle);
        this.J = viewZ;
        if (viewZ == null) {
            if (this.V.e != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.V = null;
            return;
        }
        this.V.b();
        if (g.N(3)) {
            Objects.toString(this.J);
            toString();
        }
        j27.k(this.J, this.V);
        z27.l(this.J, this.V);
        o27.i(this.J, this.V);
        this.W.h(this.V);
    }

    public final t7 n0(r7 r7Var, s7 s7Var) {
        BaseContentFragment baseContentFragment = (BaseContentFragment) this;
        qm5 qm5Var = new qm5(21, baseContentFragment);
        if (this.a > 1) {
            throw new IllegalStateException(dw1.m("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
        }
        AtomicReference atomicReference = new AtomicReference();
        pk2 pk2Var = new pk2(baseContentFragment, qm5Var, atomicReference, s7Var, r7Var);
        if (this.a >= 0) {
            pk2Var.a();
        } else {
            this.x0.add(pk2Var);
        }
        return new lk2(atomicReference);
    }

    @Override // defpackage.qd7
    public final bn6 o() {
        return (bn6) this.Y.c;
    }

    public final FragmentActivity o0() {
        FragmentActivity fragmentActivityF = F();
        if (fragmentActivityF != null) {
            return fragmentActivityF;
        }
        throw new IllegalStateException(dw1.m("Fragment ", this, " not attached to an activity."));
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.H = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        o0().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.H = true;
    }

    public final Bundle p0() {
        Bundle bundle = this.g;
        if (bundle != null) {
            return bundle;
        }
        throw new IllegalStateException(dw1.m("Fragment ", this, " does not have any arguments."));
    }

    public final Context q0() {
        Context contextH = H();
        if (contextH != null) {
            return contextH;
        }
        throw new IllegalStateException(dw1.m("Fragment ", this, " not attached to a context."));
    }

    public final d r0() {
        d dVar = this.y;
        if (dVar != null) {
            return dVar;
        }
        if (H() == null) {
            throw new IllegalStateException(dw1.m("Fragment ", this, " is not attached to any Fragment or host"));
        }
        throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + H());
    }

    public final View s0() {
        View view = this.J;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(dw1.m("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public final void startActivityForResult(Intent intent, int i) {
        if (this.w == null) {
            throw new IllegalStateException(dw1.m("Fragment ", this, " not attached to Activity"));
        }
        g gVarJ = J();
        if (gVarJ.D != null) {
            String str = this.f;
            FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo = new FragmentManager$LaunchedFragmentInfo();
            fragmentManager$LaunchedFragmentInfo.a = str;
            fragmentManager$LaunchedFragmentInfo.b = i;
            gVarJ.G.addLast(fragmentManager$LaunchedFragmentInfo);
            gVarJ.D.a(intent);
            return;
        }
        tk2 tk2Var = gVarJ.x;
        tk2Var.getClass();
        js3.p(intent, "intent");
        if (i != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        ContextCompat.startActivity(tk2Var.t, intent, null);
    }

    public final void t0(int i, int i2, int i3, int i4) {
        if (this.M == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        A().b = i;
        A().c = i2;
        A().d = i3;
        A().e = i4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f);
        if (this.z != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.z));
        }
        if (this.B != null) {
            sb.append(" tag=");
            sb.append(this.B);
        }
        sb.append(")");
        return sb.toString();
    }

    public final void u0(Bundle bundle) {
        g gVar = this.v;
        if (gVar != null) {
            if (gVar == null ? false : gVar.S()) {
                throw new IllegalStateException("Fragment already added and state has been saved");
            }
        }
        this.g = bundle;
    }

    public final void v(boolean z) {
        ViewGroup viewGroup;
        g gVar;
        qk2 qk2Var = this.M;
        if (qk2Var != null) {
            qk2Var.o = false;
        }
        if (this.J == null || (viewGroup = this.I) == null || (gVar = this.v) == null) {
            return;
        }
        c cVarJ = c.j(viewGroup, gVar);
        cVarJ.l();
        if (z) {
            this.w.u.post(new q6(13, cVarJ));
        } else {
            cVarJ.e();
        }
        Handler handler = this.N;
        if (handler != null) {
            handler.removeCallbacks(this.O);
            this.N = null;
        }
    }

    public final void v0(boolean z) {
        if (this.G != z) {
            this.G = z;
        }
    }

    public y40 w() {
        return new ok2(this);
    }

    public final void w0() {
        ym2 ym2Var = zm2.a;
        SetRetainInstanceUsageViolation setRetainInstanceUsageViolation = new SetRetainInstanceUsageViolation(this, "Attempting to set retain instance for fragment " + this);
        zm2.c(setRetainInstanceUsageViolation);
        ym2 ym2VarA = zm2.a(this);
        if (ym2VarA.a.contains(FragmentStrictMode$Flag.f) && zm2.e(ym2VarA, getClass(), SetRetainInstanceUsageViolation.class)) {
            zm2.b(ym2VarA, setRetainInstanceUsageViolation);
        }
        this.E = true;
        g gVar = this.v;
        if (gVar != null) {
            gVar.P.e(this);
        } else {
            this.F = true;
        }
    }

    public final void x0(boolean z) {
        ym2 ym2Var = zm2.a;
        SetUserVisibleHintViolation setUserVisibleHintViolation = new SetUserVisibleHintViolation(this, "Attempting to set user visible hint to " + z + " for fragment " + this);
        zm2.c(setUserVisibleHintViolation);
        ym2 ym2VarA = zm2.a(this);
        if (ym2VarA.a.contains(FragmentStrictMode$Flag.g) && zm2.e(ym2VarA, getClass(), SetUserVisibleHintViolation.class)) {
            zm2.b(ym2VarA, setUserVisibleHintViolation);
        }
        boolean z2 = false;
        if (!this.L && z && this.a < 5 && this.v != null && Q() && this.R) {
            g gVar = this.v;
            h hVarH = gVar.h(this);
            d dVar = hVarH.c;
            if (dVar.K) {
                if (gVar.b) {
                    gVar.L = true;
                } else {
                    dVar.K = false;
                    hVarH.k();
                }
            }
        }
        this.L = z;
        if (this.a < 5 && !z) {
            z2 = true;
        }
        this.K = z2;
        if (this.b != null) {
            this.e = Boolean.valueOf(z);
        }
    }

    public final void y0(Intent intent) {
        tk2 tk2Var = this.w;
        if (tk2Var == null) {
            throw new IllegalStateException(dw1.m("Fragment ", this, " not attached to Activity"));
        }
        js3.p(intent, "intent");
        ContextCompat.startActivity(tk2Var.t, intent, null);
    }

    public void z(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2;
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.z));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.A));
        printWriter.print(" mTag=");
        printWriter.println(this.B);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.a);
        printWriter.print(" mWho=");
        printWriter.print(this.f);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.u);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.l);
        printWriter.print(" mRemoving=");
        printWriter.print(this.m);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.p);
        printWriter.print(" mInLayout=");
        printWriter.println(this.q);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.C);
        printWriter.print(" mDetached=");
        printWriter.print(this.D);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.G);
        printWriter.print(" mHasMenu=");
        printWriter.println(false);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.E);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.L);
        if (this.v != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.v);
        }
        if (this.w != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.w);
        }
        if (this.y != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.y);
        }
        if (this.g != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.g);
        }
        if (this.b != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.b);
        }
        if (this.c != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.c);
        }
        if (this.d != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.d);
        }
        d dVarC = this.h;
        if (dVarC == null) {
            g gVar = this.v;
            dVarC = (gVar == null || (str2 = this.i) == null) ? null : gVar.c.C(str2);
        }
        if (dVarC != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(dVarC);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.j);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        qk2 qk2Var = this.M;
        printWriter.println(qk2Var == null ? false : qk2Var.a);
        qk2 qk2Var2 = this.M;
        if ((qk2Var2 == null ? 0 : qk2Var2.b) != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            qk2 qk2Var3 = this.M;
            printWriter.println(qk2Var3 == null ? 0 : qk2Var3.b);
        }
        qk2 qk2Var4 = this.M;
        if ((qk2Var4 == null ? 0 : qk2Var4.c) != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            qk2 qk2Var5 = this.M;
            printWriter.println(qk2Var5 == null ? 0 : qk2Var5.c);
        }
        qk2 qk2Var6 = this.M;
        if ((qk2Var6 == null ? 0 : qk2Var6.d) != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            qk2 qk2Var7 = this.M;
            printWriter.println(qk2Var7 == null ? 0 : qk2Var7.d);
        }
        qk2 qk2Var8 = this.M;
        if ((qk2Var8 == null ? 0 : qk2Var8.e) != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            qk2 qk2Var9 = this.M;
            printWriter.println(qk2Var9 != null ? qk2Var9.e : 0);
        }
        if (this.I != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.I);
        }
        if (this.J != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.J);
        }
        if (H() != null) {
            new hh2(this, m()).x(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.x + ":");
        this.x.x(t61.i(str, "  "), fileDescriptor, printWriter, strArr);
    }
}
