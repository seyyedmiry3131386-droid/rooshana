package androidx.datastore.preferences.protobuf;

import defpackage.mr3;

/* JADX INFO: loaded from: classes.dex */
public enum DescriptorProtos$FileOptions$OptimizeMode implements mr3 {
    /* JADX INFO: Fake field, exist only in values array */
    SPEED(1),
    /* JADX INFO: Fake field, exist only in values array */
    CODE_SIZE(2),
    /* JADX INFO: Fake field, exist only in values array */
    LITE_RUNTIME(3);

    public final int a;

    DescriptorProtos$FileOptions$OptimizeMode(int i) {
        this.a = i;
    }

    @Override // defpackage.mr3
    public final int getNumber() {
        return this.a;
    }
}
