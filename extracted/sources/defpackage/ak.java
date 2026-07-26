package defpackage;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;

/* JADX INFO: loaded from: classes.dex */
public final class ak extends c26 {
    public final ObjectAnimator v;
    public final boolean w;

    public ak(AnimationDrawable animationDrawable, boolean z, boolean z2) {
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        int i = z ? numberOfFrames - 1 : 0;
        int i2 = z ? 0 : numberOfFrames - 1;
        bk bkVar = new bk();
        int numberOfFrames2 = animationDrawable.getNumberOfFrames();
        bkVar.b = numberOfFrames2;
        int[] iArr = bkVar.a;
        if (iArr == null || iArr.length < numberOfFrames2) {
            bkVar.a = new int[numberOfFrames2];
        }
        int[] iArr2 = bkVar.a;
        int i3 = 0;
        for (int i4 = 0; i4 < numberOfFrames2; i4++) {
            int duration = animationDrawable.getDuration(z ? (numberOfFrames2 - i4) - 1 : i4);
            iArr2[i4] = duration;
            i3 += duration;
        }
        bkVar.c = i3;
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i2);
        objectAnimatorOfInt.setAutoCancel(true);
        objectAnimatorOfInt.setDuration(bkVar.c);
        objectAnimatorOfInt.setInterpolator(bkVar);
        this.w = z2;
        this.v = objectAnimatorOfInt;
    }

    @Override // defpackage.c26
    public final void M() {
        this.v.reverse();
    }

    @Override // defpackage.c26
    public final void N() {
        this.v.start();
    }

    @Override // defpackage.c26
    public final void O() {
        this.v.cancel();
    }

    @Override // defpackage.c26
    public final boolean o() {
        return this.w;
    }
}
