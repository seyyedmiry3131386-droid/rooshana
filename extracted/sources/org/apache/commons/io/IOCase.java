package org.apache.commons.io;

import defpackage.bc2;
import defpackage.dw1;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class IOCase implements Serializable {
    public static final IOCase c = new IOCase("Sensitive", true);
    public static final IOCase d = new IOCase("Insensitive", false);
    public static final IOCase e;
    private static final long serialVersionUID = -6343169151696340687L;
    public final String a;
    public final transient boolean b;

    static {
        e = new IOCase("System", !(bc2.a == '\\'));
    }

    public IOCase(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    private Object readResolve() {
        String str = this.a;
        if ("Sensitive".equals(str)) {
            return c;
        }
        if ("Insensitive".equals(str)) {
            return d;
        }
        IOCase iOCase = e;
        if (iOCase.a.equals(str)) {
            return iOCase;
        }
        throw new IllegalArgumentException(dw1.n("Invalid IOCase name: ", str));
    }

    public final int a(String str, String str2) {
        if (str == null || str2 == null) {
            throw new NullPointerException("The strings must not be null");
        }
        return this.b ? str.compareTo(str2) : str.compareToIgnoreCase(str2);
    }

    public final String toString() {
        return this.a;
    }
}
