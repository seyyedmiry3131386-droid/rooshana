package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class oj9 {
    public static final pg a = new pg("GoogleSignInCommon", new String[0]);

    public static void a(Context context) {
        pj9.y(context).z();
        Iterator it = GoogleApiClient.a().iterator();
        if (it.hasNext()) {
            ((GoogleApiClient) it.next()).getClass();
            throw new UnsupportedOperationException();
        }
        synchronized (ku2.q) {
            try {
                ku2 ku2Var = ku2.r;
                if (ku2Var != null) {
                    ku2Var.i.incrementAndGet();
                    jx jxVar = ku2Var.m;
                    jxVar.sendMessageAtFrontOfQueue(jxVar.obtainMessage(10));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
