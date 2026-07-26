package defpackage;

import androidx.datastore.preferences.protobuf.ProtoSyntax;
import androidx.datastore.preferences.protobuf.a;
import androidx.datastore.preferences.protobuf.f;

/* JADX INFO: loaded from: classes.dex */
public final class iv6 {
    public final a a;
    public final String b;
    public final Object[] c;
    public final int d;

    public iv6(f fVar, String str, Object[] objArr) {
        this.a = fVar;
        this.b = str;
        this.c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.d = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 < 55296) {
                this.d = i | (cCharAt2 << i2);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }

    public final ProtoSyntax a() {
        int i = this.d;
        return (i & 1) != 0 ? ProtoSyntax.a : (i & 4) == 4 ? ProtoSyntax.c : ProtoSyntax.b;
    }
}
