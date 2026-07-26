package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.internal.zaaa;

/* JADX INFO: loaded from: classes.dex */
public final class xi9 extends ph9 {
    public final kg3 p0(dr5 dr5Var, zaaa zaaaVar) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.p);
        int i = di9.a;
        parcelObtain.writeStrongBinder(dr5Var);
        di9.b(parcelObtain, zaaaVar);
        parcelObtain = Parcel.obtain();
        try {
            this.o.transact(2, parcelObtain, parcelObtain, 0);
            parcelObtain.readException();
            parcelObtain.recycle();
            return dr5.p0(parcelObtain.readStrongBinder());
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcelObtain.recycle();
        }
    }
}
