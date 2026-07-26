package defpackage;

import android.os.Build;

/* JADX INFO: loaded from: classes4.dex */
public abstract class l96 {
    public static final vg a;
    public static final sl3 b;
    public static final gv c;

    static {
        String property = System.getProperty("java.vm.name");
        property.getClass();
        if (property.equals("RoboVM")) {
            a = null;
            b = new sl3(19);
            c = new gv(3);
        } else {
            if (!property.equals("Dalvik")) {
                a = null;
                b = new f27(19);
                c = new vh0(3);
                return;
            }
            a = new vg();
            if (Build.VERSION.SDK_INT >= 24) {
                b = new e27(19);
                c = new vh0(3);
            } else {
                b = new sl3(19);
                c = new gv(3);
            }
        }
    }
}
