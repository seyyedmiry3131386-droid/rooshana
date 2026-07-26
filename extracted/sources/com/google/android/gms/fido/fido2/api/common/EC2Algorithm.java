package com.google.android.gms.fido.fido2.api.common;

/* JADX INFO: loaded from: classes.dex */
public enum EC2Algorithm implements a {
    /* JADX INFO: Fake field, exist only in values array */
    ED256(-260),
    /* JADX INFO: Fake field, exist only in values array */
    ED512(-261),
    /* JADX INFO: Fake field, exist only in values array */
    ED25519(-8),
    /* JADX INFO: Fake field, exist only in values array */
    ES256(-7),
    /* JADX INFO: Fake field, exist only in values array */
    ES384(-35),
    /* JADX INFO: Fake field, exist only in values array */
    ES512(-36);

    public final int a;

    EC2Algorithm(int i) {
        this.a = i;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.a
    public final int a() {
        return this.a;
    }
}
