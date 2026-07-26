package androidx.datastore.preferences.protobuf;

import defpackage.mr3;

/* JADX INFO: loaded from: classes.dex */
public enum DescriptorProtos$FeatureSet$RepeatedFieldEncoding implements mr3 {
    /* JADX INFO: Fake field, exist only in values array */
    REPEATED_FIELD_ENCODING_UNKNOWN(0),
    /* JADX INFO: Fake field, exist only in values array */
    PACKED(1),
    /* JADX INFO: Fake field, exist only in values array */
    EXPANDED(2);

    public final int a;

    DescriptorProtos$FeatureSet$RepeatedFieldEncoding(int i) {
        this.a = i;
    }

    @Override // defpackage.mr3
    public final int getNumber() {
        return this.a;
    }
}
