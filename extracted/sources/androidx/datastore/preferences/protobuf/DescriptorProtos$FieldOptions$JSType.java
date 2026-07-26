package androidx.datastore.preferences.protobuf;

import defpackage.mr3;

/* JADX INFO: loaded from: classes.dex */
public enum DescriptorProtos$FieldOptions$JSType implements mr3 {
    /* JADX INFO: Fake field, exist only in values array */
    JS_NORMAL(0),
    /* JADX INFO: Fake field, exist only in values array */
    JS_STRING(1),
    /* JADX INFO: Fake field, exist only in values array */
    JS_NUMBER(2);

    public final int a;

    DescriptorProtos$FieldOptions$JSType(int i) {
        this.a = i;
    }

    @Override // defpackage.mr3
    public final int getNumber() {
        return this.a;
    }
}
