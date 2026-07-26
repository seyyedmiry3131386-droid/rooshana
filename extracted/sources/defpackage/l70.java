package defpackage;

import android.view.View;
import androidx.recyclerview.widget.o;

/* JADX INFO: loaded from: classes3.dex */
public final class l70 extends n70 {
    public final /* synthetic */ int a;
    public final o b;
    public final /* synthetic */ vy7 c;

    public /* synthetic */ l70(vy7 vy7Var, o oVar, int i) {
        this.a = i;
        this.c = vy7Var;
        this.b = oVar;
    }

    @Override // defpackage.n70, defpackage.z89
    public final void a(View view) {
        switch (this.a) {
            case 0:
                w07.a(view);
                break;
            default:
                w07.a(view);
                break;
        }
    }

    @Override // defpackage.z89
    public final void b(View view) {
        switch (this.a) {
            case 0:
                w07.a(view);
                vy7 vy7Var = this.c;
                o oVar = this.b;
                vy7Var.c(oVar);
                vy7Var.o.remove(oVar);
                if (!vy7Var.g()) {
                    vy7Var.d();
                }
                break;
            default:
                w07.a(view);
                vy7 vy7Var2 = this.c;
                o oVar2 = this.b;
                vy7Var2.c(oVar2);
                vy7Var2.q.remove(oVar2);
                if (!vy7Var2.g()) {
                    vy7Var2.d();
                }
                break;
        }
    }

    @Override // defpackage.n70, defpackage.z89
    public final void c() {
        int i = this.a;
    }

    private final void d() {
    }

    private final void e() {
    }
}
