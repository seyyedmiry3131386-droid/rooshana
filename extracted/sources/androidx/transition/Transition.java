package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.a27;
import defpackage.cr8;
import defpackage.fz;
import defpackage.gr8;
import defpackage.h69;
import defpackage.jw1;
import defpackage.ln2;
import defpackage.o40;
import defpackage.o77;
import defpackage.p58;
import defpackage.q69;
import defpackage.s5;
import defpackage.ue4;
import defpackage.wq2;
import defpackage.wq8;
import defpackage.wr8;
import defpackage.wu8;
import defpackage.wv;
import defpackage.xq8;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class Transition implements Cloneable {
    public static final Animator[] D = new Animator[0];
    public static final int[] E = {2, 1, 3, 4};
    public static final wq8 F = new wq8();
    public static final ThreadLocal G = new ThreadLocal();
    public long A;
    public cr8 B;
    public long C;
    public final String a;
    public long b;
    public long c;
    public TimeInterpolator d;
    public final ArrayList e;
    public final ArrayList f;
    public ArrayList g;
    public ArrayList h;
    public o77 i;
    public o77 j;
    public TransitionSet k;
    public final int[] l;
    public ArrayList m;
    public ArrayList n;
    public gr8[] o;
    public final ArrayList p;
    public Animator[] q;
    public int r;
    public boolean s;
    public boolean t;
    public Transition u;
    public ArrayList v;
    public ArrayList w;
    public wu8 x;
    public ln2 y;
    public PathMotion z;

    public Transition() {
        this.a = getClass().getName();
        this.b = -1L;
        this.c = -1L;
        this.d = null;
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = null;
        this.h = null;
        this.i = new o77(7);
        this.j = new o77(7);
        this.k = null;
        this.l = E;
        this.p = new ArrayList();
        this.q = D;
        this.r = 0;
        this.s = false;
        this.t = false;
        this.u = null;
        this.v = null;
        this.w = new ArrayList();
        this.z = F;
    }

    public static void c(o77 o77Var, View view, wr8 wr8Var) {
        wv wvVar = (wv) o77Var.a;
        wv wvVar2 = (wv) o77Var.d;
        SparseArray sparseArray = (SparseArray) o77Var.b;
        ue4 ue4Var = (ue4) o77Var.c;
        wvVar.put(view, wr8Var);
        int id = view.getId();
        if (id >= 0) {
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = q69.a;
        String strF = h69.f(view);
        if (strF != null) {
            if (wvVar2.containsKey(strF)) {
                wvVar2.put(strF, null);
            } else {
                wvVar2.put(strF, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (ue4Var.f(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    ue4Var.i(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) ue4Var.d(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    ue4Var.i(itemIdAtPosition, null);
                }
            }
        }
    }

    public static wv r() {
        ThreadLocal threadLocal = G;
        wv wvVar = (wv) threadLocal.get();
        if (wvVar != null) {
            return wvVar;
        }
        wv wvVar2 = new wv(0);
        threadLocal.set(wvVar2);
        return wvVar2;
    }

    public static boolean y(wr8 wr8Var, wr8 wr8Var2, String str) {
        Object obj = wr8Var.a.get(str);
        Object obj2 = wr8Var2.a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A(View view) {
        if (this.t) {
            return;
        }
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.q);
        this.q = D;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.q = animatorArr;
        z(this, p58.e, false);
        this.s = true;
    }

    public void B() {
        wv wvVarR = r();
        this.A = 0L;
        for (int i = 0; i < this.w.size(); i++) {
            Animator animator = (Animator) this.w.get(i);
            xq8 xq8Var = (xq8) wvVarR.get(animator);
            if (animator != null && xq8Var != null) {
                Animator animator2 = xq8Var.f;
                long j = this.c;
                if (j >= 0) {
                    animator2.setDuration(j);
                }
                long j2 = this.b;
                if (j2 >= 0) {
                    animator2.setStartDelay(animator2.getStartDelay() + j2);
                }
                TimeInterpolator timeInterpolator = this.d;
                if (timeInterpolator != null) {
                    animator2.setInterpolator(timeInterpolator);
                }
                this.p.add(animator);
                this.A = Math.max(this.A, fz.k(animator));
            }
        }
        this.w.clear();
    }

    public Transition C(gr8 gr8Var) {
        Transition transition;
        ArrayList arrayList = this.v;
        if (arrayList != null) {
            if (!arrayList.remove(gr8Var) && (transition = this.u) != null) {
                transition.C(gr8Var);
            }
            if (this.v.size() == 0) {
                this.v = null;
            }
        }
        return this;
    }

    public void D(View view) {
        this.f.remove(view);
    }

    public void E(View view) {
        if (this.s) {
            if (!this.t) {
                ArrayList arrayList = this.p;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.q);
                this.q = D;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.q = animatorArr;
                z(this, p58.f, false);
            }
            this.s = false;
        }
    }

    public void F() {
        N();
        wv wvVarR = r();
        for (Animator animator : this.w) {
            if (wvVarR.containsKey(animator)) {
                N();
                if (animator != null) {
                    animator.addListener(new jw1(this, wvVarR));
                    long j = this.c;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.b;
                    if (j2 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.d;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new s5(14, this));
                    animator.start();
                }
            }
        }
        this.w.clear();
        m();
    }

    public void G(long j, long j2) {
        long j3 = this.A;
        int i = 0;
        boolean z = j < j2;
        if ((j2 < 0 && j >= 0) || (j2 > j3 && j <= j3)) {
            this.t = false;
            z(this, p58.b, z);
        }
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.q);
        this.q = D;
        while (i < size) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            fz.s(animator, Math.min(Math.max(0L, j), fz.k(animator)));
            i++;
            j3 = j3;
        }
        long j4 = j3;
        this.q = animatorArr;
        if ((j <= j4 || j2 > j4) && (j >= 0 || j2 < 0)) {
            return;
        }
        if (j > j4) {
            this.t = true;
        }
        z(this, p58.c, z);
    }

    public void H(long j) {
        this.c = j;
    }

    public void I(ln2 ln2Var) {
        this.y = ln2Var;
    }

    public void J(TimeInterpolator timeInterpolator) {
        this.d = timeInterpolator;
    }

    public void K(PathMotion pathMotion) {
        if (pathMotion == null) {
            this.z = F;
        } else {
            this.z = pathMotion;
        }
    }

    public void L(wu8 wu8Var) {
        this.x = wu8Var;
    }

    public void M(long j) {
        this.b = j;
    }

    public final void N() {
        if (this.r == 0) {
            z(this, p58.b, false);
            this.t = false;
        }
        this.r++;
    }

    public String O(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.c != -1) {
            sb.append("dur(");
            sb.append(this.c);
            sb.append(") ");
        }
        if (this.b != -1) {
            sb.append("dly(");
            sb.append(this.b);
            sb.append(") ");
        }
        if (this.d != null) {
            sb.append("interp(");
            sb.append(this.d);
            sb.append(") ");
        }
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f;
        if (size > 0 || arrayList2.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i2));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    public void a(gr8 gr8Var) {
        if (this.v == null) {
            this.v = new ArrayList();
        }
        this.v.add(gr8Var);
    }

    public void b(View view) {
        this.f.add(view);
    }

    public void cancel() {
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.q);
        this.q = D;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.q = animatorArr;
        z(this, p58.d, false);
    }

    public abstract void d(wr8 wr8Var);

    public final void e(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.getId();
        ArrayList arrayList = this.g;
        if (arrayList == null || !arrayList.contains(view)) {
            ArrayList arrayList2 = this.h;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    if (((Class) this.h.get(i)).isInstance(view)) {
                        return;
                    }
                }
            }
            if (view.getParent() instanceof ViewGroup) {
                wr8 wr8Var = new wr8(view);
                if (z) {
                    g(wr8Var);
                } else {
                    d(wr8Var);
                }
                wr8Var.c.add(this);
                f(wr8Var);
                if (z) {
                    c(this.i, view, wr8Var);
                } else {
                    c(this.j, view, wr8Var);
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    e(viewGroup.getChildAt(i2), z);
                }
            }
        }
    }

    public void f(wr8 wr8Var) {
        if (this.x != null) {
            HashMap map = wr8Var.a;
            if (map.isEmpty()) {
                return;
            }
            this.x.getClass();
            String[] strArr = wu8.o;
            for (int i = 0; i < 2; i++) {
                if (!map.containsKey(strArr[i])) {
                    this.x.getClass();
                    View view = wr8Var.b;
                    Integer numValueOf = (Integer) map.get("android:visibility:visibility");
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(view.getVisibility());
                    }
                    map.put("android:visibilityPropagation:visibility", numValueOf);
                    int[] iArr = {iRound, 0};
                    view.getLocationOnScreen(iArr);
                    int iRound = Math.round(view.getTranslationX()) + iArr[0];
                    iArr[0] = (view.getWidth() / 2) + iRound;
                    int iRound2 = Math.round(view.getTranslationY()) + iArr[1];
                    iArr[1] = iRound2;
                    iArr[1] = (view.getHeight() / 2) + iRound2;
                    map.put("android:visibilityPropagation:center", iArr);
                    return;
                }
            }
        }
    }

    public abstract void g(wr8 wr8Var);

    public final void h(ViewGroup viewGroup, boolean z) {
        i(z);
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f;
        if (size <= 0 && arrayList2.size() <= 0) {
            e(viewGroup, z);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View viewFindViewById = viewGroup.findViewById(((Integer) arrayList.get(i)).intValue());
            if (viewFindViewById != null) {
                wr8 wr8Var = new wr8(viewFindViewById);
                if (z) {
                    g(wr8Var);
                } else {
                    d(wr8Var);
                }
                wr8Var.c.add(this);
                f(wr8Var);
                if (z) {
                    c(this.i, viewFindViewById, wr8Var);
                } else {
                    c(this.j, viewFindViewById, wr8Var);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            View view = (View) arrayList2.get(i2);
            wr8 wr8Var2 = new wr8(view);
            if (z) {
                g(wr8Var2);
            } else {
                d(wr8Var2);
            }
            wr8Var2.c.add(this);
            f(wr8Var2);
            if (z) {
                c(this.i, view, wr8Var2);
            } else {
                c(this.j, view, wr8Var2);
            }
        }
    }

    public final void i(boolean z) {
        if (z) {
            ((wv) this.i.a).clear();
            ((SparseArray) this.i.b).clear();
            ((ue4) this.i.c).b();
        } else {
            ((wv) this.j.a).clear();
            ((SparseArray) this.j.b).clear();
            ((ue4) this.j.c).b();
        }
    }

    @Override // 
    /* JADX INFO: renamed from: j */
    public Transition clone() {
        try {
            Transition transition = (Transition) super.clone();
            transition.w = new ArrayList();
            transition.i = new o77(7);
            transition.j = new o77(7);
            transition.m = null;
            transition.n = null;
            transition.B = null;
            transition.u = this;
            transition.v = null;
            return transition;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public Animator k(ViewGroup viewGroup, wr8 wr8Var, wr8 wr8Var2) {
        return null;
    }

    public void l(ViewGroup viewGroup, o77 o77Var, o77 o77Var2, ArrayList arrayList, ArrayList arrayList2) {
        Animator animatorK;
        int i;
        boolean z;
        int i2;
        View view;
        wr8 wr8Var;
        Animator animator;
        wr8 wr8Var2;
        wv wvVarR = r();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        boolean z2 = q().B != null;
        long jMin = Long.MAX_VALUE;
        int i3 = 0;
        while (i3 < size) {
            wr8 wr8Var3 = (wr8) arrayList.get(i3);
            wr8 wr8Var4 = (wr8) arrayList2.get(i3);
            if (wr8Var3 != null && !wr8Var3.c.contains(this)) {
                wr8Var3 = null;
            }
            if (wr8Var4 != null && !wr8Var4.c.contains(this)) {
                wr8Var4 = null;
            }
            if (!(wr8Var3 == null && wr8Var4 == null) && ((wr8Var3 == null || wr8Var4 == null || w(wr8Var3, wr8Var4)) && (animatorK = k(viewGroup, wr8Var3, wr8Var4)) != null)) {
                String str = this.a;
                if (wr8Var4 != null) {
                    View view2 = wr8Var4.b;
                    i = size;
                    String[] strArrS = s();
                    z = z2;
                    if (strArrS != null && strArrS.length > 0) {
                        wr8Var2 = new wr8(view2);
                        i2 = i3;
                        wr8 wr8Var5 = (wr8) ((wv) o77Var2.a).get(view2);
                        if (wr8Var5 != null) {
                            int i4 = 0;
                            while (i4 < strArrS.length) {
                                String str2 = strArrS[i4];
                                wr8Var2.a.put(str2, wr8Var5.a.get(str2));
                                i4++;
                                strArrS = strArrS;
                            }
                        }
                        int i5 = wvVarR.c;
                        int i6 = 0;
                        while (true) {
                            if (i6 >= i5) {
                                break;
                            }
                            xq8 xq8Var = (xq8) wvVarR.get((Animator) wvVarR.f(i6));
                            if (xq8Var.c != null && xq8Var.a == view2 && xq8Var.b.equals(str) && xq8Var.c.equals(wr8Var2)) {
                                animatorK = null;
                                break;
                            }
                            i6++;
                        }
                    } else {
                        i2 = i3;
                        wr8Var2 = null;
                    }
                    view = view2;
                    wr8Var = wr8Var2;
                    animator = animatorK;
                } else {
                    i = size;
                    z = z2;
                    i2 = i3;
                    view = wr8Var3.b;
                    wr8Var = null;
                    animator = animatorK;
                }
                if (animator != null) {
                    wu8 wu8Var = this.x;
                    if (wu8Var != null) {
                        long jW = wu8Var.w(viewGroup, this, wr8Var3, wr8Var4);
                        sparseIntArray.put(this.w.size(), (int) jW);
                        jMin = Math.min(jW, jMin);
                    }
                    WindowId windowId = viewGroup.getWindowId();
                    xq8 xq8Var2 = new xq8();
                    xq8Var2.a = view;
                    xq8Var2.b = str;
                    xq8Var2.c = wr8Var;
                    xq8Var2.d = windowId;
                    xq8Var2.e = this;
                    xq8Var2.f = animator;
                    Object obj = animator;
                    if (z) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.play(animator);
                        obj = animatorSet;
                    }
                    wvVarR.put(obj, xq8Var2);
                    this.w.add(obj);
                }
            } else {
                i = size;
                z = z2;
                i2 = i3;
            }
            i3 = i2 + 1;
            size = i;
            z2 = z;
        }
        if (sparseIntArray.size() != 0) {
            for (int i7 = 0; i7 < sparseIntArray.size(); i7++) {
                xq8 xq8Var3 = (xq8) wvVarR.get((Animator) this.w.get(sparseIntArray.keyAt(i7)));
                xq8Var3.f.setStartDelay(xq8Var3.f.getStartDelay() + (((long) sparseIntArray.valueAt(i7)) - jMin));
            }
        }
    }

    public final void m() {
        int i = this.r - 1;
        this.r = i;
        if (i == 0) {
            z(this, p58.c, false);
            for (int i2 = 0; i2 < ((ue4) this.i.c).k(); i2++) {
                View view = (View) ((ue4) this.i.c).l(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < ((ue4) this.j.c).k(); i3++) {
                View view2 = (View) ((ue4) this.j.c).l(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.t = true;
        }
    }

    public Transition n(View view) {
        ArrayList arrayList = this.g;
        if (view != null) {
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            if (!arrayList.contains(view)) {
                arrayList.add(view);
            }
        }
        this.g = arrayList;
        return this;
    }

    public void o() {
        ArrayList arrayList = this.h;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        if (!arrayList.contains(TextView.class)) {
            arrayList.add(TextView.class);
        }
        this.h = arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x002c, code lost:
    
        if (r2 < 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002e, code lost:
    
        if (r6 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0030, code lost:
    
        r5 = r4.n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0033, code lost:
    
        r5 = r4.m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003b, code lost:
    
        return (defpackage.wr8) r5.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003c, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.wr8 p(android.view.View r5, boolean r6) {
        /*
            r4 = this;
            androidx.transition.TransitionSet r0 = r4.k
            if (r0 == 0) goto L9
            wr8 r5 = r0.p(r5, r6)
            return r5
        L9:
            if (r6 == 0) goto Le
            java.util.ArrayList r0 = r4.m
            goto L10
        Le:
            java.util.ArrayList r0 = r4.n
        L10:
            if (r0 != 0) goto L13
            goto L3c
        L13:
            int r1 = r0.size()
            r2 = 0
        L18:
            if (r2 >= r1) goto L2b
            java.lang.Object r3 = r0.get(r2)
            wr8 r3 = (defpackage.wr8) r3
            if (r3 != 0) goto L23
            goto L3c
        L23:
            android.view.View r3 = r3.b
            if (r3 != r5) goto L28
            goto L2c
        L28:
            int r2 = r2 + 1
            goto L18
        L2b:
            r2 = -1
        L2c:
            if (r2 < 0) goto L3c
            if (r6 == 0) goto L33
            java.util.ArrayList r5 = r4.n
            goto L35
        L33:
            java.util.ArrayList r5 = r4.m
        L35:
            java.lang.Object r5 = r5.get(r2)
            wr8 r5 = (defpackage.wr8) r5
            return r5
        L3c:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.Transition.p(android.view.View, boolean):wr8");
    }

    public final Transition q() {
        TransitionSet transitionSet = this.k;
        return transitionSet != null ? transitionSet.q() : this;
    }

    public String[] s() {
        return null;
    }

    public final wr8 t(View view, boolean z) {
        TransitionSet transitionSet = this.k;
        if (transitionSet != null) {
            return transitionSet.t(view, z);
        }
        return (wr8) ((wv) (z ? this.i : this.j).a).get(view);
    }

    public final String toString() {
        return O("");
    }

    public boolean u() {
        return !this.p.isEmpty();
    }

    public boolean v() {
        return this instanceof ChangeBounds;
    }

    public boolean w(wr8 wr8Var, wr8 wr8Var2) {
        if (wr8Var != null && wr8Var2 != null) {
            String[] strArrS = s();
            if (strArrS != null) {
                for (String str : strArrS) {
                    if (y(wr8Var, wr8Var2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = wr8Var.a.keySet().iterator();
                while (it.hasNext()) {
                    if (y(wr8Var, wr8Var2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean x(View view) {
        int size;
        int id = view.getId();
        ArrayList arrayList = this.g;
        if (arrayList == null || !arrayList.contains(view)) {
            ArrayList arrayList2 = this.h;
            if (arrayList2 != null) {
                int size2 = arrayList2.size();
                for (int i = 0; i < size2; i++) {
                    if (((Class) this.h.get(i)).isInstance(view)) {
                        break;
                    }
                }
                ArrayList arrayList3 = this.e;
                size = arrayList3.size();
                ArrayList arrayList4 = this.f;
                if ((size == 0 || arrayList4.size() != 0) && !arrayList3.contains(Integer.valueOf(id)) && !arrayList4.contains(view)) {
                    break;
                }
                return true;
            }
            ArrayList arrayList32 = this.e;
            size = arrayList32.size();
            ArrayList arrayList42 = this.f;
            if (size == 0) {
            }
        }
        return false;
    }

    public final void z(Transition transition, p58 p58Var, boolean z) {
        Transition transition2 = this.u;
        if (transition2 != null) {
            transition2.z(transition, p58Var, z);
        }
        ArrayList arrayList = this.v;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.v.size();
        gr8[] gr8VarArr = this.o;
        if (gr8VarArr == null) {
            gr8VarArr = new gr8[size];
        }
        this.o = null;
        gr8[] gr8VarArr2 = (gr8[]) this.v.toArray(gr8VarArr);
        for (int i = 0; i < size; i++) {
            gr8 gr8Var = gr8VarArr2[i];
            switch (p58Var.a) {
                case 13:
                    gr8Var.c(transition);
                    break;
                case 14:
                    gr8Var.e(transition);
                    break;
                case 15:
                    gr8Var.f(transition);
                    break;
                case 16:
                    gr8Var.a();
                    break;
                default:
                    gr8Var.g();
                    break;
            }
            gr8VarArr2[i] = null;
        }
        this.o = gr8VarArr2;
    }

    public Transition(Context context, AttributeSet attributeSet) {
        this.a = getClass().getName();
        this.b = -1L;
        this.c = -1L;
        this.d = null;
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = null;
        this.h = null;
        this.i = new o77(7);
        this.j = new o77(7);
        this.k = null;
        int[] iArr = E;
        this.l = iArr;
        this.p = new ArrayList();
        this.q = D;
        this.r = 0;
        this.s = false;
        this.t = false;
        this.u = null;
        this.v = null;
        this.w = new ArrayList();
        this.z = F;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wq2.g);
        XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
        long jF = a27.f(typedArrayObtainStyledAttributes, xmlResourceParser, "duration", 1, -1);
        if (jF >= 0) {
            H(jF);
        }
        long j = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "startDelay") != null ? typedArrayObtainStyledAttributes.getInt(2, -1) : -1;
        if (j > 0) {
            M(j);
        }
        int resourceId = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "interpolator") != null ? typedArrayObtainStyledAttributes.getResourceId(0, 0) : 0;
        if (resourceId > 0) {
            J(AnimationUtils.loadInterpolator(context, resourceId));
        }
        String strG = a27.g(typedArrayObtainStyledAttributes, xmlResourceParser, "matchOrder", 3);
        if (strG != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(strG, ",");
            int[] iArr2 = new int[stringTokenizer.countTokens()];
            int i = 0;
            while (stringTokenizer.hasMoreTokens()) {
                String strTrim = stringTokenizer.nextToken().trim();
                if ("id".equalsIgnoreCase(strTrim)) {
                    iArr2[i] = 3;
                } else if ("instance".equalsIgnoreCase(strTrim)) {
                    iArr2[i] = 1;
                } else if (AppMeasurementSdk.ConditionalUserProperty.NAME.equalsIgnoreCase(strTrim)) {
                    iArr2[i] = 2;
                } else if ("itemId".equalsIgnoreCase(strTrim)) {
                    iArr2[i] = 4;
                } else if (strTrim.isEmpty()) {
                    int[] iArr3 = new int[iArr2.length - 1];
                    System.arraycopy(iArr2, 0, iArr3, 0, i);
                    i--;
                    iArr2 = iArr3;
                } else {
                    throw new InflateException(o40.y("Unknown match type in matchOrder: '", strTrim, "'"));
                }
                i++;
            }
            if (iArr2.length == 0) {
                this.l = iArr;
            } else {
                for (int i2 = 0; i2 < iArr2.length; i2++) {
                    int i3 = iArr2[i2];
                    if (i3 < 1 || i3 > 4) {
                        throw new IllegalArgumentException("matches contains invalid value");
                    }
                    for (int i4 = 0; i4 < i2; i4++) {
                        if (iArr2[i4] == i3) {
                            throw new IllegalArgumentException("matches contains a duplicate value");
                        }
                    }
                }
                this.l = (int[]) iArr2.clone();
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
