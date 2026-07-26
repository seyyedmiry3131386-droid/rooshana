package defpackage;

import android.R;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.gms.internal.measurement.n0;
import com.google.common.collect.ImmutableList;
import com.google.firebase.components.DependencyException;
import ir.myket.network.server.c;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.Inflater;
import org.pcap4j.packet.namednumber.EtherType;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes.dex */
public final class o77 implements hy0, il0, a49, cb8 {
    public static o77 e;
    public Object a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ o77(Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    public static o77 t() {
        if (e == null) {
            e = new o77(5);
        }
        return e;
    }

    public void A(x47 x47Var, ry ryVar) {
        List list;
        bk0 bk0Var = (bk0) ryVar.d;
        if (bk0Var != null) {
            if (bk0Var.e >= System.currentTimeMillis()) {
                String strH = x47Var.h();
                synchronized (this) {
                    list = (List) ((HashMap) this.a).remove(strH);
                }
                if (list != null) {
                    if (cb9.a) {
                        list.size();
                    }
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((ca7) this.b).i((x47) it.next(), ryVar, null);
                    }
                    return;
                }
                return;
            }
        }
        z(x47Var);
    }

    public void B(o90 o90Var) {
        synchronized (this.a) {
            try {
                if (v(o90Var)) {
                    yz7 yz7Var = (yz7) this.c;
                    if (!yz7Var.c) {
                        yz7Var.c = true;
                        ((Handler) this.b).removeCallbacksAndMessages(yz7Var);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void C(o90 o90Var) {
        synchronized (this.a) {
            try {
                if (v(o90Var)) {
                    yz7 yz7Var = (yz7) this.c;
                    if (yz7Var.c) {
                        yz7Var.c = false;
                        D(yz7Var);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void D(yz7 yz7Var) {
        Handler handler = (Handler) this.b;
        int i = yz7Var.b;
        if (i == -2) {
            return;
        }
        if (i <= 0) {
            i = i == -1 ? EtherType.IEEE802_3_MAX_LENGTH : 2750;
        }
        handler.removeCallbacksAndMessages(yz7Var);
        handler.sendMessageDelayed(Message.obtain(handler, 0, yz7Var), i);
    }

    public Set E(Class cls) {
        return b(so6.a(cls));
    }

    public void F() {
        yz7 yz7Var = (yz7) this.d;
        if (yz7Var != null) {
            this.c = yz7Var;
            this.d = null;
            o90 o90Var = (o90) yz7Var.a.get();
            if (o90Var == null) {
                this.c = null;
            } else {
                Handler handler = r90.B;
                handler.sendMessage(handler.obtainMessage(0, o90Var.a));
            }
        }
    }

    public void G() {
        int iC;
        vo4 vo4Var = (vo4) this.b;
        ut4 ut4Var = (ut4) this.a;
        ViewPager2 viewPager2 = (ViewPager2) this.d;
        int i = R.id.accessibilityActionPageLeft;
        q69.n(R.id.accessibilityActionPageLeft, viewPager2);
        q69.j(0, viewPager2);
        q69.n(R.id.accessibilityActionPageRight, viewPager2);
        q69.j(0, viewPager2);
        q69.n(R.id.accessibilityActionPageUp, viewPager2);
        q69.j(0, viewPager2);
        q69.n(R.id.accessibilityActionPageDown, viewPager2);
        q69.j(0, viewPager2);
        if (viewPager2.getAdapter() == null || (iC = viewPager2.getAdapter().c()) == 0 || !viewPager2.r) {
            return;
        }
        if (viewPager2.getOrientation() != 0) {
            if (viewPager2.d < iC - 1) {
                q69.o(viewPager2, new o3(R.id.accessibilityActionPageDown, (String) null), null, ut4Var);
            }
            if (viewPager2.d > 0) {
                q69.o(viewPager2, new o3(R.id.accessibilityActionPageUp, (String) null), null, vo4Var);
                return;
            }
            return;
        }
        boolean z = viewPager2.g.b.getLayoutDirection() == 1;
        int i2 = z ? 16908360 : 16908361;
        if (z) {
            i = 16908361;
        }
        if (viewPager2.d < iC - 1) {
            q69.o(viewPager2, new o3(i2, (String) null), null, ut4Var);
        }
        if (viewPager2.d > 0) {
            q69.o(viewPager2, new o3(i, (String) null), null, vo4Var);
        }
    }

    public xk9 H(o77 o77Var, n0... n0VarArr) {
        xk9 xk9VarU = xk9.p0;
        for (n0 n0Var : n0VarArr) {
            xk9VarU = a77.u(n0Var);
            c67.y((o77) this.c);
            if ((xk9VarU instanceof zk9) || (xk9VarU instanceof vk9)) {
                xk9VarU = ((rn6) this.a).D(o77Var, xk9VarU);
            }
        }
        return xk9VarU;
    }

    public xk9 I(xk9 xk9Var) {
        return ((rn6) this.b).D(this, xk9Var);
    }

    public xk9 J(gk9 gk9Var) {
        xk9 xk9VarD = xk9.p0;
        Iterator itN = gk9Var.n();
        while (itN.hasNext()) {
            xk9VarD = ((rn6) this.b).D(this, gk9Var.p(((Integer) itN.next()).intValue()));
            if (xk9VarD instanceof mk9) {
                break;
            }
        }
        return xk9VarD;
    }

    public o77 K() {
        return new o77(this, (rn6) this.b);
    }

    public boolean L(String str) {
        if (((HashMap) this.c).containsKey(str)) {
            return true;
        }
        o77 o77Var = (o77) this.a;
        if (o77Var != null) {
            return o77Var.L(str);
        }
        return false;
    }

    public void M(String str, xk9 xk9Var) {
        o77 o77Var;
        HashMap map = (HashMap) this.c;
        if (!map.containsKey(str) && (o77Var = (o77) this.a) != null && o77Var.L(str)) {
            o77Var.M(str, xk9Var);
        } else {
            if (((HashMap) this.d).containsKey(str)) {
                return;
            }
            if (xk9Var == null) {
                map.remove(str);
            } else {
                map.put(str, xk9Var);
            }
        }
    }

    public void N(String str, xk9 xk9Var) {
        HashMap map = (HashMap) this.c;
        if (((HashMap) this.d).containsKey(str)) {
            return;
        }
        if (xk9Var == null) {
            map.remove(str);
        } else {
            map.put(str, xk9Var);
        }
    }

    public xk9 O(String str) {
        HashMap map = (HashMap) this.c;
        if (map.containsKey(str)) {
            return (xk9) map.get(str);
        }
        o77 o77Var = (o77) this.a;
        if (o77Var != null) {
            return o77Var.O(str);
        }
        throw new IllegalArgumentException(t61.i(str, " is not defined"));
    }

    @Override // defpackage.x39
    public /* synthetic */ boolean a() {
        return false;
    }

    @Override // defpackage.hy0
    public Set b(so6 so6Var) {
        if (((Set) this.c).contains(so6Var)) {
            return ((hy0) this.d).b(so6Var);
        }
        throw new DependencyException("Attempting to request an undeclared dependency Set<" + so6Var + ">.");
    }

    @Override // defpackage.hy0
    public qn6 c(Class cls) {
        return f(so6.a(cls));
    }

    @Override // defpackage.cb8
    public /* synthetic */ ta8 d(byte[] bArr, int i, int i2) {
        return rm7.e(this, bArr, i2);
    }

    @Override // defpackage.il0
    public void e(dl0 dl0Var, h77 h77Var) {
        c cVar = (c) this.c;
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.d;
        g77 g77Var = h77Var.a;
        int i = 0;
        if (g77Var.d / 100 == 5 && atomicBoolean.getAndSet(false)) {
            ((dl0) this.a).clone().l0(this);
            return;
        }
        se3 se3Var = dl0Var.b1().a;
        String strJ = t61.j(se3Var.a, "://", se3Var.d);
        if (g77Var.q) {
            cVar.d(strJ, !atomicBoolean.get());
        } else {
            HttpException httpException = new HttpException(h77Var);
            js3.p(strJ, "baseUrl");
            int i2 = httpException.a;
            if (300 <= i2 && i2 < 400) {
                i = 5;
            } else if (400 > i2 || i2 >= 500) {
                i = 10;
            }
            cVar.c(i, strJ);
        }
        ((il0) this.b).e(dl0Var, h77Var);
    }

    @Override // defpackage.hy0
    public qn6 f(so6 so6Var) {
        if (((Set) this.b).contains(so6Var)) {
            return ((hy0) this.d).f(so6Var);
        }
        throw new DependencyException("Attempting to request an undeclared dependency Provider<" + so6Var + ">.");
    }

    @Override // defpackage.hy0
    public Object g(so6 so6Var) {
        if (((Set) this.a).contains(so6Var)) {
            return ((hy0) this.d).g(so6Var);
        }
        throw new DependencyException("Attempting to request an undeclared dependency " + so6Var + ".");
    }

    @Override // defpackage.hy0
    public Object get(Class cls) {
        if (!((Set) this.a).contains(so6.a(cls))) {
            throw new DependencyException(bl4.t(cls, "Attempting to request an undeclared dependency ", "."));
        }
        Object obj = ((hy0) this.d).get(cls);
        if (!cls.equals(vn6.class)) {
            return obj;
        }
        return new n77();
    }

    @Override // defpackage.x39
    public dl h(long j, dl dlVar, dl dlVar2, dl dlVar3) {
        if (((dl) this.c) == null) {
            this.c = dlVar3.c();
        }
        dl dlVar4 = (dl) this.c;
        if (dlVar4 == null) {
            js3.V("velocityVector");
            throw null;
        }
        int iB = dlVar4.b();
        for (int i = 0; i < iB; i++) {
            dl dlVar5 = (dl) this.c;
            if (dlVar5 == null) {
                js3.V("velocityVector");
                throw null;
            }
            dlVar5.e(i, ((el) this.a).get(i).b(j, dlVar.a(i), dlVar2.a(i), dlVar3.a(i)));
        }
        dl dlVar6 = (dl) this.c;
        if (dlVar6 != null) {
            return dlVar6;
        }
        js3.V("velocityVector");
        throw null;
    }

    public void i(String str) {
        re3 re3Var = new re3(0);
        re3Var.e(null, str);
        se3 se3VarB = re3Var.b();
        if ("".equals(se3VarB.f.get(r0.size() - 1))) {
            this.b = se3VarB;
        } else {
            throw new IllegalArgumentException("baseUrl must end in /: " + se3VarB);
        }
    }

    public k87 j() {
        ArrayList arrayList = (ArrayList) this.c;
        if (((se3) this.b) == null) {
            throw new IllegalStateException("Base URL required.");
        }
        hs5 hs5Var = (hs5) this.a;
        if (hs5Var == null) {
            hs5Var = new hs5();
        }
        hs5 hs5Var2 = hs5Var;
        vg vgVar = l96.a;
        gv gvVar = l96.c;
        ArrayList arrayList2 = new ArrayList((ArrayList) this.d);
        List listP = gvVar.p(vgVar);
        arrayList2.addAll(listP);
        List listQ = gvVar.q();
        ArrayList arrayList3 = new ArrayList(arrayList.size() + 1 + listQ.size());
        arrayList3.add(new uh0(0));
        arrayList3.addAll(arrayList);
        arrayList3.addAll(listQ);
        se3 se3Var = (se3) this.b;
        List listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList3);
        List listUnmodifiableList2 = DesugarCollections.unmodifiableList(arrayList2);
        listP.size();
        return new k87(hs5Var2, se3Var, listUnmodifiableList, listUnmodifiableList2, vgVar);
    }

    public boolean l(yz7 yz7Var, int i) {
        o90 o90Var = (o90) yz7Var.a.get();
        if (o90Var == null) {
            return false;
        }
        ((Handler) this.b).removeCallbacksAndMessages(yz7Var);
        Handler handler = r90.B;
        handler.sendMessage(handler.obtainMessage(1, i, 0, o90Var.a));
        return true;
    }

    @Override // defpackage.cb8
    public void m(byte[] bArr, int i, int i2, bb8 bb8Var, n31 n31Var) {
        Rect rect;
        h26 h26Var = (h26) this.a;
        h26Var.H(i + i2, bArr);
        h26Var.J(i);
        h26 h26Var2 = (h26) this.b;
        xa9 xa9Var = (xa9) this.c;
        if (((Inflater) this.d) == null) {
            this.d = new Inflater();
        }
        Inflater inflater = (Inflater) this.d;
        String str = j29.a;
        if (h26Var.a() > 0 && (h26Var.a[h26Var.b] & 255) == 120 && j29.P(h26Var, h26Var2, inflater)) {
            h26Var.H(h26Var2.c, h26Var2.a);
        }
        xa9Var.c = false;
        l81 l81Var = null;
        xa9Var.g = null;
        xa9Var.h = -1;
        xa9Var.i = -1;
        int iA = h26Var.a();
        if (iA >= 2 && h26Var.D() == iA) {
            int[] iArr = xa9Var.d;
            if (iArr != null && xa9Var.b) {
                h26Var.K(h26Var.D() - 2);
                int iD = h26Var.D();
                int[] iArr2 = xa9Var.a;
                while (h26Var.b < iD && h26Var.a() > 0) {
                    switch (h26Var.x()) {
                        case 3:
                            if (h26Var.a() >= 2) {
                                int iX = h26Var.x();
                                int iX2 = h26Var.x();
                                iArr2[3] = xa9.a(iArr, iX >> 4);
                                iArr2[2] = xa9.a(iArr, iX & 15);
                                iArr2[1] = xa9.a(iArr, iX2 >> 4);
                                iArr2[0] = xa9.a(iArr, iX2 & 15);
                                xa9Var.c = true;
                            }
                            break;
                        case 4:
                            if (h26Var.a() >= 2 && xa9Var.c) {
                                int iX3 = h26Var.x();
                                int iX4 = h26Var.x();
                                iArr2[3] = xa9.c(iArr2[3], iX3 >> 4);
                                iArr2[2] = xa9.c(iArr2[2], iX3 & 15);
                                iArr2[1] = xa9.c(iArr2[1], iX4 >> 4);
                                iArr2[0] = xa9.c(iArr2[0], iX4 & 15);
                            }
                            break;
                        case 5:
                            if (h26Var.a() >= 6) {
                                int iX5 = h26Var.x();
                                int iX6 = h26Var.x();
                                int i3 = (iX5 << 4) | (iX6 >> 4);
                                int iX7 = ((iX6 & 15) << 8) | h26Var.x();
                                int iX8 = h26Var.x();
                                int iX9 = h26Var.x();
                                xa9Var.g = new Rect(i3, (iX8 << 4) | (iX9 >> 4), iX7 + 1, (((iX9 & 15) << 8) | h26Var.x()) + 1);
                            }
                            break;
                        case 6:
                            if (h26Var.a() >= 4) {
                                xa9Var.h = h26Var.D();
                                xa9Var.i = h26Var.D();
                            }
                            break;
                    }
                }
            }
            if (xa9Var.d != null && xa9Var.b && xa9Var.c && (rect = xa9Var.g) != null && xa9Var.h != -1 && xa9Var.i != -1 && rect.width() >= 2 && xa9Var.g.height() >= 2) {
                Rect rect2 = xa9Var.g;
                int[] iArr3 = new int[rect2.height() * rect2.width()];
                ao0 ao0Var = new ao0();
                h26Var.J(xa9Var.h);
                ao0Var.p(h26Var);
                xa9Var.b(ao0Var, true, rect2, iArr3);
                h26Var.J(xa9Var.i);
                ao0Var.p(h26Var);
                xa9Var.b(ao0Var, false, rect2, iArr3);
                l81Var = new l81(null, null, null, Bitmap.createBitmap(iArr3, rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888), rect2.top / xa9Var.f, 0, 0, rect2.left / xa9Var.e, 0, Integer.MIN_VALUE, -3.4028235E38f, rect2.width() / xa9Var.e, rect2.height() / xa9Var.f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
            }
        }
        n31Var.accept(new o81(l81Var != null ? ImmutableList.s(l81Var) : ImmutableList.q(), -9223372036854775807L, 5000000L));
    }

    public xb8 n(k6 k6Var) {
        ArrayList arrayList = (ArrayList) this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            xb8 xb8Var = (xb8) arrayList.get(i);
            if (xb8Var != null && xb8Var.b == k6Var) {
                return xb8Var;
            }
        }
        xb8 xb8Var2 = new xb8((Context) this.b, k6Var);
        arrayList.add(xb8Var2);
        return xb8Var2;
    }

    @Override // defpackage.il0
    public void o(dl0 dl0Var, Throwable th) {
        if ((th instanceof IOException) && ((AtomicBoolean) this.d).getAndSet(false)) {
            ((dl0) this.a).clone().l0(this);
            return;
        }
        se3 se3Var = dl0Var.b1().a;
        String strJ = t61.j(se3Var.a, "://", se3Var.d);
        c cVar = (c) this.c;
        y97 y97VarB = js3.B(th);
        js3.p(strJ, "baseUrl");
        g27.a(y97VarB.getClass()).d();
        cVar.c(y97VarB.C(), strJ);
        ((il0) this.b).o(dl0Var, th);
    }

    @Override // defpackage.x39
    public dl q(long j, dl dlVar, dl dlVar2, dl dlVar3) {
        if (((dl) this.b) == null) {
            this.b = dlVar.c();
        }
        dl dlVar4 = (dl) this.b;
        if (dlVar4 == null) {
            js3.V("valueVector");
            throw null;
        }
        int iB = dlVar4.b();
        for (int i = 0; i < iB; i++) {
            dl dlVar5 = (dl) this.b;
            if (dlVar5 == null) {
                js3.V("valueVector");
                throw null;
            }
            dlVar5.e(i, ((el) this.a).get(i).e(j, dlVar.a(i), dlVar2.a(i), dlVar3.a(i)));
        }
        dl dlVar6 = (dl) this.b;
        if (dlVar6 != null) {
            return dlVar6;
        }
        js3.V("valueVector");
        throw null;
    }

    @Override // defpackage.x39
    public dl r(dl dlVar, dl dlVar2, dl dlVar3) {
        if (((dl) this.d) == null) {
            this.d = dlVar3.c();
        }
        dl dlVar4 = (dl) this.d;
        if (dlVar4 == null) {
            js3.V("endVelocityVector");
            throw null;
        }
        int iB = dlVar4.b();
        for (int i = 0; i < iB; i++) {
            dl dlVar5 = (dl) this.d;
            if (dlVar5 == null) {
                js3.V("endVelocityVector");
                throw null;
            }
            dlVar5.e(i, ((el) this.a).get(i).d(dlVar.a(i), dlVar2.a(i), dlVar3.a(i)));
        }
        dl dlVar6 = (dl) this.d;
        if (dlVar6 != null) {
            return dlVar6;
        }
        js3.V("endVelocityVector");
        throw null;
    }

    @Override // defpackage.cb8
    public /* synthetic */ void reset() {
    }

    @Override // defpackage.x39
    public long s(dl dlVar, dl dlVar2, dl dlVar3) {
        int iB = dlVar.b();
        long jMax = 0;
        for (int i = 0; i < iB; i++) {
            jMax = Math.max(jMax, ((el) this.a).get(i).c(dlVar.a(i), dlVar2.a(i), dlVar3.a(i)));
        }
        return jMax;
    }

    public k79 u(ps0 ps0Var, String str) {
        k79 k79Var;
        k79 k79VarA;
        js3.p(str, "key");
        synchronized (((sl3) this.d)) {
            try {
                u79 u79Var = (u79) this.a;
                u79Var.getClass();
                k79Var = (k79) u79Var.a.get(str);
                if (ps0Var.e(k79Var)) {
                    q79 q79Var = (q79) this.b;
                    if (q79Var instanceof rd7) {
                        rd7 rd7Var = (rd7) q79Var;
                        js3.m(k79Var);
                        i64 i64Var = rd7Var.d;
                        if (i64Var != null) {
                            bn6 bn6Var = rd7Var.e;
                            js3.m(bn6Var);
                            m91.h(k79Var, bn6Var, i64Var);
                        }
                    }
                    js3.n(k79Var, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.internal.ViewModelProviderImpl.getViewModel");
                } else {
                    ta5 ta5Var = new ta5((l71) this.c);
                    ta5Var.a.put(r79.c, str);
                    q79 q79Var2 = (q79) this.b;
                    js3.p(q79Var2, "factory");
                    try {
                        try {
                            k79VarA = q79Var2.c(ps0Var, ta5Var);
                        } catch (AbstractMethodError unused) {
                            k79VarA = q79Var2.a(yh0.u(ps0Var));
                        }
                    } catch (AbstractMethodError unused2) {
                        k79VarA = q79Var2.b(yh0.u(ps0Var), ta5Var);
                    }
                    k79Var = k79VarA;
                    u79 u79Var2 = (u79) this.a;
                    u79Var2.getClass();
                    js3.p(k79Var, "viewModel");
                    k79 k79Var2 = (k79) u79Var2.a.put(str, k79Var);
                    if (k79Var2 != null) {
                        k79Var2.b();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return k79Var;
    }

    public boolean v(o90 o90Var) {
        yz7 yz7Var = (yz7) this.c;
        return (yz7Var == null || o90Var == null || yz7Var.a.get() != o90Var) ? false : true;
    }

    public synchronized boolean w(x47 x47Var) {
        try {
            String strH = x47Var.h();
            if (!((HashMap) this.a).containsKey(strH)) {
                ((HashMap) this.a).put(strH, null);
                x47Var.r(this);
                boolean z = cb9.a;
                return false;
            }
            List arrayList = (List) ((HashMap) this.a).get(strH);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            x47Var.a("waiting-for-response");
            arrayList.add(x47Var);
            ((HashMap) this.a).put(strH, arrayList);
            boolean z2 = cb9.a;
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public boolean x(k6 k6Var, MenuItem menuItem) {
        return ((ActionMode.Callback) this.a).onActionItemClicked(n(k6Var), new zt4((Context) this.b, (bc8) menuItem));
    }

    public boolean y(k6 k6Var, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.a;
        xb8 xb8VarN = n(k6Var);
        fw7 fw7Var = (fw7) this.d;
        Menu ku4Var = (Menu) fw7Var.get(menu);
        if (ku4Var == null) {
            ku4Var = new ku4((Context) this.b, (ot4) menu);
            fw7Var.put(menu, ku4Var);
        }
        return callback.onCreateActionMode(xb8VarN, ku4Var);
    }

    public synchronized void z(x47 x47Var) {
        BlockingQueue blockingQueue;
        try {
            String strH = x47Var.h();
            List list = (List) ((HashMap) this.a).remove(strH);
            if (list != null && !list.isEmpty()) {
                if (cb9.a) {
                    list.size();
                }
                x47 x47Var2 = (x47) list.remove(0);
                ((HashMap) this.a).put(strH, list);
                x47Var2.r(this);
                if (((mk0) this.c) != null && (blockingQueue = (BlockingQueue) this.d) != null) {
                    try {
                        blockingQueue.put(x47Var2);
                    } catch (InterruptedException e2) {
                        e2.toString();
                        Thread.currentThread().interrupt();
                        mk0 mk0Var = (mk0) this.c;
                        mk0Var.e = true;
                        mk0Var.interrupt();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public o77(o77 o77Var, rn6 rn6Var) {
        this.c = new HashMap();
        this.d = new HashMap();
        this.a = o77Var;
        this.b = rn6Var;
    }

    public o77(u79 u79Var, q79 q79Var, l71 l71Var) {
        js3.p(u79Var, "store");
        js3.p(q79Var, "factory");
        js3.p(l71Var, "defaultExtras");
        this.a = u79Var;
        this.b = q79Var;
        this.c = l71Var;
        this.d = new sl3(26);
    }

    public o77(int i) {
        switch (i) {
            case 5:
                this.a = new Object();
                this.b = new Handler(Looper.getMainLooper(), new ts2(1, this));
                break;
            case 7:
                this.a = new wv(0);
                this.b = new SparseArray();
                this.c = new ue4((Object) null);
                this.d = new wv(0);
                break;
            case 15:
                rn6 rn6Var = new rn6(20);
                this.a = rn6Var;
                o77 o77Var = new o77(null, rn6Var);
                this.c = o77Var;
                this.b = o77Var.K();
                hl5 hl5Var = new hl5(21);
                this.d = hl5Var;
                o77Var.M("require", new mx9(hl5Var));
                ((HashMap) hl5Var.b).put("internal.platform", jo9.a);
                o77Var.M("runtime.counter", new nk9(Double.valueOf(0.0d)));
                break;
            default:
                this.c = new ArrayList();
                this.d = new ArrayList();
                break;
        }
    }

    public o77(el elVar) {
        this.a = elVar;
    }

    public o77(be2 be2Var) {
        this(new vo4(17, be2Var));
    }
}
