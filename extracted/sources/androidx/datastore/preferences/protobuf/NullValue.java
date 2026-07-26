package androidx.datastore.preferences.protobuf;

import defpackage.mr3;

/* JADX INFO: loaded from: classes.dex */
public enum NullValue implements mr3 {
    /* JADX INFO: Fake field, exist only in values array */
    NULL_VALUE(0),
    UNRECOGNIZED(-1);

    public final int a;

    NullValue(int i) {
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
