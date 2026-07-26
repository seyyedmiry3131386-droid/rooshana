package defpackage;

import android.animation.AnimatorSet;

/* JADX INFO: loaded from: classes.dex */
public final class hh1 {
    public static final hh1 a = new hh1();

    public final void a(AnimatorSet animatorSet) {
        js3.p(animatorSet, "animatorSet");
        animatorSet.reverse();
    }

    public final void b(AnimatorSet animatorSet, long j) {
        js3.p(animatorSet, "animatorSet");
        animatorSet.setCurrentPlayTime(j);
    }
}
