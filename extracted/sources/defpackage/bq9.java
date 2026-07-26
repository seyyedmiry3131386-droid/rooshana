package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes.dex */
public final class bq9 implements IInterface {
    public final IBinder n;

    public bq9(IBinder iBinder) {
        this.n = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.n;
    }
}
