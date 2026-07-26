package com.google.protobuf;

/* JADX INFO: loaded from: classes3.dex */
public final class x extends v {
    @Override // com.google.protobuf.v
    public final w a(Object obj) {
        o oVar = (o) obj;
        w wVar = oVar.unknownFields;
        if (wVar != w.f) {
            return wVar;
        }
        w wVar2 = new w();
        oVar.unknownFields = wVar2;
        return wVar2;
    }

    @Override // com.google.protobuf.v
    public final void c(Object obj, Object obj2) {
        ((o) obj).unknownFields = (w) obj2;
    }
}
