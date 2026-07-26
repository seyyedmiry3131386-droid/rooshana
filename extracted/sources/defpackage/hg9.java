package defpackage;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import com.google.firebase.messaging.EnhancedIntentService;

/* JADX INFO: loaded from: classes.dex */
public final class hg9 extends Binder {
    public final pj9 n;

    public hg9(pj9 pj9Var) {
        this.n = pj9Var;
    }

    public final void a(ig9 ig9Var) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        Intent intent = ig9Var.a;
        EnhancedIntentService enhancedIntentService = (EnhancedIntentService) this.n.a;
        int i = EnhancedIntentService.f;
        cf8 cf8Var = new cf8();
        enhancedIntentService.a.execute(new ii(enhancedIntentService, intent, cf8Var, 9));
        cf8Var.a.h(new qa(0), new f09(7, ig9Var));
    }
}
