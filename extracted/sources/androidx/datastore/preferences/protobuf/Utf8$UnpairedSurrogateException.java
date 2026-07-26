package androidx.datastore.preferences.protobuf;

import defpackage.dw1;

/* JADX INFO: loaded from: classes.dex */
class Utf8$UnpairedSurrogateException extends IllegalArgumentException {
    public Utf8$UnpairedSurrogateException(int i, int i2) {
        super(dw1.j(i, i2, "Unpaired surrogate at index ", " of "));
    }
}
