package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {
    public abstract n a(Object obj);

    public final boolean b(int i, d dVar, Object obj) throws InvalidProtocolBufferException {
        int i2 = dVar.b;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            dVar.w(0);
            ((n) obj).d(i3 << 3, Long.valueOf(dVar.a.v()));
            return true;
        }
        if (i4 == 1) {
            dVar.w(1);
            ((n) obj).d((i3 << 3) | 1, Long.valueOf(dVar.a.s()));
            return true;
        }
        if (i4 == 2) {
            ((n) obj).d((i3 << 3) | 2, dVar.e());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                return false;
            }
            if (i4 != 5) {
                throw InvalidProtocolBufferException.e();
            }
            dVar.w(5);
            ((n) obj).d(5 | (i3 << 3), Integer.valueOf(dVar.a.r()));
            return true;
        }
        n nVarC = n.c();
        int i5 = i3 << 3;
        int i6 = i5 | 4;
        int i7 = i + 1;
        if (i7 >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (dVar.a() != Integer.MAX_VALUE && b(i7, dVar, nVarC)) {
        }
        if (i6 != dVar.b) {
            throw InvalidProtocolBufferException.a();
        }
        if (nVarC.e) {
            nVarC.e = false;
        }
        ((n) obj).d(i5 | 3, nVarC);
        return true;
    }
}
