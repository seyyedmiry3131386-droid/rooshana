package com.microsoft.clarity.models.display.paths;

import com.google.protobuf.o;
import com.microsoft.clarity.models.IProtoModel;
import com.microsoft.clarity.protomodels.mutationpayload.A0;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$Path;
import defpackage.dw1;
import defpackage.js3;
import defpackage.wu0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes3.dex */
public final class Path implements IProtoModel<MutationPayload$Path> {
    private final int fillType;
    private final List<PathVerb> verbs;

    /* JADX WARN: Multi-variable type inference failed */
    public Path(int i, List<? extends PathVerb> list) {
        js3.p(list, "verbs");
        this.fillType = i;
        this.verbs = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Path copy$default(Path path, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = path.fillType;
        }
        if ((i2 & 2) != 0) {
            list = path.verbs;
        }
        return path.copy(i, list);
    }

    public final int component1() {
        return this.fillType;
    }

    public final List<PathVerb> component2() {
        return this.verbs;
    }

    public final Path copy(int i, List<? extends PathVerb> list) {
        js3.p(list, "verbs");
        return new Path(i, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Path)) {
            return false;
        }
        Path path = (Path) obj;
        return this.fillType == path.fillType && js3.i(this.verbs, path.verbs);
    }

    public final int getFillType() {
        return this.fillType;
    }

    public final List<PathVerb> getVerbs() {
        return this.verbs;
    }

    public int hashCode() {
        return this.verbs.hashCode() + (this.fillType * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Path(fillType=");
        sb.append(this.fillType);
        sb.append(", verbs=");
        return dw1.t(sb, this.verbs, ')');
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.microsoft.clarity.models.IProtoModel
    public MutationPayload$Path toProtobufInstance() {
        A0 a0A = MutationPayload$Path.newBuilder().a(this.fillType);
        List<PathVerb> list = this.verbs;
        ArrayList arrayList = new ArrayList(wu0.V(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((PathVerb) it.next()).toProtobufInstance());
        }
        o oVarBuild = a0A.a(a.P0(arrayList)).build();
        js3.o(oVarBuild, "newBuilder()\n           …t())\n            .build()");
        return (MutationPayload$Path) oVarBuild;
    }
}
