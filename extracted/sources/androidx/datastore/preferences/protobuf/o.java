package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class o extends m {
    @Override // androidx.datastore.preferences.protobuf.m
    public final n a(Object obj) {
        f fVar = (f) obj;
        n nVar = fVar.unknownFields;
        if (nVar != n.f) {
            return nVar;
        }
        n nVarC = n.c();
        fVar.unknownFields = nVarC;
        return nVarC;
    }
}
