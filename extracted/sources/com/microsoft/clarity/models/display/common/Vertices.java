package com.microsoft.clarity.models.display.common;

import com.google.protobuf.o;
import com.microsoft.clarity.models.IProtoModel;
import com.microsoft.clarity.protomodels.mutationpayload.C0149x;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$DoubleList;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$FloatList;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$Vertices;
import com.microsoft.clarity.protomodels.mutationpayload.u1;
import defpackage.dw1;
import defpackage.js3;
import defpackage.rm7;
import defpackage.wu0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes3.dex */
public final class Vertices implements IProtoModel<MutationPayload$Vertices> {
    private final List<List<Long>> boneIndices;
    private final List<List<Float>> boneWeights;
    private final List<Long> colors;
    private final List<Long> indices;
    private final boolean isVolatile;
    private final long mode;
    private final List<Point> positions;
    private final List<Point> texCoords;

    /* JADX WARN: Multi-variable type inference failed */
    public Vertices(long j, boolean z, List<Point> list, List<Point> list2, List<Long> list3, List<? extends List<Long>> list4, List<? extends List<Float>> list5, List<Long> list6) {
        js3.p(list, "positions");
        js3.p(list6, "indices");
        this.mode = j;
        this.isVolatile = z;
        this.positions = list;
        this.texCoords = list2;
        this.colors = list3;
        this.boneIndices = list4;
        this.boneWeights = list5;
        this.indices = list6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Vertices copy$default(Vertices vertices, long j, boolean z, List list, List list2, List list3, List list4, List list5, List list6, int i, Object obj) {
        if ((i & 1) != 0) {
            j = vertices.mode;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            z = vertices.isVolatile;
        }
        boolean z2 = z;
        if ((i & 4) != 0) {
            list = vertices.positions;
        }
        List list7 = list;
        if ((i & 8) != 0) {
            list2 = vertices.texCoords;
        }
        return vertices.copy(j2, z2, list7, list2, (i & 16) != 0 ? vertices.colors : list3, (i & 32) != 0 ? vertices.boneIndices : list4, (i & 64) != 0 ? vertices.boneWeights : list5, (i & 128) != 0 ? vertices.indices : list6);
    }

    public final long component1() {
        return this.mode;
    }

    public final boolean component2() {
        return this.isVolatile;
    }

    public final List<Point> component3() {
        return this.positions;
    }

    public final List<Point> component4() {
        return this.texCoords;
    }

    public final List<Long> component5() {
        return this.colors;
    }

    public final List<List<Long>> component6() {
        return this.boneIndices;
    }

    public final List<List<Float>> component7() {
        return this.boneWeights;
    }

    public final List<Long> component8() {
        return this.indices;
    }

    public final Vertices copy(long j, boolean z, List<Point> list, List<Point> list2, List<Long> list3, List<? extends List<Long>> list4, List<? extends List<Float>> list5, List<Long> list6) {
        js3.p(list, "positions");
        js3.p(list6, "indices");
        return new Vertices(j, z, list, list2, list3, list4, list5, list6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Vertices)) {
            return false;
        }
        Vertices vertices = (Vertices) obj;
        return this.mode == vertices.mode && this.isVolatile == vertices.isVolatile && js3.i(this.positions, vertices.positions) && js3.i(this.texCoords, vertices.texCoords) && js3.i(this.colors, vertices.colors) && js3.i(this.boneIndices, vertices.boneIndices) && js3.i(this.boneWeights, vertices.boneWeights) && js3.i(this.indices, vertices.indices);
    }

    public final List<List<Long>> getBoneIndices() {
        return this.boneIndices;
    }

    public final List<List<Float>> getBoneWeights() {
        return this.boneWeights;
    }

    public final List<Long> getColors() {
        return this.colors;
    }

    public final List<Long> getIndices() {
        return this.indices;
    }

    public final long getMode() {
        return this.mode;
    }

    public final List<Point> getPositions() {
        return this.positions;
    }

    public final List<Point> getTexCoords() {
        return this.texCoords;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    public int hashCode() {
        long j = this.mode;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        boolean z = this.isVolatile;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        int i2 = rm7.i((i + r2) * 31, 31, this.positions);
        List<Point> list = this.texCoords;
        int iHashCode = (i2 + (list == null ? 0 : list.hashCode())) * 31;
        List<Long> list2 = this.colors;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<List<Long>> list3 = this.boneIndices;
        int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<List<Float>> list4 = this.boneWeights;
        return this.indices.hashCode() + ((iHashCode3 + (list4 != null ? list4.hashCode() : 0)) * 31);
    }

    public final boolean isVolatile() {
        return this.isVolatile;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Vertices(mode=");
        sb.append(this.mode);
        sb.append(", isVolatile=");
        sb.append(this.isVolatile);
        sb.append(", positions=");
        sb.append(this.positions);
        sb.append(", texCoords=");
        sb.append(this.texCoords);
        sb.append(", colors=");
        sb.append(this.colors);
        sb.append(", boneIndices=");
        sb.append(this.boneIndices);
        sb.append(", boneWeights=");
        sb.append(this.boneWeights);
        sb.append(", indices=");
        return dw1.t(sb, this.indices, ')');
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.microsoft.clarity.models.IProtoModel
    public MutationPayload$Vertices toProtobufInstance() {
        u1 u1VarA = MutationPayload$Vertices.newBuilder().a(this.mode).a(this.isVolatile);
        List<Point> list = this.positions;
        ArrayList arrayList = new ArrayList(wu0.V(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Point) it.next()).toProtobufInstance());
        }
        u1 u1VarA2 = u1VarA.a(a.P0(arrayList));
        List<Long> list2 = this.indices;
        ArrayList arrayList2 = new ArrayList(wu0.V(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Double.valueOf(((Number) it2.next()).longValue()));
        }
        u1 u1VarB = u1VarA2.b(arrayList2);
        List<Point> list3 = this.texCoords;
        if (list3 != null) {
            ArrayList arrayList3 = new ArrayList(wu0.V(list3, 10));
            Iterator<T> it3 = list3.iterator();
            while (it3.hasNext()) {
                arrayList3.add(((Point) it3.next()).toProtobufInstance());
            }
            u1VarB.b(a.P0(arrayList3));
        }
        List<Long> list4 = this.colors;
        if (list4 != null) {
            ArrayList arrayList4 = new ArrayList(wu0.V(list4, 10));
            Iterator<T> it4 = list4.iterator();
            while (it4.hasNext()) {
                arrayList4.add(Double.valueOf(((Number) it4.next()).longValue()));
            }
            u1VarB.a(arrayList4);
        }
        List<List> arrayList5 = this.boneIndices;
        if (arrayList5 == null) {
            arrayList5 = new ArrayList();
        }
        for (List list5 : arrayList5) {
            C0149x c0149xNewBuilder = MutationPayload$DoubleList.newBuilder();
            ArrayList arrayList6 = new ArrayList(wu0.V(list5, 10));
            Iterator it5 = list5.iterator();
            while (it5.hasNext()) {
                arrayList6.add(Double.valueOf(((Number) it5.next()).longValue()));
            }
            u1VarB.a((MutationPayload$DoubleList) c0149xNewBuilder.a(arrayList6).build());
        }
        List arrayList7 = this.boneWeights;
        if (arrayList7 == null) {
            arrayList7 = new ArrayList();
        }
        Iterator it6 = arrayList7.iterator();
        while (it6.hasNext()) {
            u1VarB.a((MutationPayload$FloatList) MutationPayload$FloatList.newBuilder().a((List) it6.next()).build());
        }
        o oVarBuild = u1VarB.build();
        js3.o(oVarBuild, "builder.build()");
        return (MutationPayload$Vertices) oVarBuild;
    }
}
