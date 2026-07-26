package defpackage;

import android.content.Context;
import androidx.compose.ui.input.pointer.a;
import androidx.compose.ui.node.h;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.media3.common.b;
import androidx.recyclerview.widget.g;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes.dex */
public final class ai0 implements wk0 {
    public static final sd2 f = new sd2();
    public boolean a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public ai0(v72 v72Var, b bVar, hm8 hm8Var, ab8 ab8Var, boolean z) {
        this.b = v72Var;
        this.c = bVar;
        this.d = hm8Var;
        this.e = ab8Var;
        this.a = z;
    }

    public static void d(ai0 ai0Var, ek5 ek5Var) {
        ai0Var.getClass();
        js3.p(ek5Var, "handler");
        if (((LinkedHashSet) ai0Var.d).add(ek5Var)) {
            kk5 kk5Var = (kk5) ai0Var.c;
            kk5Var.getClass();
            if (ek5Var.g == null) {
                kk5Var.e.addFirst(ek5Var);
                ek5Var.g = ai0Var;
                kk5Var.b();
            } else {
                throw new IllegalArgumentException(("Handler '" + ek5Var + "' is already registered with a dispatcher").toString());
            }
        }
    }

    public static IOException n(ai0 ai0Var, long j, boolean z, IOException iOException, int i) {
        boolean z2;
        boolean z3;
        ai0 ai0Var2;
        IOException iOException2;
        xv6 xv6Var = (xv6) ai0Var.b;
        boolean z4 = false;
        boolean z5 = (i & 4) == 0;
        boolean z6 = (i & 8) == 0;
        z32 z32Var = (z32) ai0Var.c;
        if (iOException != null) {
            ai0Var.z(iOException);
        }
        if (z6) {
            if (iOException != null) {
                z32Var.s(xv6Var, iOException);
            } else {
                z32Var.q(xv6Var, j);
            }
        }
        if (z5) {
            if (iOException != null) {
                z32Var.x(xv6Var, iOException);
            } else {
                z32Var.v(xv6Var, j);
            }
        }
        if (!z6 || z) {
            z2 = false;
        } else {
            z2 = false;
            z4 = true;
        }
        boolean z7 = (!z5 || z) ? z2 : true;
        boolean z8 = (z6 && z) ? true : z2;
        if (z5 && z) {
            z3 = true;
            iOException2 = iOException;
            ai0Var2 = ai0Var;
        } else {
            z3 = z2;
            ai0Var2 = ai0Var;
            iOException2 = iOException;
        }
        return xv6Var.g(ai0Var2, z4, z7, z3, z8, iOException2);
    }

    public static int s(vk0 vk0Var, int i) {
        int iHashCode = vk0Var.b.hashCode() + (vk0Var.a * 31);
        if (i < 2) {
            long jO = o40.o(vk0Var.e);
            return (iHashCode * 31) + ((int) (jO ^ (jO >>> 32)));
        }
        return vk0Var.e.hashCode() + (iHashCode * 31);
    }

    public static vk0 w(int i, DataInputStream dataInputStream) throws IOException {
        zd1 zd1VarA;
        int i2 = dataInputStream.readInt();
        String utf = dataInputStream.readUTF();
        if (i < 2) {
            long j = dataInputStream.readLong();
            k41 k41Var = new k41(0);
            k41Var.a(Long.valueOf(j), "exo_len");
            zd1VarA = zd1.c.a(k41Var);
        } else {
            zd1VarA = on.a(dataInputStream);
        }
        return new vk0(i2, utf, zd1VarA);
    }

    public void A(int i, int i2) {
        if (i < 0.0f) {
            un3.a("Index should be non-negative (" + i + ')');
        }
        ((n08) this.b).i(i);
        ((b34) this.e).a(i);
        ((n08) this.c).i(i2);
    }

    public do3 B() throws SocketException {
        xv6 xv6Var = (xv6) this.b;
        if (xv6Var.j) {
            throw new IllegalStateException("Check failed.");
        }
        xv6Var.j = true;
        xv6Var.e.i();
        synchronized (xv6Var) {
            if (xv6Var.r == null) {
                throw new IllegalStateException("Check failed.");
            }
            if (xv6Var.n || xv6Var.o) {
                throw new IllegalStateException("Check failed.");
            }
            if (xv6Var.l) {
                throw new IllegalStateException("Check failed.");
            }
            if (!xv6Var.m) {
                throw new IllegalStateException("Check failed.");
            }
            xv6Var.m = false;
            xv6Var.n = true;
            xv6Var.o = true;
        }
        n42 n42VarI = ((o42) this.e).i();
        js3.n(n42VarI, "null cannot be cast to non-null type okhttp3.internal.connection.RealConnection");
        yv6 yv6Var = (yv6) n42VarI;
        yv6Var.e.setSoTimeout(0);
        yv6Var.e();
        do3 do3Var = new do3();
        o42 o42Var = (o42) this.e;
        do3Var.a = new l42(this, o42Var.g().j(), -1L, true);
        do3Var.b = new m42(this, o42Var.g().c(), -1L, true);
        return do3Var;
    }

    @Override // defpackage.wk0
    public void a(HashMap map) throws Throwable {
        DataOutputStream dataOutputStream;
        do3 do3Var = (do3) this.d;
        DataOutputStream dataOutputStream2 = null;
        try {
            yx yxVarE = do3Var.E();
            n87 n87Var = (n87) this.e;
            if (n87Var == null) {
                this.e = new n87(yxVarE);
            } else {
                n87Var.b(yxVarE);
            }
            dataOutputStream = new DataOutputStream((n87) this.e);
        } catch (Throwable th) {
            th = th;
        }
        try {
            dataOutputStream.writeInt(2);
            dataOutputStream.writeInt(0);
            dataOutputStream.writeInt(map.size());
            int iS = 0;
            for (vk0 vk0Var : map.values()) {
                dataOutputStream.writeInt(vk0Var.a);
                dataOutputStream.writeUTF(vk0Var.b);
                on.b(vk0Var.e, dataOutputStream);
                iS += s(vk0Var, 2);
            }
            dataOutputStream.writeInt(iS);
            dataOutputStream.close();
            ((File) do3Var.b).delete();
            String str = j29.a;
            this.a = false;
        } catch (Throwable th2) {
            th = th2;
            dataOutputStream2 = dataOutputStream;
            j29.g(dataOutputStream2);
            throw th;
        }
    }

    @Override // defpackage.wk0
    public void b(vk0 vk0Var, boolean z) {
        this.a = true;
    }

    public void c() {
        synchronized (((fk0) this.e)) {
            if (this.a) {
                return;
            }
            this.a = true;
            gh9.b((by7) this.c);
            try {
                ((ry) this.b).a();
            } catch (IOException unused) {
            }
        }
    }

    @Override // defpackage.wk0
    public void e(vk0 vk0Var) {
        this.a = true;
    }

    @Override // defpackage.wk0
    public boolean f() {
        do3 do3Var = (do3) this.d;
        return ((File) do3Var.a).exists() || ((File) do3Var.b).exists();
    }

    @Override // defpackage.wk0
    public void g(HashMap map) throws Throwable {
        if (this.a) {
            a(map);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0084 A[Catch: all -> 0x006d, IOException -> 0x0070, LOOP:0: B:33:0x0082->B:34:0x0084, LOOP_END, TryCatch #4 {IOException -> 0x0070, all -> 0x006d, blocks: (B:10:0x0034, B:15:0x003e, B:21:0x004e, B:22:0x0058, B:23:0x0061, B:30:0x0075, B:31:0x007a, B:32:0x007b, B:34:0x0084, B:35:0x009a), top: B:58:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a6  */
    @Override // defpackage.wk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void i(java.util.HashMap r13, android.util.SparseArray r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ai0.i(java.util.HashMap, android.util.SparseArray):void");
    }

    public void j(jk5 jk5Var) {
        if (((LinkedHashSet) this.e).add(jk5Var)) {
            ((kk5) this.c).a(this, jk5Var, -1);
        }
    }

    @Override // defpackage.wk0
    public void k() {
        do3 do3Var = (do3) this.d;
        ((File) do3Var.a).delete();
        ((File) do3Var.b).delete();
    }

    public void l(ps5 ps5Var, int i) {
        if (i != 1 && i != 0) {
            throw new IllegalArgumentException(rm7.n(i, "Unsupported priority value: ").toString());
        }
        if (((LinkedHashSet) this.e).add(ps5Var)) {
            ((kk5) this.c).a(this, ps5Var, i);
        }
    }

    public void m() {
        TabLayout tabLayout = (TabLayout) this.b;
        ViewPager2 viewPager2 = (ViewPager2) this.c;
        if (this.a) {
            throw new IllegalStateException("TabLayoutMediator is already attached");
        }
        g adapter = viewPager2.getAdapter();
        this.e = adapter;
        if (adapter == null) {
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        this.a = true;
        ((ArrayList) viewPager2.c.b).add(new ge8(tabLayout));
        tabLayout.a(new nd0(5, viewPager2));
        ((g) this.e).t(new kr0(4, this));
        u();
        tabLayout.setScrollPosition(viewPager2.getCurrentItem(), 0.0f, true);
    }

    public void o(jk5 jk5Var, ck5 ck5Var) {
        if (this.a) {
            kk5 kk5Var = (kk5) this.c;
            kk5Var.getClass();
            if (kk5Var.g != 0) {
                return;
            }
            ek5 ek5VarC = kk5Var.c(-1);
            kk5Var.f = ek5VarC;
            kk5Var.g = -1;
            kk5Var.h = jk5Var;
            if (ck5Var != null) {
                if (ek5VarC != null) {
                    ek5VarC.d = new nk5(ck5Var, -1);
                    ek5VarC.f(ck5Var);
                }
                l lVar = kk5Var.a;
                nk5 nk5Var = new nk5(ck5Var, -1);
                lVar.getClass();
                lVar.p(null, nk5Var);
            }
        }
    }

    public yv6 p() {
        n42 n42VarI = ((o42) this.e).i();
        yv6 yv6Var = n42VarI instanceof yv6 ? (yv6) n42VarI : null;
        if (yv6Var != null) {
            return yv6Var;
        }
        throw new IllegalStateException("no connection for CONNECT tunnels");
    }

    public int q() {
        return ((n08) this.b).h();
    }

    public int r() {
        return ((n08) this.c).h();
    }

    public ew6 t(g77 g77Var) throws IOException {
        ai0 ai0Var;
        o42 o42Var = (o42) this.e;
        try {
            String strA = g77Var.f.a("Content-Type");
            if (strA == null) {
                strA = null;
            }
            long jC = o42Var.c(g77Var);
            ai0Var = this;
            try {
                return new ew6(strA, jC, rf0.j(new m42(ai0Var, o42Var.e(g77Var), jC, false)));
            } catch (IOException e) {
                e = e;
                IOException iOException = e;
                ((z32) ai0Var.c).x((xv6) ai0Var.b, iOException);
                z(iOException);
                throw iOException;
            }
        } catch (IOException e2) {
            e = e2;
            ai0Var = this;
        }
    }

    public void u() {
        TabLayout tabLayout = (TabLayout) this.b;
        tabLayout.m();
        g gVar = (g) this.e;
        if (gVar != null) {
            int iC = gVar.c();
            for (int i = 0; i < iC; i++) {
                com.google.android.material.tabs.b bVarK = tabLayout.k();
                ((fe8) this.d).i(bVarK, i);
                tabLayout.b(bVarK, false);
            }
            if (iC > 0) {
                int iMin = Math.min(((ViewPager2) this.c).getCurrentItem(), tabLayout.getTabCount() - 1);
                if (iMin != tabLayout.getSelectedTabPosition()) {
                    tabLayout.n(tabLayout.j(iMin), true);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int v(nc2 nc2Var, AndroidComposeView androidComposeView, boolean z) {
        Object[] objArr;
        int i;
        int i2;
        a aVar = (a) this.c;
        tz2 tz2Var = (tz2) this.e;
        if (this.a) {
            return 0;
        }
        try {
            this.a = true;
            ir9 ir9VarQ = ((t15) this.d).q(nc2Var, androidComposeView);
            ue4 ue4Var = (ue4) ir9VarQ.c;
            int iK = ue4Var.k();
            for (int i3 = 0; i3 < iK; i3++) {
                ah6 ah6Var = (ah6) ue4Var.l(i3);
                if (!ah6Var.d && !ah6Var.h) {
                }
                objArr = false;
                break;
            }
            objArr = true;
            int iK2 = ue4Var.k();
            for (int i4 = 0; i4 < iK2; i4++) {
                ah6 ah6Var2 = (ah6) ue4Var.l(i4);
                if (objArr != false || at2.O(ah6Var2)) {
                    h hVar = (h) this.b;
                    long j = ah6Var2.c;
                    tz2 tz2Var2 = (tz2) this.e;
                    int i5 = ah6Var2.i;
                    i14 i14Var = h.S;
                    hVar.M(j, tz2Var2, i5, true);
                    if (!tz2Var.a.d()) {
                        aVar.a(ah6Var2.a, tz2Var, at2.O(ah6Var2));
                        tz2Var.clear();
                    }
                }
            }
            boolean zB = aVar.b(ir9VarQ, z);
            if (ir9VarQ.b) {
                i = 0;
            } else {
                int iK3 = ue4Var.k();
                for (int i6 = 0; i6 < iK3; i6++) {
                    ah6 ah6Var3 = (ah6) ue4Var.l(i6);
                    if (!nr5.c(at2.i0(ah6Var3, true), 0L) && ah6Var3.b()) {
                        i = 1;
                        break;
                    }
                }
                i = 0;
            }
            int iK4 = ue4Var.k();
            int i7 = 0;
            while (true) {
                if (i7 >= iK4) {
                    i2 = 0;
                    break;
                }
                if (((ah6) ue4Var.l(i7)).b()) {
                    i2 = 1;
                    break;
                }
                i7++;
            }
            int i8 = (zB ? 1 : 0) | (i << 1) | (i2 << 2);
            this.a = false;
            return i8;
        } catch (Throwable th) {
            this.a = false;
            throw th;
        }
    }

    public f77 x(boolean z) throws IOException {
        try {
            f77 f77VarD = ((o42) this.e).d(z);
            if (f77VarD == null) {
                return f77VarD;
            }
            f77VarD.n = this;
            return f77VarD;
        } catch (IOException e) {
            ((z32) this.c).x((xv6) this.b, e);
            z(e);
            throw e;
        }
    }

    public synchronized void y() {
        try {
            if (this.a) {
                return;
            }
            this.a = true;
            Context context = (Context) this.e;
            if (context != null) {
                ((ci) this.c).b(context);
                context.unregisterComponentCallbacks((lg) this.d);
            }
            ((WeakReference) this.b).clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public void z(IOException iOException) {
        this.a = true;
        ((o42) this.e).i().f((xv6) this.b, iOException);
    }

    public ai0(TabLayout tabLayout, ViewPager2 viewPager2, fe8 fe8Var) {
        this.b = tabLayout;
        this.c = viewPager2;
        this.d = fe8Var;
    }

    @Override // defpackage.wk0
    public void h(long j) {
    }
}
