package defpackage;

import kotlinx.serialization.json.ClassDiscriminatorMode;

/* JADX INFO: loaded from: classes3.dex */
public final class bv3 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final String f;
    public final boolean g;
    public final ClassDiscriminatorMode h;

    public bv3(boolean z, boolean z2, boolean z3, boolean z4, String str, String str2, boolean z5, ClassDiscriminatorMode classDiscriminatorMode) {
        js3.p(str, "prettyPrintIndent");
        js3.p(str2, "classDiscriminator");
        js3.p(classDiscriminatorMode, "classDiscriminatorMode");
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = str;
        this.f = str2;
        this.g = z5;
        this.h = classDiscriminatorMode;
    }

    public final String toString() {
        return "JsonConfiguration(encodeDefaults=" + this.a + ", ignoreUnknownKeys=" + this.b + ", isLenient=" + this.c + ", allowStructuredMapKeys=false, prettyPrint=false, explicitNulls=" + this.d + ", prettyPrintIndent='" + this.e + "', coerceInputValues=false, useArrayPolymorphism=false, classDiscriminator='" + this.f + "', allowSpecialFloatingPointValues=false, useAlternativeNames=" + this.g + ", namingStrategy=null, decodeEnumsCaseInsensitive=false, allowTrailingComma=false, allowComments=false, classDiscriminatorMode=" + this.h + ')';
    }
}
