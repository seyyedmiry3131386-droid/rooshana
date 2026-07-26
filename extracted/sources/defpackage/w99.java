package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
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
import androidx.constraintlayout.motion.widget.b;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.c;
import androidx.constraintlayout.widget.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class w99 {
    public int a;
    public int e;
    public final ey3 f;
    public final c g;
    public int j;
    public String k;
    public final Context o;
    public int b = -1;
    public boolean c = false;
    public int d = 0;
    public int h = -1;
    public int i = -1;
    public int l = 0;
    public String m = null;
    public int n = -1;
    public int p = -1;
    public int q = -1;
    public int r = -1;
    public int s = -1;
    public int t = -1;
    public int u = -1;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0097 A[Catch: IOException -> 0x0043, XmlPullParserException -> 0x0046, TryCatch #2 {IOException -> 0x0043, XmlPullParserException -> 0x0046, blocks: (B:3:0x0028, B:37:0x00ca, B:11:0x0037, B:18:0x0049, B:19:0x0051, B:36:0x0097, B:21:0x0055, B:26:0x0066, B:24:0x005e, B:27:0x006e, B:29:0x0074, B:30:0x0078, B:32:0x0080, B:33:0x0088, B:35:0x0090), top: B:42:0x0028 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public w99(android.content.Context r6, android.content.res.XmlResourceParser r7) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w99.<init>(android.content.Context, android.content.res.XmlResourceParser):void");
    }

    public final void a(on onVar, MotionLayout motionLayout, int i, d dVar, View... viewArr) {
        Interpolator interpolatorLoadInterpolator;
        Interpolator interpolator;
        if (this.c) {
            return;
        }
        int i2 = this.e;
        ey3 ey3Var = this.f;
        int i3 = 0;
        if (i2 != 2) {
            c cVar = this.g;
            if (i2 == 1) {
                int[] constraintSetIds = motionLayout.getConstraintSetIds();
                int i4 = 0;
                while (i4 < constraintSetIds.length) {
                    int i5 = constraintSetIds[i4];
                    if (i5 != i) {
                        b bVar = motionLayout.q;
                        d dVarB = bVar == null ? null : bVar.b(i5);
                        int length = viewArr.length;
                        for (int i6 = i3; i6 < length; i6++) {
                            c cVarL = dVarB.l(viewArr[i6].getId());
                            if (cVar != null) {
                                a31 a31Var = cVar.h;
                                if (a31Var != null) {
                                    a31Var.e(cVarL);
                                }
                                cVarL.g.putAll(cVar.g);
                            }
                        }
                    }
                    i4++;
                    i3 = 0;
                }
            }
            d dVar2 = new d();
            HashMap map = dVar2.g;
            map.clear();
            for (Integer num : dVar.g.keySet()) {
                c cVar2 = (c) dVar.g.get(num);
                if (cVar2 != null) {
                    map.put(num, cVar2.clone());
                }
            }
            for (View view : viewArr) {
                c cVarL2 = dVar2.l(view.getId());
                if (cVar != null) {
                    a31 a31Var2 = cVar.h;
                    if (a31Var2 != null) {
                        a31Var2.e(cVarL2);
                    }
                    cVarL2.g.putAll(cVar.g);
                }
            }
            motionLayout.H(i, dVar2);
            motionLayout.H(wr6.view_transition, dVar);
            motionLayout.setState(wr6.view_transition, -1, -1);
            bz4 bz4Var = new bz4(motionLayout.q, wr6.view_transition, i);
            for (View view2 : viewArr) {
                int i7 = this.h;
                if (i7 != -1) {
                    bz4Var.h = Math.max(i7, 8);
                }
                bz4Var.p = this.d;
                int i8 = this.l;
                String str = this.m;
                int i9 = this.n;
                bz4Var.e = i8;
                bz4Var.f = str;
                bz4Var.g = i9;
                int id = view2.getId();
                if (ey3Var != null) {
                    ArrayList arrayList = (ArrayList) ey3Var.a.get(-1);
                    ey3 ey3Var2 = new ey3();
                    ey3Var2.a = new HashMap();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        rx3 rx3VarClone = ((rx3) it.next()).clone();
                        rx3VarClone.b = id;
                        ey3Var2.b(rx3VarClone);
                    }
                    bz4Var.k.add(ey3Var2);
                }
            }
            motionLayout.setTransition(bz4Var);
            r59 r59Var = new r59(this, viewArr, 2);
            motionLayout.u(1.0f);
            motionLayout.S0 = r59Var;
            return;
        }
        View view3 = viewArr[0];
        ly4 ly4Var = new ly4(view3);
        wy4 wy4Var = ly4Var.f;
        wy4Var.c = 0.0f;
        wy4Var.d = 0.0f;
        ly4Var.H = true;
        wy4Var.d(view3.getX(), view3.getY(), view3.getWidth(), view3.getHeight());
        ly4Var.g.d(view3.getX(), view3.getY(), view3.getWidth(), view3.getHeight());
        jy4 jy4Var = ly4Var.h;
        jy4Var.getClass();
        view3.getX();
        view3.getY();
        view3.getWidth();
        view3.getHeight();
        jy4Var.c = view3.getVisibility();
        jy4Var.e = view3.getVisibility() != 0 ? 0.0f : view3.getAlpha();
        jy4Var.f = view3.getElevation();
        jy4Var.g = view3.getRotation();
        jy4Var.h = view3.getRotationX();
        jy4Var.a = view3.getRotationY();
        jy4Var.i = view3.getScaleX();
        jy4Var.j = view3.getScaleY();
        jy4Var.k = view3.getPivotX();
        jy4Var.l = view3.getPivotY();
        jy4Var.m = view3.getTranslationX();
        jy4Var.n = view3.getTranslationY();
        jy4Var.o = view3.getTranslationZ();
        jy4 jy4Var2 = ly4Var.i;
        jy4Var2.getClass();
        view3.getX();
        view3.getY();
        view3.getWidth();
        view3.getHeight();
        jy4Var2.c = view3.getVisibility();
        jy4Var2.e = view3.getVisibility() == 0 ? view3.getAlpha() : 0.0f;
        jy4Var2.f = view3.getElevation();
        jy4Var2.g = view3.getRotation();
        jy4Var2.h = view3.getRotationX();
        jy4Var2.a = view3.getRotationY();
        jy4Var2.i = view3.getScaleX();
        jy4Var2.j = view3.getScaleY();
        jy4Var2.k = view3.getPivotX();
        jy4Var2.l = view3.getPivotY();
        jy4Var2.m = view3.getTranslationX();
        jy4Var2.n = view3.getTranslationY();
        jy4Var2.o = view3.getTranslationZ();
        ArrayList arrayList2 = (ArrayList) ey3Var.a.get(-1);
        if (arrayList2 != null) {
            ly4Var.w.addAll(arrayList2);
        }
        ly4Var.i(motionLayout.getWidth(), motionLayout.getHeight(), System.nanoTime());
        int i10 = this.h;
        int i11 = this.i;
        int i12 = this.b;
        Context context = motionLayout.getContext();
        int i13 = this.l;
        if (i13 == -2) {
            interpolatorLoadInterpolator = AnimationUtils.loadInterpolator(context, this.n);
        } else if (i13 == -1) {
            interpolatorLoadInterpolator = new ky4(yy1.c(this.m), 2);
        } else if (i13 == 0) {
            interpolatorLoadInterpolator = new AccelerateDecelerateInterpolator();
        } else if (i13 == 1) {
            interpolatorLoadInterpolator = new AccelerateInterpolator();
        } else if (i13 == 2) {
            interpolatorLoadInterpolator = new DecelerateInterpolator();
        } else if (i13 == 4) {
            interpolatorLoadInterpolator = new BounceInterpolator();
        } else if (i13 == 5) {
            interpolatorLoadInterpolator = new OvershootInterpolator();
        } else {
            if (i13 != 6) {
                interpolator = null;
                new v99(onVar, ly4Var, i10, i11, i12, interpolator, this.p, this.q);
            }
            interpolatorLoadInterpolator = new AnticipateInterpolator();
        }
        interpolator = interpolatorLoadInterpolator;
        new v99(onVar, ly4Var, i10, i11, i12, interpolator, this.p, this.q);
    }

    public final boolean b(View view) {
        int i = this.r;
        boolean z = i == -1 || view.getTag(i) != null;
        int i2 = this.s;
        return z && (i2 == -1 || view.getTag(i2) == null);
    }

    public final boolean c(View view) {
        String str;
        if (view == null) {
            return false;
        }
        if ((this.j == -1 && this.k == null) || !b(view)) {
            return false;
        }
        if (view.getId() == this.j) {
            return true;
        }
        return this.k != null && (view.getLayoutParams() instanceof ConstraintLayout.LayoutParams) && (str = ((ConstraintLayout.LayoutParams) view.getLayoutParams()).Y) != null && str.matches(this.k);
    }

    public final void d(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), eu6.ViewTransition);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == eu6.ViewTransition_android_id) {
                this.a = typedArrayObtainStyledAttributes.getResourceId(index, this.a);
            } else if (index == eu6.ViewTransition_motionTarget) {
                if (MotionLayout.c1) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.j);
                    this.j = resourceId;
                    if (resourceId == -1) {
                        this.k = typedArrayObtainStyledAttributes.getString(index);
                    }
                } else if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                    this.k = typedArrayObtainStyledAttributes.getString(index);
                } else {
                    this.j = typedArrayObtainStyledAttributes.getResourceId(index, this.j);
                }
            } else if (index == eu6.ViewTransition_onStateTransition) {
                this.b = typedArrayObtainStyledAttributes.getInt(index, this.b);
            } else if (index == eu6.ViewTransition_transitionDisable) {
                this.c = typedArrayObtainStyledAttributes.getBoolean(index, this.c);
            } else if (index == eu6.ViewTransition_pathMotionArc) {
                this.d = typedArrayObtainStyledAttributes.getInt(index, this.d);
            } else if (index == eu6.ViewTransition_duration) {
                this.h = typedArrayObtainStyledAttributes.getInt(index, this.h);
            } else if (index == eu6.ViewTransition_upDuration) {
                this.i = typedArrayObtainStyledAttributes.getInt(index, this.i);
            } else if (index == eu6.ViewTransition_viewTransitionMode) {
                this.e = typedArrayObtainStyledAttributes.getInt(index, this.e);
            } else if (index == eu6.ViewTransition_motionInterpolator) {
                int i2 = typedArrayObtainStyledAttributes.peekValue(index).type;
                if (i2 == 1) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    this.n = resourceId2;
                    if (resourceId2 != -1) {
                        this.l = -2;
                    }
                } else if (i2 == 3) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.m = string;
                    if (string == null || string.indexOf("/") <= 0) {
                        this.l = -1;
                    } else {
                        this.n = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        this.l = -2;
                    }
                } else {
                    this.l = typedArrayObtainStyledAttributes.getInteger(index, this.l);
                }
            } else if (index == eu6.ViewTransition_setsTag) {
                this.p = typedArrayObtainStyledAttributes.getResourceId(index, this.p);
            } else if (index == eu6.ViewTransition_clearsTag) {
                this.q = typedArrayObtainStyledAttributes.getResourceId(index, this.q);
            } else if (index == eu6.ViewTransition_ifTagSet) {
                this.r = typedArrayObtainStyledAttributes.getResourceId(index, this.r);
            } else if (index == eu6.ViewTransition_ifTagNotSet) {
                this.s = typedArrayObtainStyledAttributes.getResourceId(index, this.s);
            } else if (index == eu6.ViewTransition_SharedValueId) {
                this.u = typedArrayObtainStyledAttributes.getResourceId(index, this.u);
            } else if (index == eu6.ViewTransition_SharedValue) {
                this.t = typedArrayObtainStyledAttributes.getInteger(index, this.t);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final String toString() {
        return "ViewTransition(" + vy2.E(this.o, this.a) + ")";
    }
}
