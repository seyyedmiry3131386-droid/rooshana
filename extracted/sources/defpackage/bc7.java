package defpackage;

import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class bc7 implements g82 {
    public final MessageDigest a;
    public final m58 b = new m58();

    public bc7(MessageDigest messageDigest) {
        this.a = messageDigest;
    }

    @Override // defpackage.g82
    public final m58 b() {
        return this.b;
    }
}
