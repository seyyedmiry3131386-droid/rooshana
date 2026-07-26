package defpackage;

import android.os.Parcel;
import com.google.android.gms.internal.nearby.zzhp;

/* JADX INFO: loaded from: classes.dex */
public final class dx2 implements yn9 {
    public static final dx2 c;
    public static final dx2 d;
    public final /* synthetic */ int a;
    public final String b;

    static {
        int i = 0;
        c = new dx2("FOLD", i);
        d = new dx2("HINGE", i);
    }

    public /* synthetic */ dx2(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.yn9
    public void a(zm9 zm9Var, vo4 vo4Var) {
        kp9 kp9Var = (kp9) zm9Var.getService();
        zzhp zzhpVar = new zzhp();
        zzhpVar.a = new wm9(vo4Var);
        zzhpVar.b = this.b;
        Parcel parcelN0 = kp9Var.n0();
        int i = lm9.a;
        parcelN0.writeInt(1);
        zzhpVar.writeToParcel(parcelN0, 0);
        kp9Var.o0(2007, parcelN0);
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return this.b;
            default:
                return super.toString();
        }
    }
}
