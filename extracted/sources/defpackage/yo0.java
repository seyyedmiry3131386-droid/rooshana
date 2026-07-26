package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Matrix;
import android.view.View;
import androidx.transition.ChangeTransform;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class yo0 extends AnimatorListenerAdapter {
    public boolean a;
    public final Matrix b = new Matrix();
    public final boolean c;
    public final boolean d;
    public final View e;
    public final ap0 f;
    public final zo0 g;
    public final Matrix h;

    public yo0(View view, ap0 ap0Var, zo0 zo0Var, Matrix matrix, boolean z, boolean z2) {
        this.c = z;
        this.d = z2;
        this.e = view;
        this.f = ap0Var;
        this.g = zo0Var;
        this.h = matrix;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.a = true;
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
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        boolean z = this.a;
        ap0 ap0Var = this.f;
        View view = this.e;
        if (!z) {
            if (this.c && this.d) {
                Matrix matrix = this.b;
                matrix.set(this.h);
                view.setTag(nr6.transition_transform, matrix);
                float f = ap0Var.a;
                float f2 = ap0Var.b;
                float f3 = ap0Var.c;
                float f4 = ap0Var.d;
                float f5 = ap0Var.e;
                float f6 = ap0Var.f;
                float f7 = ap0Var.g;
                float f8 = ap0Var.h;
                String[] strArr = ChangeTransform.K;
                view.setTranslationX(f);
                view.setTranslationY(f2);
                WeakHashMap weakHashMap = q69.a;
                h69.o(view, f3);
                view.setScaleX(f4);
                view.setScaleY(f5);
                view.setRotationX(f6);
                view.setRotationY(f7);
                view.setRotation(f8);
            } else {
                view.setTag(nr6.transition_transform, null);
                view.setTag(nr6.parent_matrix, null);
            }
        }
        ba9.a.A(view, null);
        float f9 = ap0Var.a;
        float f10 = ap0Var.b;
        float f11 = ap0Var.c;
        float f12 = ap0Var.d;
        float f13 = ap0Var.e;
        float f14 = ap0Var.f;
        float f15 = ap0Var.g;
        float f16 = ap0Var.h;
        String[] strArr2 = ChangeTransform.K;
        view.setTranslationX(f9);
        view.setTranslationY(f10);
        WeakHashMap weakHashMap2 = q69.a;
        h69.o(view, f11);
        view.setScaleX(f12);
        view.setScaleY(f13);
        view.setRotationX(f14);
        view.setRotationY(f15);
        view.setRotation(f16);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        Matrix matrix = this.g.a;
        Matrix matrix2 = this.b;
        matrix2.set(matrix);
        int i = nr6.transition_transform;
        View view = this.e;
        view.setTag(i, matrix2);
        ap0 ap0Var = this.f;
        float f = ap0Var.a;
        float f2 = ap0Var.b;
        float f3 = ap0Var.c;
        float f4 = ap0Var.d;
        float f5 = ap0Var.e;
        float f6 = ap0Var.f;
        float f7 = ap0Var.g;
        float f8 = ap0Var.h;
        String[] strArr = ChangeTransform.K;
        view.setTranslationX(f);
        view.setTranslationY(f2);
        WeakHashMap weakHashMap = q69.a;
        h69.o(view, f3);
        view.setScaleX(f4);
        view.setScaleY(f5);
        view.setRotationX(f6);
        view.setRotationY(f7);
        view.setRotation(f8);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        String[] strArr = ChangeTransform.K;
        View view = this.e;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        WeakHashMap weakHashMap = q69.a;
        h69.o(view, 0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setRotationX(0.0f);
        view.setRotationY(0.0f);
        view.setRotation(0.0f);
    }
}
