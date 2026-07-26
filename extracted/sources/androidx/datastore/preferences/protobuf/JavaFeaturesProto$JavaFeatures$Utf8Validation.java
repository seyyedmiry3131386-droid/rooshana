package androidx.datastore.preferences.protobuf;

import defpackage.mr3;

/* JADX INFO: loaded from: classes.dex */
public enum JavaFeaturesProto$JavaFeatures$Utf8Validation implements mr3 {
    /* JADX INFO: Fake field, exist only in values array */
    UTF8_VALIDATION_UNKNOWN(0),
    /* JADX INFO: Fake field, exist only in values array */
    DEFAULT(1),
    /* JADX INFO: Fake field, exist only in values array */
    VERIFY(2);

    public final int a;

    JavaFeaturesProto$JavaFeatures$Utf8Validation(int i) {
        this.a = i;
    }

    @Override // defpackage.mr3
    public final int getNumber() {
        return this.a;
    }
}
