package defpackage;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class te2 {
    public static final w82 B = yk.c;
    public static final int C = vp6.motionDurationLong2;
    public static final int D = vp6.motionEasingEmphasizedInterpolator;
    public static final int E = vp6.motionDurationMedium1;
    public static final int F = vp6.motionEasingEmphasizedAccelerateInterpolator;
    public static final int[] G = {R.attr.state_pressed, R.attr.state_enabled};
    public static final int[] H = {R.attr.state_hovered, R.attr.state_focused, R.attr.state_enabled};
    public static final int[] I = {R.attr.state_focused, R.attr.state_enabled};
    public static final int[] J = {R.attr.state_hovered, R.attr.state_enabled};
    public static final int[] K = {R.attr.state_enabled};
    public static final int[] L = new int[0];
    public as7 a;
    public se2 b;
    public RippleDrawable c;
    public he0 d;
    public RippleDrawable e;
    public boolean f;
    public float h;
    public float i;
    public float j;
    public int k;
    public StateListAnimator l;
    public Animator m;
    public ez4 n;
    public ez4 o;
    public int q;
    public ArrayList s;
    public ArrayList t;
    public ArrayList u;
    public final FloatingActionButton v;
    public final pj9 w;
    public boolean g = true;
    public float p = 1.0f;
    public int r = 0;
    public final Rect x = new Rect();
    public final RectF y = new RectF();
    public final RectF z = new RectF();
    public final Matrix A = new Matrix();

    public te2(FloatingActionButton floatingActionButton, pj9 pj9Var) {
        this.v = floatingActionButton;
        this.w = pj9Var;
    }

    public final void a(float f, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.v.getDrawable();
        if (drawable == null || this.q == 0) {
            return;
        }
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        RectF rectF = this.y;
        rectF.set(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
        float f2 = this.q;
        RectF rectF2 = this.z;
        rectF2.set(0.0f, 0.0f, f2, f2);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        float f3 = this.q / 2.0f;
        matrix.postScale(f, f, f3, f3);
    }

    public final AnimatorSet b(ez4 ez4Var, float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float[] fArr = {f};
        FloatingActionButton floatingActionButton = this.v;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) property, fArr);
        ez4Var.f("opacity").a(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_X, f2);
        ez4Var.f("scale").a(objectAnimatorOfFloat2);
        int i = Build.VERSION.SDK_INT;
        if (i == 26) {
            objectAnimatorOfFloat2.setEvaluator(new gl());
        }
        arrayList.add(objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_Y, f2);
        ez4Var.f("scale").a(objectAnimatorOfFloat3);
        if (i == 26) {
            objectAnimatorOfFloat3.setEvaluator(new gl());
        }
        arrayList.add(objectAnimatorOfFloat3);
        Matrix matrix = this.A;
        a(f3, matrix);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(floatingActionButton, new z70(), new re2(this), new Matrix(matrix));
        ez4Var.f("iconScale").a(objectAnimatorOfObject);
        arrayList.add(objectAnimatorOfObject);
        AnimatorSet animatorSet = new AnimatorSet();
        vy2.L(animatorSet, arrayList);
        return animatorSet;
    }

    public final AnimatorSet c(final float f, final float f2, final float f3, int i, int i2) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        FloatingActionButton floatingActionButton = this.v;
        final float alpha = floatingActionButton.getAlpha();
        final float scaleX = floatingActionButton.getScaleX();
        final float scaleY = floatingActionButton.getScaleY();
        final float f4 = this.p;
        final Matrix matrix = new Matrix(this.A);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: pe2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                te2 te2Var = this.a;
                te2Var.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                FloatingActionButton floatingActionButton2 = te2Var.v;
                floatingActionButton2.setAlpha(yk.b(alpha, f, 0.0f, 0.2f, fFloatValue));
                float f5 = scaleX;
                float f6 = f2;
                floatingActionButton2.setScaleX(yk.a(f5, f6, fFloatValue));
                floatingActionButton2.setScaleY(yk.a(scaleY, f6, fFloatValue));
                float f7 = f4;
                float f8 = f3;
                te2Var.p = yk.a(f7, f8, fFloatValue);
                float fA = yk.a(f7, f8, fFloatValue);
                Matrix matrix2 = matrix;
                te2Var.a(fA, matrix2);
                floatingActionButton2.setImageMatrix(matrix2);
            }
        });
        arrayList.add(valueAnimatorOfFloat);
        vy2.L(animatorSet, arrayList);
        animatorSet.setDuration(ub1.G(floatingActionButton.getContext(), i, floatingActionButton.getContext().getResources().getInteger(cs6.material_motion_duration_long_1)));
        animatorSet.setInterpolator(ub1.H(floatingActionButton.getContext(), i2, yk.b));
        return animatorSet;
    }

    public final AnimatorSet d(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        float[] fArr = {f};
        FloatingActionButton floatingActionButton = this.v;
        animatorSet.play(ObjectAnimator.ofFloat(floatingActionButton, "elevation", fArr).setDuration(0L)).with(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f2).setDuration(100L));
        animatorSet.setInterpolator(B);
        return animatorSet;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void e(float f, float f2, float f3) {
        int i = Build.VERSION.SDK_INT;
        FloatingActionButton floatingActionButton = this.v;
        if (floatingActionButton.getStateListAnimator() == this.l) {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(G, d(f, f3));
            stateListAnimator.addState(H, d(f, f2));
            stateListAnimator.addState(I, d(f, f2));
            stateListAnimator.addState(J, d(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, "elevation", f).setDuration(0L));
            if (i <= 24) {
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(B);
            stateListAnimator.addState(K, animatorSet);
            stateListAnimator.addState(L, d(0.0f, 0.0f));
            this.l = stateListAnimator;
            floatingActionButton.setStateListAnimator(stateListAnimator);
        }
        if (((FloatingActionButton) this.w.a).k || (this.f && floatingActionButton.getSizeDimension() < this.k)) {
            i();
        }
    }

    public final void f() {
        ArrayList<oe2> arrayList = this.u;
        if (arrayList != null) {
            for (oe2 oe2Var : arrayList) {
                pt2 pt2Var = oe2Var.a;
                FloatingActionButton floatingActionButton = oe2Var.b;
                pt2Var.getClass();
                BottomAppBar bottomAppBar = (BottomAppBar) pt2Var.b;
                bottomAppBar.b.t((floatingActionButton.getVisibility() == 0 && bottomAppBar.g == 1) ? floatingActionButton.getScaleY() : 0.0f);
            }
        }
    }

    public final void g() {
        ArrayList<oe2> arrayList = this.u;
        if (arrayList != null) {
            for (oe2 oe2Var : arrayList) {
                pt2 pt2Var = oe2Var.a;
                FloatingActionButton floatingActionButton = oe2Var.b;
                pt2Var.getClass();
                BottomAppBar bottomAppBar = (BottomAppBar) pt2Var.b;
                int i = bottomAppBar.g;
                fk4 fk4Var = bottomAppBar.b;
                if (i == 1) {
                    float translationX = floatingActionButton.getTranslationX();
                    if (bottomAppBar.getTopEdgeTreatment().B != translationX) {
                        bottomAppBar.getTopEdgeTreatment().B = translationX;
                        fk4Var.invalidateSelf();
                    }
                    float fMax = Math.max(0.0f, -floatingActionButton.getTranslationY());
                    if (bottomAppBar.getTopEdgeTreatment().A != fMax) {
                        bottomAppBar.getTopEdgeTreatment().s(fMax);
                        fk4Var.invalidateSelf();
                    }
                    fk4Var.t(floatingActionButton.getVisibility() == 0 ? floatingActionButton.getScaleY() : 0.0f);
                }
            }
        }
    }

    public final void h(as7 as7Var) {
        this.a = as7Var;
        se2 se2Var = this.b;
        if (se2Var != null) {
            se2Var.setShapeAppearanceModel(as7Var);
        }
        Drawable.Callback callback = this.c;
        if (callback instanceof bt7) {
            ((bt7) callback).setShapeAppearanceModel(as7Var);
        }
        he0 he0Var = this.d;
        if (he0Var != null) {
            he0Var.o = as7Var;
            he0Var.invalidateSelf();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i() {
        /*
            r10 = this;
            pj9 r0 = r10.w
            java.lang.Object r1 = r0.a
            com.google.android.material.floatingactionbutton.FloatingActionButton r1 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r1
            java.lang.Object r2 = r0.a
            com.google.android.material.floatingactionbutton.FloatingActionButton r2 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r2
            boolean r1 = r1.k
            android.graphics.Rect r3 = r10.x
            com.google.android.material.floatingactionbutton.FloatingActionButton r4 = r10.v
            r5 = 0
            if (r1 == 0) goto L4c
            boolean r1 = r10.f
            if (r1 == 0) goto L24
            int r1 = r10.k
            int r6 = r4.getSizeDimension()
            int r1 = r1 - r6
            int r1 = r1 / 2
            int r5 = java.lang.Math.max(r1, r5)
        L24:
            boolean r1 = r10.g
            if (r1 == 0) goto L30
            float r1 = r4.getElevation()
            float r6 = r10.j
            float r1 = r1 + r6
            goto L31
        L30:
            r1 = 0
        L31:
            double r6 = (double) r1
            double r6 = java.lang.Math.ceil(r6)
            int r6 = (int) r6
            int r6 = java.lang.Math.max(r5, r6)
            r7 = 1069547520(0x3fc00000, float:1.5)
            float r1 = r1 * r7
            double r7 = (double) r1
            double r7 = java.lang.Math.ceil(r7)
            int r1 = (int) r7
            int r1 = java.lang.Math.max(r5, r1)
            r3.set(r6, r1, r6, r1)
            goto L66
        L4c:
            boolean r1 = r10.f
            if (r1 == 0) goto L63
            int r1 = r4.getSizeDimension()
            int r6 = r10.k
            if (r1 >= r6) goto L63
            int r1 = r4.getSizeDimension()
            int r6 = r6 - r1
            int r6 = r6 / 2
            r3.set(r6, r6, r6, r6)
            goto L66
        L63:
            r3.set(r5, r5, r5, r5)
        L66:
            android.graphics.drawable.RippleDrawable r1 = r10.e
            java.lang.String r5 = "Didn't initialize content background"
            defpackage.wu8.l(r1, r5)
            java.lang.Object r0 = r0.a
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r0
            boolean r0 = r0.k
            if (r0 != 0) goto L8a
            boolean r0 = r10.f
            if (r0 == 0) goto L82
            int r0 = r4.getSizeDimension()
            int r1 = r10.k
            if (r0 >= r1) goto L82
            goto L8a
        L82:
            android.graphics.drawable.RippleDrawable r0 = r10.e
            if (r0 == 0) goto L9c
            com.google.android.material.floatingactionbutton.FloatingActionButton.b(r2, r0)
            goto L9c
        L8a:
            android.graphics.drawable.InsetDrawable r4 = new android.graphics.drawable.InsetDrawable
            android.graphics.drawable.RippleDrawable r5 = r10.e
            int r6 = r3.left
            int r7 = r3.top
            int r8 = r3.right
            int r9 = r3.bottom
            r4.<init>(r5, r6, r7, r8, r9)
            com.google.android.material.floatingactionbutton.FloatingActionButton.b(r2, r4)
        L9c:
            int r0 = r3.left
            int r1 = r3.top
            int r4 = r3.right
            int r3 = r3.bottom
            android.graphics.Rect r5 = r2.l
            r5.set(r0, r1, r4, r3)
            int r5 = r2.i
            int r0 = r0 + r5
            int r1 = r1 + r5
            int r4 = r4 + r5
            int r3 = r3 + r5
            r2.setPadding(r0, r1, r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.te2.i():void");
    }
}
