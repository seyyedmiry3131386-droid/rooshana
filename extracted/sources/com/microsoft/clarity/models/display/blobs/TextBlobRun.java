package com.microsoft.clarity.models.display.blobs;

import com.google.protobuf.o;
import com.microsoft.clarity.j.a;
import com.microsoft.clarity.models.IProtoModel;
import com.microsoft.clarity.models.display.common.Point;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$FloatList;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$TextBlobRun;
import com.microsoft.clarity.protomodels.mutationpayload.l1;
import defpackage.bl4;
import defpackage.js3;
import defpackage.wu0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class TextBlobRun implements IProtoModel<MutationPayload$TextBlobRun> {
    private final List<Long> clusters;
    private final Float fontScaleX;
    private final float fontSize;
    private final Float fontSkewX;
    private List<Long> glyphs;
    private final Point point;
    private List<? extends List<Float>> positions;
    private String text;
    private Integer typefaceIndex;

    public TextBlobRun(Point point, float f, Float f2, Float f3, Integer num, List<Long> list, List<? extends List<Float>> list2, List<Long> list3, String str) {
        js3.p(point, "point");
        this.point = point;
        this.fontSize = f;
        this.fontScaleX = f2;
        this.fontSkewX = f3;
        this.typefaceIndex = num;
        this.glyphs = list;
        this.positions = list2;
        this.clusters = list3;
        this.text = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TextBlobRun copy$default(TextBlobRun textBlobRun, Point point, float f, Float f2, Float f3, Integer num, List list, List list2, List list3, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            point = textBlobRun.point;
        }
        if ((i & 2) != 0) {
            f = textBlobRun.fontSize;
        }
        if ((i & 4) != 0) {
            f2 = textBlobRun.fontScaleX;
        }
        if ((i & 8) != 0) {
            f3 = textBlobRun.fontSkewX;
        }
        if ((i & 16) != 0) {
            num = textBlobRun.typefaceIndex;
        }
        if ((i & 32) != 0) {
            list = textBlobRun.glyphs;
        }
        if ((i & 64) != 0) {
            list2 = textBlobRun.positions;
        }
        if ((i & 128) != 0) {
            list3 = textBlobRun.clusters;
        }
        if ((i & 256) != 0) {
            str = textBlobRun.text;
        }
        List list4 = list3;
        String str2 = str;
        List list5 = list;
        List list6 = list2;
        Integer num2 = num;
        Float f4 = f2;
        return textBlobRun.copy(point, f, f4, f3, num2, list5, list6, list4, str2);
    }

    public final Point component1() {
        return this.point;
    }

    public final float component2() {
        return this.fontSize;
    }

    public final Float component3() {
        return this.fontScaleX;
    }

    public final Float component4() {
        return this.fontSkewX;
    }

    public final Integer component5() {
        return this.typefaceIndex;
    }

    public final List<Long> component6() {
        return this.glyphs;
    }

    public final List<List<Float>> component7() {
        return this.positions;
    }

    public final List<Long> component8() {
        return this.clusters;
    }

    public final String component9() {
        return this.text;
    }

    public final TextBlobRun copy(Point point, float f, Float f2, Float f3, Integer num, List<Long> list, List<? extends List<Float>> list2, List<Long> list3, String str) {
        js3.p(point, "point");
        return new TextBlobRun(point, f, f2, f3, num, list, list2, list3, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextBlobRun)) {
            return false;
        }
        TextBlobRun textBlobRun = (TextBlobRun) obj;
        return js3.i(this.point, textBlobRun.point) && Float.compare(this.fontSize, textBlobRun.fontSize) == 0 && js3.i(this.fontScaleX, textBlobRun.fontScaleX) && js3.i(this.fontSkewX, textBlobRun.fontSkewX) && js3.i(this.typefaceIndex, textBlobRun.typefaceIndex) && js3.i(this.glyphs, textBlobRun.glyphs) && js3.i(this.positions, textBlobRun.positions) && js3.i(this.clusters, textBlobRun.clusters) && js3.i(this.text, textBlobRun.text);
    }

    public final List<Long> getClusters() {
        return this.clusters;
    }

    public final Float getFontScaleX() {
        return this.fontScaleX;
    }

    public final float getFontSize() {
        return this.fontSize;
    }

    public final Float getFontSkewX() {
        return this.fontSkewX;
    }

    public final List<Long> getGlyphs() {
        return this.glyphs;
    }

    public final Point getPoint() {
        return this.point;
    }

    public final List<List<Float>> getPositions() {
        return this.positions;
    }

    public final String getText() {
        return this.text;
    }

    public final Integer getTypefaceIndex() {
        return this.typefaceIndex;
    }

    public int hashCode() {
        int iA = a.a(this.fontSize, this.point.hashCode() * 31, 31);
        Float f = this.fontScaleX;
        int iHashCode = (iA + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.fontSkewX;
        int iHashCode2 = (iHashCode + (f2 == null ? 0 : f2.hashCode())) * 31;
        Integer num = this.typefaceIndex;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        List<Long> list = this.glyphs;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<? extends List<Float>> list2 = this.positions;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<Long> list3 = this.clusters;
        int iHashCode6 = (iHashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str = this.text;
        return iHashCode6 + (str != null ? str.hashCode() : 0);
    }

    public final void setGlyphs(List<Long> list) {
        this.glyphs = list;
    }

    public final void setPositions(List<? extends List<Float>> list) {
        this.positions = list;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public final void setTypefaceIndex(Integer num) {
        this.typefaceIndex = num;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TextBlobRun(point=");
        sb.append(this.point);
        sb.append(", fontSize=");
        sb.append(this.fontSize);
        sb.append(", fontScaleX=");
        sb.append(this.fontScaleX);
        sb.append(", fontSkewX=");
        sb.append(this.fontSkewX);
        sb.append(", typefaceIndex=");
        sb.append(this.typefaceIndex);
        sb.append(", glyphs=");
        sb.append(this.glyphs);
        sb.append(", positions=");
        sb.append(this.positions);
        sb.append(", clusters=");
        sb.append(this.clusters);
        sb.append(", text=");
        return bl4.y(sb, this.text, ')');
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.microsoft.clarity.models.IProtoModel
    public MutationPayload$TextBlobRun toProtobufInstance() {
        l1 l1VarB = MutationPayload$TextBlobRun.newBuilder().a(this.point.toProtobufInstance()).b(this.fontSize);
        String str = this.text;
        if (str != null) {
            l1VarB.a(str);
        }
        Float f = this.fontScaleX;
        if (f != null) {
            l1VarB.a(f.floatValue());
        }
        Float f2 = this.fontSkewX;
        if (f2 != null) {
            l1VarB.c(f2.floatValue());
        }
        Integer num = this.typefaceIndex;
        if (num != null) {
            l1VarB.a(num.intValue());
        }
        List<Long> list = this.glyphs;
        if (list != null) {
            ArrayList arrayList = new ArrayList(wu0.V(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Double.valueOf(((Number) it.next()).longValue()));
            }
            l1VarB.b(arrayList);
        }
        List<Long> list2 = this.clusters;
        if (list2 != null) {
            ArrayList arrayList2 = new ArrayList(wu0.V(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Double.valueOf(((Number) it2.next()).longValue()));
            }
            l1VarB.a(arrayList2);
        }
        List<? extends List<Float>> list3 = this.positions;
        if (list3 != null) {
            Iterator<? extends List<Float>> it3 = list3.iterator();
            while (it3.hasNext()) {
                l1VarB.a((MutationPayload$FloatList) MutationPayload$FloatList.newBuilder().a(it3.next()).build());
            }
        }
        o oVarBuild = l1VarB.build();
        js3.o(oVarBuild, "builder.build()");
        return (MutationPayload$TextBlobRun) oVarBuild;
    }
}
