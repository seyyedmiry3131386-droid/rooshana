package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import defpackage.az4;
import defpackage.b31;
import defpackage.bz4;
import defpackage.c31;
import defpackage.d31;
import defpackage.dw1;
import defpackage.e31;
import defpackage.eu6;
import defpackage.ey3;
import defpackage.j58;
import defpackage.ky4;
import defpackage.ly4;
import defpackage.on;
import defpackage.pt2;
import defpackage.vy2;
import defpackage.w21;
import defpackage.w99;
import defpackage.wr6;
import defpackage.x99;
import defpackage.yy1;
import io.sentry.android.core.t0;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final MotionLayout a;
    public final j58 b;
    public bz4 c;
    public final ArrayList d;
    public final bz4 e;
    public final ArrayList f;
    public final SparseArray g;
    public final HashMap h;
    public final SparseIntArray i;
    public int j;
    public int k;
    public MotionEvent l;
    public boolean m;
    public boolean n;
    public pt2 o;
    public boolean p;
    public final on q;
    public float r;
    public float s;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public b(Context context, MotionLayout motionLayout, int i) {
        this.b = null;
        this.c = null;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.e = null;
        this.f = new ArrayList();
        this.g = new SparseArray();
        this.h = new HashMap();
        this.i = new SparseIntArray();
        this.j = ErrorDTO.CODE_ACCESS_DENIED;
        this.k = 0;
        this.m = false;
        this.n = false;
        this.a = motionLayout;
        on onVar = new on();
        onVar.b = new ArrayList();
        onVar.d = "ViewTransitionController";
        onVar.f = new ArrayList();
        onVar.a = motionLayout;
        this.q = onVar;
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            bz4 bz4Var = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                i(context, xml);
                            }
                            break;
                        case -1239391468:
                            if (name.equals("KeyFrameSet")) {
                                ey3 ey3Var = new ey3(context, xml);
                                if (bz4Var != null) {
                                    bz4Var.k.add(ey3Var);
                                }
                            }
                            break;
                        case -687739768:
                            if (name.equals("Include")) {
                                k(context, xml);
                            }
                            break;
                        case 61998586:
                            if (name.equals("ViewTransition")) {
                                w99 w99Var = new w99(context, xml);
                                on onVar2 = this.q;
                                ((ArrayList) onVar2.b).add(w99Var);
                                onVar2.c = null;
                                int i2 = w99Var.b;
                                if (i2 == 4) {
                                    ConstraintLayout.getSharedValues().a(w99Var.u, new x99());
                                } else if (i2 == 5) {
                                    ConstraintLayout.getSharedValues().a(w99Var.u, new x99());
                                }
                            }
                            break;
                        case 269306229:
                            if (name.equals("Transition")) {
                                bz4Var = new bz4(this, context, xml);
                                arrayList.add(bz4Var);
                                if (this.c == null && !bz4Var.b) {
                                    this.c = bz4Var;
                                    c cVar = bz4Var.l;
                                    if (cVar != null) {
                                        cVar.c(this.p);
                                    }
                                }
                                if (bz4Var.b) {
                                    if (bz4Var.c == -1) {
                                        this.e = bz4Var;
                                    } else {
                                        this.f.add(bz4Var);
                                    }
                                    arrayList.remove(bz4Var);
                                }
                            }
                            break;
                        case 312750793:
                            if (name.equals("OnClick") && bz4Var != null && !motionLayout.isInEditMode()) {
                                bz4Var.m.add(new az4(context, bz4Var, xml));
                            }
                            break;
                        case 327855227:
                            if (name.equals("OnSwipe")) {
                                if (bz4Var == null) {
                                    context.getResources().getResourceEntryName(i);
                                    xml.getLineNumber();
                                }
                                if (bz4Var != null) {
                                    bz4Var.l = new c(context, motionLayout, xml);
                                }
                            }
                            break;
                        case 793277014:
                            if (name.equals("MotionScene")) {
                                l(context, xml);
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                this.b = new j58(context, xml);
                            }
                            break;
                        case 1942574248:
                            if (name.equals("include")) {
                                k(context, xml);
                            }
                            break;
                    }
                }
            }
        } catch (IOException e) {
            t0.e("MotionScene", "Error parsing resource: " + i, e);
        } catch (XmlPullParserException e2) {
            t0.e("MotionScene", "Error parsing resource: " + i, e2);
        }
        this.g.put(wr6.motion_base, new d());
        this.h.put("motion_base", Integer.valueOf(wr6.motion_base));
    }

    public static int d(Context context, String str) {
        int identifier;
        if (str.contains("/")) {
            identifier = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), "id", context.getPackageName());
        } else {
            identifier = -1;
        }
        if (identifier == -1) {
            if (str.length() > 1) {
                return Integer.parseInt(str.substring(1));
            }
            t0.d("MotionScene", "error in parsing id");
        }
        return identifier;
    }

    public final boolean a(int i, MotionLayout motionLayout) {
        bz4 bz4Var;
        if (this.o != null) {
            return false;
        }
        for (bz4 bz4Var2 : this.d) {
            int i2 = bz4Var2.n;
            if (i2 != 0 && ((bz4Var = this.c) != bz4Var2 || (bz4Var.r & 2) == 0)) {
                int i3 = bz4Var2.d;
                MotionLayout.TransitionState transitionState = MotionLayout.TransitionState.d;
                MotionLayout.TransitionState transitionState2 = MotionLayout.TransitionState.c;
                MotionLayout.TransitionState transitionState3 = MotionLayout.TransitionState.b;
                if (i == i3 && (i2 == 4 || i2 == 2)) {
                    motionLayout.setState(transitionState);
                    motionLayout.setTransition(bz4Var2);
                    if (bz4Var2.n == 4) {
                        motionLayout.u(1.0f);
                        motionLayout.S0 = null;
                        motionLayout.setState(transitionState3);
                        motionLayout.setState(transitionState2);
                        return true;
                    }
                    motionLayout.setProgress(1.0f);
                    motionLayout.w(true);
                    motionLayout.setState(transitionState3);
                    motionLayout.setState(transitionState2);
                    motionLayout.setState(transitionState);
                    motionLayout.D();
                    return true;
                }
                if (i == bz4Var2.c && (i2 == 3 || i2 == 1)) {
                    motionLayout.setState(transitionState);
                    motionLayout.setTransition(bz4Var2);
                    if (bz4Var2.n == 3) {
                        motionLayout.u(0.0f);
                        motionLayout.setState(transitionState3);
                        motionLayout.setState(transitionState2);
                        return true;
                    }
                    motionLayout.setProgress(0.0f);
                    motionLayout.w(true);
                    motionLayout.setState(transitionState3);
                    motionLayout.setState(transitionState2);
                    motionLayout.setState(transitionState);
                    motionLayout.D();
                    return true;
                }
            }
        }
        return false;
    }

    public final d b(int i) {
        int iA;
        j58 j58Var = this.b;
        if (j58Var != null && (iA = j58Var.a(i)) != -1) {
            i = iA;
        }
        SparseArray sparseArray = this.g;
        if (sparseArray.get(i) != null) {
            return (d) sparseArray.get(i);
        }
        t0.d("MotionScene", "Warning could not find ConstraintSet id/" + vy2.E(this.a.getContext(), i) + " In MotionScene");
        return (d) sparseArray.get(sparseArray.keyAt(0));
    }

    public final int c() {
        bz4 bz4Var = this.c;
        return bz4Var != null ? bz4Var.h : this.j;
    }

    public final Interpolator e() {
        bz4 bz4Var = this.c;
        int i = bz4Var.e;
        if (i == -2) {
            return AnimationUtils.loadInterpolator(this.a.getContext(), this.c.g);
        }
        if (i == -1) {
            return new ky4(yy1.c(bz4Var.f), 1);
        }
        if (i == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i == 1) {
            return new AccelerateInterpolator();
        }
        if (i == 2) {
            return new DecelerateInterpolator();
        }
        if (i == 4) {
            return new BounceInterpolator();
        }
        if (i == 5) {
            return new OvershootInterpolator();
        }
        if (i != 6) {
            return null;
        }
        return new AnticipateInterpolator();
    }

    public final void f(ly4 ly4Var) {
        bz4 bz4Var = this.c;
        if (bz4Var != null) {
            Iterator it = bz4Var.k.iterator();
            while (it.hasNext()) {
                ((ey3) it.next()).a(ly4Var);
            }
        } else {
            bz4 bz4Var2 = this.e;
            if (bz4Var2 != null) {
                Iterator it2 = bz4Var2.k.iterator();
                while (it2.hasNext()) {
                    ((ey3) it2.next()).a(ly4Var);
                }
            }
        }
    }

    public final float g() {
        c cVar;
        bz4 bz4Var = this.c;
        if (bz4Var == null || (cVar = bz4Var.l) == null) {
            return 0.0f;
        }
        return cVar.t;
    }

    public final int h() {
        bz4 bz4Var = this.c;
        if (bz4Var == null) {
            return -1;
        }
        return bz4Var.d;
    }

    public final int i(Context context, XmlResourceParser xmlResourceParser) {
        String attributeValue;
        d dVar = new d();
        dVar.f = false;
        int attributeCount = xmlResourceParser.getAttributeCount();
        int iD = -1;
        int iD2 = -1;
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlResourceParser.getAttributeName(i);
            attributeValue = xmlResourceParser.getAttributeValue(i);
            attributeName.getClass();
            switch (attributeName) {
                case "deriveConstraintsFrom":
                    iD2 = d(context, attributeValue);
                    break;
                case "constraintRotate":
                    try {
                        dVar.d = Integer.parseInt(attributeValue);
                        break;
                    } catch (NumberFormatException unused) {
                        attributeValue.getClass();
                        switch (attributeValue) {
                            case "x_left":
                                dVar.d = 4;
                                break;
                            case "left":
                                dVar.d = 2;
                                break;
                            case "none":
                                dVar.d = 0;
                                break;
                            case "right":
                                dVar.d = 1;
                                break;
                            case "x_right":
                                dVar.d = 3;
                                break;
                        }
                    }
                    break;
                case "id":
                    iD = d(context, attributeValue);
                    int iIndexOf = attributeValue.indexOf(47);
                    if (iIndexOf >= 0) {
                        attributeValue = attributeValue.substring(iIndexOf + 1);
                    }
                    this.h.put(attributeValue, Integer.valueOf(iD));
                    dVar.a = vy2.E(context, iD);
                    break;
                case "stateLabels":
                    dVar.c = attributeValue.split(",");
                    int i2 = 0;
                    while (true) {
                        String[] strArr = dVar.c;
                        if (i2 < strArr.length) {
                            strArr[i2] = strArr[i2].trim();
                            i2++;
                        }
                    }
                    break;
            }
        }
        if (iD != -1) {
            int i3 = this.a.K;
            dVar.n(context, xmlResourceParser);
            if (iD2 != -1) {
                this.i.put(iD, iD2);
            }
            this.g.put(iD, dVar);
        }
        return iD;
    }

    public final int j(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                String name = xml.getName();
                if (2 == eventType && "ConstraintSet".equals(name)) {
                    return i(context, xml);
                }
            }
            return -1;
        } catch (IOException e) {
            t0.e("MotionScene", "Error parsing resource: " + i, e);
            return -1;
        } catch (XmlPullParserException e2) {
            t0.e("MotionScene", "Error parsing resource: " + i, e2);
            return -1;
        }
    }

    public final void k(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), eu6.include);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == eu6.include_constraintSet) {
                j(context, typedArrayObtainStyledAttributes.getResourceId(index, -1));
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void l(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), eu6.MotionScene);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == eu6.MotionScene_defaultDuration) {
                int i2 = typedArrayObtainStyledAttributes.getInt(index, this.j);
                this.j = i2;
                if (i2 < 8) {
                    this.j = 8;
                }
            } else if (index == eu6.MotionScene_layoutDuringTransition) {
                this.k = typedArrayObtainStyledAttributes.getInteger(index, 0);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void m(int i, MotionLayout motionLayout) {
        SparseArray sparseArray = this.g;
        d dVar = (d) sparseArray.get(i);
        String str = dVar.a;
        HashMap map = dVar.g;
        dVar.b = str;
        int i2 = this.i.get(i);
        if (i2 > 0) {
            m(i2, motionLayout);
            d dVar2 = (d) sparseArray.get(i2);
            if (dVar2 == null) {
                t0.d("MotionScene", "ERROR! invalid deriveConstraintsFrom: @id/" + vy2.E(this.a.getContext(), i2));
                return;
            }
            HashMap map2 = dVar2.g;
            dVar.b += "/" + dVar2.b;
            for (Integer num : map2.keySet()) {
                num.getClass();
                androidx.constraintlayout.widget.c cVar = (androidx.constraintlayout.widget.c) map2.get(num);
                if (!map.containsKey(num)) {
                    map.put(num, new androidx.constraintlayout.widget.c());
                }
                androidx.constraintlayout.widget.c cVar2 = (androidx.constraintlayout.widget.c) map.get(num);
                if (cVar2 != null) {
                    b31 b31Var = cVar2.e;
                    if (!b31Var.b) {
                        b31Var.a(cVar.e);
                    }
                    d31 d31Var = cVar2.c;
                    if (!d31Var.a) {
                        d31 d31Var2 = cVar.c;
                        d31Var.a = d31Var2.a;
                        d31Var.b = d31Var2.b;
                        d31Var.d = d31Var2.d;
                        d31Var.e = d31Var2.e;
                        d31Var.c = d31Var2.c;
                    }
                    e31 e31Var = cVar2.f;
                    if (!e31Var.a) {
                        e31Var.a(cVar.f);
                    }
                    c31 c31Var = cVar2.d;
                    if (!c31Var.a) {
                        c31Var.a(cVar.d);
                    }
                    for (String str2 : cVar.g.keySet()) {
                        if (!cVar2.g.containsKey(str2)) {
                            cVar2.g.put(str2, (w21) cVar.g.get(str2));
                        }
                    }
                }
            }
        } else {
            dVar.b = dw1.s(new StringBuilder(), dVar.b, "  layout");
            int childCount = motionLayout.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = motionLayout.getChildAt(i3);
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
                int id = childAt.getId();
                if (dVar.f && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (!map.containsKey(Integer.valueOf(id))) {
                    map.put(Integer.valueOf(id), new androidx.constraintlayout.widget.c());
                }
                androidx.constraintlayout.widget.c cVar3 = (androidx.constraintlayout.widget.c) map.get(Integer.valueOf(id));
                if (cVar3 != null) {
                    d31 d31Var3 = cVar3.c;
                    b31 b31Var2 = cVar3.e;
                    e31 e31Var2 = cVar3.f;
                    if (!b31Var2.b) {
                        cVar3.c(id, layoutParams);
                        if (childAt instanceof ConstraintHelper) {
                            b31Var2.j0 = ((ConstraintHelper) childAt).getReferencedIds();
                            if (childAt instanceof Barrier) {
                                Barrier barrier = (Barrier) childAt;
                                b31Var2.o0 = barrier.getAllowsGoneWidget();
                                b31Var2.g0 = barrier.getType();
                                b31Var2.h0 = barrier.getMargin();
                            }
                        }
                        b31Var2.b = true;
                    }
                    if (!d31Var3.a) {
                        d31Var3.b = childAt.getVisibility();
                        d31Var3.d = childAt.getAlpha();
                        d31Var3.a = true;
                    }
                    if (!e31Var2.a) {
                        e31Var2.a = true;
                        e31Var2.b = childAt.getRotation();
                        e31Var2.c = childAt.getRotationX();
                        e31Var2.d = childAt.getRotationY();
                        e31Var2.e = childAt.getScaleX();
                        e31Var2.f = childAt.getScaleY();
                        float pivotX = childAt.getPivotX();
                        float pivotY = childAt.getPivotY();
                        if (pivotX != 0.0d || pivotY != 0.0d) {
                            e31Var2.g = pivotX;
                            e31Var2.h = pivotY;
                        }
                        e31Var2.j = childAt.getTranslationX();
                        e31Var2.k = childAt.getTranslationY();
                        e31Var2.l = childAt.getTranslationZ();
                        if (e31Var2.m) {
                            e31Var2.n = childAt.getElevation();
                        }
                    }
                }
            }
        }
        for (androidx.constraintlayout.widget.c cVar4 : map.values()) {
            if (cVar4.h != null) {
                if (cVar4.b == null) {
                    cVar4.h.e(dVar.l(cVar4.a));
                } else {
                    Iterator it = map.keySet().iterator();
                    while (it.hasNext()) {
                        androidx.constraintlayout.widget.c cVarL = dVar.l(((Integer) it.next()).intValue());
                        String str3 = cVarL.e.l0;
                        if (str3 != null && cVar4.b.matches(str3)) {
                            cVar4.h.e(cVarL);
                            cVarL.g.putAll((HashMap) cVar4.g.clone());
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n(int r9, int r10) {
        /*
            r8 = this;
            r0 = -1
            j58 r1 = r8.b
            if (r1 == 0) goto L18
            int r1 = r1.a(r9)
            if (r1 == r0) goto Lc
            goto Ld
        Lc:
            r1 = r9
        Ld:
            j58 r2 = r8.b
            int r2 = r2.a(r10)
            if (r2 == r0) goto L16
            goto L1a
        L16:
            r2 = r10
            goto L1a
        L18:
            r1 = r9
            goto L16
        L1a:
            bz4 r3 = r8.c
            if (r3 == 0) goto L27
            int r4 = r3.c
            if (r4 != r10) goto L27
            int r3 = r3.d
            if (r3 != r9) goto L27
            goto L52
        L27:
            java.util.ArrayList r3 = r8.d
            java.util.Iterator r4 = r3.iterator()
        L2d:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L53
            java.lang.Object r5 = r4.next()
            bz4 r5 = (defpackage.bz4) r5
            int r6 = r5.c
            if (r6 != r2) goto L41
            int r7 = r5.d
            if (r7 == r1) goto L47
        L41:
            if (r6 != r10) goto L2d
            int r6 = r5.d
            if (r6 != r9) goto L2d
        L47:
            r8.c = r5
            androidx.constraintlayout.motion.widget.c r9 = r5.l
            if (r9 == 0) goto L52
            boolean r10 = r8.p
            r9.c(r10)
        L52:
            return
        L53:
            java.util.ArrayList r9 = r8.f
            java.util.Iterator r9 = r9.iterator()
            bz4 r4 = r8.e
        L5b:
            boolean r5 = r9.hasNext()
            if (r5 == 0) goto L6d
            java.lang.Object r5 = r9.next()
            bz4 r5 = (defpackage.bz4) r5
            int r6 = r5.c
            if (r6 != r10) goto L5b
            r4 = r5
            goto L5b
        L6d:
            bz4 r9 = new bz4
            r9.<init>(r8, r4)
            r9.d = r1
            r9.c = r2
            if (r1 == r0) goto L7b
            r3.add(r9)
        L7b:
            r8.c = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.b.n(int, int):void");
    }

    public final boolean o() {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            if (((bz4) it.next()).l != null) {
                return true;
            }
        }
        bz4 bz4Var = this.c;
        return (bz4Var == null || bz4Var.l == null) ? false : true;
    }
}
