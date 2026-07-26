package androidx.datastore.preferences.protobuf;

import defpackage.mr3;

/* JADX INFO: loaded from: classes.dex */
public enum Field$Kind implements mr3 {
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_SFIXED64(0),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_SINT32(1),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_FLOAT(2),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_INT64(3),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_UINT64(4),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_INT32(5),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_FIXED64(6),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_FIXED32(7),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_BOOL(8),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_SINT64(9),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_GROUP(10),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_MESSAGE(11),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_BYTES(12),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_UINT32(13),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_ENUM(14),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_SFIXED32(15),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_SFIXED64(16),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_SINT32(17),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_SINT64(18),
    UNRECOGNIZED(-1);

    public final int a;

    Field$Kind(int i) {
        this.a = i;
    }

    @Override // defpackage.mr3
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
