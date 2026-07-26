package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.constraintlayout.helper.widget.MotionEffect;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.core.widget.NestedScrollView;
import defpackage.az4;
import defpackage.bl4;
import defpackage.bz4;
import defpackage.c68;
import defpackage.dw1;
import defpackage.e89;
import defpackage.ek1;
import defpackage.eu6;
import defpackage.f31;
import defpackage.f99;
import defpackage.g31;
import defpackage.ly4;
import defpackage.mm5;
import defpackage.o40;
import defpackage.on;
import defpackage.q6;
import defpackage.q90;
import defpackage.qy4;
import defpackage.r59;
import defpackage.rl3;
import defpackage.rm7;
import defpackage.ry3;
import defpackage.sy4;
import defpackage.t61;
import defpackage.ty4;
import defpackage.uy4;
import defpackage.v99;
import defpackage.vy2;
import defpackage.vy4;
import defpackage.w99;
import defpackage.wu;
import defpackage.wx3;
import defpackage.wy4;
import defpackage.yy1;
import defpackage.z21;
import io.sentry.android.core.t0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class MotionLayout extends ConstraintLayout implements mm5 {
    public static boolean c1;
    public final HashMap A;
    public ArrayList A0;
    public long B;
    public CopyOnWriteArrayList B0;
    public float C;
    public int C0;
    public float D;
    public long D0;
    public float E;
    public float E0;
    public long F;
    public int F0;
    public float G;
    public float G0;
    public boolean H;
    public boolean H0;
    public boolean I;
    public int I0;
    public vy4 J;
    public int J0;
    public int K;
    public int K0;
    public ty4 L;
    public int L0;
    public boolean M;
    public int M0;
    public final c68 N;
    public int N0;
    public final sy4 O;
    public float O0;
    public ek1 P;
    public final wx3 P0;
    public int Q;
    public boolean Q0;
    public int R;
    public a R0;
    public boolean S;
    public r59 S0;
    public float T;
    public final Rect T0;
    public float U;
    public boolean U0;
    public long V;
    public TransitionState V0;
    public float W;
    public final uy4 W0;
    public boolean X0;
    public final RectF Y0;
    public View Z0;
    public Matrix a1;
    public final ArrayList b1;
    public b q;
    public qy4 r;
    public Interpolator s;
    public float t;
    public int u;
    public int v;
    public int w;
    public int x;
    public boolean x0;
    public int y;
    public ArrayList y0;
    public boolean z;
    public ArrayList z0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class TransitionState {
        public static final TransitionState a;
        public static final TransitionState b;
        public static final TransitionState c;
        public static final TransitionState d;
        public static final /* synthetic */ TransitionState[] e;

        static {
            TransitionState transitionState = new TransitionState("UNDEFINED", 0);
            a = transitionState;
            TransitionState transitionState2 = new TransitionState("SETUP", 1);
            b = transitionState2;
            TransitionState transitionState3 = new TransitionState("MOVING", 2);
            c = transitionState3;
            TransitionState transitionState4 = new TransitionState("FINISHED", 3);
            d = transitionState4;
            e = new TransitionState[]{transitionState, transitionState2, transitionState3, transitionState4};
        }

        public static TransitionState valueOf(String str) {
            return (TransitionState) Enum.valueOf(TransitionState.class, str);
        }

        public static TransitionState[] values() {
            return (TransitionState[]) e.clone();
        }
    }

    public MotionLayout(Context context) {
        super(context);
        this.s = null;
        this.t = 0.0f;
        this.u = -1;
        this.v = -1;
        this.w = -1;
        this.x = 0;
        this.y = 0;
        this.z = true;
        this.A = new HashMap();
        this.B = 0L;
        this.C = 1.0f;
        this.D = 0.0f;
        this.E = 0.0f;
        this.G = 0.0f;
        this.I = false;
        this.K = 0;
        this.M = false;
        this.N = new c68();
        this.O = new sy4(this);
        this.S = false;
        this.x0 = false;
        this.y0 = null;
        this.z0 = null;
        this.A0 = null;
        this.B0 = null;
        this.C0 = 0;
        this.D0 = -1L;
        this.E0 = 0.0f;
        this.F0 = 0;
        this.G0 = 0.0f;
        this.H0 = false;
        this.P0 = new wx3(0);
        this.Q0 = false;
        this.S0 = null;
        new HashMap();
        this.T0 = new Rect();
        this.U0 = false;
        this.V0 = TransitionState.a;
        this.W0 = new uy4(this);
        this.X0 = false;
        this.Y0 = new RectF();
        this.Z0 = null;
        this.a1 = null;
        this.b1 = new ArrayList();
        C(null);
    }

    public static Rect t(MotionLayout motionLayout, f31 f31Var) {
        Rect rect = motionLayout.T0;
        rect.top = f31Var.t();
        rect.left = f31Var.s();
        rect.right = f31Var.r() + rect.left;
        rect.bottom = f31Var.l() + rect.top;
        return rect;
    }

    public final bz4 A(int i) {
        for (bz4 bz4Var : this.q.d) {
            if (bz4Var.a == i) {
                return bz4Var;
            }
        }
        return null;
    }

    public final boolean B(float f, float f2, View view, MotionEvent motionEvent) {
        boolean z;
        boolean zOnTouchEvent;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                if (B((r3.getLeft() + f) - view.getScrollX(), (r3.getTop() + f2) - view.getScrollY(), viewGroup.getChildAt(childCount), motionEvent)) {
                    z = true;
                    break;
                }
            }
            z = false;
        } else {
            z = false;
        }
        if (!z) {
            RectF rectF = this.Y0;
            rectF.set(f, f2, (view.getRight() + f) - view.getLeft(), (view.getBottom() + f2) - view.getTop());
            if (motionEvent.getAction() != 0 || rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                float f3 = -f;
                float f4 = -f2;
                Matrix matrix = view.getMatrix();
                if (matrix.isIdentity()) {
                    motionEvent.offsetLocation(f3, f4);
                    zOnTouchEvent = view.onTouchEvent(motionEvent);
                    motionEvent.offsetLocation(-f3, -f4);
                } else {
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.offsetLocation(f3, f4);
                    if (this.a1 == null) {
                        this.a1 = new Matrix();
                    }
                    matrix.invert(this.a1);
                    motionEventObtain.transform(this.a1);
                    zOnTouchEvent = view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                if (zOnTouchEvent) {
                    return true;
                }
            }
        }
        return z;
    }

    public final void C(AttributeSet attributeSet) {
        b bVar;
        c1 = isInEditMode();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, eu6.MotionLayout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            boolean z = true;
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == eu6.MotionLayout_layoutDescription) {
                    this.q = new b(getContext(), this, typedArrayObtainStyledAttributes.getResourceId(index, -1));
                } else if (index == eu6.MotionLayout_currentState) {
                    this.v = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                } else if (index == eu6.MotionLayout_motionProgress) {
                    this.G = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                    this.I = true;
                } else if (index == eu6.MotionLayout_applyMotionScene) {
                    z = typedArrayObtainStyledAttributes.getBoolean(index, z);
                } else if (index == eu6.MotionLayout_showPaths) {
                    if (this.K == 0) {
                        this.K = typedArrayObtainStyledAttributes.getBoolean(index, false) ? 2 : 0;
                    }
                } else if (index == eu6.MotionLayout_motionDebug) {
                    this.K = typedArrayObtainStyledAttributes.getInt(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            if (this.q == null) {
                t0.d("MotionLayout", "WARNING NO app:layoutDescription tag");
            }
            if (!z) {
                this.q = null;
            }
        }
        if (this.K != 0) {
            b bVar2 = this.q;
            if (bVar2 == null) {
                t0.d("MotionLayout", "CHECK: motion scene not set! set \"app:layoutDescription=\"@xml/file\"");
            } else {
                int iH = bVar2.h();
                b bVar3 = this.q;
                d dVarB = bVar3.b(bVar3.h());
                String strE = vy2.E(getContext(), iH);
                int childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = getChildAt(i2);
                    int id = childAt.getId();
                    if (id == -1) {
                        StringBuilder sbN = t61.n("CHECK: ", strE, " ALL VIEWS SHOULD HAVE ID's ");
                        sbN.append(childAt.getClass().getName());
                        sbN.append(" does not!");
                        t0.m("MotionLayout", sbN.toString());
                    }
                    if (dVarB.l(id) == null) {
                        StringBuilder sbN2 = t61.n("CHECK: ", strE, " NO CONSTRAINTS for ");
                        sbN2.append(vy2.F(childAt));
                        t0.m("MotionLayout", sbN2.toString());
                    }
                }
                Integer[] numArr = (Integer[]) dVarB.g.keySet().toArray(new Integer[0]);
                int length = numArr.length;
                int[] iArr = new int[length];
                for (int i3 = 0; i3 < length; i3++) {
                    iArr[i3] = numArr[i3].intValue();
                }
                for (int i4 = 0; i4 < length; i4++) {
                    int i5 = iArr[i4];
                    String strE2 = vy2.E(getContext(), i5);
                    if (findViewById(iArr[i4]) == null) {
                        t0.m("MotionLayout", "CHECK: " + strE + " NO View matches id " + strE2);
                    }
                    if (dVarB.k(i5).e.d == -1) {
                        t0.m("MotionLayout", bl4.w("CHECK: ", strE, "(", strE2, ") no LAYOUT_HEIGHT"));
                    }
                    if (dVarB.k(i5).e.c == -1) {
                        t0.m("MotionLayout", bl4.w("CHECK: ", strE, "(", strE2, ") no LAYOUT_HEIGHT"));
                    }
                }
                SparseIntArray sparseIntArray = new SparseIntArray();
                SparseIntArray sparseIntArray2 = new SparseIntArray();
                for (bz4 bz4Var : this.q.d) {
                    bz4 bz4Var2 = this.q.c;
                    if (bz4Var.d == bz4Var.c) {
                        t0.d("MotionLayout", "CHECK: start and end constraint set should not be the same!");
                    }
                    int i6 = bz4Var.d;
                    int i7 = bz4Var.c;
                    String strE3 = vy2.E(getContext(), i6);
                    String strE4 = vy2.E(getContext(), i7);
                    if (sparseIntArray.get(i6) == i7) {
                        t0.d("MotionLayout", "CHECK: two transitions with the same start and end " + strE3 + "->" + strE4);
                    }
                    if (sparseIntArray2.get(i7) == i6) {
                        t0.d("MotionLayout", "CHECK: you can't have reverse transitions" + strE3 + "->" + strE4);
                    }
                    sparseIntArray.put(i6, i7);
                    sparseIntArray2.put(i7, i6);
                    if (this.q.b(i6) == null) {
                        t0.d("MotionLayout", " no such constraintSetStart " + strE3);
                    }
                    if (this.q.b(i7) == null) {
                        t0.d("MotionLayout", " no such constraintSetEnd " + strE3);
                    }
                }
            }
        }
        if (this.v != -1 || (bVar = this.q) == null) {
            return;
        }
        this.v = bVar.h();
        this.u = this.q.h();
        bz4 bz4Var3 = this.q.c;
        this.w = bz4Var3 != null ? bz4Var3.c : -1;
    }

    public final void D() {
        bz4 bz4Var;
        c cVar;
        View viewFindViewById;
        b bVar = this.q;
        if (bVar == null) {
            return;
        }
        if (bVar.a(this.v, this)) {
            requestLayout();
            return;
        }
        int i = this.v;
        if (i != -1) {
            b bVar2 = this.q;
            ArrayList<bz4> arrayList = bVar2.f;
            ArrayList<bz4> arrayList2 = bVar2.d;
            for (bz4 bz4Var2 : arrayList2) {
                if (bz4Var2.m.size() > 0) {
                    Iterator it = bz4Var2.m.iterator();
                    while (it.hasNext()) {
                        ((az4) it.next()).b(this);
                    }
                }
            }
            for (bz4 bz4Var3 : arrayList) {
                if (bz4Var3.m.size() > 0) {
                    Iterator it2 = bz4Var3.m.iterator();
                    while (it2.hasNext()) {
                        ((az4) it2.next()).b(this);
                    }
                }
            }
            for (bz4 bz4Var4 : arrayList2) {
                if (bz4Var4.m.size() > 0) {
                    Iterator it3 = bz4Var4.m.iterator();
                    while (it3.hasNext()) {
                        ((az4) it3.next()).a(this, i, bz4Var4);
                    }
                }
            }
            for (bz4 bz4Var5 : arrayList) {
                if (bz4Var5.m.size() > 0) {
                    Iterator it4 = bz4Var5.m.iterator();
                    while (it4.hasNext()) {
                        ((az4) it4.next()).a(this, i, bz4Var5);
                    }
                }
            }
        }
        if (!this.q.o() || (bz4Var = this.q.c) == null || (cVar = bz4Var.l) == null) {
            return;
        }
        MotionLayout motionLayout = cVar.r;
        int i2 = cVar.d;
        if (i2 != -1) {
            viewFindViewById = motionLayout.findViewById(i2);
            if (viewFindViewById == null) {
                t0.d("TouchResponse", "cannot find TouchAnchorId @id/" + vy2.E(motionLayout.getContext(), cVar.d));
            }
        } else {
            viewFindViewById = null;
        }
        if (viewFindViewById instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) viewFindViewById;
            nestedScrollView.setOnTouchListener(new q90(3));
            nestedScrollView.setOnScrollChangeListener(new rl3());
        }
    }

    public final void E() {
        CopyOnWriteArrayList copyOnWriteArrayList;
        if (this.J == null && ((copyOnWriteArrayList = this.B0) == null || copyOnWriteArrayList.isEmpty())) {
            return;
        }
        ArrayList<Integer> arrayList = this.b1;
        for (Integer num : arrayList) {
            vy4 vy4Var = this.J;
            if (vy4Var != null) {
                vy4Var.a(num.intValue());
            }
            CopyOnWriteArrayList copyOnWriteArrayList2 = this.B0;
            if (copyOnWriteArrayList2 != null) {
                Iterator it = copyOnWriteArrayList2.iterator();
                while (it.hasNext()) {
                    ((vy4) it.next()).a(num.intValue());
                }
            }
        }
        arrayList.clear();
    }

    public final void F() {
        this.W0.f();
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void G(float r14, float r15, int r16) {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.G(float, float, int):void");
    }

    public final void H(int i, d dVar) {
        b bVar = this.q;
        if (bVar != null) {
            bVar.g.put(i, dVar);
        }
        this.W0.e(this.q.b(this.u), this.q.b(this.w));
        F();
        if (this.v == i) {
            dVar.b(this);
        }
    }

    public final void I(int i, View... viewArr) {
        b bVar = this.q;
        if (bVar == null) {
            t0.d("MotionLayout", " no motionScene");
            return;
        }
        on onVar = bVar.q;
        String str = (String) onVar.d;
        ArrayList arrayList = new ArrayList();
        w99 w99Var = null;
        for (w99 w99Var2 : (ArrayList) onVar.b) {
            if (w99Var2.a == i) {
                for (View view : viewArr) {
                    if (w99Var2.b(view)) {
                        arrayList.add(view);
                    }
                }
                if (arrayList.isEmpty()) {
                    w99Var = w99Var2;
                } else {
                    View[] viewArr2 = (View[]) arrayList.toArray(new View[0]);
                    MotionLayout motionLayout = (MotionLayout) onVar.a;
                    int currentState = motionLayout.getCurrentState();
                    if (w99Var2.e != 2) {
                        if (currentState == -1) {
                            t0.m(str, "No support for ViewTransition within transition yet. Currently: " + motionLayout.toString());
                        } else {
                            b bVar2 = motionLayout.q;
                            d dVarB = bVar2 == null ? null : bVar2.b(currentState);
                            if (dVarB != null) {
                                w99Var = w99Var2;
                                w99Var.a(onVar, (MotionLayout) onVar.a, currentState, dVarB, viewArr2);
                            }
                        }
                        w99Var = w99Var2;
                    } else {
                        w99Var = w99Var2;
                        w99Var.a(onVar, (MotionLayout) onVar.a, currentState, null, viewArr2);
                    }
                    arrayList.clear();
                }
            }
        }
        if (w99Var == null) {
            t0.d(str, " Could not find ViewTransition");
        }
    }

    @Override // defpackage.lm5
    public final void c(int i, View view) {
        c cVar;
        int i2;
        b bVar = this.q;
        if (bVar != null) {
            float f = this.W;
            if (f == 0.0f) {
                return;
            }
            float f2 = this.T / f;
            float f3 = this.U / f;
            bz4 bz4Var = bVar.c;
            if (bz4Var == null || (cVar = bz4Var.l) == null) {
                return;
            }
            float[] fArr = cVar.n;
            cVar.m = false;
            MotionLayout motionLayout = cVar.r;
            float progress = motionLayout.getProgress();
            cVar.r.z(cVar.d, progress, cVar.h, cVar.g, fArr);
            float f4 = cVar.k;
            float f5 = f4 != 0.0f ? (f2 * f4) / fArr[0] : (f3 * cVar.l) / fArr[1];
            if (!Float.isNaN(f5)) {
                progress += f5 / 3.0f;
            }
            if (progress == 0.0f || progress == 1.0f || (i2 = cVar.c) == 3) {
                return;
            }
            motionLayout.G(((double) progress) >= 0.5d ? 1.0f : 0.0f, f5, i2);
        }
    }

    @Override // defpackage.mm5
    public final void d(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (this.S || i != 0 || i2 != 0) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
        }
        this.S = false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList;
        int i;
        int i2;
        ty4 ty4Var;
        int i3;
        Paint paint;
        Paint paint2;
        int i4;
        int i5;
        ly4 ly4Var;
        ty4 ty4Var2;
        int i6;
        Paint paint3;
        double dA;
        Paint paint4;
        String resourceEntryName;
        on onVar;
        ArrayList arrayList2 = this.A0;
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((MotionHelper) it.next()).getClass();
            }
        }
        w(false);
        b bVar = this.q;
        if (bVar != null && (onVar = bVar.q) != null) {
            ArrayList arrayList3 = (ArrayList) onVar.f;
            ArrayList arrayList4 = (ArrayList) onVar.e;
            if (arrayList4 != null) {
                Iterator it2 = arrayList4.iterator();
                while (it2.hasNext()) {
                    ((v99) it2.next()).a();
                }
                ((ArrayList) onVar.e).removeAll(arrayList3);
                arrayList3.clear();
                if (((ArrayList) onVar.e).isEmpty()) {
                    onVar.e = null;
                }
            }
        }
        super.dispatchDraw(canvas);
        if (this.q == null) {
            return;
        }
        if ((this.K & 1) == 1 && !isInEditMode()) {
            this.C0++;
            long nanoTime = getNanoTime();
            long j = this.D0;
            if (j != -1) {
                if (nanoTime - j > 200000000) {
                    this.E0 = ((int) ((this.C0 / (r10 * 1.0E-9f)) * 100.0f)) / 100.0f;
                    this.C0 = 0;
                    this.D0 = nanoTime;
                }
            } else {
                this.D0 = nanoTime;
            }
            Paint paint5 = new Paint();
            paint5.setTextSize(42.0f);
            float progress = ((int) (getProgress() * 1000.0f)) / 10.0f;
            StringBuilder sb = new StringBuilder();
            sb.append(this.E0);
            sb.append(" fps ");
            int i7 = this.u;
            StringBuilder sbC = bl4.C(dw1.s(sb, i7 == -1 ? "UNDEFINED" : getContext().getResources().getResourceEntryName(i7), " -> "));
            int i8 = this.w;
            sbC.append(i8 == -1 ? "UNDEFINED" : getContext().getResources().getResourceEntryName(i8));
            sbC.append(" (progress: ");
            sbC.append(progress);
            sbC.append(" ) state=");
            int i9 = this.v;
            if (i9 == -1) {
                resourceEntryName = "undefined";
            } else {
                resourceEntryName = i9 != -1 ? getContext().getResources().getResourceEntryName(i9) : "UNDEFINED";
            }
            sbC.append(resourceEntryName);
            String string = sbC.toString();
            paint5.setColor(-16777216);
            canvas.drawText(string, 11.0f, getHeight() - 29, paint5);
            paint5.setColor(-7864184);
            canvas.drawText(string, 10.0f, getHeight() - 30, paint5);
        }
        if (this.K > 1) {
            if (this.L == null) {
                this.L = new ty4(this);
            }
            ty4 ty4Var3 = this.L;
            int iC = this.q.c();
            int i10 = this.K;
            Paint paint6 = ty4Var3.g;
            Paint paint7 = ty4Var3.f;
            Paint paint8 = ty4Var3.i;
            int i11 = ty4Var3.m;
            Paint paint9 = ty4Var3.e;
            MotionLayout motionLayout = ty4Var3.n;
            HashMap map = this.A;
            if (map != null && map.size() != 0) {
                canvas.save();
                if (!motionLayout.isInEditMode() && (i10 & 1) == 2) {
                    String str = motionLayout.getContext().getResources().getResourceName(motionLayout.w) + ":" + motionLayout.getProgress();
                    canvas.drawText(str, 10.0f, motionLayout.getHeight() - 30, ty4Var3.h);
                    canvas.drawText(str, 11.0f, motionLayout.getHeight() - 29, paint9);
                }
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    ly4 ly4Var2 = (ly4) it3.next();
                    wy4 wy4Var = ly4Var2.f;
                    ArrayList arrayList5 = ly4Var2.u;
                    int iMax = wy4Var.b;
                    Iterator it4 = arrayList5.iterator();
                    while (it4.hasNext()) {
                        iMax = Math.max(iMax, ((wy4) it4.next()).b);
                        it3 = it3;
                    }
                    Iterator it5 = it3;
                    int iMax2 = Math.max(iMax, ly4Var2.g.b);
                    if (i10 > 0 && iMax2 == 0) {
                        iMax2 = 1;
                    }
                    if (iMax2 == 0) {
                        it3 = it5;
                    } else {
                        float[] fArr = ty4Var3.c;
                        int[] iArr = ty4Var3.b;
                        if (fArr != null) {
                            arrayList = arrayList5;
                            double[] dArrD = ly4Var2.j[0].D();
                            if (iArr != null) {
                                Iterator it6 = arrayList.iterator();
                                int i12 = 0;
                                while (it6.hasNext()) {
                                    iArr[i12] = ((wy4) it6.next()).o;
                                    i12++;
                                    fArr = fArr;
                                }
                            }
                            float[] fArr2 = fArr;
                            int i13 = 0;
                            int i14 = 0;
                            while (i13 < dArrD.length) {
                                int i15 = i13;
                                double[] dArr = dArrD;
                                ly4Var2.j[0].x(dArrD[i15], ly4Var2.p);
                                ly4Var2.f.c(dArr[i15], ly4Var2.o, ly4Var2.p, fArr2, i14);
                                i14 += 2;
                                i13 = i15 + 1;
                                iC = iC;
                                dArrD = dArr;
                            }
                            i = iC;
                            i2 = i14 / 2;
                        } else {
                            arrayList = arrayList5;
                            i = iC;
                            i2 = 0;
                        }
                        ty4Var3.k = i2;
                        if (iMax2 >= 1) {
                            int i16 = i / 16;
                            float[] fArr3 = ty4Var3.a;
                            if (fArr3 == null || fArr3.length != i16 * 2) {
                                ty4Var3.a = new float[i16 * 2];
                                ty4Var3.d = new Path();
                            }
                            float f = i11;
                            canvas.translate(f, f);
                            paint9.setColor(1996488704);
                            paint8.setColor(1996488704);
                            paint7.setColor(1996488704);
                            paint6.setColor(1996488704);
                            float[] fArr4 = ty4Var3.a;
                            float f2 = 1.0f / (i16 - 1);
                            float f3 = 1.0f;
                            HashMap map2 = ly4Var2.y;
                            f99 f99Var = map2 == null ? null : (f99) map2.get("translationX");
                            HashMap map3 = ly4Var2.y;
                            i3 = i10;
                            f99 f99Var2 = map3 == null ? null : (f99) map3.get("translationY");
                            HashMap map4 = ly4Var2.z;
                            e89 e89Var = map4 == null ? null : (e89) map4.get("translationX");
                            HashMap map5 = ly4Var2.z;
                            e89 e89Var2 = map5 == null ? null : (e89) map5.get("translationY");
                            int i17 = 0;
                            while (true) {
                                float f4 = Float.NaN;
                                i5 = i11;
                                if (i17 >= i16) {
                                    break;
                                }
                                float fMin = i17 * f2;
                                int i18 = i16;
                                float f5 = ly4Var2.n;
                                if (f5 != f3) {
                                    float f6 = ly4Var2.m;
                                    if (fMin < f6) {
                                        fMin = 0.0f;
                                    }
                                    if (fMin > f6) {
                                        i6 = i17;
                                        if (fMin < 1.0d) {
                                            fMin = Math.min((fMin - f6) * f5, f3);
                                        }
                                    } else {
                                        i6 = i17;
                                    }
                                } else {
                                    i6 = i17;
                                }
                                double d = fMin;
                                yy1 yy1Var = wy4Var.a;
                                Iterator it7 = arrayList.iterator();
                                float f7 = 0.0f;
                                while (it7.hasNext()) {
                                    Iterator it8 = it7;
                                    wy4 wy4Var2 = (wy4) it7.next();
                                    wy4 wy4Var3 = wy4Var;
                                    yy1 yy1Var2 = wy4Var2.a;
                                    if (yy1Var2 != null) {
                                        float f8 = wy4Var2.c;
                                        if (f8 < fMin) {
                                            f7 = f8;
                                            yy1Var = yy1Var2;
                                        } else if (Float.isNaN(f4)) {
                                            f4 = wy4Var2.c;
                                        }
                                    }
                                    it7 = it8;
                                    wy4Var = wy4Var3;
                                }
                                wy4 wy4Var4 = wy4Var;
                                if (yy1Var != null) {
                                    if (Float.isNaN(f4)) {
                                        f4 = 1.0f;
                                    }
                                    paint3 = paint6;
                                    dA = (((float) yy1Var.a((fMin - f7) / r22)) * (f4 - f7)) + f7;
                                } else {
                                    paint3 = paint6;
                                    dA = d;
                                }
                                ly4Var2.j[0].x(dA, ly4Var2.p);
                                wu wuVar = ly4Var2.k;
                                if (wuVar != null) {
                                    double[] dArr2 = ly4Var2.p;
                                    paint4 = paint8;
                                    if (dArr2.length > 0) {
                                        wuVar.x(dA, dArr2);
                                    }
                                } else {
                                    paint4 = paint8;
                                }
                                int i19 = i6 * 2;
                                ly4Var2.f.c(dA, ly4Var2.o, ly4Var2.p, fArr4, i19);
                                if (e89Var != null) {
                                    fArr4[i19] = e89Var.a(fMin) + fArr4[i19];
                                } else if (f99Var != null) {
                                    fArr4[i19] = f99Var.a(fMin) + fArr4[i19];
                                }
                                if (e89Var2 != null) {
                                    int i20 = i19 + 1;
                                    fArr4[i20] = e89Var2.a(fMin) + fArr4[i20];
                                } else if (f99Var2 != null) {
                                    int i21 = i19 + 1;
                                    fArr4[i21] = f99Var2.a(fMin) + fArr4[i21];
                                }
                                i17 = i6 + 1;
                                i11 = i5;
                                i16 = i18;
                                wy4Var = wy4Var4;
                                paint6 = paint3;
                                paint8 = paint4;
                                f3 = 1.0f;
                            }
                            wy4 wy4Var5 = wy4Var;
                            ty4Var3.a(canvas, iMax2, ty4Var3.k, ly4Var2);
                            paint9.setColor(-21965);
                            paint7.setColor(-2067046);
                            Paint paint10 = paint8;
                            paint10.setColor(-2067046);
                            paint = paint6;
                            paint.setColor(-13391360);
                            int i22 = i5;
                            float f9 = -i22;
                            canvas.translate(f9, f9);
                            ty4Var3.a(canvas, iMax2, ty4Var3.k, ly4Var2);
                            char c = 5;
                            if (iMax2 == 5) {
                                float[] fArr5 = ty4Var3.j;
                                ty4Var3.d.reset();
                                int i23 = 0;
                                while (i23 <= 50) {
                                    char c2 = c;
                                    int i24 = i23;
                                    ly4Var2.j[0].x(ly4Var2.b(i23 / 50, null), ly4Var2.p);
                                    int[] iArr2 = ly4Var2.o;
                                    double[] dArr3 = ly4Var2.p;
                                    wy4 wy4Var6 = wy4Var5;
                                    float fSin = wy4Var6.e;
                                    float fCos = wy4Var6.f;
                                    float f10 = wy4Var6.g;
                                    float f11 = wy4Var6.h;
                                    int i25 = i22;
                                    float[] fArr6 = fArr5;
                                    int i26 = 0;
                                    while (true) {
                                        ly4Var = ly4Var2;
                                        if (i26 >= iArr2.length) {
                                            break;
                                        }
                                        Paint paint11 = paint10;
                                        float f12 = (float) dArr3[i26];
                                        int i27 = iArr2[i26];
                                        if (i27 == 1) {
                                            fSin = f12;
                                        } else if (i27 == 2) {
                                            fCos = f12;
                                        } else if (i27 == 3) {
                                            f10 = f12;
                                        } else if (i27 == 4) {
                                            f11 = f12;
                                        }
                                        i26++;
                                        ly4Var2 = ly4Var;
                                        paint10 = paint11;
                                    }
                                    Paint paint12 = paint10;
                                    if (wy4Var6.m != null) {
                                        double d2 = 0.0f;
                                        double d3 = fSin;
                                        ty4Var2 = ty4Var3;
                                        double d4 = fCos;
                                        fSin = (float) (((Math.sin(d4) * d3) + d2) - ((double) (f10 / 2.0f)));
                                        fCos = (float) ((d2 - (Math.cos(d4) * d3)) - ((double) (f11 / 2.0f)));
                                    } else {
                                        ty4Var2 = ty4Var3;
                                    }
                                    float f13 = f10 + fSin;
                                    float f14 = f11 + fCos;
                                    Float.isNaN(Float.NaN);
                                    Float.isNaN(Float.NaN);
                                    float f15 = fSin + 0.0f;
                                    float f16 = fCos + 0.0f;
                                    float f17 = f13 + 0.0f;
                                    float f18 = f14 + 0.0f;
                                    fArr6[0] = f15;
                                    fArr6[1] = f16;
                                    fArr6[2] = f17;
                                    fArr6[3] = f16;
                                    fArr6[4] = f17;
                                    fArr6[c2] = f18;
                                    fArr6[6] = f15;
                                    fArr6[7] = f18;
                                    ty4Var2.d.moveTo(f15, f16);
                                    ty4Var2.d.lineTo(fArr6[2], fArr6[3]);
                                    ty4Var2.d.lineTo(fArr6[4], fArr6[c2]);
                                    ty4Var2.d.lineTo(fArr6[6], fArr6[7]);
                                    ty4Var2.d.close();
                                    i23 = i24 + 1;
                                    ty4Var3 = ty4Var2;
                                    wy4Var5 = wy4Var6;
                                    c = c2;
                                    fArr5 = fArr6;
                                    ly4Var2 = ly4Var;
                                    i22 = i25;
                                    paint10 = paint12;
                                }
                                i4 = i22;
                                ty4Var = ty4Var3;
                                paint2 = paint10;
                                paint9.setColor(1140850688);
                                canvas.translate(2.0f, 2.0f);
                                canvas.drawPath(ty4Var.d, paint9);
                                canvas.translate(-2.0f, -2.0f);
                                paint9.setColor(-65536);
                                canvas.drawPath(ty4Var.d, paint9);
                                ty4Var3 = ty4Var;
                                paint6 = paint;
                                it3 = it5;
                                iC = i;
                                i10 = i3;
                                i11 = i4;
                                paint8 = paint2;
                            } else {
                                i4 = i22;
                                ty4Var = ty4Var3;
                                paint2 = paint10;
                            }
                        } else {
                            ty4Var = ty4Var3;
                            i3 = i10;
                            paint = paint6;
                            paint2 = paint8;
                            i4 = i11;
                        }
                        ty4Var3 = ty4Var;
                        paint6 = paint;
                        it3 = it5;
                        iC = i;
                        i10 = i3;
                        i11 = i4;
                        paint8 = paint2;
                    }
                }
                canvas.restore();
            }
        }
        ArrayList arrayList6 = this.A0;
        if (arrayList6 != null) {
            Iterator it9 = arrayList6.iterator();
            while (it9.hasNext()) {
                ((MotionHelper) it9.next()).getClass();
            }
        }
    }

    @Override // defpackage.lm5
    public final void f(View view, int i, int i2, int i3, int i4, int i5) {
    }

    @Override // defpackage.lm5
    public final boolean g(View view, View view2, int i, int i2) {
        bz4 bz4Var;
        c cVar;
        b bVar = this.q;
        return (bVar == null || (bz4Var = bVar.c) == null || (cVar = bz4Var.l) == null || (cVar.w & 2) != 0) ? false : true;
    }

    public int[] getConstraintSetIds() {
        b bVar = this.q;
        if (bVar == null) {
            return null;
        }
        SparseArray sparseArray = bVar.g;
        int size = sparseArray.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = sparseArray.keyAt(i);
        }
        return iArr;
    }

    public int getCurrentState() {
        return this.v;
    }

    public ArrayList<bz4> getDefinedTransitions() {
        b bVar = this.q;
        if (bVar == null) {
            return null;
        }
        return bVar.d;
    }

    public ek1 getDesignTool() {
        if (this.P == null) {
            this.P = new ek1();
        }
        return this.P;
    }

    public int getEndState() {
        return this.w;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.E;
    }

    public b getScene() {
        return this.q;
    }

    public int getStartState() {
        return this.u;
    }

    public float getTargetPosition() {
        return this.G;
    }

    public Bundle getTransitionState() {
        if (this.R0 == null) {
            this.R0 = new a(this);
        }
        a aVar = this.R0;
        MotionLayout motionLayout = aVar.e;
        aVar.d = motionLayout.w;
        aVar.c = motionLayout.u;
        aVar.b = motionLayout.getVelocity();
        aVar.a = motionLayout.getProgress();
        a aVar2 = this.R0;
        aVar2.getClass();
        Bundle bundle = new Bundle();
        bundle.putFloat("motion.progress", aVar2.a);
        bundle.putFloat("motion.velocity", aVar2.b);
        bundle.putInt("motion.StartState", aVar2.c);
        bundle.putInt("motion.EndState", aVar2.d);
        return bundle;
    }

    public long getTransitionTimeMs() {
        if (this.q != null) {
            this.C = r0.c() / 1000.0f;
        }
        return (long) (this.C * 1000.0f);
    }

    public float getVelocity() {
        return this.t;
    }

    @Override // defpackage.lm5
    public final void h(View view, View view2, int i, int i2) {
        this.V = getNanoTime();
        this.W = 0.0f;
        this.T = 0.0f;
        this.U = 0.0f;
    }

    @Override // defpackage.lm5
    public final void i(View view, int i, int i2, int[] iArr, int i3) {
        bz4 bz4Var;
        boolean z;
        float f;
        c cVar;
        float f2;
        c cVar2;
        c cVar3;
        c cVar4;
        int i4;
        b bVar = this.q;
        if (bVar == null || (bz4Var = bVar.c) == null || (z = bz4Var.o)) {
            return;
        }
        int i5 = -1;
        if (z || (cVar4 = bz4Var.l) == null || (i4 = cVar4.e) == -1 || view.getId() == i4) {
            bz4 bz4Var2 = bVar.c;
            if ((bz4Var2 == null || (cVar3 = bz4Var2.l) == null) ? false : cVar3.u) {
                c cVar5 = bz4Var.l;
                if (cVar5 != null && (cVar5.w & 4) != 0) {
                    i5 = i2;
                }
                float f3 = this.D;
                if ((f3 == 1.0f || f3 == 0.0f) && view.canScrollVertically(i5)) {
                    return;
                }
            }
            c cVar6 = bz4Var.l;
            if (cVar6 == null || (cVar6.w & 1) == 0) {
                f = 0.0f;
            } else {
                float f4 = i;
                float f5 = i2;
                bz4 bz4Var3 = bVar.c;
                if (bz4Var3 == null || (cVar2 = bz4Var3.l) == null) {
                    f = 0.0f;
                    f2 = 0.0f;
                } else {
                    float[] fArr = cVar2.n;
                    f = 0.0f;
                    cVar2.r.z(cVar2.d, cVar2.r.getProgress(), cVar2.h, cVar2.g, fArr);
                    float f6 = cVar2.k;
                    if (f6 != 0.0f) {
                        if (fArr[0] == 0.0f) {
                            fArr[0] = 1.0E-7f;
                        }
                        f2 = (f4 * f6) / fArr[0];
                    } else {
                        if (fArr[1] == 0.0f) {
                            fArr[1] = 1.0E-7f;
                        }
                        f2 = (f5 * cVar2.l) / fArr[1];
                    }
                }
                float f7 = this.E;
                if ((f7 <= f && f2 < f) || (f7 >= 1.0f && f2 > f)) {
                    view.setNestedScrollingEnabled(false);
                    view.post(new q6(26, (ViewGroup) view));
                    return;
                }
            }
            float f8 = this.D;
            long nanoTime = getNanoTime();
            float f9 = i;
            this.T = f9;
            float f10 = i2;
            this.U = f10;
            this.W = (float) ((nanoTime - this.V) * 1.0E-9d);
            this.V = nanoTime;
            bz4 bz4Var4 = bVar.c;
            if (bz4Var4 != null && (cVar = bz4Var4.l) != null) {
                float[] fArr2 = cVar.n;
                MotionLayout motionLayout = cVar.r;
                float progress = motionLayout.getProgress();
                if (!cVar.m) {
                    cVar.m = true;
                    motionLayout.setProgress(progress);
                }
                cVar.r.z(cVar.d, progress, cVar.h, cVar.g, fArr2);
                if (Math.abs((cVar.l * fArr2[1]) + (cVar.k * fArr2[0])) < 0.01d) {
                    fArr2[0] = 0.01f;
                    fArr2[1] = 0.01f;
                }
                float f11 = cVar.k;
                float fMax = Math.max(Math.min(progress + (f11 != f ? (f9 * f11) / fArr2[0] : (f10 * cVar.l) / fArr2[1]), 1.0f), f);
                if (fMax != motionLayout.getProgress()) {
                    motionLayout.setProgress(fMax);
                }
            }
            if (f8 != this.D) {
                iArr[0] = i;
                iArr[1] = i2;
            }
            w(false);
            if (iArr[0] == 0 && iArr[1] == 0) {
                return;
            }
            this.S = true;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        bz4 bz4Var;
        int i;
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            display.getRotation();
        }
        b bVar = this.q;
        if (bVar != null && (i = this.v) != -1) {
            d dVarB = bVar.b(i);
            b bVar2 = this.q;
            SparseArray sparseArray = bVar2.g;
            loop0: for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                int iKeyAt = sparseArray.keyAt(i2);
                SparseIntArray sparseIntArray = bVar2.i;
                int i3 = sparseIntArray.get(iKeyAt);
                int size = sparseIntArray.size();
                while (i3 > 0) {
                    if (i3 != iKeyAt) {
                        int i4 = size - 1;
                        if (size >= 0) {
                            i3 = sparseIntArray.get(i3);
                            size = i4;
                        }
                    }
                    t0.d("MotionScene", "Cannot be derived from yourself");
                    break loop0;
                }
                bVar2.m(iKeyAt, this);
            }
            ArrayList arrayList = this.A0;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((MotionHelper) it.next()).getClass();
                }
            }
            if (dVarB != null) {
                dVarB.b(this);
            }
            this.u = this.v;
        }
        D();
        a aVar = this.R0;
        if (aVar != null) {
            if (this.U0) {
                post(new q6(27, this));
                return;
            } else {
                aVar.a();
                return;
            }
        }
        b bVar3 = this.q;
        if (bVar3 == null || (bz4Var = bVar3.c) == null || bz4Var.n != 4) {
            return;
        }
        u(1.0f);
        this.S0 = null;
        setState(TransitionState.b);
        setState(TransitionState.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0125  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instruction units count: 441
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) throws Throwable {
        MotionLayout motionLayout;
        this.Q0 = true;
        try {
            if (this.q == null) {
                super.onLayout(z, i, i2, i3, i4);
                this.Q0 = false;
                return;
            }
            motionLayout = this;
            int i5 = i3 - i;
            int i6 = i4 - i2;
            try {
                if (motionLayout.Q != i5 || motionLayout.R != i6) {
                    F();
                    w(true);
                }
                motionLayout.Q = i5;
                motionLayout.R = i6;
                motionLayout.Q0 = false;
                return;
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
            motionLayout = this;
        }
        Throwable th3 = th;
        motionLayout.Q0 = false;
        throw th3;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        if (this.q == null) {
            super.onMeasure(i, i2);
            return;
        }
        boolean z2 = true;
        boolean z3 = (this.x == i && this.y == i2) ? false : true;
        if (this.X0) {
            this.X0 = false;
            D();
            E();
            z3 = true;
        }
        if (this.h) {
            z3 = true;
        }
        this.x = i;
        this.y = i2;
        int iH = this.q.h();
        bz4 bz4Var = this.q.c;
        int i3 = bz4Var == null ? -1 : bz4Var.c;
        uy4 uy4Var = this.W0;
        if ((!z3 && iH == uy4Var.e && i3 == uy4Var.f) || this.u == -1) {
            if (z3) {
                super.onMeasure(i, i2);
            }
            z = true;
        } else {
            super.onMeasure(i, i2);
            uy4Var.e(this.q.b(iH), this.q.b(i3));
            uy4Var.f();
            uy4Var.e = iH;
            uy4Var.f = i3;
            z = false;
        }
        if (this.H0 || z) {
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int paddingRight = getPaddingRight() + getPaddingLeft();
            g31 g31Var = this.c;
            int iR = g31Var.r() + paddingRight;
            int iL = g31Var.l() + paddingBottom;
            int i4 = this.M0;
            if (i4 == Integer.MIN_VALUE || i4 == 0) {
                iR = (int) ((this.O0 * (this.K0 - r2)) + this.I0);
                requestLayout();
            }
            int i5 = this.N0;
            if (i5 == Integer.MIN_VALUE || i5 == 0) {
                iL = (int) ((this.O0 * (this.L0 - r1)) + this.J0);
                requestLayout();
            }
            setMeasuredDimension(iR, iL);
        }
        float fSignum = Math.signum(this.G - this.E);
        long nanoTime = getNanoTime();
        qy4 qy4Var = this.r;
        float interpolation = this.E + (!(qy4Var instanceof c68) ? (((nanoTime - this.F) * fSignum) * 1.0E-9f) / this.C : 0.0f);
        if (this.H) {
            interpolation = this.G;
        }
        if ((fSignum <= 0.0f || interpolation < this.G) && (fSignum > 0.0f || interpolation > this.G)) {
            z2 = false;
        } else {
            interpolation = this.G;
        }
        if (qy4Var != null && !z2) {
            interpolation = this.M ? qy4Var.getInterpolation((nanoTime - this.B) * 1.0E-9f) : qy4Var.getInterpolation(interpolation);
        }
        if ((fSignum > 0.0f && interpolation >= this.G) || (fSignum <= 0.0f && interpolation <= this.G)) {
            interpolation = this.G;
        }
        this.O0 = interpolation;
        int childCount = getChildCount();
        long nanoTime2 = getNanoTime();
        Interpolator interpolator = this.s;
        if (interpolator != null) {
            interpolation = interpolator.getInterpolation(interpolation);
        }
        float f = interpolation;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            ly4 ly4Var = (ly4) this.A.get(childAt);
            if (ly4Var != null) {
                ly4Var.f(f, nanoTime2, this.P0, childAt);
            }
        }
        if (this.H0) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        c cVar;
        b bVar = this.q;
        if (bVar != null) {
            boolean zO = o();
            bVar.p = zO;
            bz4 bz4Var = bVar.c;
            if (bz4Var == null || (cVar = bz4Var.l) == null) {
                return;
            }
            cVar.c(zO);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x058c  */
    /* JADX WARN: Type inference failed for: r18v15 */
    /* JADX WARN: Type inference failed for: r18v24 */
    /* JADX WARN: Type inference failed for: r18v25 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r31) {
        /*
            Method dump skipped, instruction units count: 2047
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof MotionHelper) {
            MotionHelper motionHelper = (MotionHelper) view;
            if (this.B0 == null) {
                this.B0 = new CopyOnWriteArrayList();
            }
            this.B0.add(motionHelper);
            if (motionHelper.j) {
                if (this.y0 == null) {
                    this.y0 = new ArrayList();
                }
                this.y0.add(motionHelper);
            }
            if (motionHelper.k) {
                if (this.z0 == null) {
                    this.z0 = new ArrayList();
                }
                this.z0.add(motionHelper);
            }
            if (motionHelper instanceof MotionEffect) {
                if (this.A0 == null) {
                    this.A0 = new ArrayList();
                }
                this.A0.add(motionHelper);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList arrayList = this.y0;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList arrayList2 = this.z0;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public final void p(int i) {
        this.k = null;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        b bVar;
        bz4 bz4Var;
        if (!this.H0 && this.v == -1 && (bVar = this.q) != null && (bz4Var = bVar.c) != null) {
            int i = bz4Var.q;
            if (i == 0) {
                return;
            }
            if (i == 2) {
                int childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    ((ly4) this.A.get(getChildAt(i2))).d = true;
                }
                return;
            }
        }
        super.requestLayout();
    }

    public void setDebugMode(int i) {
        this.K = i;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z) {
        this.U0 = z;
    }

    public void setInteractionEnabled(boolean z) {
        this.z = z;
    }

    public void setInterpolatedProgress(float f) {
        if (this.q != null) {
            setState(TransitionState.c);
            Interpolator interpolatorE = this.q.e();
            if (interpolatorE != null) {
                setProgress(interpolatorE.getInterpolation(f));
                return;
            }
        }
        setProgress(f);
    }

    public void setOnHide(float f) {
        ArrayList arrayList = this.z0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((MotionHelper) this.z0.get(i)).setProgress(f);
            }
        }
    }

    public void setOnShow(float f) {
        ArrayList arrayList = this.y0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((MotionHelper) this.y0.get(i)).setProgress(f);
            }
        }
    }

    public void setProgress(float f, float f2) {
        if (!isAttachedToWindow()) {
            if (this.R0 == null) {
                this.R0 = new a(this);
            }
            a aVar = this.R0;
            aVar.a = f;
            aVar.b = f2;
            return;
        }
        setProgress(f);
        setState(TransitionState.c);
        this.t = f2;
        if (f2 != 0.0f) {
            u(f2 > 0.0f ? 1.0f : 0.0f);
        } else {
            if (f == 0.0f || f == 1.0f) {
                return;
            }
            u(f > 0.5f ? 1.0f : 0.0f);
        }
    }

    public void setScene(b bVar) {
        c cVar;
        this.q = bVar;
        boolean zO = o();
        bVar.p = zO;
        bz4 bz4Var = bVar.c;
        if (bz4Var != null && (cVar = bz4Var.l) != null) {
            cVar.c(zO);
        }
        F();
    }

    public void setStartState(int i) {
        if (isAttachedToWindow()) {
            this.v = i;
            return;
        }
        if (this.R0 == null) {
            this.R0 = new a(this);
        }
        a aVar = this.R0;
        aVar.c = i;
        aVar.d = i;
    }

    public void setState(TransitionState transitionState) {
        TransitionState transitionState2 = TransitionState.d;
        if (transitionState == transitionState2 && this.v == -1) {
            return;
        }
        TransitionState transitionState3 = this.V0;
        this.V0 = transitionState;
        TransitionState transitionState4 = TransitionState.c;
        if (transitionState3 == transitionState4 && transitionState == transitionState4) {
            x();
        }
        int iOrdinal = transitionState3.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2 && transitionState == transitionState2) {
                y();
                return;
            }
            return;
        }
        if (transitionState == transitionState4) {
            x();
        }
        if (transitionState == transitionState2) {
            y();
        }
    }

    public void setTransition(int i, int i2) {
        if (!isAttachedToWindow()) {
            if (this.R0 == null) {
                this.R0 = new a(this);
            }
            a aVar = this.R0;
            aVar.c = i;
            aVar.d = i2;
            return;
        }
        b bVar = this.q;
        if (bVar != null) {
            this.u = i;
            this.w = i2;
            bVar.n(i, i2);
            this.W0.e(this.q.b(i), this.q.b(i2));
            F();
            this.E = 0.0f;
            u(0.0f);
        }
    }

    public void setTransitionDuration(int i) {
        b bVar = this.q;
        if (bVar == null) {
            t0.d("MotionLayout", "MotionScene not defined");
            return;
        }
        bz4 bz4Var = bVar.c;
        if (bz4Var != null) {
            bz4Var.h = Math.max(i, 8);
        } else {
            bVar.j = i;
        }
    }

    public void setTransitionListener(vy4 vy4Var) {
        this.J = vy4Var;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.R0 == null) {
            this.R0 = new a(this);
        }
        a aVar = this.R0;
        aVar.getClass();
        aVar.a = bundle.getFloat("motion.progress");
        aVar.b = bundle.getFloat("motion.velocity");
        aVar.c = bundle.getInt("motion.StartState");
        aVar.d = bundle.getInt("motion.EndState");
        if (isAttachedToWindow()) {
            this.R0.a();
        }
    }

    @Override // android.view.View
    public final String toString() {
        Context context = getContext();
        return vy2.E(context, this.u) + "->" + vy2.E(context, this.w) + " (pos:" + this.E + " Dpos/Dt:" + this.t;
    }

    public final void u(float f) {
        if (this.q == null) {
            return;
        }
        float f2 = this.E;
        float f3 = this.D;
        if (f2 != f3 && this.H) {
            this.E = f3;
        }
        float f4 = this.E;
        if (f4 == f) {
            return;
        }
        this.M = false;
        this.G = f;
        this.C = r0.c() / 1000.0f;
        setProgress(this.G);
        this.r = null;
        this.s = this.q.e();
        this.H = false;
        this.B = getNanoTime();
        this.I = true;
        this.D = f4;
        this.E = f4;
        invalidate();
    }

    public final void v(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ly4 ly4Var = (ly4) this.A.get(getChildAt(i));
            if (ly4Var != null && "button".equals(vy2.F(ly4Var.b)) && ly4Var.A != null) {
                int i2 = 0;
                while (true) {
                    ry3[] ry3VarArr = ly4Var.A;
                    if (i2 < ry3VarArr.length) {
                        ry3VarArr[i2].h(ly4Var.b, z ? -100.0f : 100.0f);
                        i2++;
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e0 A[PHI: r3
      0x00e0: PHI (r3v13 float) = (r3v12 float), (r3v14 float), (r3v14 float) binds: [B:49:0x00ae, B:60:0x00d4, B:62:0x00d8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0169  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w(boolean r22) {
        /*
            Method dump skipped, instruction units count: 612
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.w(boolean):void");
    }

    public final void x() {
        CopyOnWriteArrayList copyOnWriteArrayList;
        CopyOnWriteArrayList copyOnWriteArrayList2;
        if ((this.J == null && ((copyOnWriteArrayList2 = this.B0) == null || copyOnWriteArrayList2.isEmpty())) || this.G0 == this.D) {
            return;
        }
        if (this.F0 != -1 && (copyOnWriteArrayList = this.B0) != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((vy4) it.next()).getClass();
            }
        }
        this.F0 = -1;
        this.G0 = this.D;
        CopyOnWriteArrayList copyOnWriteArrayList3 = this.B0;
        if (copyOnWriteArrayList3 != null) {
            Iterator it2 = copyOnWriteArrayList3.iterator();
            while (it2.hasNext()) {
                ((vy4) it2.next()).getClass();
            }
        }
    }

    public final void y() {
        CopyOnWriteArrayList copyOnWriteArrayList;
        if ((this.J != null || ((copyOnWriteArrayList = this.B0) != null && !copyOnWriteArrayList.isEmpty())) && this.F0 == -1) {
            this.F0 = this.v;
            ArrayList arrayList = this.b1;
            int iIntValue = !arrayList.isEmpty() ? ((Integer) o40.u(1, arrayList)).intValue() : -1;
            int i = this.v;
            if (iIntValue != i && i != -1) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        E();
        r59 r59Var = this.S0;
        if (r59Var != null) {
            r59Var.run();
            this.S0 = null;
        }
    }

    public final void z(int i, float f, float f2, float f3, float[] fArr) {
        View viewK = k(i);
        ly4 ly4Var = (ly4) this.A.get(viewK);
        if (ly4Var != null) {
            ly4Var.d(f, f2, f3, fArr);
            viewK.getY();
        } else {
            t0.m("MotionLayout", "WARNING could not find view id " + (viewK == null ? rm7.n(i, "") : viewK.getContext().getResources().getResourceName(i)));
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void setState(int i, int i2, int i3) {
        setState(TransitionState.b);
        this.v = i;
        this.u = -1;
        this.w = -1;
        z21 z21Var = this.k;
        if (z21Var != null) {
            z21Var.j(i2, i3, i);
            return;
        }
        b bVar = this.q;
        if (bVar != null) {
            bVar.b(i).b(this);
        }
    }

    public void setProgress(float f) {
        if (f < 0.0f || f > 1.0f) {
            t0.m("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!isAttachedToWindow()) {
            if (this.R0 == null) {
                this.R0 = new a(this);
            }
            this.R0.a = f;
            return;
        }
        TransitionState transitionState = TransitionState.d;
        TransitionState transitionState2 = TransitionState.c;
        if (f <= 0.0f) {
            if (this.E == 1.0f && this.v == this.w) {
                setState(transitionState2);
            }
            this.v = this.u;
            if (this.E == 0.0f) {
                setState(transitionState);
            }
        } else if (f >= 1.0f) {
            if (this.E == 0.0f && this.v == this.u) {
                setState(transitionState2);
            }
            this.v = this.w;
            if (this.E == 1.0f) {
                setState(transitionState);
            }
        } else {
            this.v = -1;
            setState(transitionState2);
        }
        if (this.q == null) {
            return;
        }
        this.H = true;
        this.G = f;
        this.D = f;
        this.F = -1L;
        this.B = -1L;
        this.r = null;
        this.I = true;
        invalidate();
    }

    public void setTransition(int i) {
        float f;
        if (this.q != null) {
            bz4 bz4VarA = A(i);
            this.u = bz4VarA.d;
            this.w = bz4VarA.c;
            if (!isAttachedToWindow()) {
                if (this.R0 == null) {
                    this.R0 = new a(this);
                }
                a aVar = this.R0;
                aVar.c = this.u;
                aVar.d = this.w;
                return;
            }
            int i2 = this.v;
            if (i2 == this.u) {
                f = 0.0f;
            } else {
                f = i2 == this.w ? 1.0f : Float.NaN;
            }
            b bVar = this.q;
            bVar.c = bz4VarA;
            c cVar = bz4VarA.l;
            if (cVar != null) {
                cVar.c(bVar.p);
            }
            this.W0.e(this.q.b(this.u), this.q.b(this.w));
            F();
            if (this.E != f) {
                if (f == 0.0f) {
                    v(true);
                    this.q.b(this.u).b(this);
                } else if (f == 1.0f) {
                    v(false);
                    this.q.b(this.w).b(this);
                }
            }
            this.E = Float.isNaN(f) ? 0.0f : f;
            if (Float.isNaN(f)) {
                vy2.D();
                u(0.0f);
            } else {
                setProgress(f);
            }
        }
    }

    public MotionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.s = null;
        this.t = 0.0f;
        this.u = -1;
        this.v = -1;
        this.w = -1;
        this.x = 0;
        this.y = 0;
        this.z = true;
        this.A = new HashMap();
        this.B = 0L;
        this.C = 1.0f;
        this.D = 0.0f;
        this.E = 0.0f;
        this.G = 0.0f;
        this.I = false;
        this.K = 0;
        this.M = false;
        this.N = new c68();
        this.O = new sy4(this);
        this.S = false;
        this.x0 = false;
        this.y0 = null;
        this.z0 = null;
        this.A0 = null;
        this.B0 = null;
        this.C0 = 0;
        this.D0 = -1L;
        this.E0 = 0.0f;
        this.F0 = 0;
        this.G0 = 0.0f;
        this.H0 = false;
        this.P0 = new wx3(0);
        this.Q0 = false;
        this.S0 = null;
        new HashMap();
        this.T0 = new Rect();
        this.U0 = false;
        this.V0 = TransitionState.a;
        this.W0 = new uy4(this);
        this.X0 = false;
        this.Y0 = new RectF();
        this.Z0 = null;
        this.a1 = null;
        this.b1 = new ArrayList();
        C(attributeSet);
    }

    public void setTransition(bz4 bz4Var) {
        c cVar;
        b bVar = this.q;
        bVar.c = bz4Var;
        if (bz4Var != null && (cVar = bz4Var.l) != null) {
            cVar.c(bVar.p);
        }
        setState(TransitionState.b);
        int i = this.v;
        bz4 bz4Var2 = this.q.c;
        if (i == (bz4Var2 == null ? -1 : bz4Var2.c)) {
            this.E = 1.0f;
            this.D = 1.0f;
            this.G = 1.0f;
        } else {
            this.E = 0.0f;
            this.D = 0.0f;
            this.G = 0.0f;
        }
        this.F = (bz4Var.r & 1) != 0 ? -1L : getNanoTime();
        int iH = this.q.h();
        b bVar2 = this.q;
        bz4 bz4Var3 = bVar2.c;
        int i2 = bz4Var3 != null ? bz4Var3.c : -1;
        if (iH == this.u && i2 == this.w) {
            return;
        }
        this.u = iH;
        this.w = i2;
        bVar2.n(iH, i2);
        d dVarB = this.q.b(this.u);
        d dVarB2 = this.q.b(this.w);
        uy4 uy4Var = this.W0;
        uy4Var.e(dVarB, dVarB2);
        int i3 = this.u;
        int i4 = this.w;
        uy4Var.e = i3;
        uy4Var.f = i4;
        uy4Var.f();
        F();
    }

    public MotionLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.s = null;
        this.t = 0.0f;
        this.u = -1;
        this.v = -1;
        this.w = -1;
        this.x = 0;
        this.y = 0;
        this.z = true;
        this.A = new HashMap();
        this.B = 0L;
        this.C = 1.0f;
        this.D = 0.0f;
        this.E = 0.0f;
        this.G = 0.0f;
        this.I = false;
        this.K = 0;
        this.M = false;
        this.N = new c68();
        this.O = new sy4(this);
        this.S = false;
        this.x0 = false;
        this.y0 = null;
        this.z0 = null;
        this.A0 = null;
        this.B0 = null;
        this.C0 = 0;
        this.D0 = -1L;
        this.E0 = 0.0f;
        this.F0 = 0;
        this.G0 = 0.0f;
        this.H0 = false;
        this.P0 = new wx3(0);
        this.Q0 = false;
        this.S0 = null;
        new HashMap();
        this.T0 = new Rect();
        this.U0 = false;
        this.V0 = TransitionState.a;
        this.W0 = new uy4(this);
        this.X0 = false;
        this.Y0 = new RectF();
        this.Z0 = null;
        this.a1 = null;
        this.b1 = new ArrayList();
        C(attributeSet);
    }
}
