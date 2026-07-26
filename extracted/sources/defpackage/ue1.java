package defpackage;

import android.content.Context;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ue1 implements ly0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ so6 b;

    public /* synthetic */ ue1(so6 so6Var, int i) {
        this.a = i;
        this.b = so6Var;
    }

    @Override // defpackage.ly0
    public final Object h(o77 o77Var) {
        switch (this.a) {
            case 0:
                return new we1((Context) o77Var.get(Context.class), ((xc2) o77Var.get(xc2.class)).d(), o77Var.E(hy2.class), o77Var.c(ei1.class), (Executor) o77Var.g(this.b));
            default:
                return FirebaseMessagingRegistrar.lambda$getComponents$0(this.b, o77Var);
        }
    }
}
