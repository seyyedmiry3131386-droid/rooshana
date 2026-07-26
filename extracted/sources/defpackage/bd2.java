package defpackage;

import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;
import com.google.firebase.messaging.FirebaseMessaging;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bd2 implements FirebaseInstanceIdInternal.NewTokenListener, tt5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FirebaseMessaging b;

    public /* synthetic */ bd2(FirebaseMessaging firebaseMessaging, int i) {
        this.a = i;
        this.b = firebaseMessaging;
    }

    @Override // com.google.firebase.iid.internal.FirebaseInstanceIdInternal.NewTokenListener
    public void onNewToken(String str) {
        t15 t15Var = FirebaseMessaging.l;
        this.b.f(str);
    }

    @Override // defpackage.tt5
    public void onSuccess(Object obj) {
        boolean z;
        switch (this.a) {
            case 1:
                oo8 oo8Var = (oo8) obj;
                if (!this.b.f.m() || oo8Var.h.a() == null) {
                    return;
                }
                synchronized (oo8Var) {
                    z = oo8Var.g;
                }
                if (z) {
                    return;
                }
                oo8Var.g(0L);
                return;
            default:
                FirebaseMessaging firebaseMessaging = this.b;
                CloudMessage cloudMessage = (CloudMessage) obj;
                t15 t15Var = FirebaseMessaging.l;
                firebaseMessaging.getClass();
                if (cloudMessage != null) {
                    wn5.S(cloudMessage.a);
                    firebaseMessaging.e();
                    return;
                }
                return;
        }
    }
}
