package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.selection.f;
import io.sentry.SentryLevel;
import io.sentry.o2;
import ir.mservices.market.app.update.common.manager.b;
import ir.myket.network.server.c;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Properties;

/* JADX INFO: loaded from: classes.dex */
public final class wx7 implements h32, dq2, fl0 {
    public static volatile wx7 d;
    public boolean a;
    public Object b;
    public final Object c;

    public /* synthetic */ wx7(Object obj, Object obj2, boolean z) {
        this.b = obj;
        this.a = z;
        this.c = obj2;
    }

    public static wx7 a(Context context) {
        if (d == null) {
            synchronized (wx7.class) {
                try {
                    if (d == null) {
                        d = new wx7(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return d;
    }

    public Properties b() {
        o2 o2Var = (o2) this.c;
        String str = (String) this.b;
        try {
            File file = new File(str.trim());
            if (file.isFile() && file.canRead()) {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    Properties properties = new Properties();
                    properties.load(bufferedInputStream);
                    bufferedInputStream.close();
                    return properties;
                } finally {
                }
            }
            if (file.isFile()) {
                if (!file.canRead()) {
                    o2Var.i(SentryLevel.ERROR, "Failed to load Sentry configuration since it is not readable: %s", str);
                }
            } else if (this.a) {
                o2Var.i(SentryLevel.ERROR, "Failed to load Sentry configuration since it is not a file or does not exist: %s", str);
                return null;
            }
            return null;
        } catch (Throwable th) {
            o2Var.e(SentryLevel.ERROR, th, "Failed to load Sentry configuration from file: %s", str);
            return null;
        }
    }

    public void c() {
        if (this.a) {
            f.b((f) this.c, (zi8) this.b);
        }
    }

    public long d(zh8 zh8Var, long j, boolean z, y45 y45Var) {
        f fVar = (f) this.c;
        long jE = f.e(fVar, zh8Var, j, z, false, y45Var, false);
        if (!zi8.b(jE, (zi8) this.b)) {
            this.a = false;
        }
        fVar.t(zi8.d(jE) ? HandleState.c : HandleState.b);
        return jE;
    }

    @Override // defpackage.fl0
    public Type i() {
        Type typeI = ((fl0) this.b).i();
        js3.o(typeI, "responseType(...)");
        return typeI;
    }

    @Override // defpackage.h32
    public void j(Serializable serializable) {
        ((om0) this.c).resumeWith(new bk3(null, ((b) this.b).b.getResources().getString(this.a ? rs6.error_activating_app : rs6.error_deactivating_app), false));
    }

    @Override // defpackage.fl0
    public Object n(dl0 dl0Var) {
        fl0 fl0Var = (fl0) this.b;
        if (this.a) {
            dl0Var = new vd1(dl0Var, (c) this.c);
        }
        Object objN = fl0Var.n(dl0Var);
        js3.o(objN, "adapt(...)");
        return objN;
    }

    @Override // defpackage.dq2
    public void onSuccess(Object obj) {
        xq4 xq4Var = ((hr4) this.c).g;
        Handler handler = xq4Var.l;
        hq4 hq4Var = (hq4) this.b;
        j29.a0(handler, new lo4(xq4Var, hq4Var, new z52(this, (iq4) obj, this.a, hq4Var)));
    }

    public wx7(String str, String str2, boolean z) {
        js3.p(str2, "filePath");
        this.b = str;
        this.c = str2;
        this.a = z;
    }

    public wx7(String str, o2 o2Var, boolean z) {
        this.b = str;
        this.c = o2Var;
        this.a = z;
    }

    public wx7(Context context) {
        Object vx7Var;
        this.c = new HashSet();
        x41 x41Var = new x41(new gu(context, false));
        rx7 rx7Var = new rx7(this);
        if (Build.VERSION.SDK_INT >= 24) {
            vx7Var = new tx7(x41Var, rx7Var);
        } else {
            vx7Var = new vx7(context, x41Var, rx7Var);
        }
        this.b = vx7Var;
    }

    public wx7(f fVar) {
        this.c = fVar;
        this.a = true;
    }

    public wx7(hr4 hr4Var, hq4 hq4Var, boolean z) {
        this.c = hr4Var;
        this.b = hq4Var;
        this.a = z;
    }

    @Override // defpackage.dq2
    public void onFailure(Throwable th) {
    }
}
