package defpackage;

import android.database.Cursor;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class gc8 extends hc8 {
    public int[] d;
    public long[] e;
    public double[] f;
    public String[] g;
    public byte[][] h;
    public Cursor i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gc8(cc8 cc8Var, String str) {
        super(cc8Var, str);
        js3.p(cc8Var, "db");
        js3.p(str, "sql");
        this.d = new int[0];
        this.e = new long[0];
        this.f = new double[0];
        this.g = new String[0];
        this.h = new byte[0][];
    }

    public static void k(Cursor cursor, int i) {
        if (i < 0 || i >= cursor.getColumnCount()) {
            ln2.i(25, "column index out of range");
            throw null;
        }
    }

    @Override // defpackage.rb7
    public final String B0(int i) {
        b();
        Cursor cursor = this.i;
        if (cursor == null) {
            ln2.i(21, "no row");
            throw null;
        }
        k(cursor, i);
        String string = cursor.getString(i);
        js3.o(string, "getString(...)");
        return string;
    }

    @Override // defpackage.rb7
    public final void W(int i, String str) {
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        b();
        d(3, i);
        this.d[i] = 3;
        this.g[i] = str;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (!this.c) {
            o();
            reset();
        }
        this.c = true;
    }

    public final void d(int i, int i2) {
        int i3 = i2 + 1;
        int[] iArr = this.d;
        if (iArr.length < i3) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i3);
            js3.o(iArrCopyOf, "copyOf(...)");
            this.d = iArrCopyOf;
        }
        if (i == 1) {
            long[] jArr = this.e;
            if (jArr.length < i3) {
                long[] jArrCopyOf = Arrays.copyOf(jArr, i3);
                js3.o(jArrCopyOf, "copyOf(...)");
                this.e = jArrCopyOf;
                return;
            }
            return;
        }
        if (i == 2) {
            double[] dArr = this.f;
            if (dArr.length < i3) {
                double[] dArrCopyOf = Arrays.copyOf(dArr, i3);
                js3.o(dArrCopyOf, "copyOf(...)");
                this.f = dArrCopyOf;
                return;
            }
            return;
        }
        if (i == 3) {
            String[] strArr = this.g;
            if (strArr.length < i3) {
                Object[] objArrCopyOf = Arrays.copyOf(strArr, i3);
                js3.o(objArrCopyOf, "copyOf(...)");
                this.g = (String[]) objArrCopyOf;
                return;
            }
            return;
        }
        if (i != 4) {
            return;
        }
        byte[][] bArr = this.h;
        if (bArr.length < i3) {
            Object[] objArrCopyOf2 = Arrays.copyOf(bArr, i3);
            js3.o(objArrCopyOf2, "copyOf(...)");
            this.h = (byte[][]) objArrCopyOf2;
        }
    }

    @Override // defpackage.rb7
    public final boolean f1() {
        b();
        g();
        Cursor cursor = this.i;
        if (cursor != null) {
            return cursor.moveToNext();
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void g() {
        if (this.i == null) {
            this.i = this.a.G0(new ut4(14, this));
        }
    }

    @Override // defpackage.rb7
    public final int getColumnCount() {
        b();
        g();
        Cursor cursor = this.i;
        if (cursor != null) {
            return cursor.getColumnCount();
        }
        return 0;
    }

    @Override // defpackage.rb7
    public final String getColumnName(int i) {
        b();
        g();
        Cursor cursor = this.i;
        if (cursor == null) {
            throw new IllegalStateException("Required value was null.");
        }
        k(cursor, i);
        String columnName = cursor.getColumnName(i);
        js3.o(columnName, "getColumnName(...)");
        return columnName;
    }

    @Override // defpackage.rb7
    public final long getLong(int i) {
        b();
        Cursor cursor = this.i;
        if (cursor != null) {
            k(cursor, i);
            return cursor.getLong(i);
        }
        ln2.i(21, "no row");
        throw null;
    }

    @Override // defpackage.rb7
    public final boolean isNull(int i) {
        b();
        Cursor cursor = this.i;
        if (cursor != null) {
            k(cursor, i);
            return cursor.isNull(i);
        }
        ln2.i(21, "no row");
        throw null;
    }

    @Override // defpackage.rb7
    public final void l(int i, long j) {
        b();
        d(1, i);
        this.d[i] = 1;
        this.e[i] = j;
    }

    @Override // defpackage.hc8, defpackage.rb7
    public final void o() {
        b();
        this.d = new int[0];
        this.e = new long[0];
        this.f = new double[0];
        this.g = new String[0];
        this.h = new byte[0][];
    }

    @Override // defpackage.hc8, defpackage.rb7
    public final void reset() {
        b();
        Cursor cursor = this.i;
        if (cursor != null) {
            cursor.close();
        }
        this.i = null;
    }
}
