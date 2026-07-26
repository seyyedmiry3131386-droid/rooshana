package androidx.datastore.preferences.protobuf;

import defpackage.mr3;

/* JADX INFO: loaded from: classes.dex */
public enum DescriptorProtos$MethodOptions$IdempotencyLevel implements mr3 {
    /* JADX INFO: Fake field, exist only in values array */
    IDEMPOTENCY_UNKNOWN(0),
    /* JADX INFO: Fake field, exist only in values array */
    NO_SIDE_EFFECTS(1),
    /* JADX INFO: Fake field, exist only in values array */
    IDEMPOTENT(2);

    public final int a;

    DescriptorProtos$MethodOptions$IdempotencyLevel(int i) {
        this.a = i;
    }

    @Override // defpackage.mr3
    public final int getNumber() {
        return this.a;
    }
}
