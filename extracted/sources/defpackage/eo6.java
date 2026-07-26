package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;
import com.google.firebase.messaging.FirebaseMessaging;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class eo6 implements cu2, dt5, h32 {
    public final /* synthetic */ go6 a;

    public /* synthetic */ eo6(go6 go6Var) {
        this.a = go6Var;
    }

    @Override // defpackage.h32
    public void j(Serializable serializable) {
        ((ErrorDTO) serializable).getTranslatedMessage();
        this.a.c.i(lu7.j0, "");
    }

    @Override // defpackage.dt5
    public void onFailure(Exception exc) {
        Handler handler;
        go6 go6Var = this.a;
        sb7.p("Firebase", "Get token task failed!", "result exception: " + exc);
        int i = go6.h;
        if (i >= 3) {
            sb7.p("Firebase", "Trying to get token failed", "retry count: " + go6.h);
            return;
        }
        go6.h = i + 1;
        sb7.p("Firebase", "Token is empty, retrying getting token", "retry count: " + go6.h);
        fo6 fo6Var = new fo6(go6Var, 0);
        long j = (long) (go6.h * 8000);
        synchronized (zk8.class) {
            handler = zk8.a;
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
                zk8.a = handler;
            }
        }
        lw.f(null, null, handler.postDelayed(fo6Var, j));
    }

    @Override // defpackage.cu2
    public void s(Context context, String str) {
        FirebaseMessaging firebaseMessaging;
        bf8 tokenTask;
        go6 go6Var = this.a;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("handsetId", wq2.y(context));
            jSONObject.put("client_version", String.valueOf(1028));
            jSONObject.put("account_id", go6Var.b.a());
            jSONObject.put("segment", Math.abs(go6Var.b.a().hashCode() % 10) + 10);
            if (!(str == null ? false : str.equals(""))) {
                jSONObject.put("google_ad_id", str);
            }
        } catch (JSONException e) {
            lw.g(e, "RegisterFCMToken json parse error", null);
        }
        u4 u4Var = new u4(go6Var, jSONObject, str, context);
        eo6 eo6Var = new eo6(go6Var);
        try {
            t15 t15Var = FirebaseMessaging.l;
            synchronized (FirebaseMessaging.class) {
                firebaseMessaging = FirebaseMessaging.getInstance(xc2.c());
            }
            FirebaseInstanceIdInternal firebaseInstanceIdInternal = firebaseMessaging.b;
            if (firebaseInstanceIdInternal != null) {
                tokenTask = firebaseInstanceIdInternal.getTokenTask();
            } else {
                cf8 cf8Var = new cf8();
                firebaseMessaging.g.execute(new g7(firebaseMessaging, cf8Var, 22));
                tokenTask = cf8Var.a;
            }
            ox9 ox9Var = (ox9) tokenTask;
            ox9Var.getClass();
            ox9Var.b(df8.a, u4Var);
            ox9Var.i(eo6Var);
            sb7.p("Firebase", "getInstanceId() Successfully completed", "retry count: " + go6.g);
            go6.g = 0;
        } catch (Exception unused) {
            sb7.p("Firebase", "Firebase getApps() list", "count: " + xc2.b().size());
            int i = go6.g;
            if (i >= 3) {
                lw.g(null, "Firebase getInstanceId() failed after 3 retry", null);
                return;
            }
            go6.g = i + 1;
            sb7.p("Firebase", "Wait for initialize", "retry count: " + go6.g);
            fo6 fo6Var = new fo6(go6Var, 1);
            long j = (long) (go6.g * 5000);
            synchronized (zk8.class) {
                Handler handler = zk8.a;
                if (handler == null) {
                    handler = new Handler(Looper.getMainLooper());
                    zk8.a = handler;
                }
                lw.f(null, null, handler.postDelayed(fo6Var, j));
            }
        }
    }
}
