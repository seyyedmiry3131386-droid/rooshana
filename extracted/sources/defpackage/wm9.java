package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public final class wm9 extends ei9 implements pp9 {
    public final vo4 o;

    public wm9(vo4 vo4Var) {
        super("com.google.android.gms.nearby.internal.connection.IResultListener", 3);
        this.o = vo4Var;
    }

    @Override // defpackage.ei9
    public final boolean n0(int i, Parcel parcel) {
        if (i != 2) {
            return false;
        }
        int i2 = parcel.readInt();
        lm9.b(parcel);
        Status statusB = zm9.b(i2);
        boolean zU = statusB.u();
        vo4 vo4Var = this.o;
        if (zU) {
            vo4Var.r(statusB);
            return true;
        }
        vo4Var.p(statusB);
        return true;
    }
}
