package androidx.datastore.preferences.protobuf;

import defpackage.mr3;

/* JADX INFO: loaded from: classes.dex */
public enum DescriptorProtos$FieldOptions$OptionTargetType implements mr3 {
    /* JADX INFO: Fake field, exist only in values array */
    TARGET_TYPE_UNKNOWN(0),
    /* JADX INFO: Fake field, exist only in values array */
    TARGET_TYPE_FILE(1),
    /* JADX INFO: Fake field, exist only in values array */
    TARGET_TYPE_EXTENSION_RANGE(2),
    /* JADX INFO: Fake field, exist only in values array */
    TARGET_TYPE_MESSAGE(3),
    /* JADX INFO: Fake field, exist only in values array */
    TARGET_TYPE_FIELD(4),
    /* JADX INFO: Fake field, exist only in values array */
    TARGET_TYPE_ONEOF(5),
    /* JADX INFO: Fake field, exist only in values array */
    TARGET_TYPE_ENUM(6),
    /* JADX INFO: Fake field, exist only in values array */
    TARGET_TYPE_ENUM_ENTRY(7),
    /* JADX INFO: Fake field, exist only in values array */
    TARGET_TYPE_SERVICE(8),
    /* JADX INFO: Fake field, exist only in values array */
    TARGET_TYPE_METHOD(9);

    public final int a;

    DescriptorProtos$FieldOptions$OptionTargetType(int i) {
        this.a = i;
    }

    @Override // defpackage.mr3
    public final int getNumber() {
        return this.a;
    }
}
