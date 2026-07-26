package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class yb {
    public int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public yb(View view) {
        this.a = -1;
        this.b = view;
        this.c = pn.a();
    }

    public static yb f(Context context, int i) {
        wu8.j("Cannot create a CalendarItemStyle with a styleResId of 0", i != 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, yt6.MaterialCalendarItem);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(yt6.MaterialCalendarItem_android_insetLeft, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(yt6.MaterialCalendarItem_android_insetTop, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(yt6.MaterialCalendarItem_android_insetRight, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(yt6.MaterialCalendarItem_android_insetBottom, 0));
        ColorStateList colorStateListR = ja1.r(context, typedArrayObtainStyledAttributes, yt6.MaterialCalendarItem_itemFillColor);
        ColorStateList colorStateListR2 = ja1.r(context, typedArrayObtainStyledAttributes, yt6.MaterialCalendarItem_itemTextColor);
        ColorStateList colorStateListR3 = ja1.r(context, typedArrayObtainStyledAttributes, yt6.MaterialCalendarItem_itemStrokeColor);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(yt6.MaterialCalendarItem_itemStrokeWidth, 0);
        as7 as7VarA = as7.a(context, typedArrayObtainStyledAttributes.getResourceId(yt6.MaterialCalendarItem_itemShapeAppearance, 0), typedArrayObtainStyledAttributes.getResourceId(yt6.MaterialCalendarItem_itemShapeAppearanceOverlay, 0)).a();
        typedArrayObtainStyledAttributes.recycle();
        yb ybVar = new yb();
        wu8.k(rect.left);
        wu8.k(rect.top);
        wu8.k(rect.right);
        wu8.k(rect.bottom);
        ybVar.b = rect;
        ybVar.c = colorStateListR2;
        ybVar.d = colorStateListR;
        ybVar.e = colorStateListR3;
        ybVar.a = dimensionPixelSize;
        ybVar.f = as7VarA;
        return ybVar;
    }

    public int A(int i, int i2) {
        int i3;
        int i4;
        ci6 ci6Var = (ci6) this.b;
        ArrayList arrayList = (ArrayList) this.d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            xb xbVar = (xb) arrayList.get(size);
            int i5 = xbVar.a;
            if (i5 == 8) {
                int i6 = xbVar.b;
                int i7 = xbVar.d;
                if (i6 < i7) {
                    i4 = i6;
                    i3 = i7;
                } else {
                    i3 = i6;
                    i4 = i7;
                }
                if (i < i4 || i > i3) {
                    if (i < i6) {
                        if (i2 == 1) {
                            xbVar.b = i6 + 1;
                            xbVar.d = i7 + 1;
                        } else if (i2 == 2) {
                            xbVar.b = i6 - 1;
                            xbVar.d = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        xbVar.d = i7 + 1;
                    } else if (i2 == 2) {
                        xbVar.d = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        xbVar.b = i6 + 1;
                    } else if (i2 == 2) {
                        xbVar.b = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = xbVar.b;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= xbVar.d;
                    } else if (i5 == 2) {
                        i += xbVar.d;
                    }
                } else if (i2 == 1) {
                    xbVar.b = i8 + 1;
                } else if (i2 == 2) {
                    xbVar.b = i8 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            xb xbVar2 = (xb) arrayList.get(size2);
            if (xbVar2.a == 8) {
                int i9 = xbVar2.d;
                if (i9 == xbVar2.b || i9 < 0) {
                    arrayList.remove(size2);
                    xbVar2.c = null;
                    ci6Var.d(xbVar2);
                }
            } else if (xbVar2.d <= 0) {
                arrayList.remove(size2);
                xbVar2.c = null;
                ci6Var.d(xbVar2);
            }
        }
        return i;
    }

    public void B(Object obj) {
        Object obj2 = this.e;
        this.e = obj;
        if (obj2.equals(obj)) {
            return;
        }
        e62 e62Var = ((v52) this.d).b;
        ((Integer) obj2).getClass();
        Integer num = (Integer) obj;
        int iIntValue = num.intValue();
        e62Var.c1();
        e62Var.S0(1, 10, num);
        e62Var.S0(2, 10, num);
        e62Var.m.f(21, new u52(iIntValue, 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        if (r9 < r2.b) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(long r9, defpackage.h26 r11) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.d
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0
            java.lang.Object r1 = r8.e
            java.util.PriorityQueue r1 = (java.util.PriorityQueue) r1
            int r2 = r8.a
            if (r2 == 0) goto L9e
            r3 = -1
            if (r2 == r3) goto L27
            int r2 = r1.size()
            int r4 = r8.a
            if (r2 < r4) goto L27
            java.lang.Object r2 = r1.peek()
            z37 r2 = (defpackage.z37) r2
            java.lang.String r4 = defpackage.j29.a
            long r4 = r2.b
            int r2 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r2 >= 0) goto L27
            goto L9e
        L27:
            java.lang.Object r2 = r8.c
            java.util.ArrayDeque r2 = (java.util.ArrayDeque) r2
            boolean r4 = r2.isEmpty()
            if (r4 == 0) goto L37
            h26 r2 = new h26
            r2.<init>()
            goto L3d
        L37:
            java.lang.Object r2 = r2.pop()
            h26 r2 = (defpackage.h26) r2
        L3d:
            int r4 = r11.a()
            r2.G(r4)
            byte[] r4 = r11.a
            int r11 = r11.b
            byte[] r5 = r2.a
            int r6 = r2.a()
            r7 = 0
            java.lang.System.arraycopy(r4, r11, r5, r7, r6)
            java.lang.Object r11 = r8.f
            z37 r11 = (defpackage.z37) r11
            if (r11 == 0) goto L64
            long r4 = r11.b
            int r4 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r4 != 0) goto L64
            java.util.ArrayList r9 = r11.a
            r9.add(r2)
            return
        L64:
            boolean r11 = r0.isEmpty()
            if (r11 == 0) goto L70
            z37 r11 = new z37
            r11.<init>()
            goto L76
        L70:
            java.lang.Object r11 = r0.pop()
            z37 r11 = (defpackage.z37) r11
        L76:
            java.util.ArrayList r0 = r11.a
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r4 == 0) goto L82
            r7 = 1
        L82:
            defpackage.vy2.j(r7)
            boolean r4 = r0.isEmpty()
            defpackage.vy2.s(r4)
            r11.b = r9
            r0.add(r2)
            r1.add(r11)
            r8.f = r11
            int r9 = r8.a
            if (r9 == r3) goto L9d
            r8.j(r9)
        L9d:
            return
        L9e:
            java.lang.Object r0 = r8.b
            a47 r0 = (defpackage.a47) r0
            r0.h(r9, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yb.a(long, h26):void");
    }

    public void b() {
        View view = (View) this.b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((x11) this.d) != null) {
                if (((x11) this.f) == null) {
                    this.f = new x11();
                }
                x11 x11Var = (x11) this.f;
                x11Var.c = null;
                x11Var.b = false;
                x11Var.d = null;
                x11Var.a = false;
                WeakHashMap weakHashMap = q69.a;
                ColorStateList colorStateListC = h69.c(view);
                if (colorStateListC != null) {
                    x11Var.b = true;
                    x11Var.c = colorStateListC;
                }
                PorterDuff.Mode modeD = h69.d(view);
                if (modeD != null) {
                    x11Var.a = true;
                    x11Var.d = modeD;
                }
                if (x11Var.b || x11Var.a) {
                    pn.e(background, x11Var, view.getDrawableState());
                    return;
                }
            }
            x11 x11Var2 = (x11) this.e;
            if (x11Var2 != null) {
                pn.e(background, x11Var2, view.getDrawableState());
                return;
            }
            x11 x11Var3 = (x11) this.d;
            if (x11Var3 != null) {
                pn.e(background, x11Var3, view.getDrawableState());
            }
        }
    }

    public boolean c(int i) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            xb xbVar = (xb) arrayList.get(i2);
            int i3 = xbVar.a;
            if (i3 != 8) {
                if (i3 == 1) {
                    int i4 = xbVar.b;
                    int i5 = xbVar.d + i4;
                    while (i4 < i5) {
                        if (i(i4, i2 + 1) == i) {
                            return true;
                        }
                        i4++;
                    }
                } else {
                    continue;
                }
            } else {
                if (i(xbVar.d, i2 + 1) == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public void d() {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((t15) this.e).b((xb) arrayList.get(i));
        }
        t(arrayList);
        this.a = 0;
    }

    public void e() {
        t15 t15Var = (t15) this.e;
        d();
        ArrayList arrayList = (ArrayList) this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            xb xbVar = (xb) arrayList.get(i);
            int i2 = xbVar.a;
            if (i2 == 1) {
                t15Var.b(xbVar);
                t15Var.k(xbVar.b, xbVar.d);
            } else if (i2 == 2) {
                t15Var.b(xbVar);
                int i3 = xbVar.b;
                int i4 = xbVar.d;
                RecyclerView recyclerView = (RecyclerView) t15Var.b;
                recyclerView.U(i3, i4, true);
                recyclerView.H0 = true;
                recyclerView.E0.c += i4;
            } else if (i2 == 4) {
                t15Var.b(xbVar);
                t15Var.i(xbVar.b, xbVar.d, xbVar.c);
            } else if (i2 == 8) {
                t15Var.b(xbVar);
                t15Var.l(xbVar.b, xbVar.d);
            }
        }
        t(arrayList);
        this.a = 0;
    }

    public void g(xb xbVar) {
        int i;
        ci6 ci6Var = (ci6) this.b;
        int i2 = xbVar.a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iA = A(xbVar.b, i2);
        int i3 = xbVar.b;
        int i4 = xbVar.a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + xbVar);
            }
            i = 1;
        }
        int i5 = 1;
        for (int i6 = 1; i6 < xbVar.d; i6++) {
            int iA2 = A((i * i6) + xbVar.b, xbVar.a);
            int i7 = xbVar.a;
            if (i7 == 2 ? iA2 != iA : !(i7 == 4 && iA2 == iA + 1)) {
                xb xbVarO = o(xbVar.c, i7, iA, i5);
                h(xbVarO, i3);
                xbVarO.c = null;
                ci6Var.d(xbVarO);
                if (xbVar.a == 4) {
                    i3 += i5;
                }
                i5 = 1;
                iA = iA2;
            } else {
                i5++;
            }
        }
        Object obj = xbVar.c;
        xbVar.c = null;
        ci6Var.d(xbVar);
        if (i5 > 0) {
            xb xbVarO2 = o(obj, xbVar.a, iA, i5);
            h(xbVarO2, i3);
            xbVarO2.c = null;
            ci6Var.d(xbVarO2);
        }
    }

    public void h(xb xbVar, int i) {
        t15 t15Var = (t15) this.e;
        t15Var.b(xbVar);
        int i2 = xbVar.a;
        if (i2 != 2) {
            if (i2 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            t15Var.i(i, xbVar.d, xbVar.c);
        } else {
            int i3 = xbVar.d;
            RecyclerView recyclerView = (RecyclerView) t15Var.b;
            recyclerView.U(i, i3, true);
            recyclerView.H0 = true;
            recyclerView.E0.c += i3;
        }
    }

    public int i(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        while (i2 < size) {
            xb xbVar = (xb) arrayList.get(i2);
            int i3 = xbVar.a;
            if (i3 == 8) {
                int i4 = xbVar.b;
                if (i4 == i) {
                    i = xbVar.d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (xbVar.d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = xbVar.b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = xbVar.d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += xbVar.d;
                }
            }
            i2++;
        }
        return i;
    }

    public void j(int i) {
        ArrayList arrayList;
        PriorityQueue priorityQueue = (PriorityQueue) this.e;
        while (priorityQueue.size() > i) {
            z37 z37Var = (z37) priorityQueue.poll();
            String str = j29.a;
            int i2 = 0;
            while (true) {
                arrayList = z37Var.a;
                if (i2 >= arrayList.size()) {
                    break;
                }
                ((a47) this.b).h(z37Var.b, (h26) arrayList.get(i2));
                ((ArrayDeque) this.c).push((h26) arrayList.get(i2));
                i2++;
            }
            arrayList.clear();
            z37 z37Var2 = (z37) this.f;
            if (z37Var2 != null && z37Var2.b == z37Var.b) {
                this.f = null;
            }
            ((ArrayDeque) this.d).push(z37Var);
        }
    }

    public ColorStateList k() {
        x11 x11Var = (x11) this.e;
        if (x11Var != null) {
            return (ColorStateList) x11Var.c;
        }
        return null;
    }

    public PorterDuff.Mode l() {
        x11 x11Var = (x11) this.e;
        if (x11Var != null) {
            return (PorterDuff.Mode) x11Var.d;
        }
        return null;
    }

    public boolean m() {
        return ((ArrayList) this.c).size() > 0;
    }

    public void n(AttributeSet attributeSet, int i) {
        ColorStateList colorStateListI;
        View view = (View) this.b;
        sk6 sk6VarD = sk6.D(view.getContext(), attributeSet, lu6.ViewBackgroundHelper, i);
        TypedArray typedArray = (TypedArray) sk6VarD.c;
        View view2 = (View) this.b;
        q69.p(view2, view2.getContext(), lu6.ViewBackgroundHelper, attributeSet, (TypedArray) sk6VarD.c, i);
        try {
            if (typedArray.hasValue(lu6.ViewBackgroundHelper_android_background)) {
                this.a = typedArray.getResourceId(lu6.ViewBackgroundHelper_android_background, -1);
                pn pnVar = (pn) this.c;
                Context context = view.getContext();
                int i2 = this.a;
                synchronized (pnVar) {
                    colorStateListI = pnVar.a.i(context, i2);
                }
                if (colorStateListI != null) {
                    v(colorStateListI);
                }
            }
            if (typedArray.hasValue(lu6.ViewBackgroundHelper_backgroundTint)) {
                h69.j(view, sk6VarD.t(lu6.ViewBackgroundHelper_backgroundTint));
            }
            if (typedArray.hasValue(lu6.ViewBackgroundHelper_backgroundTintMode)) {
                h69.k(view, aw1.c(typedArray.getInt(lu6.ViewBackgroundHelper_backgroundTintMode, -1), null));
            }
            sk6VarD.G();
        } catch (Throwable th) {
            sk6VarD.G();
            throw th;
        }
    }

    public xb o(Object obj, int i, int i2, int i3) {
        xb xbVar = (xb) ((ci6) this.b).e();
        if (xbVar != null) {
            xbVar.a = i;
            xbVar.b = i2;
            xbVar.d = i3;
            xbVar.c = obj;
            return xbVar;
        }
        xb xbVar2 = new xb();
        xbVar2.a = i;
        xbVar2.b = i2;
        xbVar2.d = i3;
        xbVar2.c = obj;
        return xbVar2;
    }

    public void p() {
        this.a = -1;
        v(null);
        b();
    }

    public void q(int i) {
        ColorStateList colorStateListI;
        this.a = i;
        pn pnVar = (pn) this.c;
        if (pnVar != null) {
            Context context = ((View) this.b).getContext();
            synchronized (pnVar) {
                colorStateListI = pnVar.a.i(context, i);
            }
        } else {
            colorStateListI = null;
        }
        v(colorStateListI);
        b();
    }

    public void r(xb xbVar) {
        t15 t15Var = (t15) this.e;
        ((ArrayList) this.d).add(xbVar);
        int i = xbVar.a;
        if (i == 1) {
            t15Var.k(xbVar.b, xbVar.d);
            return;
        }
        if (i == 2) {
            int i2 = xbVar.b;
            int i3 = xbVar.d;
            RecyclerView recyclerView = (RecyclerView) t15Var.b;
            recyclerView.U(i2, i3, false);
            recyclerView.H0 = true;
            return;
        }
        if (i == 4) {
            t15Var.i(xbVar.b, xbVar.d, xbVar.c);
        } else if (i == 8) {
            t15Var.l(xbVar.b, xbVar.d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + xbVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:187:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0138 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x012b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x00e3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0015 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void s() {
        /*
            Method dump skipped, instruction units count: 704
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yb.s():void");
    }

    public void t(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            xb xbVar = (xb) arrayList.get(i);
            xbVar.c = null;
            ((ci6) this.b).d(xbVar);
        }
        arrayList.clear();
    }

    public void u(Runnable runnable) {
        wd8 wd8Var = (wd8) this.b;
        if (wd8Var.a.getLooper().getThread().isAlive()) {
            wd8Var.c(runnable);
        }
    }

    public void v(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((x11) this.d) == null) {
                this.d = new x11();
            }
            x11 x11Var = (x11) this.d;
            x11Var.c = colorStateList;
            x11Var.b = true;
        } else {
            this.d = null;
        }
        b();
    }

    public void w(int i) {
        vy2.s(i >= 0);
        this.a = i;
        j(i);
    }

    public void x(ColorStateList colorStateList) {
        if (((x11) this.e) == null) {
            this.e = new x11();
        }
        x11 x11Var = (x11) this.e;
        x11Var.c = colorStateList;
        x11Var.b = true;
        b();
    }

    public void y(PorterDuff.Mode mode) {
        if (((x11) this.e) == null) {
            this.e = new x11();
        }
        x11 x11Var = (x11) this.e;
        x11Var.d = mode;
        x11Var.a = true;
        b();
    }

    public void z(TextView textView) {
        ColorStateList colorStateList = (ColorStateList) this.c;
        fk4 fk4Var = new fk4();
        fk4 fk4Var2 = new fk4();
        as7 as7Var = (as7) this.f;
        fk4Var.setShapeAppearanceModel(as7Var);
        fk4Var2.setShapeAppearanceModel(as7Var);
        fk4Var.s((ColorStateList) this.d);
        float f = this.a;
        ColorStateList colorStateList2 = (ColorStateList) this.e;
        fk4Var.z(f);
        fk4Var.y(colorStateList2);
        textView.setTextColor(colorStateList);
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateList.withAlpha(30), fk4Var, fk4Var2);
        Rect rect = (Rect) this.b;
        textView.setBackground(new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }

    public yb(a47 a47Var) {
        this.b = a47Var;
        this.c = new ArrayDeque();
        this.d = new ArrayDeque();
        this.e = new PriorityQueue();
        this.a = -1;
    }

    public yb() {
        this.b = new sc3[32];
        this.c = new float[32];
        this.d = new byte[32];
        sb5 sb5Var = de7.a;
        this.e = new sb5();
        this.f = new sb5();
    }
}
