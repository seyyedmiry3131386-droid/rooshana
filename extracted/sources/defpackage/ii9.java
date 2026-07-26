package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import io.sentry.android.core.t0;

/* JADX INFO: loaded from: classes.dex */
public final class ii9 extends jx {
    public final Context b;
    public final /* synthetic */ gu2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ii9(gu2 gu2Var, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), 3);
        this.c = gu2Var;
        this.b = context.getApplicationContext();
    }

    @Override // defpackage.jx, android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 39);
            sb.append("Don't know how to handle this message: ");
            sb.append(i);
            t0.m("GoogleApiAvailability", sb.toString());
            return;
        }
        int i2 = hu2.a;
        gu2 gu2Var = this.c;
        Context context = this.b;
        int iB = gu2Var.b(context, i2);
        int i3 = lu2.e;
        if (iB == 1 || iB == 2 || iB == 3 || iB == 9) {
            Intent intentA = gu2Var.a(iB, context, "n");
            gu2Var.f(context, iB, intentA == null ? null : PendingIntent.getActivity(context, 0, intentA, 201326592));
        }
    }
}
