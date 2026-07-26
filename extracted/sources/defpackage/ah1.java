package defpackage;

import android.view.View;
import androidx.fragment.app.SpecialEffectsController$Operation$State;
import androidx.fragment.app.c;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ah1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;
    public final /* synthetic */ p28 c;

    public /* synthetic */ ah1(c cVar, p28 p28Var, int i) {
        this.a = i;
        this.b = cVar;
        this.c = p28Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                c cVar = this.b;
                js3.p(cVar, "this$0");
                p28 p28Var = this.c;
                js3.p(p28Var, "$operation");
                cVar.a(p28Var);
                break;
            case 1:
                c cVar2 = this.b;
                ArrayList arrayList = cVar2.b;
                p28 p28Var2 = this.c;
                if (arrayList.contains(p28Var2)) {
                    SpecialEffectsController$Operation$State specialEffectsController$Operation$State = p28Var2.a;
                    View view = p28Var2.c.J;
                    js3.o(view, "operation.fragment.mView");
                    specialEffectsController$Operation$State.a(view, cVar2.a);
                }
                break;
            default:
                c cVar3 = this.b;
                ArrayList arrayList2 = cVar3.b;
                p28 p28Var3 = this.c;
                arrayList2.remove(p28Var3);
                cVar3.c.remove(p28Var3);
                break;
        }
    }
}
