package androidx.datastore.preferences.protobuf;

import defpackage.mr3;

/* JADX INFO: loaded from: classes.dex */
public enum DescriptorProtos$FeatureSet$MessageEncoding implements mr3 {
    /* JADX INFO: Fake field, exist only in values array */
    MESSAGE_ENCODING_UNKNOWN(0),
    /* JADX INFO: Fake field, exist only in values array */
    LENGTH_PREFIXED(1),
    /* JADX INFO: Fake field, exist only in values array */
    DELIMITED(2);

    public final int a;

    DescriptorProtos$FeatureSet$MessageEncoding(int i) {
        this.a = i;
    }

    @Override // defpackage.mr3
    public final int getNumber() {
        return this.a;
    }
}
