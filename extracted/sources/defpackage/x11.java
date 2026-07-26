package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import okhttp3.TlsVersion;

/* JADX INFO: loaded from: classes3.dex */
public final class x11 {
    public boolean a = true;
    public boolean b;
    public Object c;
    public Object d;

    public y11 a() {
        return new y11(this.a, this.b, (String[]) this.c, (String[]) this.d);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.di5 b() {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x11.b():di5");
    }

    public void c(gr0... gr0VarArr) {
        js3.p(gr0VarArr, "cipherSuites");
        if (!this.a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(gr0VarArr.length);
        for (gr0 gr0Var : gr0VarArr) {
            arrayList.add(gr0Var.a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        d((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public void d(String... strArr) {
        js3.p(strArr, "cipherSuites");
        if (!this.a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        js3.o(objArrCopyOf, "copyOf(...)");
        this.c = (String[]) objArrCopyOf;
    }

    public void e(String... strArr) {
        js3.p(strArr, "tlsVersions");
        if (!this.a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        js3.o(objArrCopyOf, "copyOf(...)");
        this.d = (String[]) objArrCopyOf;
    }

    public void f(TlsVersion... tlsVersionArr) {
        if (!this.a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(tlsVersionArr.length);
        for (TlsVersion tlsVersion : tlsVersionArr) {
            arrayList.add(tlsVersion.a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        e((String[]) Arrays.copyOf(strArr, strArr.length));
    }
}
