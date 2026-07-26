package defpackage;

import com.google.android.gms.common.api.Status;
import io.sentry.android.core.t0;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public final class dj9 implements Runnable {
    public static final pg c = new pg("RevokeAccessOperation", new String[0]);
    public final String a;
    public final x58 b;

    public dj9(String str) {
        rq4.k(str);
        this.a = str;
        this.b = new x58(null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        pg pgVar = c;
        Status status = Status.g;
        try {
            String str = this.a;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 50);
            sb.append("https://accounts.google.com/o/oauth2/revoke?token=");
            sb.append(str);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(sb.toString()).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.e;
            } else {
                t0.d((String) pgVar.c, ((String) pgVar.d).concat("Unable to revoke access!"));
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(responseCode).length() + 15);
            sb2.append("Response Code: ");
            sb2.append(responseCode);
            String string = sb2.toString();
            if (pgVar.b <= 3) {
                ((String) pgVar.d).concat(string);
            }
        } catch (IOException e) {
            t0.d((String) pgVar.c, ((String) pgVar.d).concat("IOException when revoking access: ".concat(String.valueOf(e.toString()))));
        } catch (Exception e2) {
            t0.d((String) pgVar.c, ((String) pgVar.d).concat("Exception when revoking access: ".concat(String.valueOf(e2.toString()))));
        }
        this.b.s0(status);
    }
}
