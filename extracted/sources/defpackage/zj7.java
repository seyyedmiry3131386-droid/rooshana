package defpackage;

import android.animation.AnimatorSet;
import com.google.android.material.search.c;
import com.google.android.material.search.e;
import com.google.android.material.search.g;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zj7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g b;

    public /* synthetic */ zj7(g gVar, int i) {
        this.a = i;
        this.b = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.n();
                break;
            case 1:
                g gVar = this.b;
                AnimatorSet animatorSetF = gVar.f(true);
                animatorSetF.addListener(new c(gVar));
                animatorSetF.start();
                break;
            default:
                g gVar2 = this.b;
                gVar2.c.setTranslationY(r1.getHeight());
                AnimatorSet animatorSetI = gVar2.i(true);
                animatorSetI.addListener(new e(gVar2));
                animatorSetI.start();
                break;
        }
    }
}
