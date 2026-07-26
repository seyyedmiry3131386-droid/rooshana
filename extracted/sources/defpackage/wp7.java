package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.common.collect.ImmutableList;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class wp7 {
    public static final ImmutableList d = ImmutableList.s(40010);
    public static final ImmutableList e;
    public static final String f;
    public static final String g;
    public static final String h;
    public final int a;
    public final String b;
    public final Bundle c;

    static {
        Object[] objArr = {50000, 50001, 50002, 50003, 50004, 50005, 50006};
        tv8.f(7, objArr);
        e = ImmutableList.l(7, objArr);
        String str = j29.a;
        f = Integer.toString(0, 36);
        g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
    }

    public wp7(int i) {
        vy2.i("commandCode shouldn't be COMMAND_CODE_CUSTOM", i != 0);
        this.a = i;
        this.b = "";
        this.c = Bundle.EMPTY;
    }

    public static wp7 a(Bundle bundle) {
        int i = bundle.getInt(f, 0);
        if (i != 0) {
            return new wp7(i);
        }
        String string = bundle.getString(g);
        string.getClass();
        Bundle bundle2 = bundle.getBundle(h);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new wp7(bundle2, string);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt(f, this.a);
        bundle.putString(g, this.b);
        bundle.putBundle(h, this.c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wp7)) {
            return false;
        }
        wp7 wp7Var = (wp7) obj;
        return this.a == wp7Var.a && TextUtils.equals(this.b, wp7Var.b);
    }

    public final int hashCode() {
        return Objects.hash(this.b, Integer.valueOf(this.a));
    }

    public wp7(Bundle bundle, String str) {
        this.a = 0;
        str.getClass();
        this.b = str;
        bundle.getClass();
        this.c = new Bundle(bundle);
    }
}
