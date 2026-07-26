package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: loaded from: classes3.dex */
public final class mr7 {
    public ee a;
    public d04 b;
    public rf7 c;
    public pr7 d;

    public static void a(StringBuilder sb, boolean z, char c) {
        sb.append(c);
        if (z) {
            sb.append("1");
        } else {
            sb.append("0");
        }
    }

    public final void b(String str, String str2, String str3) {
        Handler handler;
        int i = c88.a;
        if (str2 == null) {
            str2 = "";
        }
        String lowerCase = str2.toLowerCase();
        if (str3 == null) {
            str3 = "";
        }
        String lowerCase2 = str3.toLowerCase();
        if (!lowerCase2.equals(lowerCase)) {
            this.a.b("settings_change", AppMeasurementSdk.ConditionalUserProperty.NAME, str.toLowerCase(), "old_value", lowerCase, "new_value", lowerCase2);
            this.a.b("settings_" + str.toLowerCase(), "old_value", lowerCase, "new_value", lowerCase2, "change_value", t61.j(lowerCase, " - ", lowerCase2));
        }
        fp7 fp7Var = new fp7(1, this);
        synchronized (zk8.class) {
            handler = zk8.a;
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
                zk8.a = handler;
            }
        }
        lw.f(null, null, handler.post(fp7Var));
    }

    public final void c() {
        StringBuilder sb = new StringBuilder();
        a(sb, this.b.b().equals("en"), 'l');
        sb.append('s');
        sb.append(this.c.b);
        a(sb, this.d.a.b(lu7.Y, false), 'i');
        a(sb, (this.d.a.f(lu7.z, "02:00").equals("02:00") && this.d.a.f(lu7.A, "07:00").equals("07:00")) ? false : true, 't');
        a(sb, this.d.d(), 'g');
        a(sb, false, 'f');
        sb.append('m');
        if (this.d.b().equals("on")) {
            sb.append("0");
        } else if (this.d.b().equals("off")) {
            sb.append("1");
        } else {
            sb.append("2");
        }
        this.a.c("settings_properties", sb.toString());
    }

    public void onEvent(l04 l04Var) {
        if (l04Var.a) {
            c();
        }
    }
}
