package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class rx3 {
    public int a = -1;
    public int b = -1;
    public String c = null;
    public HashMap d;

    public static float g(Number number) {
        return number instanceof Float ? ((Float) number).floatValue() : Float.parseFloat(number.toString());
    }

    public abstract void a(HashMap map);

    public abstract rx3 b();

    public rx3 c(rx3 rx3Var) {
        this.a = rx3Var.a;
        this.b = rx3Var.b;
        this.c = rx3Var.c;
        this.d = rx3Var.d;
        return this;
    }

    public abstract void d(HashSet hashSet);

    public abstract void e(Context context, AttributeSet attributeSet);

    public void f(HashMap map) {
    }
}
