package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ye1 implements r03 {
    public final /* synthetic */ af1 a;

    public ye1(af1 af1Var) {
        this.a = af1Var;
    }

    @Override // defpackage.r03
    public final void b() {
        this.a.e.remove(this);
    }

    @Override // defpackage.r03
    public final boolean c(Uri uri, dc0 dc0Var, boolean z) {
        ze1 ze1Var;
        int i;
        af1 af1Var = this.a;
        HashMap map = af1Var.d;
        if (af1Var.l == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            n03 n03Var = af1Var.j;
            String str = j29.a;
            List list = n03Var.e;
            int i2 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                ze1 ze1Var2 = (ze1) map.get(((m03) list.get(i3)).a);
                if (ze1Var2 != null && jElapsedRealtime < ze1Var2.h) {
                    i2++;
                }
            }
            int size = af1Var.j.e.size();
            af1Var.c.getClass();
            IOException iOException = (IOException) dc0Var.c;
            ca4 ca4Var = ((iOException instanceof HttpDataSource$InvalidResponseCodeException) && ((i = ((HttpDataSource$InvalidResponseCodeException) iOException).e) == 403 || i == 404 || i == 410 || i == 416 || i == 500 || i == 503) && size - i2 > 1) ? new ca4(2, 60000L) : null;
            if (ca4Var != null && ca4Var.a == 2 && (ze1Var = (ze1) map.get(uri)) != null) {
                ze1.a(ze1Var, ca4Var.b);
            }
        }
        return false;
    }
}
