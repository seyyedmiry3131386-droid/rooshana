package defpackage;

import android.os.Bundle;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ee {
    public final List a;

    static {
        rk1.a("AnalyticsService");
    }

    public ee(List list) {
        this.a = list;
        c("Access", "Ordinary");
    }

    public final void a(Bundle bundle, String str) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((fe) it.next()).d(bundle, str);
        }
    }

    public final void b(String str, String... strArr) {
        lw.f(null, null, strArr.length % 2 == 0);
        Bundle bundle = new Bundle(strArr.length / 2);
        sq3 sq3VarY = ok4.Y(2, ok4.Z(0, strArr.length - 1));
        int i = sq3VarY.a;
        int i2 = sq3VarY.b;
        int i3 = sq3VarY.c;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (true) {
                bundle.putString(strArr[i], strArr[i + 1]);
                if (i == i2) {
                    break;
                } else {
                    i += i3;
                }
            }
        }
        a(bundle, str);
    }

    public final void c(String str, String str2) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((fe) it.next()).b(str, str2);
        }
    }
}
