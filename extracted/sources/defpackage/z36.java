package defpackage;

import com.google.android.gms.internal.nearby.zzpt;
import com.j256.ormlite.stmt.query.SimpleComparison;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes.dex */
public final class z36 {
    public static final zzpt i;
    public static final zzpt j;
    public final long a;
    public final int b;
    public final byte[] c;
    public final lz1 d;
    public final hh2 e;
    public long f;
    public String g;
    public String h;

    static {
        wu9 wu9Var = zzpt.b;
        Object[] objArr = {"/", "\\", "../"};
        za7.A(3, objArr);
        i = zzpt.m(3, objArr);
        zzpt.n("../", "/", "\\", "?", Marker.ANY_MARKER, "\"", SimpleComparison.LESS_THAN_OPERATION, SimpleComparison.GREATER_THAN_OPERATION, "|", ":", "\u0000", "\n", "\r", "\t", "\f");
        Object[] objArr2 = {"..", ".", "\\", "/"};
        za7.A(4, objArr2);
        zzpt.m(4, objArr2);
        Object[] objArr3 = {"\\"};
        za7.A(1, objArr3);
        zzpt.m(1, objArr3);
        Object[] objArr4 = {"../", "..\\"};
        za7.A(2, objArr4);
        j = zzpt.m(2, objArr4);
        zzpt.n("?", Marker.ANY_MARKER, "\"", "|", ":", "\u0000", "\n", "\r", "\t", "\f", "../", "..", new String[0]);
        Object[] objArr5 = {"\\"};
        za7.A(1, objArr5);
        zzpt.m(1, objArr5);
        Object[] objArr6 = {"\\", "/"};
        za7.A(2, objArr6);
        zzpt.m(2, objArr6);
    }

    public z36(long j2, int i2, byte[] bArr, lz1 lz1Var, hh2 hh2Var) {
        this.a = j2;
        this.b = i2;
        this.c = bArr;
        this.d = lz1Var;
        this.e = hh2Var;
    }

    public static z36 c(lz1 lz1Var, long j2) {
        z36 z36Var = new z36(j2, 2, null, lz1Var, null);
        long j3 = lz1Var.a;
        if (j3 <= 0) {
            return z36Var;
        }
        if (j3 < 0) {
            throw new IllegalArgumentException("Payload size must be positive.");
        }
        if (j3 < 0) {
            throw new IllegalArgumentException("Payload stream size must be larger than the offset.");
        }
        z36Var.f = j3;
        return z36Var;
    }

    public final void a(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Payload file name should not be null or empty.");
        }
        if (this.b != 2) {
            throw new IllegalArgumentException("Payload type must be FILE.");
        }
        zzpt zzptVar = i;
        int size = zzptVar.size();
        int i2 = 0;
        while (i2 < size) {
            String str2 = (String) zzptVar.get(i2);
            i2++;
            if (str.contains(str2)) {
                throw new IllegalArgumentException(bl4.w("File name ", str, " contains illegal string ", str2, "."));
            }
        }
        this.g = str;
    }

    public final void b(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Payload parent folder should not be null or empty.");
        }
        if (this.b != 2) {
            throw new IllegalArgumentException("Payload type must be FILE.");
        }
        zzpt zzptVar = j;
        int size = zzptVar.size();
        int i2 = 0;
        while (i2 < size) {
            boolean zContains = str.contains((String) zzptVar.get(i2));
            i2++;
            if (zContains) {
                throw new IllegalArgumentException("Folder name contains illegal string.");
            }
        }
        this.h = str;
    }
}
