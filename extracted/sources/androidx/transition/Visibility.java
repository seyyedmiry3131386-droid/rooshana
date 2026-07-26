package androidx.transition;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import defpackage.a27;
import defpackage.wq2;
import defpackage.wr8;
import defpackage.y37;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class Visibility extends Transition {
    public static final String[] I = {"android:visibility:visibility", "android:visibility:parent"};
    public int H;

    public Visibility() {
        this.H = 3;
    }

    public static void P(wr8 wr8Var) {
        View view = wr8Var.b;
        int visibility = view.getVisibility();
        HashMap map = wr8Var.a;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.y37 Q(defpackage.wr8 r8, defpackage.wr8 r9) {
        /*
            y37 r0 = new y37
            r0.<init>()
            r1 = 0
            r0.a = r1
            r0.b = r1
            r2 = 0
            r3 = -1
            java.lang.String r4 = "android:visibility:parent"
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L2f
            java.util.HashMap r6 = r8.a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L2f
            java.lang.Object r7 = r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.c = r7
            java.lang.Object r6 = r6.get(r4)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.e = r6
            goto L33
        L2f:
            r0.c = r3
            r0.e = r2
        L33:
            if (r9 == 0) goto L52
            java.util.HashMap r6 = r9.a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L52
            java.lang.Object r2 = r6.get(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.d = r2
            java.lang.Object r2 = r6.get(r4)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f = r2
            goto L56
        L52:
            r0.d = r3
            r0.f = r2
        L56:
            r2 = 1
            if (r8 == 0) goto L92
            if (r9 == 0) goto L92
            int r8 = r0.c
            int r9 = r0.d
            if (r8 != r9) goto L6c
            java.lang.Object r3 = r0.e
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            java.lang.Object r4 = r0.f
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            if (r3 != r4) goto L6c
            goto La7
        L6c:
            if (r8 == r9) goto L7c
            if (r8 != 0) goto L75
            r0.b = r1
            r0.a = r2
            return r0
        L75:
            if (r9 != 0) goto La7
            r0.b = r2
            r0.a = r2
            return r0
        L7c:
            java.lang.Object r8 = r0.f
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            if (r8 != 0) goto L87
            r0.b = r1
            r0.a = r2
            return r0
        L87:
            java.lang.Object r8 = r0.e
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            if (r8 != 0) goto La7
            r0.b = r2
            r0.a = r2
            return r0
        L92:
            if (r8 != 0) goto L9d
            int r8 = r0.d
            if (r8 != 0) goto L9d
            r0.b = r2
            r0.a = r2
            return r0
        L9d:
            if (r9 != 0) goto La7
            int r8 = r0.c
            if (r8 != 0) goto La7
            r0.b = r1
            r0.a = r2
        La7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.Visibility.Q(wr8, wr8):y37");
    }

    public Animator R(ViewGroup viewGroup, View view, wr8 wr8Var, wr8 wr8Var2) {
        return null;
    }

    public Animator S(ViewGroup viewGroup, View view, wr8 wr8Var, wr8 wr8Var2) {
        return null;
    }

    public final void T(int i) {
        if ((i & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.H = i;
    }

    @Override // androidx.transition.Transition
    public void d(wr8 wr8Var) {
        P(wr8Var);
    }

    @Override // androidx.transition.Transition
    public void g(wr8 wr8Var) {
        P(wr8Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        if (Q(p(r5, false), t(r5, false)).a != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x020e  */
    @Override // androidx.transition.Transition
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.animation.Animator k(android.view.ViewGroup r25, defpackage.wr8 r26, defpackage.wr8 r27) {
        /*
            Method dump skipped, instruction units count: 675
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.Visibility.k(android.view.ViewGroup, wr8, wr8):android.animation.Animator");
    }

    @Override // androidx.transition.Transition
    public final String[] s() {
        return I;
    }

    @Override // androidx.transition.Transition
    public final boolean w(wr8 wr8Var, wr8 wr8Var2) {
        if (wr8Var == null && wr8Var2 == null) {
            return false;
        }
        if (wr8Var != null && wr8Var2 != null && wr8Var2.a.containsKey("android:visibility:visibility") != wr8Var.a.containsKey("android:visibility:visibility")) {
            return false;
        }
        y37 y37VarQ = Q(wr8Var, wr8Var2);
        if (y37VarQ.a) {
            return y37VarQ.c == 0 || y37VarQ.d == 0;
        }
        return false;
    }

    public Visibility(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.H = 3;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wq2.i);
        int iF = a27.f(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionVisibilityMode", 0, 0);
        typedArrayObtainStyledAttributes.recycle();
        if (iF != 0) {
            T(iF);
        }
    }
}
