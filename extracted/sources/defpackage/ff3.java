package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes.dex */
public abstract class ff3 extends Binder implements gf3 {
    public static gf3 L(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(gf3.b);
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof gf3)) {
            return (gf3) iInterfaceQueryLocalInterface;
        }
        ef3 ef3Var = new ef3();
        ef3Var.n = iBinder;
        return ef3Var;
    }
}
