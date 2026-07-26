package defpackage;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.SparseIntArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import io.sentry.android.core.t0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class wh9 implements iu2, ju2 {
    public final sl o;
    public final cm p;
    public final rn6 q;
    public final int t;
    public final hi9 u;
    public boolean v;
    public final /* synthetic */ ku2 z;
    public final LinkedList n = new LinkedList();
    public final HashSet r = new HashSet();
    public final HashMap s = new HashMap();
    public final ArrayList w = new ArrayList();
    public ConnectionResult x = null;
    public int y = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public wh9(ku2 ku2Var, fu2 fu2Var) {
        this.z = ku2Var;
        jx jxVar = ku2Var.m;
        Looper looper = jxVar.getLooper();
        wv8 wv8VarA = fu2Var.a();
        on onVar = new on((zv) wv8VarA.b, (String) wv8VarA.c, (String) wv8VarA.d);
        ml9 ml9Var = (ml9) fu2Var.d.a;
        rq4.n(ml9Var);
        sl slVarI = ml9Var.i(fu2Var.a, looper, onVar, fu2Var.e, this, this);
        ey eyVar = fu2Var.c;
        if (eyVar == null || !(slVarI instanceof d70)) {
            String str = fu2Var.b;
            if (str != null && (slVarI instanceof d70)) {
                ((d70) slVarI).setAttributionTag(str);
            }
        } else {
            ((d70) slVarI).setAttributionSourceWrapper(eyVar);
        }
        this.o = slVarI;
        this.p = fu2Var.f;
        this.q = new rn6(17);
        this.t = fu2Var.h;
        if (!slVarI.requiresSignIn()) {
            this.u = null;
            return;
        }
        Context context = ku2Var.e;
        wv8 wv8VarA2 = fu2Var.a();
        this.u = new hi9(context, jxVar, new on((zv) wv8VarA2.b, (String) wv8VarA2.c, (String) wv8VarA2.d));
    }

    @Override // defpackage.iu2
    public final void L() {
        ku2 ku2Var = this.z;
        if (Looper.myLooper() == ku2Var.m.getLooper()) {
            a();
        } else {
            ku2Var.m.post(new fp7(11, this));
        }
    }

    public final void a() {
        Object obj = this.o;
        ku2 ku2Var = this.z;
        rq4.j(ku2Var.m);
        this.x = null;
        j(ConnectionResult.f);
        if (this.v) {
            jx jxVar = ku2Var.m;
            cm cmVar = this.p;
            jxVar.removeMessages(11, cmVar);
            ku2Var.m.removeMessages(9, cmVar);
            this.v = false;
        }
        Iterator it = this.s.values().iterator();
        while (it.hasNext()) {
            cf0 cf0Var = ((gi9) it.next()).a;
            try {
                ((q37) ((jx9) cf0Var.e).b).accept(obj, new cf8());
            } catch (DeadObjectException unused) {
                onConnectionSuspended(3);
                ((d70) obj).disconnect("DeadObjectException thrown while calling register listener method.");
            } catch (RemoteException e) {
                e = e;
                t0.e("GoogleApiManager", "Failed to register listener on re-connection.", e);
                it.remove();
            } catch (RuntimeException e2) {
                e = e2;
                t0.e("GoogleApiManager", "Failed to register listener on re-connection.", e);
                it.remove();
            }
        }
        d();
        h();
    }

    public final void b(int i) {
        rq4.j(this.z.m);
        this.x = null;
        this.v = true;
        String lastDisconnectMessage = ((d70) this.o).getLastDisconnectMessage();
        rn6 rn6Var = this.q;
        rn6Var.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (lastDisconnectMessage != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(lastDisconnectMessage);
        }
        rn6Var.A(new Status(20, sb.toString(), null, null), true);
        cm cmVar = this.p;
        ku2 ku2Var = this.z;
        jx jxVar = ku2Var.m;
        jxVar.sendMessageDelayed(Message.obtain(jxVar, 9, cmVar), 5000L);
        jx jxVar2 = ku2Var.m;
        jxVar2.sendMessageDelayed(Message.obtain(jxVar2, 11, cmVar), 120000L);
        SparseIntArray sparseIntArray = (SparseIntArray) ku2Var.g.b;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
        Iterator it = this.s.values().iterator();
        while (it.hasNext()) {
            ((gi9) it.next()).getClass();
        }
    }

    public final boolean c(ConnectionResult connectionResult) {
        synchronized (ku2.q) {
            this.z.getClass();
        }
        return false;
    }

    public final void d() {
        LinkedList linkedList = this.n;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ri9 ri9Var = (ri9) arrayList.get(i);
            if (!((d70) this.o).isConnected()) {
                return;
            }
            if (e(ri9Var)) {
                linkedList.remove(ri9Var);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean e(ri9 ri9Var) {
        if (!(ri9Var instanceof ci9)) {
            rn6 rn6Var = this.q;
            sl slVar = this.o;
            ri9Var.c(rn6Var, slVar.requiresSignIn());
            try {
                ri9Var.d(this);
                return true;
            } catch (DeadObjectException unused) {
                onConnectionSuspended(1);
                ((d70) slVar).disconnect("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        ci9 ci9Var = (ci9) ri9Var;
        Feature[] featureArrF = ci9Var.f(this);
        Feature feature = null;
        if (featureArrF != null && featureArrF.length != 0) {
            Feature[] availableFeatures = ((d70) this.o).getAvailableFeatures();
            if (availableFeatures == null) {
                availableFeatures = new Feature[0];
            }
            wv wvVar = new wv(availableFeatures.length);
            for (Feature feature2 : availableFeatures) {
                wvVar.put(feature2.a, Long.valueOf(feature2.u()));
            }
            for (Feature feature3 : featureArrF) {
                Long l = (Long) wvVar.get(feature3.a);
                if (l == null || l.longValue() < feature3.u()) {
                    feature = feature3;
                    break;
                }
            }
        }
        if (feature == null) {
            rn6 rn6Var2 = this.q;
            sl slVar2 = this.o;
            ri9Var.c(rn6Var2, slVar2.requiresSignIn());
            try {
                ri9Var.d(this);
                return true;
            } catch (DeadObjectException unused2) {
                onConnectionSuspended(1);
                ((d70) slVar2).disconnect("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        String name = this.o.getClass().getName();
        String str = feature.a;
        long jU = feature.u();
        StringBuilder sb = new StringBuilder(name.length() + 53 + String.valueOf(str).length() + 2 + String.valueOf(jU).length() + 2);
        o40.I(name, " could not execute call because it requires feature (", str, ", ", sb);
        sb.append(jU);
        sb.append(").");
        t0.m("GoogleApiManager", sb.toString());
        ku2 ku2Var = this.z;
        if (!ku2Var.n || !ci9Var.g(this)) {
            ci9Var.b(new UnsupportedApiCallException(feature));
            return true;
        }
        int iH = ci9Var.h(this);
        xh9 xh9Var = new xh9(this.p, feature);
        ArrayList arrayList = this.w;
        int iIndexOf = arrayList.indexOf(xh9Var);
        if (iIndexOf >= 0) {
            xh9 xh9Var2 = (xh9) arrayList.get(iIndexOf);
            ku2Var.m.removeMessages(15, xh9Var2);
            ku2Var.m.sendMessageDelayed(Message.obtain(ku2Var.m, 15, xh9Var2), 5000L);
            return false;
        }
        arrayList.add(xh9Var);
        ku2Var.m.sendMessageDelayed(Message.obtain(ku2Var.m, 15, xh9Var), 5000L);
        ku2Var.m.sendMessageDelayed(Message.obtain(ku2Var.m, 16, xh9Var), 120000L);
        ConnectionResult connectionResult = new ConnectionResult(1, 2, null, null, Integer.valueOf(iH));
        if (c(connectionResult)) {
            String str2 = feature.a;
            long jU2 = feature.u();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 61 + String.valueOf(jU2).length());
            t61.y(sb2, "A dialog should be displayed for missing feature: ", str2, ", version: ");
            sb2.append(jU2);
            t0.m("GoogleApiManager", sb2.toString());
            return false;
        }
        if (!ku2Var.f(connectionResult, this.t)) {
            return false;
        }
        String str3 = feature.a;
        long jU3 = feature.u();
        StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 55 + String.valueOf(jU3).length());
        t61.y(sb3, "Notification displayed for missing feature: ", str3, ", version: ");
        sb3.append(jU3);
        t0.m("GoogleApiManager", sb3.toString());
        return false;
    }

    public final void f(Status status, Exception exc, boolean z) {
        rq4.j(this.z.m);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.n.iterator();
        while (it.hasNext()) {
            ri9 ri9Var = (ri9) it.next();
            if (!z || ri9Var.a == 2) {
                if (status != null) {
                    ri9Var.a(status);
                } else {
                    ri9Var.b(exc);
                }
                it.remove();
            }
        }
    }

    public final void g(Status status) {
        rq4.j(this.z.m);
        f(status, null, false);
    }

    public final void h() {
        ku2 ku2Var = this.z;
        jx jxVar = ku2Var.m;
        cm cmVar = this.p;
        jxVar.removeMessages(12, cmVar);
        jx jxVar2 = ku2Var.m;
        jxVar2.sendMessageDelayed(jxVar2.obtainMessage(12, cmVar), ku2Var.a);
    }

    public final boolean i(boolean z) {
        rq4.j(this.z.m);
        d70 d70Var = (d70) this.o;
        if (!d70Var.isConnected() || !this.s.isEmpty()) {
            return false;
        }
        rn6 rn6Var = this.q;
        if (((Map) rn6Var.b).isEmpty() && ((Map) rn6Var.c).isEmpty()) {
            d70Var.disconnect("Timing out service connection.");
            return true;
        }
        if (!z) {
            return false;
        }
        h();
        return false;
    }

    public final void j(ConnectionResult connectionResult) {
        HashSet hashSet = this.r;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
        } else {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (vy2.w(connectionResult, ConnectionResult.f)) {
                ((d70) this.o).getEndpointPackageName();
            }
            throw null;
        }
    }

    public final void k(ConnectionResult connectionResult) {
        rq4.j(this.z.m);
        Object obj = this.o;
        String name = obj.getClass().getName();
        String strValueOf = String.valueOf(connectionResult);
        d70 d70Var = (d70) obj;
        d70Var.disconnect(dw1.p("onSignInFailed for ", name, " with ", strValueOf, new StringBuilder(name.length() + 25 + strValueOf.length())));
        l(connectionResult, null);
    }

    public final void l(ConnectionResult connectionResult, RuntimeException runtimeException) {
        bw7 bw7Var;
        ku2 ku2Var = this.z;
        rq4.j(ku2Var.m);
        hi9 hi9Var = this.u;
        if (hi9Var != null && (bw7Var = hi9Var.t) != null) {
            bw7Var.disconnect();
        }
        rq4.j(this.z.m);
        this.x = null;
        SparseIntArray sparseIntArray = (SparseIntArray) ku2Var.g.b;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
        j(connectionResult);
        if ((this.o instanceof aj9) && connectionResult.b != 24) {
            ku2Var.b = true;
            jx jxVar = ku2Var.m;
            jxVar.sendMessageDelayed(jxVar.obtainMessage(19), 300000L);
        }
        int i = connectionResult.b;
        if (i == 4) {
            g(ku2.p);
            return;
        }
        if (i == 25) {
            g(ku2.c(this.p, connectionResult));
            return;
        }
        LinkedList linkedList = this.n;
        if (linkedList.isEmpty()) {
            this.x = connectionResult;
            return;
        }
        if (runtimeException != null) {
            rq4.j(ku2Var.m);
            f(null, runtimeException, false);
            return;
        }
        if (!ku2Var.n) {
            g(ku2.c(this.p, connectionResult));
            return;
        }
        cm cmVar = this.p;
        f(ku2.c(cmVar, connectionResult), null, true);
        if (linkedList.isEmpty() || c(connectionResult) || ku2Var.f(connectionResult, this.t)) {
            return;
        }
        if (connectionResult.b == 18) {
            this.v = true;
        }
        if (!this.v) {
            g(ku2.c(cmVar, connectionResult));
        } else {
            jx jxVar2 = ku2Var.m;
            jxVar2.sendMessageDelayed(Message.obtain(jxVar2, 9, cmVar), 5000L);
        }
    }

    public final void m(ri9 ri9Var) {
        rq4.j(this.z.m);
        boolean zIsConnected = ((d70) this.o).isConnected();
        LinkedList linkedList = this.n;
        if (zIsConnected) {
            if (e(ri9Var)) {
                h();
                return;
            } else {
                linkedList.add(ri9Var);
                return;
            }
        }
        linkedList.add(ri9Var);
        ConnectionResult connectionResult = this.x;
        if (connectionResult == null || connectionResult.b == 0 || connectionResult.c == null) {
            o();
        } else {
            l(connectionResult, null);
        }
    }

    public final void n() {
        rq4.j(this.z.m);
        Status status = ku2.o;
        g(status);
        this.q.A(status, false);
        for (o94 o94Var : (o94[]) this.s.keySet().toArray(new o94[0])) {
            m(new oi9(o94Var, new cf8()));
        }
        j(new ConnectionResult(4, null, null));
        d70 d70Var = (d70) this.o;
        if (d70Var.isConnected()) {
            d70Var.onUserSignOut(new ut4(20, this));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void o() {
        ku2 ku2Var = this.z;
        rq4.j(ku2Var.m);
        sl slVar = this.o;
        d70 d70Var = (d70) slVar;
        if (d70Var.isConnected() || d70Var.isConnecting()) {
            return;
        }
        try {
            int iW = ku2Var.g.w(ku2Var.e, slVar);
            if (iW != 0) {
                ConnectionResult connectionResult = new ConnectionResult(iW, null, null);
                String name = slVar.getClass().getName();
                String string = connectionResult.toString();
                StringBuilder sb = new StringBuilder(name.length() + 35 + string.length());
                sb.append("The service for ");
                sb.append(name);
                sb.append(" is not available: ");
                sb.append(string);
                t0.m("GoogleApiManager", sb.toString());
                l(connectionResult, null);
                return;
            }
            gg1 gg1Var = new gg1(ku2Var, slVar, this.p);
            if (slVar.requiresSignIn()) {
                hi9 hi9Var = this.u;
                rq4.n(hi9Var);
                bw7 bw7Var = hi9Var.t;
                if (bw7Var != null) {
                    bw7Var.disconnect();
                }
                on onVar = hi9Var.s;
                onVar.f = Integer.valueOf(System.identityHashCode(hi9Var));
                qh9 qh9Var = hi9Var.q;
                Context context = hi9Var.o;
                Handler handler = hi9Var.p;
                hi9Var.t = (bw7) qh9Var.i(context, handler.getLooper(), onVar, (cw7) onVar.e, hi9Var, hi9Var);
                hi9Var.u = gg1Var;
                Set set = hi9Var.r;
                if (set == null || set.isEmpty()) {
                    handler.post(new fp7(hi9Var));
                } else {
                    bw7 bw7Var2 = hi9Var.t;
                    bw7Var2.getClass();
                    bw7Var2.connect(new ca7(bw7Var2));
                }
            }
            try {
                d70Var.connect(gg1Var);
            } catch (SecurityException e) {
                l(new ConnectionResult(10, null, null), e);
            }
        } catch (IllegalStateException e2) {
            l(new ConnectionResult(10, null, null), e2);
        }
    }

    @Override // defpackage.ju2
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        l(connectionResult, null);
    }

    @Override // defpackage.iu2
    public final void onConnectionSuspended(int i) {
        ku2 ku2Var = this.z;
        if (Looper.myLooper() == ku2Var.m.getLooper()) {
            b(i);
        } else {
            ku2Var.m.post(new bm0(i, 6, this));
        }
    }
}
