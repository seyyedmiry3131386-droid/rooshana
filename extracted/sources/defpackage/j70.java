package defpackage;

import android.view.View;
import androidx.recyclerview.widget.o;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class j70 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ vy7 c;

    public /* synthetic */ j70(vy7 vy7Var, ArrayList arrayList, int i) {
        this.a = i;
        this.c = vy7Var;
        this.b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        switch (this.a) {
            case 0:
                vy7 vy7Var = this.c;
                ArrayList arrayList = vy7Var.m;
                ArrayList<m70> arrayList2 = this.b;
                if (arrayList.remove(arrayList2)) {
                    for (m70 m70Var : arrayList2) {
                        o oVar = m70Var.a;
                        int i = m70Var.b;
                        int i2 = m70Var.c;
                        int i3 = m70Var.d;
                        int i4 = m70Var.e;
                        View view2 = oVar.a;
                        int i5 = i3 - i;
                        int i6 = i4 - i2;
                        if (i5 != 0 && (view = (View) q69.b(view2).a.get()) != null) {
                            view.animate().translationX(0.0f);
                        }
                        if (i6 != 0) {
                            q69.b(view2).g(0.0f);
                        }
                        vy7Var.p.add(oVar);
                        x89 x89VarB = q69.b(view2);
                        x89VarB.c(vy7Var.e);
                        x89VarB.e(new k70(vy7Var, oVar, i5, i6, x89VarB));
                        x89VarB.f();
                    }
                    arrayList2.clear();
                    break;
                }
                break;
            default:
                vy7 vy7Var2 = this.c;
                ArrayList arrayList3 = vy7Var2.l;
                ArrayList<o> arrayList4 = this.b;
                if (arrayList3.remove(arrayList4)) {
                    for (o oVar2 : arrayList4) {
                        x89 x89VarB2 = q69.b(oVar2.a);
                        x89VarB2.g(0.0f);
                        x89VarB2.a(1.0f);
                        x89VarB2.c(vy7Var2.c);
                        x89VarB2.d(vy7Var2.s);
                        x89VarB2.e(new l70(vy7Var2, oVar2, 0));
                        x89VarB2.f();
                        vy7Var2.o.add(oVar2);
                    }
                    arrayList4.clear();
                    break;
                }
                break;
        }
    }
}
