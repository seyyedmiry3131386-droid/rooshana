package defpackage;

import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.g;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import com.google.android.material.navigation.NavigationBarView;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.reflect.d;
import ir.mservices.market.activity.LaunchContentActivity;
import ir.mservices.market.movie.ui.bookmark.MovieBookmarkRecyclerListFragment;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import ir.mservices.market.version2.fragments.dialog.PermissionDialogFragment;
import ir.mservices.market.version2.ui.recycler.data.MultiSelectRecyclerData;
import ir.mservices.market.version2.ui.recycler.holder.a;
import ir.mservices.market.views.FastDownloadView;
import j$.util.DesugarCollections;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class vo4 implements z95, mt4, rm1, gb8, n81, ms5, d4, pn8, s82, el, z60 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ vo4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.n81
    public long a(long j) {
        ArrayList arrayList = (ArrayList) this.b;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j < ((o81) arrayList.get(0)).b) {
            return ((o81) arrayList.get(0)).b;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            o81 o81Var = (o81) arrayList.get(i);
            long j2 = o81Var.b;
            long j3 = o81Var.b;
            if (j < j2) {
                long j4 = ((o81) arrayList.get(i - 1)).d;
                return (j4 == -9223372036854775807L || j4 <= j || j4 >= j3) ? j3 : j4;
            }
        }
        long j5 = ((o81) tv8.q(arrayList)).d;
        if (j5 == -9223372036854775807L || j >= j5) {
            return Long.MIN_VALUE;
        }
        return j5;
    }

    @Override // defpackage.d4
    public boolean b(View view) {
        switch (this.a) {
            case 13:
                SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.b;
                if (!swipeDismissBehavior.y(view)) {
                    return false;
                }
                boolean z = view.getLayoutDirection() == 1;
                int i = swipeDismissBehavior.e;
                int width = (!(i == 0 && z) && (i != 1 || z)) ? view.getWidth() : -view.getWidth();
                WeakHashMap weakHashMap = q69.a;
                view.offsetLeftAndRight(width);
                view.setAlpha(0.0f);
                nm5 nm5Var = swipeDismissBehavior.b;
                if (nm5Var == null) {
                    return true;
                }
                nm5Var.u(view);
                return true;
            default:
                o77 o77Var = (o77) this.b;
                int currentItem = ((ViewPager2) view).getCurrentItem() - 1;
                ViewPager2 viewPager2 = (ViewPager2) o77Var.d;
                if (viewPager2.r) {
                    viewPager2.d(currentItem, true);
                }
                return true;
        }
    }

    @Override // defpackage.mt4
    public boolean c(ot4 ot4Var, MenuItem menuItem) throws Exception {
        int i;
        NavigationBarView navigationBarView = (NavigationBarView) this.b;
        if (navigationBarView.f == null || menuItem.getItemId() != navigationBarView.getSelectedItemId()) {
            bk5 bk5Var = navigationBarView.e;
            return (bk5Var == null || bk5Var.f(menuItem)) ? false : true;
        }
        LaunchContentActivity launchContentActivity = ((br3) navigationBarView.f).b;
        int i2 = LaunchContentActivity.B1;
        String strO0 = LaunchContentActivity.o0(menuItem.getItemId());
        int itemId = menuItem.getItemId();
        if (itemId == rr6.mainFeature) {
            i = 0;
        } else if (itemId == rr6.movieHomeRoot) {
            i = 2;
        } else if (itemId == rr6.gameFeature) {
            i = 1;
        } else if (itemId == rr6.rootUpdate) {
            i = 3;
        } else {
            lw.g(null, "id is not valid", null);
            i = -1;
        }
        NavHostFragment navHostFragment = launchContentActivity.Y;
        if (navHostFragment == null) {
            throw new Exception("navHostFragment is null");
        }
        g gVarG = navHostFragment.G();
        if (gVarG.d.size() + (gVarG.h != null ? 1 : 0) <= 1) {
            launchContentActivity.J0.a.b("bottom_navigation_top", AppMeasurementSdk.ConditionalUserProperty.NAME, strO0);
            launchContentActivity.d1.setExpanded(true, true);
            t32.b().g(new o04(i));
            sb7.p("MyketLaunchActivity", "Tab: " + strO0 + " onTop()", "");
            return true;
        }
        launchContentActivity.q0(strO0, strO0);
        launchContentActivity.J0.a.b("bottom_navigation_clear", AppMeasurementSdk.ConditionalUserProperty.NAME, strO0);
        launchContentActivity.r(Integer.valueOf(menuItem.getItemId()));
        t32.b().j(new n04(i));
        sb7.p("MyketLaunchActivity", "Tab: " + strO0 + " onClear()", "");
        return true;
    }

    @Override // defpackage.n81
    public void clear() {
        ((ArrayList) this.b).clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    @Override // defpackage.n81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean d(defpackage.o81 r11, long r12) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.b
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            long r1 = r11.b
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r6 = 0
            r7 = 1
            if (r5 == 0) goto L13
            r5 = r7
            goto L14
        L13:
            r5 = r6
        L14:
            defpackage.vy2.j(r5)
            int r5 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r5 > 0) goto L27
            long r8 = r11.d
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 == 0) goto L25
            int r3 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r3 >= 0) goto L27
        L25:
            r3 = r7
            goto L28
        L27:
            r3 = r6
        L28:
            int r4 = r0.size()
            int r4 = r4 - r7
        L2d:
            if (r4 < 0) goto L50
            java.lang.Object r5 = r0.get(r4)
            o81 r5 = (defpackage.o81) r5
            long r8 = r5.b
            int r5 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r5 < 0) goto L40
            int r4 = r4 + r7
            r0.add(r4, r11)
            return r3
        L40:
            java.lang.Object r5 = r0.get(r4)
            o81 r5 = (defpackage.o81) r5
            long r8 = r5.b
            int r5 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r5 > 0) goto L4d
            r3 = r6
        L4d:
            int r4 = r4 + (-1)
            goto L2d
        L50:
            r0.add(r6, r11)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vo4.d(o81, long):boolean");
    }

    @Override // defpackage.n81
    public ImmutableList e(long j) {
        int i = i(j);
        if (i == 0) {
            return ImmutableList.q();
        }
        o81 o81Var = (o81) ((ArrayList) this.b).get(i - 1);
        long j2 = o81Var.d;
        return (j2 == -9223372036854775807L || j < j2) ? o81Var.a : ImmutableList.q();
    }

    @Override // defpackage.z95
    public void f(View view, a aVar, MultiSelectRecyclerData multiSelectRecyclerData) {
        js3.p(multiSelectRecyclerData, "recyclerData");
        MovieBookmarkRecyclerListFragment movieBookmarkRecyclerListFragment = (MovieBookmarkRecyclerListFragment) this.b;
        int i = MovieBookmarkRecyclerListFragment.j1;
        movieBookmarkRecyclerListFragment.Q1().u(multiSelectRecyclerData);
    }

    @Override // defpackage.n81
    public long g(long j) {
        ArrayList arrayList = (ArrayList) this.b;
        if (arrayList.isEmpty() || j < ((o81) arrayList.get(0)).b) {
            return -9223372036854775807L;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            long j2 = ((o81) arrayList.get(i)).b;
            if (j == j2) {
                return j2;
            }
            if (j < j2) {
                o81 o81Var = (o81) arrayList.get(i - 1);
                long j3 = o81Var.d;
                return (j3 == -9223372036854775807L || j3 > j) ? o81Var.b : j3;
            }
        }
        o81 o81Var2 = (o81) tv8.q(arrayList);
        long j4 = o81Var2.d;
        return (j4 == -9223372036854775807L || j < j4) ? o81Var2.b : j4;
    }

    @Override // defpackage.el
    public be2 get(int i) {
        return (be2) this.b;
    }

    @Override // defpackage.n81
    public void h(long j) {
        ArrayList arrayList = (ArrayList) this.b;
        int i = i(j);
        if (i == 0) {
            return;
        }
        long j2 = ((o81) arrayList.get(i - 1)).d;
        if (j2 == -9223372036854775807L || j2 >= j) {
            i--;
        }
        arrayList.subList(0, i).clear();
    }

    public int i(long j) {
        ArrayList arrayList = (ArrayList) this.b;
        for (int i = 0; i < arrayList.size(); i++) {
            if (j < ((o81) arrayList.get(i)).b) {
                return i;
            }
        }
        return arrayList.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void j(androidx.recyclerview.widget.o r9, defpackage.ba4 r10, defpackage.ba4 r11) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.b
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            r1 = 0
            r9.o(r1)
            qz6 r1 = r0.M
            r2 = r1
            nw7 r2 = (defpackage.nw7) r2
            if (r10 == 0) goto L1f
            r2.getClass()
            int r4 = r10.a
            int r6 = r11.a
            if (r4 != r6) goto L21
            int r1 = r10.b
            int r3 = r11.b
            if (r1 == r3) goto L1f
            goto L21
        L1f:
            r3 = r9
            goto L2b
        L21:
            int r5 = r10.b
            int r7 = r11.b
            r3 = r9
            boolean r9 = r2.k(r3, r4, r5, r6, r7)
            goto L2f
        L2b:
            r2.i(r3)
            r9 = 1
        L2f:
            if (r9 == 0) goto L34
            r0.Y()
        L34:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vo4.j(androidx.recyclerview.widget.o, ba4, ba4):void");
    }

    public void k(o oVar, ba4 ba4Var, ba4 ba4Var2) {
        boolean zK;
        RecyclerView recyclerView = (RecyclerView) this.b;
        recyclerView.c.m(oVar);
        recyclerView.h(oVar);
        oVar.o(false);
        nw7 nw7Var = (nw7) recyclerView.M;
        nw7Var.getClass();
        int i = ba4Var.a;
        int i2 = ba4Var.b;
        View view = oVar.a;
        int left = ba4Var2 == null ? view.getLeft() : ba4Var2.a;
        int top = ba4Var2 == null ? view.getTop() : ba4Var2.b;
        if (oVar.i() || (i == left && i2 == top)) {
            nw7Var.l(oVar);
            zK = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            zK = nw7Var.k(oVar, i, i2, left, top);
        }
        if (zK) {
            recyclerView.Y();
        }
    }

    public Type l(TypeVariable typeVariable, zu8 zu8Var) {
        Type type = (Type) ((ImmutableMap) this.b).get(new av8(typeVariable));
        if (type != null) {
            return new com.google.common.reflect.a(zu8Var).a(type);
        }
        Type[] bounds = typeVariable.getBounds();
        if (bounds.length != 0) {
            Type[] typeArrB = new com.google.common.reflect.a(zu8Var).b(bounds);
            if (!vv8.a || !Arrays.equals(bounds, typeArrB)) {
                return d.c(typeVariable.getGenericDeclaration(), typeVariable.getName(), typeArrB);
            }
        }
        return typeVariable;
    }

    public void m(Serializable serializable, Object obj) {
        try {
            ((Field) this.b).set(serializable, obj);
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.s82
    public void n(FastDownloadView fastDownloadView, r82 r82Var) {
        ((bn6) this.b).n(fastDownloadView, r82Var);
    }

    @Override // defpackage.rm1
    public void onCancel() {
        PermissionDialogFragment permissionDialogFragment = (PermissionDialogFragment) this.b;
        permissionDialogFragment.getClass();
        permissionDialogFragment.N0(DialogResult.b, new Bundle());
    }

    @Override // defpackage.z60
    public void onConnected(Bundle bundle) {
        ((iu2) this.b).L();
    }

    @Override // defpackage.z60
    public void onConnectionSuspended(int i) {
        ((iu2) this.b).onConnectionSuspended(i);
    }

    @Override // defpackage.gb8
    public void onSuccess(Object obj) {
        d27 d27Var = (d27) this.b;
        d27Var.o.j(lu7.W, true);
        d27Var.i(true);
    }

    public void p(Status status) {
        ((cf8) this.b).a(new ApiException(status));
    }

    @Override // defpackage.ms5
    public lf9 q(View view, lf9 lf9Var) {
        ScrimInsetsFrameLayout scrimInsetsFrameLayout = (ScrimInsetsFrameLayout) this.b;
        if (scrimInsetsFrameLayout.b == null) {
            scrimInsetsFrameLayout.b = new Rect();
        }
        Rect rect = scrimInsetsFrameLayout.b;
        int iB = lf9Var.b();
        if9 if9Var = lf9Var.a;
        rect.set(iB, lf9Var.d(), lf9Var.c(), lf9Var.a());
        scrimInsetsFrameLayout.e(lf9Var);
        scrimInsetsFrameLayout.setWillNotDraw(if9Var.l().equals(no3.e) || scrimInsetsFrameLayout.a == null);
        scrimInsetsFrameLayout.postInvalidateOnAnimation();
        return if9Var.c();
    }

    public void r(f87 f87Var) {
        ((cf8) this.b).b(null);
    }

    public void s(Bundle bundle) {
        for (Map.Entry entry : ((Map) this.b).entrySet()) {
            ((rh9) entry.getValue()).b(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public void t(int i, int i2, Intent intent) {
        Iterator it = ((Map) this.b).values().iterator();
        if (it.hasNext()) {
            ((rh9) it.next()).getClass();
            throw null;
        }
    }

    public void u(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        Iterator it = ((Map) this.b).entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            new Bundle();
            ((rh9) entry.getValue()).getClass();
            throw null;
        }
    }

    public vo4(int i) {
        this.a = i;
        switch (i) {
            case 8:
                this.b = new ArrayList();
                break;
            case 12:
                this.b = new ql3();
                break;
            case 15:
                this.b = ImmutableMap.l();
                break;
            case 20:
                this.b = DesugarCollections.synchronizedMap(new wv(0));
                break;
        }
    }

    public vo4(c75 c75Var) {
        this.a = 2;
        js3.p(c75Var, "movieService");
        this.b = c75Var;
    }

    public vo4(vl6 vl6Var) {
        this.a = 5;
        js3.p(vl6Var, "service");
        this.b = vl6Var;
    }

    public vo4(long[] jArr) {
        cb5 cb5Var;
        this.a = 11;
        if (jArr != null) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
            cb5Var = new cb5(jArrCopyOf.length);
            int i = cb5Var.b;
            if (i >= 0) {
                if (jArrCopyOf.length != 0) {
                    int length = jArrCopyOf.length + i;
                    long[] jArr2 = cb5Var.a;
                    if (jArr2.length < length) {
                        long[] jArrCopyOf2 = Arrays.copyOf(jArr2, Math.max(length, (jArr2.length * 3) / 2));
                        js3.o(jArrCopyOf2, "copyOf(...)");
                        cb5Var.a = jArrCopyOf2;
                    }
                    long[] jArr3 = cb5Var.a;
                    int i2 = cb5Var.b;
                    if (i != i2) {
                        ew.A0(jArr3, jArr3, jArrCopyOf.length + i, i, i2);
                    }
                    ew.A0(jArrCopyOf, jArr3, i, 0, jArrCopyOf.length);
                    cb5Var.b += jArrCopyOf.length;
                }
            } else {
                lb7.k("");
                throw null;
            }
        } else {
            cb5Var = new cb5(16);
        }
        this.b = cb5Var;
    }

    @Override // defpackage.rm1
    public void onCommit() {
    }

    @Override // defpackage.mt4
    public void o(ot4 ot4Var) {
    }

    public vo4(Field field) {
        this.a = 10;
        this.b = field;
        field.setAccessible(true);
    }
}
