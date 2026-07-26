package androidx.datastore.preferences.protobuf;

import defpackage.mr3;

/* JADX INFO: loaded from: classes.dex */
public enum DescriptorProtos$Edition implements mr3 {
    /* JADX INFO: Fake field, exist only in values array */
    EDITION_UNKNOWN(0),
    /* JADX INFO: Fake field, exist only in values array */
    EDITION_LEGACY(900),
    /* JADX INFO: Fake field, exist only in values array */
    EDITION_PROTO2(998),
    /* JADX INFO: Fake field, exist only in values array */
    EDITION_PROTO3(999),
    /* JADX INFO: Fake field, exist only in values array */
    EDITION_2023(1000),
    /* JADX INFO: Fake field, exist only in values array */
    EDITION_2024(1001),
    /* JADX INFO: Fake field, exist only in values array */
    EDITION_1_TEST_ONLY(1),
    /* JADX INFO: Fake field, exist only in values array */
    EDITION_2_TEST_ONLY(2),
    /* JADX INFO: Fake field, exist only in values array */
    EDITION_99997_TEST_ONLY(99997),
    /* JADX INFO: Fake field, exist only in values array */
    EDITION_99998_TEST_ONLY(99998),
    /* JADX INFO: Fake field, exist only in values array */
    EDITION_99999_TEST_ONLY(99999),
    /* JADX INFO: Fake field, exist only in values array */
    EDITION_MAX(Integer.MAX_VALUE);

    public final int a;

    DescriptorProtos$Edition(int i) {
        this.a = i;
    }

    @Override // defpackage.mr3
    public final int getNumber() {
        return this.a;
    }
}
