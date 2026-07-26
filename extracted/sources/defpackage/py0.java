package defpackage;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.messaging.FirebaseMessaging;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class py0 implements qn6 {
    public final /* synthetic */ int a;

    public /* synthetic */ py0(int i) {
        this.a = i;
    }

    @Override // defpackage.qn6
    public final Object get() {
        switch (this.a) {
            case 2:
                d24 d24Var = ExecutorsRegistrar.a;
                break;
            case 3:
                d24 d24Var2 = ExecutorsRegistrar.a;
                break;
            case 4:
                d24 d24Var3 = ExecutorsRegistrar.a;
                break;
            case 5:
                t15 t15Var = FirebaseMessaging.l;
                break;
        }
        return null;
    }
}
