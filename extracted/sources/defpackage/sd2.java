package defpackage;

import android.os.Parcel;
import com.google.android.gms.internal.nearby.zzav;

/* JADX INFO: loaded from: classes.dex */
public final class sd2 implements yn9 {
    public long a;

    @Override // defpackage.yn9
    public void a(zm9 zm9Var, vo4 vo4Var) {
        long j = this.a;
        kp9 kp9Var = (kp9) zm9Var.getService();
        zzav zzavVar = new zzav();
        zzavVar.a = new wm9(vo4Var);
        zzavVar.b = j;
        Parcel parcelN0 = kp9Var.n0();
        int i = lm9.a;
        parcelN0.writeInt(1);
        zzavVar.writeToParcel(parcelN0, 0);
        kp9Var.o0(2012, parcelN0);
    }
}
