package defpackage;

import android.os.Message;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import io.sentry.android.core.t0;

/* JADX INFO: loaded from: classes.dex */
public final class n80 extends jx {
    @Override // defpackage.jx, android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                t0.o("BasePendingResult", rm7.o(i, "Don't know how to handle message: ", new StringBuilder(String.valueOf(i).length() + 34)), new Exception());
                return;
            } else {
                ((BasePendingResult) message.obj).q0(Status.h);
                return;
            }
        }
        Pair pair = (Pair) message.obj;
        if (pair.first != null) {
            throw new ClassCastException();
        }
        try {
            throw null;
        } catch (RuntimeException e) {
            mi miVar = BasePendingResult.M;
            throw e;
        }
    }
}
