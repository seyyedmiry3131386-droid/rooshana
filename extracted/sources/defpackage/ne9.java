package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class ne9 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ ue9 a;
    public final /* synthetic */ lf9 b;
    public final /* synthetic */ lf9 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ View e;

    public ne9(ue9 ue9Var, lf9 lf9Var, lf9 lf9Var2, int i, View view) {
        this.a = ue9Var;
        this.b = lf9Var;
        this.c = lf9Var2;
        this.d = i;
        this.e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        ue9 ue9Var = this.a;
        te9 te9Var = ue9Var.a;
        te9Var.e(animatedFraction);
        lf9 lf9Var = this.b;
        if9 if9Var = lf9Var.a;
        float fC = te9Var.c();
        PathInterpolator pathInterpolator = pe9.e;
        int i = Build.VERSION.SDK_INT;
        af9 ze9Var = i >= 34 ? new ze9(lf9Var) : i >= 31 ? new ye9(lf9Var) : i >= 30 ? new xe9(lf9Var) : i >= 29 ? new we9(lf9Var) : new ve9(lf9Var);
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((this.d & i2) == 0) {
                ze9Var.c(i2, if9Var.g(i2));
            } else {
                no3 no3VarG = if9Var.g(i2);
                no3 no3VarG2 = this.c.a.g(i2);
                float f = 1.0f - fC;
                ze9Var.c(i2, lf9.e(no3VarG, (int) (((double) ((no3VarG.a - no3VarG2.a) * f)) + 0.5d), (int) (((double) ((no3VarG.b - no3VarG2.b) * f)) + 0.5d), (int) (((double) ((no3VarG.c - no3VarG2.c) * f)) + 0.5d), (int) (((double) ((no3VarG.d - no3VarG2.d) * f)) + 0.5d)));
            }
        }
        pe9.h(this.e, ze9Var.b(), Collections.singletonList(ue9Var));
    }
}
