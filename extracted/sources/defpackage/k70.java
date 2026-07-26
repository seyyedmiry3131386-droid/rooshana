package defpackage;

import android.view.View;
import androidx.recyclerview.widget.o;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class k70 extends n70 {
    public final /* synthetic */ o a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ x89 d;
    public final /* synthetic */ vy7 e;

    public k70(vy7 vy7Var, o oVar, int i, int i2, x89 x89Var) {
        this.e = vy7Var;
        this.a = oVar;
        this.b = i;
        this.c = i2;
        this.d = x89Var;
    }

    @Override // defpackage.n70, defpackage.z89
    public final void a(View view) {
        if (this.b != 0) {
            WeakHashMap weakHashMap = q69.a;
            view.setTranslationX(0.0f);
        }
        if (this.c != 0) {
            WeakHashMap weakHashMap2 = q69.a;
            view.setTranslationY(0.0f);
        }
    }

    @Override // defpackage.z89
    public final void b(View view) {
        this.d.e(null);
        vy7 vy7Var = this.e;
        o oVar = this.a;
        vy7Var.c(oVar);
        ArrayList arrayList = vy7Var.p;
        arrayList.remove(oVar);
        if (!vy7Var.g()) {
            vy7Var.d();
        }
        arrayList.isEmpty();
    }

    @Override // defpackage.n70, defpackage.z89
    public final void c() {
    }
}
