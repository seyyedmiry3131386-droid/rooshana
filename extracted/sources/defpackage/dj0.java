package defpackage;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class dj0 implements j67 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ dj0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.j67
    public final g67 a(Object obj, int i, int i2, sv5 sv5Var) {
        switch (this.a) {
            case 0:
                yt1 yt1Var = (yt1) this.b;
                return yt1Var.a(new pa2((ByteBuffer) obj, yt1Var.d, yt1Var.c, 2), i, i2, sv5Var, yt1.k);
            case 1:
                yt1 yt1Var2 = (yt1) this.b;
                return yt1Var2.a(new pa2((ParcelFileDescriptor) obj, yt1Var2.d, yt1Var2.c), i, i2, sv5Var, yt1.k);
            default:
                return qc0.b((pc0) this.b, ((k48) obj).b());
        }
    }

    @Override // defpackage.j67
    public final boolean b(Object obj, sv5 sv5Var) {
        switch (this.a) {
            case 0:
                ((yt1) this.b).getClass();
                break;
            case 1:
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
                String str = Build.MANUFACTURER;
                if ((("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) && parcelFileDescriptor.getStatSize() > 536870912) || "robolectric".equals(Build.FINGERPRINT)) {
                }
                break;
            default:
                break;
        }
        return true;
    }
}
