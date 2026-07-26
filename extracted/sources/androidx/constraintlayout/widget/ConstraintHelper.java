package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import defpackage.b31;
import defpackage.eu6;
import defpackage.f31;
import defpackage.oy2;
import io.sentry.android.core.t0;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class ConstraintHelper extends View {
    public int[] a;
    public int b;
    public final Context c;
    public oy2 d;
    public boolean e;
    public String f;
    public String g;
    public View[] h;
    public final HashMap i;

    public ConstraintHelper(Context context) {
        super(context);
        this.a = new int[32];
        this.e = false;
        this.h = null;
        this.i = new HashMap();
        this.c = context;
        k(null);
    }

    public final void b(String str) {
        if (str == null || str.length() == 0 || this.c == null) {
            return;
        }
        String strTrim = str.trim();
        int i = i(strTrim);
        if (i != 0) {
            this.i.put(Integer.valueOf(i), strTrim);
            c(i);
        } else {
            t0.m("ConstraintHelper", "Could not find id of \"" + strTrim + "\"");
        }
    }

    public final void c(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.b + 1;
        int[] iArr = this.a;
        if (i2 > iArr.length) {
            this.a = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.a;
        int i3 = this.b;
        iArr2[i3] = i;
        this.b = i3 + 1;
    }

    public final void d(String str) {
        if (str == null || str.length() == 0 || this.c == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            t0.m("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.LayoutParams) && strTrim.equals(((ConstraintLayout.LayoutParams) layoutParams).Y)) {
                if (childAt.getId() == -1) {
                    t0.m("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    c(childAt.getId());
                }
            }
        }
    }

    public final void e() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        f((ConstraintLayout) parent);
    }

    public final void f(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.b; i++) {
            View viewK = constraintLayout.k(this.a[i]);
            if (viewK != null) {
                viewK.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewK.setTranslationZ(viewK.getTranslationZ() + elevation);
                }
            }
        }
    }

    public void g(ConstraintLayout constraintLayout) {
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.a, this.b);
    }

    public final int h(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String resourceEntryName;
        if (str != null && (resources = this.c.getResources()) != null) {
            int childCount = constraintLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = constraintLayout.getChildAt(i);
                if (childAt.getId() != -1) {
                    try {
                        resourceEntryName = resources.getResourceEntryName(childAt.getId());
                    } catch (Resources.NotFoundException unused) {
                        resourceEntryName = null;
                    }
                    if (str.equals(resourceEntryName)) {
                        return childAt.getId();
                    }
                }
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int i(java.lang.String r5) {
        /*
            r4 = this;
            android.view.ViewParent r0 = r4.getParent()
            boolean r0 = r0 instanceof androidx.constraintlayout.widget.ConstraintLayout
            r1 = 0
            if (r0 == 0) goto L10
            android.view.ViewParent r0 = r4.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            goto L11
        L10:
            r0 = r1
        L11:
            boolean r2 = r4.isInEditMode()
            if (r2 == 0) goto L3c
            if (r0 == 0) goto L3c
            boolean r2 = defpackage.o40.O(r5)
            if (r2 == 0) goto L30
            java.util.HashMap r2 = r0.m
            if (r2 == 0) goto L30
            boolean r2 = r2.containsKey(r5)
            if (r2 == 0) goto L30
            java.util.HashMap r2 = r0.m
            java.lang.Object r2 = r2.get(r5)
            goto L31
        L30:
            r2 = r1
        L31:
            boolean r3 = r2 instanceof java.lang.Integer
            if (r3 == 0) goto L3c
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            goto L3d
        L3c:
            r2 = 0
        L3d:
            if (r2 != 0) goto L45
            if (r0 == 0) goto L45
            int r2 = r4.h(r0, r5)
        L45:
            if (r2 != 0) goto L51
            java.lang.Class<wr6> r0 = defpackage.wr6.class
            java.lang.reflect.Field r0 = r0.getField(r5)     // Catch: java.lang.Exception -> L51
            int r2 = r0.getInt(r1)     // Catch: java.lang.Exception -> L51
        L51:
            if (r2 != 0) goto L63
            android.content.Context r0 = r4.c
            android.content.res.Resources r1 = r0.getResources()
            java.lang.String r2 = "id"
            java.lang.String r0 = r0.getPackageName()
            int r2 = r1.getIdentifier(r5, r2, r0)
        L63:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintHelper.i(java.lang.String):int");
    }

    public final View[] j(ConstraintLayout constraintLayout) {
        View[] viewArr = this.h;
        if (viewArr == null || viewArr.length != this.b) {
            this.h = new View[this.b];
        }
        for (int i = 0; i < this.b; i++) {
            this.h[i] = constraintLayout.k(this.a[i]);
        }
        return this.h;
    }

    public void k(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, eu6.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == eu6.ConstraintLayout_Layout_constraint_referenced_ids) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f = string;
                    setIds(string);
                } else if (index == eu6.ConstraintLayout_Layout_constraint_referenced_tags) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.g = string2;
                    setReferenceTags(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void l(c cVar, oy2 oy2Var, Constraints.LayoutParams layoutParams, SparseArray sparseArray) {
        b31 b31Var = cVar.e;
        int[] iArr = b31Var.j0;
        int i = 0;
        if (iArr != null) {
            setReferencedIds(iArr);
        } else {
            String str = b31Var.k0;
            if (str != null) {
                if (str.length() > 0) {
                    String[] strArrSplit = b31Var.k0.split(",");
                    int[] iArrCopyOf = new int[strArrSplit.length];
                    int i2 = 0;
                    for (String str2 : strArrSplit) {
                        int i3 = i(str2.trim());
                        if (i3 != 0) {
                            iArrCopyOf[i2] = i3;
                            i2++;
                        }
                    }
                    if (i2 != strArrSplit.length) {
                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i2);
                    }
                    b31Var.j0 = iArrCopyOf;
                } else {
                    b31Var.j0 = null;
                }
            }
        }
        oy2Var.v0 = 0;
        Arrays.fill(oy2Var.u0, (Object) null);
        if (b31Var.j0 == null) {
            return;
        }
        while (true) {
            int[] iArr2 = b31Var.j0;
            if (i >= iArr2.length) {
                return;
            }
            f31 f31Var = (f31) sparseArray.get(iArr2[i]);
            if (f31Var != null) {
                oy2Var.S(f31Var);
            }
            i++;
        }
    }

    public void o(ConstraintLayout constraintLayout) {
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.g;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.e) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void p(oy2 oy2Var, SparseArray sparseArray) {
        oy2Var.v0 = 0;
        Arrays.fill(oy2Var.u0, (Object) null);
        for (int i = 0; i < this.b; i++) {
            oy2Var.S((f31) sparseArray.get(this.a[i]));
        }
    }

    public final void q() {
        if (this.d == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            ((ConstraintLayout.LayoutParams) layoutParams).q0 = this.d;
        }
    }

    public void setIds(String str) {
        this.f = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.b = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                b(str.substring(i));
                return;
            } else {
                b(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.g = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.b = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                d(str.substring(i));
                return;
            } else {
                d(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f = null;
        this.b = 0;
        for (int i : iArr) {
            c(i);
        }
    }

    @Override // android.view.View
    public void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.f == null) {
            c(i);
        }
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new int[32];
        this.e = false;
        this.h = null;
        this.i = new HashMap();
        this.c = context;
        k(attributeSet);
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new int[32];
        this.e = false;
        this.h = null;
        this.i = new HashMap();
        this.c = context;
        k(attributeSet);
    }

    public void n() {
    }

    public void m(f31 f31Var, boolean z) {
    }
}
