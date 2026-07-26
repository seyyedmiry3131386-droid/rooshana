package com.google.android.gms.internal.measurement;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF2' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class zzot {
    public static final zzot c;
    public static final zzot d;
    public static final /* synthetic */ zzot[] e;
    public final zzou a;
    public final int b;

    /* JADX INFO: Fake field, exist only in values array */
    zzot EF0;

    /* JADX INFO: Fake field, exist only in values array */
    zzot EF1;

    /* JADX INFO: Fake field, exist only in values array */
    zzot EF2;

    static {
        zzot zzotVar = new zzot("DOUBLE", 0, zzou.d, 1);
        zzot zzotVar2 = new zzot("FLOAT", 1, zzou.c, 5);
        zzou zzouVar = zzou.b;
        zzot zzotVar3 = new zzot("INT64", 2, zzouVar, 0);
        zzot zzotVar4 = new zzot("UINT64", 3, zzouVar, 0);
        zzou zzouVar2 = zzou.a;
        zzot zzotVar5 = new zzot("INT32", 4, zzouVar2, 0);
        zzot zzotVar6 = new zzot("FIXED64", 5, zzouVar, 1);
        zzot zzotVar7 = new zzot("FIXED32", 6, zzouVar2, 5);
        zzot zzotVar8 = new zzot("BOOL", 7, zzou.e, 0);
        zzot zzotVar9 = new zzot("STRING", 8, zzou.f, 2);
        c = zzotVar9;
        zzou zzouVar3 = zzou.i;
        zzot zzotVar10 = new zzot("GROUP", 9, zzouVar3, 3);
        d = zzotVar10;
        e = new zzot[]{zzotVar, zzotVar2, zzotVar3, zzotVar4, zzotVar5, zzotVar6, zzotVar7, zzotVar8, zzotVar9, zzotVar10, new zzot("MESSAGE", 10, zzouVar3, 2), new zzot("BYTES", 11, zzou.g, 2), new zzot("UINT32", 12, zzouVar2, 0), new zzot("ENUM", 13, zzou.h, 0), new zzot("SFIXED32", 14, zzouVar2, 5), new zzot("SFIXED64", 15, zzouVar, 1), new zzot("SINT32", 16, zzouVar2, 0), new zzot("SINT64", 17, zzouVar, 0)};
    }

    public zzot(String str, int i, zzou zzouVar, int i2) {
        this.a = zzouVar;
        this.b = i2;
    }

    public static zzot[] values() {
        return (zzot[]) e.clone();
    }
}
