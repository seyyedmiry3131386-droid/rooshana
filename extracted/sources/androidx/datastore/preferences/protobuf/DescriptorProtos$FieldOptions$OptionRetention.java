package androidx.datastore.preferences.protobuf;

import defpackage.mr3;

/* JADX INFO: loaded from: classes.dex */
public enum DescriptorProtos$FieldOptions$OptionRetention implements mr3 {
    /* JADX INFO: Fake field, exist only in values array */
    RETENTION_UNKNOWN(0),
    /* JADX INFO: Fake field, exist only in values array */
    RETENTION_RUNTIME(1),
    /* JADX INFO: Fake field, exist only in values array */
    RETENTION_SOURCE(2);

    public final int a;

    DescriptorProtos$FieldOptions$OptionRetention(int i) {
        this.a = i;
    }

    @Override // defpackage.mr3
    public final int getNumber() {
        return this.a;
    }
}
