package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.g;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class bh1 implements Animation.AnimationListener {
    public final /* synthetic */ p28 a;
    public final /* synthetic */ ViewGroup b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ch1 d;

    public bh1(p28 p28Var, ViewGroup viewGroup, View view, ch1 ch1Var) {
        this.a = p28Var;
        this.b = viewGroup;
        this.c = view;
        this.d = ch1Var;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        js3.p(animation, "animation");
        ViewGroup viewGroup = this.b;
        viewGroup.post(new ii(viewGroup, this.c, this.d, 6));
        if (g.N(2)) {
            Objects.toString(this.a);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        js3.p(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        js3.p(animation, "animation");
        if (g.N(2)) {
            Objects.toString(this.a);
        }
    }
}
