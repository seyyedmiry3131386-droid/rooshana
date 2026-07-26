package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class bw1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ cw1 b;

    public /* synthetic */ bw1(cw1 cw1Var, int i) {
        this.a = i;
        this.b = cw1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 1:
                super.onAnimationEnd(animator);
                cw1 cw1Var = this.b;
                super/*android.graphics.drawable.Drawable*/.setVisible(false, false);
                ArrayList arrayList = cw1Var.g;
                if (arrayList != null && !cw1Var.h) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((s80) it.next()).a(cw1Var);
                    }
                    break;
                }
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationStart(animator);
                cw1 cw1Var = this.b;
                ArrayList arrayList = cw1Var.g;
                if (arrayList != null && !cw1Var.h) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((s80) it.next()).b(cw1Var);
                    }
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
