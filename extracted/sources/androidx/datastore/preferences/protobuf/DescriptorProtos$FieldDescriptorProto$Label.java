package androidx.datastore.preferences.protobuf;

import defpackage.mr3;

/* JADX INFO: loaded from: classes.dex */
public enum DescriptorProtos$FieldDescriptorProto$Label implements mr3 {
    /* JADX INFO: Fake field, exist only in values array */
    LABEL_OPTIONAL(1),
    /* JADX INFO: Fake field, exist only in values array */
    LABEL_REPEATED(3),
    /* JADX INFO: Fake field, exist only in values array */
    LABEL_REQUIRED(2);

    public final int a;

    DescriptorProtos$FieldDescriptorProto$Label(int i) {
        this.a = i;
    }

    @Override // defpackage.mr3
    public final int getNumber() {
        return this.a;
    }
}
