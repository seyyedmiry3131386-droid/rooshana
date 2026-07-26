package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import androidx.core.content.ContextCompat;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class fu2 {
    public final Context a;
    public final String b;
    public final ey c;
    public final qq4 d;
    public final ql e;
    public final cm f;
    public final Looper g;
    public final int h;
    public final yh9 i;
    public final fz1 j;
    public final ku2 k;

    public fu2(Context context, qq4 qq4Var, ql qlVar, eu2 eu2Var) {
        rq4.o(context, "Null context is not permitted.");
        rq4.o(qq4Var, "Api must not be null.");
        rq4.o(eu2Var, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        rq4.o(applicationContext, "The provided context did not have an application context.");
        this.a = applicationContext;
        int i = Build.VERSION.SDK_INT;
        String attributionTag = i >= 30 ? ContextCompat.getAttributionTag(context) : null;
        this.b = attributionTag;
        this.c = i >= 31 ? new ey(context.getAttributionSource()) : null;
        this.d = qq4Var;
        this.e = qlVar;
        this.g = eu2Var.b;
        this.f = new cm(qq4Var, qlVar, attributionTag);
        this.i = new yh9(this);
        ku2 ku2VarD = ku2.d(applicationContext);
        this.k = ku2VarD;
        this.h = ku2VarD.h.getAndIncrement();
        this.j = eu2Var.a;
        jx jxVar = ku2VarD.m;
        jxVar.sendMessage(jxVar.obtainMessage(7, this));
    }

    public final wv8 a() {
        wv8 wv8Var = new wv8(15, false);
        Set set = Collections.EMPTY_SET;
        if (((zv) wv8Var.b) == null) {
            wv8Var.b = new zv(0);
        }
        ((zv) wv8Var.b).addAll(set);
        Context context = this.a;
        wv8Var.d = context.getClass().getName();
        wv8Var.c = context.getPackageName();
        return wv8Var;
    }

    public final ox9 b(rn6 rn6Var) {
        rq4.o((o94) ((x41) ((cf0) rn6Var.b).d).b, "Listener has already been released.");
        bn6 bn6Var = (bn6) rn6Var.c;
        rq4.o((o94) bn6Var.b, "Listener has already been released.");
        cf0 cf0Var = (cf0) rn6Var.b;
        ku2 ku2Var = this.k;
        ku2Var.getClass();
        cf8 cf8Var = new cf8();
        ku2Var.b(cf8Var, cf0Var.b, this);
        fi9 fi9Var = new fi9(new oi9(new gi9(cf0Var, bn6Var), cf8Var), ku2Var.i.get(), this);
        jx jxVar = ku2Var.m;
        jxVar.sendMessage(jxVar.obtainMessage(8, fi9Var));
        return cf8Var.a;
    }

    public final ox9 c(o94 o94Var) {
        rq4.o(o94Var, "Listener key cannot be null.");
        ku2 ku2Var = this.k;
        ku2Var.getClass();
        cf8 cf8Var = new cf8();
        ku2Var.b(cf8Var, 0, this);
        fi9 fi9Var = new fi9(new oi9(o94Var, cf8Var), ku2Var.i.get(), this);
        jx jxVar = ku2Var.m;
        jxVar.sendMessage(jxVar.obtainMessage(13, fi9Var));
        return cf8Var.a;
    }

    public final x41 d(Object obj, String str) {
        rq4.o(obj, "Listener must not be null");
        Looper looper = this.g;
        rq4.o(looper, "Looper must not be null");
        return new x41(looper, obj, str);
    }

    public final void e(int i, i70 i70Var) {
        boolean z = true;
        if (!i70Var.L && !((Boolean) BasePendingResult.M.get()).booleanValue()) {
            z = false;
        }
        i70Var.L = z;
        ku2 ku2Var = this.k;
        ku2Var.getClass();
        fi9 fi9Var = new fi9(new li9(i, i70Var), ku2Var.i.get(), this);
        jx jxVar = ku2Var.m;
        jxVar.sendMessage(jxVar.obtainMessage(4, fi9Var));
    }

    public final ox9 f(int i, cf0 cf0Var) {
        cf8 cf8Var = new cf8();
        ku2 ku2Var = this.k;
        ku2Var.getClass();
        ku2Var.b(cf8Var, cf0Var.b, this);
        fi9 fi9Var = new fi9(new qi9(i, cf0Var, cf8Var, this.j), ku2Var.i.get(), this);
        jx jxVar = ku2Var.m;
        jxVar.sendMessage(jxVar.obtainMessage(4, fi9Var));
        return cf8Var.a;
    }
}
