package defpackage;

import android.database.sqlite.SQLiteProgram;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: loaded from: classes.dex */
public class ro2 implements ec8 {
    public final SQLiteProgram a;

    public ro2(SQLiteProgram sQLiteProgram) {
        js3.p(sQLiteProgram, "delegate");
        this.a = sQLiteProgram;
    }

    @Override // defpackage.ec8
    public final void K0(int i) {
        this.a.bindNull(i);
    }

    @Override // defpackage.ec8
    public final void N(int i, double d) {
        this.a.bindDouble(i, d);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.ec8
    public final void i0(int i, byte[] bArr) {
        this.a.bindBlob(i, bArr);
    }

    @Override // defpackage.ec8
    public final void l(int i, long j) {
        this.a.bindLong(i, j);
    }

    @Override // defpackage.ec8
    public final void o() {
        this.a.clearBindings();
    }

    @Override // defpackage.ec8
    public final void x(int i, String str) {
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.a.bindString(i, str);
    }
}
