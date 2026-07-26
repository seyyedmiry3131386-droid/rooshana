package androidx.datastore.preferences.protobuf;

import defpackage.mr3;

/* JADX INFO: loaded from: classes.dex */
public enum DescriptorProtos$FeatureSet$JsonFormat implements mr3 {
    /* JADX INFO: Fake field, exist only in values array */
    JSON_FORMAT_UNKNOWN(0),
    /* JADX INFO: Fake field, exist only in values array */
    ALLOW(1),
    /* JADX INFO: Fake field, exist only in values array */
    LEGACY_BEST_EFFORT(2);

    public final int a;

    DescriptorProtos$FeatureSet$JsonFormat(int i) {
        this.a = i;
    }

    @Override // defpackage.mr3
    public final int getNumber() {
        return this.a;
    }
}
