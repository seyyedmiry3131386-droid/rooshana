package com.microsoft.clarity.q;

import defpackage.f88;
import defpackage.js3;
import j$.util.Base64;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    public static final MessageDigest a = MessageDigest.getInstance("MD5");

    public static String a(byte[] bArr, boolean z) {
        js3.p(bArr, "bytes");
        String strEncodeToString = z ? Base64.getUrlEncoder().encodeToString(bArr) : Base64.getEncoder().encodeToString(bArr);
        js3.o(strEncodeToString, "if (urlSafe) {\n         …ToString(bytes)\n        }");
        return f88.J0(strEncodeToString).toString();
    }

    public static String a(MessageDigest messageDigest, byte[] bArr) {
        byte[] bArrDigest = messageDigest.digest(bArr != null ? messageDigest.digest(bArr) : messageDigest.digest());
        js3.o(bArrDigest, "bytes");
        return a(bArrDigest, true);
    }
}
