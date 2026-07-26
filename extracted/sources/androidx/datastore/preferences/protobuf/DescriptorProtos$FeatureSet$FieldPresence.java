package androidx.datastore.preferences.protobuf;

import defpackage.mr3;

/* JADX INFO: loaded from: classes.dex */
public enum DescriptorProtos$FeatureSet$FieldPresence implements mr3 {
    /* JADX INFO: Fake field, exist only in values array */
    FIELD_PRESENCE_UNKNOWN(0),
    /* JADX INFO: Fake field, exist only in values array */
    EXPLICIT(1),
    /* JADX INFO: Fake field, exist only in values array */
    IMPLICIT(2),
    /* JADX INFO: Fake field, exist only in values array */
    LEGACY_REQUIRED(3);

    public final int a;

    DescriptorProtos$FeatureSet$FieldPresence(int i) {
        this.a = i;
    }

    @Override // defpackage.mr3
    public final int getNumber() {
        return this.a;
    }
}
