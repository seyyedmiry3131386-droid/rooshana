package androidx.datastore.preferences.protobuf;

import defpackage.mr3;

/* JADX INFO: loaded from: classes.dex */
public enum DescriptorProtos$FieldOptions$CType implements mr3 {
    /* JADX INFO: Fake field, exist only in values array */
    STRING(0),
    /* JADX INFO: Fake field, exist only in values array */
    CORD(1),
    /* JADX INFO: Fake field, exist only in values array */
    STRING_PIECE(2);

    public final int a;

    DescriptorProtos$FieldOptions$CType(int i) {
        this.a = i;
    }

    @Override // defpackage.mr3
    public final int getNumber() {
        return this.a;
    }
}
