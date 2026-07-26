package com.microsoft.clarity.models.display.typefaces;

import com.google.protobuf.o;
import com.microsoft.clarity.models.AssetType;
import com.microsoft.clarity.models.IProtoModel;
import com.microsoft.clarity.models.display.common.Asset;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$Typeface;
import com.microsoft.clarity.protomodels.mutationpayload.s1;
import defpackage.js3;
import defpackage.wu0;
import defpackage.yd1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class Typeface extends Asset implements IProtoModel<MutationPayload$Typeface> {
    private final Long collectionIndex;
    private final List<FontCoordinate> coordinates;
    private final String familyName;
    private final String fullName;
    private final Float italicValue;
    private final Long paletteIndex;
    private final String postscriptName;
    private final Float slantValue;
    private final FontStyle style;
    private final Float weightValue;
    private final Float widthValue;

    public /* synthetic */ Typeface(String str, String str2, String str3, FontStyle fontStyle, Long l, Float f, Float f2, Float f3, Float f4, Long l2, List list, String str4, int i, yd1 yd1Var) {
        this(str, str2, str3, fontStyle, l, f, f2, f3, f4, l2, list, (i & 2048) != 0 ? null : str4);
    }

    public final Long getCollectionIndex() {
        return this.collectionIndex;
    }

    public final List<FontCoordinate> getCoordinates() {
        return this.coordinates;
    }

    public final String getFamilyName() {
        return this.familyName;
    }

    public final String getFullName() {
        return this.fullName;
    }

    public final Float getItalicValue() {
        return this.italicValue;
    }

    public final Long getPaletteIndex() {
        return this.paletteIndex;
    }

    public final String getPostscriptName() {
        return this.postscriptName;
    }

    public final Float getSlantValue() {
        return this.slantValue;
    }

    public final FontStyle getStyle() {
        return this.style;
    }

    public final Float getWeightValue() {
        return this.weightValue;
    }

    public final Float getWidthValue() {
        return this.widthValue;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Typeface(String str, String str2, String str3, FontStyle fontStyle, Long l, Float f, Float f2, Float f3, Float f4, Long l2, List<FontCoordinate> list, String str4) {
        super(AssetType.Typeface, null, str4);
        js3.p(fontStyle, "style");
        this.familyName = str;
        this.fullName = str2;
        this.postscriptName = str3;
        this.style = fontStyle;
        this.collectionIndex = l;
        this.weightValue = f;
        this.widthValue = f2;
        this.slantValue = f3;
        this.italicValue = f4;
        this.paletteIndex = l2;
        this.coordinates = list;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.microsoft.clarity.models.IProtoModel
    public MutationPayload$Typeface toProtobufInstance() {
        s1 s1VarA = MutationPayload$Typeface.newBuilder().a(this.style.toProtobufInstance());
        if (getDataHash() != null) {
            s1VarA.a(getDataHash());
        }
        String str = this.familyName;
        if (str != null) {
            s1VarA.b(str);
        }
        String str2 = this.fullName;
        if (str2 != null) {
            s1VarA.c(str2);
        }
        String str3 = this.postscriptName;
        if (str3 != null) {
            s1VarA.d(str3);
        }
        if (this.collectionIndex != null) {
            s1VarA.a(r1.longValue());
        }
        List<FontCoordinate> list = this.coordinates;
        if (list != null) {
            ArrayList arrayList = new ArrayList(wu0.V(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((FontCoordinate) it.next()).toProtobufInstance());
            }
            s1VarA.a(arrayList);
        }
        Float f = this.weightValue;
        if (f != null) {
            s1VarA.c(f.floatValue());
        }
        Float f2 = this.widthValue;
        if (f2 != null) {
            s1VarA.d(f2.floatValue());
        }
        Float f3 = this.slantValue;
        if (f3 != null) {
            s1VarA.b(f3.floatValue());
        }
        Float f4 = this.italicValue;
        if (f4 != null) {
            s1VarA.a(f4.floatValue());
        }
        if (this.paletteIndex != null) {
            s1VarA.b(r1.longValue());
        }
        o oVarBuild = s1VarA.build();
        js3.o(oVarBuild, "builder.build()");
        return (MutationPayload$Typeface) oVarBuild;
    }
}
