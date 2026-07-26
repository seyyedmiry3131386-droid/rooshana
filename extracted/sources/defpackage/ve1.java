package defpackage;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ve1 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ we1 b;

    public /* synthetic */ ve1(we1 we1Var, int i) {
        this.a = i;
        this.b = we1Var;
    }

    private final Object a() {
        String string;
        we1 we1Var = this.b;
        synchronized (we1Var) {
            try {
                ky2 ky2Var = (ky2) we1Var.a.get();
                ArrayList arrayListC = ky2Var.c();
                ky2Var.b();
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < arrayListC.size(); i++) {
                    n20 n20Var = (n20) arrayListC.get(i);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", n20Var.a);
                    jSONObject.put("dates", new JSONArray((Collection) n20Var.b));
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("heartbeats", jSONArray);
                jSONObject2.put("version", "2");
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                    try {
                        gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        string = byteArrayOutputStream.toString("UTF-8");
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return string;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                return a();
            default:
                we1 we1Var = this.b;
                synchronized (we1Var) {
                    ((ky2) we1Var.a.get()).k(System.currentTimeMillis(), ((ei1) we1Var.c.get()).a());
                    break;
                }
                return null;
        }
    }
}
